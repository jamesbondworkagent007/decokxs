package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import o.AbstractC27165jpz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iTw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC24072iTw<T extends AbstractC27165jpz> extends AbstractC32998moE {
    public final InterfaceC56387yDm AEQbTJ;
    public final Observer<InvestTransactionModel> EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iTs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC24072iTw.KWHzl(this.KWHzl);
        }
    });

    public abstract void AEQbTJ(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull InvestTransactionModel investTransactionModel) {
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
    }

    public abstract void EZpvd(boolean z);

    public abstract java.lang.Class<T> OLrzqt();

    public abstract android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    public static final AbstractC27165jpz KWHzl(AbstractC24072iTw abstractC24072iTw) {
        return (AbstractC27165jpz) new ViewModelProvider(abstractC24072iTw).get(abstractC24072iTw.OLrzqt());
    }

    private final C23611iCu<InvestTransactionModel> EZpvd() {
        return (C23611iCu) this.AEQbTJ.getValue();
    }

    public static final void KWHzl(AbstractC24072iTw abstractC24072iTw, InvestTransactionModel investTransactionModel) {
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        abstractC24072iTw.EZpvd(investTransactionModel);
    }

    public static final C33622mzt KWHzl() {
        return new C33622mzt();
    }

    /* JADX INFO: renamed from: o.iTw$ActionBar */
    public static final class ActionBar implements Function1<java.lang.String, InvestTransactionModel> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final InvestTransactionModel invoke(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InvestTransactionModel.Companion.serializer(), str);
        }
    }

    /* JADX INFO: renamed from: o.iTw$StateListAnimator */
    public static final class StateListAnimator implements Function0<java.lang.Object> {
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.lang.String str, Function1 function1) {
            this.copydefault = str;
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.iTw$StateListAnimator$2] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass2 invoke() {
            final java.lang.String str = this.copydefault;
            final Function1 function1 = this.OLrzqt;
            return new ViewModelProvider.Factory() { // from class: o.iTw.StateListAnimator.2
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(java.lang.Class<T> cls) {
                    Intrinsics.checkNotNullParameter(cls, "");
                    return (T) new C23611iCu(str, function1);
                }
            };
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return copydefault(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EZpvd().KWHzl().removeObserver(this.EZpvd);
    }

    public static /* synthetic */ void showKeyboardLayout$default(AbstractC24072iTw abstractC24072iTw, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showKeyboardLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractC24072iTw.AEQbTJ(z);
    }

    public static /* synthetic */ void showConfirmLayout$default(AbstractC24072iTw abstractC24072iTw, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showConfirmLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractC24072iTw.EZpvd(z);
    }

    public AbstractC24072iTw() {
        StateListAnimator stateListAnimator = new StateListAnimator("invest-tx-status-toast", ActionBar.OLrzqt);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.page.base.BaseInvestPlaceOrderFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.page.base.BaseInvestPlaceOrderFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C23611iCu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.base.BaseInvestPlaceOrderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.base.BaseInvestPlaceOrderFragment$special$$inlined$viewModels$default$4
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
        }, stateListAnimator);
        this.EZpvd = new Observer() { // from class: o.iTu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                AbstractC24072iTw.KWHzl(this.KWHzl, (InvestTransactionModel) obj);
            }
        };
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC24072iTw.KWHzl();
            }
        });
    }
}
