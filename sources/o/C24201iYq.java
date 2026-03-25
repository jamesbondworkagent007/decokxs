package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.iZU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24201iYq {
    @yCM
    public C24201iYq() {
    }

    public final C27364jtm copydefault(@NotNull C23666iEv c23666iEv) {
        Intrinsics.checkNotNullParameter(c23666iEv, "");
        return KWHzl(c23666iEv, C56424yEw.KWHzl());
    }

    public final C27364jtm KWHzl(@NotNull C23666iEv c23666iEv, @NotNull java.util.Map<java.lang.String, iDV> map) {
        Intrinsics.checkNotNullParameter(c23666iEv, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<iEE> listOLrzqt = c23666iEv.OLrzqt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (iEE iee : listOLrzqt) {
            iDV idv = map.get(C23663iEs.KWHzl(iee.AYXKKw(), iee.EZpvd()));
            boolean z = idv != null;
            arrayList2.add(new C27369jtr(iee.AYXKKw(), iee.EZpvd(), iee.OLrzqt(), iee.AEQbTJ(), iee.valueOf(), iee.AhwBna(), iee.KWHzl(), iee.copydefault(), iee.djBIcL(), z, (!z || idv == null) ? null : new iZU.Activity(idv), false, iee.gEmmrt(), C27488jwD.copydefault.KWHzl(C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(iee.gEmmrt()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : DisplaySign.EXCEPT_ZERO, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null)), 2048, null));
        }
        arrayList.addAll(arrayList2);
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            arrayList.add(new C27433jvB(32.0f));
        }
        return new C27364jtm(c23666iEv.KWHzl(), arrayList);
    }
}
