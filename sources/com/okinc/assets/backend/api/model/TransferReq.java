package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class TransferReq {
    private final String amount;
    private final String currencyId;
    private boolean invalidAsset;
    private final Boolean loanTrans;
    private final Boolean masterOut;
    private Boolean omitPosRisk;
    private final Integer productId;
    private final int rateId;
    private final String subAccount;
    private final Integer toProductId;
    private final int transferFrom;
    private final int transferTo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferReq() {
        this((String) null, (String) null, (Boolean) null, (Integer) null, 0, (String) null, (Integer) null, 0, 0, (Boolean) null, (Boolean) null, false, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.loanTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.omitPosRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.masterOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.rateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.toProductId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.transferFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.transferTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferReq copy(@NotNull String str, @NotNull String str2, Boolean bool, Integer num, int i, String str3, Integer num2, int i2, int i3, Boolean bool2, Boolean bool3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransferReq(str, str2, bool, num, i, str3, num2, i2, i3, bool2, bool3, z);
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
        return Intrinsics.EZpvd((Object) this.amount, (Object) transferReq.amount) && Intrinsics.EZpvd((Object) this.currencyId, (Object) transferReq.currencyId) && Intrinsics.EZpvd(this.masterOut, transferReq.masterOut) && Intrinsics.EZpvd(this.productId, transferReq.productId) && this.rateId == transferReq.rateId && Intrinsics.EZpvd((Object) this.subAccount, (Object) transferReq.subAccount) && Intrinsics.EZpvd(this.toProductId, transferReq.toProductId) && this.transferFrom == transferReq.transferFrom && this.transferTo == transferReq.transferTo && Intrinsics.EZpvd(this.loanTrans, transferReq.loanTrans) && Intrinsics.EZpvd(this.omitPosRisk, transferReq.omitPosRisk) && this.invalidAsset == transferReq.invalidAsset;
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
    public final boolean getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLoanTrans() {
        return this.loanTrans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getMasterOut() {
        return this.masterOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOmitPosRisk() {
        return this.omitPosRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProductId() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRateId() {
        return this.rateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubAccount() {
        return this.subAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getToProductId() {
        return this.toProductId;
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
        Boolean bool = this.masterOut;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Integer num = this.productId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = Integer.hashCode(this.rateId);
        String str = this.subAccount;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Integer num2 = this.toProductId;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        int iHashCode8 = Integer.hashCode(this.transferFrom);
        int iHashCode9 = Integer.hashCode(this.transferTo);
        Boolean bool2 = this.loanTrans;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.omitPosRisk;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (bool3 != null ? bool3.hashCode() : 0)) * 31) + Boolean.hashCode(this.invalidAsset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvalidAsset(boolean z) {
        this.invalidAsset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOmitPosRisk(Boolean bool) {
        this.omitPosRisk = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferReq(amount=" + this.amount + ", currencyId=" + this.currencyId + ", masterOut=" + this.masterOut + ", productId=" + this.productId + ", rateId=" + this.rateId + ", subAccount=" + this.subAccount + ", toProductId=" + this.toProductId + ", transferFrom=" + this.transferFrom + ", transferTo=" + this.transferTo + ", loanTrans=" + this.loanTrans + ", omitPosRisk=" + this.omitPosRisk + ", invalidAsset=" + this.invalidAsset + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.TransferReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransferReq> serializer() {
            return TransferReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransferReq(int i, String str, String str2, Boolean bool, Integer num, int i2, String str3, Integer num2, int i3, int i4, Boolean bool2, Boolean bool3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.amount = (i & 1) == 0 ? "4.9E-324" : str;
        if ((i & 2) == 0) {
            this.currencyId = C33129mqd.AYXKKw(Integer.MIN_VALUE);
        } else {
            this.currencyId = str2;
        }
        if ((i & 4) == 0) {
            this.masterOut = null;
        } else {
            this.masterOut = bool;
        }
        if ((i & 8) == 0) {
            this.productId = null;
        } else {
            this.productId = num;
        }
        if ((i & 16) == 0) {
            this.rateId = Integer.MIN_VALUE;
        } else {
            this.rateId = i2;
        }
        if ((i & 32) == 0) {
            this.subAccount = null;
        } else {
            this.subAccount = str3;
        }
        if ((i & 64) == 0) {
            this.toProductId = null;
        } else {
            this.toProductId = num2;
        }
        if ((i & 128) == 0) {
            this.transferFrom = Integer.MIN_VALUE;
        } else {
            this.transferFrom = i3;
        }
        if ((i & 256) == 0) {
            this.transferTo = Integer.MIN_VALUE;
        } else {
            this.transferTo = i4;
        }
        if ((i & 512) == 0) {
            this.loanTrans = null;
        } else {
            this.loanTrans = bool2;
        }
        if ((i & 1024) == 0) {
            this.omitPosRisk = null;
        } else {
            this.omitPosRisk = bool3;
        }
        if ((i & 2048) == 0) {
            this.invalidAsset = false;
        } else {
            this.invalidAsset = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(TransferReq transferReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) transferReq.amount, (Object) "4.9E-324")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, transferReq.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transferReq.currencyId, (Object) C33129mqd.AYXKKw(Integer.MIN_VALUE))) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transferReq.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transferReq.masterOut != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, transferReq.masterOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || transferReq.productId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, transferReq.productId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || transferReq.rateId != Integer.MIN_VALUE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, transferReq.rateId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transferReq.subAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, transferReq.subAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || transferReq.toProductId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, transferReq.toProductId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || transferReq.transferFrom != Integer.MIN_VALUE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, transferReq.transferFrom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || transferReq.transferTo != Integer.MIN_VALUE) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, transferReq.transferTo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || transferReq.loanTrans != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, transferReq.loanTrans);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || transferReq.omitPosRisk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, transferReq.omitPosRisk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || transferReq.invalidAsset) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, transferReq.invalidAsset);
        }
    }

    public TransferReq(@NotNull String str, @NotNull String str2, Boolean bool, Integer num, int i, String str3, Integer num2, int i2, int i3, Boolean bool2, Boolean bool3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.currencyId = str2;
        this.masterOut = bool;
        this.productId = num;
        this.rateId = i;
        this.subAccount = str3;
        this.toProductId = num2;
        this.transferFrom = i2;
        this.transferTo = i3;
        this.loanTrans = bool2;
        this.omitPosRisk = bool3;
        this.invalidAsset = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0081: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("4.9E-324") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: INVOKE (Integer.MIN_VALUE int) STATIC call: o.mqd.AYXKKw(java.lang.Object):java.lang.String A[MD:(java.lang.Object):java.lang.String (m), WRAPPED] (LINE:279)) : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r18v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r20v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0043: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (Integer.MIN_VALUE int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004b: ARITH (r26v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r22v0 int) : (Integer.MIN_VALUE int))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.Boolean) : (null java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0061: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, int, java.lang.String, java.lang.Integer, int, int, java.lang.Boolean, java.lang.Boolean, boolean):void (m)] (LINE:277) call: com.okinc.assets.backend.api.model.TransferReq.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, int, java.lang.String, java.lang.Integer, int, int, java.lang.Boolean, java.lang.Boolean, boolean):void type: THIS */
    public /* synthetic */ TransferReq(String str, String str2, Boolean bool, Integer num, int i, String str3, Integer num2, int i2, int i3, Boolean bool2, Boolean bool3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "4.9E-324" : str, (i4 & 2) != 0 ? C33129mqd.AYXKKw(Integer.MIN_VALUE) : str2, (i4 & 4) != 0 ? null : bool, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? Integer.MIN_VALUE : i, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : num2, (i4 & 128) != 0 ? Integer.MIN_VALUE : i2, (i4 & 256) == 0 ? i3 : Integer.MIN_VALUE, (i4 & 512) != 0 ? null : bool2, (i4 & 1024) == 0 ? bool3 : null, (i4 & 2048) != 0 ? false : z);
    }
}
