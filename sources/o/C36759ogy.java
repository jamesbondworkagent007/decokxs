package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.im.imui.messageV2.view.MessageListMainViewModel;
import com.okinc.im.imui.messageV2.view.banner.contractaddress.ContractAddressBannerFragment$initView$1$1;
import com.okinc.okimcore.model.room.inhouseim.ContractAddressTokenInfo;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ogy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36759ogy extends AbstractC36713ogE {
    public final InterfaceC56387yDm EZpvd;
    public C33897nJx KWHzl;
    public final int OLrzqt = C35399nuc.Dialog.QKudOq;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.ogy$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.ogy$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ogy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C36759ogy KWHzl(java.lang.String str) {
            C36759ogy c36759ogy = new C36759ogy();
            c36759ogy.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str)));
            return c36759ogy;
        }
    }

    public C36759ogy() {
        final Function0 function0 = new Function0() { // from class: o.ogx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36759ogy.copydefault(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.contractaddress.ContractAddressBannerFragment$special$$inlined$viewModels$default$1
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MessageListMainViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.contractaddress.ContractAddressBannerFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.contractaddress.ContractAddressBannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.contractaddress.ContractAddressBannerFragment$special$$inlined$viewModels$default$4
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

    /* JADX DEBUG: Possible override for method o.ogE.OLrzqt()V */
    public final MessageListMainViewModel OLrzqt() {
        return (MessageListMainViewModel) this.EZpvd.getValue();
    }

    public static final ViewModelStoreOwner copydefault(C36759ogy c36759ogy) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c36759ogy.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33897nJx c33897nJxOLrzqt = C33897nJx.OLrzqt(layoutInflater, viewGroup, false);
        this.KWHzl = c33897nJxOLrzqt;
        if (c33897nJxOLrzqt != null) {
            return c33897nJxOLrzqt.getRoot();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.util.List] */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.LinearLayout root;
        Intrinsics.checkNotNullParameter(view, "");
        C33897nJx c33897nJx = this.KWHzl;
        if (c33897nJx != null && (root = c33897nJx.getRoot()) != null) {
            root.setVisibility(8);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = yDY.AhwBna();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        OLrzqt().AuCTelauCTel().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.ogA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36759ogy.KWHzl(objectRef, this, objectRef2, (java.lang.String) obj);
            }
        }));
        OLrzqt().zLjUOn().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.ogB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36759ogy.copydefault(objectRef, this, objectRef2, (ContractAddressTokenInfo) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.Object, java.util.Collection, java.util.List] */
    public static final Unit KWHzl(Ref.ObjectRef objectRef, C36759ogy c36759ogy, Ref.ObjectRef objectRef2, java.lang.String str) {
        android.widget.LinearLayout root;
        java.lang.Boolean boolValueOf;
        android.widget.LinearLayout root2;
        sSQ ssq = sSQ.KWHzl;
        if (str == null) {
            str = "";
        }
        ?? DjBIcL = ssq.djBIcL(str);
        if (!Intrinsics.EZpvd((java.lang.Object) DjBIcL, objectRef.element)) {
            objectRef.element = DjBIcL;
            if (!DjBIcL.isEmpty()) {
                java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(DjBIcL);
                C33897nJx c33897nJx = c36759ogy.KWHzl;
                if (c33897nJx == null || (root2 = c33897nJx.getRoot()) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(root2.getVisibility() == 0);
                }
                Intrinsics.copydefault(boolValueOf);
                if (!boolValueOf.booleanValue() || !Intrinsics.EZpvd(str2, objectRef2.element)) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c36759ogy), null, null, new ContractAddressBannerFragment$initView$1$1(c36759ogy, DjBIcL, null), 3, null);
                }
            } else {
                C33897nJx c33897nJx2 = c36759ogy.KWHzl;
                if (c33897nJx2 != null && (root = c33897nJx2.getRoot()) != null) {
                    root.setVisibility(8);
                }
                objectRef2.element = null;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Object] */
    public static final Unit copydefault(Ref.ObjectRef objectRef, C36759ogy c36759ogy, Ref.ObjectRef objectRef2, ContractAddressTokenInfo contractAddressTokenInfo) {
        android.widget.LinearLayout root;
        android.widget.LinearLayout root2;
        if (contractAddressTokenInfo != null && (!((java.util.Collection) objectRef.element).isEmpty())) {
            c36759ogy.copydefault(contractAddressTokenInfo);
            C33897nJx c33897nJx = c36759ogy.KWHzl;
            if (c33897nJx != null && (root2 = c33897nJx.getRoot()) != null) {
                root2.setVisibility(0);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c36759ogy, true, (java.lang.String) null, 2, (java.lang.Object) null);
            objectRef2.element = CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) objectRef.element);
        } else {
            C33897nJx c33897nJx2 = c36759ogy.KWHzl;
            if (c33897nJx2 != null && (root = c33897nJx2.getRoot()) != null) {
                root.setVisibility(8);
            }
            objectRef2.element = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(ContractAddressTokenInfo contractAddressTokenInfo) {
        java.lang.String fiatSymbolWithSubscriptStyle$default;
        C33897nJx c33897nJx = this.KWHzl;
        if (c33897nJx != null) {
            android.widget.TextView textView = c33897nJx.isConnected;
            java.lang.String strAhwBna = contractAddressTokenInfo.AhwBna();
            if (strAhwBna == null) {
                strAhwBna = "Unknown";
            }
            textView.setText(strAhwBna);
            java.lang.String strValueOf = contractAddressTokenInfo.valueOf();
            if (strValueOf != null && strValueOf.length() != 0) {
                Intrinsics.copydefault(Glide.EZpvd(this).EZpvd(contractAddressTokenInfo.valueOf()).KWHzl(C52761wXj.TaskDescription.vLaW).copydefault(C52761wXj.TaskDescription.vLaW).gEmmrt().EZpvd(c33897nJx.values));
            } else {
                c33897nJx.values.setImageResource(C52761wXj.TaskDescription.vLaW);
            }
            java.lang.String strCopydefault = contractAddressTokenInfo.copydefault();
            if (strCopydefault != null && strCopydefault.length() != 0) {
                Intrinsics.copydefault(Glide.EZpvd(this).EZpvd(contractAddressTokenInfo.copydefault()).KWHzl(C52761wXj.TaskDescription.RSDDiY).copydefault(C52761wXj.TaskDescription.RSDDiY).gEmmrt().EZpvd(c33897nJx.KWHzl));
            } else {
                c33897nJx.KWHzl.setImageResource(C52761wXj.TaskDescription.RSDDiY);
            }
            java.util.List<ConversationIcon> listAEQbTJ = contractAddressTokenInfo.AEQbTJ();
            if (listAEQbTJ != null && !listAEQbTJ.isEmpty()) {
                oIV oiv = c33897nJx.EZpvd;
                Intrinsics.checkNotNullExpressionValue(oiv, "");
                oiv.setVisibility(0);
                oIV.setIcons$default(c33897nJx.EZpvd, contractAddressTokenInfo.AEQbTJ(), false, true, false, 10, null);
            } else {
                oIV oiv2 = c33897nJx.EZpvd;
                Intrinsics.checkNotNullExpressionValue(oiv2, "");
                oiv2.setVisibility(8);
            }
            java.lang.String strEZpvd = contractAddressTokenInfo.EZpvd();
            c33897nJx.valueOf.setText(strEZpvd != null ? sSQ.formatAddress$default(sSQ.KWHzl, strEZpvd, 4, 4, null, 4, null) : null);
            android.widget.LinearLayout linearLayout = c33897nJx.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            java.lang.String strKWHzl = contractAddressTokenInfo.KWHzl();
            linearLayout.setVisibility((strKWHzl == null || strKWHzl.length() == 0) ^ true ? 0 : 8);
            android.widget.TextView textView2 = c33897nJx.DbNXlk;
            java.lang.String strKWHzl2 = contractAddressTokenInfo.KWHzl();
            if (strKWHzl2 != null) {
                fiatSymbolWithSubscriptStyle$default = C38305pTw.formatFiatSymbolWithSubscriptStyle$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(strKWHzl2)), "USD", null, C38307pTy.Companion.copydefault(1, 5), null, null, 26, null);
                if (fiatSymbolWithSubscriptStyle$default == null) {
                    fiatSymbolWithSubscriptStyle$default = "$0.00";
                }
            }
            textView2.setText(fiatSymbolWithSubscriptStyle$default);
            C55251xgS c55251xgS = c33897nJx.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(Intrinsics.EZpvd(contractAddressTokenInfo.djBIcL(), java.lang.Boolean.TRUE) ? 0 : 8);
        }
    }
}
