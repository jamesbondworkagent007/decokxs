package o;

import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet_api.model.PlanetActivityCategory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC47944tzf;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC47944tzf extends AbstractActivityC33041mov {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tzj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC47944tzf.KWHzl();
        }
    });
    public C46233tMt KWHzl;
    public boolean OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.tzf$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetActivityCategory.values().length];
            try {
                iArr[PlanetActivityCategory.Likes.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetActivityCategory.Replies.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public ActivityC47944tzf() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(C47915tzC.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_notifications.ui.PlanetMineActivityActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_notifications.ui.PlanetMineActivityActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_notifications.ui.PlanetMineActivityActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.tzf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tzf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC47944tzf.class));
        }
    }

    public final C47915tzC AEQbTJ() {
        return (C47915tzC) this.copydefault.getValue();
    }

    public static final InterfaceC47278tmy KWHzl() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    public final InterfaceC47278tmy OLrzqt() {
        return (InterfaceC47278tmy) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!OLrzqt().values()) {
            finish();
            return;
        }
        C46233tMt c46233tMtCopydefault = C46233tMt.copydefault(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c46233tMtCopydefault, "");
        setContentView(c46233tMtCopydefault.getRoot());
        this.KWHzl = c46233tMtCopydefault;
        copydefault();
        C46233tMt c46233tMt = this.KWHzl;
        C46233tMt c46233tMt2 = null;
        if (c46233tMt == null) {
            Intrinsics.gEmmrt("");
            c46233tMt = null;
        }
        c46233tMt.EZpvd.setAdapter(new StateListAnimator());
        c46233tMt.KWHzl.setupWithViewPager(c46233tMt.EZpvd);
        gEmmrt();
        c46233tMt.KWHzl.copydefault(new ActionBar());
        C46233tMt c46233tMt3 = this.KWHzl;
        if (c46233tMt3 == null) {
            Intrinsics.gEmmrt("");
            c46233tMt3 = null;
        }
        C55244xgL c55244xgL = c46233tMt3.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        if (c55244xgL.AhwBna() > 0) {
            C46233tMt c46233tMt4 = this.KWHzl;
            if (c46233tMt4 == null) {
                Intrinsics.gEmmrt("");
                c46233tMt4 = null;
            }
            c46233tMt4.KWHzl.AEQbTJ(0);
            PlanetActivityCategory planetActivityCategory = (PlanetActivityCategory) CollectionsKt___CollectionsKt.AkhnZx(AEQbTJ().EZpvd(), 0);
            int i = planetActivityCategory == null ? -1 : TaskDescription.OLrzqt[planetActivityCategory.ordinal()];
            final java.lang.String str = i != 1 ? i != 2 ? null : "replies" : "likes";
            if (str != null) {
                C32866mlf.onEvent$default("Orbit_MyActivities_List_View", (TrackChannel[]) null, new Function1() { // from class: o.tzc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC47944tzf.copydefault(str, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
        }
        C46233tMt c46233tMt5 = this.KWHzl;
        if (c46233tMt5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46233tMt2 = c46233tMt5;
        }
        c46233tMt2.getRoot().post(new java.lang.Runnable() { // from class: o.tzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC47944tzf.copydefault(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.tzf$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: o.tzf$ActionBar$Application */
        /* JADX INFO: loaded from: classes19.dex */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PlanetActivityCategory.values().length];
                try {
                    iArr[PlanetActivityCategory.Likes.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[PlanetActivityCategory.Replies.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                PlanetActivityCategory planetActivityCategory = (PlanetActivityCategory) CollectionsKt___CollectionsKt.AkhnZx(ActivityC47944tzf.this.AEQbTJ().EZpvd(), tab.getPosition());
                int i = planetActivityCategory == null ? -1 : Application.KWHzl[planetActivityCategory.ordinal()];
                final java.lang.String str = i != 1 ? i != 2 ? null : "replies" : "likes";
                if (str != null) {
                    C32866mlf.onEvent$default("Orbit_MyActivities_List_View", (TrackChannel[]) null, new Function1() { // from class: o.tzi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC47944tzf.ActionBar.AEQbTJ(str, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
            }
        }

        public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.CONTENT_TYPE, str, false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.CONTENT_TYPE, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC47944tzf activityC47944tzf) {
        if (activityC47944tzf.OLrzqt) {
            return;
        }
        activityC47944tzf.OLrzqt = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC47944tzf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault() {
        C46233tMt c46233tMt = this.KWHzl;
        if (c46233tMt == null) {
            Intrinsics.gEmmrt("");
            c46233tMt = null;
        }
        C33537myN c33537myN = c46233tMt.OLrzqt;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setTitle(getString(C47501trL.Fragment.gSBher));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void gEmmrt() {
        TabLayout.TabView tabView;
        java.lang.String str;
        C46233tMt c46233tMt = this.KWHzl;
        if (c46233tMt == null) {
            Intrinsics.gEmmrt("");
            c46233tMt = null;
        }
        int iAhwBna = c46233tMt.KWHzl.AhwBna();
        for (int i = 0; i < iAhwBna; i++) {
            PlanetActivityCategory planetActivityCategory = AEQbTJ().EZpvd().get(i);
            C46233tMt c46233tMt2 = this.KWHzl;
            if (c46233tMt2 == null) {
                Intrinsics.gEmmrt("");
                c46233tMt2 = null;
            }
            TabLayout.Tab tabKWHzl = c46233tMt2.KWHzl.KWHzl(i);
            if (tabKWHzl != null && (tabView = tabKWHzl.view) != null) {
                int i2 = TaskDescription.OLrzqt[planetActivityCategory.ordinal()];
                if (i2 == 1) {
                    str = "activity_tab_likes";
                } else if (i2 != 2) {
                    java.lang.String lowerCase = planetActivityCategory.name().toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    str = "activity_tab_" + lowerCase;
                } else {
                    str = "activity_tab_comments";
                }
                tabView.setContentDescription(str);
            }
        }
    }

    /* JADX INFO: renamed from: o.tzf$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final class StateListAnimator extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: o.tzf$StateListAnimator$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PlanetActivityCategory.values().length];
                try {
                    iArr[PlanetActivityCategory.Likes.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[PlanetActivityCategory.Replies.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                KWHzl = iArr;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
            super(ActivityC47944tzf.this.getSupportFragmentManager(), 1);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return ActivityC47944tzf.this.AEQbTJ().EZpvd().size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            androidx.fragment.app.Fragment c47942tzd;
            PlanetActivityCategory planetActivityCategory = ActivityC47944tzf.this.AEQbTJ().EZpvd().get(i);
            int i2 = TaskDescription.KWHzl[planetActivityCategory.ordinal()];
            if (i2 == 1) {
                c47942tzd = new C47942tzd();
            } else if (i2 == 2) {
                c47942tzd = new C47943tze();
            } else {
                throw new java.lang.IllegalStateException("unSupport category");
            }
            c47942tzd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("current_category", planetActivityCategory)));
            pUU.KWHzl("PlanetMineActivity", "getItem->" + c47942tzd.getClass().getSimpleName());
            return c47942tzd;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            java.lang.Integer numValueOf;
            int i2 = TaskDescription.KWHzl[ActivityC47944tzf.this.AEQbTJ().EZpvd().get(i).ordinal()];
            if (i2 == 1) {
                numValueOf = java.lang.Integer.valueOf(C47501trL.Fragment.dLBcXg);
            } else {
                numValueOf = i2 != 2 ? null : java.lang.Integer.valueOf(C47501trL.Fragment.hlkKmr);
            }
            if (numValueOf == null) {
                return null;
            }
            ActivityC47944tzf activityC47944tzf = ActivityC47944tzf.this;
            numValueOf.intValue();
            return activityC47944tzf.getString(numValueOf.intValue());
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
