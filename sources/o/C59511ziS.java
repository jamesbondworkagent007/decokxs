package o;

import org.apache.commons.logging.impl.WeakHashtable;

/* JADX INFO: renamed from: o.ziS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59511ziS implements java.util.Enumeration {
    public final /* synthetic */ WeakHashtable EZpvd;
    public final /* synthetic */ java.util.Enumeration KWHzl;

    public C59511ziS(WeakHashtable weakHashtable, java.util.Enumeration enumeration) {
        this.EZpvd = weakHashtable;
        this.KWHzl = enumeration;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.KWHzl.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public java.lang.Object nextElement() {
        return ((WeakHashtable.StateListAnimator) this.KWHzl.nextElement()).copydefault();
    }
}
