package o;

import android.os.Build;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletManageSearchFragment$setupDataLoadTrigger$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.SearchMainViewModel;
import com.okinc.okex.ui.search.SearchInputChecker;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fun, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19095fun extends AbstractC19053fty {
    public java.lang.String AYXKKw;
    public java.lang.String AkhnZx;
    public boolean DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public java.lang.String gEmmrt;
    public C16689eof valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.ODCBUN;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public C19095fun() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletManageSearchFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletManageSearchFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletManageSearchFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletManageSearchFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletManageSearchFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.gEmmrt = "";
    }

    /* JADX INFO: renamed from: o.fun$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fun.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C19095fun newInstance$default(ActionBar actionBar, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return actionBar.KWHzl(z, str, str2);
        }

        public final C19095fun KWHzl(boolean z, java.lang.String str, java.lang.String str2) {
            C19095fun c19095fun = new C19095fun();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("arg_show_banner", z);
            if (str != null) {
                bundle.putString("arg_source", str);
            }
            if (str2 != null) {
                bundle.putString("search_bar_transition_name", str2);
            }
            c19095fun.setArguments(bundle);
            return c19095fun;
        }
    }

    public final C19003ftA gEmmrt() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("tag_search_main_fragment");
        if (fragmentFindFragmentByTag instanceof C19003ftA) {
            return (C19003ftA) fragmentFindFragmentByTag;
        }
        return null;
    }

    public final C19155fvu valueOf() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("tag_wallet_search_result_container_fragment");
        if (fragmentFindFragmentByTag instanceof C19155fvu) {
            return (C19155fvu) fragmentFindFragmentByTag;
        }
        return null;
    }

    public final SearchMainViewModel djBIcL() {
        return (SearchMainViewModel) this.djBIcL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.DbNXlk = arguments.getBoolean("arg_show_banner", false);
            this.AkhnZx = arguments.getString("arg_source");
            this.AYXKKw = arguments.getString("search_bar_transition_name");
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.valueOf = C16689eof.copydefault(view);
        AkhnZx();
        fetchVPNInfo();
        AEQbTJ();
        DbNXlk();
        C16689eof c16689eof = this.valueOf;
        if (c16689eof != null) {
            c16689eof.copydefault.copydefault().setText(getString(C13754dXa.FragmentManager.keySet));
            try {
                c16689eof.copydefault.copydefault().setContentDescription("web3_search_component_searchbar_cancel_button");
                c16689eof.copydefault.KWHzl().setContentDescription("web3_search_component_searchbar_input");
            } catch (java.lang.Exception e) {
                pUU.copydefault("zqh", "e:" + e.getMessage());
            }
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            if (gEmmrt() == null) {
                fragmentTransactionBeginTransaction.add(c16689eof.OLrzqt.getId(), C19003ftA.Companion.AEQbTJ(this.DbNXlk, this.AkhnZx, this.AYXKKw), "tag_search_main_fragment");
            }
            fragmentTransactionBeginTransaction.commit();
        }
        C16689eof c16689eof2 = this.valueOf;
        if (c16689eof2 != null) {
            OLrzqt(c16689eof2, view);
        }
        view.post(new java.lang.Runnable() { // from class: o.fup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19095fun.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(C19095fun c19095fun) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c19095fun, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void DbNXlk() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletManageSearchFragment$setupDataLoadTrigger$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.fun$StateListAnimator */
    public static final class StateListAnimator extends OnBackPressedCallback {
        public StateListAnimator() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (C19095fun.this.AhwBna()) {
                return;
            }
            setEnabled(false);
            C19095fun.this.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
    }

    public final void AkhnZx() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        StateListAnimator stateListAnimator = new StateListAnimator();
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, stateListAnimator);
    }

    public final void fetchVPNInfo() {
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(false);
    }

    public final void OLrzqt(C16689eof c16689eof, android.view.View view) {
        java.lang.String str = this.AYXKKw;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        c16689eof.copydefault.setTransitionName(this.AYXKKw);
        postponeEnterTransition();
        Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(view, new Activity(view, this)), "");
    }

    public final void values() {
        djBIcL().KWHzl();
    }

    public final void AEQbTJ() {
        final C16689eof c16689eof = this.valueOf;
        if (c16689eof != null) {
            c16689eof.copydefault.setOnBackPressed(new Function0() { // from class: o.fur
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19095fun.KWHzl(this.copydefault);
                }
            });
            AbstractC8005auZ<AbstractC8066avi> abstractC8005auZEZpvd = C8062ave.EZpvd(c16689eof.copydefault.KWHzl());
            Intrinsics.checkNotNullExpressionValue(abstractC8005auZEZpvd, "");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58247yxg abstractC58247yxgDebounce = C58156yvv.copydefault(abstractC8005auZEZpvd, viewLifecycleOwner).debounce(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            final Function1 function1 = new Function1() { // from class: o.fuv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19095fun.EZpvd((AbstractC8066avi) obj);
                }
            };
            AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgDebounce.map(new InterfaceC58229yxO() { // from class: o.fux
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C19095fun.AYXKKw(function1, obj);
                }
            }).observeOn(C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.fuu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19095fun.OLrzqt(this.KWHzl, c16689eof, (java.lang.String) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fuw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C19095fun.OLrzqt(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.fuy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19095fun.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fut
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C19095fun.EZpvd(function13, obj);
                }
            });
        }
    }

    public static final Unit KWHzl(C19095fun c19095fun) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        c19095fun.gEmmrt = "";
        C19003ftA c19003ftAGEmmrt = c19095fun.gEmmrt();
        if (c19003ftAGEmmrt != null) {
            c19003ftAGEmmrt.AEQbTJ();
        }
        FragmentActivity activity = c19095fun.getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String EZpvd(AbstractC8066avi abstractC8066avi) {
        Intrinsics.checkNotNullParameter(abstractC8066avi, "");
        return abstractC8066avi.EZpvd().toString();
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C19095fun c19095fun, final C16689eof c16689eof, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c19095fun.gEmmrt)) {
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault((java.lang.Object) str);
        c19095fun.gEmmrt = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        if (str.length() == 0) {
            c19095fun.OLrzqt(false);
        } else {
            androidx.fragment.app.FragmentManager childFragmentManager = c19095fun.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            C19155fvu c19155fvuValueOf = c19095fun.valueOf();
            if (c19155fvuValueOf == null) {
                c19155fvuValueOf = C19155fvu.Companion.OLrzqt(c19095fun.AkhnZx);
                c19155fvuValueOf.EZpvd(new Function1() { // from class: o.fuq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C19095fun.EZpvd(c16689eof, (SearchCompletionUiModel) obj);
                    }
                });
                fragmentTransactionBeginTransaction.add(c16689eof.OLrzqt.getId(), c19155fvuValueOf, "tag_wallet_search_result_container_fragment");
            } else {
                fragmentTransactionBeginTransaction.show(c19155fvuValueOf);
            }
            C19003ftA c19003ftAGEmmrt = c19095fun.gEmmrt();
            if (c19003ftAGEmmrt != null) {
                fragmentTransactionBeginTransaction.hide(c19003ftAGEmmrt);
            }
            c19155fvuValueOf.OLrzqt(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C33129mqd.gEmmrt(str)).toString());
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
        try {
            Result.Application application = Result.Companion;
            java.lang.String string = str.toString();
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                android.content.Context applicationContext = c19095fun.requireContext().getApplicationContext();
                java.util.Locale locale = java.util.Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (SearchInputChecker.copydefault(applicationContext, lowerCase)) {
                    C31977mKy c31977mKy = C31977mKy.AEQbTJ;
                    FragmentActivity fragmentActivityRequireActivity = c19095fun.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    c31977mKy.OLrzqt(fragmentActivityRequireActivity);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C10856bwO.copydefault("WalletManageSearchFragment", 0, "SearchInputChecker error: " + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C16689eof c16689eof, SearchCompletionUiModel searchCompletionUiModel) {
        Intrinsics.checkNotNullParameter(searchCompletionUiModel, "");
        java.lang.String text = searchCompletionUiModel.getText();
        if (text == null || text.length() == 0) {
            return Unit.INSTANCE;
        }
        c16689eof.copydefault.KWHzl().setText(searchCompletionUiModel.getText());
        c16689eof.copydefault.KWHzl().setSelection(searchCompletionUiModel.getText().length());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C19095fun c19095fun, java.lang.Throwable th) {
        pUU.copydefault(c19095fun.getTAG(), "error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(boolean z) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            C16689eof c16689eof = this.valueOf;
            if (c16689eof != null) {
                final OKEditText oKEditTextKWHzl = c16689eof.copydefault.KWHzl();
                if (z) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        oKEditTextKWHzl.setFocusable(1);
                    }
                    oKEditTextKWHzl.setFocusableInTouchMode(true);
                    oKEditTextKWHzl.post(new java.lang.Runnable() { // from class: o.fus
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19095fun.KWHzl(oKEditTextKWHzl, this);
                        }
                    });
                } else {
                    oKEditTextKWHzl.clearFocus();
                }
            } else {
                c16689eof = null;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(c16689eof);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(getTAG(), "Failed to set EditText focus", thM7380exceptionOrNullimpl);
        }
        return objM7377constructorimpl;
    }

    public static final void KWHzl(OKEditText oKEditText, C19095fun c19095fun) {
        try {
            oKEditText.requestFocus();
            FragmentActivity activity = c19095fun.getActivity();
            if (activity != null) {
                C33054mpH.EZpvd((android.app.Activity) activity);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(c19095fun.getTAG(), "Failed to request focus on search EditText", e);
        }
    }

    public final boolean AhwBna() {
        if (this.gEmmrt.length() == 0) {
            return false;
        }
        OLrzqt(true);
        return true;
    }

    public final void OLrzqt(boolean z) {
        C19003ftA c19003ftAGEmmrt = gEmmrt();
        if (c19003ftAGEmmrt != null) {
            this.gEmmrt = "";
            C16689eof c16689eof = this.valueOf;
            if (c16689eof != null) {
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                fragmentTransactionBeginTransaction.show(c19003ftAGEmmrt);
                C19155fvu c19155fvuValueOf = valueOf();
                if (c19155fvuValueOf != null) {
                    fragmentTransactionBeginTransaction.hide(c19155fvuValueOf);
                }
                fragmentTransactionBeginTransaction.commit();
                if (z) {
                    c16689eof.copydefault.KWHzl().setText(this.gEmmrt);
                }
            }
        }
    }

    public final void AYXKKw() {
        android.content.Context context;
        C16689eof c16689eof = this.valueOf;
        if (c16689eof == null || (context = getContext()) == null) {
            return;
        }
        C33054mpH.OLrzqt(context, c16689eof.copydefault.KWHzl());
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        fetchVPNInfo();
    }

    public final void isConnected() {
        C19003ftA c19003ftAGEmmrt = gEmmrt();
        if (c19003ftAGEmmrt != null) {
            c19003ftAGEmmrt.onVisible();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EZpvd(false);
        djBIcL().copydefault(false);
        AYXKKw();
        this.valueOf = null;
    }

    /* JADX INFO: renamed from: o.fun$Activity */
    public static final class Activity implements java.lang.Runnable {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C19095fun KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, C19095fun c19095fun) {
            this.EZpvd = view;
            this.KWHzl = c19095fun;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.KWHzl.startPostponedEnterTransition();
        }
    }
}
