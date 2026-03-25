package com.okinc.annual.download;

import android.text.TextUtils;
import com.airbnb.lottie.LottieCompositionFactory;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C43246rlf;
import o.C7910asj;
import o.C8172axi;
import o.C8175axl;
import o.pUU;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class OKGrowthAnnualBillFileDownloader {
    public static final String LUA_CLASS_NAME = "OKGrowthAnnualBillFileDownloader";
    public Globals mGlobals;

    public OKGrowthAnnualBillFileDownloader(Globals globals, LuaValue[] luaValueArr) {
        this.mGlobals = globals;
    }

    @LuaBridge
    public void downloadFile(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 4) {
            return;
        }
        C8172axi.EZpvd.KWHzl(luaValueArr[0].toJavaString(), C7910asj.AEQbTJ(luaValueArr[1].toLuaTable()), luaValueArr[2].toLuaFunction(), luaValueArr[3].toLuaFunction());
    }

    @LuaBridge
    public LuaValue[] getAudioPath(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 3) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[2].toJavaString();
        if (TextUtils.isEmpty(javaString) || TextUtils.isEmpty(javaString2)) {
            return LuaValue.rNil();
        }
        String strOLrzqt = C8175axl.AEQbTJ.OLrzqt(javaString, javaString2);
        if (TextUtils.isEmpty(strOLrzqt)) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(strOLrzqt);
    }

    @LuaBridge
    public LuaValue[] getLottiePath(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 4) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[2].toJavaString();
        String javaString3 = luaValueArr[3].toJavaString();
        if (TextUtils.isEmpty(javaString) || TextUtils.isEmpty(javaString2) || TextUtils.isEmpty(javaString3)) {
            return LuaValue.rNil();
        }
        String strCopydefault = C8175axl.AEQbTJ.copydefault(javaString, javaString2, javaString3);
        if (TextUtils.isEmpty(strCopydefault)) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(strCopydefault);
    }

    @LuaBridge
    public void clearLottieCache(LuaValue[] luaValueArr) {
        LottieCompositionFactory.clearCache(C43246rlf.OLrzqt.valueOf());
    }

    public void EZpvd() {
        pUU.KWHzl("AnnualDownLoad", "__onLuaGc");
        C8172axi.EZpvd.valueOf();
    }
}
