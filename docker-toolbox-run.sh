#!/bin/bash

ip=$(docker-machine ip default)
curl --include --header "Accept: application/json" http://${ip}:4567
echo
