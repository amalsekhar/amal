echo "enter length"
read l
echo "enter breadth"
read b
echo "enter radius"
read r
a=`expr $l \* $b`
echo "area of rectangle is $a"
p=`echo $((l+b))*2 | bc`
echo "perimeter of a rectangle is $p"
c=`echo $((2*r))*3.14 | bc`
echo "circumference of a circle is $c"
ar=`echo $((r*r))*3.14 | bc`
echo "area of circle is $ar"
