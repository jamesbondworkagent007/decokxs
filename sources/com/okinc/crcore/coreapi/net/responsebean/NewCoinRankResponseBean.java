package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NewCoinRankResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String changePerDay24h;
    private final String changePerDayUtc0;
    private final String changePerDayUtc8;
    private final String displayId;
    private final String icon;
    private final String instId;
    private final String lastPrice;
    private final String onlineTs;
    private final String quoteVolume24h;
    private final String volume24h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCoinRankResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinRankResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new NewCoinRankResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCoinRankResponseBean)) {
            return false;
        }
        NewCoinRankResponseBean newCoinRankResponseBean = (NewCoinRankResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) newCoinRankResponseBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) newCoinRankResponseBean.displayId) && Intrinsics.EZpvd((Object) this.icon, (Object) newCoinRankResponseBean.icon) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) newCoinRankResponseBean.onlineTs) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) newCoinRankResponseBean.lastPrice) && Intrinsics.EZpvd((Object) this.changePerDay24h, (Object) newCoinRankResponseBean.changePerDay24h) && Intrinsics.EZpvd((Object) this.changePerDayUtc0, (Object) newCoinRankResponseBean.changePerDayUtc0) && Intrinsics.EZpvd((Object) this.changePerDayUtc8, (Object) newCoinRankResponseBean.changePerDayUtc8) && Intrinsics.EZpvd((Object) this.volume24h, (Object) newCoinRankResponseBean.volume24h) && Intrinsics.EZpvd((Object) this.quoteVolume24h, (Object) newCoinRankResponseBean.quoteVolume24h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDay24h() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc0() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc8() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
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
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnlineTs() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteVolume24h() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume24h() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.onlineTs.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.changePerDay24h.hashCode()) * 31) + this.changePerDayUtc0.hashCode()) * 31) + this.changePerDayUtc8.hashCode()) * 31) + this.volume24h.hashCode()) * 31) + this.quoteVolume24h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCoinRankResponseBean(instId=" + this.instId + ", displayId=" + this.displayId + ", icon=" + this.icon + ", onlineTs=" + this.onlineTs + ", lastPrice=" + this.lastPrice + ", changePerDay24h=" + this.changePerDay24h + ", changePerDayUtc0=" + this.changePerDayUtc0 + ", changePerDayUtc8=" + this.changePerDayUtc8 + ", volume24h=" + this.volume24h + ", quoteVolume24h=" + this.quoteVolume24h + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.NewCoinRankResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCoinRankResponseBean> serializer() {
            return NewCoinRankResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewCoinRankResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str2;
        }
        if ((i & 4) == 0) {
            this.icon = "";
        } else {
            this.icon = str3;
        }
        if ((i & 8) == 0) {
            this.onlineTs = "";
        } else {
            this.onlineTs = str4;
        }
        if ((i & 16) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str5;
        }
        if ((i & 32) == 0) {
            this.changePerDay24h = "";
        } else {
            this.changePerDay24h = str6;
        }
        if ((i & 64) == 0) {
            this.changePerDayUtc0 = "";
        } else {
            this.changePerDayUtc0 = str7;
        }
        if ((i & 128) == 0) {
            this.changePerDayUtc8 = "";
        } else {
            this.changePerDayUtc8 = str8;
        }
        if ((i & 256) == 0) {
            this.volume24h = "";
        } else {
            this.volume24h = str9;
        }
        if ((i & 512) == 0) {
            this.quoteVolume24h = "";
        } else {
            this.quoteVolume24h = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(NewCoinRankResponseBean newCoinRankResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, newCoinRankResponseBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, newCoinRankResponseBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, newCoinRankResponseBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.onlineTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, newCoinRankResponseBean.onlineTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, newCoinRankResponseBean.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.changePerDay24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, newCoinRankResponseBean.changePerDay24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.changePerDayUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, newCoinRankResponseBean.changePerDayUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.changePerDayUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, newCoinRankResponseBean.changePerDayUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) newCoinRankResponseBean.volume24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, newCoinRankResponseBean.volume24h);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) newCoinRankResponseBean.quoteVolume24h, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, newCoinRankResponseBean.quoteVolume24h);
    }

    public NewCoinRankResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.instId = str;
        this.displayId = str2;
        this.icon = str3;
        this.onlineTs = str4;
        this.lastPrice = str5;
        this.changePerDay24h = str6;
        this.changePerDayUtc0 = str7;
        this.changePerDayUtc8 = str8;
        this.volume24h = str9;
        this.quoteVolume24h = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.crcore.coreapi.net.responsebean.NewCoinRankResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewCoinRankResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }
}
