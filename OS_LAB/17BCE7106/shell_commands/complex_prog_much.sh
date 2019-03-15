echo "enter choice"
echo "1. rever num"
echo "2. Convert to bin"
echo "3. fibonnaci"
read ch
case $ch in
	1) 
	echo "enter num"
	read num
	rev=0
	while [ "$num" -gt "1" ]
	do
		temp=`expr $num % 10`
		rev=`expr $rev \* 10`
		rev=`expr $rev + $temp`
		num=`expr $num / 10`
	done
	echo $rev
	;;

	2)
	echo "enter num"
	read num
	bin=0
	i=1
	while [ "$num" -gt "0" ]
	do
		d=`expr $num \% 2`
		t=`expr $i \* $d`
		bin=`expr $bin \+ $t`
		i=`expr $i \* 10`
		num=`expr $num / 2`
	done
	echo $bin
	;;

	3)
	echo "num of terms"
	read n
	x=0
	y=1
	echo $x
	echo $y
	while [ "$n" -gt "2" ]
	do
		temp=`expr $x + $y`
		x=$y
		y=$temp
		echo $y
		n=`expr $n - 1` 
	done
	;;
esac