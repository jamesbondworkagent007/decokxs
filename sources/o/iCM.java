package o;

import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class iCM {
    @yCM
    public iCM() {
    }

    public final boolean OLrzqt(InvestTokenWithAmount investTokenWithAmount, java.lang.String str, java.lang.String str2) {
        return investTokenWithAmount.isBaseToken() && C33129mqd.copydefault(investTokenWithAmount.getCoinAmount(), str2) && C33129mqd.gEmmrt(investTokenWithAmount.getCoinAmount(), C33129mqd.addS$default(str2, str, null, null, null, 14, null));
    }

    public final boolean EZpvd(InvestTokenWithAmount investTokenWithAmount, java.lang.String str) {
        return C33129mqd.gEmmrt(investTokenWithAmount.getCoinAmount(), str);
    }

    public final boolean AEQbTJ(InvestTokenWithAmount investTokenWithAmount, java.lang.String str) {
        return investTokenWithAmount.getDepositTips() && investTokenWithAmount.getTransferableBalance().length() > 0 && C33129mqd.AEQbTJ(str, investTokenWithAmount.getTransferableBalance());
    }

    public final C24179iXv OLrzqt(@NotNull java.lang.String str, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull InvestTokenWithAmount investTokenWithAmount2) {
        DisplayText displayTextOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
        boolean zEZpvd = EZpvd(investTokenWithAmount, investTokenWithAmount2.getCoinAmount());
        boolean zOLrzqt = OLrzqt(investTokenWithAmount, str, investTokenWithAmount2.getCoinAmount());
        boolean zAEQbTJ = AEQbTJ(investTokenWithAmount, investTokenWithAmount2.getCoinAmount());
        if (!zEZpvd && !zOLrzqt && zAEQbTJ) {
            displayTextOLrzqt = DisplayText.Companion.KWHzl(C25493ixk.FragmentManager.RSDDiY, C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, investTokenWithAmount.getTransferableBalance(), 6, 2, false, false, 24, null)), C56390yDp.OLrzqt("token", investTokenWithAmount.getTokenSymbol())));
        } else {
            displayTextOLrzqt = DisplayText.Companion.OLrzqt("");
        }
        return new C24179iXv(displayTextOLrzqt, zEZpvd, zOLrzqt);
    }

    public final C25479ixW EZpvd(PromptInformation promptInformation, PromptInformation promptInformation2) {
        InvestTipInfoVo inputHintTip;
        InvestTipInfoVo inputHintTip2 = null;
        if ((promptInformation2 != null ? promptInformation2.getExceptionTip() : null) != null) {
            return new C25479ixW("", 6, promptInformation2.getExceptionTip());
        }
        if ((promptInformation2 != null ? promptInformation2.getXrc20RedeemTip() : null) != null) {
            return new C25479ixW("", 6, promptInformation2.getXrc20RedeemTip());
        }
        if ((promptInformation != null ? promptInformation.getInputHintTip() : null) == null) {
            if ((promptInformation2 != null ? promptInformation2.getInputHintTip() : null) == null) {
                if ((promptInformation != null ? promptInformation.getInvestmentInfoTip() : null) != null) {
                    return new C25479ixW("", 7, promptInformation.getInvestmentInfoTip());
                }
                return null;
            }
        }
        if (promptInformation != null && (inputHintTip = promptInformation.getInputHintTip()) != null) {
            inputHintTip2 = inputHintTip;
        } else if (promptInformation2 != null) {
            inputHintTip2 = promptInformation2.getInputHintTip();
        }
        return new C25479ixW("", 9, inputHintTip2);
    }

    public final C25479ixW copydefault(PromptInformation promptInformation, PromptInformation promptInformation2) {
        if ((promptInformation2 != null ? promptInformation2.getExceptionTip() : null) != null) {
            return new C25479ixW("", 6, promptInformation2.getExceptionTip());
        }
        if ((promptInformation2 != null ? promptInformation2.getInputHintTip() : null) != null) {
            return new C25479ixW("", 6, promptInformation2.getInputHintTip());
        }
        if ((promptInformation2 != null ? promptInformation2.getXrc20RedeemTip() : null) != null) {
            return new C25479ixW("", 6, promptInformation2.getXrc20RedeemTip());
        }
        if ((promptInformation != null ? promptInformation.getInputHintTip() : null) != null) {
            return new C25479ixW("", 9, promptInformation.getInputHintTip());
        }
        if ((promptInformation != null ? promptInformation.getInvestmentInfoTip() : null) != null) {
            return new C25479ixW("", 7, promptInformation.getInvestmentInfoTip());
        }
        return null;
    }
}
