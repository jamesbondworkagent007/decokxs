package com.okinc.planet.biz_setting.reset;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC46197tLk;
import o.AbstractC46225tMl;
import o.C55326xho;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.tIE;
import o.tRT;

/* JADX INFO: loaded from: classes19.dex */
public final class SocialTradingDataResetActivity$setupViewModel$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tIE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialTradingDataResetActivity$setupViewModel$3(tIE tie, Continuation<? super SocialTradingDataResetActivity$setupViewModel$3> continuation) {
        super(2, continuation);
        this.this$0 = tie;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SocialTradingDataResetActivity$setupViewModel$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SocialTradingDataResetActivity$setupViewModel$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$3$1, reason: invalid class name */
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

        /* JADX INFO: renamed from: com.okinc.planet.biz_setting.reset.SocialTradingDataResetActivity$setupViewModel$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06181 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends List<? extends ChartProfileDataResp>>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ tIE this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06181(tIE tie, Continuation<? super C06181> continuation) {
                super(2, continuation);
                this.this$0 = tie;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06181 c06181 = new C06181(this.this$0, continuation);
                c06181.L$0 = obj;
                return c06181;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends List<? extends ChartProfileDataResp>> abstractC46197tLk, Continuation<? super Unit> continuation) {
                return invoke2((AbstractC46197tLk<? extends List<ChartProfileDataResp>>) abstractC46197tLk, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AbstractC46197tLk<? extends List<ChartProfileDataResp>> abstractC46197tLk, Continuation<? super Unit> continuation) {
                return ((C06181) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i;
                TextView textView;
                TextView textView2;
                TextView textView3;
                View view;
                ImageView imageView;
                AppCompatSeekBar appCompatSeekBar;
                TextView textView4;
                TextView textView5;
                AppCompatSeekBar appCompatSeekBar2;
                AppCompatSeekBar appCompatSeekBar3;
                AppCompatSeekBar appCompatSeekBar4;
                AbstractC46225tMl abstractC46225tMl;
                AppCompatSeekBar appCompatSeekBar5;
                TextView textView6;
                TextView textView7;
                TextView textView8;
                View view2;
                ImageView imageView2;
                AppCompatSeekBar appCompatSeekBar6;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
                    if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                        this.this$0.dismissLoading();
                        String message = ((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd().getMessage();
                        if (message != null) {
                            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                        }
                    } else if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                        this.this$0.dismissLoading();
                        List list = (List) ((AbstractC46197tLk.Application) abstractC46197tLk).OLrzqt();
                        tIE tie = this.this$0;
                        if (list != null) {
                            Iterator it = list.iterator();
                            i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (((ChartProfileDataResp) it.next()).KWHzl() == tie.EZpvd) {
                                    break;
                                }
                                i++;
                            }
                        } else {
                            i = 0;
                        }
                        tie.copydefault = Math.max(0, i);
                        if (list == null || list.size() <= 1) {
                            AbstractC46225tMl abstractC46225tMl2 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl2 != null && (appCompatSeekBar = abstractC46225tMl2.AYXKKw) != null) {
                                tRT.OLrzqt(appCompatSeekBar);
                            }
                            AbstractC46225tMl abstractC46225tMl3 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl3 != null && (imageView = abstractC46225tMl3.values) != null) {
                                tRT.OLrzqt(imageView);
                            }
                            AbstractC46225tMl abstractC46225tMl4 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl4 != null && (view = abstractC46225tMl4.AhwBna) != null) {
                                tRT.OLrzqt(view);
                            }
                            AbstractC46225tMl abstractC46225tMl5 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl5 != null && (textView3 = abstractC46225tMl5.AkhnZx) != null) {
                                tRT.OLrzqt(textView3);
                            }
                            AbstractC46225tMl abstractC46225tMl6 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl6 != null && (textView2 = abstractC46225tMl6.AEQbTJ) != null) {
                                tRT.OLrzqt(textView2);
                            }
                            AbstractC46225tMl abstractC46225tMl7 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl7 != null && (textView = abstractC46225tMl7.OLrzqt) != null) {
                                tRT.OLrzqt(textView);
                            }
                        } else {
                            AbstractC46225tMl abstractC46225tMl8 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl8 != null && (appCompatSeekBar6 = abstractC46225tMl8.AYXKKw) != null) {
                                tRT.KWHzl(appCompatSeekBar6);
                            }
                            AbstractC46225tMl abstractC46225tMl9 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl9 != null && (imageView2 = abstractC46225tMl9.values) != null) {
                                tRT.KWHzl(imageView2);
                            }
                            AbstractC46225tMl abstractC46225tMl10 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl10 != null && (view2 = abstractC46225tMl10.AhwBna) != null) {
                                tRT.KWHzl(view2);
                            }
                            AbstractC46225tMl abstractC46225tMl11 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl11 != null && (textView8 = abstractC46225tMl11.AkhnZx) != null) {
                                tRT.KWHzl(textView8);
                            }
                            AbstractC46225tMl abstractC46225tMl12 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl12 != null && (textView7 = abstractC46225tMl12.AEQbTJ) != null) {
                                tRT.KWHzl(textView7);
                            }
                            AbstractC46225tMl abstractC46225tMl13 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl13 != null && (textView6 = abstractC46225tMl13.OLrzqt) != null) {
                                tRT.KWHzl(textView6);
                            }
                            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((ChartProfileDataResp) it2.next()).OLrzqt().toString());
                            }
                            this.this$0.EZpvd((ArrayList<String>) arrayList);
                            if (Build.VERSION.SDK_INT >= 26 && (abstractC46225tMl = this.this$0.AEQbTJ) != null && (appCompatSeekBar5 = abstractC46225tMl.AYXKKw) != null) {
                                appCompatSeekBar5.setMin(0);
                            }
                            AbstractC46225tMl abstractC46225tMl14 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl14 != null && (appCompatSeekBar4 = abstractC46225tMl14.AYXKKw) != null) {
                                appCompatSeekBar4.setMax(list.size() - 1);
                            }
                            AbstractC46225tMl abstractC46225tMl15 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl15 != null && (appCompatSeekBar3 = abstractC46225tMl15.AYXKKw) != null) {
                                appCompatSeekBar3.setProgress(this.this$0.copydefault);
                            }
                            AbstractC46225tMl abstractC46225tMl16 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl16 != null && (appCompatSeekBar2 = abstractC46225tMl16.AYXKKw) != null) {
                                final tIE tie2 = this.this$0;
                                C56443yFo.KWHzl(appCompatSeekBar2.postDelayed(new Runnable() { // from class: o.tIL
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SocialTradingDataResetActivity$setupViewModel$3.AnonymousClass1.C06181.invokeSuspend$lambda$3(tie2);
                                    }
                                }, 50L));
                            }
                            AbstractC46225tMl abstractC46225tMl17 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl17 != null && (textView5 = abstractC46225tMl17.AkhnZx) != null) {
                                textView5.setText(this.this$0.EZpvd(((ChartProfileDataResp) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).KWHzl()));
                            }
                            AbstractC46225tMl abstractC46225tMl18 = this.this$0.AEQbTJ;
                            if (abstractC46225tMl18 != null && (textView4 = abstractC46225tMl18.OLrzqt) != null) {
                                textView4.setText(this.this$0.EZpvd(((ChartProfileDataResp) CollectionsKt___CollectionsKt.AubY(list)).KWHzl()));
                            }
                            this.this$0.valueOf();
                        }
                    } else {
                        this.this$0.showLoading();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$3(tIE tie) {
                tie.KWHzl(tie.copydefault);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<AbstractC46197tLk<List<ChartProfileDataResp>>> stateFlowOLrzqt = this.this$0.AYXKKw().OLrzqt();
                C06181 c06181 = new C06181(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowOLrzqt, c06181, this) == objCopydefault) {
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
