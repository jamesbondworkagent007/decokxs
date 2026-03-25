package o;

import com.okinc.network.okg.dns.DohTypeEnum;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;
import o.C43363rnq;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43336rnP implements Dns {
    @Override // okhttp3.Dns
    public java.util.List<java.net.InetAddress> lookup(@NotNull java.lang.String str) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C43371rny.OLrzqt.KWHzl()) {
            return Dns.SYSTEM.lookup(str);
        }
        C43363rnq.TaskDescription taskDescription = C43363rnq.Companion;
        boolean zCopydefault = taskDescription.copydefault().copydefault(str);
        java.lang.String strOLrzqt = zCopydefault ? taskDescription.copydefault().OLrzqt(str) : str;
        pUU.KWHzl("WEB_DNS_Log", "isRpcRequest: " + zCopydefault + ",hostname: " + str + ", dohHostName:" + strOLrzqt);
        java.util.ArrayList<java.lang.String> arrayListKWHzl = C43372rnz.copydefault.KWHzl(DohTypeEnum.HTTP, strOLrzqt);
        java.util.ArrayList<java.lang.String> arrayListCopydefault = C43368rnv.copydefault.copydefault(strOLrzqt);
        if (arrayListCopydefault != null) {
            arrayListKWHzl = arrayListCopydefault;
        }
        if (!arrayListKWHzl.isEmpty()) {
            pUU.valueOf("WEB_DNS_Log", "Web DNS 生效 ip = " + arrayListKWHzl + " host = " + strOLrzqt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = arrayListKWHzl.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.String next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(next);
                Intrinsics.checkNotNullExpressionValue(allByName, "");
                arrayList.addAll(yDT.fIwbmz(allByName));
            }
            return arrayList;
        }
        pUU.valueOf("WEB_DNS_Log", "Web DNS 不生效  host = " + strOLrzqt);
        return Dns.SYSTEM.lookup(strOLrzqt);
    }
}
