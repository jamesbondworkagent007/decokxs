package o;

import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public final class WR implements java.lang.Iterable<AnnotatedMethod> {
    public java.util.Map<WV, AnnotatedMethod> copydefault;

    public WR() {
    }

    public WR(java.util.Map<WV, AnnotatedMethod> map) {
        this.copydefault = map;
    }

    public AnnotatedMethod AEQbTJ(java.lang.String str, java.lang.Class<?>[] clsArr) {
        java.util.Map<WV, AnnotatedMethod> map = this.copydefault;
        if (map == null) {
            return null;
        }
        return map.get(new WV(str, clsArr));
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<AnnotatedMethod> iterator() {
        java.util.Map<WV, AnnotatedMethod> map = this.copydefault;
        if (map == null) {
            return Collections.emptyIterator();
        }
        return map.values().iterator();
    }
}
