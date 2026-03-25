package com.immomo.mls.fun.ui.uilib.progress;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.progress.MLNOKProgressIndicator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55172xet;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKProgressIndicator extends UDView<C55172xet> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final String[] KWHzl = {"count", "currentIndex", "next", "back", "activeColor", "inactiveColor"};
    public static final String OLrzqt = MLNOKProgressIndicator.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKProgressIndicator(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C55172xet AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C55172xet c55172xet = new C55172xet(contextAubY, null, 0, 6, null);
        c55172xet.setCurrentIndex(0);
        return c55172xet;
    }

    @InterfaceC60044zuT
    public final LuaValue[] next(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55172xet) this.dHguZz).AEQbTJ();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] back(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((C55172xet) this.dHguZz).EZpvd();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] activeColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.aoc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKProgressIndicator.AEQbTJ(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit AEQbTJ(MLNOKProgressIndicator mLNOKProgressIndicator, int i) {
        ((C55172xet) mLNOKProgressIndicator.dHguZz).setActiveColor(i);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] inactiveColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessColor$default(luaValueArr, 0, new Function1() { // from class: o.anZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKProgressIndicator.OLrzqt(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, 1, null);
        return null;
    }

    public static final Unit OLrzqt(MLNOKProgressIndicator mLNOKProgressIndicator, int i) {
        ((C55172xet) mLNOKProgressIndicator.dHguZz).setInactiveColor(i);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.progress.MLNOKProgressIndicator.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String[] KWHzl() {
            return MLNOKProgressIndicator.KWHzl;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] count(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return LuaValue.rNumber(((C55172xet) this.dHguZz).KWHzl());
        }
        ((C55172xet) this.dHguZz).setCount(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] currentIndex(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return LuaValue.rNumber(((C55172xet) this.dHguZz).OLrzqt());
        }
        ((C55172xet) this.dHguZz).setCurrentIndex(luaValue.toInt());
        return null;
    }
}
