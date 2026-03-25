package o;

/* JADX INFO: renamed from: o.Bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C4814Bs {
    public static final void KWHzl(long j, java.lang.Long l) throws java.io.EOFException {
        if (l != null && j == l.longValue()) {
            return;
        }
        if (l != null && j > l.longValue()) {
            throw new java.io.EOFException("Expected " + j + " bytes but received " + l + " bytes. The connection may have been closed prematurely.");
        }
        throw new java.io.EOFException("Expected " + j + " bytes but received " + l + " bytes.");
    }
}
