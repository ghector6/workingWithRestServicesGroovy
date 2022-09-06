/*def xml = '''
    <guitars>
        <guitar>
            <name>Fender</name>
        </guitar>
    </guitars>    

 '''

def guitars = new XmlSlurper().parseText(xml)

println guitars.guitar.name
println guitars.getClass().getName()*/

def guitars = new XmlSlurper().parse('data/guitars.xml') // this will readfrom a file with parsemethdd

println guitars //this prints like this cause is the node
println guitars.guitar[2].name // reading from traversing the xml , reding the number 3 aelemernt on file