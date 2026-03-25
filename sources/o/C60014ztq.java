package o;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56524yIo;
import o.C59931zsM;
import o.C60003ztf;
import o.C60008ztk;
import o.C60014ztq;
import o.C60053zuc;
import o.C60060zuj;
import o.InterfaceC59997ztZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60014ztq {
    public static /* synthetic */ InterfaceC56387yDm sharedStateViewModel$default(final androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        final InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        if ((i & 2) != 0) {
            function0 = C60020ztw.AEQbTJ();
        }
        final Function0 function04 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt$sharedStateViewModel$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final FragmentActivity invoke() {
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    return fragmentActivityRequireActivity;
                }
            };
        }
        final Function0 function05 = function02;
        final Function0 function06 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt$sharedStateViewModel$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                Fragment fragment2 = fragment;
                InterfaceC59997ztZ interfaceC59997ztZ3 = interfaceC59997ztZ2;
                Function0<Bundle> function07 = function04;
                Function0<ViewModelStoreOwner> function08 = function05;
                Function0<C60053zuc> function09 = function06;
                ViewModelStore viewModelStore = function08.invoke().getViewModelStore();
                CreationExtras creationExtrasOLrzqt = C60008ztk.OLrzqt(function07.invoke(), fragment2);
                if (creationExtrasOLrzqt == null) {
                    creationExtrasOLrzqt = fragment2.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(creationExtrasOLrzqt, "");
                }
                CreationExtras creationExtras = creationExtrasOLrzqt;
                C60060zuj c60060zujCopydefault = C59931zsM.copydefault(fragment2);
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                return C60003ztf.EZpvd(C56524yIo.AEQbTJ(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : interfaceC59997ztZ3, c60060zujCopydefault, (4 & 64) != 0 ? null : function09);
            }
        });
    }

    public static /* synthetic */ InterfaceC56387yDm sharedStateViewModel$default(final androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, InterfaceC56551yJo interfaceC56551yJo, Function0 function03, int i, java.lang.Object obj) {
        InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        if ((i & 2) != 0) {
            function0 = C60020ztw.AEQbTJ();
        }
        Function0 function04 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt$sharedStateViewModel$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final FragmentActivity invoke() {
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    return fragmentActivityRequireActivity;
                }
            };
        }
        return OLrzqt(fragment, interfaceC59997ztZ2, function04, function02, interfaceC56551yJo, (i & 16) != 0 ? null : function03);
    }

    public static final <T extends ViewModel> InterfaceC56387yDm<T> OLrzqt(@NotNull final androidx.fragment.app.Fragment fragment, final InterfaceC59997ztZ interfaceC59997ztZ, @NotNull final Function0<android.os.Bundle> function0, @NotNull final Function0<? extends ViewModelStoreOwner> function02, @NotNull final InterfaceC56551yJo<T> interfaceC56551yJo, final Function0<? extends C60053zuc> function03) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt$sharedStateViewModel$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> */
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                return C60014ztq.KWHzl(fragment, interfaceC59997ztZ, function0, function02, interfaceC56551yJo, function03);
            }
        });
    }

    public static /* synthetic */ ViewModel getSharedStateViewModel$default(final androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        Function0 function0AEQbTJ = (i & 2) != 0 ? C60020ztw.AEQbTJ() : function0;
        Function0 function04 = (i & 4) != 0 ? new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt$getSharedStateViewModel$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final FragmentActivity invoke() {
                FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                return fragmentActivityRequireActivity;
            }
        } : function02;
        Function0 function05 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function0AEQbTJ, "");
        Intrinsics.checkNotNullParameter(function04, "");
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) function04.invoke()).getViewModelStore();
        CreationExtras creationExtrasOLrzqt = C60008ztk.OLrzqt((android.os.Bundle) function0AEQbTJ.invoke(), fragment);
        if (creationExtrasOLrzqt == null) {
            creationExtrasOLrzqt = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(creationExtrasOLrzqt, "");
        }
        C60060zuj c60060zujCopydefault = C59931zsM.copydefault(fragment);
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return C60003ztf.EZpvd(C56524yIo.AEQbTJ(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, creationExtrasOLrzqt, (4 & 16) != 0 ? null : interfaceC59997ztZ2, c60060zujCopydefault, (4 & 64) != 0 ? null : function05);
    }

    public static /* synthetic */ ViewModel getSharedStateViewModel$default(final androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, InterfaceC56551yJo interfaceC56551yJo, Function0 function03, int i, java.lang.Object obj) {
        InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        if ((i & 2) != 0) {
            function0 = C60020ztw.AEQbTJ();
        }
        Function0 function04 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<FragmentActivity>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentSharedStateVMKt$getSharedStateViewModel$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final FragmentActivity invoke() {
                    FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    return fragmentActivityRequireActivity;
                }
            };
        }
        return KWHzl(fragment, interfaceC59997ztZ2, function04, function02, interfaceC56551yJo, (i & 16) != 0 ? null : function03);
    }

    public static final <T extends ViewModel> T KWHzl(@NotNull androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, @NotNull Function0<android.os.Bundle> function0, @NotNull Function0<? extends ViewModelStoreOwner> function02, @NotNull InterfaceC56551yJo<T> interfaceC56551yJo, Function0<? extends C60053zuc> function03) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        ViewModelStore viewModelStore = function02.invoke().getViewModelStore();
        CreationExtras creationExtrasOLrzqt = C60008ztk.OLrzqt(function0.invoke(), fragment);
        if (creationExtrasOLrzqt == null) {
            creationExtrasOLrzqt = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(creationExtrasOLrzqt, "");
        }
        return (T) C60003ztf.EZpvd(interfaceC56551yJo, viewModelStore, (4 & 4) != 0 ? null : null, creationExtrasOLrzqt, (4 & 16) != 0 ? null : interfaceC59997ztZ, C59931zsM.copydefault(fragment), (4 & 64) != 0 ? null : function03);
    }
}
