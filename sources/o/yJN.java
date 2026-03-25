package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJN {
    public static final java.lang.reflect.Field KWHzl(@NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(yja, "");
        AbstractC56615yLy<?> abstractC56615yLyOLrzqt = yLX.OLrzqt(yja);
        if (abstractC56615yLyOLrzqt != null) {
            return abstractC56615yLyOLrzqt.values();
        }
        return null;
    }

    public static final java.lang.reflect.Method copydefault(@NotNull yJA<?> yja) {
        Intrinsics.checkNotNullParameter(yja, "");
        return KWHzl(yja.isConnected());
    }

    public static final java.lang.reflect.Method copydefault(@NotNull InterfaceC56558yJv<?> interfaceC56558yJv) {
        Intrinsics.checkNotNullParameter(interfaceC56558yJv, "");
        return KWHzl(interfaceC56558yJv.getSetter());
    }

    public static final java.lang.reflect.Method KWHzl(@NotNull InterfaceC56555yJs<?> interfaceC56555yJs) {
        InterfaceC56627yMj<?> interfaceC56627yMjEZpvd;
        Intrinsics.checkNotNullParameter(interfaceC56555yJs, "");
        AbstractC56573yKj<?> abstractC56573yKjAEQbTJ = yLX.AEQbTJ(interfaceC56555yJs);
        java.lang.reflect.Member memberOLrzqt = (abstractC56573yKjAEQbTJ == null || (interfaceC56627yMjEZpvd = abstractC56573yKjAEQbTJ.EZpvd()) == null) ? null : interfaceC56627yMjEZpvd.OLrzqt();
        if (memberOLrzqt instanceof java.lang.reflect.Method) {
            return (java.lang.reflect.Method) memberOLrzqt;
        }
        return null;
    }

    public static final <T> java.lang.reflect.Constructor<T> copydefault(@NotNull InterfaceC56555yJs<? extends T> interfaceC56555yJs) {
        InterfaceC56627yMj<?> interfaceC56627yMjEZpvd;
        Intrinsics.checkNotNullParameter(interfaceC56555yJs, "");
        AbstractC56573yKj<?> abstractC56573yKjAEQbTJ = yLX.AEQbTJ(interfaceC56555yJs);
        java.lang.reflect.Member memberOLrzqt = (abstractC56573yKjAEQbTJ == null || (interfaceC56627yMjEZpvd = abstractC56573yKjAEQbTJ.EZpvd()) == null) ? null : interfaceC56627yMjEZpvd.OLrzqt();
        if (memberOLrzqt instanceof java.lang.reflect.Constructor) {
            return (java.lang.reflect.Constructor) memberOLrzqt;
        }
        return null;
    }

    public static final java.lang.reflect.Type EZpvd(@NotNull InterfaceC56559yJw interfaceC56559yJw) {
        Intrinsics.checkNotNullParameter(interfaceC56559yJw, "");
        java.lang.reflect.Type typeEZpvd = ((yLJ) interfaceC56559yJw).EZpvd();
        return typeEZpvd == null ? yJB.AEQbTJ(interfaceC56559yJw) : typeEZpvd;
    }
}
