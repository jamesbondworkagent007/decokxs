package com.okinc.kline.features.contractinfo.ui.viewmodel;

import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C36123oQc;
import o.C37941pGj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.oPW;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ContractInfoViewModel$loadContractInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC54531xLw $biz;
    final /* synthetic */ MarketCoinInfo $marketCoinInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ContractInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractInfoViewModel$loadContractInfo$1(ContractInfoViewModel contractInfoViewModel, MarketCoinInfo marketCoinInfo, AbstractC54531xLw abstractC54531xLw, Continuation<? super ContractInfoViewModel$loadContractInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = contractInfoViewModel;
        this.$marketCoinInfo = marketCoinInfo;
        this.$biz = abstractC54531xLw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContractInfoViewModel$loadContractInfo$1 contractInfoViewModel$loadContractInfo$1 = new ContractInfoViewModel$loadContractInfo$1(this.this$0, this.$marketCoinInfo, this.$biz, continuation);
        contractInfoViewModel$loadContractInfo$1.L$0 = obj;
        return contractInfoViewModel$loadContractInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractInfoViewModel$loadContractInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        ContractInfoViewModel contractInfoViewModel;
        AbstractC54531xLw abstractC54531xLw;
        String instrumentType;
        MarketCoinInfo marketCoinInfo;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ContractInfoViewModel contractInfoViewModel2 = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.contractinfo.ui.viewmodel.ContractInfoViewModel$loadContractInfo$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj3) {
                    return ((C36123oQc) obj3).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj3, Object obj4) {
                    ((C36123oQc) obj3).copydefault((InterfaceC49371unL) obj4);
                }
            };
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (contractInfoViewModel2.KWHzl(anonymousClass1, actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    instrumentType = (String) this.L$4;
                    marketCoinInfo = (MarketCoinInfo) this.L$3;
                    abstractC54531xLw = (AbstractC54531xLw) this.L$2;
                    contractInfoViewModel = (ContractInfoViewModel) this.L$1;
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    contractInfoViewModel.EZpvd(abstractC54531xLw, contractInfoViewModel.gEmmrt);
                    if (!Intrinsics.EZpvd((Object) instrumentType, (Object) "OPTION")) {
                        contractInfoViewModel.AEQbTJ(marketCoinInfo.getInstrumentId(), instrumentType, contractInfoViewModel.gEmmrt);
                    }
                    if (Intrinsics.EZpvd((Object) instrumentType, (Object) "MARGIN")) {
                        contractInfoViewModel.OLrzqt(marketCoinInfo.getInstrumentId(), instrumentType);
                        contractInfoViewModel.copydefault(marketCoinInfo.getInstrumentId(), instrumentType);
                        contractInfoViewModel.OLrzqt(marketCoinInfo.getInstrumentId());
                    }
                    ContractInfoViewModel contractInfoViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("ContractInfoViewModel", "loadContractInfo failed", thM7380exceptionOrNullimpl);
                        ContractInfoViewModel$loadContractInfo$1$4$1 contractInfoViewModel$loadContractInfo$1$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.contractinfo.ui.viewmodel.ContractInfoViewModel$loadContractInfo$1$4$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj3) {
                                return ((C36123oQc) obj3).AEQbTJ();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj3, Object obj4) {
                                ((C36123oQc) obj3).copydefault((InterfaceC49371unL) obj4);
                            }
                        };
                        InterfaceC49371unL.Application application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        if (contractInfoViewModel3.KWHzl(contractInfoViewModel$loadContractInfo$1$4$1, application2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((oPW.Application) obj);
                obj2 = objM7377constructorimpl;
                contractInfoViewModel = this.this$0;
                abstractC54531xLw = this.$biz;
                MarketCoinInfo marketCoinInfo2 = this.$marketCoinInfo;
                if (Result.m7384isSuccessimpl(obj2)) {
                    oPW.Application application3 = (oPW.Application) obj2;
                    contractInfoViewModel.gEmmrt = application3.KWHzl();
                    contractInfoViewModel.DbNXlk = application3.AEQbTJ();
                    contractInfoViewModel.copydefault = application3.EZpvd();
                    contractInfoViewModel.valueOf = abstractC54531xLw != null ? abstractC54531xLw.valueOf(marketCoinInfo2.getInstrumentId()) : null;
                    if (Intrinsics.EZpvd((Object) marketCoinInfo2.getInstrumentType(), (Object) "SPOT")) {
                        instrumentType = C37941pGj.EZpvd(contractInfoViewModel.valueOf);
                    } else {
                        instrumentType = marketCoinInfo2.getInstrumentType();
                    }
                    ContractInfoViewModel$loadContractInfo$1$3$1 contractInfoViewModel$loadContractInfo$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.contractinfo.ui.viewmodel.ContractInfoViewModel$loadContractInfo$1$3$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj3) {
                            return ((C36123oQc) obj3).AEQbTJ();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj3, Object obj4) {
                            ((C36123oQc) obj3).copydefault((InterfaceC49371unL) obj4);
                        }
                    };
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(contractInfoViewModel.copydefault);
                    this.L$0 = obj2;
                    this.L$1 = contractInfoViewModel;
                    this.L$2 = abstractC54531xLw;
                    this.L$3 = marketCoinInfo2;
                    this.L$4 = instrumentType;
                    this.label = 3;
                    if (contractInfoViewModel.KWHzl(contractInfoViewModel$loadContractInfo$1$3$1, activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    marketCoinInfo = marketCoinInfo2;
                    contractInfoViewModel.EZpvd(abstractC54531xLw, contractInfoViewModel.gEmmrt);
                    if (!Intrinsics.EZpvd((Object) instrumentType, (Object) "OPTION")) {
                    }
                    if (Intrinsics.EZpvd((Object) instrumentType, (Object) "MARGIN")) {
                    }
                }
                ContractInfoViewModel contractInfoViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        ContractInfoViewModel contractInfoViewModel4 = this.this$0;
        MarketCoinInfo marketCoinInfo3 = this.$marketCoinInfo;
        AbstractC54531xLw abstractC54531xLw2 = this.$biz;
        Result.Application application4 = Result.Companion;
        oPW opw = contractInfoViewModel4.AYXKKw;
        oPW.ActionBar actionBar2 = new oPW.ActionBar(marketCoinInfo3, abstractC54531xLw2);
        this.L$0 = null;
        this.label = 2;
        obj = opw.EZpvd(actionBar2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((oPW.Application) obj);
        obj2 = objM7377constructorimpl;
        contractInfoViewModel = this.this$0;
        abstractC54531xLw = this.$biz;
        MarketCoinInfo marketCoinInfo22 = this.$marketCoinInfo;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        ContractInfoViewModel contractInfoViewModel322 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
