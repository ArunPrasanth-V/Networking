# Networking

The OSI model is a conceptual framework that defines a standard for communication between different computer systems, regardless of the specific hardware or software they are using. The model provides a standardized set of protocols and functions at each layer of the communication process, which helps to ensure that different systems can communicate with each other in a consistent and efficient way.

By using a common set of protocols and standards, the OSI model makes it easier for network developers to create products that can work seamlessly with other systems that also use the OSI model. This helps to promote interoperability between different systems and can lead to more efficient and effective communication across the network.


Applicaton layer :
  ->this is the only layer that interact with data to the user.should not the client software is not the application layer. http,smtp.
 			request the contenet <-> return the content in the requested format

presentation layer: (translating incoming data into a syntax which can understand by application layer)

	make data presentanle (or) readable (or) consumable to the application layer.
		encrypting , compression and transulation (different encoding format)
		 ->two communicating device may uses different encoding format.
		 
session layer : (opening and closing connection between two device)
		->the time between when the connection is open and close is known as session.
		->session layer ensures that connection stays open until the data get transfered complitily.
		->eg tranferring 150 megabyte of data we can set chackpoint for every 5 megabyte.incause in between if the connection is last we sent the data after the last checkpoint.
Transport layer : (end to end communication)
		->flow control(slow receving fast sending ) and error control (tha data we send should get to the receiver fully if not then retransmit).
		->Taking up the data form the session layer and beak it up into chuncks called it as segments and senting to the layer 3.

Network Layer: (hop to hop) delivary
		->data transferring between two networks
		->if the two device is communicating in a same network then the network layer is unnecessary.
		->takes the segments and breaking into smaller unit called packets and routing to the receiver end. by finding best path available.
Data Link Layer :
		->very similar to the network layer.excepts here the data transferring between two device in a same network.
		->takes data from the network layer and break into smaller pieces called frames
		->it also respossible for flow control and the error control in internetwork communication

Physical layer :
		->this is place where data get converted into bit streams
		->transfer cable,swithces.
