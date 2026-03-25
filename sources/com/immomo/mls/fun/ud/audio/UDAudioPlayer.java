package com.immomo.mls.fun.ud.audio;

import android.net.Uri;
import android.text.TextUtils;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.io.File;
import o.C7322ahe;
import o.C7326ahi;
import o.C7370aiZ;
import o.C7823arB;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class UDAudioPlayer {
    public String AEQbTJ;
    public Globals EZpvd;
    public String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public LuaValue[] setUrl(String str) {
        this.AEQbTJ = str;
        return null;
    }

    public UDAudioPlayer(Globals globals, LuaValue[] luaValueArr) {
        this.EZpvd = globals;
        if (luaValueArr == null || luaValueArr.length < 1) {
            return;
        }
        this.AEQbTJ = luaValueArr[0].toJavaString();
    }

    @LuaBridge
    public LuaValue[] play(LuaValue[] luaValueArr) {
        if (!TextUtils.isEmpty(this.AEQbTJ)) {
            if (this.AEQbTJ.startsWith("file://android_asset/")) {
                Uri uri = Uri.parse(this.AEQbTJ);
                if (luaValueArr.length >= 1 && luaValueArr[0].toInt() > 0) {
                    C7370aiZ.EZpvd().AEQbTJ(C7326ahi.OLrzqt(), uri, luaValueArr[0].toInt(), null);
                } else {
                    C7370aiZ.EZpvd().AEQbTJ(C7326ahi.OLrzqt(), uri, 0, null);
                }
            } else {
                File file = new File(this.AEQbTJ);
                if (file.exists()) {
                    Uri uriFromFile = Uri.fromFile(file);
                    if (luaValueArr.length >= 1 && luaValueArr[0].toInt() > 0) {
                        C7370aiZ.EZpvd().AEQbTJ(C7326ahi.OLrzqt(), uriFromFile, luaValueArr[0].toInt(), null);
                    } else {
                        C7370aiZ.EZpvd().AEQbTJ(C7326ahi.OLrzqt(), uriFromFile, 0, null);
                    }
                }
            }
        }
        return null;
    }

    @LuaBridge
    public LuaValue[] stop() {
        C7370aiZ.EZpvd().djBIcL();
        return null;
    }

    @LuaBridge
    public LuaValue[] mute(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            C7370aiZ.EZpvd().KWHzl(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(C7370aiZ.EZpvd().copydefault()));
    }

    @LuaBridge
    public LuaValue[] currentTime(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(C7370aiZ.EZpvd().KWHzl()));
    }

    @LuaBridge
    public LuaValue[] loopAudio(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            C7370aiZ.EZpvd().copydefault(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(C7370aiZ.EZpvd().OLrzqt()));
    }

    @LuaBridge
    public LuaValue[] localAudioName(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1) {
            return null;
        }
        String javaString = luaValueArr[0].toJavaString();
        this.copydefault = javaString;
        this.AEQbTJ = C7823arB.KWHzl(javaString, (C7322ahe) this.EZpvd.AuCTel());
        return null;
    }

    public void OLrzqt() {
        Globals globals = this.EZpvd;
        if (globals != null && !globals.isDestroyed()) {
            stop();
            this.EZpvd.destroy();
        }
        this.EZpvd = null;
    }
}
