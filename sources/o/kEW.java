package o;

import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kEW extends C27857kFx {
    public final java.util.ArrayList<pWN> AEQbTJ = yDY.copydefault(new pWN(qZH.PendingIntent.QKVWgx, "Watchlist", null, null, 12, null), new pWN(qZH.PendingIntent.hUfVAv, "SPOT", null, null, 12, null), new pWN(qZH.PendingIntent.DQnQnb, "SWAP", null, null, 12, null), new pWN(qZH.PendingIntent.iZzfmt, "OPTION", null, null, 12, null));
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C27857kFx
    public boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C27857kFx
    public java.util.ArrayList<pWN> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // o.C27857kFx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.fragment.app.Fragment KWHzl(@NotNull pWN pwn) {
        boolean z;
        Intrinsics.checkNotNullParameter(pwn, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        java.util.ArrayList<java.lang.String> arrayListEjfBZ = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.ejfBZ() : null;
        if (arrayListEjfBZ != null) {
            z = arrayListEjfBZ.size() == 1;
        }
        return kFE.Companion.copydefault(pwn, z);
    }

    @Override // o.C27857kFx
    public void EZpvd() {
        C55254xgV c55254xgV;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        java.util.ArrayList<java.lang.String> arrayListEjfBZ = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.ejfBZ() : null;
        super.EZpvd();
        qZL qzlAEQbTJ = AEQbTJ();
        if (qzlAEQbTJ == null || (c55254xgV = qzlAEQbTJ.copydefault) == null) {
            return;
        }
        c55254xgV.setVisibility((arrayListEjfBZ != null && arrayListEjfBZ.size() == 1) ^ true ? 0 : 8);
    }

    @Override // o.C27857kFx
    public java.util.List<pWN> copydefault(java.util.ArrayList<java.lang.String> arrayList) {
        java.util.List<pWN> listCopydefault = super.copydefault(arrayList);
        if (listCopydefault.size() == 2 && !listCopydefault.isEmpty()) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((pWN) it.next()).AEQbTJ(), (java.lang.Object) "Watchlist")) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : listCopydefault) {
                        if (!Intrinsics.EZpvd((java.lang.Object) ((pWN) obj).AEQbTJ(), (java.lang.Object) "Watchlist")) {
                            arrayList2.add(obj);
                        }
                    }
                    return arrayList2;
                }
            }
        }
        return listCopydefault;
    }
}
