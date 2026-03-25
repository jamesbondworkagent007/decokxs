package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.transfer.receive.SmartWalletChainInfoBottomSheet$renderContent$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gsW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21053gsW extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public StateListAnimator EZpvd;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.gsW$StateListAnimator */
    public interface StateListAnimator {
        void copydefault();
    }

    public C21053gsW() {
        final Function0 function0 = new Function0() { // from class: o.gsX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21053gsW.AEQbTJ(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.transfer.receive.SmartWalletChainInfoBottomSheet$special$$inlined$viewModels$default$1
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C21052gsV.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.receive.SmartWalletChainInfoBottomSheet$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.receive.SmartWalletChainInfoBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transfer.receive.SmartWalletChainInfoBottomSheet$special$$inlined$viewModels$default$4
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

    /* JADX INFO: renamed from: o.gsW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gsW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C21053gsW KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C21053gsW c21053gsW = new C21053gsW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("wallet_id", str);
            c21053gsW.setArguments(bundle);
            return c21053gsW;
        }
    }

    public final C21052gsV EZpvd() {
        return (C21052gsV) this.copydefault.getValue();
    }

    public static final ViewModelStoreOwner AEQbTJ(C21053gsW c21053gsW) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c21053gsW.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public static /* synthetic */ void show$default(C21053gsW c21053gsW, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            stateListAnimator = null;
        }
        c21053gsW.OLrzqt(fragmentManager, str, stateListAnimator);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        super.show(fragmentManager, str);
        this.EZpvd = stateListAnimator;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C21052gsV c21052gsVEZpvd = EZpvd();
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("wallet_id") : null;
        c21052gsVEZpvd.EZpvd(string != null ? string : "");
        KWHzl(constraintLayout);
    }

    public final void KWHzl(ConstraintLayout constraintLayout) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(java.lang.String.class, new C20989grL());
        AbstractC16541elq abstractC16541elq = (AbstractC16541elq) DataBindingUtil.inflate(getCustomLayoutInflater(), C13754dXa.TaskDescription.hvKCwS, constraintLayout, true);
        abstractC16541elq.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.InspectableProperty));
        abstractC16541elq.OLrzqt.setAdapter(c59534zip);
        abstractC16541elq.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions));
        C52794wYp c52794wYp = abstractC16541elq.EZpvd;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SmartWalletChainInfoBottomSheet$renderContent$1(this, abstractC16541elq, c59534zip, null), 3, null);
    }

    /* JADX INFO: renamed from: o.gsW$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C21053gsW EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C21053gsW c21053gsW) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c21053gsW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                StateListAnimator stateListAnimator = this.EZpvd.EZpvd;
                if (stateListAnimator != null) {
                    stateListAnimator.copydefault();
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
