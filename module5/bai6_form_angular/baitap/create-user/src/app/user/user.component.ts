import {Component, OnInit} from '@angular/core';
import {User} from '../user';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';

import {comparePassword} from './validate';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  user: User;
  userForm: FormGroup;


  constructor() {
    this.userForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      country: new FormControl(''),
      age: new FormControl('', [Validators.required, Validators.min(18)]),
      gender: new FormControl(''),
      phone: new FormControl('', [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)]),
      pw: new FormGroup({
        password: new FormControl('', [Validators.required, Validators.minLength(6)]),
        confirm_password: new FormControl('', [Validators.required])
      }, [comparePassword])
    });
  }


  ngOnInit(): void {
  }

  createUser() {
    console.log(this.userForm);

  }

}
