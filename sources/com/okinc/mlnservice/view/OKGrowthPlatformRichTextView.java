package com.okinc.mlnservice.view;

import android.content.Context;
import android.graphics.Typeface;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.business.rewards.okplatform.bean.RichTextRoot;
import com.okinc.mlnservice.view.OKGrowthPlatformRichTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C37999pIm;
import o.C43251rlk;
import o.C7594aml;
import o.C7829arH;
import o.InterfaceC28104kPa;
import o.InterfaceC60044zuT;
import o.kOI;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public final class OKGrowthPlatformRichTextView extends UDView<C37999pIm> {
    public static final Activity Companion = new Activity(null);
    public static final String[] copydefault = {"renderRichTextView", "renderCustomRichTextView"};
    public static final String EZpvd = OKGrowthPlatformRichTextView.class.getSimpleName();

    @InterfaceC60044zuT
    public OKGrowthPlatformRichTextView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C37999pIm AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C37999pIm(contextAubY);
    }

    public static final Unit copydefault(OKGrowthPlatformRichTextView oKGrowthPlatformRichTextView, RichTextRoot richTextRoot) {
        Intrinsics.checkNotNullParameter(richTextRoot, "");
        InterfaceC28104kPa.ActionBar.setLexicalRichData$default((InterfaceC28104kPa) oKGrowthPlatformRichTextView.dHguZz, richTextRoot, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] renderCustomRichTextView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.EZpvd(luaValueArr, 1, (Function1<? super Integer, Unit>) new Function1() { // from class: o.rkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKGrowthPlatformRichTextView.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            C7829arH c7829arH = C7829arH.KWHzl;
            Context contextAubY = AubY();
            Intrinsics.checkNotNullExpressionValue(contextAubY, "");
            Typeface typefaceAEQbTJ = c7829arH.AEQbTJ(javaString, contextAubY);
            if (typefaceAEQbTJ != null) {
                ((C37999pIm) this.dHguZz).setCustomTypeFace(typefaceAEQbTJ);
            }
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        if (luaValue2 != null && luaValue2.isNumber()) {
            ((C37999pIm) this.dHguZz).setCustomTextSize(luaValue2.toFloat());
        }
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 4);
        if (luaValue3 != null && luaValue3.isInt()) {
            ((C37999pIm) this.dHguZz).setCustomGravity(luaValue3.toInt());
        }
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue4 == null || !luaValue4.isString()) {
            return null;
        }
        String javaString2 = luaValue4.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString2, "");
        ((kOI) C43251rlk.copydefault(kOI.class)).OLrzqt(javaString2, new Function1() { // from class: o.rla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKGrowthPlatformRichTextView.EZpvd(this.OLrzqt, (RichTextRoot) obj);
            }
        }, new Function1() { // from class: o.rlc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKGrowthPlatformRichTextView.KWHzl((java.lang.Throwable) obj);
            }
        });
        return null;
    }

    public static final Unit OLrzqt(OKGrowthPlatformRichTextView oKGrowthPlatformRichTextView, int i) {
        ((C37999pIm) oKGrowthPlatformRichTextView.dHguZz).setCustomTextColor(i);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OKGrowthPlatformRichTextView oKGrowthPlatformRichTextView, RichTextRoot richTextRoot) {
        Intrinsics.checkNotNullParameter(richTextRoot, "");
        InterfaceC28104kPa.ActionBar.setLexicalRichData$default((InterfaceC28104kPa) oKGrowthPlatformRichTextView.dHguZz, richTextRoot, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.mlnservice.view.OKGrowthPlatformRichTextView.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] EZpvd() {
            return OKGrowthPlatformRichTextView.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] renderRichTextView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        ((kOI) C43251rlk.copydefault(kOI.class)).OLrzqt(javaString, new Function1() { // from class: o.rkW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKGrowthPlatformRichTextView.copydefault(this.OLrzqt, (RichTextRoot) obj);
            }
        }, new Function1() { // from class: o.rlb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKGrowthPlatformRichTextView.EZpvd((java.lang.Throwable) obj);
            }
        });
        return null;
    }
}
