package com.okinc.business.dex.tee.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class NumLimitData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String numDesc;
    private final int numLimit;
    private final int pendingNum;
    private final boolean showNumLimitDesc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NumLimitData copy$default(NumLimitData numLimitData, int i, int i2, boolean z, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = numLimitData.numLimit;
        }
        if ((i3 & 2) != 0) {
            i2 = numLimitData.pendingNum;
        }
        if ((i3 & 4) != 0) {
            z = numLimitData.showNumLimitDesc;
        }
        if ((i3 & 8) != 0) {
            str = numLimitData.numDesc;
        }
        return numLimitData.copy(i, i2, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.numLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pendingNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.showNumLimitDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.numDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NumLimitData copy(int i, int i2, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new NumLimitData(i, i2, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NumLimitData)) {
            return false;
        }
        NumLimitData numLimitData = (NumLimitData) obj;
        return this.numLimit == numLimitData.numLimit && this.pendingNum == numLimitData.pendingNum && this.showNumLimitDesc == numLimitData.showNumLimitDesc && Intrinsics.EZpvd((Object) this.numDesc, (Object) numLimitData.numDesc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNumDesc() {
        return this.numDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNumLimit() {
        return this.numLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPendingNum() {
        return this.pendingNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowNumLimitDesc() {
        return this.showNumLimitDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.numLimit) * 31) + Integer.hashCode(this.pendingNum)) * 31) + Boolean.hashCode(this.showNumLimitDesc)) * 31) + this.numDesc.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NumLimitData(numLimit=" + this.numLimit + ", pendingNum=" + this.pendingNum + ", showNumLimitDesc=" + this.showNumLimitDesc + ", numDesc=" + this.numDesc + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.NumLimitData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NumLimitData> serializer() {
            return NumLimitData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NumLimitData(int i, int i2, int i3, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, NumLimitData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.numLimit = 100;
        } else {
            this.numLimit = i2;
        }
        this.pendingNum = i3;
        this.showNumLimitDesc = z;
        this.numDesc = str;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(NumLimitData numLimitData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || numLimitData.numLimit != 100) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, numLimitData.numLimit);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, numLimitData.pendingNum);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, numLimitData.showNumLimitDesc);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, numLimitData.numDesc);
    }

    public NumLimitData(int i, int i2, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.numLimit = i;
        this.pendingNum = i2;
        this.showNumLimitDesc = z;
        this.numDesc = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (100 int) : (r1v0 int))
  (r2v0 int)
  (r3v0 boolean)
  (r4v0 java.lang.String)
 A[MD:(int, int, boolean, java.lang.String):void (m)] (LINE:191) call: com.okinc.business.dex.tee.domain.model.NumLimitData.<init>(int, int, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ NumLimitData(int i, int i2, boolean z, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 100 : i, i2, z, str);
    }
}
