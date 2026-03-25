package com.geetest.gtc4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class j2 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3 f466a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j2(h3 h3Var) {
        this.f466a = h3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.i5
    public final w b() {
        return new i2(this.f466a.b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.gtc4.t
    public final InputStream c() {
        return this.f466a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.f
    public final w d() {
        try {
            return new i2(this.f466a.b());
        } catch (IOException e) {
            throw new v("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
