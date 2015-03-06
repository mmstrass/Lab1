<?php

$memcache = new Memcache;

$test = $memcache->get('processText');
syslog(LOG_DEBUG, "processText is working");

syslog(LOG_DEBUG, $test);

echo $test;