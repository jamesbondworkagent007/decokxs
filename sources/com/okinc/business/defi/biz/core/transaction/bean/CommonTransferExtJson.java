package com.okinc.business.defi.biz.core.transaction.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonTransferExtJson extends CommonExtJson {
    public static final int $stable = 0;
    private final int multiTag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMultiTag() {
        return this.multiTag;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (r4v0 int)
 A[MD:(int, int, java.lang.String, int):void (m)] (LINE:18) call: com.okinc.business.defi.biz.core.transaction.bean.CommonTransferExtJson.<init>(int, int, java.lang.String, int):void type: THIS */
    public /* synthetic */ CommonTransferExtJson(int i, int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? null : str, i3);
    }

    public CommonTransferExtJson(int i, int i2, String str, int i3) {
        super(i, i2, str);
        this.multiTag = i3;
    }
}
