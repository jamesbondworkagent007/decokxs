package o;

import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53449wlh extends AbstractC53377wkO {
    @Override // o.AbstractC53377wkO
    public void copydefault() {
        super.copydefault();
        values().AEQbTJ.setOnAmtPercentCallback(new Function2() { // from class: o.wlf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53449wlh.AEQbTJ(this.KWHzl, (C47988uAv) obj, (java.lang.Float) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(C53449wlh c53449wlh, C47988uAv c47988uAv, java.lang.Float f) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (f != null && c47988uAv.zLjUOn()) {
            c53449wlh.values().AEQbTJ.setAmtPercentContent(c47988uAv, c53449wlh.AEQbTJ(c53449wlh.values().KWHzl.OLrzqt(), java.lang.Float.valueOf(c47988uAv.fJNWhG())), false);
            AbstractC48610uXu abstractC48610uXuValues = c53449wlh.values();
            abstractC48610uXuValues.KWHzl.EZpvd(abstractC48610uXuValues.AEQbTJ.EZpvd());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.Float f) {
        java.lang.String available;
        java.lang.String strGEmmrt;
        C54571xNh c54571xNhCreateAmtConvertor$default;
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        TacticsData tacticsDataValueOf = OLrzqt().valueOf();
        java.lang.String side = tacticsDataValueOf != null ? tacticsDataValueOf.getSide() : null;
        if (Intrinsics.EZpvd((java.lang.Object) side, (java.lang.Object) "buy")) {
            if (maxAvailableResp == null || (available = maxAvailableResp.getMaxSize()) == null) {
                available = "";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) side, (java.lang.Object) "sell")) {
            xOV xovAhwBna = C56059xvf.EZpvd.AhwBna();
            if (xovAhwBna != null && xovAhwBna.OLrzqt()) {
                TacticsData tacticsDataValueOf2 = OLrzqt().valueOf();
                if (Intrinsics.EZpvd((java.lang.Object) (tacticsDataValueOf2 != null ? tacticsDataValueOf2.getTdMode() : null), (java.lang.Object) "isolated") && !Intrinsics.EZpvd(values().KWHzl.EZpvd(), java.lang.Boolean.TRUE)) {
                    if (maxAvailableResp == null || (available = maxAvailableResp.getMaxSize()) == null) {
                    }
                }
            } else if (maxAvailableResp == null || (available = maxAvailableResp.getAvailable()) == null) {
            }
        }
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        if (f == null || (strGEmmrt = C33129mqd.gEmmrt(f)) == null) {
            strGEmmrt = "";
        }
        java.lang.String strCopydefault = c54796xVq.copydefault(strGEmmrt, available);
        TacticsData tacticsDataValueOf3 = OLrzqt().valueOf();
        return (tacticsDataValueOf3 == null || (c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, tacticsDataValueOf3.getInstId(), tacticsDataValueOf3.getInstType(), null, false, null, 28, null)) == null || (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default.AYXKKw(strCopydefault)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC53377wkO
    public void EZpvd(@NotNull java.lang.String str, @NotNull TwapReq twapReq, @NotNull Function1<? super TwapReq, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(twapReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(twapReq);
    }
}
