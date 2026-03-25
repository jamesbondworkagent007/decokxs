package com.okinc.trade.experience.view;

import android.content.Context;
import android.view.View;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.trade.experience.view.UDOKMarketUnlockTokenScheduleView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.InterfaceC35978oKt;
import o.InterfaceC60044zuT;
import o.oKA;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public final class UDOKMarketUnlockTokenScheduleView extends UDView<View> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final String[] copydefault = {"setParams", "setDataDidLoadedCallBack"};
    public InterfaceC35978oKt OLrzqt;

    @InterfaceC60044zuT
    public UDOKMarketUnlockTokenScheduleView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.trade.experience.view.UDOKMarketUnlockTokenScheduleView.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] EZpvd() {
            return UDOKMarketUnlockTokenScheduleView.copydefault;
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        InterfaceC35978oKt klineUnlockScheduleView$default;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            Context contextAubY = AubY();
            Intrinsics.checkNotNullExpressionValue(contextAubY, "");
            klineUnlockScheduleView$default = oKA.TaskDescription.getKlineUnlockScheduleView$default(oka, contextAubY, null, 0, 6, null);
        } else {
            klineUnlockScheduleView$default = null;
        }
        this.OLrzqt = klineUnlockScheduleView$default;
        View view = klineUnlockScheduleView$default instanceof View ? (View) klineUnlockScheduleView$default : null;
        return view == null ? new View(AubY()) : view;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setParams(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        String javaString;
        String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            pUU.copydefault("OKMarketOverviewUnlockScheduleView", "setParams: invalid params");
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue2 != null && (luaValue = luaValue2.get("coinName")) != null && (javaString = luaValue.toJavaString()) != null) {
            str = javaString;
        }
        InterfaceC35978oKt interfaceC35978oKt = this.OLrzqt;
        if (interfaceC35978oKt == null) {
            return null;
        }
        interfaceC35978oKt.setParam(str);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDataDidLoadedCallBack(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            pUU.copydefault("OKMarketOverviewCampaignCard", "setDataDidLoadedCallBack: invalid params");
        }
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        final LuaFunction luaFunction = luaValue != null ? luaValue.toLuaFunction() : null;
        InterfaceC35978oKt interfaceC35978oKt = this.OLrzqt;
        if (interfaceC35978oKt != null) {
            interfaceC35978oKt.setDataDidLoadedCallBack(new Function1() { // from class: o.uos
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDOKMarketUnlockTokenScheduleView.OLrzqt(luaFunction, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(LuaFunction luaFunction, int i) {
        if (luaFunction != null) {
            luaFunction.invoke(new LuaNumber[]{LuaNumber.valueOf(i)});
        }
        return Unit.INSTANCE;
    }
}
