package com.geetest.gtc4;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class r7 extends s1 {
    public final String d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r7(String str) {
        super(p5.UNICODE_STRING);
        this.d = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.s1, com.geetest.gtc4.f3
    public final boolean equals(Object obj) {
        if (!(obj instanceof r7) || !super.equals(obj)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        String str = this.d;
        return str == null ? r7Var.d == null : str.equals(r7Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String toString() {
        String str = this.d;
        return str == null ? AbstractJsonLexerKt.NULL : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.s1, com.geetest.gtc4.f3
    public final int hashCode() {
        if (this.d == null) {
            return 0;
        }
        return this.d.hashCode() + super.hashCode();
    }
}
