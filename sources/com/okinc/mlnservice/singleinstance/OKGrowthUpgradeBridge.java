package com.okinc.mlnservice.singleinstance;

import android.content.Context;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.business.appupdate.api.AppUpdateService;
import o.AbstractActivityC33041mov;
import o.C43248rlh;
import o.C7322ahe;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class OKGrowthUpgradeBridge {
    public Globals KWHzl;

    public OKGrowthUpgradeBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.KWHzl = globals;
    }

    @LuaBridge
    public LuaValue checkUpdate(LuaValue[] luaValueArr) {
        if (!(EZpvd(this.KWHzl) instanceof AbstractActivityC33041mov)) {
            return null;
        }
        ((AppUpdateService) C43248rlh.KWHzl.AEQbTJ(AppUpdateService.class)).checkUpdate((AbstractActivityC33041mov) EZpvd(this.KWHzl), false);
        return null;
    }

    @LuaBridge
    public LuaValue[] hasNewVersion(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(((AppUpdateService) C43248rlh.KWHzl.AEQbTJ(AppUpdateService.class)).hasNewVersion());
    }

    public Context EZpvd(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }
}
