package com.okinc.business.defi.wallet.mine;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Checkable;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.ibm.icu.text.DateFormat;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.productmatrix.api.bean.ProductMatrixScene;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C10604brb;
import o.C13754dXa;
import o.C14728dqt;
import o.C16835erS;
import o.C17177exq;
import o.C18625flt;
import o.C19310fyq;
import o.C32979mnm;
import o.C43248rlh;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.dTU;
import o.dZP;
import o.rVN;
import o.tZJ;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletMineFragment$collectViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18625flt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletMineFragment$collectViewState$1(C18625flt c18625flt, Continuation<? super WalletMineFragment$collectViewState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18625flt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletMineFragment$collectViewState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletMineFragment$collectViewState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.WalletMineFragment$collectViewState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C19310fyq, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18625flt this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18625flt c18625flt, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18625flt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C19310fyq c19310fyq, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c19310fyq, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TextView textView;
            int color;
            TextView textView2;
            C16835erS c16835erS;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C19310fyq c19310fyq = (C19310fyq) this.L$0;
                if (c19310fyq == null) {
                    return Unit.INSTANCE;
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                if (c19310fyq.copydefault()) {
                    this.this$0.KWHzl();
                }
                C17177exq c17177exq = this.this$0.AhwBna;
                if (c17177exq != null && (c16835erS = c17177exq.copydefault) != null) {
                    C18625flt c18625flt = this.this$0;
                    if (c19310fyq.copydefault()) {
                        c16835erS.gEmmrt.setText(c18625flt.getString(C13754dXa.FragmentManager.IntentSenderRequest));
                        TextView textView3 = c16835erS.EZpvd;
                        Intrinsics.copydefault(textView3);
                        textView3.setVisibility(0);
                        textView3.setText(c18625flt.getString(C13754dXa.FragmentManager.getFillInIntent));
                        C52794wYp c52794wYp = c16835erS.copydefault;
                        if (C14728dqt.KWHzl.OLrzqt()) {
                            Intrinsics.copydefault(c52794wYp);
                            c52794wYp.setVisibility(8);
                        } else {
                            Intrinsics.copydefault(c52794wYp);
                            c52794wYp.setVisibility(0);
                            c52794wYp.setText(c18625flt.getString(C13754dXa.FragmentManager.DGGHxk));
                            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, c18625flt));
                        }
                        C52794wYp c52794wYp2 = c16835erS.KWHzl;
                        Intrinsics.copydefault(c52794wYp2);
                        c52794wYp2.setVisibility(0);
                        c52794wYp2.setText(c18625flt.getString(C13754dXa.FragmentManager.ExKek));
                        c52794wYp2.setOnClickListener(new LoaderManager(c52794wYp2, 1000L, c18625flt));
                        Space space = c16835erS.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(space, "");
                        space.setVisibility(8);
                    } else {
                        c16835erS.gEmmrt.setText(c18625flt.getString(C13754dXa.FragmentManager.sElUiK));
                        TextView textView4 = c16835erS.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(textView4, "");
                        textView4.setVisibility(8);
                        C52794wYp c52794wYp3 = c16835erS.copydefault;
                        Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
                        c52794wYp3.setVisibility(8);
                        C52794wYp c52794wYp4 = c16835erS.KWHzl;
                        Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
                        c52794wYp4.setVisibility(8);
                        Space space2 = c16835erS.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(space2, "");
                        space2.setVisibility(0);
                    }
                }
                this.this$0.getChildFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.putInt, ((tZJ) C43248rlh.KWHzl.AEQbTJ(tZJ.class)).EZpvd(ProductMatrixScene.WEB3, c19310fyq.KWHzl()), this.this$0.AYXKKw).commitAllowingStateLoss();
                String string = DateFormat.ABBR_GENERIC_TZ + C32979mnm.EZpvd.EZpvd();
                if (!c19310fyq.EZpvd()) {
                    C17177exq c17177exq2 = this.this$0.AhwBna;
                    if (c17177exq2 != null && (textView = c17177exq2.EZpvd) != null) {
                        textView.setText(string);
                    }
                } else {
                    Context context = this.this$0.getContext();
                    if (context != null) {
                        color = ContextCompat.getColor(context, C52761wXj.Activity.DQzvGN);
                    } else {
                        color = Color.parseColor("#ED0F0F");
                    }
                    if (!c19310fyq.copydefault()) {
                        string = this.this$0.getString(C13754dXa.FragmentManager.QfZsXX);
                        Intrinsics.copydefault((Object) string);
                    }
                    String str = this.this$0.getString(C13754dXa.FragmentManager.DsfknC) + "  " + string;
                    C17177exq c17177exq3 = this.this$0.AhwBna;
                    if (c17177exq3 != null && (textView2 = c17177exq3.EZpvd) != null) {
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new ForegroundColorSpan(color), 0, 1, 33);
                        textView2.setText(spannableString);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.WalletMineFragment$collectViewState$1$1$Activity */
        public static final class Activity implements Function1<EventParamsList, Unit> {
            public static final Activity KWHzl = new Activity();

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                OLrzqt(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void OLrzqt(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                eventParamsList.add(new EventParam("new_wallet_method", "create", true));
                eventParamsList.add(new EventParam("is_exchange_user", dZP.OLrzqt.valueOf() ? "yes" : "no", true));
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.WalletMineFragment$collectViewState$1$1$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C18625flt EZpvd;
            public final /* synthetic */ View KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(View view, long j, C18625flt c18625flt) {
                this.KWHzl = view;
                this.copydefault = j;
                this.EZpvd = c18625flt;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    dTU.onWeb3Event$default("Web3Onboarding_NewWalletMethod_Button_Click", null, Activity.KWHzl, 1, null);
                    this.EZpvd.OLrzqt("create_wallet");
                    C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                    Context contextRequireContext = this.EZpvd.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    C18625flt c18625flt = this.EZpvd;
                    instance$default.KWHzl(contextRequireContext, c18625flt, new TaskDescription(c18625flt));
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.WalletMineFragment$collectViewState$1$1$LoaderManager */
        public static final class LoaderManager implements View.OnClickListener {
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ View OLrzqt;
            public final /* synthetic */ C18625flt copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public LoaderManager(View view, long j, C18625flt c18625flt) {
                this.OLrzqt = view;
                this.KWHzl = j;
                this.copydefault = c18625flt;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    dTU.onWeb3Event$default("Web3Onboarding_NewWalletMethod_Button_Click", null, ActionBar.OLrzqt, 1, null);
                    this.copydefault.OLrzqt("import_wallet");
                    C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                    Context contextRequireContext = this.copydefault.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    C18625flt c18625flt = this.copydefault;
                    instance$default.KWHzl(contextRequireContext, c18625flt, new StateListAnimator(c18625flt));
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.WalletMineFragment$collectViewState$1$1$TaskDescription */
        public static final class TaskDescription implements Function0<Unit> {
            public final /* synthetic */ C18625flt copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(C18625flt c18625flt) {
                this.copydefault = c18625flt;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ Unit invoke() {
                AEQbTJ();
                return Unit.INSTANCE;
            }

            public final void AEQbTJ() {
                this.copydefault.EZpvd((Function0<Unit>) new WalletMineFragment$collectViewState$1$1$1$1$2$1$2$1(this.copydefault));
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.WalletMineFragment$collectViewState$1$1$ActionBar */
        public static final class ActionBar implements Function1<EventParamsList, Unit> {
            public static final ActionBar OLrzqt = new ActionBar();

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                copydefault(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void copydefault(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                eventParamsList.add(new EventParam("new_wallet_method", Web3SecurityTrackEvent.VALUE_IMPORT, true));
                eventParamsList.add(new EventParam("is_exchange_user", dZP.OLrzqt.valueOf() ? "yes" : "no", true));
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.WalletMineFragment$collectViewState$1$1$StateListAnimator */
        public static final class StateListAnimator implements Function0<Unit> {
            public final /* synthetic */ C18625flt KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(C18625flt c18625flt) {
                this.KWHzl = c18625flt;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ Unit invoke() {
                KWHzl();
                return Unit.INSTANCE;
            }

            public final void KWHzl() {
                this.KWHzl.EZpvd((Function0<Unit>) new WalletMineFragment$collectViewState$1$1$1$1$3$1$2$1(this.KWHzl));
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<C19310fyq> stateFlowOLrzqt = this.this$0.EZpvd().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
