package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C19898gTk;
import o.C23428hxz;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$bindExpiresAfter$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C23428hxz $this_bindExpiresAfter;
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$bindExpiresAfter$2(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Continuation<? super CopyTradingEditStrategyActivity$bindExpiresAfter$2> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
        this.$this_bindExpiresAfter = c23428hxz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$bindExpiresAfter$2(this.this$0, this.$this_bindExpiresAfter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$bindExpiresAfter$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindExpiresAfter$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C23428hxz $this_bindExpiresAfter;
        int label;
        final /* synthetic */ CopyTradingEditStrategyActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = copyTradingEditStrategyActivity;
            this.$this_bindExpiresAfter = c23428hxz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$this_bindExpiresAfter, continuation);
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
                StateFlow<ExpireTimeData> stateFlowDjBIcL = this.this$0.gEmmrt().djBIcL();
                final C23428hxz c23428hxz = this.$this_bindExpiresAfter;
                final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
                FlowCollector<? super ExpireTimeData> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity.bindExpiresAfter.2.1.2

                    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindExpiresAfter$2$1$2$StateListAnimator */
                    public static final class StateListAnimator implements View.OnClickListener {
                        public final /* synthetic */ View AEQbTJ;
                        public final /* synthetic */ long KWHzl;
                        public final /* synthetic */ ExpireTimeData OLrzqt;
                        public final /* synthetic */ CopyTradingEditStrategyActivity copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public StateListAnimator(View view, long j, ExpireTimeData expireTimeData, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity) {
                            this.AEQbTJ = view;
                            this.KWHzl = j;
                            this.OLrzqt = expireTimeData;
                            this.copydefault = copyTradingEditStrategyActivity;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                                C19898gTk.Activity activity = C19898gTk.Companion;
                                String strEZpvd = this.OLrzqt.EZpvd();
                                if (strEZpvd == null) {
                                    strEZpvd = "";
                                }
                                activity.OLrzqt(strEZpvd, this.copydefault.gEmmrt().AkhnZx().isEmpty()).show(this.copydefault.getSupportFragmentManager(), "CopyTradingExpireContainerDialog");
                            }
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(ExpireTimeData expireTimeData, Continuation<? super Unit> continuation) {
                        if (expireTimeData == null) {
                            return Unit.INSTANCE;
                        }
                        c23428hxz.AuCTel.setText(expireTimeData.AEQbTJ());
                        TextView textView = c23428hxz.AuCTel;
                        textView.setOnClickListener(new StateListAnimator(textView, 1000L, expireTimeData, copyTradingEditStrategyActivity));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowDjBIcL.collect(flowCollector, this) == objCopydefault) {
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
            CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(copyTradingEditStrategyActivity, this.$this_bindExpiresAfter, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(copyTradingEditStrategyActivity, state, anonymousClass1, this) == objCopydefault) {
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
