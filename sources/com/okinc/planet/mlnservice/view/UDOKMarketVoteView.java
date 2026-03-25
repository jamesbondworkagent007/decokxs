package com.okinc.planet.mlnservice.view;

import android.content.Context;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.planet.mlnservice.view.UDOKMarketVoteView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C7916asp;
import o.InterfaceC60044zuT;
import o.tUX;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC60044zuT
public final class UDOKMarketVoteView extends UDView<tUX> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final String[] copydefault = {"setupVoteInfo", "setOnVoteListener", "resetVoteView"};

    @InterfaceC60044zuT
    public UDOKMarketVoteView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.mlnservice.view.UDOKMarketVoteView.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String[] EZpvd() {
            return UDOKMarketVoteView.copydefault;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public tUX AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new tUX(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setupVoteInfo(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Map<String, Object> mapEZpvd = EZpvd((LuaValue) yDV.AuCTelauCTel(luaValueArr));
        int iAhwBna = C33129mqd.AhwBna(mapEZpvd.get("state"));
        String strGEmmrt = C33129mqd.gEmmrt(mapEZpvd.get("title"));
        String strGEmmrt2 = C33129mqd.gEmmrt(mapEZpvd.get("pro"));
        String strGEmmrt3 = C33129mqd.gEmmrt(mapEZpvd.get("con"));
        int iAhwBna2 = C33129mqd.AhwBna(mapEZpvd.get("proNum"));
        int iAhwBna3 = C33129mqd.AhwBna(mapEZpvd.get("conNum"));
        if (strGEmmrt.length() <= 0 || strGEmmrt2.length() <= 0 || strGEmmrt3.length() <= 0) {
            return null;
        }
        ((tUX) this.dHguZz).setVoteData(iAhwBna, strGEmmrt, strGEmmrt2, strGEmmrt3, iAhwBna2, iAhwBna3);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnVoteListener(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        final LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue == null) {
            return null;
        }
        ((tUX) this.dHguZz).setOnVoteListener(new Function1() { // from class: o.tTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketVoteView.OLrzqt(luaValue, ((java.lang.Integer) obj).intValue());
            }
        });
        return null;
    }

    public static final Unit OLrzqt(LuaValue luaValue, int i) {
        luaValue.toLuaFunction().invoke(new LuaNumber[]{LuaNumber.valueOf(i)});
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] resetVoteView(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((tUX) this.dHguZz).KWHzl();
        return null;
    }

    public final Map<String, Object> EZpvd(LuaValue luaValue) {
        return C7916asp.OLrzqt(luaValue.toLuaTable());
    }
}
