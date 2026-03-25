package com.okinc.business.defi.wallet.transaction;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractActivityC17933fXr;
import o.AbstractC58260yxt;
import o.C10639bsJ;
import o.C10854bwM;
import o.C10954byG;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseTransactionActivity$handleTransaction$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C10854bwM $chainMeta;
    final /* synthetic */ C10854bwM $this_apply;
    final /* synthetic */ OKWBaseTransaction<?> $transaction;
    int I$0;
    int label;
    final /* synthetic */ AbstractActivityC17933fXr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionActivity$handleTransaction$1$3$1(C10854bwM c10854bwM, AbstractActivityC17933fXr abstractActivityC17933fXr, C10854bwM c10854bwM2, OKWBaseTransaction<?> oKWBaseTransaction, Continuation<? super BaseTransactionActivity$handleTransaction$1$3$1> continuation) {
        super(2, continuation);
        this.$this_apply = c10854bwM;
        this.this$0 = abstractActivityC17933fXr;
        this.$chainMeta = c10854bwM2;
        this.$transaction = oKWBaseTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionActivity$handleTransaction$1$3$1(this.$this_apply, this.this$0, this.$chainMeta, this.$transaction, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionActivity$handleTransaction$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            i = C10954byG.EZpvd.valueOf().AEQbTJ(this.$this_apply.isConnected()) != null ? 1 : 0;
            AbstractC58260yxt<List<CustomChainMeta>> abstractC58260yxtOLrzqt = C10639bsJ.EZpvd.OLrzqt();
            this.I$0 = i;
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            i = this.I$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        Intrinsics.copydefault(list);
        C10854bwM c10854bwM = this.$this_apply;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            CustomChainCoinMeta customChainCoinMetaDjBIcL = ((CustomChainMeta) obj2).djBIcL();
            if (customChainCoinMetaDjBIcL != null && customChainCoinMetaDjBIcL.DbNXlk() == c10854bwM.isConnected()) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (i == 0 && arrayList.size() == 1) {
            return Unit.INSTANCE;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$chainMeta, i != 0, arrayList, this.$transaction, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transaction.BaseTransactionActivity$handleTransaction$1$3$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C10854bwM $chainMeta;
        final /* synthetic */ List<CustomChainMeta> $filterList;
        final /* synthetic */ boolean $hasPlatformChain;
        final /* synthetic */ OKWBaseTransaction<?> $transaction;
        int label;
        final /* synthetic */ AbstractActivityC17933fXr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractActivityC17933fXr abstractActivityC17933fXr, C10854bwM c10854bwM, boolean z, List<CustomChainMeta> list, OKWBaseTransaction<?> oKWBaseTransaction, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = abstractActivityC17933fXr;
            this.$chainMeta = c10854bwM;
            this.$hasPlatformChain = z;
            this.$filterList = list;
            this.$transaction = oKWBaseTransaction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$chainMeta, this.$hasPlatformChain, this.$filterList, this.$transaction, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault(this.$chainMeta, this.$hasPlatformChain, this.$filterList, this.$transaction);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
