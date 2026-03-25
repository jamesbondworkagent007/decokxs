package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BridgeRedeemCallDataMultiTx {
    public static final int $stable = 0;
    private final String accountLength;
    private final String bizType;
    private final String data;
    private final String from;
    private final String life;
    private final String to;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BridgeRedeemCallDataMultiTx() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BridgeRedeemCallDataMultiTx copy$default(BridgeRedeemCallDataMultiTx bridgeRedeemCallDataMultiTx, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bridgeRedeemCallDataMultiTx.data;
        }
        if ((i & 2) != 0) {
            str2 = bridgeRedeemCallDataMultiTx.bizType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = bridgeRedeemCallDataMultiTx.life;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = bridgeRedeemCallDataMultiTx.from;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = bridgeRedeemCallDataMultiTx.to;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = bridgeRedeemCallDataMultiTx.accountLength;
        }
        return bridgeRedeemCallDataMultiTx.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.life;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.accountLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeRedeemCallDataMultiTx copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new BridgeRedeemCallDataMultiTx(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeRedeemCallDataMultiTx)) {
            return false;
        }
        BridgeRedeemCallDataMultiTx bridgeRedeemCallDataMultiTx = (BridgeRedeemCallDataMultiTx) obj;
        return Intrinsics.EZpvd((Object) this.data, (Object) bridgeRedeemCallDataMultiTx.data) && Intrinsics.EZpvd((Object) this.bizType, (Object) bridgeRedeemCallDataMultiTx.bizType) && Intrinsics.EZpvd((Object) this.life, (Object) bridgeRedeemCallDataMultiTx.life) && Intrinsics.EZpvd((Object) this.from, (Object) bridgeRedeemCallDataMultiTx.from) && Intrinsics.EZpvd((Object) this.to, (Object) bridgeRedeemCallDataMultiTx.to) && Intrinsics.EZpvd((Object) this.accountLength, (Object) bridgeRedeemCallDataMultiTx.accountLength);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountLength() {
        return this.accountLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLife() {
        return this.life;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.data.hashCode() * 31) + this.bizType.hashCode()) * 31) + this.life.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.accountLength.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BridgeRedeemCallDataMultiTx(data=" + this.data + ", bizType=" + this.bizType + ", life=" + this.life + ", from=" + this.from + ", to=" + this.to + ", accountLength=" + this.accountLength + ")";
    }

    public BridgeRedeemCallDataMultiTx(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.data = str;
        this.bizType = str2;
        this.life = str3;
        this.from = str4;
        this.to = str5;
        this.accountLength = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.business.dexlogic.bean.BridgeRedeemCallDataMultiTx.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BridgeRedeemCallDataMultiTx(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
