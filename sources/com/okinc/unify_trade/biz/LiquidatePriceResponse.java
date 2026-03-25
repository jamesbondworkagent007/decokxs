package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class LiquidatePriceResponse {
    private boolean liqPriceCheck;
    private String longLiqDoubt;
    private String longLiqPx;
    private String longLiqTitle;
    private String shortLiqDoubt;
    private String shortLiqPx;
    private String shortLiqTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidatePriceResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiquidatePriceResponse copy$default(LiquidatePriceResponse liquidatePriceResponse, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liquidatePriceResponse.longLiqPx;
        }
        if ((i & 2) != 0) {
            str2 = liquidatePriceResponse.shortLiqPx;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = liquidatePriceResponse.longLiqTitle;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = liquidatePriceResponse.shortLiqTitle;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = liquidatePriceResponse.longLiqDoubt;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = liquidatePriceResponse.shortLiqDoubt;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            z = liquidatePriceResponse.liqPriceCheck;
        }
        return liquidatePriceResponse.copy(str, str7, str8, str9, str10, str11, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.longLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.shortLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.longLiqTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.shortLiqTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.longLiqDoubt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.shortLiqDoubt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.liqPriceCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidatePriceResponse copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        return new LiquidatePriceResponse(str, str2, str3, str4, str5, str6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiquidatePriceResponse)) {
            return false;
        }
        LiquidatePriceResponse liquidatePriceResponse = (LiquidatePriceResponse) obj;
        return Intrinsics.EZpvd((Object) this.longLiqPx, (Object) liquidatePriceResponse.longLiqPx) && Intrinsics.EZpvd((Object) this.shortLiqPx, (Object) liquidatePriceResponse.shortLiqPx) && Intrinsics.EZpvd((Object) this.longLiqTitle, (Object) liquidatePriceResponse.longLiqTitle) && Intrinsics.EZpvd((Object) this.shortLiqTitle, (Object) liquidatePriceResponse.shortLiqTitle) && Intrinsics.EZpvd((Object) this.longLiqDoubt, (Object) liquidatePriceResponse.longLiqDoubt) && Intrinsics.EZpvd((Object) this.shortLiqDoubt, (Object) liquidatePriceResponse.shortLiqDoubt) && this.liqPriceCheck == liquidatePriceResponse.liqPriceCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLiqPriceCheck() {
        return this.liqPriceCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongLiqDoubt() {
        return this.longLiqDoubt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongLiqPx() {
        return this.longLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongLiqTitle() {
        return this.longLiqTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLiqDoubt() {
        return this.shortLiqDoubt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLiqPx() {
        return this.shortLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortLiqTitle() {
        return this.shortLiqTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.longLiqPx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.shortLiqPx;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.longLiqTitle;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.shortLiqTitle;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.longLiqDoubt;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.shortLiqDoubt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.liqPriceCheck);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPriceCheck(boolean z) {
        this.liqPriceCheck = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongLiqDoubt(String str) {
        this.longLiqDoubt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongLiqPx(String str) {
        this.longLiqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongLiqTitle(String str) {
        this.longLiqTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortLiqDoubt(String str) {
        this.shortLiqDoubt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortLiqPx(String str) {
        this.shortLiqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortLiqTitle(String str) {
        this.shortLiqTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidatePriceResponse(longLiqPx=" + this.longLiqPx + ", shortLiqPx=" + this.shortLiqPx + ", longLiqTitle=" + this.longLiqTitle + ", shortLiqTitle=" + this.shortLiqTitle + ", longLiqDoubt=" + this.longLiqDoubt + ", shortLiqDoubt=" + this.shortLiqDoubt + ", liqPriceCheck=" + this.liqPriceCheck + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LiquidatePriceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidatePriceResponse> serializer() {
            return LiquidatePriceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidatePriceResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.longLiqPx = null;
        } else {
            this.longLiqPx = str;
        }
        if ((i & 2) == 0) {
            this.shortLiqPx = null;
        } else {
            this.shortLiqPx = str2;
        }
        if ((i & 4) == 0) {
            this.longLiqTitle = null;
        } else {
            this.longLiqTitle = str3;
        }
        if ((i & 8) == 0) {
            this.shortLiqTitle = null;
        } else {
            this.shortLiqTitle = str4;
        }
        if ((i & 16) == 0) {
            this.longLiqDoubt = null;
        } else {
            this.longLiqDoubt = str5;
        }
        if ((i & 32) == 0) {
            this.shortLiqDoubt = null;
        } else {
            this.shortLiqDoubt = str6;
        }
        if ((i & 64) == 0) {
            this.liqPriceCheck = true;
        } else {
            this.liqPriceCheck = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LiquidatePriceResponse liquidatePriceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || liquidatePriceResponse.longLiqPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, liquidatePriceResponse.longLiqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || liquidatePriceResponse.shortLiqPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, liquidatePriceResponse.shortLiqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || liquidatePriceResponse.longLiqTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, liquidatePriceResponse.longLiqTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || liquidatePriceResponse.shortLiqTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, liquidatePriceResponse.shortLiqTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || liquidatePriceResponse.longLiqDoubt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, liquidatePriceResponse.longLiqDoubt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || liquidatePriceResponse.shortLiqDoubt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, liquidatePriceResponse.shortLiqDoubt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && liquidatePriceResponse.liqPriceCheck) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, liquidatePriceResponse.liqPriceCheck);
    }

    public LiquidatePriceResponse(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.longLiqPx = str;
        this.shortLiqPx = str2;
        this.longLiqTitle = str3;
        this.shortLiqTitle = str4;
        this.longLiqDoubt = str5;
        this.shortLiqDoubt = str6;
        this.liqPriceCheck = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:1178) call: com.okinc.unify_trade.biz.LiquidatePriceResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ LiquidatePriceResponse(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null, (i & 64) != 0 ? true : z);
    }
}
