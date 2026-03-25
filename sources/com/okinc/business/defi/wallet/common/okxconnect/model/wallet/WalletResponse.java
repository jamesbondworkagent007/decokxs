package com.okinc.business.defi.wallet.common.okxconnect.model.wallet;

import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException$$serializer;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import o.C56524yIo;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public interface WalletResponse {
    public static final Companion Companion = Companion.OLrzqt;

    String getMethod();

    String getRequestId();

    public static final class Companion {
        public static final /* synthetic */ Companion OLrzqt = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<WalletResponse> serializer() {
            return new SealedClassSerializer("com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse", C56524yIo.AEQbTJ(WalletResponse.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(Error.class), C56524yIo.AEQbTJ(Success.class)}, new KSerializer[]{WalletResponse$Error$$serializer.INSTANCE, WalletResponse$Success$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Serializable
    public static final class Success implements WalletResponse {
        private final String method;
        private final String requestId;
        private final JsonElement result;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, String str, String str2, JsonElement jsonElement, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.requestId;
            }
            if ((i & 2) != 0) {
                str2 = success.method;
            }
            if ((i & 4) != 0) {
                jsonElement = success.result;
            }
            return success.copy(str, str2, jsonElement);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonElement component3() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success copy(@NotNull String str, @NotNull String str2, @NotNull JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            return new Success(str, str2, jsonElement);
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
            return Intrinsics.EZpvd((Object) this.requestId, (Object) success.requestId) && Intrinsics.EZpvd((Object) this.method, (Object) success.method) && Intrinsics.EZpvd(this.result, success.result);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse
        public String getRequestId() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonElement getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.requestId.hashCode() * 31) + this.method.hashCode()) * 31) + this.result.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(requestId=" + this.requestId + ", method=" + this.method + ", result=" + this.result + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse.Success.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Success> serializer() {
                return WalletResponse$Success$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, String str, String str2, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, WalletResponse$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.requestId = str;
            this.method = str2;
            this.result = jsonElement;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Success success, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, success.getRequestId());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, success.getMethod());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, JsonElementSerializer.INSTANCE, success.result);
        }

        public Success(@NotNull String str, @NotNull String str2, @NotNull JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(jsonElement, "");
            this.requestId = str;
            this.method = str2;
            this.result = jsonElement;
        }
    }

    @Serializable
    public static final class Error implements WalletResponse {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final OKXConnectException error;
        private final String method;
        private final String requestId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, String str, String str2, OKXConnectException oKXConnectException, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.requestId;
            }
            if ((i & 2) != 0) {
                str2 = error.method;
            }
            if ((i & 4) != 0) {
                oKXConnectException = error.error;
            }
            return error.copy(str, str2, oKXConnectException);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.method;
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
            return Intrinsics.EZpvd((Object) this.requestId, (Object) error.requestId) && Intrinsics.EZpvd((Object) this.method, (Object) error.method) && Intrinsics.EZpvd(this.error, error.error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKXConnectException getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse
        public String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse
        public String getRequestId() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.requestId.hashCode() * 31) + this.method.hashCode()) * 31) + this.error.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(requestId=" + this.requestId + ", method=" + this.method + ", error=" + this.error + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletResponse.Error.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Error> serializer() {
                return WalletResponse$Error$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Error(int i, String str, String str2, OKXConnectException oKXConnectException, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, WalletResponse$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.requestId = str;
            this.method = str2;
            this.error = oKXConnectException;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Error error, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, error.getRequestId());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, error.getMethod());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, OKXConnectException$$serializer.INSTANCE, error.error);
        }

        public Error(@NotNull String str, @NotNull String str2, @NotNull OKXConnectException oKXConnectException) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(oKXConnectException, "");
            this.requestId = str;
            this.method = str2;
            this.error = oKXConnectException;
        }
    }
}
