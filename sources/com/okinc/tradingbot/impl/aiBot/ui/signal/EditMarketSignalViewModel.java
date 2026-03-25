package com.okinc.tradingbot.impl.aiBot.ui.signal;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalConfigUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalSelectionResult;
import com.okinc.tradingbot.impl.aiBot.domain.model.TimeframeModel;
import com.okinc.unify_trade.biz.TechnicalIndex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC48145uGq;
import o.C56403yEb;
import o.C56407yEf;
import o.C56423yEv;
import o.C56548yJl;
import o.C59443zhD;
import o.uCM;
import o.uGU;
import o.uLN;
import o.uLU;
import o.wUL;
import o.yCM;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class EditMarketSignalViewModel extends uLN<Unit> {
    public final MutableStateFlow<uLU<uGU>> AEQbTJ;
    public final StateFlow<uLU<uGU>> AhwBna;
    public List<? extends Indicator> EZpvd;
    public final SavedStateHandle KWHzl;
    public List<IndicatorSectionUiModel> OLrzqt;
    public final uCM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLU<uGU>> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public EditMarketSignalViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull uCM ucm) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(ucm, "");
        this.KWHzl = savedStateHandle;
        this.copydefault = ucm;
        MutableStateFlow<uLU<uGU>> MutableStateFlow = StateFlowKt.MutableStateFlow(uLU.Companion.EZpvd(true));
        this.AEQbTJ = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        this.OLrzqt = yDY.AhwBna();
        this.EZpvd = yDY.AhwBna();
        AYXKKw();
    }

    public final void AEQbTJ(@NotNull AbstractC48145uGq abstractC48145uGq) {
        Intrinsics.checkNotNullParameter(abstractC48145uGq, "");
        if (abstractC48145uGq instanceof AbstractC48145uGq.Activity) {
            OLrzqt(((AbstractC48145uGq.Activity) abstractC48145uGq).OLrzqt());
            return;
        }
        if (abstractC48145uGq instanceof AbstractC48145uGq.StateListAnimator) {
            EZpvd(((AbstractC48145uGq.StateListAnimator) abstractC48145uGq).EZpvd());
            return;
        }
        if (abstractC48145uGq instanceof AbstractC48145uGq.FragmentManager) {
            AEQbTJ(((AbstractC48145uGq.FragmentManager) abstractC48145uGq).EZpvd());
            return;
        }
        if (abstractC48145uGq instanceof AbstractC48145uGq.Application) {
            AEQbTJ(((AbstractC48145uGq.Application) abstractC48145uGq).KWHzl());
        } else if (abstractC48145uGq instanceof AbstractC48145uGq.ActionBar) {
            valueOf();
        } else {
            if (!(abstractC48145uGq instanceof AbstractC48145uGq.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            AYXKKw();
        }
    }

    public final void AYXKKw() {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new EditMarketSignalViewModel$loadConfig$1(this, null), 3, null);
    }

    public static final class Activity<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((TimeframeModel) t).OLrzqt()), Integer.valueOf(((TimeframeModel) t2).OLrzqt()));
        }
    }

    public final Indicator OLrzqt(TechnicalIndex technicalIndex, Map<String, ? extends Indicator> map) {
        Indicator indicator = map.get(technicalIndex.getIndicator());
        if (indicator == null) {
            return null;
        }
        if (indicator instanceof Indicator.MultiValue) {
            List<String> params = technicalIndex.getParams();
            List<Integer> arrayList = new ArrayList<>();
            Iterator<T> it = params.iterator();
            while (it.hasNext()) {
                Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull((String) it.next());
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
            Indicator.MultiValue multiValue = (Indicator.MultiValue) indicator;
            if (arrayList.isEmpty()) {
                arrayList = multiValue.AhwBna();
            }
            return Indicator.MultiValue.copy$default(multiValue, null, null, null, null, null, true, arrayList, 31, null);
        }
        if (indicator instanceof Indicator.FixedParams) {
            List<String> params2 = technicalIndex.getParams();
            List<Number> arrayList2 = new ArrayList<>();
            Iterator<T> it2 = params2.iterator();
            while (it2.hasNext()) {
                Double dAuCTel = C59443zhD.AuCTel((String) it2.next());
                if (dAuCTel != null) {
                    arrayList2.add(dAuCTel);
                }
            }
            Indicator.FixedParams fixedParams = (Indicator.FixedParams) indicator;
            if (arrayList2.isEmpty()) {
                arrayList2 = fixedParams.AhwBna();
            }
            return Indicator.FixedParams.copy$default(fixedParams, null, null, null, null, null, true, arrayList2, 31, null);
        }
        if (!(indicator instanceof Indicator.NoParams)) {
            throw new NoWhenBranchMatchedException();
        }
        return Indicator.NoParams.copy$default((Indicator.NoParams) indicator, null, null, null, null, null, true, 31, null);
    }

    public final void OLrzqt(String str) {
        uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        if (uguOLrzqt == null) {
            return;
        }
        this.AEQbTJ.setValue(uLU.Companion.AEQbTJ(uguOLrzqt.AEQbTJ((481 & 1) != 0 ? uguOLrzqt.AEQbTJ : null, (481 & 2) != 0 ? uguOLrzqt.gEmmrt : str, (481 & 4) != 0 ? uguOLrzqt.valueOf : null, (481 & 8) != 0 ? uguOLrzqt.AYXKKw : null, (481 & 16) != 0 ? uguOLrzqt.AhwBna : null, (481 & 32) != 0 ? uguOLrzqt.EZpvd : null, (481 & 64) != 0 ? uguOLrzqt.copydefault : null, (481 & 128) != 0 ? uguOLrzqt.KWHzl : null, (481 & 256) != 0 ? uguOLrzqt.OLrzqt : null)));
    }

    public final void EZpvd(TimeframeModel timeframeModel) {
        uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        if (uguOLrzqt == null) {
            return;
        }
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) uguOLrzqt.AhwBna());
        if (listFJNWhG.contains(timeframeModel)) {
            listFJNWhG.remove(timeframeModel);
        } else {
            listFJNWhG.add(timeframeModel);
        }
        if (listFJNWhG.size() > 1) {
            C56407yEf.copydefault(listFJNWhG, new Activity());
        }
        this.AEQbTJ.setValue(uLU.Companion.AEQbTJ(uguOLrzqt.AEQbTJ((481 & 1) != 0 ? uguOLrzqt.AEQbTJ : null, (481 & 2) != 0 ? uguOLrzqt.gEmmrt : null, (481 & 4) != 0 ? uguOLrzqt.valueOf : listFJNWhG, (481 & 8) != 0 ? uguOLrzqt.AYXKKw : null, (481 & 16) != 0 ? uguOLrzqt.AhwBna : null, (481 & 32) != 0 ? uguOLrzqt.EZpvd : null, (481 & 64) != 0 ? uguOLrzqt.copydefault : null, (481 & 128) != 0 ? uguOLrzqt.KWHzl : null, (481 & 256) != 0 ? uguOLrzqt.OLrzqt : null)));
    }

    public final void AEQbTJ(List<? extends Indicator> list) {
        uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        if (uguOLrzqt == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Indicator) obj).gEmmrt()) {
                arrayList.add(obj);
            }
        }
        this.AEQbTJ.setValue(uLU.Companion.AEQbTJ(uguOLrzqt.AEQbTJ((481 & 1) != 0 ? uguOLrzqt.AEQbTJ : null, (481 & 2) != 0 ? uguOLrzqt.gEmmrt : null, (481 & 4) != 0 ? uguOLrzqt.valueOf : null, (481 & 8) != 0 ? uguOLrzqt.AYXKKw : arrayList, (481 & 16) != 0 ? uguOLrzqt.AhwBna : AEQbTJ(uguOLrzqt.AYXKKw(), arrayList), (481 & 32) != 0 ? uguOLrzqt.EZpvd : null, (481 & 64) != 0 ? uguOLrzqt.copydefault : null, (481 & 128) != 0 ? uguOLrzqt.KWHzl : null, (481 & 256) != 0 ? uguOLrzqt.OLrzqt : null)));
    }

    public final void AEQbTJ(String str) {
        uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        if (uguOLrzqt == null) {
            return;
        }
        List<Indicator> listValueOf = uguOLrzqt.valueOf();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listValueOf) {
            if (!Intrinsics.EZpvd((Object) ((Indicator) obj).EZpvd(), (Object) str)) {
                arrayList.add(obj);
            }
        }
        this.AEQbTJ.setValue(uLU.Companion.AEQbTJ(uguOLrzqt.AEQbTJ((481 & 1) != 0 ? uguOLrzqt.AEQbTJ : null, (481 & 2) != 0 ? uguOLrzqt.gEmmrt : null, (481 & 4) != 0 ? uguOLrzqt.valueOf : null, (481 & 8) != 0 ? uguOLrzqt.AYXKKw : arrayList, (481 & 16) != 0 ? uguOLrzqt.AhwBna : AEQbTJ(uguOLrzqt.AYXKKw(), arrayList), (481 & 32) != 0 ? uguOLrzqt.EZpvd : null, (481 & 64) != 0 ? uguOLrzqt.copydefault : null, (481 & 128) != 0 ? uguOLrzqt.KWHzl : null, (481 & 256) != 0 ? uguOLrzqt.OLrzqt : null)));
    }

    private final void valueOf() {
        uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        if (uguOLrzqt == null) {
            return;
        }
        this.AEQbTJ.setValue(uLU.Companion.AEQbTJ(uguOLrzqt.AEQbTJ((481 & 1) != 0 ? uguOLrzqt.AEQbTJ : null, (481 & 2) != 0 ? uguOLrzqt.gEmmrt : uguOLrzqt.djBIcL(), (481 & 4) != 0 ? uguOLrzqt.valueOf : uguOLrzqt.AEQbTJ(), (481 & 8) != 0 ? uguOLrzqt.AYXKKw : uguOLrzqt.OLrzqt(), (481 & 16) != 0 ? uguOLrzqt.AhwBna : uguOLrzqt.copydefault(), (481 & 32) != 0 ? uguOLrzqt.EZpvd : null, (481 & 64) != 0 ? uguOLrzqt.copydefault : null, (481 & 128) != 0 ? uguOLrzqt.KWHzl : null, (481 & 256) != 0 ? uguOLrzqt.OLrzqt : null)));
    }

    public final List<IndicatorSectionUiModel> OLrzqt() {
        List<IndicatorSectionUiModel> listAYXKKw;
        uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        return (uguOLrzqt == null || (listAYXKKw = uguOLrzqt.AYXKKw()) == null) ? yDY.AhwBna() : listAYXKKw;
    }

    public final List<IndicatorSectionUiModel> KWHzl() {
        List<IndicatorSectionUiModel> listCopydefault;
        if (this.OLrzqt.isEmpty()) {
            uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
            return (uguOLrzqt == null || (listCopydefault = uguOLrzqt.copydefault()) == null) ? yDY.AhwBna() : listCopydefault;
        }
        return AEQbTJ(this.OLrzqt, this.EZpvd);
    }

    public final int EZpvd() {
        MarketSignalConfigUiModel marketSignalConfigUiModelEZpvd;
        uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        if (uguOLrzqt == null || (marketSignalConfigUiModelEZpvd = uguOLrzqt.EZpvd()) == null) {
            return 6;
        }
        return marketSignalConfigUiModelEZpvd.OLrzqt();
    }

    public final MarketSignalSelectionResult AEQbTJ() {
        uGU uguOLrzqt = this.AEQbTJ.getValue().OLrzqt();
        if (uguOLrzqt == null) {
            return null;
        }
        String strGEmmrt = uguOLrzqt.gEmmrt();
        List<TimeframeModel> listAhwBna = uguOLrzqt.AhwBna();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(((TimeframeModel) it.next()).EZpvd());
        }
        return new MarketSignalSelectionResult(strGEmmrt, arrayList, uguOLrzqt.valueOf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<IndicatorSectionUiModel> AEQbTJ(List<IndicatorSectionUiModel> list, List<? extends Indicator> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((Indicator) obj).EZpvd(), obj);
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (IndicatorSectionUiModel indicatorSectionUiModel : list) {
            List<Indicator> listOLrzqt = indicatorSectionUiModel.OLrzqt();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (Indicator indicator : listOLrzqt) {
                Indicator indicatorKWHzl = (Indicator) linkedHashMap.get(indicator.EZpvd());
                if (indicatorKWHzl == null) {
                    indicatorKWHzl = indicator.KWHzl(false);
                }
                arrayList2.add(indicatorKWHzl);
            }
            arrayList.add(IndicatorSectionUiModel.copy$default(indicatorSectionUiModel, null, arrayList2, 1, null));
        }
        return arrayList;
    }
}
