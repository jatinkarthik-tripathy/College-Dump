if [ $1 -gt '19' ]
then
	echo good night
elif [ $1 -gt '15' ]
then
	echo good even
elif [ $1 -gt '11' ]
then
	echo good afternoon
else 
	echo good morn
fi
