package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;
import o.InterfaceC59601zkC;

/* JADX INFO: loaded from: classes13.dex */
public class CookieIdentityComparator implements Serializable, Comparator<InterfaceC59601zkC> {
    private static final long serialVersionUID = 4466565437490631532L;

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    public int compare(InterfaceC59601zkC interfaceC59601zkC, InterfaceC59601zkC interfaceC59601zkC2) {
        int iCompareTo = interfaceC59601zkC.getName().compareTo(interfaceC59601zkC2.getName());
        if (iCompareTo == 0) {
            String domain = interfaceC59601zkC.getDomain();
            String str = "";
            if (domain == null) {
                domain = "";
            } else if (domain.indexOf(46) == -1) {
                domain = domain + ".local";
            }
            String domain2 = interfaceC59601zkC2.getDomain();
            if (domain2 != null) {
                if (domain2.indexOf(46) == -1) {
                    str = domain2 + ".local";
                } else {
                    str = domain2;
                }
            }
            iCompareTo = domain.compareToIgnoreCase(str);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        String path = interfaceC59601zkC.getPath();
        if (path == null) {
            path = "/";
        }
        String path2 = interfaceC59601zkC2.getPath();
        return path.compareTo(path2 != null ? path2 : "/");
    }
}
