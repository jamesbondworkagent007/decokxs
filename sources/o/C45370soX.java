package o;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.soX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45370soX {
    public static final C45370soX copydefault = new C45370soX();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.soY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45370soX.KWHzl();
        }
    });
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.soZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45370soX.OLrzqt();
        }
    });
    public static final int OLrzqt = 8;

    private C45370soX() {
    }

    public final Pattern djBIcL() {
        return (Pattern) EZpvd.getValue();
    }

    public static final Pattern KWHzl() {
        Pattern patternCompile = Pattern.compile("https?://(?:[a-zA-Z0-9](?:[a-zA-Z0-9\\-]*[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,}(?:/(?:[a-zA-Z0-9\\-._~]|/)*)?(?:#[a-zA-Z0-9\\-._~]*)?", 66);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        return patternCompile;
    }

    public final Pattern copydefault() {
        return (Pattern) AEQbTJ.getValue();
    }

    public static final Pattern OLrzqt() {
        Pattern patternCompile = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._%+-]*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", 66);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        return patternCompile;
    }
}
