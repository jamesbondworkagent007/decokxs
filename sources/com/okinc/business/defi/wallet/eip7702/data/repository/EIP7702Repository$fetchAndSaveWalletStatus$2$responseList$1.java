package com.okinc.business.defi.wallet.eip7702.data.repository;

import com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C15275eCh;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends EIP7702WalletStatusResp>>, Object> {
    final /* synthetic */ List<String> $walletIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C15275eCh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1(List<String> list, C15275eCh c15275eCh, Continuation<? super EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1> continuation) {
        super(2, continuation);
        this.$walletIds = list;
        this.this$0 = c15275eCh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1 eIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1 = new EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1(this.$walletIds, this.this$0, continuation);
        eIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1.L$0 = obj;
        return eIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends EIP7702WalletStatusResp>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<EIP7702WalletStatusResp>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<EIP7702WalletStatusResp>> continuation) {
        return ((EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List listValueOf = CollectionsKt___CollectionsKt.valueOf((Iterable) this.$walletIds, 50);
            C15275eCh c15275eCh = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            Iterator it = listValueOf.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1$deferred$1$1(c15275eCh, (List) it.next(), null), 3, null));
            }
            this.label = 1;
            obj = AwaitKt.awaitAll(arrayList, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((Iterable) obj).iterator();
        while (it2.hasNext()) {
            List list = (List) ((AbstractC43419rot) it2.next()).copydefault();
            if (list != null) {
                arrayList2.add(list);
            }
        }
        return C56403yEb.QOLQEE(arrayList2);
    }
}
