package com.okinc.kline.ui;

import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C36110oPq;
import o.C38605pcb;
import o.C39705pxQ;
import o.C39713pxY;
import o.C39718pxd;
import o.C39784pyq;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.oMG;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineIntroductionFragment$listenDataInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C38605pcb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineIntroductionFragment$listenDataInfo$2(C38605pcb c38605pcb, Continuation<? super KLineIntroductionFragment$listenDataInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = c38605pcb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineIntroductionFragment$listenDataInfo$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineIntroductionFragment$listenDataInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.KLineIntroductionFragment$listenDataInfo$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C39705pxQ>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C38605pcb this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C38605pcb c38605pcb, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c38605pcb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C39705pxQ> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<C39705pxQ>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<C39705pxQ> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            LinearLayout linearLayout;
            ImageView imageView;
            ImageView imageView2;
            C36110oPq c36110oPq;
            FrameLayout root;
            C36110oPq c36110oPq2;
            LinearLayout linearLayout2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    if (((C39705pxQ) activity.copydefault()).copydefault() != -1 && (!((C39705pxQ) activity.copydefault()).EZpvd().isEmpty())) {
                        oMG omgEZpvd = this.this$0.EZpvd();
                        if (omgEZpvd != null && (linearLayout2 = omgEZpvd.isConnected) != null) {
                            linearLayout2.setVisibility(0);
                        }
                        oMG omgEZpvd2 = this.this$0.EZpvd();
                        if (omgEZpvd2 != null && (c36110oPq2 = omgEZpvd2.fetchVPNInfo) != null) {
                            C39784pyq.AEQbTJ(c36110oPq2, ((C39705pxQ) activity.copydefault()).EZpvd().get(((C39705pxQ) activity.copydefault()).copydefault()));
                        }
                        oMG omgEZpvd3 = this.this$0.EZpvd();
                        if (omgEZpvd3 != null && (c36110oPq = omgEZpvd3.fetchVPNInfo) != null && (root = c36110oPq.getRoot()) != null) {
                            root.setOnClickListener(new Application(root, 1000L));
                        }
                        oMG omgEZpvd4 = this.this$0.EZpvd();
                        if (omgEZpvd4 != null && (imageView2 = omgEZpvd4.EZpvd) != null) {
                            imageView2.setVisibility(this.this$0.AYXKKw().valueOf() ? 0 : 8);
                        }
                        oMG omgEZpvd5 = this.this$0.EZpvd();
                        if (omgEZpvd5 != null && (imageView = omgEZpvd5.EZpvd) != null) {
                            imageView.setOnClickListener(new Activity(imageView, 1000L, this.this$0));
                        }
                    } else {
                        oMG omgEZpvd6 = this.this$0.EZpvd();
                        if (omgEZpvd6 != null && (linearLayout = omgEZpvd6.isConnected) != null) {
                            linearLayout.setVisibility(8);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.kline.ui.KLineIntroductionFragment$listenDataInfo$2$2$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ C38605pcb EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(View view, long j, C38605pcb c38605pcb) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.EZpvd = c38605pcb;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Fragment parentFragment = this.EZpvd.getParentFragment();
                    C39718pxd c39718pxd = parentFragment instanceof C39718pxd ? (C39718pxd) parentFragment : null;
                    if (c39718pxd != null) {
                        c39718pxd.djBIcL();
                    }
                    C32866mlf.onEvent$default("Chart_Overview_Information_Click", (TrackChannel[]) null, ActionBar.copydefault, 1, (Object) null);
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.kline.ui.KLineIntroductionFragment$listenDataInfo$2$2$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ View EZpvd;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(View view, long j) {
                this.EZpvd = view;
                this.copydefault = j;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Chart_Overview_Information_Click", (TrackChannel[]) null, TaskDescription.KWHzl, 1, (Object) null);
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.kline.ui.KLineIntroductionFragment$listenDataInfo$2$2$TaskDescription */
        public static final class TaskDescription implements Function1<EventParamsList, Unit> {
            public static final TaskDescription KWHzl = new TaskDescription();

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                copydefault(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void copydefault(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "button_click", "token_event_card", false, 4, null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.kline.ui.KLineIntroductionFragment$listenDataInfo$2$2$ActionBar */
        public static final class ActionBar implements Function1<EventParamsList, Unit> {
            public static final ActionBar copydefault = new ActionBar();

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                KWHzl(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void KWHzl(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "button_click", "view_all_clicks", false, 4, null);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C38605pcb c38605pcb = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(c38605pcb, c38605pcb.AYXKKw(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.KLineIntroductionFragment$listenDataInfo$2.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).copydefault((InterfaceC49371unL<C39705pxQ>) obj3);
                }
            }, null, new AnonymousClass2(this.this$0, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
