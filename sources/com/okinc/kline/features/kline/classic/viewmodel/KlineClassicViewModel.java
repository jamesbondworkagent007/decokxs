package com.okinc.kline.features.kline.classic.viewmodel;

import android.graphics.RectF;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.kline.features.kline.classic.viewmodel.KlineClassicViewModel;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC49411unz;
import o.C33129mqd;
import o.C36169oRv;
import o.C36173oRz;
import o.C36246oUr;
import o.C56391yDq;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.oWC;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineClassicViewModel extends AbstractC49411unz<C36173oRz> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher AEQbTJ;
    public boolean AhwBna;
    public BotGridOrderDialogData EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final C36169oRv copydefault;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotGridOrderDialogData KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public KlineClassicViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C36169oRv c36169oRv) {
        super(new C36173oRz(null, 1, null));
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c36169oRv, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c36169oRv;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.oRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineClassicViewModel.OLrzqt();
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.oRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineClassicViewModel.copydefault(this.KWHzl);
            }
        });
        this.AhwBna = true;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.classic.viewmodel.KlineClassicViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final C36246oUr OLrzqt() {
        return C36246oUr.copydefault();
    }

    public final C36246oUr EZpvd() {
        return (C36246oUr) this.OLrzqt.getValue();
    }

    public final oWC AYXKKw() {
        return (oWC) this.gEmmrt.getValue();
    }

    public static final oWC copydefault(KlineClassicViewModel klineClassicViewModel) {
        return klineClassicViewModel.EZpvd().iwGUEr().QVAiDq().get("ds0.m");
    }

    public final void copydefault(@NotNull BotGridOrderDialogData botGridOrderDialogData) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        this.EZpvd = botGridOrderDialogData;
        try {
            Result.Application application = Result.Companion;
            EZpvd().AEQbTJ((BotPendingLineVo) this.copydefault.EZpvd(botGridOrderDialogData));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            thM7380exceptionOrNullimpl.printStackTrace();
            pUU.copydefault("KlineClassicViewModel", "refreshGridPendingLine fail cause by: " + Unit.INSTANCE);
        }
    }

    public final void copydefault(@NotNull String str) {
        BotGridOrderDialogData botGridOrderDialogData;
        BotGridOrderDialogData botGridOrderDialogDataCopy;
        Intrinsics.checkNotNullParameter(str, "");
        BotGridOrderDialogData botGridOrderDialogData2 = this.EZpvd;
        if (botGridOrderDialogData2 == null) {
            copydefault();
            return;
        }
        if (C33129mqd.OLrzqt(botGridOrderDialogData2 != null ? botGridOrderDialogData2.getTickerPrice() : null, str) || (botGridOrderDialogData = this.EZpvd) == null || (botGridOrderDialogDataCopy = botGridOrderDialogData.copy((219 & 1) != 0 ? botGridOrderDialogData.tickerPrice : str, (219 & 2) != 0 ? botGridOrderDialogData.maxPx : null, (219 & 4) != 0 ? botGridOrderDialogData.minPx : null, (219 & 8) != 0 ? botGridOrderDialogData.gridCount : null, (219 & 16) != 0 ? botGridOrderDialogData.orderLine : null, (219 & 32) != 0 ? botGridOrderDialogData.isFinally : false, (219 & 64) != 0 ? botGridOrderDialogData.digit : 0, (219 & 128) != 0 ? botGridOrderDialogData.isDraggingForCalculateGridNum : false)) == null) {
            return;
        }
        copydefault(botGridOrderDialogDataCopy);
        pUU.EZpvd("KlineClassicViewModel", "ticker price change to: " + str + ", reload grid pending line");
    }

    public final BotGridOrderDialogData AEQbTJ(float f, boolean z) {
        oWC owcAYXKKw;
        if (!this.AhwBna || (owcAYXKKw = AYXKKw()) == null) {
            return null;
        }
        double dEZpvd = owcAYXKKw.EZpvd((int) f);
        BotGridOrderDialogData botGridOrderDialogData = this.EZpvd;
        if (C33129mqd.copydefault(Double.valueOf(dEZpvd), botGridOrderDialogData != null ? botGridOrderDialogData.getMaxPx() : null)) {
            return null;
        }
        double dPow = Math.pow(10.0d, this.EZpvd != null ? r1.getDigit() : 1);
        if (C33129mqd.gEmmrt(Double.valueOf(dEZpvd), 0)) {
            dEZpvd = C33129mqd.divD$default(1, Double.valueOf(dPow), null, null, null, 14, null);
        }
        BotGridOrderDialogData botGridOrderDialogData2 = this.EZpvd;
        if (botGridOrderDialogData2 != null) {
            return botGridOrderDialogData2.copy((219 & 1) != 0 ? botGridOrderDialogData2.tickerPrice : null, (219 & 2) != 0 ? botGridOrderDialogData2.maxPx : null, (219 & 4) != 0 ? botGridOrderDialogData2.minPx : C33129mqd.formatS$default(Double.valueOf(dEZpvd), null, null, null, 7, null), (219 & 8) != 0 ? botGridOrderDialogData2.gridCount : null, (219 & 16) != 0 ? botGridOrderDialogData2.orderLine : null, (219 & 32) != 0 ? botGridOrderDialogData2.isFinally : z, (219 & 64) != 0 ? botGridOrderDialogData2.digit : 0, (219 & 128) != 0 ? botGridOrderDialogData2.isDraggingForCalculateGridNum : false);
        }
        return null;
    }

    public final BotGridOrderDialogData copydefault(float f, boolean z) {
        oWC owcAYXKKw;
        BotGridOrderDialogData botGridOrderDialogData;
        if (!this.AhwBna || (owcAYXKKw = AYXKKw()) == null) {
            return null;
        }
        double dEZpvd = owcAYXKKw.EZpvd((int) f);
        BotGridOrderDialogData botGridOrderDialogData2 = this.EZpvd;
        if (C33129mqd.valueOf(Double.valueOf(dEZpvd), botGridOrderDialogData2 != null ? botGridOrderDialogData2.getMinPx() : null) || (botGridOrderDialogData = this.EZpvd) == null) {
            return null;
        }
        return botGridOrderDialogData.copy((219 & 1) != 0 ? botGridOrderDialogData.tickerPrice : null, (219 & 2) != 0 ? botGridOrderDialogData.maxPx : C33129mqd.formatS$default(Double.valueOf(dEZpvd), null, null, null, 7, null), (219 & 4) != 0 ? botGridOrderDialogData.minPx : null, (219 & 8) != 0 ? botGridOrderDialogData.gridCount : null, (219 & 16) != 0 ? botGridOrderDialogData.orderLine : null, (219 & 32) != 0 ? botGridOrderDialogData.isFinally : z, (219 & 64) != 0 ? botGridOrderDialogData.digit : 0, (219 & 128) != 0 ? botGridOrderDialogData.isDraggingForCalculateGridNum : false);
    }

    public final void copydefault() {
        EZpvd().AEQbTJ((BotPendingLineVo) null);
        EZpvd().iwGUEr().AEQbTJ((RectF) null);
        EZpvd().iwGUEr().OLrzqt((RectF) null);
        this.EZpvd = null;
    }
}
