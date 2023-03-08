# why we need a network ?
```
 - A Network is a group of interconnected Devices that share teh resources and information with each other.
 
 several reasons like :
  - Resource sharing
  - communication
  - Access of information
  - Remote Access
  - Security
```
# What happens in the background when you type a URL in a WebBrowser ?
```
- before the requested webpage appears there are several things happens in the browser
1)DNS Lookup
2)Establishing the connection (http/https)
3)sending the request (HTTP requested the webserver for the webpage associated with the URL).
4)Process the request
5)Receiving the responce
6)Rendering the webpage
7)Running the Script (if the webpage include the javascript page for ineractive and dynamic behaviour).
```
## DNS Lookup
```
-> this will provide the IP for the given Domain.
4 Categories :
-> Recursive resolver
-> Root name server
-> TLD name server
-> Authoritative name server   [canonical name might be there]

```

# DNS, VPN, Proxy

- A proxy is an intermediary server that acts as a gateway between a client computer and a target server. When a client computer requests information from a server, the request is first routed to the proxy server, which then forwards the request to the target server on behalf of the client. The response from the target server is then returned to the proxy server, which in turn sends the response back to the client.

- There are several reasons why a proxy server may be used:

- Privacy and security: Proxy servers can be used to hide the IP address of the client computer and mask the user's identity. This can be useful for users who want to remain anonymous online or for organizations that want to protect their network from external threats.

- Content filtering: Proxy servers can be used to filter out unwanted or inappropriate content, such as websites or types of traffic that may be considered harmful or distracting.

- Network optimization: Proxy servers can be used to optimize network traffic by caching frequently requested data, compressing data to reduce bandwidth usage, or blocking access to non-essential services.

- Geo-restriction bypassing: Proxy servers can be used to bypass geo-restrictions, which are restrictions placed on certain websites or content based on geographic location.

- There are several types of proxy servers, including:

- HTTP proxy: This type of proxy is used for HTTP traffic and is the most common type of proxy.

- SOCKS proxy: This type of proxy is used for both TCP and UDP traffic and is often used for applications that require more flexibility than HTTP.

- SSL proxy: This type of proxy is used for HTTPS traffic and is used to intercept and decrypt encrypted traffic.

- Transparent proxy: This type of proxy does not modify the request or response headers and is often used for caching purposes.

- Anonymous proxy: This type of proxy hides the IP address of the client computer but does not modify the request or response headers.

- In summary, a proxy is a server that acts as an intermediary between a client computer and a target server. Proxies can be used for privacy and security, content filtering, network optimization, and bypassing geo-restrictions. There are several types of proxy servers, including HTTP, SOCKS, SSL, transparent, and anonymous proxies.

# http proxy

- An HTTP proxy is a type of proxy server that is specifically designed to handle HTTP traffic. HTTP (Hypertext Transfer Protocol) is the protocol used for transmitting data between web servers and web clients (such as web browsers).

- When a client sends an HTTP request to a web server, the request is first sent to the HTTP proxy server, which acts as an intermediary between the client and the server. The proxy server can then modify the request or response headers or content as necessary, before forwarding the request to the target web server on behalf of the client.

- HTTP proxies can be used for several purposes, including:

- Caching: An HTTP proxy can cache frequently requested web pages, which can improve the speed of subsequent requests by serving the cached copy instead of requesting the page again from the web server.

- Filtering: An HTTP proxy can be used to filter out unwanted or malicious content, such as advertisements, malware, or phishing sites.

- Access control: An HTTP proxy can be used to restrict access to certain websites or types of content based on organizational policies.

- Logging: An HTTP proxy can log all requests and responses passing through it, which can be useful for auditing, troubleshooting, or compliance purposes.

- HTTP proxies can operate in several modes, including:

- Forward proxy: A forward proxy is an HTTP proxy that is used by clients to access resources on the Internet. The proxy server acts as an intermediary between the client and the target web server, forwarding requests and responses as necessary.

- Reverse proxy: A reverse proxy is an HTTP proxy that is used by web servers to handle incoming requests from clients. The proxy server acts as an intermediary between the client and the web server, forwarding requests to the appropriate server based on the requested URL.

- HTTP proxies can also provide additional features, such as:

- SSL/TLS encryption: An HTTP proxy can be configured to use SSL/TLS encryption to secure the traffic between the client and the proxy server, as well as between the proxy server and the target web server.

- Authentication: An HTTP proxy can require clients to authenticate before allowing access to certain resources or services.

- Load balancing: An HTTP proxy can distribute incoming requests among multiple servers to improve performance and availability.

- In summary, an HTTP proxy is a type of proxy server that is specifically designed to handle HTTP traffic. HTTP proxies can be used for caching, filtering, access control, and logging, and can operate in forward or reverse proxy modes. HTTP proxies can also provide additional features such as SSL/TLS encryption, authentication, and load balancing.


# DIff forward and reverse proxy 

- A forward proxy is a proxy server that is used by clients to access resources on the Internet. When a client requests a resource, such as a web page, the request is first sent to the forward proxy server. The proxy server then forwards the request to the target server on behalf of the client, and returns the response to the client. The client is not aware that it is communicating with the proxy server, as the proxy server acts as an intermediary and forwards the requests and responses transparently.

- A reverse proxy, on the other hand, is a proxy server that is used by web servers to handle incoming requests from clients. When a client requests a resource, such as a web page, the request is first sent to the reverse proxy server. The proxy server then forwards the request to the appropriate web server based on the requested URL, and returns the response to the client. The client is also not aware that it is communicating with the proxy server, as the proxy server acts as an intermediary and forwards the requests and responses transparently.

- The main difference between the two types of proxies is the direction in which the communication flows. With a forward proxy, the client is the initiator of the request, and the proxy server forwards the request on behalf of the client. With a reverse proxy, the web server is the initiator of the response, and the proxy server forwards the response back to the client.

To summarize:

- A forward proxy is used by clients to access resources on the Internet. The client sends a request to the proxy server, which forwards the request to the target server and returns the response to the client.

- A reverse proxy is used by web servers to handle incoming requests from clients. The client sends a request to the proxy server, which forwards the request to the appropriate web server and returns the response to the client.

- Both types of proxies can provide additional features, such as caching, filtering, load balancing, and security, but they are used in different contexts and for different purposes.



