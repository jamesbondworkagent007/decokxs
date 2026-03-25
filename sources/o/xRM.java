package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.market.common.MarketHttpApi;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.trade.model.IndexSourceData;
import com.okinc.unify_trade.trade.source.index.IndexMarketDataSource$getOldIndexTickers$cacheFlow$1$1;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class xRM extends xRH {
    public final MutableLiveData<SourceResp<xRH>> AkhnZx;
    public InterfaceC58217yxC ejfBZ;
    public java.lang.String fIwbmz;
    public InterfaceC58217yxC fetchVPNInfo;
    public final java.lang.String isConnected;
    public java.lang.String values;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;
    public static boolean DbNXlk = true;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xRM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xRM(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MutableLiveData<SourceResp<xRH>> mutableLiveData) {
        super(str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.fIwbmz = str;
        this.isConnected = str2;
        this.AkhnZx = mutableLiveData;
        this.values = "7";
    }

    public static final class StateListAnimator implements InterfaceC55701xos<java.util.List<? extends IndexTickersData>> {
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.Exception, Unit> AEQbTJ;
        public final /* synthetic */ xRM OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, xRM xrm) {
            this.AEQbTJ = function2;
            this.OLrzqt = xrm;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<IndexTickersData> list, java.lang.Exception exc) {
            if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                pUU.KWHzl("IndexMarketDataSource", "getNewIndexTickers success");
                this.AEQbTJ.invoke(java.lang.Boolean.TRUE, null);
                this.OLrzqt.KWHzl(C41428qqd.OLrzqt.AEQbTJ(list));
                this.OLrzqt.isConnected();
                this.OLrzqt.DbNXlk();
                return;
            }
            this.AEQbTJ.invoke(java.lang.Boolean.FALSE, exc);
        }
    }

    public final void OLrzqt(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        StateListAnimator stateListAnimator = new StateListAnimator(function2, this);
        pUU.KWHzl("MarketCache", "isFirstCreate = " + DbNXlk);
        this.fetchVPNInfo = KWHzl(this.fIwbmz, this.isConnected, null, this.values, stateListAnimator);
        DbNXlk = false;
    }

    public final void isConnected() {
        copydefault(KWHzl());
        if (Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) "USD")) {
            return;
        }
        copydefault();
    }

    public final void KWHzl(java.util.List<IndexTickersData> list) {
        java.lang.String strMulS$default;
        OLrzqt().clear();
        java.lang.Integer numValueOf = list != null ? java.lang.Integer.valueOf(list.size()) : null;
        Intrinsics.copydefault(numValueOf);
        if (numValueOf.intValue() >= 7) {
            list = list.subList(0, 7);
        }
        for (IndexTickersData indexTickersData : list) {
            java.util.ArrayList<IndexSourceData> arrayListOLrzqt = OLrzqt();
            java.lang.String instId = indexTickersData.getInstId();
            java.lang.String idxPx = indexTickersData.getIdxPx();
            kotlin.Pair pairCalApplies$default = C55692xoj.calApplies$default(C55692xoj.KWHzl, indexTickersData.getIdxPx(), indexTickersData.getOpen24h(), indexTickersData.getSodUtc0(), indexTickersData.getSodUtc8(), false, 16, null);
            if (Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) "USD")) {
                strMulS$default = indexTickersData.getIdxPx();
            } else if (AEQbTJ() != null) {
                java.lang.String idxPx2 = indexTickersData.getIdxPx();
                TickersData tickersDataAEQbTJ = AEQbTJ();
                strMulS$default = C33129mqd.mulS$default(idxPx2, tickersDataAEQbTJ != null ? tickersDataAEQbTJ.getLast() : null, null, null, null, 14, null);
            } else {
                strMulS$default = "";
            }
            arrayListOLrzqt.add(new IndexSourceData(instId, idxPx, pairCalApplies$default, strMulS$default));
            valueOf().put(indexTickersData.getInstId(), indexTickersData);
        }
    }

    public final void DbNXlk() {
        InterfaceC58217yxC interfaceC58217yxC = this.ejfBZ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 2000L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xRM.KWHzl(this.EZpvd, (java.lang.Long) obj);
            }
        };
        this.ejfBZ = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xRM.EZpvd(function1, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(xRM xrm, java.lang.Long l) {
        if (xrm.AkhnZx.hasActiveObservers()) {
            xrm.djBIcL();
        } else {
            xrm.gEmmrt();
        }
        return Unit.INSTANCE;
    }

    @Override // o.xRH
    public void gEmmrt() {
        super.gEmmrt();
        InterfaceC58217yxC interfaceC58217yxC = this.ejfBZ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fetchVPNInfo;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final InterfaceC58217yxC KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final InterfaceC55701xos<java.util.List<IndexTickersData>> interfaceC55701xos) {
        final boolean z = DbNXlk;
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.xRK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return xRM.copydefault(z);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.xRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xRM.AEQbTJ(z, str, str2, str3, str4, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.xRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xRM.OLrzqt(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return C33024moe.subscribeOnIO$default(abstractC58185ywXKWHzl, new Function1() { // from class: o.xRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xRM.OLrzqt(interfaceC55701xos, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.xRS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xRM.OLrzqt(interfaceC55701xos, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(boolean z) throws java.lang.InterruptedException {
        if (z && C8086awB.AEQbTJ.EZpvd() != null) {
            BuildersKt__BuildersKt.runBlocking$default(null, new IndexMarketDataSource$getOldIndexTickers$cacheFlow$1$1(null), 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl("MarketCache", "getOldIndexTickers start request data cacheStrategy " + z);
        return MarketHttpApi.ActionBar.getIndexTickersOld$default((MarketHttpApi) C43393roT.httpService$default(C56524yIo.AEQbTJ(MarketHttpApi.class), null, 1, null), str, str2, str3, str4, z ? "FIRST_CACHE" : "NO_CACHE", 0, 32, null);
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC55701xos.EZpvd(false, null, new BizSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC55701xos interfaceC55701xos, ResponseData responseData) {
        interfaceC55701xos.EZpvd(responseData.getCode() == 0 && responseData.getData() != null, responseData.getData(), (responseData.getCode() != 0 || responseData.getData() == null) ? new BizApiException(responseData.getMsg(), null, null, null, null, 30, null) : null);
        return Unit.INSTANCE;
    }
}
