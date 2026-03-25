package o;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
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
import o.InterfaceC56551yJo;
import o.InterfaceC59997ztZ;

/* JADX INFO: renamed from: o.ztn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60011ztn {
    public static /* synthetic */ InterfaceC56387yDm stateViewModel$default(final ComponentActivity componentActivity, final InterfaceC59997ztZ interfaceC59997ztZ, final Function0 function0, final Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            function0 = C60020ztw.AEQbTJ();
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.ActivityStateVMKt$stateViewModel$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModel invoke() {
                ComponentActivity componentActivity2 = componentActivity;
                InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
                Function0<Bundle> function03 = function0;
                Function0<C60053zuc> function04 = function02;
                ViewModelStore viewModelStore = componentActivity2.getViewModelStore();
                CreationExtras creationExtrasOLrzqt = C60008ztk.OLrzqt(function03.invoke(), componentActivity2);
                if (creationExtrasOLrzqt == null) {
                    creationExtrasOLrzqt = componentActivity2.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(creationExtrasOLrzqt, "");
                }
                CreationExtras creationExtras = creationExtrasOLrzqt;
                C60060zuj c60060zujCopydefault = C59931zsM.copydefault(componentActivity2);
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(ViewModel.class);
                Intrinsics.copydefault(viewModelStore);
                return C60003ztf.EZpvd(interfaceC56551yJoAEQbTJ, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : interfaceC59997ztZ2, c60060zujCopydefault, (4 & 64) != 0 ? null : function04);
            }
        });
    }

    public static /* synthetic */ ViewModel getStateViewModel$default(ComponentActivity componentActivity, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        InterfaceC59997ztZ interfaceC59997ztZ2 = (i & 1) != 0 ? null : interfaceC59997ztZ;
        if ((i & 2) != 0) {
            function0 = C60020ztw.AEQbTJ();
        }
        Function0 function03 = (i & 4) != 0 ? null : function02;
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras creationExtrasOLrzqt = C60008ztk.OLrzqt((android.os.Bundle) function0.invoke(), componentActivity);
        if (creationExtrasOLrzqt == null) {
            creationExtrasOLrzqt = componentActivity.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(creationExtrasOLrzqt, "");
        }
        C60060zuj c60060zujCopydefault = C59931zsM.copydefault(componentActivity);
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(ViewModel.class);
        Intrinsics.copydefault(viewModelStore);
        return C60003ztf.EZpvd(interfaceC56551yJoAEQbTJ, viewModelStore, (4 & 4) != 0 ? null : null, creationExtrasOLrzqt, (4 & 16) != 0 ? null : interfaceC59997ztZ2, c60060zujCopydefault, (4 & 64) != 0 ? null : function03);
    }
}
