#!/bin/bash

ip=$(docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' spark_server)
curl --include --header "Accept: application/json" http://${ip}:4567
echo
