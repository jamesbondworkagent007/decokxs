package com.immomo.mls.fun.ui.uilib.banner;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.banner.MLNOKSlider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.wXO;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKSlider extends UDView<wXO> {
    public static final Application Companion = new Application(null);
    public static final String[] copydefault = {"setCount", "setCurrentItem", "setStyle"};
    public static final Integer[] AEQbTJ = {0, 1};
    public static final String KWHzl = MLNOKSlider.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKSlider(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public wXO AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        wXO wxo = new wXO(contextAubY, null, 0, 6, null);
        wxo.setOKDSSize(-5);
        return wxo;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setStyle(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessTypes$default(luaValueArr, AEQbTJ, 0, new Function1() { // from class: o.amJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNOKSlider.EZpvd(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        }, 2, null);
        return null;
    }

    public static final Unit EZpvd(MLNOKSlider mLNOKSlider, int i) {
        ((wXO) mLNOKSlider.dHguZz).setStyle(i);
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.banner.MLNOKSlider.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] copydefault() {
            return MLNOKSlider.copydefault;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCount(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        ((wXO) this.dHguZz).setCount(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setCurrentItem(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        ((wXO) this.dHguZz).copydefault(luaValue.toInt() - 1, 0.0f, 0);
        return null;
    }
}
