package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeapi.bean.RouteData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradecore.mainview.InnerTradeRoute;
import com.okinc.tradingbot.impl.strategy.init.BotTradeInitPresenter$ensureInitialized$1;
import com.okinc.tradingbot.impl.strategy.init.BotTradeInitPresenter$startToLoadBiz$1;
import com.okinc.tradingbot.impl.strategy.init.BotTradeInitPresenter$startToLoadCurrentBiz$1;
import com.okinc.unify_trade.biz.AlgoShareConfigInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.RiskStatus;
import com.okinc.unify_trade.biz.SupportedPairsItem;
import com.okinc.unify_trade.bot.data.BizSimpleInfo;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.InterfaceC54577xNn;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52478wMx extends AbstractC49495upd {
    public C49500upi DbNXlk;
    public InterfaceC58217yxC isConnected;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;
    public final C56126xwt<kotlin.Pair<java.lang.Boolean, ParamBuilder>> AkhnZx = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56111xwe<java.lang.String> AYXKKw = new C56111xwe<>();
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wMH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52478wMx.AuCTel();
        }
    });
    public C56166xxg gEmmrt = new C56166xxg();
    public final C54255xBq fetchVPNInfo = new C54255xBq(false, false, 3, null);
    public final xAD djBIcL = new xAD();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> AkhnZx() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<kotlin.Pair<java.lang.Boolean, ParamBuilder>> fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX INFO: renamed from: o.wMx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wMx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xLY AuCTel() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    private final xLY ejfBZ() {
        return (xLY) this.valueOf.getValue();
    }

    private final InterfaceC54581xNr fIwbmz() {
        return C54589xNz.EZpvd.OLrzqt();
    }

    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        if (AYXKKw()) {
            this.AYXKKw.postValue("SHOW_INIT");
        }
        java.lang.Object objOLrzqt = OLrzqt((InnerTradeRoute) null, true, new ParamBuilder.ActionBar().EZpvd(false).EZpvd(), continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        this.AYXKKw.postValue("PULL_START");
        java.lang.Object objOLrzqt = OLrzqt((InnerTradeRoute) null, true, new ParamBuilder.ActionBar().EZpvd(false).EZpvd(), continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    @Override // o.AbstractC49495upd
    public java.lang.Object OLrzqt(RouteData routeData, boolean z, ParamBuilder paramBuilder, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        if (AYXKKw()) {
            this.AYXKKw.postValue("SHOW_INIT");
        }
        java.lang.Object objOLrzqt = OLrzqt(new InnerTradeRoute(!Intrinsics.EZpvd((java.lang.Object) (routeData != null ? routeData.getPath() : null), (java.lang.Object) "trade/main/strategy"), routeData != null ? routeData.getStrategyType() : null, routeData != null ? routeData.getInstId() : null, routeData != null ? routeData.getInstType() : null), z, paramBuilder, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(@NotNull ParamBuilder paramBuilder, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        if (AYXKKw()) {
            this.AYXKKw.postValue("SHOW_INIT");
        }
        java.lang.Object objOLrzqt = OLrzqt(new InnerTradeRoute(false, paramBuilder.getStrategyType(), paramBuilder.getInstId(), paramBuilder.getInstType()), false, paramBuilder, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    @Override // o.AbstractC49495upd
    public java.lang.Object AEQbTJ(java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, ParamBuilder paramBuilder, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        if (AYXKKw()) {
            this.AYXKKw.postValue("SHOW_INIT");
        } else {
            this.AYXKKw.postValue("LOADING_START");
        }
        java.lang.Object objOLrzqt = OLrzqt(new InnerTradeRoute(false, str, str2, str3), false, paramBuilder, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(@NotNull ParamBuilder paramBuilder, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objAEQbTJ = AEQbTJ(C56443yFo.KWHzl(paramBuilder.isManual()), paramBuilder.getStrategyType(), paramBuilder.getInstId(), paramBuilder.getInstType(), paramBuilder, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        this.AYXKKw.postValue("LOADING_START");
        java.lang.Object objEnsureInitialized$default = ensureInitialized$default(this, null, true, null, continuation, 4, null);
        return objEnsureInitialized$default == C56442yFn.copydefault() ? objEnsureInitialized$default : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InnerTradeRoute innerTradeRoute, boolean z, ParamBuilder paramBuilder, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BotTradeInitPresenter$ensureInitialized$1 botTradeInitPresenter$ensureInitialized$1;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        C52478wMx c52478wMx;
        java.lang.String strategyType;
        java.lang.String strAYXKKw;
        if (continuation instanceof BotTradeInitPresenter$ensureInitialized$1) {
            botTradeInitPresenter$ensureInitialized$1 = (BotTradeInitPresenter$ensureInitialized$1) continuation;
            int i = botTradeInitPresenter$ensureInitialized$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                botTradeInitPresenter$ensureInitialized$1.label = i - Integer.MIN_VALUE;
            } else {
                botTradeInitPresenter$ensureInitialized$1 = new BotTradeInitPresenter$ensureInitialized$1(this, continuation);
            }
        }
        java.lang.Object obj = botTradeInitPresenter$ensureInitialized$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = botTradeInitPresenter$ensureInitialized$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            botTradeInitPresenter$ensureInitialized$1.L$0 = this;
            botTradeInitPresenter$ensureInitialized$1.L$1 = innerTradeRoute;
            botTradeInitPresenter$ensureInitialized$1.L$2 = paramBuilder;
            botTradeInitPresenter$ensureInitialized$1.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, z, null, botTradeInitPresenter$ensureInitialized$1, 2, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
            c52478wMx = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            paramBuilder = (ParamBuilder) botTradeInitPresenter$ensureInitialized$1.L$2;
            innerTradeRoute = (InnerTradeRoute) botTradeInitPresenter$ensureInitialized$1.L$1;
            c52478wMx = (C52478wMx) botTradeInitPresenter$ensureInitialized$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (!Result.m7384isSuccessimpl(objM8790ensureInitialize0E7RQCE$default)) {
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8790ensureInitialize0E7RQCE$default);
            pUU.KWHzl("BotTradeInitPresenter", "refreshTrade failed with " + (thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null));
            java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM8790ensureInitialize0E7RQCE$default);
            if (thM7380exceptionOrNullimpl2 == null || (strAYXKKw = thM7380exceptionOrNullimpl2.getMessage()) == null) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
            }
            c52478wMx.fARcdN();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("errorMgs", strAYXKKw);
            c52478wMx.AkhnZx.KWHzl(new kotlin.Pair<>(C56443yFo.KWHzl(false), new ParamBuilder.ActionBar().copydefault(bundle).EZpvd()));
            return Unit.INSTANCE;
        }
        BizSimpleInfo bizSimpleInfoKWHzl = c52478wMx.KWHzl(innerTradeRoute);
        java.lang.String instType = bizSimpleInfoKWHzl != null ? bizSimpleInfoKWHzl.getInstType() : null;
        if (instType == null || instType.length() == 0) {
            botTradeInitPresenter$ensureInitialized$1.L$0 = null;
            botTradeInitPresenter$ensureInitialized$1.L$1 = null;
            botTradeInitPresenter$ensureInitialized$1.L$2 = null;
            botTradeInitPresenter$ensureInitialized$1.label = 2;
            if (c52478wMx.copydefault(paramBuilder, botTradeInitPresenter$ensureInitialized$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (innerTradeRoute == null || (strategyType = innerTradeRoute.getStrategyType()) == null) {
            strategyType = "";
        }
        botTradeInitPresenter$ensureInitialized$1.L$0 = null;
        botTradeInitPresenter$ensureInitialized$1.L$1 = null;
        botTradeInitPresenter$ensureInitialized$1.L$2 = null;
        botTradeInitPresenter$ensureInitialized$1.label = 3;
        if (c52478wMx.AEQbTJ(strategyType, bizSimpleInfoKWHzl, paramBuilder, botTradeInitPresenter$ensureInitialized$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object ensureInitialized$default(C52478wMx c52478wMx, InnerTradeRoute innerTradeRoute, boolean z, ParamBuilder paramBuilder, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            paramBuilder = new ParamBuilder.ActionBar().EZpvd();
        }
        return c52478wMx.OLrzqt(innerTradeRoute, z, paramBuilder, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(final ParamBuilder paramBuilder, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BotTradeInitPresenter$startToLoadCurrentBiz$1 botTradeInitPresenter$startToLoadCurrentBiz$1;
        final C52478wMx c52478wMx;
        if (continuation instanceof BotTradeInitPresenter$startToLoadCurrentBiz$1) {
            botTradeInitPresenter$startToLoadCurrentBiz$1 = (BotTradeInitPresenter$startToLoadCurrentBiz$1) continuation;
            int i = botTradeInitPresenter$startToLoadCurrentBiz$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                botTradeInitPresenter$startToLoadCurrentBiz$1.label = i - Integer.MIN_VALUE;
            } else {
                botTradeInitPresenter$startToLoadCurrentBiz$1 = new BotTradeInitPresenter$startToLoadCurrentBiz$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = botTradeInitPresenter$startToLoadCurrentBiz$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = botTradeInitPresenter$startToLoadCurrentBiz$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC54581xNr interfaceC54581xNrFIwbmz = fIwbmz();
            if (interfaceC54581xNrFIwbmz == null) {
                c52478wMx = this;
                c52478wMx.AEQbTJ(new Function0() { // from class: o.wMC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C52478wMx.djBIcL(this.copydefault, abstractC54531xLw, paramBuilder);
                    }
                });
                return Unit.INSTANCE;
            }
            botTradeInitPresenter$startToLoadCurrentBiz$1.L$0 = this;
            botTradeInitPresenter$startToLoadCurrentBiz$1.L$1 = paramBuilder;
            botTradeInitPresenter$startToLoadCurrentBiz$1.label = 1;
            objEZpvd = interfaceC54581xNrFIwbmz.EZpvd(botTradeInitPresenter$startToLoadCurrentBiz$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c52478wMx = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paramBuilder = (ParamBuilder) botTradeInitPresenter$startToLoadCurrentBiz$1.L$1;
            c52478wMx = (C52478wMx) botTradeInitPresenter$startToLoadCurrentBiz$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        SourceResp sourceResp = (SourceResp) objEZpvd;
        final AbstractC54531xLw abstractC54531xLw = sourceResp != null ? (AbstractC54531xLw) sourceResp.getData() : null;
        c52478wMx.AEQbTJ(new Function0() { // from class: o.wMC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52478wMx.djBIcL(this.copydefault, abstractC54531xLw, paramBuilder);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(final C52478wMx c52478wMx, final AbstractC54531xLw abstractC54531xLw, final ParamBuilder paramBuilder) {
        c52478wMx.EZpvd(new Function0() { // from class: o.wMD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52478wMx.gEmmrt(this.copydefault, abstractC54531xLw, paramBuilder);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C52478wMx c52478wMx, AbstractC54531xLw abstractC54531xLw, ParamBuilder paramBuilder) {
        c52478wMx.AhwBna();
        c52478wMx.AkhnZx.KWHzl(new kotlin.Pair<>(java.lang.Boolean.valueOf(abstractC54531xLw != null), paramBuilder));
        c52478wMx.fARcdN();
        if (abstractC54531xLw != null) {
            c52478wMx.fJNWhG();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00f1 -> B:47:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ff -> B:49:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, BizSimpleInfo bizSimpleInfo, final ParamBuilder paramBuilder, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        BotTradeInitPresenter$startToLoadBiz$1 botTradeInitPresenter$startToLoadBiz$1;
        java.lang.String strOLrzqt;
        final C52478wMx c52478wMx;
        AbstractC54531xLw abstractC54531xLw;
        java.util.Iterator it;
        java.lang.String str2;
        final ParamBuilder paramBuilder2;
        final C52478wMx c52478wMx2;
        SourceResp sourceResp;
        if (continuation instanceof BotTradeInitPresenter$startToLoadBiz$1) {
            botTradeInitPresenter$startToLoadBiz$1 = (BotTradeInitPresenter$startToLoadBiz$1) continuation;
            int i = botTradeInitPresenter$startToLoadBiz$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                botTradeInitPresenter$startToLoadBiz$1.label = i - Integer.MIN_VALUE;
            } else {
                botTradeInitPresenter$startToLoadBiz$1 = new BotTradeInitPresenter$startToLoadBiz$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = botTradeInitPresenter$startToLoadBiz$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = botTradeInitPresenter$startToLoadBiz$1.label;
        final AbstractC54531xLw abstractC54531xLw2 = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (bizSimpleInfo == null || (strOLrzqt = bizSimpleInfo.getInstType()) == null) {
                strOLrzqt = "";
            }
            C55946xtY c55946xtY = C55946xtY.OLrzqt;
            if (!c55946xtY.copydefault(str, strOLrzqt)) {
                strOLrzqt = c55946xtY.OLrzqt(str);
            }
            InterfaceC54581xNr interfaceC54581xNrFIwbmz = fIwbmz();
            if (interfaceC54581xNrFIwbmz != null) {
                botTradeInitPresenter$startToLoadBiz$1.L$0 = this;
                botTradeInitPresenter$startToLoadBiz$1.L$1 = str;
                botTradeInitPresenter$startToLoadBiz$1.L$2 = bizSimpleInfo;
                botTradeInitPresenter$startToLoadBiz$1.L$3 = paramBuilder;
                botTradeInitPresenter$startToLoadBiz$1.label = 1;
                objEZpvd = interfaceC54581xNrFIwbmz.EZpvd(strOLrzqt, botTradeInitPresenter$startToLoadBiz$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c52478wMx = this;
            } else {
                c52478wMx = this;
                abstractC54531xLw = null;
                C55946xtY c55946xtY2 = C55946xtY.OLrzqt;
                c55946xtY2.copydefault(str, bizSimpleInfo, abstractC54531xLw, paramBuilder);
                if (c52478wMx.ejfBZ().EZpvd() != null) {
                    c52478wMx.EZpvd(new Function0() { // from class: o.wME
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C52478wMx.KWHzl(this.copydefault, paramBuilder);
                        }
                    });
                    return Unit.INSTANCE;
                }
                it = c55946xtY2.copydefault(str).iterator();
                ParamBuilder paramBuilder3 = paramBuilder;
                str2 = str;
                paramBuilder2 = paramBuilder3;
                if (!it.hasNext()) {
                }
            }
        } else if (i2 == 1) {
            ParamBuilder paramBuilder4 = (ParamBuilder) botTradeInitPresenter$startToLoadBiz$1.L$3;
            bizSimpleInfo = (BizSimpleInfo) botTradeInitPresenter$startToLoadBiz$1.L$2;
            java.lang.String str3 = (java.lang.String) botTradeInitPresenter$startToLoadBiz$1.L$1;
            c52478wMx = (C52478wMx) botTradeInitPresenter$startToLoadBiz$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            paramBuilder = paramBuilder4;
            str = str3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paramBuilder2 = (ParamBuilder) botTradeInitPresenter$startToLoadBiz$1.L$1;
                c52478wMx2 = (C52478wMx) botTradeInitPresenter$startToLoadBiz$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                sourceResp = (SourceResp) objEZpvd;
                if (sourceResp == null) {
                    abstractC54531xLw2 = (AbstractC54531xLw) sourceResp.getData();
                    c52478wMx2.AEQbTJ(new Function0() { // from class: o.wMG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C52478wMx.KWHzl(this.KWHzl, abstractC54531xLw2, paramBuilder2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                c52478wMx = c52478wMx2;
                c52478wMx2 = c52478wMx;
                c52478wMx2.AEQbTJ(new Function0() { // from class: o.wMG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C52478wMx.KWHzl(this.KWHzl, abstractC54531xLw2, paramBuilder2);
                    }
                });
                return Unit.INSTANCE;
            }
            java.lang.String str4 = (java.lang.String) botTradeInitPresenter$startToLoadBiz$1.L$4;
            it = (java.util.Iterator) botTradeInitPresenter$startToLoadBiz$1.L$3;
            ParamBuilder paramBuilder5 = (ParamBuilder) botTradeInitPresenter$startToLoadBiz$1.L$2;
            java.lang.String str5 = (java.lang.String) botTradeInitPresenter$startToLoadBiz$1.L$1;
            C52478wMx c52478wMx3 = (C52478wMx) botTradeInitPresenter$startToLoadBiz$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            AbstractC54531xLw abstractC54531xLw3 = (AbstractC54531xLw) objEZpvd;
            BotTradeInitPresenter$startToLoadBiz$1 botTradeInitPresenter$startToLoadBiz$12 = botTradeInitPresenter$startToLoadBiz$1;
            java.lang.String str6 = str4;
            paramBuilder2 = paramBuilder5;
            str2 = str5;
            BotTradeInitPresenter$startToLoadBiz$1 botTradeInitPresenter$startToLoadBiz$13 = botTradeInitPresenter$startToLoadBiz$12;
            if (abstractC54531xLw3 == null) {
                pUU.KWHzl("BotTradeInitPresenter", "init extra instType: " + str6 + " failed for " + str2);
                c52478wMx3.fARcdN();
                c52478wMx3.AkhnZx.KWHzl(new kotlin.Pair<>(C56443yFo.KWHzl(false), paramBuilder2));
                return Unit.INSTANCE;
            }
            pUU.KWHzl("BotTradeInitPresenter", "init extra instType: " + str6 + " success for " + str2);
            botTradeInitPresenter$startToLoadBiz$1 = botTradeInitPresenter$startToLoadBiz$13;
            c52478wMx = c52478wMx3;
            if (!it.hasNext()) {
                java.lang.String str7 = (java.lang.String) it.next();
                InterfaceC54581xNr interfaceC54581xNrFIwbmz2 = c52478wMx.fIwbmz();
                if (interfaceC54581xNrFIwbmz2 != null) {
                    botTradeInitPresenter$startToLoadBiz$1.L$0 = c52478wMx;
                    botTradeInitPresenter$startToLoadBiz$1.L$1 = str2;
                    botTradeInitPresenter$startToLoadBiz$1.L$2 = paramBuilder2;
                    botTradeInitPresenter$startToLoadBiz$1.L$3 = it;
                    botTradeInitPresenter$startToLoadBiz$1.L$4 = str7;
                    botTradeInitPresenter$startToLoadBiz$1.label = 2;
                    java.lang.Object objEZpvd2 = interfaceC54581xNrFIwbmz2.EZpvd(str7, botTradeInitPresenter$startToLoadBiz$1);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    java.lang.String str8 = str2;
                    paramBuilder5 = paramBuilder2;
                    str4 = str7;
                    objEZpvd = objEZpvd2;
                    c52478wMx3 = c52478wMx;
                    str5 = str8;
                    AbstractC54531xLw abstractC54531xLw32 = (AbstractC54531xLw) objEZpvd;
                    BotTradeInitPresenter$startToLoadBiz$1 botTradeInitPresenter$startToLoadBiz$122 = botTradeInitPresenter$startToLoadBiz$1;
                    java.lang.String str62 = str4;
                    paramBuilder2 = paramBuilder5;
                    str2 = str5;
                    BotTradeInitPresenter$startToLoadBiz$1 botTradeInitPresenter$startToLoadBiz$132 = botTradeInitPresenter$startToLoadBiz$122;
                    if (abstractC54531xLw32 == null) {
                    }
                } else {
                    c52478wMx3 = c52478wMx;
                    botTradeInitPresenter$startToLoadBiz$132 = botTradeInitPresenter$startToLoadBiz$1;
                    str62 = str7;
                    abstractC54531xLw32 = null;
                    if (abstractC54531xLw32 == null) {
                    }
                }
            } else {
                InterfaceC54581xNr interfaceC54581xNrFIwbmz3 = c52478wMx.fIwbmz();
                if (interfaceC54581xNrFIwbmz3 != null) {
                    botTradeInitPresenter$startToLoadBiz$1.L$0 = c52478wMx;
                    botTradeInitPresenter$startToLoadBiz$1.L$1 = paramBuilder2;
                    botTradeInitPresenter$startToLoadBiz$1.L$2 = null;
                    botTradeInitPresenter$startToLoadBiz$1.L$3 = null;
                    botTradeInitPresenter$startToLoadBiz$1.L$4 = null;
                    botTradeInitPresenter$startToLoadBiz$1.label = 3;
                    objEZpvd = interfaceC54581xNrFIwbmz3.EZpvd(botTradeInitPresenter$startToLoadBiz$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    c52478wMx2 = c52478wMx;
                    sourceResp = (SourceResp) objEZpvd;
                    if (sourceResp == null) {
                    }
                }
                c52478wMx2 = c52478wMx;
                c52478wMx2.AEQbTJ(new Function0() { // from class: o.wMG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C52478wMx.KWHzl(this.KWHzl, abstractC54531xLw2, paramBuilder2);
                    }
                });
                return Unit.INSTANCE;
            }
        }
        abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
        C55946xtY c55946xtY22 = C55946xtY.OLrzqt;
        c55946xtY22.copydefault(str, bizSimpleInfo, abstractC54531xLw, paramBuilder);
        if (c52478wMx.ejfBZ().EZpvd() != null) {
        }
    }

    public static final Unit KWHzl(C52478wMx c52478wMx, ParamBuilder paramBuilder) {
        c52478wMx.fARcdN();
        c52478wMx.AkhnZx.KWHzl(new kotlin.Pair<>(java.lang.Boolean.FALSE, paramBuilder));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final C52478wMx c52478wMx, final AbstractC54531xLw abstractC54531xLw, final ParamBuilder paramBuilder) {
        c52478wMx.EZpvd(new Function0() { // from class: o.wMt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52478wMx.valueOf(this.copydefault, abstractC54531xLw, paramBuilder);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C52478wMx c52478wMx, AbstractC54531xLw abstractC54531xLw, ParamBuilder paramBuilder) {
        c52478wMx.AhwBna();
        c52478wMx.AkhnZx.KWHzl(new kotlin.Pair<>(java.lang.Boolean.valueOf(abstractC54531xLw != null), c52478wMx.OLrzqt(paramBuilder)));
        c52478wMx.fARcdN();
        if (abstractC54531xLw != null) {
            c52478wMx.fJNWhG();
        }
        return Unit.INSTANCE;
    }

    public final ParamBuilder OLrzqt(ParamBuilder paramBuilder) {
        java.lang.String strOLrzqt;
        android.os.Bundle bundle;
        java.lang.Boolean boolIsCountDown;
        xOU xouWlaJM;
        ParamBuilder.ActionBar actionBar = new ParamBuilder.ActionBar();
        InterfaceC54581xNr interfaceC54581xNrFIwbmz = fIwbmz();
        if (interfaceC54581xNrFIwbmz == null || (xouWlaJM = interfaceC54581xNrFIwbmz.wlaJM()) == null || (strOLrzqt = xouWlaJM.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        actionBar.OLrzqt(strOLrzqt);
        actionBar.KWHzl(ejfBZ().copydefault());
        actionBar.copydefault(ejfBZ().KWHzl());
        BizInstrument bizInstrumentEZpvd = ejfBZ().EZpvd();
        actionBar.EZpvd(bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstFamily() : null);
        actionBar.EZpvd(paramBuilder != null ? paramBuilder.isSwitchCoin() : true);
        boolean zBooleanValue = false;
        actionBar.copydefault(paramBuilder != null ? paramBuilder.isScrollTop() : false);
        if (paramBuilder != null && (boolIsCountDown = paramBuilder.isCountDown()) != null) {
            zBooleanValue = boolIsCountDown.booleanValue();
        }
        actionBar.AEQbTJ(zBooleanValue);
        if (paramBuilder != null && (bundle = paramBuilder.getBundle()) != null) {
            actionBar.copydefault(bundle);
        }
        return actionBar.EZpvd();
    }

    public final void EZpvd(final Function0<Unit> function0) {
        this.fetchVPNInfo.fetchVPNInfo();
        final C54255xBq c54255xBq = this.fetchVPNInfo;
        c54255xBq.KWHzl(new Function1() { // from class: o.wMJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52478wMx.KWHzl(c54255xBq, this, (kotlin.Pair) obj);
            }
        });
        c54255xBq.copydefault(new Function1() { // from class: o.wMy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52478wMx.KWHzl((kotlin.Pair) obj);
            }
        });
        c54255xBq.OLrzqt(new Function1() { // from class: o.wMA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52478wMx.AEQbTJ(function0, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c54255xBq.fIwbmz();
    }

    public static final Unit KWHzl(C54255xBq c54255xBq, final C52478wMx c52478wMx, kotlin.Pair pair) {
        xOR xorCopydefault;
        xOR xorCopydefault2;
        java.util.List<OrderCategory> listAEQbTJ;
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.KWHzl("BotTradeInitPresenter", "loadBotData resp: " + pair.getFirst());
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54255xBq.AEQbTJ())) {
            java.lang.Object data = ((ResponseData) pair.getSecond()).getData();
            java.util.List<BotCategoryConfig> list = data instanceof java.util.List ? (java.util.List) data : null;
            InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
            if (interfaceC55881xsMCopydefault != null) {
                interfaceC55881xsMCopydefault.copydefault(list);
            }
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault != null && (xorCopydefault2 = interfaceC54581xNrCopydefault.copydefault()) != null && (listAEQbTJ = xorCopydefault2.AEQbTJ()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listAEQbTJ) {
                    if (Intrinsics.EZpvd((java.lang.Object) "dcd_bot", (java.lang.Object) ((OrderCategory) obj).getStrategyType())) {
                        arrayList.add(obj);
                    }
                }
                if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
                    xAD xad = c52478wMx.djBIcL;
                    xad.KWHzl(new Function1() { // from class: o.wMF
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C52478wMx.KWHzl(this.EZpvd, (ResponseData) obj2);
                        }
                    });
                    xKK.Activity.execute$default(xad, 0L, 1, null);
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54255xBq.KWHzl())) {
            java.lang.Object data2 = ((ResponseData) pair.getSecond()).getData();
            java.util.List list2 = data2 instanceof java.util.List ? (java.util.List) data2 : null;
            InterfaceC55881xsM interfaceC55881xsMCopydefault2 = C55886xsR.OLrzqt.copydefault();
            if (interfaceC55881xsMCopydefault2 != null) {
                interfaceC55881xsMCopydefault2.AEQbTJ(list2 != null ? (BotUserConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list2) : null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c54255xBq.EZpvd())) {
            java.lang.Object data3 = ((ResponseData) pair.getSecond()).getData();
            java.util.List list3 = data3 instanceof java.util.List ? (java.util.List) data3 : null;
            java.lang.Object objFirstOrNull = list3 != null ? CollectionsKt___CollectionsKt.firstOrNull(list3) : null;
            AlgoShareConfigInfo algoShareConfigInfo = objFirstOrNull instanceof AlgoShareConfigInfo ? (AlgoShareConfigInfo) objFirstOrNull : null;
            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault2 != null && (xorCopydefault = interfaceC54581xNrCopydefault2.copydefault()) != null) {
                xorCopydefault.EZpvd(algoShareConfigInfo);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52478wMx c52478wMx, ResponseData responseData) {
        java.util.ArrayList<java.lang.String> arrayListValues;
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.Object data = responseData.getData();
        java.util.ArrayList arrayList = null;
        java.util.List list = data instanceof java.util.List ? (java.util.List) data : null;
        if (list != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SupportedPairsItem) it.next()).getSymbol());
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        InterfaceC54581xNr interfaceC54581xNrFIwbmz = c52478wMx.fIwbmz();
        if (interfaceC54581xNrFIwbmz != null && (arrayListValues = interfaceC54581xNrFIwbmz.values()) != null) {
            arrayListValues.clear();
            arrayListValues.addAll(arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        pUU.copydefault("BotTradeInitPresenter", "loadBotData error: " + ((ResponseData) pair.getSecond()).getMsg());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0, boolean z) {
        pUU.KWHzl("BotTradeInitPresenter", "loadBotData status: " + z);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final BizSimpleInfo KWHzl(InnerTradeRoute innerTradeRoute) {
        if ((innerTradeRoute != null ? innerTradeRoute.getInstType() : null) == null) {
            if ((innerTradeRoute != null ? innerTradeRoute.getInstId() : null) != null) {
                innerTradeRoute.setInstId(null);
            }
        }
        if (innerTradeRoute == null) {
            return null;
        }
        AEQbTJ(innerTradeRoute);
        return new BizSimpleInfo(innerTradeRoute.getInstType(), innerTradeRoute.getInstId());
    }

    public final void AEQbTJ(final Function0<Unit> function0) {
        InterfaceC54581xNr interfaceC54581xNrFIwbmz;
        xOW newProxyInstance;
        xOV xovEZpvd;
        java.lang.String instId;
        InterfaceC54581xNr interfaceC54581xNrFIwbmz2 = fIwbmz();
        if (interfaceC54581xNrFIwbmz2 == null || (newProxyInstance = interfaceC54581xNrFIwbmz2.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.AEQbTJ()) {
            BizInstrument bizInstrumentEZpvd = ejfBZ().EZpvd();
            if (bizInstrumentEZpvd != null && (interfaceC54581xNrFIwbmz = fIwbmz()) != null) {
                interfaceC54581xNrFIwbmz.OLrzqt(bizInstrumentEZpvd, false);
            }
            function0.invoke();
            return;
        }
        final InterfaceC54581xNr interfaceC54581xNrFIwbmz3 = fIwbmz();
        if (interfaceC54581xNrFIwbmz3 != null) {
            C56166xxg c56166xxg = this.gEmmrt;
            BizInstrument bizInstrumentEZpvd2 = ejfBZ().EZpvd();
            if (bizInstrumentEZpvd2 == null || (instId = bizInstrumentEZpvd2.getInstId()) == null) {
                instId = "";
            }
            c56166xxg.AEQbTJ(instId);
            c56166xxg.KWHzl(new Function1() { // from class: o.wMB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52478wMx.AEQbTJ(this.EZpvd, interfaceC54581xNrFIwbmz3, function0, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c56166xxg, 0L, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C52478wMx c52478wMx, InterfaceC54581xNr interfaceC54581xNr, Function0 function0, ResponseData responseData) {
        RiskStatus riskStatus;
        Intrinsics.checkNotNullParameter(responseData, "");
        BizInstrument bizInstrumentEZpvd = c52478wMx.ejfBZ().EZpvd();
        if (bizInstrumentEZpvd == null) {
            return Unit.INSTANCE;
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list = (java.util.List) responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.Object) ((list == null || (riskStatus = (RiskStatus) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : riskStatus.getAtRisk()), (java.lang.Object) 1)) {
                interfaceC54581xNr.OLrzqt(true);
                interfaceC54581xNr.OLrzqt(bizInstrumentEZpvd, true);
            }
        } else {
            interfaceC54581xNr.OLrzqt(bizInstrumentEZpvd, false);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    public void values() {
        InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        fARcdN();
        this.gEmmrt.AYXKKw();
        this.fetchVPNInfo.fetchVPNInfo();
    }

    private final void fARcdN() {
        java.lang.String value = this.AYXKKw.getValue();
        if (value != null) {
            int iHashCode = value.hashCode();
            if (iHashCode != -1011593784) {
                if (iHashCode != 555374431) {
                    if (iHashCode == 912496914 && value.equals("SHOW_INIT")) {
                        DbNXlk();
                        return;
                    }
                } else if (value.equals("LOADING_START")) {
                    this.AYXKKw.setValue("LOADING_END");
                    return;
                }
            } else if (value.equals("PULL_START")) {
                this.AYXKKw.setValue("PULL_END");
                return;
            }
        }
        DbNXlk();
    }

    /* JADX DEBUG: Possible override for method o.upd.DbNXlk()Ljava/lang/String; */
    public final void DbNXlk() {
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(400L, java.util.concurrent.TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgTimer, "");
        this.isConnected = C33024moe.subscribeOnIO$default(abstractC58247yxgTimer, (Function1) null, (Function0) null, new Function1() { // from class: o.wMz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52478wMx.KWHzl(this.AEQbTJ, (java.lang.Long) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C52478wMx c52478wMx, java.lang.Long l) {
        c52478wMx.AYXKKw.setValue("DISMISS_INIT");
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        C49500upi c49500upiOLrzqt = OLrzqt();
        valueOf();
        this.DbNXlk = c49500upiOLrzqt;
    }

    public final void AEQbTJ(InnerTradeRoute innerTradeRoute) {
        xOU xouWlaJM;
        if (Intrinsics.EZpvd((java.lang.Object) innerTradeRoute.getStrategyType(), (java.lang.Object) "arbitrage")) {
            innerTradeRoute.setInstType(null);
            innerTradeRoute.setInstId(null);
            InterfaceC54581xNr interfaceC54581xNrFIwbmz = fIwbmz();
            if (interfaceC54581xNrFIwbmz == null || (xouWlaJM = interfaceC54581xNrFIwbmz.wlaJM()) == null) {
                return;
            }
            xouWlaJM.EZpvd("arbitrage");
        }
    }
}
