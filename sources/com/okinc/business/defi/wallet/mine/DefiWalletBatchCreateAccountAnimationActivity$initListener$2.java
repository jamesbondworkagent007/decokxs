package com.okinc.business.defi.wallet.mine;

import android.content.Intent;
import android.view.View;
import android.widget.Checkable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.wallet.mine.viewmodel.DefiWalletBatchCreateAccountAnimationModel;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC16331ehs;
import o.ActivityC18496fjW;
import o.C13754dXa;
import o.C33069mpW;
import o.C33070mpX;
import o.C52794wYp;
import o.C55178xez;
import o.C55296xhK;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletBatchCreateAccountAnimationActivity$initListener$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC18496fjW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletBatchCreateAccountAnimationActivity$initListener$2(ActivityC18496fjW activityC18496fjW, Continuation<? super DefiWalletBatchCreateAccountAnimationActivity$initListener$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC18496fjW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletBatchCreateAccountAnimationActivity$initListener$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletBatchCreateAccountAnimationActivity$initListener$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC18496fjW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC18496fjW activityC18496fjW, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC18496fjW;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus> flowAhwBna = this.this$0.copydefault().AhwBna();
                final ActivityC18496fjW activityC18496fjW = this.this$0;
                FlowCollector<? super DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity.initListener.2.1.2

                    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$2$1$2$TaskDescription */
                    public final /* synthetic */ class TaskDescription {
                        public static final /* synthetic */ int[] EZpvd;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        static {
                            int[] iArr = new int[DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus.values().length];
                            try {
                                iArr[DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus.FAILED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus.PART_SUCCESS.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus.ALL_SUCCESS.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            EZpvd = iArr;
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(DefiWalletBatchCreateAccountAnimationModel.CreateResultStatus createResultStatus, Continuation<? super Unit> continuation) {
                        C55178xez c55178xez;
                        AbstractC16331ehs abstractC16331ehs = activityC18496fjW.EZpvd;
                        if (abstractC16331ehs != null && (c55178xez = abstractC16331ehs.OLrzqt) != null) {
                            ActivityC18496fjW activityC18496fjW2 = activityC18496fjW;
                            c55178xez.setVisibility(0);
                            c55178xez.AEQbTJ().setVisibility(8);
                            int i2 = TaskDescription.EZpvd[createResultStatus.ordinal()];
                            if (i2 == 1) {
                                c55178xez.setStatus(3);
                                c55178xez.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatItemCallbackItemCallbackApi23));
                                c55178xez.setSubTitleText(C33069mpW.copydefault(C13754dXa.FragmentManager.onError, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, String.valueOf(activityC18496fjW2.copydefault().AkhnZx())))));
                                C52794wYp c52794wYpCopydefault = c55178xez.OLrzqt().copydefault();
                                if (c52794wYpCopydefault != null) {
                                    c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onConnected));
                                }
                                C52794wYp c52794wYpAEQbTJ = c55178xez.OLrzqt().AEQbTJ();
                                if (c52794wYpAEQbTJ != null) {
                                    c52794wYpAEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendCustomAction));
                                }
                                C52794wYp c52794wYpCopydefault2 = c55178xez.OLrzqt().copydefault();
                                if (c52794wYpCopydefault2 != null) {
                                    c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, c55178xez, activityC18496fjW2));
                                }
                                C52794wYp c52794wYpAEQbTJ2 = c55178xez.OLrzqt().AEQbTJ();
                                if (c52794wYpAEQbTJ2 != null) {
                                    c52794wYpAEQbTJ2.setOnClickListener(new Activity(c52794wYpAEQbTJ2, 1000L, activityC18496fjW2));
                                }
                            } else if (i2 == 2) {
                                activityC18496fjW2.copydefault().AuCTel();
                                c55178xez.setStatus(4);
                                c55178xez.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImpl));
                                c55178xez.setSubTitleText(activityC18496fjW2.EZpvd());
                                C52794wYp c52794wYpCopydefault3 = c55178xez.OLrzqt().copydefault();
                                if (c52794wYpCopydefault3 != null) {
                                    c52794wYpCopydefault3.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onConnected));
                                }
                                C52794wYp c52794wYpAEQbTJ3 = c55178xez.OLrzqt().AEQbTJ();
                                if (c52794wYpAEQbTJ3 != null) {
                                    c52794wYpAEQbTJ3.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendCustomAction));
                                }
                                C52794wYp c52794wYpCopydefault4 = c55178xez.OLrzqt().copydefault();
                                if (c52794wYpCopydefault4 != null) {
                                    c52794wYpCopydefault4.setOnClickListener(new StateListAnimator(c52794wYpCopydefault4, 1000L, c55178xez, activityC18496fjW2));
                                }
                                C52794wYp c52794wYpAEQbTJ4 = c55178xez.OLrzqt().AEQbTJ();
                                if (c52794wYpAEQbTJ4 != null) {
                                    c52794wYpAEQbTJ4.setOnClickListener(new Application(c52794wYpAEQbTJ4, 1000L, activityC18496fjW2));
                                }
                            } else if (i2 == 3) {
                                activityC18496fjW2.copydefault().AuCTel();
                                c55178xez.setStatus(4);
                                c55178xez.setTitleText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImpl));
                                c55178xez.setSubTitleText(C33069mpW.copydefault(C13754dXa.FragmentManager.onItemLoaded, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, String.valueOf(activityC18496fjW2.copydefault().gEmmrt())))));
                                C52794wYp c52794wYpCopydefault5 = c55178xez.OLrzqt().copydefault();
                                if (c52794wYpCopydefault5 != null) {
                                    c52794wYpCopydefault5.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onConnectionFailed));
                                }
                                C52794wYp c52794wYpAEQbTJ5 = c55178xez.OLrzqt().AEQbTJ();
                                if (c52794wYpAEQbTJ5 != null) {
                                    c52794wYpAEQbTJ5.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendCustomAction));
                                }
                                C52794wYp c52794wYpCopydefault6 = c55178xez.OLrzqt().copydefault();
                                if (c52794wYpCopydefault6 != null) {
                                    c52794wYpCopydefault6.setOnClickListener(new Fragment(c52794wYpCopydefault6, 1000L, activityC18496fjW2));
                                }
                                C52794wYp c52794wYpAEQbTJ6 = c55178xez.OLrzqt().AEQbTJ();
                                if (c52794wYpAEQbTJ6 != null) {
                                    c52794wYpAEQbTJ6.setVisibility(8);
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        activityC18496fjW.djBIcL();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$2$1$2$ActionBar */
                    public static final class ActionBar implements View.OnClickListener {
                        public final /* synthetic */ View EZpvd;
                        public final /* synthetic */ ActivityC18496fjW KWHzl;
                        public final /* synthetic */ long OLrzqt;
                        public final /* synthetic */ C55178xez copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public ActionBar(View view, long j, C55178xez c55178xez, ActivityC18496fjW activityC18496fjW) {
                            this.EZpvd = view;
                            this.OLrzqt = j;
                            this.copydefault = c55178xez;
                            this.KWHzl = activityC18496fjW;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                                this.copydefault.setVisibility(8);
                                this.KWHzl.copydefault().copydefault(this.KWHzl.copydefault().AkhnZx() - this.KWHzl.copydefault().gEmmrt());
                                this.KWHzl.AEQbTJ();
                                this.KWHzl.AEQbTJ("accounts_add_retry");
                            }
                        }
                    }

                    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$2$1$2$Activity */
                    public static final class Activity implements View.OnClickListener {
                        public final /* synthetic */ long EZpvd;
                        public final /* synthetic */ View KWHzl;
                        public final /* synthetic */ ActivityC18496fjW copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public Activity(View view, long j, ActivityC18496fjW activityC18496fjW) {
                            this.KWHzl = view;
                            this.EZpvd = j;
                            this.copydefault = activityC18496fjW;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                                this.copydefault.AEQbTJ("accounts_add_back");
                                this.copydefault.finish();
                            }
                        }
                    }

                    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$2$1$2$Application */
                    public static final class Application implements View.OnClickListener {
                        public final /* synthetic */ long EZpvd;
                        public final /* synthetic */ View KWHzl;
                        public final /* synthetic */ ActivityC18496fjW OLrzqt;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public Application(View view, long j, ActivityC18496fjW activityC18496fjW) {
                            this.KWHzl = view;
                            this.EZpvd = j;
                            this.OLrzqt = activityC18496fjW;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                                this.OLrzqt.AEQbTJ("accounts_add_back");
                                ActivityC18496fjW activityC18496fjW = this.OLrzqt;
                                Intent intent = new Intent();
                                intent.putExtra("walletCount", this.OLrzqt.copydefault().AkhnZx() - this.OLrzqt.copydefault().gEmmrt());
                                Unit unit = Unit.INSTANCE;
                                activityC18496fjW.setResult(-1, intent);
                                this.OLrzqt.finish();
                            }
                        }
                    }

                    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$2$1$2$Fragment */
                    public static final class Fragment implements View.OnClickListener {
                        public final /* synthetic */ View KWHzl;
                        public final /* synthetic */ ActivityC18496fjW OLrzqt;
                        public final /* synthetic */ long copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public Fragment(View view, long j, ActivityC18496fjW activityC18496fjW) {
                            this.KWHzl = view;
                            this.copydefault = j;
                            this.OLrzqt = activityC18496fjW;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                                this.OLrzqt.AEQbTJ("accounts_add_done");
                                this.OLrzqt.setResult(-1);
                                this.OLrzqt.finish();
                            }
                        }
                    }

                    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$2$1$2$StateListAnimator */
                    public static final class StateListAnimator implements View.OnClickListener {
                        public final /* synthetic */ View EZpvd;
                        public final /* synthetic */ C55178xez KWHzl;
                        public final /* synthetic */ long OLrzqt;
                        public final /* synthetic */ ActivityC18496fjW copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public StateListAnimator(View view, long j, C55178xez c55178xez, ActivityC18496fjW activityC18496fjW) {
                            this.EZpvd = view;
                            this.OLrzqt = j;
                            this.KWHzl = c55178xez;
                            this.copydefault = activityC18496fjW;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                                this.KWHzl.setVisibility(8);
                                this.copydefault.copydefault().copydefault(this.copydefault.copydefault().AkhnZx() - this.copydefault.copydefault().gEmmrt());
                                this.copydefault.AEQbTJ();
                                this.copydefault.AEQbTJ("accounts_add_retry");
                            }
                        }
                    }
                };
                this.label = 1;
                if (flowAhwBna.collect(flowCollector, this) == objCopydefault) {
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
            ActivityC18496fjW activityC18496fjW = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC18496fjW, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC18496fjW, state, anonymousClass1, this) == objCopydefault) {
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
