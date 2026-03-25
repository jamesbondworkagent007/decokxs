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
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$adapter$2$1$1$1;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$onCreateContent$1$1;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperHoldersViewModel;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperSheetParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC32329mXz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mXo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32318mXo extends AbstractC32315mXl {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public Function0<Unit> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public wXQ AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public C36071oOe values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw = function0;
    }

    public C32318mXo() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SniperHoldersViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$special$$inlined$activityViewModels$default$3
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.mXs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32318mXo.AYXKKw(this.copydefault);
            }
        });
        this.AYXKKw = new Function0() { // from class: o.mXr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32318mXo.djBIcL();
            }
        };
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.mXq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32318mXo.AhwBna(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.mXo$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mXo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C32318mXo copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            C32318mXo c32318mXo = new C32318mXo();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.sniper_sheet", new SniperSheetParams(str, str2, z, z2, str5, str3, str4));
            c32318mXo.setArguments(bundle);
            return c32318mXo;
        }
    }

    public final SniperHoldersViewModel valueOf() {
        return (SniperHoldersViewModel) this.DbNXlk.getValue();
    }

    public final MarketCoinDetailViewModel AhwBna() {
        return (MarketCoinDetailViewModel) this.AhwBna.getValue();
    }

    public final SniperSheetParams gEmmrt() {
        return (SniperSheetParams) this.gEmmrt.getValue();
    }

    public static final SniperSheetParams AYXKKw(C32318mXo c32318mXo) {
        SniperSheetParams sniperSheetParams;
        android.os.Bundle arguments = c32318mXo.getArguments();
        return (arguments == null || (sniperSheetParams = (SniperSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.sniper_sheet", SniperSheetParams.class))) == null) ? new SniperSheetParams(null, null, false, false, null, null, null, 127, null) : sniperSheetParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    public final C34632nfk AYXKKw() {
        return (C34632nfk) this.djBIcL.getValue();
    }

    public static final C34632nfk AhwBna(final C32318mXo c32318mXo) {
        C34632nfk c34632nfk = new C34632nfk();
        c34632nfk.register(mXB.class, new mXH(new Function1() { // from class: o.mXt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32318mXo.EZpvd(this.EZpvd, (mXB) obj);
            }
        }));
        return c34632nfk;
    }

    public static final Unit EZpvd(C32318mXo c32318mXo, mXB mxb) {
        Intrinsics.checkNotNullParameter(mxb, "");
        LifecycleOwner viewLifecycleOwner = c32318mXo.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SniperBottomSheet$adapter$2$1$1$1(c32318mXo, mxb, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        this.AkhnZx = wxq;
        wxq.setStyle(1);
        wxq.AYXKKw().setText(C33069mpW.copydefault(C35964oKf.Fragment.ExKek, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "70"))));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.values = C36071oOe.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        valueOf().OLrzqt(gEmmrt().KWHzl(), gEmmrt().AEQbTJ());
        C36071oOe c36071oOe = this.values;
        if (c36071oOe == null) {
            Intrinsics.gEmmrt("");
            c36071oOe = null;
        }
        c36071oOe.AhwBna.setAdapter(AYXKKw());
        c36071oOe.AhwBna.setLayoutManager(new GridLayoutManager(getContext(), 10));
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SniperBottomSheet$onCreateContent$1$1(this, null), 3, null);
        c36071oOe.AhwBna.addItemDecoration(new mWG(C55298xhM.dp2px$default(24.0f, null, 1, null)));
        c36071oOe.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.mXw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C32318mXo.EZpvd(this.copydefault, view);
            }
        });
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("DEXMarket_Token_SniperPopUp_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32318mXo.copydefault(this.KWHzl, (EventParamsList) obj);
            }
        });
    }

    public static final void EZpvd(C32318mXo c32318mXo, android.view.View view) {
        c32318mXo.valueOf().OLrzqt(c32318mXo.gEmmrt().KWHzl(), c32318mXo.gEmmrt().AEQbTJ());
    }

    public static final Unit copydefault(C32318mXo c32318mXo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "chain_name", c32318mXo.gEmmrt().copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_name", c32318mXo.gEmmrt().OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", c32318mXo.gEmmrt().AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", c32318mXo.gEmmrt().EZpvd(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        valueOf().KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        valueOf().EZpvd(gEmmrt().KWHzl(), gEmmrt().AEQbTJ());
    }

    public final void KWHzl(InterfaceC32329mXz interfaceC32329mXz) {
        C36071oOe c36071oOe = this.values;
        wXQ wxq = null;
        if (c36071oOe == null) {
            Intrinsics.gEmmrt("");
            c36071oOe = null;
        }
        C55173xeu c55173xeu = c36071oOe.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        boolean z = interfaceC32329mXz instanceof InterfaceC32329mXz.Application;
        c55173xeu.setVisibility(z ? 0 : 8);
        C55113xdn c55113xdn = c36071oOe.djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        boolean z2 = interfaceC32329mXz instanceof InterfaceC32329mXz.Activity;
        c55113xdn.setVisibility(z2 ? 0 : 8);
        ConstraintLayout constraintLayout = c36071oOe.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        boolean z3 = interfaceC32329mXz instanceof InterfaceC32329mXz.ActionBar;
        constraintLayout.setVisibility(z3 ? 0 : 8);
        if (z2 || z) {
            return;
        }
        if (!z3) {
            throw new NoWhenBranchMatchedException();
        }
        C36071oOe c36071oOe2 = this.values;
        if (c36071oOe2 == null) {
            Intrinsics.gEmmrt("");
            c36071oOe2 = null;
        }
        InterfaceC32329mXz.ActionBar actionBar = (InterfaceC32329mXz.ActionBar) interfaceC32329mXz;
        c36071oOe2.fARcdN.setText(C32163mRv.formatPercentWithoutSymbol$default(actionBar.AhwBna(), false, 0, null, false, 0, 15, null));
        c36071oOe2.AkhnZx.setText(C32163mRv.formatPercentWithoutSymbol$default(actionBar.gEmmrt(), false, 0, null, false, 0, 15, null));
        C34632nfk.setData$default(AYXKKw(), actionBar.AEQbTJ(), null, 2, null);
        c36071oOe2.fetchVPNInfo.setText(C33069mpW.copydefault(C35964oKf.Fragment.DcMfJKfNLfdT, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.copydefault()))));
        c36071oOe2.ejfBZ.setText(C33069mpW.copydefault(C35964oKf.Fragment.bindToGooglePlayService, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.valueOf()))));
        c36071oOe2.DbNXlk.setText(C33069mpW.copydefault(C35964oKf.Fragment.Hx, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.KWHzl()))));
        c36071oOe2.isConnected.setText(C33069mpW.copydefault(C35964oKf.Fragment.DcMfJKfNUfqk, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.OLrzqt()))));
        c36071oOe2.values.setText(C33069mpW.copydefault(C35964oKf.Fragment.jh, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.EZpvd()))));
        wXQ wxq2 = this.AkhnZx;
        if (wxq2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wxq = wxq2;
        }
        wxq.AYXKKw().setText(C33069mpW.copydefault(C35964oKf.Fragment.ExKek, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", actionBar.djBIcL()))));
    }
}
