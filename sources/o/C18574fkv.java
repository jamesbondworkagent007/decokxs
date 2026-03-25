package o;

import android.view.View;
import com.okinc.business.defi.wallet.mine.data.EosSelectPayMethod;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fkv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18574fkv extends AbstractC52786wYh {
    public final java.util.List<EosSelectPayMethod> EZpvd;
    public final yHO<C55276xgr, C55276xgr, C55276xgr, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super o.xgr, ? super o.xgr, ? super o.xgr, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C18574fkv(@NotNull java.util.List<EosSelectPayMethod> list, yHO<? super C55276xgr, ? super C55276xgr, ? super C55276xgr, Unit> yho) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.OLrzqt = yho;
    }

    public C18574fkv() {
        this(yDY.AhwBna(), null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RihMUf));
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.fku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18574fkv.OLrzqt(this.KWHzl, view);
            }
        });
        wxq.setDividerVisibility(true);
    }

    public static final void OLrzqt(C18574fkv c18574fkv, android.view.View view) {
        c18574fkv.dismissAllowingStateLoss();
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        C10854bwM c10854bwMAEQbTJ;
        java.lang.String strDjBIcL;
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        java.util.List<EosSelectPayMethod> list = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (EosSelectPayMethod eosSelectPayMethod : list) {
            C10849bwH payMethod = eosSelectPayMethod.getPayMethod();
            java.lang.String str = (payMethod == null || (strEZpvd = payMethod.EZpvd()) == null) ? "" : strEZpvd;
            C10849bwH payMethod2 = eosSelectPayMethod.getPayMethod();
            java.lang.String str2 = (payMethod2 == null || (strDjBIcL = payMethod2.djBIcL()) == null) ? "" : strDjBIcL;
            boolean zIsSelect = eosSelectPayMethod.isSelect();
            C10849bwH payMethod3 = eosSelectPayMethod.getPayMethod();
            arrayList.add(new C55276xgr(str, eosSelectPayMethod, str2, zIsSelect, false, (payMethod3 == null || (c10854bwMAEQbTJ = payMethod3.AEQbTJ()) == null) ? null : c10854bwMAEQbTJ.DbNXlk(), null, 80, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, this.OLrzqt);
    }
}
