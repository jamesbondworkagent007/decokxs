package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class YieldHunterBannerData {
    private String endTime;
    private String filterJson;
    private String imageUrl;
    private String link;
    private String nightImageUrl;
    private String startTime;
    private String text;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YieldHunterBannerData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.filterJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nightImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YieldHunterBannerData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new YieldHunterBannerData(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YieldHunterBannerData)) {
            return false;
        }
        YieldHunterBannerData yieldHunterBannerData = (YieldHunterBannerData) obj;
        return Intrinsics.EZpvd((Object) this.startTime, (Object) yieldHunterBannerData.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) yieldHunterBannerData.endTime) && Intrinsics.EZpvd((Object) this.filterJson, (Object) yieldHunterBannerData.filterJson) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) yieldHunterBannerData.imageUrl) && Intrinsics.EZpvd((Object) this.nightImageUrl, (Object) yieldHunterBannerData.nightImageUrl) && Intrinsics.EZpvd((Object) this.link, (Object) yieldHunterBannerData.link) && Intrinsics.EZpvd((Object) this.text, (Object) yieldHunterBannerData.text) && Intrinsics.EZpvd((Object) this.title, (Object) yieldHunterBannerData.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilterJson() {
        return this.filterJson;
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
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.startTime;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.endTime;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.filterJson;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.imageUrl;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nightImageUrl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.link;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.text;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.title;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(String str) {
        this.endTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterJson(String str) {
        this.filterJson = str;
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
    public final void setStartTime(String str) {
        this.startTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setText(String str) {
        this.text = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "YieldHunterBannerData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", filterJson=" + this.filterJson + ", imageUrl=" + this.imageUrl + ", nightImageUrl=" + this.nightImageUrl + ", link=" + this.link + ", text=" + this.text + ", title=" + this.title + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.YieldHunterBannerData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<YieldHunterBannerData> serializer() {
            return YieldHunterBannerData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ YieldHunterBannerData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.startTime = null;
        } else {
            this.startTime = str;
        }
        if ((i & 2) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str2;
        }
        if ((i & 4) == 0) {
            this.filterJson = null;
        } else {
            this.filterJson = str3;
        }
        if ((i & 8) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str4;
        }
        if ((i & 16) == 0) {
            this.nightImageUrl = null;
        } else {
            this.nightImageUrl = str5;
        }
        if ((i & 32) == 0) {
            this.link = null;
        } else {
            this.link = str6;
        }
        if ((i & 64) == 0) {
            this.text = null;
        } else {
            this.text = str7;
        }
        if ((i & 128) == 0) {
            this.title = null;
        } else {
            this.title = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(YieldHunterBannerData yieldHunterBannerData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || yieldHunterBannerData.startTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, yieldHunterBannerData.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || yieldHunterBannerData.endTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, yieldHunterBannerData.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || yieldHunterBannerData.filterJson != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, yieldHunterBannerData.filterJson);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || yieldHunterBannerData.imageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, yieldHunterBannerData.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || yieldHunterBannerData.nightImageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, yieldHunterBannerData.nightImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || yieldHunterBannerData.link != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, yieldHunterBannerData.link);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || yieldHunterBannerData.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, yieldHunterBannerData.text);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && yieldHunterBannerData.title == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, yieldHunterBannerData.title);
    }

    public YieldHunterBannerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.startTime = str;
        this.endTime = str2;
        this.filterJson = str3;
        this.imageUrl = str4;
        this.nightImageUrl = str5;
        this.link = str6;
        this.text = str7;
        this.title = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4200) call: com.okinc.unify_trade.biz.YieldHunterBannerData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ YieldHunterBannerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }
}
