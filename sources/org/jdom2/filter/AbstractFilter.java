package org.jdom2.filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.jdom2.Content;

/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractFilter<T> implements Filter<T> {
    private static final long serialVersionUID = 200;

    @Override // org.jdom2.filter.Filter
    public final boolean matches(Object obj) {
        return filter(obj) != null;
    }

    @Override // org.jdom2.filter.Filter
    public List<T> filter(List<?> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                T tFilter = filter(list.get(i));
                if (tFilter != null) {
                    arrayList.add(tFilter);
                }
            }
            if (arrayList.isEmpty()) {
                return Collections.emptyList();
            }
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(10);
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            T tFilter2 = filter(it.next());
            if (tFilter2 != null) {
                arrayList2.add(tFilter2);
            }
        }
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // org.jdom2.filter.Filter
    public final Filter<?> negate() {
        if (this instanceof NegateFilter) {
            return ((NegateFilter) this).getBaseFilter();
        }
        return new NegateFilter(this);
    }

    @Override // org.jdom2.filter.Filter
    public final Filter<? extends Content> or(Filter<?> filter) {
        return new OrFilter(this, filter);
    }

    @Override // org.jdom2.filter.Filter
    public final Filter<T> and(Filter<?> filter) {
        return new AndFilter(filter, this);
    }

    @Override // org.jdom2.filter.Filter
    public <R> Filter<R> refine(Filter<R> filter) {
        return new AndFilter(this, filter);
    }
}
