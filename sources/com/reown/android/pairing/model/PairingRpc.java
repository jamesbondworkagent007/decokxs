package com.reown.android.pairing.model;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.reown.android.internal.common.model.type.JsonRpcClientSync;
import com.reown.android.pairing.model.PairingParams;
import com.reown.util.UtilFunctionsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PairingRpc implements JsonRpcClientSync<PairingParams> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.pairing.model.PairingRpc.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PairingRpc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PairingRpc() {
    }

    @JsonClass(generateAdapter = true)
    public static final class PairingDelete extends PairingRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final PairingParams.DeleteParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PairingDelete copy$default(PairingDelete pairingDelete, long j, String str, String str2, PairingParams.DeleteParams deleteParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pairingDelete.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = pairingDelete.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = pairingDelete.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                deleteParams = pairingDelete.params;
            }
            return pairingDelete.copy(j2, str3, str4, deleteParams);
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
        public final PairingParams.DeleteParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PairingDelete copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull PairingParams.DeleteParams deleteParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(deleteParams, "");
            return new PairingDelete(j, str, str2, deleteParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PairingDelete)) {
                return false;
            }
            PairingDelete pairingDelete = (PairingDelete) obj;
            return this.id == pairingDelete.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) pairingDelete.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) pairingDelete.method) && Intrinsics.EZpvd(this.params, pairingDelete.params);
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
        public PairingParams.DeleteParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PairingDelete(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:13)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.android.pairing.model.PairingJsonRpcMethod.WC_PAIRING_DELETE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.android.pairing.model.PairingParams$DeleteParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.android.pairing.model.PairingParams$DeleteParams):void (m)] (LINE:11) call: com.reown.android.pairing.model.PairingRpc.PairingDelete.<init>(long, java.lang.String, java.lang.String, com.reown.android.pairing.model.PairingParams$DeleteParams):void type: THIS */
        public /* synthetic */ PairingDelete(long j, String str, String str2, PairingParams.DeleteParams deleteParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? PairingJsonRpcMethod.WC_PAIRING_DELETE : str2, deleteParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairingDelete(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull PairingParams.DeleteParams deleteParams) {
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
    public static final class PairingPing extends PairingRpc {
        public final long id;
        public final String jsonrpc;
        public final String method;
        public final PairingParams.PingParams params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PairingPing copy$default(PairingPing pairingPing, long j, String str, String str2, PairingParams.PingParams pingParams, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pairingPing.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = pairingPing.jsonrpc;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = pairingPing.method;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                pingParams = pairingPing.params;
            }
            return pairingPing.copy(j2, str3, str4, pingParams);
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
        public final PairingParams.PingParams component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PairingPing copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull PairingParams.PingParams pingParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(pingParams, "");
            return new PairingPing(j, str, str2, pingParams);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PairingPing)) {
                return false;
            }
            PairingPing pairingPing = (PairingPing) obj;
            return this.id == pairingPing.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) pairingPing.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) pairingPing.method) && Intrinsics.EZpvd(this.params, pairingPing.params);
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
        public PairingParams.PingParams getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PairingPing(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateId():long A[MD:():long (m), WRAPPED] (LINE:25)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.android.pairing.model.PairingJsonRpcMethod.WC_PAIRING_PING java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.android.pairing.model.PairingParams$PingParams)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.android.pairing.model.PairingParams$PingParams):void (m)] (LINE:23) call: com.reown.android.pairing.model.PairingRpc.PairingPing.<init>(long, java.lang.String, java.lang.String, com.reown.android.pairing.model.PairingParams$PingParams):void type: THIS */
        public /* synthetic */ PairingPing(long j, String str, String str2, PairingParams.PingParams pingParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UtilFunctionsKt.generateId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? PairingJsonRpcMethod.WC_PAIRING_PING : str2, pingParams);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairingPing(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull PairingParams.PingParams pingParams) {
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
}
