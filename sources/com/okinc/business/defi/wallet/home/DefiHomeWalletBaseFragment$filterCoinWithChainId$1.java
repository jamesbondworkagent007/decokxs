package com.okinc.business.defi.wallet.home;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C15625ePg;
import o.C56391yDq;
import o.C56442yFn;
import o.eUG;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletBaseFragment$filterCoinWithChainId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ ArrayList<eUG> $list;
    int label;
    final /* synthetic */ C15625ePg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletBaseFragment$filterCoinWithChainId$1(long j, ArrayList<eUG> arrayList, C15625ePg c15625ePg, Continuation<? super DefiHomeWalletBaseFragment$filterCoinWithChainId$1> continuation) {
        super(2, continuation);
        this.$chainId = j;
        this.$list = arrayList;
        this.this$0 = c15625ePg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletBaseFragment$filterCoinWithChainId$1(this.$chainId, this.$list, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeWalletBaseFragment$filterCoinWithChainId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$chainId != Long.MIN_VALUE) {
                List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.$list);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1 defiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1 = new DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1(this.$chainId, this.this$0, listAxsJAYsNCnLh, null);
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, defiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                ArrayList<eUG> arrayList = this.$list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!((eUG) obj2).zsXlph()) {
                        arrayList2.add(obj2);
                    }
                }
                this.this$0.EZpvd((ArrayList<eUG>) arrayList2);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.EZpvd((ArrayList<eUG>) obj);
        return Unit.INSTANCE;
    }
}
