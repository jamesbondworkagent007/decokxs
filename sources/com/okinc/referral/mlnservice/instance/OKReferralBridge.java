package com.okinc.referral.mlnservice.instance;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Vibrator;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.share.platforms.SharePlatform;
import o.C43248rlh;
import o.C6832aWn;
import o.C7322ahe;
import o.InterfaceC48893ueK;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@LuaClass
public class OKReferralBridge {
    public static final String LUA_CLASS_NAME = "OKReferralBridge";
    public Globals mGlobals;

    public OKReferralBridge(Globals globals, LuaValue[] luaValueArr) {
        this.mGlobals = globals;
    }

    @LuaBridge
    public void feedbackImpactOccurred(LuaValue[] luaValueArr) {
        try {
            Vibrator vibrator = (Vibrator) C6832aWn.EZpvd("vibrator");
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(100L);
            }
        } catch (Exception unused) {
        }
    }

    @LuaBridge
    public LuaBoolean isSharePlatformInstalled(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length > 0) {
                    int i = luaValueArr[0].toInt();
                    C43248rlh c43248rlh = C43248rlh.KWHzl;
                    SharePlatform sharePlatformKWHzl = ((InterfaceC48893ueK) c43248rlh.AEQbTJ(InterfaceC48893ueK.class)).KWHzl(i);
                    if (sharePlatformKWHzl != null) {
                        return (LuaBoolean) LuaBoolean.AEQbTJ(((InterfaceC48893ueK) c43248rlh.AEQbTJ(InterfaceC48893ueK.class)).AEQbTJ(sharePlatformKWHzl));
                    }
                }
            } catch (Exception unused) {
                return (LuaBoolean) LuaBoolean.AEQbTJ(false);
            }
        }
        return (LuaBoolean) LuaBoolean.AEQbTJ(false);
    }

    @LuaBridge
    public LuaBoolean checkIntentHasExist(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length > 0 && luaValueArr[0].isString()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(luaValueArr[0].toJavaString()));
                    if (KWHzl(this.mGlobals) != null) {
                        return (LuaBoolean) LuaBoolean.AEQbTJ(!KWHzl(this.mGlobals).getPackageManager().queryIntentActivities(intent, 0).isEmpty());
                    }
                }
            } catch (Exception unused) {
                return (LuaBoolean) LuaBoolean.AEQbTJ(false);
            }
        }
        return (LuaBoolean) LuaBoolean.AEQbTJ(false);
    }

    public Context KWHzl(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }
}
