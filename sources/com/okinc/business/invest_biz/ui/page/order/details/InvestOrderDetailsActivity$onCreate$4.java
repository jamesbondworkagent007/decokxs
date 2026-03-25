package com.okinc.business.invest_biz.ui.page.order.details;

import android.app.Activity;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C33546myW;
import o.C52761wXj;
import o.C55173xeu;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iGW;
import o.iSE;
import o.iVU;
import o.iVZ;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestOrderDetailsActivity$onCreate$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ iVZ $adapter;
    final /* synthetic */ iGW $binding;
    final /* synthetic */ TextView $title;
    int label;
    final /* synthetic */ iVU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestOrderDetailsActivity$onCreate$4(iVU ivu, iGW igw, TextView textView, iVZ ivz, Continuation<? super InvestOrderDetailsActivity$onCreate$4> continuation) {
        super(2, continuation);
        this.this$0 = ivu;
        this.$binding = igw;
        this.$title = textView;
        this.$adapter = ivz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestOrderDetailsActivity$onCreate$4(this.this$0, this.$binding, this.$title, this.$adapter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestOrderDetailsActivity$onCreate$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsActivity$onCreate$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ iVZ $adapter;
        final /* synthetic */ iGW $binding;
        final /* synthetic */ TextView $title;
        int label;
        final /* synthetic */ iVU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(iVU ivu, iGW igw, TextView textView, iVZ ivz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ivu;
            this.$binding = igw;
            this.$title = textView;
            this.$adapter = ivz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, this.$title, this.$adapter, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<InvestOrderDetailsState> stateFlowKWHzl = this.this$0.AEQbTJ().KWHzl();
                final iGW igw = this.$binding;
                final iVU ivu = this.this$0;
                final TextView textView = this.$title;
                final iVZ ivz = this.$adapter;
                FlowCollector<? super InvestOrderDetailsState> flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsActivity.onCreate.4.1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InvestOrderDetailsState investOrderDetailsState, Continuation<? super Unit> continuation) {
                        if (investOrderDetailsState.AEQbTJ() == null) {
                            if (investOrderDetailsState.OLrzqt()) {
                                C55173xeu c55173xeu = igw.EZpvd;
                                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                                c55173xeu.setVisibility(8);
                                C33546myW c33546myW = igw.AEQbTJ;
                                Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                                c33546myW.setVisibility(8);
                                ivu.showLoading();
                            } else {
                                C55173xeu c55173xeu2 = igw.EZpvd;
                                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                                c55173xeu2.setVisibility(0);
                                igw.EZpvd.setEmptyTypeImage(2);
                                C33546myW c33546myW2 = igw.AEQbTJ;
                                Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
                                c33546myW2.setVisibility(8);
                                if (investOrderDetailsState.EZpvd() != null) {
                                    rVN.reportFullyDrawn$default((Activity) ivu, false, (String) null, 2, (Object) null);
                                    igw.EZpvd.setSubTitle((CharSequence) investOrderDetailsState.EZpvd().KWHzl(ivu));
                                }
                                ivu.dismissLoading();
                            }
                        } else {
                            rVN.reportFullyDrawn$default((Activity) ivu, true, (String) null, 2, (Object) null);
                            iVU ivu2 = ivu;
                            TextView textView2 = textView;
                            Intrinsics.copydefault(textView2);
                            ivu2.KWHzl(textView2, investOrderDetailsState.AEQbTJ().EZpvd());
                            textView.setContentDescription("web3_defi_order_detail_status_view");
                            if (investOrderDetailsState.AEQbTJ().AEQbTJ().isEmpty()) {
                                if (investOrderDetailsState.OLrzqt()) {
                                    C55173xeu c55173xeu3 = igw.EZpvd;
                                    Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                                    c55173xeu3.setVisibility(8);
                                    igw.EZpvd.setEmptyTypeImage(7);
                                    C33546myW c33546myW3 = igw.AEQbTJ;
                                    Intrinsics.checkNotNullExpressionValue(c33546myW3, "");
                                    c33546myW3.setVisibility(8);
                                    ivu.showLoading();
                                } else {
                                    C55173xeu c55173xeu4 = igw.EZpvd;
                                    Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
                                    c55173xeu4.setVisibility(0);
                                    C33546myW c33546myW4 = igw.AEQbTJ;
                                    Intrinsics.checkNotNullExpressionValue(c33546myW4, "");
                                    c33546myW4.setVisibility(8);
                                    if (investOrderDetailsState.EZpvd() != null) {
                                        igw.EZpvd.setSubTitle((CharSequence) investOrderDetailsState.EZpvd().KWHzl(ivu));
                                    }
                                    ivu.dismissLoading();
                                }
                            } else {
                                if (investOrderDetailsState.OLrzqt()) {
                                    C56443yFo.KWHzl(igw.AEQbTJ.djBIcL());
                                } else {
                                    igw.AEQbTJ.AEQbTJ();
                                }
                                C55173xeu c55173xeu5 = igw.EZpvd;
                                Intrinsics.checkNotNullExpressionValue(c55173xeu5, "");
                                c55173xeu5.setVisibility(8);
                                C33546myW c33546myW5 = igw.AEQbTJ;
                                Intrinsics.checkNotNullExpressionValue(c33546myW5, "");
                                c33546myW5.setVisibility(0);
                                ivu.dismissLoading();
                                iSE.submitList$default(ivz, investOrderDetailsState.AEQbTJ().AEQbTJ(), null, 2, null);
                                if (investOrderDetailsState.EZpvd() != null) {
                                    C55328xhq.show$default(C55328xhq.OLrzqt, investOrderDetailsState.EZpvd().KWHzl(ivu), ContextCompat.getDrawable(ivu, C52761wXj.TaskDescription.dPkBzA), 0, (Integer) null, 0, 0, 60, (Object) null);
                                    ivu.AEQbTJ().OLrzqt();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iVU ivu = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ivu, this.$binding, this.$title, this.$adapter, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(ivu, state, anonymousClass1, this) == objCopydefault) {
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
