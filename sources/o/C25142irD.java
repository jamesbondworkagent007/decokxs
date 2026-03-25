package o;

import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25142irD extends C59534zip {
    public static /* synthetic */ void register$default(C25142irD c25142irD, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c25142irD.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        register(TransactionHeaderInfoBean.class, new C25159irU(z));
        register(C25410iwG.class, new C25162irX());
        register(C25411iwH.class, new C25221isd());
        register(C25147irI.class, new C25222ise());
        register(C25407iwD.class, new C25223isf());
        register(TransactionAddressInfoBean.class, new C25233isp());
        register(C25143irE.class, new C25232iso());
        register(C25408iwE.class, new C25231isn());
        register(C25146irH.class, new C25156irR());
        register(TransactionGeneralInfoBean.class, new C25158irT());
        register(TransactionGeneralInfoBean.class, new C25224isg());
        register(TransactionGeneralInfoBean.class, new C25220isc());
        register(C25148irJ.class, new C25157irS());
        register(C25145irG.class, new C25219isb());
        register(C25409iwF.class, new C25163irY());
        register(C25151irM.class, new C25160irV());
        register(C25154irP.class, new C25230ism());
        register(C25149irK.class, new C25225ish());
        register(C25155irQ.class, new C25227isj());
        register(C25150irL.class, new C25229isl());
        register(C25144irF.class, new C25152irN());
    }

    public final void KWHzl(@NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        setItems(list);
        notifyDataSetChanged();
    }
}
