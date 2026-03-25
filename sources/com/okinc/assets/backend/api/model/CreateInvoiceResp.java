package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CreateInvoiceResp {
    public static final int $stable = 8;
    private String invoice = "";
    private String amount = "";
    private String valuation = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoice() {
        return this.invoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.invoice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuation = str;
    }
}
