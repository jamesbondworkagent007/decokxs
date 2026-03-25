package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38385pWv {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [19=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final InterfaceC38386pWw EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1956807563:
                if (str.equals("OPTION")) {
                    return new pWC();
                }
                break;
            case 2074257:
                if (str.equals("COIN")) {
                    return new C38389pWz();
                }
                break;
            case 2552066:
                if (str.equals("SPOT")) {
                    return new pWG();
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    return new pWE();
                }
                break;
            case 214415088:
                if (str.equals("FUTURES")) {
                    return new pWB();
                }
                break;
            case 1131295064:
                if (str.equals("pre_market")) {
                    return new pWI();
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("dataSourceName is not supported");
    }
}
