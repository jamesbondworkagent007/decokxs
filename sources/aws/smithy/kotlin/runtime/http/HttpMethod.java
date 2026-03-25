package aws.smithy.kotlin.runtime.http;

import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpMethod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HttpMethod[] $VALUES;
    public static final StateListAnimator Companion;
    public static final HttpMethod GET = new HttpMethod("GET", 0);
    public static final HttpMethod POST = new HttpMethod("POST", 1);
    public static final HttpMethod PUT = new HttpMethod("PUT", 2);
    public static final HttpMethod PATCH = new HttpMethod("PATCH", 3);
    public static final HttpMethod DELETE = new HttpMethod("DELETE", 4);
    public static final HttpMethod HEAD = new HttpMethod("HEAD", 5);
    public static final HttpMethod OPTIONS = new HttpMethod("OPTIONS", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HttpMethod[] $values() {
        return new HttpMethod[]{GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HttpMethod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static HttpMethod[] values() {
        return (HttpMethod[]) $VALUES.clone();
    }

    private HttpMethod(String str, int i) {
    }

    static {
        HttpMethod[] httpMethodArr$values = $values();
        $VALUES = httpMethodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(httpMethodArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.smithy.kotlin.runtime.http.HttpMethod.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [26=7] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final HttpMethod OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        return HttpMethod.OPTIONS;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        return HttpMethod.GET;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        return HttpMethod.PUT;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        return HttpMethod.HEAD;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        return HttpMethod.POST;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        return HttpMethod.PATCH;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        return HttpMethod.DELETE;
                    }
                    break;
            }
            throw new IllegalArgumentException("unknown HTTP method: " + str);
        }
    }
}
