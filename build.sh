#!/usr/bin/env bash

docker build -t registry.cn-shenzhen.aliyuncs.com/scloud/share:stable .
docker push registry.cn-shenzhen.aliyuncs.com/scloud/share:stable
