echo "Enter choice"
echo "1 list of file"
echo "2 list of users"
echo "3 del file"
read ch 
case $ch in
	1) echo "list is"
		'ls';;
	2) echo "users are"
		'who';;
	3) echo "enter file to del"
		read frame
		'rm' $frame;;
esac