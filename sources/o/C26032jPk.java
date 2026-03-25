package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$adapter$2$1$1$1;
import com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$onCreateContent$1$1;
import com.okinc.business.market.features.coindetail.ui.snipers.SniperHoldersViewModel;
import com.okinc.business.market.features.coindetail.ui.snipers.SniperSheetParams;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC26043jPv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jPk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26032jPk extends AbstractC26030jPi {
    public final InterfaceC56387yDm AhwBna;
    public wXQ AkhnZx;
    public Function0<Unit> djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public C21529hCt values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    public C26032jPk() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SniperHoldersViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$activityViewModels$default$3
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.jPq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26032jPk.AYXKKw(this.KWHzl);
            }
        });
        this.djBIcL = new Function0() { // from class: o.jPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26032jPk.AYXKKw();
            }
        };
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jPo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26032jPk.gEmmrt(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.jPk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jPk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C26032jPk EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            C26032jPk c26032jPk = new C26032jPk();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.sniper_sheet", new SniperSheetParams(str, str2, z, str5, str3, str4));
            c26032jPk.setArguments(bundle);
            return c26032jPk;
        }
    }

    public final SniperHoldersViewModel gEmmrt() {
        return (SniperHoldersViewModel) this.fetchVPNInfo.getValue();
    }

    public final MarketCoinDetailViewModel valueOf() {
        return (MarketCoinDetailViewModel) this.AhwBna.getValue();
    }

    public final SniperSheetParams AhwBna() {
        return (SniperSheetParams) this.gEmmrt.getValue();
    }

    public static final SniperSheetParams AYXKKw(C26032jPk c26032jPk) {
        SniperSheetParams sniperSheetParams;
        android.os.Bundle arguments = c26032jPk.getArguments();
        return (arguments == null || (sniperSheetParams = (SniperSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.sniper_sheet", SniperSheetParams.class))) == null) ? new SniperSheetParams(null, null, false, null, null, null, 63, null) : sniperSheetParams;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    private final kMM djBIcL() {
        return (kMM) this.valueOf.getValue();
    }

    public static final kMM gEmmrt(final C26032jPk c26032jPk) {
        kMM kmm = new kMM();
        kmm.register(C26041jPt.class, new C26046jPy(new Function1() { // from class: o.jPl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26032jPk.copydefault(this.KWHzl, (C26041jPt) obj);
            }
        }));
        return kmm;
    }

    public static final Unit copydefault(C26032jPk c26032jPk, C26041jPt c26041jPt) {
        Intrinsics.checkNotNullParameter(c26041jPt, "");
        LifecycleOwner viewLifecycleOwner = c26032jPk.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SniperBottomSheet$adapter$2$1$1$1(c26032jPk, c26041jPt, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        this.AkhnZx = wxq;
        wxq.setStyle(1);
        wxq.AYXKKw().setText(C33069mpW.copydefault(C23274hvD.Fragment.ComponentActivity1, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "70"))));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.values = C21529hCt.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        gEmmrt().KWHzl(AhwBna().copydefault(), AhwBna().AEQbTJ());
        C21529hCt c21529hCt = this.values;
        if (c21529hCt == null) {
            Intrinsics.gEmmrt("");
            c21529hCt = null;
        }
        c21529hCt.gEmmrt.setAdapter(djBIcL());
        c21529hCt.gEmmrt.setLayoutManager(new GridLayoutManager(getContext(), 10));
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SniperBottomSheet$onCreateContent$1$1(this, null), 3, null);
        c21529hCt.gEmmrt.addItemDecoration(new jNZ(C55298xhM.dp2px$default(24.0f, null, 1, null)));
        c21529hCt.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.jPm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26032jPk.KWHzl(this.EZpvd, view);
            }
        });
        C32866mlf.onEvent$default("DEXMarket_Token_SniperPopUp_View", (TrackChannel[]) null, new Function1() { // from class: o.jPn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26032jPk.copydefault(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final void KWHzl(C26032jPk c26032jPk, android.view.View view) {
        c26032jPk.gEmmrt().KWHzl(c26032jPk.AhwBna().copydefault(), c26032jPk.AhwBna().AEQbTJ());
    }

    public static final Unit copydefault(C26032jPk c26032jPk, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chain_name", c26032jPk.AhwBna().KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_name", c26032jPk.AhwBna().EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", c26032jPk.AhwBna().AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", c26032jPk.AhwBna().OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        gEmmrt().copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        gEmmrt().AEQbTJ(AhwBna().copydefault(), AhwBna().AEQbTJ());
    }

    public final void copydefault(InterfaceC26043jPv interfaceC26043jPv) {
        C21529hCt c21529hCt = this.values;
        wXQ wxq = null;
        if (c21529hCt == null) {
            Intrinsics.gEmmrt("");
            c21529hCt = null;
        }
        C55173xeu c55173xeu = c21529hCt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        boolean z = interfaceC26043jPv instanceof InterfaceC26043jPv.Activity;
        c55173xeu.setVisibility(z ? 0 : 8);
        C55113xdn c55113xdn = c21529hCt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z2 = interfaceC26043jPv instanceof InterfaceC26043jPv.StateListAnimator;
        c55113xdn.setVisibility(z2 ? 0 : 8);
        ConstraintLayout constraintLayout = c21529hCt.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        boolean z3 = interfaceC26043jPv instanceof InterfaceC26043jPv.ActionBar;
        constraintLayout.setVisibility(z3 ? 0 : 8);
        if (z2 || z) {
            return;
        }
        if (!z3) {
            throw new NoWhenBranchMatchedException();
        }
        C21529hCt c21529hCt2 = this.values;
        if (c21529hCt2 == null) {
            Intrinsics.gEmmrt("");
            c21529hCt2 = null;
        }
        InterfaceC26043jPv.ActionBar actionBar = (InterfaceC26043jPv.ActionBar) interfaceC26043jPv;
        c21529hCt2.AuCTel.setText(C23311hvo.formatPercentWithoutSymbol$default(actionBar.AhwBna(), false, 0, null, false, 0, 15, null));
        c21529hCt2.DbNXlk.setText(C23311hvo.formatPercentWithoutSymbol$default(actionBar.djBIcL(), false, 0, null, false, 0, 15, null));
        kMM.setData$default(djBIcL(), actionBar.OLrzqt(), null, 2, null);
        c21529hCt2.isConnected.setText(C33069mpW.copydefault(C23274hvD.Fragment.getViewModelStore, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.EZpvd()))));
        c21529hCt2.ejfBZ.setText(C33069mpW.copydefault(C23274hvD.Fragment.onRequestPermissionsResult, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.gEmmrt()))));
        c21529hCt2.values.setText(C33069mpW.copydefault(C23274hvD.Fragment.onConfigurationChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.copydefault()))));
        c21529hCt2.fetchVPNInfo.setText(C33069mpW.copydefault(C23274hvD.Fragment.invalidateMenu, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.KWHzl()))));
        c21529hCt2.AkhnZx.setText(C33069mpW.copydefault(C23274hvD.Fragment.getLifecycle, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.AEQbTJ()))));
        wXQ wxq2 = this.AkhnZx;
        if (wxq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wxq = wxq2;
        }
        wxq.AYXKKw().setText(C33069mpW.copydefault(C23274hvD.Fragment.ComponentActivity1, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.AYXKKw()))));
    }
}
