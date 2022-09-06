import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder() 

builder.guitars {
    guitar(id:1){
        name 'Fender'
    }
    guitar(id:2){
        name 'Gibson'
    }
    guitar(id:3){
        name 'Jackson'
    }
    guitar(id:4){
        name 'Charvel'
    }
    guitar(id:5){
        name 'PRS'
    }    
}