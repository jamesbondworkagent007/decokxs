package com.okinc.business.defi.wallet.tee.repository;

import com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusResp;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702StatusItem;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C59467zhb;
import o.fVG;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TeeAndEip7702StatusItem>>, Object> {
    final /* synthetic */ List<TeeAndEip7702Item> $reqList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ fVG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1(List<TeeAndEip7702Item> list, fVG fvg, Continuation<? super TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1> continuation) {
        super(2, continuation);
        this.$reqList = list;
        this.this$0 = fvg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1 teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1 = new TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1(this.$reqList, this.this$0, continuation);
        teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1.L$0 = obj;
        return teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends TeeAndEip7702StatusItem>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<TeeAndEip7702StatusItem>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<TeeAndEip7702StatusItem>> continuation) {
        return ((TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List listValueOf = CollectionsKt___CollectionsKt.valueOf((Iterable) this.$reqList, 50);
            fVG fvg = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            Iterator it = listValueOf.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1$1$1(fvg, (List) it.next(), null), 3, null));
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
        Sequence sequenceAkhnZx = C59467zhb.AkhnZx(C59467zhb.fJNWhG(CollectionsKt___CollectionsKt.QVAiDq((Iterable) obj), new Function1() { // from class: o.fVH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1.invokeSuspend$lambda$1((AbstractC43419rot) obj2);
            }
        }), new Function1() { // from class: o.fVO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ((TeeAnd7702WalletStatusResp) obj2).getStatusList();
            }
        });
        final fVG fvg2 = this.this$0;
        return C59467zhb.zuBGHE(C59467zhb.fIwbmz(sequenceAkhnZx, new Function1() { // from class: o.fVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1.invokeSuspend$lambda$3(fvg2, (TeeAndEip7702StatusItem) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TeeAnd7702WalletStatusResp invokeSuspend$lambda$1(AbstractC43419rot abstractC43419rot) {
        return (TeeAnd7702WalletStatusResp) abstractC43419rot.copydefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(fVG fvg, TeeAndEip7702StatusItem teeAndEip7702StatusItem) {
        if (teeAndEip7702StatusItem.getEip7702Status() != null) {
            teeAndEip7702StatusItem.getEip7702Status().setStatus(fvg.copydefault(teeAndEip7702StatusItem.getEip7702Status().getChainAddressInfoList()));
        }
        return Unit.INSTANCE;
    }
}
