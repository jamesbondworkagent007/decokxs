package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends w {
    public static final e b = new e((byte) 0);
    public static final e c = new e((byte) -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f437a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(byte b2) {
        this.f437a = b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        return d.a(1, z ? 1 : 0, 1);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.gtc4.w
    public final w g() {
        return this.f437a != 0 ? c : b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return this.f437a != 0 ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String toString() {
        return this.f437a != 0 ? "TRUE" : "FALSE";
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        byte b2 = this.f437a;
        uVar.a(z, 1);
        uVar.b(1);
        uVar.f516a.write(b2);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (!(wVar instanceof e)) {
            return false;
        }
        return (this.f437a != 0) == (((e) wVar).f437a != 0);
    }
}
