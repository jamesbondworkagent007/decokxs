package com.okinc.business.defi.wallet.home.addressDetail.ui;

import androidx.fragment.app.FragmentActivity;
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
import o.C13754dXa;
import o.C14316djE;
import o.C14318djG;
import o.C15878eYq;
import o.C33064mpR;
import o.C33070mpX;
import o.C43453rpa;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileAssetCoinDetailFragment$observeTxHistoryData$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15878eYq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetCoinDetailFragment$observeTxHistoryData$4(C15878eYq c15878eYq, Continuation<? super ProfileAssetCoinDetailFragment$observeTxHistoryData$4> continuation) {
        super(2, continuation);
        this.this$0 = c15878eYq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetCoinDetailFragment$observeTxHistoryData$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetCoinDetailFragment$observeTxHistoryData$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailFragment$observeTxHistoryData$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
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
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C14316djE c14316djE;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!this.this$0.djBIcL.getItems().isEmpty()) {
                    List<?> items = this.this$0.djBIcL.getItems();
                    Intrinsics.checkNotNullExpressionValue(items, "");
                    if (CollectionsKt___CollectionsKt.wlaJM(items) instanceof C14318djG) {
                        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
                        FragmentActivity activity = this.this$0.getActivity();
                        if (activity == null) {
                            return Unit.INSTANCE;
                        }
                        if (c43453rpa.KWHzl(activity)) {
                            c14316djE = new C14316djE(C56424yEw.gEmmrt(C56390yDp.OLrzqt("title", C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske)), C56390yDp.OLrzqt("subtitle", C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewAttachedToWindow)), C56390yDp.OLrzqt("retry", C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC))), 9);
                        } else {
                            c14316djE = new C14316djE(C56424yEw.gEmmrt(C56390yDp.OLrzqt("title", C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske)), C56390yDp.OLrzqt("subtitle", C33070mpX.AYXKKw(C13754dXa.FragmentManager.R)), C56390yDp.OLrzqt("retry", C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC))), 8);
                        }
                        C33064mpR.OLrzqt(this.this$0.djBIcL, (List<? extends Object>) C56402yEa.EZpvd(c14316djE));
                    }
                }
                AbstractC16580emc abstractC16580emc = this.this$0.values;
                if (abstractC16580emc == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16580emc = null;
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
            MutableSharedFlow<Boolean> mutableSharedFlowAhwBna = this.this$0.OLrzqt().AhwBna();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlowAhwBna, anonymousClass1, this) == objCopydefault) {
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
