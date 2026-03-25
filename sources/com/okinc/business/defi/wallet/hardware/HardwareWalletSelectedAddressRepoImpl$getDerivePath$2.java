package com.okinc.business.defi.wallet.hardware;

import com.okinc.wallet.core.other.ChainInfo;
import com.okinc.wallet.core.other.DerivePath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C15372eFx;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectedAddressRepoImpl$getDerivePath$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends DerivePath>>, Object> {
    final /* synthetic */ List<Integer> $addressTypeList;
    final /* synthetic */ long $factionChainId;
    final /* synthetic */ int $fromIndex;
    final /* synthetic */ int $toIndex;
    int label;
    final /* synthetic */ C15372eFx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectedAddressRepoImpl$getDerivePath$2(long j, List<Integer> list, int i, int i2, C15372eFx c15372eFx, Continuation<? super HardwareWalletSelectedAddressRepoImpl$getDerivePath$2> continuation) {
        super(2, continuation);
        this.$factionChainId = j;
        this.$addressTypeList = list;
        this.$fromIndex = i;
        this.$toIndex = i2;
        this.this$0 = c15372eFx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectedAddressRepoImpl$getDerivePath$2(this.$factionChainId, this.$addressTypeList, this.$fromIndex, this.$toIndex, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DerivePath>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<DerivePath>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<DerivePath>> continuation) {
        return ((HardwareWalletSelectedAddressRepoImpl$getDerivePath$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.OLrzqt(">>>ledger getDerivePath params: factionChainId:" + this.$factionChainId + " - addressTypeList:" + CollectionsKt___CollectionsKt.joinToString$default(this.$addressTypeList, "-", null, null, 0, null, null, 62, null) + " - fromIndex:" + this.$fromIndex + " - toIndex:" + this.$toIndex + " ");
            ArrayList arrayList = new ArrayList();
            for (int i = this.$fromIndex; i < this.$toIndex; i++) {
                List<Integer> list = this.$addressTypeList;
                long j = this.$factionChainId;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ChainInfo(j, i, ((Number) it.next()).intValue()));
                }
            }
            return this.this$0.OLrzqt.OLrzqt(arrayList);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
