package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SpotBorrowRepayHistoryResp {
    private String accBorrowed;
    private String amt;
    private String ccy;
    private String side;
    private String ts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotBorrowRepayHistoryResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotBorrowRepayHistoryResp copy$default(SpotBorrowRepayHistoryResp spotBorrowRepayHistoryResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotBorrowRepayHistoryResp.ccy;
        }
        if ((i & 2) != 0) {
            str2 = spotBorrowRepayHistoryResp.amt;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = spotBorrowRepayHistoryResp.accBorrowed;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = spotBorrowRepayHistoryResp.ts;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = spotBorrowRepayHistoryResp.side;
        }
        return spotBorrowRepayHistoryResp.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accBorrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotBorrowRepayHistoryResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SpotBorrowRepayHistoryResp(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotBorrowRepayHistoryResp)) {
            return false;
        }
        SpotBorrowRepayHistoryResp spotBorrowRepayHistoryResp = (SpotBorrowRepayHistoryResp) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) spotBorrowRepayHistoryResp.ccy) && Intrinsics.EZpvd((Object) this.amt, (Object) spotBorrowRepayHistoryResp.amt) && Intrinsics.EZpvd((Object) this.accBorrowed, (Object) spotBorrowRepayHistoryResp.accBorrowed) && Intrinsics.EZpvd((Object) this.ts, (Object) spotBorrowRepayHistoryResp.ts) && Intrinsics.EZpvd((Object) this.side, (Object) spotBorrowRepayHistoryResp.side);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccBorrowed() {
        return this.accBorrowed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.ccy.hashCode() * 31) + this.amt.hashCode()) * 31) + this.accBorrowed.hashCode()) * 31) + this.ts.hashCode()) * 31) + this.side.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccBorrowed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accBorrowed = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotBorrowRepayHistoryResp(ccy=" + this.ccy + ", amt=" + this.amt + ", accBorrowed=" + this.accBorrowed + ", ts=" + this.ts + ", side=" + this.side + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotBorrowRepayHistoryResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotBorrowRepayHistoryResp> serializer() {
            return SpotBorrowRepayHistoryResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotBorrowRepayHistoryResp(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.amt = "";
        } else {
            this.amt = str2;
        }
        if ((i & 4) == 0) {
            this.accBorrowed = "";
        } else {
            this.accBorrowed = str3;
        }
        if ((i & 8) == 0) {
            this.ts = "";
        } else {
            this.ts = str4;
        }
        if ((i & 16) == 0) {
            this.side = "";
        } else {
            this.side = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotBorrowRepayHistoryResp spotBorrowRepayHistoryResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) spotBorrowRepayHistoryResp.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, spotBorrowRepayHistoryResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotBorrowRepayHistoryResp.amt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotBorrowRepayHistoryResp.amt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotBorrowRepayHistoryResp.accBorrowed, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotBorrowRepayHistoryResp.accBorrowed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotBorrowRepayHistoryResp.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotBorrowRepayHistoryResp.ts);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) spotBorrowRepayHistoryResp.side, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, spotBorrowRepayHistoryResp.side);
    }

    public SpotBorrowRepayHistoryResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.ccy = str;
        this.amt = str2;
        this.accBorrowed = str3;
        this.ts = str4;
        this.side = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2729) call: com.okinc.unify_trade.biz.SpotBorrowRepayHistoryResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotBorrowRepayHistoryResp(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
