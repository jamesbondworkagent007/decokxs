package o;

import android.animation.Animator;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeDoneParam;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fSK extends AbstractActivityC17828fTu {
    public final int AEQbTJ;
    public final int AYXKKw;
    public C16259egZ KWHzl;
    public android.os.Handler OLrzqt;
    public final float copydefault = 60.0f;
    public final long gEmmrt = 2817;
    public final int AhwBna = (int) 60.0f;
    public final java.lang.Runnable EZpvd = new java.lang.Runnable() { // from class: o.fSO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            fSK.AYXKKw(this.AEQbTJ);
        }
    };

    public fSK() {
        int i = (int) ((2817 / 1000.0f) * 60.0f);
        this.AYXKKw = i;
        this.AEQbTJ = i;
    }

    public static final class StateListAnimator extends ActivityResultContract<ActivateTeeDoneParam, ActivityResult> {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull ActivateTeeDoneParam activateTeeDoneParam) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(activateTeeDoneParam, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fSK.class);
            intent.putExtra("tee_account_info", activateTeeDoneParam);
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i, android.content.Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX DEBUG: Possible override for method o.fTu.AEQbTJ()V */
    public final ActivateTeeDoneParam AEQbTJ() {
        return (ActivateTeeDoneParam) getIntent().getParcelableExtra("tee_account_info");
    }

    public static final void AYXKKw(fSK fsk) {
        C16259egZ c16259egZ = fsk.KWHzl;
        if (c16259egZ == null) {
            Intrinsics.gEmmrt("");
            c16259egZ = null;
        }
        LottieAnimationView lottieAnimationView = c16259egZ.AYXKKw;
        lottieAnimationView.setMinAndMaxFrame(0, fsk.AhwBna);
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.playAnimation();
        lottieAnimationView.addAnimatorListener(new TaskDescription(lottieAnimationView, fsk));
    }

    public static final class TaskDescription implements Animator.AnimatorListener {
        public final /* synthetic */ LottieAnimationView AEQbTJ;
        public final /* synthetic */ fSK EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription(LottieAnimationView lottieAnimationView, fSK fsk) {
            this.AEQbTJ = lottieAnimationView;
            this.EZpvd = fsk;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.AEQbTJ.removeAnimatorListener(this);
            this.AEQbTJ.setMinAndMaxFrame(this.EZpvd.AhwBna, this.EZpvd.AEQbTJ);
            this.AEQbTJ.setRepeatCount(-1);
            this.AEQbTJ.resumeAnimation();
        }
    }

    @Override // o.AbstractActivityC17828fTu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String strKWHzl;
        super.onCreate(bundle);
        C16259egZ c16259egZKWHzl = C16259egZ.KWHzl(getLayoutInflater());
        this.KWHzl = c16259egZKWHzl;
        C16259egZ c16259egZ = null;
        if (c16259egZKWHzl == null) {
            Intrinsics.gEmmrt("");
            c16259egZKWHzl = null;
        }
        setContentView(c16259egZKWHzl.getRoot());
        C32866mlf.onEvent$default("Web3WalletSmartAccountEnabledPage_Page_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fSN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fSK.KWHzl(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        getOnBackPressedDispatcher().addCallback(this, new Activity());
        C16259egZ c16259egZ2 = this.KWHzl;
        if (c16259egZ2 == null) {
            Intrinsics.gEmmrt("");
            c16259egZ2 = null;
        }
        c16259egZ2.valueOf.setBackVisible(8);
        this.OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
        OLrzqt();
        ActivateTeeDoneParam activateTeeDoneParamAEQbTJ = AEQbTJ();
        if (activateTeeDoneParamAEQbTJ != null) {
            C16259egZ c16259egZ3 = this.KWHzl;
            if (c16259egZ3 == null) {
                Intrinsics.gEmmrt("");
                c16259egZ3 = null;
            }
            ShapeableImageView shapeableImageView = c16259egZ3.KWHzl;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            C14725dqq.copydefault(shapeableImageView, activateTeeDoneParamAEQbTJ.getWalletAvatarStr(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fSP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fSK.KWHzl((C5335Nt) obj);
                }
            }, 80.0f);
            C16259egZ c16259egZ4 = this.KWHzl;
            if (c16259egZ4 == null) {
                Intrinsics.gEmmrt("");
                c16259egZ4 = null;
            }
            c16259egZ4.values.setText(activateTeeDoneParamAEQbTJ.getAccountName());
            C16259egZ c16259egZ5 = this.KWHzl;
            if (c16259egZ5 == null) {
                Intrinsics.gEmmrt("");
                c16259egZ5 = null;
            }
            AppCompatTextView appCompatTextView = c16259egZ5.djBIcL;
            if (activateTeeDoneParamAEQbTJ.getAutoRenew()) {
                strKWHzl = C33069mpW.copydefault(C13754dXa.FragmentManager.removeReporter, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Long.valueOf(activateTeeDoneParamAEQbTJ.getExpirePeriodDay())))));
            } else {
                strKWHzl = C33069mpW.KWHzl(this, C13754dXa.FragmentManager.DHEdFZ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("date", pTA.formatDate$default(new Date(activateTeeDoneParamAEQbTJ.getExpireTimestamp()), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null))));
            }
            appCompatTextView.setText(strKWHzl);
            C16259egZ c16259egZ6 = this.KWHzl;
            if (c16259egZ6 == null) {
                Intrinsics.gEmmrt("");
                c16259egZ6 = null;
            }
            c16259egZ6.AkhnZx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fRNHEq));
        }
        C16259egZ c16259egZ7 = this.KWHzl;
        if (c16259egZ7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16259egZ = c16259egZ7;
        }
        C52794wYp c52794wYp = c16259egZ.OLrzqt;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fSK.EZpvd(this.copydefault);
            }
        });
    }

    public static final Unit KWHzl(fSK fsk, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        ActivateTeeDoneParam activateTeeDoneParamAEQbTJ = fsk.AEQbTJ();
        java.lang.String pathSource = activateTeeDoneParamAEQbTJ != null ? activateTeeDoneParamAEQbTJ.getPathSource() : null;
        eventParamsList.put("path_source", pathSource != null ? pathSource : "", true);
        return Unit.INSTANCE;
    }

    public static final class Activity extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public Activity() {
            super(true);
        }
    }

    public static final Unit KWHzl(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(16.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(fSK fsk) {
        rVN.reportFullyDrawn$default((android.app.Activity) fsk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        try {
            C16259egZ c16259egZ = this.KWHzl;
            android.os.Handler handler = null;
            if (c16259egZ == null) {
                Intrinsics.gEmmrt("");
                c16259egZ = null;
            }
            LottieAnimationView lottieAnimationView = c16259egZ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            C14677dpv.KWHzl(lottieAnimationView, CDNSourceManager.LottieSource.SACreateDone);
            android.os.Handler handler2 = this.OLrzqt;
            if (handler2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                handler = handler2;
            }
            handler.postDelayed(this.EZpvd, 500L);
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "error message = " + e.getMessage());
        }
    }

    @Override // o.AbstractActivityC17828fTu, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.os.Handler handler = this.OLrzqt;
        C16259egZ c16259egZ = null;
        if (handler == null) {
            Intrinsics.gEmmrt("");
            handler = null;
        }
        handler.removeCallbacks(this.EZpvd);
        C16259egZ c16259egZ2 = this.KWHzl;
        if (c16259egZ2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16259egZ = c16259egZ2;
        }
        c16259egZ.AYXKKw.cancelAnimation();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ fSK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fSK fsk) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = fsk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.setResult(-1);
                this.copydefault.finish();
            }
        }
    }

    @Override // o.AbstractActivityC17828fTu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17828fTu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17828fTu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17828fTu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
