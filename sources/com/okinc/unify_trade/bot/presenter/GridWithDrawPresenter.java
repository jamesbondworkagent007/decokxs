package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridProfitResponse;
import com.okinc.unify_trade.bot.data.ProfitDetailData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C54310xDr;
import o.C54536xML;
import o.C54589xNz;
import o.C55948xta;
import o.C56068xvo;
import o.C56217xye;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GridWithDrawPresenter extends AbsPresenter {
    public final TradeLiveData<List<GridProfitResponse>> AEQbTJ;
    public final C56217xye EZpvd;
    public final C54310xDr OLrzqt;
    public final TradeLiveData<String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56217xye KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<GridProfitResponse>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridWithDrawPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C56217xye();
        this.AEQbTJ = new TradeLiveData<>();
        this.OLrzqt = new C54310xDr();
        this.copydefault = new TradeLiveData<>();
    }

    public final void AEQbTJ(@NotNull ProfitDetailData profitDetailData) {
        BizInstrument suggestedInstrument$default;
        Intrinsics.checkNotNullParameter(profitDetailData, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String quoteSymbol = (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, profitDetailData.getInstType(), profitDetailData.getInstId(), null, null, 12, null)) == null) ? null : suggestedInstrument$default.getQuoteSymbol();
        String str = quoteSymbol != null ? quoteSymbol : "";
        C54310xDr c54310xDr = this.OLrzqt;
        c54310xDr.OLrzqt(this.copydefault, new C55948xta());
        c54310xDr.EZpvd(str);
        xKK.Activity.execute$default(c54310xDr, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56217xye c56217xye = this.EZpvd;
        c56217xye.AEQbTJ(this.AEQbTJ);
        c56217xye.copydefault(str);
        xKK.Activity.execute$default(c56217xye, 0L, 1, null);
    }

    public static /* synthetic */ String getProfitAmt$default(GridWithDrawPresenter gridWithDrawPresenter, ProfitDetailData profitDetailData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return gridWithDrawPresenter.copydefault(profitDetailData, z);
    }

    public final String copydefault(@NotNull ProfitDetailData profitDetailData, boolean z) {
        Intrinsics.checkNotNullParameter(profitDetailData, "");
        if (StringsKt__StringsKt.fARcdN((CharSequence) profitDetailData.getQuoteAmt())) {
            return "";
        }
        return C56068xvo.copydefault.AEQbTJ(profitDetailData.getInstId(), profitDetailData.getInstType(), profitDetailData.getQuoteAmt(), (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : z, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
    }

    public final String KWHzl(@NotNull String str) {
        xMW xmwKWHzl;
        String strGEmmrt;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String str2 = null;
        if (interfaceC54581xNrOLrzqt != null && (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) != null) {
            if (C33129mqd.gEmmrt(str, "0.01")) {
                strGEmmrt = C54536xML.toSafeString$default(xmwKWHzl.AYXKKw(str).AkhnZx().EZpvd("12").AEQbTJ(false).djBIcL(), false, 1, null);
            } else {
                strGEmmrt = C33129mqd.gEmmrt(xmwKWHzl.values(str));
            }
            str2 = "≈ " + strGEmmrt;
        }
        return str2 == null ? "" : str2;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.EZpvd, this.OLrzqt);
    }
}
