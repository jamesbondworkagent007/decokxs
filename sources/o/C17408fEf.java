package o;

import com.okinc.business.defi.wallet.mine.walletmanage.viewmodel.SearchWalletViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17408fEf {
    public final InterfaceC17407fEe OLrzqt;

    public C17408fEf(@NotNull InterfaceC17407fEe interfaceC17407fEe) {
        Intrinsics.checkNotNullParameter(interfaceC17407fEe, "");
        this.OLrzqt = interfaceC17407fEe;
    }

    public final java.util.List<fDL<java.lang.Object>> OLrzqt(@NotNull SearchWalletViewModel.Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strEZpvd = application.EZpvd();
        java.lang.String str = strEZpvd != null ? strEZpvd : "";
        java.util.List<fDU> listOLrzqt = application.OLrzqt();
        if (listOLrzqt.isEmpty()) {
            return C56402yEa.EZpvd(fEM.copydefault);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (fDU fdu : listOLrzqt) {
            fEO feo = new fEO(this.OLrzqt.KWHzl(fdu.KWHzl(), str, z));
            java.util.List<java.lang.Object> listCopydefault = feo.copydefault();
            java.util.List<fDO> listAEQbTJ = fdu.AEQbTJ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (fDO fdo : listAEQbTJ) {
                java.lang.String strEZpvd2 = fdo.EZpvd();
                java.lang.String strCopydefault = fdo.copydefault();
                java.lang.CharSequence charSequenceKWHzl = this.OLrzqt.KWHzl(fdo.OLrzqt(), str, z);
                java.lang.String strEZpvd3 = fdo.EZpvd(str, z);
                arrayList2.add(new C17420fEr(strEZpvd2, strCopydefault, charSequenceKWHzl, strEZpvd3 != null ? this.OLrzqt.KWHzl(strEZpvd3, str, z) : null, fdo.AEQbTJ(), fdo.djBIcL() && str.length() == 0));
            }
            listCopydefault.addAll(arrayList2);
            arrayList.add(feo);
            arrayList.add(new fED());
        }
        arrayList.remove(yDY.AuCTel(arrayList));
        return arrayList;
    }
}
