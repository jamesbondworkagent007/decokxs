package o;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.TagColorMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oHA extends android.widget.FrameLayout {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public float copydefault;
    public android.app.Activity djBIcL;
    public StateListAnimator fetchVPNInfo;
    public final nKU gEmmrt;
    public android.animation.ObjectAnimator valueOf;
    public TaskDescription values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {
    }

    public interface TaskDescription {
        void AEQbTJ();

        void EZpvd();

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oHA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oHA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewClickListener(TaskDescription taskDescription) {
        this.values = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewNotAccessibleListener(StateListAnimator stateListAnimator) {
        this.fetchVPNInfo = stateListAnimator;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:45) call: o.oHA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ oHA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oHA(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.oHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oHA.EZpvd(context, this);
            }
        });
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(fJNWhG()), C35399nuc.Dialog.DsrFlB, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        nKU nku = (nKU) viewDataBindingInflate;
        this.gEmmrt = nku;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.oHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oHA.KWHzl(context);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.oHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oHA.KWHzl(this.KWHzl);
            }
        });
        nku.OLrzqt(true);
        setupClickListeners();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final android.content.Context fJNWhG() {
        return (android.content.Context) this.DbNXlk.getValue();
    }

    public static final android.content.Context EZpvd(android.content.Context context, oHA oha) {
        return ((context instanceof android.app.Activity) || (context instanceof android.view.ContextThemeWrapper)) ? context : oha.AEQbTJ();
    }

    private final android.view.WindowManager ejfBZ() {
        return (android.view.WindowManager) this.AhwBna.getValue();
    }

    public static final android.view.WindowManager KWHzl(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        return (android.view.WindowManager) systemService;
    }

    public final WindowManager.LayoutParams valueOf() {
        return (WindowManager.LayoutParams) this.AYXKKw.getValue();
    }

    public static final WindowManager.LayoutParams KWHzl(oHA oha) {
        return oha.copydefault();
    }

    public static final class ActionBar implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            oHA.this.KWHzl = false;
            pUU.EZpvd("OKIMMediaCallNotice: ", "Animation ended");
        }
    }

    public static final class Activity implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            oHA.this.KWHzl = true;
            pUU.EZpvd("OKIMMediaCallNotice: ", "Animation started");
        }
    }

    public final android.content.Context AEQbTJ() {
        android.view.ContextThemeWrapper contextThemeWrapper;
        try {
            android.content.Context applicationContext = getContext().getApplicationContext();
            if (applicationContext.getTheme() != null) {
                contextThemeWrapper = new android.view.ContextThemeWrapper(applicationContext, applicationContext.getTheme());
            } else {
                contextThemeWrapper = new android.view.ContextThemeWrapper(applicationContext, android.R.style.Theme.DeviceDefault);
            }
            return contextThemeWrapper;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKIMMediaCallNotice: ", "Failed to create themed context", e);
            android.content.Context context = getContext();
            Intrinsics.copydefault(context);
            return context;
        }
    }

    public final void setupClickListeners() {
        android.view.View root = this.gEmmrt.getRoot();
        root.setOnClickListener(new LoaderManager(root, 1000L, this));
        android.widget.ImageView imageView = this.gEmmrt.KWHzl;
        imageView.setOnClickListener(new Fragment(imageView, 1000L, this));
        android.widget.ImageView imageView2 = this.gEmmrt.EZpvd;
        imageView2.setOnClickListener(new FragmentManager(imageView2, 1000L, this));
    }

    public final WindowManager.LayoutParams copydefault() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED;
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.flags = 40;
        layoutParams.width = -1;
        layoutParams.height = -2;
        return layoutParams;
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, OfficialTagInfo officialTagInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("OKIMMediaCallNotice: ", "show() called with userName: " + str);
        this.gEmmrt.gEmmrt.setText(str);
        AEQbTJ(officialTagInfo);
        if (this.OLrzqt) {
            pUU.EZpvd("OKIMMediaCallNotice: ", "Already showing, skipping");
            return true;
        }
        AkhnZx();
        post(new java.lang.Runnable() { // from class: o.oHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oHA.copydefault(this.copydefault);
            }
        });
        this.OLrzqt = true;
        return true;
    }

    public static final void copydefault(oHA oha) {
        pUU.EZpvd("OKIMMediaCallNotice: ", "Executing show animation");
        oha.AYXKKw();
    }

    public final void AEQbTJ(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo == null) {
            android.widget.TextView textView = this.gEmmrt.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = this.gEmmrt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        try {
            android.widget.TextView textView3 = this.gEmmrt.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C37716ozA.updateTagViewWithTagInfo$default(textView3, officialTagInfo, 0, TagColorMode.LIGHT, false, false, false, 58, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKIMMediaCallNotice: ", "Failed to update tag view", e);
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ oHA EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, oHA oha) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = oha;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TaskDescription taskDescriptionFetchVPNInfo = this.EZpvd.fetchVPNInfo();
                if (taskDescriptionFetchVPNInfo != null) {
                    taskDescriptionFetchVPNInfo.copydefault();
                }
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ oHA AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, oHA oha) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = oha;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                TaskDescription taskDescriptionFetchVPNInfo = this.AEQbTJ.fetchVPNInfo();
                if (taskDescriptionFetchVPNInfo != null) {
                    taskDescriptionFetchVPNInfo.AEQbTJ();
                }
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ oHA EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, oHA oha) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = oha;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                TaskDescription taskDescriptionFetchVPNInfo = this.EZpvd.fetchVPNInfo();
                if (taskDescriptionFetchVPNInfo != null) {
                    taskDescriptionFetchVPNInfo.EZpvd();
                }
            }
        }
    }

    public final void AkhnZx() {
        if (KWHzl()) {
            values();
            return;
        }
        pUU.EZpvd("OKIMMediaCallNotice: ", "No overlay permission, showing normal banner");
        this.EZpvd = false;
        DbNXlk();
    }

    public final void values() {
        pUU.EZpvd("OKIMMediaCallNotice: ", "Showing as persistent banner (overlay)");
        try {
            android.widget.RelativeLayout relativeLayout = this.gEmmrt.djBIcL;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            C55296xhK.OLrzqt(relativeLayout, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
            setVisibility(4);
            ejfBZ().addView(this, valueOf());
            this.EZpvd = true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKIMMediaCallNotice: ", "Failed to add overlay view", e);
            this.EZpvd = false;
            DbNXlk();
        }
    }

    public final void DbNXlk() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        pUU.EZpvd("OKIMMediaCallNotice: ", "showNormalCallBanner - currentActivity: " + (activityAEQbTJ != null ? activityAEQbTJ.getClass().getSimpleName() : null));
        if (activityAEQbTJ == null || activityAEQbTJ.isFinishing() || this.OLrzqt) {
            java.lang.Boolean boolValueOf = activityAEQbTJ != null ? java.lang.Boolean.valueOf(activityAEQbTJ.isFinishing()) : null;
            pUU.valueOf("OKIMMediaCallNotice: ", "Cannot show banner - activity: " + activityAEQbTJ + ", finishing: " + boolValueOf + ", showing: " + this.OLrzqt);
            return;
        }
        pUU.EZpvd("OKIMMediaCallNotice: ", "Adding view to activity window");
        android.view.View decorView = activityAEQbTJ.getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        if (viewGroup.indexOfChild(this) != -1) {
            pUU.EZpvd("OKIMMediaCallNotice: ", "View already added to activity");
            return;
        }
        setVisibility(4);
        this.djBIcL = activityAEQbTJ;
        try {
            if (Intrinsics.EZpvd(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                viewGroup.addView(this);
            } else {
                viewGroup.post(new java.lang.Runnable() { // from class: o.oHz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        oHA.EZpvd(viewGroup, this);
                    }
                });
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKIMMediaCallNotice: ", "Failed to add view to activity", e);
        }
    }

    public static final void EZpvd(android.view.ViewGroup viewGroup, oHA oha) {
        viewGroup.addView(oha);
    }

    public final boolean KWHzl() {
        return android.provider.Settings.canDrawOverlays(getContext());
    }

    public final void EZpvd() {
        if (this.OLrzqt) {
            if (this.EZpvd) {
                djBIcL();
            } else {
                gEmmrt();
            }
            this.OLrzqt = false;
        }
    }

    public final void djBIcL() {
        if (isAttachedToWindow()) {
            ejfBZ().removeView(this);
        }
    }

    public final void gEmmrt() {
        android.app.Activity activity = this.djBIcL;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        android.view.View decorView = activity.getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
        if (viewGroup.indexOfChild(this) != -1) {
            viewGroup.removeView(this);
        }
        this.djBIcL = null;
    }

    public final void AYXKKw() {
        pUU.EZpvd("OKIMMediaCallNotice: ", "executeShowAnimation() - measuredHeight: " + getMeasuredHeight());
        AhwBna();
        float fOLrzqt = OLrzqt();
        this.copydefault = fOLrzqt;
        pUU.EZpvd("OKIMMediaCallNotice: ", "Animation height: " + fOLrzqt);
        setTranslationY(-this.copydefault);
        setVisibility(0);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "translationY", -this.copydefault, 0.0f);
        objectAnimatorOfFloat.setDuration(600L);
        Intrinsics.copydefault(objectAnimatorOfFloat);
        objectAnimatorOfFloat.addListener(new Activity());
        objectAnimatorOfFloat.addListener(new ActionBar());
        this.valueOf = objectAnimatorOfFloat;
        objectAnimatorOfFloat.start();
        this.OLrzqt = true;
    }

    public final void AhwBna() {
        if (getMeasuredHeight() == 0) {
            measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public final float OLrzqt() {
        float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(getMeasuredHeight()));
        if (fDjBIcL > 0.0f) {
            return fDjBIcL;
        }
        float f = fJNWhG().getResources().getDisplayMetrics().density * 96.0f;
        pUU.valueOf("OKIMMediaCallNotice: ", "Using default height: " + f);
        return f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ObjectAnimator objectAnimator = this.valueOf;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.valueOf = null;
    }
}
