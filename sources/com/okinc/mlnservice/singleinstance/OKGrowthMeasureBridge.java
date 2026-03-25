package com.okinc.mlnservice.singleinstance;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.view.UDLabel;
import o.C7865arr;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class OKGrowthMeasureBridge {
    public Globals AEQbTJ;

    public OKGrowthMeasureBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.AEQbTJ = globals;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.view.View] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] measureTextViewHeight(LuaValue[] luaValueArr) {
        UDLabel uDLabel;
        int iFetchVPNInfo;
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length != 0) {
                    if (luaValueArr.length > 0) {
                        LuaValue luaValue = luaValueArr[0];
                        uDLabel = luaValue instanceof UDLabel ? (UDLabel) luaValue : null;
                    }
                    if (luaValueArr.length > 1 && luaValueArr[1].isNumber()) {
                        iFetchVPNInfo = C7865arr.copydefault(luaValueArr[1].toDouble());
                    } else {
                        iFetchVPNInfo = uDLabel != null ? uDLabel.fetchVPNInfo() : 0;
                    }
                    if (uDLabel != null && iFetchVPNInfo != 0) {
                        uDLabel.f_().measure(View.MeasureSpec.makeMeasureSpec(iFetchVPNInfo, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        return LuaValue.rNumber(C7865arr.AEQbTJ(uDLabel.f_().getMeasuredHeight()));
                    }
                    return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
                }
            } catch (Exception unused) {
                return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
            }
        }
        return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
    }
}
