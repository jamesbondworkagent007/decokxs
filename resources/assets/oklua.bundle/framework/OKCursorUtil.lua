require("framework.utils")function setEditTextViewCursorColor(a,b)if versionStrAvailable("6.93.0")then else if a and a.setCursorColor then a:setCursorColor(b)end end end
