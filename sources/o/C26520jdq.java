package o;

import androidx.profileinstaller.ProfileVerifier;
import com.okinc.business.invest_biz.data.bean.AggregateItem;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.response.RewardCryptos;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26520jdq {
    @yCM
    public C26520jdq() {
    }

    public final C26523jdt OLrzqt(@NotNull AggregateItem aggregateItem) {
        Intrinsics.checkNotNullParameter(aggregateItem, "");
        return new C26523jdt(new C26526jdw(aggregateItem.EZpvd(), aggregateItem.AhwBna(), aggregateItem.fetchVPNInfo(), aggregateItem.AkhnZx(), aggregateItem.DbNXlk(), aggregateItem.values(), aggregateItem.iwGUEr(), aggregateItem.AuCTel(), aggregateItem.fARcdN(), aggregateItem.hDKMBd(), aggregateItem.AhwBna(), yDY.AhwBna(), aggregateItem.djBIcL(), aggregateItem.isConnected(), true, aggregateItem.gEmmrt(), null, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, null), KWHzl(aggregateItem));
    }

    public final C27338jtM KWHzl(AggregateItem aggregateItem) {
        java.lang.String strOLrzqt;
        java.util.ArrayList arrayList;
        java.util.List<InvestTokenWithAmount> listAEQbTJ;
        RewardCryptos rewardCryptosEjfBZ = aggregateItem.ejfBZ();
        if (rewardCryptosEjfBZ == null || (strOLrzqt = rewardCryptosEjfBZ.OLrzqt()) == null) {
            strOLrzqt = "0";
        }
        java.lang.String str = strOLrzqt;
        RewardCryptos rewardCryptosEjfBZ2 = aggregateItem.ejfBZ();
        if (rewardCryptosEjfBZ2 == null || (listAEQbTJ = rewardCryptosEjfBZ2.AEQbTJ()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (InvestTokenWithAmount investTokenWithAmount : listAEQbTJ) {
                arrayList.add(new InvestLogoBaseVo(investTokenWithAmount.getTokenLogo(), investTokenWithAmount.getTokenName()));
            }
        }
        return new C27338jtM(str, new InvestLogo((java.util.List) null, arrayList, (java.util.List) null, (java.util.List) null, 13, (DefaultConstructorMarker) null), aggregateItem.AYXKKw(), C33129mqd.valueOf(aggregateItem.copydefault()), C33129mqd.valueOf(aggregateItem.AEQbTJ()), aggregateItem.KWHzl());
    }
}
