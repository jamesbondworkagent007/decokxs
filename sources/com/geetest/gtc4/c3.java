package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class c3 implements f, i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f431a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c3(c0 c0Var) {
        this.f431a = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.i5
    public final w b() {
        return x2.a(this.f431a.a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f
    public final w d() {
        try {
            return x2.a(this.f431a.a());
        } catch (IOException e) {
            throw new v(e.getMessage(), e);
        }
    }
}
