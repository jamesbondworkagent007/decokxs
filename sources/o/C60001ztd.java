package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60001ztd {
    public static final C60060zuj KWHzl(@NotNull ComponentActivity componentActivity, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        return C59932zsN.EZpvd(componentActivity).OLrzqt(C59973ztB.KWHzl(componentActivity), C59973ztB.OLrzqt(componentActivity), obj);
    }

    public static /* synthetic */ C60060zuj createScope$default(ComponentActivity componentActivity, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return KWHzl(componentActivity, obj);
    }

    public static final C60060zuj EZpvd(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        return C59932zsN.EZpvd(componentActivity).OLrzqt(C59973ztB.KWHzl(componentActivity));
    }

    public static final C60060zuj OLrzqt(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        if (!(componentActivity instanceof InterfaceC59938zsT)) {
            throw new java.lang.IllegalStateException("Activity should implement AndroidScopeComponent".toString());
        }
        C60060zuj c60060zujOLrzqt = C59932zsN.EZpvd(componentActivity).OLrzqt(C59973ztB.KWHzl(componentActivity));
        return c60060zujOLrzqt == null ? OLrzqt(componentActivity, componentActivity) : c60060zujOLrzqt;
    }

    /* JADX INFO: renamed from: o.ztd$Activity */
    public static final class Activity implements InterfaceC60062zul {
        public final /* synthetic */ LifecycleOwner EZpvd;

        public Activity(LifecycleOwner lifecycleOwner) {
            this.EZpvd = lifecycleOwner;
        }

        @Override // o.InterfaceC60062zul
        public void copydefault(@NotNull C60060zuj c60060zuj) {
            Intrinsics.checkNotNullParameter(c60060zuj, "");
            LifecycleOwner lifecycleOwner = this.EZpvd;
            Intrinsics.copydefault(lifecycleOwner, "");
            ((InterfaceC59938zsT) lifecycleOwner).copydefault();
        }
    }

    public static final C60060zuj OLrzqt(@NotNull android.content.ComponentCallbacks componentCallbacks, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        C60060zuj c60060zujOLrzqt = C59932zsN.EZpvd(componentCallbacks).OLrzqt(C59973ztB.KWHzl(componentCallbacks), C59973ztB.OLrzqt(componentCallbacks), componentCallbacks);
        c60060zujOLrzqt.EZpvd(new Activity(lifecycleOwner));
        AEQbTJ(lifecycleOwner, c60060zujOLrzqt);
        return c60060zujOLrzqt;
    }

    public static final void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull final C60060zuj c60060zuj) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$registerScopeForLifecycle$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(@NotNull LifecycleOwner lifecycleOwner2) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                super.onDestroy(lifecycleOwner2);
                c60060zuj.KWHzl();
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C60060zuj KWHzl(@NotNull final ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        if (!(componentActivity instanceof InterfaceC59938zsT)) {
            throw new java.lang.IllegalStateException("Activity should implement AndroidScopeComponent".toString());
        }
        final Function0 function0 = null;
        C60002zte c60002zte = (C60002zte) new ViewModelLazy(C56524yIo.AEQbTJ(C60002zte.class), new Function0<ViewModelStore>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = componentActivity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: org.koin.androidx.scope.ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$3
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }).getValue();
        if (c60002zte.copydefault() == null) {
            c60002zte.EZpvd(C60022zty.createScope$default(C59932zsN.EZpvd(componentActivity), C59973ztB.KWHzl(componentActivity), C59973ztB.OLrzqt(componentActivity), null, 4, null));
        }
        C60060zuj c60060zujCopydefault = c60002zte.copydefault();
        Intrinsics.copydefault(c60060zujCopydefault);
        return c60060zujCopydefault;
    }
}
