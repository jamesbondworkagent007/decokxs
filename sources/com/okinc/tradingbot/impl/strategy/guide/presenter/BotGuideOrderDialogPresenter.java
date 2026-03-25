package com.okinc.tradingbot.impl.strategy.guide.presenter;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import o.C52455wMa;
import o.C56111xwe;
import o.wLZ;
import o.xKK;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BotGuideOrderDialogPresenter extends AbsPresenter {
    public String KWHzl;
    public wLZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideOrderDialogPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final void EZpvd(Bundle bundle) {
        C52455wMa c52455wMa;
        if (Intrinsics.EZpvd((Object) this.KWHzl, (Object) "smart_portfolio")) {
            c52455wMa = new C52455wMa();
            c52455wMa.KWHzl(bundle);
        } else {
            c52455wMa = new C52455wMa();
            c52455wMa.KWHzl(bundle);
        }
        this.OLrzqt = c52455wMa;
    }

    public final void fJNWhG() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        wlz.values();
    }

    public final void fIwbmz() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        wlz.fJNWhG();
    }

    public final void copydefault(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        wlz.OLrzqt(copyBotReqParam);
    }

    public final StrategyReqGroup KWHzl(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.KWHzl(copyBotReqParam);
    }

    public final Pair<Boolean, String> AEQbTJ(@NotNull CopyBotReqParam copyBotReqParam) {
        Intrinsics.checkNotNullParameter(copyBotReqParam, "");
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.AEQbTJ(copyBotReqParam);
    }

    public final C56111xwe<List<StrategyResponse>> DbNXlk() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.valueOf();
    }

    public final C56111xwe<String> gEmmrt() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.djBIcL();
    }

    public final C56111xwe<String> AkhnZx() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.gEmmrt();
    }

    public final xKK values() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.AkhnZx();
    }

    public final ArrayList<Object> EZpvd() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.AEQbTJ();
    }

    public final String isConnected() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.isConnected();
    }

    public final String copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.KWHzl(str);
    }

    public final String AYXKKw() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.AYXKKw();
    }

    public final int djBIcL() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.OLrzqt();
    }

    public final String fetchVPNInfo() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.fetchVPNInfo();
    }

    public final String copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.OLrzqt(str, str2);
    }

    public final String AhwBna() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.AhwBna();
    }

    public final String AEQbTJ() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.KWHzl();
    }

    public final String copydefault() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        return wlz.EZpvd();
    }

    public final String KWHzl() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        String value = wlz.gEmmrt().getValue();
        if (value != null && !StringsKt__StringsKt.fARcdN((CharSequence) value)) {
            wLZ wlz2 = this.OLrzqt;
            if (wlz2 == null) {
                Intrinsics.gEmmrt("");
                wlz2 = null;
            }
            String value2 = wlz2.djBIcL().getValue();
            if (value2 != null && value2.length() != 0) {
                wLZ wlz3 = this.OLrzqt;
                if (wlz3 == null) {
                    Intrinsics.gEmmrt("");
                    wlz3 = null;
                }
                String value3 = wlz3.djBIcL().getValue();
                float fMax = Math.max(C33129mqd.djBIcL(value3 != null ? C33129mqd.addS$default(value3, 1, null, null, null, 14, null) : null), C33129mqd.djBIcL(C33129mqd.mulS$default(value, Double.valueOf(OLrzqt()), null, null, null, 14, null)));
                return C33129mqd.AEQbTJ(Float.valueOf(fMax), value) ? "" : xMR.copydefault.AhwBna(C33129mqd.gEmmrt(Float.valueOf(fMax)), 0);
            }
        }
        return "";
    }

    public final double OLrzqt() {
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        String value = wlz.gEmmrt().getValue();
        if (C33129mqd.valueOf(value, 500)) {
            return 0.2d;
        }
        return (C33129mqd.AEQbTJ(value, 500) && C33129mqd.valueOf(value, 1000)) ? 0.1d : 0.05d;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        ArrayList arrayList = new ArrayList();
        wLZ wlz = this.OLrzqt;
        if (wlz == null) {
            Intrinsics.gEmmrt("");
            wlz = null;
        }
        arrayList.addAll(wlz.DbNXlk());
        return arrayList;
    }
}
