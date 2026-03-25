package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class RegisterAddressStatusRes {
    public static final int $stable = 0;
    private final int registerStatus;
    private final boolean supportRetry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RegisterAddressStatusRes copy$default(RegisterAddressStatusRes registerAddressStatusRes, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = registerAddressStatusRes.registerStatus;
        }
        if ((i2 & 2) != 0) {
            z = registerAddressStatusRes.supportRetry;
        }
        return registerAddressStatusRes.copy(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.registerStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.supportRetry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterAddressStatusRes copy(int i, boolean z) {
        return new RegisterAddressStatusRes(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterAddressStatusRes)) {
            return false;
        }
        RegisterAddressStatusRes registerAddressStatusRes = (RegisterAddressStatusRes) obj;
        return this.registerStatus == registerAddressStatusRes.registerStatus && this.supportRetry == registerAddressStatusRes.supportRetry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRegisterStatus() {
        return this.registerStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportRetry() {
        return this.supportRetry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.registerStatus) * 31) + Boolean.hashCode(this.supportRetry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegisterAddressStatusRes(registerStatus=" + this.registerStatus + ", supportRetry=" + this.supportRetry + ")";
    }

    public RegisterAddressStatusRes(int i, boolean z) {
        this.registerStatus = i;
        this.supportRetry = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(int, boolean):void (m)] (LINE:2086) call: com.okinc.business.defi.biz.net.bean.RegisterAddressStatusRes.<init>(int, boolean):void type: THIS */
    public /* synthetic */ RegisterAddressStatusRes(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }
}
