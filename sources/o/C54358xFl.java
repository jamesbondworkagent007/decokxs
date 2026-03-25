package o;

import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.core.basic.config.MaxAvailableRequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xFl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54358xFl implements xDM {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public InterfaceC58217yxC AEQbTJ;
    public InterfaceC58217yxC AYXKKw;
    public boolean AhwBna;
    public InterfaceC58217yxC AkhnZx;
    public MaxAvailableRequestParams DbNXlk;
    public MaxAvailableRequestParams EZpvd;
    public MaxAvailableResp KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public java.lang.String djBIcL;
    public final C56083xwC fetchVPNInfo;
    public java.lang.String gEmmrt;
    public final AbstractC55740xpe valueOf;
    public boolean values;

    /* JADX INFO: renamed from: o.xFl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xFl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public C54358xFl(@NotNull AbstractC55740xpe abstractC55740xpe) {
        Intrinsics.checkNotNullParameter(abstractC55740xpe, "");
        this.valueOf = abstractC55740xpe;
        this.fetchVPNInfo = new C56083xwC();
        this.djBIcL = "";
        this.gEmmrt = "";
        pUU.KWHzl("TradeBalanceTask", "init");
        abstractC55740xpe.AEQbTJ(null, "http", this);
        OLrzqt();
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("trade_balance_refresh").AEQbTJ(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: o.xFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54358xFl.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        };
        this.AkhnZx = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.xFo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54358xFl.copydefault(function1, obj);
            }
        });
        this.DbNXlk = new MaxAvailableRequestParams(abstractC55740xpe.OLrzqt(), abstractC55740xpe.AEQbTJ(), abstractC55740xpe.djBIcL(), abstractC55740xpe.AhwBna(), abstractC55740xpe.KWHzl(), abstractC55740xpe.AkhnZx(), abstractC55740xpe.fJNWhG(), abstractC55740xpe.values(), abstractC55740xpe.ejfBZ(), abstractC55740xpe.isConnected(), abstractC55740xpe.gEmmrt(), abstractC55740xpe.AuCTel(), abstractC55740xpe.AYXKKw(), abstractC55740xpe.fARcdN(), abstractC55740xpe.fetchVPNInfo(), abstractC55740xpe.copydefault(), abstractC55740xpe.DbNXlk(), abstractC55740xpe.EZpvd(), abstractC55740xpe.valueOf(), abstractC55740xpe.getNewProxyInstance());
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C54358xFl c54358xFl, java.lang.String str) {
        c54358xFl.AhwBna = true;
        loadData$default(c54358xFl, null, null, false, false, "RxBus.listen(TRADE_BALANCE_REFRESH)", 15, null);
        return Unit.INSTANCE;
    }

    @Override // o.xDM
    public void KWHzl() {
        RxBus.KWHzl("trade_balance_refresh");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // o.xDM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(java.lang.String str, boolean z, Function1<? super MaxAvailableResp, Unit> function1) {
        java.lang.String strValueOf;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, this.valueOf.djBIcL(), this.valueOf.AhwBna(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault2.OLrzqt(this.valueOf.djBIcL())) == null) {
            strValueOf = null;
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
            if (xmsGEmmrt != null) {
                strValueOf = xmsGEmmrt.valueOf(str != null ? str : "");
            }
        }
        MaxAvailableRequestParams maxAvailableRequestParams = this.DbNXlk;
        if (str == null) {
            strValueOf = null;
        }
        maxAvailableRequestParams.setOrderPrice(strValueOf);
        if (!z) {
            this.DbNXlk.setSz(null);
        }
        loadData$default(this, null, function1, false, false, "refreshDepthPx", 13, null);
    }

    @Override // o.xDM
    public void OLrzqt(java.lang.String str, boolean z, Function1<? super MaxAvailableResp, Unit> function1) {
        this.DbNXlk.setOrderPrice(str);
        if (!z) {
            this.DbNXlk.setSz(null);
        }
        loadData$default(this, null, function1, false, false, "refreshOrderPrice", 13, null);
    }

    @Override // o.xDM
    public void OLrzqt(java.lang.String str) {
        this.DbNXlk.setTgtCcy(str);
        loadData$default(this, null, null, false, false, "refreshTgtCcy", 15, null);
    }

    @Override // o.xDM
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1<? super MaxAvailableResp, Unit> function1) {
        this.DbNXlk.setSz(str);
        this.DbNXlk.setTgtCcy(str3);
        this.DbNXlk.setOrderPrice(str2);
        this.DbNXlk.setOrdType(str4);
        loadData$default(this, null, function1, false, false, "refreshOrderSizeType", 13, null);
    }

    @Override // o.xDM
    public void EZpvd(java.lang.String str) {
        this.DbNXlk.setCcy(str);
        loadData$default(this, null, null, false, false, "refreshMarginCcy", 15, null);
    }

    @Override // o.xDM
    public void AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.setPosMode(str);
        this.DbNXlk.setSideIsBuy(java.lang.Boolean.valueOf(z));
        loadData$default(this, null, null, false, false, "refreshSideAndPosMode", 15, null);
    }

    @Override // o.xDM
    public void KWHzl(java.lang.Boolean bool) {
        this.DbNXlk.setSideIsBuy(bool);
        loadData$default(this, null, null, false, false, "refreshSide", 15, null);
    }

    @Override // o.xDM
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        loadData$default(this, null, null, false, false, "refreshTdMode", 15, null);
    }

    @Override // o.xDM
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, Function1<? super MaxAvailableResp, Unit> function1) {
        this.DbNXlk.setSz(str);
        this.DbNXlk.setTgtCcy(str3);
        this.DbNXlk.setOrderPrice(str2);
        loadData$default(this, null, function1, false, false, "refreshOrderSize", 13, null);
    }

    @Override // o.xDM
    public void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.DbNXlk.setOrdType(str);
        this.DbNXlk.setOrderPrice(str2);
        this.DbNXlk.setSz(str3);
        loadData$default(this, null, null, false, false, "refreshOrderType", 15, null);
    }

    @Override // o.xDM
    public void EZpvd(java.lang.Boolean bool) {
        this.DbNXlk.setReduceOnly(bool);
        loadData$default(this, null, null, false, false, "refreshReduceState", 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.xFl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadData$default(C54358xFl c54358xFl, Function1 function1, Function1 function12, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        xOW newProxyInstance;
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        if ((i & 4) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            z = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.hDKMBd()) ? false : true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        c54358xFl.AEQbTJ(function1, function12, z, z2, str);
    }

    public final void AEQbTJ(final Function1<? super java.lang.Boolean, Unit> function1, final Function1<? super MaxAvailableResp, Unit> function12, final boolean z, final boolean z2, java.lang.String str) {
        boolean z3;
        pUU.KWHzl("TradeBalanceTask", "loadData fromTag:" + str);
        if (this.DbNXlk.equals(this.EZpvd) && this.KWHzl != null && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) this.gEmmrt) && !(z3 = this.AhwBna)) {
            pUU.KWHzl("TradeBalanceTask", "hit cache maxAvailableRequestParams:" + this.DbNXlk + ", cacheMaxAvailableRequestParams:" + this.EZpvd + ", mCacheTdMode:" + this.gEmmrt + ", forceUpdate:" + z3);
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
            if (function12 != null) {
                function12.invoke(this.KWHzl);
                return;
            }
            return;
        }
        this.EZpvd = (MaxAvailableRequestParams) xVA.EZpvd(this.DbNXlk);
        this.gEmmrt = this.djBIcL;
        this.AhwBna = false;
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.values = true;
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(300L, java.util.concurrent.TimeUnit.MILLISECONDS);
        final Function1 function13 = new Function1() { // from class: o.xFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54358xFl.AEQbTJ(this.AEQbTJ, function1, function12, z, z2, (java.lang.Long) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Long> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54358xFl.AhwBna(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.xFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54358xFl.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        this.AEQbTJ = abstractC58247yxgTimer.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xFv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54358xFl.valueOf(function14, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C54358xFl c54358xFl, Function1 function1, Function1 function12, boolean z, boolean z2, java.lang.Long l) {
        c54358xFl.AEQbTJ(function1, function12, z, z2);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xFl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void excuteLoadData$default(C54358xFl c54358xFl, Function1 function1, Function1 function12, boolean z, boolean z2, int i, java.lang.Object obj) {
        xOW newProxyInstance;
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        if ((i & 4) != 0) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            z = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.hDKMBd()) ? false : true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        c54358xFl.AEQbTJ(function1, function12, z, z2);
    }

    public final void AEQbTJ(Function1<? super java.lang.Boolean, Unit> function1, Function1<? super MaxAvailableResp, Unit> function12, boolean z, boolean z2) {
        pUU.KWHzl("TradeBalanceTask", "excuteLoadData");
        java.lang.String tdMode = C33129mqd.OLrzqt((java.lang.CharSequence) this.djBIcL) ? this.djBIcL : this.DbNXlk.getTdMode();
        java.lang.String instId = this.DbNXlk.getInstId();
        if (instId == null || instId.length() == 0 || tdMode == null || tdMode.length() == 0) {
            this.values = false;
            pUU.KWHzl("TradeBalanceTask", "params is null maxAvailableRequestParams.instId:" + this.DbNXlk.getInstId() + ", tdMode:" + tdMode);
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.AYXKKw = this.fetchVPNInfo.copydefault(this.DbNXlk.getExcludeOrderId(), this.DbNXlk.getExcludeAlgoId(), this.DbNXlk.getInstId(), this.DbNXlk.getCcy(), this.DbNXlk.getOrderPrice(), tdMode, this.DbNXlk.getReduceOnly(), this.DbNXlk.getSideIsBuy(), this.DbNXlk.getPosMode(), this.DbNXlk.getNeedTransfer(), this.DbNXlk.getSz(), this.DbNXlk.getOrdType(), this.DbNXlk.getTgtCcy(), this.DbNXlk.getQuickMgnType(), java.lang.Boolean.valueOf(z), this.DbNXlk.getBuySz(), this.DbNXlk.getSellSz(), this.DbNXlk.getBaseOnPositionDebt(), this.DbNXlk.getNeedQueryAssetAndEarn(), this.DbNXlk.getTradeQuoteCcy(), new Application(z2, function1, function12));
    }

    /* JADX INFO: renamed from: o.xFl$Application */
    public static final class Application implements InterfaceC55701xos<MaxAvailableResp> {
        public final /* synthetic */ Function1<MaxAvailableResp, Unit> AEQbTJ;
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> KWHzl;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.MaxAvailableResp, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(boolean z, Function1<? super java.lang.Boolean, Unit> function1, Function1<? super MaxAvailableResp, Unit> function12) {
            this.copydefault = z;
            this.KWHzl = function1;
            this.AEQbTJ = function12;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, MaxAvailableResp maxAvailableResp, java.lang.Exception exc) {
            boolean z2 = false;
            C54358xFl.this.values = false;
            pUU.KWHzl("TradeBalanceTask", "success data:" + maxAvailableResp);
            C54358xFl.this.KWHzl = maxAvailableResp;
            if (this.copydefault) {
                C54358xFl.this.valueOf.AEQbTJ(maxAvailableResp, "http", C54358xFl.this);
            }
            Function1<java.lang.Boolean, Unit> function1 = this.KWHzl;
            if (function1 != null) {
                if (z && maxAvailableResp != null) {
                    z2 = true;
                }
                function1.invoke(java.lang.Boolean.valueOf(z2));
            }
            Function1<MaxAvailableResp, Unit> function12 = this.AEQbTJ;
            if (function12 != null) {
                function12.invoke(maxAvailableResp);
            }
        }
    }

    public final void OLrzqt() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 600000L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54358xFl.OLrzqt(this.KWHzl, (java.lang.Long) obj);
            }
        };
        this.OLrzqt = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54358xFl.djBIcL(function1, obj);
            }
        });
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C54358xFl c54358xFl, java.lang.Long l) {
        c54358xFl.AhwBna = true;
        loadData$default(c54358xFl, null, null, false, false, "startCheckResultLoop", 15, null);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AYXKKw;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.AkhnZx;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC4 = this.AEQbTJ;
        if (interfaceC58217yxC4 != null) {
            interfaceC58217yxC4.dispose();
        }
    }
}
