package com.okinc.business.defi.wallet.mine.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C10849bwH;

/* JADX INFO: loaded from: classes5.dex */
public final class EosSelectPayMethod {
    public static final int $stable = 8;
    private boolean isSelect;
    private C10849bwH payMethod;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosSelectPayMethod() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10849bwH getPayMethod() {
        return this.payMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayMethod(C10849bwH c10849bwH) {
        this.payMethod = c10849bwH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public EosSelectPayMethod(boolean z, C10849bwH c10849bwH) {
        this.isSelect = z;
        this.payMethod = c10849bwH;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:o.bwH:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.bwH) : (r2v0 o.bwH))
 A[MD:(boolean, o.bwH):void (m)] (LINE:13) call: com.okinc.business.defi.wallet.mine.data.EosSelectPayMethod.<init>(boolean, o.bwH):void type: THIS */
    public /* synthetic */ EosSelectPayMethod(boolean z, C10849bwH c10849bwH, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : c10849bwH);
    }
}
