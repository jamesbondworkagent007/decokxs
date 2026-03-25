package com.reown.foundation.network.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Relay {
    public static final Relay INSTANCE = new Relay();

    private Relay() {
    }

    public static abstract class Model {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Model(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Model() {
        }

        public static abstract class Call extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.Call.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Call(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract long getId();

            public abstract String getJsonrpc();

            private Call() {
                super(null);
            }

            public static abstract class Publish extends Call {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.Call.Publish.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Publish(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Publish() {
                    super(null);
                }

                /* JADX INFO: loaded from: classes17.dex */
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
                    public final Request copy(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 long)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000b: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_PUBLISH java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.Relay$Model$Call$Publish$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$Publish$Request$Params):void (m)] (LINE:13) call: com.reown.foundation.network.model.Relay.Model.Call.Publish.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$Publish$Request$Params):void type: THIS */
                    public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_PUBLISH : str2, params);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Request(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(params, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.method = str2;
                        this.params = params;
                    }

                    /* JADX INFO: loaded from: classes24.dex */
                    public static final class Params {
                        private final String message;
                        private final Boolean prompt;
                        private final int tag;
                        private final String topic;
                        private final long ttl;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public static /* synthetic */ Params copy$default(Params params, String str, String str2, long j, int i, Boolean bool, int i2, Object obj) {
                            if ((i2 & 1) != 0) {
                                str = params.topic;
                            }
                            if ((i2 & 2) != 0) {
                                str2 = params.message;
                            }
                            String str3 = str2;
                            if ((i2 & 4) != 0) {
                                j = params.ttl;
                            }
                            long j2 = j;
                            if ((i2 & 8) != 0) {
                                i = params.tag;
                            }
                            int i3 = i;
                            if ((i2 & 16) != 0) {
                                bool = params.prompt;
                            }
                            return params.copy(str, str3, j2, i3, bool);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component1() {
                            return this.topic;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component2() {
                            return this.message;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final long component3() {
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
                        public final Params copy(@NotNull String str, @NotNull String str2, long j, int i, Boolean bool) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(str2, "");
                            return new Params(str, str2, j, i, bool);
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
                            return Intrinsics.EZpvd((Object) this.topic, (Object) params.topic) && Intrinsics.EZpvd((Object) this.message, (Object) params.message) && this.ttl == params.ttl && this.tag == params.tag && Intrinsics.EZpvd(this.prompt, params.prompt);
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
                        public final String getTopic() {
                            return this.topic;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final long getTtl() {
                            return this.ttl;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public int hashCode() {
                            int iHashCode = this.topic.hashCode();
                            int iHashCode2 = this.message.hashCode();
                            int iHashCode3 = Long.hashCode(this.ttl);
                            int iHashCode4 = Integer.hashCode(this.tag);
                            Boolean bool = this.prompt;
                            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode());
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public String toString() {
                            return "Params(topic=" + this.topic + ", message=" + this.message + ", ttl=" + this.ttl + ", tag=" + this.tag + ", prompt=" + this.prompt + ")";
                        }

                        public Params(@NotNull String str, @NotNull String str2, long j, int i, Boolean bool) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(str2, "");
                            this.topic = str;
                            this.message = str2;
                            this.ttl = j;
                            this.tag = i;
                            this.prompt = bool;
                        }
                    }
                }

                public static final class Acknowledgement extends Publish {
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
                    public final Acknowledgement copy(long j, @NotNull String str, boolean z) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
 A[MD:(long, java.lang.String, boolean):void (m)] (LINE:29) call: com.reown.foundation.network.model.Relay.Model.Call.Publish.Acknowledgement.<init>(long, java.lang.String, boolean):void type: THIS */
                    public /* synthetic */ Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, z);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Acknowledgement(long j, @NotNull String str, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.result = z;
                    }
                }

                /* JADX INFO: loaded from: classes17.dex */
                public static final class JsonRpcError extends Publish {
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
                    public final JsonRpcError copy(@NotNull String str, @NotNull Error error, long j) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
  (r2v0 com.reown.foundation.network.model.Relay$Model$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void (m)] (LINE:35) call: com.reown.foundation.network.model.Relay.Model.Call.Publish.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void type: THIS */
                    public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "2.0" : str, error, j);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public JsonRpcError(@NotNull String str, @NotNull Error error, long j) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(error, "");
                        this.jsonrpc = str;
                        this.error = error;
                        this.id = j;
                    }
                }
            }

            public static abstract class Subscribe extends Call {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.Call.Subscribe.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Subscribe(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Subscribe() {
                    super(null);
                }

                /* JADX INFO: loaded from: classes17.dex */
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
                    public final Request copy(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 long)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000b: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_SUBSCRIBE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.Relay$Model$Call$Subscribe$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$Subscribe$Request$Params):void (m)] (LINE:44) call: com.reown.foundation.network.model.Relay.Model.Call.Subscribe.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$Subscribe$Request$Params):void type: THIS */
                    public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_SUBSCRIBE : str2, params);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Request(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(params, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.method = str2;
                        this.params = params;
                    }

                    /* JADX INFO: loaded from: classes24.dex */
                    public static final class Params {
                        private final String topic;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public static /* synthetic */ Params copy$default(Params params, String str, int i, Object obj) {
                            if ((i & 1) != 0) {
                                str = params.topic;
                            }
                            return params.copy(str);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component1() {
                            return this.topic;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Params copy(@NotNull String str) {
                            Intrinsics.checkNotNullParameter(str, "");
                            return new Params(str);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof Params) && Intrinsics.EZpvd((Object) this.topic, (Object) ((Params) obj).topic);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String getTopic() {
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

                        public Params(@NotNull String str) {
                            Intrinsics.checkNotNullParameter(str, "");
                            this.topic = str;
                        }
                    }
                }

                public static final class Acknowledgement extends Subscribe {
                    private final long id;
                    private final String jsonrpc;
                    private final String result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ Acknowledgement copy$default(Acknowledgement acknowledgement, long j, String str, String str2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            j = acknowledgement.id;
                        }
                        if ((i & 2) != 0) {
                            str = acknowledgement.jsonrpc;
                        }
                        if ((i & 4) != 0) {
                            str2 = acknowledgement.result;
                        }
                        return acknowledgement.copy(j, str, str2);
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
                        return this.result;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final Acknowledgement copy(long j, @NotNull String str, @NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        return new Acknowledgement(j, str, str2);
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
                        return this.id == acknowledgement.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) acknowledgement.jsonrpc) && Intrinsics.EZpvd((Object) this.result, (Object) acknowledgement.result);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public String getJsonrpc() {
                        return this.jsonrpc;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getResult() {
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
  (r4v0 java.lang.String)
 A[MD:(long, java.lang.String, java.lang.String):void (m)] (LINE:56) call: com.reown.foundation.network.model.Relay.Model.Call.Subscribe.Acknowledgement.<init>(long, java.lang.String, java.lang.String):void type: THIS */
                    public /* synthetic */ Acknowledgement(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, str2);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Acknowledgement(long j, @NotNull String str, @NotNull String str2) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.result = str2;
                    }
                }

                /* JADX INFO: loaded from: classes17.dex */
                public static final class JsonRpcError extends Subscribe {
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
                    public final JsonRpcError copy(@NotNull String str, @NotNull Error error, long j) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
  (r2v0 com.reown.foundation.network.model.Relay$Model$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void (m)] (LINE:62) call: com.reown.foundation.network.model.Relay.Model.Call.Subscribe.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void type: THIS */
                    public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "2.0" : str, error, j);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public JsonRpcError(@NotNull String str, @NotNull Error error, long j) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(error, "");
                        this.jsonrpc = str;
                        this.error = error;
                        this.id = j;
                    }
                }
            }

            public static abstract class BatchSubscribe extends Call {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.Call.BatchSubscribe.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ BatchSubscribe(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private BatchSubscribe() {
                    super(null);
                }

                /* JADX INFO: loaded from: classes17.dex */
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
                    public final Request copy(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 long)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000b: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_BATCH_SUBSCRIBE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Request$Params):void (m)] (LINE:71) call: com.reown.foundation.network.model.Relay.Model.Call.BatchSubscribe.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Request$Params):void type: THIS */
                    public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_BATCH_SUBSCRIBE : str2, params);
                    }

                    /* JADX INFO: loaded from: classes24.dex */
                    public static final class Params {
                        private final List<String> topics;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Request$Params */
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
                        public final Params copy(@NotNull List<String> list) {
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

                        public Params(@NotNull List<String> list) {
                            Intrinsics.checkNotNullParameter(list, "");
                            this.topics = list;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Request(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(params, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.method = str2;
                        this.params = params;
                    }
                }

                public static final class Acknowledgement extends Subscribe {
                    private final long id;
                    private final String jsonrpc;
                    private final List<String> result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.foundation.network.model.Relay$Model$Call$BatchSubscribe$Acknowledgement */
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
                    public final Acknowledgement copy(long j, @NotNull String str, @NotNull List<String> list) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
 A[MD:(long, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:80) call: com.reown.foundation.network.model.Relay.Model.Call.BatchSubscribe.Acknowledgement.<init>(long, java.lang.String, java.util.List):void type: THIS */
                    public /* synthetic */ Acknowledgement(long j, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, list);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Acknowledgement(long j, @NotNull String str, @NotNull List<String> list) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(list, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.result = list;
                    }
                }

                /* JADX INFO: loaded from: classes17.dex */
                public static final class JsonRpcError extends Subscribe {
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
                    public final JsonRpcError copy(@NotNull String str, @NotNull Error error, long j) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
  (r2v0 com.reown.foundation.network.model.Relay$Model$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void (m)] (LINE:86) call: com.reown.foundation.network.model.Relay.Model.Call.BatchSubscribe.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void type: THIS */
                    public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "2.0" : str, error, j);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public JsonRpcError(@NotNull String str, @NotNull Error error, long j) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(error, "");
                        this.jsonrpc = str;
                        this.error = error;
                        this.id = j;
                    }
                }
            }

            public static abstract class Subscription extends Call {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.Call.Subscription.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Subscription(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Subscription() {
                    super(null);
                }

                public static final class Request extends Subscription {
                    private final String attestation;
                    private final long id;
                    private final String jsonrpc;
                    private final String message;
                    private final String method;
                    private final Params params;
                    private final long publishedAt;
                    private final String subscriptionTopic;
                    private final int tag;

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
                    public final Request copy(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
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
                    public final String getAttestation() {
                        return this.attestation;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public String getJsonrpc() {
                        return this.jsonrpc;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getMessage() {
                        return this.message;
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
                    public final long getPublishedAt() {
                        return this.publishedAt;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getSubscriptionTopic() {
                        return this.subscriptionTopic;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final int getTag() {
                        return this.tag;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return (((((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "Request(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 long)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000b: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_SUBSCRIPTION java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.Relay$Model$Call$Subscription$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$Subscription$Request$Params):void (m)] (LINE:95) call: com.reown.foundation.network.model.Relay.Model.Call.Subscription.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$Subscription$Request$Params):void type: THIS */
                    public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_SUBSCRIPTION : str2, params);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Request(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(params, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.method = str2;
                        this.params = params;
                        this.subscriptionTopic = params.getSubscriptionData().getTopic();
                        this.message = params.getSubscriptionData().getMessage();
                        this.tag = params.getSubscriptionData().getTag();
                        this.publishedAt = params.getSubscriptionData().getPublishedAt();
                        this.attestation = params.getSubscriptionData().getAttestation();
                    }

                    public static final class Params {
                        private final SubscriptionData subscriptionData;
                        private final String subscriptionId;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public static /* synthetic */ Params copy$default(Params params, String str, SubscriptionData subscriptionData, int i, Object obj) {
                            if ((i & 1) != 0) {
                                str = params.subscriptionId;
                            }
                            if ((i & 2) != 0) {
                                subscriptionData = params.subscriptionData;
                            }
                            return params.copy(str, subscriptionData);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component1() {
                            return this.subscriptionId;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final SubscriptionData component2() {
                            return this.subscriptionData;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Params copy(@NotNull String str, @NotNull SubscriptionData subscriptionData) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(subscriptionData, "");
                            return new Params(str, subscriptionData);
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
                            return Intrinsics.EZpvd((Object) this.subscriptionId, (Object) params.subscriptionId) && Intrinsics.EZpvd(this.subscriptionData, params.subscriptionData);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final SubscriptionData getSubscriptionData() {
                            return this.subscriptionData;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String getSubscriptionId() {
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

                        public Params(@NotNull String str, @NotNull SubscriptionData subscriptionData) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(subscriptionData, "");
                            this.subscriptionId = str;
                            this.subscriptionData = subscriptionData;
                        }

                        public static final class SubscriptionData {
                            private final String attestation;
                            private final String message;
                            private final long publishedAt;
                            private final int tag;
                            private final String topic;

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public static /* synthetic */ SubscriptionData copy$default(SubscriptionData subscriptionData, String str, String str2, long j, String str3, int i, int i2, Object obj) {
                                if ((i2 & 1) != 0) {
                                    str = subscriptionData.topic;
                                }
                                if ((i2 & 2) != 0) {
                                    str2 = subscriptionData.message;
                                }
                                String str4 = str2;
                                if ((i2 & 4) != 0) {
                                    j = subscriptionData.publishedAt;
                                }
                                long j2 = j;
                                if ((i2 & 8) != 0) {
                                    str3 = subscriptionData.attestation;
                                }
                                String str5 = str3;
                                if ((i2 & 16) != 0) {
                                    i = subscriptionData.tag;
                                }
                                return subscriptionData.copy(str, str4, j2, str5, i);
                            }

                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            public final String component1() {
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
                            public final SubscriptionData copy(@NotNull String str, @NotNull String str2, long j, String str3, int i) {
                                Intrinsics.checkNotNullParameter(str, "");
                                Intrinsics.checkNotNullParameter(str2, "");
                                return new SubscriptionData(str, str2, j, str3, i);
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
                                return Intrinsics.EZpvd((Object) this.topic, (Object) subscriptionData.topic) && Intrinsics.EZpvd((Object) this.message, (Object) subscriptionData.message) && this.publishedAt == subscriptionData.publishedAt && Intrinsics.EZpvd((Object) this.attestation, (Object) subscriptionData.attestation) && this.tag == subscriptionData.tag;
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
                            public final String getTopic() {
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

                            public SubscriptionData(@NotNull String str, @NotNull String str2, long j, String str3, int i) {
                                Intrinsics.checkNotNullParameter(str, "");
                                Intrinsics.checkNotNullParameter(str2, "");
                                this.topic = str;
                                this.message = str2;
                                this.publishedAt = j;
                                this.attestation = str3;
                                this.tag = i;
                            }
                        }
                    }
                }

                /* JADX INFO: loaded from: classes17.dex */
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
                    public final Acknowledgement copy(long j, @NotNull String str, boolean z) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
 A[MD:(long, java.lang.String, boolean):void (m)] (LINE:123) call: com.reown.foundation.network.model.Relay.Model.Call.Subscription.Acknowledgement.<init>(long, java.lang.String, boolean):void type: THIS */
                    public /* synthetic */ Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, z);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Acknowledgement(long j, @NotNull String str, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.result = z;
                    }
                }

                /* JADX INFO: loaded from: classes17.dex */
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
                    public final JsonRpcError copy(@NotNull String str, @NotNull Error error, long j) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
  (r2v0 com.reown.foundation.network.model.Relay$Model$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void (m)] (LINE:129) call: com.reown.foundation.network.model.Relay.Model.Call.Subscription.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void type: THIS */
                    public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "2.0" : str, error, j);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public JsonRpcError(@NotNull String str, @NotNull Error error, long j) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(error, "");
                        this.jsonrpc = str;
                        this.error = error;
                        this.id = j;
                    }
                }
            }

            public static abstract class Unsubscribe extends Call {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.Call.Unsubscribe.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Unsubscribe(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Unsubscribe() {
                    super(null);
                }

                /* JADX INFO: loaded from: classes17.dex */
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
                    public final Request copy(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 long)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x000b: SGET  A[WRAPPED] com.reown.foundation.network.model.JsonRpcRelayKt.IRN_UNSUBSCRIBE java.lang.String) : (r10v0 java.lang.String))
  (r11v0 com.reown.foundation.network.model.Relay$Model$Call$Unsubscribe$Request$Params)
 A[MD:(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$Unsubscribe$Request$Params):void (m)] (LINE:138) call: com.reown.foundation.network.model.Relay.Model.Call.Unsubscribe.Request.<init>(long, java.lang.String, java.lang.String, com.reown.foundation.network.model.Relay$Model$Call$Unsubscribe$Request$Params):void type: THIS */
                    public /* synthetic */ Request(long j, String str, String str2, Params params, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, (i & 4) != 0 ? JsonRpcRelayKt.IRN_UNSUBSCRIBE : str2, params);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Request(long j, @NotNull String str, @NotNull String str2, @NotNull Params params) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        Intrinsics.checkNotNullParameter(params, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.method = str2;
                        this.params = params;
                    }

                    /* JADX INFO: loaded from: classes24.dex */
                    public static final class Params {
                        private final String subscriptionId;
                        private final String topic;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public static /* synthetic */ Params copy$default(Params params, String str, String str2, int i, Object obj) {
                            if ((i & 1) != 0) {
                                str = params.topic;
                            }
                            if ((i & 2) != 0) {
                                str2 = params.subscriptionId;
                            }
                            return params.copy(str, str2);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component1() {
                            return this.topic;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String component2() {
                            return this.subscriptionId;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final Params copy(@NotNull String str, @NotNull String str2) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(str2, "");
                            return new Params(str, str2);
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
                            return Intrinsics.EZpvd((Object) this.topic, (Object) params.topic) && Intrinsics.EZpvd((Object) this.subscriptionId, (Object) params.subscriptionId);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String getSubscriptionId() {
                            return this.subscriptionId;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public final String getTopic() {
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

                        public Params(@NotNull String str, @NotNull String str2) {
                            Intrinsics.checkNotNullParameter(str, "");
                            Intrinsics.checkNotNullParameter(str2, "");
                            this.topic = str;
                            this.subscriptionId = str2;
                        }
                    }
                }

                public static final class Acknowledgement extends Unsubscribe {
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
                    public final Acknowledgement copy(long j, @NotNull String str, boolean z) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
 A[MD:(long, java.lang.String, boolean):void (m)] (LINE:151) call: com.reown.foundation.network.model.Relay.Model.Call.Unsubscribe.Acknowledgement.<init>(long, java.lang.String, boolean):void type: THIS */
                    public /* synthetic */ Acknowledgement(long j, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, (i & 2) != 0 ? "2.0" : str, z);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Acknowledgement(long j, @NotNull String str, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(str, "");
                        this.id = j;
                        this.jsonrpc = str;
                        this.result = z;
                    }
                }

                /* JADX INFO: loaded from: classes17.dex */
                public static final class JsonRpcError extends Unsubscribe {
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
                    public final JsonRpcError copy(@NotNull String str, @NotNull Error error, long j) {
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
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
                    public long getId() {
                        return this.id;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.reown.foundation.network.model.Relay.Model.Call
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
  (r2v0 com.reown.foundation.network.model.Relay$Model$Error)
  (r3v0 long)
 A[MD:(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void (m)] (LINE:157) call: com.reown.foundation.network.model.Relay.Model.Call.Unsubscribe.JsonRpcError.<init>(java.lang.String, com.reown.foundation.network.model.Relay$Model$Error, long):void type: THIS */
                    public /* synthetic */ JsonRpcError(String str, Error error, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "2.0" : str, error, j);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public JsonRpcError(@NotNull String str, @NotNull Error error, long j) {
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

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Error extends Model {
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
            public final Error copy(long j, @NotNull String str) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(long j, @NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.code = j;
                this.message = str;
                this.errorMessage = "Error code: " + j + "; Error message: " + str;
            }
        }

        public static abstract class Event extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.Event.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final class OnConnectionOpened<WEB_SOCKET> extends Event {
                private final WEB_SOCKET webSocket;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.foundation.network.model.Relay$Model$Event$OnConnectionOpened */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ OnConnectionOpened copy$default(OnConnectionOpened onConnectionOpened, Object obj, int i, Object obj2) {
                    if ((i & 1) != 0) {
                        obj = onConnectionOpened.webSocket;
                    }
                    return onConnectionOpened.copy(obj);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final WEB_SOCKET component1() {
                    return this.webSocket;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final OnConnectionOpened<WEB_SOCKET> copy(@NotNull WEB_SOCKET web_socket) {
                    Intrinsics.checkNotNullParameter(web_socket, "");
                    return new OnConnectionOpened<>(web_socket);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof OnConnectionOpened) && Intrinsics.EZpvd(this.webSocket, ((OnConnectionOpened) obj).webSocket);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final WEB_SOCKET getWebSocket() {
                    return this.webSocket;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.webSocket.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "OnConnectionOpened(webSocket=" + this.webSocket + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OnConnectionOpened(@NotNull WEB_SOCKET web_socket) {
                    super(null);
                    Intrinsics.checkNotNullParameter(web_socket, "");
                    this.webSocket = web_socket;
                }
            }

            private Event() {
                super(null);
            }

            public static final class OnMessageReceived extends Event {
                private final Message message;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ OnMessageReceived copy$default(OnMessageReceived onMessageReceived, Message message, int i, Object obj) {
                    if ((i & 1) != 0) {
                        message = onMessageReceived.message;
                    }
                    return onMessageReceived.copy(message);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Message component1() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final OnMessageReceived copy(@NotNull Message message) {
                    Intrinsics.checkNotNullParameter(message, "");
                    return new OnMessageReceived(message);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof OnMessageReceived) && Intrinsics.EZpvd(this.message, ((OnMessageReceived) obj).message);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Message getMessage() {
                    return this.message;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.message.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "OnMessageReceived(message=" + this.message + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OnMessageReceived(@NotNull Message message) {
                    super(null);
                    Intrinsics.checkNotNullParameter(message, "");
                    this.message = message;
                }
            }

            public static final class OnConnectionClosing extends Event {
                private final ShutdownReason shutdownReason;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ OnConnectionClosing copy$default(OnConnectionClosing onConnectionClosing, ShutdownReason shutdownReason, int i, Object obj) {
                    if ((i & 1) != 0) {
                        shutdownReason = onConnectionClosing.shutdownReason;
                    }
                    return onConnectionClosing.copy(shutdownReason);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final ShutdownReason component1() {
                    return this.shutdownReason;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final OnConnectionClosing copy(@NotNull ShutdownReason shutdownReason) {
                    Intrinsics.checkNotNullParameter(shutdownReason, "");
                    return new OnConnectionClosing(shutdownReason);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof OnConnectionClosing) && Intrinsics.EZpvd(this.shutdownReason, ((OnConnectionClosing) obj).shutdownReason);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final ShutdownReason getShutdownReason() {
                    return this.shutdownReason;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.shutdownReason.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "OnConnectionClosing(shutdownReason=" + this.shutdownReason + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OnConnectionClosing(@NotNull ShutdownReason shutdownReason) {
                    super(null);
                    Intrinsics.checkNotNullParameter(shutdownReason, "");
                    this.shutdownReason = shutdownReason;
                }
            }

            public static final class OnConnectionClosed extends Event {
                private final ShutdownReason shutdownReason;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ OnConnectionClosed copy$default(OnConnectionClosed onConnectionClosed, ShutdownReason shutdownReason, int i, Object obj) {
                    if ((i & 1) != 0) {
                        shutdownReason = onConnectionClosed.shutdownReason;
                    }
                    return onConnectionClosed.copy(shutdownReason);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final ShutdownReason component1() {
                    return this.shutdownReason;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final OnConnectionClosed copy(@NotNull ShutdownReason shutdownReason) {
                    Intrinsics.checkNotNullParameter(shutdownReason, "");
                    return new OnConnectionClosed(shutdownReason);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof OnConnectionClosed) && Intrinsics.EZpvd(this.shutdownReason, ((OnConnectionClosed) obj).shutdownReason);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final ShutdownReason getShutdownReason() {
                    return this.shutdownReason;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.shutdownReason.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "OnConnectionClosed(shutdownReason=" + this.shutdownReason + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OnConnectionClosed(@NotNull ShutdownReason shutdownReason) {
                    super(null);
                    Intrinsics.checkNotNullParameter(shutdownReason, "");
                    this.shutdownReason = shutdownReason;
                }
            }

            public static final class OnConnectionFailed extends Event {
                private final Throwable throwable;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ OnConnectionFailed copy$default(OnConnectionFailed onConnectionFailed, Throwable th, int i, Object obj) {
                    if ((i & 1) != 0) {
                        th = onConnectionFailed.throwable;
                    }
                    return onConnectionFailed.copy(th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Throwable component1() {
                    return this.throwable;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final OnConnectionFailed copy(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    return new OnConnectionFailed(th);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof OnConnectionFailed) && Intrinsics.EZpvd(this.throwable, ((OnConnectionFailed) obj).throwable);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Throwable getThrowable() {
                    return this.throwable;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.throwable.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "OnConnectionFailed(throwable=" + this.throwable + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OnConnectionFailed(@NotNull Throwable th) {
                    super(null);
                    Intrinsics.checkNotNullParameter(th, "");
                    this.throwable = th;
                }
            }
        }

        public static abstract class Message extends Model {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.model.Relay.Model.Message.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final class Text extends Message {
                private final String value;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = text.value;
                    }
                    return text.copy(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.value;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Text copy(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new Text(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Text) && Intrinsics.EZpvd((Object) this.value, (Object) ((Text) obj).value);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getValue() {
                    return this.value;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.value.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Text(value=" + this.value + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Text(@NotNull String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(str, "");
                    this.value = str;
                }
            }

            private Message() {
                super(null);
            }

            public static final class Bytes extends Message {
                private final byte[] value;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final byte[] getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Bytes(@NotNull byte[] bArr) {
                    super(null);
                    Intrinsics.checkNotNullParameter(bArr, "");
                    this.value = bArr;
                }
            }
        }

        public static final class ShutdownReason extends Model {
            private final int code;
            private final String reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ShutdownReason copy$default(ShutdownReason shutdownReason, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = shutdownReason.code;
                }
                if ((i2 & 2) != 0) {
                    str = shutdownReason.reason;
                }
                return shutdownReason.copy(i, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component1() {
                return this.code;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ShutdownReason copy(int i, @NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ShutdownReason(i, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShutdownReason)) {
                    return false;
                }
                ShutdownReason shutdownReason = (ShutdownReason) obj;
                return this.code == shutdownReason.code && Intrinsics.EZpvd((Object) this.reason, (Object) shutdownReason.reason);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getCode() {
                return this.code;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.code) * 31) + this.reason.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShutdownReason(code=" + this.code + ", reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShutdownReason(int i, @NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.code = i;
                this.reason = str;
            }
        }

        public static final class IrnParams extends Model {
            private final boolean prompt;
            private final int tag;
            private final long ttl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ IrnParams copy$default(IrnParams irnParams, int i, long j, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = irnParams.tag;
                }
                if ((i2 & 2) != 0) {
                    j = irnParams.ttl;
                }
                if ((i2 & 4) != 0) {
                    z = irnParams.prompt;
                }
                return irnParams.copy(i, j, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component1() {
                return this.tag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component2() {
                return this.ttl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component3() {
                return this.prompt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final IrnParams copy(int i, long j, boolean z) {
                return new IrnParams(i, j, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IrnParams)) {
                    return false;
                }
                IrnParams irnParams = (IrnParams) obj;
                return this.tag == irnParams.tag && this.ttl == irnParams.ttl && this.prompt == irnParams.prompt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean getPrompt() {
                return this.prompt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getTag() {
                return this.tag;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getTtl() {
                return this.ttl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((Integer.hashCode(this.tag) * 31) + Long.hashCode(this.ttl)) * 31) + Boolean.hashCode(this.prompt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "IrnParams(tag=" + this.tag + ", ttl=" + this.ttl + ", prompt=" + this.prompt + ")";
            }

            public IrnParams(int i, long j, boolean z) {
                super(null);
                this.tag = i;
                this.ttl = j;
                this.prompt = z;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 long)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(int, long, boolean):void (m)] (LINE:187) call: com.reown.foundation.network.model.Relay.Model.IrnParams.<init>(int, long, boolean):void type: THIS */
            public /* synthetic */ IrnParams(int i, long j, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, j, (i2 & 4) != 0 ? false : z);
            }
        }
    }
}
