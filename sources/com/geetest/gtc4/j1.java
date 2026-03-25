package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class j1 implements f, i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f465a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j1(c0 c0Var) {
        this.f465a = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f
    public final w d() {
        try {
            return b();
        } catch (IOException e) {
            throw new v(e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.i5
    public final w b() {
        return new i1(this.f465a.a());
    }
}
