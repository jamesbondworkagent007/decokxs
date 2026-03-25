package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaBasePresenter;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.math.RoundingMode;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C53258wiB;
import o.C54507xKz;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C55887xsS;
import o.C56111xwe;
import o.C56144xxK;
import o.C56235xyw;
import o.InterfaceC54581xNr;
import o.pUU;
import o.xKK;
import o.xOW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SpotDcaBasePresenter extends BaseBotOrderPresenter {
    public static final int AEQbTJ = ((TradeLiveData.$stable | C56235xyw.copydefault) | C56111xwe.AEQbTJ) | C56144xxK.AEQbTJ;
    public final C56111xwe<StrategyResponse> EZpvd;
    public final C56144xxK KWHzl;
    public final TradeLiveData<StrategyConfigInfo> OLrzqt;
    public final C56235xyw copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56144xxK EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<StrategyResponse> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaBasePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56144xxK();
        this.EZpvd = new C56111xwe<>();
        this.copydefault = new C56235xyw();
        this.OLrzqt = new TradeLiveData<>();
    }

    public final void AEQbTJ(@NotNull final DcaOrderReq dcaOrderReq, @NotNull FragmentManager fragmentManager) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(dcaOrderReq, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
            C53258wiB.Companion.OLrzqt(dcaOrderReq, fragmentManager, new Function0() { // from class: o.wjX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SpotDcaBasePresenter.copydefault(this.copydefault, dcaOrderReq);
                }
            });
        } else {
            pUU.KWHzl("BotOrder", "二次确认关闭 SpotDca Start Order");
            OLrzqt(dcaOrderReq);
        }
    }

    public static final Unit copydefault(SpotDcaBasePresenter spotDcaBasePresenter, DcaOrderReq dcaOrderReq) {
        pUU.KWHzl("BotOrder", "二次确认页 SpotDca Start Order");
        spotDcaBasePresenter.OLrzqt(dcaOrderReq);
        return Unit.INSTANCE;
    }

    private final void OLrzqt(DcaOrderReq dcaOrderReq) {
        C56144xxK c56144xxK = this.KWHzl;
        c56144xxK.OLrzqt(dcaOrderReq);
        c56144xxK.djBIcL();
        c56144xxK.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56144xxK, 0L, 1, null);
    }

    public final void copydefault() {
        C56235xyw c56235xyw = this.copydefault;
        c56235xyw.KWHzl("spot_dca");
        c56235xyw.AEQbTJ(fvQaOB().gEmmrt());
        c56235xyw.OLrzqt(fvQaOB().AEQbTJ("spot_dca"));
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.OLrzqt, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public static /* synthetic */ String handlePrecisionAmt$default(SpotDcaBasePresenter spotDcaBasePresenter, String str, RoundingMode roundingMode, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePrecisionAmt");
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return spotDcaBasePresenter.AEQbTJ(str, roundingMode);
    }

    public final String AEQbTJ(String str, @NotNull RoundingMode roundingMode) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAuCTel;
        String safeString$default;
        C54536xML c54536xMLCopydefault;
        Intrinsics.checkNotNullParameter(roundingMode, "");
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(fvQaOB(), null, true, 1, null);
        if (c54571xNhCreateAmtConvert$default != null) {
            if (str == null) {
                str = "";
            }
            c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(str);
        } else {
            c54536xMLAYXKKw = null;
        }
        if (roundingMode == RoundingMode.DOWN) {
            if (c54536xMLAYXKKw == null || (c54536xMLCopydefault = c54536xMLAYXKKw.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) {
                return "";
            }
        } else if (c54536xMLAYXKKw == null || (c54536xMLAuCTel = c54536xMLAYXKKw.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) {
            return "";
        }
        return safeString$default;
    }

    public final ArrayList<ExplainItemModel> AEQbTJ(@NotNull Context context, @NotNull ArrayList<Integer> arrayList, @NotNull ArrayList<Integer> arrayList2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        ArrayList<ExplainItemModel> arrayList3 = new ArrayList<>();
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i < arrayList2.size()) {
                String string = context.getString(iIntValue);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Integer num = arrayList2.get(i);
                Intrinsics.checkNotNullExpressionValue(num, "");
                String string2 = context.getString(num.intValue());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList3.add(new ExplainItemModel(string, string2));
            }
            i++;
        }
        return arrayList3;
    }
}
