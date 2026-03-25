package o;

import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55957xtj {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [700=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1274499742:
                if (str.equals("filled")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.dPaqAf);
                }
                return "--";
            case -123173735:
                if (str.equals("canceled")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.syncState);
                }
                return "--";
            case 3322092:
                if (str.equals("live")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.setNavigationMode);
                }
                return "--";
            case 22875123:
                if (str.equals("partially_filled")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.setSelectedNavigationItem);
                }
                return "--";
            case 1889341808:
                if (str.equals("cancelling")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.setDrawerIndicatorEnabled);
                }
                return "--";
            default:
                return "--";
        }
    }
}
