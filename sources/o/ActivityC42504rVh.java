package o;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC42162rIq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC42504rVh extends AbstractActivityC33041mov {
    public C43756rvL KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final rBR copydefault = new rBR();
    public final java.util.List<ActionBar> EZpvd = new java.util.ArrayList();

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        this.KWHzl = C43756rvL.copydefault(getLayoutInflater());
        valueOf();
        C43756rvL c43756rvL = this.KWHzl;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        setContentView(c43756rvL.getRoot());
        EZpvd();
        OLrzqt();
        AhwBna();
    }

    public final void EZpvd() {
        C43756rvL c43756rvL = this.KWHzl;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(c43756rvL.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.rVi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC42504rVh.OLrzqt(this.copydefault, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat OLrzqt(ActivityC42504rVh activityC42504rVh, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "");
        C43756rvL c43756rvL = activityC42504rVh.KWHzl;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        android.widget.LinearLayout linearLayout = c43756rvL.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int i = insets.bottom;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), i > 0 ? i - insets2.bottom : 0);
        return WindowInsetsCompat.CONSUMED;
    }

    public final void OLrzqt() {
        AEQbTJ();
    }

    private final void valueOf() {
        C43756rvL c43756rvL = this.KWHzl;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        C33537myN c33537myN = c43756rvL.KWHzl;
        c33537myN.setTitle("KYC Compliance Mock Tool");
        c33537myN.setBackListener(new View.OnClickListener() { // from class: o.rVp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC42504rVh.OLrzqt(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(ActivityC42504rVh activityC42504rVh, android.view.View view) {
        activityC42504rVh.finish();
    }

    private final void AhwBna() {
        C43756rvL c43756rvL = this.KWHzl;
        C43756rvL c43756rvL2 = null;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        C52794wYp c52794wYp = c43756rvL.OLrzqt;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C43756rvL c43756rvL3 = this.KWHzl;
        if (c43756rvL3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c43756rvL2 = c43756rvL3;
        }
        C52794wYp c52794wYp2 = c43756rvL2.copydefault;
        c52794wYp2.setOnClickListener(new LoaderManager(c52794wYp2, 1000L, this));
    }

    public final void AEQbTJ() {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this);
        C43756rvL c43756rvL = this.KWHzl;
        C43756rvL c43756rvL2 = null;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        C43922ryS c43922rySKWHzl = C43922ryS.KWHzl(layoutInflaterFrom, c43756rvL.AEQbTJ, false);
        Intrinsics.checkNotNullExpressionValue(c43922rySKWHzl, "");
        ActionBar actionBar = new ActionBar(this, c43922rySKWHzl, this.EZpvd.size() + 1);
        this.EZpvd.add(actionBar);
        C43756rvL c43756rvL3 = this.KWHzl;
        if (c43756rvL3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c43756rvL2 = c43756rvL3;
        }
        c43756rvL2.AEQbTJ.addView(c43922rySKWHzl.getRoot());
        actionBar.AEQbTJ(new Function0() { // from class: o.rVo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC42504rVh.EZpvd(this.KWHzl);
            }
        });
        C52794wYp c52794wYp = actionBar.EZpvd().OLrzqt;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = actionBar.EZpvd().EZpvd;
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this, actionBar));
        copydefault();
        AYXKKw();
        djBIcL();
    }

    public static final Unit EZpvd(ActivityC42504rVh activityC42504rVh) {
        activityC42504rVh.copydefault();
        activityC42504rVh.djBIcL();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(ActionBar actionBar) {
        if (this.EZpvd.size() <= 1) {
            C55328xhq.show$default(C55328xhq.OLrzqt, "At least one input field is required", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        this.EZpvd.remove(actionBar);
        C43756rvL c43756rvL = this.KWHzl;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        c43756rvL.AEQbTJ.removeView(actionBar.EZpvd().getRoot());
        int i = 0;
        for (java.lang.Object obj : this.EZpvd) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((ActionBar) obj).EZpvd(i2);
            i = i2;
        }
        copydefault();
        AYXKKw();
        djBIcL();
    }

    public final void AYXKKw() {
        boolean z = this.EZpvd.size() > 1;
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            C52794wYp c52794wYp = ((ActionBar) it.next()).EZpvd().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(z ? 0 : 8);
        }
    }

    public final void KWHzl() {
        C43756rvL c43756rvL = this.KWHzl;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        c43756rvL.AEQbTJ.removeAllViews();
        this.EZpvd.clear();
        C42509rVm.copydefault.copydefault();
        OLrzqt();
        C55328xhq.show$default(C55328xhq.OLrzqt, "All inputs cleared", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        C42509rVm.copydefault.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = null;
        for (ActionBar actionBar : this.EZpvd) {
            if (actionBar.KWHzl()) {
                java.lang.String strCopydefault = actionBar.copydefault();
                if (Result.m7384isSuccessimpl(this.copydefault.OLrzqt(strCopydefault))) {
                    arrayList.add(strCopydefault);
                    if (str == null) {
                        str = strCopydefault;
                    }
                } else {
                    C55328xhq.show$default(C55328xhq.OLrzqt, "Invalid JSON format in Response #" + actionBar.OLrzqt(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
                    return;
                }
            }
        }
        if (arrayList.isEmpty()) {
            C55328xhq.show$default(C55328xhq.OLrzqt, "Please add at least one JSON response", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        rBR rbr = this.copydefault;
        Intrinsics.copydefault((java.lang.Object) str);
        java.lang.Object objOLrzqt = rbr.OLrzqt(str);
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) == null) {
            OnDemandKYCAppModel onDemandKYCAppModel = (OnDemandKYCAppModel) objOLrzqt;
            C42509rVm c42509rVm = C42509rVm.copydefault;
            c42509rVm.copydefault(true);
            c42509rVm.AEQbTJ(arrayList);
            C55328xhq.show$default(C55328xhq.OLrzqt, "Loaded " + arrayList.size() + " response(s). Launching preview...", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            ActivityC42162rIq.TaskDescription.goActivity$default(ActivityC42162rIq.Companion, this, "okx_app_kyc", "kyc", new java.util.HashMap(), onDemandKYCAppModel, null, null, 64, null);
            return;
        }
        C55328xhq.show$default(C55328xhq.OLrzqt, "Failed to parse initial JSON", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.rVh$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC42504rVh EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC42504rVh activityC42504rVh) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = activityC42504rVh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.gEmmrt();
            }
        }
    }

    /* JADX INFO: renamed from: o.rVh$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC42504rVh AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC42504rVh activityC42504rVh) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = activityC42504rVh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.rVh$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC42504rVh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC42504rVh activityC42504rVh) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = activityC42504rVh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.rVh$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActionBar AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC42504rVh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC42504rVh activityC42504rVh, ActionBar actionBar) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = activityC42504rVh;
            this.AEQbTJ = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.AEQbTJ(this.AEQbTJ);
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C42509rVm c42509rVm = C42509rVm.copydefault;
        if (!c42509rVm.OLrzqt() || c42509rVm.EZpvd() <= 0) {
            return;
        }
        C55328xhq.show$default(C55328xhq.OLrzqt, c42509rVm.EZpvd() + " unused mock(s) cleared", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        c42509rVm.copydefault();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C42509rVm.copydefault.copydefault();
    }

    /* JADX INFO: renamed from: o.rVh$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public final class ActionBar {
        public final C43922ryS AEQbTJ;
        public int EZpvd;
        public final /* synthetic */ ActivityC42504rVh KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C43922ryS EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        public ActionBar(@NotNull ActivityC42504rVh activityC42504rVh, C43922ryS c43922ryS, int i) {
            Intrinsics.checkNotNullParameter(c43922ryS, "");
            this.KWHzl = activityC42504rVh;
            this.AEQbTJ = c43922ryS;
            this.EZpvd = i;
            EZpvd(i);
        }

        public final void EZpvd(int i) {
            this.EZpvd = i;
            this.AEQbTJ.AEQbTJ.setText("Response #" + i);
        }

        /* JADX INFO: renamed from: o.rVh$ActionBar$Application */
        public static final class Application implements android.text.TextWatcher {
            public final /* synthetic */ Function0<Unit> AEQbTJ;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            public Application(Function0<Unit> function0) {
                this.AEQbTJ = function0;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                this.AEQbTJ.invoke();
            }
        }

        public final void AEQbTJ(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.AEQbTJ.copydefault.addTextChangedListener(new Application(function0));
        }

        public final java.lang.String copydefault() {
            return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(this.AEQbTJ.copydefault.getText())).toString();
        }

        public final boolean AEQbTJ() {
            return !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) copydefault());
        }

        public final boolean KWHzl() {
            return !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) copydefault());
        }
    }

    /* JADX INFO: renamed from: o.rVh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rVh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context, (java.lang.Class<?>) ActivityC42504rVh.class);
        }
    }

    public final void copydefault() {
        int i = 0;
        for (java.lang.Object obj : this.EZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ActionBar actionBar = (ActionBar) obj;
            boolean z = i == this.EZpvd.size() - 1;
            boolean zAEQbTJ = actionBar.AEQbTJ();
            C52794wYp c52794wYp = actionBar.EZpvd().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility((z && zAEQbTJ) ? 0 : 8);
            i++;
        }
    }

    public final void djBIcL() {
        boolean z;
        java.util.List<ActionBar> list = this.EZpvd;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ActionBar) it.next()).KWHzl()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        C43756rvL c43756rvL = this.KWHzl;
        if (c43756rvL == null) {
            Intrinsics.gEmmrt("");
            c43756rvL = null;
        }
        c43756rvL.OLrzqt.setEnabled(z);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
