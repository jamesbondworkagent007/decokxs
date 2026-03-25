package o;

import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27355jtd {
    public static final InterfaceC27286jsN KWHzl(@NotNull AbstractC27371jtt abstractC27371jtt) {
        Intrinsics.checkNotNullParameter(abstractC27371jtt, "");
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = C23580iBq.AEQbTJ.OLrzqt();
        if ((interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.QfsBiF()) || C24193iYi.OLrzqt.AEQbTJ()) {
            return InterfaceC27286jsN.Application.KWHzl;
        }
        if (abstractC27371jtt.AYXKKw() != 0 && (abstractC27371jtt.values() == 1 || abstractC27371jtt.values() == 2)) {
            return new InterfaceC27286jsN.ActionBar(abstractC27371jtt.AYXKKw(), "", java.lang.Long.valueOf(abstractC27371jtt.AEQbTJ()), null, java.lang.Integer.valueOf(InvestmentKind.Default.getValue()));
        }
        if (abstractC27371jtt.AYXKKw() == 0) {
            if (abstractC27371jtt.values() == 1 && abstractC27371jtt.djBIcL() != null) {
                InvestedToken investedTokenDjBIcL = abstractC27371jtt.djBIcL();
                Intrinsics.copydefault(investedTokenDjBIcL);
                return new InterfaceC27286jsN.LoaderManager(investedTokenDjBIcL, abstractC27371jtt.AkhnZx(), abstractC27371jtt.fetchVPNInfo(), abstractC27371jtt.AEQbTJ());
            }
            if (abstractC27371jtt.values() == 2 && C33129mqd.OLrzqt((java.lang.CharSequence) abstractC27371jtt.ejfBZ())) {
                return new InterfaceC27286jsN.TaskDescription(abstractC27371jtt.ejfBZ());
            }
            return InterfaceC27286jsN.Application.KWHzl;
        }
        return InterfaceC27286jsN.Application.KWHzl;
    }
}
