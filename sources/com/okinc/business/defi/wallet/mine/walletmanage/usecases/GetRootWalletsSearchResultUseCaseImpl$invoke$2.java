package com.okinc.business.defi.wallet.mine.walletmanage.usecases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C17406fEd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.fDQ;
import o.fDU;

/* JADX INFO: loaded from: classes5.dex */
public final class GetRootWalletsSearchResultUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends fDU>>, Object> {
    final /* synthetic */ boolean $showTeeWalletStatus;
    int label;
    final /* synthetic */ C17406fEd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRootWalletsSearchResultUseCaseImpl$invoke$2(C17406fEd c17406fEd, boolean z, Continuation<? super GetRootWalletsSearchResultUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c17406fEd;
        this.$showTeeWalletStatus = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetRootWalletsSearchResultUseCaseImpl$invoke$2(this.this$0, this.$showTeeWalletStatus, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends fDU>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<fDU>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<fDU>> continuation) {
        return ((GetRootWalletsSearchResultUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(this.this$0.AEQbTJ, true, false, 2, null);
            this.label = 1;
            obj = RxAwaitKt.await(allRootWallets$default, this);
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
        Intrinsics.copydefault(list);
        C17406fEd c17406fEd = this.this$0;
        boolean z = this.$showTeeWalletStatus;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fDQ.copydefault((AbstractC12784ctX) it.next(), c17406fEd.KWHzl, z));
        }
        return arrayList;
    }
}
