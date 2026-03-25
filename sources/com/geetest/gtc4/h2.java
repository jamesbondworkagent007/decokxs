package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class h2 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f457a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h2(byte[] bArr) {
        this.f457a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f457a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return n7.a(this.f457a);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 18, this.f457a);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof h2) {
            return Arrays.equals(this.f457a, ((h2) wVar).f457a);
        }
        return false;
    }
}
