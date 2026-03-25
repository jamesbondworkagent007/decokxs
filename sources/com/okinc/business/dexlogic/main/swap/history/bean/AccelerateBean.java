package com.okinc.business.dexlogic.main.swap.history.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AccelerateBean {
    private boolean isNotSingleSwap;
    private boolean isShowCancel;
    private boolean isShowSpeedUp;
    private boolean isShowSpeedUpCancel;
    private String speedUpTxHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccelerateBean() {
        this(false, false, false, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccelerateBean copy$default(AccelerateBean accelerateBean, boolean z, boolean z2, boolean z3, String str, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accelerateBean.isShowSpeedUp;
        }
        if ((i & 2) != 0) {
            z2 = accelerateBean.isShowCancel;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = accelerateBean.isShowSpeedUpCancel;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            str = accelerateBean.speedUpTxHash;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z4 = accelerateBean.isNotSingleSwap;
        }
        return accelerateBean.copy(z, z5, z6, str2, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isNotSingleSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccelerateBean copy(boolean z, boolean z2, boolean z3, @NotNull String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AccelerateBean(z, z2, z3, str, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccelerateBean)) {
            return false;
        }
        AccelerateBean accelerateBean = (AccelerateBean) obj;
        return this.isShowSpeedUp == accelerateBean.isShowSpeedUp && this.isShowCancel == accelerateBean.isShowCancel && this.isShowSpeedUpCancel == accelerateBean.isShowSpeedUpCancel && Intrinsics.EZpvd((Object) this.speedUpTxHash, (Object) accelerateBean.speedUpTxHash) && this.isNotSingleSwap == accelerateBean.isNotSingleSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpeedUpTxHash() {
        return this.speedUpTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Boolean.hashCode(this.isShowSpeedUp) * 31) + Boolean.hashCode(this.isShowCancel)) * 31) + Boolean.hashCode(this.isShowSpeedUpCancel)) * 31) + this.speedUpTxHash.hashCode()) * 31) + Boolean.hashCode(this.isNotSingleSwap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedDismiss() {
        return (this.isShowSpeedUp || this.isShowCancel || this.isShowSpeedUpCancel) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNotSingleSwap() {
        return this.isNotSingleSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowCancel() {
        return this.isShowCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUp() {
        return this.isShowSpeedUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpeedUpCancel() {
        return this.isShowSpeedUpCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotSingleSwap(boolean z) {
        this.isNotSingleSwap = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCancel(boolean z) {
        this.isShowCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedUp(boolean z) {
        this.isShowSpeedUp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpeedUpCancel(boolean z) {
        this.isShowSpeedUpCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpeedUpTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.speedUpTxHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccelerateBean(isShowSpeedUp=" + this.isShowSpeedUp + ", isShowCancel=" + this.isShowCancel + ", isShowSpeedUpCancel=" + this.isShowSpeedUpCancel + ", speedUpTxHash=" + this.speedUpTxHash + ", isNotSingleSwap=" + this.isNotSingleSwap + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccelerateBean> serializer() {
            return AccelerateBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccelerateBean(int i, boolean z, boolean z2, boolean z3, String str, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isShowSpeedUp = false;
        } else {
            this.isShowSpeedUp = z;
        }
        if ((i & 2) == 0) {
            this.isShowCancel = false;
        } else {
            this.isShowCancel = z2;
        }
        if ((i & 4) == 0) {
            this.isShowSpeedUpCancel = false;
        } else {
            this.isShowSpeedUpCancel = z3;
        }
        if ((i & 8) == 0) {
            this.speedUpTxHash = "";
        } else {
            this.speedUpTxHash = str;
        }
        if ((i & 16) == 0) {
            this.isNotSingleSwap = false;
        } else {
            this.isNotSingleSwap = z4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AccelerateBean accelerateBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || accelerateBean.isShowSpeedUp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, accelerateBean.isShowSpeedUp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || accelerateBean.isShowCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, accelerateBean.isShowCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || accelerateBean.isShowSpeedUpCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, accelerateBean.isShowSpeedUpCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accelerateBean.speedUpTxHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accelerateBean.speedUpTxHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || accelerateBean.isNotSingleSwap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, accelerateBean.isNotSingleSwap);
        }
    }

    public AccelerateBean(boolean z, boolean z2, boolean z3, @NotNull String str, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isShowSpeedUp = z;
        this.isShowCancel = z2;
        this.isShowSpeedUpCancel = z3;
        this.speedUpTxHash = str;
        this.isNotSingleSwap = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
 A[MD:(boolean, boolean, boolean, java.lang.String, boolean):void (m)] (LINE:14) call: com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean.<init>(boolean, boolean, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AccelerateBean(boolean z, boolean z2, boolean z3, String str, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z4);
    }
}
