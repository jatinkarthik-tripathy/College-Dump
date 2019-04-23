clc;
clear all;

tic
format rational

A = [1 1 0 0 1 0;1 0 1 0 0 0;0 1 0 -1 0 1]; b = [200;80;60];
CM = [-3 -8 0 0 -10000 -10000];
Cb = [0 -10000 -10000];

disp("init table")
Au = [b A]

[m n] = size(Au);
for i=1:5

disp("iteration " + i)
zc = Cb*Au(:,(2:n))-CM;

if(zc>=0)
disp("optimal solution");

disp(Au);
disp("Ans obj fn value");

disp(Cb*Au(:,1));
break;

else
[Q, pc] = min(zc);

ratio = Au(:,1)./Au(:,pc+1);
%disp(size(ratio));

ratio = ratio(ratio(:,1)>0);
if(isempty(ratio))

disp("Ünbounded solution");
break;

end
disp(ratio);

[RM pr] = min(ratio);
Au(pr, :) = Au(pr, :)/Au(pr, pc+1);

Au([1:pr-1, pr+1:end], :) = Au([1:pr-1, pr+1:end], :) - Au([1:pr-1, pr+1:end], pc+1)*Au(pr, :);
disp(Au)
Cb(pr)=CM(pc);

disp(Cb)
end

end
toc
