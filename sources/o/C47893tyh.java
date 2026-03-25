package o;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_home.feed_tab.FeedPage;
import com.okinc.planet.biz_home.root.PlanetRootFragment$initUI$1$1;
import com.okinc.planet.biz_home.root.PlanetRootFragment$observeChatUnreadCount$1;
import com.okinc.planet.biz_home.root.PlanetRootFragment$observeUserEvent$1;
import com.okinc.planet.biz_home.root.PlanetRootFragment$observeViewModel$1;
import com.okinc.planet.biz_home.root.PlanetRootFragment$observeViewModel$2;
import com.okinc.planet.biz_home.root.PlanetRootFragment$observerWSMessage$1;
import com.okinc.planet.biz_home.root.PlanetRootFragment$onCreate$2;
import com.okinc.planet.biz_home.root.PlanetSubPage;
import com.okinc.planet.utils.IMUtils;
import com.okinc.rxutils.RxBus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC47909tyx;
import o.C45904tAo;
import o.C47501trL;
import o.C47887tyb;
import o.C47889tyd;
import o.C47893tyh;
import o.C52761wXj;
import o.C6814aWV;
import o.InterfaceC43033rhe;
import o.InterfaceC8101awQ;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47893tyh extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public AppBarLayout AEQbTJ;
    public boolean AYXKKw;
    public final InterfaceC56387yDm DbNXlk;
    public C46268tOa EZpvd;
    public boolean fetchVPNInfo;
    public boolean gEmmrt;
    public TabLayoutMediator isConnected;
    public boolean valueOf;
    public boolean AhwBna = true;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.typ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47893tyh.AYXKKw(this.OLrzqt);
        }
    });
    public final VoiceInteractor djBIcL = new VoiceInteractor();
    public PlanetSubPage copydefault = PlanetSubPage.FEED;

    /* JADX INFO: renamed from: o.tyh$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PlanetSubPage.values().length];
            try {
                iArr[PlanetSubPage.FEED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PlanetSubPage.CHAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PlanetSubPage.LeaderBoard.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.dmfpNf;
    }

    public C47893tyh() {
        final Function0 function0 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47911tyz.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_home.root.PlanetRootFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_home.root.PlanetRootFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_home.root.PlanetRootFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.tyh$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final InterfaceC7298ahG OLrzqt() {
        return C7323ahf.KWHzl();
    }

    public static final C47830txX AYXKKw(C47893tyh c47893tyh) {
        return new C47830txX(c47893tyh);
    }

    public final C47830txX EZpvd() {
        return (C47830txX) this.KWHzl.getValue();
    }

    public final C47911tyz KWHzl() {
        return (C47911tyz) this.DbNXlk.getValue();
    }

    private final InterfaceC7298ahG djBIcL() {
        return C7323ahf.KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Context applicationContext = requireContext().getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            Application.copydefault.EZpvd(application);
        }
        pUU.EZpvd("zhoulijuan", "--------------------orbitRoot--onCreate");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetRootFragment$onCreate$2(this, null), 3, null);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        Intrinsics.checkNotNullParameter(view, "");
        C46268tOa c46268tOaAEQbTJ = C46268tOa.AEQbTJ(view);
        Intrinsics.copydefault(c46268tOaAEQbTJ);
        EZpvd(c46268tOaAEQbTJ);
        KWHzl(c46268tOaAEQbTJ);
        this.EZpvd = c46268tOaAEQbTJ;
        AEQbTJ();
        copydefault();
        AhwBna();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        copydefault(childFragmentManager);
        C46370tRv.KWHzl(this, true);
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa != null && (imageView2 = c46268tOa.AEQbTJ) != null) {
            imageView2.setOnClickListener(new PendingIntent(imageView2, 1000L, this));
        }
        C46268tOa c46268tOa2 = this.EZpvd;
        if (c46268tOa2 != null && (imageView = c46268tOa2.KWHzl) != null) {
            imageView.setOnClickListener(new LoaderManager(imageView, 1000L, this));
        }
        values();
        valueOf();
        AYXKKw();
    }

    /* JADX INFO: renamed from: o.tyh$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C47893tyh OLrzqt;
        public final /* synthetic */ C46268tOa copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C47893tyh c47893tyh, C46268tOa c46268tOa) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c47893tyh;
            this.copydefault = c46268tOa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new PlanetRootFragment$initUI$1$1(this.OLrzqt, this.copydefault, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.tyh$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C47893tyh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C47893tyh c47893tyh) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c47893tyh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ViewPager2 viewPager2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C46268tOa c46268tOa = this.copydefault.EZpvd;
                PlanetSubPage planetSubPageCopydefault = this.copydefault.EZpvd().copydefault((c46268tOa == null || (viewPager2 = c46268tOa.gEmmrt) == null) ? 0 : viewPager2.getCurrentItem());
                int i = planetSubPageCopydefault == null ? -1 : StateListAnimator.copydefault[planetSubPageCopydefault.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C32866mlf.onEvent$default("Homepage_Top_SearchInputBox_Click", (TrackChannel[]) null, AssistContent.OLrzqt, 1, (java.lang.Object) null);
                        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC43033rhe.class));
                        if (interfaceC43033rhe != null) {
                            android.content.Context contextRequireContext = this.copydefault.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            InterfaceC43033rhe.StateListAnimator.gotoMainSearchPageFromPlanetChat$default(interfaceC43033rhe, contextRequireContext, null, 2, null);
                            return;
                        }
                        return;
                    }
                    if (i != 3) {
                        return;
                    }
                }
                C32866mlf.onEvent$default("Homepage_Top_SearchInputBox_Click", (TrackChannel[]) null, PictureInPictureParams.copydefault, 1, (java.lang.Object) null);
                InterfaceC43033rhe interfaceC43033rhe2 = (InterfaceC43033rhe) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC43033rhe.class));
                if (interfaceC43033rhe2 != null) {
                    android.content.Context contextRequireContext2 = this.copydefault.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    InterfaceC43033rhe.StateListAnimator.gotoMainSearchPageFromPlanetFeed$default(interfaceC43033rhe2, contextRequireContext2, null, 2, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.tyh$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C47893tyh KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C47893tyh c47893tyh) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c47893tyh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Planet_PersonalProfile_Page_Click", (TrackChannel[]) null, Dialog.AEQbTJ, 1, (java.lang.Object) null);
                C46447tUr c46447tUr = C46447tUr.KWHzl;
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C46447tUr.openMyPlanetUserProfilePage$default(c46447tUr, contextRequireContext, "homepage", "", null, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.tyh$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ C47893tyh EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C47893tyh c47893tyh) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c47893tyh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                IMUtils iMUtils = IMUtils.KWHzl;
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                iMUtils.OLrzqt(fragmentActivityRequireActivity);
            }
        }
    }

    /* JADX INFO: renamed from: o.tyh$Dialog */
    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog AEQbTJ = new Dialog();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "uid", "", false, 4, null);
        }
    }

    public final void AhwBna() {
        InterfaceC7298ahG interfaceC7298ahGDjBIcL = djBIcL();
        if (interfaceC7298ahGDjBIcL != null) {
            interfaceC7298ahGDjBIcL.EZpvd("Planet_Publish_Post_Success_Notification", new SharedElementCallback(), "Planet_Publish_Post_Success_Notification");
        }
    }

    /* JADX INFO: renamed from: o.tyh$SharedElementCallback */
    public static final class SharedElementCallback implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public SharedElementCallback() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            pUU.KWHzl("qjf", "receive publish success event----->");
            C47893tyh.this.KWHzl().EZpvd(PlanetSubPage.FEED);
            C47893tyh.this.KWHzl().EZpvd(FeedPage.FOR_YOU.ordinal());
            return true;
        }
    }

    /* JADX INFO: renamed from: o.tyh$VoiceInteractor */
    public static final class VoiceInteractor implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public VoiceInteractor() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            C47893tyh.this.KWHzl().EZpvd(PlanetSubPage.FEED);
            C47893tyh.this.KWHzl().EZpvd(FeedPage.FOR_YOU.ordinal());
            return true;
        }
    }

    private final void DbNXlk() {
        if (OLrzqt() == null || this.gEmmrt) {
            return;
        }
        InterfaceC7298ahG interfaceC7298ahGOLrzqt = OLrzqt();
        Intrinsics.copydefault(interfaceC7298ahGOLrzqt);
        interfaceC7298ahGOLrzqt.EZpvd("Planet_Following_Select_To_ForYou", this.djBIcL, "MarketFeeds_Tab_Reset_To_Initial");
        this.gEmmrt = true;
    }

    public final void EZpvd(C46268tOa c46268tOa) {
        android.widget.ImageView imageView = c46268tOa.EZpvd;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this, c46268tOa));
        DbNXlk();
        c46268tOa.gEmmrt.setAdapter(EZpvd());
        c46268tOa.gEmmrt.registerOnPageChangeCallback(new Activity(c46268tOa));
        c46268tOa.djBIcL.copydefault(new FragmentManager());
    }

    /* JADX INFO: renamed from: o.tyh$Activity */
    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ C46268tOa copydefault;

        /* JADX INFO: renamed from: o.tyh$Activity$StateListAnimator */
        /* JADX INFO: loaded from: classes19.dex */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PlanetSubPage.values().length];
                try {
                    iArr[PlanetSubPage.FEED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[PlanetSubPage.CHAT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlanetSubPage.LeaderBoard.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        public Activity(C46268tOa c46268tOa) {
            this.copydefault = c46268tOa;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C47893tyh.this.KWHzl().KWHzl(i);
            boolean z = C47893tyh.this.EZpvd().copydefault(i) == PlanetSubPage.FEED && C47893tyh.this.KWHzl().AEQbTJ() == FeedPage.FOR_YOU.ordinal();
            try {
                InterfaceC7298ahG interfaceC7298ahGOLrzqt = C47893tyh.this.OLrzqt();
                if (interfaceC7298ahGOLrzqt != null) {
                    interfaceC7298ahGOLrzqt.AEQbTJ(z ? "Planet_Feed_DidEnter_Notification" : "Planet_Feed_DidLeave_Notification", null, null);
                }
            } catch (java.lang.Exception unused) {
            }
            PlanetSubPage planetSubPageCopydefault = C47893tyh.this.EZpvd().copydefault(i);
            int i2 = planetSubPageCopydefault == null ? -1 : StateListAnimator.EZpvd[planetSubPageCopydefault.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    this.copydefault.EZpvd.setVisibility(8);
                    C32866mlf.onEvent$default("Feeds_Top_ChatTab_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                    return;
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    this.copydefault.EZpvd.setVisibility(8);
                    return;
                }
            }
            if (((tWM) C43251rlk.copydefault(tWM.class)).valueOf()) {
                this.copydefault.EZpvd.setVisibility(0);
            } else {
                this.copydefault.EZpvd.setVisibility(8);
            }
            int iAEQbTJ = C47893tyh.this.KWHzl().AEQbTJ();
            if (iAEQbTJ == FeedPage.FOR_YOU.ordinal()) {
                C32866mlf.onEvent$default("Feeds_Top_FeedTab_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            } else if (iAEQbTJ == FeedPage.FOLLOWING.ordinal()) {
                C32866mlf.onEvent$default("Feeds_Top_FollowingTab_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            } else if (iAEQbTJ == FeedPage.NEWS.ordinal()) {
                C32866mlf.onEvent$default("Feeds_Top_NewsTab_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.tyh$FragmentManager */
    public static final class FragmentManager implements TabLayout.OnTabSelectedListener {
        public FragmentManager() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            android.widget.ImageView imageViewEZpvd;
            if (tab != null) {
                C47893tyh c47893tyh = C47893tyh.this;
                PlanetSubPage planetSubPageCopydefault = c47893tyh.EZpvd().copydefault(tab.getPosition());
                if (planetSubPageCopydefault == null) {
                    planetSubPageCopydefault = PlanetSubPage.LeaderBoard;
                }
                c47893tyh.copydefault = planetSubPageCopydefault;
                if (c47893tyh.copydefault == PlanetSubPage.FEED && (imageViewEZpvd = C55243xgK.EZpvd(tab)) != null) {
                    imageViewEZpvd.setVisibility(0);
                }
                android.view.View customView = tab.getCustomView();
                Intrinsics.copydefault(customView, "");
                ((C54989xbV) customView).EZpvd().setTextAppearance(c47893tyh.requireContext(), C52761wXj.LoaderManager.giSNqX);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            android.widget.ImageView imageViewEZpvd;
            if (tab != null) {
                C47893tyh c47893tyh = C47893tyh.this;
                if (c47893tyh.EZpvd().copydefault(tab.getPosition()) == PlanetSubPage.FEED && (imageViewEZpvd = C55243xgK.EZpvd(tab)) != null) {
                    imageViewEZpvd.setVisibility(8);
                }
                android.view.View customView = tab.getCustomView();
                Intrinsics.copydefault(customView, "");
                ((C54989xbV) customView).EZpvd().setTextAppearance(c47893tyh.requireContext(), C52761wXj.LoaderManager.giSNqX);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(final TabLayout.Tab tab) {
            android.widget.ImageView imageViewEZpvd;
            if (tab != null) {
                C47893tyh c47893tyh = C47893tyh.this;
                PlanetSubPage planetSubPageCopydefault = c47893tyh.EZpvd().copydefault(tab.getPosition());
                PlanetSubPage planetSubPage = PlanetSubPage.FEED;
                if (planetSubPageCopydefault == planetSubPage && (imageViewEZpvd = C55243xgK.EZpvd(tab)) != null && imageViewEZpvd.getVisibility() == 0) {
                    android.widget.ImageView imageViewEZpvd2 = C55243xgK.EZpvd(tab);
                    if (imageViewEZpvd2 != null) {
                        imageViewEZpvd2.setImageResource(C52761wXj.TaskDescription.dUDNAs);
                    }
                    C47887tyb.ActionBar actionBar = C47887tyb.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager = c47893tyh.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    actionBar.OLrzqt(childFragmentManager, new Function0() { // from class: o.tyo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C47893tyh.FragmentManager.EZpvd(tab);
                        }
                    });
                }
                if (planetSubPageCopydefault == planetSubPage) {
                    c47893tyh.KWHzl().fetchVPNInfo();
                }
            }
        }

        public static final Unit EZpvd(TabLayout.Tab tab) {
            android.widget.ImageView imageViewEZpvd = C55243xgK.EZpvd(tab);
            if (imageViewEZpvd != null) {
                imageViewEZpvd.setImageResource(C52761wXj.TaskDescription.QSLkRj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(C46268tOa c46268tOa) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PlanetRootFragment$observerWSMessage$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        final C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(c46268tOa.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.tyj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return C47893tyh.KWHzl(this.copydefault, c46268tOa, view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat KWHzl(C47893tyh c47893tyh, C46268tOa c46268tOa, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        AppBarLayout appBarLayout = c47893tyh.AEQbTJ;
        if (appBarLayout != null) {
            int paddingLeft = appBarLayout != null ? appBarLayout.getPaddingLeft() : 0;
            int i = insets.top;
            AppBarLayout appBarLayout2 = c47893tyh.AEQbTJ;
            appBarLayout.setPadding(paddingLeft, i, appBarLayout2 != null ? appBarLayout2.getPaddingRight() : 0, 0);
        }
        ViewPager2 viewPager2 = c46268tOa.gEmmrt;
        viewPager2.setPadding(0, viewPager2.getPaddingTop(), 0, 0);
        return windowInsetsCompat;
    }

    public final void copydefault() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PlanetRootFragment$observeChatUnreadCount$1(this, null), 3, null);
    }

    private final void values() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PlanetRootFragment$observeViewModel$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new PlanetRootFragment$observeViewModel$2(this, null), 3, null);
    }

    private final void valueOf() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PlanetRootFragment$observeUserEvent$1(this, null), 3, null);
    }

    public final void OLrzqt(C47861tyB c47861tyB) {
        C46268tOa c46268tOa;
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        android.widget.ImageView imageView;
        if (c47861tyB.EZpvd() || this.isConnected == null) {
            pUU.EZpvd(getTAG(), "updateUI-availableTabs---->" + c47861tyB.OLrzqt());
            KWHzl().copydefault();
            EZpvd().copydefault(c47861tyB.OLrzqt(), new java.lang.Runnable() { // from class: o.tyn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C47893tyh.AhwBna(this.EZpvd);
                }
            });
            KWHzl(c47861tyB);
            if (C46437tUh.OLrzqt.EZpvd() && (c46268tOa = this.EZpvd) != null && (c55244xgL = c46268tOa.djBIcL) != null && (tabLayoutAYXKKw = c55244xgL.AYXKKw()) != null) {
                KWHzl(tabLayoutAYXKKw);
            }
            C46268tOa c46268tOa2 = this.EZpvd;
            if (c46268tOa2 != null && c46268tOa2.gEmmrt != null) {
                copydefault(c47861tyB);
            }
        } else {
            EZpvd(C33070mpX.AYXKKw(c47861tyB.KWHzl()));
            copydefault(c47861tyB);
        }
        C46268tOa c46268tOa3 = this.EZpvd;
        if (c46268tOa3 != null && (imageView = c46268tOa3.AEQbTJ) != null) {
            imageView.setVisibility(c47861tyB.AYXKKw() ? 0 : 8);
        }
        OLrzqt(c47861tyB.copydefault());
    }

    public static final void AhwBna(C47893tyh c47893tyh) {
        C46268tOa c46268tOa;
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        if (!C46437tUh.OLrzqt.EZpvd() || (c46268tOa = c47893tyh.EZpvd) == null || (c55244xgL = c46268tOa.djBIcL) == null || (tabLayoutAYXKKw = c55244xgL.AYXKKw()) == null) {
            return;
        }
        c47893tyh.KWHzl(tabLayoutAYXKKw);
    }

    public final void copydefault(C47861tyB c47861tyB) {
        ViewPager2 viewPager2;
        int iAEQbTJ = c47861tyB.AEQbTJ();
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa == null || (viewPager2 = c46268tOa.gEmmrt) == null || viewPager2.getCurrentItem() == iAEQbTJ) {
            return;
        }
        viewPager2.setCurrentItem(iAEQbTJ, false);
    }

    public final void EZpvd(java.lang.String str) {
        TabLayout.Tab tabAt;
        C55244xgL c55244xgL;
        C46268tOa c46268tOa = this.EZpvd;
        TabLayout tabLayoutAYXKKw = (c46268tOa == null || (c55244xgL = c46268tOa.djBIcL) == null) ? null : c55244xgL.AYXKKw();
        int iCopydefault = EZpvd().copydefault(PlanetSubPage.FEED);
        if (iCopydefault < 0 || tabLayoutAYXKKw == null || (tabAt = tabLayoutAYXKKw.getTabAt(iCopydefault)) == null) {
            return;
        }
        tabAt.setText(str);
    }

    public final void KWHzl(TabLayout tabLayout) {
        tabLayout.setTabMode(1);
        tabLayout.setTabGravity(0);
        tabLayout.setHorizontalFadingEdgeEnabled(false);
        android.view.View childAt = tabLayout.getChildAt(0);
        if (childAt != null) {
            childAt.setPaddingRelative(0, childAt.getPaddingTop(), 0, childAt.getPaddingBottom());
        }
        EZpvd(tabLayout);
    }

    public final void EZpvd(TabLayout tabLayout) {
        android.view.View customView;
        ViewGroup.LayoutParams layoutParams;
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(i);
            if (tabAt != null && (customView = tabAt.getCustomView()) != null && (layoutParams = customView.getLayoutParams()) != null) {
                layoutParams.width = -2;
            }
        }
        tabLayout.requestLayout();
    }

    public final void EZpvd(AbstractC47909tyx abstractC47909tyx) {
        ViewPager2 viewPager2;
        if ((abstractC47909tyx instanceof AbstractC47909tyx.StateListAnimator) || (abstractC47909tyx instanceof AbstractC47909tyx.ActionBar)) {
            return;
        }
        if (!(abstractC47909tyx instanceof AbstractC47909tyx.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa == null || (viewPager2 = c46268tOa.gEmmrt) == null) {
            return;
        }
        viewPager2.setCurrentItem(((AbstractC47909tyx.Application) abstractC47909tyx).AEQbTJ(), true);
    }

    public final void KWHzl(final C47861tyB c47861tyB) {
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        C46268tOa c46268tOa;
        ViewPager2 viewPager2;
        TabLayoutMediator tabLayoutMediator = this.isConnected;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        C46268tOa c46268tOa2 = this.EZpvd;
        if (c46268tOa2 == null || (c55244xgL = c46268tOa2.djBIcL) == null || (tabLayoutAYXKKw = c55244xgL.AYXKKw()) == null || (c46268tOa = this.EZpvd) == null || (viewPager2 = c46268tOa.gEmmrt) == null) {
            return;
        }
        TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(tabLayoutAYXKKw, viewPager2, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.tym
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C47893tyh.copydefault(this.copydefault, c47861tyB, tab, i);
            }
        });
        tabLayoutMediator2.attach();
        this.isConnected = tabLayoutMediator2;
    }

    public static final void copydefault(C47893tyh c47893tyh, C47861tyB c47861tyB, TabLayout.Tab tab, int i) {
        java.lang.CharSequence charSequenceAEQbTJ;
        Intrinsics.checkNotNullParameter(tab, "");
        PlanetSubPage planetSubPageCopydefault = c47893tyh.EZpvd().copydefault(i);
        Intrinsics.copydefault(planetSubPageCopydefault, "");
        PlanetSubPage planetSubPage = planetSubPageCopydefault;
        if (StateListAnimator.copydefault[planetSubPage.ordinal()] == 1) {
            charSequenceAEQbTJ = C33070mpX.AYXKKw(c47861tyB.KWHzl());
        } else {
            charSequenceAEQbTJ = c47893tyh.EZpvd().AEQbTJ(i);
        }
        pUU.KWHzl("qjf", "tabTitle = " + ((java.lang.Object) charSequenceAEQbTJ));
        tab.setText(charSequenceAEQbTJ);
        tab.setTag(charSequenceAEQbTJ);
        tab.setContentDescription(planetSubPage.getContentDescriptionId());
    }

    public final void OLrzqt(final int i) {
        C55244xgL c55244xgL;
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa == null || (c55244xgL = c46268tOa.djBIcL) == null) {
            return;
        }
        c55244xgL.post(new java.lang.Runnable() { // from class: o.tyl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47893tyh.AEQbTJ(this.AEQbTJ, i);
            }
        });
    }

    public static final void AEQbTJ(C47893tyh c47893tyh, int i) {
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        TabLayout.Tab tabAt;
        C46268tOa c46268tOa;
        C55244xgL c55244xgL2;
        C46268tOa c46268tOa2;
        C55244xgL c55244xgL3;
        C46268tOa c46268tOa3 = c47893tyh.EZpvd;
        if (c46268tOa3 == null || (c55244xgL = c46268tOa3.djBIcL) == null || (tabLayoutAYXKKw = c55244xgL.AYXKKw()) == null) {
            return;
        }
        int tabCount = tabLayoutAYXKKw.getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            TabLayout.Tab tabAt2 = tabLayoutAYXKKw.getTabAt(i2);
            if (tabAt2 != null && (c46268tOa2 = c47893tyh.EZpvd) != null && (c55244xgL3 = c46268tOa2.djBIcL) != null) {
                C55244xgL.updateBadgeCount$default(c55244xgL3, tabAt2, 0, 0, 4, (java.lang.Object) null);
            }
        }
        int iCopydefault = c47893tyh.EZpvd().copydefault(PlanetSubPage.CHAT);
        pUU.KWHzl(c47893tyh.getTAG(), "updateChatRedDot-unreadCount=" + i + ", chatTabPosition=" + iCopydefault + ", tabCount=" + tabCount);
        if (iCopydefault < 0 || iCopydefault >= tabCount || (tabAt = tabLayoutAYXKKw.getTabAt(iCopydefault)) == null || (c46268tOa = c47893tyh.EZpvd) == null || (c55244xgL2 = c46268tOa.djBIcL) == null) {
            return;
        }
        C55244xgL.updateBadgeCount$default(c55244xgL2, tabAt, i, 0, 4, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        android.widget.ImageView imageView;
        InterfaceC8101awQ interfaceC8101awQ;
        super.onResume();
        pUU.EZpvd("zhoulijuan", "--------------------orbitRoot--onResume");
        if (this.fetchVPNInfo) {
            kotlin.Pair<java.lang.Boolean, java.lang.String> pairDbNXlk = KWHzl().DbNXlk();
            boolean zBooleanValue = pairDbNXlk.component1().booleanValue();
            pairDbNXlk.component2();
            if (zBooleanValue) {
                pUU.EZpvd("zhoulijuan", "--------------------orbitRoot--openOnboarding");
                C45899tAj c45899tAj = C45899tAj.copydefault;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                c45899tAj.copydefault(fragmentActivityRequireActivity);
            }
            this.fetchVPNInfo = false;
        }
        if (KWHzl().values()) {
            pUU.EZpvd("zhoulijuan", "--------------------orbitRoot--openAutoDialog");
            C45904tAo.ActionBar actionBar = C45904tAo.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            actionBar.KWHzl(childFragmentManager);
        }
        KWHzl().fJNWhG();
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa != null && (imageView = c46268tOa.KWHzl) != null && (interfaceC8101awQ = (InterfaceC8101awQ) C43251rlk.OLrzqt(InterfaceC8101awQ.class)) != null) {
            InterfaceC8101awQ.Activity.loadUserAvatar$default(interfaceC8101awQ, imageView, false, null, 6, null);
        }
        C46268tOa c46268tOa2 = this.EZpvd;
        if (c46268tOa2 != null) {
            int i = StateListAnimator.copydefault[this.copydefault.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c46268tOa2.EZpvd.setVisibility(8);
            } else if (((tWM) C43251rlk.copydefault(tWM.class)).valueOf()) {
                c46268tOa2.EZpvd.setVisibility(0);
            } else {
                c46268tOa2.EZpvd.setVisibility(8);
            }
        }
        if (this.AhwBna) {
            gEmmrt();
            AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C6814aWV.class, "");
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this).subscribe(new RxBus.EventCallback<C6814aWV>() { // from class: com.okinc.planet.biz_home.root.PlanetRootFragment$onResume$3
                {
                    super(this.this$0);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(C6814aWV c6814aWV) {
                    Intrinsics.checkNotNullParameter(c6814aWV, "");
                    pUU.KWHzl("qjf", "receive ChangePageEvent-------->");
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new PlanetRootFragment$onResume$3$onEvent$1(this.this$0, c6814aWV, null), 3, null);
                }

                @Override // com.okinc.rxutils.BaseSubscriber, o.InterfaceC60097zve
                public void onComplete() {
                    super.onComplete();
                    this.this$0.AhwBna = true;
                }

                @Override // com.okinc.rxutils.BaseSubscriber, o.InterfaceC58217yxC
                public void dispose() {
                    super.dispose();
                    this.this$0.AhwBna = true;
                }
            });
            this.AhwBna = false;
        }
        KWHzl().ejfBZ();
    }

    public final void gEmmrt() {
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C47889tyd.class, "");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this).subscribe(new RxBus.EventCallback<C47889tyd>() { // from class: com.okinc.planet.biz_home.root.PlanetRootFragment$observerOrbiterPlusEvent$1
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C47889tyd c47889tyd) {
                pUU.KWHzl("qjf", "receive PlanetClickTabEvent-------->");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0), null, null, new PlanetRootFragment$observerOrbiterPlusEvent$1$onEvent$1(this.this$0, null), 3, null);
            }
        });
    }

    public final void copydefault(androidx.fragment.app.FragmentManager fragmentManager) {
        C55230xfy c55230xfy;
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa == null || (c55230xfy = c46268tOa.AYXKKw) == null) {
            return;
        }
        c55230xfy.setOnClickListener(new Fragment(c55230xfy, 1000L, this));
    }

    /* JADX INFO: renamed from: o.tyh$PictureInPictureParams */
    public static final class PictureInPictureParams implements Function1<EventParamsList, Unit> {
        public static final PictureInPictureParams copydefault = new PictureInPictureParams();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "from_page", "planet_feed", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.tyh$AssistContent */
    public static final class AssistContent implements Function1<EventParamsList, Unit> {
        public static final AssistContent OLrzqt = new AssistContent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "from_page", "planet_chat", false, 4, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [976=4] */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd(C6814aWV c6814aWV) {
        java.lang.String strEZpvd = c6814aWV.EZpvd();
        switch (strEZpvd.hashCode()) {
            case 1281771033:
                if (strEZpvd.equals("main/planet/chat")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    KWHzl().EZpvd(PlanetSubPage.CHAT);
                    break;
                }
                break;
            case 1281857631:
                if (strEZpvd.equals("main/planet/feed")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    KWHzl().EZpvd(PlanetSubPage.FEED);
                    java.lang.String string = c6814aWV.AEQbTJ().getString("tab_value");
                    if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "forYou")) {
                        KWHzl().EZpvd(FeedPage.FOR_YOU.ordinal());
                    } else if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "following")) {
                        KWHzl().EZpvd(FeedPage.FOLLOWING.ordinal());
                    }
                    break;
                }
                break;
            case 1282096532:
                if (strEZpvd.equals("main/planet/news")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    KWHzl().EZpvd(PlanetSubPage.FEED);
                    KWHzl().EZpvd(FeedPage.NEWS.ordinal());
                    break;
                }
                break;
            case 1412319644:
                if (strEZpvd.equals("main/planet/leaderboard")) {
                    RxBus.AEQbTJ(C6814aWV.class);
                    KWHzl().EZpvd(PlanetSubPage.LeaderBoard);
                    break;
                }
                break;
        }
    }

    public final void AYXKKw() {
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa != null) {
            AppBarLayout appBarLayout = (AppBarLayout) c46268tOa.getRoot().findViewById(C47501trL.TaskDescription.isConnected);
            this.AEQbTJ = appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: o.tyk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                    public final void onOffsetChanged(AppBarLayout appBarLayout2, int i) {
                        C47893tyh.OLrzqt(this.AEQbTJ, appBarLayout2, i);
                    }
                });
            }
        }
    }

    public static final void OLrzqt(C47893tyh c47893tyh, AppBarLayout appBarLayout, int i) {
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        float fAbs = totalScrollRange > 0 ? java.lang.Math.abs(i) / totalScrollRange : 0.0f;
        c47893tyh.valueOf = java.lang.Math.abs(i) >= java.lang.Math.max(totalScrollRange, 1);
        c47893tyh.copydefault(fAbs);
    }

    public final void copydefault(float f) {
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa != null) {
            float f2 = 1.0f - f;
            float fKWHzl = C56548yJl.KWHzl(f2, 0.0f, 1.0f);
            c46268tOa.KWHzl.setAlpha(fKWHzl);
            c46268tOa.AEQbTJ.setAlpha(fKWHzl);
            c46268tOa.djBIcL.setAlpha(C56548yJl.KWHzl(f2, 0.0f, 1.0f));
        }
    }

    public static /* synthetic */ void exitImmersive$default(C47893tyh c47893tyh, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        c47893tyh.copydefault(z, z2);
    }

    public final void copydefault(boolean z, boolean z2) {
        final android.view.Window window;
        pUU.EZpvd("PlanetRootFragment", "exitImmersive");
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        if (z2 || !getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            copydefault(z);
            final Function0 function0 = new Function0() { // from class: o.tyr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C47893tyh.EZpvd(window);
                }
            };
            if (z) {
                window.getDecorView().postDelayed(new java.lang.Runnable() { // from class: o.tyq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C47893tyh.OLrzqt(function0);
                    }
                }, 120L);
            } else {
                function0.invoke();
            }
        }
    }

    public static final Unit EZpvd(android.view.Window window) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        windowInsetsControllerCompat.setSystemBarsBehavior(1);
        windowInsetsControllerCompat.show(WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.navigationBars());
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function0 function0) {
        function0.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            copydefault(false, true);
        }
    }

    public static /* synthetic */ void restoreHeaderFullyVisible$default(C47893tyh c47893tyh, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c47893tyh.copydefault(z);
    }

    public final void copydefault(boolean z) {
        C46268tOa c46268tOa = this.EZpvd;
        if (c46268tOa != null) {
            if (z) {
                c46268tOa.KWHzl.animate().alpha(1.0f).setDuration(150L).start();
                c46268tOa.AEQbTJ.animate().alpha(1.0f).setDuration(150L).start();
                c46268tOa.djBIcL.animate().alpha(1.0f).setDuration(150L).start();
            } else {
                c46268tOa.KWHzl.setAlpha(1.0f);
                c46268tOa.AEQbTJ.setAlpha(1.0f);
                c46268tOa.djBIcL.setAlpha(1.0f);
            }
        }
        AppBarLayout appBarLayout = this.AEQbTJ;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true, z);
        }
        this.valueOf = false;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        boolean zKWHzl = Application.copydefault.KWHzl();
        pUU.EZpvd(getTAG(), "onStop immediate coveredByAnotherActivity=" + zKWHzl);
        if (zKWHzl) {
            exitImmersive$default(this, false, false, 2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        try {
            TabLayoutMediator tabLayoutMediator = this.isConnected;
            if (tabLayoutMediator != null) {
                tabLayoutMediator.detach();
            }
            if (OLrzqt() != null && this.gEmmrt) {
                InterfaceC7298ahG interfaceC7298ahGOLrzqt = OLrzqt();
                Intrinsics.copydefault(interfaceC7298ahGOLrzqt);
                interfaceC7298ahGOLrzqt.AEQbTJ("Planet_Following_Select_To_ForYou", this.djBIcL);
                this.gEmmrt = false;
            }
            TabLayoutMediator tabLayoutMediator2 = this.isConnected;
            if (tabLayoutMediator2 != null) {
                tabLayoutMediator2.detach();
            }
            this.isConnected = null;
            exitImmersive$default(this, false, false, 2, null);
            this.AEQbTJ = null;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error detaching components", e);
        }
        this.EZpvd = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.tyh$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application implements Application.ActivityLifecycleCallbacks {
        public static volatile boolean AEQbTJ;
        public static volatile int KWHzl;
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        private Application() {
        }

        public final void EZpvd(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            if (AEQbTJ) {
                return;
            }
            if (KWHzl == 0) {
                KWHzl = 1;
            }
            application.registerActivityLifecycleCallbacks(this);
            AEQbTJ = true;
        }

        public final boolean KWHzl() {
            pUU.EZpvd("PlanetRootFragment", "createdCount=" + KWHzl);
            return KWHzl > 1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            pUU.EZpvd("PlanetRootFragment", "onActivityCreated  createdCount=" + KWHzl);
            KWHzl = KWHzl + 1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (KWHzl > 0) {
                KWHzl--;
            }
            pUU.EZpvd("PlanetRootFragment", "onActivityCreated  createdCount=" + KWHzl);
        }
    }
}
