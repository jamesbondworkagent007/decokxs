package o;

import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hLJ {
    public final C22495hgT AEQbTJ;

    public hLJ(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.AEQbTJ = c22495hgT;
    }

    public final void AEQbTJ(@NotNull LimitCalResult limitCalResult) {
        TradeInputGroup data;
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        ConsumeData<TradeInputGroup> value = this.AEQbTJ.getPostValueLengthLimit().getValue();
        TradeInputGroup limitInputSellAmount = (value == null || (data = value.getData()) == null) ? null : data.setLimitInputSellAmount(limitCalResult);
        this.AEQbTJ.getPostValueLengthLimit().setValue(limitInputSellAmount != null ? C22332hdP.EZpvd(limitInputSellAmount) : null);
    }
}
