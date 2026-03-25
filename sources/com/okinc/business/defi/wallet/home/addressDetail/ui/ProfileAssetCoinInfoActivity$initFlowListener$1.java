package com.okinc.business.defi.wallet.home.addressDetail.ui;

import android.app.Activity;
import android.view.View;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC16320ehh;
import o.ActivityC15886eYy;
import o.C13754dXa;
import o.C33070mpX;
import o.C43453rpa;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.DialogC55112xdm;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileAssetCoinInfoActivity$initFlowListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC15886eYy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetCoinInfoActivity$initFlowListener$1(ActivityC15886eYy activityC15886eYy, Continuation<? super ProfileAssetCoinInfoActivity$initFlowListener$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC15886eYy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetCoinInfoActivity$initFlowListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetCoinInfoActivity$initFlowListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinInfoActivity$initFlowListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoinInfoBean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC15886eYy this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC15886eYy activityC15886eYy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC15886eYy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoinInfoBean coinInfoBean, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coinInfoBean, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoinInfoBean coinInfoBean = (CoinInfoBean) this.L$0;
                DialogC55112xdm dialogC55112xdm = this.this$0.AhwBna;
                if (dialogC55112xdm != null) {
                    dialogC55112xdm.dismiss();
                }
                if (coinInfoBean != null || this.this$0.AEQbTJ().copydefault()) {
                    AbstractC16320ehh abstractC16320ehh = this.this$0.djBIcL;
                    if (abstractC16320ehh == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16320ehh = null;
                    }
                    C55173xeu root = abstractC16320ehh.KWHzl.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    root.setVisibility(8);
                    AbstractC16320ehh abstractC16320ehh2 = this.this$0.djBIcL;
                    if (abstractC16320ehh2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16320ehh2 = null;
                    }
                    abstractC16320ehh2.AkhnZx.setVisibility(0);
                    this.this$0.AEQbTJ(coinInfoBean);
                    this.this$0.EZpvd(coinInfoBean);
                    this.this$0.OLrzqt(coinInfoBean);
                    this.this$0.djBIcL();
                    this.this$0.KWHzl(coinInfoBean);
                    this.this$0.copydefault(coinInfoBean);
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                AbstractC16320ehh abstractC16320ehh3 = this.this$0.djBIcL;
                if (abstractC16320ehh3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh3 = null;
                }
                C55173xeu root2 = abstractC16320ehh3.KWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                root2.setVisibility(0);
                AbstractC16320ehh abstractC16320ehh4 = this.this$0.djBIcL;
                if (abstractC16320ehh4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh4 = null;
                }
                abstractC16320ehh4.AkhnZx.setVisibility(8);
                AbstractC16320ehh abstractC16320ehh5 = this.this$0.djBIcL;
                if (abstractC16320ehh5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16320ehh5 = null;
                }
                C55173xeu c55173xeu = abstractC16320ehh5.KWHzl.OLrzqt;
                final ActivityC15886eYy activityC15886eYy = this.this$0;
                c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske));
                c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC));
                if (C43453rpa.AEQbTJ.KWHzl(activityC15886eYy)) {
                    c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewAttachedToWindow));
                    c55173xeu.setEmptyTypeImage(9);
                } else {
                    c55173xeu.setEmptyTypeImage(8);
                    c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.R));
                }
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eYB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC15886eYy.djBIcL(activityC15886eYy);
                    }
                });
                rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
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
            MutableSharedFlow<CoinInfoBean> mutableSharedFlowAEQbTJ = this.this$0.AEQbTJ().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
