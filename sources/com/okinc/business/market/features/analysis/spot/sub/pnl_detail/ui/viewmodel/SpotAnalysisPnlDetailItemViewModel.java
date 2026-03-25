package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailListSortType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC49411unz;
import o.C25960jMt;
import o.C25970jNc;
import o.C56391yDq;
import o.C56442yFn;
import o.jMA;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisPnlDetailItemViewModel extends AbstractC49411unz<C25970jNc> {
    public final C25960jMt AEQbTJ;

    @yCM
    public jMA getSortPnlListUseCase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SpotAnalysisPnlDetailItemViewModel(@NotNull C25960jMt c25960jMt) {
        super(new C25970jNc(null, null, null, 7, null));
        Intrinsics.checkNotNullParameter(c25960jMt, "");
        this.AEQbTJ = c25960jMt;
    }

    public final jMA KWHzl() {
        jMA jma = this.getSortPnlListUseCase;
        if (jma != null) {
            return jma;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull PnlDetailListSortType pnlDetailListSortType, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        SpotAnalysisPnlDetailItemViewModel$sortList$1 spotAnalysisPnlDetailItemViewModel$sortList$1;
        SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModel;
        jMA jma;
        List<PnlDetailVo.PnlListItem> listKWHzl;
        Object objOLrzqt;
        PnlDetailListSortType pnlDetailListSortType2;
        SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModel2;
        jMA jma2;
        List<PnlDetailVo.PnlListItem> listEZpvd;
        if (continuation instanceof SpotAnalysisPnlDetailItemViewModel$sortList$1) {
            spotAnalysisPnlDetailItemViewModel$sortList$1 = (SpotAnalysisPnlDetailItemViewModel$sortList$1) continuation;
            int i = spotAnalysisPnlDetailItemViewModel$sortList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                spotAnalysisPnlDetailItemViewModel$sortList$1.label = i - Integer.MIN_VALUE;
            } else {
                spotAnalysisPnlDetailItemViewModel$sortList$1 = new SpotAnalysisPnlDetailItemViewModel$sortList$1(this, continuation);
            }
        }
        Object objEZpvd = spotAnalysisPnlDetailItemViewModel$sortList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = spotAnalysisPnlDetailItemViewModel$sortList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            jMA jmaKWHzl = KWHzl();
            spotAnalysisPnlDetailItemViewModel$sortList$1.L$0 = this;
            spotAnalysisPnlDetailItemViewModel$sortList$1.L$1 = jmaKWHzl;
            spotAnalysisPnlDetailItemViewModel$sortList$1.L$2 = pnlDetailListSortType;
            spotAnalysisPnlDetailItemViewModel$sortList$1.label = 1;
            Object objOLrzqt2 = OLrzqt(this, spotAnalysisPnlDetailItemViewModel$sortList$1);
            if (objOLrzqt2 == objCopydefault) {
                return objCopydefault;
            }
            spotAnalysisPnlDetailItemViewModel = this;
            jma = jmaKWHzl;
            objEZpvd = objOLrzqt2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objEZpvd);
                        return Unit.INSTANCE;
                    }
                    spotAnalysisPnlDetailItemViewModel2 = (SpotAnalysisPnlDetailItemViewModel) spotAnalysisPnlDetailItemViewModel$sortList$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    spotAnalysisPnlDetailItemViewModel$sortList$1.L$0 = null;
                    spotAnalysisPnlDetailItemViewModel$sortList$1.label = 4;
                    if (spotAnalysisPnlDetailItemViewModel2.EZpvd((List<PnlDetailVo.PnlListItem>) objEZpvd, spotAnalysisPnlDetailItemViewModel$sortList$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                List<PnlDetailVo.PnlListItem> list = (List) spotAnalysisPnlDetailItemViewModel$sortList$1.L$3;
                pnlDetailListSortType2 = (PnlDetailListSortType) spotAnalysisPnlDetailItemViewModel$sortList$1.L$2;
                jMA jma3 = (jMA) spotAnalysisPnlDetailItemViewModel$sortList$1.L$1;
                SpotAnalysisPnlDetailItemViewModel spotAnalysisPnlDetailItemViewModel3 = (SpotAnalysisPnlDetailItemViewModel) spotAnalysisPnlDetailItemViewModel$sortList$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                listKWHzl = list;
                spotAnalysisPnlDetailItemViewModel2 = spotAnalysisPnlDetailItemViewModel3;
                jma2 = jma3;
                objOLrzqt = objEZpvd;
                listEZpvd = ((C25970jNc) objOLrzqt).EZpvd();
                if (listEZpvd == null) {
                    listEZpvd = yDY.AhwBna();
                }
                jMA.TaskDescription taskDescription = new jMA.TaskDescription(pnlDetailListSortType2, listKWHzl, listEZpvd);
                spotAnalysisPnlDetailItemViewModel$sortList$1.L$0 = spotAnalysisPnlDetailItemViewModel2;
                spotAnalysisPnlDetailItemViewModel$sortList$1.L$1 = null;
                spotAnalysisPnlDetailItemViewModel$sortList$1.L$2 = null;
                spotAnalysisPnlDetailItemViewModel$sortList$1.L$3 = null;
                spotAnalysisPnlDetailItemViewModel$sortList$1.label = 3;
                objEZpvd = jma2.EZpvd(taskDescription, spotAnalysisPnlDetailItemViewModel$sortList$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                spotAnalysisPnlDetailItemViewModel$sortList$1.L$0 = null;
                spotAnalysisPnlDetailItemViewModel$sortList$1.label = 4;
                if (spotAnalysisPnlDetailItemViewModel2.EZpvd((List<PnlDetailVo.PnlListItem>) objEZpvd, spotAnalysisPnlDetailItemViewModel$sortList$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            pnlDetailListSortType = (PnlDetailListSortType) spotAnalysisPnlDetailItemViewModel$sortList$1.L$2;
            jma = (jMA) spotAnalysisPnlDetailItemViewModel$sortList$1.L$1;
            spotAnalysisPnlDetailItemViewModel = (SpotAnalysisPnlDetailItemViewModel) spotAnalysisPnlDetailItemViewModel$sortList$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        listKWHzl = ((C25970jNc) objEZpvd).KWHzl();
        if (listKWHzl == null) {
            listKWHzl = yDY.AhwBna();
        }
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$0 = spotAnalysisPnlDetailItemViewModel;
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$1 = jma;
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$2 = pnlDetailListSortType;
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$3 = listKWHzl;
        spotAnalysisPnlDetailItemViewModel$sortList$1.label = 2;
        objOLrzqt = spotAnalysisPnlDetailItemViewModel.OLrzqt(spotAnalysisPnlDetailItemViewModel, spotAnalysisPnlDetailItemViewModel$sortList$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        jMA jma4 = jma;
        pnlDetailListSortType2 = pnlDetailListSortType;
        spotAnalysisPnlDetailItemViewModel2 = spotAnalysisPnlDetailItemViewModel;
        jma2 = jma4;
        listEZpvd = ((C25970jNc) objOLrzqt).EZpvd();
        if (listEZpvd == null) {
        }
        jMA.TaskDescription taskDescription2 = new jMA.TaskDescription(pnlDetailListSortType2, listKWHzl, listEZpvd);
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$0 = spotAnalysisPnlDetailItemViewModel2;
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$1 = null;
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$2 = null;
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$3 = null;
        spotAnalysisPnlDetailItemViewModel$sortList$1.label = 3;
        objEZpvd = jma2.EZpvd(taskDescription2, spotAnalysisPnlDetailItemViewModel$sortList$1);
        if (objEZpvd == objCopydefault) {
        }
        spotAnalysisPnlDetailItemViewModel$sortList$1.L$0 = null;
        spotAnalysisPnlDetailItemViewModel$sortList$1.label = 4;
        if (spotAnalysisPnlDetailItemViewModel2.EZpvd((List<PnlDetailVo.PnlListItem>) objEZpvd, spotAnalysisPnlDetailItemViewModel$sortList$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public final Object EZpvd(@NotNull List<PnlDetailVo.PnlListItem> list, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailItemViewModel$updatePnlList$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25970jNc) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25970jNc) obj).AEQbTJ((List<PnlDetailVo.PnlListItem>) obj2);
            }
        }, list, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object OLrzqt(@NotNull PnlDetailListSortType pnlDetailListSortType, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailItemViewModel$updateSortType$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25970jNc) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25970jNc) obj).KWHzl((PnlDetailListSortType) obj2);
            }
        }, pnlDetailListSortType, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object AEQbTJ(@NotNull List<PnlDetailVo.PnlListItem> list, @NotNull Continuation<? super List<PnlDetailVo.PnlListItem>> continuation) {
        return this.AEQbTJ.EZpvd(list, continuation);
    }
}
