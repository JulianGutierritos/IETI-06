import React from 'react';

export class User extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
            <tr>
                <td>{this.props.email}</td>
                <td>{this.props.name}</td>
                <td>{this.props.password}</td>
            </tr>
        );
    }

}