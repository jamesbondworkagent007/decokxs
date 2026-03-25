package o;

import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestCustomRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import com.okinc.business.invest_biz.data.bean.InvestHoverOnData;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestRedirectData;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCP {
    public static final C24177iXt KWHzl = new C24177iXt(DisplayText.Companion.fromStringResource$default(DisplayText.Companion, C25493ixk.FragmentManager.zDUObI, null, 2, null), null, 0, false, false, null, 0, 0, 254, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C24177iXt KWHzl() {
        return KWHzl;
    }

    public static final InvestSubscriptionReceiveInfoUIBean copydefault(@NotNull InterfaceC24178iXu.VoiceInteractor voiceInteractor) {
        Intrinsics.checkNotNullParameter(voiceInteractor, "");
        java.lang.String strKWHzl = voiceInteractor.KWHzl();
        return new InvestSubscriptionReceiveInfoUIBean(false, voiceInteractor.OLrzqt(), strKWHzl, (java.util.List) voiceInteractor.AEQbTJ(), (java.util.List) voiceInteractor.gEmmrt(), voiceInteractor.AYXKKw(), false, voiceInteractor.AhwBna(), (InvestExchangeRateBean) null, (java.lang.String) null, (java.lang.String) null, voiceInteractor.copydefault(), 1792, (DefaultConstructorMarker) null);
    }

    public static final InvestTokenWithAmount KWHzl(@NotNull java.util.List<InvestTokenWithAmount> list, InvestTokenWithAmount investTokenWithAmount) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next).getTokenAddress(), investTokenWithAmount != null ? investTokenWithAmount.getTokenAddress() : null, true)) {
                obj = next;
                break;
            }
        }
        InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) obj;
        return investTokenWithAmount2 == null ? new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount2;
    }

    public static final InvestTokenWithAmount OLrzqt() {
        return new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InvestTokenWithAmount mapSelectedTokenOrDefault$default(java.util.List list, InvestTokenWithAmount investTokenWithAmount, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.iCL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iCP.OLrzqt();
                }
            };
        }
        return EZpvd(list, investTokenWithAmount, function0);
    }

    public static final InvestTokenWithAmount EZpvd(@NotNull java.util.List<InvestTokenWithAmount> list, InvestTokenWithAmount investTokenWithAmount, @NotNull Function0<InvestTokenWithAmount> function0) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (investTokenWithAmount == null) {
            InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(list);
            return investTokenWithAmount2 == null ? function0.invoke() : investTokenWithAmount2;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next).getTokenAddress(), investTokenWithAmount.getTokenAddress(), true)) {
                break;
            }
        }
        InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) next;
        return investTokenWithAmount3 == null ? investTokenWithAmount : investTokenWithAmount3;
    }

    public static final C25479ixW copydefault() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.OStAOF);
        InvestClickActionType investClickActionType = InvestClickActionType.POPUP;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.OStAOF);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.GiPPlL);
        return new C25479ixW(strAYXKKw, 8, new InvestTipInfoVo(investClickActionType, (InvestCustomRedirectData) null, (InvestHoverOnData) null, new InvestPopUpData(C56402yEa.EZpvd(new InvestButtonAction(InvestButtonAction.ACTION_CALLBACK_CLOSE, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RckOJh), (java.lang.String) null, 4, (DefaultConstructorMarker) null)), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DXd), (java.lang.String) null, (java.lang.String) null, strAYXKKw3, (java.lang.String) null, 44, (DefaultConstructorMarker) null), (InvestRedirectData) null, strAYXKKw2, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Integer) null, 982, (DefaultConstructorMarker) null));
    }

    public static final int AEQbTJ(@NotNull InvestTokenWithAmount investTokenWithAmount, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        int iMin = java.lang.Math.min(10, C33129mqd.AhwBna(investTokenWithAmount.getTokenPrecision()));
        return (num == null || num.intValue() <= 0) ? iMin : java.lang.Math.min(num.intValue(), iMin);
    }
}
