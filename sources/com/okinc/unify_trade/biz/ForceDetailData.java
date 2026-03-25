package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ForceDetailData {
    private String bkLoss;
    private String bkPx;
    private String ccy;
    private String posSide;
    private String side;
    private String sz;
    private String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ForceDetailData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ForceDetailData copy$default(ForceDetailData forceDetailData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forceDetailData.side;
        }
        if ((i & 2) != 0) {
            str2 = forceDetailData.posSide;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = forceDetailData.bkPx;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = forceDetailData.sz;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = forceDetailData.bkLoss;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = forceDetailData.ccy;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = forceDetailData.ts;
        }
        return forceDetailData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bkPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bkLoss;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ForceDetailData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ForceDetailData(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForceDetailData)) {
            return false;
        }
        ForceDetailData forceDetailData = (ForceDetailData) obj;
        return Intrinsics.EZpvd((Object) this.side, (Object) forceDetailData.side) && Intrinsics.EZpvd((Object) this.posSide, (Object) forceDetailData.posSide) && Intrinsics.EZpvd((Object) this.bkPx, (Object) forceDetailData.bkPx) && Intrinsics.EZpvd((Object) this.sz, (Object) forceDetailData.sz) && Intrinsics.EZpvd((Object) this.bkLoss, (Object) forceDetailData.bkLoss) && Intrinsics.EZpvd((Object) this.ccy, (Object) forceDetailData.ccy) && Intrinsics.EZpvd((Object) this.ts, (Object) forceDetailData.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBkLoss() {
        return this.bkLoss;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBkPx() {
        return this.bkPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.side.hashCode() * 31) + this.posSide.hashCode()) * 31) + this.bkPx.hashCode()) * 31) + this.sz.hashCode()) * 31) + this.bkLoss.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBkLoss(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bkLoss = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBkPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bkPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ForceDetailData(side=" + this.side + ", posSide=" + this.posSide + ", bkPx=" + this.bkPx + ", sz=" + this.sz + ", bkLoss=" + this.bkLoss + ", ccy=" + this.ccy + ", ts=" + this.ts + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ForceDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ForceDetailData> serializer() {
            return ForceDetailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ForceDetailData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.side = "";
        } else {
            this.side = str;
        }
        if ((i & 2) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str2;
        }
        if ((i & 4) == 0) {
            this.bkPx = "";
        } else {
            this.bkPx = str3;
        }
        if ((i & 8) == 0) {
            this.sz = "";
        } else {
            this.sz = str4;
        }
        if ((i & 16) == 0) {
            this.bkLoss = "";
        } else {
            this.bkLoss = str5;
        }
        if ((i & 32) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str6;
        }
        if ((i & 64) == 0) {
            this.ts = "";
        } else {
            this.ts = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ForceDetailData forceDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) forceDetailData.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, forceDetailData.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) forceDetailData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, forceDetailData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) forceDetailData.bkPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, forceDetailData.bkPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) forceDetailData.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, forceDetailData.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) forceDetailData.bkLoss, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, forceDetailData.bkLoss);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) forceDetailData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, forceDetailData.ccy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) forceDetailData.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, forceDetailData.ts);
    }

    public ForceDetailData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.side = str;
        this.posSide = str2;
        this.bkPx = str3;
        this.sz = str4;
        this.bkLoss = str5;
        this.ccy = str6;
        this.ts = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.unify_trade.biz.ForceDetailData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ForceDetailData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
