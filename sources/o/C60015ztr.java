package o;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C59931zsM;
import o.C60003ztf;
import o.C60008ztk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60015ztr {
    public static final <T extends ViewModel> InterfaceC56387yDm<T> KWHzl(@NotNull final ComponentActivity componentActivity, @NotNull final InterfaceC56551yJo<T> interfaceC56551yJo, final InterfaceC59997ztZ interfaceC59997ztZ, @NotNull final ViewModelStoreOwner viewModelStoreOwner, final Function0<android.os.Bundle> function0, final java.lang.String str, final Function0<? extends C60053zuc> function02) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        final ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        return C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt$viewModelForClass$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                CreationExtras creationExtrasOLrzqt;
                Bundle bundleInvoke;
                Function0<Bundle> function03 = function0;
                if (function03 == null || (bundleInvoke = function03.invoke()) == null || (creationExtrasOLrzqt = C60008ztk.OLrzqt(bundleInvoke, viewModelStoreOwner)) == null) {
                    creationExtrasOLrzqt = CreationExtras.Empty.INSTANCE;
                }
                return C60003ztf.EZpvd(interfaceC56551yJo, viewModelStore, str, creationExtrasOLrzqt, interfaceC59997ztZ, C59931zsM.copydefault(componentActivity), function02);
            }
        });
    }

    public static final <T extends ViewModel> InterfaceC56387yDm<T> KWHzl(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull final InterfaceC56551yJo<T> interfaceC56551yJo, final InterfaceC59997ztZ interfaceC59997ztZ, @NotNull final Function0<? extends ViewModelStoreOwner> function0, final Function0<android.os.Bundle> function02, final java.lang.String str, final Function0<? extends C60053zuc> function03) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt$viewModelForClass$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                CreationExtras creationExtrasOLrzqt;
                Bundle bundleInvoke;
                ViewModelStoreOwner viewModelStoreOwnerInvoke = function0.invoke();
                ViewModelStore viewModelStore = viewModelStoreOwnerInvoke.getViewModelStore();
                Function0<Bundle> function04 = function02;
                if (function04 == null || (bundleInvoke = function04.invoke()) == null || (creationExtrasOLrzqt = C60008ztk.OLrzqt(bundleInvoke, viewModelStoreOwnerInvoke)) == null) {
                    creationExtrasOLrzqt = CreationExtras.Empty.INSTANCE;
                }
                return C60003ztf.EZpvd(interfaceC56551yJo, viewModelStore, str, creationExtrasOLrzqt, interfaceC59997ztZ, C59931zsM.copydefault(fragment), function03);
            }
        });
    }

    public static /* synthetic */ InterfaceC56387yDm getLazyViewModelForClass$default(InterfaceC56551yJo interfaceC56551yJo, ViewModelStoreOwner viewModelStoreOwner, C60060zuj c60060zuj, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, java.lang.String str, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            c60060zuj = C59972ztA.EZpvd.copydefault().EZpvd().OLrzqt();
        }
        return AEQbTJ(interfaceC56551yJo, viewModelStoreOwner, c60060zuj, (i & 8) != 0 ? null : interfaceC59997ztZ, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : function02);
    }

    public static final <T extends ViewModel> InterfaceC56387yDm<T> AEQbTJ(@NotNull final InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull final ViewModelStoreOwner viewModelStoreOwner, @NotNull final C60060zuj c60060zuj, final InterfaceC59997ztZ interfaceC59997ztZ, final Function0<android.os.Bundle> function0, final java.lang.String str, final Function0<? extends C60053zuc> function02) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        final ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        return C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.ViewModelLazyKt$getLazyViewModelForClass$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                CreationExtras creationExtrasOLrzqt;
                Bundle bundleInvoke;
                Function0<Bundle> function03 = function0;
                if (function03 == null || (bundleInvoke = function03.invoke()) == null || (creationExtrasOLrzqt = C60008ztk.OLrzqt(bundleInvoke, viewModelStoreOwner)) == null) {
                    creationExtrasOLrzqt = CreationExtras.Empty.INSTANCE;
                }
                return C60003ztf.EZpvd(interfaceC56551yJo, viewModelStore, str, creationExtrasOLrzqt, interfaceC59997ztZ, c60060zuj, function02);
            }
        });
    }
}
