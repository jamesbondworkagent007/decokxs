package com.okinc.okimcore.model.biz;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public class OKBizCustomMessage extends OKMessageContent {
    private String bizType;
    private String content;
    private String data;
    private Integer isShowNotify;
    private Integer jumpStatus;
    private String pushTitle;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null};
    public static final Parcelable.Creator<OKBizCustomMessage> CREATOR = new Parcelable.Creator<OKBizCustomMessage>() { // from class: com.okinc.okimcore.model.biz.OKBizCustomMessage$Companion$CREATOR$1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKBizCustomMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKBizCustomMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKBizCustomMessage[] newArray(int i) {
            return new OKBizCustomMessage[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getJumpStatus() {
        return this.jumpStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushTitle() {
        return this.pushTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isShowNotify() {
        return this.isShowNotify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(String str) {
        this.bizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(String str) {
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJumpStatus(Integer num) {
        this.jumpStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushTitle(String str) {
        this.pushTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowNotify(Integer num) {
        this.isShowNotify = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    public /* synthetic */ OKBizCustomMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.pushTitle = null;
        } else {
            this.pushTitle = str3;
        }
        if ((i & 512) == 0) {
            this.content = null;
        } else {
            this.content = str4;
        }
        this.url = (i & 1024) == 0 ? "" : str5;
        this.jumpStatus = (i & 2048) == 0 ? 1 : num;
        if ((i & 4096) == 0) {
            this.data = null;
        } else {
            this.data = str6;
        }
        if ((i & 8192) == 0) {
            this.bizType = null;
        } else {
            this.bizType = str7;
        }
        this.isShowNotify = (i & 16384) == 0 ? 0 : num2;
    }

    public static final /* synthetic */ void write$Self(OKBizCustomMessage oKBizCustomMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        OKMessageContent.write$Self(oKBizCustomMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKBizCustomMessage.pushTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKBizCustomMessage.pushTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKBizCustomMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oKBizCustomMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) oKBizCustomMessage.url, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oKBizCustomMessage.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || (num2 = oKBizCustomMessage.jumpStatus) == null || num2.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, oKBizCustomMessage.jumpStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKBizCustomMessage.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, oKBizCustomMessage.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKBizCustomMessage.bizType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, oKBizCustomMessage.bizType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || (num = oKBizCustomMessage.isShowNotify) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, oKBizCustomMessage.isShowNotify);
        }
    }

    public OKBizCustomMessage() {
        this.url = "";
        this.jumpStatus = 1;
        this.isShowNotify = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKBizCustomMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.url = "";
        this.jumpStatus = 1;
        this.isShowNotify = 0;
        this.pushTitle = parcel.readString();
        this.content = parcel.readString();
        this.url = parcel.readString();
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        this.jumpStatus = value instanceof Integer ? (Integer) value : null;
        this.data = parcel.readString();
        this.bizType = parcel.readString();
        Object value2 = parcel.readValue(cls.getClassLoader());
        this.isShowNotify = value2 instanceof Integer ? (Integer) value2 : null;
    }

    /* JADX INFO: renamed from: isShowNotify, reason: collision with other method in class */
    public final boolean m6868isShowNotify() {
        Integer num = this.isShowNotify;
        return num != null && num.intValue() == 1;
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.pushTitle);
        parcel.writeString(this.content);
        parcel.writeString(this.url);
        parcel.writeValue(this.jumpStatus);
        parcel.writeString(this.data);
        parcel.writeString(this.bizType);
        parcel.writeValue(this.isShowNotify);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.biz.OKBizCustomMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OKBizCustomMessage> serializer() {
            return OKBizCustomMessage$$serializer.INSTANCE;
        }
    }
}
