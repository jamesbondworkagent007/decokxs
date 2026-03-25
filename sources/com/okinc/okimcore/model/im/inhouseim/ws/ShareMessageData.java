package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ShareMessageData {
    public final String bizName;
    public final String content;
    public final Integer ctaType;
    public final String deeplink;
    public JsonElement extra;
    public final ImageMessageData image;
    public final String preview;
    public String quotedMsgSeq;
    public final String shortLink;
    public final String tagLine;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement AEQbTJ() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.preview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageMessageData AhwBna() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareMessageData KWHzl(@NotNull String str, Integer num, String str2, String str3, String str4, ImageMessageData imageMessageData, String str5, String str6, String str7, String str8, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ShareMessageData(str, num, str2, str3, str4, imageMessageData, str5, str6, str7, str8, jsonElement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer KWHzl() {
        return this.ctaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareMessageData)) {
            return false;
        }
        ShareMessageData shareMessageData = (ShareMessageData) obj;
        return Intrinsics.EZpvd((Object) this.bizName, (Object) shareMessageData.bizName) && Intrinsics.EZpvd(this.ctaType, shareMessageData.ctaType) && Intrinsics.EZpvd((Object) this.title, (Object) shareMessageData.title) && Intrinsics.EZpvd((Object) this.content, (Object) shareMessageData.content) && Intrinsics.EZpvd((Object) this.preview, (Object) shareMessageData.preview) && Intrinsics.EZpvd(this.image, shareMessageData.image) && Intrinsics.EZpvd((Object) this.deeplink, (Object) shareMessageData.deeplink) && Intrinsics.EZpvd((Object) this.shortLink, (Object) shareMessageData.shortLink) && Intrinsics.EZpvd((Object) this.tagLine, (Object) shareMessageData.tagLine) && Intrinsics.EZpvd((Object) this.quotedMsgSeq, (Object) shareMessageData.quotedMsgSeq) && Intrinsics.EZpvd(this.extra, shareMessageData.extra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bizName.hashCode();
        Integer num = this.ctaType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.title;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.preview;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        ImageMessageData imageMessageData = this.image;
        int iHashCode6 = imageMessageData == null ? 0 : imageMessageData.hashCode();
        String str4 = this.deeplink;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.shortLink;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tagLine;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.quotedMsgSeq;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        JsonElement jsonElement = this.extra;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareMessageData(bizName=" + this.bizName + ", ctaType=" + this.ctaType + ", title=" + this.title + ", content=" + this.content + ", preview=" + this.preview + ", image=" + this.image + ", deeplink=" + this.deeplink + ", shortLink=" + this.shortLink + ", tagLine=" + this.tagLine + ", quotedMsgSeq=" + this.quotedMsgSeq + ", extra=" + this.extra + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tagLine;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareMessageData> serializer() {
            return ShareMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareMessageData(int i, String str, Integer num, String str2, String str3, String str4, ImageMessageData imageMessageData, String str5, String str6, String str7, String str8, JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ShareMessageData$$serializer.INSTANCE.getDescriptor());
        }
        this.bizName = str;
        if ((i & 2) == 0) {
            this.ctaType = null;
        } else {
            this.ctaType = num;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i & 16) == 0) {
            this.preview = null;
        } else {
            this.preview = str4;
        }
        if ((i & 32) == 0) {
            this.image = null;
        } else {
            this.image = imageMessageData;
        }
        if ((i & 64) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str5;
        }
        if ((i & 128) == 0) {
            this.shortLink = null;
        } else {
            this.shortLink = str6;
        }
        if ((i & 256) == 0) {
            this.tagLine = null;
        } else {
            this.tagLine = str7;
        }
        if ((i & 512) == 0) {
            this.quotedMsgSeq = null;
        } else {
            this.quotedMsgSeq = str8;
        }
        if ((i & 1024) == 0) {
            this.extra = null;
        } else {
            this.extra = jsonElement;
        }
    }

    public static final /* synthetic */ void copydefault(ShareMessageData shareMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, shareMessageData.bizName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || shareMessageData.ctaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, shareMessageData.ctaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || shareMessageData.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, shareMessageData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || shareMessageData.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, shareMessageData.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || shareMessageData.preview != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, shareMessageData.preview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || shareMessageData.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, ImageMessageData$$serializer.INSTANCE, shareMessageData.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || shareMessageData.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, shareMessageData.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || shareMessageData.shortLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, shareMessageData.shortLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || shareMessageData.tagLine != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, shareMessageData.tagLine);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || shareMessageData.quotedMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, shareMessageData.quotedMsgSeq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && shareMessageData.extra == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, JsonElementSerializer.INSTANCE, shareMessageData.extra);
    }

    public ShareMessageData(@NotNull String str, Integer num, String str2, String str3, String str4, ImageMessageData imageMessageData, String str5, String str6, String str7, String str8, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizName = str;
        this.ctaType = num;
        this.title = str2;
        this.content = str3;
        this.preview = str4;
        this.image = imageMessageData;
        this.deeplink = str5;
        this.shortLink = str6;
        this.tagLine = str7;
        this.quotedMsgSeq = str8;
        this.extra = jsonElement;
    }
}
