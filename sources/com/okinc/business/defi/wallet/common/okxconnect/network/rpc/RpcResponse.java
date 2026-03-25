package com.okinc.business.defi.wallet.common.okxconnect.network.rpc;

import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C16006ebl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(with = C16006ebl.class)
public interface RpcResponse {
    public static final Companion Companion = Companion.KWHzl;

    String getId();

    String getJsonrpc();

    public static final class Companion {
        public static final /* synthetic */ Companion KWHzl = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<RpcResponse> serializer() {
            return C16006ebl.copydefault;
        }
    }

    @Serializable
    public static final class Success implements RpcResponse {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String id;
        private final String jsonrpc;
        private final boolean result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.id;
            }
            if ((i & 2) != 0) {
                str2 = success.jsonrpc;
            }
            if ((i & 4) != 0) {
                z = success.result;
            }
            return success.copy(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
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
        public final Success copy(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Success(str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.EZpvd((Object) this.id, (Object) success.id) && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) success.jsonrpc) && this.result == success.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.jsonrpc.hashCode()) * 31) + Boolean.hashCode(this.result);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Success.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Success> serializer() {
                return RpcResponse$Success$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (4 != (i & 4)) {
                PluginExceptionsKt.throwMissingFieldException(i, 4, RpcResponse$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.id = (i & 1) == 0 ? String.valueOf(System.currentTimeMillis()) : str;
            if ((i & 2) == 0) {
                this.jsonrpc = "2.0";
            } else {
                this.jsonrpc = str2;
            }
            this.result = z;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Success success, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) success.getId(), (Object) String.valueOf(System.currentTimeMillis()))) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, success.getId());
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) success.getJsonrpc(), (Object) "2.0")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, success.getJsonrpc());
            }
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, success.result);
        }

        public Success(@NotNull String str, @NotNull String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.jsonrpc = str2;
            this.result = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0008: INVOKE (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:26)) STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:26)) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r4v0 java.lang.String))
  (r5v0 boolean)
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:25) call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Success.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Success(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? String.valueOf(System.currentTimeMillis()) : str, (i & 2) != 0 ? "2.0" : str2, z);
        }
    }

    @Serializable
    public static final class Error implements RpcResponse {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final OKXConnectException error;
        private final String id;
        private final String jsonrpc;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, String str, String str2, OKXConnectException oKXConnectException, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.id;
            }
            if ((i & 2) != 0) {
                str2 = error.jsonrpc;
            }
            if ((i & 4) != 0) {
                oKXConnectException = error.error;
            }
            return error.copy(str, str2, oKXConnectException);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKXConnectException component3() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@NotNull String str, @NotNull String str2, @NotNull OKXConnectException oKXConnectException) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(oKXConnectException, "");
            return new Error(str, str2, oKXConnectException);
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
            return Intrinsics.EZpvd((Object) this.id, (Object) error.id) && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) error.jsonrpc) && Intrinsics.EZpvd(this.error, error.error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKXConnectException getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.jsonrpc.hashCode()) * 31) + this.error.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", error=" + this.error + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Error.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Error> serializer() {
                return RpcResponse$Error$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Error(int i, String str, String str2, OKXConnectException oKXConnectException, SerializationConstructorMarker serializationConstructorMarker) {
            if (4 != (i & 4)) {
                PluginExceptionsKt.throwMissingFieldException(i, 4, RpcResponse$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.id = (i & 1) == 0 ? String.valueOf(System.currentTimeMillis()) : str;
            if ((i & 2) == 0) {
                this.jsonrpc = "2.0";
            } else {
                this.jsonrpc = str2;
            }
            this.error = oKXConnectException;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Error error, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) error.getId(), (Object) String.valueOf(System.currentTimeMillis()))) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, error.getId());
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) error.getJsonrpc(), (Object) "2.0")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, error.getJsonrpc());
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, OKXConnectException$$serializer.INSTANCE, error.error);
        }

        public Error(@NotNull String str, @NotNull String str2, @NotNull OKXConnectException oKXConnectException) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(oKXConnectException, "");
            this.id = str;
            this.jsonrpc = str2;
            this.error = oKXConnectException;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0008: INVOKE (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:37)) STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:37)) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r4v0 java.lang.String))
  (r5v0 com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException)
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException):void (m)] (LINE:36) call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Error.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException):void type: THIS */
        public /* synthetic */ Error(String str, String str2, OKXConnectException oKXConnectException, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? String.valueOf(System.currentTimeMillis()) : str, (i & 2) != 0 ? "2.0" : str2, oKXConnectException);
        }
    }

    @Serializable
    public static final class FetchSuccess implements RpcResponse {
        private final String id;
        private final String jsonrpc;
        private final FetchResult result;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FetchSuccess copy$default(FetchSuccess fetchSuccess, String str, String str2, FetchResult fetchResult, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fetchSuccess.id;
            }
            if ((i & 2) != 0) {
                str2 = fetchSuccess.jsonrpc;
            }
            if ((i & 4) != 0) {
                fetchResult = fetchSuccess.result;
            }
            return fetchSuccess.copy(str, str2, fetchResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchResult component3() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchSuccess copy(@NotNull String str, @NotNull String str2, @NotNull FetchResult fetchResult) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(fetchResult, "");
            return new FetchSuccess(str, str2, fetchResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FetchSuccess)) {
                return false;
            }
            FetchSuccess fetchSuccess = (FetchSuccess) obj;
            return Intrinsics.EZpvd((Object) this.id, (Object) fetchSuccess.id) && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) fetchSuccess.jsonrpc) && Intrinsics.EZpvd(this.result, fetchSuccess.result);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FetchResult getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.jsonrpc.hashCode()) * 31) + this.result.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FetchSuccess(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.FetchSuccess.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<FetchSuccess> serializer() {
                return RpcResponse$FetchSuccess$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ FetchSuccess(int i, String str, String str2, FetchResult fetchResult, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, RpcResponse$FetchSuccess$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.jsonrpc = str2;
            this.result = fetchResult;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(FetchSuccess fetchSuccess, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fetchSuccess.getId());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fetchSuccess.getJsonrpc());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, RpcResponse$FetchSuccess$FetchResult$$serializer.INSTANCE, fetchSuccess.result);
        }

        public FetchSuccess(@NotNull String str, @NotNull String str2, @NotNull FetchResult fetchResult) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(fetchResult, "");
            this.id = str;
            this.jsonrpc = str2;
            this.result = fetchResult;
        }

        @Serializable
        public static final class FetchResult {
            private final List<Data> data;
            private final List<DisconnectedTopic> disconnectedTopics;
            private final boolean hasMore;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(Data$$serializer.INSTANCE), new ArrayListSerializer(DisconnectedTopic$$serializer.INSTANCE)};

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse$FetchSuccess$FetchResult */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FetchResult copy$default(FetchResult fetchResult, boolean z, List list, List list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = fetchResult.hasMore;
                }
                if ((i & 2) != 0) {
                    list = fetchResult.data;
                }
                if ((i & 4) != 0) {
                    list2 = fetchResult.disconnectedTopics;
                }
                return fetchResult.copy(z, list, list2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component1() {
                return this.hasMore;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Data> component2() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<DisconnectedTopic> component3() {
                return this.disconnectedTopics;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FetchResult copy(boolean z, @NotNull List<Data> list, List<DisconnectedTopic> list2) {
                Intrinsics.checkNotNullParameter(list, "");
                return new FetchResult(z, list, list2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FetchResult)) {
                    return false;
                }
                FetchResult fetchResult = (FetchResult) obj;
                return this.hasMore == fetchResult.hasMore && Intrinsics.EZpvd(this.data, fetchResult.data) && Intrinsics.EZpvd(this.disconnectedTopics, fetchResult.disconnectedTopics);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Data> getData() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<DisconnectedTopic> getDisconnectedTopics() {
                return this.disconnectedTopics;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean getHasMore() {
                return this.hasMore;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.hasMore);
                int iHashCode2 = this.data.hashCode();
                List<DisconnectedTopic> list = this.disconnectedTopics;
                return (((iHashCode * 31) + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FetchResult(hasMore=" + this.hasMore + ", data=" + this.data + ", disconnectedTopics=" + this.disconnectedTopics + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.FetchSuccess.FetchResult.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<FetchResult> serializer() {
                    return RpcResponse$FetchSuccess$FetchResult$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ FetchResult(int i, boolean z, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, RpcResponse$FetchSuccess$FetchResult$$serializer.INSTANCE.getDescriptor());
                }
                this.hasMore = z;
                this.data = list;
                if ((i & 4) == 0) {
                    this.disconnectedTopics = null;
                } else {
                    this.disconnectedTopics = list2;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(FetchResult fetchResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, fetchResult.hasMore);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], fetchResult.data);
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && fetchResult.disconnectedTopics == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], fetchResult.disconnectedTopics);
            }

            public FetchResult(boolean z, @NotNull List<Data> list, List<DisconnectedTopic> list2) {
                Intrinsics.checkNotNullParameter(list, "");
                this.hasMore = z;
                this.data = list;
                this.disconnectedTopics = list2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(boolean, java.util.List<com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data>, java.util.List<com.okinc.business.defi.wallet.common.okxconnect.network.rpc.DisconnectedTopic>):void (m)] (LINE:54) call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.FetchSuccess.FetchResult.<init>(boolean, java.util.List, java.util.List):void type: THIS */
            public /* synthetic */ FetchResult(boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, list, (i & 4) != 0 ? null : list2);
            }
        }
    }

    @Serializable
    public static final class Push implements RpcResponse {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String id;
        private final String jsonrpc;
        private final String method;
        private final Param params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Push copy$default(Push push, String str, String str2, String str3, Param param, int i, Object obj) {
            if ((i & 1) != 0) {
                str = push.id;
            }
            if ((i & 2) != 0) {
                str2 = push.jsonrpc;
            }
            if ((i & 4) != 0) {
                str3 = push.method;
            }
            if ((i & 8) != 0) {
                param = push.params;
            }
            return push.copy(str, str2, str3, param);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
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
        public final Param component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Push copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Param param) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(param, "");
            return new Push(str, str2, str3, param);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Push)) {
                return false;
            }
            Push push = (Push) obj;
            return Intrinsics.EZpvd((Object) this.id, (Object) push.id) && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) push.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) push.method) && Intrinsics.EZpvd(this.params, push.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Param getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Push(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Push.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Push> serializer() {
                return RpcResponse$Push$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Push(int i, String str, String str2, String str3, Param param, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, RpcResponse$Push$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.jsonrpc = str2;
            this.method = str3;
            this.params = param;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Push push, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, push.getId());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, push.getJsonrpc());
            compositeEncoder.encodeStringElement(serialDescriptor, 2, push.method);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, RpcResponse$Push$Param$$serializer.INSTANCE, push.params);
        }

        public Push(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Param param) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(param, "");
            this.id = str;
            this.jsonrpc = str2;
            this.method = str3;
            this.params = param;
        }

        @Serializable
        public static final class Param {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final Data data;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Param copy$default(Param param, Data data, int i, Object obj) {
                if ((i & 1) != 0) {
                    data = param.data;
                }
                return param.copy(data);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Data component1() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Param copy(@NotNull Data data) {
                Intrinsics.checkNotNullParameter(data, "");
                return new Param(data);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Param) && Intrinsics.EZpvd(this.data, ((Param) obj).data);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Data getData() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.data.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Param(data=" + this.data + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Push.Param.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Param> serializer() {
                    return RpcResponse$Push$Param$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Param(int i, Data data, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, RpcResponse$Push$Param$$serializer.INSTANCE.getDescriptor());
                }
                this.data = data;
            }

            public Param(@NotNull Data data) {
                Intrinsics.checkNotNullParameter(data, "");
                this.data = data;
            }
        }
    }

    @Serializable
    public static final class Disconnect implements RpcResponse {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String id;
        private final String jsonrpc;
        private final String method;
        private final Param params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Disconnect copy$default(Disconnect disconnect, String str, String str2, String str3, Param param, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disconnect.id;
            }
            if ((i & 2) != 0) {
                str2 = disconnect.jsonrpc;
            }
            if ((i & 4) != 0) {
                str3 = disconnect.method;
            }
            if ((i & 8) != 0) {
                param = disconnect.params;
            }
            return disconnect.copy(str, str2, str3, param);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
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
        public final Param component4() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Disconnect copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Param param) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(param, "");
            return new Disconnect(str, str2, str3, param);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Disconnect)) {
                return false;
            }
            Disconnect disconnect = (Disconnect) obj;
            return Intrinsics.EZpvd((Object) this.id, (Object) disconnect.id) && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) disconnect.jsonrpc) && Intrinsics.EZpvd((Object) this.method, (Object) disconnect.method) && Intrinsics.EZpvd(this.params, disconnect.params);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse
        public String getJsonrpc() {
            return this.jsonrpc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Param getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.jsonrpc.hashCode()) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Disconnect(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", method=" + this.method + ", params=" + this.params + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Disconnect.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Disconnect> serializer() {
                return RpcResponse$Disconnect$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Disconnect(int i, String str, String str2, String str3, Param param, SerializationConstructorMarker serializationConstructorMarker) {
            if (11 != (i & 11)) {
                PluginExceptionsKt.throwMissingFieldException(i, 11, RpcResponse$Disconnect$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.jsonrpc = str2;
            if ((i & 4) == 0) {
                this.method = "disconnect";
            } else {
                this.method = str3;
            }
            this.params = param;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Disconnect disconnect, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, disconnect.getId());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, disconnect.getJsonrpc());
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) disconnect.method, (Object) "disconnect")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, disconnect.method);
            }
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, RpcResponse$Disconnect$Param$$serializer.INSTANCE, disconnect.params);
        }

        public Disconnect(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Param param) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(param, "");
            this.id = str;
            this.jsonrpc = str2;
            this.method = str3;
            this.params = param;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("disconnect") : (r3v0 java.lang.String))
  (r4v0 com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse$Disconnect$Param)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse$Disconnect$Param):void (m)] (LINE:81) call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Disconnect.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse$Disconnect$Param):void type: THIS */
        public /* synthetic */ Disconnect(String str, String str2, String str3, Param param, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "disconnect" : str3, param);
        }

        @Serializable
        public static final class Param {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final DisconnectedTopic data;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Param copy$default(Param param, DisconnectedTopic disconnectedTopic, int i, Object obj) {
                if ((i & 1) != 0) {
                    disconnectedTopic = param.data;
                }
                return param.copy(disconnectedTopic);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DisconnectedTopic component1() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Param copy(@NotNull DisconnectedTopic disconnectedTopic) {
                Intrinsics.checkNotNullParameter(disconnectedTopic, "");
                return new Param(disconnectedTopic);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Param) && Intrinsics.EZpvd(this.data, ((Param) obj).data);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DisconnectedTopic getData() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.data.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Param(data=" + this.data + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse.Disconnect.Param.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Param> serializer() {
                    return RpcResponse$Disconnect$Param$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Param(int i, DisconnectedTopic disconnectedTopic, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, RpcResponse$Disconnect$Param$$serializer.INSTANCE.getDescriptor());
                }
                this.data = disconnectedTopic;
            }

            public Param(@NotNull DisconnectedTopic disconnectedTopic) {
                Intrinsics.checkNotNullParameter(disconnectedTopic, "");
                this.data = disconnectedTopic;
            }
        }
    }
}
