OnlineConfig={}function OnlineConfig:getConfig(a,b)if System.getConfig then local c=System:getConfig(a)if c and#c>0 then return c end end;return b end
