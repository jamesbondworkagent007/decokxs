package com.okinc.business.defi.biz.core.transaction.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public class CommonExtJson {
    public static final int $stable = 0;
    private final int decimal;
    private final String okexAccount;
    private final int repeatTxType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkexAccount() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatTxType() {
        return this.repeatTxType;
    }

    public CommonExtJson(int i, int i2, String str) {
        this.decimal = i;
        this.repeatTxType = i2;
        this.okexAccount = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(int, int, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.biz.core.transaction.bean.CommonExtJson.<init>(int, int, java.lang.String):void type: THIS */
    public /* synthetic */ CommonExtJson(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str);
    }
}
