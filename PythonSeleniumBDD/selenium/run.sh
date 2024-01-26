#!/usr/bin/bash

check_directory_empty() {
    local directory=$1
    local name=$2
    if [ -z "$(ls -A $directory)" ]; then
        echo $2 "-notexists"
    else
        echo $2 "-exists" 
    fi
}
rm -rf /Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/screenshot
rm -rf /Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/logs
rm -rf /Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/reports
rm -rf /Users/tamil/Desktop/PythonSeleniumDemoBDD/log.log
touch /Users/tamil/Desktop/PythonSeleniumDemoBDD/log.log
cp /Users/tamil/Desktop/PythonSeleniumDemoBDD/selenium/eventhandler.py /Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/utilities/eventhandler.py
cd /Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/
python3 base.py
cp /Users/tamil/Desktop/PythonSeleniumDemoBDD/selenium/eventhandlerdummy.py /Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/utilities/eventhandler.py
cat /Users/tamil/Desktop/PythonSeleniumDemoBDD/log.log
logdir="/Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/logs"
scrdir="/Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/screenshot"
reportsdir="/Users/tamil/Desktop/PythonSeleniumDemoBDD/Projects/Report"

check_directory_empty $logdir "log";
check_directory_empty $scrdir "scr";
check_directory_empty $reportsdir "report";


