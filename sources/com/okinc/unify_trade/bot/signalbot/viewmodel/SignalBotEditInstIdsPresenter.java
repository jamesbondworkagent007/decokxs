package com.okinc.unify_trade.bot.signalbot.viewmodel;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.bot.data.EditCoinPairBean;
import com.okinc.unify_trade.bot.data.SignalBotEditStrategyBean;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33129mqd;
import o.C54240xBb;
import o.C54589xNz;
import o.C54799xVt;
import o.C55298xhM;
import o.C55688xof;
import o.C55844xrc;
import o.C56390yDp;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignalBotEditInstIdsPresenter extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final TradeLiveData<List<EmptyResp>> AEQbTJ;
    public int EZpvd;
    public final C54240xBb KWHzl;
    public List<? extends Object> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54240xBb EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<EmptyResp>> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalBotEditInstIdsPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C54240xBb();
        this.AEQbTJ = new TradeLiveData<>();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotEditInstIdsPresenter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final List<Object> KWHzl() {
        List<? extends Object> list = this.copydefault;
        if (list != null) {
            return list;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void KWHzl(@NotNull EditCoinPairBean editCoinPairBean) {
        Intrinsics.checkNotNullParameter(editCoinPairBean, "");
        ArrayList arrayList = new ArrayList();
        if (C33129mqd.KWHzl((Collection) editCoinPairBean.getAddInstIds())) {
            this.EZpvd = 1;
            int i = C55688xof.Application.dxTXDv;
            xMR xmr = xMR.copydefault;
            List<String> addInstIds = editCoinPairBean.getAddInstIds();
            arrayList.add(new C55844xrc(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", xmr.copydefault(C33129mqd.gEmmrt(addInstIds != null ? Integer.valueOf(addInstIds.size()) : null))))), 0, 2, null));
            List<String> addInstIds2 = editCoinPairBean.getAddInstIds();
            Intrinsics.copydefault(addInstIds2);
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(addInstIds2, 10));
            Iterator<T> it = addInstIds2.iterator();
            while (it.hasNext()) {
                arrayList2.add(AEQbTJ((String) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        if (C33129mqd.KWHzl((Collection) editCoinPairBean.getDeleteInstIds())) {
            this.EZpvd = this.EZpvd == 1 ? 3 : 2;
            int i2 = C55688xof.Application.f1069a;
            xMR xmr2 = xMR.copydefault;
            List<String> deleteInstIds = editCoinPairBean.getDeleteInstIds();
            arrayList.add(new C55844xrc(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", xmr2.copydefault(C33129mqd.gEmmrt(deleteInstIds != null ? Integer.valueOf(deleteInstIds.size()) : null))))), this.EZpvd == 3 ? C55298xhM.dpInt$default(12.0f, (Context) null, 1, (Object) null) : 0));
            List<String> deleteInstIds2 = editCoinPairBean.getDeleteInstIds();
            Intrinsics.copydefault(deleteInstIds2);
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(deleteInstIds2, 10));
            Iterator<T> it2 = deleteInstIds2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(AEQbTJ((String) it2.next()));
            }
            arrayList.addAll(arrayList3);
        }
        OLrzqt(arrayList);
    }

    public final void EZpvd(@NotNull EditCoinPairBean editCoinPairBean) {
        String algoId;
        Intrinsics.checkNotNullParameter(editCoinPairBean, "");
        C54240xBb c54240xBb = this.KWHzl;
        TacticsData data = editCoinPairBean.getData();
        c54240xBb.KWHzl(new SignalBotEditStrategyBean((data == null || (algoId = data.getAlgoId()) == null) ? "" : algoId, editCoinPairBean.getSelectedInstIds(), (ExitSignalOrderAmtParam) null, 4, (DefaultConstructorMarker) null));
        c54240xBb.AEQbTJ(this.AEQbTJ);
        xKK.Activity.execute$default(c54240xBb, 0L, 1, null);
    }

    public final SignalCoinPairItemData AEQbTJ(String str) {
        String upperCase;
        BizInstrument suggestedInstrument$default;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", str, null, null, 12, null)) == null || (upperCase = suggestedInstrument$default.getTradeSymbol()) == null) {
            String strCopydefault = o.TaskDescription.AEQbTJ(str).copydefault();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            upperCase = strCopydefault.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        }
        String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, "SWAP", false, false, 12, null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        return new SignalCoinPairItemData(titleByIdAndType$default, interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.valueOf(upperCase) : null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, false, false, false, C55298xhM.dpInt$default(10.0f, (Context) null, 1, (Object) null), false, 5116, (DefaultConstructorMarker) null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.KWHzl);
    }
}
