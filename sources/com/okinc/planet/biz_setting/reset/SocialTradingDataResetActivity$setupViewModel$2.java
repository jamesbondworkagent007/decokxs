package com.okinc.planet.biz_setting.reset;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.compose.material3.CalendarModelKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC46197tLk;
import o.AbstractC46225tMl;
import o.C33069mpW;
import o.C45920tBd;
import o.C47501trL;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.tIE;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes19.dex */
public final class SocialTradingDataResetActivity$setupViewModel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tIE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialTradingDataResetActivity$setupViewModel$2(tIE tie, Continuation<? super SocialTradingDataResetActivity$setupViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = tie;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SocialTradingDataResetActivity$setupViewModel$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SocialTradingDataResetActivity$setupViewModel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ tIE this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tIE tie, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = tie;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06171 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends CurveResetInfo>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ tIE this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06171(tIE tie, Continuation<? super C06171> continuation) {
                super(2, continuation);
                this.this$0 = tie;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06171 c06171 = new C06171(this.this$0, continuation);
                c06171.L$0 = obj;
                return c06171;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends CurveResetInfo> abstractC46197tLk, Continuation<? super Unit> continuation) {
                return invoke2((AbstractC46197tLk<CurveResetInfo>) abstractC46197tLk, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AbstractC46197tLk<CurveResetInfo> abstractC46197tLk, Continuation<? super Unit> continuation) {
                return ((C06171) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r8v9, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                String message;
                AppCompatSeekBar appCompatSeekBar;
                AppCompatSeekBar appCompatSeekBar2;
                TextView textView;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
                    if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                        CurveResetInfo curveResetInfo = (CurveResetInfo) ((AbstractC46197tLk.Application) abstractC46197tLk).OLrzqt();
                        if (curveResetInfo == null) {
                            return Unit.INSTANCE;
                        }
                        AbstractC46225tMl abstractC46225tMl = this.this$0.AEQbTJ;
                        if (abstractC46225tMl != null && (textView = abstractC46225tMl.fetchVPNInfo) != null) {
                            textView.setText(C33069mpW.KWHzl(this.this$0, C47501trL.Fragment.iHkeWl, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", curveResetInfo.copydefault()))));
                        }
                        this.this$0.valueOf();
                        this.this$0.EZpvd = Util.toLongOrDefault(curveResetInfo.KWHzl(), 0L);
                        Fragment fragmentFindFragmentById = this.this$0.getSupportFragmentManager().findFragmentById(C47501trL.TaskDescription.dbwnZN);
                        C45920tBd c45920tBd = fragmentFindFragmentById instanceof C45920tBd ? (C45920tBd) fragmentFindFragmentById : null;
                        if (c45920tBd != null) {
                            C45920tBd.refresh$default(c45920tBd, C56443yFo.AEQbTJ((int) ((System.currentTimeMillis() - this.this$0.EZpvd) / CalendarModelKt.MillisecondsIn24Hours)), false, 2, null);
                            List<ChartProfileDataResp> listOLrzqt = this.this$0.AYXKKw().OLrzqt().getValue().OLrzqt();
                            if (listOLrzqt == null) {
                                return Unit.INSTANCE;
                            }
                            tIE tie = this.this$0;
                            Iterator<ChartProfileDataResp> it = listOLrzqt.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (it.next().KWHzl() == tie.EZpvd) {
                                    break;
                                }
                                i++;
                            }
                            tie.copydefault = Math.max(0, i);
                            AbstractC46225tMl abstractC46225tMl2 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl2 != null && (appCompatSeekBar2 = abstractC46225tMl2.AYXKKw) != null) {
                                appCompatSeekBar2.setProgress(this.this$0.copydefault);
                            }
                            AbstractC46225tMl abstractC46225tMl3 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl3 != null && (appCompatSeekBar = abstractC46225tMl3.AYXKKw) != null) {
                                final tIE tie2 = this.this$0;
                                C56443yFo.KWHzl(appCompatSeekBar.post(new Runnable() { // from class: o.tIJ
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SocialTradingDataResetActivity$setupViewModel$2.AnonymousClass1.C06171.invokeSuspend$lambda$1(tie2);
                                    }
                                }));
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    } else if ((abstractC46197tLk instanceof AbstractC46197tLk.Activity) && (message = ((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd().getMessage()) != null) {
                        C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$1(tIE tie) {
                tie.KWHzl(tie.copydefault);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<AbstractC46197tLk<CurveResetInfo>> stateFlowCopydefault = this.this$0.AYXKKw().copydefault();
                C06171 c06171 = new C06171(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowCopydefault, c06171, this) == objCopydefault) {
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
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
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
