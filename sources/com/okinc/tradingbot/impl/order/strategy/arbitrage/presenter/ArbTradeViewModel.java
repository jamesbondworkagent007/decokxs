package com.okinc.tradingbot.impl.order.strategy.arbitrage.presenter;

import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradingbot.impl.order.strategy.arbitrage.presenter.ArbTradeViewModel;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.ArbitrageOrderData;
import com.okinc.unify_trade.biz.ArbitrageOrderResponse;
import com.okinc.unify_trade.biz.ArbitragePriceSetting;
import com.okinc.unify_trade.biz.ArbitragePriceSettingModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.LeverageInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.ArbitrageType;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC54531xLw;
import o.AbstractC55737xpb;
import o.C33129mqd;
import o.C54228xAq;
import o.C54229xAr;
import o.C54589xNz;
import o.C55879xsK;
import o.C55886xsR;
import o.C56036xvI;
import o.C56059xvf;
import o.C56169xxj;
import o.C56248xzI;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xOW;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ArbTradeViewModel extends AbsPresenter {
    public TradeLiveData<SourceResp<C55879xsK>> AEQbTJ;
    public final C54228xAq AYXKKw;
    public final TradeLiveData<BizInstrument> AhwBna;
    public final TradeLiveData<String> AkhnZx;
    public final TradeLiveData<Pair<String, String>> AuCTel;
    public final TradeLiveData<String> DbNXlk;
    public final C56248xzI EZpvd;
    public Observer<SourceResp<C55879xsK>> KWHzl;
    public final TradeLiveData<Boolean> OLrzqt;
    public final TradeLiveData<Boolean> copydefault;
    public final TradeLiveData<Unit> djBIcL;
    public final TradeLiveData<String> ejfBZ;
    public final TradeLiveData<Boolean> fARcdN;
    public final TradeLiveData<String> fIwbmz;
    public final TradeLiveData<BizInstrument> fJNWhG;
    public final TradeLiveData<TickersData> fetchVPNInfo;
    public boolean gEmmrt;
    public ArrayList<Object> getFieldNames;
    public final C54229xAr getNewProxyInstance;
    public final TradeLiveData<TickersData> hDKMBd;
    public final TradeLiveData<Boolean> isConnected;
    public final TradeLiveData<ArbitragePriceSetting> iwGUEr;
    public ArrayList<Object> valueOf;
    public final TradeLiveData<Pair<String, String>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BizInstrument> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TickersData> AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<String, String>> AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArbitragePriceSetting> AuCTel() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> DbNXlk() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Unit> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TickersData> ejfBZ() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> fetchVPNInfo() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<String, String>> valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<BizInstrument> values() {
        return this.fJNWhG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArbTradeViewModel(@NotNull android.app.Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = new C54228xAq();
        this.getNewProxyInstance = new C54229xAr();
        this.EZpvd = new C56248xzI();
        this.AhwBna = new TradeLiveData<>();
        this.fJNWhG = new TradeLiveData<>();
        this.fetchVPNInfo = new TradeLiveData<>();
        this.hDKMBd = new TradeLiveData<>();
        this.values = new TradeLiveData<>();
        this.AuCTel = new TradeLiveData<>();
        this.AkhnZx = new TradeLiveData<>();
        this.fIwbmz = new TradeLiveData<>();
        Boolean bool = Boolean.FALSE;
        this.isConnected = new TradeLiveData<>(bool);
        this.fARcdN = new TradeLiveData<>(bool);
        this.djBIcL = new TradeLiveData<>();
        this.OLrzqt = new TradeLiveData<>(bool);
        this.DbNXlk = new TradeLiveData<>();
        this.ejfBZ = new TradeLiveData<>();
        this.copydefault = new TradeLiveData<>(bool);
        this.iwGUEr = new TradeLiveData<>();
        this.valueOf = new ArrayList<>();
        this.getFieldNames = new ArrayList<>();
        this.AEQbTJ = new TradeLiveData<>();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        fIwbmz();
    }

    public final void fARcdN() {
        this.gEmmrt = false;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ArbTradeViewModel$loadData$1(this, null), 3, null);
        Observer<SourceResp<C55879xsK>> observer = new Observer() { // from class: o.vBE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ArbTradeViewModel.OLrzqt(this.EZpvd, (SourceResp) obj);
            }
        };
        this.KWHzl = observer;
        TradeLiveData<SourceResp<C55879xsK>> tradeLiveData = this.AEQbTJ;
        Intrinsics.copydefault(observer);
        tradeLiveData.observeForever(observer);
        C55886xsR.OLrzqt.KWHzl(this.AEQbTJ, false);
    }

    public static final void OLrzqt(ArbTradeViewModel arbTradeViewModel, SourceResp sourceResp) {
        Intrinsics.checkNotNullParameter(sourceResp, "");
        arbTradeViewModel.copydefault.postValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull ArbitrageType arbitrageType, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ArbTradeViewModel$loadBiz$1 arbTradeViewModel$loadBiz$1;
        ArbitrageInfo arbitrageInfoOLrzqt;
        ArbTradeViewModel arbTradeViewModel;
        AbstractC54531xLw abstractC54531xLw;
        Object objEZpvd;
        if (continuation instanceof ArbTradeViewModel$loadBiz$1) {
            arbTradeViewModel$loadBiz$1 = (ArbTradeViewModel$loadBiz$1) continuation;
            int i = arbTradeViewModel$loadBiz$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                arbTradeViewModel$loadBiz$1.label = i - Integer.MIN_VALUE;
            } else {
                arbTradeViewModel$loadBiz$1 = new ArbTradeViewModel$loadBiz$1(this, continuation);
            }
        }
        Object obj = arbTradeViewModel$loadBiz$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = arbTradeViewModel$loadBiz$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            arbitrageInfoOLrzqt = OLrzqt(arbitrageType);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                arbTradeViewModel = this;
                abstractC54531xLw = null;
                arbTradeViewModel$loadBiz$1.L$0 = null;
                arbTradeViewModel$loadBiz$1.L$1 = null;
                arbTradeViewModel$loadBiz$1.L$2 = null;
                arbTradeViewModel$loadBiz$1.label = 2;
                if (arbTradeViewModel.copydefault(arbitrageType, abstractC54531xLw, arbitrageInfoOLrzqt, arbTradeViewModel$loadBiz$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            String instType = arbitrageInfoOLrzqt.getInstType();
            arbTradeViewModel$loadBiz$1.L$0 = this;
            arbTradeViewModel$loadBiz$1.L$1 = arbitrageType;
            arbTradeViewModel$loadBiz$1.L$2 = arbitrageInfoOLrzqt;
            arbTradeViewModel$loadBiz$1.label = 1;
            objEZpvd = interfaceC54581xNrOLrzqt.EZpvd(instType, arbTradeViewModel$loadBiz$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            arbTradeViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            ArbitrageInfo arbitrageInfo = (ArbitrageInfo) arbTradeViewModel$loadBiz$1.L$2;
            ArbitrageType arbitrageType2 = (ArbitrageType) arbTradeViewModel$loadBiz$1.L$1;
            arbTradeViewModel = (ArbTradeViewModel) arbTradeViewModel$loadBiz$1.L$0;
            C56391yDq.AEQbTJ(obj);
            arbitrageInfoOLrzqt = arbitrageInfo;
            arbitrageType = arbitrageType2;
            objEZpvd = obj;
        }
        abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
        arbTradeViewModel$loadBiz$1.L$0 = null;
        arbTradeViewModel$loadBiz$1.L$1 = null;
        arbTradeViewModel$loadBiz$1.L$2 = null;
        arbTradeViewModel$loadBiz$1.label = 2;
        if (arbTradeViewModel.copydefault(arbitrageType, abstractC54531xLw, arbitrageInfoOLrzqt, arbTradeViewModel$loadBiz$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: o.xvI */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v8, types: [T, com.okinc.unify_trade.biz.BizInstrument] */
    /* JADX WARN: Type inference failed for: r13v11, types: [T, com.okinc.unify_trade.biz.BizInstrument] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull ArbitrageType arbitrageType, AbstractC54531xLw abstractC54531xLw, @NotNull ArbitrageInfo arbitrageInfo, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        ArbTradeViewModel$handleBiz$1 arbTradeViewModel$handleBiz$1;
        ArbTradeViewModel arbTradeViewModel;
        int i;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        CountDownInfo countDownInfo;
        if (continuation instanceof ArbTradeViewModel$handleBiz$1) {
            arbTradeViewModel$handleBiz$1 = (ArbTradeViewModel$handleBiz$1) continuation;
            int i2 = arbTradeViewModel$handleBiz$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                arbTradeViewModel$handleBiz$1.label = i2 - Integer.MIN_VALUE;
            } else {
                arbTradeViewModel$handleBiz$1 = new ArbTradeViewModel$handleBiz$1(this, continuation);
            }
        }
        Object obj = arbTradeViewModel$handleBiz$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = arbTradeViewModel$handleBiz$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (abstractC54531xLw != null) {
                if (arbitrageType == ArbitrageType.LEFT) {
                    this.isConnected.postValue(C56443yFo.KWHzl(true));
                } else {
                    this.fARcdN.postValue(C56443yFo.KWHzl(true));
                }
                objectRef = new Ref.ObjectRef();
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
                T tCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault(arbitrageInfo.getInstType(), arbitrageInfo.getInstId(), arbitrageInfo.getUly(), arbitrageInfo.getAlias()) : 0;
                objectRef.element = tCopydefault;
                if (tCopydefault == 0) {
                    ?? Copydefault = abstractC54531xLw.copydefault();
                    objectRef.element = Copydefault;
                    if (Copydefault != 0) {
                        C56036xvI.KWHzl.EZpvd(Copydefault);
                    }
                }
                BizInstrument bizInstrument = (BizInstrument) objectRef.element;
                i = (bizInstrument == null || (countDownInfo = bizInstrument.getCountDownInfo()) == null || !countDownInfo.isInvalidForBot()) ? 0 : 1;
                if (i != 0) {
                    objectRef.element = abstractC54531xLw.copydefault();
                }
                if (objectRef.element != 0) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null) {
                        BizInstrument bizInstrument2 = (BizInstrument) objectRef.element;
                        arbTradeViewModel$handleBiz$1.L$0 = this;
                        arbTradeViewModel$handleBiz$1.L$1 = arbitrageType;
                        arbTradeViewModel$handleBiz$1.L$2 = objectRef;
                        arbTradeViewModel$handleBiz$1.I$0 = i;
                        arbTradeViewModel$handleBiz$1.label = 1;
                        Object objAEQbTJ = interfaceC54581xNrOLrzqt.AEQbTJ(bizInstrument2, arbTradeViewModel$handleBiz$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        arbTradeViewModel = this;
                        obj = objAEQbTJ;
                        objectRef2 = objectRef;
                    } else {
                        arbTradeViewModel = this;
                        arbTradeViewModel.KWHzl(arbitrageType, (BizInstrument) objectRef.element);
                    }
                } else {
                    arbTradeViewModel = this;
                }
            } else {
                if (arbitrageType == ArbitrageType.LEFT) {
                    this.isConnected.postValue(C56443yFo.KWHzl(false));
                } else {
                    this.fARcdN.postValue(C56443yFo.KWHzl(false));
                }
                arbTradeViewModel = this;
                i = 0;
            }
            arbTradeViewModel.OLrzqt.setValue(C56443yFo.KWHzl(i != 0));
            TradeLiveData<Unit> tradeLiveData = arbTradeViewModel.djBIcL;
            Unit unit = Unit.INSTANCE;
            tradeLiveData.postValue(unit);
            return unit;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i4 = arbTradeViewModel$handleBiz$1.I$0;
        objectRef2 = (Ref.ObjectRef) arbTradeViewModel$handleBiz$1.L$2;
        ArbitrageType arbitrageType2 = (ArbitrageType) arbTradeViewModel$handleBiz$1.L$1;
        arbTradeViewModel = (ArbTradeViewModel) arbTradeViewModel$handleBiz$1.L$0;
        C56391yDq.AEQbTJ(obj);
        i = i4;
        arbitrageType = arbitrageType2;
        objectRef = objectRef2;
        arbTradeViewModel.KWHzl(arbitrageType, (BizInstrument) objectRef.element);
        arbTradeViewModel.OLrzqt.setValue(C56443yFo.KWHzl(i != 0));
        TradeLiveData<Unit> tradeLiveData2 = arbTradeViewModel.djBIcL;
        Unit unit2 = Unit.INSTANCE;
        tradeLiveData2.postValue(unit2);
        return unit2;
    }

    public final void KWHzl(@NotNull ArbitrageType arbitrageType, @NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(arbitrageType, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if (arbitrageType == ArbitrageType.LEFT) {
            C56036xvI.KWHzl.EZpvd(bizInstrument);
            hDKMBd();
        } else {
            C56036xvI.KWHzl.OLrzqt(bizInstrument);
            getFieldNames();
        }
    }

    public final void KWHzl(@NotNull final ArbitrageType arbitrageType) {
        Intrinsics.checkNotNullParameter(arbitrageType, "");
        final ArbitrageInfo arbitrageInfoOLrzqt = OLrzqt(arbitrageType);
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument bizInstrumentCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault(arbitrageInfoOLrzqt.getInstType(), arbitrageInfoOLrzqt.getInstId(), arbitrageInfoOLrzqt.getUly(), arbitrageInfoOLrzqt.getAlias()) : null;
        if (OLrzqt(arbitrageInfoOLrzqt)) {
            C56169xxj c56169xxj = new C56169xxj();
            c56169xxj.OLrzqt(bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getInstId() : null);
            c56169xxj.EZpvd(arbitrageInfoOLrzqt.getMgnMode());
            c56169xxj.KWHzl(new Function1() { // from class: o.vBI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ArbTradeViewModel.EZpvd(this.KWHzl, arbitrageInfoOLrzqt, arbitrageType, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c56169xxj, 0L, 1, null);
            return;
        }
        OLrzqt(arbitrageType, (String) null);
    }

    public final String EZpvd(@NotNull ArbitrageInfo arbitrageInfo, List<LeverageInfo> list) {
        LeverageInfo leverageInfo;
        String lever;
        LeverageInfo leverageInfo2;
        LeverageInfo leverageInfo3;
        LeverageInfo leverageInfo4;
        xOW newProxyInstance;
        xOW newProxyInstance2;
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        Object obj = null;
        String strAuCTelauCTel = (interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance2.AuCTelauCTel();
        boolean zEZpvd = Intrinsics.EZpvd((Object) arbitrageInfo.getPosSide(), (Object) "long");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && newProxyInstance.AhwBna() && Intrinsics.EZpvd((Object) arbitrageInfo.getMgnMode(), (Object) "cross")) {
            return "";
        }
        String instType = arbitrageInfo.getInstType();
        if (Intrinsics.EZpvd((Object) instType, (Object) "SWAP") || Intrinsics.EZpvd((Object) instType, (Object) "FUTURES")) {
            if (Intrinsics.EZpvd((Object) strAuCTelauCTel, (Object) "long_short_mode")) {
                if (zEZpvd) {
                    if (Intrinsics.EZpvd((Object) arbitrageInfo.getMgnMode(), (Object) "isolated")) {
                        if (list == null) {
                            return "";
                        }
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (Intrinsics.EZpvd((Object) ((LeverageInfo) next).getPosSide(), (Object) "long")) {
                                obj = next;
                                break;
                            }
                        }
                        LeverageInfo leverageInfo5 = (LeverageInfo) obj;
                        if (leverageInfo5 == null || (lever = leverageInfo5.getLever()) == null) {
                            return "";
                        }
                    } else if (list == null || (leverageInfo3 = (LeverageInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (lever = leverageInfo3.getLever()) == null) {
                        return "";
                    }
                } else if (Intrinsics.EZpvd((Object) arbitrageInfo.getMgnMode(), (Object) "isolated")) {
                    if (list == null) {
                        return "";
                    }
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (Intrinsics.EZpvd((Object) ((LeverageInfo) next2).getPosSide(), (Object) "short")) {
                            obj = next2;
                            break;
                        }
                    }
                    LeverageInfo leverageInfo6 = (LeverageInfo) obj;
                    if (leverageInfo6 == null || (lever = leverageInfo6.getLever()) == null) {
                        return "";
                    }
                } else if (list == null || (leverageInfo2 = (LeverageInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (lever = leverageInfo2.getLever()) == null) {
                    return "";
                }
            } else if (list == null || (leverageInfo = (LeverageInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (lever = leverageInfo.getLever()) == null) {
                return "";
            }
        } else if (list == null || (leverageInfo4 = (LeverageInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (lever = leverageInfo4.getLever()) == null) {
            return "";
        }
        return lever;
    }

    public final void OLrzqt(ArbitrageType arbitrageType, String str) {
        if (arbitrageType == ArbitrageType.LEFT) {
            this.DbNXlk.postValue(str);
        } else {
            this.ejfBZ.postValue(str);
        }
    }

    public final void hDKMBd() {
        String instId;
        ArbitrageInfo arbitrageInfoCopydefault = C56036xvI.KWHzl.copydefault();
        BizInstrument bizInstrumentKWHzl = KWHzl(arbitrageInfoCopydefault);
        if (bizInstrumentKWHzl != null) {
            this.AhwBna.setValue(bizInstrumentKWHzl);
        }
        this.values.setValue(new Pair<>(arbitrageInfoCopydefault.getSide(), arbitrageInfoCopydefault.getPosSide()));
        this.AkhnZx.setValue(arbitrageInfoCopydefault.getMgnMode());
        KWHzl(ArbitrageType.LEFT);
        if (bizInstrumentKWHzl == null || (instId = bizInstrumentKWHzl.getInstId()) == null) {
            instId = "";
        }
        EZpvd(instId);
    }

    public final void getFieldNames() {
        String instId;
        ArbitrageInfo arbitrageInfoAEQbTJ = C56036xvI.KWHzl.AEQbTJ();
        BizInstrument bizInstrumentKWHzl = KWHzl(arbitrageInfoAEQbTJ);
        if (bizInstrumentKWHzl != null) {
            this.fJNWhG.setValue(bizInstrumentKWHzl);
        }
        this.AuCTel.setValue(new Pair<>(arbitrageInfoAEQbTJ.getSide(), arbitrageInfoAEQbTJ.getPosSide()));
        this.fIwbmz.setValue(arbitrageInfoAEQbTJ.getMgnMode());
        KWHzl(ArbitrageType.RIGHT);
        if (bizInstrumentKWHzl == null || (instId = bizInstrumentKWHzl.getInstId()) == null) {
            instId = "";
        }
        OLrzqt(instId);
    }

    public final ArbitrageInfo OLrzqt(ArbitrageType arbitrageType) {
        return arbitrageType == ArbitrageType.LEFT ? C56036xvI.KWHzl.copydefault() : C56036xvI.KWHzl.AEQbTJ();
    }

    public final BizInstrument KWHzl(ArbitrageInfo arbitrageInfo) {
        String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            return null;
        }
        if (arbitrageInfo == null || (instType = arbitrageInfo.getInstType()) == null) {
            instType = "";
        }
        return interfaceC54581xNrCopydefault.copydefault(instType, arbitrageInfo != null ? arbitrageInfo.getInstId() : null, arbitrageInfo != null ? arbitrageInfo.getUly() : null, arbitrageInfo != null ? arbitrageInfo.getAlias() : null);
    }

    public final void EZpvd(String str) {
        fJNWhG();
        this.valueOf.add(new Application(str, this, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis()))));
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.copydefault(this.valueOf);
        }
    }

    public static final class Application extends AbstractC55737xpb {
        public final /* synthetic */ ArbTradeViewModel KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(String str, ArbTradeViewModel arbTradeViewModel, String str2) {
            super(str, str2, false, 4, null);
            this.KWHzl = arbTradeViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(List<TickersData> list, String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.KWHzl((Collection) list)) {
                this.KWHzl.AhwBna().postValue(list.get(0));
            }
        }
    }

    public final void OLrzqt(String str) {
        getNewProxyInstance();
        this.getFieldNames.add(new ActionBar(str, this, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis()))));
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.copydefault(this.getFieldNames);
        }
    }

    public static final class ActionBar extends AbstractC55737xpb {
        public final /* synthetic */ ArbTradeViewModel OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(String str, ArbTradeViewModel arbTradeViewModel, String str2) {
            super(str, str2, false, 4, null);
            this.OLrzqt = arbTradeViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(List<TickersData> list, String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.KWHzl((Collection) list)) {
                this.OLrzqt.ejfBZ().postValue(list.get(0));
            }
        }
    }

    public final void fJNWhG() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        if ((!this.valueOf.isEmpty()) && (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(this.valueOf);
        }
        this.valueOf.clear();
    }

    public final void getNewProxyInstance() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        if ((!this.getFieldNames.isEmpty()) && (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(this.getFieldNames);
        }
        this.getFieldNames.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean OLrzqt(@NotNull ArbitrageInfo arbitrageInfo) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        boolean z = interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.AhwBna() && Intrinsics.EZpvd((Object) arbitrageInfo.getMgnMode(), (Object) "cross");
        String instType = arbitrageInfo.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                if (!instType.equals("MARGIN")) {
                    return false;
                }
                break;
            case 2552066:
                return instType.equals("SPOT") && C56059xvf.EZpvd.fJNWhG() && !z;
            case 2558355:
                if (!instType.equals("SWAP")) {
                    return false;
                }
                break;
            case 214415088:
                if (!instType.equals("FUTURES")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return !z;
    }

    public final void OLrzqt() {
        C54228xAq c54228xAq = this.AYXKKw;
        c54228xAq.EZpvd("arbitrage");
        c54228xAq.KWHzl(new Function1() { // from class: o.vBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ArbTradeViewModel.KWHzl(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54228xAq, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull ArbitragePriceSetting arbitragePriceSetting, @NotNull final Function2<? super Boolean, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(arbitragePriceSetting, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C54229xAr c54229xAr = this.getNewProxyInstance;
        c54229xAr.KWHzl(arbitragePriceSetting);
        c54229xAr.KWHzl(new Function1() { // from class: o.vBN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ArbTradeViewModel.OLrzqt(function2, this, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54229xAr, 0L, 1, null);
    }

    public final void AEQbTJ(@NotNull ArbitrageOrderData arbitrageOrderData, @NotNull final yHO<? super Boolean, ? super String, ? super String, Unit> yho) {
        Intrinsics.checkNotNullParameter(arbitrageOrderData, "");
        Intrinsics.checkNotNullParameter(yho, "");
        C56248xzI c56248xzI = this.EZpvd;
        c56248xzI.AEQbTJ(arbitrageOrderData);
        c56248xzI.KWHzl(new Function1() { // from class: o.vBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ArbTradeViewModel.EZpvd(yho, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56248xzI, 0L, 1, null);
    }

    public final void fIwbmz() {
        this.gEmmrt = true;
        fJNWhG();
        getNewProxyInstance();
        this.fetchVPNInfo.setValue(null);
        this.hDKMBd.setValue(null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AYXKKw, this.getNewProxyInstance, this.EZpvd);
    }

    public static final Unit EZpvd(ArbTradeViewModel arbTradeViewModel, ArbitrageInfo arbitrageInfo, ArbitrageType arbitrageType, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            arbTradeViewModel.OLrzqt(arbitrageType, arbTradeViewModel.EZpvd(arbitrageInfo, (List<LeverageInfo>) responseData.getData()));
        } else {
            arbTradeViewModel.OLrzqt(arbitrageType, "");
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ArbTradeViewModel arbTradeViewModel, ResponseData responseData) {
        ArbitragePriceSettingModel arbitragePriceSettingModel;
        Intrinsics.checkNotNullParameter(responseData, "");
        ArbitragePriceSetting userStrategyConfig = null;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            TradeLiveData<ArbitragePriceSetting> tradeLiveData = arbTradeViewModel.iwGUEr;
            List list = (List) responseData.getData();
            if (list != null && (arbitragePriceSettingModel = (ArbitragePriceSettingModel) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) != null) {
                userStrategyConfig = arbitragePriceSettingModel.getUserStrategyConfig();
            }
            tradeLiveData.postValue(userStrategyConfig);
        } else {
            arbTradeViewModel.iwGUEr.postValue(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function2 function2, ArbTradeViewModel arbTradeViewModel, ResponseData responseData) {
        ArbitragePriceSettingModel arbitragePriceSettingModel;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            function2.invoke(Boolean.TRUE, responseData.getMsg());
            TradeLiveData<ArbitragePriceSetting> tradeLiveData = arbTradeViewModel.iwGUEr;
            List list = (List) responseData.getData();
            tradeLiveData.postValue((list == null || (arbitragePriceSettingModel = (ArbitragePriceSettingModel) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) == null) ? null : arbitragePriceSettingModel.getUserStrategyConfig());
        } else {
            function2.invoke(Boolean.FALSE, responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(yHO yho, ResponseData responseData) {
        ArbitrageOrderResponse arbitrageOrderResponse;
        ArbitrageOrderResponse arbitrageOrderResponse2;
        Intrinsics.checkNotNullParameter(responseData, "");
        String sCode = null;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Boolean bool = Boolean.TRUE;
            List list = (List) responseData.getData();
            String sMsg = (list == null || (arbitrageOrderResponse2 = (ArbitrageOrderResponse) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) == null) ? null : arbitrageOrderResponse2.getSMsg();
            List list2 = (List) responseData.getData();
            if (list2 != null && (arbitrageOrderResponse = (ArbitrageOrderResponse) CollectionsKt___CollectionsKt.AkhnZx(list2, 0)) != null) {
                sCode = arbitrageOrderResponse.getSCode();
            }
            yho.invoke(bool, sMsg, sCode);
        } else {
            yho.invoke(Boolean.FALSE, responseData.getMsg(), null);
        }
        return Unit.INSTANCE;
    }
}
