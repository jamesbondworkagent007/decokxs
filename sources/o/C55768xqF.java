package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MinInvestResp;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55768xqF implements InterfaceC54501xKt<java.util.List<? extends MinInvestResp>, MinInvestResp> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MinInvestResp KWHzl(@NotNull java.util.List<MinInvestResp> list) {
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String instFamily;
        java.lang.String minInvestment;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        MinInvestResp minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull(list);
        java.lang.String str2 = (minInvestResp == null || (minInvestment = minInvestResp.getMinInvestment()) == null) ? "" : minInvestment;
        if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list.size()), 0) || C33129mqd.OLrzqt((java.lang.Object) list.get(0).getSingleAmt(), (java.lang.Object) 0)) {
            safeString$default = "--";
        } else {
            C56059xvf c56059xvf = C56059xvf.EZpvd;
            java.lang.String strAYXKKw = c56059xvf.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            BizInstrument bizInstrumentIsConnected = c56059xvf.isConnected();
            if (bizInstrumentIsConnected != null && (instFamily = bizInstrumentIsConnected.getInstFamily()) != null) {
                str = instFamily;
            }
            C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(strAYXKKw, str, null, 4, null);
            if (c54571xNhCreateStrategyTradeConverter$default == null || (c54536xMLDjBIcL = c54571xNhCreateStrategyTradeConverter$default.djBIcL(list.get(0).getSingleAmt())) == null || (c54536xMLCopydefault = c54536xMLDjBIcL.copydefault()) == null || (c54536xMLDjBIcL2 = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            }
        }
        return new MinInvestResp(str2, (java.lang.String) null, (java.lang.String) null, safeString$default, (java.lang.String) null, 22, (DefaultConstructorMarker) null);
    }
}
