package com.okinc.unify_trade.biz;

import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class InterestLimitData {
    private final String debt;
    private final String interest;
    private final String loanAlloc;
    private final String nextDiscountMs;
    private final String nextInterestMs;
    private final List<LimitRecordData> records;
    private String stgyType;
    private boolean subAccountHasDnaBorrow;
    private final String subAcct;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(LimitRecordData$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterestLimitData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.subAcct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.debt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.loanAlloc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nextInterestMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nextDiscountMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LimitRecordData> component7() {
        return this.records;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.stgyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.subAccountHasDnaBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterestLimitData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<LimitRecordData> list, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InterestLimitData(str, str2, str3, str4, str5, str6, list, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterestLimitData)) {
            return false;
        }
        InterestLimitData interestLimitData = (InterestLimitData) obj;
        return Intrinsics.EZpvd((Object) this.subAcct, (Object) interestLimitData.subAcct) && Intrinsics.EZpvd((Object) this.debt, (Object) interestLimitData.debt) && Intrinsics.EZpvd((Object) this.loanAlloc, (Object) interestLimitData.loanAlloc) && Intrinsics.EZpvd((Object) this.interest, (Object) interestLimitData.interest) && Intrinsics.EZpvd((Object) this.nextInterestMs, (Object) interestLimitData.nextInterestMs) && Intrinsics.EZpvd((Object) this.nextDiscountMs, (Object) interestLimitData.nextDiscountMs) && Intrinsics.EZpvd(this.records, interestLimitData.records) && Intrinsics.EZpvd((Object) this.stgyType, (Object) interestLimitData.stgyType) && this.subAccountHasDnaBorrow == interestLimitData.subAccountHasDnaBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebt() {
        return this.debt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterest() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoanAlloc() {
        return this.loanAlloc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextDiscountMs() {
        return this.nextDiscountMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextInterestMs() {
        return this.nextInterestMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LimitRecordData> getRecords() {
        return this.records;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyType() {
        return this.stgyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSubAccountHasDnaBorrow() {
        return this.subAccountHasDnaBorrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubAcct() {
        return this.subAcct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.subAcct.hashCode() * 31) + this.debt.hashCode()) * 31) + this.loanAlloc.hashCode()) * 31) + this.interest.hashCode()) * 31) + this.nextInterestMs.hashCode()) * 31) + this.nextDiscountMs.hashCode()) * 31) + this.records.hashCode()) * 31) + this.stgyType.hashCode()) * 31) + Boolean.hashCode(this.subAccountHasDnaBorrow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubAccountHasDnaBorrow(boolean z) {
        this.subAccountHasDnaBorrow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InterestLimitData(subAcct=" + this.subAcct + ", debt=" + this.debt + ", loanAlloc=" + this.loanAlloc + ", interest=" + this.interest + ", nextInterestMs=" + this.nextInterestMs + ", nextDiscountMs=" + this.nextDiscountMs + ", records=" + this.records + ", stgyType=" + this.stgyType + ", subAccountHasDnaBorrow=" + this.subAccountHasDnaBorrow + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InterestLimitData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InterestLimitData> serializer() {
            return InterestLimitData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InterestLimitData(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.subAcct = "";
        } else {
            this.subAcct = str;
        }
        if ((i & 2) == 0) {
            this.debt = "";
        } else {
            this.debt = str2;
        }
        if ((i & 4) == 0) {
            this.loanAlloc = "";
        } else {
            this.loanAlloc = str3;
        }
        if ((i & 8) == 0) {
            this.interest = "";
        } else {
            this.interest = str4;
        }
        if ((i & 16) == 0) {
            this.nextInterestMs = "";
        } else {
            this.nextInterestMs = str5;
        }
        if ((i & 32) == 0) {
            this.nextDiscountMs = "";
        } else {
            this.nextDiscountMs = str6;
        }
        if ((i & 64) == 0) {
            this.records = new ArrayList();
        } else {
            this.records = list;
        }
        if ((i & 128) == 0) {
            this.stgyType = "";
        } else {
            this.stgyType = str7;
        }
        if ((i & 256) == 0) {
            this.subAccountHasDnaBorrow = false;
        } else {
            this.subAccountHasDnaBorrow = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InterestLimitData interestLimitData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) interestLimitData.subAcct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, interestLimitData.subAcct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) interestLimitData.debt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, interestLimitData.debt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) interestLimitData.loanAlloc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, interestLimitData.loanAlloc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) interestLimitData.interest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, interestLimitData.interest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) interestLimitData.nextInterestMs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, interestLimitData.nextInterestMs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) interestLimitData.nextDiscountMs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, interestLimitData.nextDiscountMs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(interestLimitData.records, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], interestLimitData.records);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) interestLimitData.stgyType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, interestLimitData.stgyType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || interestLimitData.subAccountHasDnaBorrow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, interestLimitData.subAccountHasDnaBorrow);
        }
    }

    public InterestLimitData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<LimitRecordData> list, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.subAcct = str;
        this.debt = str2;
        this.loanAlloc = str3;
        this.interest = str4;
        this.nextInterestMs = str5;
        this.nextDiscountMs = str6;
        this.records = list;
        this.stgyType = str7;
        this.subAccountHasDnaBorrow = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0059: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:104) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r17v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.LimitRecordData>, java.lang.String, boolean):void (m)] (LINE:97) call: com.okinc.unify_trade.biz.InterestLimitData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ InterestLimitData(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? new ArrayList() : list, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? false : z);
    }
}
