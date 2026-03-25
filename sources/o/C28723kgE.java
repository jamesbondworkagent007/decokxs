package o;

import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterBottomSheetParams;
import com.okinc.business.market.features.meme.protocol_filter.ui.MemeProtocolFilterViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28723kgE extends AbstractC26071jQw {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;

    public C28723kgE() {
        final Function0 function0 = new Function0() { // from class: o.kgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28723kgE.KWHzl(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterProtocolFragment$special$$inlined$viewModels$default$1
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeProtocolFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterProtocolFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterProtocolFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.filter.ui.MemeFilterProtocolFragment$special$$inlined$viewModels$default$4
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

    private final MemeProtocolFilterBottomSheetParams copydefault() {
        MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (memeProtocolFilterBottomSheetParams = (MemeProtocolFilterBottomSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.params.protocol_filter", MemeProtocolFilterBottomSheetParams.class))) == null) ? new MemeProtocolFilterBottomSheetParams(null, 0, 3, null) : memeProtocolFilterBottomSheetParams;
    }

    private final MemeProtocolFilterViewModel AYXKKw() {
        return (MemeProtocolFilterViewModel) this.AEQbTJ.getValue();
    }

    public static final ViewModelStoreOwner KWHzl(C28723kgE c28723kgE) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c28723kgE.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.AbstractC26071jQw
    public void OLrzqt() {
        MemeProtocolFilterViewModel memeProtocolFilterViewModelAYXKKw = AYXKKw();
        java.util.List<ProtocolInfoData> listCopydefault = copydefault().EZpvd().copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (ProtocolInfoData protocolInfoData : listCopydefault) {
            arrayList.add(new InterfaceC28823khz.ActionBar(protocolInfoData.getProtocolId(), protocolInfoData.getProtocolName(), protocolInfoData.getProtocolLogo(), copydefault().EZpvd().OLrzqt().contains(protocolInfoData.getProtocolId())));
        }
        memeProtocolFilterViewModelAYXKKw.AEQbTJ(arrayList);
    }

    @Override // o.AbstractC26071jQw
    public Flow<java.util.List<InterfaceC28823khz.ActionBar>> EZpvd() {
        return AYXKKw().OLrzqt();
    }

    @Override // o.AbstractC26071jQw
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AYXKKw().AEQbTJ(str);
    }

    @Override // o.AbstractC26071jQw
    public void AEQbTJ() {
        AYXKKw().AEQbTJ();
    }

    @Override // o.AbstractC26071jQw
    public void gEmmrt() {
        AYXKKw().copydefault();
    }

    /* JADX INFO: renamed from: o.kgE$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kgE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C28723kgE EZpvd(MemeProtocolFilterBottomSheetParams memeProtocolFilterBottomSheetParams) {
            C28723kgE c28723kgE = new C28723kgE();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params.protocol_filter", memeProtocolFilterBottomSheetParams);
            c28723kgE.setArguments(bundle);
            return c28723kgE;
        }
    }
}
