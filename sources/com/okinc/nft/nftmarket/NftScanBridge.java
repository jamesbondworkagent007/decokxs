package com.okinc.nft.nftmarket;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C43248rlh;
import o.C7322ahe;
import o.xWS;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class NftScanBridge {
    public static final String LUA_CLASS_NAME = "NTFQRScanCore";
    public Globals globals;

    public NftScanBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public LuaValue[] startScan(LuaValue[] luaValueArr) {
        ((xWS) C43248rlh.KWHzl.AEQbTJ(xWS.class)).KWHzl((Context) KWHzl(), true, true);
        return null;
    }

    public Activity KWHzl() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }
}
