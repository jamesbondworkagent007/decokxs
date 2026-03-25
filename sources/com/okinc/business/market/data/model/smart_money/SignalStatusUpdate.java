package com.okinc.business.market.data.model.smart_money;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalStatusUpdate {
    public static final int $stable = 0;
    public final Content content;
    public final Type type;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.model.smart_money.SignalStatusUpdate.Type", Type.values(), new String[]{"updateSellRatioWithLabel", "updateExpireStatus"}, new Annotation[][]{null, null}, null), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalStatusUpdate copy$default(SignalStatusUpdate signalStatusUpdate, Type type, Content content, int i, Object obj) {
        if ((i & 1) != 0) {
            type = signalStatusUpdate.type;
        }
        if ((i & 2) != 0) {
            content = signalStatusUpdate.content;
        }
        return signalStatusUpdate.KWHzl(type, content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Content AEQbTJ() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Type EZpvd() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalStatusUpdate KWHzl(@NotNull Type type, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(content, "");
        return new SignalStatusUpdate(type, content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalStatusUpdate)) {
            return false;
        }
        SignalStatusUpdate signalStatusUpdate = (SignalStatusUpdate) obj;
        return this.type == signalStatusUpdate.type && Intrinsics.EZpvd(this.content, signalStatusUpdate.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.content.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalStatusUpdate(type=" + this.type + ", content=" + this.content + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalStatusUpdate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalStatusUpdate> serializer() {
            return SignalStatusUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalStatusUpdate(int i, Type type, Content content, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SignalStatusUpdate$$serializer.INSTANCE.getDescriptor());
        }
        this.type = type;
        this.content = content;
    }

    public static final /* synthetic */ void EZpvd(SignalStatusUpdate signalStatusUpdate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], signalStatusUpdate.type);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, SignalStatusUpdate$Content$$serializer.INSTANCE, signalStatusUpdate.content);
    }

    public SignalStatusUpdate(@NotNull Type type, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(content, "");
        this.type = type;
        this.content = content;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @SerialName("updateSellRatioWithLabel")
        public static final Type UPDATE_SELL_RATIO = new Type("UPDATE_SELL_RATIO", 0);

        @SerialName("updateExpireStatus")
        public static final Type UPDATE_EXPIRE_STATUS = new Type("UPDATE_EXPIRE_STATUS", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Type[] $values() {
            return new Type[]{UPDATE_SELL_RATIO, UPDATE_EXPIRE_STATUS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Serializable
    public static final class Content {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final Long batchId;
        public final long chainId;
        public final String sellRatio;
        public final String signalLabel;
        public final String tokenAddress;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Content copy$default(Content content, long j, String str, String str2, Long l, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = content.chainId;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = content.tokenAddress;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = content.sellRatio;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                l = content.batchId;
            }
            Long l2 = l;
            if ((i & 16) != 0) {
                str3 = content.signalLabel;
            }
            return content.EZpvd(j2, str4, str5, l2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Content EZpvd(long j, @NotNull String str, String str2, Long l, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Content(j, str, str2, l, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long EZpvd() {
            return this.batchId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.sellRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.signalLabel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.chainId == content.chainId && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) content.tokenAddress) && Intrinsics.EZpvd((Object) this.sellRatio, (Object) content.sellRatio) && Intrinsics.EZpvd(this.batchId, content.batchId) && Intrinsics.EZpvd((Object) this.signalLabel, (Object) content.signalLabel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.chainId);
            int iHashCode2 = this.tokenAddress.hashCode();
            String str = this.sellRatio;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            Long l = this.batchId;
            int iHashCode4 = l == null ? 0 : l.hashCode();
            String str2 = this.signalLabel;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Content(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", sellRatio=" + this.sellRatio + ", batchId=" + this.batchId + ", signalLabel=" + this.signalLabel + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalStatusUpdate.Content.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Content> serializer() {
                return SignalStatusUpdate$Content$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Content(int i, long j, String str, String str2, Long l, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, SignalStatusUpdate$Content$$serializer.INSTANCE.getDescriptor());
            }
            this.chainId = j;
            this.tokenAddress = str;
            if ((i & 4) == 0) {
                this.sellRatio = null;
            } else {
                this.sellRatio = str2;
            }
            if ((i & 8) == 0) {
                this.batchId = null;
            } else {
                this.batchId = l;
            }
            if ((i & 16) == 0) {
                this.signalLabel = null;
            } else {
                this.signalLabel = str3;
            }
        }

        public static final /* synthetic */ void AEQbTJ(Content content, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, content.chainId);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, content.tokenAddress);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || content.sellRatio != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, content.sellRatio);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || content.batchId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, content.batchId);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && content.signalLabel == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, content.signalLabel);
        }

        public Content(long j, @NotNull String str, String str2, Long l, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.chainId = j;
            this.tokenAddress = str;
            this.sellRatio = str2;
            this.batchId = l;
            this.signalLabel = str3;
        }
    }
}
