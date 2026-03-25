package com.geetest.captcha;

/* JADX INFO: loaded from: classes17.dex */
public enum g {
    AUTO(0),
    NORMAL(1),
    DARK(2);

    private int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    g(int i) {
        this.value = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(int i) {
        this.value = i;
    }
}
