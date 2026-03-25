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
public final class SpotBuyAndSellResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String category;
    private final String ratioBuy;
    private final String ratioSell;
    private final String ts;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotBuyAndSellResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotBuyAndSellResponseBean copy$default(SpotBuyAndSellResponseBean spotBuyAndSellResponseBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotBuyAndSellResponseBean.ts;
        }
        if ((i & 2) != 0) {
            str2 = spotBuyAndSellResponseBean.ratioBuy;
        }
        if ((i & 4) != 0) {
            str3 = spotBuyAndSellResponseBean.ratioSell;
        }
        if ((i & 8) != 0) {
            str4 = spotBuyAndSellResponseBean.category;
        }
        return spotBuyAndSellResponseBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ratioBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ratioSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotBuyAndSellResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SpotBuyAndSellResponseBean(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotBuyAndSellResponseBean)) {
            return false;
        }
        SpotBuyAndSellResponseBean spotBuyAndSellResponseBean = (SpotBuyAndSellResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.ts, (Object) spotBuyAndSellResponseBean.ts) && Intrinsics.EZpvd((Object) this.ratioBuy, (Object) spotBuyAndSellResponseBean.ratioBuy) && Intrinsics.EZpvd((Object) this.ratioSell, (Object) spotBuyAndSellResponseBean.ratioSell) && Intrinsics.EZpvd((Object) this.category, (Object) spotBuyAndSellResponseBean.category);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioBuy() {
        return this.ratioBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioSell() {
        return this.ratioSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.ts.hashCode() * 31) + this.ratioBuy.hashCode()) * 31) + this.ratioSell.hashCode()) * 31) + this.category.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotBuyAndSellResponseBean(ts=" + this.ts + ", ratioBuy=" + this.ratioBuy + ", ratioSell=" + this.ratioSell + ", category=" + this.category + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.SpotBuyAndSellResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotBuyAndSellResponseBean> serializer() {
            return SpotBuyAndSellResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotBuyAndSellResponseBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ts = "";
        } else {
            this.ts = str;
        }
        if ((i & 2) == 0) {
            this.ratioBuy = "";
        } else {
            this.ratioBuy = str2;
        }
        if ((i & 4) == 0) {
            this.ratioSell = "";
        } else {
            this.ratioSell = str3;
        }
        if ((i & 8) == 0) {
            this.category = "";
        } else {
            this.category = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SpotBuyAndSellResponseBean spotBuyAndSellResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) spotBuyAndSellResponseBean.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, spotBuyAndSellResponseBean.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotBuyAndSellResponseBean.ratioBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotBuyAndSellResponseBean.ratioBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotBuyAndSellResponseBean.ratioSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotBuyAndSellResponseBean.ratioSell);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) spotBuyAndSellResponseBean.category, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, spotBuyAndSellResponseBean.category);
    }

    public SpotBuyAndSellResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.ts = str;
        this.ratioBuy = str2;
        this.ratioSell = str3;
        this.category = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.SpotBuyAndSellResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotBuyAndSellResponseBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
