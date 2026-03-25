package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.tee.domain.model.VerifySignInfo;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CreateOrderResult;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel$confirmEdit$1;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.network.okg.response.OKServerException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC19873gSm;
import o.C19875gSo;
import o.C22416heu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19870gSj;
import o.InterfaceC19871gSk;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyViewModel$confirmEdit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ BuySettings $buySettings;
    final /* synthetic */ boolean $forceManualSign;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback;
    final /* synthetic */ SellSettings $sellSettings;
    final /* synthetic */ String $strategyName;
    final /* synthetic */ TokenFilter $tokenFilter;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CopyTradingEditStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyViewModel$confirmEdit$1(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, String str, BuySettings buySettings, SellSettings sellSettings, TokenFilter tokenFilter, FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription, Continuation<? super CopyTradingEditStrategyViewModel$confirmEdit$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyViewModel;
        this.$strategyName = str;
        this.$buySettings = buySettings;
        this.$sellSettings = sellSettings;
        this.$tokenFilter = tokenFilter;
        this.$activity = fragmentActivity;
        this.$forceManualSign = z;
        this.$loadingCallback = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyViewModel$confirmEdit$1(this.this$0, this.$strategyName, this.$buySettings, this.$sellSettings, this.$tokenFilter, this.$activity, this.$forceManualSign, this.$loadingCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyViewModel$confirmEdit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0380 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0295 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        String strOLrzqt;
        Object objEZpvd;
        String str;
        Long timeMills;
        AbstractC19873gSm abstractC19873gSm;
        CopyTradingStrategy copyTradingStrategyEZpvd;
        Object objOLrzqt;
        Object objKWHzl;
        Object obj2;
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel;
        SellSettings sellSettings;
        TokenFilter tokenFilter;
        CreateOrderResult createOrderResult;
        InterfaceC19871gSk interfaceC19871gSk;
        String strEZpvd;
        TokenFilter tokenFilter2;
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel2;
        Object obj3;
        InterfaceC19871gSk interfaceC19871gSk2;
        String strEZpvd2;
        Object obj4;
        Throwable thM7380exceptionOrNullimpl;
        CopyTradingStrategy copyTradingStrategy;
        Object obj5;
        SellSettings sellSettings2;
        CopyTradingStrategy copyTradingStrategy2;
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel3;
        TokenFilter tokenFilter3;
        InterfaceC19871gSk interfaceC19871gSk3;
        String strEZpvd3;
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel4;
        TokenFilter tokenFilter4;
        Object obj6;
        CopyTradingStrategy copyTradingStrategy3;
        InterfaceC19871gSk interfaceC19871gSk4;
        String strEZpvd4;
        Throwable thM7380exceptionOrNullimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                List<ExpireTimeConfig> listAkhnZx = this.this$0.AkhnZx();
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel5 = this.this$0;
                Iterator<T> it = listAkhnZx.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        String id = ((ExpireTimeConfig) next).getId();
                        ExpireTimeData expireTimeDataAYXKKw = copyTradingEditStrategyViewModel5.AYXKKw();
                        if (Intrinsics.EZpvd((Object) id, (Object) (expireTimeDataAYXKKw != null ? expireTimeDataAYXKKw.EZpvd() : null))) {
                        }
                    } else {
                        next = null;
                    }
                }
                ExpireTimeConfig expireTimeConfig = (ExpireTimeConfig) next;
                if (expireTimeConfig == null || (timeMills = expireTimeConfig.getTimeMills()) == null || (strOLrzqt = timeMills.toString()) == null) {
                    ExpireTimeData expireTimeDataAYXKKw2 = this.this$0.AYXKKw();
                    strOLrzqt = expireTimeDataAYXKKw2 != null ? expireTimeDataAYXKKw2.OLrzqt() : null;
                }
                C19875gSo c19875gSo = this.this$0.AwvSrB;
                String strEZpvd5 = this.this$0.EZpvd();
                String strKWHzl = this.this$0.DTwDnp.KWHzl(this.this$0.EZpvd());
                String strAhwBna = this.this$0.AhwBna();
                String str2 = strAhwBna == null ? "" : strAhwBna;
                String str3 = this.$strategyName;
                BuySettings buySettings = this.$buySettings;
                SellSettings sellSettings3 = this.$sellSettings;
                TokenFilter tokenFilter5 = this.$tokenFilter;
                ServiceFeeInfo value = this.this$0.fetchVPNInfo().getValue();
                if (value == null) {
                    value = new ServiceFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
                }
                ServiceFeeInfo serviceFeeInfo = value;
                String str4 = strOLrzqt == null ? "" : strOLrzqt;
                ExpireTimeData expireTimeDataAYXKKw3 = this.this$0.AYXKKw();
                String strEZpvd6 = expireTimeDataAYXKKw3 != null ? expireTimeDataAYXKKw3.EZpvd() : null;
                CopyTradingStrategy copyTradingStrategy4 = new CopyTradingStrategy((String) null, strEZpvd5, (VerifySignInfo) null, (String) null, strKWHzl, str2, str3, buySettings, sellSettings3, tokenFilter5, serviceFeeInfo, (String) null, (String) null, str4, strEZpvd6 == null ? "" : strEZpvd6, (!this.this$0.uzCIH() || (str = this.this$0.sSMYrx) == null) ? "" : str, C22416heu.getFieldNames(), 6157, (DefaultConstructorMarker) null);
                FragmentActivity fragmentActivity = this.$activity;
                boolean zKWHzl = this.this$0.AYXKKw.KWHzl(this.$forceManualSign, true, true);
                InterfaceC9740bbL.TaskDescription taskDescription = this.$loadingCallback;
                this.label = 1;
                objEZpvd = c19875gSo.EZpvd(copyTradingStrategy4, fragmentActivity, zKWHzl, taskDescription, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                abstractC19873gSm = (AbstractC19873gSm) objEZpvd;
                if (!Intrinsics.EZpvd(abstractC19873gSm, AbstractC19873gSm.StateListAnimator.EZpvd)) {
                    return Unit.INSTANCE;
                }
                AbstractC19873gSm.Activity activity = AbstractC19873gSm.Activity.copydefault;
                if (Intrinsics.EZpvd(abstractC19873gSm, activity)) {
                    Channel channel = this.this$0.AhwBna;
                    this.label = 2;
                    if (channel.send(activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (abstractC19873gSm instanceof AbstractC19873gSm.TaskDescription) {
                    this.this$0.zLjUOn.EZpvd(this.this$0.EZpvd());
                    copyTradingStrategyEZpvd = ((AbstractC19873gSm.TaskDescription) abstractC19873gSm).EZpvd();
                    if (!this.this$0.uzCIH()) {
                        InterfaceC19871gSk interfaceC19871gSk5 = this.this$0.AubY;
                        this.label = 3;
                        objKWHzl = interfaceC19871gSk5.KWHzl(copyTradingStrategyEZpvd, this);
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objKWHzl;
                        copyTradingEditStrategyViewModel = this.this$0;
                        BuySettings buySettings2 = this.$buySettings;
                        sellSettings = this.$sellSettings;
                        tokenFilter = this.$tokenFilter;
                        if (Result.m7384isSuccessimpl(obj2)) {
                            CreateOrderResult createOrderResult2 = (CreateOrderResult) obj2;
                            InterfaceC19871gSk interfaceC19871gSk6 = copyTradingEditStrategyViewModel.AubY;
                            String strEZpvd7 = copyTradingEditStrategyViewModel.EZpvd();
                            this.L$0 = obj2;
                            this.L$1 = copyTradingEditStrategyViewModel;
                            this.L$2 = sellSettings;
                            this.L$3 = tokenFilter;
                            this.L$4 = createOrderResult2;
                            this.label = 4;
                            if (interfaceC19871gSk6.KWHzl(strEZpvd7, buySettings2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            createOrderResult = createOrderResult2;
                            interfaceC19871gSk = copyTradingEditStrategyViewModel.AubY;
                            strEZpvd = copyTradingEditStrategyViewModel.EZpvd();
                            this.L$0 = obj2;
                            this.L$1 = copyTradingEditStrategyViewModel;
                            this.L$2 = tokenFilter;
                            this.L$3 = createOrderResult;
                            this.L$4 = null;
                            this.label = 5;
                            if (interfaceC19871gSk.AEQbTJ(strEZpvd, sellSettings, this) != objCopydefault) {
                                return objCopydefault;
                            }
                            tokenFilter2 = tokenFilter;
                            copyTradingEditStrategyViewModel2 = copyTradingEditStrategyViewModel;
                            obj3 = obj2;
                            interfaceC19871gSk2 = copyTradingEditStrategyViewModel2.AubY;
                            strEZpvd2 = copyTradingEditStrategyViewModel2.EZpvd();
                            this.L$0 = obj3;
                            this.L$1 = copyTradingEditStrategyViewModel2;
                            this.L$2 = createOrderResult;
                            this.L$3 = null;
                            this.label = 6;
                            if (interfaceC19871gSk2.EZpvd(strEZpvd2, tokenFilter2, this) != objCopydefault) {
                                return objCopydefault;
                            }
                            obj4 = obj3;
                            copyTradingEditStrategyViewModel2.copydefault.setValue(new InterfaceC19870gSj.Activity(createOrderResult.getStrategyId()));
                            pUU.KWHzl("CopyTradingEditStrategyViewModel", "create copy trade success");
                            copyTradingEditStrategyViewModel2.uzCIH.EZpvd();
                            obj2 = obj4;
                        }
                        final CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel6 = this.this$0;
                        final String str5 = this.$strategyName;
                        final BuySettings buySettings3 = this.$buySettings;
                        final SellSettings sellSettings4 = this.$sellSettings;
                        final TokenFilter tokenFilter6 = this.$tokenFilter;
                        final FragmentActivity fragmentActivity2 = this.$activity;
                        final InterfaceC9740bbL.TaskDescription taskDescription2 = this.$loadingCallback;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.AEQbTJ("CopyTradingEditStrategyViewModel", "create copy trade failure", thM7380exceptionOrNullimpl);
                            OrderRetryHelper.handleErrorWithRetry$default(copyTradingEditStrategyViewModel6.uzCIH, thM7380exceptionOrNullimpl, new Function1() { // from class: o.gTW
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj7) {
                                    return CopyTradingEditStrategyViewModel$confirmEdit$1.invokeSuspend$lambda$4$lambda$2(copyTradingEditStrategyViewModel6, str5, buySettings3, sellSettings4, tokenFilter6, fragmentActivity2, taskDescription2, ((java.lang.Boolean) obj7).booleanValue());
                                }
                            }, new Function1() { // from class: o.gTY
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj7) {
                                    return CopyTradingEditStrategyViewModel$confirmEdit$1.invokeSuspend$lambda$4$lambda$3(copyTradingEditStrategyViewModel6, (java.lang.Throwable) obj7);
                                }
                            }, "RETRY -> createCopyTrade failed", null, 16, null);
                        }
                        Result.m7376boximpl(obj2);
                        return Unit.INSTANCE;
                    }
                    InterfaceC19871gSk interfaceC19871gSk7 = this.this$0.AubY;
                    this.L$0 = copyTradingStrategyEZpvd;
                    this.label = 7;
                    objOLrzqt = interfaceC19871gSk7.OLrzqt(copyTradingStrategyEZpvd, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    copyTradingStrategy = copyTradingStrategyEZpvd;
                    obj5 = objOLrzqt;
                    CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel7 = this.this$0;
                    BuySettings buySettings4 = this.$buySettings;
                    sellSettings2 = this.$sellSettings;
                    TokenFilter tokenFilter7 = this.$tokenFilter;
                    if (!Result.m7384isSuccessimpl(obj5)) {
                        copyTradingEditStrategyViewModel7.copydefault.setValue(new InterfaceC19870gSj.Activity(copyTradingStrategy.getStrategyId()));
                        InterfaceC19871gSk interfaceC19871gSk8 = copyTradingEditStrategyViewModel7.AubY;
                        String strEZpvd8 = copyTradingEditStrategyViewModel7.EZpvd();
                        this.L$0 = copyTradingStrategy;
                        this.L$1 = obj5;
                        this.L$2 = copyTradingEditStrategyViewModel7;
                        this.L$3 = sellSettings2;
                        this.L$4 = tokenFilter7;
                        this.label = 8;
                        if (interfaceC19871gSk8.KWHzl(strEZpvd8, buySettings4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        copyTradingEditStrategyViewModel3 = copyTradingEditStrategyViewModel7;
                        tokenFilter3 = tokenFilter7;
                        interfaceC19871gSk3 = copyTradingEditStrategyViewModel3.AubY;
                        strEZpvd3 = copyTradingEditStrategyViewModel3.EZpvd();
                        this.L$0 = copyTradingStrategy;
                        this.L$1 = obj5;
                        this.L$2 = copyTradingEditStrategyViewModel3;
                        this.L$3 = tokenFilter3;
                        this.L$4 = null;
                        this.label = 9;
                        if (interfaceC19871gSk3.AEQbTJ(strEZpvd3, sellSettings2, this) != objCopydefault) {
                            return objCopydefault;
                        }
                        copyTradingEditStrategyViewModel4 = copyTradingEditStrategyViewModel3;
                        tokenFilter4 = tokenFilter3;
                        obj6 = obj5;
                        copyTradingStrategy3 = copyTradingStrategy;
                        interfaceC19871gSk4 = copyTradingEditStrategyViewModel4.AubY;
                        strEZpvd4 = copyTradingEditStrategyViewModel4.EZpvd();
                        this.L$0 = copyTradingStrategy3;
                        this.L$1 = obj6;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 10;
                        if (interfaceC19871gSk4.EZpvd(strEZpvd4, tokenFilter4, this) != objCopydefault) {
                            return objCopydefault;
                        }
                        copyTradingStrategy2 = copyTradingStrategy3;
                        pUU.KWHzl("CopyTradingEditStrategyViewModel", "modify copy trade " + copyTradingStrategy2.getStrategyId() + " success");
                        obj2 = obj6;
                        final CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel8 = this.this$0;
                        final String str6 = this.$strategyName;
                        final BuySettings buySettings5 = this.$buySettings;
                        final SellSettings sellSettings5 = this.$sellSettings;
                        final TokenFilter tokenFilter8 = this.$tokenFilter;
                        final FragmentActivity fragmentActivity3 = this.$activity;
                        final InterfaceC9740bbL.TaskDescription taskDescription3 = this.$loadingCallback;
                        thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                        if (thM7380exceptionOrNullimpl2 != null) {
                            pUU.KWHzl("CopyTradingEditStrategyViewModel", "modify copy trade " + copyTradingStrategy2.getStrategyId() + " failure", thM7380exceptionOrNullimpl2);
                            OrderRetryHelper.handleErrorWithRetry$default(copyTradingEditStrategyViewModel8.uzCIH, thM7380exceptionOrNullimpl2, new Function1() { // from class: o.gTU
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj7) {
                                    return CopyTradingEditStrategyViewModel$confirmEdit$1.invokeSuspend$lambda$8$lambda$6(copyTradingEditStrategyViewModel8, str6, buySettings5, sellSettings5, tokenFilter8, fragmentActivity3, taskDescription3, ((java.lang.Boolean) obj7).booleanValue());
                                }
                            }, new Function1() { // from class: o.gTX
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj7) {
                                    return CopyTradingEditStrategyViewModel$confirmEdit$1.invokeSuspend$lambda$8$lambda$7(copyTradingEditStrategyViewModel8, (java.lang.Throwable) obj7);
                                }
                            }, "RETRY -> modifyCopyTrade failed", null, 16, null);
                        }
                        Result.m7376boximpl(obj2);
                        return Unit.INSTANCE;
                    }
                    copyTradingStrategy2 = copyTradingStrategy;
                    obj2 = obj5;
                    final CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel82 = this.this$0;
                    final String str62 = this.$strategyName;
                    final BuySettings buySettings52 = this.$buySettings;
                    final SellSettings sellSettings52 = this.$sellSettings;
                    final TokenFilter tokenFilter82 = this.$tokenFilter;
                    final FragmentActivity fragmentActivity32 = this.$activity;
                    final InterfaceC9740bbL.TaskDescription taskDescription32 = this.$loadingCallback;
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl2 != null) {
                    }
                    Result.m7376boximpl(obj2);
                    return Unit.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                abstractC19873gSm = (AbstractC19873gSm) objEZpvd;
                if (!Intrinsics.EZpvd(abstractC19873gSm, AbstractC19873gSm.StateListAnimator.EZpvd)) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                obj2 = objKWHzl;
                copyTradingEditStrategyViewModel = this.this$0;
                BuySettings buySettings22 = this.$buySettings;
                sellSettings = this.$sellSettings;
                tokenFilter = this.$tokenFilter;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                final CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel62 = this.this$0;
                final String str52 = this.$strategyName;
                final BuySettings buySettings32 = this.$buySettings;
                final SellSettings sellSettings42 = this.$sellSettings;
                final TokenFilter tokenFilter62 = this.$tokenFilter;
                final FragmentActivity fragmentActivity22 = this.$activity;
                final InterfaceC9740bbL.TaskDescription taskDescription22 = this.$loadingCallback;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(obj2);
                return Unit.INSTANCE;
            case 4:
                createOrderResult = (CreateOrderResult) this.L$4;
                tokenFilter = (TokenFilter) this.L$3;
                sellSettings = (SellSettings) this.L$2;
                copyTradingEditStrategyViewModel = (CopyTradingEditStrategyViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                interfaceC19871gSk = copyTradingEditStrategyViewModel.AubY;
                strEZpvd = copyTradingEditStrategyViewModel.EZpvd();
                this.L$0 = obj2;
                this.L$1 = copyTradingEditStrategyViewModel;
                this.L$2 = tokenFilter;
                this.L$3 = createOrderResult;
                this.L$4 = null;
                this.label = 5;
                if (interfaceC19871gSk.AEQbTJ(strEZpvd, sellSettings, this) != objCopydefault) {
                }
                break;
            case 5:
                createOrderResult = (CreateOrderResult) this.L$3;
                TokenFilter tokenFilter9 = (TokenFilter) this.L$2;
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel9 = (CopyTradingEditStrategyViewModel) this.L$1;
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                tokenFilter2 = tokenFilter9;
                copyTradingEditStrategyViewModel2 = copyTradingEditStrategyViewModel9;
                interfaceC19871gSk2 = copyTradingEditStrategyViewModel2.AubY;
                strEZpvd2 = copyTradingEditStrategyViewModel2.EZpvd();
                this.L$0 = obj3;
                this.L$1 = copyTradingEditStrategyViewModel2;
                this.L$2 = createOrderResult;
                this.L$3 = null;
                this.label = 6;
                if (interfaceC19871gSk2.EZpvd(strEZpvd2, tokenFilter2, this) != objCopydefault) {
                }
                break;
            case 6:
                createOrderResult = (CreateOrderResult) this.L$2;
                copyTradingEditStrategyViewModel2 = (CopyTradingEditStrategyViewModel) this.L$1;
                obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                copyTradingEditStrategyViewModel2.copydefault.setValue(new InterfaceC19870gSj.Activity(createOrderResult.getStrategyId()));
                pUU.KWHzl("CopyTradingEditStrategyViewModel", "create copy trade success");
                copyTradingEditStrategyViewModel2.uzCIH.EZpvd();
                obj2 = obj4;
                final CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel622 = this.this$0;
                final String str522 = this.$strategyName;
                final BuySettings buySettings322 = this.$buySettings;
                final SellSettings sellSettings422 = this.$sellSettings;
                final TokenFilter tokenFilter622 = this.$tokenFilter;
                final FragmentActivity fragmentActivity222 = this.$activity;
                final InterfaceC9740bbL.TaskDescription taskDescription222 = this.$loadingCallback;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(obj2);
                return Unit.INSTANCE;
            case 7:
                copyTradingStrategyEZpvd = (CopyTradingStrategy) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                copyTradingStrategy = copyTradingStrategyEZpvd;
                obj5 = objOLrzqt;
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel72 = this.this$0;
                BuySettings buySettings42 = this.$buySettings;
                sellSettings2 = this.$sellSettings;
                TokenFilter tokenFilter72 = this.$tokenFilter;
                if (!Result.m7384isSuccessimpl(obj5)) {
                }
                break;
            case 8:
                tokenFilter3 = (TokenFilter) this.L$4;
                SellSettings sellSettings6 = (SellSettings) this.L$3;
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel10 = (CopyTradingEditStrategyViewModel) this.L$2;
                obj5 = this.L$1;
                copyTradingStrategy = (CopyTradingStrategy) this.L$0;
                C56391yDq.AEQbTJ(obj);
                sellSettings2 = sellSettings6;
                copyTradingEditStrategyViewModel3 = copyTradingEditStrategyViewModel10;
                interfaceC19871gSk3 = copyTradingEditStrategyViewModel3.AubY;
                strEZpvd3 = copyTradingEditStrategyViewModel3.EZpvd();
                this.L$0 = copyTradingStrategy;
                this.L$1 = obj5;
                this.L$2 = copyTradingEditStrategyViewModel3;
                this.L$3 = tokenFilter3;
                this.L$4 = null;
                this.label = 9;
                if (interfaceC19871gSk3.AEQbTJ(strEZpvd3, sellSettings2, this) != objCopydefault) {
                }
                break;
            case 9:
                TokenFilter tokenFilter10 = (TokenFilter) this.L$3;
                CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel11 = (CopyTradingEditStrategyViewModel) this.L$2;
                Object obj7 = this.L$1;
                copyTradingStrategy3 = (CopyTradingStrategy) this.L$0;
                C56391yDq.AEQbTJ(obj);
                tokenFilter4 = tokenFilter10;
                obj6 = obj7;
                copyTradingEditStrategyViewModel4 = copyTradingEditStrategyViewModel11;
                interfaceC19871gSk4 = copyTradingEditStrategyViewModel4.AubY;
                strEZpvd4 = copyTradingEditStrategyViewModel4.EZpvd();
                this.L$0 = copyTradingStrategy3;
                this.L$1 = obj6;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 10;
                if (interfaceC19871gSk4.EZpvd(strEZpvd4, tokenFilter4, this) != objCopydefault) {
                }
                break;
            case 10:
                obj6 = this.L$1;
                copyTradingStrategy2 = (CopyTradingStrategy) this.L$0;
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("CopyTradingEditStrategyViewModel", "modify copy trade " + copyTradingStrategy2.getStrategyId() + " success");
                obj2 = obj6;
                final CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel822 = this.this$0;
                final String str622 = this.$strategyName;
                final BuySettings buySettings522 = this.$buySettings;
                final SellSettings sellSettings522 = this.$sellSettings;
                final TokenFilter tokenFilter822 = this.$tokenFilter;
                final FragmentActivity fragmentActivity322 = this.$activity;
                final InterfaceC9740bbL.TaskDescription taskDescription322 = this.$loadingCallback;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                Result.m7376boximpl(obj2);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4$lambda$2(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, String str, BuySettings buySettings, SellSettings sellSettings, TokenFilter tokenFilter, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z) {
        copyTradingEditStrategyViewModel.KWHzl(str, buySettings, sellSettings, tokenFilter, fragmentActivity, z, taskDescription);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4$lambda$3(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, Throwable th) {
        MutableStateFlow mutableStateFlow = copyTradingEditStrategyViewModel.copydefault;
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        mutableStateFlow.setValue(new InterfaceC19870gSj.Application(oKServerException != null ? oKServerException.getMessage() : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8$lambda$6(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, String str, BuySettings buySettings, SellSettings sellSettings, TokenFilter tokenFilter, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z) {
        copyTradingEditStrategyViewModel.KWHzl(str, buySettings, sellSettings, tokenFilter, fragmentActivity, z, taskDescription);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$8$lambda$7(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, Throwable th) {
        MutableStateFlow mutableStateFlow = copyTradingEditStrategyViewModel.copydefault;
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        mutableStateFlow.setValue(new InterfaceC19870gSj.Application(oKServerException != null ? oKServerException.getMessage() : null));
        return Unit.INSTANCE;
    }
}
