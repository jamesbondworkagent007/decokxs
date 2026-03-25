package com.okinc.business.invest_biz.ui.page.dialog;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C25493ixk;
import o.C27569jxf;
import o.C56391yDq;
import o.C56442yFn;
import o.iJP;
import o.iTK;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestBatchClaimDialog$onCustomHeaderView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ iJP $binding;
    int label;
    final /* synthetic */ iTK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestBatchClaimDialog$onCustomHeaderView$2(iTK itk, iJP ijp, Continuation<? super InvestBatchClaimDialog$onCustomHeaderView$2> continuation) {
        super(2, continuation);
        this.this$0 = itk;
        this.$binding = ijp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestBatchClaimDialog$onCustomHeaderView$2(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestBatchClaimDialog$onCustomHeaderView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog$onCustomHeaderView$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ iJP $binding;
        int label;
        final /* synthetic */ iTK this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(iTK itk, iJP ijp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = itk;
            this.$binding = ijp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.gEmmrt().OLrzqt());
                final iJP ijp = this.$binding;
                final iTK itk = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.page.dialog.InvestBatchClaimDialog.onCustomHeaderView.2.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InvestUserClaimInfoResponse investUserClaimInfoResponse, Continuation<? super Unit> continuation) {
                        InvestUserRewardDetailPromptInformation extraData = investUserClaimInfoResponse.getExtraData();
                        if ((extraData != null ? extraData.getClaimTipInfo() : null) == null) {
                            ImageView imageView = ijp.OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(imageView, "");
                            imageView.setVisibility(8);
                            return Unit.INSTANCE;
                        }
                        ImageView imageView2 = ijp.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "");
                        imageView2.setVisibility(0);
                        C27569jxf c27569jxf = C27569jxf.OLrzqt;
                        Context contextRequireContext = itk.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        iJP ijp2 = ijp;
                        TextView textView = ijp2.KWHzl;
                        ImageView imageView3 = ijp2.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(imageView3, "");
                        c27569jxf.AEQbTJ(contextRequireContext, textView, imageView3, investUserClaimInfoResponse.getExtraData().getClaimTipInfo(), (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
                        TextView textView2 = ijp.KWHzl;
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setVisibility(0);
                        CharSequence text = ijp.KWHzl.getText();
                        if (text == null || text.length() == 0) {
                            ijp.KWHzl.setText(C25493ixk.FragmentManager.aUsmxb);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
