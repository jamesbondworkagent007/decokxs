package o;

import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53443wlb extends AbstractC53377wkO {
    @Override // o.AbstractC53377wkO
    public void copydefault() {
        super.copydefault();
        values().AEQbTJ.setOnAmtPercentCallback(new Function2() { // from class: o.wld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53443wlb.EZpvd(this.KWHzl, (C47988uAv) obj, (java.lang.Float) obj2);
            }
        });
    }

    public static final Unit EZpvd(C53443wlb c53443wlb, C47988uAv c47988uAv, java.lang.Float f) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (f != null && c47988uAv.zLjUOn()) {
            c53443wlb.values().AEQbTJ.setAmtPercentContent(c47988uAv, c53443wlb.AEQbTJ(c53443wlb.values().KWHzl.OLrzqt(), java.lang.Float.valueOf(c47988uAv.fJNWhG())), false);
            AbstractC48610uXu abstractC48610uXuValues = c53443wlb.values();
            abstractC48610uXuValues.KWHzl.EZpvd(abstractC48610uXuValues.AEQbTJ.EZpvd());
        }
        return Unit.INSTANCE;
    }

    private final java.lang.String AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.Float f) {
        java.lang.String available;
        java.lang.String strGEmmrt;
        C54571xNh c54571xNhCreateAmtConvertor$default;
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        TacticsData tacticsDataValueOf = OLrzqt().valueOf();
        java.lang.String side = tacticsDataValueOf != null ? tacticsDataValueOf.getSide() : null;
        if (!Intrinsics.EZpvd((java.lang.Object) side, (java.lang.Object) "buy") ? !Intrinsics.EZpvd((java.lang.Object) side, (java.lang.Object) "sell") || (Intrinsics.EZpvd(values().KWHzl.EZpvd(), java.lang.Boolean.TRUE) ? maxAvailableResp == null || (available = maxAvailableResp.getAvailable()) == null : maxAvailableResp == null || (available = maxAvailableResp.getMaxSize()) == null) : maxAvailableResp == null || (available = maxAvailableResp.getMaxSize()) == null) {
            available = "";
        }
        C54796xVq c54796xVq = C54796xVq.AEQbTJ;
        if (f == null || (strGEmmrt = C33129mqd.gEmmrt(f)) == null) {
            strGEmmrt = "";
        }
        java.lang.String strCopydefault = c54796xVq.copydefault(strGEmmrt, available);
        TacticsData tacticsDataValueOf2 = OLrzqt().valueOf();
        return (tacticsDataValueOf2 == null || (c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, tacticsDataValueOf2.getInstId(), tacticsDataValueOf2.getInstType(), null, false, null, 28, null)) == null || (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default.AYXKKw(strCopydefault)) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) == null) ? "" : safeString$default;
    }

    @Override // o.AbstractC53377wkO
    public void EZpvd(@NotNull java.lang.String str, @NotNull TwapReq twapReq, @NotNull Function1<? super TwapReq, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(twapReq, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(twapReq);
    }
}
