package o;

import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.features.main.ui.sub.list.spot.RankingMarketCapFragment$registerSubscribers$2;
import com.okinc.market.ranking.features.main.viewmodel.RankingViewModel;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.qZH;

/* JADX INFO: renamed from: o.qwM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41729qwM extends AbstractC41717qwA {
    @Override // o.AbstractC41759qwq
    public boolean AhwBna() {
        return false;
    }

    @Override // o.AbstractC41759qwq
    public java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(qZH.PendingIntent.DcMfJKDDUqPf);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.unB.Activity.collectLatestOnLifecycle$default(o.unB, o.unz, o.yJx, androidx.lifecycle.Lifecycle$State, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    @Override // o.AbstractC41759qwq
    public void djBIcL() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, isConnected(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.ranking.features.main.ui.sub.list.spot.RankingMarketCapFragment$registerSubscribers$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((RankingViewModel.ActionBar) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((RankingViewModel.ActionBar) obj).KWHzl((InterfaceC49371unL<? extends List<RankingHotCryptoVo>>) obj2);
            }
        }, null, new RankingMarketCapFragment$registerSubscribers$2(this, null), 2, null);
    }

    @Override // o.AbstractC41759qwq, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(this);
        if (interfaceC41634quXEZpvd != null) {
            interfaceC41634quXEZpvd.OLrzqt(AkhnZx().getTrackSubType(), "", valueOf().KWHzl().getTrackEvent());
        }
    }

    @Override // o.AbstractC41759qwq
    public void gEmmrt() {
        isConnected().copydefault(valueOf());
    }
}
