package com.okinc.tradingbot.impl.aiBot.ui.signal;

import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalConfigUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.TimeframeModel;
import com.okinc.unify_trade.biz.DataSetting;
import com.okinc.unify_trade.biz.TechnicalIndex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C43422row;
import o.C56391yDq;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.uCM;
import o.uGU;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class EditMarketSignalViewModel$loadConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EditMarketSignalViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditMarketSignalViewModel$loadConfig$1(EditMarketSignalViewModel editMarketSignalViewModel, Continuation<? super EditMarketSignalViewModel$loadConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = editMarketSignalViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditMarketSignalViewModel$loadConfig$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditMarketSignalViewModel$loadConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        DataSetting dataSetting;
        MarketSignalConfigUiModel marketSignalConfigUiModel;
        DataSetting dataSetting2;
        List<TechnicalIndex> technicalIndexes;
        String aiThinkingInterval;
        List<String> kLineLevels;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                uLU.StateListAnimator stateListAnimator = uLU.Companion;
                mutableStateFlow.setValue(stateListAnimator.EZpvd(true));
                MarketSignalConfigUiModel marketSignalConfigUiModel2 = (MarketSignalConfigUiModel) this.this$0.KWHzl.get("ConfigKey");
                DataSetting dataSetting3 = (DataSetting) this.this$0.KWHzl.get("SelectionKey");
                DataSetting dataSetting4 = (DataSetting) this.this$0.KWHzl.get("DefaultSelectionKey");
                if (marketSignalConfigUiModel2 == null || dataSetting3 == null) {
                    this.this$0.AEQbTJ.setValue(stateListAnimator.KWHzl(new IllegalStateException(C43422row.OLrzqt())));
                    return Unit.INSTANCE;
                }
                uCM ucm = this.this$0.copydefault;
                Unit unit = Unit.INSTANCE;
                this.L$0 = marketSignalConfigUiModel2;
                this.L$1 = dataSetting3;
                this.L$2 = dataSetting4;
                this.label = 1;
                objKWHzl = ucm.KWHzl(unit, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                dataSetting = dataSetting4;
                marketSignalConfigUiModel = marketSignalConfigUiModel2;
                dataSetting2 = dataSetting3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dataSetting = (DataSetting) this.L$2;
                dataSetting2 = (DataSetting) this.L$1;
                MarketSignalConfigUiModel marketSignalConfigUiModel3 = (MarketSignalConfigUiModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                marketSignalConfigUiModel = marketSignalConfigUiModel3;
                objKWHzl = obj;
            }
            List list = (List) objKWHzl;
            this.this$0.OLrzqt = list;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(arrayList, ((IndicatorSectionUiModel) it.next()).OLrzqt());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((Indicator) obj2).djBIcL(), obj2);
            }
            List<TechnicalIndex> technicalIndexes2 = dataSetting2.getTechnicalIndexes();
            EditMarketSignalViewModel editMarketSignalViewModel = this.this$0;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = technicalIndexes2.iterator();
            while (it2.hasNext()) {
                Indicator indicatorOLrzqt = editMarketSignalViewModel.OLrzqt((TechnicalIndex) it2.next(), (Map<String, ? extends Indicator>) linkedHashMap);
                if (indicatorOLrzqt != null) {
                    arrayList2.add(indicatorOLrzqt);
                }
            }
            if (dataSetting == null || (technicalIndexes = dataSetting.getTechnicalIndexes()) == null) {
                technicalIndexes = dataSetting2.getTechnicalIndexes();
            }
            EditMarketSignalViewModel editMarketSignalViewModel2 = this.this$0;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = technicalIndexes.iterator();
            while (it3.hasNext()) {
                Indicator indicatorOLrzqt2 = editMarketSignalViewModel2.OLrzqt((TechnicalIndex) it3.next(), (Map<String, ? extends Indicator>) linkedHashMap);
                if (indicatorOLrzqt2 != null) {
                    arrayList3.add(indicatorOLrzqt2);
                }
            }
            this.this$0.EZpvd = arrayList3;
            List listAEQbTJ = this.this$0.AEQbTJ(list, arrayList2);
            String aiThinkingInterval2 = dataSetting2.getAiThinkingInterval();
            String str = aiThinkingInterval2.length() > 0 ? aiThinkingInterval2 : null;
            List<String> kLineLevels2 = dataSetting2.getKLineLevels();
            ArrayList arrayList4 = new ArrayList();
            for (String str2 : kLineLevels2) {
                Iterator<TimeframeModel> it4 = marketSignalConfigUiModel.AEQbTJ().iterator();
                int i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (Intrinsics.EZpvd((Object) it4.next().EZpvd(), (Object) str2)) {
                        break;
                    }
                    i2++;
                }
                TimeframeModel timeframeModel = i2 == -1 ? null : new TimeframeModel(i2, str2);
                if (timeframeModel != null) {
                    arrayList4.add(timeframeModel);
                }
            }
            if (dataSetting == null || (aiThinkingInterval = dataSetting.getAiThinkingInterval()) == null) {
                aiThinkingInterval = dataSetting2.getAiThinkingInterval();
            }
            String str3 = aiThinkingInterval.length() > 0 ? aiThinkingInterval : null;
            if (dataSetting == null || (kLineLevels = dataSetting.getKLineLevels()) == null) {
                kLineLevels = dataSetting2.getKLineLevels();
            }
            ArrayList arrayList5 = new ArrayList();
            for (String str4 : kLineLevels) {
                Iterator<TimeframeModel> it5 = marketSignalConfigUiModel.AEQbTJ().iterator();
                int i3 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (Intrinsics.EZpvd((Object) it5.next().EZpvd(), (Object) str4)) {
                        break;
                    }
                    i3++;
                }
                TimeframeModel timeframeModel2 = i3 == -1 ? null : new TimeframeModel(i3, str4);
                if (timeframeModel2 != null) {
                    arrayList5.add(timeframeModel2);
                }
            }
            this.this$0.AEQbTJ.setValue(uLU.Companion.AEQbTJ(new uGU(marketSignalConfigUiModel, str, arrayList4, arrayList2, listAEQbTJ, this.this$0.AEQbTJ(list, arrayList3), str3, arrayList5, arrayList3)));
        } catch (Exception e) {
            this.this$0.AEQbTJ.setValue(uLU.Companion.KWHzl(e));
        }
        return Unit.INSTANCE;
    }
}
