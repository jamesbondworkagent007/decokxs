package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class o2 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f485a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o2(byte[] bArr) {
        this.f485a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f485a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f485a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return n7.a(this.f485a);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 20, this.f485a);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof o2) {
            return Arrays.equals(this.f485a, ((o2) wVar).f485a);
        }
        return false;
    }
}
