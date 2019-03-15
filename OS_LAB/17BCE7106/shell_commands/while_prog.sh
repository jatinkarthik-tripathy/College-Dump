ch=y
while [ "$ch" != "n" ]
do
echo "Enter num"
read number
fact=1
while [ "$number" -gt "1" ]
do 
fact=`expr $fact \* $number`
number=`expr $number \- 1 `
done
echo "factorial is $fact"
echo "more?" 
read ch	
done