package com.okinc.business.defi.wallet.home.addressDetail.ui;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C13754dXa;
import o.C15852eXr;
import o.C16601emx;
import o.C33064mpR;
import o.C33070mpX;
import o.C43453rpa;
import o.C55173xeu;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.eWR;
import o.eWS;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletPnlTokenFragment$initViewData$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15852eXr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletPnlTokenFragment$initViewData$7(C15852eXr c15852eXr, Continuation<? super DefiWalletPnlTokenFragment$initViewData$7> continuation) {
        super(2, continuation);
        this.this$0 = c15852eXr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletPnlTokenFragment$initViewData$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletPnlTokenFragment$initViewData$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$7$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends eWR>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15852eXr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15852eXr c15852eXr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15852eXr;
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
        public /* bridge */ /* synthetic */ Object invoke(List<? extends eWR> list, Continuation<? super Unit> continuation) {
            return invoke2((List<eWR>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<eWR> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<eWR> list = (List) this.L$0;
                C16601emx c16601emx = this.this$0.gEmmrt;
                C16601emx c16601emx2 = null;
                if (c16601emx == null) {
                    Intrinsics.gEmmrt("");
                    c16601emx = null;
                }
                c16601emx.copydefault.AEQbTJ();
                C16601emx c16601emx3 = this.this$0.gEmmrt;
                if (c16601emx3 == null) {
                    Intrinsics.gEmmrt("");
                    c16601emx3 = null;
                }
                c16601emx3.copydefault.valueOf();
                if (list == null) {
                    C16601emx c16601emx4 = this.this$0.gEmmrt;
                    if (c16601emx4 == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx4 = null;
                    }
                    final C15852eXr c15852eXr = this.this$0;
                    C55173xeu c55173xeu = c16601emx4.AEQbTJ;
                    c55173xeu.setVisibility(0);
                    c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKOmnske));
                    c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gGvvIC));
                    C43453rpa c43453rpa = C43453rpa.AEQbTJ;
                    Context context = c16601emx4.AEQbTJ.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    if (c43453rpa.KWHzl(context)) {
                        c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onViewAttachedToWindow));
                        c55173xeu.setEmptyTypeImage(9);
                    } else {
                        c55173xeu.setEmptyTypeImage(8);
                        c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.R));
                    }
                    c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.eXB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C15852eXr.loadData$default(c15852eXr, false, 1, null);
                        }
                    });
                    c16601emx4.copydefault.setVisibility(8);
                    C16601emx c16601emx5 = this.this$0.gEmmrt;
                    if (c16601emx5 == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx5 = null;
                    }
                    c16601emx5.copydefault.AhwBna(false);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
                } else if (list.isEmpty()) {
                    C16601emx c16601emx6 = this.this$0.gEmmrt;
                    if (c16601emx6 == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx6 = null;
                    }
                    C55173xeu c55173xeu2 = c16601emx6.AEQbTJ;
                    c55173xeu2.setVisibility(0);
                    c55173xeu2.setTitle("");
                    c55173xeu2.setSubTitle((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.UimiPO));
                    c55173xeu2.setEmptyTypeImage(7);
                    c55173xeu2.setRetry("");
                    c16601emx6.copydefault.setVisibility(8);
                    C16601emx c16601emx7 = this.this$0.gEmmrt;
                    if (c16601emx7 == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx7 = null;
                    }
                    c16601emx7.copydefault.AhwBna(false);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                } else {
                    eWS ewsAEQbTJ = this.this$0.isConnected().AEQbTJ(this.this$0.AYXKKw);
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (eWR ewr : list) {
                        ewr.KWHzl(ewsAEQbTJ != null ? ewsAEQbTJ.AEQbTJ() : null);
                        arrayList.add(ewr);
                    }
                    C16601emx c16601emx8 = this.this$0.gEmmrt;
                    if (c16601emx8 == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx8 = null;
                    }
                    c16601emx8.AEQbTJ.setVisibility(8);
                    C16601emx c16601emx9 = this.this$0.gEmmrt;
                    if (c16601emx9 == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx9 = null;
                    }
                    c16601emx9.copydefault.setVisibility(0);
                    C33064mpR.OLrzqt(this.this$0.KWHzl, (List<? extends Object>) CollectionsKt___CollectionsKt.djBIcL((Collection) C56402yEa.EZpvd(this.this$0.OLrzqt()), (Iterable) arrayList));
                    C16601emx c16601emx10 = this.this$0.gEmmrt;
                    if (c16601emx10 == null) {
                        Intrinsics.gEmmrt("");
                        c16601emx10 = null;
                    }
                    c16601emx10.djBIcL.scrollToPosition(0);
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                }
                C16601emx c16601emx11 = this.this$0.gEmmrt;
                if (c16601emx11 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16601emx2 = c16601emx11;
                }
                c16601emx2.KWHzl.copydefault();
                c16601emx2.KWHzl.setVisibility(8);
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
            SharedFlow<List<eWR>> sharedFlowAEQbTJ = this.this$0.AEQbTJ().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
