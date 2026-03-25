package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.BhD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oQW {
    public static final MarketEventResp.BigEventPo OLrzqt(@NotNull C4526Bhi c4526Bhi) {
        Intrinsics.checkNotNullParameter(c4526Bhi, "");
        return new MarketEventResp.BigEventPo(c4526Bhi.AYXKKw(), c4526Bhi.OLrzqt(), c4526Bhi.AkhnZx(), c4526Bhi.DbNXlk(), c4526Bhi.copydefault(), c4526Bhi.values(), c4526Bhi.AhwBna(), c4526Bhi.KWHzl(), c4526Bhi.gEmmrt(), c4526Bhi.fetchVPNInfo(), c4526Bhi.valueOf(), c4526Bhi.djBIcL(), c4526Bhi.AEQbTJ(), c4526Bhi.EZpvd());
    }

    public static final MarketEventsVo copydefault(@NotNull BhD bhD) {
        Intrinsics.checkNotNullParameter(bhD, "");
        if (bhD instanceof BhD.StateListAnimator) {
            return new MarketEventsVo.TaskDescription(((BhD.StateListAnimator) bhD).KWHzl());
        }
        if (!(bhD instanceof BhD.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        BhD.TaskDescription taskDescription = (BhD.TaskDescription) bhD;
        return new MarketEventsVo.Content(OLrzqt(taskDescription.djBIcL()), taskDescription.AEQbTJ(), taskDescription.EZpvd(), taskDescription.valueOf(), taskDescription.AYXKKw(), taskDescription.copydefault(), taskDescription.gEmmrt(), taskDescription.KWHzl(), taskDescription.OLrzqt());
    }

    public static final java.util.List<MarketEventsVo> KWHzl(@NotNull BhA bhA) {
        Intrinsics.checkNotNullParameter(bhA, "");
        java.util.List<BhD> listAEQbTJ = bhA.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((BhD) it.next()));
        }
        return arrayList;
    }

    public static final C4526Bhi copydefault(@NotNull MarketEventResp.BigEventPo bigEventPo) {
        Intrinsics.checkNotNullParameter(bigEventPo, "");
        return new C4526Bhi(bigEventPo.getInstId(), bigEventPo.getType(), bigEventPo.getTimeStamp(), bigEventPo.getTag(), bigEventPo.getEventDetail(), bigEventPo.getTypeTitle(), bigEventPo.getSourceCount(), bigEventPo.getExplanation(), bigEventPo.getStatement(), bigEventPo.getSummaryContentId(), bigEventPo.getNewTitle(), bigEventPo.getNewContent(), bigEventPo.getAddress(), bigEventPo.getAuthorList());
    }

    public static final BhD AEQbTJ(@NotNull MarketEventsVo marketEventsVo) {
        Intrinsics.checkNotNullParameter(marketEventsVo, "");
        if (marketEventsVo instanceof MarketEventsVo.TaskDescription) {
            return new BhD.StateListAnimator(((MarketEventsVo.TaskDescription) marketEventsVo).OLrzqt());
        }
        if (!(marketEventsVo instanceof MarketEventsVo.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        MarketEventsVo.Content content = (MarketEventsVo.Content) marketEventsVo;
        return new BhD.TaskDescription(copydefault(content.djBIcL()), content.copydefault(), content.EZpvd(), content.AYXKKw(), content.AhwBna(), content.AEQbTJ(), content.gEmmrt(), content.KWHzl(), content.OLrzqt());
    }

    public static final java.util.List<BhD> KWHzl(@NotNull java.util.List<? extends MarketEventsVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ((MarketEventsVo) it.next()));
        }
        return arrayList;
    }
}
