package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKRecallNotificationMessage extends OKMessageContent {
    private boolean isAdmin;
    private boolean isDelete;
    private String operatorId;
    private OKMessageContent originalMessageContent;
    private String originalObjectName;
    private long recallActionTime;
    private String recallContent;
    private long recallTime;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, OKMessageContent.Companion.serializer(), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperatorId() {
        return this.operatorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessageContent getOriginalMessageContent() {
        return this.originalMessageContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalObjectName() {
        return this.originalObjectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRecallActionTime() {
        return this.recallActionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecallContent() {
        return this.recallContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRecallTime() {
        return this.recallTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAdmin() {
        return this.isAdmin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDelete() {
        return this.isDelete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdmin(boolean z) {
        this.isAdmin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelete(boolean z) {
        this.isDelete = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOperatorId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.operatorId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalMessageContent(OKMessageContent oKMessageContent) {
        this.originalMessageContent = oKMessageContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalObjectName(String str) {
        this.originalObjectName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecallActionTime(long j) {
        this.recallActionTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecallContent(String str) {
        this.recallContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecallTime(long j) {
        this.recallTime = j;
    }

    public /* synthetic */ OKRecallNotificationMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, long j2, String str4, OKMessageContent oKMessageContent, boolean z3, boolean z4, String str5, long j3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        this.operatorId = (i & 256) == 0 ? "" : str3;
        if ((i & 512) == 0) {
            this.recallTime = 0L;
        } else {
            this.recallTime = j2;
        }
        if ((i & 1024) == 0) {
            this.originalObjectName = null;
        } else {
            this.originalObjectName = str4;
        }
        if ((i & 2048) == 0) {
            this.originalMessageContent = null;
        } else {
            this.originalMessageContent = oKMessageContent;
        }
        if ((i & 4096) == 0) {
            this.isAdmin = false;
        } else {
            this.isAdmin = z3;
        }
        if ((i & 8192) == 0) {
            this.isDelete = false;
        } else {
            this.isDelete = z4;
        }
        if ((i & 16384) == 0) {
            this.recallContent = null;
        } else {
            this.recallContent = str5;
        }
        if ((32768 & i) == 0) {
            this.recallActionTime = 0L;
        } else {
            this.recallActionTime = j3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKRecallNotificationMessage oKRecallNotificationMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKRecallNotificationMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) oKRecallNotificationMessage.operatorId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, oKRecallNotificationMessage.operatorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKRecallNotificationMessage.recallTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 9, oKRecallNotificationMessage.recallTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKRecallNotificationMessage.originalObjectName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oKRecallNotificationMessage.originalObjectName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKRecallNotificationMessage.originalMessageContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], oKRecallNotificationMessage.originalMessageContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKRecallNotificationMessage.isAdmin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, oKRecallNotificationMessage.isAdmin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKRecallNotificationMessage.isDelete) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, oKRecallNotificationMessage.isDelete);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKRecallNotificationMessage.recallContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, oKRecallNotificationMessage.recallContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && oKRecallNotificationMessage.recallActionTime == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 15, oKRecallNotificationMessage.recallActionTime);
    }

    public OKRecallNotificationMessage() {
        this.operatorId = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRecallNotificationMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.operatorId = "";
        String string = parcel.readString();
        Intrinsics.copydefault((Object) string);
        this.operatorId = string;
        this.recallTime = parcel.readLong();
        this.originalObjectName = parcel.readString();
        this.originalMessageContent = (OKMessageContent) parcel.readParcelable(OKMessageContent.class.getClassLoader());
        this.isAdmin = parcel.readInt() == 1;
        this.isDelete = parcel.readInt() == 1;
        this.recallContent = parcel.readString();
        this.recallActionTime = parcel.readLong();
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.operatorId);
        parcel.writeLong(this.recallTime);
        parcel.writeString(this.originalObjectName);
        parcel.writeParcelable(this.originalMessageContent, i);
        parcel.writeInt(this.isAdmin ? 1 : 0);
        parcel.writeInt(this.isDelete ? 1 : 0);
        parcel.writeString(this.recallContent);
        parcel.writeLong(this.recallActionTime);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKRecallNotificationMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.OKRecallNotificationMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKRecallNotificationMessage> serializer() {
            return OKRecallNotificationMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKRecallNotificationMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKRecallNotificationMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKRecallNotificationMessage[] newArray(int i) {
            return new OKRecallNotificationMessage[i];
        }
    }
}
