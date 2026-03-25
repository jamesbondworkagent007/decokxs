package com.geetest.gtc4;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f541a;
    public final int b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z0(t0 t0Var, int i, String str) {
        this.f541a = t0Var;
        this.b = i;
        this.c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AttestationResult{attestation=" + this.f541a + ", isGoogleRootSCertificate=" + this.b + ", serialNumbers=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
