package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.data.constant.TokenGroupActionType;
import com.okinc.business.market.features.address_tracker.TrackerGroupManageViewModel;
import com.okinc.business.market.features.address_tracker.TrackerGroupNameInputBottomSheet$createNewGroup$1;
import com.okinc.business.market.features.address_tracker.TrackerGroupNameInputBottomSheet$renameGroup$1;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jAw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25639jAw extends AbstractC25631jAo {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm KWHzl;

    public C25639jAw() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.address_tracker.TrackerGroupNameInputBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.address_tracker.TrackerGroupNameInputBottomSheet$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackerGroupManageViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker.TrackerGroupNameInputBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker.TrackerGroupNameInputBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker.TrackerGroupNameInputBottomSheet$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Possible override for method o.jAo.KWHzl()V */
    /* JADX DEBUG: Possible override for method o.jWT.KWHzl()Ljava/lang/String; */
    public final TrackerGroupManageViewModel KWHzl() {
        return (TrackerGroupManageViewModel) this.KWHzl.getValue();
    }

    /* JADX INFO: renamed from: o.jAw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jAw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C25639jAw newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.Integer num, TokenGroupActionType tokenGroupActionType, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return stateListAnimator.OLrzqt(str, num, tokenGroupActionType);
        }

        public final C25639jAw OLrzqt(@NotNull java.lang.String str, java.lang.Integer num, @NotNull TokenGroupActionType tokenGroupActionType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tokenGroupActionType, "");
            C25639jAw c25639jAw = new C25639jAw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("params.group_name", str);
            bundle.putParcelable("params.action", tokenGroupActionType);
            if (num != null) {
                num.intValue();
                bundle.putInt("params.group_id", num.intValue());
            }
            c25639jAw.setArguments(bundle);
            return c25639jAw;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.jWT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(int i, @NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) {
        TrackerGroupNameInputBottomSheet$renameGroup$1 trackerGroupNameInputBottomSheet$renameGroup$1;
        if (continuation instanceof TrackerGroupNameInputBottomSheet$renameGroup$1) {
            trackerGroupNameInputBottomSheet$renameGroup$1 = (TrackerGroupNameInputBottomSheet$renameGroup$1) continuation;
            int i2 = trackerGroupNameInputBottomSheet$renameGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackerGroupNameInputBottomSheet$renameGroup$1.label = i2 - Integer.MIN_VALUE;
            } else {
                trackerGroupNameInputBottomSheet$renameGroup$1 = new TrackerGroupNameInputBottomSheet$renameGroup$1(this, continuation);
            }
        }
        java.lang.Object obj = trackerGroupNameInputBottomSheet$renameGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = trackerGroupNameInputBottomSheet$renameGroup$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        TrackerGroupManageViewModel trackerGroupManageViewModelKWHzl = KWHzl();
        trackerGroupNameInputBottomSheet$renameGroup$1.label = 1;
        java.lang.Object objAEQbTJ = trackerGroupManageViewModelKWHzl.AEQbTJ(i, str, trackerGroupNameInputBottomSheet$renameGroup$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.jWT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) {
        TrackerGroupNameInputBottomSheet$createNewGroup$1 trackerGroupNameInputBottomSheet$createNewGroup$1;
        java.lang.Object objKWHzl;
        if (continuation instanceof TrackerGroupNameInputBottomSheet$createNewGroup$1) {
            trackerGroupNameInputBottomSheet$createNewGroup$1 = (TrackerGroupNameInputBottomSheet$createNewGroup$1) continuation;
            int i = trackerGroupNameInputBottomSheet$createNewGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerGroupNameInputBottomSheet$createNewGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerGroupNameInputBottomSheet$createNewGroup$1 = new TrackerGroupNameInputBottomSheet$createNewGroup$1(this, continuation);
            }
        }
        java.lang.Object obj = trackerGroupNameInputBottomSheet$createNewGroup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerGroupNameInputBottomSheet$createNewGroup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            TrackerGroupManageViewModel trackerGroupManageViewModelKWHzl = KWHzl();
            trackerGroupNameInputBottomSheet$createNewGroup$1.label = 1;
            objKWHzl = trackerGroupManageViewModelKWHzl.KWHzl(str, trackerGroupNameInputBottomSheet$createNewGroup$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            RxBus.AEQbTJ(new C25661jBr());
        }
        return objKWHzl;
    }

    @Override // o.jWT
    public java.lang.String AEQbTJ() {
        android.content.Context context = getContext();
        if (context != null) {
            return context.getString(C23274hvD.Fragment.cancelAll);
        }
        return null;
    }
}
