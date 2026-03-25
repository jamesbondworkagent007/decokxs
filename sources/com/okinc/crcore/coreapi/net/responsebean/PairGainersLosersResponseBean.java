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
public final class PairGainersLosersResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String changePer;
    private final String displayId;
    private final String instId;
    private final String instType;
    private final String lastPrice;
    private final String quoteVolume24h;
    private final String volume24h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PairGainersLosersResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PairGainersLosersResponseBean copy$default(PairGainersLosersResponseBean pairGainersLosersResponseBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairGainersLosersResponseBean.instId;
        }
        if ((i & 2) != 0) {
            str2 = pairGainersLosersResponseBean.displayId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = pairGainersLosersResponseBean.instType;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = pairGainersLosersResponseBean.changePer;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = pairGainersLosersResponseBean.lastPrice;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = pairGainersLosersResponseBean.volume24h;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = pairGainersLosersResponseBean.quoteVolume24h;
        }
        return pairGainersLosersResponseBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.changePer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PairGainersLosersResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new PairGainersLosersResponseBean(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PairGainersLosersResponseBean)) {
            return false;
        }
        PairGainersLosersResponseBean pairGainersLosersResponseBean = (PairGainersLosersResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) pairGainersLosersResponseBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) pairGainersLosersResponseBean.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) pairGainersLosersResponseBean.instType) && Intrinsics.EZpvd((Object) this.changePer, (Object) pairGainersLosersResponseBean.changePer) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) pairGainersLosersResponseBean.lastPrice) && Intrinsics.EZpvd((Object) this.volume24h, (Object) pairGainersLosersResponseBean.volume24h) && Intrinsics.EZpvd((Object) this.quoteVolume24h, (Object) pairGainersLosersResponseBean.quoteVolume24h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePer() {
        return this.changePer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
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
    public final String getLastPrice() {
        return this.lastPrice;
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
        return (((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.changePer.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.volume24h.hashCode()) * 31) + this.quoteVolume24h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PairGainersLosersResponseBean(instId=" + this.instId + ", displayId=" + this.displayId + ", instType=" + this.instType + ", changePer=" + this.changePer + ", lastPrice=" + this.lastPrice + ", volume24h=" + this.volume24h + ", quoteVolume24h=" + this.quoteVolume24h + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.PairGainersLosersResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PairGainersLosersResponseBean> serializer() {
            return PairGainersLosersResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PairGainersLosersResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.instType = "";
        } else {
            this.instType = str3;
        }
        if ((i & 8) == 0) {
            this.changePer = "";
        } else {
            this.changePer = str4;
        }
        if ((i & 16) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str5;
        }
        if ((i & 32) == 0) {
            this.volume24h = "";
        } else {
            this.volume24h = str6;
        }
        if ((i & 64) == 0) {
            this.quoteVolume24h = "";
        } else {
            this.quoteVolume24h = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PairGainersLosersResponseBean pairGainersLosersResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) pairGainersLosersResponseBean.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, pairGainersLosersResponseBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) pairGainersLosersResponseBean.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, pairGainersLosersResponseBean.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) pairGainersLosersResponseBean.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pairGainersLosersResponseBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) pairGainersLosersResponseBean.changePer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pairGainersLosersResponseBean.changePer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) pairGainersLosersResponseBean.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, pairGainersLosersResponseBean.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) pairGainersLosersResponseBean.volume24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, pairGainersLosersResponseBean.volume24h);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) pairGainersLosersResponseBean.quoteVolume24h, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, pairGainersLosersResponseBean.quoteVolume24h);
    }

    public PairGainersLosersResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.instId = str;
        this.displayId = str2;
        this.instType = str3;
        this.changePer = str4;
        this.lastPrice = str5;
        this.volume24h = str6;
        this.quoteVolume24h = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.PairGainersLosersResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PairGainersLosersResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
