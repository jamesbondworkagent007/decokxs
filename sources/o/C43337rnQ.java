package o;

import com.okinc.network.okg.dns.DohTypeEnum;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43337rnQ implements Dns {
    public final java.lang.String EZpvd;
    public final DohTypeEnum KWHzl;

    public C43337rnQ(@NotNull DohTypeEnum dohTypeEnum) {
        Intrinsics.checkNotNullParameter(dohTypeEnum, "");
        this.KWHzl = dohTypeEnum;
        java.lang.String upperCase = dohTypeEnum.getType().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        this.EZpvd = upperCase + "_DNS";
    }

    @Override // okhttp3.Dns
    public java.util.List<java.net.InetAddress> lookup(@NotNull java.lang.String str) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(str, "");
        if (C43371rny.OLrzqt.KWHzl()) {
            if (this.KWHzl == DohTypeEnum.HTTP) {
                C43372rnz c43372rnz = C43372rnz.copydefault;
                if (c43372rnz.AhwBna() && c43372rnz.valueOf().contains(str) && c43372rnz.copydefault(str)) {
                    java.util.List<java.net.InetAddress> listLookup = Dns.SYSTEM.lookup(str);
                    pUU.KWHzl(this.EZpvd, "will use DirectConnect => ip = " + listLookup + " dohType:" + this.KWHzl + "  hostname = " + str + " ");
                    return listLookup;
                }
            }
            C43372rnz c43372rnz2 = C43372rnz.copydefault;
            java.util.ArrayList<java.lang.String> arrayListKWHzl = c43372rnz2.KWHzl(this.KWHzl, str);
            java.util.ArrayList<java.lang.String> arrayListAEQbTJ = c43372rnz2.AEQbTJ(str);
            if (arrayListAEQbTJ != null) {
                arrayListKWHzl = arrayListAEQbTJ;
            }
            if (!arrayListKWHzl.isEmpty()) {
                if (!C43365rns.OLrzqt.OLrzqt(arrayListKWHzl)) {
                    Dns dns = Dns.SYSTEM;
                    java.lang.String str2 = arrayListKWHzl.get(0);
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    java.util.List<java.net.InetAddress> listLookup2 = dns.lookup(str2);
                    pUU.valueOf(this.EZpvd, "OKDns ip not as expect will use system dns lookup ips, host = " + str + " result = " + listLookup2);
                    return listLookup2;
                }
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
                pUU.KWHzl(this.EZpvd, "OKDns will use doh http dns ip:" + arrayList + " ,DNS 生效 dnsIps = " + arrayListKWHzl + " host = " + str);
                return arrayList;
            }
        }
        java.util.List<java.net.InetAddress> listLookup3 = Dns.SYSTEM.lookup(str);
        pUU.valueOf(this.EZpvd, "OKDns not worked will use system dns, host = " + str + " result = " + listLookup3);
        return listLookup3;
    }
}
