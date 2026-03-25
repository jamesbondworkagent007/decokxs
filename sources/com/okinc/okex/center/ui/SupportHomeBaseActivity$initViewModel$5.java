package com.okinc.okex.center.ui;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bumptech.glide.Glide;
import com.okinc.okex.center.ui.SupportHomeBaseActivity;
import com.okinc.okex.center.ui.SupportHomeBaseActivity$initViewModel$5;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.displaymodels.ChatbotEntryDisplayModel;
import com.okinc.okex.center.view.TransformableFloatingUnReadMsgActionButton;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC5449Sd;
import o.C45065sik;
import o.C45136skB;
import o.C52794wYp;
import o.C55296xhK;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC5460So;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportHomeBaseActivity$initViewModel$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SupportHomeBaseActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportHomeBaseActivity$initViewModel$5(SupportHomeBaseActivity supportHomeBaseActivity, Continuation<? super SupportHomeBaseActivity$initViewModel$5> continuation) {
        super(2, continuation);
        this.this$0 = supportHomeBaseActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportHomeBaseActivity$initViewModel$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportHomeBaseActivity$initViewModel$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.SupportHomeBaseActivity$initViewModel$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SupportHomeBaseActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SupportHomeBaseActivity supportHomeBaseActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = supportHomeBaseActivity;
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

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.SupportHomeBaseActivity$initViewModel$5$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05341 extends SuspendLambda implements Function2<SupportCenterHomeViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SupportHomeBaseActivity this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05341(SupportHomeBaseActivity supportHomeBaseActivity, Continuation<? super C05341> continuation) {
                super(2, continuation);
                this.this$0 = supportHomeBaseActivity;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05341 c05341 = new C05341(this.this$0, continuation);
                c05341.L$0 = obj;
                return c05341;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportCenterHomeViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                return ((C05341) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SupportCenterHomeViewModel.StateListAnimator stateListAnimator = (SupportCenterHomeViewModel.StateListAnimator) this.L$0;
                    if (stateListAnimator instanceof SupportCenterHomeViewModel.StateListAnimator.Activity) {
                        LinearLayout linearLayout = this.this$0.gEmmrt().valueOf;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                        linearLayout.setVisibility(0);
                        this.this$0.AYXKKw().KWHzl(false);
                        this.this$0.AYXKKw().OLrzqt(this.this$0.djBIcL, SupportHomeBaseActivity.PageState.CONTENT);
                        C45136skB c45136skBAYXKKw = this.this$0.AYXKKw();
                        SupportCenterHomeViewModel.StateListAnimator.Activity activity = (SupportCenterHomeViewModel.StateListAnimator.Activity) stateListAnimator;
                        ChatbotEntryDisplayModel chatbotEntryDisplayModelCopydefault = activity.copydefault();
                        boolean zDjBIcL = activity.djBIcL();
                        final SupportHomeBaseActivity supportHomeBaseActivity = this.this$0;
                        c45136skBAYXKKw.copydefault(chatbotEntryDisplayModelCopydefault, zDjBIcL, new Function1() { // from class: o.sgl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return SupportHomeBaseActivity$initViewModel$5.AnonymousClass1.C05341.invokeSuspend$lambda$0(supportHomeBaseActivity, (java.lang.String) obj2);
                            }
                        });
                        this.this$0.fetchVPNInfo = activity.gEmmrt();
                        this.this$0.AYXKKw().OLrzqt(this.this$0.fetchVPNInfo, this.this$0.fetchVPNInfo);
                        if (!Intrinsics.EZpvd(activity.OLrzqt(), this.this$0.valueOf)) {
                            AnnouncementPopupDisplayModel announcementPopupDisplayModelOLrzqt = activity.OLrzqt();
                            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                            C45065sik.OLrzqt(announcementPopupDisplayModelOLrzqt, supportFragmentManager);
                            this.this$0.valueOf = activity.OLrzqt();
                        }
                    } else if (stateListAnimator instanceof SupportCenterHomeViewModel.StateListAnimator.ActionBar) {
                        TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton = this.this$0.AEQbTJ().valueOf;
                        Intrinsics.checkNotNullExpressionValue(transformableFloatingUnReadMsgActionButton, "");
                        transformableFloatingUnReadMsgActionButton.setVisibility(8);
                        LinearLayout linearLayout2 = this.this$0.gEmmrt().valueOf;
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                        linearLayout2.setVisibility(8);
                        this.this$0.AYXKKw().KWHzl(false);
                        this.this$0.AYXKKw().OLrzqt(this.this$0.djBIcL, SupportHomeBaseActivity.PageState.LOADING);
                    } else if (stateListAnimator instanceof SupportCenterHomeViewModel.StateListAnimator.Application) {
                        TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton2 = this.this$0.AEQbTJ().valueOf;
                        Intrinsics.checkNotNullExpressionValue(transformableFloatingUnReadMsgActionButton2, "");
                        transformableFloatingUnReadMsgActionButton2.setVisibility(8);
                        LinearLayout linearLayout3 = this.this$0.gEmmrt().valueOf;
                        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                        linearLayout3.setVisibility(8);
                        this.this$0.AYXKKw().KWHzl(true);
                        this.this$0.AYXKKw().OLrzqt(this.this$0.djBIcL, SupportHomeBaseActivity.PageState.CONTENT);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(SupportHomeBaseActivity supportHomeBaseActivity, String str) {
                Glide.KWHzl(supportHomeBaseActivity.gEmmrt().KWHzl).EZpvd(str).OLrzqt(C55298xhM.dp2px$default(16.0f, null, 1, null)).OLrzqt(new TaskDescription(supportHomeBaseActivity));
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.okex.center.ui.SupportHomeBaseActivity$initViewModel$5$1$1$TaskDescription */
            public static final class TaskDescription extends AbstractC5449Sd<Drawable> {
                public final /* synthetic */ SupportHomeBaseActivity AEQbTJ;

                @Override // o.InterfaceC5462Sq
                public void a_(Drawable drawable) {
                }

                public TaskDescription(SupportHomeBaseActivity supportHomeBaseActivity) {
                    this.AEQbTJ = supportHomeBaseActivity;
                }

                /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
                @Override // o.InterfaceC5462Sq
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public void copydefault(Drawable drawable, InterfaceC5460So<? super Drawable> interfaceC5460So) {
                    Intrinsics.checkNotNullParameter(drawable, "");
                    C52794wYp c52794wYp = this.AEQbTJ.gEmmrt().KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                    if (!C55296xhK.AEQbTJ(c52794wYp)) {
                        this.AEQbTJ.gEmmrt().KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    } else {
                        this.AEQbTJ.gEmmrt().KWHzl.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<SupportCenterHomeViewModel.StateListAnimator> stateFlowDjBIcL = this.this$0.valueOf().djBIcL();
                C05341 c05341 = new C05341(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowDjBIcL, c05341, this) == objCopydefault) {
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
            SupportHomeBaseActivity supportHomeBaseActivity = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(supportHomeBaseActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(supportHomeBaseActivity, state, anonymousClass1, this) == objCopydefault) {
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
