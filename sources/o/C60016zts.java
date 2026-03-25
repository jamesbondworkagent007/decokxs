package o;

import android.os.Bundle;
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
import o.C60008ztk;
import o.C60053zuc;
import o.C60060zuj;
import o.InterfaceC59997ztZ;

/* JADX INFO: renamed from: o.zts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60016zts {
    public static /* synthetic */ InterfaceC56387yDm stateViewModel$default(final androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        final InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        if ((i & 2) != 0) {
            function0 = C60020ztw.AEQbTJ();
        }
        final Function0 function04 = function0;
        if ((i & 4) != 0) {
            function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt$stateViewModel$1
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
        final Function0 function05 = function02;
        final Function0 function06 = (i & 8) != 0 ? null : function03;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt$stateViewModel$2
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

    public static /* synthetic */ ViewModel getStateViewModel$default(final androidx.fragment.app.Fragment fragment, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        Function0 function0AEQbTJ = (i & 2) != 0 ? C60020ztw.AEQbTJ() : function0;
        Function0 function04 = (i & 4) != 0 ? new Function0<androidx.fragment.app.Fragment>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentStateVMKt$getStateViewModel$1
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
}
