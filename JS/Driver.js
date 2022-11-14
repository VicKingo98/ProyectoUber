class Driver extends Account {
    constructor(name, document, email, password) {
        super(name, document)
    }

    printDataDriver() {
        console.log('Nombre: $ {this.name}')
        console.log('Document: $ {this.document}')
    }
}