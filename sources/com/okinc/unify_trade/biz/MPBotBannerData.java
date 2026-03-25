package com.okinc.unify_trade.biz;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class MPBotBannerData {
    private String backApyTitle;
    private String endTime;
    private String imageUrl;
    private String link;
    private String nightImageUrl;
    private MPBotBannerParam param;
    private String startTime;
    private String text;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MPBotBannerData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (MPBotBannerParam) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nightImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotBannerParam component8() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.backApyTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotBannerData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, MPBotBannerParam mPBotBannerParam, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str8, "");
        return new MPBotBannerData(str, str2, str3, str4, str5, str6, str7, mPBotBannerParam, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MPBotBannerData)) {
            return false;
        }
        MPBotBannerData mPBotBannerData = (MPBotBannerData) obj;
        return Intrinsics.EZpvd((Object) this.imageUrl, (Object) mPBotBannerData.imageUrl) && Intrinsics.EZpvd((Object) this.nightImageUrl, (Object) mPBotBannerData.nightImageUrl) && Intrinsics.EZpvd((Object) this.link, (Object) mPBotBannerData.link) && Intrinsics.EZpvd((Object) this.text, (Object) mPBotBannerData.text) && Intrinsics.EZpvd((Object) this.startTime, (Object) mPBotBannerData.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) mPBotBannerData.endTime) && Intrinsics.EZpvd((Object) this.type, (Object) mPBotBannerData.type) && Intrinsics.EZpvd(this.param, mPBotBannerData.param) && Intrinsics.EZpvd((Object) this.backApyTitle, (Object) mPBotBannerData.backApyTitle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackApyTitle() {
        return this.backApyTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLink() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightImageUrl() {
        return this.nightImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MPBotBannerParam getParam() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nightImageUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.link;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.text;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.startTime;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.endTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.type;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        MPBotBannerParam mPBotBannerParam = this.param;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (mPBotBannerParam != null ? mPBotBannerParam.hashCode() : 0)) * 31) + this.backApyTitle.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackApyTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.backApyTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(String str) {
        this.endTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLink(String str) {
        this.link = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNightImageUrl(String str) {
        this.nightImageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParam(MPBotBannerParam mPBotBannerParam) {
        this.param = mPBotBannerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(String str) {
        this.startTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(String str) {
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MPBotBannerData(imageUrl=" + this.imageUrl + ", nightImageUrl=" + this.nightImageUrl + ", link=" + this.link + ", text=" + this.text + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", type=" + this.type + ", param=" + this.param + ", backApyTitle=" + this.backApyTitle + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MPBotBannerData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MPBotBannerData> serializer() {
            return MPBotBannerData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MPBotBannerData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, MPBotBannerParam mPBotBannerParam, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str;
        }
        if ((i & 2) == 0) {
            this.nightImageUrl = null;
        } else {
            this.nightImageUrl = str2;
        }
        if ((i & 4) == 0) {
            this.link = null;
        } else {
            this.link = str3;
        }
        if ((i & 8) == 0) {
            this.text = null;
        } else {
            this.text = str4;
        }
        if ((i & 16) == 0) {
            this.startTime = null;
        } else {
            this.startTime = str5;
        }
        if ((i & 32) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str6;
        }
        if ((i & 64) == 0) {
            this.type = null;
        } else {
            this.type = str7;
        }
        if ((i & 128) == 0) {
            this.param = null;
        } else {
            this.param = mPBotBannerParam;
        }
        if ((i & 256) == 0) {
            this.backApyTitle = "";
        } else {
            this.backApyTitle = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MPBotBannerData mPBotBannerData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mPBotBannerData.imageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mPBotBannerData.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mPBotBannerData.nightImageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, mPBotBannerData.nightImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || mPBotBannerData.link != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, mPBotBannerData.link);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || mPBotBannerData.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, mPBotBannerData.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || mPBotBannerData.startTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, mPBotBannerData.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || mPBotBannerData.endTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, mPBotBannerData.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || mPBotBannerData.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, mPBotBannerData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || mPBotBannerData.param != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, MPBotBannerParam$$serializer.INSTANCE, mPBotBannerData.param);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) mPBotBannerData.backApyTitle, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, mPBotBannerData.backApyTitle);
    }

    public MPBotBannerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, MPBotBannerParam mPBotBannerParam, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str8, "");
        this.imageUrl = str;
        this.nightImageUrl = str2;
        this.link = str3;
        this.text = str4;
        this.startTime = str5;
        this.endTime = str6;
        this.type = str7;
        this.param = mPBotBannerParam;
        this.backApyTitle = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.MPBotBannerParam:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 com.okinc.unify_trade.biz.MPBotBannerParam) : (null com.okinc.unify_trade.biz.MPBotBannerParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.MPBotBannerParam, java.lang.String):void (m)] (LINE:2865) call: com.okinc.unify_trade.biz.MPBotBannerData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.MPBotBannerParam, java.lang.String):void type: THIS */
    public /* synthetic */ MPBotBannerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, MPBotBannerParam mPBotBannerParam, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? mPBotBannerParam : null, (i & 256) != 0 ? "" : str8);
    }
}
