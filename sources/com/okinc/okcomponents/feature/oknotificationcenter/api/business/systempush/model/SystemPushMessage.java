package com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public class SystemPushMessage implements Parcelable {
    private String bizDataJson;
    private String bizType;
    private String content;
    private DeeplinkType deeplinkType;
    private String imageUrl;
    private long messageId;
    private String messageName;
    private String title;
    private long updateTime;
    private String url;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.DeeplinkType", DeeplinkType.values()), null, null, null, null, null};

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeeplinkType getDeeplinkType() {
        return this.deeplinkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMessageId() {
        return this.messageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageName() {
        return this.messageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawData() {
        return this.bizDataJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeeplinkType(@NotNull DeeplinkType deeplinkType) {
        Intrinsics.checkNotNullParameter(deeplinkType, "");
        this.deeplinkType = deeplinkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessageId(long j) {
        this.messageId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.messageName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    public /* synthetic */ SystemPushMessage(int i, long j, String str, String str2, String str3, DeeplinkType deeplinkType, String str4, long j2, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.messageId = 0L;
        } else {
            this.messageId = j;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.content = "";
        } else {
            this.content = str2;
        }
        if ((i & 8) == 0) {
            this.url = "";
        } else {
            this.url = str3;
        }
        this.deeplinkType = (i & 16) == 0 ? DeeplinkType.EXCHANGE : deeplinkType;
        if ((i & 32) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str4;
        }
        if ((i & 64) == 0) {
            this.updateTime = 0L;
        } else {
            this.updateTime = j2;
        }
        if ((i & 128) == 0) {
            this.messageName = "";
        } else {
            this.messageName = str5;
        }
        if ((i & 256) == 0) {
            this.bizType = "";
        } else {
            this.bizType = str6;
        }
        if ((i & 512) == 0) {
            this.bizDataJson = "";
        } else {
            this.bizDataJson = str7;
        }
    }

    public static final /* synthetic */ void write$Self(SystemPushMessage systemPushMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || systemPushMessage.messageId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, systemPushMessage.messageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) systemPushMessage.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, systemPushMessage.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) systemPushMessage.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, systemPushMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) systemPushMessage.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, systemPushMessage.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || systemPushMessage.deeplinkType != DeeplinkType.EXCHANGE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], systemPushMessage.deeplinkType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) systemPushMessage.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, systemPushMessage.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || systemPushMessage.updateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, systemPushMessage.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) systemPushMessage.messageName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, systemPushMessage.messageName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) systemPushMessage.bizType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, systemPushMessage.bizType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) systemPushMessage.bizDataJson, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, systemPushMessage.bizDataJson);
    }

    public SystemPushMessage(PushMsgItem pushMsgItem) {
        this.title = "";
        this.content = "";
        this.url = "";
        this.deeplinkType = DeeplinkType.EXCHANGE;
        this.imageUrl = "";
        this.messageName = "";
        this.bizType = "";
        this.bizDataJson = "";
        if (pushMsgItem == null) {
            return;
        }
        Long id = pushMsgItem.getId();
        this.messageId = id != null ? id.longValue() : 0L;
        String title = pushMsgItem.getTitle();
        this.title = title == null ? "" : title;
        String content = pushMsgItem.getContent();
        this.content = content == null ? "" : content;
        String url = pushMsgItem.getUrl();
        this.url = url == null ? "" : url;
        String imageUrl = pushMsgItem.getImageUrl();
        this.imageUrl = imageUrl == null ? "" : imageUrl;
        Long createTime = pushMsgItem.getCreateTime();
        this.updateTime = createTime != null ? createTime.longValue() : 0L;
        String bizType = pushMsgItem.getBizType();
        this.bizType = bizType == null ? "" : bizType;
        String data = pushMsgItem.getData();
        this.bizDataJson = data == null ? "" : data;
        DeeplinkType deeplinkTypeValueOf = DeeplinkType.CREATOR.valueOf(C33129mqd.AhwBna(pushMsgItem.getLinkType()));
        this.deeplinkType = deeplinkTypeValueOf == null ? DeeplinkType.ALL : deeplinkTypeValueOf;
        String messageName = pushMsgItem.getMessageName();
        this.messageName = messageName != null ? messageName : "";
    }

    public SystemPushMessage(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.title = "";
        this.content = "";
        this.url = "";
        this.deeplinkType = DeeplinkType.EXCHANGE;
        this.imageUrl = "";
        this.messageName = "";
        this.bizType = "";
        this.bizDataJson = "";
        this.messageId = parcel.readLong();
        String string = parcel.readString();
        this.title = string == null ? "" : string;
        String string2 = parcel.readString();
        this.content = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.url = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        this.imageUrl = string4 == null ? "" : string4;
        this.updateTime = parcel.readLong();
        String string5 = parcel.readString();
        this.bizType = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        this.bizDataJson = string6 == null ? "" : string6;
        DeeplinkType deeplinkType = (DeeplinkType) parcel.readParcelable(DeeplinkType.class.getClassLoader());
        this.deeplinkType = deeplinkType == null ? DeeplinkType.ALL : deeplinkType;
        String string7 = parcel.readString();
        this.messageName = string7 != null ? string7 : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.messageId);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.url);
        parcel.writeString(this.imageUrl);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.bizType);
        parcel.writeString(this.bizDataJson);
        parcel.writeParcelable(this.deeplinkType, i);
        parcel.writeString(this.messageName);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<SystemPushMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.SystemPushMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<SystemPushMessage> serializer() {
            return SystemPushMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SystemPushMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SystemPushMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SystemPushMessage[] newArray(int i) {
            return new SystemPushMessage[i];
        }
    }
}
