package com.okinc.business.market.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class PremarketExistPo {
    public static final int $stable = 0;

    @SerializedName("isExist")
    private final boolean isExist;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PremarketExistPo() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PremarketExistPo copy$default(PremarketExistPo premarketExistPo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = premarketExistPo.isExist;
        }
        return premarketExistPo.copy(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PremarketExistPo copy(boolean z) {
        return new PremarketExistPo(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PremarketExistPo) && this.isExist == ((PremarketExistPo) obj).isExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Boolean.hashCode(this.isExist);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExist() {
        return this.isExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PremarketExistPo(isExist=" + this.isExist + ")";
    }

    public PremarketExistPo(boolean z) {
        this.isExist = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:8) call: com.okinc.business.market.bean.PremarketExistPo.<init>(boolean):void type: THIS */
    public /* synthetic */ PremarketExistPo(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
