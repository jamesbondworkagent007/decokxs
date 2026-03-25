package com.okinc.okex.center.ui;

import android.graphics.drawable.Drawable;
import com.okinc.okex.center.bean.NetworkChain;
import com.okinc.okex.center.bean.TroubleshootResultPageData;
import com.okinc.okex.center.bean.TxnCurrencyBean;
import com.okinc.okex.center.viewmodel.SupportTroubleshootViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC45235slv;
import o.ActivityC44946sgX;
import o.C33070mpX;
import o.C33570myu;
import o.C44760scx;
import o.C47315tni;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootActivity$initViewModel$1$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SupportTroubleshootViewModel $this_with;
    int label;
    final /* synthetic */ ActivityC44946sgX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootActivity$initViewModel$1$5(SupportTroubleshootViewModel supportTroubleshootViewModel, ActivityC44946sgX activityC44946sgX, Continuation<? super SupportTroubleshootActivity$initViewModel$1$5> continuation) {
        super(2, continuation);
        this.$this_with = supportTroubleshootViewModel;
        this.this$0 = activityC44946sgX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTroubleshootActivity$initViewModel$1$5(this.$this_with, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportTroubleshootActivity$initViewModel$1$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC45235slv> stateFlowAEQbTJ = this.$this_with.AEQbTJ();
            final ActivityC44946sgX activityC44946sgX = this.this$0;
            FlowCollector<? super AbstractC45235slv> flowCollector = new FlowCollector() { // from class: com.okinc.okex.center.ui.SupportTroubleshootActivity$initViewModel$1$5.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC45235slv abstractC45235slv, Continuation<? super Unit> continuation) {
                    C44760scx.log$default("Button State: " + abstractC45235slv, null, 2, null);
                    C52794wYp c52794wYp = activityC44946sgX.AhwBna().KWHzl;
                    ActivityC44946sgX activityC44946sgX2 = activityC44946sgX;
                    if (abstractC45235slv instanceof AbstractC45235slv.ActionBar) {
                        C33570myu.AEQbTJ(c52794wYp.getContext(), c52794wYp);
                        activityC44946sgX2.EZpvd(false, false, false);
                        c52794wYp.setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.OuxcSI));
                        C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
                    } else if (abstractC45235slv instanceof AbstractC45235slv.Application) {
                        AbstractC45235slv.Application application = (AbstractC45235slv.Application) abstractC45235slv;
                        Object objEZpvd = application.EZpvd();
                        if ((objEZpvd instanceof TxnCurrencyBean) || (objEZpvd instanceof NetworkChain)) {
                            ActivityC44946sgX.setInputStates$default(activityC44946sgX2, false, activityC44946sgX2.valueOf().AYXKKw(), false, 5, null);
                        } else if (objEZpvd instanceof TroubleshootResultPageData) {
                            activityC44946sgX2.AEQbTJ((TroubleshootResultPageData) application.EZpvd());
                            activityC44946sgX2.AhwBna = true;
                        }
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
                        c52794wYp.setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.KWHzl));
                        c52794wYp.fIwbmz();
                        ActivityC44946sgX.setInputStates$default(activityC44946sgX2, false, activityC44946sgX2.valueOf().AYXKKw(), false, 5, null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
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
