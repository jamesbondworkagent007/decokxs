package o;

import android.content.ComponentCallbacks;
import androidx.exifinterface.media.ExifInterface;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56524yIo;
import o.C59931zsM;
import o.C60053zuc;
import o.C60060zuj;
import o.InterfaceC59997ztZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59932zsN {
    public static final C60022zty EZpvd(@NotNull android.content.ComponentCallbacks componentCallbacks) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "");
        return componentCallbacks instanceof InterfaceC59975ztD ? ((InterfaceC59975ztD) componentCallbacks).OLrzqt() : C59972ztA.EZpvd.copydefault();
    }

    public static /* synthetic */ InterfaceC56387yDm inject$default(final android.content.ComponentCallbacks componentCallbacks, final InterfaceC59997ztZ interfaceC59997ztZ, LazyThreadSafetyMode lazyThreadSafetyMode, final Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentCallbacks, "");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "");
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.android.ext.android.ComponentCallbackExtKt$inject$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
                Function0<C60053zuc> function02 = function0;
                C60060zuj c60060zujCopydefault = C59931zsM.copydefault(componentCallbacks2);
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) c60060zujCopydefault.AEQbTJ(C56524yIo.AEQbTJ(Object.class), interfaceC59997ztZ2, function02);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: o.zuj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(android.content.ComponentCallbacks componentCallbacks, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentCallbacks, "");
        C60060zuj c60060zujCopydefault = C59931zsM.copydefault(componentCallbacks);
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c60060zujCopydefault.AEQbTJ(C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function0);
    }
}
