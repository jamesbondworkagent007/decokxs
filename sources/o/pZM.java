package o;

import com.okinc.market.discover.features.markets.boost.data.po.BoostBannerPo;
import com.okinc.market.discover.features.markets.boost.data.po.CedefiBoostPo;
import com.okinc.market.discover.features.markets.boost.domain.usecase.GetCedefiBoostUseCase$onExecute$1;
import java.util.Date;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pZM extends AbstractC49400uno<Unit, pZW> {
    public final pZL AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public pZM(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull pZL pzl) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(pzl, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = pzl;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super pZW> continuation) throws java.lang.Throwable {
        GetCedefiBoostUseCase$onExecute$1 getCedefiBoostUseCase$onExecute$1;
        pZM pzm;
        java.util.List listAhwBna;
        if (continuation instanceof GetCedefiBoostUseCase$onExecute$1) {
            getCedefiBoostUseCase$onExecute$1 = (GetCedefiBoostUseCase$onExecute$1) continuation;
            int i = getCedefiBoostUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCedefiBoostUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getCedefiBoostUseCase$onExecute$1 = new GetCedefiBoostUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = getCedefiBoostUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getCedefiBoostUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            pZL pzl = this.AEQbTJ;
            getCedefiBoostUseCase$onExecute$1.L$0 = this;
            getCedefiBoostUseCase$onExecute$1.label = 1;
            objAEQbTJ = pzl.AEQbTJ(getCedefiBoostUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            pzm = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pzm = (pZM) getCedefiBoostUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        CedefiBoostPo cedefiBoostPo = (CedefiBoostPo) objAEQbTJ;
        if (cedefiBoostPo != null) {
            java.util.List<BoostBannerPo> bannerList = cedefiBoostPo.getBannerList();
            if (bannerList == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(bannerList, 10));
                java.util.Iterator<T> it = bannerList.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(pzm.copydefault((BoostBannerPo) it.next(), cedefiBoostPo.getSeverTimestamp()));
                }
            }
            if (listAhwBna == null) {
            }
        } else {
            listAhwBna = yDY.AhwBna();
        }
        return new pZW(listAhwBna);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pZT copydefault(@NotNull BoostBannerPo boostBannerPo, long j) {
        C40432qVq c40432qVq;
        int i;
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(boostBannerPo, "");
        long jOLrzqt = C40439qVx.AEQbTJ.OLrzqt(j);
        pUU.KWHzl("MarketBoostBanner", "currentTime " + pTA.formatSimpleDate$default(new Date(jOLrzqt), null, 1, null));
        if (boostBannerPo.getJoinStartTime() != 0 || boostBannerPo.getJoinEndTime() != 0 || boostBannerPo.getClaimStartTime() != 0 || boostBannerPo.getClaimEndTime() != 0 || boostBannerPo.getEndTime() != 0) {
            if (jOLrzqt < boostBannerPo.getJoinStartTime()) {
                c40432qVq = new C40432qVq(boostBannerPo.getJoinStartTime(), jOLrzqt);
                pUU.KWHzl("MarketBoostBanner", "refreshTime " + pTA.formatSimpleDate$default(new Date(boostBannerPo.getJoinStartTime()), null, 1, null));
                i = 1;
            } else {
                long joinStartTime = boostBannerPo.getJoinStartTime();
                if (jOLrzqt < boostBannerPo.getJoinEndTime() && joinStartTime <= jOLrzqt) {
                    c40432qVq = new C40432qVq(boostBannerPo.getJoinEndTime(), jOLrzqt);
                    pUU.KWHzl("MarketBoostBanner", "refreshTime " + pTA.formatSimpleDate$default(new Date(boostBannerPo.getJoinEndTime()), null, 1, null));
                    i = 2;
                } else {
                    long joinEndTime = boostBannerPo.getJoinEndTime();
                    if (jOLrzqt < boostBannerPo.getClaimStartTime() && joinEndTime <= jOLrzqt) {
                        c40432qVq = new C40432qVq(boostBannerPo.getClaimStartTime(), jOLrzqt);
                        pUU.KWHzl("MarketBoostBanner", "refreshTime " + pTA.formatSimpleDate$default(new Date(boostBannerPo.getClaimStartTime()), null, 1, null));
                        i = 3;
                    } else {
                        long claimStartTime = boostBannerPo.getClaimStartTime();
                        if (jOLrzqt < boostBannerPo.getClaimEndTime() && claimStartTime <= jOLrzqt) {
                            c40432qVq = new C40432qVq(boostBannerPo.getClaimEndTime(), jOLrzqt);
                            pUU.KWHzl("MarketBoostBanner", "refreshTime " + pTA.formatSimpleDate$default(new Date(boostBannerPo.getClaimEndTime()), null, 1, null));
                            i = 4;
                        } else if (jOLrzqt >= boostBannerPo.getClaimEndTime()) {
                            pUU.KWHzl("MarketBoostBanner", "refreshTime " + pTA.formatSimpleDate$default(new Date(boostBannerPo.getClaimEndTime()), null, 1, null));
                            c40432qVq = null;
                            i = 6;
                        } else {
                            i = 0;
                            c40432qVq = null;
                        }
                    }
                }
            }
        }
        if (i == 0) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.iPSTqm), "");
        } else if (i == 1) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.zKcAg), C33070mpX.AYXKKw(qZH.PendingIntent.gmHjFq));
        } else if (i != 2) {
            if (i == 3) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.hvKCwS), C33070mpX.AYXKKw(qZH.PendingIntent.gmHjFq));
            } else if (i != 4) {
                if (i == 6) {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.tIwhY), C33070mpX.AYXKKw(qZH.PendingIntent.gmHjFq));
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.iPSTqm), C33070mpX.AYXKKw(qZH.PendingIntent.gmHjFq));
                }
            } else if (boostBannerPo.getJoined()) {
                if (boostBannerPo.getClaimed()) {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.swzYdv), C33070mpX.AYXKKw(qZH.PendingIntent.hlkKmr));
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.swzYdv), C33070mpX.AYXKKw(qZH.PendingIntent.gSBher));
                }
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.sTzBva), C33070mpX.AYXKKw(qZH.PendingIntent.gmHjFq));
            }
        } else if (boostBannerPo.getJoined()) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.sVXHln), C33070mpX.AYXKKw(qZH.PendingIntent.fsSxsn));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(qZH.PendingIntent.vLaW), C33070mpX.AYXKKw(qZH.PendingIntent.gUEfcq));
        }
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        java.lang.String str = (java.lang.String) pairOLrzqt.component2();
        long id = boostBannerPo.getId();
        Triple tripleCopydefault = C49380unU.copydefault(C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(iIntValue)), c40432qVq);
        java.lang.String title = boostBannerPo.getTitle();
        java.lang.String str2 = title == null ? "" : title;
        java.lang.String wideBanner = boostBannerPo.getWideBanner();
        return new pZT(id, tripleCopydefault, str2, str, wideBanner == null ? "" : wideBanner, null, c40432qVq, 32, null);
    }
}
