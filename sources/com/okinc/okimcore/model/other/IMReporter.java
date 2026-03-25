package com.okinc.okimcore.model.other;

/* JADX INFO: loaded from: classes10.dex */
public final class IMReporter {
    public static final int $stable = 8;
    private int openReceiveReporter;
    private int openReporter = 1;
    private int openPushReporter = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOpenPushReporter() {
        return this.openPushReporter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOpenReceiveReporter() {
        return this.openReceiveReporter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOpenReporter() {
        return this.openReporter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPushReporter(int i) {
        this.openPushReporter = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenReceiveReporter(int i) {
        this.openReceiveReporter = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenReporter(int i) {
        this.openReporter = i;
    }
}
