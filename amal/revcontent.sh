if [ $# -eq 1 ]
    then
        if [ -f $1 ]
            then
            a=`rev $1`
            echo "Reverse of $1"
                cat $1
            echo " is-> $a"else
            echo "File does not exist "
            fi      
    
    else
        echo "Please enter file name or path"
    fi
