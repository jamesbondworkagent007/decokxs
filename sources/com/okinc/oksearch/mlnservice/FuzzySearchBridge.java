package com.okinc.oksearch.mlnservice;

import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.List;
import o.C47184tlJ;
import o.C47222tlv;
import o.pUU;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@LuaClass
public class FuzzySearchBridge {
    public static final String copydefault = "FuzzySearchBridge";
    public Globals KWHzl;

    public FuzzySearchBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.KWHzl = globals;
    }

    @LuaBridge
    public LuaValue fuzzySearchWithArrayV2(LuaTable luaTable, String str, String str2, String str3, String str4) {
        String javaString;
        String str5;
        String string;
        try {
            int iZLjUOn = luaTable.zLjUOn();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i2 < iZLjUOn) {
                i2++;
                LuaTable luaTable2 = (LuaTable) luaTable.get(i2);
                if (str2 == null) {
                    javaString = "";
                } else if (str2.contains(JwtUtilsKt.JWT_DELIMITER)) {
                    String[] strArrSplit = str2.split("\\.");
                    LuaValue luaValue = luaTable2.get(strArrSplit[0]);
                    for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                        if (luaValue instanceof LuaTable) {
                            luaValue = ((LuaTable) luaValue).get(strArrSplit[i3]);
                        }
                    }
                    javaString = luaValue.toJavaString();
                } else {
                    javaString = luaTable2.get(str2).toJavaString();
                }
                if (str3 != null) {
                    if (str3.contains(JwtUtilsKt.JWT_DELIMITER)) {
                        String[] strArrSplit2 = str3.split("\\.");
                        LuaValue luaValue2 = luaTable2.get(strArrSplit2[0]);
                        for (int i4 = 1; i4 < strArrSplit2.length; i4++) {
                            if (luaValue2 instanceof LuaTable) {
                                luaValue2 = ((LuaTable) luaValue2).get(strArrSplit2[i4]);
                            }
                        }
                        string = luaValue2.toString();
                    } else {
                        string = luaTable2.get(str3).toString();
                    }
                    str5 = string;
                } else {
                    str5 = "";
                }
                arrayList.add(new C47184tlJ(luaTable2, javaString, str5, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE));
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            List listCopydefault = C47222tlv.KWHzl.copydefault(str, arrayList, FuzzySearchEventSourceEnum.LUA_BRIDGE.name(), true);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(this.KWHzl);
            if (listCopydefault.size() > 0) {
                while (i < listCopydefault.size()) {
                    int i5 = i + 1;
                    luaTableAEQbTJ.set(i5, ((C47184tlJ) listCopydefault.get(i)).copydefault());
                    i = i5;
                }
            }
            FuzzySearchEventTracker.EZpvd.OLrzqt(str4, str, arrayList, String.valueOf(listCopydefault.size()), String.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis));
            pUU.EZpvd(copydefault, "Fuzzy Search Lib: FuzzySearch Completed. \n Result:" + luaTableAEQbTJ.toJavaString());
            return luaTableAEQbTJ;
        } catch (Exception e) {
            pUU.AEQbTJ("Error when calling FuzzySearchV2 via Lua bridge", e);
            return LuaTable.AEQbTJ(this.KWHzl);
        }
    }

    @LuaBridge
    public LuaValue fuzzySearchWithArray(LuaTable luaTable, String str, String str2, String str3) {
        String javaString;
        String str4;
        String string;
        try {
            int iZLjUOn = luaTable.zLjUOn();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            while (i2 < iZLjUOn) {
                i2++;
                LuaTable luaTable2 = (LuaTable) luaTable.get(i2);
                if (str2 == null) {
                    javaString = "";
                } else if (str2.contains(JwtUtilsKt.JWT_DELIMITER)) {
                    String[] strArrSplit = str2.split("\\.");
                    LuaValue luaValue = luaTable2.get(strArrSplit[0]);
                    for (int i3 = 1; i3 < strArrSplit.length; i3++) {
                        if (luaValue instanceof LuaTable) {
                            luaValue = ((LuaTable) luaValue).get(strArrSplit[i3]);
                        }
                    }
                    javaString = luaValue.toJavaString();
                } else {
                    javaString = luaTable2.get(str2).toJavaString();
                }
                if (str3 != null) {
                    if (str3.contains(JwtUtilsKt.JWT_DELIMITER)) {
                        String[] strArrSplit2 = str3.split("\\.");
                        LuaValue luaValue2 = luaTable2.get(strArrSplit2[0]);
                        for (int i4 = 1; i4 < strArrSplit2.length; i4++) {
                            if (luaValue2 instanceof LuaTable) {
                                luaValue2 = ((LuaTable) luaValue2).get(strArrSplit2[i4]);
                            }
                        }
                        string = luaValue2.toString();
                    } else {
                        string = luaTable2.get(str3).toString();
                    }
                    str4 = string;
                } else {
                    str4 = "";
                }
                arrayList.add(new C47184tlJ(luaTable2, javaString, str4, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE));
            }
            List listCopydefault = C47222tlv.KWHzl.copydefault(str, arrayList, FuzzySearchEventSourceEnum.LUA_BRIDGE.name(), true);
            LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(this.KWHzl);
            if (listCopydefault.size() > 0) {
                while (i < listCopydefault.size()) {
                    int i5 = i + 1;
                    luaTableAEQbTJ.set(i5, ((C47184tlJ) listCopydefault.get(i)).copydefault());
                    i = i5;
                }
            }
            pUU.EZpvd(copydefault, "Fuzzy Search Lib: FuzzySearch Completed. \n Result:" + luaTableAEQbTJ.toJavaString());
            return luaTableAEQbTJ;
        } catch (Exception e) {
            e.printStackTrace();
            return LuaTable.AEQbTJ(this.KWHzl);
        }
    }
}
