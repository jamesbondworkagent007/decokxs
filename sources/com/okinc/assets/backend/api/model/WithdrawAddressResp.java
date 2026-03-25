package com.okinc.assets.backend.api.model;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddressResp {
    public static final int $stable = 8;
    public final ArrayList<WithdrawAddress> addressList;
    private final boolean evmCompatible;
    private final boolean googleVerification;
    private final int msgType;
    private final Long numOfAddressLocked;
    private final boolean phoneVerification;
    private final String total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawAddressResp() {
        this(null, false, false, false, 0, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.assets.backend.api.model.WithdrawAddressResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawAddressResp copy$default(WithdrawAddressResp withdrawAddressResp, ArrayList arrayList, boolean z, boolean z2, boolean z3, int i, String str, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = withdrawAddressResp.addressList;
        }
        if ((i2 & 2) != 0) {
            z = withdrawAddressResp.googleVerification;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = withdrawAddressResp.phoneVerification;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            z3 = withdrawAddressResp.evmCompatible;
        }
        boolean z6 = z3;
        if ((i2 & 16) != 0) {
            i = withdrawAddressResp.msgType;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str = withdrawAddressResp.total;
        }
        String str2 = str;
        if ((i2 & 64) != 0) {
            l = withdrawAddressResp.numOfAddressLocked;
        }
        return withdrawAddressResp.copy(arrayList, z4, z5, z6, i3, str2, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WithdrawAddress> component1() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.evmCompatible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.numOfAddressLocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawAddressResp copy(ArrayList<WithdrawAddress> arrayList, boolean z, boolean z2, boolean z3, int i, String str, Long l) {
        return new WithdrawAddressResp(arrayList, z, z2, z3, i, str, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawAddressResp)) {
            return false;
        }
        WithdrawAddressResp withdrawAddressResp = (WithdrawAddressResp) obj;
        return Intrinsics.EZpvd(this.addressList, withdrawAddressResp.addressList) && this.googleVerification == withdrawAddressResp.googleVerification && this.phoneVerification == withdrawAddressResp.phoneVerification && this.evmCompatible == withdrawAddressResp.evmCompatible && this.msgType == withdrawAddressResp.msgType && Intrinsics.EZpvd((Object) this.total, (Object) withdrawAddressResp.total) && Intrinsics.EZpvd(this.numOfAddressLocked, withdrawAddressResp.numOfAddressLocked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEvmCompatible() {
        return this.evmCompatible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGoogleVerification() {
        return this.googleVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMsgType() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getNumOfAddressLocked() {
        return this.numOfAddressLocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPhoneVerification() {
        return this.phoneVerification;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<WithdrawAddress> arrayList = this.addressList;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode2 = Boolean.hashCode(this.googleVerification);
        int iHashCode3 = Boolean.hashCode(this.phoneVerification);
        int iHashCode4 = Boolean.hashCode(this.evmCompatible);
        int iHashCode5 = Integer.hashCode(this.msgType);
        String str = this.total;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Long l = this.numOfAddressLocked;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawAddressResp(addressList=" + this.addressList + ", googleVerification=" + this.googleVerification + ", phoneVerification=" + this.phoneVerification + ", evmCompatible=" + this.evmCompatible + ", msgType=" + this.msgType + ", total=" + this.total + ", numOfAddressLocked=" + this.numOfAddressLocked + ")";
    }

    public WithdrawAddressResp(ArrayList<WithdrawAddress> arrayList, boolean z, boolean z2, boolean z3, int i, String str, Long l) {
        this.addressList = arrayList;
        this.googleVerification = z;
        this.phoneVerification = z2;
        this.evmCompatible = z3;
        this.msgType = i;
        this.total = str;
        this.numOfAddressLocked = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r7v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r11v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
 A[MD:(java.util.ArrayList<com.okinc.assets.backend.api.model.WithdrawAddress>, boolean, boolean, boolean, int, java.lang.String, java.lang.Long):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.WithdrawAddressResp.<init>(java.util.ArrayList, boolean, boolean, boolean, int, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ WithdrawAddressResp(ArrayList arrayList, boolean z, boolean z2, boolean z3, int i, String str, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : arrayList, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) == 0 ? i : 0, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : l);
    }
}
