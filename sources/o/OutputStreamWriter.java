package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OutputStreamWriter {
    public static final PushbackInputStream copydefault(@NotNull java.util.List<OutputStream> list, java.lang.String str) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        Intrinsics.checkNotNullParameter(list, "");
        if (str == null) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((OutputStream) next).copydefault().containsKey(str)) {
                break;
            }
        }
        OutputStream outputStream = (OutputStream) next;
        if (outputStream != null) {
            PushbackInputStream pushbackInputStreamAEQbTJ = outputStream.AEQbTJ();
            PushbackInputStream pushbackInputStream = outputStream.copydefault().get(str);
            Intrinsics.copydefault(pushbackInputStream);
            return pushbackInputStreamAEQbTJ.copydefault(pushbackInputStream);
        }
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((OutputStream) next2).EZpvd().matches(str)) {
                break;
            }
        }
        OutputStream outputStream2 = (OutputStream) next2;
        if (outputStream2 == null) {
            java.util.Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((OutputStream) next3).OLrzqt(), (java.lang.Object) "aws")) {
                    break;
                }
            }
            outputStream2 = (OutputStream) next3;
        }
        if (outputStream2 != null) {
            return outputStream2.AEQbTJ();
        }
        return null;
    }
}
