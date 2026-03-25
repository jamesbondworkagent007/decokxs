package org.luaj.vm2.exception;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public class InvokeError extends RuntimeException {
    private int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getType() {
        return this.type;
    }

    @InterfaceC60044zuT
    public InvokeError(String str) {
        super(str);
        this.type = 0;
        if ("function is destroyed.".equals(str)) {
            this.type = 1;
        }
    }

    @InterfaceC60044zuT
    public InvokeError(String str, Throwable th) {
        super(str, th);
        this.type = 0;
    }

    public InvokeError(String str, int i) {
        super(str);
        this.type = i;
    }
}
