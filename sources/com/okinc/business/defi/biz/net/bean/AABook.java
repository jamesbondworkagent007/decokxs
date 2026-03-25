package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AABook {
    public static final int $stable = 8;
    private Boolean isSmartContract;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AABook() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AABook copy$default(AABook aABook, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = aABook.isSmartContract;
        }
        return aABook.copy(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.isSmartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AABook copy(Boolean bool) {
        return new AABook(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AABook) && Intrinsics.EZpvd(this.isSmartContract, ((AABook) obj).isSmartContract);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.isSmartContract;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSmartContract() {
        return this.isSmartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartContract(Boolean bool) {
        this.isSmartContract = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AABook(isSmartContract=" + this.isSmartContract + ")";
    }

    public AABook(Boolean bool) {
        this.isSmartContract = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r1v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean):void (m)] (LINE:1280) call: com.okinc.business.defi.biz.net.bean.AABook.<init>(java.lang.Boolean):void type: THIS */
    public /* synthetic */ AABook(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
