package o;

import com.google.common.base.Ascii;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: o.zsm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59957zsm {
    public static final byte[] AEQbTJ;
    public static final byte[] EZpvd;
    public static final byte[] KWHzl;
    public static final byte[] OLrzqt;
    public static final byte[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] AEQbTJ() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] EZpvd() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] KWHzl() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] OLrzqt() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] copydefault() {
        return KWHzl;
    }

    static {
        byte[] bytes = "Bitcoin seed".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        AEQbTJ = bytes;
        KWHzl = new byte[]{4, -120, -83, -28};
        EZpvd = new byte[]{4, -120, -78, Ascii.RS};
        copydefault = new byte[]{4, 53, -125, -108};
        OLrzqt = new byte[]{4, 53, -121, -49};
    }
}
