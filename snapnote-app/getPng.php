<?php

$memcache = new Memcache;
$test = $memcache->get('Hello World');
syslog(LOG_DEBUG, $test);
header("Content-type: image/png");

echo $test;