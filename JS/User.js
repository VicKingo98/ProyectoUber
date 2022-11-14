class User extends Account {
    constructor(name, document, email, password) {
        super(name, document)
    }

    printDataUser() {
        console.log('Nombre: $ {this.name}')
        console.log('Document: $ {this.document}')
    }

}