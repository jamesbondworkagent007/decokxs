package com.okinc.business.defi.dapp.net;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class SelectWalletNotice {
    public static final int $stable = 8;
    private Function0<Unit> action;
    private String actionText;
    private String notice;
    private Boolean walletEnable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SelectWalletNotice() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionText() {
        return this.actionText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotice() {
        return this.notice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWalletEnable() {
        return this.walletEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(Function0<Unit> function0) {
        this.action = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionText(String str) {
        this.actionText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotice(String str) {
        this.notice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletEnable(Boolean bool) {
        this.walletEnable = bool;
    }

    public SelectWalletNotice(String str, String str2, Function0<Unit> function0, Boolean bool) {
        this.notice = str;
        this.actionText = str2;
        this.action = function0;
        this.walletEnable = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r4v0 kotlin.jvm.functions.Function0))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0014: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, java.lang.Boolean):void (m)] (LINE:196) call: com.okinc.business.defi.dapp.net.SelectWalletNotice.<init>(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SelectWalletNotice(String str, String str2, Function0 function0, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
