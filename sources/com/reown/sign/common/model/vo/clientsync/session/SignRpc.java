package com.reown.sign.common.model.vo.clientsync.session;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.reown.android.internal.common.model.type.JsonRpcClientSync;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.json_rpc.model.JsonRpcMethod;
import com.reown.util.UtilFunctionsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class SignRpc implements JsonRpcClientSync<SignParams> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SignRpc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SignRpc() {
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionPropose extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.SessionProposeParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionPropose copy$default(SessionPropose sessionPropose, long j, String str, String str2, SignParams.SessionProposeParams sessionProposeParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionPropose.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionPropose.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionPropose.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                sessionProposeParams = sessionPropose.params;
            }
            return sessionPropose.copy(j2, str3, str4, sessionProposeParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.SessionProposeParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionPropose copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.SessionProposeParams sessionProposeParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sessionProposeParams, "");
            return new SessionPropose(j, str, str2, sessionProposeParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionPropose)) {
                return false;
            }
            SessionPropose sessionPropose = (SessionPropose) obj;
            return this.id == sessionPropose.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionPropose.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionPropose.method) && Intrinsics.EZpvd(this.params, sessionPropose.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.SessionProposeParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionPropose(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:17)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_PROPOSE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionProposeParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionProposeParams):void (m)] (LINE:15) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionPropose.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionProposeParams):void type: THIS */
        public /* synthetic */ SessionPropose(long j, String str, String str2, SignParams.SessionProposeParams sessionProposeParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_PROPOSE : str2, sessionProposeParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionPropose(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.SessionProposeParams sessionProposeParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sessionProposeParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = sessionProposeParams;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionAuthenticate extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.SessionAuthenticateParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionAuthenticate copy$default(SessionAuthenticate sessionAuthenticate, long j, String str, String str2, SignParams.SessionAuthenticateParams sessionAuthenticateParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionAuthenticate.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionAuthenticate.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionAuthenticate.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                sessionAuthenticateParams = sessionAuthenticate.params;
            }
            return sessionAuthenticate.copy(j2, str3, str4, sessionAuthenticateParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.SessionAuthenticateParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionAuthenticate copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.SessionAuthenticateParams sessionAuthenticateParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sessionAuthenticateParams, "");
            return new SessionAuthenticate(j, str, str2, sessionAuthenticateParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionAuthenticate)) {
                return false;
            }
            SessionAuthenticate sessionAuthenticate = (SessionAuthenticate) obj;
            return this.id == sessionAuthenticate.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionAuthenticate.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionAuthenticate.method) && Intrinsics.EZpvd(this.params, sessionAuthenticate.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.SessionAuthenticateParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionAuthenticate(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:29)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_AUTHENTICATE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionAuthenticateParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionAuthenticateParams):void (m)] (LINE:27) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionAuthenticate.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionAuthenticateParams):void type: THIS */
        public /* synthetic */ SessionAuthenticate(long j, String str, String str2, SignParams.SessionAuthenticateParams sessionAuthenticateParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_AUTHENTICATE : str2, sessionAuthenticateParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionAuthenticate(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.SessionAuthenticateParams sessionAuthenticateParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sessionAuthenticateParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = sessionAuthenticateParams;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionSettle extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.SessionSettleParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionSettle copy$default(SessionSettle sessionSettle, long j, String str, String str2, SignParams.SessionSettleParams sessionSettleParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionSettle.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionSettle.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionSettle.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                sessionSettleParams = sessionSettle.params;
            }
            return sessionSettle.copy(j2, str3, str4, sessionSettleParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.SessionSettleParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionSettle copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.SessionSettleParams sessionSettleParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sessionSettleParams, "");
            return new SessionSettle(j, str, str2, sessionSettleParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionSettle)) {
                return false;
            }
            SessionSettle sessionSettle = (SessionSettle) obj;
            return this.id == sessionSettle.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionSettle.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionSettle.method) && Intrinsics.EZpvd(this.params, sessionSettle.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.SessionSettleParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionSettle(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:41)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_SETTLE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionSettleParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionSettleParams):void (m)] (LINE:39) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionSettle.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionSettleParams):void type: THIS */
        public /* synthetic */ SessionSettle(long j, String str, String str2, SignParams.SessionSettleParams sessionSettleParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_SETTLE : str2, sessionSettleParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionSettle(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.SessionSettleParams sessionSettleParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sessionSettleParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = sessionSettleParams;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionRequest extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.SessionRequestParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionRequest copy$default(SessionRequest sessionRequest, long j, String str, String str2, SignParams.SessionRequestParams sessionRequestParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionRequest.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionRequest.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionRequest.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                sessionRequestParams = sessionRequest.params;
            }
            return sessionRequest.copy(j2, str3, str4, sessionRequestParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.SessionRequestParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRequest copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.SessionRequestParams sessionRequestParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sessionRequestParams, "");
            return new SessionRequest(j, str, str2, sessionRequestParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRequest)) {
                return false;
            }
            SessionRequest sessionRequest = (SessionRequest) obj;
            return this.id == sessionRequest.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionRequest.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionRequest.method) && Intrinsics.EZpvd(this.params, sessionRequest.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.SessionRequestParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionRequest(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:53)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_REQUEST java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionRequestParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionRequestParams):void (m)] (LINE:51) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionRequest.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionRequestParams):void type: THIS */
        public /* synthetic */ SessionRequest(long j, String str, String str2, SignParams.SessionRequestParams sessionRequestParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_REQUEST : str2, sessionRequestParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionRequest(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.SessionRequestParams sessionRequestParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(sessionRequestParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = sessionRequestParams;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionDelete extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.DeleteParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionDelete copy$default(SessionDelete sessionDelete, long j, String str, String str2, SignParams.DeleteParams deleteParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionDelete.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionDelete.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionDelete.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                deleteParams = sessionDelete.params;
            }
            return sessionDelete.copy(j2, str3, str4, deleteParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.DeleteParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionDelete copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.DeleteParams deleteParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(deleteParams, "");
            return new SessionDelete(j, str, str2, deleteParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionDelete)) {
                return false;
            }
            SessionDelete sessionDelete = (SessionDelete) obj;
            return this.id == sessionDelete.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionDelete.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionDelete.method) && Intrinsics.EZpvd(this.params, sessionDelete.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.DeleteParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionDelete(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:65)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_DELETE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$DeleteParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$DeleteParams):void (m)] (LINE:63) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionDelete.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$DeleteParams):void type: THIS */
        public /* synthetic */ SessionDelete(long j, String str, String str2, SignParams.DeleteParams deleteParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_DELETE : str2, deleteParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionDelete(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.DeleteParams deleteParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(deleteParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = deleteParams;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionPing extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.PingParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionPing copy$default(SessionPing sessionPing, long j, String str, String str2, SignParams.PingParams pingParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionPing.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionPing.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionPing.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                pingParams = sessionPing.params;
            }
            return sessionPing.copy(j2, str3, str4, pingParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.PingParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionPing copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.PingParams pingParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(pingParams, "");
            return new SessionPing(j, str, str2, pingParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionPing)) {
                return false;
            }
            SessionPing sessionPing = (SessionPing) obj;
            return this.id == sessionPing.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionPing.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionPing.method) && Intrinsics.EZpvd(this.params, sessionPing.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.PingParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionPing(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:77)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_PING java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$PingParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$PingParams):void (m)] (LINE:75) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionPing.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$PingParams):void type: THIS */
        public /* synthetic */ SessionPing(long j, String str, String str2, SignParams.PingParams pingParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_PING : str2, pingParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionPing(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.PingParams pingParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(pingParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = pingParams;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionEvent extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.EventParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, long j, String str, String str2, SignParams.EventParams eventParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionEvent.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionEvent.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionEvent.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                eventParams = sessionEvent.params;
            }
            return sessionEvent.copy(j2, str3, str4, eventParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.EventParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionEvent copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.EventParams eventParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(eventParams, "");
            return new SessionEvent(j, str, str2, eventParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionEvent)) {
                return false;
            }
            SessionEvent sessionEvent = (SessionEvent) obj;
            return this.id == sessionEvent.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionEvent.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionEvent.method) && Intrinsics.EZpvd(this.params, sessionEvent.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.EventParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionEvent(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:89)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_EVENT java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$EventParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$EventParams):void (m)] (LINE:87) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionEvent.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$EventParams):void type: THIS */
        public /* synthetic */ SessionEvent(long j, String str, String str2, SignParams.EventParams eventParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_EVENT : str2, eventParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionEvent(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.EventParams eventParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(eventParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = eventParams;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionUpdate extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.UpdateNamespacesParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionUpdate copy$default(SessionUpdate sessionUpdate, long j, String str, String str2, SignParams.UpdateNamespacesParams updateNamespacesParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionUpdate.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionUpdate.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionUpdate.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                updateNamespacesParams = sessionUpdate.params;
            }
            return sessionUpdate.copy(j2, str3, str4, updateNamespacesParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.UpdateNamespacesParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionUpdate copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.UpdateNamespacesParams updateNamespacesParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(updateNamespacesParams, "");
            return new SessionUpdate(j, str, str2, updateNamespacesParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionUpdate)) {
                return false;
            }
            SessionUpdate sessionUpdate = (SessionUpdate) obj;
            return this.id == sessionUpdate.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionUpdate.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionUpdate.method) && Intrinsics.EZpvd(this.params, sessionUpdate.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.UpdateNamespacesParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionUpdate(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:101)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_UPDATE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$UpdateNamespacesParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$UpdateNamespacesParams):void (m)] (LINE:99) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionUpdate.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$UpdateNamespacesParams):void type: THIS */
        public /* synthetic */ SessionUpdate(long j, String str, String str2, SignParams.UpdateNamespacesParams updateNamespacesParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_UPDATE : str2, updateNamespacesParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionUpdate(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.UpdateNamespacesParams updateNamespacesParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(updateNamespacesParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = updateNamespacesParams;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionExtend extends SignRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final SignParams.ExtendParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionExtend copy$default(SessionExtend sessionExtend, long j, String str, String str2, SignParams.ExtendParams extendParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sessionExtend.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = sessionExtend.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = sessionExtend.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                extendParams = sessionExtend.params;
            }
            return sessionExtend.copy(j2, str3, str4, extendParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignParams.ExtendParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionExtend copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.ExtendParams extendParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(extendParams, "");
            return new SessionExtend(j, str, str2, extendParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionExtend)) {
                return false;
            }
            SessionExtend sessionExtend = (SessionExtend) obj;
            return this.id == sessionExtend.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) sessionExtend.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) sessionExtend.method) && Intrinsics.EZpvd(this.params, sessionExtend.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getParams()Lcom/reown/android/internal/common/model/type/ClientParams; */
        @Override // com.reown.android.internal.common.model.type.JsonRpcClientSync
        public SignParams.ExtendParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionExtend(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:113)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.sign.json_rpc.model.JsonRpcMethod.WC_SESSION_EXTEND java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.sign.common.model.vo.clientsync.session.params.SignParams$ExtendParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$ExtendParams):void (m)] (LINE:111) call: com.reown.sign.common.model.vo.clientsync.session.SignRpc.SessionExtend.<init>(long, java.lang.String, java.lang.String, com.reown.sign.common.model.vo.clientsync.session.params.SignParams$ExtendParams):void type: THIS */
        public /* synthetic */ SessionExtend(long j, String str, String str2, SignParams.ExtendParams extendParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcMethod.WC_SESSION_EXTEND : str2, extendParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionExtend(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull SignParams.ExtendParams extendParams) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(extendParams, "");
            this.id = j;
            this.jsonrpc = str;
            this.method = str2;
            this.params = extendParams;
        }
    }
}
