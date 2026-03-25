package o;

/* JADX INFO: renamed from: o.myx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33573myx {
    public static int copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String strReplaceAll = str == null ? "" : str.replaceAll("[^\\d\\.]+", "");
        java.lang.String strReplaceAll2 = str2 != null ? str2.replaceAll("[^\\d\\.]+", "") : "";
        java.lang.String[] strArrSplit = strReplaceAll.split("\\.");
        java.lang.String[] strArrSplit2 = strReplaceAll2.split("\\.");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str3 : strArrSplit) {
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str3)));
        }
        for (java.lang.String str4 : strArrSplit2) {
            arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str4)));
        }
        int iMax = java.lang.Math.max(arrayList.size(), arrayList2.size());
        while (arrayList.size() < iMax) {
            arrayList.add(0);
        }
        while (arrayList2.size() < iMax) {
            arrayList2.add(0);
        }
        for (int i = 0; i < iMax; i++) {
            if (((java.lang.Integer) arrayList.get(i)).intValue() > ((java.lang.Integer) arrayList2.get(i)).intValue()) {
                return 1;
            }
            if (((java.lang.Integer) arrayList.get(i)).intValue() < ((java.lang.Integer) arrayList2.get(i)).intValue()) {
                return -1;
            }
        }
        return 0;
    }
}
