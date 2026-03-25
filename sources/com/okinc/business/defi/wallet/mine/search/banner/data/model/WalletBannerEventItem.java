package com.okinc.business.defi.wallet.mine.search.banner.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WalletBannerEventItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String appBgImg;
    private final String appBgNightImg;
    private final String appJoinLink;
    private final String endTime;
    private final String reward;
    private final String title;
    private final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletBannerEventItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletBannerEventItem copy$default(WalletBannerEventItem walletBannerEventItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletBannerEventItem.title;
        }
        if ((i & 2) != 0) {
            str2 = walletBannerEventItem.reward;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = walletBannerEventItem.endTime;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = walletBannerEventItem.appBgNightImg;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = walletBannerEventItem.appBgImg;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = walletBannerEventItem.appJoinLink;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = walletBannerEventItem.token;
        }
        return walletBannerEventItem.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @SerialName("appBgImg")
    public static /* synthetic */ void getAppBgImg$annotations() {
    }

    @SerialName("appBgNightImg")
    public static /* synthetic */ void getAppBgNightImg$annotations() {
    }

    @SerialName("appJoinLink")
    public static /* synthetic */ void getAppJoinLink$annotations() {
    }

    @SerialName("endTime")
    public static /* synthetic */ void getEndTime$annotations() {
    }

    @SerialName("reward")
    public static /* synthetic */ void getReward$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.reward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.appBgNightImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.appBgImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.appJoinLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletBannerEventItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new WalletBannerEventItem(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletBannerEventItem)) {
            return false;
        }
        WalletBannerEventItem walletBannerEventItem = (WalletBannerEventItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) walletBannerEventItem.title) && Intrinsics.EZpvd((Object) this.reward, (Object) walletBannerEventItem.reward) && Intrinsics.EZpvd((Object) this.endTime, (Object) walletBannerEventItem.endTime) && Intrinsics.EZpvd((Object) this.appBgNightImg, (Object) walletBannerEventItem.appBgNightImg) && Intrinsics.EZpvd((Object) this.appBgImg, (Object) walletBannerEventItem.appBgImg) && Intrinsics.EZpvd((Object) this.appJoinLink, (Object) walletBannerEventItem.appJoinLink) && Intrinsics.EZpvd((Object) this.token, (Object) walletBannerEventItem.token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppBgImg() {
        return this.appBgImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppBgNightImg() {
        return this.appBgNightImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppJoinLink() {
        return this.appJoinLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReward() {
        return this.reward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
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
        return "WalletBannerEventItem(title=" + this.title + ", reward=" + this.reward + ", endTime=" + this.endTime + ", appBgNightImg=" + this.appBgNightImg + ", appBgImg=" + this.appBgImg + ", appJoinLink=" + this.appJoinLink + ", token=" + this.token + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletBannerEventItem> serializer() {
            return WalletBannerEventItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletBannerEventItem(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
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

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletBannerEventItem walletBannerEventItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletBannerEventItem.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletBannerEventItem.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletBannerEventItem.reward != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletBannerEventItem.reward);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletBannerEventItem.endTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletBannerEventItem.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletBannerEventItem.appBgNightImg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletBannerEventItem.appBgNightImg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || walletBannerEventItem.appBgImg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, walletBannerEventItem.appBgImg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletBannerEventItem.appJoinLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, walletBannerEventItem.appJoinLink);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && walletBannerEventItem.token == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, walletBannerEventItem.token);
    }

    public WalletBannerEventItem(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletBannerEventItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
