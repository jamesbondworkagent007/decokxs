package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData$$serializer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ShareContentRequest {
    private static final KSerializer<Object>[] $childSerializers;
    private final String bizName;
    private final List<String> channelIds;
    private final String content;
    private final Integer ctaType;
    private final String deeplink;
    private final Map<String, String> extra;
    private final ImageMessageData image;
    private final String messagePreview;
    private final String shortLink;
    private final String tagLine;
    private final String title;
    private final List<String> userUids;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.ctaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component11() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tagLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.channelIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.userUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.messagePreview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageMessageData component8() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.shortLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareContentRequest copy(@NotNull String str, List<String> list, List<String> list2, String str2, String str3, String str4, String str5, ImageMessageData imageMessageData, String str6, Integer num, Map<String, String> map, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ShareContentRequest(str, list, list2, str2, str3, str4, str5, imageMessageData, str6, num, map, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareContentRequest)) {
            return false;
        }
        ShareContentRequest shareContentRequest = (ShareContentRequest) obj;
        return Intrinsics.EZpvd((Object) this.bizName, (Object) shareContentRequest.bizName) && Intrinsics.EZpvd(this.channelIds, shareContentRequest.channelIds) && Intrinsics.EZpvd(this.userUids, shareContentRequest.userUids) && Intrinsics.EZpvd((Object) this.title, (Object) shareContentRequest.title) && Intrinsics.EZpvd((Object) this.content, (Object) shareContentRequest.content) && Intrinsics.EZpvd((Object) this.deeplink, (Object) shareContentRequest.deeplink) && Intrinsics.EZpvd((Object) this.messagePreview, (Object) shareContentRequest.messagePreview) && Intrinsics.EZpvd(this.image, shareContentRequest.image) && Intrinsics.EZpvd((Object) this.shortLink, (Object) shareContentRequest.shortLink) && Intrinsics.EZpvd(this.ctaType, shareContentRequest.ctaType) && Intrinsics.EZpvd(this.extra, shareContentRequest.extra) && Intrinsics.EZpvd((Object) this.tagLine, (Object) shareContentRequest.tagLine);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizName() {
        return this.bizName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChannelIds() {
        return this.channelIds;
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
    public final Map<String, String> getExtra() {
        return this.extra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageMessageData getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessagePreview() {
        return this.messagePreview;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLink() {
        return this.shortLink;
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
    public final List<String> getUserUids() {
        return this.userUids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bizName.hashCode();
        List<String> list = this.channelIds;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.userUids;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        String str = this.title;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.content;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.deeplink;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.messagePreview;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        ImageMessageData imageMessageData = this.image;
        int iHashCode8 = imageMessageData == null ? 0 : imageMessageData.hashCode();
        String str5 = this.shortLink;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.ctaType;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        Map<String, String> map = this.extra;
        int iHashCode11 = map == null ? 0 : map.hashCode();
        String str6 = this.tagLine;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareContentRequest(bizName=" + this.bizName + ", channelIds=" + this.channelIds + ", userUids=" + this.userUids + ", title=" + this.title + ", content=" + this.content + ", deeplink=" + this.deeplink + ", messagePreview=" + this.messagePreview + ", image=" + this.image + ", shortLink=" + this.shortLink + ", ctaType=" + this.ctaType + ", extra=" + this.extra + ", tagLine=" + this.tagLine + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.ShareContentRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ShareContentRequest> serializer() {
            return ShareContentRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null};
    }

    public /* synthetic */ ShareContentRequest(int i, String str, List list, List list2, String str2, String str3, String str4, String str5, ImageMessageData imageMessageData, String str6, Integer num, Map map, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ShareContentRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.bizName = str;
        if ((i & 2) == 0) {
            this.channelIds = null;
        } else {
            this.channelIds = list;
        }
        if ((i & 4) == 0) {
            this.userUids = null;
        } else {
            this.userUids = list2;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 16) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i & 32) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str4;
        }
        if ((i & 64) == 0) {
            this.messagePreview = null;
        } else {
            this.messagePreview = str5;
        }
        if ((i & 128) == 0) {
            this.image = null;
        } else {
            this.image = imageMessageData;
        }
        if ((i & 256) == 0) {
            this.shortLink = null;
        } else {
            this.shortLink = str6;
        }
        if ((i & 512) == 0) {
            this.ctaType = null;
        } else {
            this.ctaType = num;
        }
        if ((i & 1024) == 0) {
            this.extra = null;
        } else {
            this.extra = map;
        }
        if ((i & 2048) == 0) {
            this.tagLine = null;
        } else {
            this.tagLine = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ShareContentRequest shareContentRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, shareContentRequest.bizName);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || shareContentRequest.channelIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], shareContentRequest.channelIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || shareContentRequest.userUids != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], shareContentRequest.userUids);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || shareContentRequest.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, shareContentRequest.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || shareContentRequest.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, shareContentRequest.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || shareContentRequest.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, shareContentRequest.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || shareContentRequest.messagePreview != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, shareContentRequest.messagePreview);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || shareContentRequest.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, ImageMessageData$$serializer.INSTANCE, shareContentRequest.image);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || shareContentRequest.shortLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, shareContentRequest.shortLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || shareContentRequest.ctaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, shareContentRequest.ctaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || shareContentRequest.extra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], shareContentRequest.extra);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && shareContentRequest.tagLine == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, shareContentRequest.tagLine);
    }

    public ShareContentRequest(@NotNull String str, List<String> list, List<String> list2, String str2, String str3, String str4, String str5, ImageMessageData imageMessageData, String str6, Integer num, Map<String, String> map, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizName = str;
        this.channelIds = list;
        this.userUids = list2;
        this.title = str2;
        this.content = str3;
        this.deeplink = str4;
        this.messagePreview = str5;
        this.image = imageMessageData;
        this.shortLink = str6;
        this.ctaType = num;
        this.extra = map;
        this.tagLine = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData:?: TERNARY null = ((wrap:int:0x0031: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData) : (r20v0 com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0041: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0049: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r23v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r25v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData, java.lang.String, java.lang.Integer, java.util.Map<java.lang.String, java.lang.String>, java.lang.String):void (m)] (LINE:9) call: com.okinc.okimcore.model.remote.ShareContentRequest.<init>(java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData, java.lang.String, java.lang.Integer, java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ ShareContentRequest(String str, List list, List list2, String str2, String str3, String str4, String str5, ImageMessageData imageMessageData, String str6, Integer num, Map map, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : imageMessageData, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : map, (i & 2048) == 0 ? str7 : null);
    }
}
