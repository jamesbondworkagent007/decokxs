package com.okinc.business.defi.wallet.switchComponent.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC12784ctX;
import o.C17740fQn;
import o.C17776fRw;
import o.C17781fSa;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fDL;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchViewModel$fetchWalletList$1$data$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends fDL<? extends Object>>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C17781fSa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchViewModel$fetchWalletList$1$data$1(C17781fSa c17781fSa, Continuation<? super WalletSwitchViewModel$fetchWalletList$1$data$1> continuation) {
        super(2, continuation);
        this.this$0 = c17781fSa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSwitchViewModel$fetchWalletList$1$data$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends fDL<? extends Object>>> continuation) {
        return ((WalletSwitchViewModel$fetchWalletList$1$data$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List list2;
        int iEZpvd;
        MutableStateFlow mutableStateFlow;
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C17776fRw c17776fRw = this.this$0.fIwbmz;
            this.label = 1;
            obj = c17776fRw.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                list2 = (List) obj;
                iEZpvd = this.this$0.EZpvd((List<? extends fDL<? extends Object>>) list2);
                mutableStateFlow = this.this$0.gEmmrt;
                do {
                    value = mutableStateFlow.getValue();
                    ((Number) value).intValue();
                } while (!mutableStateFlow.compareAndSet(value, C56443yFo.AEQbTJ(iEZpvd)));
                if (list2.isEmpty()) {
                    C17781fSa c17781fSa = this.this$0;
                    return c17781fSa.OLrzqt(c17781fSa.fetchVPNInfo, iEZpvd, this.this$0.AhwBna());
                }
                C17781fSa c17781fSa2 = this.this$0;
                return c17781fSa2.KWHzl((List<? extends fDL<? extends Object>>) list2, c17781fSa2.fetchVPNInfo, iEZpvd);
            }
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C17781fSa c17781fSa3 = this.this$0;
            this.L$0 = null;
            this.label = 3;
            obj = c17781fSa3.OLrzqt((List<? extends AbstractC12784ctX>) list, (Continuation<? super List<C17740fQn>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            list2 = (List) obj;
            iEZpvd = this.this$0.EZpvd((List<? extends fDL<? extends Object>>) list2);
            mutableStateFlow = this.this$0.gEmmrt;
            do {
                value = mutableStateFlow.getValue();
                ((Number) value).intValue();
            } while (!mutableStateFlow.compareAndSet(value, C56443yFo.AEQbTJ(iEZpvd)));
            if (list2.isEmpty()) {
            }
        }
        list = (List) obj;
        C17781fSa c17781fSa4 = this.this$0;
        this.L$0 = list;
        this.label = 2;
        if (c17781fSa4.EZpvd((List<? extends AbstractC12784ctX>) list, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        C17781fSa c17781fSa32 = this.this$0;
        this.L$0 = null;
        this.label = 3;
        obj = c17781fSa32.OLrzqt((List<? extends AbstractC12784ctX>) list, (Continuation<? super List<C17740fQn>>) this);
        if (obj == objCopydefault) {
        }
        list2 = (List) obj;
        iEZpvd = this.this$0.EZpvd((List<? extends fDL<? extends Object>>) list2);
        mutableStateFlow = this.this$0.gEmmrt;
        do {
            value = mutableStateFlow.getValue();
            ((Number) value).intValue();
        } while (!mutableStateFlow.compareAndSet(value, C56443yFo.AEQbTJ(iEZpvd)));
        if (list2.isEmpty()) {
        }
    }
}
