package org.apache.http.cookie;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.Serializable;
import java.util.Comparator;
import o.InterfaceC59601zkC;

/* JADX INFO: loaded from: classes13.dex */
public class CookiePathComparator implements Serializable, Comparator<InterfaceC59601zkC> {
    public static final CookiePathComparator INSTANCE = new CookiePathComparator();
    private static final long serialVersionUID = 7523645369616405818L;

    private String normalizePath(InterfaceC59601zkC interfaceC59601zkC) {
        String path = interfaceC59601zkC.getPath();
        if (path == null) {
            path = "/";
        }
        if (path.endsWith("/")) {
            return path;
        }
        return path + JsonPointer.SEPARATOR;
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    public int compare(InterfaceC59601zkC interfaceC59601zkC, InterfaceC59601zkC interfaceC59601zkC2) {
        String strNormalizePath = normalizePath(interfaceC59601zkC);
        String strNormalizePath2 = normalizePath(interfaceC59601zkC2);
        if (strNormalizePath.equals(strNormalizePath2)) {
            return 0;
        }
        if (strNormalizePath.startsWith(strNormalizePath2)) {
            return -1;
        }
        return strNormalizePath2.startsWith(strNormalizePath) ? 1 : 0;
    }
}
