package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class g2 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f451a = new g2();
    public static final byte[] b = new byte[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 5, b);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String toString() {
        return "NULL";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        return wVar instanceof g2;
    }

    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        return u.a(0) + (z ? 1 : 0);
    }
}
