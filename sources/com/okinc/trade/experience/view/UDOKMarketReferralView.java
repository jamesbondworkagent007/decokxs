package com.okinc.trade.experience.view;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import com.google.android.exoplayer2.util.MimeTypes;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.trade.experience.view.UDOKMarketReferralView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.InterfaceC35974oKp;
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
public final class UDOKMarketReferralView extends UDView<View> {
    public InterfaceC35974oKp KWHzl;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final String[] EZpvd = {"setParams", "setDataDidLoadedCallBack"};

    @InterfaceC60044zuT
    public UDOKMarketReferralView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class Application {
        public static int AEQbTJ;
        public static int copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.trade.experience.view.UDOKMarketReferralView.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] KWHzl() {
            return UDOKMarketReferralView.EZpvd;
        }

        public static int OLrzqt() {
            int i = AEQbTJ;
            int i2 = i % 6123588;
            AEQbTJ = i + 1;
            if (i2 != 0) {
                return copydefault;
            }
            int mode = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getMode();
            copydefault = mode;
            return mode;
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        InterfaceC35974oKp marketReferralView$default;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            Context contextAubY = AubY();
            Intrinsics.checkNotNullExpressionValue(contextAubY, "");
            marketReferralView$default = oKA.TaskDescription.getMarketReferralView$default(oka, contextAubY, null, 0, 6, null);
        } else {
            marketReferralView$default = null;
        }
        this.KWHzl = marketReferralView$default;
        View view = marketReferralView$default instanceof View ? (View) marketReferralView$default : null;
        return view == null ? new View(AubY()) : view;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setParams(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        LuaValue luaValue;
        String javaString3;
        LuaValue luaValue2;
        LuaValue luaValue3;
        String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            pUU.copydefault("OKMarketOverviewCampaignCard", "setParams: invalid params");
        }
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue4 == null || (luaValue3 = luaValue4.get("coinName")) == null || (javaString = luaValue3.toJavaString()) == null) {
            javaString = "";
        }
        LuaValue luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue5 == null || (luaValue2 = luaValue5.get("bizType")) == null || (javaString2 = luaValue2.toJavaString()) == null) {
            javaString2 = "";
        }
        LuaValue luaValue6 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue6 != null && (luaValue = luaValue6.get("instId")) != null && (javaString3 = luaValue.toJavaString()) != null) {
            str = javaString3;
        }
        InterfaceC35974oKp interfaceC35974oKp = this.KWHzl;
        if (interfaceC35974oKp == null) {
            return null;
        }
        interfaceC35974oKp.setParam(javaString, javaString2, str);
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
        InterfaceC35974oKp interfaceC35974oKp = this.KWHzl;
        if (interfaceC35974oKp != null) {
            interfaceC35974oKp.setDataDidLoadedCallBack(new Function1() { // from class: o.uor
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDOKMarketReferralView.AEQbTJ(luaFunction, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        return null;
    }

    public static final Unit AEQbTJ(LuaFunction luaFunction, int i) {
        if (luaFunction != null) {
            luaFunction.invoke(new LuaNumber[]{LuaNumber.valueOf(i)});
        }
        return Unit.INSTANCE;
    }
}
