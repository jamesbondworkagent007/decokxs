package o;

import android.widget.LinearLayout;
import androidx.camera.core.RetryPolicy;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class iBJ {
    public final java.util.Set<java.lang.String> KWHzl = new LinkedHashSet();
    public final java.util.Set<java.lang.String> EZpvd = new LinkedHashSet();
    public final java.util.Set<java.lang.String> OLrzqt = new LinkedHashSet();

    @yCM
    public iBJ() {
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str3 != null && str3.length() != 0) {
            this.OLrzqt.add(str3);
        }
        if (str != null && str.length() != 0) {
            this.KWHzl.add(str);
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        this.EZpvd.add(str2);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str3 != null && str3.length() != 0) {
            this.OLrzqt.remove(str3);
        }
        if (str != null && str.length() != 0) {
            this.KWHzl.remove(str);
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        this.EZpvd.remove(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull final android.content.Context context, @NotNull final InvestTransactionModel investTransactionModel) {
        C55097xdX c55097xdX;
        C55097xdX c55097xdXMakeNotification$default;
        java.lang.Long relatedInvestmentId;
        java.lang.Long relatedInvestmentId2;
        java.lang.String strAYXKKw;
        java.lang.Integer nextOrderType;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        java.lang.String uopHash = investTransactionModel.getUopHash();
        if (uopHash != null && uopHash.length() != 0 && this.OLrzqt.contains(uopHash)) {
            return;
        }
        java.lang.String txHash = investTransactionModel.getTxHash();
        if (txHash != null && txHash.length() != 0 && this.KWHzl.contains(txHash)) {
            return;
        }
        java.lang.String orderId = investTransactionModel.getOrderId();
        if (orderId != null && orderId.length() != 0 && this.EZpvd.contains(orderId)) {
            return;
        }
        java.lang.Integer pushToastCode = investTransactionModel.getPushToastCode();
        if (pushToastCode != null && pushToastCode.intValue() == 0) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 1, C25493ixk.FragmentManager.dXcUrg, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if ((pushToastCode != null && pushToastCode.intValue() == 1) || (pushToastCode != null && pushToastCode.intValue() == 37)) {
            int i = C25493ixk.FragmentManager.fAklCm;
            InvestTransactionParam routerParams = investTransactionModel.getRouterParams();
            if (routerParams != null && routerParams.isHalfApproved()) {
                InvestTransactionParam routerParams2 = investTransactionModel.getRouterParams();
                if (routerParams2 != null && (nextOrderType = routerParams2.getNextOrderType()) != null && nextOrderType.intValue() == 8) {
                    strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.GzAsTt);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.hcetpZ);
                }
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.RhjxDW);
            }
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, i, strAYXKKw, null, new Function0() { // from class: o.iBK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.AuCTel(this.AEQbTJ, context, investTransactionModel);
                }
            }, 32, null);
        } else if ((pushToastCode != null && pushToastCode.intValue() == 2) || (pushToastCode != null && pushToastCode.intValue() == 38)) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.fAklCm, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DeEinT), null, new Function0() { // from class: o.iCd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.fJNWhG(this.KWHzl, context, investTransactionModel);
                }
            }, 32, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 5) {
            c55097xdXMakeNotification$default = EZpvd(context, investTransactionModel, 3, C25493ixk.FragmentManager.aappFQ, C33070mpX.AYXKKw(C25493ixk.FragmentManager.dSJNDS), java.lang.Boolean.TRUE, new Function0() { // from class: o.iBN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.zsXlph(this.EZpvd, context, investTransactionModel);
                }
            });
        } else if (pushToastCode != null && pushToastCode.intValue() == 6) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 3, C25493ixk.FragmentManager.aappFQ, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 7) {
            InvestTransactionParam routerParams3 = investTransactionModel.getRouterParams();
            if (routerParams3 != null && (relatedInvestmentId2 = routerParams3.getRelatedInvestmentId()) != null && C33129mqd.AEQbTJ(relatedInvestmentId2, 0)) {
                InvestTransactionParam routerParams4 = investTransactionModel.getRouterParams();
                if (routerParams4 != null && Intrinsics.EZpvd(routerParams4.isBorrowSupply(), java.lang.Boolean.TRUE)) {
                    c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.dmfpNf, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DXXBbs), null, new Function0() { // from class: o.iBR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return iBJ.wlaJM(this.EZpvd, context, investTransactionModel);
                        }
                    }, 32, null);
                } else {
                    c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.dmfpNf, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RhjxDW), null, new Function0() { // from class: o.iBO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return iBJ.AubY(this.EZpvd, context, investTransactionModel);
                        }
                    }, 32, null);
                }
            } else {
                c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.dmfpNf, C33070mpX.AYXKKw(C25493ixk.FragmentManager.swzYdv), null, new Function0() { // from class: o.iBQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return iBJ.AuCTelauCTel(this.AEQbTJ, context, investTransactionModel);
                    }
                }, 32, null);
            }
        } else if (pushToastCode != null && pushToastCode.intValue() == 32) {
            InvestTransactionParam routerParams5 = investTransactionModel.getRouterParams();
            if (routerParams5 != null && (relatedInvestmentId = routerParams5.getRelatedInvestmentId()) != null && C33129mqd.AEQbTJ(relatedInvestmentId, 0)) {
                c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.hwkNQP, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RhjxDW), null, new Function0() { // from class: o.iBS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return iBJ.sSMYrx(this.EZpvd, context, investTransactionModel);
                    }
                }, 32, null);
            } else {
                c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.hwkNQP, C33070mpX.AYXKKw(C25493ixk.FragmentManager.OxbLUn), null, new Function0() { // from class: o.iBT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return iBJ.zuBGHE(this.AEQbTJ, context, investTransactionModel);
                    }
                }, 32, null);
            }
        } else if (pushToastCode != null && pushToastCode.intValue() == 8) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.hwkNQP, C33070mpX.AYXKKw(C25493ixk.FragmentManager.OxbLUn), null, new Function0() { // from class: o.iBW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.AxsJAY(this.copydefault, context, investTransactionModel);
                }
            }, 32, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 10) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.ODXsMY, C33070mpX.AYXKKw(C25493ixk.FragmentManager.swzYdv), null, new Function0() { // from class: o.iBV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.AwvSrB(this.KWHzl, context, investTransactionModel);
                }
            }, 32, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 35) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.gwTjWJ, C33070mpX.AYXKKw(C25493ixk.FragmentManager.swzYdv), null, new Function0() { // from class: o.iBP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.fIwbmz(this.KWHzl, context, investTransactionModel);
                }
            }, 32, null);
        } else if ((pushToastCode != null && pushToastCode.intValue() == 9) || ((pushToastCode != null && pushToastCode.intValue() == 11) || ((pushToastCode != null && pushToastCode.intValue() == 36) || (pushToastCode != null && pushToastCode.intValue() == 44)))) {
            c55097xdXMakeNotification$default = EZpvd(context, investTransactionModel, 3, C25493ixk.FragmentManager.dHguZz, C33070mpX.AYXKKw(C25493ixk.FragmentManager.dSJNDS), java.lang.Boolean.TRUE, new Function0() { // from class: o.iCa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.hDKMBd(this.copydefault, context, investTransactionModel);
                }
            });
        } else if (pushToastCode != null && pushToastCode.intValue() == 12) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.gFTCsA, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 13) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 3, C25493ixk.FragmentManager.gdLjtZ, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 14) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.Qsauvs, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 15) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 3, C25493ixk.FragmentManager.DVmcag, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 16) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 1, C25493ixk.FragmentManager.iLWfRf, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 17) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 3, C25493ixk.FragmentManager.HJWChPHhYHK, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 18) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 1, C25493ixk.FragmentManager.putInt, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 23) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.invokespecialaKhcqp, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RhjxDW), null, new Function0() { // from class: o.iBY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.getFieldNames(this.AEQbTJ, context, investTransactionModel);
                }
            }, 32, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 24) {
            c55097xdXMakeNotification$default = EZpvd(context, investTransactionModel, 3, C25493ixk.FragmentManager.invokespecialRtjmuc, C33070mpX.AYXKKw(C25493ixk.FragmentManager.dSJNDS), java.lang.Boolean.TRUE, new Function0() { // from class: o.iBZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.iwGUEr(this.copydefault, context, investTransactionModel);
                }
            });
        } else if (pushToastCode != null && pushToastCode.intValue() == 25) {
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.config, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DeEinT), null, new Function0() { // from class: o.iCb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.uzCIH(this.EZpvd, context, investTransactionModel);
                }
            }, 32, null);
        } else if (pushToastCode != null && pushToastCode.intValue() == 26) {
            c55097xdXMakeNotification$default = EZpvd(context, investTransactionModel, 3, C25493ixk.FragmentManager.QMuEJi, C33070mpX.AYXKKw(C25493ixk.FragmentManager.dSJNDS), java.lang.Boolean.TRUE, new Function0() { // from class: o.iCf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.getNewProxyInstance(this.OLrzqt, context, investTransactionModel);
                }
            });
        } else {
            if (pushToastCode == null || pushToastCode.intValue() != 43) {
                c55097xdX = null;
                if (c55097xdX == null) {
                    C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 0L, 0, 0, 0, 30, null);
                    C27570jxg.investEvent$default("Toast_TransactionDone_View", null, new Function1() { // from class: o.iCe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return iBJ.AEQbTJ(investTransactionModel, this, (EventParamsList) obj);
                        }
                    }, 1, null);
                    return;
                }
                return;
            }
            c55097xdXMakeNotification$default = makeNotification$default(this, context, investTransactionModel, 2, C25493ixk.FragmentManager.RdAHlO, C33070mpX.AYXKKw(C25493ixk.FragmentManager.swzYdv), null, new Function0() { // from class: o.iCc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return iBJ.zLjUOn(this.AEQbTJ, context, investTransactionModel);
                }
            }, 32, null);
        }
        c55097xdX = c55097xdXMakeNotification$default;
        if (c55097xdX == null) {
        }
    }

    public static final Unit AuCTel(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.valueOf(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.OLrzqt(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit zsXlph(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) throws java.io.UnsupportedEncodingException {
        ibj.AEQbTJ(context, investTransactionModel.getUrl());
        return Unit.INSTANCE;
    }

    public static final Unit wlaJM(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.KWHzl(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit AubY(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.EZpvd(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.copydefault(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit sSMYrx(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.EZpvd(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.copydefault(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAY(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.copydefault(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.copydefault(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.copydefault(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) throws java.io.UnsupportedEncodingException {
        ibj.AEQbTJ(context, investTransactionModel.getUrl());
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.valueOf(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) throws java.io.UnsupportedEncodingException {
        ibj.AEQbTJ(context, investTransactionModel.getUrl());
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.OLrzqt(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) throws java.io.UnsupportedEncodingException {
        ibj.AEQbTJ(context, investTransactionModel.getUrl());
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel) {
        ibj.copydefault(context, investTransactionModel);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InvestTransactionModel investTransactionModel, iBJ ibj, EventParamsList eventParamsList) {
        java.util.List<java.lang.Long> investmentIdList;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, C33129mqd.gEmmrt(investTransactionModel.getOrderId()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tx_id", C33129mqd.gEmmrt(investTransactionModel.getTxHash()), false, 4, null);
        InvestTransactionParam routerParams = investTransactionModel.getRouterParams();
        EventParamsList.put$default(eventParamsList, "investment_id", C33129mqd.gEmmrt((routerParams == null || (investmentIdList = routerParams.getInvestmentIdList()) == null) ? null : (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList)), false, 4, null);
        eventParamsList.put("status", ibj.EZpvd(investTransactionModel.getPushToastCode()), true);
        eventParamsList.put("type", ibj.KWHzl(investTransactionModel.getPushToastCode()), true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.iBJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C55097xdX makeNotification$default(iBJ ibj, android.content.Context context, InvestTransactionModel investTransactionModel, int i, int i2, java.lang.String str, java.lang.Boolean bool, Function0 function0, int i3, java.lang.Object obj) {
        return ibj.EZpvd(context, investTransactionModel, i, i2, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? java.lang.Boolean.FALSE : bool, (i3 & 64) != 0 ? null : function0);
    }

    public final C55097xdX EZpvd(android.content.Context context, final InvestTransactionModel investTransactionModel, int i, int i2, java.lang.String str, java.lang.Boolean bool, final Function0<Unit> function0) {
        java.lang.String str2;
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 6, null);
        c55097xdX.setType(1);
        c55097xdX.setState(i);
        android.widget.TextView textViewEZpvd = c55097xdX.EZpvd();
        java.util.List<java.lang.String> pushToastParams = investTransactionModel.getPushToastParams();
        if (pushToastParams == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(pushToastParams)) == null) {
            str2 = "";
        }
        c55097xdX.setTitle(AEQbTJ(textViewEZpvd, i2, str2));
        c55097xdX.OLrzqt(str, new Function0() { // from class: o.iBU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iBJ.KWHzl(function0, investTransactionModel, this);
            }
        });
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageResource(C52761wXj.TaskDescription.dNxZaP);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C33052mpF.dp2px$default(24.0f, null, 1, null), C33052mpF.dp2px$default(24.0f, null, 1, null));
            layoutParams.gravity = 16;
            layoutParams.setMarginStart(C33052mpF.dp2px$default(4.0f, null, 1, null));
            imageView.setLayoutParams(layoutParams);
            c55097xdX.AEQbTJ(imageView);
        }
        if (i == 1) {
            c55097xdX.AEQbTJ().setBackgroundResource(C25493ixk.StateListAnimator.djBIcL);
            c55097xdX.AEQbTJ().animate().rotation(2160.0f).setDuration(RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS).setInterpolator(new android.view.animation.LinearInterpolator()).start();
        }
        return c55097xdX;
    }

    public static final Unit KWHzl(Function0 function0, final InvestTransactionModel investTransactionModel, final iBJ ibj) {
        if (function0 != null) {
            function0.invoke();
        }
        C57656ymY.OLrzqt.valueOf();
        C27570jxg.investEvent$default("Toast_Button_Click", null, new Function1() { // from class: o.iBX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iBJ.OLrzqt(investTransactionModel, ibj, (EventParamsList) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InvestTransactionModel investTransactionModel, iBJ ibj, EventParamsList eventParamsList) {
        java.util.List<java.lang.Long> investmentIdList;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, C33129mqd.gEmmrt(investTransactionModel.getOrderId()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tx_id", C33129mqd.gEmmrt(investTransactionModel.getTxHash()), false, 4, null);
        InvestTransactionParam routerParams = investTransactionModel.getRouterParams();
        EventParamsList.put$default(eventParamsList, "investment_id", C33129mqd.gEmmrt((routerParams == null || (investmentIdList = routerParams.getInvestmentIdList()) == null) ? null : (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList)), false, 4, null);
        eventParamsList.put("status", ibj.EZpvd(investTransactionModel.getPushToastCode()), true);
        eventParamsList.put("type", ibj.KWHzl(investTransactionModel.getPushToastCode()), true);
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(android.widget.TextView textView, int i, java.lang.String str) {
        java.lang.String strSubstring = str;
        android.text.TextPaint paint = textView.getPaint();
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) strSubstring, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null) || paint.measureText(strSubstring) < copydefault(textView)) {
            return strSubstring + " " + C33070mpX.AYXKKw(i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int i2 = 0;
        while (StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strSubstring, "-", 0, false, 6, (java.lang.Object) null) != -1 && i2 < 2) {
            java.lang.String str2 = StringsKt__StringsKt.substringBefore$default(strSubstring, "-", (java.lang.String) null, 2, (java.lang.Object) null) + "-";
            if (copydefault(textView) > paint.measureText(((java.lang.Object) sb2) + str2)) {
                sb2.append(str2);
                strSubstring = StringsKt__StringsKt.substringAfter$default(strSubstring, "-", (java.lang.String) null, 2, (java.lang.Object) null);
                if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) strSubstring, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
                    if (copydefault(textView) > paint.measureText(((java.lang.Object) sb2) + strSubstring)) {
                        sb.append((java.lang.CharSequence) sb2);
                        sb.append(strSubstring);
                        strSubstring = "";
                    } else {
                        sb.append((java.lang.CharSequence) sb2);
                        sb.append("\n");
                    }
                }
            } else {
                java.lang.String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                    sb.append(str2);
                    sb.append("\n");
                    strSubstring = StringsKt__StringsKt.substringAfter$default(strSubstring, "-", (java.lang.String) null, 2, (java.lang.Object) null);
                } else {
                    sb.append((java.lang.CharSequence) sb2);
                    sb.append("\n");
                    C59445zhF.EZpvd(sb2);
                }
            }
            i2++;
        }
        java.lang.String str3 = strSubstring + " " + C33070mpX.AYXKKw(i);
        while (i2 == 2 && copydefault(textView) < paint.measureText(str3) && strSubstring.length() > 1) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            str3 = strSubstring + "..." + C33070mpX.AYXKKw(i);
        }
        sb.append(str3);
        java.lang.String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final int copydefault(android.widget.TextView textView) {
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return c33566myq.EZpvd(context) - C33052mpF.dp2px$default(118.0f, null, 1, null);
    }

    public final void AEQbTJ(android.content.Context context, java.lang.String str) throws java.io.UnsupportedEncodingException {
        if (str != null) {
            C27508jwX.openUrl$default(C27508jwX.AEQbTJ, context, str, false, 2, null);
        }
    }

    public final void valueOf(android.content.Context context, InvestTransactionModel investTransactionModel) {
        java.lang.Integer investType;
        java.util.List<InvestInputData> inputList;
        java.util.List<java.lang.Long> investmentIdList;
        java.lang.Long l;
        java.lang.Integer poolVersion;
        java.util.List<InvestInputData> inputList2;
        java.lang.String tokenId;
        java.util.List<java.lang.Long> investmentIdList2;
        java.lang.Long l2;
        java.lang.Integer investType2;
        java.util.List<InvestInputData> inputList3;
        java.lang.String tokenId2;
        java.util.List<java.lang.Long> investmentIdList3;
        java.lang.Long l3;
        java.lang.Integer investType3;
        InvestTransactionParam routerParams;
        java.util.List<java.lang.Long> investmentIdList4;
        if (C54819xWm.KWHzl().AEQbTJ() == null || C54819xWm.KWHzl().AEQbTJ().isDestroyed()) {
            return;
        }
        if ((C54819xWm.KWHzl().AEQbTJ() instanceof InterfaceC23612iCv) && (routerParams = investTransactionModel.getRouterParams()) != null && (investmentIdList4 = routerParams.getInvestmentIdList()) != null) {
            android.content.ComponentCallbacks2 componentCallbacks2AEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.copydefault(componentCallbacks2AEQbTJ, "");
            long jEZpvd = ((InterfaceC23612iCv) componentCallbacks2AEQbTJ).EZpvd();
            java.lang.Long l4 = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList4);
            if (l4 != null && jEZpvd == l4.longValue()) {
                return;
            }
        }
        InvestTransactionParam routerParams2 = investTransactionModel.getRouterParams();
        int iIntValue = 2;
        if (routerParams2 != null && (poolVersion = routerParams2.getPoolVersion()) != null && poolVersion.intValue() == 2) {
            C27577jxn c27577jxn = C27577jxn.copydefault;
            InvestTransactionParam routerParams3 = investTransactionModel.getRouterParams();
            if (c27577jxn.EZpvd(java.lang.Integer.valueOf((routerParams3 == null || (investType3 = routerParams3.getInvestType()) == null) ? 2 : investType3.intValue()))) {
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                InvestTransactionParam routerParams4 = investTransactionModel.getRouterParams();
                long jLongValue = (routerParams4 == null || (investmentIdList3 = routerParams4.getInvestmentIdList()) == null || (l3 = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList3)) == null) ? 0L : l3.longValue();
                InvestTransactionParam routerParams5 = investTransactionModel.getRouterParams();
                long chainId = routerParams5 != null ? routerParams5.getChainId() : 0L;
                InvestTransactionParam routerParams6 = investTransactionModel.getRouterParams();
                java.lang.String str = (routerParams6 == null || (tokenId2 = routerParams6.getTokenId()) == null) ? "" : tokenId2;
                InvestTransactionParam routerParams7 = investTransactionModel.getRouterParams();
                java.util.ArrayList<InvestInputData> arrayList = (routerParams7 == null || (inputList3 = routerParams7.getInputList()) == null) ? null : new java.util.ArrayList<>(inputList3);
                InvestTransactionParam routerParams8 = investTransactionModel.getRouterParams();
                c27508jwX.EZpvd(context, jLongValue, chainId, str, false, arrayList, routerParams8 != null ? routerParams8.getPoolInvestV3() : null);
                return;
            }
            InvestTransactionParam routerParams9 = investTransactionModel.getRouterParams();
            if (routerParams9 != null && (investType2 = routerParams9.getInvestType()) != null) {
                iIntValue = investType2.intValue();
            }
            if (c27577jxn.copydefault(java.lang.Integer.valueOf(iIntValue))) {
                C27508jwX c27508jwX2 = C27508jwX.AEQbTJ;
                InvestTransactionParam routerParams10 = investTransactionModel.getRouterParams();
                long jLongValue2 = (routerParams10 == null || (investmentIdList2 = routerParams10.getInvestmentIdList()) == null || (l2 = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList2)) == null) ? 0L : l2.longValue();
                InvestTransactionParam routerParams11 = investTransactionModel.getRouterParams();
                long chainId2 = routerParams11 != null ? routerParams11.getChainId() : 0L;
                InvestTransactionParam routerParams12 = investTransactionModel.getRouterParams();
                java.lang.String str2 = (routerParams12 == null || (tokenId = routerParams12.getTokenId()) == null) ? "" : tokenId;
                InvestTransactionParam routerParams13 = investTransactionModel.getRouterParams();
                c27508jwX2.AEQbTJ(context, jLongValue2, chainId2, str2, false, (routerParams13 == null || (inputList2 = routerParams13.getInputList()) == null) ? null : new java.util.ArrayList(inputList2));
                return;
            }
            return;
        }
        if (AEQbTJ(investTransactionModel.getRouterParams())) {
            InvestTransactionParam routerParams14 = investTransactionModel.getRouterParams();
            java.lang.Integer pushToastCode = investTransactionModel.getPushToastCode();
            EZpvd(context, routerParams14, 1, pushToastCode != null ? pushToastCode.intValue() : 1);
            return;
        }
        InvestTransactionParam routerParams15 = investTransactionModel.getRouterParams();
        if (routerParams15 != null && (investType = routerParams15.getInvestType()) != null && investType.intValue() == 2) {
            C27508jwX c27508jwX3 = C27508jwX.AEQbTJ;
            InvestTransactionParam routerParams16 = investTransactionModel.getRouterParams();
            long jLongValue3 = (routerParams16 == null || (investmentIdList = routerParams16.getInvestmentIdList()) == null || (l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList)) == null) ? 0L : l.longValue();
            InvestTransactionParam routerParams17 = investTransactionModel.getRouterParams();
            boolean z = routerParams17 != null && routerParams17.isSingle();
            InvestTransactionParam routerParams18 = investTransactionModel.getRouterParams();
            java.util.ArrayList arrayList2 = (routerParams18 == null || (inputList = routerParams18.getInputList()) == null) ? null : new java.util.ArrayList(inputList);
            InvestTransactionParam routerParams19 = investTransactionModel.getRouterParams();
            long chainId3 = routerParams19 != null ? routerParams19.getChainId() : 0L;
            InvestTransactionParam routerParams20 = investTransactionModel.getRouterParams();
            c27508jwX3.OLrzqt(context, jLongValue3, (992 & 4) != 0 ? true : z, (992 & 8) != 0 ? null : arrayList2, (992 & 16) != 0 ? 0L : chainId3, (992 & 32) != 0 ? null : routerParams20 != null ? routerParams20.getRelatedInvestmentId() : null, (992 & 64) != 0 ? null : null, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? null : null);
            return;
        }
        OLrzqt(context, investTransactionModel.getRouterParams(), 1);
    }

    public final void EZpvd(android.content.Context context, InvestTransactionModel investTransactionModel) {
        java.lang.Long relatedInvestmentId;
        InvestTransactionParam routerParams;
        java.lang.Long relatedInvestmentId2;
        if (C54819xWm.KWHzl().AEQbTJ() == null || C54819xWm.KWHzl().AEQbTJ().isDestroyed()) {
            return;
        }
        InvestTransactionParam routerParams2 = investTransactionModel.getRouterParams();
        if (C33129mqd.valueOf(routerParams2 != null ? routerParams2.getRelatedInvestmentId() : null, 0)) {
            return;
        }
        if ((C54819xWm.KWHzl().AEQbTJ() instanceof InterfaceC23612iCv) && (routerParams = investTransactionModel.getRouterParams()) != null && (relatedInvestmentId2 = routerParams.getRelatedInvestmentId()) != null) {
            android.content.ComponentCallbacks2 componentCallbacks2AEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.copydefault(componentCallbacks2AEQbTJ, "");
            if (((InterfaceC23612iCv) componentCallbacks2AEQbTJ).EZpvd() == C33129mqd.valueOf(relatedInvestmentId2)) {
                return;
            }
        }
        InvestTransactionParam routerParams3 = investTransactionModel.getRouterParams();
        java.lang.Long relatedInvestmentId3 = routerParams3 != null ? routerParams3.getRelatedInvestmentId() : null;
        Intrinsics.copydefault(relatedInvestmentId3);
        RxBus.AEQbTJ(new C25516iyG(relatedInvestmentId3.longValue()));
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        InvestTransactionParam routerParams4 = investTransactionModel.getRouterParams();
        long jLongValue = (routerParams4 == null || (relatedInvestmentId = routerParams4.getRelatedInvestmentId()) == null) ? 0L : relatedInvestmentId.longValue();
        InvestTransactionParam routerParams5 = investTransactionModel.getRouterParams();
        c27508jwX.OLrzqt(context, jLongValue, (992 & 4) != 0 ? true : true, (992 & 8) != 0 ? null : null, (992 & 16) != 0 ? 0L : routerParams5 != null ? routerParams5.getChainId() : 0L, (992 & 32) != 0 ? null : null, (992 & 64) != 0 ? null : null, (992 & 128) != 0 ? null : null, (992 & 256) != 0 ? null : null, (992 & 512) != 0 ? null : null);
    }

    public final void OLrzqt(android.content.Context context, InvestTransactionModel investTransactionModel) {
        java.lang.Integer poolVersion;
        long chainId;
        java.lang.String tokenId;
        java.util.List<InvestInputData> inputList;
        java.util.List<java.lang.Long> investmentIdList;
        java.lang.Long l;
        java.lang.Integer investType;
        java.lang.String tokenId2;
        java.util.List<InvestInputData> inputList2;
        java.util.List<java.lang.Long> investmentIdList2;
        java.lang.Long l2;
        java.lang.Integer investType2;
        InvestTransactionParam routerParams;
        java.util.List<java.lang.Long> investmentIdList3;
        if (C54819xWm.KWHzl().AEQbTJ() == null || C54819xWm.KWHzl().AEQbTJ().isDestroyed()) {
            return;
        }
        if ((C54819xWm.KWHzl().AEQbTJ() instanceof InterfaceC23612iCv) && (routerParams = investTransactionModel.getRouterParams()) != null && (investmentIdList3 = routerParams.getInvestmentIdList()) != null) {
            android.content.ComponentCallbacks2 componentCallbacks2AEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.copydefault(componentCallbacks2AEQbTJ, "");
            long jEZpvd = ((InterfaceC23612iCv) componentCallbacks2AEQbTJ).EZpvd();
            java.lang.Long l3 = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList3);
            if (l3 != null && jEZpvd == l3.longValue()) {
                return;
            }
        }
        InvestTransactionParam routerParams2 = investTransactionModel.getRouterParams();
        int iIntValue = 2;
        if (routerParams2 != null && (poolVersion = routerParams2.getPoolVersion()) != null && poolVersion.intValue() == 2) {
            C27577jxn c27577jxn = C27577jxn.copydefault;
            InvestTransactionParam routerParams3 = investTransactionModel.getRouterParams();
            java.util.ArrayList arrayList = null;
            if (c27577jxn.EZpvd(java.lang.Integer.valueOf((routerParams3 == null || (investType2 = routerParams3.getInvestType()) == null) ? 2 : investType2.intValue()))) {
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                InvestTransactionParam routerParams4 = investTransactionModel.getRouterParams();
                long jLongValue = (routerParams4 == null || (investmentIdList2 = routerParams4.getInvestmentIdList()) == null || (l2 = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList2)) == null) ? 0L : l2.longValue();
                InvestTransactionParam routerParams5 = investTransactionModel.getRouterParams();
                chainId = routerParams5 != null ? routerParams5.getChainId() : 0L;
                InvestTransactionParam routerParams6 = investTransactionModel.getRouterParams();
                if (routerParams6 == null || (tokenId2 = routerParams6.getTokenId()) == null) {
                    tokenId2 = "";
                }
                InvestTransactionParam routerParams7 = investTransactionModel.getRouterParams();
                if (routerParams7 != null && (inputList2 = routerParams7.getInputList()) != null) {
                    arrayList = new java.util.ArrayList(inputList2);
                }
                c27508jwX.EZpvd(context, jLongValue, chainId, tokenId2, false, (java.util.List<InvestInputData>) arrayList);
                return;
            }
            InvestTransactionParam routerParams8 = investTransactionModel.getRouterParams();
            if (routerParams8 != null && (investType = routerParams8.getInvestType()) != null) {
                iIntValue = investType.intValue();
            }
            if (c27577jxn.copydefault(java.lang.Integer.valueOf(iIntValue))) {
                C27508jwX c27508jwX2 = C27508jwX.AEQbTJ;
                InvestTransactionParam routerParams9 = investTransactionModel.getRouterParams();
                long jLongValue2 = (routerParams9 == null || (investmentIdList = routerParams9.getInvestmentIdList()) == null || (l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList)) == null) ? 0L : l.longValue();
                InvestTransactionParam routerParams10 = investTransactionModel.getRouterParams();
                chainId = routerParams10 != null ? routerParams10.getChainId() : 0L;
                InvestTransactionParam routerParams11 = investTransactionModel.getRouterParams();
                if (routerParams11 == null || (tokenId = routerParams11.getTokenId()) == null) {
                    tokenId = "";
                }
                InvestTransactionParam routerParams12 = investTransactionModel.getRouterParams();
                if (routerParams12 != null && (inputList = routerParams12.getInputList()) != null) {
                    arrayList = new java.util.ArrayList(inputList);
                }
                c27508jwX2.OLrzqt(context, jLongValue2, chainId, tokenId, false, (java.util.List<InvestInputData>) arrayList);
                return;
            }
            return;
        }
        if (AEQbTJ(investTransactionModel.getRouterParams())) {
            InvestTransactionParam routerParams13 = investTransactionModel.getRouterParams();
            java.lang.Integer pushToastCode = investTransactionModel.getPushToastCode();
            EZpvd(context, routerParams13, 2, pushToastCode != null ? pushToastCode.intValue() : 2);
            return;
        }
        OLrzqt(context, investTransactionModel.getRouterParams(), 2);
    }

    public final void copydefault(android.content.Context context, InvestTransactionModel investTransactionModel) {
        InvestTransactionParam routerParams;
        if (C54819xWm.KWHzl().AEQbTJ() == null || C54819xWm.KWHzl().AEQbTJ().isDestroyed()) {
            return;
        }
        if ((C54819xWm.KWHzl().AEQbTJ() instanceof InterfaceC23609iCs) && (routerParams = investTransactionModel.getRouterParams()) != null) {
            android.content.ComponentCallbacks2 componentCallbacks2AEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.copydefault(componentCallbacks2AEQbTJ, "");
            long jAEQbTJ = ((InterfaceC23609iCs) componentCallbacks2AEQbTJ).AEQbTJ();
            java.lang.Long analysisPlatformId = routerParams.getAnalysisPlatformId();
            if (analysisPlatformId != null && jAEQbTJ == analysisPlatformId.longValue()) {
                return;
            }
        }
        C27508jwX.AEQbTJ.copydefault(context);
    }

    public final void KWHzl(android.content.Context context, InvestTransactionModel investTransactionModel) {
        if (C54819xWm.KWHzl().AEQbTJ() == null || C54819xWm.KWHzl().AEQbTJ().isDestroyed()) {
            return;
        }
        if (C54819xWm.KWHzl().AEQbTJ() instanceof InterfaceC23609iCs) {
            InvestTransactionParam routerParams = investTransactionModel.getRouterParams();
            if ((routerParams != null ? routerParams.getRelatedInvestmentId() : null) == null) {
                return;
            }
        }
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        InvestTransactionParam routerParams2 = investTransactionModel.getRouterParams();
        java.lang.Long relatedInvestmentId = routerParams2 != null ? routerParams2.getRelatedInvestmentId() : null;
        InvestTransactionParam routerParams3 = investTransactionModel.getRouterParams();
        C27508jwX.startInvestDetailActivity$default(c27508jwX, context, relatedInvestmentId, null, null, routerParams3 != null ? java.lang.Long.valueOf(routerParams3.getChainId()) : null, false, 16, null);
    }

    public final java.lang.String KWHzl(java.lang.Integer num) {
        return ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1) || ((num != null && num.intValue() == 2) || ((num != null && num.intValue() == 5) || ((num != null && num.intValue() == 6) || ((num != null && num.intValue() == 37) || (num != null && num.intValue() == 38)))))) ? "approve" : ((num != null && num.intValue() == 7) || (num != null && num.intValue() == 8) || ((num != null && num.intValue() == 32) || (num != null && num.intValue() == 9))) ? "invest" : ((num != null && num.intValue() == 10) || (num != null && num.intValue() == 35) || (num != null && num.intValue() == 11)) ? "redeem" : ((num != null && num.intValue() == 12) || (num != null && num.intValue() == 13) || ((num != null && num.intValue() == 14) || (num != null && num.intValue() == 15))) ? "claim" : ((num != null && num.intValue() == 16) || (num != null && num.intValue() == 17)) ? OtpEventTracker.OTP_EVENT_VALUE_CANCEL : (num != null && num.intValue() == 18) ? "speed_up" : "";
    }

    public final java.lang.String EZpvd(java.lang.Integer num) {
        return ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2) || ((num != null && num.intValue() == 7) || ((num != null && num.intValue() == 8) || ((num != null && num.intValue() == 10) || ((num != null && num.intValue() == 12) || ((num != null && num.intValue() == 14) || ((num != null && num.intValue() == 17) || ((num != null && num.intValue() == 37) || ((num != null && num.intValue() == 32) || ((num != null && num.intValue() == 38) || (num != null && num.intValue() == 35))))))))))) ? "success" : ((num != null && num.intValue() == 9) || (num != null && num.intValue() == 5) || ((num != null && num.intValue() == 6) || ((num != null && num.intValue() == 11) || ((num != null && num.intValue() == 13) || ((num != null && num.intValue() == 15) || ((num != null && num.intValue() == 33) || (num != null && num.intValue() == 36))))))) ? "fail" : ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 16) || ((num != null && num.intValue() == 18) || ((num != null && num.intValue() == 31) || (num != null && num.intValue() == 34)))) ? "pending" : "";
    }

    public final boolean AEQbTJ(InvestTransactionParam investTransactionParam) {
        java.lang.Integer stakingMode;
        return (investTransactionParam == null || (stakingMode = investTransactionParam.getStakingMode()) == null || stakingMode.intValue() != 4) ? false : true;
    }

    public final void EZpvd(android.content.Context context, InvestTransactionParam investTransactionParam, int i, int i2) {
        int i3;
        java.lang.Integer num;
        java.lang.Integer stakingMode;
        java.util.List<InvestInputData> inputList;
        java.util.List<java.lang.Long> investmentIdList;
        java.lang.Long l;
        C27508jwX c27508jwX = C27508jwX.AEQbTJ;
        long jLongValue = (investTransactionParam == null || (investmentIdList = investTransactionParam.getInvestmentIdList()) == null || (l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList)) == null) ? 0L : l.longValue();
        boolean z = investTransactionParam != null && investTransactionParam.isSingle();
        java.util.ArrayList arrayList = (investTransactionParam == null || (inputList = investTransactionParam.getInputList()) == null) ? null : new java.util.ArrayList(inputList);
        long chainId = investTransactionParam != null ? investTransactionParam.getChainId() : 0L;
        java.lang.Long relatedInvestmentId = investTransactionParam != null ? investTransactionParam.getRelatedInvestmentId() : null;
        int iIntValue = (investTransactionParam == null || (stakingMode = investTransactionParam.getStakingMode()) == null) ? 4 : stakingMode.intValue();
        if (i2 == 37) {
            i3 = 0;
        } else {
            if (i2 != 38) {
                num = null;
                c27508jwX.AEQbTJ(context, jLongValue, (14560 & 2) != 0 ? true : z, (14560 & 4) != 0 ? null : arrayList, (14560 & 8) != 0 ? 0L : chainId, (14560 & 16) != 0 ? null : relatedInvestmentId, (14560 & 32) != 0 ? null : null, (14560 & 64) != 0 ? null : null, (14560 & 128) != 0 ? null : null, i, iIntValue, (14560 & 1024) != 0 ? null : num, (14560 & 2048) != 0 ? null : null, (14560 & 4096) != 0 ? TransactionMethod.UNKNOWN : null, (14560 & 8192) != 0 ? false : false);
            }
            i3 = 1;
        }
        num = i3;
        c27508jwX.AEQbTJ(context, jLongValue, (14560 & 2) != 0 ? true : z, (14560 & 4) != 0 ? null : arrayList, (14560 & 8) != 0 ? 0L : chainId, (14560 & 16) != 0 ? null : relatedInvestmentId, (14560 & 32) != 0 ? null : null, (14560 & 64) != 0 ? null : null, (14560 & 128) != 0 ? null : null, i, iIntValue, (14560 & 1024) != 0 ? null : num, (14560 & 2048) != 0 ? null : null, (14560 & 4096) != 0 ? TransactionMethod.UNKNOWN : null, (14560 & 8192) != 0 ? false : false);
    }

    public final void OLrzqt(android.content.Context context, InvestTransactionParam investTransactionParam, int i) {
        java.util.List<InvestInputData> inputList;
        java.util.List<java.lang.Long> investmentIdList;
        java.lang.Long l;
        C27508jwX.AEQbTJ.AEQbTJ(context, (investTransactionParam == null || (investmentIdList = investTransactionParam.getInvestmentIdList()) == null || (l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(investmentIdList)) == null) ? 0L : l.longValue(), (14560 & 2) != 0 ? true : investTransactionParam != null && investTransactionParam.isSingle(), (14560 & 4) != 0 ? null : (investTransactionParam == null || (inputList = investTransactionParam.getInputList()) == null) ? null : new java.util.ArrayList(inputList), (14560 & 8) != 0 ? 0L : investTransactionParam != null ? investTransactionParam.getChainId() : 0L, (14560 & 16) != 0 ? null : investTransactionParam != null ? investTransactionParam.getRelatedInvestmentId() : null, (14560 & 32) != 0 ? null : null, (14560 & 64) != 0 ? null : null, (14560 & 128) != 0 ? null : null, i, -1, (14560 & 1024) != 0 ? null : null, (14560 & 2048) != 0 ? null : null, (14560 & 4096) != 0 ? TransactionMethod.UNKNOWN : null, (14560 & 8192) != 0 ? false : true);
    }
}
