package com.immomo.mls.fun.ui.uilib.text;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.text.MLNOKHyperlink;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55312xha;
import o.C55317xhf;
import o.C55320xhi;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKHyperlink extends UDView<C55317xhf> {
    public static final Application Companion = new Application(null);
    public static final String[] EZpvd = {"size", "emphasis", "text"};
    public static final Integer[] OLrzqt = {-3, -4, -5};
    public static final Integer[] KWHzl = {0, 1};
    public static final String copydefault = MLNOKHyperlink.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKHyperlink(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C55317xhf AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C55317xhf c55317xhf = new C55317xhf(contextAubY, null, 0, 6, null);
        C55312xha c55312xhaValueOf = c55317xhf.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setIncludeFontPadding(false);
        }
        c55317xhf.setOKDSSize(-3);
        return c55317xhf;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] size(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, OLrzqt, 0, new Function1() { // from class: o.aqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHyperlink.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit KWHzl(MLNOKHyperlink mLNOKHyperlink, int i) {
        ((C55317xhf) mLNOKHyperlink.dHguZz).setOKDSSize(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] emphasis(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, KWHzl, 0, new Function1() { // from class: o.aqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKHyperlink.copydefault(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit copydefault(MLNOKHyperlink mLNOKHyperlink, int i) {
        ((C55317xhf) mLNOKHyperlink.dHguZz).setEmphasis(i);
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.text.MLNOKHyperlink.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] EZpvd() {
            return MLNOKHyperlink.EZpvd;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] text(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isString()) {
            ((C55317xhf) this.dHguZz).setTextValue(null);
        } else {
            ((C55317xhf) this.dHguZz).setTextValue(luaValue.toJavaString());
        }
        return null;
    }
}
