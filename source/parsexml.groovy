def xml = '''
    <guitars>
        <guitar>
            <name>Fender</name>
        </guitar>
    </guitars>    

 '''

def guitars = new XmlSlurper().parseText(xml)

println guitars.guitar.name
println guitars.getClass().getName()