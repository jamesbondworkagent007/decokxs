package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.BotLeadProfitProfitTopDetails;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51256vjb extends AbstractC59533zio<BotLeadProfitProfitTopDetails, C51260vjf> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C51260vjf onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.DQzvGNdrmXxudrmXxu, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C51260vjf(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull C51260vjf c51260vjf, @NotNull BotLeadProfitProfitTopDetails botLeadProfitProfitTopDetails) {
        java.lang.String profitSharingCcy;
        java.lang.String profitSharingCcy2;
        java.lang.String profitSharingCcy3;
        java.lang.String profitSharingCcy4;
        java.lang.String followerAssets;
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String followerCount;
        java.lang.String pnlRatio;
        java.lang.String profitSharingRatio;
        java.lang.String profitSharingCcy5;
        java.lang.String estimatedProfitSharing;
        java.lang.String totalPnl;
        java.lang.String instType2;
        java.lang.String instId2;
        java.lang.String profitSharingCcy6;
        java.lang.String accumulatedProfitSharing;
        java.lang.String status;
        int i;
        java.lang.String leverage;
        java.lang.String direction;
        java.lang.String direction2;
        java.lang.String direction3;
        java.lang.String direction4;
        java.lang.String direction5;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c51260vjf, "");
        Intrinsics.checkNotNullParameter(botLeadProfitProfitTopDetails, "");
        android.widget.TextView textViewEZpvd = c51260vjf.EZpvd();
        if (textViewEZpvd != null) {
            C54799xVt c54799xVt = C54799xVt.AEQbTJ;
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt = botLeadProfitProfitTopDetails.OLrzqt();
            java.lang.String instId3 = botLeadStrateShowDataOLrzqt != null ? botLeadStrateShowDataOLrzqt.getInstId() : null;
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt2 = botLeadProfitProfitTopDetails.OLrzqt();
            textViewEZpvd.setText(C54799xVt.getTitleByIdAndType$default(c54799xVt, instId3, botLeadStrateShowDataOLrzqt2 != null ? botLeadStrateShowDataOLrzqt2.getInstType() : null, false, false, 12, null));
        }
        android.widget.TextView textViewDjBIcL = c51260vjf.djBIcL();
        if (textViewDjBIcL != null) {
            TacticsType.TaskDescription taskDescription = TacticsType.Companion;
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt3 = botLeadProfitProfitTopDetails.OLrzqt();
            TacticsType tacticsTypeAEQbTJ = taskDescription.AEQbTJ(botLeadStrateShowDataOLrzqt3 != null ? botLeadStrateShowDataOLrzqt3.getBotType() : null);
            textViewDjBIcL.setText(tacticsTypeAEQbTJ != null ? C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName()) : null);
        }
        android.widget.TextView textViewCopydefault = c51260vjf.copydefault();
        int i2 = 0;
        if (textViewCopydefault != null) {
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt4 = botLeadProfitProfitTopDetails.OLrzqt();
            if (botLeadStrateShowDataOLrzqt4 == null || (direction3 = botLeadStrateShowDataOLrzqt4.getDirection()) == null) {
                direction3 = "";
            }
            textViewCopydefault.setText(C56033xvF.AhwBna(direction3));
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt5 = botLeadProfitProfitTopDetails.OLrzqt();
            if (botLeadStrateShowDataOLrzqt5 == null || (direction4 = botLeadStrateShowDataOLrzqt5.getDirection()) == null) {
                direction4 = "";
            }
            textViewCopydefault.setTextColor(C56033xvF.getContractGridSideColor$default(direction4, false, 2, null));
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt6 = botLeadProfitProfitTopDetails.OLrzqt();
            if (botLeadStrateShowDataOLrzqt6 == null || (direction5 = botLeadStrateShowDataOLrzqt6.getDirection()) == null) {
                direction5 = "";
            }
            textViewCopydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56033xvF.getContractGridSideBgColor$default(direction5, false, 2, null)));
        }
        android.widget.TextView textViewGEmmrt = c51260vjf.gEmmrt();
        if (textViewGEmmrt != null) {
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt7 = botLeadProfitProfitTopDetails.OLrzqt();
            if (botLeadStrateShowDataOLrzqt7 == null || (leverage = botLeadStrateShowDataOLrzqt7.getLeverage()) == null) {
                leverage = "";
            }
            textViewGEmmrt.setText(C56033xvF.getBotLever$default(leverage, false, 2, null));
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt8 = botLeadProfitProfitTopDetails.OLrzqt();
            if (botLeadStrateShowDataOLrzqt8 == null || (direction = botLeadStrateShowDataOLrzqt8.getDirection()) == null) {
                direction = "";
            }
            textViewGEmmrt.setTextColor(C56033xvF.getContractGridSideColor$default(direction, false, 2, null));
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt9 = botLeadProfitProfitTopDetails.OLrzqt();
            if (botLeadStrateShowDataOLrzqt9 == null || (direction2 = botLeadStrateShowDataOLrzqt9.getDirection()) == null) {
                direction2 = "";
            }
            textViewGEmmrt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C56033xvF.getContractGridSideBgColor$default(direction2, false, 2, null)));
        }
        android.widget.TextView textViewCopydefault2 = c51260vjf.copydefault();
        if (textViewCopydefault2 != null) {
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt10 = botLeadProfitProfitTopDetails.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) (botLeadStrateShowDataOLrzqt10 != null ? botLeadStrateShowDataOLrzqt10.getBotType() : null), (java.lang.Object) "contract_dca")) {
                i = 0;
                textViewCopydefault2.setVisibility(i);
            } else {
                BotLeadStrateShowData botLeadStrateShowDataOLrzqt11 = botLeadProfitProfitTopDetails.OLrzqt();
                if (!Intrinsics.EZpvd((java.lang.Object) (botLeadStrateShowDataOLrzqt11 != null ? botLeadStrateShowDataOLrzqt11.getBotType() : null), (java.lang.Object) "contract_grid")) {
                    i = 8;
                }
                textViewCopydefault2.setVisibility(i);
            }
        }
        android.widget.TextView textViewGEmmrt2 = c51260vjf.gEmmrt();
        if (textViewGEmmrt2 != null) {
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt12 = botLeadProfitProfitTopDetails.OLrzqt();
            if (!Intrinsics.EZpvd((java.lang.Object) (botLeadStrateShowDataOLrzqt12 != null ? botLeadStrateShowDataOLrzqt12.getBotType() : null), (java.lang.Object) "contract_dca")) {
                BotLeadStrateShowData botLeadStrateShowDataOLrzqt13 = botLeadProfitProfitTopDetails.OLrzqt();
                if (!Intrinsics.EZpvd((java.lang.Object) (botLeadStrateShowDataOLrzqt13 != null ? botLeadStrateShowDataOLrzqt13.getBotType() : null), (java.lang.Object) "contract_grid")) {
                    i2 = 8;
                }
            }
            textViewGEmmrt2.setVisibility(i2);
        }
        android.widget.TextView textViewValues = c51260vjf.values();
        if (textViewValues != null) {
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl = botLeadProfitProfitTopDetails.KWHzl();
            if (botLeadProfitProfitOrderDetailsKWHzl == null || (status = botLeadProfitProfitOrderDetailsKWHzl.getStatus()) == null) {
                status = "";
            }
            textViewValues.setText(C56033xvF.fetchVPNInfo(status).getFirst());
        }
        android.widget.TextView textViewOLrzqt = c51260vjf.OLrzqt();
        if (textViewOLrzqt != null) {
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl2 = botLeadProfitProfitTopDetails.KWHzl();
            java.lang.String str2 = (botLeadProfitProfitOrderDetailsKWHzl2 == null || (accumulatedProfitSharing = botLeadProfitProfitOrderDetailsKWHzl2.getAccumulatedProfitSharing()) == null) ? "" : accumulatedProfitSharing;
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl3 = botLeadProfitProfitTopDetails.KWHzl();
            textViewOLrzqt.setText(C56033xvF.getBotPnl$default("", "", str2, (botLeadProfitProfitOrderDetailsKWHzl3 == null || (profitSharingCcy6 = botLeadProfitProfitOrderDetailsKWHzl3.getProfitSharingCcy()) == null) ? "" : profitSharingCcy6, false, false, null, false, null, null, null, 2032, null));
        }
        android.widget.TextView textViewAYXKKw = c51260vjf.AYXKKw();
        if (textViewAYXKKw != null) {
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt14 = botLeadProfitProfitTopDetails.OLrzqt();
            java.lang.String str3 = (botLeadStrateShowDataOLrzqt14 == null || (instId2 = botLeadStrateShowDataOLrzqt14.getInstId()) == null) ? "" : instId2;
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt15 = botLeadProfitProfitTopDetails.OLrzqt();
            java.lang.String str4 = (botLeadStrateShowDataOLrzqt15 == null || (instType2 = botLeadStrateShowDataOLrzqt15.getInstType()) == null) ? "" : instType2;
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl4 = botLeadProfitProfitTopDetails.KWHzl();
            textViewAYXKKw.setText(C56033xvF.getBotPnl$default(str3, str4, (botLeadProfitProfitOrderDetailsKWHzl4 == null || (totalPnl = botLeadProfitProfitOrderDetailsKWHzl4.getTotalPnl()) == null) ? "" : totalPnl, null, false, true, null, false, null, null, null, 2008, null));
        }
        android.widget.TextView textViewAYXKKw2 = c51260vjf.AYXKKw();
        if (textViewAYXKKw2 != null) {
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl5 = botLeadProfitProfitTopDetails.KWHzl();
            textViewAYXKKw2.setTextColor(C56033xvF.OLrzqt((java.lang.Object) (botLeadProfitProfitOrderDetailsKWHzl5 != null ? botLeadProfitProfitOrderDetailsKWHzl5.getTotalPnl() : null)));
        }
        android.widget.TextView textViewAEQbTJ = c51260vjf.AEQbTJ();
        if (textViewAEQbTJ != null) {
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl6 = botLeadProfitProfitTopDetails.KWHzl();
            java.lang.String str5 = (botLeadProfitProfitOrderDetailsKWHzl6 == null || (estimatedProfitSharing = botLeadProfitProfitOrderDetailsKWHzl6.getEstimatedProfitSharing()) == null) ? "" : estimatedProfitSharing;
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl7 = botLeadProfitProfitTopDetails.KWHzl();
            textViewAEQbTJ.setText(C56033xvF.getBotPnl$default("", "", str5, (botLeadProfitProfitOrderDetailsKWHzl7 == null || (profitSharingCcy5 = botLeadProfitProfitOrderDetailsKWHzl7.getProfitSharingCcy()) == null) ? "" : profitSharingCcy5, false, false, null, false, null, null, null, 2032, null));
        }
        android.widget.TextView textViewFetchVPNInfo = c51260vjf.fetchVPNInfo();
        if (textViewFetchVPNInfo != null) {
            xMR xmr = xMR.copydefault;
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl8 = botLeadProfitProfitTopDetails.KWHzl();
            if (botLeadProfitProfitOrderDetailsKWHzl8 == null || (profitSharingRatio = botLeadProfitProfitOrderDetailsKWHzl8.getProfitSharingRatio()) == null) {
                profitSharingRatio = "";
            }
            textViewFetchVPNInfo.setText(pTB.formatPercent$default(xmr.OLrzqt((java.lang.Object) profitSharingRatio), 2, 0, null, null, 12, null));
        }
        android.widget.TextView textViewAkhnZx = c51260vjf.AkhnZx();
        if (textViewAkhnZx != null) {
            xMR xmr2 = xMR.copydefault;
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl9 = botLeadProfitProfitTopDetails.KWHzl();
            if (botLeadProfitProfitOrderDetailsKWHzl9 == null || (pnlRatio = botLeadProfitProfitOrderDetailsKWHzl9.getPnlRatio()) == null) {
                pnlRatio = "";
            }
            textViewAkhnZx.setText(pTB.formatPercentWithSymbol$default(xmr2.OLrzqt((java.lang.Object) pnlRatio), 0, 0, null, null, 15, null));
        }
        android.widget.TextView textViewAkhnZx2 = c51260vjf.AkhnZx();
        if (textViewAkhnZx2 != null) {
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl10 = botLeadProfitProfitTopDetails.KWHzl();
            textViewAkhnZx2.setTextColor(C56033xvF.OLrzqt((java.lang.Object) (botLeadProfitProfitOrderDetailsKWHzl10 != null ? botLeadProfitProfitOrderDetailsKWHzl10.getPnlRatio() : null)));
        }
        android.widget.TextView textViewIsConnected = c51260vjf.isConnected();
        if (textViewIsConnected != null) {
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl11 = botLeadProfitProfitTopDetails.KWHzl();
            java.lang.String pTime = botLeadProfitProfitOrderDetailsKWHzl11 != null ? botLeadProfitProfitOrderDetailsKWHzl11.getPTime() : null;
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl12 = botLeadProfitProfitTopDetails.KWHzl();
            textViewIsConnected.setText(copydefault(C33129mqd.subS$default(pTime, botLeadProfitProfitOrderDetailsKWHzl12 != null ? botLeadProfitProfitOrderDetailsKWHzl12.getCTime() : null, null, null, null, 14, null)));
        }
        android.widget.TextView textViewAhwBna = c51260vjf.AhwBna();
        if (textViewAhwBna != null) {
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl13 = botLeadProfitProfitTopDetails.KWHzl();
            if (botLeadProfitProfitOrderDetailsKWHzl13 == null || (followerCount = botLeadProfitProfitOrderDetailsKWHzl13.getFollowerCount()) == null) {
                followerCount = "";
            }
            textViewAhwBna.setText(followerCount);
        }
        android.widget.TextView textViewFARcdN = c51260vjf.fARcdN();
        if (textViewFARcdN != null) {
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt16 = botLeadProfitProfitTopDetails.OLrzqt();
            java.lang.String str6 = (botLeadStrateShowDataOLrzqt16 == null || (instId = botLeadStrateShowDataOLrzqt16.getInstId()) == null) ? "" : instId;
            BotLeadStrateShowData botLeadStrateShowDataOLrzqt17 = botLeadProfitProfitTopDetails.OLrzqt();
            java.lang.String str7 = (botLeadStrateShowDataOLrzqt17 == null || (instType = botLeadStrateShowDataOLrzqt17.getInstType()) == null) ? "" : instType;
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl14 = botLeadProfitProfitTopDetails.KWHzl();
            textViewFARcdN.setText(C56033xvF.getBotPnl$default(str6, str7, (botLeadProfitProfitOrderDetailsKWHzl14 == null || (followerAssets = botLeadProfitProfitOrderDetailsKWHzl14.getFollowerAssets()) == null) ? "" : followerAssets, null, false, false, null, false, null, null, null, 2008, null));
        }
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        android.app.Application applicationOLrzqt = c32979mnm.OLrzqt();
        int i3 = C55688xof.Application.onPlayFromUri;
        BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl15 = botLeadProfitProfitTopDetails.KWHzl();
        if (botLeadProfitProfitOrderDetailsKWHzl15 == null || (profitSharingCcy = botLeadProfitProfitOrderDetailsKWHzl15.getProfitSharingCcy()) == null) {
            profitSharingCcy = "";
        }
        java.lang.String strKWHzl = C33069mpW.KWHzl(applicationOLrzqt, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy)));
        android.widget.TextView textViewValueOf = c51260vjf.valueOf();
        if (textViewValueOf != null) {
            textViewValueOf.setText(strKWHzl);
        }
        android.widget.TextView textViewDbNXlk = c51260vjf.DbNXlk();
        if (textViewDbNXlk != null) {
            int i4 = C55688xof.Application.onSetCaptioningEnabled;
            BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl16 = botLeadProfitProfitTopDetails.KWHzl();
            if (botLeadProfitProfitOrderDetailsKWHzl16 == null || (profitSharingCcy4 = botLeadProfitProfitOrderDetailsKWHzl16.getProfitSharingCcy()) == null) {
                profitSharingCcy4 = "";
            }
            textViewDbNXlk.setText(C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy4))));
        }
        android.app.Application applicationOLrzqt2 = c32979mnm.OLrzqt();
        int i5 = C55688xof.Application.onRemoveQueueItem;
        BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl17 = botLeadProfitProfitTopDetails.KWHzl();
        if (botLeadProfitProfitOrderDetailsKWHzl17 == null || (profitSharingCcy2 = botLeadProfitProfitOrderDetailsKWHzl17.getProfitSharingCcy()) == null) {
            profitSharingCcy2 = "";
        }
        java.lang.String strKWHzl2 = C33069mpW.KWHzl(applicationOLrzqt2, i5, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy2)));
        android.widget.TextView textViewKWHzl = c51260vjf.KWHzl();
        if (textViewKWHzl != null) {
            textViewKWHzl.setText(strKWHzl2);
        }
        android.app.Application applicationOLrzqt3 = c32979mnm.OLrzqt();
        int i6 = C55688xof.Application.MediaSessionCompatCallbackStubApi21;
        BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetailsKWHzl18 = botLeadProfitProfitTopDetails.KWHzl();
        if (botLeadProfitProfitOrderDetailsKWHzl18 != null && (profitSharingCcy3 = botLeadProfitProfitOrderDetailsKWHzl18.getProfitSharingCcy()) != null) {
            str = profitSharingCcy3;
        }
        java.lang.String strKWHzl3 = C33069mpW.KWHzl(applicationOLrzqt3, i6, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str)));
        android.widget.TextView textViewFIwbmz = c51260vjf.fIwbmz();
        if (textViewFIwbmz != null) {
            textViewFIwbmz.setText(strKWHzl3);
        }
    }

    public final java.lang.String copydefault(java.lang.String str) {
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault(C33129mqd.divS$default(str, "86400000", 0, null, null, 12, null));
        java.lang.String strRemS$default = C33129mqd.remS$default(str, "86400000", null, null, null, 14, null);
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda3), C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, strCopydefault), C56390yDp.OLrzqt("hour", xmr.copydefault(C33129mqd.divS$default(strRemS$default, "3600000", 0, null, null, 12, null))), C56390yDp.OLrzqt("minute", xmr.copydefault(C33129mqd.divS$default(C33129mqd.remS$default(strRemS$default, "3600000", null, null, null, 14, null), "60000", 0, null, null, 12, null)))));
    }
}
