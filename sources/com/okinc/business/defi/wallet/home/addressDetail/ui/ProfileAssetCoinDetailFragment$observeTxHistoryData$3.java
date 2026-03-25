package com.okinc.business.defi.wallet.home.addressDetail.ui;

import androidx.fragment.app.Fragment;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC16580emc;
import o.C14316djE;
import o.C14318djG;
import o.C15878eYq;
import o.C33064mpR;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileAssetCoinDetailFragment$observeTxHistoryData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15878eYq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetCoinDetailFragment$observeTxHistoryData$3(C15878eYq c15878eYq, Continuation<? super ProfileAssetCoinDetailFragment$observeTxHistoryData$3> continuation) {
        super(2, continuation);
        this.this$0 = c15878eYq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetCoinDetailFragment$observeTxHistoryData$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetCoinDetailFragment$observeTxHistoryData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends AddressCoinHistoryDetail>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15878eYq this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15878eYq c15878eYq, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15878eYq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AddressCoinHistoryDetail> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AddressCoinHistoryDetail>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AddressCoinHistoryDetail> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                AbstractC16580emc abstractC16580emc = null;
                if (!this.this$0.OLrzqt().AYXKKw()) {
                    C33064mpR.KWHzl(this.this$0.djBIcL, list);
                } else {
                    if (list.isEmpty()) {
                        List<?> items = this.this$0.djBIcL.getItems();
                        Intrinsics.checkNotNullExpressionValue(items, "");
                        if (!(CollectionsKt___CollectionsKt.wlaJM(items) instanceof C14316djE)) {
                            List<?> items2 = this.this$0.djBIcL.getItems();
                            Intrinsics.checkNotNullExpressionValue(items2, "");
                            if (CollectionsKt___CollectionsKt.wlaJM(items2) instanceof C14318djG) {
                                C33064mpR.OLrzqt(this.this$0.djBIcL, (List<? extends Object>) C56402yEa.EZpvd(new C14316djE(C56424yEw.KWHzl(), 0, 2, null)));
                            }
                        }
                    } else {
                        C33064mpR.OLrzqt(this.this$0.djBIcL, (List<? extends Object>) list);
                    }
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
                AbstractC16580emc abstractC16580emc2 = this.this$0.values;
                if (abstractC16580emc2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16580emc = abstractC16580emc2;
                }
                abstractC16580emc.DbNXlk.valueOf();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow<List<AddressCoinHistoryDetail>> mutableSharedFlowOLrzqt = this.this$0.OLrzqt().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
}
