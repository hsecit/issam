#Romadi

## footprinting
- know sec posture[fw.conf]
- reduce attack area
- identify vulners
- net mapp
### net footprint : 
info about domain and subdomains ,IDses,TCP,UDP services ,ACL
### collect sys info :
 users,grps,banners of system, routing table
### collect org info : 
 sec policies implemented... social eng

##### passive info ghatering and search engines
##### examine html source and cookies, http headers,website archive..
##### email footprinting :
 email header => mail server info ,
You10:02 PM
##### whois 
#### DNS (example dnsrecon)
![dns scheme](https://dnsdumpster.com/static/footprint-domains.png  "dns")

## Scanning
proc of identifying live host,port,services,descovering os archs
### network scanning 
#### type of scan :
- connect scan : TCP end reset
- stealsth scan *Sync*/*Sync-Ack/Reset*
- XMAS scan *send reset message*
- FIN scan *closed ports respond*
- ACK scan
- Null scan
- Idle Scan
### banner grabing
os details and services running
### Draw Network Diagrams
net viewer , O
## Enumeration 
extracting user names, machine names, network resources, shares and services from a system
### Enum Types
- Network Resource and shares

- Users and Groups

 - Routing tables

- Auditing and Service settings

- Machine names

- Applications and banners

- SNMP and DNS details

### Port to Enum
- TCP 53: DNS Zone transfer

- TCP 135: Microsoft RPC Endpoint Mapper

- TCP 137: NetBIOS Name Service

- TCP 139: NetBIOS session Service (SMB over NetBIOS)

- TCP 445: SMB over TCP (Direc
You10:03 PM
- TCP 445: SMB over TCP (Direct Host)

- UDP 161: SNMP

- TCP/UDP 389: LDAP

- TCP/UDP 3368: Global Catalog Service

- TCP 25: Simple Mail Transfer Protocol (SMTP)
