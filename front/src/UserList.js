import React from 'react';
import {User} from './User'

export class UserList extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
		let userList;
		if(this.props.userList !== undefined){
			userList = this.props.userList.map((object, i) => {
				let user = object.user;
				return ( 
					<User key={i} name={user.name} email={user.email} password={user.password}/>
				);
			});
		}
        return (
            <table>
                <thead>
                <tr>
                    <th>Email</th>
                    <th>Name</th>
                    <th>Password</th>
                </tr>
                </thead>
                <tbody>
                {userList}
                </tbody>
            </table>
        );


    }

}