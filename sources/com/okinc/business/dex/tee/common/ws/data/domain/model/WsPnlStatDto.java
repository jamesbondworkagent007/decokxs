package com.okinc.business.dex.tee.common.ws.data.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WsPnlStatDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int buyCount;
    private final String buyUsdValue;
    private final String realizedPnLUsd;
    private final int sellCount;
    private final String sellUsdValue;
    private final String totalPnlUsd;
    private final String unRealizedPnLUsd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WsPnlStatDto() {
        this(0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WsPnlStatDto copy$default(WsPnlStatDto wsPnlStatDto, int i, String str, int i2, String str2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wsPnlStatDto.buyCount;
        }
        if ((i3 & 2) != 0) {
            str = wsPnlStatDto.buyUsdValue;
        }
        String str6 = str;
        if ((i3 & 4) != 0) {
            i2 = wsPnlStatDto.sellCount;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str2 = wsPnlStatDto.sellUsdValue;
        }
        String str7 = str2;
        if ((i3 & 16) != 0) {
            str3 = wsPnlStatDto.totalPnlUsd;
        }
        String str8 = str3;
        if ((i3 & 32) != 0) {
            str4 = wsPnlStatDto.realizedPnLUsd;
        }
        String str9 = str4;
        if ((i3 & 64) != 0) {
            str5 = wsPnlStatDto.unRealizedPnLUsd;
        }
        return wsPnlStatDto.copy(i, str6, i4, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.buyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.buyUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.sellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sellUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalPnlUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.realizedPnLUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.unRealizedPnLUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsPnlStatDto copy(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new WsPnlStatDto(i, str, i2, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsPnlStatDto)) {
            return false;
        }
        WsPnlStatDto wsPnlStatDto = (WsPnlStatDto) obj;
        return this.buyCount == wsPnlStatDto.buyCount && Intrinsics.EZpvd((Object) this.buyUsdValue, (Object) wsPnlStatDto.buyUsdValue) && this.sellCount == wsPnlStatDto.sellCount && Intrinsics.EZpvd((Object) this.sellUsdValue, (Object) wsPnlStatDto.sellUsdValue) && Intrinsics.EZpvd((Object) this.totalPnlUsd, (Object) wsPnlStatDto.totalPnlUsd) && Intrinsics.EZpvd((Object) this.realizedPnLUsd, (Object) wsPnlStatDto.realizedPnLUsd) && Intrinsics.EZpvd((Object) this.unRealizedPnLUsd, (Object) wsPnlStatDto.unRealizedPnLUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBuyCount() {
        return this.buyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyUsdValue() {
        return this.buyUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnLUsd() {
        return this.realizedPnLUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSellCount() {
        return this.sellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellUsdValue() {
        return this.sellUsdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlUsd() {
        return this.totalPnlUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnRealizedPnLUsd() {
        return this.unRealizedPnLUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.buyCount) * 31) + this.buyUsdValue.hashCode()) * 31) + Integer.hashCode(this.sellCount)) * 31) + this.sellUsdValue.hashCode()) * 31) + this.totalPnlUsd.hashCode()) * 31) + this.realizedPnLUsd.hashCode()) * 31) + this.unRealizedPnLUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WsPnlStatDto(buyCount=" + this.buyCount + ", buyUsdValue=" + this.buyUsdValue + ", sellCount=" + this.sellCount + ", sellUsdValue=" + this.sellUsdValue + ", totalPnlUsd=" + this.totalPnlUsd + ", realizedPnLUsd=" + this.realizedPnLUsd + ", unRealizedPnLUsd=" + this.unRealizedPnLUsd + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WsPnlStatDto> serializer() {
            return WsPnlStatDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WsPnlStatDto(int i, int i2, String str, int i3, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.buyCount = 0;
        } else {
            this.buyCount = i2;
        }
        if ((i & 2) == 0) {
            this.buyUsdValue = "";
        } else {
            this.buyUsdValue = str;
        }
        if ((i & 4) == 0) {
            this.sellCount = 0;
        } else {
            this.sellCount = i3;
        }
        if ((i & 8) == 0) {
            this.sellUsdValue = "";
        } else {
            this.sellUsdValue = str2;
        }
        if ((i & 16) == 0) {
            this.totalPnlUsd = "";
        } else {
            this.totalPnlUsd = str3;
        }
        if ((i & 32) == 0) {
            this.realizedPnLUsd = "";
        } else {
            this.realizedPnLUsd = str4;
        }
        if ((i & 64) == 0) {
            this.unRealizedPnLUsd = "";
        } else {
            this.unRealizedPnLUsd = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(WsPnlStatDto wsPnlStatDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || wsPnlStatDto.buyCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, wsPnlStatDto.buyCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) wsPnlStatDto.buyUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, wsPnlStatDto.buyUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || wsPnlStatDto.sellCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, wsPnlStatDto.sellCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) wsPnlStatDto.sellUsdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, wsPnlStatDto.sellUsdValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) wsPnlStatDto.totalPnlUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, wsPnlStatDto.totalPnlUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) wsPnlStatDto.realizedPnLUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, wsPnlStatDto.realizedPnLUsd);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) wsPnlStatDto.unRealizedPnLUsd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, wsPnlStatDto.unRealizedPnLUsd);
    }

    public WsPnlStatDto(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.buyCount = i;
        this.buyUsdValue = str;
        this.sellCount = i2;
        this.sellUsdValue = str2;
        this.totalPnlUsd = str3;
        this.realizedPnLUsd = str4;
        this.unRealizedPnLUsd = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r9v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:102) call: com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto.<init>(int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WsPnlStatDto(int i, String str, int i2, String str2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5);
    }
}
