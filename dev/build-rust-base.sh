#!/bin/bash
BALLISTA_VERSION=0.4.1
set -e
docker build -t ballistacompute/rust-base:$BALLISTA_VERSION -f docker/rust-base.dockerfile .
