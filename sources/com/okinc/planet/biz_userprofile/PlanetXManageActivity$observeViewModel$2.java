package com.okinc.planet.biz_userprofile;

import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.account.api.model.usercenter.UnlinkXInput;
import com.okinc.components.track.TrackChannel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC46184tKy;
import o.C32866mlf;
import o.C33070mpX;
import o.C46215tMb;
import o.C47501trL;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.tKR;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetXManageActivity$observeViewModel$2 extends SuspendLambda implements Function2<C46215tMb.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC46184tKy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetXManageActivity$observeViewModel$2(ActivityC46184tKy activityC46184tKy, Continuation<? super PlanetXManageActivity$observeViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC46184tKy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetXManageActivity$observeViewModel$2 planetXManageActivity$observeViewModel$2 = new PlanetXManageActivity$observeViewModel$2(this.this$0, continuation);
        planetXManageActivity$observeViewModel$2.L$0 = obj;
        return planetXManageActivity$observeViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C46215tMb.Application application, Continuation<? super Unit> continuation) {
        return ((PlanetXManageActivity$observeViewModel$2) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strAYXKKw;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C46215tMb.Application application = (C46215tMb.Application) this.L$0;
            if (application instanceof C46215tMb.Application.StateListAnimator) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new AnonymousClass1(this.this$0, null), 3, null);
            } else if (application instanceof C46215tMb.Application.LoaderManager) {
                C55326xho.toastWithSuccessfulIcon$default(C47501trL.Fragment.OLrzqt, 0, 1, (Object) null);
                this.this$0.finish();
            } else if (application instanceof C46215tMb.Application.Dialog) {
                this.this$0.copydefault(((C46215tMb.Application.Dialog) application).AEQbTJ());
            } else if (application instanceof C46215tMb.Application.C0961Application) {
                this.this$0.showLoading();
            } else if (application instanceof C46215tMb.Application.ActionBar) {
                this.this$0.dismissLoading();
            } else if (application instanceof C46215tMb.Application.TaskDescription) {
                if (((C46215tMb.Application.TaskDescription) application).AEQbTJ()) {
                    strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.hdpuIA);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.hNurIN);
                }
                this.this$0.EZpvd(strAYXKKw);
            } else if (application instanceof C46215tMb.Application.Activity) {
                this.this$0.copydefault(((C46215tMb.Application.Activity) application).KWHzl());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_userprofile.PlanetXManageActivity$observeViewModel$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC46184tKy this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC46184tKy activityC46184tKy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC46184tKy;
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
            Object objAEQbTJ;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.showLoading();
                    tKR tkr = tKR.KWHzl;
                    this.label = 1;
                    objAEQbTJ = tkr.AEQbTJ(this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = ((Result) obj).m7386unboximpl();
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                boolean zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
                this.this$0.dismissLoading();
                if (!zBooleanValue) {
                    this.this$0.OLrzqt().AhwBna();
                } else {
                    ActivityResultLauncher activityResultLauncher = null;
                    C32866mlf.onEvent$default("Twitter_Account_Unlink_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                    ActivityResultLauncher activityResultLauncher2 = this.this$0.KWHzl;
                    if (activityResultLauncher2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        activityResultLauncher = activityResultLauncher2;
                    }
                    activityResultLauncher.launch(new UnlinkXInput(this.this$0.OLrzqt().AEQbTJ()));
                }
            } catch (Exception e) {
                this.this$0.dismissLoading();
                String message = e.getMessage();
                pUU.valueOf("UnlinkX pre-check failed", message != null ? message : "");
                ActivityC46184tKy activityC46184tKy = this.this$0;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = String.valueOf(C47501trL.Fragment.apAOXX);
                }
                activityC46184tKy.copydefault(message2);
            }
            return Unit.INSTANCE;
        }
    }
}
