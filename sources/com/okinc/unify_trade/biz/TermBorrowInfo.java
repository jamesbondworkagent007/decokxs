package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class TermBorrowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String borrowingAvailable;
    private final String term;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TermBorrowInfo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TermBorrowInfo copy$default(TermBorrowInfo termBorrowInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = termBorrowInfo.term;
        }
        if ((i & 2) != 0) {
            str2 = termBorrowInfo.borrowingAvailable;
        }
        return termBorrowInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.borrowingAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermBorrowInfo copy(String str, String str2) {
        return new TermBorrowInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermBorrowInfo)) {
            return false;
        }
        TermBorrowInfo termBorrowInfo = (TermBorrowInfo) obj;
        return Intrinsics.EZpvd((Object) this.term, (Object) termBorrowInfo.term) && Intrinsics.EZpvd((Object) this.borrowingAvailable, (Object) termBorrowInfo.borrowingAvailable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowingAvailable() {
        return this.borrowingAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTerm() {
        return this.term;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.term;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.borrowingAvailable;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TermBorrowInfo(term=" + this.term + ", borrowingAvailable=" + this.borrowingAvailable + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TermBorrowInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TermBorrowInfo> serializer() {
            return TermBorrowInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TermBorrowInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.term = null;
        } else {
            this.term = str;
        }
        if ((i & 2) == 0) {
            this.borrowingAvailable = null;
        } else {
            this.borrowingAvailable = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TermBorrowInfo termBorrowInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || termBorrowInfo.term != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, termBorrowInfo.term);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && termBorrowInfo.borrowingAvailable == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, termBorrowInfo.borrowingAvailable);
    }

    public TermBorrowInfo(String str, String str2) {
        this.term = str;
        this.borrowingAvailable = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.unify_trade.biz.TermBorrowInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TermBorrowInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
