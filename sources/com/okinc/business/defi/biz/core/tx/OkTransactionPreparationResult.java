package com.okinc.business.defi.biz.core.tx;

import o.AbstractC12609cqH;
import o.C12623cqV;

/* JADX INFO: loaded from: classes4.dex */
public final class OkTransactionPreparationResult {
    public static final int $stable = 8;
    private C12623cqV calculator;
    private boolean canRetry;
    private AbstractC12609cqH mTransaction;
    private String msg = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12623cqV getCalculator() {
        return this.calculator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanRetry() {
        return this.canRetry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12609cqH getMTransaction() {
        return this.mTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalculator(C12623cqV c12623cqV) {
        this.calculator = c12623cqV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanRetry(boolean z) {
        this.canRetry = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMTransaction(AbstractC12609cqH abstractC12609cqH) {
        this.mTransaction = abstractC12609cqH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(String str) {
        this.msg = str;
    }
}
