package o;

import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.social_trade_api.data.MarketplaceBannerType;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradingbot.impl.market_place.MarketPlaceFragment$addHeaderInfoObserver$3;
import com.okinc.tradingbot.impl.market_place.MarketPlaceFragment$initListener$2$1;
import com.okinc.tradingbot.impl.market_place.MarketPlacePresenter;
import com.okinc.tradingbot.impl.market_place.home.list.BotSquareType;
import com.okinc.tradingbot.impl.market_place.home.presenter.MarketPlaceHomeHeaderPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.unify_trade.biz.BotRouteData;
import com.okinc.unify_trade.biz.BotUserSummaryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C52755wXd;
import o.C55688xof;
import o.C56058xve;
import o.InterfaceC43294rma;
import o.InterfaceC49320umN;
import o.InterfaceC49436uoX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vfZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51042vfZ extends AbstractC54505xKx<uPV, MarketPlacePresenter> implements InterfaceC49436uoX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public java.lang.String OLrzqt;
    public InterfaceC49321umO copydefault;
    public C47976uAj<C51529voj> gEmmrt;
    public final int KWHzl = C48033uCm.Activity.QXDzTk;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vgr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51042vfZ.AkhnZx(this.AEQbTJ));
        }
    });

    /* JADX INFO: renamed from: o.vfZ$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.vfZ$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketplaceBannerType.values().length];
            try {
                iArr[MarketplaceBannerType.Voucher.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.vfZ$TaskDescription */
    public static final class TaskDescription extends AppBarLayout.Behavior.DragCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public boolean canDrag(AppBarLayout appBarLayout) {
            Intrinsics.checkNotNullParameter(appBarLayout, "");
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public static final /* synthetic */ uPV AhwBna(C51042vfZ c51042vfZ) {
        return c51042vfZ.gGvvIC();
    }

    @Override // o.InterfaceC49436uoX
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2) {
        InterfaceC49436uoX.TaskDescription.AEQbTJ(this, str, str2, str3, str4, z, z2);
    }

    @Override // o.InterfaceC49436uoX
    public androidx.fragment.app.FragmentManager copydefault() {
        return InterfaceC49436uoX.TaskDescription.KWHzl(this);
    }

    public C51042vfZ() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketPlaceHomeHeaderPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.MarketPlaceFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.MarketPlaceFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.MarketPlaceFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketPlaceHomeHeaderPresenter valueOf() {
        return (MarketPlaceHomeHeaderPresenter) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC54505xKx
    public java.util.List<MarketPlaceHomeHeaderPresenter> bu_() {
        return C56402yEa.EZpvd(valueOf());
    }

    /* JADX INFO: renamed from: o.vfZ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vfZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C51042vfZ newInstance$default(Application application, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                z3 = false;
            }
            return application.EZpvd(z, z2, z3);
        }

        public final C51042vfZ EZpvd(boolean z, boolean z2, boolean z3) {
            C51042vfZ c51042vfZ = new C51042vfZ();
            c51042vfZ.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_is_mp_show_title", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("ShowOnShoreToolbar", java.lang.Boolean.valueOf(z2)), C56390yDp.OLrzqt("HIDE_TOP_BAR", java.lang.Boolean.valueOf(z3))));
            return c51042vfZ;
        }
    }

    private final boolean gEmmrt() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean AkhnZx(C51042vfZ c51042vfZ) {
        android.os.Bundle arguments = c51042vfZ.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("HIDE_TOP_BAR");
        }
        return false;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        dxcTrN().copydefault(this);
        dxcTrN().copydefault(getOkQPL());
        MarketPlacePresenter marketPlacePresenterDxcTrN = dxcTrN();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        marketPlacePresenterDxcTrN.KWHzl(contextRequireContext);
        dxcTrN().AEQbTJ(view);
        gGvvIC().AkhnZx.AhwBna(false);
        values();
        AkhnZx();
        djBIcL();
        fetchVPNInfo();
        fARcdN();
        AYXKKw();
        if (gEmmrt()) {
            gGvvIC().values.KWHzl();
        } else {
            C52688wUr.copydefault.KWHzl(view);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().KWHzl();
        if (this.OLrzqt == null) {
            C56058xve.Activity activityEZpvd = C56058xve.Companion.copydefault().EZpvd();
            this.OLrzqt = activityEZpvd != null ? activityEZpvd.copydefault() : null;
        }
    }

    @Override // o.AbstractC54505xKx
    public void uzCIH() {
        super.uzCIH();
        C32866mlf.onEvent$default("TradingBot_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.vfX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        dxcTrN().copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        dxcTrN().OLrzqt();
    }

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        java.lang.String str = this.OLrzqt;
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
    }

    @Override // o.InterfaceC49436uoX
    public android.view.View AEQbTJ() {
        return fZBcTu();
    }

    private final void djBIcL() {
        gGvvIC().OLrzqt.post(new java.lang.Runnable() { // from class: o.vgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C51042vfZ.DbNXlk(this.OLrzqt);
            }
        });
        gGvvIC().OLrzqt.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: o.vgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                C51042vfZ.AEQbTJ(this.AEQbTJ, appBarLayout, i);
            }
        });
        gGvvIC().values.setTitleLayoutClickCallback(new Function0() { // from class: o.vgc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51042vfZ.valueOf(this.EZpvd);
            }
        });
    }

    public static final void DbNXlk(C51042vfZ c51042vfZ) {
        ViewGroup.LayoutParams layoutParams = c51042vfZ.gGvvIC().OLrzqt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        Intrinsics.copydefault(behavior, "");
        ((AppBarLayout.Behavior) behavior).setDragCallback(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.vfZ$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C51042vfZ AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C51042vfZ c51042vfZ) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c51042vfZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C53274wiR.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.QVMIlx), yDY.copydefault(new ExplainItemModel("", C33070mpX.AYXKKw(C55688xof.Application.compare)), new ExplainItemModel("", C33070mpX.AYXKKw(C55688xof.Application.DDDCac)))).show(this.AEQbTJ.getChildFragmentManager(), C56524yIo.AEQbTJ(C51042vfZ.class).valueOf());
                C32866mlf.onEvent$default("TradingBot_Full_Button_Click", (TrackChannel[]) null, Fragment.KWHzl, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void AEQbTJ(C51042vfZ c51042vfZ, AppBarLayout appBarLayout, int i) {
        if (java.lang.Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            C55254xgV c55254xgV = c51042vfZ.gGvvIC().AhwBna;
            if (c55254xgV.copydefault().getTabCount() <= 1) {
                return;
            }
            int iAEQbTJ = c55254xgV.AEQbTJ();
            TabLayout.Tab tabCopydefault = c55254xgV.copydefault(iAEQbTJ);
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(tabCopydefault != null ? tabCopydefault.getText() : null);
            C51623vqX c51623vqX = c51042vfZ.gGvvIC().values;
            java.lang.CharSequence charSequenceOLrzqt = strGEmmrt;
            if (iAEQbTJ == BotSquareType.SIGNAL.ordinal()) {
                charSequenceOLrzqt = c51042vfZ.dxcTrN().OLrzqt(strGEmmrt);
            }
            c51623vqX.setTitle(charSequenceOLrzqt);
            c51623vqX.OLrzqt(true);
            return;
        }
        C51623vqX c51623vqX2 = c51042vfZ.gGvvIC().values;
        c51623vqX2.setTitle(C33070mpX.AYXKKw(C55688xof.Application.NavigationRes));
        c51623vqX2.OLrzqt(false);
    }

    /* JADX INFO: renamed from: o.vfZ$ActionBar */
    public static final class ActionBar extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ C51042vfZ EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        public ActionBar(android.view.View view, C51042vfZ c51042vfZ) {
            this.copydefault = view;
            this.EZpvd = c51042vfZ;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            C51042vfZ.AhwBna(this.EZpvd).OLrzqt.setExpanded(true);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            this.copydefault.performClick();
            return true;
        }
    }

    public static final Unit valueOf(final C51042vfZ c51042vfZ) {
        c51042vfZ.gGvvIC().values.setTitleFilterStatus(true);
        C52755wXd.Application application = C52755wXd.Companion;
        java.util.List<C55276xgr> listEZpvd = c51042vfZ.dxcTrN().EZpvd(c51042vfZ.gGvvIC().AhwBna.AEQbTJ());
        androidx.fragment.app.FragmentManager childFragmentManager = c51042vfZ.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        application.AEQbTJ(listEZpvd, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : new Function0() { // from class: o.vgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51042vfZ.values(this.EZpvd);
            }
        }, new Function1() { // from class: o.vge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.copydefault(this.AEQbTJ, (C55276xgr) obj);
            }
        }, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit values(C51042vfZ c51042vfZ) {
        c51042vfZ.gGvvIC().values.setTitleFilterStatus(false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51042vfZ c51042vfZ, C55276xgr c55276xgr) {
        TabLayout.Tab tabCopydefault;
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        BotSquareType botSquareType = objOLrzqt instanceof BotSquareType ? (BotSquareType) objOLrzqt : null;
        if (botSquareType != null && (tabCopydefault = c51042vfZ.gGvvIC().AhwBna.copydefault(botSquareType.ordinal())) != null) {
            tabCopydefault.select();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vfZ$Activity */
    public static final class Activity implements View.OnTouchListener {
        public final /* synthetic */ GestureDetectorCompat OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(GestureDetectorCompat gestureDetectorCompat) {
            this.OLrzqt = gestureDetectorCompat;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            this.OLrzqt.onTouchEvent(motionEvent);
            return true;
        }
    }

    private final void values() {
        android.os.Bundle arguments = getArguments();
        boolean z = arguments != null && arguments.getBoolean("bot_is_mp_show_title");
        android.os.Bundle arguments2 = getArguments();
        boolean z2 = arguments2 != null && arguments2.getBoolean("ShowOnShoreToolbar");
        C51623vqX c51623vqX = gGvvIC().values;
        Intrinsics.checkNotNullExpressionValue(c51623vqX, "");
        c51623vqX.setVisibility((!z || z2) ? 8 : 0);
        boolean z3 = z && z2;
        C33537myN c33537myN = gGvvIC().djBIcL;
        Intrinsics.checkNotNullExpressionValue(c33537myN, "");
        c33537myN.setVisibility(z3 ? 0 : 8);
        if (z3) {
            gGvvIC().djBIcL.setTitleTypeface("harmony_sans_bold.ttf");
        }
        isConnected();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: o.umO */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC49321umO interfaceC49321umOAEQbTJ = interfaceC49317umK.AEQbTJ(contextRequireContext, new Function2() { // from class: o.vga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51042vfZ.OLrzqt((InterfaceC49320umN) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.vgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51042vfZ.KWHzl(this.OLrzqt, (InterfaceC49320umN) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, new Function2() { // from class: o.vgp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51042vfZ.copydefault(this.copydefault, (InterfaceC49320umN) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, 16.0f, 16.0f, false);
        if (interfaceC49321umOAEQbTJ != 0) {
            android.view.View view = interfaceC49321umOAEQbTJ instanceof android.view.View ? (android.view.View) interfaceC49321umOAEQbTJ : null;
            if (view == null) {
                return;
            }
            this.copydefault = interfaceC49321umOAEQbTJ;
            gGvvIC().gEmmrt.addView(view);
        }
    }

    public static final Unit OLrzqt(InterfaceC49320umN interfaceC49320umN, int i) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(i));
        java.lang.String strEZpvd = interfaceC49320umN != null ? interfaceC49320umN.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        c55867xrz.AYXKKw(strGEmmrt, strEZpvd);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51042vfZ c51042vfZ, InterfaceC49320umN interfaceC49320umN, int i) {
        Intrinsics.checkNotNullParameter(interfaceC49320umN, "");
        c51042vfZ.KWHzl(interfaceC49320umN);
        C55867xrz.KWHzl.OLrzqt(i, interfaceC49320umN.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51042vfZ c51042vfZ, InterfaceC49320umN interfaceC49320umN, int i) {
        Intrinsics.checkNotNullParameter(interfaceC49320umN, "");
        c51042vfZ.OLrzqt(interfaceC49320umN);
        C55867xrz.KWHzl.OLrzqt(i, interfaceC49320umN.EZpvd());
        return Unit.INSTANCE;
    }

    private final void OLrzqt(InterfaceC49320umN interfaceC49320umN) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, interfaceC49320umN.KWHzl(), null, new Function1() { // from class: o.vgb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    private final void KWHzl(InterfaceC49320umN interfaceC49320umN) {
        if (StateListAnimator.KWHzl[interfaceC49320umN.AEQbTJ().ordinal()] == 1) {
            final InterfaceC49320umN.StateListAnimator stateListAnimator = interfaceC49320umN instanceof InterfaceC49320umN.StateListAnimator ? (InterfaceC49320umN.StateListAnimator) interfaceC49320umN : null;
            if (stateListAnimator == null) {
                return;
            }
            if (stateListAnimator.AYXKKw()) {
                C52659wTp.copydefault.EZpvd(getContext());
                return;
            }
            if (stateListAnimator.copydefault()) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, stateListAnimator.KWHzl(), null, new Function1() { // from class: o.vgu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C51042vfZ.OLrzqt((AbstractC43238rlX) obj);
                        }
                    }, 4, null);
                    return;
                }
                return;
            }
            final FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                C51010veu.OLrzqt.OLrzqt(activity2, new Function0() { // from class: o.vgx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C51042vfZ.AEQbTJ(this.KWHzl, stateListAnimator, activity2);
                    }
                });
            }
        }
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51042vfZ c51042vfZ, final InterfaceC49320umN.StateListAnimator stateListAnimator, final FragmentActivity fragmentActivity) {
        c51042vfZ.valueOf().OLrzqt(stateListAnimator.OLrzqt(), new Function1() { // from class: o.vgs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.AEQbTJ(fragmentActivity, stateListAnimator, (ResponseData) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(FragmentActivity fragmentActivity, InterfaceC49320umN.StateListAnimator stateListAnimator, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.VisibleForTestingCompanion), 0, 1, (java.lang.Object) null);
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), fragmentActivity, stateListAnimator.KWHzl(), null, new Function1() { // from class: o.vgq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51042vfZ.djBIcL((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else {
            C55326xho.copydefault(responseData.getMsg(), 1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        ConstraintLayout constraintLayout = gGvvIC().isConnected;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        wPQ.AEQbTJ(constraintLayout, 0, C56071xvr.gEmmrt.fIwbmz());
        gGvvIC().AhwBna.setStyle(6);
        final java.util.List<C51529voj> listFARcdN = dxcTrN().fARcdN();
        if (listFARcdN.size() == 1) {
            gGvvIC().AhwBna.copydefault().setTabMode(0);
            gGvvIC().AhwBna.copydefault().setTabGravity(2);
        }
        this.gEmmrt = new C47976uAj<>(this, listFARcdN, null, 4, null);
        gGvvIC().fJNWhG.setAdapter(this.gEmmrt);
        gGvvIC().fJNWhG.setUserInputEnabled(false);
        new TabLayoutMediator(gGvvIC().AhwBna.copydefault(), gGvvIC().fJNWhG, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C51042vfZ.KWHzl(listFARcdN, this, tab, i);
            }
        }).attach();
        gGvvIC().AhwBna.copydefault().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Dialog());
        android.view.View childAt = gGvvIC().fJNWhG.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(listFARcdN.size() != 1 ? 1 : 2);
        }
        OLrzqt();
        KWHzl();
    }

    public static final void KWHzl(java.util.List list, C51042vfZ c51042vfZ, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setTag(((C51529voj) list.get(i)).EZpvd());
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(((C51529voj) list.get(i)).EZpvd().getTitle());
        java.lang.CharSequence charSequenceOLrzqt = strAYXKKw;
        if (i == list.size() - 1) {
            charSequenceOLrzqt = c51042vfZ.dxcTrN().OLrzqt(strAYXKKw);
        }
        tab.setText(charSequenceOLrzqt);
    }

    /* JADX INFO: renamed from: o.vfZ$Dialog */
    public static final class Dialog implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Dialog() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String str;
            C51042vfZ.this.OLrzqt();
            java.lang.Object tag = tab != null ? tab.getTag() : null;
            if (tag == BotSquareType.BOT) {
                str = "bot_marketplace";
            } else if (tag == BotSquareType.SIGNAL) {
                str = "signal_marketplace";
            } else {
                str = tag == BotSquareType.NMP_BOT ? "selected" : "";
            }
            C55867xrz.KWHzl.EZpvd(str);
        }
    }

    public final void OLrzqt() {
        uPV upvGGvvIC = gGvvIC();
        C55254xgV c55254xgV = upvGGvvIC.AhwBna;
        TabLayout.Tab tabCopydefault = c55254xgV.copydefault(c55254xgV.AEQbTJ());
        java.lang.Object tag = tabCopydefault != null ? tabCopydefault.getTag() : null;
        android.widget.ImageView imageView = upvGGvvIC.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(tag == BotSquareType.BOT ? 0 : 8);
    }

    public final void KWHzl() {
        getChildFragmentManager().addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: o.vgo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
                C51042vfZ.OLrzqt(this.OLrzqt, fragmentManager, fragment);
            }
        });
    }

    public static final void OLrzqt(C51042vfZ c51042vfZ, androidx.fragment.app.FragmentManager fragmentManager, final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        C55254xgV c55254xgV = c51042vfZ.gGvvIC().AhwBna;
        TabLayout.Tab tabCopydefault = c55254xgV.copydefault(c55254xgV.AEQbTJ());
        if ((tabCopydefault != null ? tabCopydefault.getTag() : null) == BotSquareType.NMP_BOT) {
            fragment.getViewLifecycleOwnerLiveData().observe(c51042vfZ.getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.vgn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51042vfZ.KWHzl(fragment, (LifecycleOwner) obj);
                }
            }));
        }
    }

    public static final Unit KWHzl(androidx.fragment.app.Fragment fragment, LifecycleOwner lifecycleOwner) {
        android.view.View view;
        Lifecycle lifecycle;
        if (((lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.INITIALIZED && (view = fragment.getView()) != null) {
            wPQ.OLrzqt(view, C56071xvr.gEmmrt.fJNWhG());
        }
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        C51623vqX c51623vqX = gGvvIC().values;
        c51623vqX.setOnTouchListener(new Activity(new GestureDetectorCompat(c51623vqX.getContext(), new ActionBar(c51623vqX, this))));
        gGvvIC().AkhnZx.OLrzqt(new InterfaceC57903yrG() { // from class: o.vgj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C51042vfZ.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
        android.widget.ImageView imageView = gGvvIC().fetchVPNInfo;
        imageView.setOnClickListener(new FragmentManager(imageView, 1000L, this));
    }

    public static final void copydefault(C51042vfZ c51042vfZ, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        BuildersKt__Builders_commonKt.launch$default(c51042vfZ, null, null, new MarketPlaceFragment$initListener$2$1(c51042vfZ, null), 3, null);
    }

    /* JADX INFO: renamed from: o.vfZ$Fragment */
    public static final class Fragment implements Function1<EventParamsList, Unit> {
        public static final Fragment KWHzl = new Fragment();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "tooltip", false, 4, null);
        }
    }

    private final void fARcdN() {
        C56111xwe<BotRouteData> c56111xweAkhnZx = dxcTrN().AkhnZx();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweAkhnZx.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.EZpvd(this.OLrzqt, (BotRouteData) obj);
            }
        }));
        C56126xwt<kotlin.Pair<java.lang.Boolean, ParamBuilder>> c56126xwtIsConnected = dxcTrN().fetchVPNInfo().isConnected();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56126xwtIsConnected.AEQbTJ(viewLifecycleOwner2, new Function1() { // from class: o.vgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.copydefault(this.AEQbTJ, (kotlin.Pair) obj);
            }
        });
        C56111xwe<java.lang.String> c56111xweValues = dxcTrN().fetchVPNInfo().values();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweValues.observe(viewLifecycleOwner3, new PendingIntent(new Function1() { // from class: o.vgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        }));
        C56126xwt<java.lang.String> c56126xwtDbNXlk = finit().DbNXlk();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56126xwtDbNXlk.AEQbTJ(viewLifecycleOwner4, new Function1() { // from class: o.vgm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(C51042vfZ c51042vfZ, BotRouteData botRouteData) {
        Intrinsics.checkNotNullParameter(botRouteData, "");
        android.content.Context context = c51042vfZ.getContext();
        if (context != null) {
            C51001vel.copydefault.copydefault(context, botRouteData.getPath(), botRouteData.getBundle());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51042vfZ c51042vfZ, kotlin.Pair pair) {
        java.lang.String strAYXKKw;
        android.os.Bundle bundle;
        Intrinsics.checkNotNullParameter(pair, "");
        c51042vfZ.dxcTrN().AhwBna();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c51042vfZ.gGvvIC().KWHzl.OLrzqt();
            MarketPlaceHomeHeaderPresenter.fetchHeaderInfo$default(c51042vfZ.valueOf(), false, false, 2, null);
            c51042vfZ.dxcTrN().AEQbTJ();
        } else {
            MarketPlacePresenter marketPlacePresenterDxcTrN = c51042vfZ.dxcTrN();
            ParamBuilder paramBuilder = (ParamBuilder) pair.getSecond();
            if (paramBuilder == null || (bundle = paramBuilder.getBundle()) == null || (strAYXKKw = bundle.getString("errorMgs")) == null) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
            }
            marketPlacePresenterDxcTrN.KWHzl(strAYXKKw);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [434=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit AEQbTJ(C51042vfZ c51042vfZ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd(c51042vfZ.getTAG(), "initLoadingType change to " + str);
        switch (str.hashCode()) {
            case -1931790399:
                if (str.equals("PULL_END")) {
                    c51042vfZ.finit().DbNXlk().KWHzl("PULL_END");
                    c51042vfZ.gGvvIC().AkhnZx.AEQbTJ();
                }
                break;
            case -1515828795:
                if (str.equals("DISMISS_INIT")) {
                    c51042vfZ.dxcTrN().valueOf();
                    c51042vfZ.EZpvd();
                }
                break;
            case -1011593784:
                if (str.equals("PULL_START")) {
                    c51042vfZ.finit().DbNXlk().KWHzl("PULL_START");
                }
                break;
            case 912496914:
                if (str.equals("SHOW_INIT")) {
                    c51042vfZ.dxcTrN().iwGUEr();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51042vfZ c51042vfZ, java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PULL_START") && c51042vfZ.gGvvIC().fJNWhG.getCurrentItem() == BotSquareType.NMP_BOT.ordinal()) {
            c51042vfZ.dxcTrN().ejfBZ().gEmmrt();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd() {
        BotSquareType botSquareType;
        java.lang.String value = dxcTrN().fJNWhG().getValue();
        if (value != null) {
            switch (value.hashCode()) {
                case 49:
                    botSquareType = !value.equals("1") ? null : BotSquareType.BOT;
                    break;
                case 50:
                    if (value.equals("2")) {
                        botSquareType = BotSquareType.SIGNAL;
                        break;
                    }
                    break;
                case 51:
                    if (value.equals("3")) {
                        botSquareType = BotSquareType.NMP_BOT;
                        break;
                    }
                    break;
            }
        }
        if (botSquareType != null) {
            TabLayout.Tab tabCopydefault = gGvvIC().AhwBna.copydefault(botSquareType.ordinal());
            if (tabCopydefault != null) {
                tabCopydefault.select();
            }
            gGvvIC().OLrzqt.setExpanded(false);
        }
    }

    private final void AYXKKw() {
        TradeLiveData<BotUserSummaryData> tradeLiveDataGEmmrt = valueOf().gEmmrt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataGEmmrt.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.OLrzqt(this.OLrzqt, (BotUserSummaryData) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = valueOf().djBIcL().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.vgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51042vfZ.AEQbTJ(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new MarketPlaceFragment$addHeaderInfoObserver$3(this, null), 3, null);
    }

    public static final Unit OLrzqt(C51042vfZ c51042vfZ, BotUserSummaryData botUserSummaryData) {
        C51625vqZ c51625vqZ = c51042vfZ.gGvvIC().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c51625vqZ, "");
        c51625vqZ.setVisibility(botUserSummaryData != null ? 0 : 8);
        if (botUserSummaryData != null) {
            c51042vfZ.gGvvIC().DbNXlk.KWHzl(botUserSummaryData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51042vfZ c51042vfZ, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51042vfZ.gGvvIC().DbNXlk.KWHzl(new BotUserSummaryData(null, null, null, null, 0, null, 0, null, 0, null, null, false, 0, null, 16383, null));
        return Unit.INSTANCE;
    }
}
