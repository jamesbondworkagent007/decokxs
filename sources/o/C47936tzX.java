package o;

/* JADX INFO: renamed from: o.tzX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47936tzX {
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x0093 */
    /* JADX DEBUG: Type inference failed for r1v5. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r2v7. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Collection, java.util.List] */
    public static final java.util.List<java.lang.Object> OLrzqt(java.util.List<? extends java.lang.Object> list, java.util.List<? extends java.lang.Object> list2) {
        java.lang.Object objPrevious;
        java.lang.Object next;
        ?? arrayList;
        if (list.isEmpty() && list2.isEmpty()) {
            return yDY.AhwBna();
        }
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size() + list2.size());
        java.util.ListIterator<? extends java.lang.Object> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (objPrevious instanceof java.lang.String) {
                break;
            }
        }
        java.lang.String str = objPrevious instanceof java.lang.String ? (java.lang.String) objPrevious : null;
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof java.lang.String) {
                break;
            }
        }
        if (android.text.TextUtils.equals(str, next instanceof java.lang.String ? (java.lang.String) next : null)) {
            arrayList = new java.util.ArrayList();
            boolean z = false;
            for (java.lang.Object obj : list2) {
                if (!z) {
                    if (!(obj instanceof java.lang.String)) {
                        arrayList.add(obj);
                        z = true;
                    }
                } else {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = list2;
        }
        arrayList2.addAll(list);
        arrayList2.addAll(arrayList);
        pUU.KWHzl("PlanetNotification", "mergeMessageList->exist :" + list.size() + " append:" + list2.size() + " append2:" + arrayList.size());
        return arrayList2;
    }
}
