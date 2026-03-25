package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C19897gTj;
import o.C23428hxz;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.gTB;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$bindAppBar$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ C23428hxz $this_bindAppBar;
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$bindAppBar$4(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Context context, Continuation<? super CopyTradingEditStrategyActivity$bindAppBar$4> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
        this.$this_bindAppBar = c23428hxz;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$bindAppBar$4(this.this$0, this.$this_bindAppBar, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$bindAppBar$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindAppBar$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ C23428hxz $this_bindAppBar;
        int label;
        final /* synthetic */ CopyTradingEditStrategyActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = copyTradingEditStrategyActivity;
            this.$this_bindAppBar = c23428hxz;
            this.$context = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$this_bindAppBar, this.$context, continuation);
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.gEmmrt().ejfBZ());
                final C23428hxz c23428hxz = this.$this_bindAppBar;
                final Context context = this.$context;
                final CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity.bindAppBar.4.1.4

                    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindAppBar$4$1$4$Activity */
                    public static final class Activity implements View.OnClickListener {
                        public final /* synthetic */ String AEQbTJ;
                        public final /* synthetic */ long EZpvd;
                        public final /* synthetic */ CopyTradingEditStrategyActivity KWHzl;
                        public final /* synthetic */ View copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public Activity(View view, long j, CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, String str) {
                            this.copydefault = view;
                            this.EZpvd = j;
                            this.KWHzl = copyTradingEditStrategyActivity;
                            this.AEQbTJ = str;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                                CopyTradingEditStrategyViewModel.trackClickEvent$default(this.KWHzl.gEmmrt(), TrackButtonName.EDIT_STRATEGY_NAME.getButtonName(), null, 2, null);
                                C19897gTj.Companion.copydefault(this.AEQbTJ).show(this.KWHzl.getSupportFragmentManager(), "CopyTradingEditStrategyNameBottomSheet");
                            }
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(gTB gtb, Continuation<? super Unit> continuation) {
                        Context context2 = context;
                        Intrinsics.copydefault(context2);
                        String strEZpvd = gtb.EZpvd(context2);
                        c23428hxz.fIwbmz.setText(strEZpvd);
                        TextView textView = c23428hxz.fIwbmz;
                        textView.setOnClickListener(new Activity(textView, 1000L, copyTradingEditStrategyActivity, strEZpvd));
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
            CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(copyTradingEditStrategyActivity, this.$this_bindAppBar, this.$context, null);
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
