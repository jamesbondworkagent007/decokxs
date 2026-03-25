package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage;
import com.okinc.planet.biz_create_centre.data.LiveStreamsData;
import com.okinc.planet.biz_create_centre.data.OrbitCreateCentreInfo;
import com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$observeViewModel$1;
import com.okinc.web.WebActivity;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC47776twW extends AbstractActivityC47505trP {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C46222tMi EZpvd;
    public boolean OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public TabLayoutMediator valueOf;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.txa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC47776twW.valueOf(this.OLrzqt);
        }
    });
    public CreatorCentreSubPage AEQbTJ = CreatorCentreSubPage.POST;

    public ActivityC47776twW() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(C47858txz.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_create_centre.ui.CreatorCentreActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.twW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.twW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            C32866mlf.onEvent$default("Orbit_Profile_Creatorcenter_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            if (!(!CreatorCentreSubPage.Companion.OLrzqt().isEmpty()) || C46388tSm.Companion.KWHzl().AYXKKw()) {
                return;
            }
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC47776twW.class));
        }
    }

    public static final C47839txg valueOf(ActivityC47776twW activityC47776twW) {
        return new C47839txg(activityC47776twW);
    }

    public final C47839txg EZpvd() {
        return (C47839txg) this.copydefault.getValue();
    }

    public final C47858txz KWHzl() {
        return (C47858txz) this.djBIcL.getValue();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46222tMi c46222tMiAEQbTJ = C46222tMi.AEQbTJ(getLayoutInflater());
        this.EZpvd = c46222tMiAEQbTJ;
        if (c46222tMiAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c46222tMiAEQbTJ = null;
        }
        setContentView(c46222tMiAEQbTJ.getRoot());
        OLrzqt();
    }

    private final void OLrzqt() {
        AYXKKw();
        valueOf();
        AhwBna();
        AEQbTJ();
        copydefault();
    }

    private final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CreatorCentreActivity$observeViewModel$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.twW$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC47776twW EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC47776twW activityC47776twW) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = activityC47776twW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                pUU.EZpvd(this.EZpvd.getTAG(), "Earnings card clicked - navigating to EarningsHistoryActivity");
                ActivityC47776twW activityC47776twW = this.EZpvd;
                activityC47776twW.startActivity(ActivityC47842txj.Companion.copydefault(activityC47776twW));
                C32866mlf.onEvent$default("Orbit_Creatorcenter_Earnings_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.twW$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC47776twW KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC47776twW activityC47776twW) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = activityC47776twW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.KWHzl, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C47501trL.Fragment.DLWbHP))), null, 4, null);
                pUU.EZpvd(this.KWHzl.getTAG(), "Monetization Groups clicked");
                C32866mlf.onEvent$default("Orbit_Creatorcenter_Monetization_Click", (TrackChannel[]) null, PendingIntent.AEQbTJ, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.twW$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC47776twW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC47776twW activityC47776twW) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = activityC47776twW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                pUU.EZpvd(this.copydefault.getTAG(), "Monetization Livestreams clicked");
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.copydefault, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C47501trL.Fragment.OHqIaq))), null, 4, null);
                C32866mlf.onEvent$default("Orbit_Creatorcenter_Monetization_Click", (TrackChannel[]) null, Dialog.AEQbTJ, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.twW$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC47776twW EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC47776twW activityC47776twW) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = activityC47776twW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                pUU.EZpvd(this.EZpvd.getTAG(), "Monetization Posts clicked");
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.EZpvd, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C47501trL.Fragment.hrNTAI))), null, 4, null);
                C32866mlf.onEvent$default("Orbit_Creatorcenter_Monetization_Click", (TrackChannel[]) null, Fragment.EZpvd, 1, (java.lang.Object) null);
            }
        }
    }

    public final void AEQbTJ(java.lang.Long l, java.lang.Long l2) {
        C46222tMi c46222tMi = null;
        if (l == null || l2 == null) {
            C46222tMi c46222tMi2 = this.EZpvd;
            if (c46222tMi2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46222tMi = c46222tMi2;
            }
            c46222tMi.isConnected.setText("--");
            return;
        }
        Date date = new Date(l.longValue());
        OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_STANDARD;
        java.lang.String date$default = pTA.formatDate$default(date, oKDateEnum, null, null, 6, null);
        java.lang.String date$default2 = pTA.formatDate$default(new Date(l2.longValue()), oKDateEnum, null, null, 6, null);
        C46222tMi c46222tMi3 = this.EZpvd;
        if (c46222tMi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46222tMi = c46222tMi3;
        }
        c46222tMi.isConnected.setText(date$default + " - " + date$default2);
    }

    private final void AYXKKw() {
        C46222tMi c46222tMi = this.EZpvd;
        if (c46222tMi == null) {
            Intrinsics.gEmmrt("");
            c46222tMi = null;
        }
        C33537myN c33537myN = c46222tMi.copydefault;
        android.widget.ImageView backImage = c33537myN.getBackImage();
        Intrinsics.checkNotNullExpressionValue(backImage, "");
        ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(C55298xhM.dp2px$default(24.0f, null, 1, null));
            backImage.setLayoutParams(marginLayoutParams);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.txf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47776twW.KWHzl(this.AEQbTJ, view);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void KWHzl(ActivityC47776twW activityC47776twW, android.view.View view) {
        activityC47776twW.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(OrbitCreateCentreInfo orbitCreateCentreInfo) {
        boolean z;
        LiveStreamsData liveStreamsData = orbitCreateCentreInfo.getLiveStreamsData();
        if (liveStreamsData != null) {
            z = liveStreamsData.getPermission();
        }
        java.util.List<CreatorCentreSubPage> listOLrzqt = CreatorCentreSubPage.Companion.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            if (((CreatorCentreSubPage) obj) != CreatorCentreSubPage.LIVESTREAMS || z) {
                arrayList.add(obj);
            }
        }
        pUU.EZpvd(getTAG(), "Available tabs (after permission check): " + arrayList + ", liveStreamsPermission: " + z);
        C46222tMi c46222tMi = null;
        if (arrayList.isEmpty()) {
            C46222tMi c46222tMi2 = this.EZpvd;
            if (c46222tMi2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46222tMi = c46222tMi2;
            }
            c46222tMi.valueOf.setVisibility(8);
            pUU.EZpvd(getTAG(), "Key Metrics section hidden - no tabs available");
            return;
        }
        C46222tMi c46222tMi3 = this.EZpvd;
        if (c46222tMi3 == null) {
            Intrinsics.gEmmrt("");
            c46222tMi3 = null;
        }
        c46222tMi3.valueOf.setVisibility(0);
        C47839txg.setData$default(EZpvd(), arrayList, null, 2, null);
        djBIcL();
    }

    public final void AEQbTJ() {
        C46222tMi c46222tMi = null;
        if (C47774twU.AEQbTJ.copydefault()) {
            C46222tMi c46222tMi2 = this.EZpvd;
            if (c46222tMi2 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi2 = null;
            }
            CardView cardView = c46222tMi2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(cardView, "");
            cardView.setVisibility(0);
            C46222tMi c46222tMi3 = this.EZpvd;
            if (c46222tMi3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46222tMi = c46222tMi3;
            }
            android.widget.TextView textView = c46222tMi.AuCTel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            return;
        }
        C46222tMi c46222tMi4 = this.EZpvd;
        if (c46222tMi4 == null) {
            Intrinsics.gEmmrt("");
            c46222tMi4 = null;
        }
        CardView cardView2 = c46222tMi4.KWHzl;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        cardView2.setVisibility(8);
        C46222tMi c46222tMi5 = this.EZpvd;
        if (c46222tMi5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46222tMi = c46222tMi5;
        }
        android.widget.TextView textView2 = c46222tMi.AuCTel;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    private final void valueOf() {
        C46222tMi c46222tMi = this.EZpvd;
        C46222tMi c46222tMi2 = null;
        if (c46222tMi == null) {
            Intrinsics.gEmmrt("");
            c46222tMi = null;
        }
        c46222tMi.uzCIH.setAdapter(EZpvd());
        C46222tMi c46222tMi3 = this.EZpvd;
        if (c46222tMi3 == null) {
            Intrinsics.gEmmrt("");
            c46222tMi3 = null;
        }
        c46222tMi3.uzCIH.setNestedScrollingEnabled(false);
        C46222tMi c46222tMi4 = this.EZpvd;
        if (c46222tMi4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46222tMi2 = c46222tMi4;
        }
        c46222tMi2.uzCIH.registerOnPageChangeCallback(new FragmentManager());
    }

    /* JADX INFO: renamed from: o.twW$FragmentManager */
    public static final class FragmentManager extends ViewPager2.OnPageChangeCallback {
        public FragmentManager() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            CreatorCentreSubPage creatorCentreSubPageKWHzl = ActivityC47776twW.this.EZpvd().KWHzl(i);
            if (creatorCentreSubPageKWHzl != null) {
                ActivityC47776twW activityC47776twW = ActivityC47776twW.this;
                activityC47776twW.AEQbTJ = creatorCentreSubPageKWHzl;
                pUU.EZpvd(activityC47776twW.getTAG(), "Tab selected: " + creatorCentreSubPageKWHzl.name());
            }
        }
    }

    /* JADX INFO: renamed from: o.twW$LoaderManager */
    public static final class LoaderManager implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public LoaderManager() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            android.widget.TextView textViewEZpvd;
            if (tab != null) {
                ActivityC47776twW activityC47776twW = ActivityC47776twW.this;
                CreatorCentreSubPage creatorCentreSubPageKWHzl = activityC47776twW.EZpvd().KWHzl(tab.getPosition());
                if (creatorCentreSubPageKWHzl == null) {
                    creatorCentreSubPageKWHzl = CreatorCentreSubPage.POST;
                }
                activityC47776twW.AEQbTJ = creatorCentreSubPageKWHzl;
                android.view.View customView = tab.getCustomView();
                C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
                if (c54989xbV == null || (textViewEZpvd = c54989xbV.EZpvd()) == null) {
                    return;
                }
                textViewEZpvd.setTextAppearance(activityC47776twW, C52761wXj.LoaderManager.giSNqX);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            android.widget.TextView textViewEZpvd;
            if (tab != null) {
                ActivityC47776twW activityC47776twW = ActivityC47776twW.this;
                android.view.View customView = tab.getCustomView();
                C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
                if (c54989xbV == null || (textViewEZpvd = c54989xbV.EZpvd()) == null) {
                    return;
                }
                textViewEZpvd.setTextAppearance(activityC47776twW, C52761wXj.LoaderManager.giSNqX);
            }
        }
    }

    private final void AhwBna() {
        C46222tMi c46222tMi = this.EZpvd;
        if (c46222tMi == null) {
            Intrinsics.gEmmrt("");
            c46222tMi = null;
        }
        c46222tMi.DbNXlk.copydefault(new LoaderManager());
    }

    private final void djBIcL() {
        if (this.valueOf == null) {
            C46222tMi c46222tMi = this.EZpvd;
            C46222tMi c46222tMi2 = null;
            if (c46222tMi == null) {
                Intrinsics.gEmmrt("");
                c46222tMi = null;
            }
            TabLayout tabLayoutAYXKKw = c46222tMi.DbNXlk.AYXKKw();
            C46222tMi c46222tMi3 = this.EZpvd;
            if (c46222tMi3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c46222tMi2 = c46222tMi3;
            }
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutAYXKKw, c46222tMi2.uzCIH, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.txd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    ActivityC47776twW.AEQbTJ(this.copydefault, tab, i);
                }
            });
            tabLayoutMediator.attach();
            this.valueOf = tabLayoutMediator;
        }
    }

    public static final void AEQbTJ(ActivityC47776twW activityC47776twW, TabLayout.Tab tab, int i) {
        java.lang.String contentDescriptionId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tab, "");
        CreatorCentreSubPage creatorCentreSubPageKWHzl = activityC47776twW.EZpvd().KWHzl(i);
        CreatorCentreSubPage creatorCentreSubPage = creatorCentreSubPageKWHzl instanceof CreatorCentreSubPage ? creatorCentreSubPageKWHzl : null;
        java.lang.CharSequence charSequenceAEQbTJ = activityC47776twW.EZpvd().AEQbTJ(i);
        tab.setText(charSequenceAEQbTJ);
        tab.setTag(charSequenceAEQbTJ);
        if (creatorCentreSubPage != null && (contentDescriptionId = creatorCentreSubPage.getContentDescriptionId()) != null) {
            str = contentDescriptionId;
        }
        tab.setContentDescription(str);
    }

    public final void AEQbTJ(OrbitCreateCentreInfo orbitCreateCentreInfo) {
        int i;
        LiveStreamsData liveStreamsData = orbitCreateCentreInfo.getLiveStreamsData();
        boolean z = liveStreamsData != null && liveStreamsData.getPermission();
        boolean zIsAvailable = CreatorCentreSubPage.POST.isAvailable();
        C46222tMi c46222tMi = null;
        if (zIsAvailable) {
            C46222tMi c46222tMi2 = this.EZpvd;
            if (c46222tMi2 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi2 = null;
            }
            c46222tMi2.EZpvd.setVisibility(0);
            C46222tMi c46222tMi3 = this.EZpvd;
            if (c46222tMi3 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi3 = null;
            }
            CardView cardView = c46222tMi3.EZpvd;
            cardView.setOnClickListener(new TaskDescription(cardView, 1000L, this));
        } else {
            C46222tMi c46222tMi4 = this.EZpvd;
            if (c46222tMi4 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi4 = null;
            }
            c46222tMi4.EZpvd.setVisibility(8);
        }
        boolean z2 = CreatorCentreSubPage.LIVESTREAMS.isAvailable() && z;
        if (z2) {
            C46222tMi c46222tMi5 = this.EZpvd;
            if (c46222tMi5 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi5 = null;
            }
            c46222tMi5.AEQbTJ.setVisibility(0);
            C46222tMi c46222tMi6 = this.EZpvd;
            if (c46222tMi6 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi6 = null;
            }
            CardView cardView2 = c46222tMi6.AEQbTJ;
            cardView2.setOnClickListener(new StateListAnimator(cardView2, 1000L, this));
        } else {
            C46222tMi c46222tMi7 = this.EZpvd;
            if (c46222tMi7 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi7 = null;
            }
            c46222tMi7.AEQbTJ.setVisibility(8);
        }
        boolean zIsAvailable2 = CreatorCentreSubPage.GROUPS.isAvailable();
        if (zIsAvailable2) {
            C46222tMi c46222tMi8 = this.EZpvd;
            if (c46222tMi8 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi8 = null;
            }
            c46222tMi8.OLrzqt.setVisibility(0);
            C46222tMi c46222tMi9 = this.EZpvd;
            if (c46222tMi9 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi9 = null;
            }
            CardView cardView3 = c46222tMi9.OLrzqt;
            cardView3.setOnClickListener(new Application(cardView3, 1000L, this));
        } else {
            C46222tMi c46222tMi10 = this.EZpvd;
            if (c46222tMi10 == null) {
                Intrinsics.gEmmrt("");
                c46222tMi10 = null;
            }
            c46222tMi10.OLrzqt.setVisibility(8);
        }
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Boolean.valueOf(zIsAvailable), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(zIsAvailable2));
        if ((listGEmmrt instanceof java.util.Collection) && listGEmmrt.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator it = listGEmmrt.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((java.lang.Boolean) it.next()).booleanValue() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        C46222tMi c46222tMi11 = this.EZpvd;
        if (c46222tMi11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46222tMi = c46222tMi11;
        }
        c46222tMi.AhwBna.setVisibility(i <= 0 ? 8 : 0);
        pUU.EZpvd(getTAG(), "Monetization section setup: posts=" + zIsAvailable + ", livestreams=" + z2 + " (permission=" + z + "), groups=" + zIsAvailable2);
    }

    /* JADX INFO: renamed from: o.twW$Fragment */
    public static final class Fragment implements Function1<EventParamsList, Unit> {
        public static final Fragment EZpvd = new Fragment();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "product", "posts", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.twW$Dialog */
    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog AEQbTJ = new Dialog();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "product", "livestream", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.twW$PendingIntent */
    public static final class PendingIntent implements Function1<EventParamsList, Unit> {
        public static final PendingIntent AEQbTJ = new PendingIntent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "product", "groups", false, 4, null);
        }
    }

    public final void copydefault(java.lang.String str) {
        java.lang.String str2;
        C46222tMi c46222tMi = this.EZpvd;
        C46222tMi c46222tMi2 = null;
        if (c46222tMi == null) {
            Intrinsics.gEmmrt("");
            c46222tMi = null;
        }
        CardView cardView = c46222tMi.KWHzl;
        cardView.setOnClickListener(new ActionBar(cardView, 1000L, this));
        C46222tMi c46222tMi3 = this.EZpvd;
        if (c46222tMi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46222tMi2 = c46222tMi3;
        }
        android.widget.TextView textView = c46222tMi2.fARcdN;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            str2 = pTB.formatICUNumber$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), null, null, 12, null) + " USD";
        } else {
            str2 = "-.-- USD";
        }
        textView.setText(str2);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            TabLayoutMediator tabLayoutMediator = this.valueOf;
            if (tabLayoutMediator != null) {
                tabLayoutMediator.detach();
            }
            this.valueOf = null;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error detaching components", e);
        }
        super.onDestroy();
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
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
