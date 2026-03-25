package o;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

/* JADX INFO: loaded from: classes21.dex */
public abstract class XS {
    @java.lang.Deprecated
    public abstract XV findFilter(java.lang.Object obj);

    public XX findPropertyFilter(java.lang.Object obj, java.lang.Object obj2) {
        XV xvFindFilter = findFilter(obj);
        if (xvFindFilter == null) {
            return null;
        }
        return SimpleBeanPropertyFilter.from(xvFindFilter);
    }
}
