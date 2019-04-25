echo "Enter the three subject marks for the student"
read m1 m2 m3 
sum1=`expr $m1 + $m2 + $m3 `
echo "Sum of three subjects are: " $sum1
per1=`expr $sum1 \* 100`
per=`expr $per1 / 300 `

echo " Percentage: " $per
if [ $per -ge 80 ]
then
echo "You get A grade"
elif [ $per -ge 70 ]
then
echo "You get B grade"
elif [ $per -ge  60 ]
then
echo "your get C grade"
else
     echo "You get D grade Fail"
fi
