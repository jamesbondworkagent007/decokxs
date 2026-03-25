package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BannerEventItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String appBgImg;
    public final String appBgNightImg;
    public final String appJoinLink;
    public final String endTime;
    public final String reward;
    public final String title;
    public final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerEventItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BannerEventItem copy$default(BannerEventItem bannerEventItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerEventItem.title;
        }
        if ((i & 2) != 0) {
            str2 = bannerEventItem.reward;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = bannerEventItem.endTime;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = bannerEventItem.appBgNightImg;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = bannerEventItem.appBgImg;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = bannerEventItem.appJoinLink;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = bannerEventItem.token;
        }
        return bannerEventItem.EZpvd(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.appBgNightImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerEventItem EZpvd(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new BannerEventItem(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.reward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.appJoinLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.appBgImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerEventItem)) {
            return false;
        }
        BannerEventItem bannerEventItem = (BannerEventItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) bannerEventItem.title) && Intrinsics.EZpvd((Object) this.reward, (Object) bannerEventItem.reward) && Intrinsics.EZpvd((Object) this.endTime, (Object) bannerEventItem.endTime) && Intrinsics.EZpvd((Object) this.appBgNightImg, (Object) bannerEventItem.appBgNightImg) && Intrinsics.EZpvd((Object) this.appBgImg, (Object) bannerEventItem.appBgImg) && Intrinsics.EZpvd((Object) this.appJoinLink, (Object) bannerEventItem.appJoinLink) && Intrinsics.EZpvd((Object) this.token, (Object) bannerEventItem.token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.reward;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.endTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.appBgNightImg;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.appBgImg;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.appJoinLink;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.token;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerEventItem(title=" + this.title + ", reward=" + this.reward + ", endTime=" + this.endTime + ", appBgNightImg=" + this.appBgNightImg + ", appBgImg=" + this.appBgImg + ", appJoinLink=" + this.appJoinLink + ", token=" + this.token + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.BannerEventItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerEventItem> serializer() {
            return BannerEventItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerEventItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.reward = null;
        } else {
            this.reward = str2;
        }
        if ((i & 4) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str3;
        }
        if ((i & 8) == 0) {
            this.appBgNightImg = null;
        } else {
            this.appBgNightImg = str4;
        }
        if ((i & 16) == 0) {
            this.appBgImg = null;
        } else {
            this.appBgImg = str5;
        }
        if ((i & 32) == 0) {
            this.appJoinLink = null;
        } else {
            this.appJoinLink = str6;
        }
        if ((i & 64) == 0) {
            this.token = null;
        } else {
            this.token = str7;
        }
    }

    public static final /* synthetic */ void AEQbTJ(BannerEventItem bannerEventItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bannerEventItem.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bannerEventItem.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bannerEventItem.reward != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bannerEventItem.reward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bannerEventItem.endTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bannerEventItem.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bannerEventItem.appBgNightImg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bannerEventItem.appBgNightImg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || bannerEventItem.appBgImg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bannerEventItem.appBgImg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || bannerEventItem.appJoinLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, bannerEventItem.appJoinLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && bannerEventItem.token == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, bannerEventItem.token);
    }

    public BannerEventItem(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.title = str;
        this.reward = str2;
        this.endTime = str3;
        this.appBgNightImg = str4;
        this.appBgImg = str5;
        this.appJoinLink = str6;
        this.token = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.market.data.model.BannerEventItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BannerEventItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
