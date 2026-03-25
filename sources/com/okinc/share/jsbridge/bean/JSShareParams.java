package com.okinc.share.jsbridge.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class JSShareParams {
    public static final int CONTENT_TYPE_IMAGE = 2;
    public static final int CONTENT_TYPE_LINK_TEXT = 1;
    private String body;
    private int contentType;
    private JsonObject extras;
    private JSImage image;
    private String linkUrl;
    private String shareFrom;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JSShareParams copy$default(JSShareParams jSShareParams, int i, String str, String str2, String str3, String str4, JSImage jSImage, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jSShareParams.contentType;
        }
        if ((i2 & 2) != 0) {
            str = jSShareParams.shareFrom;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = jSShareParams.title;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = jSShareParams.body;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = jSShareParams.linkUrl;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            jSImage = jSShareParams.image;
        }
        JSImage jSImage2 = jSImage;
        if ((i2 & 64) != 0) {
            jsonObject = jSShareParams.extras;
        }
        return jSShareParams.copy(i, str5, str6, str7, str8, jSImage2, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.linkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSImage component6() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component7() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSShareParams copy(int i, @NotNull String str, String str2, String str3, String str4, JSImage jSImage, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        return new JSShareParams(i, str, str2, str3, str4, jSImage, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSShareParams)) {
            return false;
        }
        JSShareParams jSShareParams = (JSShareParams) obj;
        return this.contentType == jSShareParams.contentType && Intrinsics.EZpvd((Object) this.shareFrom, (Object) jSShareParams.shareFrom) && Intrinsics.EZpvd((Object) this.title, (Object) jSShareParams.title) && Intrinsics.EZpvd((Object) this.body, (Object) jSShareParams.body) && Intrinsics.EZpvd((Object) this.linkUrl, (Object) jSShareParams.linkUrl) && Intrinsics.EZpvd(this.image, jSShareParams.image) && Intrinsics.EZpvd(this.extras, jSShareParams.extras);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getExtras() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSImage getImage() {
        return this.image;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareFrom() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.contentType);
        int iHashCode2 = this.shareFrom.hashCode();
        String str = this.title;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.body;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.linkUrl;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        JSImage jSImage = this.image;
        int iHashCode6 = jSImage == null ? 0 : jSImage.hashCode();
        JsonObject jsonObject = this.extras;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBody(String str) {
        this.body = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentType(int i) {
        this.contentType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtras(JsonObject jsonObject) {
        this.extras = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImage(JSImage jSImage) {
        this.image = jSImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shareFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JSShareParams(contentType=" + this.contentType + ", shareFrom=" + this.shareFrom + ", title=" + this.title + ", body=" + this.body + ", linkUrl=" + this.linkUrl + ", image=" + this.image + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ JSShareParams(int i, int i2, String str, String str2, String str3, String str4, JSImage jSImage, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, JSShareParams$$serializer.INSTANCE.getDescriptor());
        }
        this.contentType = i2;
        this.shareFrom = str;
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.body = null;
        } else {
            this.body = str3;
        }
        if ((i & 16) == 0) {
            this.linkUrl = null;
        } else {
            this.linkUrl = str4;
        }
        if ((i & 32) == 0) {
            this.image = null;
        } else {
            this.image = jSImage;
        }
        if ((i & 64) == 0) {
            this.extras = null;
        } else {
            this.extras = jsonObject;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(JSShareParams jSShareParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, jSShareParams.contentType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, jSShareParams.shareFrom);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || jSShareParams.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, jSShareParams.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || jSShareParams.body != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, jSShareParams.body);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || jSShareParams.linkUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, jSShareParams.linkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || jSShareParams.image != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, JSImage$$serializer.INSTANCE, jSShareParams.image);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && jSShareParams.extras == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, JsonObjectSerializer.INSTANCE, jSShareParams.extras);
    }

    public JSShareParams(int i, @NotNull String str, String str2, String str3, String str4, JSImage jSImage, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentType = i;
        this.shareFrom = str;
        this.title = str2;
        this.body = str3;
        this.linkUrl = str4;
        this.image = jSImage;
        this.extras = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.share.jsbridge.bean.JSImage:?: TERNARY null = ((wrap:int:0x0016: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.jsbridge.bean.JSImage) : (r16v0 com.okinc.share.jsbridge.bean.JSImage))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r17v0 kotlinx.serialization.json.JsonObject))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.share.jsbridge.bean.JSImage, kotlinx.serialization.json.JsonObject):void (m)] (LINE:19) call: com.okinc.share.jsbridge.bean.JSShareParams.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.share.jsbridge.bean.JSImage, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ JSShareParams(int i, String str, String str2, String str3, String str4, JSImage jSImage, JsonObject jsonObject, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : jSImage, (i2 & 64) != 0 ? null : jsonObject);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.jsbridge.bean.JSShareParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<JSShareParams> serializer() {
            return JSShareParams$$serializer.INSTANCE;
        }
    }
}
