package o;

import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.ChargeGroupData;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55634xne {
    public static final int KWHzl;
    public static final TreeMap<java.lang.String, java.lang.String> djBIcL;
    public static final C55634xne copydefault = new C55634xne();
    public static final java.lang.String OLrzqt = "preference_select_position_key";
    public static final java.lang.String AEQbTJ = "preference_select_position_value";
    public static final java.lang.String EZpvd = "preference_select_position_file";

    private C55634xne() {
    }

    static {
        TreeMap<java.lang.String, java.lang.String> treeMap = new TreeMap<>();
        treeMap.put("USDT", "USDT");
        treeMap.put("USDC", "USDC");
        treeMap.put("USDⓈ", "USDS");
        treeMap.put("Crypto", "Crypto");
        djBIcL = treeMap;
        KWHzl = 8;
    }

    public final int KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        java.util.List<ChargeGroupData> listAEQbTJ = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.AEQbTJ() : null;
        if (listAEQbTJ != null) {
            int i = 0;
            for (java.lang.Object obj : listAEQbTJ) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ChargeGroupData) obj).getName())) {
                    return i;
                }
                i++;
            }
        }
        return Intrinsics.EZpvd((java.lang.Object) qTC.copydefault.AEQbTJ(), (java.lang.Object) "USDC") ? 1 : 0;
    }

    public final java.lang.String OLrzqt() {
        java.lang.String string = SPUtils.getString(AEQbTJ, "USDT", EZpvd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String KWHzl() {
        java.lang.String name;
        java.lang.String strOLrzqt = OLrzqt();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        java.lang.Object obj = null;
        java.util.List<ChargeGroupData> listAEQbTJ = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.AEQbTJ() : null;
        if (listAEQbTJ == null) {
            return strOLrzqt;
        }
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ChargeGroupData) next).getKey(), (java.lang.Object) strOLrzqt)) {
                obj = next;
                break;
            }
        }
        ChargeGroupData chargeGroupData = (ChargeGroupData) obj;
        return (chargeGroupData == null || (name = chargeGroupData.getName()) == null) ? strOLrzqt : name;
    }
}
