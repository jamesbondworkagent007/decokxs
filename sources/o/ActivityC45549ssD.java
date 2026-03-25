package o;

import androidx.core.os.BundleKt;
import com.google.android.material.tabs.TabLayout;
import com.okinc.okex.feedback.FeedbackType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ssD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC45549ssD extends AbstractActivityC45610stL {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public AbstractC47326tnt OLrzqt;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ssz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC45549ssD.DbNXlk(this.copydefault));
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ssA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC45549ssD.djBIcL(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ssC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ActivityC45549ssD.valueOf(this.OLrzqt));
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ssB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ActivityC45549ssD.gEmmrt(this.EZpvd));
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ssI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC45549ssD.values(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.ssD$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ssD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num, java.lang.Integer num2) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC45549ssD.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("WHITELIST", bool), C56390yDp.OLrzqt("SHOW_SUBMIT_SUCCESS", bool2), C56390yDp.OLrzqt("STATUS", num), C56390yDp.OLrzqt("CURRENT", num2)));
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.stL.KWHzl()V */
    public final boolean KWHzl() {
        return ((java.lang.Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    public static final boolean DbNXlk(ActivityC45549ssD activityC45549ssD) {
        android.content.Intent intent = activityC45549ssD.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("WHITELIST", false);
        }
        return false;
    }

    /* JADX DEBUG: Possible override for method o.stL.AEQbTJ()V */
    public final boolean AEQbTJ() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean djBIcL(ActivityC45549ssD activityC45549ssD) {
        android.content.Intent intent = activityC45549ssD.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("SHOW_SUBMIT_SUCCESS", false);
        }
        return false;
    }

    public final int OLrzqt() {
        return ((java.lang.Number) this.EZpvd.getValue()).intValue();
    }

    public static final int valueOf(ActivityC45549ssD activityC45549ssD) {
        android.content.Intent intent = activityC45549ssD.getIntent();
        if (intent != null) {
            return intent.getIntExtra("STATUS", -1);
        }
        return -1;
    }

    private final int djBIcL() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int gEmmrt(ActivityC45549ssD activityC45549ssD) {
        android.content.Intent intent = activityC45549ssD.getIntent();
        if (intent != null) {
            return intent.getIntExtra("CURRENT", 0);
        }
        return 0;
    }

    public final java.util.ArrayList<C45594ssw> EZpvd() {
        return (java.util.ArrayList) this.gEmmrt.getValue();
    }

    public static final java.util.ArrayList values(ActivityC45549ssD activityC45549ssD) {
        C45594ssw c45594ssw = new C45594ssw(FeedbackType.SECURITY_BUG, C33070mpX.AYXKKw(C47315tni.PendingIntent.sSMYrx));
        if (activityC45549ssD.KWHzl()) {
            return yDY.copydefault(new C45594ssw(FeedbackType.FEEDBACK, C33070mpX.AYXKKw(C47315tni.PendingIntent.gSBher)), c45594ssw);
        }
        return yDY.copydefault(c45594ssw);
    }

    private final void gEmmrt() {
        AbstractC47326tnt abstractC47326tnt = this.OLrzqt;
        if (abstractC47326tnt != null) {
            TabLayout tabLayout = abstractC47326tnt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "");
            java.util.ArrayList<C45594ssw> arrayListEZpvd = EZpvd();
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
            java.util.Iterator<T> it = arrayListEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(((C45594ssw) it.next()).EZpvd());
            }
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application(abstractC47326tnt));
            tabLayout.removeAllTabs();
            for (java.lang.String str : arrayList) {
                TabLayout.Tab tabNewTab = tabLayout.newTab();
                tabNewTab.setText(str);
                Intrinsics.checkNotNullExpressionValue(tabNewTab, "");
                tabLayout.addTab(tabNewTab);
            }
        }
    }

    /* JADX INFO: renamed from: o.ssD$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ AbstractC47326tnt KWHzl;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application(AbstractC47326tnt abstractC47326tnt) {
            this.KWHzl = abstractC47326tnt;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            this.KWHzl.OLrzqt.setCurrentItem(tab.getPosition(), true);
        }
    }

    @Override // o.AbstractActivityC45610stL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC47326tnt abstractC47326tntCopydefault = AbstractC47326tnt.copydefault(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(abstractC47326tntCopydefault, "");
        this.OLrzqt = abstractC47326tntCopydefault;
        setContentView(abstractC47326tntCopydefault.getRoot());
        AbstractC47326tnt abstractC47326tnt = this.OLrzqt;
        if (abstractC47326tnt != null) {
            C33542myS c33542myS = abstractC47326tnt.OLrzqt;
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c33542myS.setAdapter(new TaskDescription(supportFragmentManager, EZpvd(), OLrzqt()));
            abstractC47326tnt.OLrzqt.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(abstractC47326tnt.KWHzl));
            gEmmrt();
            if (AEQbTJ()) {
                C55326xho.toastWithSuccessfulIcon$default(C47315tni.PendingIntent.getPriority, 0, 1, (java.lang.Object) null);
            }
            if (KWHzl() && djBIcL() == 1) {
                abstractC47326tnt.OLrzqt.setCurrentItem(1);
            }
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ssH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45549ssD.AhwBna(this.copydefault);
            }
        });
    }

    public static final void AhwBna(ActivityC45549ssD activityC45549ssD) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45549ssD, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.ssD$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription extends AbstractC33000moG {
        public int AEQbTJ;
        public java.util.ArrayList<C45594ssw> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<C45594ssw> arrayList, int i) {
            super(fragmentManager, null);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.KWHzl = arrayList;
            this.AEQbTJ = i;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            C45552ssG c45552ssG = new C45552ssG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type", this.KWHzl.get(i).AEQbTJ().ordinal());
            bundle.putInt("status", this.KWHzl.get(i).AEQbTJ() == FeedbackType.FEEDBACK ? this.AEQbTJ : -1);
            c45552ssG.setArguments(bundle);
            return c45552ssG;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.KWHzl.size();
        }
    }

    @Override // o.AbstractActivityC45610stL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45610stL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC45610stL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC45610stL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
