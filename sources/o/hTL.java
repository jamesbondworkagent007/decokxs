package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.swap.coinlist.SelectNetWorkViewModel;
import com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.SelectNetworkBottomSheet$initListener$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.SortedSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hTL extends hTN {
    public C23491hzI AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final yIU fetchVPNInfo;
    public Function1<? super ChainInfoResult, Unit> gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    public hTL() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.SelectNetworkBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.SelectNetworkBottomSheet$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectNetWorkViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.SelectNetworkBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.SelectNetworkBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.SelectNetworkBottomSheet$special$$inlined$viewModels$default$5
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
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.hTO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(hTL.isConnected(this.AEQbTJ));
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.hTP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(hTL.fetchVPNInfo(this.AEQbTJ));
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.hTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hTL.AYXKKw(this.EZpvd);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.hTT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(hTL.values(this.EZpvd));
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.hTV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(hTL.AkhnZx(this.EZpvd));
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.hTY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hTL.fJNWhG(this.EZpvd);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.hTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hTL.DbNXlk(this.AEQbTJ);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.hTZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hTL.fIwbmz(this.KWHzl);
            }
        });
        this.fetchVPNInfo = new yIU('A', 'Z');
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hTL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hTL$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void show$default(ActionBar actionBar, androidx.fragment.app.FragmentManager fragmentManager, C21997hUb c21997hUb, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            actionBar.OLrzqt(fragmentManager, c21997hUb, function1);
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull C21997hUb c21997hUb, Function1<? super ChainInfoResult, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(c21997hUb, "");
            hTL htl = new hTL();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("source", c21997hUb.gEmmrt().getSource());
            bundle.putString("chain_id", c21997hUb.copydefault());
            bundle.putBoolean("extra_universal_1", c21997hUb.AEQbTJ());
            bundle.putBoolean("extra_universal_2", c21997hUb.EZpvd());
            bundle.putString("extra_universal_3", c21997hUb.OLrzqt());
            bundle.putBoolean("extra_universal_4", c21997hUb.valueOf());
            bundle.putBoolean("extra_universal_5", c21997hUb.KWHzl());
            bundle.putString("trade_mode", c21997hUb.AhwBna());
            htl.setArguments(bundle);
            htl.gEmmrt = function1;
            htl.show(fragmentManager);
        }
    }

    public final SelectNetWorkViewModel AYXKKw() {
        return (SelectNetWorkViewModel) this.fJNWhG.getValue();
    }

    public final boolean valueOf() {
        return ((java.lang.Boolean) this.DbNXlk.getValue()).booleanValue();
    }

    public static final boolean isConnected(hTL htl) {
        android.os.Bundle arguments = htl.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_1");
        }
        return false;
    }

    public final boolean djBIcL() {
        return ((java.lang.Boolean) this.AkhnZx.getValue()).booleanValue();
    }

    public static final boolean fetchVPNInfo(hTL htl) {
        android.os.Bundle arguments = htl.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_2");
        }
        return true;
    }

    /* JADX DEBUG: Possible override for method o.hTN.KWHzl()V */
    public final java.lang.String KWHzl() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String AYXKKw(hTL htl) {
        android.os.Bundle arguments = htl.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("extra_universal_3") : null;
        return string == null ? "" : string;
    }

    public final boolean fetchVPNInfo() {
        return ((java.lang.Boolean) this.values.getValue()).booleanValue();
    }

    public static final boolean values(hTL htl) {
        android.os.Bundle arguments = htl.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_4");
        }
        return true;
    }

    public final boolean AhwBna() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean AkhnZx(hTL htl) {
        android.os.Bundle arguments = htl.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_5");
        }
        return false;
    }

    private final TradeMode AkhnZx() {
        return (TradeMode) this.ejfBZ.getValue();
    }

    public static final TradeMode fJNWhG(hTL htl) {
        java.lang.String string;
        android.os.Bundle arguments = htl.getArguments();
        if (arguments == null || (string = arguments.getString("trade_mode")) == null) {
            return null;
        }
        return TradeMode.Companion.KWHzl(string);
    }

    private final java.lang.String DbNXlk() {
        return (java.lang.String) this.isConnected.getValue();
    }

    public static final java.lang.String DbNXlk(hTL htl) {
        java.lang.String string;
        android.os.Bundle arguments = htl.getArguments();
        return (arguments == null || (string = arguments.getString("chain_id")) == null) ? "1" : string;
    }

    public final NetworkSource gEmmrt() {
        return (NetworkSource) this.fIwbmz.getValue();
    }

    public static final NetworkSource fIwbmz(hTL htl) {
        java.lang.String string;
        NetworkSource next;
        android.os.Bundle arguments = htl.getArguments();
        if (arguments != null && (string = arguments.getString("source")) != null) {
            java.util.Iterator<NetworkSource> it = NetworkSource.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) next.getSource(), (java.lang.Object) string)) {
                    break;
                }
            }
            NetworkSource networkSource = next;
            if (networkSource != null) {
                return networkSource;
            }
        }
        return NetworkSource.Single;
    }

    public static final class Application<T> implements java.util.Comparator {
        public final /* synthetic */ java.lang.CharSequence EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.CharSequence charSequence) {
            this.EZpvd = charSequence;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String chainName = ((C22593hiL) t2).KWHzl().getChainName();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = chainName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            boolean zStartsWith$default = StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) lowerCase, this.EZpvd, false, 2, (java.lang.Object) null);
            java.lang.String lowerCase2 = ((C22593hiL) t).KWHzl().getChainName().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(java.lang.Boolean.valueOf(zStartsWith$default), java.lang.Boolean.valueOf(StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) lowerCase2, this.EZpvd, false, 2, (java.lang.Object) null)));
        }
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Boolean.valueOf(((C22593hiL) t2).AEQbTJ()), java.lang.Boolean.valueOf(((C22593hiL) t).AEQbTJ()));
        }
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        TradeMode tradeModeAkhnZx = AkhnZx();
        return (tradeModeAkhnZx == null || tradeModeAkhnZx.isCopyTrading()) ? false : true;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AYXKKw().OLrzqt(gEmmrt(), KWHzl(), fetchVPNInfo());
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistryOwner));
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.EZpvd().setVisibility(8);
        wxq.EZpvd().setImageResource(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        OKAnchorSelection oKAnchorSelection;
        OKAnchorSelection oKAnchorSelection2;
        C55230xfy c55230xfyDjBIcL;
        OKAnchorSelection oKAnchorSelection3;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C23491hzI c23491hzICopydefault = C23491hzI.copydefault(getLayoutInflater(), constraintLayout, true);
        this.AhwBna = c23491hzICopydefault;
        if (c23491hzICopydefault != null && (oKAnchorSelection3 = c23491hzICopydefault.KWHzl) != null) {
            C55230xfy c55230xfyDjBIcL2 = oKAnchorSelection3.djBIcL();
            c55230xfyDjBIcL2.KWHzl().setHint(c55230xfyDjBIcL2.getContext().getString(C23274hvD.Fragment.AxsJAY));
            if (c55230xfyDjBIcL2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = c55230xfyDjBIcL2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
                    marginLayoutParams.setMarginEnd(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.GhqvEQ);
            oKAnchorSelection3.setBackgroundColor(iKWHzl);
            oKAnchorSelection3.setSuspensionTitleBackgroundColor(iKWHzl);
            oKAnchorSelection3.EZpvd();
        }
        C23491hzI c23491hzI = this.AhwBna;
        if (c23491hzI != null && (oKAnchorSelection2 = c23491hzI.KWHzl) != null && (c55230xfyDjBIcL = oKAnchorSelection2.djBIcL()) != null) {
            c55230xfyDjBIcL.setVisibility(AhwBna() ? 8 : 0);
        }
        C23491hzI c23491hzI2 = this.AhwBna;
        if (c23491hzI2 == null || (oKAnchorSelection = c23491hzI2.KWHzl) == null) {
            return;
        }
        oKAnchorSelection.EZpvd();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C32866mlf.onEvent$default("DEXSwap_Swap_NetworkSelect_View", (TrackChannel[]) null, new Function1() { // from class: o.hTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hTL.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        values();
        isConnected();
        AYXKKw().OLrzqt(AkhnZx());
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SelectNetworkBottomSheet$initListener$1(this, null), 3, null);
    }

    public final void OLrzqt(java.util.List<C22593hiL> list, java.util.List<C22593hiL> list2) {
        OKAnchorSelection oKAnchorSelection;
        OKAnchorSelection oKAnchorSelection2;
        OKAnchorSelection oKAnchorSelection3;
        OKAnchorSelection oKAnchorSelection4;
        OKAnchorSelection oKAnchorSelection5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        if (valueOf()) {
            C23491hzI c23491hzI = this.AhwBna;
            if (c23491hzI != null && (oKAnchorSelection5 = c23491hzI.KWHzl) != null) {
                oKAnchorSelection5.OLrzqt(new C22000hUe("", yDY.AhwBna(new C21999hUd(null, true, null, true, 5, null)), false));
            }
            arrayList.add("");
        }
        TradeMode tradeModeAkhnZx = AkhnZx();
        if (tradeModeAkhnZx != null && tradeModeAkhnZx.isCopyTrading()) {
            arrayList.add("★");
            C23491hzI c23491hzI2 = this.AhwBna;
            if (c23491hzI2 == null || (oKAnchorSelection4 = c23491hzI2.KWHzl) == null) {
                return;
            }
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.Dfm);
            java.util.List<C22593hiL> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (C22593hiL c22593hiL : listEZpvd) {
                arrayList2.add(new C21999hUd(c22593hiL.KWHzl(), c22593hiL.AEQbTJ(), "", false, 8, null));
            }
            oKAnchorSelection4.OLrzqt(new C22000hUe(strAYXKKw, C56532yIw.OLrzqt(arrayList2), false));
            return;
        }
        if ((!list2.isEmpty()) && djBIcL()) {
            arrayList.add("★");
            C23491hzI c23491hzI3 = this.AhwBna;
            if (c23491hzI3 != null && (oKAnchorSelection3 = c23491hzI3.KWHzl) != null) {
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.getMediaType);
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                for (C22593hiL c22593hiL2 : list2) {
                    arrayList3.add(new C21999hUd(c22593hiL2.KWHzl(), c22593hiL2.AEQbTJ(), "", false, 8, null));
                }
                oKAnchorSelection3.OLrzqt(new C22000hUe(strAYXKKw2, C56532yIw.OLrzqt(arrayList3), false, 4, null));
            }
        }
        SortedSet sortedSetHDKMBd = C59409zgW.hDKMBd(C59467zhb.DbNXlk(C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(list), new Function1() { // from class: o.hTM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Character.valueOf(hTL.KWHzl((C22593hiL) obj));
            }
        }), new Function1() { // from class: o.hTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(hTL.OLrzqt(this.OLrzqt, ((java.lang.Character) obj).charValue()));
            }
        }));
        java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(sortedSetHDKMBd, 10));
        java.util.Iterator it = sortedSetHDKMBd.iterator();
        while (it.hasNext()) {
            arrayList4.add(C33129mqd.gEmmrt((java.lang.Character) it.next()));
        }
        for (java.lang.String str : arrayList4) {
            java.util.ArrayList<C22593hiL> arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                java.lang.Character chAhwBna = C59454zhO.AhwBna((java.lang.CharSequence) ((C22593hiL) obj).KWHzl().getChainName(), i);
                if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(chAhwBna != null ? java.lang.Character.valueOf(java.lang.Character.toUpperCase(chAhwBna.charValue())) : null), (java.lang.Object) str)) {
                    arrayList5.add(obj);
                }
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
            for (C22593hiL c22593hiL3 : arrayList5) {
                arrayList6.add(new C21999hUd(c22593hiL3.KWHzl(), c22593hiL3.AEQbTJ(), "", false, 8, null));
            }
            java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList6);
            Intrinsics.copydefault(listFJNWhG, "");
            java.util.List listOLrzqt = C56532yIw.OLrzqt(listFJNWhG);
            C23491hzI c23491hzI4 = this.AhwBna;
            if (c23491hzI4 != null && (oKAnchorSelection2 = c23491hzI4.KWHzl) != null) {
                oKAnchorSelection2.OLrzqt(new C22000hUe(str, listOLrzqt, false, 4, null));
            }
            i = 0;
        }
        arrayList.addAll(arrayList4);
        C23491hzI c23491hzI5 = this.AhwBna;
        if (c23491hzI5 == null || (oKAnchorSelection = c23491hzI5.KWHzl) == null) {
            return;
        }
        oKAnchorSelection.setIndexList(arrayList);
    }

    public static final char KWHzl(C22593hiL c22593hiL) {
        Intrinsics.checkNotNullParameter(c22593hiL, "");
        java.lang.Character chAhwBna = C59454zhO.AhwBna((java.lang.CharSequence) c22593hiL.KWHzl().getChainName(), 0);
        if (chAhwBna != null) {
            return java.lang.Character.toUpperCase(chAhwBna.charValue());
        }
        return ' ';
    }

    public static final boolean OLrzqt(hTL htl, char c) {
        yIU yiu = htl.fetchVPNInfo;
        return c <= yiu.copydefault() && yiu.KWHzl() <= c;
    }

    private final void values() {
        OKAnchorSelection oKAnchorSelection;
        OKAnchorSelection oKAnchorSelection2;
        OKAnchorSelection oKAnchorSelection3;
        OKAnchorSelection oKAnchorSelection4;
        C55173xeu c55173xeuCopydefault;
        OKAnchorSelection oKAnchorSelection5;
        C55230xfy c55230xfyDjBIcL;
        C23491hzI c23491hzI = this.AhwBna;
        if (c23491hzI != null && (oKAnchorSelection5 = c23491hzI.KWHzl) != null && (c55230xfyDjBIcL = oKAnchorSelection5.djBIcL()) != null) {
            c55230xfyDjBIcL.setCursorStyleWeb3();
        }
        C23491hzI c23491hzI2 = this.AhwBna;
        if (c23491hzI2 != null && (oKAnchorSelection4 = c23491hzI2.KWHzl) != null && (c55173xeuCopydefault = oKAnchorSelection4.copydefault()) != null) {
            c55173xeuCopydefault.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.getMediaSession));
        }
        C23491hzI c23491hzI3 = this.AhwBna;
        if (c23491hzI3 != null && (oKAnchorSelection3 = c23491hzI3.KWHzl) != null) {
            TradeMode tradeModeAkhnZx = AkhnZx();
            oKAnchorSelection3.setDividerLineVisibility((tradeModeAkhnZx == null || tradeModeAkhnZx.isCopyTrading()) ? false : true);
        }
        C23491hzI c23491hzI4 = this.AhwBna;
        if (c23491hzI4 != null && (oKAnchorSelection2 = c23491hzI4.KWHzl) != null) {
            oKAnchorSelection2.setSearchResultCallback(new Function1() { // from class: o.hTR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hTL.AEQbTJ(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
        }
        C23491hzI c23491hzI5 = this.AhwBna;
        if (c23491hzI5 == null || (oKAnchorSelection = c23491hzI5.KWHzl) == null) {
            return;
        }
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.hTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return hTL.EZpvd(this.KWHzl, (C55043xcW) obj, obj2);
            }
        });
    }

    public static final Unit AEQbTJ(hTL htl, java.lang.CharSequence charSequence) {
        OKAnchorSelection oKAnchorSelection;
        if (charSequence != null && charSequence.length() != 0) {
            java.lang.String lowerCase = charSequence.toString().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.util.List<C22593hiL> listKWHzl = htl.AYXKKw().KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                java.lang.String lowerCase2 = ((C22593hiL) obj).KWHzl().getChainName().toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) lowerCase, false, 2, (java.lang.Object) null)) {
                    arrayList.add(obj);
                }
            }
            java.util.List<C22593hiL> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new Application(charSequence));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (C22593hiL c22593hiL : listEZpvd) {
                arrayList2.add(new C21999hUd(c22593hiL.KWHzl(), c22593hiL.AEQbTJ(), lowerCase, false, 8, null));
            }
            C23491hzI c23491hzI = htl.AhwBna;
            if (c23491hzI != null && (oKAnchorSelection = c23491hzI.KWHzl) != null) {
                oKAnchorSelection.setSearchResultList(C56532yIw.OLrzqt(arrayList2));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(final hTL htl, C55043xcW c55043xcW, java.lang.Object obj) {
        java.lang.String strReplace$default;
        DefiChainInfo defiChainInfoOLrzqt;
        DefiChainInfo defiChainInfoOLrzqt2;
        DefiChainInfo defiChainInfoOLrzqt3;
        DefiChainInfo defiChainInfoOLrzqt4;
        java.lang.String chainName;
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        final C21999hUd c21999hUd = obj instanceof C21999hUd ? (C21999hUd) obj : null;
        C21532hCw c21532hCwOLrzqt = C21532hCw.OLrzqt(c55043xcW.itemView);
        Intrinsics.checkNotNullExpressionValue(c21532hCwOLrzqt, "");
        if (c21999hUd != null && c21999hUd.copydefault()) {
            c21532hCwOLrzqt.OLrzqt.setAlpha(1.0f);
            c21532hCwOLrzqt.copydefault.setAlpha(1.0f);
            c21532hCwOLrzqt.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        } else {
            c21532hCwOLrzqt.OLrzqt.setAlpha(0.1f);
            c21532hCwOLrzqt.copydefault.setAlpha(0.1f);
            c21532hCwOLrzqt.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
        }
        java.lang.String strEZpvd = c21999hUd != null ? c21999hUd.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            ConstraintLayout constraintLayoutKWHzl = c21532hCwOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutKWHzl, "");
            constraintLayoutKWHzl.setPaddingRelative(constraintLayoutKWHzl.getPaddingStart(), constraintLayoutKWHzl.getPaddingTop(), 0, constraintLayoutKWHzl.getPaddingBottom());
        } else {
            ConstraintLayout constraintLayoutKWHzl2 = c21532hCwOLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutKWHzl2, "");
            constraintLayoutKWHzl2.setPaddingRelative(constraintLayoutKWHzl2.getPaddingStart(), constraintLayoutKWHzl2.getPaddingTop(), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), constraintLayoutKWHzl2.getPaddingBottom());
        }
        if (c21999hUd != null && c21999hUd.KWHzl()) {
            c21532hCwOLrzqt.getRoot().setContentDescription("web3_dex_chain_picker_all_network_cell");
            AppCompatImageView appCompatImageView = c21532hCwOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(Intrinsics.EZpvd((java.lang.Object) "chain_id_all_network", (java.lang.Object) htl.DbNXlk()) ? 0 : 8);
            c21532hCwOLrzqt.OLrzqt.setImageResource(C52761wXj.TaskDescription.createSocket);
            c21532hCwOLrzqt.OLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl)));
            c21532hCwOLrzqt.AEQbTJ.setText(htl.requireActivity().getString(C23274hvD.Fragment.RKcVTr));
        } else if (c21999hUd == null || (defiChainInfoOLrzqt4 = c21999hUd.OLrzqt()) == null || (chainName = defiChainInfoOLrzqt4.getChainName()) == null) {
            strReplace$default = null;
            if (strReplace$default == null) {
                strReplace$default = "";
            }
            c21532hCwOLrzqt.getRoot().setContentDescription("web3_dex_copytrading_network_cell_" + strReplace$default);
            AppCompatImageView appCompatImageView2 = c21532hCwOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(Intrinsics.EZpvd((java.lang.Object) ((c21999hUd != null || (defiChainInfoOLrzqt3 = c21999hUd.OLrzqt()) == null) ? null : defiChainInfoOLrzqt3.getChainId()), (java.lang.Object) htl.DbNXlk()) ? 0 : 8);
            c21532hCwOLrzqt.OLrzqt.setImageTintList(null);
            AppCompatImageView appCompatImageView3 = c21532hCwOLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            C33054mpH.copydefault(appCompatImageView3, (c21999hUd != null || (defiChainInfoOLrzqt2 = c21999hUd.OLrzqt()) == null) ? null : defiChainInfoOLrzqt2.getLogoUrl(), C57406yhn.Activity.QKVWgx);
            c21532hCwOLrzqt.AEQbTJ.setText(htl.copydefault((c21999hUd != null || (defiChainInfoOLrzqt = c21999hUd.OLrzqt()) == null) ? null : defiChainInfoOLrzqt.getChainName(), c21999hUd != null ? c21999hUd.EZpvd() : null));
        } else {
            java.lang.String lowerCase = chainName.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                strReplace$default = C59449zhJ.replace$default(lowerCase, " ", "_", false, 4, (java.lang.Object) null);
            }
            if (strReplace$default == null) {
            }
            c21532hCwOLrzqt.getRoot().setContentDescription("web3_dex_copytrading_network_cell_" + strReplace$default);
            AppCompatImageView appCompatImageView22 = c21532hCwOLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView22, "");
            if (c21999hUd != null) {
                appCompatImageView22.setVisibility(Intrinsics.EZpvd((java.lang.Object) ((c21999hUd != null || (defiChainInfoOLrzqt3 = c21999hUd.OLrzqt()) == null) ? null : defiChainInfoOLrzqt3.getChainId()), (java.lang.Object) htl.DbNXlk()) ? 0 : 8);
                c21532hCwOLrzqt.OLrzqt.setImageTintList(null);
                AppCompatImageView appCompatImageView32 = c21532hCwOLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView32, "");
                if (c21999hUd != null) {
                    C33054mpH.copydefault(appCompatImageView32, (c21999hUd != null || (defiChainInfoOLrzqt2 = c21999hUd.OLrzqt()) == null) ? null : defiChainInfoOLrzqt2.getLogoUrl(), C57406yhn.Activity.QKVWgx);
                    if (c21999hUd != null) {
                        c21532hCwOLrzqt.AEQbTJ.setText(htl.copydefault((c21999hUd != null || (defiChainInfoOLrzqt = c21999hUd.OLrzqt()) == null) ? null : defiChainInfoOLrzqt.getChainName(), c21999hUd != null ? c21999hUd.EZpvd() : null));
                    }
                }
            }
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c55043xcW.itemView, 0L, new Function1() { // from class: o.hUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return hTL.KWHzl(c21999hUd, htl, (android.view.View) obj2);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C21999hUd c21999hUd, hTL htl, android.view.View view) {
        java.lang.String chainId;
        Intrinsics.checkNotNullParameter(view, "");
        if (c21999hUd == null || !c21999hUd.copydefault()) {
            if (htl.AkhnZx() == TradeMode.CopyTradeEdit || htl.AkhnZx() == TradeMode.CopyTradeCreate) {
                C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.zvzmfz, 0, 1, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
        if (c21999hUd.KWHzl()) {
            chainId = "chain_id_all_network";
        } else {
            DefiChainInfo defiChainInfoOLrzqt = c21999hUd.OLrzqt();
            if (defiChainInfoOLrzqt == null || (chainId = defiChainInfoOLrzqt.getChainId()) == null) {
                chainId = "1";
            }
        }
        DefiChainInfo defiChainInfoOLrzqt2 = c21999hUd.OLrzqt();
        java.lang.String chainName = defiChainInfoOLrzqt2 != null ? defiChainInfoOLrzqt2.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        DefiChainInfo defiChainInfoOLrzqt3 = c21999hUd.OLrzqt();
        java.lang.String logoUrl = defiChainInfoOLrzqt3 != null ? defiChainInfoOLrzqt3.getLogoUrl() : null;
        ChainInfoResult chainInfoResult = new ChainInfoResult(chainId, chainName, logoUrl != null ? logoUrl : "");
        Function1<? super ChainInfoResult, Unit> function1 = htl.gEmmrt;
        if (function1 != null) {
            function1.invoke(chainInfoResult);
        }
        htl.getParentFragmentManager().setFragmentResult("SelectNetworkBottomSheet.requestKey", BundleKt.bundleOf(C56390yDp.OLrzqt("SelectNetworkBottomSheet.result", chainInfoResult)));
        htl.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence copydefault(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            try {
                if (str.length() != 0 && str2 != null && str2.length() != 0) {
                    java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) lowerCase, str2, 0, false, 6, (java.lang.Object) null);
                    if (iIndexOf$default == -1) {
                        return str;
                    }
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.fkESqH)), iIndexOf$default, str2.length() + iIndexOf$default, 18);
                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.QVsKAR)), iIndexOf$default, str2.length() + iIndexOf$default, 18);
                    return spannableStringBuilder;
                }
            } catch (java.lang.IndexOutOfBoundsException unused) {
                return str == null ? "" : str;
            }
        }
        return str != null ? str : "";
    }
}
