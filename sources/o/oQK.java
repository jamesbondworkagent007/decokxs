package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C36242oUn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oQK extends AbstractC36244oUp<MarketEventsVo> implements C36242oUn.ActionBar {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C36242oUn.ActionBar
    public int OLrzqt(int i) {
        return C35964oKf.Application.OxVOHk;
    }

    public static final class ActionBar extends DiffUtil.ItemCallback<MarketEventsVo> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(MarketEventsVo marketEventsVo, MarketEventsVo marketEventsVo2) {
            Intrinsics.checkNotNullParameter(marketEventsVo, "");
            Intrinsics.checkNotNullParameter(marketEventsVo2, "");
            return Intrinsics.EZpvd(marketEventsVo, marketEventsVo2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(MarketEventsVo marketEventsVo, MarketEventsVo marketEventsVo2) {
            Intrinsics.checkNotNullParameter(marketEventsVo, "");
            Intrinsics.checkNotNullParameter(marketEventsVo2, "");
            return Intrinsics.EZpvd(marketEventsVo, marketEventsVo2);
        }
    }

    @Override // o.C36242oUn.ActionBar
    public int KWHzl(int i) {
        while (!AEQbTJ(i)) {
            i--;
            if (i < 0) {
                return 0;
            }
        }
        return i;
    }

    @Override // o.C36242oUn.ActionBar
    public void KWHzl(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        MarketEventsVo marketEventsVo = EZpvd().get(i);
        if (marketEventsVo instanceof MarketEventsVo.TaskDescription) {
            C36042oNc.AEQbTJ(view).KWHzl.setText(oQQ.KWHzl(((MarketEventsVo.TaskDescription) marketEventsVo).OLrzqt()));
        }
    }

    @Override // o.C36242oUn.ActionBar
    public boolean AEQbTJ(int i) {
        return EZpvd().get(i) instanceof MarketEventsVo.TaskDescription;
    }

    @Override // o.C36242oUn.ActionBar
    public boolean KWHzl() {
        java.util.List<MarketEventsVo> listEZpvd = EZpvd();
        if (!(listEZpvd instanceof java.util.Collection) || !listEZpvd.isEmpty()) {
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                if (((MarketEventsVo) it.next()) instanceof MarketEventsVo.TaskDescription) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oQK(@NotNull InterfaceC36144oQx interfaceC36144oQx) {
        super(new ActionBar());
        Intrinsics.checkNotNullParameter(interfaceC36144oQx, "");
        register(MarketEventsVo.TaskDescription.class, new C36153oRf());
        register(MarketEventsVo.Content.class, new C36150oRc(interfaceC36144oQx));
    }
}
