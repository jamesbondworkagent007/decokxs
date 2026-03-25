package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class e2 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f439a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e2(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.f439a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f439a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f439a);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 25, this.f439a);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof e2) {
            return Arrays.equals(this.f439a, ((e2) wVar).f439a);
        }
        return false;
    }
}
