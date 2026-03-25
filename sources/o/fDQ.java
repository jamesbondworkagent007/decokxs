package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.jvm.internal.Intrinsics;
import o.dTH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fDQ {
    public static final fDU copydefault(@NotNull AbstractC12784ctX abstractC12784ctX, @NotNull C17412fEj c17412fEj, boolean z) {
        dTH fragmentManager;
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(c17412fEj, "");
        java.lang.String strAuCTel = abstractC12784ctX.AuCTel();
        java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (AbstractC12782ctV abstractC12782ctV : listKWHzl) {
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            java.lang.String strCopydefault = c17412fEj.copydefault(abstractC12782ctV);
            java.lang.String strAEQbTJ = abstractC12782ctV.AEQbTJ();
            java.util.ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListIsConnected, 10));
            java.util.Iterator<T> it = arrayListIsConnected.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ChainAddress) it.next()).getAddress());
            }
            if (z) {
                fragmentManager = C17922fXg.OLrzqt(abstractC12782ctV);
            } else {
                fragmentManager = new dTH.FragmentManager(abstractC12782ctV.DbNXlk());
            }
            arrayList.add(new fDO(strDbNXlk, strAEQbTJ, strCopydefault, arrayList2, fragmentManager, abstractC12782ctV.zuWLRA()));
        }
        return new fDU(strAuCTel, arrayList);
    }
}
