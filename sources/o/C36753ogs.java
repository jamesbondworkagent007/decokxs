package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.messageV2.view.banner.bannerlist.BannerListFragment$initView$1;
import com.okinc.im.imui.messageV2.view.banner.bannerlist.BannerListFragment$initView$2;
import com.okinc.im.imui.messageV2.view.banner.bannerlist.BannerListViewModel;
import com.okinc.okimcore.model.remote.GroupBannerList;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ogs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36753ogs extends AbstractC36757ogw {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C33884nJk AEQbTJ;
    public final int EZpvd = C35399nuc.Dialog.giSNqX;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.ogs$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ogs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C36753ogs AEQbTJ(java.lang.String str) {
            C36753ogs c36753ogs = new C36753ogs();
            c36753ogs.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_CHANNEL_ID", str)));
            return c36753ogs;
        }
    }

    public C36753ogs() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.messageV2.view.banner.bannerlist.BannerListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.messageV2.view.banner.bannerlist.BannerListFragment$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BannerListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageV2.view.banner.bannerlist.BannerListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageV2.view.banner.bannerlist.BannerListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageV2.view.banner.bannerlist.BannerListFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ogt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36753ogs.AEQbTJ(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.ogw.OLrzqt()V */
    public final BannerListViewModel OLrzqt() {
        return (BannerListViewModel) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String AEQbTJ(C36753ogs c36753ogs) {
        android.os.Bundle arguments = c36753ogs.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_CHANNEL_ID");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33884nJk c33884nJkEZpvd = C33884nJk.EZpvd(layoutInflater, viewGroup, false);
        this.AEQbTJ = c33884nJkEZpvd;
        if (c33884nJkEZpvd != null) {
            return c33884nJkEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        MutableStateFlow<GroupBannerList> mutableStateFlowOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(mutableStateFlowOLrzqt, viewLifecycleOwner, (Lifecycle.State) null, new BannerListFragment$initView$1(this, null), 2, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BannerListFragment$initView$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int KWHzl(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }
}
