package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.NFTAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import com.okinc.business.defi.wallet.mine.search.ui.view.AssetSearchResultFragment$initListeners$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.AssetSearchResultFragment$onAsyncViewCreated$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.SearchWalletAssetResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC18568fkp;
import o.C13754dXa;
import o.dZM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18965fsP extends AbstractC19049ftu {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public RecyclerView.OnScrollListener EZpvd;
    public C16649ens OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fta
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18965fsP.EZpvd();
        }
    });
    public final InterfaceC56387yDm gEmmrt;

    /* JADX INFO: renamed from: o.fsP$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainStatus.values().length];
            try {
                iArr[ChainStatus.REGISTERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChainStatus.REGISTERING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChainStatus.UNREGISTERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.iHkeWl;
    }

    /* JADX INFO: renamed from: o.fsP$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.AEQbTJ.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C19095fun) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(SearchWalletAssetResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.AEQbTJ.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fsP$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C19095fun) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.EZpvd.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    public C18965fsP() {
        Activity activity = new Activity(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(activity));
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchWalletAssetResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new TaskDescription(this)));
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
    }

    /* JADX INFO: renamed from: o.fsP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fsP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C18965fsP AEQbTJ(android.os.Bundle bundle) {
            C18965fsP c18965fsP = new C18965fsP();
            c18965fsP.setArguments(bundle);
            return c18965fsP;
        }
    }

    public final boolean valueOf() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_title");
        }
        return false;
    }

    public static final C19123fvO EZpvd() {
        return new C19123fvO();
    }

    /* JADX DEBUG: Possible override for method o.ftu.AEQbTJ()V */
    public final C19123fvO AEQbTJ() {
        return (C19123fvO) this.copydefault.getValue();
    }

    public final SearchWalletAssetResultViewModel gEmmrt() {
        return (SearchWalletAssetResultViewModel) this.gEmmrt.getValue();
    }

    public final WalletSearchHistoryViewModel OLrzqt() {
        return (WalletSearchHistoryViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC33042mow
    public void AEQbTJ(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.AEQbTJ(view, bundle);
        if (!isAdded()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AssetSearchResultFragment$onAsyncViewCreated$1(this, view, null), 3, null);
        } else {
            OLrzqt(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(android.view.View view) {
        final C16649ens c16649ensCopydefault = C16649ens.copydefault(view);
        this.OLrzqt = c16649ensCopydefault;
        if (c16649ensCopydefault != null) {
            android.widget.TextView textView = c16649ensCopydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(valueOf() ? 0 : 8);
            RecyclerView recyclerView = c16649ensCopydefault.OLrzqt;
            RecyclerView recyclerView2 = c16649ensCopydefault.OLrzqt;
            recyclerView.setLayoutManager(new SafeLinearLayoutManager(recyclerView2 != null ? recyclerView2.getContext() : null));
            c16649ensCopydefault.OLrzqt.setAdapter(AEQbTJ());
            c16649ensCopydefault.OLrzqt.postDelayed(new java.lang.Runnable() { // from class: o.ftg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C18965fsP.OLrzqt(this.KWHzl, c16649ensCopydefault);
                }
            }, 500L);
        }
        AkhnZx();
        isConnected();
    }

    public static final void OLrzqt(C18965fsP c18965fsP, C16649ens c16649ens) {
        RecyclerView recyclerView = c16649ens.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        FragmentActivity activity = c18965fsP.getActivity();
        if (activity == null) {
            return;
        }
        c18965fsP.EZpvd = C17779fRz.OLrzqt(recyclerView, activity);
    }

    private final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AssetSearchResultFragment$initListeners$1(this, null), 3, null);
    }

    private final void AkhnZx() {
        C19123fvO c19123fvOAEQbTJ = AEQbTJ();
        C19294fya c19294fya = new C19294fya(new Function1() { // from class: o.fsV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.AEQbTJ(this.KWHzl, (C18992fsq) obj);
            }
        });
        c19294fya.EZpvd(gEmmrt().copydefault());
        Unit unit = Unit.INSTANCE;
        c19123fvOAEQbTJ.register(C18992fsq.class, c19294fya);
        C19123fvO c19123fvOAEQbTJ2 = AEQbTJ();
        C19230fxP c19230fxP = new C19230fxP(new Function1() { // from class: o.fsW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.copydefault(this.OLrzqt, (C18978fsc) obj);
            }
        });
        c19230fxP.copydefault(gEmmrt().copydefault());
        c19123fvOAEQbTJ2.register(C18978fsc.class, c19230fxP);
        C19123fvO c19123fvOAEQbTJ3 = AEQbTJ();
        C19228fxN c19228fxN = new C19228fxN(new Function1() { // from class: o.fsY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.copydefault(this.EZpvd, (C18999fsx) obj);
            }
        });
        c19228fxN.EZpvd(gEmmrt().copydefault());
        c19123fvOAEQbTJ3.register(C18999fsx.class, c19228fxN);
        C19123fvO c19123fvOAEQbTJ4 = AEQbTJ();
        C19235fxU c19235fxU = new C19235fxU(new Function1() { // from class: o.ftb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.AEQbTJ(this.copydefault, (C18990fso) obj);
            }
        });
        c19235fxU.OLrzqt(gEmmrt().copydefault());
        c19123fvOAEQbTJ4.register(C18990fso.class, c19235fxU);
        AEQbTJ().register(java.lang.String.class, new C19233fxS());
        AEQbTJ().register(C18951fsB.class, new C19236fxV());
    }

    public static final Unit AEQbTJ(C18965fsP c18965fsP, final C18992fsq c18992fsq) {
        Intrinsics.checkNotNullParameter(c18992fsq, "");
        C32866mlf.onEvent$default("GlobalSearch_InputBox_SearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.fsX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.copydefault(c18992fsq, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (c18992fsq.ejfBZ() && c18992fsq.AEQbTJ() != EOSState.Opened) {
            ActivityC18568fkp.Activity activity = ActivityC18568fkp.Companion;
            FragmentActivity activity2 = c18965fsP.getActivity();
            if (activity2 == null) {
                return Unit.INSTANCE;
            }
            activity.AEQbTJ(activity2, (28 & 2) != 0 ? "" : c18992fsq.fetchVPNInfo(), (28 & 4) != 0 ? "" : null, (28 & 8) != 0 ? "" : null, (28 & 16) != 0 ? "" : null);
        } else if (c18992fsq.AuCTel() && c18992fsq.gEmmrt()) {
            c18965fsP.KWHzl(c18992fsq);
        } else {
            SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
            FragmentActivity activity3 = c18965fsP.getActivity();
            if (activity3 == null) {
                return Unit.INSTANCE;
            }
            searchItemNavigationHandler.copydefault(activity3, c18992fsq.AYXKKw(), c18992fsq.fetchVPNInfo());
            c18965fsP.OLrzqt().KWHzl(new TokenAssetHistory(c18992fsq.AYXKKw(), c18992fsq.AkhnZx(), c18992fsq.fetchVPNInfo(), c18992fsq.djBIcL(), c18992fsq.AkhnZx(), c18992fsq.AhwBna(), c18992fsq.values(), 0L, 128, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C18992fsq c18992fsq, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "my_assets", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_ca", c18992fsq.DbNXlk(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", c18992fsq.AkhnZx(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_network", java.lang.String.valueOf(c18992fsq.djBIcL()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C18965fsP c18965fsP, C18978fsc c18978fsc) {
        Intrinsics.checkNotNullParameter(c18978fsc, "");
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = c18965fsP.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        searchItemNavigationHandler.copydefault(activity, c18978fsc.gEmmrt(), c18978fsc.valueOf());
        c18965fsP.OLrzqt().KWHzl(new TokenAssetHistory(c18978fsc.gEmmrt(), c18978fsc.AYXKKw(), c18978fsc.valueOf(), c18978fsc.djBIcL(), c18978fsc.AYXKKw(), c18978fsc.AhwBna(), c18978fsc.KWHzl(), 0L, 128, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C18965fsP c18965fsP, final C18999fsx c18999fsx) {
        Intrinsics.checkNotNullParameter(c18999fsx, "");
        C32866mlf.onEvent$default("GlobalSearch_InputBox_SearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.fsZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.OLrzqt(c18999fsx, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (!C14687dqE.OLrzqt.AkhnZx()) {
            if (c18999fsx.copydefault().length() == 0) {
                C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcher), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return Unit.INSTANCE;
            }
            SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
            FragmentActivity activity = c18965fsP.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            searchItemNavigationHandler.EZpvd(activity, c18999fsx.djBIcL(), c18999fsx.copydefault(), java.lang.String.valueOf(c18999fsx.OLrzqt()), true);
            c18965fsP.OLrzqt().KWHzl(new NFTAssetHistory(c18999fsx.djBIcL(), c18999fsx.copydefault(), c18999fsx.EZpvd(), c18999fsx.gEmmrt(), c18999fsx.OLrzqt(), c18999fsx.copydefault(), c18999fsx.AEQbTJ(), 0L, 128, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C18999fsx c18999fsx, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "NFT", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_ca", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_network", java.lang.String.valueOf(c18999fsx.OLrzqt()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C18965fsP c18965fsP, final C18990fso c18990fso) {
        Intrinsics.checkNotNullParameter(c18990fso, "");
        C32866mlf.onEvent$default("GlobalSearch_InputBox_SearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.ftd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.copydefault(c18990fso, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (!C14687dqE.OLrzqt.isConnected()) {
            SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
            FragmentActivity activity = c18965fsP.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            long jValueOf = c18990fso.valueOf();
            searchItemNavigationHandler.copydefault(activity, java.lang.Long.valueOf(jValueOf), c18990fso.copydefault());
            c18965fsP.OLrzqt().KWHzl(new DeFiAssetHistory(c18990fso.valueOf(), c18990fso.gEmmrt(), c18990fso.EZpvd(), c18990fso.AYXKKw(), c18990fso.copydefault(), c18990fso.gEmmrt(), c18990fso.AEQbTJ(), (java.lang.String) null, 0L, 256, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C18990fso c18990fso, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "defi", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_ca", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_network", java.lang.String.valueOf(c18990fso.copydefault()), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final C18992fsq c18992fsq) {
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(ChainStatusChecker.OLrzqt.OLrzqt(c18992fsq.OLrzqt(), c18992fsq.isConnected(), c18992fsq.DbNXlk(), C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER)), this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.ftf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.KWHzl(this.AEQbTJ, c18992fsq, (ChainStatus) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fsT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18965fsP.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fsS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18965fsP.EZpvd(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fsU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18965fsP.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        addDisposable(interfaceC58217yxCAEQbTJ);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C18965fsP c18965fsP, C18992fsq c18992fsq, ChainStatus chainStatus) {
        int i = chainStatus == null ? -1 : StateListAnimator.EZpvd[chainStatus.ordinal()];
        if (i == 1) {
            SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
            FragmentActivity activity = c18965fsP.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            searchItemNavigationHandler.copydefault(activity, c18992fsq.AYXKKw(), c18992fsq.fetchVPNInfo());
            c18965fsP.OLrzqt().KWHzl(new TokenAssetHistory(c18992fsq.AYXKKw(), c18992fsq.AkhnZx(), c18992fsq.fetchVPNInfo(), c18992fsq.djBIcL(), c18992fsq.AkhnZx(), c18992fsq.AhwBna(), c18992fsq.values(), 0L, 128, (DefaultConstructorMarker) null));
        } else if (i == 2) {
            C14083dek.OLrzqt.KWHzl();
        } else if (i == 3) {
            C14083dek c14083dek = C14083dek.OLrzqt;
            android.content.Context context = c18965fsP.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            androidx.fragment.app.FragmentManager childFragmentManager = c18965fsP.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C14083dek.handleUnregisteredStatus$default(c14083dek, context, childFragmentManager, c18992fsq.fetchVPNInfo(), c18992fsq.OLrzqt(), null, 16, null);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C18965fsP c18965fsP, java.lang.Throwable th) {
        c18965fsP.dismissLoading();
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C16649ens c16649ens;
        RecyclerView recyclerView;
        super.onDestroyView();
        RecyclerView.OnScrollListener onScrollListener = this.EZpvd;
        if (onScrollListener != null && (c16649ens = this.OLrzqt) != null && (recyclerView = c16649ens.OLrzqt) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.EZpvd = null;
        this.OLrzqt = null;
    }
}
