package com.okinc.business.dexlogic.main.swap.coinlist;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C22593hiL;
import o.InterfaceC22600hiS;
import o.kUH;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SelectNetWorkViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<InterfaceC22600hiS> AEQbTJ;
    public boolean EZpvd;
    public final kUH KWHzl;
    public final StateFlow<InterfaceC22600hiS> OLrzqt;
    public String copydefault;
    public NetworkSource valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NetworkSource.values().length];
            try {
                iArr[NetworkSource.Single.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkSource.Swap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkSource.Limit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkSource.Bridge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkSource.CopyTrading.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NetworkSource.All.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NetworkSource.Market.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC22600hiS> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull NetworkSource networkSource, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(networkSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = networkSource;
        this.copydefault = str;
        this.EZpvd = z;
    }

    @yCM
    public SelectNetWorkViewModel(@NotNull kUH kuh) {
        Intrinsics.checkNotNullParameter(kuh, "");
        this.KWHzl = kuh;
        this.valueOf = NetworkSource.All;
        this.EZpvd = true;
        this.copydefault = "";
        MutableStateFlow<InterfaceC22600hiS> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC22600hiS.ActionBar.copydefault);
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final List<C22593hiL> KWHzl() {
        InterfaceC22600hiS value = this.AEQbTJ.getValue();
        InterfaceC22600hiS.StateListAnimator stateListAnimator = value instanceof InterfaceC22600hiS.StateListAnimator ? (InterfaceC22600hiS.StateListAnimator) value : null;
        List<C22593hiL> listKWHzl = stateListAnimator != null ? stateListAnimator.KWHzl() : null;
        return listKWHzl == null ? yDY.AhwBna() : listKWHzl;
    }

    public final void OLrzqt(TradeMode tradeMode) {
        ChainBizType chainBizType;
        switch (ActionBar.OLrzqt[this.valueOf.ordinal()]) {
            case 1:
            case 2:
                chainBizType = ChainBizType.Single;
                break;
            case 3:
                chainBizType = ChainBizType.Limit;
                break;
            case 4:
                chainBizType = ChainBizType.Bridge;
                break;
            case 5:
                chainBizType = ChainBizType.CopyTrading;
                break;
            case 6:
                chainBizType = ChainBizType.AllSupported;
                break;
            case 7:
                chainBizType = ChainBizType.Market;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SelectNetWorkViewModel$loadChainList$1(this, chainBizType, tradeMode, null), 3, null);
    }
}
