package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class QueryMarginInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String balanceAmount;
    private final String borrowAmount;
    private final String curMaxAmount;
    private final String existOrd;
    private final String lever;
    private final String liqPx;
    private final String maxAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QueryMarginInfo copy$default(QueryMarginInfo queryMarginInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryMarginInfo.maxAmount;
        }
        if ((i & 2) != 0) {
            str2 = queryMarginInfo.liqPx;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = queryMarginInfo.lever;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = queryMarginInfo.existOrd;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = queryMarginInfo.curMaxAmount;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = queryMarginInfo.balanceAmount;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = queryMarginInfo.borrowAmount;
        }
        return queryMarginInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.existOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.curMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.balanceAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.borrowAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QueryMarginInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new QueryMarginInfo(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryMarginInfo)) {
            return false;
        }
        QueryMarginInfo queryMarginInfo = (QueryMarginInfo) obj;
        return Intrinsics.EZpvd((Object) this.maxAmount, (Object) queryMarginInfo.maxAmount) && Intrinsics.EZpvd((Object) this.liqPx, (Object) queryMarginInfo.liqPx) && Intrinsics.EZpvd((Object) this.lever, (Object) queryMarginInfo.lever) && Intrinsics.EZpvd((Object) this.existOrd, (Object) queryMarginInfo.existOrd) && Intrinsics.EZpvd((Object) this.curMaxAmount, (Object) queryMarginInfo.curMaxAmount) && Intrinsics.EZpvd((Object) this.balanceAmount, (Object) queryMarginInfo.balanceAmount) && Intrinsics.EZpvd((Object) this.borrowAmount, (Object) queryMarginInfo.borrowAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceAmount() {
        return this.balanceAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowAmount() {
        return this.borrowAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurMaxAmount() {
        return this.curMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExistOrd() {
        return this.existOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.maxAmount.hashCode() * 31) + this.liqPx.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.existOrd.hashCode()) * 31) + this.curMaxAmount.hashCode()) * 31) + this.balanceAmount.hashCode()) * 31) + this.borrowAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QueryMarginInfo(maxAmount=" + this.maxAmount + ", liqPx=" + this.liqPx + ", lever=" + this.lever + ", existOrd=" + this.existOrd + ", curMaxAmount=" + this.curMaxAmount + ", balanceAmount=" + this.balanceAmount + ", borrowAmount=" + this.borrowAmount + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.QueryMarginInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QueryMarginInfo> serializer() {
            return QueryMarginInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QueryMarginInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (96 != (i & 96)) {
            PluginExceptionsKt.throwMissingFieldException(i, 96, QueryMarginInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.maxAmount = "";
        } else {
            this.maxAmount = str;
        }
        if ((i & 2) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str2;
        }
        if ((i & 4) == 0) {
            this.lever = "";
        } else {
            this.lever = str3;
        }
        if ((i & 8) == 0) {
            this.existOrd = "";
        } else {
            this.existOrd = str4;
        }
        if ((i & 16) == 0) {
            this.curMaxAmount = "";
        } else {
            this.curMaxAmount = str5;
        }
        this.balanceAmount = str6;
        this.borrowAmount = str7;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(QueryMarginInfo queryMarginInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) queryMarginInfo.maxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, queryMarginInfo.maxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) queryMarginInfo.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, queryMarginInfo.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) queryMarginInfo.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, queryMarginInfo.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) queryMarginInfo.existOrd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, queryMarginInfo.existOrd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) queryMarginInfo.curMaxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, queryMarginInfo.curMaxAmount);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, queryMarginInfo.balanceAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, queryMarginInfo.borrowAmount);
    }

    public QueryMarginInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.maxAmount = str;
        this.liqPx = str2;
        this.lever = str3;
        this.existOrd = str4;
        this.curMaxAmount = str5;
        this.balanceAmount = str6;
        this.borrowAmount = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:851) call: com.okinc.unify_trade.biz.QueryMarginInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ QueryMarginInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, str6, str7);
    }
}
