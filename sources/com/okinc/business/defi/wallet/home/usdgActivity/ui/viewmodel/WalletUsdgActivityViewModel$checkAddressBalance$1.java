package com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel;

import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.SupportChainAddressBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC12782ctV;
import o.AbstractC18226feR;
import o.C10525bqB;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletUsdgActivityViewModel$checkAddressBalance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WalletUsdgActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUsdgActivityViewModel$checkAddressBalance$1(WalletUsdgActivityViewModel walletUsdgActivityViewModel, Continuation<? super WalletUsdgActivityViewModel$checkAddressBalance$1> continuation) {
        super(2, continuation);
        this.this$0 = walletUsdgActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletUsdgActivityViewModel$checkAddressBalance$1 walletUsdgActivityViewModel$checkAddressBalance$1 = new WalletUsdgActivityViewModel$checkAddressBalance$1(this.this$0, continuation);
        walletUsdgActivityViewModel$checkAddressBalance$1.L$0 = obj;
        return walletUsdgActivityViewModel$checkAddressBalance$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletUsdgActivityViewModel$checkAddressBalance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        boolean z;
        List<C10525bqB> listAYXKKw;
        C10525bqB c10525bqB;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            WalletUsdgActivityViewModel walletUsdgActivityViewModel = this.this$0;
            try {
                Result.Application application = Result.Companion;
                List<SupportChainAddressBean> value = walletUsdgActivityViewModel.AhwBna().getValue();
                if (value.isEmpty()) {
                    value = walletUsdgActivityViewModel.copydefault(walletUsdgActivityViewModel.valueOf(), (List<Long>) walletUsdgActivityViewModel.AkhnZx());
                }
                ArrayList arrayList = new ArrayList();
                for (SupportChainAddressBean supportChainAddressBean : value) {
                    AbstractC12782ctV abstractC12782ctVValueOf = walletUsdgActivityViewModel.valueOf();
                    String strCopydefault = (abstractC12782ctVValueOf == null || (listAYXKKw = abstractC12782ctVValueOf.AYXKKw(supportChainAddressBean.getCoinId())) == null || (c10525bqB = (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw)) == null) ? null : c10525bqB.copydefault();
                    if (strCopydefault != null) {
                        arrayList.add(strCopydefault);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (C33129mqd.AEQbTJ((String) it.next(), "0")) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("WalletUsdgActivityViewModel", "checkAddressBalance_fail", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = C56443yFo.KWHzl(true);
            }
            boolean zBooleanValue = ((Boolean) objM7377constructorimpl).booleanValue();
            MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
            AbstractC18226feR.StateListAnimator stateListAnimator = new AbstractC18226feR.StateListAnimator(zBooleanValue);
            this.label = 1;
            if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
