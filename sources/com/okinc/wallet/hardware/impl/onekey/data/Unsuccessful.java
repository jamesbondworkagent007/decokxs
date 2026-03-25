package com.okinc.wallet.hardware.impl.onekey.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class Unsuccessful implements Response {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Payload payload;
    private final boolean success;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Unsuccessful copy$default(Unsuccessful unsuccessful, boolean z, Payload payload, int i, Object obj) {
        if ((i & 1) != 0) {
            z = unsuccessful.success;
        }
        if ((i & 2) != 0) {
            payload = unsuccessful.payload;
        }
        return unsuccessful.copy(z, payload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Payload component2() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Unsuccessful copy(boolean z, @NotNull Payload payload) {
        Intrinsics.checkNotNullParameter(payload, "");
        return new Unsuccessful(z, payload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Unsuccessful)) {
            return false;
        }
        Unsuccessful unsuccessful = (Unsuccessful) obj;
        return this.success == unsuccessful.success && Intrinsics.EZpvd(this.payload, unsuccessful.payload);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Payload getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.hardware.impl.onekey.data.Response
    public boolean getSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.payload.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Unsuccessful(success=" + this.success + ", payload=" + this.payload + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.Unsuccessful.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Unsuccessful> serializer() {
            return Unsuccessful$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Unsuccessful(int i, boolean z, Payload payload, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Unsuccessful$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z;
        this.payload = payload;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_impl(Unsuccessful unsuccessful, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, unsuccessful.getSuccess());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, Unsuccessful$Payload$$serializer.INSTANCE, unsuccessful.payload);
    }

    @Serializable
    public static final class Payload {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String code;
        public final String error;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Payload copy$default(Payload payload, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payload.error;
            }
            if ((i & 2) != 0) {
                str2 = payload.code;
            }
            return payload.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Payload KWHzl(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Payload(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.EZpvd((Object) this.error, (Object) payload.error) && Intrinsics.EZpvd((Object) this.code, (Object) payload.code);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.error.hashCode();
            String str = this.code;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Payload(error=" + this.error + ", code=" + this.code + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.Unsuccessful.Payload.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Payload> serializer() {
                return Unsuccessful$Payload$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Payload(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, Unsuccessful$Payload$$serializer.INSTANCE.getDescriptor());
            }
            this.error = str;
            if ((i & 2) == 0) {
                this.code = null;
            } else {
                this.code = str2;
            }
        }

        public static final /* synthetic */ void OLrzqt(Payload payload, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, payload.error);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && payload.code == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, payload.code);
        }

        public Payload(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
            this.code = str2;
        }
    }

    public Unsuccessful(boolean z, @NotNull Payload payload) {
        Intrinsics.checkNotNullParameter(payload, "");
        this.success = z;
        this.payload = payload;
    }
}
