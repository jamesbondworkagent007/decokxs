package o;

import com.okinc.unify_trade.biz.subscribe.ArbitrageRespData;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55879xsK {
    public boolean OLrzqt;
    public java.util.HashMap<java.lang.String, InterfaceC55813xqy> EZpvd = new java.util.HashMap<>();
    public java.util.HashMap<java.lang.String, InterfaceC55813xqy> KWHzl = new java.util.HashMap<>();
    public java.util.ArrayList<SpreadArbitrageData> valueOf = new java.util.ArrayList<>();
    public java.util.ArrayList<FundingRateArbitrageData> AEQbTJ = new java.util.ArrayList<>();
    public C56094xwN copydefault = new C56094xwN();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<SpreadArbitrageData> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<FundingRateArbitrageData> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.xsK$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<ArbitrageRespData> {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function1<? super java.lang.Boolean, Unit> function1) {
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, ArbitrageRespData arbitrageRespData, java.lang.Exception exc) {
            if (z && arbitrageRespData != null) {
                C55879xsK.this.AEQbTJ(arbitrageRespData);
                C55879xsK.this.EZpvd(true);
            }
            this.KWHzl.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    public final void EZpvd(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault.KWHzl(new TaskDescription(function1));
    }

    public final void AEQbTJ(ArbitrageRespData arbitrageRespData) {
        for (FundingRateArbitrageData fundingRateArbitrageData : arbitrageRespData.getFundingList()) {
            java.util.HashMap<java.lang.String, InterfaceC55813xqy> map = this.EZpvd;
            java.lang.String arbitrageId = fundingRateArbitrageData.getArbitrageId();
            if (arbitrageId == null) {
                arbitrageId = "";
            }
            map.put(arbitrageId, fundingRateArbitrageData);
            java.lang.String sellInstId = fundingRateArbitrageData.getSellInstId();
            java.lang.String str = sellInstId == null ? "" : sellInstId;
            java.lang.String sellInstType = fundingRateArbitrageData.getSellInstType();
            java.lang.String str2 = sellInstType == null ? "" : sellInstType;
            java.lang.String arbLeftSide = fundingRateArbitrageData.getArbLeftSide();
            java.lang.String buyInstId = fundingRateArbitrageData.getBuyInstId();
            java.lang.String str3 = buyInstId == null ? "" : buyInstId;
            java.lang.String buyInstType = fundingRateArbitrageData.getBuyInstType();
            KWHzl(str, str2, arbLeftSide, str3, buyInstType == null ? "" : buyInstType, fundingRateArbitrageData.getArbRightSide(), fundingRateArbitrageData);
        }
        for (SpreadArbitrageData spreadArbitrageData : arbitrageRespData.getSpreadList()) {
            java.util.HashMap<java.lang.String, InterfaceC55813xqy> map2 = this.EZpvd;
            java.lang.String arbitrageId2 = spreadArbitrageData.getArbitrageId();
            if (arbitrageId2 == null) {
                arbitrageId2 = "";
            }
            map2.put(arbitrageId2, spreadArbitrageData);
            java.lang.String sellInstId2 = spreadArbitrageData.getSellInstId();
            java.lang.String str4 = sellInstId2 == null ? "" : sellInstId2;
            java.lang.String sellInstType2 = spreadArbitrageData.getSellInstType();
            java.lang.String str5 = sellInstType2 == null ? "" : sellInstType2;
            java.lang.String arbLeftSide2 = spreadArbitrageData.getArbLeftSide();
            java.lang.String buyInstId2 = spreadArbitrageData.getBuyInstId();
            java.lang.String str6 = buyInstId2 == null ? "" : buyInstId2;
            java.lang.String buyInstType2 = spreadArbitrageData.getBuyInstType();
            KWHzl(str4, str5, arbLeftSide2, str6, buyInstType2 == null ? "" : buyInstType2, spreadArbitrageData.getArbRightSide(), spreadArbitrageData);
        }
        if (C33129mqd.KWHzl((java.util.Collection) arbitrageRespData.getSpreadList())) {
            this.valueOf.clear();
            this.valueOf.addAll(arbitrageRespData.getSpreadList());
        }
        if (C33129mqd.KWHzl((java.util.Collection) arbitrageRespData.getFundingList())) {
            this.AEQbTJ.clear();
            this.AEQbTJ.addAll(arbitrageRespData.getFundingList());
        }
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, InterfaceC55813xqy interfaceC55813xqy) {
        this.KWHzl.put(str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5 + "-" + str6, interfaceC55813xqy);
    }

    public final InterfaceC55813xqy AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) str6)) {
            return null;
        }
        java.lang.String str7 = Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "sell") ? str : str4;
        java.lang.String str8 = Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "sell") ? str2 : str5;
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "sell")) {
            str = str4;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "sell")) {
            str2 = str5;
        }
        return this.KWHzl.get(str7 + "-" + str8 + "-sell-" + str + "-" + str2 + "-buy");
    }
}
