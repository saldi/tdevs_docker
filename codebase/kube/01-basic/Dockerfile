FROM alpine:3.7

RUN apk add --no-cache curl
RUN apk add --update bash && rm -rf /var/cache/apk/*
RUN apk add --no-cache unzip
RUN apk add --no-cache nano
CMD tail -f /dev/null