package o;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
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
import o.C60053zuc;
import o.C60060zuj;
import o.InterfaceC59997ztZ;

/* JADX INFO: renamed from: o.ztp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60013ztp {
    public static /* synthetic */ InterfaceC56387yDm viewModel$default(final androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        final InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        if ((i & 2) != 0) {
            function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentVMKt$viewModel$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return fragment;
                }
            };
        }
        final Function0 function04 = function0;
        final Function0 function05 = (i & 4) != 0 ? null : function02;
        final Function0 function06 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function04, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentVMKt$viewModel$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> */
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
                CreationExtras defaultViewModelCreationExtras;
                Fragment fragment2 = fragment;
                InterfaceC59997ztZ interfaceC59997ztZ3 = interfaceC59997ztZ2;
                Function0<ViewModelStoreOwner> function07 = function04;
                Function0<CreationExtras> function08 = function05;
                Function0<C60053zuc> function09 = function06;
                ViewModelStore viewModelStore = function07.invoke().getViewModelStore();
                if (function08 == null || (defaultViewModelCreationExtras = function08.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment2.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                C60060zuj c60060zujCopydefault = C59931zsM.copydefault(fragment2);
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                return C60003ztf.EZpvd(C56524yIo.AEQbTJ(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : interfaceC59997ztZ3, c60060zujCopydefault, (4 & 64) != 0 ? null : function09);
            }
        });
    }

    public static /* synthetic */ ViewModel getViewModel$default(final androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        CreationExtras defaultViewModelCreationExtras;
        InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        Function0 function04 = (i & 2) != 0 ? new Function0<androidx.fragment.app.Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentVMKt$getViewModel$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        } : function0;
        Function0 function05 = (i & 4) != 0 ? null : function02;
        Function0 function06 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function04, "");
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) function04.invoke()).getViewModelStore();
        if (function05 == null || (defaultViewModelCreationExtras = (CreationExtras) function05.invoke()) == null) {
            defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
        }
        C60060zuj c60060zujCopydefault = C59931zsM.copydefault(fragment);
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return C60003ztf.EZpvd(C56524yIo.AEQbTJ(ViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, defaultViewModelCreationExtras, (4 & 16) != 0 ? null : interfaceC59997ztZ2, c60060zujCopydefault, (4 & 64) != 0 ? null : function06);
    }
}
