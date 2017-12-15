#!/usr/bin/env bash

ORIGIN=$1
WEIGHT=$2

curl -XPOST -H 'Content-Type: application/json'  -d '{"origin": "'${ORIGIN}'", "weight": '${WEIGHT}'}' localhost:8080/koteletter