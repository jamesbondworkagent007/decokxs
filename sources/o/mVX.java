package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mVX {
    public static final mVX KWHzl = new mVX();

    private mVX() {
    }

    public final int OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.copydefault(str, "1")) {
            return 3;
        }
        if (C33129mqd.copydefault(str, "0.1")) {
            return 5;
        }
        if (C33129mqd.copydefault(str, "0.01")) {
            return 6;
        }
        if (C33129mqd.copydefault(str, "0.001")) {
            return 7;
        }
        if (C33129mqd.copydefault(str, "0.0001")) {
            return 8;
        }
        if (C33129mqd.copydefault(str, "0.00001")) {
            return 9;
        }
        if (C33129mqd.copydefault(str, "0.000001")) {
            return 10;
        }
        if (C33129mqd.copydefault(str, "0.0000001")) {
            return 11;
        }
        if (C33129mqd.copydefault(str, "0.00000001")) {
            return 12;
        }
        if (C33129mqd.copydefault(str, "0.000000001")) {
            return 13;
        }
        if (C33129mqd.copydefault(str, "0.0000000001")) {
            return 14;
        }
        return C33129mqd.copydefault(str, "0.00000000001") ? 15 : 16;
    }
}
