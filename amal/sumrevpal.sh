echo "Enter number"
read n
t=$n
m=$n
sum=0
while [ $n -gt 0 ]
do
r=$(( $n % 10 ))
n=$(( $n / 10 ))
sum=$(( $sum + $r ))
done
echo  "Sum of digits is : $sum"
r=0
rev=0
while [ $t -gt 0 ]
do
r=`expr $t % 10`
rev=`expr $rev \* 10 + $r`
t=`expr $t / 10`
done
echo "Reverse is : $rev"
if [ $rev -eq $m ]
then
echo "The number is Palindrome"
else
echo "The number is not a palindrome"
fi
