package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TransferReq {
    private final String amount;
    private final String currencyId;
    private final Boolean loanTrans;
    private Boolean omitPosRisk;
    private final int transferFrom;
    private final int transferTo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferReq() {
        this((String) null, (String) null, 0, 0, (Boolean) null, (Boolean) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransferReq copy$default(TransferReq transferReq, String str, String str2, int i, int i2, Boolean bool, Boolean bool2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = transferReq.amount;
        }
        if ((i3 & 2) != 0) {
            str2 = transferReq.currencyId;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = transferReq.transferFrom;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = transferReq.transferTo;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            bool = transferReq.loanTrans;
        }
        Boolean bool3 = bool;
        if ((i3 & 32) != 0) {
            bool2 = transferReq.omitPosRisk;
        }
        return transferReq.copy(str, str3, i4, i5, bool3, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.transferFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.transferTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.loanTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.omitPosRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferReq copy(@NotNull String str, @NotNull String str2, int i, int i2, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransferReq(str, str2, i, i2, bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferReq)) {
            return false;
        }
        TransferReq transferReq = (TransferReq) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) transferReq.amount) && Intrinsics.EZpvd((Object) this.currencyId, (Object) transferReq.currencyId) && this.transferFrom == transferReq.transferFrom && this.transferTo == transferReq.transferTo && Intrinsics.EZpvd(this.loanTrans, transferReq.loanTrans) && Intrinsics.EZpvd(this.omitPosRisk, transferReq.omitPosRisk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLoanTrans() {
        return this.loanTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOmitPosRisk() {
        return this.omitPosRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransferFrom() {
        return this.transferFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransferTo() {
        return this.transferTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        int iHashCode2 = this.currencyId.hashCode();
        int iHashCode3 = Integer.hashCode(this.transferFrom);
        int iHashCode4 = Integer.hashCode(this.transferTo);
        Boolean bool = this.loanTrans;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.omitPosRisk;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOmitPosRisk(Boolean bool) {
        this.omitPosRisk = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferReq(amount=" + this.amount + ", currencyId=" + this.currencyId + ", transferFrom=" + this.transferFrom + ", transferTo=" + this.transferTo + ", loanTrans=" + this.loanTrans + ", omitPosRisk=" + this.omitPosRisk + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TransferReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransferReq> serializer() {
            return TransferReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransferReq(int i, String str, String str2, int i2, int i3, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        this.amount = (i & 1) == 0 ? "4.9E-324" : str;
        if ((i & 2) == 0) {
            this.currencyId = C33129mqd.AYXKKw(Integer.MIN_VALUE);
        } else {
            this.currencyId = str2;
        }
        if ((i & 4) == 0) {
            this.transferFrom = Integer.MIN_VALUE;
        } else {
            this.transferFrom = i2;
        }
        if ((i & 8) == 0) {
            this.transferTo = Integer.MIN_VALUE;
        } else {
            this.transferTo = i3;
        }
        if ((i & 16) == 0) {
            this.loanTrans = null;
        } else {
            this.loanTrans = bool;
        }
        if ((i & 32) == 0) {
            this.omitPosRisk = null;
        } else {
            this.omitPosRisk = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TransferReq transferReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) transferReq.amount, (Object) "4.9E-324")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, transferReq.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transferReq.currencyId, (Object) C33129mqd.AYXKKw(Integer.MIN_VALUE))) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transferReq.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transferReq.transferFrom != Integer.MIN_VALUE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, transferReq.transferFrom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || transferReq.transferTo != Integer.MIN_VALUE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, transferReq.transferTo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || transferReq.loanTrans != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, transferReq.loanTrans);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && transferReq.omitPosRisk == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, transferReq.omitPosRisk);
    }

    public TransferReq(@NotNull String str, @NotNull String str2, int i, int i2, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.currencyId = str2;
        this.transferFrom = i;
        this.transferTo = i2;
        this.loanTrans = bool;
        this.omitPosRisk = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("4.9E-324") : (r5v0 java.lang.String))
  (wrap:java.lang.String:0x0014: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0010: INVOKE (Integer.MIN_VALUE int) STATIC call: o.mqd.AYXKKw(java.lang.Object):java.lang.String A[MD:(java.lang.Object):java.lang.String (m), WRAPPED] (LINE:4931)) : (r6v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 int) : (Integer.MIN_VALUE int))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r9v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, int, int, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:4929) call: com.okinc.unify_trade.biz.TransferReq.<init>(java.lang.String, java.lang.String, int, int, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TransferReq(String str, String str2, int i, int i2, Boolean bool, Boolean bool2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "4.9E-324" : str, (i3 & 2) != 0 ? C33129mqd.AYXKKw(Integer.MIN_VALUE) : str2, (i3 & 4) != 0 ? Integer.MIN_VALUE : i, (i3 & 8) == 0 ? i2 : Integer.MIN_VALUE, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : bool2);
    }
}
