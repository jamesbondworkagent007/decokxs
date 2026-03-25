package com.okinc.okimcore.model.im;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKShareMessage extends OKMediaMessageContent {
    private static final KSerializer<Object>[] $childSerializers;
    private String bizName;
    private String content;
    private Integer ctaType;
    private String deeplink;
    private OKImageMessage image;
    private String messagePreview;
    private Map<String, String> shareExtra;
    private String shortLink;
    private String tag;
    private String tagLine;
    private String title;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizName() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCtaType() {
        return this.ctaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKImageMessage getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessagePreview() {
        return this.messagePreview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getShareExtra() {
        return this.shareExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLink() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagLine() {
        return this.tagLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizName(String str) {
        this.bizName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtaType(Integer num) {
        this.ctaType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImage(OKImageMessage oKImageMessage) {
        this.image = oKImageMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessagePreview(String str) {
        this.messagePreview = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareExtra(Map<String, String> map) {
        this.shareExtra = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortLink(String str) {
        this.shortLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagLine(String str) {
        this.tagLine = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    public /* synthetic */ OKShareMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Uri uri, Uri uri2, String str3, String str4, String str5, String str6, OKImageMessage oKImageMessage, String str7, String str8, String str9, Integer num, String str10, String str11, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        OKShareMessage oKShareMessage;
        int i2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, uri, uri2, str3, serializationConstructorMarker);
        if ((i & 2048) == 0) {
            oKShareMessage = this;
            i2 = i;
            oKShareMessage.title = null;
        } else {
            oKShareMessage = this;
            i2 = i;
            oKShareMessage.title = str4;
        }
        if ((i2 & 4096) == 0) {
            oKShareMessage.content = null;
        } else {
            oKShareMessage.content = str5;
        }
        if ((i2 & 8192) == 0) {
            oKShareMessage.messagePreview = null;
        } else {
            oKShareMessage.messagePreview = str6;
        }
        if ((i2 & 16384) == 0) {
            oKShareMessage.image = null;
        } else {
            oKShareMessage.image = oKImageMessage;
        }
        if ((32768 & i2) == 0) {
            oKShareMessage.deeplink = null;
        } else {
            oKShareMessage.deeplink = str7;
        }
        if ((65536 & i2) == 0) {
            oKShareMessage.shortLink = null;
        } else {
            oKShareMessage.shortLink = str8;
        }
        if ((131072 & i2) == 0) {
            oKShareMessage.tagLine = null;
        } else {
            oKShareMessage.tagLine = str9;
        }
        if ((262144 & i2) == 0) {
            oKShareMessage.ctaType = null;
        } else {
            oKShareMessage.ctaType = num;
        }
        if ((524288 & i2) == 0) {
            oKShareMessage.bizName = null;
        } else {
            oKShareMessage.bizName = str10;
        }
        if ((1048576 & i2) == 0) {
            oKShareMessage.tag = null;
        } else {
            oKShareMessage.tag = str11;
        }
        oKShareMessage.shareExtra = (i2 & 2097152) != 0 ? map : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKShareMessage oKShareMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMediaMessageContent.write$Self((OKMediaMessageContent) oKShareMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKShareMessage.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, oKShareMessage.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKShareMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, oKShareMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKShareMessage.messagePreview != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, oKShareMessage.messagePreview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKShareMessage.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, OKImageMessage$$serializer.INSTANCE, oKShareMessage.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || oKShareMessage.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, oKShareMessage.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKShareMessage.shortLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, oKShareMessage.shortLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || oKShareMessage.tagLine != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, oKShareMessage.tagLine);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || oKShareMessage.ctaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, oKShareMessage.ctaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || oKShareMessage.bizName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, oKShareMessage.bizName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || oKShareMessage.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, oKShareMessage.tag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && oKShareMessage.shareExtra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr[21], oKShareMessage.shareExtra);
    }

    public OKShareMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKShareMessage(@NotNull Parcel parcel) {
        String string;
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.messagePreview = parcel.readString();
        this.image = (OKImageMessage) parcel.readParcelable(ImageMessageData.class.getClassLoader());
        this.deeplink = parcel.readString();
        this.shortLink = parcel.readString();
        this.tagLine = parcel.readString();
        this.ctaType = Integer.valueOf(parcel.readInt());
        this.bizName = parcel.readString();
        int i = parcel.readInt();
        if (i > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i2 = 0; i2 < i; i2++) {
                String string2 = parcel.readString();
                if (string2 != null && (string = parcel.readString()) != null) {
                    linkedHashMap.put(string2, string);
                }
            }
            this.shareExtra = linkedHashMap;
        }
    }

    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.messagePreview);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.deeplink);
        parcel.writeString(this.shortLink);
        parcel.writeString(this.tagLine);
        Integer num = this.ctaType;
        parcel.writeInt(num != null ? num.intValue() : 0);
        parcel.writeString(this.bizName);
        Map<String, String> map = this.shareExtra;
        if (map != null) {
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
            return;
        }
        parcel.writeInt(0);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKMessageContent> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKShareMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKShareMessage> serializer() {
            return OKShareMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKMessageContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKShareMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKMessageContent[] newArray(int i) {
            return new OKMessageContent[i];
        }

        public final OKShareMessage obtain(String str, String str2, String str3, OKImageMessage oKImageMessage, String str4, String str5, String str6, Integer num, String str7, Map<String, String> map) {
            OKShareMessage oKShareMessage = new OKShareMessage();
            oKShareMessage.setTitle(str);
            oKShareMessage.setContent(str2);
            oKShareMessage.setMessagePreview(str3);
            oKShareMessage.setImage(oKImageMessage);
            oKShareMessage.setDeeplink(str4);
            oKShareMessage.setShortLink(str5);
            oKShareMessage.setTagLine(str6);
            oKShareMessage.setCtaType(num);
            oKShareMessage.setBizName(str7);
            oKShareMessage.setShareExtra(map);
            return oKShareMessage;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
    }
}
