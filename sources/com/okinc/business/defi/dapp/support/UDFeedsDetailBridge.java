package com.okinc.business.defi.dapp.support;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.components.track.ABTestManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35202nqq;
import o.C55298xhM;
import o.C7322ahe;
import o.C7323ahf;
import o.InterfaceC60037zuM;
import o.InterfaceC7304ahM;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes4.dex */
@LuaClass
public final class UDFeedsDetailBridge {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final LuaValue[] AEQbTJ;
    public final Globals OLrzqt;

    public UDFeedsDetailBridge(Globals globals, LuaValue[] luaValueArr) {
        this.OLrzqt = globals;
        this.AEQbTJ = luaValueArr;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.support.UDFeedsDetailBridge.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @LuaBridge
    public final LuaNumber a_measureTextHeight(@NotNull LuaValue[] luaValueArr) {
        Context context;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        try {
            Globals globals = this.OLrzqt;
            InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
            C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
            if (c7322ahe != null && (context = c7322ahe.AEQbTJ) != null) {
                String javaString = ((LuaValue) yDV.AuCTelauCTel(luaValueArr)).toJavaString();
                String javaString2 = luaValueArr[1].toJavaString();
                float f = luaValueArr[2].toFloat();
                int i = luaValueArr[3].toInt();
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(f);
                float fApplyDimension = TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
                InterfaceC7304ahM interfaceC7304ahMEjfBZ = C7323ahf.ejfBZ();
                if (interfaceC7304ahMEjfBZ != null) {
                    textPaint.setTextSize(fApplyDimension);
                    textPaint.setTypeface(interfaceC7304ahMEjfBZ.KWHzl(javaString2));
                }
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(javaString, 0, javaString.length(), textPaint, C55298xhM.dpInt$default(i, (Context) null, 1, (Object) null)).setText(javaString).build();
                Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
                LuaNumber luaNumberValueOf = LuaNumber.valueOf(C55298xhM.px2dp$default(staticLayoutBuild.getHeight(), (Context) null, 1, (Object) null));
                Intrinsics.checkNotNullExpressionValue(luaNumberValueOf, "");
                return luaNumberValueOf;
            }
            LuaNumber luaNumberValueOf2 = LuaNumber.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf2, "");
            return luaNumberValueOf2;
        } catch (Exception unused) {
            LuaNumber luaNumberValueOf3 = LuaNumber.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf3, "");
            return luaNumberValueOf3;
        }
    }

    @LuaBridge
    public final LuaValue getProductABSwitch(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValueCopydefault;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null || javaString.length() == 0) {
            LuaValue luaValueCopydefault2 = LuaString.copydefault("");
            Intrinsics.checkNotNullExpressionValue(luaValueCopydefault2, "");
            return luaValueCopydefault2;
        }
        String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, javaString, null, 2, null);
        if (value$default != null && (luaValueCopydefault = LuaString.copydefault(value$default)) != null) {
            return luaValueCopydefault;
        }
        LuaValue luaValueCopydefault3 = LuaString.copydefault("");
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault3, "");
        return luaValueCopydefault3;
    }

    @LuaBridge
    public final LuaValue getGrayABSwitch(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null || javaString.length() == 0) {
            LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(false);
            Intrinsics.checkNotNullExpressionValue(luaValueAEQbTJ, "");
            return luaValueAEQbTJ;
        }
        LuaValue luaValueAEQbTJ2 = LuaBoolean.AEQbTJ(C35202nqq.OLrzqt.AEQbTJ(javaString));
        Intrinsics.checkNotNullExpressionValue(luaValueAEQbTJ2, "");
        return luaValueAEQbTJ2;
    }

    @LuaBridge
    public final LuaNumber isKlineThemeMode() {
        LuaNumber luaNumberValueOf = LuaNumber.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(luaNumberValueOf, "");
        return luaNumberValueOf;
    }

    @LuaBridge
    public final LuaValue getStableCoin() {
        LuaValue luaValueNil = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
        return luaValueNil;
    }

    @LuaBridge
    public final LuaValue triggerVibration() {
        LuaValue luaValueNil = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
        return luaValueNil;
    }

    @LuaBridge
    public final LuaValue shareFeedDetail(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValueNil = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
        return luaValueNil;
    }
}
