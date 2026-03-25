package com.okinc.business.defi.wallet.home.addressDetail.ui;

import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC16580emc;
import o.C15878eYq;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileAssetCoinDetailFragment$observeTxHistoryData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15878eYq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetCoinDetailFragment$observeTxHistoryData$1(C15878eYq c15878eYq, Continuation<? super ProfileAssetCoinDetailFragment$observeTxHistoryData$1> continuation) {
        super(2, continuation);
        this.this$0 = c15878eYq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetCoinDetailFragment$observeTxHistoryData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetCoinDetailFragment$observeTxHistoryData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<AddressTokenAsset, List<? extends AddressCoinHistoryDetail>, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AddressTokenAsset addressTokenAsset, List<AddressCoinHistoryDetail> list, Continuation<? super Unit> continuation) {
            return new AnonymousClass1(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(AddressTokenAsset addressTokenAsset, List<? extends AddressCoinHistoryDetail> list, Continuation<? super Unit> continuation) {
            return invoke2(addressTokenAsset, (List<AddressCoinHistoryDetail>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowCombine = FlowKt.flowCombine(this.this$0.OLrzqt().AEQbTJ(), this.this$0.OLrzqt().OLrzqt(), new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowCombine, anonymousClass2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C15878eYq this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C15878eYq c15878eYq, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c15878eYq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC16580emc abstractC16580emc = this.this$0.values;
                AbstractC16580emc abstractC16580emc2 = null;
                if (abstractC16580emc == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16580emc = null;
                }
                abstractC16580emc.DbNXlk.AEQbTJ();
                AbstractC16580emc abstractC16580emc3 = this.this$0.values;
                if (abstractC16580emc3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16580emc2 = abstractC16580emc3;
                }
                abstractC16580emc2.DbNXlk.valueOf();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
