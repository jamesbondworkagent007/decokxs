package o;

import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o.InterfaceC9739bbK;

/* JADX INFO: renamed from: o.iBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23580iBq {
    public static final C23580iBq AEQbTJ = new C23580iBq();

    private C23580iBq() {
    }

    public final java.util.List<InvestWalletAddressInfo> AEQbTJ() {
        java.util.List<InterfaceC9780bbz> listEZpvd;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = OLrzqt();
        if (interfaceC9738bbJOLrzqt2 == null || (listEZpvd = interfaceC9738bbJOLrzqt2.EZpvd()) == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList<InterfaceC9780bbz> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (((InterfaceC9780bbz) obj).getAddress().length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (InterfaceC9780bbz interfaceC9780bbz : arrayList) {
            arrayList2.add(new InvestWalletAddressInfo(java.lang.Long.valueOf(interfaceC9780bbz.getChainId()), interfaceC9780bbz.getAddress(), (interfaceC9780bbz.getChainId() != 0 || (interfaceC9738bbJOLrzqt = AEQbTJ.OLrzqt()) == null) ? null : interfaceC9738bbJOLrzqt.EZpvd(interfaceC9780bbz.getAddress())));
        }
        return arrayList2;
    }

    public final java.lang.String copydefault() {
        java.lang.String strDbNXlk;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
        return (interfaceC9738bbJOLrzqt == null || (strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk()) == null) ? "" : strDbNXlk;
    }

    public final boolean AhwBna() {
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2;
        return (OLrzqt() == null || (interfaceC9738bbJOLrzqt = OLrzqt()) == null || interfaceC9738bbJOLrzqt.zsXlph() || (interfaceC9738bbJOLrzqt2 = OLrzqt()) == null || interfaceC9738bbJOLrzqt2.QfsBiF()) ? false : true;
    }

    public final InterfaceC9738bbJ OLrzqt() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().copydefault());
    }

    public final AbstractC58260yxt<InterfaceC9738bbJ> EZpvd() {
        return ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().KWHzl();
    }

    public final AbstractC58185ywX<java.lang.Boolean> KWHzl() {
        return InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).AhwBna(), false, 1, null);
    }
}
