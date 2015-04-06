#!/bin/bash

echo -e "Content-type: text/plain\n"
java -Xmx3M t $QUERY_STRING
