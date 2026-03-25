package o;

import android.view.ViewGroup;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.okinc.planet.biz_notifications.ui.PlanetNotificationsCenterActivity$onDestroy$1;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC47950tzl extends AbstractActivityC33041mov {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public C46232tMs KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tzm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC47950tzl.KWHzl();
        }
    });

    /* JADX INFO: renamed from: o.tzl$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetNotificationCategory.values().length];
            try {
                iArr[PlanetNotificationCategory.All.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetNotificationCategory.System.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PlanetNotificationCategory.Likes.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PlanetNotificationCategory.Comments.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[PlanetNotificationCategory.Followers.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    public ActivityC47950tzl() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C47925tzM.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_notifications.ui.PlanetNotificationsCenterActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0() { // from class: o.tzo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC47950tzl.OLrzqt(this.KWHzl);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_notifications.ui.PlanetNotificationsCenterActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: renamed from: o.tzl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tzl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ void launch$default(Activity activity, android.content.Context context, PlanetNotificationCategory planetNotificationCategory, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                planetNotificationCategory = null;
            }
            activity.OLrzqt(context, planetNotificationCategory);
        }

        public final void OLrzqt(@NotNull android.content.Context context, PlanetNotificationCategory planetNotificationCategory) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC47950tzl.class);
            if (planetNotificationCategory != null) {
                intent.putExtra("selected_category", (android.os.Parcelable) planetNotificationCategory);
            }
            context.startActivity(intent);
        }
    }

    public final C47925tzM OLrzqt() {
        return (C47925tzM) this.OLrzqt.getValue();
    }

    public static final C47925tzM AEQbTJ(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new C47925tzM(savedStateHandle, null, null, null, 14, null);
    }

    public static final ViewModelProvider.Factory OLrzqt(ActivityC47950tzl activityC47950tzl) {
        android.content.Intent intent = activityC47950tzl.getIntent();
        return new tRJ(activityC47950tzl, intent != null ? intent.getExtras() : null, new Function1() { // from class: o.tzk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47950tzl.AEQbTJ((SavedStateHandle) obj);
            }
        });
    }

    public static final InterfaceC47278tmy KWHzl() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    private final InterfaceC47278tmy copydefault() {
        return (InterfaceC47278tmy) this.copydefault.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!copydefault().values()) {
            finish();
            return;
        }
        C46232tMs c46232tMsEZpvd = C46232tMs.EZpvd(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c46232tMsEZpvd, "");
        setContentView(c46232tMsEZpvd.getRoot());
        this.KWHzl = c46232tMsEZpvd;
        gEmmrt();
        C46232tMs c46232tMs = this.KWHzl;
        C46232tMs c46232tMs2 = null;
        if (c46232tMs == null) {
            Intrinsics.gEmmrt("");
            c46232tMs = null;
        }
        c46232tMs.KWHzl.setAdapter(new StateListAnimator());
        c46232tMs.KWHzl.setOffscreenPageLimit(OLrzqt().AEQbTJ().size() - 1);
        c46232tMs.OLrzqt.setupWithViewPager(c46232tMs.KWHzl);
        valueOf();
        PlanetNotificationCategory planetNotificationCategoryKWHzl = OLrzqt().KWHzl();
        C46232tMs c46232tMs3 = this.KWHzl;
        if (c46232tMs3 == null) {
            Intrinsics.gEmmrt("");
            c46232tMs3 = null;
        }
        C55244xgL c55244xgL = c46232tMs3.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        if (planetNotificationCategoryKWHzl != null) {
            int iCopydefault = OLrzqt().copydefault(planetNotificationCategoryKWHzl);
            pUU.KWHzl("PlanetNotification", "selectedCategory->：" + planetNotificationCategoryKWHzl + " index:" + iCopydefault);
            if (iCopydefault >= 0 && iCopydefault < c55244xgL.AhwBna()) {
                c55244xgL.AEQbTJ(iCopydefault);
            }
        } else {
            pUU.KWHzl("PlanetNotification", "selectedCategory->：" + planetNotificationCategoryKWHzl);
            if (c55244xgL.AhwBna() > 0) {
                C46232tMs c46232tMs4 = this.KWHzl;
                if (c46232tMs4 == null) {
                    Intrinsics.gEmmrt("");
                    c46232tMs4 = null;
                }
                c46232tMs4.OLrzqt.AEQbTJ(0);
            }
        }
        AEQbTJ();
        C46232tMs c46232tMs5 = this.KWHzl;
        if (c46232tMs5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46232tMs2 = c46232tMs5;
        }
        c46232tMs2.getRoot().post(new java.lang.Runnable() { // from class: o.tzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC47950tzl.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(ActivityC47950tzl activityC47950tzl) {
        if (activityC47950tzl.AEQbTJ) {
            return;
        }
        activityC47950tzl.AEQbTJ = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC47950tzl, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ() {
        C46232tMs c46232tMs = this.KWHzl;
        if (c46232tMs == null) {
            Intrinsics.gEmmrt("");
            c46232tMs = null;
        }
        C55244xgL c55244xgL = c46232tMs.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        TabLayout tabLayoutAYXKKw = c55244xgL.AYXKKw();
        c55244xgL.setMode(1);
        tabLayoutAYXKKw.setHorizontalFadingEdgeEnabled(true);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        android.os.Bundle extras = intent.getExtras();
        C46232tMs c46232tMs = null;
        PlanetNotificationCategory planetNotificationCategory = extras != null ? (PlanetNotificationCategory) BundleCompat.getParcelable(extras, "selected_category", PlanetNotificationCategory.class) : null;
        if (planetNotificationCategory != null) {
            OLrzqt().OLrzqt(planetNotificationCategory);
            int iCopydefault = OLrzqt().copydefault(planetNotificationCategory);
            C46232tMs c46232tMs2 = this.KWHzl;
            if (c46232tMs2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46232tMs = c46232tMs2;
            }
            C55244xgL c55244xgL = c46232tMs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
            pUU.KWHzl("PlanetNotification", "onNewIntent-->selectedCategory->：" + planetNotificationCategory + " index:" + iCopydefault);
            if (iCopydefault < 0 || iCopydefault >= c55244xgL.AhwBna()) {
                return;
            }
            c55244xgL.AEQbTJ(iCopydefault);
        }
    }

    private final void gEmmrt() {
        C46232tMs c46232tMs = this.KWHzl;
        if (c46232tMs == null) {
            Intrinsics.gEmmrt("");
            c46232tMs = null;
        }
        C33537myN c33537myN = c46232tMs.EZpvd;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setTitle(getString(C47501trL.Fragment.DcqEDu));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void valueOf() {
        TabLayout.TabView tabView;
        java.lang.String str;
        C46232tMs c46232tMs = this.KWHzl;
        if (c46232tMs == null) {
            Intrinsics.gEmmrt("");
            c46232tMs = null;
        }
        int iAhwBna = c46232tMs.OLrzqt.AhwBna();
        for (int i = 0; i < iAhwBna; i++) {
            PlanetNotificationCategory planetNotificationCategory = OLrzqt().AEQbTJ().get(i);
            C46232tMs c46232tMs2 = this.KWHzl;
            if (c46232tMs2 == null) {
                Intrinsics.gEmmrt("");
                c46232tMs2 = null;
            }
            TabLayout.Tab tabKWHzl = c46232tMs2.OLrzqt.KWHzl(i);
            if (tabKWHzl != null && (tabView = tabKWHzl.view) != null) {
                int i2 = TaskDescription.AEQbTJ[planetNotificationCategory.ordinal()];
                if (i2 == 1) {
                    str = "notification_tab_all";
                } else if (i2 == 2) {
                    str = "notification_tab_system";
                } else if (i2 == 3) {
                    str = "notification_tab_likes";
                } else if (i2 == 4) {
                    str = "notification_tab_comments";
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "notification_tab_followers";
                }
                tabView.setContentDescription(str);
            }
        }
    }

    /* JADX INFO: renamed from: o.tzl$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final class StateListAnimator extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: o.tzl$StateListAnimator$Application */
        /* JADX INFO: loaded from: classes19.dex */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PlanetNotificationCategory.values().length];
                try {
                    iArr[PlanetNotificationCategory.All.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[PlanetNotificationCategory.Likes.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlanetNotificationCategory.Comments.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[PlanetNotificationCategory.Followers.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[PlanetNotificationCategory.System.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
            super(ActivityC47950tzl.this.getSupportFragmentManager(), 1);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return ActivityC47950tzl.this.OLrzqt().AEQbTJ().size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            androidx.fragment.app.Fragment c47865tyF;
            PlanetNotificationCategory planetNotificationCategory = ActivityC47950tzl.this.OLrzqt().AEQbTJ().get(i);
            int i2 = Application.AEQbTJ[planetNotificationCategory.ordinal()];
            if (i2 == 1) {
                c47865tyF = new C47865tyF();
            } else if (i2 == 2) {
                c47865tyF = new C47940tzb();
            } else if (i2 == 3) {
                c47865tyF = new C47884tyY();
            } else if (i2 == 4) {
                c47865tyF = new C47885tyZ();
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                c47865tyF = new C47952tzn();
            }
            c47865tyF.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("current_category", planetNotificationCategory)));
            pUU.KWHzl("PlanetNotification", "getItem->" + c47865tyF.getClass().getSimpleName());
            return c47865tyF;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            int i2;
            int i3 = Application.AEQbTJ[ActivityC47950tzl.this.OLrzqt().AEQbTJ().get(i).ordinal()];
            if (i3 == 1) {
                i2 = C47501trL.Fragment.UrRBLY;
            } else if (i3 == 2) {
                i2 = C47501trL.Fragment.KDccX;
            } else if (i3 == 3) {
                i2 = C47501trL.Fragment.DCUTEIdCUTEI;
            } else if (i3 == 4) {
                i2 = C47501trL.Fragment.zblBkD;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C47501trL.Fragment.Dmq;
            }
            return ActivityC47950tzl.this.getString(i2);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            pUU.KWHzl("PlanetNotificationsCenterActivity", "Starting cleanup in isFinishing block");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new PlanetNotificationsCenterActivity$onDestroy$1(null), 3, null);
        } else {
            pUU.KWHzl("PlanetNotificationsCenterActivity", "Activity is being destroyed by system");
        }
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
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
