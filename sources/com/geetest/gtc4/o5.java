package com.geetest.gtc4;

import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public abstract class o5 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f488a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o5(InputStream inputStream, int i) {
        this.f488a = inputStream;
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        InputStream inputStream = this.f488a;
        if (inputStream instanceof j5) {
            j5 j5Var = (j5) inputStream;
            j5Var.f = true;
            j5Var.b();
        }
    }
}
