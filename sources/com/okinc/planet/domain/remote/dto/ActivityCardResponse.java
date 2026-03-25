package com.okinc.planet.domain.remote.dto;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ActivityCardResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String activityKey;
    public final String activityUrl;
    public final String deeplinkUrl;
    public final String desc;
    public final PublishImageItem image;
    public final String language;
    public final String linkUrl;
    public final Integer shareType;
    public final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivityCardResponse() {
        this((String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (PublishImageItem) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCardResponse EZpvd(@NotNull String str, @NotNull String str2, Integer num, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, PublishImageItem publishImageItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ActivityCardResponse(str, str2, num, str3, str4, str5, str6, str7, publishImageItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityCardResponse)) {
            return false;
        }
        ActivityCardResponse activityCardResponse = (ActivityCardResponse) obj;
        return Intrinsics.EZpvd((Object) this.activityKey, (Object) activityCardResponse.activityKey) && Intrinsics.EZpvd((Object) this.activityUrl, (Object) activityCardResponse.activityUrl) && Intrinsics.EZpvd(this.shareType, activityCardResponse.shareType) && Intrinsics.EZpvd((Object) this.linkUrl, (Object) activityCardResponse.linkUrl) && Intrinsics.EZpvd((Object) this.deeplinkUrl, (Object) activityCardResponse.deeplinkUrl) && Intrinsics.EZpvd((Object) this.language, (Object) activityCardResponse.language) && Intrinsics.EZpvd((Object) this.title, (Object) activityCardResponse.title) && Intrinsics.EZpvd((Object) this.desc, (Object) activityCardResponse.desc) && Intrinsics.EZpvd(this.image, activityCardResponse.image);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.activityKey.hashCode();
        int iHashCode2 = this.activityUrl.hashCode();
        Integer num = this.shareType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        int iHashCode4 = this.linkUrl.hashCode();
        int iHashCode5 = this.deeplinkUrl.hashCode();
        int iHashCode6 = this.language.hashCode();
        int iHashCode7 = this.title.hashCode();
        int iHashCode8 = this.desc.hashCode();
        PublishImageItem publishImageItem = this.image;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (publishImageItem != null ? publishImageItem.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivityCardResponse(activityKey=" + this.activityKey + ", activityUrl=" + this.activityUrl + ", shareType=" + this.shareType + ", linkUrl=" + this.linkUrl + ", deeplinkUrl=" + this.deeplinkUrl + ", language=" + this.language + ", title=" + this.title + ", desc=" + this.desc + ", image=" + this.image + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.ActivityCardResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityCardResponse> serializer() {
            return ActivityCardResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivityCardResponse(int i, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, PublishImageItem publishImageItem, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.activityKey = "";
        } else {
            this.activityKey = str;
        }
        if ((i & 2) == 0) {
            this.activityUrl = "";
        } else {
            this.activityUrl = str2;
        }
        if ((i & 4) == 0) {
            this.shareType = null;
        } else {
            this.shareType = num;
        }
        if ((i & 8) == 0) {
            this.linkUrl = "";
        } else {
            this.linkUrl = str3;
        }
        if ((i & 16) == 0) {
            this.deeplinkUrl = "";
        } else {
            this.deeplinkUrl = str4;
        }
        if ((i & 32) == 0) {
            this.language = "";
        } else {
            this.language = str5;
        }
        if ((i & 64) == 0) {
            this.title = "";
        } else {
            this.title = str6;
        }
        if ((i & 128) == 0) {
            this.desc = "";
        } else {
            this.desc = str7;
        }
        if ((i & 256) == 0) {
            this.image = null;
        } else {
            this.image = publishImageItem;
        }
    }

    public static final /* synthetic */ void KWHzl(ActivityCardResponse activityCardResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) activityCardResponse.activityKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, activityCardResponse.activityKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) activityCardResponse.activityUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, activityCardResponse.activityUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || activityCardResponse.shareType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, activityCardResponse.shareType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) activityCardResponse.linkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, activityCardResponse.linkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) activityCardResponse.deeplinkUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, activityCardResponse.deeplinkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) activityCardResponse.language, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, activityCardResponse.language);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) activityCardResponse.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, activityCardResponse.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) activityCardResponse.desc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, activityCardResponse.desc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && activityCardResponse.image == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, PublishImageItem$$serializer.INSTANCE, activityCardResponse.image);
    }

    public ActivityCardResponse(@NotNull String str, @NotNull String str2, Integer num, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, PublishImageItem publishImageItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.activityKey = str;
        this.activityUrl = str2;
        this.shareType = num;
        this.linkUrl = str3;
        this.deeplinkUrl = str4;
        this.language = str5;
        this.title = str6;
        this.desc = str7;
        this.image = publishImageItem;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:com.okinc.planet.domain.remote.dto.PublishImageItem:?: TERNARY null = ((wrap:int:0x0040: ARITH (r21v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 com.okinc.planet.domain.remote.dto.PublishImageItem) : (null com.okinc.planet.domain.remote.dto.PublishImageItem))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.domain.remote.dto.PublishImageItem):void (m)] (LINE:69) call: com.okinc.planet.domain.remote.dto.ActivityCardResponse.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.domain.remote.dto.PublishImageItem):void type: THIS */
    public /* synthetic */ ActivityCardResponse(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, PublishImageItem publishImageItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) == 0 ? publishImageItem : null);
    }
}
