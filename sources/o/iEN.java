package o;

import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEN implements iEO {
    public final java.util.Map<java.lang.Long, InvestProductDetailResponse> AEQbTJ = new LinkedHashMap();
    public final java.util.Map<java.lang.Long, C23673iFb> OLrzqt = new LinkedHashMap();
    public final java.util.Map<java.lang.Long, InvestmentBonusInfo> EZpvd = new LinkedHashMap();
    public final java.util.Map<java.lang.Long, java.util.List<InvestUserAssetDetailByInvestment>> copydefault = new LinkedHashMap();

    @yCM
    public iEN() {
    }

    @Override // o.iEO
    public java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        this.AEQbTJ.clear();
        this.OLrzqt.clear();
        this.EZpvd.clear();
        this.copydefault.clear();
        return Unit.INSTANCE;
    }

    @Override // o.iEO
    public java.lang.Object copydefault(long j, @NotNull InvestProductDetailResponse investProductDetailResponse, @NotNull Continuation<? super Unit> continuation) {
        this.AEQbTJ.put(C56443yFo.KWHzl(j), investProductDetailResponse);
        return Unit.INSTANCE;
    }

    @Override // o.iEO
    public java.lang.Object OLrzqt(long j, @NotNull Continuation<? super InvestProductDetailResponse> continuation) {
        return this.AEQbTJ.get(C56443yFo.KWHzl(j));
    }

    @Override // o.iEO
    public java.lang.Object EZpvd(long j, @NotNull C23673iFb c23673iFb, @NotNull Continuation<? super Unit> continuation) {
        this.OLrzqt.put(C56443yFo.KWHzl(j), c23673iFb);
        return Unit.INSTANCE;
    }

    @Override // o.iEO
    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super C23673iFb> continuation) {
        return this.OLrzqt.get(C56443yFo.KWHzl(j));
    }

    @Override // o.iEO
    public java.lang.Object copydefault(long j, @NotNull Continuation<? super Unit> continuation) {
        this.OLrzqt.remove(C56443yFo.KWHzl(j));
        this.copydefault.remove(C56443yFo.KWHzl(j));
        this.EZpvd.remove(C56443yFo.KWHzl(j));
        this.AEQbTJ.remove(C56443yFo.KWHzl(j));
        return Unit.INSTANCE;
    }

    @Override // o.iEO
    public java.lang.Object KWHzl(long j, @NotNull InvestmentBonusInfo investmentBonusInfo, @NotNull Continuation<? super Unit> continuation) {
        this.EZpvd.put(C56443yFo.KWHzl(j), investmentBonusInfo);
        return Unit.INSTANCE;
    }

    @Override // o.iEO
    public java.lang.Object EZpvd(long j, @NotNull Continuation<? super InvestmentBonusInfo> continuation) {
        return this.EZpvd.get(C56443yFo.KWHzl(j));
    }

    @Override // o.iEO
    public java.lang.Object EZpvd(long j, @NotNull java.util.List<InvestUserAssetDetailByInvestment> list, @NotNull Continuation<? super Unit> continuation) {
        this.copydefault.put(C56443yFo.KWHzl(j), list);
        return Unit.INSTANCE;
    }

    @Override // o.iEO
    public java.lang.Object KWHzl(long j, @NotNull Continuation<? super java.util.List<InvestUserAssetDetailByInvestment>> continuation) {
        return this.copydefault.get(C56443yFo.KWHzl(j));
    }
}
