package com.okinc.business.defi.wallet.common.tonconnect.model.reply;

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
import o.C56524yIo;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public interface WalletResponseEntity {
    public static final Companion Companion = Companion.EZpvd;

    String getId();

    public static final class Companion {
        public static final /* synthetic */ Companion EZpvd = new Companion();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        public final KSerializer<WalletResponseEntity> serializer() {
            return new SealedClassSerializer("com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletResponseEntity", C56524yIo.AEQbTJ(WalletResponseEntity.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(Error.class), C56524yIo.AEQbTJ(Success.class)}, new KSerializer[]{WalletResponseEntity$Error$$serializer.INSTANCE, WalletResponseEntity$Success$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Serializable
    public static final class Success implements WalletResponseEntity {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String id;
        private final String result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.id;
            }
            if ((i & 2) != 0) {
                str2 = success.result;
            }
            return success.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Success(str, str2);
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
            return Intrinsics.EZpvd((Object) this.id, (Object) success.id) && Intrinsics.EZpvd((Object) this.result, (Object) success.result);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletResponseEntity
        public String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.id.hashCode() * 31) + this.result.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(id=" + this.id + ", result=" + this.result + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletResponseEntity.Success.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Success> serializer() {
                return WalletResponseEntity$Success$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, WalletResponseEntity$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.result = str2;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Success success, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, success.getId());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, success.result);
        }

        public Success(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.result = str2;
        }
    }

    @Serializable
    public static final class Error implements WalletResponseEntity {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final ErrorInfo error;
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, String str, ErrorInfo errorInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.id;
            }
            if ((i & 2) != 0) {
                errorInfo = error.error;
            }
            return error.copy(str, errorInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorInfo component2() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@NotNull String str, @NotNull ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(errorInfo, "");
            return new Error(str, errorInfo);
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
            return Intrinsics.EZpvd((Object) this.id, (Object) error.id) && Intrinsics.EZpvd(this.error, error.error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ErrorInfo getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletResponseEntity
        public String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.id.hashCode() * 31) + this.error.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(id=" + this.id + ", error=" + this.error + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.reply.WalletResponseEntity.Error.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Error> serializer() {
                return WalletResponseEntity$Error$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Error(int i, String str, ErrorInfo errorInfo, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, WalletResponseEntity$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.error = errorInfo;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Error error, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, error.getId());
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, ErrorInfo$$serializer.INSTANCE, error.error);
        }

        public Error(@NotNull String str, @NotNull ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(errorInfo, "");
            this.id = str;
            this.error = errorInfo;
        }
    }
}
