package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKReadReceiptMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKReadReceiptMessage extends OKMessageContent {
    private long lastMessageSendTime;
    private String messageUId;
    public ReadReceiptType type;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, ReadReceiptType.Companion.serializer()};

    @SerialName("lastMessageSendTime")
    public static /* synthetic */ void getLastMessageSendTime$annotations() {
    }

    @SerialName("messageUId")
    public static /* synthetic */ void getMessageUId$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLastMessageSendTime() {
        return this.lastMessageSendTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageUId() {
        return this.messageUId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastMessageSendTime(long j) {
        this.lastMessageSendTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessageUId(String str) {
        this.messageUId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull ReadReceiptType readReceiptType) {
        Intrinsics.checkNotNullParameter(readReceiptType, "");
        this.type = readReceiptType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OKReadReceiptMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, long j2, String str3, ReadReceiptType readReceiptType, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if (1024 != (i & 1024)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1024, OKReadReceiptMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.lastMessageSendTime = (i & 256) == 0 ? 0L : j2;
        this.messageUId = (i & 512) == 0 ? null : str3;
        this.type = readReceiptType;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKReadReceiptMessage oKReadReceiptMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKReadReceiptMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKReadReceiptMessage.lastMessageSendTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, oKReadReceiptMessage.lastMessageSendTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKReadReceiptMessage.messageUId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oKReadReceiptMessage.messageUId);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKReadReceiptMessage.getType());
    }

    public final ReadReceiptType getType() {
        ReadReceiptType readReceiptType = this.type;
        if (readReceiptType != null) {
            return readReceiptType;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class ReadReceiptType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ReadReceiptType[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Parcelable.Creator<ReadReceiptType> CREATOR;
        public static final Companion Companion;

        @SerialName("1")
        public static final ReadReceiptType SEND_TIME = new ReadReceiptType("SEND_TIME", 0, 1);

        @SerialName("2")
        public static final ReadReceiptType UID = new ReadReceiptType("UID", 1, 2);
        private final int value;

        public static final class Creator implements Parcelable.Creator<ReadReceiptType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReadReceiptType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ReadReceiptType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ReadReceiptType[] newArray(int i) {
                return new ReadReceiptType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ReadReceiptType[] $values() {
            return new ReadReceiptType[]{SEND_TIME, UID};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ReadReceiptType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private ReadReceiptType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            ReadReceiptType[] readReceiptTypeArr$values = $values();
            $VALUES = readReceiptTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(readReceiptTypeArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sNZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKReadReceiptMessage.ReadReceiptType._init_$_anonymous_();
                }
            });
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKReadReceiptMessage.ReadReceiptType.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ KSerializer AEQbTJ() {
                return (KSerializer) ReadReceiptType.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<ReadReceiptType> serializer() {
                return AEQbTJ();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.im.OKReadReceiptMessage.ReadReceiptType", values(), new String[]{"1", "2"}, new Annotation[][]{null, null}, null);
        }

        public static ReadReceiptType valueOf(String str) {
            return (ReadReceiptType) Enum.valueOf(ReadReceiptType.class, str);
        }

        public static ReadReceiptType[] values() {
            return (ReadReceiptType[]) $VALUES.clone();
        }
    }

    public OKReadReceiptMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKReadReceiptMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.lastMessageSendTime = parcel.readLong();
        this.messageUId = parcel.readString();
        Parcelable parcelable = parcel.readParcelable(ReadReceiptType.class.getClassLoader());
        Intrinsics.copydefault(parcelable);
        setType((ReadReceiptType) parcelable);
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.lastMessageSendTime);
        parcel.writeString(this.messageUId);
        parcel.writeParcelable(getType(), i);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKReadReceiptMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKReadReceiptMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKReadReceiptMessage> serializer() {
            return OKReadReceiptMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKReadReceiptMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKReadReceiptMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKReadReceiptMessage[] newArray(int i) {
            return new OKReadReceiptMessage[i];
        }
    }
}
