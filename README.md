# Awin Logger
### This library helps in providing logging utility
### We have configuration file called config.properties in which we defin the attributes :
* **logging.level** - this can be debug, info, warning or error
* **logging.output.target** - (TBC) this can be console, file, email and/or api

To use the library, you need to pass use getInstance and pass the class name and then 
log the message with timestamp using any of the following methods:

* debug
* info
* warning
* error

### The log level order is debug, info, warning, error

For example if we configure that the minimum accepted log level is warning we will not handle debug and info logs