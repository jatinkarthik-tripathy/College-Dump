echo "Enter three num"
read a 
read b
read c
if [ $a -gt $b -a $a -gt $c ]
then echo "$a is greatest"
elif [ $b -gt $c ]
then echo "$b is greatest"
else echo "$c is greatest"
fi