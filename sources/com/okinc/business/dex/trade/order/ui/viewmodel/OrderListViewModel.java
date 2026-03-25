package com.okinc.business.dex.trade.order.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.trade.order.domain.model.OrderStatus;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19700gMb;
import o.InterfaceC20070gZu;
import o.kKG;
import o.kUH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderListViewModel extends AbstractC33073mpa {
    public final C19700gMb AEQbTJ;
    public OrderStatus EZpvd;
    public final kUH KWHzl;
    public final StateFlow<InterfaceC20070gZu> OLrzqt;
    public final MutableStateFlow<InterfaceC20070gZu> copydefault;
    public final kKG djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull OrderStatus orderStatus) {
        Intrinsics.checkNotNullParameter(orderStatus, "");
        this.EZpvd = orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderStatus EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC20070gZu> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public OrderListViewModel(@NotNull kUH kuh, @NotNull kKG kkg, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(kuh, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.KWHzl = kuh;
        this.djBIcL = kkg;
        this.AEQbTJ = c19700gMb;
        this.EZpvd = OrderStatus.OpenOrders;
        MutableStateFlow<InterfaceC20070gZu> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC20070gZu.StateListAnimator.copydefault);
        this.copydefault = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault(@NotNull String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || Intrinsics.EZpvd((Object) str, (Object) "chain_id_all_network")) {
            this.copydefault.setValue(InterfaceC20070gZu.StateListAnimator.copydefault);
            return;
        }
        List<DefiChainInfo> listAEQbTJ = this.KWHzl.AEQbTJ(ChainBizType.Bridge);
        List<DefiChainInfo> listAEQbTJ2 = this.KWHzl.AEQbTJ(ChainBizType.Single);
        boolean z2 = false;
        if ((listAEQbTJ instanceof Collection) && listAEQbTJ.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((DefiChainInfo) it.next()).getChainId(), (Object) str)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (!(listAEQbTJ2 instanceof Collection) || !listAEQbTJ2.isEmpty()) {
            Iterator<T> it2 = listAEQbTJ2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (Intrinsics.EZpvd((Object) ((DefiChainInfo) it2.next()).getChainId(), (Object) str)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z || z2) {
            this.copydefault.setValue(new InterfaceC20070gZu.Application(str, z, z2));
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrderListViewModel$updateCurrentChain$1(this, str, null), 3, null);
    }

    public final DefiChainInfo copydefault(boolean z) {
        InterfaceC20070gZu value = this.copydefault.getValue();
        Object obj = null;
        InterfaceC20070gZu.Application application = value instanceof InterfaceC20070gZu.Application ? (InterfaceC20070gZu.Application) value : null;
        if (application == null) {
            return null;
        }
        if (z && application.EZpvd()) {
            Iterator<T> it = this.KWHzl.AEQbTJ(ChainBizType.Bridge).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) application.copydefault())) {
                    obj = next;
                    break;
                }
            }
            return (DefiChainInfo) obj;
        }
        if (z || !application.OLrzqt()) {
            return null;
        }
        Iterator<T> it2 = this.KWHzl.AEQbTJ(ChainBizType.Single).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next2).getChainId(), (Object) application.copydefault())) {
                obj = next2;
                break;
            }
        }
        return (DefiChainInfo) obj;
    }

    public final String EZpvd(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.KWHzl.AEQbTJ(ChainBizType.Single).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        String walletExplorePrefix = defiChainInfo != null ? defiChainInfo.getWalletExplorePrefix() : null;
        return walletExplorePrefix == null ? "" : walletExplorePrefix;
    }

    public final String OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.djBIcL.copydefault(str);
    }

    public final boolean copydefault() {
        return this.AEQbTJ.AYXKKw();
    }
}
