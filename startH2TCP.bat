@echo off
TITLE Iniciar Base H2
cd C:\Program Files (x86)\H2\bin
java -jar h2-1.3.176.jar -web -webAllowOthers -tcp -tcpAllowOthers -browser

PAUSE