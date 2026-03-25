package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TotalTokensData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int fallNum;
    public final int flatNum;
    public final int riseNum;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TotalTokensData() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TotalTokensData copy$default(TotalTokensData totalTokensData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = totalTokensData.fallNum;
        }
        if ((i4 & 2) != 0) {
            i2 = totalTokensData.flatNum;
        }
        if ((i4 & 4) != 0) {
            i3 = totalTokensData.riseNum;
        }
        return totalTokensData.AEQbTJ(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.fallNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TotalTokensData AEQbTJ(int i, int i2, int i3) {
        return new TotalTokensData(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.flatNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.riseNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalTokensData)) {
            return false;
        }
        TotalTokensData totalTokensData = (TotalTokensData) obj;
        return this.fallNum == totalTokensData.fallNum && this.flatNum == totalTokensData.flatNum && this.riseNum == totalTokensData.riseNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.fallNum) * 31) + Integer.hashCode(this.flatNum)) * 31) + Integer.hashCode(this.riseNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TotalTokensData(fallNum=" + this.fallNum + ", flatNum=" + this.flatNum + ", riseNum=" + this.riseNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.TotalTokensData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TotalTokensData> serializer() {
            return TotalTokensData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TotalTokensData(int i, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fallNum = 0;
        } else {
            this.fallNum = i2;
        }
        if ((i & 2) == 0) {
            this.flatNum = 0;
        } else {
            this.flatNum = i3;
        }
        if ((i & 4) == 0) {
            this.riseNum = 0;
        } else {
            this.riseNum = i4;
        }
    }

    public static final /* synthetic */ void AEQbTJ(TotalTokensData totalTokensData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || totalTokensData.fallNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, totalTokensData.fallNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || totalTokensData.flatNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, totalTokensData.flatNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && totalTokensData.riseNum == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, totalTokensData.riseNum);
    }

    public TotalTokensData(int i, int i2, int i3) {
        this.fallNum = i;
        this.flatNum = i2;
        this.riseNum = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(int, int, int):void (m)] (LINE:30) call: com.okinc.business.market.data.model.TotalTokensData.<init>(int, int, int):void type: THIS */
    public /* synthetic */ TotalTokensData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
