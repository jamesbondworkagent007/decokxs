package com.okinc.tradingbot.impl.aiBot.ui.indicators;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorBase;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC48070uDw;
import o.C56402yEa;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56548yJl;
import o.uCM;
import o.uDT;
import o.uDU;
import o.uLN;
import o.uLU;
import o.wUL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TechnicalIndicatorsViewModel extends uLN<Unit> {
    public final CoroutineDispatcher AEQbTJ;
    public List<IndicatorSectionUiModel> EZpvd;
    public final MutableStateFlow<uLU<uDU>> KWHzl;
    public final uCM OLrzqt;
    public int copydefault;
    public final StateFlow<uLU<uDU>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLU<uDU>> EZpvd() {
        return this.gEmmrt;
    }

    @yCM
    public TechnicalIndicatorsViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull uCM ucm) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ucm, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = ucm;
        MutableStateFlow<uLU<uDU>> MutableStateFlow = StateFlowKt.MutableStateFlow(uLU.Companion.EZpvd(true));
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        this.copydefault = 6;
        this.EZpvd = yDY.AhwBna();
    }

    public final void KWHzl(@NotNull AbstractC48070uDw abstractC48070uDw) {
        Intrinsics.checkNotNullParameter(abstractC48070uDw, "");
        if (abstractC48070uDw instanceof AbstractC48070uDw.ActionBar) {
            AbstractC48070uDw.ActionBar actionBar = (AbstractC48070uDw.ActionBar) abstractC48070uDw;
            EZpvd(actionBar.OLrzqt(), actionBar.AEQbTJ(), actionBar.copydefault());
            return;
        }
        if (abstractC48070uDw instanceof AbstractC48070uDw.Activity) {
            wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AEQbTJ, null, new TechnicalIndicatorsViewModel$trigger$1(this, abstractC48070uDw, null), 2, null);
            return;
        }
        if (abstractC48070uDw instanceof AbstractC48070uDw.TaskDescription) {
            wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AEQbTJ, null, new TechnicalIndicatorsViewModel$trigger$2(this, abstractC48070uDw, null), 2, null);
        } else if (abstractC48070uDw instanceof AbstractC48070uDw.Application) {
            copydefault();
        } else {
            if (!(abstractC48070uDw instanceof AbstractC48070uDw.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl();
        }
    }

    public final void EZpvd(List<IndicatorSectionUiModel> list, List<IndicatorSectionUiModel> list2, int i) {
        this.copydefault = i;
        this.EZpvd = list2;
        if (!list.isEmpty()) {
            this.KWHzl.setValue(uLU.Companion.AEQbTJ(uDT.EZpvd(new uDU(list, 0, i, false, 10, null))));
        } else {
            KWHzl();
        }
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.AEQbTJ, null, new TechnicalIndicatorsViewModel$loadFromApi$1(this, null), 2, null);
    }

    public final void OLrzqt(String str) {
        Object next;
        Object objValueOf;
        Double dCopydefault;
        uDU uduOLrzqt = this.KWHzl.getValue().OLrzqt();
        if (uduOLrzqt == null) {
            return;
        }
        List<IndicatorSectionUiModel> listAEQbTJ = uduOLrzqt.AEQbTJ();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((IndicatorSectionUiModel) it.next()).OLrzqt());
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.EZpvd((Object) ((Indicator) next).EZpvd(), (Object) str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Indicator indicator = (Indicator) next;
        if (indicator == null) {
            return;
        }
        if (!indicator.gEmmrt()) {
            if (uduOLrzqt.OLrzqt() + uDT.KWHzl(indicator) > uduOLrzqt.KWHzl()) {
                this.KWHzl.setValue(uLU.Companion.AEQbTJ(uDU.copy$default(uduOLrzqt, null, 0, 0, true, 7, null)));
                return;
            }
        }
        List<IndicatorSectionUiModel> listAEQbTJ2 = uduOLrzqt.AEQbTJ();
        int i = 10;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
        for (IndicatorSectionUiModel indicatorSectionUiModel : listAEQbTJ2) {
            List<Indicator> listOLrzqt = indicatorSectionUiModel.OLrzqt();
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, i));
            for (IndicatorBase indicatorBaseKWHzl : listOLrzqt) {
                if (Intrinsics.EZpvd((Object) indicatorBaseKWHzl.EZpvd(), (Object) str)) {
                    if (!(!indicatorBaseKWHzl.gEmmrt())) {
                        if (indicatorBaseKWHzl instanceof Indicator.MultiValue) {
                            indicatorBaseKWHzl = ((Indicator.MultiValue) indicatorBaseKWHzl).copydefault(yDY.AhwBna()).KWHzl(false);
                        } else if (indicatorBaseKWHzl instanceof Indicator.FixedParams) {
                            indicatorBaseKWHzl = ((Indicator.FixedParams) indicatorBaseKWHzl).copydefault(yDY.AhwBna()).KWHzl(false);
                        } else {
                            if (!(indicatorBaseKWHzl instanceof Indicator.NoParams)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            indicatorBaseKWHzl = ((Indicator.NoParams) indicatorBaseKWHzl).KWHzl(false);
                        }
                    } else if (indicatorBaseKWHzl instanceof Indicator.MultiValue) {
                        Indicator.MultiValue multiValue = (Indicator.MultiValue) indicatorBaseKWHzl;
                        ParamSpecUiModel paramSpecUiModel = (ParamSpecUiModel) CollectionsKt___CollectionsKt.firstOrNull(multiValue.AYXKKw());
                        indicatorBaseKWHzl = multiValue.copydefault(C56402yEa.EZpvd(Integer.valueOf((paramSpecUiModel == null || (dCopydefault = paramSpecUiModel.copydefault()) == null) ? 20 : (int) dCopydefault.doubleValue()))).KWHzl(true);
                    } else if (indicatorBaseKWHzl instanceof Indicator.FixedParams) {
                        Indicator.FixedParams fixedParams = (Indicator.FixedParams) indicatorBaseKWHzl;
                        List<ParamSpecUiModel> listAYXKKw = fixedParams.AYXKKw();
                        ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(listAYXKKw, i));
                        for (ParamSpecUiModel paramSpecUiModel2 : listAYXKKw) {
                            if (paramSpecUiModel2.gEmmrt() == ParamType.INTEGER) {
                                Double dCopydefault2 = paramSpecUiModel2.copydefault();
                                objValueOf = Integer.valueOf(dCopydefault2 != null ? (int) dCopydefault2.doubleValue() : 0);
                            } else {
                                Double dCopydefault3 = paramSpecUiModel2.copydefault();
                                objValueOf = Double.valueOf(dCopydefault3 != null ? dCopydefault3.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE);
                            }
                            arrayList4.add(objValueOf);
                        }
                        indicatorBaseKWHzl = fixedParams.copydefault(arrayList4).KWHzl(true);
                    } else {
                        if (!(indicatorBaseKWHzl instanceof Indicator.NoParams)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        indicatorBaseKWHzl = ((Indicator.NoParams) indicatorBaseKWHzl).KWHzl(true);
                    }
                }
                arrayList3.add(indicatorBaseKWHzl);
                i = 10;
            }
            arrayList2.add(IndicatorSectionUiModel.copy$default(indicatorSectionUiModel, null, arrayList3, 1, null));
            i = 10;
        }
        this.KWHzl.setValue(uLU.Companion.AEQbTJ(uDT.EZpvd(uDU.copy$default(uduOLrzqt, arrayList2, 0, 0, false, 6, null))));
    }

    public final void copydefault(Indicator indicator) {
        uDU uduOLrzqt = this.KWHzl.getValue().OLrzqt();
        if (uduOLrzqt == null) {
            return;
        }
        List<IndicatorSectionUiModel> listAEQbTJ = uduOLrzqt.AEQbTJ();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (IndicatorSectionUiModel indicatorSectionUiModel : listAEQbTJ) {
            List<Indicator> listOLrzqt = indicatorSectionUiModel.OLrzqt();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (Indicator indicator2 : listOLrzqt) {
                if (Intrinsics.EZpvd((Object) indicator2.EZpvd(), (Object) indicator.EZpvd())) {
                    indicator2 = indicator;
                }
                arrayList2.add(indicator2);
            }
            arrayList.add(IndicatorSectionUiModel.copy$default(indicatorSectionUiModel, null, arrayList2, 1, null));
        }
        this.KWHzl.setValue(uLU.Companion.AEQbTJ(uDT.EZpvd(uDU.copy$default(uduOLrzqt, arrayList, 0, 0, false, 14, null))));
    }

    public final void copydefault() {
        List<IndicatorSectionUiModel> arrayList;
        uDU uduOLrzqt = this.KWHzl.getValue().OLrzqt();
        if (uduOLrzqt == null) {
            return;
        }
        List<IndicatorSectionUiModel> list = this.EZpvd;
        if (list.isEmpty()) {
            List<IndicatorSectionUiModel> listAEQbTJ = uduOLrzqt.AEQbTJ();
            arrayList = new ArrayList<>(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (IndicatorSectionUiModel indicatorSectionUiModel : listAEQbTJ) {
                List<Indicator> listOLrzqt = indicatorSectionUiModel.OLrzqt();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Indicator) it.next()).KWHzl(false));
                }
                arrayList.add(IndicatorSectionUiModel.copy$default(indicatorSectionUiModel, null, arrayList2, 1, null));
            }
        } else {
            arrayList = list;
        }
        this.KWHzl.setValue(uLU.Companion.AEQbTJ(uDT.EZpvd(uDU.copy$default(uduOLrzqt, arrayList, 0, 0, false, 6, null))));
    }

    public final int OLrzqt() {
        uDU uduOLrzqt = this.KWHzl.getValue().OLrzqt();
        return uduOLrzqt == null ? this.copydefault : uduOLrzqt.KWHzl() - uduOLrzqt.OLrzqt();
    }

    public static /* synthetic */ boolean canAddMoreItems$default(TechnicalIndicatorsViewModel technicalIndicatorsViewModel, Indicator indicator, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return technicalIndicatorsViewModel.copydefault(indicator, i);
    }

    public final boolean copydefault(@NotNull Indicator indicator, int i) {
        Intrinsics.checkNotNullParameter(indicator, "");
        uDU uduOLrzqt = this.KWHzl.getValue().OLrzqt();
        return uduOLrzqt == null || uduOLrzqt.OLrzqt() + i <= uduOLrzqt.KWHzl();
    }

    public final List<Indicator> AEQbTJ() {
        uDU uduOLrzqt = this.KWHzl.getValue().OLrzqt();
        if (uduOLrzqt == null) {
            return yDY.AhwBna();
        }
        List<IndicatorSectionUiModel> listAEQbTJ = uduOLrzqt.AEQbTJ();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((IndicatorSectionUiModel) it.next()).OLrzqt());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Indicator) obj).gEmmrt()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final List<IndicatorSectionUiModel> EZpvd(List<IndicatorSectionUiModel> list, List<? extends Indicator> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((Indicator) obj).EZpvd(), obj);
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (IndicatorSectionUiModel indicatorSectionUiModel : list) {
            List<Indicator> listOLrzqt = indicatorSectionUiModel.OLrzqt();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (Indicator indicator : listOLrzqt) {
                Indicator indicator2 = (Indicator) linkedHashMap.get(indicator.EZpvd());
                if (indicator2 != null) {
                    indicator = indicator2;
                }
                arrayList2.add(indicator);
            }
            arrayList.add(IndicatorSectionUiModel.copy$default(indicatorSectionUiModel, null, arrayList2, 1, null));
        }
        return arrayList;
    }
}
