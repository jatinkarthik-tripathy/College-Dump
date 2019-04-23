tic
clc
format rational 
payoff = [7 -3; -3 4]
col_max = max(payoff);
row_min = min(payoff.');
mini_max = min(col_max);
maxi_min = max(row_min);
if mini_max==maxi_min 
    disp('Sadlle point found in game')
    value_of_game = maxi_min
else
    disp('Mixed Strategies, no Saddle points')
    oddmens_r1 = abs(payoff(2, 1)-payoff(2, 2))
    oddmens_r2 = abs(payoff(1, 1)-payoff(1, 2))
    oddmens_c1 = abs(payoff(1, 2)-payoff(2, 2))
    oddmens_c2 = abs(payoff(1, 1)-payoff(2, 1))
    p1 = oddmens_r1/(oddmens_r1+oddmens_r2);
    p2 = oddmens_r2/(oddmens_r1+oddmens_r2);
    q1 = oddmens_c1/(oddmens_c1+oddmens_c2);
    q2 = oddmens_c2/(oddmens_c1+oddmens_c2);
    p = [p1 p2]
    q = [q1 q2]
    value_of_game = payoff(1, 1)*p1 + payoff(2, 1)*p2
end
toc
x