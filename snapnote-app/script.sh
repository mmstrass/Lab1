#!/bin/bash
# rsync using variables

curl -o bashScriptTest.tiff snapnote-app.appspot.com/test
tesseract bashScriptTest.tiff bashScriptTesseract

#curl -X POST -d @"test.txt" http://snapnote-app.appspot.com/postTest --header "Content-Type:text/plain"