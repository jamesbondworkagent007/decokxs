package com.okinc.assets.backend.api.model.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class TransferBalanceReq {
    private String subAccount;
    private int transferFrom;
    private String valuationUnit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferBalanceReq() {
        this(0, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransferBalanceReq copy$default(TransferBalanceReq transferBalanceReq, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transferBalanceReq.transferFrom;
        }
        if ((i2 & 2) != 0) {
            str = transferBalanceReq.valuationUnit;
        }
        if ((i2 & 4) != 0) {
            str2 = transferBalanceReq.subAccount;
        }
        return transferBalanceReq.copy(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.transferFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferBalanceReq copy(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TransferBalanceReq(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferBalanceReq)) {
            return false;
        }
        TransferBalanceReq transferBalanceReq = (TransferBalanceReq) obj;
        return this.transferFrom == transferBalanceReq.transferFrom && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) transferBalanceReq.valuationUnit) && Intrinsics.EZpvd((Object) this.subAccount, (Object) transferBalanceReq.subAccount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubAccount() {
        return this.subAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransferFrom() {
        return this.transferFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.transferFrom) * 31) + this.valuationUnit.hashCode()) * 31) + this.subAccount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubAccount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subAccount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferFrom(int i) {
        this.transferFrom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuationUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferBalanceReq(transferFrom=" + this.transferFrom + ", valuationUnit=" + this.valuationUnit + ", subAccount=" + this.subAccount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.transfer.TransferBalanceReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransferBalanceReq> serializer() {
            return TransferBalanceReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransferBalanceReq(int i, int i2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.transferFrom = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.valuationUnit = "";
        } else {
            this.valuationUnit = str;
        }
        if ((i & 4) == 0) {
            this.subAccount = "";
        } else {
            this.subAccount = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(TransferBalanceReq transferBalanceReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transferBalanceReq.transferFrom != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, transferBalanceReq.transferFrom);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transferBalanceReq.valuationUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transferBalanceReq.valuationUnit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) transferBalanceReq.subAccount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, transferBalanceReq.subAccount);
    }

    public TransferBalanceReq(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.transferFrom = i;
        this.valuationUnit = str;
        this.subAccount = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.transfer.TransferBalanceReq.<init>(int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransferBalanceReq(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
