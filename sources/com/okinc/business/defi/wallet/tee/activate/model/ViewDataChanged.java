package com.okinc.business.defi.wallet.tee.activate.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ViewDataChanged {
    public static final int $stable = 8;
    private final boolean autoRenew;
    private final boolean enableBtnIsClicked;
    private final boolean isCheckBoxChecked;
    private final boolean isReadyGenerateActivateTee;
    private final boolean isShowTermsOfService;
    private final int selectedExpireTime;
    private final ViewDataReady viewDataReady;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ViewDataChanged copy$default(ViewDataChanged viewDataChanged, ViewDataReady viewDataReady, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            viewDataReady = viewDataChanged.viewDataReady;
        }
        if ((i2 & 2) != 0) {
            i = viewDataChanged.selectedExpireTime;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = viewDataChanged.autoRenew;
        }
        boolean z6 = z;
        if ((i2 & 8) != 0) {
            z2 = viewDataChanged.isReadyGenerateActivateTee;
        }
        boolean z7 = z2;
        if ((i2 & 16) != 0) {
            z3 = viewDataChanged.isShowTermsOfService;
        }
        boolean z8 = z3;
        if ((i2 & 32) != 0) {
            z4 = viewDataChanged.isCheckBoxChecked;
        }
        boolean z9 = z4;
        if ((i2 & 64) != 0) {
            z5 = viewDataChanged.enableBtnIsClicked;
        }
        return viewDataChanged.copy(viewDataReady, i3, z6, z7, z8, z9, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewDataReady component1() {
        return this.viewDataReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.selectedExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isReadyGenerateActivateTee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isShowTermsOfService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isCheckBoxChecked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.enableBtnIsClicked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewDataChanged copy(@NotNull ViewDataReady viewDataReady, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(viewDataReady, "");
        return new ViewDataChanged(viewDataReady, i, z, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewDataChanged)) {
            return false;
        }
        ViewDataChanged viewDataChanged = (ViewDataChanged) obj;
        return Intrinsics.EZpvd(this.viewDataReady, viewDataChanged.viewDataReady) && this.selectedExpireTime == viewDataChanged.selectedExpireTime && this.autoRenew == viewDataChanged.autoRenew && this.isReadyGenerateActivateTee == viewDataChanged.isReadyGenerateActivateTee && this.isShowTermsOfService == viewDataChanged.isShowTermsOfService && this.isCheckBoxChecked == viewDataChanged.isCheckBoxChecked && this.enableBtnIsClicked == viewDataChanged.enableBtnIsClicked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableBtnIsClicked() {
        return this.enableBtnIsClicked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSelectedExpireTime() {
        return this.selectedExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewDataReady getViewDataReady() {
        return this.viewDataReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.viewDataReady.hashCode() * 31) + Integer.hashCode(this.selectedExpireTime)) * 31) + Boolean.hashCode(this.autoRenew)) * 31) + Boolean.hashCode(this.isReadyGenerateActivateTee)) * 31) + Boolean.hashCode(this.isShowTermsOfService)) * 31) + Boolean.hashCode(this.isCheckBoxChecked)) * 31) + Boolean.hashCode(this.enableBtnIsClicked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCheckBoxChecked() {
        return this.isCheckBoxChecked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isReadyGenerateActivateTee() {
        return this.isReadyGenerateActivateTee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowTermsOfService() {
        return this.isShowTermsOfService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ViewDataChanged(viewDataReady=" + this.viewDataReady + ", selectedExpireTime=" + this.selectedExpireTime + ", autoRenew=" + this.autoRenew + ", isReadyGenerateActivateTee=" + this.isReadyGenerateActivateTee + ", isShowTermsOfService=" + this.isShowTermsOfService + ", isCheckBoxChecked=" + this.isCheckBoxChecked + ", enableBtnIsClicked=" + this.enableBtnIsClicked + ")";
    }

    public ViewDataChanged(@NotNull ViewDataReady viewDataReady, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(viewDataReady, "");
        this.viewDataReady = viewDataReady;
        this.selectedExpireTime = i;
        this.autoRenew = z;
        this.isReadyGenerateActivateTee = z2;
        this.isShowTermsOfService = z3;
        this.isCheckBoxChecked = z4;
        this.enableBtnIsClicked = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r11v0 com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady)
  (r12v0 int)
  (r13v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (r15v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
 A[MD:(com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady, int, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:90) call: com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged.<init>(com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady, int, boolean, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ ViewDataChanged(ViewDataReady viewDataReady, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewDataReady, i, z, (i2 & 8) != 0 ? true : z2, z3, (i2 & 32) != 0 ? true : z4, (i2 & 64) != 0 ? false : z5);
    }
}
