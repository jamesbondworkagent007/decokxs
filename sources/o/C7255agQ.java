package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.agQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7255agQ<T> {
    public T copydefault;

    public java.lang.String toString() {
        T t = this.copydefault;
        return t == null ? AbstractJsonLexerKt.NULL : t.toString();
    }

    public C7255agQ() {
    }

    public C7255agQ(T t) {
        this.copydefault = t;
    }
}
