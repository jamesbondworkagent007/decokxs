package com.okinc.liveness.lca.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class LcaJwstWsCloseStatus {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final String reason;
    private final HandleStrategy strategy;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 java.lang.String), (r3v0 com.okinc.liveness.lca.data.LcaJwstWsCloseStatus$HandleStrategy) A[MD:(int, java.lang.String, com.okinc.liveness.lca.data.LcaJwstWsCloseStatus$HandleStrategy):void (m)] call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.<init>(int, java.lang.String, com.okinc.liveness.lca.data.LcaJwstWsCloseStatus$HandleStrategy):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LcaJwstWsCloseStatus(int i, String str, HandleStrategy handleStrategy, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, handleStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HandleStrategy getStrategy() {
        return this.strategy;
    }

    private LcaJwstWsCloseStatus(int i, String str, HandleStrategy handleStrategy) {
        this.code = i;
        this.reason = str;
        this.strategy = handleStrategy;
    }

    public String toString() {
        return "[code=" + getCode() + ", reason=" + getReason() + ", strategy=" + getStrategy() + "]";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HandleStrategy {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ HandleStrategy[] $VALUES;
        public static final HandleStrategy ACKNOWLEDGE_ONLY = new HandleStrategy("ACKNOWLEDGE_ONLY", 0);
        public static final HandleStrategy CONNECT_FAIL_RETRY = new HandleStrategy("CONNECT_FAIL_RETRY", 1);
        public static final HandleStrategy AUTH_FAIL_RETRY = new HandleStrategy("AUTH_FAIL_RETRY", 2);
        public static final HandleStrategy TIMEOUT_RETRY = new HandleStrategy("TIMEOUT_RETRY", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ HandleStrategy[] $values() {
            return new HandleStrategy[]{ACKNOWLEDGE_ONLY, CONNECT_FAIL_RETRY, AUTH_FAIL_RETRY, TIMEOUT_RETRY};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<HandleStrategy> getEntries() {
            return $ENTRIES;
        }

        private HandleStrategy(String str, int i) {
        }

        static {
            HandleStrategy[] handleStrategyArr$values = $values();
            $VALUES = handleStrategyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(handleStrategyArr$values);
        }

        public static HandleStrategy valueOf(String str) {
            return (HandleStrategy) Enum.valueOf(HandleStrategy.class, str);
        }

        public static HandleStrategy[] values() {
            return (HandleStrategy[]) $VALUES.clone();
        }
    }

    public static final class NormalClosure extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NormalClosure() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Normal closure") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:29) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.NormalClosure.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NormalClosure(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Normal closure" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NormalClosure(@NotNull String str) {
            super(1000, str, HandleStrategy.ACKNOWLEDGE_ONLY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class AuthFailed extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AuthFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Authentication Failed") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:33) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.AuthFailed.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ AuthFailed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Authentication Failed" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthFailed(@NotNull String str) {
            super(4401, str, HandleStrategy.AUTH_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class NotAuthenticated extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NotAuthenticated() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Not Authenticated") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:37) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.NotAuthenticated.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotAuthenticated(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Not Authenticated" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotAuthenticated(@NotNull String str) {
            super(4402, str, HandleStrategy.AUTH_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class AuthFrameTimeout extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AuthFrameTimeout() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Auth frame not received within timeout") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:41) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.AuthFrameTimeout.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ AuthFrameTimeout(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Auth frame not received within timeout" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthFrameTimeout(@NotNull String str) {
            super(4403, str, HandleStrategy.AUTH_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class WsSessionIdTimeout extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public WsSessionIdTimeout() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("wsSessionId timeout") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:45) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.WsSessionIdTimeout.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ WsSessionIdTimeout(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "wsSessionId timeout" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WsSessionIdTimeout(@NotNull String str) {
            super(4404, str, HandleStrategy.TIMEOUT_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class SessionGlobalTimeout extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SessionGlobalTimeout() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Session globally timed out") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:49) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.SessionGlobalTimeout.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SessionGlobalTimeout(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Session globally timed out" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionGlobalTimeout(@NotNull String str) {
            super(4405, str, HandleStrategy.TIMEOUT_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class InvalidParameters extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvalidParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Invalid parameters") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:53) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.InvalidParameters.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ InvalidParameters(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Invalid parameters" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidParameters(@NotNull String str) {
            super(4406, str, HandleStrategy.CONNECT_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class WsSessionIdNotExists extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public WsSessionIdNotExists() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Invalid wsSessionId") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:57) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.WsSessionIdNotExists.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ WsSessionIdNotExists(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Invalid wsSessionId" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WsSessionIdNotExists(@NotNull String str) {
            super(4407, str, HandleStrategy.CONNECT_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class SystemError extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SystemError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("SYSTEM ERROR") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:61) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.SystemError.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SystemError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "SYSTEM ERROR" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SystemError(@NotNull String str) {
            super(4408, str, HandleStrategy.CONNECT_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class RgbSeqNotMatch extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RgbSeqNotMatch() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("RGB SEQ NOT MATCH") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:65) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.RgbSeqNotMatch.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ RgbSeqNotMatch(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "RGB SEQ NOT MATCH" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RgbSeqNotMatch(@NotNull String str) {
            super(4409, str, HandleStrategy.CONNECT_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class RgbListIsEmpty extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RgbListIsEmpty() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("RgbListIsEmpty") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:69) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.RgbListIsEmpty.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ RgbListIsEmpty(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "RgbListIsEmpty" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RgbListIsEmpty(@NotNull String str) {
            super(4410, str, HandleStrategy.CONNECT_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class LivenessFlashTimeoutError extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LivenessFlashTimeoutError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Liveness Color Flash Timeout") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:73) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.LivenessFlashTimeoutError.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ LivenessFlashTimeoutError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Liveness Color Flash Timeout" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LivenessFlashTimeoutError(@NotNull String str) {
            super(4511, str, HandleStrategy.TIMEOUT_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class LivenessTimeoutError extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LivenessTimeoutError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Liveness Timeout") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:77) call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.LivenessTimeoutError.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ LivenessTimeoutError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Liveness Timeout" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LivenessTimeoutError(@NotNull String str) {
            super(4512, str, HandleStrategy.TIMEOUT_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }
    }

    public static final class UnexpectedError extends LcaJwstWsCloseStatus {
        public static final int $stable = 0;
        private final int code;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.liveness.lca.data.LcaJwstWsCloseStatus
        public String getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedError(int i, @NotNull String str) {
            super(i, str, HandleStrategy.CONNECT_FAIL_RETRY, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.code = i;
            this.reason = str;
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.data.LcaJwstWsCloseStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LcaJwstWsCloseStatus from(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (i == 1000) {
                return new NormalClosure(str);
            }
            if (i == 4511) {
                return new LivenessFlashTimeoutError(str);
            }
            if (i != 4512) {
                switch (i) {
                    case 4401:
                        return new AuthFailed(str);
                    case 4402:
                        return new NotAuthenticated(str);
                    case 4403:
                        return new AuthFrameTimeout(str);
                    case 4404:
                        return new WsSessionIdTimeout(str);
                    case 4405:
                        return new SessionGlobalTimeout(str);
                    case 4406:
                        return new InvalidParameters(str);
                    case 4407:
                        return new WsSessionIdNotExists(str);
                    case 4408:
                        return new SystemError(str);
                    case 4409:
                        return new RgbSeqNotMatch(str);
                    case 4410:
                        return new RgbListIsEmpty(str);
                    default:
                        return new UnexpectedError(i, str);
                }
            }
            return new LivenessTimeoutError(str);
        }
    }
}
