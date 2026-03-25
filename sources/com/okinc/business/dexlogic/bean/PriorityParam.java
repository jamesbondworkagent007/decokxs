package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PriorityParam {
    private boolean isValid;
    private int priorityType;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriorityParam copy$default(PriorityParam priorityParam, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = priorityParam.value;
        }
        if ((i2 & 2) != 0) {
            i = priorityParam.priorityType;
        }
        if ((i2 & 4) != 0) {
            z = priorityParam.isValid;
        }
        return priorityParam.copy(str, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.priorityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityParam copy(@NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PriorityParam(str, i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriorityParam)) {
            return false;
        }
        PriorityParam priorityParam = (PriorityParam) obj;
        return Intrinsics.EZpvd((Object) this.value, (Object) priorityParam.value) && this.priorityType == priorityParam.priorityType && this.isValid == priorityParam.isValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriorityType() {
        return this.priorityType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.value.hashCode() * 31) + Integer.hashCode(this.priorityType)) * 31) + Boolean.hashCode(this.isValid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isValid() {
        return this.isValid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityType(int i) {
        this.priorityType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValid(boolean z) {
        this.isValid = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriorityParam(value=" + this.value + ", priorityType=" + this.priorityType + ", isValid=" + this.isValid + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.PriorityParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriorityParam> serializer() {
            return PriorityParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriorityParam(int i, String str, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, PriorityParam$$serializer.INSTANCE.getDescriptor());
        }
        this.value = (i & 1) == 0 ? "" : str;
        this.priorityType = i2;
        if ((i & 4) == 0) {
            this.isValid = true;
        } else {
            this.isValid = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PriorityParam priorityParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) priorityParam.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, priorityParam.value);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, priorityParam.priorityType);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && priorityParam.isValid) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, priorityParam.isValid);
    }

    public PriorityParam(@NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
        this.priorityType = i;
        this.isValid = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(java.lang.String, int, boolean):void (m)] (LINE:25) call: com.okinc.business.dexlogic.bean.PriorityParam.<init>(java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ PriorityParam(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i, (i2 & 4) != 0 ? true : z);
    }
}
