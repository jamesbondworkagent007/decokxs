package o;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class oHN extends oHM {
    public static final oHN copydefault = new oHN();

    /* JADX WARN: Illegal instructions before constructor call */
    private oHN() {
        Pattern patternEZpvd = oHJ.EZpvd();
        Intrinsics.checkNotNullExpressionValue(patternEZpvd, "");
        super(patternEZpvd, null);
    }
}
