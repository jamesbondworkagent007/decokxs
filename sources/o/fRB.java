package o;

import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fRB {
    public final InterfaceC17407fEe EZpvd;

    public fRB(@NotNull InterfaceC17407fEe interfaceC17407fEe) {
        Intrinsics.checkNotNullParameter(interfaceC17407fEe, "");
        this.EZpvd = interfaceC17407fEe;
    }

    public final java.util.List<fDL<java.lang.Object>> EZpvd(@NotNull SearchWalletViewModel.Application application, boolean z) {
        java.util.Iterator it;
        java.lang.CharSequence charSequenceKWHzl;
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strEZpvd = application.EZpvd();
        java.lang.String str = strEZpvd != null ? strEZpvd : "";
        java.util.List<fDU> listOLrzqt = application.OLrzqt();
        if (listOLrzqt.isEmpty()) {
            return C56402yEa.EZpvd(fEM.copydefault);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it2 = listOLrzqt.iterator();
        int i = 0;
        while (it2.hasNext()) {
            java.lang.Object next = it2.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            fDU fdu = (fDU) next;
            fEO feo = new fEO(this.EZpvd.KWHzl(fdu.KWHzl(), str, z));
            java.util.List<java.lang.Object> listCopydefault = feo.copydefault();
            java.util.List<fDO> listAEQbTJ = fdu.AEQbTJ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (fDO fdo : listAEQbTJ) {
                java.lang.String strEZpvd2 = fdo.EZpvd();
                java.lang.String strCopydefault = fdo.copydefault();
                java.lang.CharSequence charSequenceKWHzl2 = this.EZpvd.KWHzl(fdo.OLrzqt(), str, z);
                java.lang.String strEZpvd3 = fdo.EZpvd(str, z);
                if (strEZpvd3 != null) {
                    it = it2;
                    charSequenceKWHzl = this.EZpvd.KWHzl(strEZpvd3, str, z);
                } else {
                    it = it2;
                    charSequenceKWHzl = null;
                }
                arrayList2.add(new C17420fEr(strEZpvd2, strCopydefault, charSequenceKWHzl2, charSequenceKWHzl, fdo.AEQbTJ(), fdo.djBIcL()));
                it2 = it;
            }
            java.util.Iterator it3 = it2;
            listCopydefault.addAll(arrayList2);
            arrayList.add(feo);
            if (i < yDY.AuCTel(listOLrzqt)) {
                C17742fQp c17742fQp = C17742fQp.AEQbTJ;
                arrayList.add(c17742fQp);
                arrayList.add(new fED());
                arrayList.add(c17742fQp);
            }
            i++;
            it2 = it3;
        }
        return arrayList;
    }
}
