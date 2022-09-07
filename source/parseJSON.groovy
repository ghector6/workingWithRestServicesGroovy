import groovy.json.*

/*def books = '''
{
    "books": {
        "currentBook": {
            "title": "Las intermitencias de la muerte",
            "isbn": "978-1937785307",
            "author": {
                "first": "Jose",
                "last": "Saramago",
                "twitter": "@none"
            },
            "related": [
                "El viaje de elefante",
                "El Evangelio"
            ]
        },
        "nextBook": {
            "title": "Coraline",
            "isbn": "978-1937948375",
            "author": {
                "first": "Neil",
                "last": "Gaiman",
                "twitter": "@neilhimself"
            },
            "related": [
                "American Gods",
                "Sandaman"
            ]
        }
    }
}

 '''

 JsonSlurper slurper = new JsonSlurper() 
 def json = slurper.parseText(books)

 println json
 println json.getClass().getName()
 println json.books.nextBook.title*/

 JsonSlurper slurper = new JsonSlurper()

 def json = slurper.parse(new File('data/books.json'))

 println json.books.currentBook.title
 println json.books.nextBook.author
 println json.books.currentBook.author.first