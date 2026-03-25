package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenSearchHistory;
import com.okinc.business.defi.wallet.mine.search.domain.type.SearchSortType;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$2;
import com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$3;
import com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$addDataListener$4;
import com.okinc.business.defi.wallet.mine.search.ui.view.TokenSearchResultFragment$openChainSelectionBottomSheet$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.TokenSearchResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchAllResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.dZM;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ftJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19012ftJ extends AbstractC19047fts {
    public long AYXKKw;
    public C19133fvY AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public C17180ext djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public RecyclerView.OnScrollListener valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;
    public java.lang.String gEmmrt = "";
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.ftP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19012ftJ.djBIcL(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DDjgSw;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.ftJ$FragmentManager */
    public static final class FragmentManager implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.OLrzqt.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.OLrzqt.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.ftJ$PendingIntent */
    public static final class PendingIntent implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.KWHzl.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.KWHzl.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.ftJ$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.KWHzl.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(TokenSearchResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.KWHzl.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    public C19012ftJ() {
        TaskDescription taskDescription = new TaskDescription(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(taskDescription));
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TokenSearchResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new FragmentManager(this)));
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new PendingIntent(this)));
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
        this.AYXKKw = Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: o.ftJ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ftJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C19012ftJ EZpvd(android.os.Bundle bundle) {
            C19012ftJ c19012ftJ = new C19012ftJ();
            c19012ftJ.setArguments(bundle);
            return c19012ftJ;
        }
    }

    private final boolean djBIcL() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_title");
        }
        return false;
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.values.getValue();
    }

    public static final java.lang.String djBIcL(C19012ftJ c19012ftJ) {
        android.os.Bundle arguments = c19012ftJ.getArguments();
        if (arguments != null) {
            return arguments.getString("arg_source");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenSearchResultViewModel isConnected() {
        return (TokenSearchResultViewModel) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletSearchAllResultViewModel values() {
        return (WalletSearchAllResultViewModel) this.isConnected.getValue();
    }

    private final WalletSearchHistoryViewModel AhwBna() {
        return (WalletSearchHistoryViewModel) this.fetchVPNInfo.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.djBIcL = C17180ext.EZpvd(view);
        DbNXlk();
        AEQbTJ();
        fetchVPNInfo();
        gEmmrt();
    }

    private final void DbNXlk() {
        final C17180ext c17180ext = this.djBIcL;
        if (c17180ext != null) {
            android.widget.TextView textView = c17180ext.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(djBIcL() ? 0 : 8);
            C54989xbV c54989xbV = c17180ext.EZpvd;
            int color = ContextCompat.getColor(c54989xbV.getContext(), C52761wXj.Activity.fdOvFl);
            c54989xbV.EZpvd().setTextColor(color);
            ImageViewCompat.setImageTintList(c54989xbV.OLrzqt(), android.content.res.ColorStateList.valueOf(color));
            C54989xbV c54989xbV2 = c17180ext.OLrzqt;
            int color2 = ContextCompat.getColor(c54989xbV2.getContext(), C52761wXj.Activity.fdOvFl);
            c54989xbV2.EZpvd().setTextColor(color2);
            ImageViewCompat.setImageTintList(c54989xbV2.OLrzqt(), android.content.res.ColorStateList.valueOf(color2));
            c54989xbV2.EZpvd().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Rcolor));
            RecyclerView recyclerView = c17180ext.djBIcL;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            final android.content.Context context = getContext();
            if (context != null) {
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C19133fvY c19133fvY = new C19133fvY(context, childFragmentManager, new Function1() { // from class: o.ftM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C19012ftJ.EZpvd(this.AEQbTJ, (C18982fsg) obj);
                    }
                }, new Function1() { // from class: o.ftO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C19012ftJ.AEQbTJ(this.AEQbTJ, (C18982fsg) obj);
                    }
                }, new Function1() { // from class: o.ftS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C19012ftJ.EZpvd((java.lang.String) obj);
                    }
                }, new Function1() { // from class: o.ftU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C19012ftJ.AEQbTJ(context, (TagEventProperty) obj);
                    }
                });
                this.AkhnZx = c19133fvY;
                c17180ext.djBIcL.setAdapter(c19133fvY);
                c17180ext.djBIcL.postDelayed(new java.lang.Runnable() { // from class: o.ftT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19012ftJ.KWHzl(this.KWHzl, c17180ext);
                    }
                }, 500L);
            }
        }
    }

    public static final Unit EZpvd(C19012ftJ c19012ftJ, final C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        C32866mlf.onEvent$default("GlobalSearch_InputBox_SearchResult_Click", (TrackChannel[]) null, new Function1() { // from class: o.ftQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19012ftJ.KWHzl(c18982fsg, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c19012ftJ.AEQbTJ(c18982fsg);
        c19012ftJ.isConnected().copydefault(c18982fsg.copydefault().OLrzqt(), c18982fsg.copydefault().fetchVPNInfo());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C18982fsg c18982fsg, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_ca", c18982fsg.copydefault().fetchVPNInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", c18982fsg.copydefault().isConnected(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_network", java.lang.String.valueOf(c18982fsg.copydefault().OLrzqt()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C19012ftJ c19012ftJ, C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        c19012ftJ.OLrzqt(c18982fsg.copydefault());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.content.Context context, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(tagEventProperty, "");
        C18956fsG.EZpvd(tagEventProperty, context);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C19012ftJ c19012ftJ, C17180ext c17180ext) {
        RecyclerView recyclerView = c17180ext.djBIcL;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        FragmentActivity activity = c19012ftJ.getActivity();
        if (activity == null) {
            return;
        }
        c19012ftJ.valueOf = C17779fRz.OLrzqt(recyclerView, activity);
    }

    public final void OLrzqt(C18988fsm c18988fsm) {
        TokenBase tokenBase = new TokenBase(C33129mqd.gEmmrt(java.lang.Long.valueOf(c18988fsm.OLrzqt())), c18988fsm.fetchVPNInfo(), c18988fsm.DbNXlk(), c18988fsm.AEQbTJ(), null, c18988fsm.isConnected(), c18988fsm.AkhnZx(), 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -112, null);
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gKO.StateListAnimator.openMemeQuickTransaction$default(gko, childFragmentManager, "wallet_trade", tokenBase, 0, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        OLrzqt(c18988fsm, c18988fsm.AYXKKw() ? java.lang.Boolean.TRUE : null);
    }

    /* JADX INFO: renamed from: o.ftJ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C19012ftJ EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19012ftJ c19012ftJ) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c19012ftJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C19206fws.Companion.copydefault(this.EZpvd.isConnected().EZpvd().getValue(), this.EZpvd.new StateListAnimator()).show(this.EZpvd.getChildFragmentManager(), "WalletSearchSortBottomSheet");
            }
        }
    }

    /* JADX INFO: renamed from: o.ftJ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C19012ftJ EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19012ftJ c19012ftJ) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c19012ftJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AYXKKw();
            }
        }
    }

    public final void AEQbTJ() {
        C54989xbV c54989xbV;
        C17180ext c17180ext = this.djBIcL;
        if (c17180ext == null || (c54989xbV = c17180ext.EZpvd) == null) {
            return;
        }
        c54989xbV.EZpvd().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setSupportActionBar));
        c54989xbV.AEQbTJ().setImageResource(C52761wXj.TaskDescription.createSocket);
        c54989xbV.setOnClickListener(new Application(c54989xbV, 1000L, this));
    }

    /* JADX INFO: renamed from: o.ftJ$StateListAnimator */
    public static final class StateListAnimator implements Function1<SearchSortType, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(SearchSortType searchSortType) {
            OLrzqt(searchSortType);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(SearchSortType searchSortType) {
            Intrinsics.checkNotNullParameter(searchSortType, "");
            C19012ftJ.this.isConnected().OLrzqt(searchSortType);
        }
    }

    private final void fetchVPNInfo() {
        C54989xbV c54989xbV;
        C17180ext c17180ext = this.djBIcL;
        if (c17180ext == null || (c54989xbV = c17180ext.OLrzqt) == null) {
            return;
        }
        c54989xbV.setOnClickListener(new ActionBar(c54989xbV, 1000L, this));
    }

    private final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenSearchResultFragment$addDataListener$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenSearchResultFragment$addDataListener$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenSearchResultFragment$addDataListener$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenSearchResultFragment$addDataListener$4(this, null), 3, null);
    }

    public final void AEQbTJ(C18982fsg c18982fsg) {
        AhwBna().KWHzl(new TokenSearchHistory(c18982fsg.copydefault().isConnected(), c18982fsg.copydefault().AkhnZx(), c18982fsg.copydefault().OLrzqt(), c18982fsg.copydefault().fetchVPNInfo(), c18982fsg.copydefault().DbNXlk(), c18982fsg.copydefault().AEQbTJ(), C59449zhJ.gEmmrt(c18982fsg.copydefault().fetchVPNInfo(), this.gEmmrt, true), 0L, 128, (DefaultConstructorMarker) null));
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        searchItemNavigationHandler.EZpvd(activity, c18982fsg.copydefault().OLrzqt(), c18982fsg.copydefault().fetchVPNInfo(), c18982fsg.copydefault().isConnected());
        OLrzqt(c18982fsg.copydefault(), c18982fsg.copydefault().AYXKKw() ? java.lang.Boolean.FALSE : null);
    }

    public final void OLrzqt(final C18988fsm c18988fsm, final java.lang.Boolean bool) {
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_Click", (TrackChannel[]) null, new Function1() { // from class: o.ftN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19012ftJ.OLrzqt(this.OLrzqt, c18988fsm, bool, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C19012ftJ c19012ftJ, C18988fsm c18988fsm, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c19012ftJ.gEmmrt, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_TokenCA", c18988fsm.fetchVPNInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_TokenChainid", java.lang.String.valueOf(c18988fsm.OLrzqt()), false, 4, null);
        if (bool != null) {
            EventParamsList.put$default(eventParamsList, "clicked_quickTrade", java.lang.String.valueOf(C11600cUg.OLrzqt(bool.booleanValue())), false, 4, null);
        }
        java.lang.String strValueOf = c19012ftJ.valueOf();
        eventParamsList.put("source_id", strValueOf != null ? strValueOf : "", true);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        java.util.List<MarketChainBean> listAEQbTJ = isConnected().AEQbTJ();
        if (listAEQbTJ != null && !listAEQbTJ.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenSearchResultFragment$openChainSelectionBottomSheet$1(this, null), 3, null);
            getChildFragmentManager().setFragmentResultListener("SELECT_NETWORK_REQUEST_KEY", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.ftL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C19012ftJ.AEQbTJ(this.AEQbTJ, str, bundle);
                }
            });
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplBase), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final void AEQbTJ(C19012ftJ c19012ftJ, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        MarketChainBean marketChainBean = (MarketChainBean) bundle.getParcelable("SELECT_NETWORK_RESULT_KEY");
        if (marketChainBean == null) {
            c19012ftJ.AYXKKw = Long.MIN_VALUE;
            c19012ftJ.EZpvd(new C18998fsw(Long.MIN_VALUE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setSupportActionBar), ""));
        } else {
            long jValueOf = C33129mqd.valueOf(marketChainBean.getChainId());
            c19012ftJ.AYXKKw = jValueOf;
            c19012ftJ.EZpvd(new C18998fsw(jValueOf, marketChainBean.getChainName(), marketChainBean.getChainLogo()));
        }
    }

    public final void EZpvd(C18998fsw c18998fsw) {
        isConnected().AEQbTJ(c18998fsw, this.gEmmrt);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C17180ext c17180ext;
        RecyclerView recyclerView;
        super.onDestroyView();
        RecyclerView.OnScrollListener onScrollListener = this.valueOf;
        if (onScrollListener != null && (c17180ext = this.djBIcL) != null && (recyclerView = c17180ext.djBIcL) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.valueOf = null;
        this.djBIcL = null;
    }
}
