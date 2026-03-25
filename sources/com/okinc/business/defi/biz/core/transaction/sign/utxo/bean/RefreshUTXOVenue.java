package com.okinc.business.defi.biz.core.transaction.sign.utxo.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class RefreshUTXOVenue {
    private int count;
    private final boolean isAssetChange;
    private final boolean isChangedAmtOrAddress;
    private final boolean isInitAsset;
    private final boolean isInitFee;
    private final boolean isLoop;
    private final boolean isModifyFee;
    private final boolean isSubmit;
    private final boolean updateCanTransferAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RefreshUTXOVenue() {
        this(false, false, false, false, false, false, false, false, 0, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isInitAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isInitFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSubmit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isLoop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isChangedAmtOrAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isAssetChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isModifyFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.updateCanTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RefreshUTXOVenue copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        return new RefreshUTXOVenue(z, z2, z3, z4, z5, z6, z7, z8, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshUTXOVenue)) {
            return false;
        }
        RefreshUTXOVenue refreshUTXOVenue = (RefreshUTXOVenue) obj;
        return this.isInitAsset == refreshUTXOVenue.isInitAsset && this.isInitFee == refreshUTXOVenue.isInitFee && this.isSubmit == refreshUTXOVenue.isSubmit && this.isLoop == refreshUTXOVenue.isLoop && this.isChangedAmtOrAddress == refreshUTXOVenue.isChangedAmtOrAddress && this.isAssetChange == refreshUTXOVenue.isAssetChange && this.isModifyFee == refreshUTXOVenue.isModifyFee && this.updateCanTransferAmount == refreshUTXOVenue.updateCanTransferAmount && this.count == refreshUTXOVenue.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUpdateCanTransferAmount() {
        return this.updateCanTransferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isInitAsset) * 31) + Boolean.hashCode(this.isInitFee)) * 31) + Boolean.hashCode(this.isSubmit)) * 31) + Boolean.hashCode(this.isLoop)) * 31) + Boolean.hashCode(this.isChangedAmtOrAddress)) * 31) + Boolean.hashCode(this.isAssetChange)) * 31) + Boolean.hashCode(this.isModifyFee)) * 31) + Boolean.hashCode(this.updateCanTransferAmount)) * 31) + Integer.hashCode(this.count);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAssetChange() {
        return this.isAssetChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isChangedAmtOrAddress() {
        return this.isChangedAmtOrAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInitAsset() {
        return this.isInitAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInitFee() {
        return this.isInitFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLoop() {
        return this.isLoop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isModifyFee() {
        return this.isModifyFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSubmit() {
        return this.isSubmit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCount(int i) {
        this.count = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RefreshUTXOVenue(isInitAsset=" + this.isInitAsset + ", isInitFee=" + this.isInitFee + ", isSubmit=" + this.isSubmit + ", isLoop=" + this.isLoop + ", isChangedAmtOrAddress=" + this.isChangedAmtOrAddress + ", isAssetChange=" + this.isAssetChange + ", isModifyFee=" + this.isModifyFee + ", updateCanTransferAmount=" + this.updateCanTransferAmount + ", count=" + this.count + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RefreshUTXOVenue> serializer() {
            return RefreshUTXOVenue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RefreshUTXOVenue(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isInitAsset = false;
        } else {
            this.isInitAsset = z;
        }
        if ((i & 2) == 0) {
            this.isInitFee = false;
        } else {
            this.isInitFee = z2;
        }
        if ((i & 4) == 0) {
            this.isSubmit = false;
        } else {
            this.isSubmit = z3;
        }
        if ((i & 8) == 0) {
            this.isLoop = false;
        } else {
            this.isLoop = z4;
        }
        if ((i & 16) == 0) {
            this.isChangedAmtOrAddress = false;
        } else {
            this.isChangedAmtOrAddress = z5;
        }
        if ((i & 32) == 0) {
            this.isAssetChange = false;
        } else {
            this.isAssetChange = z6;
        }
        if ((i & 64) == 0) {
            this.isModifyFee = false;
        } else {
            this.isModifyFee = z7;
        }
        if ((i & 128) == 0) {
            this.updateCanTransferAmount = false;
        } else {
            this.updateCanTransferAmount = z8;
        }
        if ((i & 256) == 0) {
            this.count = 1;
        } else {
            this.count = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RefreshUTXOVenue refreshUTXOVenue, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || refreshUTXOVenue.isInitAsset) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, refreshUTXOVenue.isInitAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || refreshUTXOVenue.isInitFee) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, refreshUTXOVenue.isInitFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || refreshUTXOVenue.isSubmit) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, refreshUTXOVenue.isSubmit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || refreshUTXOVenue.isLoop) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, refreshUTXOVenue.isLoop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || refreshUTXOVenue.isChangedAmtOrAddress) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, refreshUTXOVenue.isChangedAmtOrAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || refreshUTXOVenue.isAssetChange) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, refreshUTXOVenue.isAssetChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || refreshUTXOVenue.isModifyFee) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, refreshUTXOVenue.isModifyFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || refreshUTXOVenue.updateCanTransferAmount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, refreshUTXOVenue.updateCanTransferAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && refreshUTXOVenue.count == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 8, refreshUTXOVenue.count);
    }

    public RefreshUTXOVenue(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        this.isInitAsset = z;
        this.isInitFee = z2;
        this.isSubmit = z3;
        this.isLoop = z4;
        this.isChangedAmtOrAddress = z5;
        this.isAssetChange = z6;
        this.isModifyFee = z7;
        this.updateCanTransferAmount = z8;
        this.count = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : false)
  (wrap:int:?: TERNARY null = ((wrap:int:0x003d: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r19v0 int))
 A[MD:(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int):void (m)] (LINE:34) call: com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int):void type: THIS */
    public /* synthetic */ RefreshUTXOVenue(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6, (i2 & 64) != 0 ? false : z7, (i2 & 128) == 0 ? z8 : false, (i2 & 256) != 0 ? 1 : i);
    }
}
