package com.okinc.nft.ui.kline.bean;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35965oKg;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public final class UDKLineCandleData extends LuaUserdata<C35965oKg> {
    public static final String LUA_CLASS_NAME = "OKKlineCandleData";
    public C35965oKg mData;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final String[] methods = {"setInstId", "setInstType", "setDate", "setOpen", "setHigh", "setLow", "setClose", "setVolumeOfCoin", "setVolumeOfContract", "setVolCcyQuote", "setTurnover"};
    private static final String TAG = UDKLineCandleData.class.getSimpleName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMData(@NotNull C35965oKg c35965oKg) {
        Intrinsics.checkNotNullParameter(c35965oKg, "");
        this.mData = c35965oKg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @InterfaceC60044zuT
    public final LuaValue[] setTurnover(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        return null;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.nft.ui.kline.bean.UDKLineCandleData.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final C35965oKg getMData() {
        C35965oKg c35965oKg = this.mData;
        if (c35965oKg != null) {
            return c35965oKg;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @InterfaceC60044zuT
    public UDKLineCandleData(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        setMData(new C35965oKg(null, null, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, null, 2047, null));
    }

    @InterfaceC60044zuT
    public final LuaValue[] setInstId(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().EZpvd(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setInstType(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().copydefault(javaString);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDate(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isNumber()) {
            return null;
        }
        getMData().KWHzl(luaValue.toLong());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOpen(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().EZpvd(Double.parseDouble(javaString));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setHigh(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().KWHzl(Double.parseDouble(javaString));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setLow(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().copydefault(Double.parseDouble(javaString));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setClose(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().OLrzqt(Double.parseDouble(javaString));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setVolumeOfCoin(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().AYXKKw(Double.parseDouble(javaString));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setVolumeOfContract(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().valueOf(Double.parseDouble(javaString));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setVolCcyQuote(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        getMData().AEQbTJ(Double.parseDouble(javaString));
        return null;
    }
}
