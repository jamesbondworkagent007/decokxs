package o;

import java.util.Date;
import org.apache.http.impl.cookie.BasicClientCookie;

/* JADX INFO: renamed from: o.zkF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59604zkF implements java.util.Comparator<InterfaceC59601zkC> {
    public static final C59604zkF OLrzqt = new C59604zkF();

    public final int KWHzl(InterfaceC59601zkC interfaceC59601zkC) {
        java.lang.String path = interfaceC59601zkC.getPath();
        if (path != null) {
            return path.length();
        }
        return 1;
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC59601zkC interfaceC59601zkC, InterfaceC59601zkC interfaceC59601zkC2) {
        int iKWHzl = KWHzl(interfaceC59601zkC2) - KWHzl(interfaceC59601zkC);
        if (iKWHzl == 0 && (interfaceC59601zkC instanceof BasicClientCookie) && (interfaceC59601zkC2 instanceof BasicClientCookie)) {
            Date creationDate = ((BasicClientCookie) interfaceC59601zkC).getCreationDate();
            Date creationDate2 = ((BasicClientCookie) interfaceC59601zkC2).getCreationDate();
            if (creationDate != null && creationDate2 != null) {
                return (int) (creationDate.getTime() - creationDate2.getTime());
            }
        }
        return iKWHzl;
    }
}
