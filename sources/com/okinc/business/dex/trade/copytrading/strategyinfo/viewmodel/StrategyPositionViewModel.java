package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsPositionData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsPositionParam;
import com.okinc.business.dex.trade.copytrading.home.data.CTPosition;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyPositionViewModel;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19702gMd;
import o.C20009gXn;
import o.C20050gZa;
import o.C33129mqd;
import o.InterfaceC19701gMc;
import o.InterfaceC20068gZs;
import o.gWG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyPositionViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public InterfaceC19701gMc AYXKKw;
    public final gWG AhwBna;
    public AdvancedAssetsFilter EZpvd;
    public final MutableStateFlow<InterfaceC20068gZs> KWHzl;
    public final StateFlow<Boolean> OLrzqt;
    public final C20009gXn copydefault;
    public String djBIcL;
    public final C19702gMd gEmmrt;
    public final StateFlow<InterfaceC20068gZs> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC20068gZs> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedAssetsFilter copydefault() {
        return this.EZpvd;
    }

    @yCM
    public StrategyPositionViewModel(@NotNull C20009gXn c20009gXn, @NotNull C19702gMd c19702gMd, @NotNull gWG gwg) {
        Intrinsics.checkNotNullParameter(c20009gXn, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        Intrinsics.checkNotNullParameter(gwg, "");
        this.copydefault = c20009gXn;
        this.gEmmrt = c19702gMd;
        this.AhwBna = gwg;
        this.djBIcL = "";
        MutableStateFlow<InterfaceC20068gZs> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC20068gZs.TaskDescription.OLrzqt);
        this.KWHzl = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.AEQbTJ = MutableStateFlow2;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow2);
        this.EZpvd = new AdvancedAssetsFilter(false, (AdvancedAssetSort) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void loadPositions$default(StrategyPositionViewModel strategyPositionViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        strategyPositionViewModel.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        InterfaceC20068gZs interfaceC20068gZs;
        MutableStateFlow<InterfaceC20068gZs> mutableStateFlow = this.KWHzl;
        if (z) {
            interfaceC20068gZs = InterfaceC20068gZs.Activity.OLrzqt;
        } else {
            interfaceC20068gZs = InterfaceC20068gZs.TaskDescription.OLrzqt;
        }
        mutableStateFlow.setValue(interfaceC20068gZs);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyPositionViewModel$loadPositions$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        InterfaceC19701gMc interfaceC19701gMc = this.AYXKKw;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AYXKKw = this.gEmmrt.EZpvd(new Function1() { // from class: o.gYI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return StrategyPositionViewModel.copydefault(this.EZpvd, (TeeWsOriginData) obj);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gZa.copy$default(o.gZa, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.OrderStrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.order.domain.model.TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):o.gZa */
    public static final Unit copydefault(StrategyPositionViewModel strategyPositionViewModel, TeeWsOriginData teeWsOriginData) {
        InterfaceC20068gZs value;
        InterfaceC20068gZs stateListAnimator;
        boolean z;
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        if (teeWsOriginData.getType() == TeeWsOriginData.EventType.PositionUpdate) {
            TeeWsPositionData teeWsPositionDataEZpvd = strategyPositionViewModel.AhwBna.EZpvd(teeWsOriginData);
            if (teeWsPositionDataEZpvd != null) {
                WsPositionParam param = teeWsPositionDataEZpvd.getParam();
                Integer numValueOf = null;
                if (Intrinsics.EZpvd((Object) (param != null ? param.getStrategyId() : null), (Object) strategyPositionViewModel.djBIcL)) {
                    if ((strategyPositionViewModel.KWHzl.getValue() instanceof InterfaceC20068gZs.ActionBar) && C33129mqd.KWHzl((Collection) teeWsPositionDataEZpvd.getPositionDetails())) {
                        strategyPositionViewModel.OLrzqt(false);
                    }
                    if (strategyPositionViewModel.KWHzl.getValue() instanceof InterfaceC20068gZs.StateListAnimator) {
                        InterfaceC20068gZs value2 = strategyPositionViewModel.KWHzl.getValue();
                        InterfaceC20068gZs.StateListAnimator stateListAnimator2 = value2 instanceof InterfaceC20068gZs.StateListAnimator ? (InterfaceC20068gZs.StateListAnimator) value2 : null;
                        List<Object> listEZpvd = stateListAnimator2 != null ? stateListAnimator2.EZpvd() : null;
                        if (!(listEZpvd instanceof List)) {
                            listEZpvd = null;
                        }
                        List<CTPosition> positionDetails = teeWsPositionDataEZpvd.getPositionDetails();
                        CTPosition cTPosition = positionDetails != null ? positionDetails.get(0) : null;
                        if (listEZpvd != null) {
                            Iterator<Object> it = listEZpvd.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (Intrinsics.EZpvd((Object) ((C20050gZa) it.next()).EZpvd(), (Object) (cTPosition != null ? cTPosition.getPositionId() : null))) {
                                    break;
                                }
                                i++;
                            }
                            numValueOf = Integer.valueOf(i);
                        }
                        if (numValueOf != null && numValueOf.intValue() >= 0 && cTPosition != null) {
                            C20050gZa c20050gZaCopy$default = C20050gZa.copy$default(C20050gZa.Companion.AEQbTJ(cTPosition), ((C20050gZa) listEZpvd.get(numValueOf.intValue())).AEQbTJ(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070, null);
                            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) listEZpvd);
                            listFJNWhG.set(numValueOf.intValue(), c20050gZaCopy$default);
                            MutableStateFlow<InterfaceC20068gZs> mutableStateFlow = strategyPositionViewModel.KWHzl;
                            do {
                                value = mutableStateFlow.getValue();
                                stateListAnimator = value;
                                if (stateListAnimator instanceof InterfaceC20068gZs.StateListAnimator) {
                                    stateListAnimator = new InterfaceC20068gZs.StateListAnimator(listFJNWhG, false, null, 4, null);
                                }
                            } while (!mutableStateFlow.compareAndSet(value, stateListAnimator));
                            MutableStateFlow<Boolean> mutableStateFlow2 = strategyPositionViewModel.AEQbTJ;
                            if (listFJNWhG.isEmpty()) {
                                z = false;
                                mutableStateFlow2.setValue(Boolean.valueOf(z));
                            } else {
                                Iterator it2 = listFJNWhG.iterator();
                                while (it2.hasNext()) {
                                    if (((C20050gZa) it2.next()).valueOf()) {
                                        z = true;
                                        break;
                                    }
                                }
                                z = false;
                                mutableStateFlow2.setValue(Boolean.valueOf(z));
                            }
                        }
                        if (cTPosition != null && numValueOf != null && numValueOf.intValue() == -1) {
                            strategyPositionViewModel.OLrzqt(false);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        InterfaceC19701gMc interfaceC19701gMc = this.AYXKKw;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AYXKKw = null;
    }

    public static /* synthetic */ void saveAssetsFilter$default(StrategyPositionViewModel strategyPositionViewModel, AdvancedAssetsFilter advancedAssetsFilter, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        strategyPositionViewModel.AEQbTJ(advancedAssetsFilter, z);
    }

    public final void AEQbTJ(@NotNull AdvancedAssetsFilter advancedAssetsFilter, boolean z) {
        Intrinsics.checkNotNullParameter(advancedAssetsFilter, "");
        this.EZpvd = advancedAssetsFilter;
        OLrzqt(z);
    }

    public final void KWHzl() {
        this.EZpvd = AdvancedAssetsFilter.copy$default(this.EZpvd, false, AdvancedAssetSort.DEFAULT, true, 1, null);
    }
}
