package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.DepthViewModel$subDepthSource$1;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.DepthViewModel$subDepthSource$2;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeStrategyInfoBean;
import com.okinc.unify_trade.biz.subscribe.BizDepthData;
import com.okinc.unify_trade.biz.subscribe.EstimatedPriceData;
import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import com.okinc.unify_trade.biz.subscribe.OfflinePlan;
import com.okinc.unify_trade.biz.subscribe.OptSummaryData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49419uoG;
import o.AbstractC49464uoz;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wvS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53964wvS extends ViewModel {
    public java.lang.String djBIcL;
    public java.lang.String fARcdN;
    public final TradeLiveData<AbstractC49419uoG.ActionBar> gEmmrt = new TradeLiveData<>();
    public final TradeLiveData<AbstractC49419uoG.ActionBar> fIwbmz = new TradeLiveData<>();
    public final TradeLiveData<AbstractC49464uoz.Activity> valueOf = new TradeLiveData<>();
    public final TradeLiveData<AbstractC49464uoz.Activity> fetchVPNInfo = new TradeLiveData<>();
    public final TradeLiveData<OptSummaryData> DbNXlk = new TradeLiveData<>();
    public final TradeLiveData<OptSummaryData> ejfBZ = new TradeLiveData<>();
    public final TradeLiveData<java.util.ArrayList<TradeStrategyInfoBean>> AkhnZx = new TradeLiveData<>();
    public final TradeLiveData<java.util.ArrayList<TradeStrategyInfoBean>> AuCTel = new TradeLiveData<>();
    public final java.util.ArrayList<java.lang.Object> OLrzqt = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.lang.Object> AhwBna = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.lang.Object> fJNWhG = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.lang.Object> AYXKKw = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.lang.Object> values = new java.util.ArrayList<>();
    public final xBW AEQbTJ = new xBW();
    public final xBW getNewProxyInstance = new xBW();
    public final TradeLiveData<AbstractC54531xLw> copydefault = new TradeLiveData<>();
    public final TradeLiveData<AbstractC54531xLw> EZpvd = new TradeLiveData<>();
    public final TradeLiveData<C54780xVa> KWHzl = new TradeLiveData<>();
    public final TradeLiveData<C54780xVa> isConnected = new TradeLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.util.ArrayList<TradeStrategyInfoBean>> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49464uoz.Activity> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C54780xVa> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C54780xVa> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49419uoG.ActionBar> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<OptSummaryData> OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49464uoz.Activity> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49419uoG.ActionBar> djBIcL() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<OptSummaryData> gEmmrt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.util.ArrayList<TradeStrategyInfoBean>> valueOf() {
        return this.AuCTel;
    }

    public static /* synthetic */ void subLeftDepthSource$default(C53964wvS c53964wvS, BizInstrument bizInstrument, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bizInstrument = null;
        }
        c53964wvS.gEmmrt(bizInstrument);
    }

    public final void gEmmrt(BizInstrument bizInstrument) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        ArbitrageInfo arbitrageInfoCopydefault = C56036xvI.KWHzl.copydefault();
        if (bizInstrument == null) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault2 != null) {
                bizInstrument = interfaceC54581xNrCopydefault2.copydefault(arbitrageInfoCopydefault.getInstType(), EZpvd(arbitrageInfoCopydefault.getInstType()) ? null : arbitrageInfoCopydefault.getInstId(), EZpvd(arbitrageInfoCopydefault.getInstType()) ? arbitrageInfoCopydefault.getInstId() : null, arbitrageInfoCopydefault.getAlias());
            } else {
                bizInstrument = null;
            }
        }
        addListener$default(this, true, bizInstrument, null, 4, null);
        KWHzl(bizInstrument);
        if (this.AhwBna.size() <= 0 || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.copydefault(this.AhwBna);
    }

    public final void AuCTel() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        ArbitrageInfo arbitrageInfoAEQbTJ = C56036xvI.KWHzl.AEQbTJ();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        BizInstrument bizInstrumentCopydefault = null;
        if (interfaceC54581xNrCopydefault2 != null) {
            bizInstrumentCopydefault = interfaceC54581xNrCopydefault2.copydefault(arbitrageInfoAEQbTJ.getInstType(), EZpvd(arbitrageInfoAEQbTJ.getInstType()) ? null : arbitrageInfoAEQbTJ.getInstId(), EZpvd(arbitrageInfoAEQbTJ.getInstType()) ? arbitrageInfoAEQbTJ.getInstId() : null, arbitrageInfoAEQbTJ.getAlias());
        }
        addListener$default(this, false, null, bizInstrumentCopydefault, 2, null);
        djBIcL(bizInstrumentCopydefault);
        if (this.fJNWhG.size() <= 0 || (interfaceC54581xNrCopydefault = c54589xNz.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.copydefault(this.fJNWhG);
    }

    public static /* synthetic */ void subLeftDepthList$default(C53964wvS c53964wvS, BizInstrument bizInstrument, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c53964wvS.OLrzqt(bizInstrument, str, i);
    }

    public final void OLrzqt(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, int i) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(this.AYXKKw);
        }
        this.AYXKKw.clear();
        if (str.length() == 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.util.List<java.lang.String> listKWHzl = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrument.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.KWHzl(bizInstrument);
            str = (listKWHzl == null || !(listKWHzl.isEmpty() ^ true)) ? "0" : listKWHzl.get(0);
        }
        this.djBIcL = str;
        this.AYXKKw.add(copydefault(bizInstrument, str != null ? str : "0", i));
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault2 != null) {
            interfaceC54581xNrCopydefault2.copydefault(this.AYXKKw);
        }
    }

    public static /* synthetic */ void subRightDepthList$default(C53964wvS c53964wvS, BizInstrument bizInstrument, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c53964wvS.AEQbTJ(bizInstrument, str, i);
    }

    public final void AEQbTJ(@NotNull BizInstrument bizInstrument, @NotNull java.lang.String str, int i) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(this.values);
        }
        this.values.clear();
        if (str.length() == 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            java.util.List<java.lang.String> listKWHzl = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrument.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.KWHzl(bizInstrument);
            str = (listKWHzl == null || !(listKWHzl.isEmpty() ^ true)) ? "0" : listKWHzl.get(0);
        }
        this.fARcdN = str;
        this.values.add(KWHzl(bizInstrument, str != null ? str : "", i));
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault2 != null) {
            interfaceC54581xNrCopydefault2.copydefault(this.values);
        }
    }

    public final void fJNWhG() {
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        ArbitrageInfo arbitrageInfoCopydefault = c56036xvI.copydefault();
        ArbitrageInfo arbitrageInfoAEQbTJ = c56036xvI.AEQbTJ();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DepthViewModel$subDepthSource$1(arbitrageInfoCopydefault, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DepthViewModel$subDepthSource$2(arbitrageInfoAEQbTJ, this, null), 3, null);
    }

    public final void DbNXlk() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        ArbitrageInfo arbitrageInfoCopydefault = C56036xvI.KWHzl.copydefault();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        BizInstrument bizInstrumentCopydefault = null;
        if (interfaceC54581xNrCopydefault2 != null) {
            bizInstrumentCopydefault = interfaceC54581xNrCopydefault2.copydefault(arbitrageInfoCopydefault.getInstType(), EZpvd(arbitrageInfoCopydefault.getInstType()) ? null : arbitrageInfoCopydefault.getInstId(), EZpvd(arbitrageInfoCopydefault.getInstType()) ? arbitrageInfoCopydefault.getInstId() : null, arbitrageInfoCopydefault.getAlias());
        }
        addListener$default(this, true, bizInstrumentCopydefault, null, 4, null);
        KWHzl(bizInstrumentCopydefault);
        if (this.AhwBna.size() <= 0 || (interfaceC54581xNrCopydefault = c54589xNz.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.copydefault(this.AhwBna);
    }

    public final void AkhnZx() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        ArbitrageInfo arbitrageInfoAEQbTJ = C56036xvI.KWHzl.AEQbTJ();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        BizInstrument bizInstrumentCopydefault = null;
        if (interfaceC54581xNrCopydefault2 != null) {
            bizInstrumentCopydefault = interfaceC54581xNrCopydefault2.copydefault(arbitrageInfoAEQbTJ.getInstType(), EZpvd(arbitrageInfoAEQbTJ.getInstType()) ? null : arbitrageInfoAEQbTJ.getInstId(), EZpvd(arbitrageInfoAEQbTJ.getInstType()) ? arbitrageInfoAEQbTJ.getInstId() : null, arbitrageInfoAEQbTJ.getAlias());
        }
        addListener$default(this, false, null, bizInstrumentCopydefault, 2, null);
        djBIcL(bizInstrumentCopydefault);
        if (this.fJNWhG.size() <= 0 || (interfaceC54581xNrCopydefault = c54589xNz.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.copydefault(this.fJNWhG);
    }

    public static /* synthetic */ void addListener$default(C53964wvS c53964wvS, boolean z, BizInstrument bizInstrument, BizInstrument bizInstrument2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bizInstrument = null;
        }
        if ((i & 4) != 0) {
            bizInstrument2 = null;
        }
        c53964wvS.AEQbTJ(z, bizInstrument, bizInstrument2);
    }

    public final void AEQbTJ(boolean z, BizInstrument bizInstrument, BizInstrument bizInstrument2) {
        java.lang.String instType;
        if (z) {
            this.AhwBna.clear();
            this.AhwBna.add(EZpvd(bizInstrument));
            instType = bizInstrument != null ? bizInstrument.getInstType() : null;
            if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "OPTION")) {
                this.AhwBna.add(copydefault(bizInstrument));
                return;
            } else {
                if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SWAP")) {
                    this.AhwBna.add(AEQbTJ(bizInstrument));
                    return;
                }
                return;
            }
        }
        this.fJNWhG.clear();
        this.fJNWhG.add(OLrzqt(bizInstrument2));
        instType = bizInstrument2 != null ? bizInstrument2.getInstType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "OPTION")) {
            this.fJNWhG.add(AYXKKw(bizInstrument2));
        } else if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SWAP")) {
            this.fJNWhG.add(AhwBna(bizInstrument2));
        }
    }

    public final void isConnected() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        if (this.AYXKKw.size() <= 0 || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(this.AYXKKw);
    }

    public final void fIwbmz() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        if (this.values.size() <= 0 || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(this.values);
    }

    public final void values() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        this.AEQbTJ.AYXKKw();
        if (this.AhwBna.size() <= 0 || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(this.AhwBna);
    }

    public final void ejfBZ() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        this.getNewProxyInstance.AYXKKw();
        if (this.fJNWhG.size() <= 0 || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(this.fJNWhG);
    }

    public final void fetchVPNInfo() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        this.OLrzqt.clear();
        this.OLrzqt.addAll(this.AhwBna);
        this.OLrzqt.addAll(this.fJNWhG);
        if (this.OLrzqt.size() <= 0 || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(this.OLrzqt);
    }

    /* JADX INFO: renamed from: o.wvS$Application */
    public static final class Application extends AbstractC55670xoN {
        public Application(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(FundingRateData fundingRateData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(fundingRateData, "");
            Intrinsics.checkNotNullParameter(str, "");
            C53964wvS.this.KWHzl().setValue(new C54086wxi().KWHzl(fundingRateData));
        }
    }

    public final java.lang.Object AEQbTJ(BizInstrument bizInstrument) {
        java.lang.String instId;
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        return new Application(instId, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.wvS$Dialog */
    public static final class Dialog extends AbstractC55670xoN {
        public Dialog(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        public void EZpvd(FundingRateData fundingRateData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(fundingRateData, "");
            Intrinsics.checkNotNullParameter(str, "");
            C53964wvS.this.djBIcL().setValue(new C54086wxi().KWHzl(fundingRateData));
        }
    }

    public final java.lang.Object AhwBna(BizInstrument bizInstrument) {
        java.lang.String instId;
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        return new Dialog(instId, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.wvS$TaskDescription */
    public static final class TaskDescription extends AbstractC55668xoL {
        public final /* synthetic */ BizInstrument AEQbTJ;
        public final /* synthetic */ C53964wvS OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(BizInstrument bizInstrument, C53964wvS c53964wvS, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str, null, str3, str2, 2, null);
            this.AEQbTJ = bizInstrument;
            this.OLrzqt = c53964wvS;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<EstimatedPriceData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            BizInstrument bizInstrument = this.AEQbTJ;
            AbstractC49464uoz.Activity activityKWHzl = new C54083wxf(bizInstrument != null ? bizInstrument.getInstId() : null).KWHzl(list);
            if (activityKWHzl != null) {
                this.OLrzqt.copydefault().setValue(activityKWHzl);
            }
        }
    }

    public final java.lang.Object EZpvd(BizInstrument bizInstrument) {
        java.lang.String instType;
        if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
            instType = "";
        }
        return new TaskDescription(bizInstrument, this, instType, bizInstrument != null ? bizInstrument.getInstId() : null, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.wvS$Fragment */
    public static final class Fragment extends AbstractC55668xoL {
        public final /* synthetic */ C53964wvS EZpvd;
        public final /* synthetic */ BizInstrument KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(BizInstrument bizInstrument, C53964wvS c53964wvS, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str, null, str3, str2, 2, null);
            this.KWHzl = bizInstrument;
            this.EZpvd = c53964wvS;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<EstimatedPriceData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            BizInstrument bizInstrument = this.KWHzl;
            AbstractC49464uoz.Activity activityKWHzl = new C54083wxf(bizInstrument != null ? bizInstrument.getInstId() : null).KWHzl(list);
            if (activityKWHzl != null) {
                this.EZpvd.AYXKKw().setValue(activityKWHzl);
            }
        }
    }

    public final java.lang.Object OLrzqt(BizInstrument bizInstrument) {
        java.lang.String instType;
        if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
            instType = "";
        }
        return new Fragment(bizInstrument, this, instType, bizInstrument != null ? bizInstrument.getInstId() : null, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.wvS$StateListAnimator */
    public static final class StateListAnimator extends AbstractC55681xoY {
        public final /* synthetic */ C53964wvS AEQbTJ;
        public final /* synthetic */ BizInstrument KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(BizInstrument bizInstrument, C53964wvS c53964wvS, java.lang.String str, java.lang.String str2) {
            super(null, str2, str);
            this.KWHzl = bizInstrument;
            this.AEQbTJ = c53964wvS;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<OptSummaryData> list, java.lang.String str) {
            java.lang.Object obj;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            BizInstrument bizInstrument = this.KWHzl;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd(((OptSummaryData) next).getInstId(), bizInstrument != null ? bizInstrument.getInstId() : null)) {
                    obj = next;
                    break;
                }
            }
            OptSummaryData optSummaryData = (OptSummaryData) obj;
            if (optSummaryData != null) {
                this.AEQbTJ.OLrzqt().setValue(optSummaryData);
            }
        }
    }

    public final java.lang.Object copydefault(BizInstrument bizInstrument) {
        return new StateListAnimator(bizInstrument, this, bizInstrument != null ? bizInstrument.getInstId() : null, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.wvS$LoaderManager */
    public static final class LoaderManager extends AbstractC55681xoY {
        public final /* synthetic */ BizInstrument EZpvd;
        public final /* synthetic */ C53964wvS OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(BizInstrument bizInstrument, C53964wvS c53964wvS, java.lang.String str, java.lang.String str2) {
            super(null, str2, str);
            this.EZpvd = bizInstrument;
            this.OLrzqt = c53964wvS;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* bridge */ /* synthetic */ void EZpvd(java.util.List<? extends OptSummaryData> list, java.lang.String str) {
            EZpvd2((java.util.List<OptSummaryData>) list, str);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(java.util.List<OptSummaryData> list, java.lang.String str) {
            java.lang.Object obj;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            BizInstrument bizInstrument = this.EZpvd;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd(((OptSummaryData) next).getInstId(), bizInstrument != null ? bizInstrument.getInstId() : null)) {
                    obj = next;
                    break;
                }
            }
            OptSummaryData optSummaryData = (OptSummaryData) obj;
            if (optSummaryData != null) {
                this.OLrzqt.gEmmrt().setValue(optSummaryData);
            }
        }
    }

    public final java.lang.Object AYXKKw(BizInstrument bizInstrument) {
        return new LoaderManager(bizInstrument, this, bizInstrument != null ? bizInstrument.getInstId() : null, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    public final void KWHzl(BizInstrument bizInstrument) {
        java.lang.String instId;
        java.lang.String instType;
        xBW xbw = this.AEQbTJ;
        java.lang.String str = "";
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        if (bizInstrument != null && (instType = bizInstrument.getInstType()) != null) {
            str = instType;
        }
        xbw.copydefault(instId, str);
        xbw.KWHzl(new Function1() { // from class: o.wvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53964wvS.KWHzl((ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbw, 0L, 1, null);
    }

    public static final Unit KWHzl(ResponseData responseData) {
        OfflinePlan offlinePlan;
        Intrinsics.checkNotNullParameter(responseData, "");
        MutableLiveData<OfflinePlan> mutableLiveDataKWHzl = C54786xVg.copydefault.KWHzl();
        java.util.List list = (java.util.List) responseData.getData();
        if (list == null || (offlinePlan = (OfflinePlan) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            offlinePlan = new OfflinePlan((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
        }
        mutableLiveDataKWHzl.setValue(offlinePlan);
        return Unit.INSTANCE;
    }

    public final void djBIcL(BizInstrument bizInstrument) {
        java.lang.String instId;
        java.lang.String instType;
        xBW xbw = this.getNewProxyInstance;
        java.lang.String str = "";
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        if (bizInstrument != null && (instType = bizInstrument.getInstType()) != null) {
            str = instType;
        }
        xbw.copydefault(instId, str);
        xbw.KWHzl(new Function1() { // from class: o.wvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53964wvS.AEQbTJ((ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbw, 0L, 1, null);
    }

    public static final Unit AEQbTJ(ResponseData responseData) {
        OfflinePlan offlinePlan;
        Intrinsics.checkNotNullParameter(responseData, "");
        MutableLiveData<OfflinePlan> mutableLiveDataKWHzl = C54786xVg.copydefault.KWHzl();
        java.util.List list = (java.util.List) responseData.getData();
        if (list == null || (offlinePlan = (OfflinePlan) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
            offlinePlan = new OfflinePlan((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
        }
        mutableLiveDataKWHzl.setValue(offlinePlan);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES");
    }

    /* JADX INFO: renamed from: o.wvS$ActionBar */
    public static final class ActionBar extends AbstractC55663xoG {
        public final /* synthetic */ BizInstrument AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ C53964wvS KWHzl;
        public final /* synthetic */ int OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(java.lang.String str, BizInstrument bizInstrument, C53964wvS c53964wvS, int i, java.lang.String str2, java.lang.String str3) {
            super(str2, str, str3);
            this.EZpvd = str;
            this.AEQbTJ = bizInstrument;
            this.KWHzl = c53964wvS;
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(BizDepthData bizDepthData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(bizDepthData, "");
            Intrinsics.checkNotNullParameter(str, "");
            BizInstrument bizInstrument = this.AEQbTJ;
            if (bizInstrument != null) {
                this.KWHzl.EZpvd().setValue(new C54079wxb(bizInstrument, this.EZpvd, this.OLrzqt).KWHzl(bizDepthData));
            }
        }
    }

    public static /* synthetic */ java.lang.Object createLeftDepthList$default(C53964wvS c53964wvS, BizInstrument bizInstrument, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return c53964wvS.copydefault(bizInstrument, str, i);
    }

    public final java.lang.Object copydefault(BizInstrument bizInstrument, java.lang.String str, int i) {
        java.lang.String instId;
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        return new ActionBar(str, bizInstrument, this, i, instId, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }

    /* JADX INFO: renamed from: o.wvS$Activity */
    public static final class Activity extends AbstractC55663xoG {
        public final /* synthetic */ BizInstrument AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ C53964wvS OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(java.lang.String str, BizInstrument bizInstrument, C53964wvS c53964wvS, int i, java.lang.String str2, java.lang.String str3) {
            super(str2, str, str3);
            this.EZpvd = str;
            this.AEQbTJ = bizInstrument;
            this.OLrzqt = c53964wvS;
            this.KWHzl = i;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(BizDepthData bizDepthData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(bizDepthData, "");
            Intrinsics.checkNotNullParameter(str, "");
            BizInstrument bizInstrument = this.AEQbTJ;
            if (bizInstrument != null) {
                this.OLrzqt.AhwBna().setValue(new C54079wxb(bizInstrument, this.EZpvd, this.KWHzl).KWHzl(bizDepthData));
            }
        }
    }

    public static /* synthetic */ java.lang.Object createRightDepthList$default(C53964wvS c53964wvS, BizInstrument bizInstrument, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 3;
        }
        return c53964wvS.KWHzl(bizInstrument, str, i);
    }

    public final java.lang.Object KWHzl(BizInstrument bizInstrument, java.lang.String str, int i) {
        java.lang.String instId;
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        return new Activity(str, bizInstrument, this, i, instId, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
    }
}
