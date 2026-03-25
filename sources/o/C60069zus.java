package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C60069zus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zus, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60069zus {
    public static final C60069zus AEQbTJ = new C60069zus();

    private C60069zus() {
    }

    public static /* synthetic */ InterfaceC56387yDm inject$default(java.lang.Class cls, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return OLrzqt(cls, interfaceC59997ztZ, function0);
    }

    public static final <T> InterfaceC56387yDm<T> OLrzqt(@NotNull final java.lang.Class<?> cls, final InterfaceC59997ztZ interfaceC59997ztZ, final Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(cls, "");
        return C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<T>() { // from class: org.koin.java.KoinJavaComponent$inject$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) C60069zus.EZpvd(cls, interfaceC59997ztZ, function0);
            }
        });
    }

    public static /* synthetic */ InterfaceC56387yDm injectOrNull$default(java.lang.Class cls, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return AEQbTJ(cls, interfaceC59997ztZ, function0);
    }

    public static final <T> InterfaceC56387yDm<T> AEQbTJ(@NotNull final java.lang.Class<?> cls, final InterfaceC59997ztZ interfaceC59997ztZ, final Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(cls, "");
        return C56392yDr.copydefault(new Function0<T>() { // from class: org.koin.java.KoinJavaComponent$injectOrNull$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zuc> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) C60069zus.KWHzl(cls, interfaceC59997ztZ, function0);
            }
        });
    }

    public static /* synthetic */ java.lang.Object get$default(java.lang.Class cls, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return EZpvd(cls, interfaceC59997ztZ, function0);
    }

    public static final <T> T EZpvd(@NotNull java.lang.Class<?> cls, InterfaceC59997ztZ interfaceC59997ztZ, Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) EZpvd().EZpvd(yHE.KWHzl(cls), interfaceC59997ztZ, function0);
    }

    public static /* synthetic */ java.lang.Object getOrNull$default(java.lang.Class cls, InterfaceC59997ztZ interfaceC59997ztZ, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC59997ztZ = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return KWHzl(cls, interfaceC59997ztZ, function0);
    }

    public static final <T> T KWHzl(@NotNull java.lang.Class<?> cls, InterfaceC59997ztZ interfaceC59997ztZ, Function0<? extends C60053zuc> function0) {
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) EZpvd().copydefault(yHE.KWHzl(cls), interfaceC59997ztZ, function0);
    }

    public static final C60022zty EZpvd() {
        return C60071zuu.OLrzqt.AEQbTJ().copydefault();
    }
}
