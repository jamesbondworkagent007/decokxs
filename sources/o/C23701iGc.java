package o;

import com.okinc.business.invest_biz.data.bean.InvestDetail;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC26470jct;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iGc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23701iGc {
    public static final InterfaceC26470jct.ActionBar AEQbTJ(@NotNull C25542iyg c25542iyg) {
        Intrinsics.checkNotNullParameter(c25542iyg, "");
        java.util.List<InvestDetail> listAEQbTJ = c25542iyg.AEQbTJ();
        if (listAEQbTJ == null) {
            listAEQbTJ = yDY.AhwBna();
        }
        return new InterfaceC26470jct.ActionBar(listAEQbTJ);
    }
}
