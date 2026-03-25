package o;

import android.animation.Animator;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.components.track.TrackChannel;
import com.okinc.okuser.data.User;
import com.okinc.planet.biz_onboarding.OrbitIntroductionActivity$handleStepAnimationEnd$1;
import com.okinc.planet.biz_onboarding.OrbitIntroductionActivity$onActionButtonClick$1;
import com.okinc.planet.biz_onboarding.OrbitIntroductionActivity$onCreate$3;
import com.okinc.planet.biz_onboarding.OrbitIntroductionActivity$setupUI$1$3$onPageSelected$1;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.C47501trL;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC45902tAm extends AbstractActivityC47505trP implements InterfaceC47502trM<C46234tMu> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public Job AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public int DbNXlk;
    public final ActivityResultLauncher<android.content.Intent> EZpvd;
    public C45914tAy OLrzqt;
    public OnBackPressedCallback djBIcL;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public Job isConnected;
    public C46234tMu valueOf;
    public boolean values;
    public java.lang.String copydefault = "OrbitOnboardingActivity";
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.tAs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45902tAm.AYXKKw();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C46234tMu OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(C46234tMu c46234tMu) {
        this.valueOf = c46234tMu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return "OrbitOnboardingActivity";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public ActivityC45902tAm() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.tAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC45902tAm.AEQbTJ(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC47278tmy AYXKKw() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    private final InterfaceC47278tmy djBIcL() {
        return (InterfaceC47278tmy) this.AkhnZx.getValue();
    }

    /* JADX INFO: renamed from: o.tAm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(android.content.Context context) {
            if (context != null) {
                context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC45902tAm.class));
                C46386tSk.setShowOrbitIntroduction$default(C46386tSk.copydefault, null, 1, null);
            }
        }
    }

    public static final void AEQbTJ(ActivityC45902tAm activityC45902tAm, ActivityResult activityResult) {
        C46234tMu c46234tMuOLrzqt;
        android.widget.FrameLayout root;
        if (activityResult.getResultCode() != 1281 || (c46234tMuOLrzqt = activityC45902tAm.OLrzqt()) == null || (root = c46234tMuOLrzqt.getRoot()) == null) {
            return;
        }
        tIE.Companion.KWHzl(root);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.widget.FrameLayout root;
        getDelegate().setLocalNightMode(2);
        super.onCreate(bundle);
        C46234tMu c46234tMuKWHzl = C46234tMu.KWHzl(getLayoutInflater());
        setContentView(c46234tMuKWHzl.getRoot());
        EZpvd(c46234tMuKWHzl);
        this.djBIcL = new Activity();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        OnBackPressedCallback onBackPressedCallback = this.djBIcL;
        if (onBackPressedCallback == null) {
            Intrinsics.gEmmrt("");
            onBackPressedCallback = null;
        }
        onBackPressedDispatcher.addCallback(this, onBackPressedCallback);
        valueOf();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OrbitIntroductionActivity$onCreate$3(null), 3, null);
        C46234tMu c46234tMuOLrzqt = OLrzqt();
        if (c46234tMuOLrzqt == null || (root = c46234tMuOLrzqt.getRoot()) == null) {
            return;
        }
        root.post(new java.lang.Runnable() { // from class: o.tAp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45902tAm.isConnected(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.tAm$Activity */
    public static final class Activity extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public Activity() {
            super(true);
        }
    }

    public static final void isConnected(ActivityC45902tAm activityC45902tAm) {
        if (activityC45902tAm.gEmmrt) {
            return;
        }
        activityC45902tAm.gEmmrt = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45902tAm, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    private final void valueOf() {
        C46234tMu c46234tMuOLrzqt = OLrzqt();
        if (c46234tMuOLrzqt != null) {
            C52794wYp c52794wYpCopydefault = c46234tMuOLrzqt.copydefault.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DGUQLI));
            }
            c46234tMuOLrzqt.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.tAt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC45902tAm.AEQbTJ(this.copydefault, view);
                }
            });
            java.util.List<C45913tAx> listEZpvd = EZpvd();
            C45914tAy c45914tAy = new C45914tAy(listEZpvd, null, 2, null);
            c45914tAy.KWHzl(new Function1() { // from class: o.tAr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC45902tAm.OLrzqt(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
            this.OLrzqt = c45914tAy;
            c46234tMuOLrzqt.AYXKKw.setAdapter(c45914tAy);
            c46234tMuOLrzqt.AYXKKw.setOffscreenPageLimit(1);
            c46234tMuOLrzqt.AEQbTJ.setCount(listEZpvd.size());
            c46234tMuOLrzqt.AEQbTJ.setStyle(1);
            c46234tMuOLrzqt.AEQbTJ.setSelectedItem(0);
            c46234tMuOLrzqt.AYXKKw.registerOnPageChangeCallback(new ActionBar(c46234tMuOLrzqt, this));
            c46234tMuOLrzqt.EZpvd.setRepeatCount(0);
            c46234tMuOLrzqt.EZpvd.setAnimation(C47501trL.PendingIntent.KWHzl);
            c46234tMuOLrzqt.EZpvd.removeAllAnimatorListeners();
            c46234tMuOLrzqt.EZpvd.addAnimatorListener(new Application());
            c46234tMuOLrzqt.EZpvd.playAnimation();
        }
    }

    public static final void AEQbTJ(ActivityC45902tAm activityC45902tAm, android.view.View view) {
        activityC45902tAm.AhwBna();
    }

    public static final Unit OLrzqt(ActivityC45902tAm activityC45902tAm, int i) {
        activityC45902tAm.KWHzl(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tAm$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ ActivityC45902tAm OLrzqt;
        public final /* synthetic */ C46234tMu copydefault;

        public ActionBar(C46234tMu c46234tMu, ActivityC45902tAm activityC45902tAm) {
            this.copydefault = c46234tMu;
            this.OLrzqt = activityC45902tAm;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            android.widget.LinearLayout linearLayout = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            if (linearLayout.getVisibility() == 0) {
                int i3 = i + 1;
                float fKWHzl = C56548yJl.KWHzl(f, 0.0f, 1.0f);
                int currentItem = this.copydefault.AYXKKw.getCurrentItem();
                if (currentItem != i && currentItem == i3) {
                    fKWHzl = C56548yJl.KWHzl(1.0f - fKWHzl, 0.0f, 1.0f);
                } else {
                    i = i3;
                }
                float f2 = fKWHzl * 0.7f;
                float fKWHzl2 = C56548yJl.KWHzl(1.0f - f2, 0.3f, 1.0f);
                float fKWHzl3 = C56548yJl.KWHzl(f2 + 0.3f, 0.3f, 1.0f);
                C45914tAy c45914tAy = this.OLrzqt.OLrzqt;
                C45914tAy c45914tAy2 = null;
                if (c45914tAy == null) {
                    Intrinsics.gEmmrt("");
                    c45914tAy = null;
                }
                c45914tAy.OLrzqt(currentItem, fKWHzl2);
                C45914tAy c45914tAy3 = this.OLrzqt.OLrzqt;
                if (c45914tAy3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c45914tAy2 = c45914tAy3;
                }
                c45914tAy2.OLrzqt(i, fKWHzl3);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            this.OLrzqt.AhwBna = i == 1;
            if (i == 1) {
                this.OLrzqt.AYXKKw = true;
                android.widget.LinearLayout linearLayout = this.copydefault.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                if (linearLayout.getVisibility() == 0) {
                    this.OLrzqt.values = true;
                }
                Job job = this.OLrzqt.AEQbTJ;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            Job job = this.OLrzqt.AEQbTJ;
            C45914tAy c45914tAy = null;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            int i2 = this.OLrzqt.DbNXlk;
            android.widget.LinearLayout linearLayout = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            boolean z = false;
            if (linearLayout.getVisibility() == 0) {
                C32866mlf.onEvent$default("Orbit_Whole_Introidea_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                if (this.OLrzqt.values) {
                    C32866mlf.onEvent$default("Orbit_Btm_Introidea_Scroll", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                    this.OLrzqt.values = false;
                }
            }
            ActivityC45902tAm activityC45902tAm = this.OLrzqt;
            if (activityC45902tAm.AhwBna && i < this.OLrzqt.DbNXlk) {
                z = true;
            }
            activityC45902tAm.fetchVPNInfo = z;
            this.OLrzqt.DbNXlk = i;
            this.copydefault.AEQbTJ.setSelectedItem(i);
            android.widget.LinearLayout linearLayout2 = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            if (linearLayout2.getVisibility() == 0) {
                if (i2 != i) {
                    Job job2 = this.OLrzqt.isConnected;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
                    }
                    ActivityC45902tAm activityC45902tAm2 = this.OLrzqt;
                    activityC45902tAm2.isConnected = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC45902tAm2), null, null, new OrbitIntroductionActivity$setupUI$1$3$onPageSelected$1(this.OLrzqt, i, i2, null), 3, null);
                }
                C45914tAy c45914tAy2 = this.OLrzqt.OLrzqt;
                if (c45914tAy2 == null) {
                    Intrinsics.gEmmrt("");
                    c45914tAy2 = null;
                }
                c45914tAy2.copydefault(i);
                C45914tAy c45914tAy3 = this.OLrzqt.OLrzqt;
                if (c45914tAy3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c45914tAy = c45914tAy3;
                }
                c45914tAy.EZpvd(i);
            }
        }
    }

    /* JADX INFO: renamed from: o.tAm$Application */
    public static final class Application implements Animator.AnimatorListener {
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

        public Application() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (ActivityC45902tAm.this.isFinishing()) {
                return;
            }
            ActivityC45902tAm.this.gEmmrt();
        }
    }

    public final java.util.List<C45913tAx> EZpvd() {
        return yDY.gEmmrt(new C45913tAx(C33070mpX.AYXKKw(C47501trL.Fragment.hCLrkq), C33070mpX.AYXKKw(C47501trL.Fragment.DaRZkR), C47501trL.PendingIntent.AEQbTJ, true, C33070mpX.AYXKKw(C47501trL.Fragment.DGUQLI)), new C45913tAx(C33070mpX.AYXKKw(C47501trL.Fragment.DGOPHZDGOPHZ), C33070mpX.AYXKKw(C47501trL.Fragment.DGgnkA), C47501trL.PendingIntent.djBIcL, true, C33070mpX.AYXKKw(C47501trL.Fragment.DGUQLI)), new C45913tAx(C33070mpX.AYXKKw(C47501trL.Fragment.heceqZ), C33070mpX.AYXKKw(C47501trL.Fragment.OTwTPd), C47501trL.PendingIntent.AYXKKw, true, C33070mpX.AYXKKw(C47501trL.Fragment.DGUQLI)));
    }

    public final void gEmmrt() {
        C46234tMu c46234tMuOLrzqt = OLrzqt();
        if (c46234tMuOLrzqt != null) {
            C55113xdn c55113xdn = c46234tMuOLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(8);
            android.widget.LinearLayout linearLayout = c46234tMuOLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            wYF wyf = c46234tMuOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(wyf, "");
            wyf.setVisibility(0);
            Job job = this.AEQbTJ;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.fetchVPNInfo = false;
            this.AYXKKw = false;
            this.values = false;
            this.DbNXlk = c46234tMuOLrzqt.AYXKKw.getCurrentItem();
            c46234tMuOLrzqt.AEQbTJ.setSelectedItem(c46234tMuOLrzqt.AYXKKw.getCurrentItem());
            C45914tAy c45914tAy = this.OLrzqt;
            if (c45914tAy == null) {
                Intrinsics.gEmmrt("");
                c45914tAy = null;
            }
            c45914tAy.copydefault(c46234tMuOLrzqt.AYXKKw.getCurrentItem());
            C45914tAy c45914tAy2 = this.OLrzqt;
            if (c45914tAy2 == null) {
                Intrinsics.gEmmrt("");
                c45914tAy2 = null;
            }
            c45914tAy2.EZpvd(c46234tMuOLrzqt.AYXKKw.getCurrentItem());
            C32866mlf.onEvent$default("Orbit_Whole_Introidea_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    public final void KWHzl(int i) {
        C46234tMu c46234tMuOLrzqt = OLrzqt();
        if (c46234tMuOLrzqt != null && c46234tMuOLrzqt.AYXKKw.getCurrentItem() == i) {
            C45914tAy c45914tAy = this.OLrzqt;
            if (c45914tAy == null) {
                Intrinsics.gEmmrt("");
                c45914tAy = null;
            }
            if (i >= c45914tAy.getItemCount() - 1 || this.AYXKKw || this.fetchVPNInfo) {
                return;
            }
            Job job = this.AEQbTJ;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OrbitIntroductionActivity$handleStepAnimationEnd$1(this, i, null), 3, null);
        }
    }

    public final void AhwBna() {
        C32866mlf.onEvent$default("Orbit_Btm_Intronext_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        Job job = this.AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        C46234tMu c46234tMuOLrzqt = OLrzqt();
        if (c46234tMuOLrzqt == null) {
            return;
        }
        int currentItem = c46234tMuOLrzqt.AYXKKw.getCurrentItem();
        C45914tAy c45914tAy = this.OLrzqt;
        if (c45914tAy == null) {
            Intrinsics.gEmmrt("");
            c45914tAy = null;
        }
        c45914tAy.KWHzl(currentItem);
        C52794wYp c52794wYpCopydefault = c46234tMuOLrzqt.copydefault.copydefault();
        if (c52794wYpCopydefault != null) {
            C52794wYp.startLoading$default(c52794wYpCopydefault, 0L, 1, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OrbitIntroductionActivity$onActionButtonClick$1(this, null), 3, null);
    }

    public final void KWHzl(OrbitBeanResp orbitBeanResp) {
        if (orbitBeanResp != null) {
            if (djBIcL().values()) {
                java.lang.Integer hasVisitedOrbitGuide = orbitBeanResp.getHasVisitedOrbitGuide();
                if (hasVisitedOrbitGuide != null && hasVisitedOrbitGuide.intValue() == 0 && !C46388tSm.Companion.KWHzl().AYXKKw()) {
                    C45899tAj.copydefault.copydefault(this);
                }
                AEQbTJ();
                return;
            }
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), this, null, 2, null);
            finish();
            return;
        }
        finish();
    }

    public final void AEQbTJ() {
        if (djBIcL().values()) {
            C46386tSk c46386tSk = C46386tSk.copydefault;
            User userOLrzqt = djBIcL().OLrzqt();
            c46386tSk.getNewProxyInstance(userOLrzqt != null ? userOLrzqt.getUid() : null);
        }
        finish();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
