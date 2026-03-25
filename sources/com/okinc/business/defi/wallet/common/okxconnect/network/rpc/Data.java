package com.okinc.business.defi.wallet.common.okxconnect.network.rpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Data {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean isInternalData;
    private final String message;
    private final String messageId;
    private final long publishedAt;
    private final String topic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, Boolean bool, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = data.messageId;
        }
        if ((i & 2) != 0) {
            str2 = data.topic;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = data.message;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            bool = data.isInternalData;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            j = data.publishedAt;
        }
        return data.copy(str, str4, str5, bool2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isInternalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Data copy(@NotNull String str, @NotNull String str2, @NotNull String str3, Boolean bool, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new Data(str, str2, str3, bool, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return Intrinsics.EZpvd((Object) this.messageId, (Object) data.messageId) && Intrinsics.EZpvd((Object) this.topic, (Object) data.topic) && Intrinsics.EZpvd((Object) this.message, (Object) data.message) && Intrinsics.EZpvd(this.isInternalData, data.isInternalData) && this.publishedAt == data.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getPublishedAt() {
        return this.publishedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.messageId.hashCode();
        int iHashCode2 = this.topic.hashCode();
        int iHashCode3 = this.message.hashCode();
        Boolean bool = this.isInternalData;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + Long.hashCode(this.publishedAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isInternalData() {
        return this.isInternalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Data(messageId=" + this.messageId + ", topic=" + this.topic + ", message=" + this.message + ", isInternalData=" + this.isInternalData + ", publishedAt=" + this.publishedAt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Data> serializer() {
            return Data$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Data(int i, String str, String str2, String str3, Boolean bool, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i, 23, Data$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.topic = str2;
        this.message = str3;
        if ((i & 8) == 0) {
            this.isInternalData = null;
        } else {
            this.isInternalData = bool;
        }
        this.publishedAt = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Data data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, data.messageId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, data.topic);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, data.message);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || data.isInternalData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, data.isInternalData);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 4, data.publishedAt);
    }

    public Data(@NotNull String str, @NotNull String str2, @NotNull String str3, Boolean bool, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.messageId = str;
        this.topic = str2;
        this.message = str3;
        this.isInternalData = bool;
        this.publishedAt = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (r12v0 long)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, long):void (m)] (LINE:104) call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, long):void type: THIS */
    public /* synthetic */ Data(String str, String str2, String str3, Boolean bool, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : bool, j);
    }
}
