package com.reown.foundation.network.model;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.reown.android.push.notifications.PushMessagingService;
import com.reown.foundation.common.adapters.SubscriptionIdAdapter;
import com.reown.foundation.common.adapters.TopicAdapter;
import com.reown.foundation.common.adapters.TtlAdapter;
import com.reown.foundation.common.model.SubscriptionId;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.util.UtilFunctionsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class RelayDTO {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RelayDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getId();

    public abstract String getJsonrpc();

    private RelayDTO() {
    }

    public static abstract class Publish extends RelayDTO {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.Publish.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Publish(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Publish() {
            super(null);
        }

        @JsonClass(generateAdapter = true)
        public static final class Request extends Publish {
            private final long id;
            private final String jsonrpc;
            private final String method;
            private final Params params;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Request copy$default(Request request, long j, String str, String str2, Params params, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = request.id;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = request.jsonrpc;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    str2 = request.method;
                }
                String str4 = str2;
                if ((i & 8) != 0) {
                    params = request.params;
                }
                return request.copy(j2, str3, str4, params);
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
            public final Params component4() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Request copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                return new Request(j, str, str2, params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return this.id == request.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) request.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) request.method) && Intrinsics.EZpvd(this.params, request.params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public String getJsonrpc() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Params getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Request(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateClientToServerId():long A[MD:():long (m), WRAPPED] (LINE:22)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_PUBLISH java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.RelayDTO$Publish$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$Publish$Request$Params):void (m)] (LINE:20) call: com.reown.foundation.network.model.RelayDTO.Publish.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$Publish$Request$Params):void type: THIS */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? UtilFunctionsKt.generateClientToServerId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_PUBLISH : str2, params);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Request(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                this.id = j;
                this.jsonrpc = str;
                this.method = str2;
                this.params = params;
            }

            @JsonClass(generateAdapter = true)
            public static final class Params {
                private final String message;
                private final Boolean prompt;
                private final int tag;

                @TopicAdapter.Qualifier
                private final Topic topic;

                @TtlAdapter.Qualifier
                private final Ttl ttl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Params copy$default(Params params, Topic topic, String str, Ttl ttl, int i, Boolean bool, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        topic = params.topic;
                    }
                    if ((i2 & 2) != 0) {
                        str = params.message;
                    }
                    String str2 = str;
                    if ((i2 & 4) != 0) {
                        ttl = params.ttl;
                    }
                    Ttl ttl2 = ttl;
                    if ((i2 & 8) != 0) {
                        i = params.tag;
                    }
                    int i3 = i;
                    if ((i2 & 16) != 0) {
                        bool = params.prompt;
                    }
                    return params.copy(topic, str2, ttl2, i3, bool);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Topic component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Ttl component3() {
                    return this.ttl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int component4() {
                    return this.tag;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Boolean component5() {
                    return this.prompt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Params copy(@Json(name = PushMessagingService.KEY_TOPIC) @NotNull Topic topic, @Json(name = "message") @NotNull String str, @Json(name = RemoteMessageConst.TTL) @NotNull Ttl ttl, @Json(name = "tag") int i, @Json(name = "prompt") Boolean bool) {
                    Intrinsics.checkNotNullParameter(topic, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(ttl, "");
                    return new Params(topic, str, ttl, i, bool);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Params)) {
                        return false;
                    }
                    Params params = (Params) obj;
                    return Intrinsics.EZpvd(this.topic, params.topic) && Intrinsics.EZpvd((Object) this.message, (Object) params.message) && Intrinsics.EZpvd(this.ttl, params.ttl) && this.tag == params.tag && Intrinsics.EZpvd(this.prompt, params.prompt);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getMessage() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Boolean getPrompt() {
                    return this.prompt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final int getTag() {
                    return this.tag;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Topic getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Ttl getTtl() {
                    return this.ttl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.topic.hashCode();
                    int iHashCode2 = this.message.hashCode();
                    int iHashCode3 = this.ttl.hashCode();
                    int iHashCode4 = Integer.hashCode(this.tag);
                    Boolean bool = this.prompt;
                    return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Params(topic=" + this.topic + ", message=" + this.message + ", ttl=" + this.ttl + ", tag=" + this.tag + ", prompt=" + this.prompt + ")";
                }

                public Params(@Json(name = PushMessagingService.KEY_TOPIC) @NotNull Topic topic, @Json(name = "message") @NotNull String str, @Json(name = RemoteMessageConst.TTL) @NotNull Ttl ttl, @Json(name = "tag") int i, @Json(name = "prompt") Boolean bool) {
                    Intrinsics.checkNotNullParameter(topic, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(ttl, "");
                    this.topic = topic;
                    this.message = str;
                    this.ttl = ttl;
                    this.tag = i;
                    this.prompt = bool;
                }
            }
        }

        public static abstract class Result extends Publish {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.Publish.Result.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Result() {
                super(null);
            }

            @JsonClass(generateAdapter = true)
            public static final class Acknowledgement extends Result {
                private final long id;
                private final String jsonrpc;
                private final boolean result;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Acknowledgement copy$default(Acknowledgement acknowledgement, long j, String str, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = acknowledgement.id;
                    }
                    if ((i & 2) != 0) {
                        str = acknowledgement.jsonrpc;
                    }
                    if ((i & 4) != 0) {
                        z = acknowledgement.result;
                    }
                    return acknowledgement.copy(j, str, z);
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
                public final boolean component3() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Acknowledgement copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") boolean z) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Acknowledgement(j, str, z);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Acknowledgement)) {
                        return false;
                    }
                    Acknowledgement acknowledgement = (Acknowledgement) obj;
                    return this.id == acknowledgement.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) acknowledgement.jsonrpc) && this.result == acknowledgement.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final boolean getResult() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + Boolean.hashCode(this.result);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Acknowledgement(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 boolean)
 A[MD:(long, java.lang.String, boolean):void (m)] (LINE:51) call: com.reown.foundation.network.model.RelayDTO.Publish.Result.Acknowledgement.<init>(long, java.lang.String, boolean):void type: THIS */
                public /* synthetic */ Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, (i & 2) != 0 ? "2.0" : str, z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Acknowledgement(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") boolean z) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.id = j;
                    this.jsonrpc = str;
                    this.result = z;
                }
            }

            @JsonClass(generateAdapter = true)
            public static final class JsonRpcError extends Result {
                private final Error error;
                private final long id;
                private final String jsonrpc;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, String str, Error error, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = jsonRpcError.jsonrpc;
                    }
                    if ((i & 2) != 0) {
                        error = jsonRpcError.error;
                    }
                    if ((i & 4) != 0) {
                        j = jsonRpcError.id;
                    }
                    return jsonRpcError.copy(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error component2() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component3() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonRpcError copy(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    return new JsonRpcError(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcError.jsonrpc) && Intrinsics.EZpvd(this.error, jsonRpcError.error) && this.id == jsonRpcError.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error getError() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((this.jsonrpc.hashCode() * 31) + this.error.hashCode()) * 31) + Long.hashCode(this.id);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "JsonRpcError(jsonrpc=" + this.jsonrpc + ", error=" + this.error + ", id=" + this.id + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r1v0 java.lang.String))
  (r2v0 com.reown.foundation.network.model.RelayDTO$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void (m)] (LINE:61) call: com.reown.foundation.network.model.RelayDTO.Publish.Result.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void type: THIS */
                public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "2.0" : str, error, j);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JsonRpcError(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    this.jsonrpc = str;
                    this.error = error;
                    this.id = j;
                }
            }
        }
    }

    public static abstract class Subscribe extends RelayDTO {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.Subscribe.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Subscribe(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Subscribe() {
            super(null);
        }

        @JsonClass(generateAdapter = true)
        public static final class Request extends Subscribe {
            private final long id;
            private final String jsonrpc;
            private final String method;
            private final Params params;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Request copy$default(Request request, long j, String str, String str2, Params params, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = request.id;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = request.jsonrpc;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    str2 = request.method;
                }
                String str4 = str2;
                if ((i & 8) != 0) {
                    params = request.params;
                }
                return request.copy(j2, str3, str4, params);
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
            public final Params component4() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Request copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                return new Request(j, str, str2, params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return this.id == request.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) request.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) request.method) && Intrinsics.EZpvd(this.params, request.params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public String getJsonrpc() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Params getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Request(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateClientToServerId():long A[MD:():long (m), WRAPPED] (LINE:77)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_SUBSCRIBE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.RelayDTO$Subscribe$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$Subscribe$Request$Params):void (m)] (LINE:75) call: com.reown.foundation.network.model.RelayDTO.Subscribe.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$Subscribe$Request$Params):void type: THIS */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? UtilFunctionsKt.generateClientToServerId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_SUBSCRIBE : str2, params);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Request(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                this.id = j;
                this.jsonrpc = str;
                this.method = str2;
                this.params = params;
            }

            @JsonClass(generateAdapter = true)
            public static final class Params {

                @TopicAdapter.Qualifier
                private final Topic topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Params copy$default(Params params, Topic topic, int i, Object obj) {
                    if ((i & 1) != 0) {
                        topic = params.topic;
                    }
                    return params.copy(topic);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Topic component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Params copy(@Json(name = PushMessagingService.KEY_TOPIC) @NotNull Topic topic) {
                    Intrinsics.checkNotNullParameter(topic, "");
                    return new Params(topic);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Params) && Intrinsics.EZpvd(this.topic, ((Params) obj).topic);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Topic getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.topic.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Params(topic=" + this.topic + ")";
                }

                public Params(@Json(name = PushMessagingService.KEY_TOPIC) @NotNull Topic topic) {
                    Intrinsics.checkNotNullParameter(topic, "");
                    this.topic = topic;
                }
            }
        }

        public static abstract class Result extends Subscribe {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.Subscribe.Result.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Result() {
                super(null);
            }

            @JsonClass(generateAdapter = true)
            public static final class Acknowledgement extends Result {
                private final long id;
                private final String jsonrpc;

                @SubscriptionIdAdapter.Qualifier
                private final SubscriptionId result;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Acknowledgement copy$default(Acknowledgement acknowledgement, long j, String str, SubscriptionId subscriptionId, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = acknowledgement.id;
                    }
                    if ((i & 2) != 0) {
                        str = acknowledgement.jsonrpc;
                    }
                    if ((i & 4) != 0) {
                        subscriptionId = acknowledgement.result;
                    }
                    return acknowledgement.copy(j, str, subscriptionId);
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
                public final SubscriptionId component3() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Acknowledgement copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") @NotNull SubscriptionId subscriptionId) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(subscriptionId, "");
                    return new Acknowledgement(j, str, subscriptionId);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Acknowledgement)) {
                        return false;
                    }
                    Acknowledgement acknowledgement = (Acknowledgement) obj;
                    return this.id == acknowledgement.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) acknowledgement.jsonrpc) && Intrinsics.EZpvd(this.result, acknowledgement.result);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SubscriptionId getResult() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.result.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Acknowledgement(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 com.reown.foundation.common.model.SubscriptionId)
 A[MD:(long, java.lang.String, com.reown.foundation.common.model.SubscriptionId):void (m)] (LINE:97) call: com.reown.foundation.network.model.RelayDTO.Subscribe.Result.Acknowledgement.<init>(long, java.lang.String, com.reown.foundation.common.model.SubscriptionId):void type: THIS */
                public /* synthetic */ Acknowledgement(long j, String str, SubscriptionId subscriptionId, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, (i & 2) != 0 ? "2.0" : str, subscriptionId);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Acknowledgement(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") @NotNull SubscriptionId subscriptionId) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(subscriptionId, "");
                    this.id = j;
                    this.jsonrpc = str;
                    this.result = subscriptionId;
                }
            }

            @JsonClass(generateAdapter = true)
            public static final class JsonRpcError extends Result {
                private final Error error;
                private final long id;
                private final String jsonrpc;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, String str, Error error, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = jsonRpcError.jsonrpc;
                    }
                    if ((i & 2) != 0) {
                        error = jsonRpcError.error;
                    }
                    if ((i & 4) != 0) {
                        j = jsonRpcError.id;
                    }
                    return jsonRpcError.copy(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error component2() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component3() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonRpcError copy(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    return new JsonRpcError(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcError.jsonrpc) && Intrinsics.EZpvd(this.error, jsonRpcError.error) && this.id == jsonRpcError.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error getError() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((this.jsonrpc.hashCode() * 31) + this.error.hashCode()) * 31) + Long.hashCode(this.id);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "JsonRpcError(jsonrpc=" + this.jsonrpc + ", error=" + this.error + ", id=" + this.id + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r1v0 java.lang.String))
  (r2v0 com.reown.foundation.network.model.RelayDTO$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void (m)] (LINE:108) call: com.reown.foundation.network.model.RelayDTO.Subscribe.Result.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void type: THIS */
                public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "2.0" : str, error, j);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JsonRpcError(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    this.jsonrpc = str;
                    this.error = error;
                    this.id = j;
                }
            }
        }
    }

    public static abstract class BatchSubscribe extends RelayDTO {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.BatchSubscribe.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ BatchSubscribe(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BatchSubscribe() {
            super(null);
        }

        @JsonClass(generateAdapter = true)
        public static final class Request extends BatchSubscribe {
            private final long id;
            private final String jsonrpc;
            private final String method;
            private final Params params;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Request copy$default(Request request, long j, String str, String str2, Params params, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = request.id;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = request.jsonrpc;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    str2 = request.method;
                }
                String str4 = str2;
                if ((i & 8) != 0) {
                    params = request.params;
                }
                return request.copy(j2, str3, str4, params);
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
            public final Params component4() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Request copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                return new Request(j, str, str2, params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return this.id == request.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) request.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) request.method) && Intrinsics.EZpvd(this.params, request.params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public String getJsonrpc() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Params getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Request(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateClientToServerId():long A[MD:():long (m), WRAPPED] (LINE:124)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_BATCH_SUBSCRIBE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.RelayDTO$BatchSubscribe$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$BatchSubscribe$Request$Params):void (m)] (LINE:122) call: com.reown.foundation.network.model.RelayDTO.BatchSubscribe.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$BatchSubscribe$Request$Params):void type: THIS */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? UtilFunctionsKt.generateClientToServerId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_BATCH_SUBSCRIBE : str2, params);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Request(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                this.id = j;
                this.jsonrpc = str;
                this.method = str2;
                this.params = params;
            }

            @JsonClass(generateAdapter = true)
            public static final class Params {
                private final List<String> topics;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.foundation.network.model.RelayDTO$BatchSubscribe$Request$Params */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Params copy$default(Params params, List list, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = params.topics;
                    }
                    return params.copy(list);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component1() {
                    return this.topics;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Params copy(@Json(name = "topics") @NotNull List<String> list) {
                    Intrinsics.checkNotNullParameter(list, "");
                    return new Params(list);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Params) && Intrinsics.EZpvd(this.topics, ((Params) obj).topics);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getTopics() {
                    return this.topics;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.topics.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Params(topics=" + this.topics + ")";
                }

                public Params(@Json(name = "topics") @NotNull List<String> list) {
                    Intrinsics.checkNotNullParameter(list, "");
                    this.topics = list;
                }
            }
        }

        public static abstract class Result extends BatchSubscribe {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.BatchSubscribe.Result.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Result() {
                super(null);
            }

            @JsonClass(generateAdapter = true)
            public static final class Acknowledgement extends Result {
                private final long id;
                private final String jsonrpc;
                private final List<String> result;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.foundation.network.model.RelayDTO$BatchSubscribe$Result$Acknowledgement */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Acknowledgement copy$default(Acknowledgement acknowledgement, long j, String str, List list, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = acknowledgement.id;
                    }
                    if ((i & 2) != 0) {
                        str = acknowledgement.jsonrpc;
                    }
                    if ((i & 4) != 0) {
                        list = acknowledgement.result;
                    }
                    return acknowledgement.copy(j, str, list);
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
                public final List<String> component3() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Acknowledgement copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") @NotNull List<String> list) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    return new Acknowledgement(j, str, list);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Acknowledgement)) {
                        return false;
                    }
                    Acknowledgement acknowledgement = (Acknowledgement) obj;
                    return this.id == acknowledgement.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) acknowledgement.jsonrpc) && Intrinsics.EZpvd(this.result, acknowledgement.result);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getResult() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.result.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Acknowledgement(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 java.util.List)
 A[MD:(long, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:143) call: com.reown.foundation.network.model.RelayDTO.BatchSubscribe.Result.Acknowledgement.<init>(long, java.lang.String, java.util.List):void type: THIS */
                public /* synthetic */ Acknowledgement(long j, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, (i & 2) != 0 ? "2.0" : str, list);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Acknowledgement(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") @NotNull List<String> list) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    this.id = j;
                    this.jsonrpc = str;
                    this.result = list;
                }
            }

            @JsonClass(generateAdapter = true)
            public static final class JsonRpcError extends Result {
                private final Error error;
                private final long id;
                private final String jsonrpc;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, String str, Error error, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = jsonRpcError.jsonrpc;
                    }
                    if ((i & 2) != 0) {
                        error = jsonRpcError.error;
                    }
                    if ((i & 4) != 0) {
                        j = jsonRpcError.id;
                    }
                    return jsonRpcError.copy(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error component2() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component3() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonRpcError copy(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    return new JsonRpcError(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcError.jsonrpc) && Intrinsics.EZpvd(this.error, jsonRpcError.error) && this.id == jsonRpcError.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error getError() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((this.jsonrpc.hashCode() * 31) + this.error.hashCode()) * 31) + Long.hashCode(this.id);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "JsonRpcError(jsonrpc=" + this.jsonrpc + ", error=" + this.error + ", id=" + this.id + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r1v0 java.lang.String))
  (r2v0 com.reown.foundation.network.model.RelayDTO$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void (m)] (LINE:153) call: com.reown.foundation.network.model.RelayDTO.BatchSubscribe.Result.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void type: THIS */
                public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "2.0" : str, error, j);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JsonRpcError(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    this.jsonrpc = str;
                    this.error = error;
                    this.id = j;
                }
            }
        }
    }

    public static abstract class Subscription extends RelayDTO {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.Subscription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Subscription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Subscription() {
            super(null);
        }

        @JsonClass(generateAdapter = true)
        public static final class Request extends Subscription {
            private final long id;
            private final String jsonrpc;
            private final String method;
            private final Params params;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Request copy$default(Request request, long j, String str, String str2, Params params, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = request.id;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = request.jsonrpc;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    str2 = request.method;
                }
                String str4 = str2;
                if ((i & 8) != 0) {
                    params = request.params;
                }
                return request.copy(j2, str3, str4, params);
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
            public final Params component4() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Request copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                return new Request(j, str, str2, params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return this.id == request.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) request.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) request.method) && Intrinsics.EZpvd(this.params, request.params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public String getJsonrpc() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Params getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Request(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateClientToServerId():long A[MD:():long (m), WRAPPED] (LINE:169)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_SUBSCRIPTION java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.RelayDTO$Subscription$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$Subscription$Request$Params):void (m)] (LINE:167) call: com.reown.foundation.network.model.RelayDTO.Subscription.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$Subscription$Request$Params):void type: THIS */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? UtilFunctionsKt.generateClientToServerId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_SUBSCRIPTION : str2, params);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Request(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                this.id = j;
                this.jsonrpc = str;
                this.method = str2;
                this.params = params;
            }

            @JsonClass(generateAdapter = true)
            public static final class Params {
                private final SubscriptionData subscriptionData;

                @SubscriptionIdAdapter.Qualifier
                private final SubscriptionId subscriptionId;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Params copy$default(Params params, SubscriptionId subscriptionId, SubscriptionData subscriptionData, int i, Object obj) {
                    if ((i & 1) != 0) {
                        subscriptionId = params.subscriptionId;
                    }
                    if ((i & 2) != 0) {
                        subscriptionData = params.subscriptionData;
                    }
                    return params.copy(subscriptionId, subscriptionData);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SubscriptionId component1() {
                    return this.subscriptionId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SubscriptionData component2() {
                    return this.subscriptionData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Params copy(@Json(name = "id") @NotNull SubscriptionId subscriptionId, @Json(name = "data") @NotNull SubscriptionData subscriptionData) {
                    Intrinsics.checkNotNullParameter(subscriptionId, "");
                    Intrinsics.checkNotNullParameter(subscriptionData, "");
                    return new Params(subscriptionId, subscriptionData);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Params)) {
                        return false;
                    }
                    Params params = (Params) obj;
                    return Intrinsics.EZpvd(this.subscriptionId, params.subscriptionId) && Intrinsics.EZpvd(this.subscriptionData, params.subscriptionData);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SubscriptionData getSubscriptionData() {
                    return this.subscriptionData;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SubscriptionId getSubscriptionId() {
                    return this.subscriptionId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (this.subscriptionId.hashCode() * 31) + this.subscriptionData.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Params(subscriptionId=" + this.subscriptionId + ", subscriptionData=" + this.subscriptionData + ")";
                }

                public Params(@Json(name = "id") @NotNull SubscriptionId subscriptionId, @Json(name = "data") @NotNull SubscriptionData subscriptionData) {
                    Intrinsics.checkNotNullParameter(subscriptionId, "");
                    Intrinsics.checkNotNullParameter(subscriptionData, "");
                    this.subscriptionId = subscriptionId;
                    this.subscriptionData = subscriptionData;
                }

                @JsonClass(generateAdapter = true)
                public static final class SubscriptionData {
                    private final String attestation;
                    private final String message;
                    private final long publishedAt;
                    private final int tag;

                    @TopicAdapter.Qualifier
                    private final Topic topic;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ SubscriptionData copy$default(SubscriptionData subscriptionData, Topic topic, String str, long j, String str2, int i, int i2, Object obj) {
                        if ((i2 & 1) != 0) {
                            topic = subscriptionData.topic;
                        }
                        if ((i2 & 2) != 0) {
                            str = subscriptionData.message;
                        }
                        String str3 = str;
                        if ((i2 & 4) != 0) {
                            j = subscriptionData.publishedAt;
                        }
                        long j2 = j;
                        if ((i2 & 8) != 0) {
                            str2 = subscriptionData.attestation;
                        }
                        String str4 = str2;
                        if ((i2 & 16) != 0) {
                            i = subscriptionData.tag;
                        }
                        return subscriptionData.copy(topic, str3, j2, str4, i);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Topic component1() {
                        return this.topic;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component2() {
                        return this.message;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final long component3() {
                        return this.publishedAt;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component4() {
                        return this.attestation;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final int component5() {
                        return this.tag;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final SubscriptionData copy(@Json(name = PushMessagingService.KEY_TOPIC) @NotNull Topic topic, @Json(name = "message") @NotNull String str, @Json(name = "publishedAt") long j, @Json(name = "attestation") String str2, @Json(name = "tag") int i) {
                        Intrinsics.checkNotNullParameter(topic, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        return new SubscriptionData(topic, str, j, str2, i);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof SubscriptionData)) {
                            return false;
                        }
                        SubscriptionData subscriptionData = (SubscriptionData) obj;
                        return Intrinsics.EZpvd(this.topic, subscriptionData.topic) && Intrinsics.EZpvd((Object) this.message, (Object) subscriptionData.message) && this.publishedAt == subscriptionData.publishedAt && Intrinsics.EZpvd((Object) this.attestation, (Object) subscriptionData.attestation) && this.tag == subscriptionData.tag;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getAttestation() {
                        return this.attestation;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getMessage() {
                        return this.message;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final long getPublishedAt() {
                        return this.publishedAt;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final int getTag() {
                        return this.tag;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Topic getTopic() {
                        return this.topic;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        int iHashCode = this.topic.hashCode();
                        int iHashCode2 = this.message.hashCode();
                        int iHashCode3 = Long.hashCode(this.publishedAt);
                        String str = this.attestation;
                        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.tag);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "SubscriptionData(topic=" + this.topic + ", message=" + this.message + ", publishedAt=" + this.publishedAt + ", attestation=" + this.attestation + ", tag=" + this.tag + ")";
                    }

                    public SubscriptionData(@Json(name = PushMessagingService.KEY_TOPIC) @NotNull Topic topic, @Json(name = "message") @NotNull String str, @Json(name = "publishedAt") long j, @Json(name = "attestation") String str2, @Json(name = "tag") int i) {
                        Intrinsics.checkNotNullParameter(topic, "");
                        Intrinsics.checkNotNullParameter(str, "");
                        this.topic = topic;
                        this.message = str;
                        this.publishedAt = j;
                        this.attestation = str2;
                        this.tag = i;
                    }
                }
            }
        }

        public static abstract class Result extends Subscription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.Subscription.Result.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Result() {
                super(null);
            }

            @JsonClass(generateAdapter = true)
            public static final class Acknowledgement extends Subscription {
                private final long id;
                private final String jsonrpc;
                private final boolean result;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Acknowledgement copy$default(Acknowledgement acknowledgement, long j, String str, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = acknowledgement.id;
                    }
                    if ((i & 2) != 0) {
                        str = acknowledgement.jsonrpc;
                    }
                    if ((i & 4) != 0) {
                        z = acknowledgement.result;
                    }
                    return acknowledgement.copy(j, str, z);
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
                public final boolean component3() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Acknowledgement copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") boolean z) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Acknowledgement(j, str, z);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Acknowledgement)) {
                        return false;
                    }
                    Acknowledgement acknowledgement = (Acknowledgement) obj;
                    return this.id == acknowledgement.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) acknowledgement.jsonrpc) && this.result == acknowledgement.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final boolean getResult() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + Boolean.hashCode(this.result);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Acknowledgement(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 boolean)
 A[MD:(long, java.lang.String, boolean):void (m)] (LINE:207) call: com.reown.foundation.network.model.RelayDTO.Subscription.Result.Acknowledgement.<init>(long, java.lang.String, boolean):void type: THIS */
                public /* synthetic */ Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, (i & 2) != 0 ? "2.0" : str, z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Acknowledgement(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") boolean z) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.id = j;
                    this.jsonrpc = str;
                    this.result = z;
                }
            }

            /* JADX INFO: loaded from: classes17.dex */
            @JsonClass(generateAdapter = true)
            public static final class JsonRpcError extends Subscription {
                private final Error error;
                private final long id;
                private final String jsonrpc;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, String str, Error error, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = jsonRpcError.jsonrpc;
                    }
                    if ((i & 2) != 0) {
                        error = jsonRpcError.error;
                    }
                    if ((i & 4) != 0) {
                        j = jsonRpcError.id;
                    }
                    return jsonRpcError.copy(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error component2() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component3() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonRpcError copy(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    return new JsonRpcError(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcError.jsonrpc) && Intrinsics.EZpvd(this.error, jsonRpcError.error) && this.id == jsonRpcError.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error getError() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((this.jsonrpc.hashCode() * 31) + this.error.hashCode()) * 31) + Long.hashCode(this.id);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "JsonRpcError(jsonrpc=" + this.jsonrpc + ", error=" + this.error + ", id=" + this.id + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r1v0 java.lang.String))
  (r2v0 com.reown.foundation.network.model.RelayDTO$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void (m)] (LINE:217) call: com.reown.foundation.network.model.RelayDTO.Subscription.Result.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void type: THIS */
                public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "2.0" : str, error, j);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JsonRpcError(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    this.jsonrpc = str;
                    this.error = error;
                    this.id = j;
                }
            }
        }
    }

    public static abstract class Unsubscribe extends RelayDTO {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.Unsubscribe.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Unsubscribe(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Unsubscribe() {
            super(null);
        }

        @JsonClass(generateAdapter = true)
        public static final class Request extends Unsubscribe {
            private final long id;
            private final String jsonrpc;
            private final String method;
            private final Params params;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Request copy$default(Request request, long j, String str, String str2, Params params, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = request.id;
                }
                long j2 = j;
                if ((i & 2) != 0) {
                    str = request.jsonrpc;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    str2 = request.method;
                }
                String str4 = str2;
                if ((i & 8) != 0) {
                    params = request.params;
                }
                return request.copy(j2, str3, str4, params);
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
            public final Params component4() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Request copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                return new Request(j, str, str2, params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Request)) {
                    return false;
                }
                Request request = (Request) obj;
                return this.id == request.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) request.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) request.method) && Intrinsics.EZpvd(this.params, request.params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.foundation.network.model.RelayDTO
            public String getJsonrpc() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Params getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Request(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: com.reown.util.UtilFunctionsKt.generateClientToServerId():long A[MD:():long (m), WRAPPED] (LINE:233)) : (r7v0 long))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0014: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_UNSUBSCRIBE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.RelayDTO$Unsubscribe$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$Unsubscribe$Request$Params):void (m)] (LINE:231) call: com.reown.foundation.network.model.RelayDTO.Unsubscribe.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.RelayDTO$Unsubscribe$Request$Params):void type: THIS */
            public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? UtilFunctionsKt.generateClientToServerId() : j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_UNSUBSCRIBE : str2, params);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Request(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = FirebaseAnalytics.Param.METHOD) @NotNull String str2, @Json(name = MetricsSQLiteCacheKt.METRICS_PARAMS) @NotNull Params params) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(params, "");
                this.id = j;
                this.jsonrpc = str;
                this.method = str2;
                this.params = params;
            }

            @JsonClass(generateAdapter = true)
            public static final class Params {

                @SubscriptionIdAdapter.Qualifier
                private final SubscriptionId subscriptionId;

                @TopicAdapter.Qualifier
                private final Topic topic;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Params copy$default(Params params, Topic topic, SubscriptionId subscriptionId, int i, Object obj) {
                    if ((i & 1) != 0) {
                        topic = params.topic;
                    }
                    if ((i & 2) != 0) {
                        subscriptionId = params.subscriptionId;
                    }
                    return params.copy(topic, subscriptionId);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Topic component1() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SubscriptionId component2() {
                    return this.subscriptionId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Params copy(@Json(name = PushMessagingService.KEY_TOPIC) @NotNull Topic topic, @Json(name = "id") @NotNull SubscriptionId subscriptionId) {
                    Intrinsics.checkNotNullParameter(topic, "");
                    Intrinsics.checkNotNullParameter(subscriptionId, "");
                    return new Params(topic, subscriptionId);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Params)) {
                        return false;
                    }
                    Params params = (Params) obj;
                    return Intrinsics.EZpvd(this.topic, params.topic) && Intrinsics.EZpvd(this.subscriptionId, params.subscriptionId);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final SubscriptionId getSubscriptionId() {
                    return this.subscriptionId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Topic getTopic() {
                    return this.topic;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (this.topic.hashCode() * 31) + this.subscriptionId.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Params(topic=" + this.topic + ", subscriptionId=" + this.subscriptionId + ")";
                }

                public Params(@Json(name = PushMessagingService.KEY_TOPIC) @NotNull Topic topic, @Json(name = "id") @NotNull SubscriptionId subscriptionId) {
                    Intrinsics.checkNotNullParameter(topic, "");
                    Intrinsics.checkNotNullParameter(subscriptionId, "");
                    this.topic = topic;
                    this.subscriptionId = subscriptionId;
                }
            }
        }

        public static abstract class Result extends Unsubscribe {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.RelayDTO.Unsubscribe.Result.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Result() {
                super(null);
            }

            @JsonClass(generateAdapter = true)
            public static final class Acknowledgement extends Result {
                private final long id;
                private final String jsonrpc;
                private final boolean result;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Acknowledgement copy$default(Acknowledgement acknowledgement, long j, String str, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = acknowledgement.id;
                    }
                    if ((i & 2) != 0) {
                        str = acknowledgement.jsonrpc;
                    }
                    if ((i & 4) != 0) {
                        z = acknowledgement.result;
                    }
                    return acknowledgement.copy(j, str, z);
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
                public final boolean component3() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Acknowledgement copy(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") boolean z) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Acknowledgement(j, str, z);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Acknowledgement)) {
                        return false;
                    }
                    Acknowledgement acknowledgement = (Acknowledgement) obj;
                    return this.id == acknowledgement.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) acknowledgement.jsonrpc) && this.result == acknowledgement.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final boolean getResult() {
                    return this.result;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + Boolean.hashCode(this.result);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Acknowledgement(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 boolean)
 A[MD:(long, java.lang.String, boolean):void (m)] (LINE:256) call: com.reown.foundation.network.model.RelayDTO.Unsubscribe.Result.Acknowledgement.<init>(long, java.lang.String, boolean):void type: THIS */
                public /* synthetic */ Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, (i & 2) != 0 ? "2.0" : str, z);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Acknowledgement(@Json(name = "id") long j, @Json(name = "jsonrpc") @NotNull String str, @Json(name = "result") boolean z) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.id = j;
                    this.jsonrpc = str;
                    this.result = z;
                }
            }

            @JsonClass(generateAdapter = true)
            public static final class JsonRpcError extends Result {
                private final Error error;
                private final long id;
                private final String jsonrpc;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, String str, Error error, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = jsonRpcError.jsonrpc;
                    }
                    if ((i & 2) != 0) {
                        error = jsonRpcError.error;
                    }
                    if ((i & 4) != 0) {
                        j = jsonRpcError.id;
                    }
                    return jsonRpcError.copy(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error component2() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final long component3() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonRpcError copy(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    return new JsonRpcError(str, error, j);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof JsonRpcError)) {
                        return false;
                    }
                    JsonRpcError jsonRpcError = (JsonRpcError) obj;
                    return Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcError.jsonrpc) && Intrinsics.EZpvd(this.error, jsonRpcError.error) && this.id == jsonRpcError.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Error getError() {
                    return this.error;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public long getId() {
                    return this.id;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.reown.foundation.network.model.RelayDTO
                public String getJsonrpc() {
                    return this.jsonrpc;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((this.jsonrpc.hashCode() * 31) + this.error.hashCode()) * 31) + Long.hashCode(this.id);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "JsonRpcError(jsonrpc=" + this.jsonrpc + ", error=" + this.error + ", id=" + this.id + ")";
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r1v0 java.lang.String))
  (r2v0 com.reown.foundation.network.model.RelayDTO$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void (m)] (LINE:266) call: com.reown.foundation.network.model.RelayDTO.Unsubscribe.Result.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.RelayDTO$Error, long):void type: THIS */
                public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "2.0" : str, error, j);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public JsonRpcError(@Json(name = "jsonrpc") @NotNull String str, @Json(name = Constants.IPC_BUNDLE_KEY_SEND_ERROR) @NotNull Error error, @Json(name = "id") long j) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(error, "");
                    this.jsonrpc = str;
                    this.error = error;
                    this.id = j;
                }
            }
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class Error {
        private final long code;
        private final String errorMessage;
        private final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = error.code;
            }
            if ((i & 2) != 0) {
                str = error.message;
            }
            return error.copy(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@Json(name = "code") long j, @Json(name = "message") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Error(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.code == error.code && Intrinsics.EZpvd((Object) this.message, (Object) error.message);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Long.hashCode(this.code) * 31) + this.message.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(code=" + this.code + ", message=" + this.message + ")";
        }

        public Error(@Json(name = "code") long j, @Json(name = "message") @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.code = j;
            this.message = str;
            this.errorMessage = "Error code: " + j + "; Error message: " + str;
        }
    }
}
