package com.okinc.business.defi.wallet.home.addressDetail.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetTxDetailActivity$initFlowListener$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC16361eiV;
import o.C13754dXa;
import o.C33070mpX;
import o.C43453rpa;
import o.C55173xeu;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.eYK;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class ProfileAssetTxDetailActivity$initFlowListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eYK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetTxDetailActivity$initFlowListener$1(eYK eyk, Continuation<? super ProfileAssetTxDetailActivity$initFlowListener$1> continuation) {
        super(2, continuation);
        this.this$0 = eyk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileAssetTxDetailActivity$initFlowListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileAssetTxDetailActivity$initFlowListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetTxDetailActivity$initFlowListener$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AddressTxHistoryDetail, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ eYK this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eYK eyk, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = eyk;
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
        public final Object invoke(AddressTxHistoryDetail addressTxHistoryDetail, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(addressTxHistoryDetail, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AddressTxHistoryDetail addressTxHistoryDetail = (AddressTxHistoryDetail) this.L$0;
                this.this$0.gEmmrt();
                AbstractC16361eiV abstractC16361eiV = this.this$0.valueOf;
                if (abstractC16361eiV == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV = null;
                }
                abstractC16361eiV.ejfBZ.AEQbTJ();
                if (addressTxHistoryDetail == null) {
                    if (!this.this$0.AYXKKw) {
                        AbstractC16361eiV abstractC16361eiV2 = this.this$0.valueOf;
                        if (abstractC16361eiV2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16361eiV2 = null;
                        }
                        abstractC16361eiV2.AEQbTJ.setVisibility(0);
                        AbstractC16361eiV abstractC16361eiV3 = this.this$0.valueOf;
                        if (abstractC16361eiV3 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16361eiV3 = null;
                        }
                        abstractC16361eiV3.ejfBZ.setVisibility(8);
                        AbstractC16361eiV abstractC16361eiV4 = this.this$0.valueOf;
                        if (abstractC16361eiV4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16361eiV4 = null;
                        }
                        C55173xeu c55173xeu = abstractC16361eiV4.AEQbTJ;
                        final eYK eyk = this.this$0;
                        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske));
                        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC));
                        if (C43453rpa.AEQbTJ.KWHzl(eyk)) {
                            c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewAttachedToWindow));
                            c55173xeu.setEmptyTypeImage(9);
                        } else {
                            c55173xeu.setEmptyTypeImage(8);
                            c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.R));
                        }
                        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eYP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                ProfileAssetTxDetailActivity$initFlowListener$1.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(eyk, view);
                            }
                        });
                        rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                        return Unit.INSTANCE;
                    }
                    C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.registerCallbackMessenger), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    return Unit.INSTANCE;
                }
                AbstractC16361eiV abstractC16361eiV5 = this.this$0.valueOf;
                if (abstractC16361eiV5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV5 = null;
                }
                abstractC16361eiV5.AEQbTJ.setVisibility(8);
                AbstractC16361eiV abstractC16361eiV6 = this.this$0.valueOf;
                if (abstractC16361eiV6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV6 = null;
                }
                abstractC16361eiV6.ejfBZ.setVisibility(0);
                eYK eyk2 = this.this$0;
                eyk2.KWHzl(eyk2.KWHzl(addressTxHistoryDetail));
                eYK eyk3 = this.this$0;
                eyk3.copydefault(eyk3.AkhnZx);
                AbstractC16361eiV abstractC16361eiV7 = this.this$0.valueOf;
                if (abstractC16361eiV7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV7 = null;
                }
                ConstraintLayout constraintLayout = abstractC16361eiV7.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(this.this$0.gEmmrt != null ? 0 : 8);
                AddressCoinHistoryDetail addressCoinHistoryDetail = this.this$0.gEmmrt;
                if (addressCoinHistoryDetail != null) {
                    this.this$0.AEQbTJ(addressCoinHistoryDetail, addressTxHistoryDetail);
                }
                this.this$0.AEQbTJ(true, addressTxHistoryDetail);
                this.this$0.AEQbTJ(false, addressTxHistoryDetail);
                this.this$0.EZpvd(addressTxHistoryDetail);
                this.this$0.AYXKKw = true;
                rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(eYK eyk, View view) {
            eyk.AkhnZx();
            eyk.AYXKKw().EZpvd(eyk.djBIcL, eyk.AhwBna, eyk.values, eyk.isConnected);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow<AddressTxHistoryDetail> mutableSharedFlowEZpvd = this.this$0.AYXKKw().EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableSharedFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
