package com.okinc.okex.lite.earn.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LiteEarnHistoryOrMyEarningData {
    public static final int $stable = 8;
    private String currencyId = "";
    private String bizType = "";
    private String eventType = "";
    private String eventStatus = "";
    private String currencyName = "";
    private String earnDetailId = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnDetailId() {
        return this.earnDetailId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventStatus() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnDetailId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.earnDetailId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eventStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eventType = str;
    }
}
