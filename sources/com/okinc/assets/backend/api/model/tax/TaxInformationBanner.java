package com.okinc.assets.backend.api.model.tax;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxInformationBanner {
    public static final int $stable = 0;
    private final Boolean showBanner;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TaxInformationBanner() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowBanner() {
        return this.showBanner;
    }

    public TaxInformationBanner(Boolean bool) {
        this.showBanner = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r1v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.tax.TaxInformationBanner.<init>(java.lang.Boolean):void type: THIS */
    public /* synthetic */ TaxInformationBanner(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
