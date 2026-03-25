package org.jdom2.filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes24.dex */
final class PassThroughFilter extends AbstractFilter<Object> {
    private static final long serialVersionUID = 200;

    @Override // org.jdom2.filter.Filter
    public Object filter(Object obj) {
        return obj;
    }

    @Override // org.jdom2.filter.AbstractFilter, org.jdom2.filter.Filter
    public List<Object> filter(List<?> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        if (list instanceof RandomAccess) {
            return Collections.unmodifiableList(list);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
