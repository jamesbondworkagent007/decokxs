package o;

import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.fiat.api.bean.OtcCoinList;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.KlineCoinInfo;
import com.okinc.kline.data.QuotePriceBean;
import com.okinc.kline.ui.viewmodel.TokenInfoViewModel$getQuickBuyInfo$1;
import com.okinc.kline.ui.viewmodel.TokenInfoViewModel$postOptionData$1;
import com.okinc.market.common.biz_spot.bean.TokenInfoOriginData;
import com.okinc.market.common.biz_spot.bean.TokenTradeInfoData;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BaseInstrument;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.trade.source.search.OkBizSearchInfo;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.InterfaceC43294rma;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37858pDh extends AndroidViewModel {
    public final InterfaceC56387yDm AYXKKw;
    public volatile java.lang.String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public volatile TokenTradeInfoData DbNXlk;
    public volatile java.lang.String EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final android.app.Application copydefault;
    public volatile java.lang.String djBIcL;
    public volatile boolean ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final java.lang.String fIwbmz;
    public final InterfaceC47278tmy fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.pDh$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void zLjUOn() {
        this.ejfBZ = false;
        this.EZpvd = "";
        this.DbNXlk = null;
        this.djBIcL = "";
        this.AhwBna = "--";
    }

    /* JADX INFO: renamed from: o.pDh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pDh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37858pDh(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = application;
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.pDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.AuCTel();
            }
        });
        this.fJNWhG = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB();
        this.fIwbmz = "USDT";
        this.EZpvd = "";
        this.djBIcL = "";
        this.AhwBna = "--";
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pDr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.gEmmrt();
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.pDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.DbNXlk();
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.pDo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.fIwbmz();
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.pDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.AkhnZx();
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.pDp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.isConnected();
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.pDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.fARcdN();
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.pDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.fetchVPNInfo();
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.pDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37858pDh.values();
            }
        });
    }

    public final InterfaceC55707xoy AuCTelauCTel() {
        return (InterfaceC55707xoy) this.AuCTel.getValue();
    }

    public static final C56090xwJ AuCTel() {
        return new C56090xwJ();
    }

    public final MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> ejfBZ() {
        return (MutableLiveData) this.KWHzl.getValue();
    }

    public static final MutableLiveData gEmmrt() {
        return new MutableLiveData();
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class)).copydefault(this.copydefault, str, function1);
    }

    /* JADX INFO: renamed from: o.pDh$Activity */
    public static final class Activity implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            OLrzqt(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(boolean z) {
            if (this.AEQbTJ.isActive()) {
                CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.AEQbTJ;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(z)));
            }
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> mutableLiveDataEjfBZ = ejfBZ();
        if (str2 == null) {
            str2 = str + "_usdt";
        }
        mutableLiveDataEjfBZ.setValue(C56390yDp.OLrzqt(str, str2));
    }

    public final MutableLiveData<KlineCoinInfo> fJNWhG() {
        return (MutableLiveData) this.OLrzqt.getValue();
    }

    public static final MutableLiveData DbNXlk() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<C39519ptq>> AubY() {
        return (MutableLiveData) this.fARcdN.getValue();
    }

    public static final MutableLiveData fIwbmz() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<C48916ueh>> hDKMBd() {
        return (MutableLiveData) this.fetchVPNInfo.getValue();
    }

    public static final MutableLiveData AkhnZx() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<C39519ptq>> iwGUEr() {
        return (MutableLiveData) this.isConnected.getValue();
    }

    public static final MutableLiveData isConnected() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<C39519ptq>> uzCIH() {
        return (MutableLiveData) this.AkhnZx.getValue();
    }

    public static final MutableLiveData fARcdN() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<C39519ptq>> getFieldNames() {
        return (MutableLiveData) this.AYXKKw.getValue();
    }

    public static final MutableLiveData fetchVPNInfo() {
        return new MutableLiveData();
    }

    public final boolean EZpvd(boolean z) {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        return z && !this.fJNWhG.DbNXlk() && ((interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd());
    }

    public final void KWHzl(@NotNull final LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        zLjUOn();
        Transformations.switchMap(ejfBZ(), new Function1() { // from class: o.pDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37858pDh.EZpvd(this.copydefault, (kotlin.Pair) obj);
            }
        }).observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.pDi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37858pDh.AEQbTJ(this.AEQbTJ, lifecycleOwner, (TokenTradeInfoData) obj);
            }
        }));
        AuCTelauCTel().OLrzqt().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.pDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37858pDh.copydefault(this.OLrzqt, lifecycleOwner, (java.util.List) obj);
            }
        }));
    }

    public static final LiveData EZpvd(C37858pDh c37858pDh, kotlin.Pair pair) {
        java.lang.String str;
        if (pair == null || (str = (java.lang.String) pair.getFirst()) == null) {
            return null;
        }
        c37858pDh.EZpvd = str;
        return oLF.EZpvd.AEQbTJ(str, qTC.copydefault.AEQbTJ());
    }

    public static final Unit AEQbTJ(C37858pDh c37858pDh, LifecycleOwner lifecycleOwner, TokenTradeInfoData tokenTradeInfoData) {
        c37858pDh.DbNXlk = tokenTradeInfoData;
        c37858pDh.copydefault(lifecycleOwner);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C37858pDh c37858pDh, LifecycleOwner lifecycleOwner, java.util.List list) {
        c37858pDh.ejfBZ = true;
        c37858pDh.copydefault(lifecycleOwner);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull LifecycleOwner lifecycleOwner) {
        java.util.List<TokenInfoOriginData> listAhwBna;
        java.util.List<TokenInfoOriginData> listAhwBna2;
        java.util.List<TokenInfoOriginData> listAhwBna3;
        java.util.List<TokenInfoOriginData> listAhwBna4;
        java.util.List<TokenInfoOriginData> listAhwBna5;
        java.util.List<TokenInfoOriginData> listAhwBna6;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            if (this.ejfBZ && this.EZpvd.length() > 0 && this.DbNXlk != null) {
                java.lang.String str = this.EZpvd;
                TokenTradeInfoData tokenTradeInfoData = this.DbNXlk;
                if (tokenTradeInfoData == null || (listAhwBna = tokenTradeInfoData.getSpot()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                TokenTradeInfoData tokenTradeInfoData2 = this.DbNXlk;
                if (tokenTradeInfoData2 == null || (listAhwBna2 = tokenTradeInfoData2.getMargin()) == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                KWHzl(str, listAhwBna, listAhwBna2);
                java.lang.String str2 = this.EZpvd;
                TokenTradeInfoData tokenTradeInfoData3 = this.DbNXlk;
                if (tokenTradeInfoData3 == null || (listAhwBna3 = tokenTradeInfoData3.getOption()) == null) {
                    listAhwBna3 = yDY.AhwBna();
                }
                OLrzqt(str2, listAhwBna3, lifecycleOwner);
                java.lang.String str3 = this.EZpvd;
                TokenTradeInfoData tokenTradeInfoData4 = this.DbNXlk;
                if (tokenTradeInfoData4 == null || (listAhwBna4 = tokenTradeInfoData4.getMargin()) == null) {
                    listAhwBna4 = yDY.AhwBna();
                }
                EZpvd(str3, listAhwBna4);
                java.lang.String str4 = this.EZpvd;
                TokenTradeInfoData tokenTradeInfoData5 = this.DbNXlk;
                if (tokenTradeInfoData5 == null || (listAhwBna5 = tokenTradeInfoData5.getSwap()) == null) {
                    listAhwBna5 = yDY.AhwBna();
                }
                AEQbTJ(str4, listAhwBna5);
                java.lang.String str5 = this.EZpvd;
                TokenTradeInfoData tokenTradeInfoData6 = this.DbNXlk;
                if (tokenTradeInfoData6 == null || (listAhwBna6 = tokenTradeInfoData6.getFutures()) == null) {
                    listAhwBna6 = yDY.AhwBna();
                }
                KWHzl(str5, listAhwBna6);
            }
        }
    }

    public final void KWHzl(java.lang.String str, java.util.List<TokenInfoOriginData> list, java.util.List<TokenInfoOriginData> list2) {
        MutableLiveData<java.util.List<C39519ptq>> mutableLiveDataAubY = AubY();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TokenInfoOriginData tokenInfoOriginData : list) {
            java.lang.Object objAEQbTJ = null;
            if (tokenInfoOriginData != null) {
                java.util.Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    TokenInfoOriginData tokenInfoOriginData2 = (TokenInfoOriginData) next;
                    if (Intrinsics.EZpvd((java.lang.Object) (tokenInfoOriginData2 != null ? tokenInfoOriginData2.getInstId() : null), (java.lang.Object) tokenInfoOriginData.getInstId())) {
                        objAEQbTJ = next;
                        break;
                    }
                }
                objAEQbTJ = AEQbTJ(str, tokenInfoOriginData, "SPOT", (TokenInfoOriginData) objAEQbTJ);
            }
            arrayList.add(objAEQbTJ);
        }
        mutableLiveDataAubY.postValue(arrayList);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oLF.getIndexTickers$default(o.oLF, java.lang.String, java.lang.String, int, java.lang.Object):androidx.lifecycle.LiveData */
    public final void OLrzqt(final java.lang.String str, java.util.List<TokenInfoOriginData> list, LifecycleOwner lifecycleOwner) {
        java.lang.String strKWHzl;
        java.lang.String instId;
        if (list.isEmpty() || !C55687xoe.AEQbTJ.AEQbTJ()) {
            hDKMBd().postValue(yDY.AhwBna());
            return;
        }
        fJNWhG().observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.pDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37858pDh.KWHzl(this.OLrzqt, str, (KlineCoinInfo) obj);
            }
        }));
        oLF olf = oLF.EZpvd;
        TokenInfoOriginData tokenInfoOriginData = (TokenInfoOriginData) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tokenInfoOriginData == null || (instId = tokenInfoOriginData.getInstId()) == null || (strKWHzl = xVE.copydefault.KWHzl(instId)) == null) {
            strKWHzl = str + "-USD";
        }
        oLF.getIndexTickers$default(olf, strKWHzl, null, 2, null).observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.pDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37858pDh.AEQbTJ(this.EZpvd, str, (IndexTickersData) obj);
            }
        }));
    }

    public static final Unit KWHzl(C37858pDh c37858pDh, java.lang.String str, KlineCoinInfo klineCoinInfo) {
        java.lang.String icon;
        if (klineCoinInfo == null || (icon = klineCoinInfo.getIcon()) == null) {
            icon = "";
        }
        c37858pDh.djBIcL = icon;
        c37858pDh.EZpvd(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C37858pDh c37858pDh, java.lang.String str, IndexTickersData indexTickersData) {
        java.lang.String str2;
        java.lang.String idxPx;
        BigDecimal bigDecimalEZpvd;
        java.lang.String roundToFixed$default;
        if (indexTickersData == null || (idxPx = indexTickersData.getIdxPx()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(idxPx)) == null || (roundToFixed$default = pTB.formatRoundToFixed$default(bigDecimalEZpvd, 2, null, 2, null)) == null) {
            str2 = "--";
        } else {
            str2 = "$" + roundToFixed$default;
            if (str2 == null) {
            }
        }
        c37858pDh.AhwBna = str2;
        c37858pDh.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        synchronized (this) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TokenInfoViewModel$postOptionData$1(this, str, null), 3, null);
        }
    }

    public final void EZpvd(java.lang.String str, java.util.List<TokenInfoOriginData> list) {
        MutableLiveData<java.util.List<C39519ptq>> mutableLiveDataIwGUEr = iwGUEr();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TokenInfoOriginData tokenInfoOriginData : list) {
            arrayList.add(tokenInfoOriginData != null ? buildBusinessData$default(this, str, tokenInfoOriginData, "MARGIN", null, 8, null) : null);
        }
        mutableLiveDataIwGUEr.postValue(arrayList);
    }

    public final void AEQbTJ(java.lang.String str, java.util.List<TokenInfoOriginData> list) {
        MutableLiveData<java.util.List<C39519ptq>> mutableLiveDataUzCIH = uzCIH();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TokenInfoOriginData tokenInfoOriginData : list) {
            arrayList.add(tokenInfoOriginData != null ? buildBusinessData$default(this, str, tokenInfoOriginData, "SWAP", null, 8, null) : null);
        }
        mutableLiveDataUzCIH.postValue(arrayList);
    }

    public final void KWHzl(java.lang.String str, java.util.List<TokenInfoOriginData> list) {
        MutableLiveData<java.util.List<C39519ptq>> fieldNames = getFieldNames();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TokenInfoOriginData tokenInfoOriginData : list) {
            arrayList.add(tokenInfoOriginData != null ? buildBusinessData$default(this, str, tokenInfoOriginData, "FUTURES", null, 8, null) : null);
        }
        fieldNames.postValue(arrayList);
    }

    public final LiveData<java.lang.Boolean> copydefault(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return AuCTelauCTel().copydefault(AEQbTJ(bizInstrument));
    }

    public final LiveData<java.lang.Boolean> OLrzqt(@NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return AuCTelauCTel().EZpvd(AEQbTJ(bizInstrument));
    }

    public final WatchListBean AEQbTJ(BizInstrument bizInstrument) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String instId;
        java.lang.String alias = bizInstrument instanceof FutureInstrument ? ((FutureInstrument) bizInstrument).getAlias() : "";
        java.lang.String expTime = bizInstrument instanceof OptionInstrument ? ((OptionInstrument) bizInstrument).getExpTime() : "";
        try {
            Result.Application application = Result.Companion;
            if (bizInstrument instanceof FutureInstrument) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) bizInstrument.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                instId = listSplit$default.get(0) + "-" + listSplit$default.get(1);
            } else {
                instId = bizInstrument.getInstId();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(instId);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.String instId2 = bizInstrument.getInstId();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = instId2;
        }
        return new WatchListBean(alias, expTime, (java.lang.String) objM7377constructorimpl, bizInstrument.getInstType(), "", "", "", "");
    }

    public static /* synthetic */ C39519ptq buildBusinessData$default(C37858pDh c37858pDh, java.lang.String str, TokenInfoOriginData tokenInfoOriginData, java.lang.String str2, TokenInfoOriginData tokenInfoOriginData2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            tokenInfoOriginData2 = null;
        }
        return c37858pDh.AEQbTJ(str, tokenInfoOriginData, str2, tokenInfoOriginData2);
    }

    public final C39519ptq AEQbTJ(java.lang.String str, TokenInfoOriginData tokenInfoOriginData, java.lang.String str2, TokenInfoOriginData tokenInfoOriginData2) {
        TokenInfoOriginData tokenInfoOriginData3 = (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") || tokenInfoOriginData2 == null) ? tokenInfoOriginData : tokenInfoOriginData2;
        java.lang.String biz = tokenInfoOriginData.getBiz();
        java.lang.String instId = tokenInfoOriginData.getInstId();
        java.lang.String aliasName = tokenInfoOriginData.getAliasName();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = aliasName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "this_quarter")) {
            lowerCase = "quarter";
        }
        java.lang.String str3 = lowerCase;
        java.lang.String maxLeverage = tokenInfoOriginData3.getMaxLeverage();
        BizInstrument bizInstrumentKWHzl = KWHzl(str, biz, instId, str3, java.lang.Integer.parseInt(maxLeverage) > 1 ? maxLeverage : "", tokenInfoOriginData.getContractType());
        kotlin.Pair<java.lang.Double, java.lang.String> pairOLrzqt = C37925pFu.KWHzl.OLrzqt(tokenInfoOriginData.getLast(), tokenInfoOriginData.getOpen(), tokenInfoOriginData.getOpenUtc0(), tokenInfoOriginData.getOpenUtc8());
        return new C39519ptq(new OkBizSearchInfo(pairOLrzqt.getSecond(), pairOLrzqt.getFirst(), copydefault(tokenInfoOriginData.getLast(), tokenInfoOriginData.getDecimalPlace()), AuCTelauCTel().OLrzqt(AEQbTJ(bizInstrumentKWHzl)), bizInstrumentKWHzl), str2);
    }

    public static /* synthetic */ BizInstrument buildInstrument$default(C37858pDh c37858pDh, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = "1";
        }
        return c37858pDh.KWHzl(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [461=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final BizInstrument KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        switch (str2.hashCode()) {
            case -2027980370:
                if (str2.equals("MARGIN")) {
                    return new SpotInstrument(new BaseInstrument(str2, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null), str, this.fIwbmz, null, null, str5, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -40, 1, null);
                }
                break;
            case 2552066:
                if (str2.equals("SPOT")) {
                    return new SpotInstrument(new BaseInstrument(str2, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null), str, this.fIwbmz, null, null, str5, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -40, 1, null);
                }
                break;
            case 2558355:
                if (str2.equals("SWAP")) {
                    return new SwapInstrument(new BaseInstrument(str2, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null), xVE.copydefault.KWHzl(str3), null, null, null, null, null, null, false, EZpvd(str6, str3), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483132, null);
                }
                break;
            case 214415088:
                if (str2.equals("FUTURES")) {
                    return new FutureInstrument(new BaseInstrument(str2, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, false, EZpvd(str6, str3), str4, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -6146, 7, null);
                }
                break;
        }
        return new SpotInstrument(new BaseInstrument(str2, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null), str, this.fIwbmz, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, 1, null);
    }

    public final C54536xML getNewProxyInstance() {
        return (C54536xML) this.gEmmrt.getValue();
    }

    public static final C54536xML values() {
        return new C54536xML();
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return C54536xML.toSafeString$default(C54536xML.setNumber$default(getNewProxyInstance(), str, str2, null, null, 12, null).KWHzl("2", "12").djBIcL(), false, 1, null);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") ? "linear" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2") ? "inverse" : xVE.copydefault.copydefault(str2);
    }

    public final void EZpvd(android.app.Activity activity) {
        java.lang.String strAEQbTJ = qTC.copydefault.AEQbTJ();
        kotlin.Pair<java.lang.String, java.lang.String> value = ejfBZ().getValue();
        java.lang.String str = (value != null ? value.getFirst() : null) + "-" + strAEQbTJ;
        if (activity != null) {
            MarketCoinInfo marketCoinInfo = new MarketCoinInfo(str, "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
            oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
            if (oka != null) {
                oKA.TaskDescription.gotoNewKlinePage$default(oka, activity, marketCoinInfo, null, null, "Token", null, null, null, "Token_Info", null, null, 1772, null);
            }
        }
    }

    public final void KWHzl(android.app.Activity activity) {
        java.lang.String strAEQbTJ = qTC.copydefault.AEQbTJ();
        kotlin.Pair<java.lang.String, java.lang.String> value = ejfBZ().getValue();
        java.lang.String str = "trade/main/page?bizType=0&instId=" + (value != null ? value.getFirst() : null) + "-" + strAEQbTJ + "&from=Token_Info";
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, str, null, new Function1() { // from class: o.pDm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37858pDh.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<java.lang.String, QuotePriceBean>> continuation) throws java.lang.Throwable {
        TokenInfoViewModel$getQuickBuyInfo$1 tokenInfoViewModel$getQuickBuyInfo$1;
        java.lang.String str2;
        java.lang.String str3;
        ResponseData responseData;
        java.util.ArrayList arrayList;
        if (continuation instanceof TokenInfoViewModel$getQuickBuyInfo$1) {
            tokenInfoViewModel$getQuickBuyInfo$1 = (TokenInfoViewModel$getQuickBuyInfo$1) continuation;
            int i = tokenInfoViewModel$getQuickBuyInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tokenInfoViewModel$getQuickBuyInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                tokenInfoViewModel$getQuickBuyInfo$1 = new TokenInfoViewModel$getQuickBuyInfo$1(this, continuation);
            }
        }
        TokenInfoViewModel$getQuickBuyInfo$1 tokenInfoViewModel$getQuickBuyInfo$12 = tokenInfoViewModel$getQuickBuyInfo$1;
        java.lang.Object obj = tokenInfoViewModel$getQuickBuyInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tokenInfoViewModel$getQuickBuyInfo$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            tokenInfoViewModel$getQuickBuyInfo$12.L$0 = str;
            tokenInfoViewModel$getQuickBuyInfo$12.label = 1;
            java.lang.Object objKWHzl = KWHzl(tokenInfoViewModel$getQuickBuyInfo$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            str2 = str;
            obj = objKWHzl;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (java.lang.String) tokenInfoViewModel$getQuickBuyInfo$12.L$0;
                C56391yDq.AEQbTJ(obj);
                responseData = (ResponseData) obj;
                if (responseData.getCode() != 0 && responseData.getData() != null && responseData.getData() != null && (arrayList = (java.util.ArrayList) responseData.getData()) != null && (!arrayList.isEmpty())) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) responseData.getData();
                    return C56390yDp.OLrzqt(str3, arrayList2 != null ? (QuotePriceBean) arrayList2.get(0) : null);
                }
                throw new java.lang.IllegalStateException(responseData.getErrorMsg());
            }
            java.lang.String str4 = (java.lang.String) tokenInfoViewModel$getQuickBuyInfo$12.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str4;
        }
        java.lang.String str5 = (java.lang.String) obj;
        KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null);
        tokenInfoViewModel$getQuickBuyInfo$12.L$0 = str5;
        tokenInfoViewModel$getQuickBuyInfo$12.label = 2;
        java.lang.Object quotedPrice$default = KlineBizMarketService.StateListAnimator.getQuotedPrice$default(klineBizMarketService, str2, str5, "buy", "0", 1, null, tokenInfoViewModel$getQuickBuyInfo$12, 32, null);
        if (quotedPrice$default == objCopydefault) {
            return objCopydefault;
        }
        str3 = str5;
        obj = quotedPrice$default;
        responseData = (ResponseData) obj;
        if (responseData.getCode() != 0) {
        }
        throw new java.lang.IllegalStateException(responseData.getErrorMsg());
    }

    /* JADX INFO: renamed from: o.pDh$Application */
    public static final class Application implements Function1<OtcCoinList, Unit> {
        public final /* synthetic */ CancellableContinuation<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super java.lang.String> cancellableContinuation) {
            this.copydefault = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(OtcCoinList otcCoinList) {
            EZpvd(otcCoinList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(OtcCoinList otcCoinList) {
            Intrinsics.checkNotNullParameter(otcCoinList, "");
            if (this.copydefault.isActive()) {
                CancellableContinuation<java.lang.String> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(otcCoinList.getQuoteCurrency()));
            }
        }
    }

    /* JADX INFO: renamed from: o.pDh$StateListAnimator */
    public static final class StateListAnimator implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ CancellableContinuation<java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super java.lang.String> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            EZpvd(str);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.OLrzqt.isActive()) {
                CancellableContinuation<java.lang.String> cancellableContinuation = this.OLrzqt;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException(str))));
            }
        }
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        KWHzl(str, new Activity(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public final java.lang.Object KWHzl(Continuation<? super java.lang.String> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Application application = new Application(cancellableContinuationImpl);
        StateListAnimator stateListAnimator = new StateListAnimator(cancellableContinuationImpl);
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.OLrzqt(InterfaceC47251tmX.class);
        if (interfaceC47251tmX != null) {
            interfaceC47251tmX.AEQbTJ(true, (Function1<? super OtcCoinList, Unit>) application, (Function1<? super java.lang.String, Unit>) stateListAnimator);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
