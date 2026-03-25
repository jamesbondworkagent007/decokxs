package o;

import android.graphics.PointF;
import android.transition.Transition;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.IntentCompat;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.preview.IMMediaPagerActivity$initViewModel$1;
import com.okinc.im.imui.preview.IMMediaPagerActivity$initViewModel$2;
import com.okinc.im.imui.preview.IMMediaPagerActivity$trackPageEntry$1;
import com.okinc.im.imui.preview.viewmodel.IMMediaPagerViewModel;
import com.okinc.im.imui.tracking.model.MediaType;
import com.okinc.im.imui.tracking.model.ResultState;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C37228opq;
import o.C44105sDn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37218opg extends AbstractActivityC37215opd<sDM> implements C37228opq.ActionBar {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AkhnZx;
    public boolean djBIcL;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.oph
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37218opg.isConnected(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.opi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37218opg.gEmmrt(this.AEQbTJ);
        }
    });
    public final int AhwBna = C44105sDn.StateListAnimator.DbNXlk;
    public StateListAnimator isConnected = StateListAnimator.Activity.EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.AhwBna;
    }

    public ActivityC37218opg() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(IMMediaPagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.preview.IMMediaPagerActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.preview.IMMediaPagerActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.preview.IMMediaPagerActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.opd.valueOf()V */
    public final IMMediaPagerViewModel valueOf() {
        return (IMMediaPagerViewModel) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.opd.djBIcL()V */
    public final C37228opq djBIcL() {
        return (C37228opq) this.valueOf.getValue();
    }

    public static final C37228opq isConnected(ActivityC37218opg activityC37218opg) {
        C37228opq c37228opq = new C37228opq(activityC37218opg);
        c37228opq.KWHzl(activityC37218opg);
        return c37228opq;
    }

    public final OKMessage gEmmrt() {
        return (OKMessage) this.AYXKKw.getValue();
    }

    public static final OKMessage gEmmrt(ActivityC37218opg activityC37218opg) {
        android.content.Intent intent = activityC37218opg.getIntent();
        OKMessage oKMessage = intent != null ? (OKMessage) IntentCompat.getParcelableExtra(intent, "ARG_MESSAGE", OKMessage.class) : null;
        if (oKMessage != null) {
            return oKMessage;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewPager2 fARcdN() {
        ViewPager2 viewPager2 = ((sDM) KWHzl()).copydefault;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        return viewPager2;
    }

    /* JADX INFO: renamed from: o.opg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String copydefault(@NotNull OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            java.lang.String str = "SHARED_TRANSITION_PREFIX_" + oKMessage.getSeq();
            pUU.EZpvd("IMMediaPagerActivity", "buildTransitionName: " + str);
            return str;
        }

        public final android.os.Bundle OLrzqt(@NotNull android.view.View view, @NotNull OKMessage oKMessage) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(oKMessage, "");
            try {
                Result.Application application = Result.Companion;
                android.app.Activity activityKWHzl = C35334ntP.KWHzl(view);
                java.lang.String strCopydefault = copydefault(oKMessage);
                ViewCompat.setTransitionName(view, strCopydefault);
                java.lang.Object parent = view.getParent();
                if (parent != null && (parent instanceof android.view.ViewGroup)) {
                    ViewCompat.setTransitionName((android.view.View) parent, null);
                    C35888oHk c35888oHk = parent instanceof C35888oHk ? (C35888oHk) parent : null;
                    if (c35888oHk != null) {
                        c35888oHk.setTag("transitioning");
                    }
                }
                ActivityOptionsCompat activityOptionsCompatMakeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(activityKWHzl, view, strCopydefault);
                Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeSceneTransitionAnimation, "");
                objM7377constructorimpl = Result.m7377constructorimpl(activityOptionsCompatMakeSceneTransitionAnimation.toBundle());
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return (android.os.Bundle) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKMessage, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC37218opg.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_MESSAGE", oKMessage)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC37215opd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Object objM7377constructorimpl;
        super.onCreate(bundle);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(gEmmrt());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(getTAG(), "Could not load anchor message", thM7380exceptionOrNullimpl);
            finish();
        }
        postponeEnterTransition();
        AYXKKw();
        fetchVPNInfo();
        ejfBZ();
        AuCTel();
        fJNWhG();
        AkhnZx();
    }

    @Override // o.C37228opq.ActionBar
    public void KWHzl(long j) {
        pUU.EZpvd(getTAG(), "onTransitionProxyViewReady: " + j + ", initialMessage.messageId: " + gEmmrt().getSeq());
        if (j == gEmmrt().getSeq()) {
            startPostponedEnterTransition();
        }
    }

    @Override // o.AbstractActivityC37215opd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        pUU.EZpvd(getTAG(), EopTrackEvent.ONPAUSE);
        djBIcL().OLrzqt();
        super.onPause();
    }

    @Override // o.AbstractActivityC37215opd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        pUU.EZpvd(getTAG(), "onResume");
        djBIcL().copydefault();
    }

    @Override // o.AbstractActivityC37215opd, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        pUU.EZpvd(getTAG(), "onDestroy");
        djBIcL().AEQbTJ();
        super.onDestroy();
    }

    private final void AuCTel() {
        DbNXlk();
        fARcdN().setAdapter(djBIcL());
        fARcdN().registerOnPageChangeCallback(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.opg$TaskDescription */
    public static final class TaskDescription extends ViewPager2.OnPageChangeCallback {
        public TaskDescription() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 1) {
                pUU.EZpvd(ActivityC37218opg.this.getTAG(), "onPageScrollStateChanged: DRAGGING - pausing players");
                ActivityC37218opg.this.djBIcL().KWHzl();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            pUU.EZpvd(ActivityC37218opg.this.getTAG(), "onPageSelected: position=" + i);
            ActivityC37218opg.this.djBIcL().EZpvd(i);
            ActivityC37218opg.this.valueOf().copydefault(i);
            if (i <= 5) {
                ActivityC37218opg.this.valueOf().OLrzqt();
            } else if (i >= ActivityC37218opg.this.djBIcL().getItemCount() - 6) {
                ActivityC37218opg.this.valueOf().AEQbTJ();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        ViewCompat.setOnApplyWindowInsetsListener(((sDM) KWHzl()).getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.opl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC37218opg.AEQbTJ(view, windowInsetsCompat);
            }
        });
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        insetsController.hide(WindowInsetsCompat.Type.statusBars());
        insetsController.setSystemBarsBehavior(2);
    }

    public static final WindowInsetsCompat AEQbTJ(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        ((sDM) KWHzl()).copydefault.setTransitionName(Companion.copydefault(gEmmrt()));
        pUU.EZpvd(getTAG(), "addTransitionListener: sharedElementEnterTransition exists => " + (getWindow().getSharedElementEnterTransition() != null));
        android.transition.Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
        if (sharedElementEnterTransition != null) {
            sharedElementEnterTransition.addListener(new ActionBar());
        }
    }

    /* JADX INFO: renamed from: o.opg$ActionBar */
    public static final class ActionBar implements Transition.TransitionListener {
        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(android.transition.Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(android.transition.Transition transition) {
        }

        public ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(android.transition.Transition transition) {
            pUU.EZpvd(ActivityC37218opg.this.getTAG(), "addTransitionListener: onTransitionEnd");
            ActivityC37218opg.this.valueOf().AYXKKw();
            rVN.reportFullyDrawn$default((android.app.Activity) ActivityC37218opg.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            ((sDM) ActivityC37218opg.this.KWHzl()).copydefault.setTransitionName(null);
            if (transition != null) {
                transition.removeListener(this);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(android.transition.Transition transition) {
            pUU.EZpvd(ActivityC37218opg.this.getTAG(), "addTransitionListener: onTransitionCancel");
            if (transition != null) {
                transition.removeListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: o.opg$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: o.opg$StateListAnimator$Activity */
        public static final class Activity implements StateListAnimator {
            public static final Activity EZpvd = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -344797281;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Entering";
            }

            private Activity() {
            }
        }

        /* JADX INFO: renamed from: o.opg$StateListAnimator$ActionBar */
        public static final class ActionBar implements StateListAnimator {
            public static final ActionBar EZpvd = new ActionBar();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2126901693;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Returning";
            }

            private ActionBar() {
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportFinishAfterTransition() {
        this.isConnected = StateListAnimator.ActionBar.EZpvd;
        super.supportFinishAfterTransition();
    }

    /* JADX INFO: renamed from: o.opg$Activity */
    public static final class Activity extends androidx.core.app.SharedElementCallback {
        public Activity() {
        }

        @Override // androidx.core.app.SharedElementCallback
        public void onMapSharedElements(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, android.view.View> map) {
            android.view.View viewKWHzl;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(map, "");
            if (!(ActivityC37218opg.this.isConnected instanceof StateListAnimator.ActionBar) || (viewKWHzl = ActivityC37218opg.this.djBIcL().KWHzl(ActivityC37218opg.this.fARcdN().getCurrentItem())) == null) {
                return;
            }
            map.put(list.get(0), viewKWHzl);
        }
    }

    public final void fetchVPNInfo() {
        setEnterSharedElementCallback(new Activity());
    }

    @Override // o.C37228opq.ActionBar
    public void OLrzqt(long j, boolean z) {
        valueOf().OLrzqt(j, z);
    }

    @Override // o.C37228opq.ActionBar
    public void KWHzl(long j, float f, @NotNull PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        valueOf().copydefault(j, f, pointF);
    }

    private final void fJNWhG() {
        C37721ozF.collectOnLifecycle$default(valueOf().djBIcL(), this, (Lifecycle.State) null, new IMMediaPagerActivity$initViewModel$1(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(valueOf().KWHzl(), this, (Lifecycle.State) null, new IMMediaPagerActivity$initViewModel$2(this, null), 2, (java.lang.Object) null);
        valueOf().KWHzl(gEmmrt());
    }

    public final void AkhnZx() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new IMMediaPagerActivity$trackPageEntry$1(this, null), 3, null);
    }

    @Override // o.C37228opq.ActionBar
    public void OLrzqt(boolean z, MediaType mediaType, @NotNull ResultState resultState) {
        Intrinsics.checkNotNullParameter(resultState, "");
        C37707oys.EZpvd.AEQbTJ(z, new C37710oyv(gEmmrt().getTargetId(), resultState, java.lang.String.valueOf(gEmmrt().getSentTime()), mediaType));
    }

    @Override // o.C37228opq.ActionBar
    public void copydefault(final int i) {
        C32866mlf.onEvent$default("okim_photo_download_duration", (TrackChannel[]) null, new Function1() { // from class: o.opf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37218opg.KWHzl(i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("duration", java.lang.String.valueOf(i), false);
        return Unit.INSTANCE;
    }

    @Override // o.C37228opq.ActionBar
    public void OLrzqt(@NotNull OKMessage oKMessage, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(str, "");
        valueOf().KWHzl(oKMessage, str);
    }

    private final void ejfBZ() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new Function1() { // from class: o.opk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37218opg.KWHzl(this.AEQbTJ, (OnBackPressedCallback) obj);
            }
        }, 3, null);
    }

    public static final Unit KWHzl(ActivityC37218opg activityC37218opg, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        activityC37218opg.values();
        return Unit.INSTANCE;
    }

    @Override // o.C37228opq.ActionBar
    public void values() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        valueOf().EZpvd(fARcdN().getCurrentItem());
    }

    @Override // o.C37228opq.ActionBar
    public void isConnected() {
        postDelay(new java.lang.Runnable() { // from class: o.ope
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37218opg.djBIcL(this.AEQbTJ);
            }
        }, 30L);
    }

    public static final void djBIcL(ActivityC37218opg activityC37218opg) {
        activityC37218opg.finishAfterTransition();
    }

    @Override // o.AbstractActivityC37215opd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37215opd, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
