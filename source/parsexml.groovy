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