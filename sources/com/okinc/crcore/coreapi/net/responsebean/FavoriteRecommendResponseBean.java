package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class FavoriteRecommendResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String alias;
    private final String displayId;
    private final String expTime;
    private final String fullName;
    private final String icon;
    private final String instId;
    private final String instType;
    private final String open24h;
    private final String price;
    private final String quoteIcon;
    private final String quoteName;
    private final String sodUtc0;
    private final String sodUtc8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FavoriteRecommendResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.quoteIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quoteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteRecommendResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new FavoriteRecommendResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteRecommendResponseBean)) {
            return false;
        }
        FavoriteRecommendResponseBean favoriteRecommendResponseBean = (FavoriteRecommendResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.alias, (Object) favoriteRecommendResponseBean.alias) && Intrinsics.EZpvd((Object) this.expTime, (Object) favoriteRecommendResponseBean.expTime) && Intrinsics.EZpvd((Object) this.instId, (Object) favoriteRecommendResponseBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) favoriteRecommendResponseBean.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) favoriteRecommendResponseBean.instType) && Intrinsics.EZpvd((Object) this.fullName, (Object) favoriteRecommendResponseBean.fullName) && Intrinsics.EZpvd((Object) this.icon, (Object) favoriteRecommendResponseBean.icon) && Intrinsics.EZpvd((Object) this.price, (Object) favoriteRecommendResponseBean.price) && Intrinsics.EZpvd((Object) this.open24h, (Object) favoriteRecommendResponseBean.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) favoriteRecommendResponseBean.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) favoriteRecommendResponseBean.sodUtc8) && Intrinsics.EZpvd((Object) this.quoteIcon, (Object) favoriteRecommendResponseBean.quoteIcon) && Intrinsics.EZpvd((Object) this.quoteName, (Object) favoriteRecommendResponseBean.quoteName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteIcon() {
        return this.quoteIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteName() {
        return this.quoteName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.alias.hashCode() * 31) + this.expTime.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.price.hashCode()) * 31) + this.open24h.hashCode()) * 31) + this.sodUtc0.hashCode()) * 31) + this.sodUtc8.hashCode()) * 31) + this.quoteIcon.hashCode()) * 31) + this.quoteName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteRecommendResponseBean(alias=" + this.alias + ", expTime=" + this.expTime + ", instId=" + this.instId + ", displayId=" + this.displayId + ", instType=" + this.instType + ", fullName=" + this.fullName + ", icon=" + this.icon + ", price=" + this.price + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", quoteIcon=" + this.quoteIcon + ", quoteName=" + this.quoteName + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.FavoriteRecommendResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavoriteRecommendResponseBean> serializer() {
            return FavoriteRecommendResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FavoriteRecommendResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.alias = "";
        } else {
            this.alias = str;
        }
        if ((i & 2) == 0) {
            this.expTime = "";
        } else {
            this.expTime = str2;
        }
        if ((i & 4) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str4;
        }
        if ((i & 16) == 0) {
            this.instType = "";
        } else {
            this.instType = str5;
        }
        if ((i & 32) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str6;
        }
        if ((i & 64) == 0) {
            this.icon = "";
        } else {
            this.icon = str7;
        }
        if ((i & 128) == 0) {
            this.price = "";
        } else {
            this.price = str8;
        }
        if ((i & 256) == 0) {
            this.open24h = "";
        } else {
            this.open24h = str9;
        }
        if ((i & 512) == 0) {
            this.sodUtc0 = "";
        } else {
            this.sodUtc0 = str10;
        }
        if ((i & 1024) == 0) {
            this.sodUtc8 = "";
        } else {
            this.sodUtc8 = str11;
        }
        if ((i & 2048) == 0) {
            this.quoteIcon = "";
        } else {
            this.quoteIcon = str12;
        }
        if ((i & 4096) == 0) {
            this.quoteName = "";
        } else {
            this.quoteName = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FavoriteRecommendResponseBean favoriteRecommendResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, favoriteRecommendResponseBean.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.expTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, favoriteRecommendResponseBean.expTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, favoriteRecommendResponseBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, favoriteRecommendResponseBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, favoriteRecommendResponseBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, favoriteRecommendResponseBean.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, favoriteRecommendResponseBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, favoriteRecommendResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.open24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, favoriteRecommendResponseBean.open24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.sodUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, favoriteRecommendResponseBean.sodUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.sodUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, favoriteRecommendResponseBean.sodUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.quoteIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, favoriteRecommendResponseBean.quoteIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) favoriteRecommendResponseBean.quoteName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, favoriteRecommendResponseBean.quoteName);
    }

    public FavoriteRecommendResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.alias = str;
        this.expTime = str2;
        this.instId = str3;
        this.displayId = str4;
        this.instType = str5;
        this.fullName = str6;
        this.icon = str7;
        this.price = str8;
        this.open24h = str9;
        this.sodUtc0 = str10;
        this.sodUtc8 = str11;
        this.quoteIcon = str12;
        this.quoteName = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.FavoriteRecommendResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FavoriteRecommendResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) == 0 ? str13 : "");
    }
}
