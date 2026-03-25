package aws.sdk.kotlin.runtime.config.imds;

import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.C57631ym;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EndpointMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EndpointMode[] $VALUES;
    public static final StateListAnimator Companion;
    public static final EndpointMode IPv4 = new EndpointMode("IPv4", 0, new C57631ym("http://169.254.169.254"));
    public static final EndpointMode IPv6 = new EndpointMode("IPv6", 1, new C57631ym("http://[fd00:ec2::254]"));
    private final C57631ym defaultEndpoint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EndpointMode[] $values() {
        return new EndpointMode[]{IPv4, IPv6};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EndpointMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static EndpointMode valueOf(String str) {
        return (EndpointMode) Enum.valueOf(EndpointMode.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static EndpointMode[] values() {
        return (EndpointMode[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57631ym getDefaultEndpoint$aws_config() {
        return this.defaultEndpoint;
    }

    private EndpointMode(String str, int i, C57631ym c57631ym) {
        this.defaultEndpoint = c57631ym;
    }

    static {
        EndpointMode[] endpointModeArr$values = $values();
        $VALUES = endpointModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(endpointModeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.runtime.config.imds.EndpointMode.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final EndpointMode AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (Intrinsics.EZpvd((Object) lowerCase, (Object) "ipv4")) {
                return EndpointMode.IPv4;
            }
            if (Intrinsics.EZpvd((Object) lowerCase, (Object) "ipv6")) {
                return EndpointMode.IPv6;
            }
            throw new IllegalArgumentException("invalid EndpointMode: `" + str + '`');
        }
    }
}
