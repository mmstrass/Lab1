<?php

syslog(LOG_DEBUG, 'postTest Script is Working');
syslog(LOG_DEBUG, print_r(file_get_contents('php://input'), true));

$memcache = new Memcache;

$data = file_get_contents('php://input');

$memcache->set('processText', $data);
$test = $memcache->get('processText');
syslog(LOG_DEBUG, $test);
