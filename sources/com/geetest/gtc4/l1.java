package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class l1 implements f, i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f472a;
    public final int b;
    public final c0 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l1(int i, int i2, c0 c0Var) {
        this.f472a = i;
        this.b = i2;
        this.c = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w b() {
        return this.c.a(this.f472a, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f
    public final w d() {
        try {
            return b();
        } catch (IOException e) {
            throw new v(e.getMessage());
        }
    }
}
