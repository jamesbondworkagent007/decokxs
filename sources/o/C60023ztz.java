package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56524yIo;
import o.C60053zuc;
import o.C60060zuj;
import o.InterfaceC59974ztC;
import o.InterfaceC59975ztD;
import o.InterfaceC59997ztZ;

/* JADX INFO: renamed from: o.ztz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60023ztz {
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: o.zuj */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: o.zuj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object get$default(InterfaceC59975ztD interfaceC59975ztD, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(interfaceC59975ztD, "");
        if (interfaceC59975ztD instanceof InterfaceC59974ztC) {
            C60060zuj c60060zujCopydefault = ((InterfaceC59974ztC) interfaceC59975ztD).copydefault();
            Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
            return c60060zujCopydefault.AEQbTJ(C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function0);
        }
        C60060zuj c60060zujOLrzqt = interfaceC59975ztD.OLrzqt().EZpvd().OLrzqt();
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        return c60060zujOLrzqt.AEQbTJ(C56524yIo.AEQbTJ(java.lang.Object.class), interfaceC59997ztZ, function0);
    }

    public static /* synthetic */ InterfaceC56387yDm inject$default(final InterfaceC59975ztD interfaceC59975ztD, final InterfaceC59997ztZ interfaceC59997ztZ, LazyThreadSafetyMode lazyThreadSafetyMode, final Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = C60071zuu.OLrzqt.EZpvd();
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(interfaceC59975ztD, "");
        Intrinsics.checkNotNullParameter(lazyThreadSafetyMode, "");
        Intrinsics.OLrzqt();
        return C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<T>() { // from class: org.koin.core.component.KoinComponentKt$inject$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                C60060zuj c60060zujOLrzqt;
                InterfaceC59975ztD interfaceC59975ztD2 = interfaceC59975ztD;
                InterfaceC59997ztZ interfaceC59997ztZ2 = interfaceC59997ztZ;
                Function0<C60053zuc> function02 = function0;
                if (interfaceC59975ztD2 instanceof InterfaceC59974ztC) {
                    c60060zujOLrzqt = ((InterfaceC59974ztC) interfaceC59975ztD2).copydefault();
                } else {
                    c60060zujOLrzqt = interfaceC59975ztD2.OLrzqt().EZpvd().OLrzqt();
                }
                Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) c60060zujOLrzqt.AEQbTJ(C56524yIo.AEQbTJ(Object.class), interfaceC59997ztZ2, function02);
            }
        });
    }
}
