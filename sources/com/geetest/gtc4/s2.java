package com.geetest.gtc4;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class s2 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f503a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s2(byte[] bArr) {
        this.f503a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f503a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f503a);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 21, this.f503a);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof s2) {
            return Arrays.equals(this.f503a, ((s2) wVar).f503a);
        }
        return false;
    }
}
