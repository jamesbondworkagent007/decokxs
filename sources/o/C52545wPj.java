package o;

import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsPortfolioInfoDetailItem;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52545wPj extends AbstractC59533zio<TacticsPortfolioInfoDetailItem, C52544wPi> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C52544wPi onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.onProviderEnabled, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C52544wPi(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C52544wPi c52544wPi, @NotNull TacticsPortfolioInfoDetailItem tacticsPortfolioInfoDetailItem) {
        Intrinsics.checkNotNullParameter(c52544wPi, "");
        Intrinsics.checkNotNullParameter(tacticsPortfolioInfoDetailItem, "");
        if (c52544wPi.copydefault().getItemDecorationCount() == 0) {
            c52544wPi.copydefault().addItemDecoration(new C57584ylF(2, 0, C33052mpF.dp2px$default(16.0f, null, 1, null)));
        }
        c52544wPi.copydefault().setLayoutManager(new GridLayoutManager(c52544wPi.copydefault().getContext(), 2));
        c52544wPi.copydefault().setNestedScrollingEnabled(false);
        C59534zip c59534zip = new C59534zip();
        android.content.Context context = c52544wPi.copydefault().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c59534zip.register(TacticsInsideItemData.class, new C52518wOj(context, null, false, 0, false, null, null, null, 254, null));
        c52544wPi.copydefault().setAdapter(c59534zip);
        C33064mpR.OLrzqt(c59534zip, EZpvd(tacticsPortfolioInfoDetailItem));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<TacticsInsideItemData> EZpvd(TacticsPortfolioInfoDetailItem tacticsPortfolioInfoDetailItem) {
        java.lang.String ccy;
        java.lang.String ratio;
        java.lang.String investCcy;
        java.lang.String str;
        java.lang.String instType;
        java.lang.String botAmount$default;
        java.lang.String ccy2;
        java.lang.String curNum;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String botPrice$default;
        java.lang.String px;
        java.lang.String instType2;
        java.lang.String mktCap;
        java.lang.String strFmtBotValueBySymbol$default;
        java.lang.String curRatio;
        java.lang.String mktCap2;
        java.lang.String investCcy2;
        java.lang.String botAmount$default2;
        java.lang.String curNum2;
        java.lang.String instType3;
        java.lang.String curNum3;
        java.lang.String investCcy3;
        java.lang.String initNum;
        java.lang.String instType4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean zIsHistory = tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.isHistory() : false;
        if (!Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null))) {
            if (tacticsPortfolioInfoDetailItem == null || (ccy = tacticsPortfolioInfoDetailItem.getCcy()) == null) {
                ccy = "--";
            }
            xMR xmr = xMR.copydefault;
            if (tacticsPortfolioInfoDetailItem == null || (ratio = tacticsPortfolioInfoDetailItem.getRatio()) == null) {
                ratio = "";
            }
            investCcy = ccy + " " + pTB.KWHzl(xmr.OLrzqt((java.lang.Object) ratio), 0, RoundingMode.DOWN) + " ";
        } else {
            if (tacticsPortfolioInfoDetailItem == null || (investCcy = tacticsPortfolioInfoDetailItem.getInvestCcy()) == null) {
                str = "";
            }
            java.lang.String str5 = (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCcy() : null) + "-" + (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null);
            java.lang.String str6 = "BTC-" + (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null);
            if (tacticsPortfolioInfoDetailItem != null || (instType = tacticsPortfolioInfoDetailItem.getInstType()) == null) {
                instType = "SPOT";
            }
            java.lang.String strAhwBna = C56033xvF.AhwBna(instType, str6, tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getDisplayId() : null);
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setElevation), str, "", 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131064, null));
            if (!Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null))) {
                java.lang.String initNum2 = tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getInitNum() : null;
                if (initNum2 == null || initNum2.length() == 0) {
                    botAmount$default = "--";
                } else {
                    botAmount$default = C56033xvF.getBotAmount$default((tacticsPortfolioInfoDetailItem == null || (instType4 = tacticsPortfolioInfoDetailItem.getInstType()) == null) ? "SPOT" : instType4, str5, (tacticsPortfolioInfoDetailItem == null || (initNum = tacticsPortfolioInfoDetailItem.getInitNum()) == null) ? "" : initNum, null, false, null, 56, null);
                }
            }
            if (!Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getTradeQuoteCcy() : null))) {
                if (!Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null))) {
                    if (tacticsPortfolioInfoDetailItem != null) {
                        ccy2 = tacticsPortfolioInfoDetailItem.getCcy();
                    }
                }
            } else if (tacticsPortfolioInfoDetailItem == null || (ccy2 = tacticsPortfolioInfoDetailItem.getTradeQuoteCcy()) == null) {
                ccy2 = tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getCcy() : null;
            }
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.lambda) + "(" + ccy2 + ")", botAmount$default, "", 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131064, null));
            curNum = tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCurNum() : null;
            if (curNum != null || curNum.length() == 0) {
                str2 = "--";
            } else {
                if (Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null))) {
                    botAmount$default2 = C56033xvF.fmtBotValueBySymbol$default((tacticsPortfolioInfoDetailItem == null || (investCcy3 = tacticsPortfolioInfoDetailItem.getInvestCcy()) == null) ? "" : investCcy3, (tacticsPortfolioInfoDetailItem == null || (curNum3 = tacticsPortfolioInfoDetailItem.getCurNum()) == null) ? "" : curNum3, RoundingMode.DOWN, false, null, false, null, null, null, null, null, 2040, null);
                } else {
                    botAmount$default2 = C56033xvF.getBotAmount$default((tacticsPortfolioInfoDetailItem == null || (instType3 = tacticsPortfolioInfoDetailItem.getInstType()) == null) ? "SPOT" : instType3, str5, (tacticsPortfolioInfoDetailItem == null || (curNum2 = tacticsPortfolioInfoDetailItem.getCurNum()) == null) ? "" : curNum2, null, false, null, 56, null);
                }
                str2 = botAmount$default2;
            }
            if (!zIsHistory) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.BinderThread);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(strAYXKKw);
                str4 = "(";
                sb.append(str4);
                sb.append(ccy2);
                str3 = ")";
                sb.append(str3);
                arrayList.add(new TacticsInsideItemData(sb.toString(), str2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            } else {
                str3 = ")";
                str4 = "(";
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ColorInt) + str4 + ccy2 + str3, str2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            if (!Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null))) {
                java.lang.String px2 = tacticsPortfolioInfoDetailItem != null ? tacticsPortfolioInfoDetailItem.getPx() : null;
                if (px2 == null || px2.length() == 0) {
                    botPrice$default = "--";
                } else {
                    botPrice$default = C56033xvF.getBotPrice$default((tacticsPortfolioInfoDetailItem == null || (instType2 = tacticsPortfolioInfoDetailItem.getInstType()) == null) ? "SPOT" : instType2, str5, (tacticsPortfolioInfoDetailItem == null || (px = tacticsPortfolioInfoDetailItem.getPx()) == null) ? "" : px, false, false, null, null, 120, null);
                }
            }
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(!zIsHistory ? C55688xof.Application.CallSuper : C55688xof.Application.parameter) + str4 + strAhwBna + str3, botPrice$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            mktCap = tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getMktCap() : null;
            if (mktCap != null || mktCap.length() == 0) {
                strFmtBotValueBySymbol$default = "--";
            } else {
                strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default((tacticsPortfolioInfoDetailItem == null || (investCcy2 = tacticsPortfolioInfoDetailItem.getInvestCcy()) == null) ? "" : investCcy2, (tacticsPortfolioInfoDetailItem == null || (mktCap2 = tacticsPortfolioInfoDetailItem.getMktCap()) == null) ? "" : mktCap2, RoundingMode.DOWN, false, null, false, null, null, null, null, null, 2040, null);
            }
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ColorLong) + str4 + ccy2 + str3, strFmtBotValueBySymbol$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ColorRes), (tacticsPortfolioInfoDetailItem != null || (curRatio = tacticsPortfolioInfoDetailItem.getCurRatio()) == null) ? "--" : curRatio, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            return arrayList;
        }
        str = investCcy;
        if (tacticsPortfolioInfoDetailItem == null) {
        }
        if (tacticsPortfolioInfoDetailItem == null) {
        }
        java.lang.String str52 = (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCcy() : null) + "-" + (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null);
        if (tacticsPortfolioInfoDetailItem == null) {
        }
        java.lang.String str62 = "BTC-" + (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null);
        if (tacticsPortfolioInfoDetailItem != null) {
            instType = "SPOT";
        }
        java.lang.String strAhwBna2 = C56033xvF.AhwBna(instType, str62, tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getDisplayId() : null);
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setElevation), str, "", 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131064, null));
        if (!Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null))) {
        }
        if (!Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getTradeQuoteCcy() : null))) {
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.lambda) + "(" + ccy2 + ")", botAmount$default, "", 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131064, null));
        if (tacticsPortfolioInfoDetailItem == null) {
        }
        if (curNum != null) {
            str2 = "--";
        }
        if (!zIsHistory) {
        }
        if (!Intrinsics.EZpvd((java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getCcy() : null), (java.lang.Object) (tacticsPortfolioInfoDetailItem == null ? tacticsPortfolioInfoDetailItem.getInvestCcy() : null))) {
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(!zIsHistory ? C55688xof.Application.CallSuper : C55688xof.Application.parameter) + str4 + strAhwBna2 + str3, botPrice$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (tacticsPortfolioInfoDetailItem == null) {
        }
        if (mktCap != null) {
            strFmtBotValueBySymbol$default = "--";
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ColorLong) + str4 + ccy2 + str3, strFmtBotValueBySymbol$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ColorRes), (tacticsPortfolioInfoDetailItem != null || (curRatio = tacticsPortfolioInfoDetailItem.getCurRatio()) == null) ? "--" : curRatio, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        return arrayList;
    }
}
