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
public final class FairPriceResponseBean {
    private String coin;
    private String fairPrice;
    private String fairPricePair;
    private String isConverterNeeded;
    private String isStableCoin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FairPriceResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FairPriceResponseBean copy$default(FairPriceResponseBean fairPriceResponseBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fairPriceResponseBean.coin;
        }
        if ((i & 2) != 0) {
            str2 = fairPriceResponseBean.fairPrice;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = fairPriceResponseBean.fairPricePair;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = fairPriceResponseBean.isConverterNeeded;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = fairPriceResponseBean.isStableCoin;
        }
        return fairPriceResponseBean.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fairPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fairPricePair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isConverterNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FairPriceResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new FairPriceResponseBean(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FairPriceResponseBean)) {
            return false;
        }
        FairPriceResponseBean fairPriceResponseBean = (FairPriceResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.coin, (Object) fairPriceResponseBean.coin) && Intrinsics.EZpvd((Object) this.fairPrice, (Object) fairPriceResponseBean.fairPrice) && Intrinsics.EZpvd((Object) this.fairPricePair, (Object) fairPriceResponseBean.fairPricePair) && Intrinsics.EZpvd((Object) this.isConverterNeeded, (Object) fairPriceResponseBean.isConverterNeeded) && Intrinsics.EZpvd((Object) this.isStableCoin, (Object) fairPriceResponseBean.isStableCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFairPrice() {
        return this.fairPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFairPricePair() {
        return this.fairPricePair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.coin.hashCode() * 31) + this.fairPrice.hashCode()) * 31) + this.fairPricePair.hashCode()) * 31) + this.isConverterNeeded.hashCode()) * 31) + this.isStableCoin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConverterNeeded() {
        return this.isConverterNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isStableCoin() {
        return this.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConverterNeeded(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConverterNeeded = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFairPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fairPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFairPricePair(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fairPricePair = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStableCoin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isStableCoin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FairPriceResponseBean(coin=" + this.coin + ", fairPrice=" + this.fairPrice + ", fairPricePair=" + this.fairPricePair + ", isConverterNeeded=" + this.isConverterNeeded + ", isStableCoin=" + this.isStableCoin + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.FairPriceResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FairPriceResponseBean> serializer() {
            return FairPriceResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FairPriceResponseBean(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coin = "";
        } else {
            this.coin = str;
        }
        if ((i & 2) == 0) {
            this.fairPrice = "";
        } else {
            this.fairPrice = str2;
        }
        if ((i & 4) == 0) {
            this.fairPricePair = "";
        } else {
            this.fairPricePair = str3;
        }
        if ((i & 8) == 0) {
            this.isConverterNeeded = "";
        } else {
            this.isConverterNeeded = str4;
        }
        if ((i & 16) == 0) {
            this.isStableCoin = "";
        } else {
            this.isStableCoin = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(FairPriceResponseBean fairPriceResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fairPriceResponseBean.coin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fairPriceResponseBean.coin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fairPriceResponseBean.fairPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fairPriceResponseBean.fairPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fairPriceResponseBean.fairPricePair, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fairPriceResponseBean.fairPricePair);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) fairPriceResponseBean.isConverterNeeded, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, fairPriceResponseBean.isConverterNeeded);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) fairPriceResponseBean.isStableCoin, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, fairPriceResponseBean.isStableCoin);
    }

    public FairPriceResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.coin = str;
        this.fairPrice = str2;
        this.fairPricePair = str3;
        this.isConverterNeeded = str4;
        this.isStableCoin = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.FairPriceResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FairPriceResponseBean(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
