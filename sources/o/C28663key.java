package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheet$initListener$1;
import com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheetParams;
import com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.key, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28663key extends AbstractC28616keD {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C23397hxU copydefault;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C28663key() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheet$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ApedTogetherViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.aped_together.ui.ApedTogetherBottomSheet$special$$inlined$viewModels$default$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28663key.AYXKKw(this.KWHzl);
            }
        });
    }

    public final C23397hxU KWHzl() {
        C23397hxU c23397hxU = this.copydefault;
        Intrinsics.copydefault(c23397hxU);
        return c23397hxU;
    }

    public final ApedTogetherViewModel OLrzqt() {
        return (ApedTogetherViewModel) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Possible override for method o.keD.EZpvd()V */
    public final C28658ket EZpvd() {
        return (C28658ket) this.KWHzl.getValue();
    }

    public static final C28658ket AYXKKw(final C28663key c28663key) {
        return new C28658ket(new Function1() { // from class: o.keA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28663key.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.kew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28663key.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(C28663key c28663key, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = c28663key.getActivity();
        C25352ivB.EZpvd(activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null, str, c28663key.AEQbTJ().AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C28663key c28663key, java.lang.String str) {
        ConstraintLayout root;
        android.content.Context context;
        Intrinsics.checkNotNullParameter(str, "");
        C23397hxU c23397hxU = c28663key.copydefault;
        if (c23397hxU != null && (root = c23397hxU.getRoot()) != null && (context = root.getContext()) != null) {
            C33570myu.EZpvd(context, str);
            C55328xhq.show$default(C55328xhq.OLrzqt, context.getString(C23274hvD.Fragment.DGOPHZDGOPHZ), C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final ApedTogetherBottomSheetParams AEQbTJ() {
        ApedTogetherBottomSheetParams apedTogetherBottomSheetParams = (ApedTogetherBottomSheetParams) requireArguments().getParcelable("key.aped_together");
        return apedTogetherBottomSheetParams == null ? new ApedTogetherBottomSheetParams(null, null, 3, null) : apedTogetherBottomSheetParams;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C23397hxU.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        OLrzqt().KWHzl(AEQbTJ().AEQbTJ(), AEQbTJ().OLrzqt());
        C23397hxU c23397hxUKWHzl = KWHzl();
        c23397hxUKWHzl.AEQbTJ.setAdapter(EZpvd());
        c23397hxUKWHzl.AEQbTJ.setItemAnimator(null);
        AYXKKw();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AYXKKw().setText(wxq.getContext().getString(C23274hvD.Fragment.iCPUKe));
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(0);
    }

    public final void AYXKKw() {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ApedTogetherBottomSheet$initListener$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.key$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.key.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C28663key EZpvd(@NotNull ApedTogetherBottomSheetParams apedTogetherBottomSheetParams) {
            Intrinsics.checkNotNullParameter(apedTogetherBottomSheetParams, "");
            C28663key c28663key = new C28663key();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.aped_together", apedTogetherBottomSheetParams);
            c28663key.setArguments(bundle);
            return c28663key;
        }
    }
}
