package com.okinc.nft.ui;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import androidx.core.content.ContextCompat;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C14727dqs;
import o.C43246rlf;
import o.C56548yJl;
import o.C7514alK;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public final class NFTTapEngine {
    public static final Application Companion = new Application(null);

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.nft.ui.NFTTapEngine.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static /* synthetic */ void vibrate$default(NFTTapEngine nFTTapEngine, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = 1;
        }
        nFTTapEngine.EZpvd(j, i);
    }

    public final void EZpvd(long j, int i) {
        Vibrator defaultVibrator;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            VibratorManager vibratorManagerCI_ = C7514alK.cI_(ContextCompat.getSystemService(C43246rlf.OLrzqt.valueOf(), C14727dqs.copydefault()));
            defaultVibrator = vibratorManagerCI_ != null ? vibratorManagerCI_.getDefaultVibrator() : null;
        } else {
            defaultVibrator = (Vibrator) ContextCompat.getSystemService(C43246rlf.OLrzqt.valueOf(), Vibrator.class);
        }
        if (defaultVibrator == null) {
            return;
        }
        if (i2 >= 26) {
            defaultVibrator.vibrate(VibrationEffect.createOneShot(j, C56548yJl.copydefault(i, 1)));
        } else {
            defaultVibrator.vibrate(C56548yJl.copydefault(j, 1L));
        }
    }

    @LuaBridge
    public final LuaValue[] light(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        long jCopydefault = 1;
        if (luaValue != null && luaValue.isNumber()) {
            jCopydefault = C56548yJl.copydefault(luaValue.toLong(), 1L);
        }
        int iCopydefault = Build.VERSION.SDK_INT >= 29 ? -1 : 1;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        if (luaValue2 != null && luaValue2.isInt()) {
            iCopydefault = C56548yJl.copydefault(luaValue2.toInt(), 1);
        }
        EZpvd(jCopydefault, iCopydefault);
        return null;
    }

    @LuaBridge
    public final LuaValue[] medium(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        long jCopydefault = 1;
        if (luaValue != null && luaValue.isNumber()) {
            jCopydefault = C56548yJl.copydefault(luaValue.toLong(), 1L);
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        EZpvd(jCopydefault, (luaValue2 == null || !luaValue2.isInt()) ? 2 : C56548yJl.copydefault(luaValue2.toInt(), 1));
        return null;
    }

    @LuaBridge
    public final LuaValue[] heavy(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        long jCopydefault = 1;
        if (luaValue != null && luaValue.isNumber()) {
            jCopydefault = C56548yJl.copydefault(luaValue.toLong(), 1L);
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        EZpvd(jCopydefault, (luaValue2 == null || !luaValue2.isInt()) ? 5 : C56548yJl.copydefault(luaValue2.toInt(), 1));
        return null;
    }
}
