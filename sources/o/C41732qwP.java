package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.market.ranking.features.main.ui.sub.list.spot.RankingNewListingsSpotFragment$registerSubscribers$2;
import com.okinc.market.ranking.features.main.ui.sub.list.spot.RankingNewListingsSpotFragment$startTimer$1;
import com.okinc.market.ranking.features.main.viewmodel.RankingViewModel;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.qZH;

/* JADX INFO: renamed from: o.qwP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41732qwP extends AbstractC41759qwq {
    public Job EZpvd;

    @Override // o.AbstractC41759qwq
    public boolean AhwBna() {
        return false;
    }

    @Override // o.AbstractC41759qwq
    public java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(qZH.PendingIntent.svY);
    }

    @Override // o.AbstractC41759qwq
    public void djBIcL() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, isConnected(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.ranking.features.main.ui.sub.list.spot.RankingNewListingsSpotFragment$registerSubscribers$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((RankingViewModel.ActionBar) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((RankingViewModel.ActionBar) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        }, null, new RankingNewListingsSpotFragment$registerSubscribers$2(this, null), 2, null);
    }

    public final void EZpvd() {
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.EZpvd = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new RankingNewListingsSpotFragment$startTimer$1(this, null), 3, null);
    }

    @Override // o.AbstractC41759qwq, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(this);
        if (interfaceC41634quXEZpvd != null) {
            interfaceC41634quXEZpvd.OLrzqt(OtpEventTracker.OTP_EVENT_VALUE_NEW, "spot", valueOf().KWHzl().getTrackEvent());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    @Override // o.AbstractC41759qwq
    public void gEmmrt() {
        RankingViewModel.loadNewCoinRankData$OKMarket_market_impl$default(isConnected(), null, 1, null);
    }
}
