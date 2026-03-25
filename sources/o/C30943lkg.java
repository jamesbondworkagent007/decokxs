package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.meme.viewmodel.MemeCurrencySelectionViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lkg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30943lkg extends AbstractC30898ljo {
    public int AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public Function1<? super MemeCurrencyBean, Unit> gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.lkg$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    public C30943lkg() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemePresetBaseCurrencyBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemePresetBaseCurrencyBottomSheet$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeCurrencySelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemePresetBaseCurrencyBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemePresetBaseCurrencyBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.MemePresetBaseCurrencyBottomSheet$special$$inlined$viewModels$default$5
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.lkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30943lkg.OLrzqt(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.lki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30943lkg.AEQbTJ(this.KWHzl);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.lkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30943lkg.AhwBna(this.KWHzl);
            }
        });
        this.AhwBna = TransactionType.Buy.getType();
    }

    public final MemeCurrencySelectionViewModel AhwBna() {
        return (MemeCurrencySelectionViewModel) this.AkhnZx.getValue();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String OLrzqt(C30943lkg c30943lkg) {
        java.lang.String string;
        android.os.Bundle arguments = c30943lkg.getArguments();
        return (arguments == null || (string = arguments.getString("chain_id")) == null) ? "" : string;
    }

    /* JADX DEBUG: Possible override for method o.ljo.EZpvd()V */
    public final java.lang.String EZpvd() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String AEQbTJ(C30943lkg c30943lkg) {
        java.lang.String string;
        android.os.Bundle arguments = c30943lkg.getArguments();
        return (arguments == null || (string = arguments.getString("currency_token_address")) == null) ? "" : string;
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.DbNXlk.getValue();
    }

    public static final java.lang.String AhwBna(C30943lkg c30943lkg) {
        java.lang.String string;
        android.os.Bundle arguments = c30943lkg.getArguments();
        return (arguments == null || (string = arguments.getString("transaction_token_address")) == null) ? "" : string;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.AhwBna = arguments != null ? arguments.getInt("extra_transaction_position", 0) : TransactionType.Buy.getType();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(4);
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        if (this.AhwBna == TransactionType.Buy.getType()) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.IMediaSession);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.onReceiveResult);
        }
        textViewAYXKKw.setText(strAYXKKw);
        C55296xhK.OLrzqt(wxq, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(12.0f));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AhwBna().EZpvd(C31125loC.KWHzl(this));
        AhwBna().EZpvd(valueOf(), "1", EZpvd(), gEmmrt(), C31125loC.KWHzl(this));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull final C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.EZpvd(new C30947lkk(null, 1, 0 == true ? 1 : 0));
        AhwBna().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30943lkg.KWHzl(c55198xfS, this, (java.util.List) obj);
            }
        }));
    }

    public static final Unit KWHzl(C55198xfS c55198xfS, final C30943lkg c30943lkg, java.util.List list) {
        Intrinsics.copydefault(list);
        c55198xfS.setSingleOneColumnData(list, new yHO() { // from class: o.lkp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C30943lkg.copydefault(this.copydefault, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C30943lkg c30943lkg, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super MemeCurrencyBean, Unit> function1 = c30943lkg.gEmmrt;
        if (function1 != null) {
            java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            Intrinsics.copydefault(objOLrzqt, "");
            function1.invoke((MemeCurrencyBean) objOLrzqt);
        }
        c30943lkg.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.lkg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lkg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C30943lkg copydefault(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i2, @NotNull Function1<? super MemeCurrencyBean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C30943lkg c30943lkg = new C30943lkg();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("chain_id", str);
            bundle.putString("currency_token_address", str2);
            bundle.putString("transaction_token_address", str3);
            bundle.putInt("extra_transaction_position", i2);
            C31125loC.copydefault(bundle, i);
            c30943lkg.setArguments(bundle);
            c30943lkg.gEmmrt = function1;
            return c30943lkg;
        }
    }
}
