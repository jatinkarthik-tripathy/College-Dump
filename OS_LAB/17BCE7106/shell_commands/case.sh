echo 'enter a char'
read char
case $char in
	[0-9])echo 'you entered a num'
		;;
	[a-z]) echo 'you enter a lower case alpha'
		;;
	[A-Z]) echo'you entered a upper case alpha'
		;;
	*) echo 'wtf mate?'
		;;
esac