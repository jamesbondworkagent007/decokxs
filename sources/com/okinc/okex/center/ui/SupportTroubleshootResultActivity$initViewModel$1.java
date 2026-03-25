package com.okinc.okex.center.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC45235slv;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootResultActivity$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SupportTroubleshootResultActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootResultActivity$initViewModel$1(SupportTroubleshootResultActivity supportTroubleshootResultActivity, Continuation<? super SupportTroubleshootResultActivity$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = supportTroubleshootResultActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTroubleshootResultActivity$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportTroubleshootResultActivity$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC45235slv> stateFlowFIwbmz = this.this$0.isConnected().fIwbmz();
            final SupportTroubleshootResultActivity supportTroubleshootResultActivity = this.this$0;
            FlowCollector<? super AbstractC45235slv> flowCollector = new FlowCollector() { // from class: com.okinc.okex.center.ui.SupportTroubleshootResultActivity$initViewModel$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC45235slv abstractC45235slv, Continuation<? super Unit> continuation) {
                    if (abstractC45235slv instanceof AbstractC45235slv.ActionBar) {
                        supportTroubleshootResultActivity.EZpvd(OKSupportBaseActivity.PageState.LOADING);
                    } else if (abstractC45235slv instanceof AbstractC45235slv.Application) {
                        supportTroubleshootResultActivity.EZpvd(OKSupportBaseActivity.PageState.CONTENT);
                        rVN.reportFullyDrawn$default((Activity) supportTroubleshootResultActivity, true, (String) null, 2, (Object) null);
                    } else if (abstractC45235slv instanceof AbstractC45235slv.StateListAnimator) {
                        supportTroubleshootResultActivity.EZpvd(OKSupportBaseActivity.PageState.ERROR);
                        rVN.reportFullyDrawn$default((Activity) supportTroubleshootResultActivity, false, (String) null, 2, (Object) null);
                    } else if (abstractC45235slv instanceof AbstractC45235slv.Activity) {
                        AbstractC45235slv.Activity activity = (AbstractC45235slv.Activity) abstractC45235slv;
                        String strEZpvd = activity.EZpvd();
                        if (strEZpvd != null) {
                            if (!activity.OLrzqt()) {
                                C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                            } else {
                                C55326xho.toastWithFailedIcon$default(strEZpvd, 0, 1, (Object) null);
                            }
                        }
                    } else {
                        if (!(abstractC45235slv instanceof AbstractC45235slv.TaskDescription)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String strOLrzqt = ((AbstractC45235slv.TaskDescription) abstractC45235slv).OLrzqt();
                        if (strOLrzqt != null) {
                            C55326xho.OLrzqt(strOLrzqt);
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowFIwbmz.collect(flowCollector, this) == objCopydefault) {
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
