package o;

import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection.CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingTokenSelectionViewModel;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gTw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19910gTw extends gTD {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public Function2<? super DexMultiTokenInfoBean, ? super java.util.List<DexMultiTokenInfoBean>, Unit> KWHzl;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gTx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19910gTw.gEmmrt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gTy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19910gTw.AhwBna(this.copydefault);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.gTv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19910gTw.djBIcL(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.gTw$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gTw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<DexMultiTokenInfoBean> list, @NotNull Function2<? super DexMultiTokenInfoBean, ? super java.util.List<DexMultiTokenInfoBean>, Unit> function2) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function2, "");
            C19910gTw c19910gTw = new C19910gTw();
            c19910gTw.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("chain_id", str), C56390yDp.OLrzqt("token_address", str2), C56390yDp.OLrzqt("currency_token", new java.util.ArrayList(list))));
            c19910gTw.KWHzl = function2;
            c19910gTw.show(fragmentManager);
        }
    }

    public C19910gTw() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection.CopyTradingTokenSelectionBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection.CopyTradingTokenSelectionBottomSheet$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingTokenSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection.CopyTradingTokenSelectionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection.CopyTradingTokenSelectionBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection.CopyTradingTokenSelectionBottomSheet$special$$inlined$viewModels$default$5
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

    private final java.lang.String valueOf() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String gEmmrt(C19910gTw c19910gTw) {
        java.lang.String string;
        android.os.Bundle arguments = c19910gTw.getArguments();
        return (arguments == null || (string = arguments.getString("chain_id")) == null) ? "" : string;
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String AhwBna(C19910gTw c19910gTw) {
        java.lang.String string;
        android.os.Bundle arguments = c19910gTw.getArguments();
        return (arguments == null || (string = arguments.getString("token_address")) == null) ? "" : string;
    }

    /* JADX DEBUG: Possible override for method o.gTD.EZpvd()V */
    public final java.util.List<DexMultiTokenInfoBean> EZpvd() {
        return (java.util.List) this.copydefault.getValue();
    }

    public static final java.util.List djBIcL(C19910gTw c19910gTw) {
        android.os.Bundle arguments = c19910gTw.getArguments();
        java.util.List parcelableArrayList = arguments != null ? BundleCompat.getParcelableArrayList(arguments, "currency_token", DexMultiTokenInfoBean.class) : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(parcelableArrayList);
    }

    public final CopyTradingTokenSelectionViewModel AEQbTJ() {
        return (CopyTradingTokenSelectionViewModel) this.valueOf.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(4);
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.IMediaSession));
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        C55296xhK.OLrzqt(wxq, fValueOf, fValueOf, fValueOf, java.lang.Float.valueOf(12.0f));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ().OLrzqt(valueOf(), KWHzl(), EZpvd());
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.EZpvd(new C19904gTq());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1(this, c55198xfS, null), 3, null);
    }
}
