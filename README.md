# java-serialization-deserialization


Serialization:<br><br>
Serialization in Java is the process of converting an object into a byte stream. By implementing the Serializable interface, a class can be marked as serializable. The object's state, including its variables, is written to an output stream using ObjectOutputStream. Serialized objects can be stored in files, transferred over networks, or saved in databases. Serialization is commonly used for persistence and communication between different Java applications.
<br>


Deserialization:<br><br>
Deserialization in Java is the process of reconstructing an object from a byte stream. The byte stream, representing a previously serialized object, is read from an input stream using ObjectInputStream. The object's state is restored, and an instance of the original class is created. Deserialization allows retrieving objects from files, network sources, or databases. It is useful for restoring object state and sharing data between different Java components or applications.
