package com.okinc.business.defi.wallet.switchComponent.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12784ctX;
import o.C17781fSa;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC17773fRt;
import o.fRA;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchViewModel$getAllSupportedRootWallets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AbstractC12784ctX>>, Object> {
    int label;
    final /* synthetic */ C17781fSa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchViewModel$getAllSupportedRootWallets$2(C17781fSa c17781fSa, Continuation<? super WalletSwitchViewModel$getAllSupportedRootWallets$2> continuation) {
        super(2, continuation);
        this.this$0 = c17781fSa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSwitchViewModel$getAllSupportedRootWallets$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AbstractC12784ctX>> continuation) {
        return ((WalletSwitchViewModel$getAllSupportedRootWallets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC17773fRt interfaceC17773fRt = this.this$0.AwvSrB;
            this.label = 1;
            obj = interfaceC17773fRt.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        C17781fSa c17781fSa = this.this$0;
        c17781fSa.fetchVPNInfo = c17781fSa.OLrzqt((List<? extends AbstractC12784ctX>) list);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (fRA.OLrzqt.AEQbTJ((AbstractC12784ctX) obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
