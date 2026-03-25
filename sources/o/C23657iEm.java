package o;

import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsByAccount;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import com.okinc.business.invest_biz.data.bean.response.ProtocolExtraData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23657iEm {
    public final C23658iEn AEQbTJ;
    public final C23661iEq EZpvd;
    public final C23660iEp KWHzl;
    public final C23656iEl copydefault;

    @yCM
    public C23657iEm(@NotNull C23656iEl c23656iEl, @NotNull C23658iEn c23658iEn, @NotNull C23661iEq c23661iEq, @NotNull C23660iEp c23660iEp) {
        Intrinsics.checkNotNullParameter(c23656iEl, "");
        Intrinsics.checkNotNullParameter(c23658iEn, "");
        Intrinsics.checkNotNullParameter(c23661iEq, "");
        Intrinsics.checkNotNullParameter(c23660iEp, "");
        this.copydefault = c23656iEl;
        this.AEQbTJ = c23658iEn;
        this.EZpvd = c23661iEq;
        this.KWHzl = c23660iEp;
    }

    public final iEC KWHzl(@NotNull ProtocolDetailsResponse protocolDetailsResponse) {
        iEL ielCopydefault;
        java.util.List listAhwBna;
        java.util.List listAhwBna2;
        java.util.List<MarketInvestTokenInfo> listOLrzqt;
        java.util.List<InvestedToken> listAEQbTJ;
        ProtocolExtraData protocolExtraDataKWHzl;
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        iEK iekCopydefault = this.copydefault.copydefault(protocolDetailsResponse);
        ProtocolDetailsByAccount protocolDetailsByAccount = (ProtocolDetailsByAccount) CollectionsKt___CollectionsKt.firstOrNull(protocolDetailsResponse.EZpvd());
        if (protocolDetailsByAccount == null || (protocolExtraDataKWHzl = protocolDetailsByAccount.KWHzl()) == null || (ielCopydefault = this.AEQbTJ.copydefault(protocolExtraDataKWHzl)) == null) {
            ielCopydefault = iEL.Companion.copydefault();
        }
        ProtocolDetailsByAccount protocolDetailsByAccount2 = (ProtocolDetailsByAccount) CollectionsKt___CollectionsKt.firstOrNull(protocolDetailsResponse.EZpvd());
        if (protocolDetailsByAccount2 == null || (listAEQbTJ = protocolDetailsByAccount2.AEQbTJ()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                listAhwBna.add(this.EZpvd.copydefault(protocolDetailsResponse, (InvestedToken) it.next()));
            }
        }
        ProtocolDetailsByAccount protocolDetailsByAccount3 = (ProtocolDetailsByAccount) CollectionsKt___CollectionsKt.firstOrNull(protocolDetailsResponse.EZpvd());
        if (protocolDetailsByAccount3 == null || (listOLrzqt = protocolDetailsByAccount3.OLrzqt()) == null) {
            listAhwBna2 = yDY.AhwBna();
        } else {
            listAhwBna2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            java.util.Iterator<T> it2 = listOLrzqt.iterator();
            while (it2.hasNext()) {
                listAhwBna2.add(this.KWHzl.OLrzqt(protocolDetailsResponse, (MarketInvestTokenInfo) it2.next()));
            }
        }
        return new iEC(iekCopydefault, ielCopydefault, listAhwBna, listAhwBna2);
    }
}
