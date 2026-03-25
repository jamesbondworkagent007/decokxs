package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hLK {
    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData);

    public static /* synthetic */ void coinChangeFinish$default(hLK hlk, java.lang.String str, java.lang.String str2, MutableLiveData mutableLiveData, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: coinChangeFinish");
        }
        if ((i & 2) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        hlk.KWHzl(str, str2, mutableLiveData);
    }
}
