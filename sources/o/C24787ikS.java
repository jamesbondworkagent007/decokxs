package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
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
import com.okinc.business.defi.share.Web3ShareService;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexui.main.swap.trade.savings.SavingsSummaryFragment$setupObservers$1;
import com.okinc.business.dexui.main.swap.trade.savings.ui.SavingsSummaryViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.InterfaceC24858ilk;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24787ikS extends AbstractC24783ikO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public hHA AYXKKw;
    public InterfaceC24858ilk.Application AhwBna;
    public final InterfaceC56387yDm valueOf;

    public C24787ikS() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.swap.trade.savings.SavingsSummaryFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.savings.SavingsSummaryFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SavingsSummaryViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.savings.SavingsSummaryFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.savings.SavingsSummaryFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.savings.SavingsSummaryFragment$special$$inlined$viewModels$default$5
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
    }

    public final hHA AYXKKw() {
        hHA hha = this.AYXKKw;
        Intrinsics.copydefault(hha);
        return hha;
    }

    public final SavingsSummaryViewModel djBIcL() {
        return (SavingsSummaryViewModel) this.valueOf.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AYXKKw = hHA.copydefault(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutCopydefault = AYXKKw().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutCopydefault, "");
        return constraintLayoutCopydefault;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AppCompatImageView appCompatImageView = AYXKKw().valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C22361hds.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.SavingsSummaryBg);
        valueOf();
        values();
        gEmmrt();
        djBIcL().EZpvd();
    }

    public final void valueOf() {
        ViewCompat.setOnApplyWindowInsetsListener(AYXKKw().getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.ilb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return C24787ikS.AEQbTJ(view, windowInsetsCompat);
            }
        });
        AYXKKw().getRoot().requestApplyInsets();
    }

    public static final WindowInsetsCompat AEQbTJ(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(view.getPaddingLeft(), insets.top, view.getPaddingRight(), view.getPaddingBottom());
        return windowInsetsCompat;
    }

    private final void values() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SavingsSummaryFragment$setupObservers$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        AYXKKw().AYXKKw.setVisibility(0);
        AYXKKw().OLrzqt.setVisibility(8);
        AYXKKw().EZpvd.setVisibility(4);
        AYXKKw().isConnected.setVisibility(8);
        AYXKKw().copydefault.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        AYXKKw().AYXKKw.setVisibility(8);
        AYXKKw().OLrzqt.setVisibility(8);
        C55173xeu c55173xeu = AYXKKw().EZpvd;
        c55173xeu.setVisibility(0);
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String string = c55173xeu.getContext().getString(C23274hvD.Fragment.QzqeNH);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = c55173xeu.getContext().getString(C23274hvD.Fragment.DcMfJKDCKfqPDCfLja);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ikZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C24787ikS.AhwBna(this.copydefault, view);
            }
        });
        AYXKKw().isConnected.setVisibility(8);
        AYXKKw().copydefault.setEnabled(false);
    }

    public static final void AhwBna(C24787ikS c24787ikS, android.view.View view) {
        c24787ikS.djBIcL().EZpvd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        AYXKKw().AYXKKw.setVisibility(8);
        AYXKKw().OLrzqt.setVisibility(8);
        C55173xeu c55173xeu = AYXKKw().EZpvd;
        c55173xeu.setVisibility(0);
        c55173xeu.setEmptyTypeImage(6);
        java.lang.String string = c55173xeu.getContext().getString(C23274hvD.Fragment.newPercentageRating);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = c55173xeu.getContext().getString(C23274hvD.Fragment.ParceledListSliceAdapterApi21);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ila
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C24787ikS.djBIcL(this.copydefault, view);
            }
        });
        AYXKKw().isConnected.setVisibility(8);
        AYXKKw().copydefault.setEnabled(false);
    }

    public static final void djBIcL(C24787ikS c24787ikS, android.view.View view) {
        FragmentActivity activity = c24787ikS.getActivity();
        if (activity != null) {
            activity.finish();
        }
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = c24787ikS.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, gKZ.EZpvd.AEQbTJ("dex/market"), null, new Function1() { // from class: o.ild
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24787ikS.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void KWHzl(InterfaceC24858ilk.Application application) {
        this.AhwBna = application;
        AYXKKw().AYXKKw.setVisibility(8);
        AYXKKw().OLrzqt.setVisibility(0);
        AYXKKw().EZpvd.setVisibility(8);
        AYXKKw().isConnected.setVisibility(0);
        AYXKKw().copydefault.setEnabled(true);
        AYXKKw().AuCTel.setText(C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(application.EZpvd(), false, null, false, false, 11, null));
        AYXKKw().fetchVPNInfo.setText(C33069mpW.copydefault(C23274hvD.Fragment.newHeartRating, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(application.OLrzqt(), false, null, false, false, 11, null)))));
        AYXKKw().values.setText(C33069mpW.copydefault(C23274hvD.Fragment.fromRating, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(application.KWHzl(), false, null, false, false, 11, null)))));
        AYXKKw().fJNWhG.setText(application.AEQbTJ());
        AYXKKw().fIwbmz.setText(C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(application.valueOf(), false, null, false, false, 11, null));
        AYXKKw().isConnected.setText(C33069mpW.copydefault(C23274hvD.Fragment.RatingCompat, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", application.copydefault()))));
        AYXKKw().DbNXlk.setText(C33069mpW.copydefault(C23274hvD.Fragment.RatingCompat, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", application.copydefault()))));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ivB.setOnDoubleCheckClickListener$default(android.view.View, long, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    private final void gEmmrt() {
        C25352ivB.setOnDoubleCheckClickListener$default(AYXKKw().gEmmrt, 0L, new Function1() { // from class: o.ikY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24787ikS.valueOf(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(AYXKKw().AEQbTJ, 0L, new Function1() { // from class: o.ikX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24787ikS.AYXKKw(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(AYXKKw().copydefault, 0L, new Function1() { // from class: o.ikW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24787ikS.gEmmrt(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit valueOf(C24787ikS c24787ikS, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C24786ikR c24786ikRCopydefault = C24786ikR.Companion.copydefault();
        androidx.fragment.app.FragmentManager parentFragmentManager = c24787ikS.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c24786ikRCopydefault.show(parentFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C24787ikS c24787ikS, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = c24787ikS.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C24787ikS c24787ikS, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c24787ikS.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        AhwBna();
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.share.Web3ShareService.Application.shareByMiniProgram$default(com.okinc.business.defi.share.Web3ShareService, androidx.fragment.app.Fragment, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.dTj, com.okinc.wallet.api.WalletReferralSource, int, java.lang.Object):void */
    /* JADX DEBUG: Class process forced to load method for inline: o.hvz.toLocalizedCurrencyNumberWithPrefix$default(java.lang.String, boolean, java.math.RoundingMode, boolean, boolean, int, java.lang.Object):java.lang.String */
    public final void AhwBna() {
        InterfaceC24858ilk.Application application = this.AhwBna;
        if (application == null) {
            return;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        java.lang.String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        java.lang.String str = strDbNXlk == null ? "" : strDbNXlk;
        java.lang.String strOLrzqt = C23316hvt.OLrzqt(C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", 2), C56390yDp.OLrzqt("totalSavedUsd", C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(application.EZpvd(), false, null, false, false, 11, null)), C56390yDp.OLrzqt("transactions", application.AEQbTJ()), C56390yDp.OLrzqt("volume", C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(application.valueOf(), false, null, false, false, 11, null)), C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, application.copydefault())));
        java.lang.String string = getString(C23274hvD.Fragment.zDUObI);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String strAEQbTJ = djBIcL().copydefault().getValue().AEQbTJ();
        java.lang.String str2 = strAEQbTJ != null ? strAEQbTJ : "";
        gKZ gkz = gKZ.EZpvd;
        Web3ShareService.Application.shareByMiniProgram$default((Web3ShareService) C43251rlk.copydefault(Web3ShareService.class), this, "dex", "dex_surplus_share", 1, string, gkz.OLrzqt(gkz.AEQbTJ("dex/market"), C56390yDp.OLrzqt("ref", str2)), strOLrzqt, str, null, null, 768, null);
    }

    /* JADX INFO: renamed from: o.ikS$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ikS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C24787ikS AEQbTJ() {
            return new C24787ikS();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AYXKKw = null;
    }
}
