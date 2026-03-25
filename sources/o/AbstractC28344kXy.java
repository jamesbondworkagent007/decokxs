package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.PriorityParam;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28344kXy extends AbstractC33073mpa {
    public final MutableLiveData<java.lang.String> copydefault = new MutableLiveData<>();
    public int KWHzl = PriorityFeeType.PriorityMarket.getValue();
    public int EZpvd = SlippageFeeType.SlippageLow.getValue();

    public final java.lang.String OLrzqt(int i) {
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return DexTrackEventParameter.ButtonName.FEE_LOW.getValue();
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return DexTrackEventParameter.ButtonName.FEE_MID.getValue();
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return DexTrackEventParameter.ButtonName.FEE_HIGH.getValue();
        }
        if (i == PriorityFeeType.PriorityCustom.getValue()) {
            return DexTrackEventParameter.ButtonName.FEE_CUSTOM.getValue();
        }
        return DexTrackEventParameter.ButtonName.FEE_LOW.getValue();
    }

    public final void AEQbTJ(@NotNull PriorityParam priorityParam, BuySellPreset buySellPreset, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(priorityParam, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = priorityParam.getPriorityType();
        if (buySellPreset != null) {
            this.EZpvd = buySellPreset.getSlippageConfig().getSlippageType();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MemeTransactionSceneType.Limit.getValue());
            FeeConfig feeConfig = buySellPreset.getFeeConfig();
            for (FeeOption feeOption : zEZpvd ? feeConfig.getLimitOrderFeeOptions() : feeConfig.getFeeOptions()) {
                feeOption.setSelected(priorityParam.getPriorityType() == feeOption.getFeeLevel());
                if (priorityParam.getPriorityType() == feeOption.getFeeLevel()) {
                    feeOption.setFeeValue(priorityParam.getValue());
                }
            }
        }
        this.copydefault.setValue(OLrzqt(priorityParam.getPriorityType()));
    }
}
