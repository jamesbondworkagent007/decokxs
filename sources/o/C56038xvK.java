package o;

import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56038xvK {
    public static /* synthetic */ java.lang.String tpRatioErrors$default(ContractGridReq contractGridReq, C55853xrl c55853xrl, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c55853xrl = null;
        }
        return AEQbTJ(contractGridReq, c55853xrl);
    }

    public static final java.lang.String AEQbTJ(@NotNull ContractGridReq contractGridReq, C55853xrl c55853xrl) {
        java.lang.String strAEQbTJ;
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        java.lang.String strAEQbTJ2;
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        java.lang.String tpRatio = contractGridReq.getTpRatio();
        if (tpRatio != null && tpRatio.length() != 0) {
            if (c55853xrl == null || (strAEQbTJ = c55853xrl.AEQbTJ()) == null) {
                strAEQbTJ = "0.004";
            }
            if (C33129mqd.gEmmrt(tpRatio, strAEQbTJ)) {
                int i = C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.pause));
                pairArr[1] = C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, (c55853xrl == null || (strAEQbTJ2 = c55853xrl.AEQbTJ()) == null) ? "0.004" : strAEQbTJ2, 0, null, 6, null));
                return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
            }
            if (c55853xrl == null || (strKWHzl = c55853xrl.KWHzl()) == null) {
                strKWHzl = "100";
            }
            if (C33129mqd.AEQbTJ(tpRatio, strKWHzl)) {
                int i2 = C55688xof.Application.isSystemPickerAvailableactivity_release;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.pause));
                pairArr2[1] = C56390yDp.OLrzqt("upLimit", xMR.formatPercent$default(xMR.copydefault, (c55853xrl == null || (strKWHzl2 = c55853xrl.KWHzl()) == null) ? "100" : strKWHzl2, 0, null, 6, null));
                return C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2));
            }
        }
        return "";
    }

    public static /* synthetic */ java.lang.String slRatioErrors$default(ContractGridReq contractGridReq, C55853xrl c55853xrl, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c55853xrl = null;
        }
        return EZpvd(contractGridReq, c55853xrl);
    }

    public static final java.lang.String EZpvd(@NotNull ContractGridReq contractGridReq, C55853xrl c55853xrl) {
        java.lang.String strEZpvd;
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String strEZpvd2;
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        java.lang.String slRatio = contractGridReq.getSlRatio();
        if (slRatio != null && slRatio.length() != 0) {
            if (c55853xrl == null || (strEZpvd = c55853xrl.EZpvd()) == null) {
                strEZpvd = "0.005";
            }
            if (C33129mqd.gEmmrt(slRatio, strEZpvd)) {
                int i = C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.resume));
                pairArr[1] = C56390yDp.OLrzqt("lowLimit", xMR.formatPercent$default(xMR.copydefault, (c55853xrl == null || (strEZpvd2 = c55853xrl.EZpvd()) == null) ? "0.005" : strEZpvd2, 0, null, 6, null));
                return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
            }
            if (c55853xrl == null || (strCopydefault = c55853xrl.copydefault()) == null) {
                strCopydefault = "0.9999";
            }
            if (C33129mqd.AEQbTJ(slRatio, strCopydefault)) {
                int i2 = C55688xof.Application.isSystemPickerAvailableactivity_release;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.resume));
                pairArr2[1] = C56390yDp.OLrzqt("upLimit", xMR.formatPercent$default(xMR.copydefault, (c55853xrl == null || (strCopydefault2 = c55853xrl.copydefault()) == null) ? "0.9999" : strCopydefault2, 0, null, 6, null));
                return C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2));
            }
        }
        return "";
    }

    public static final java.lang.String KWHzl(@NotNull ContractGridReq contractGridReq) {
        java.lang.String strAYXKKw;
        boolean z;
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        java.lang.String tpTriggerPx = contractGridReq.getTpTriggerPx();
        if (tpTriggerPx == null || tpTriggerPx.length() == 0) {
            return "";
        }
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(contractGridReq.getSignParams());
        AdvancedTriggerSign advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AubY(contractGridReq.getSignParams());
        java.lang.String slTriggerPx = contractGridReq.getSlTriggerPx();
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) contractGridReq.getDirection(), (java.lang.Object) "short")) {
            if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.copydefault(tpTriggerPx, slTriggerPx)) {
                return C33070mpX.AYXKKw(C55688xof.Application.setRating);
            }
            if (C33129mqd.AEQbTJ(strAYXKKw, 0) && C33129mqd.copydefault(tpTriggerPx, strAYXKKw)) {
                return C33070mpX.AYXKKw(C55688xof.Application.onNewIntent);
            }
            boolean z2 = C33129mqd.AEQbTJ(advancedTriggerSign.getTriggerPx(), 0) && C33129mqd.copydefault(tpTriggerPx, advancedTriggerSign.getTriggerPx());
            z = C33129mqd.AEQbTJ(advancedTriggerSign2.getTriggerPx(), 0) && C33129mqd.copydefault(tpTriggerPx, advancedTriggerSign2.getTriggerPx());
            if (z2 || z) {
                return C33070mpX.AYXKKw(C55688xof.Application.onAudioInfoChanged);
            }
        } else {
            if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.valueOf(tpTriggerPx, slTriggerPx)) {
                return C33070mpX.AYXKKw(C55688xof.Application.setHideOffset);
            }
            if (C33129mqd.AEQbTJ(strAYXKKw, 0) && C33129mqd.valueOf(tpTriggerPx, strAYXKKw)) {
                return C33070mpX.AYXKKw(C55688xof.Application.addQueueItemAt);
            }
            boolean z3 = C33129mqd.AEQbTJ(advancedTriggerSign.getTriggerPx(), 0) && C33129mqd.valueOf(tpTriggerPx, advancedTriggerSign.getTriggerPx());
            z = C33129mqd.AEQbTJ(advancedTriggerSign2.getTriggerPx(), 0) && C33129mqd.valueOf(tpTriggerPx, advancedTriggerSign2.getTriggerPx());
            if (z3 || z) {
                return C33070mpX.AYXKKw(C55688xof.Application.postToHandler);
            }
        }
        return "";
    }

    public static final java.lang.String EZpvd(@NotNull ContractGridReq contractGridReq) {
        java.lang.String strAYXKKw;
        boolean z;
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        java.lang.String slTriggerPx = contractGridReq.getSlTriggerPx();
        if (slTriggerPx == null || slTriggerPx.length() == 0) {
            return "";
        }
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(contractGridReq.getSignParams());
        AdvancedTriggerSign advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AubY(contractGridReq.getSignParams());
        java.lang.String tpTriggerPx = contractGridReq.getTpTriggerPx();
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) contractGridReq.getDirection(), (java.lang.Object) "short")) {
            if (C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.valueOf(slTriggerPx, tpTriggerPx)) {
                return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            }
            if (C33129mqd.AEQbTJ(strAYXKKw, 0) && C33129mqd.valueOf(slTriggerPx, strAYXKKw)) {
                return C33070mpX.AYXKKw(C55688xof.Application.onPictureInPictureModeChanged);
            }
            boolean z2 = C33129mqd.AEQbTJ(advancedTriggerSign.getTriggerPx(), 0) && C33129mqd.valueOf(slTriggerPx, advancedTriggerSign.getTriggerPx());
            z = C33129mqd.AEQbTJ(advancedTriggerSign2.getTriggerPx(), 0) && C33129mqd.valueOf(slTriggerPx, advancedTriggerSign2.getTriggerPx());
            if (z2 || z) {
                return C33070mpX.AYXKKw(C55688xof.Application.getIControllerCallback);
            }
        } else {
            if (C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.copydefault(slTriggerPx, tpTriggerPx)) {
                return C33070mpX.AYXKKw(C55688xof.Application.setHomeAsUpIndicator);
            }
            if (C33129mqd.AEQbTJ(strAYXKKw, 0) && C33129mqd.copydefault(slTriggerPx, strAYXKKw)) {
                return C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggleDelegate);
            }
            boolean z3 = C33129mqd.AEQbTJ(advancedTriggerSign.getTriggerPx(), 0) && C33129mqd.copydefault(slTriggerPx, advancedTriggerSign.getTriggerPx());
            z = C33129mqd.AEQbTJ(advancedTriggerSign2.getTriggerPx(), 0) && C33129mqd.copydefault(slTriggerPx, advancedTriggerSign2.getTriggerPx());
            if (z3 || z) {
                return C33070mpX.AYXKKw(C55688xof.Application.onSessionEvent);
            }
        }
        return "";
    }

    public static final java.lang.String AEQbTJ(@NotNull ContractGridReq contractGridReq) {
        boolean z;
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(contractGridReq.getSignParams());
        if (!Intrinsics.EZpvd((java.lang.Object) advancedTriggerSign.getIndicator(), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            return "";
        }
        java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
        boolean z2 = false;
        if (C33129mqd.valueOf(triggerPx, 0)) {
            return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImpl);
        }
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        java.lang.String strMulS$default = C33129mqd.mulS$default((value == null || (strAYXKKw3 = value.AYXKKw()) == null) ? "" : strAYXKKw3, 2, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.copydefault(triggerPx, strMulS$default)) {
            return C33069mpW.copydefault(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("maxPrice", C56033xvF.getBotPrice$default(contractGridReq.getInstType(), contractGridReq.getInstId(), strMulS$default, false, false, null, null, 120, null))));
        }
        java.lang.String tpTriggerPx = contractGridReq.getTpTriggerPx();
        if (Intrinsics.EZpvd((java.lang.Object) contractGridReq.getDirection(), (java.lang.Object) "short")) {
            z = C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.valueOf(triggerPx, tpTriggerPx);
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerExtraData);
        } else {
            z = C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.copydefault(triggerPx, tpTriggerPx);
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackMessageHandler);
        }
        if (z) {
            return strAYXKKw;
        }
        java.lang.String slTriggerPx = contractGridReq.getSlTriggerPx();
        if (Intrinsics.EZpvd((java.lang.Object) contractGridReq.getDirection(), (java.lang.Object) "short")) {
            if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.copydefault(triggerPx, slTriggerPx)) {
                z2 = true;
            }
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackStubCompat);
        } else {
            if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.valueOf(triggerPx, slTriggerPx)) {
                z2 = true;
            }
            strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackStubApi21);
        }
        return z2 ? strAYXKKw2 : "";
    }

    public static final java.lang.String OLrzqt(@NotNull ContractGridReq contractGridReq) {
        java.lang.String strAYXKKw;
        boolean z;
        java.lang.String strAYXKKw2;
        java.lang.String strAYXKKw3;
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AubY(contractGridReq.getSignParams());
        if (!Intrinsics.EZpvd((java.lang.Object) advancedTriggerSign.getIndicator(), (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            return "";
        }
        java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
        boolean z2 = false;
        if (C33129mqd.valueOf(triggerPx, 0)) {
            return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImpl);
        }
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        java.lang.String strMulS$default = C33129mqd.mulS$default((value == null || (strAYXKKw3 = value.AYXKKw()) == null) ? "" : strAYXKKw3, 2, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.copydefault(triggerPx, strMulS$default)) {
            return C33069mpW.copydefault(C55688xof.Application.MediaControllerCompatMediaControllerImplApi21, C56423yEv.EZpvd(C56390yDp.OLrzqt("maxPrice", C56033xvF.getBotPrice$default(contractGridReq.getInstType(), contractGridReq.getInstId(), strMulS$default, false, false, null, null, 120, null))));
        }
        java.lang.String tpTriggerPx = contractGridReq.getTpTriggerPx();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) tpTriggerPx)) {
            if (Intrinsics.EZpvd((java.lang.Object) contractGridReq.getDirection(), (java.lang.Object) "short")) {
                z = C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.valueOf(triggerPx, tpTriggerPx);
                strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerExtraData);
            } else {
                z = C33129mqd.AEQbTJ(tpTriggerPx, 0) && C33129mqd.copydefault(triggerPx, tpTriggerPx);
                strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackMessageHandler);
            }
            if (z) {
                return strAYXKKw2;
            }
        }
        java.lang.String slTriggerPx = contractGridReq.getSlTriggerPx();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) slTriggerPx)) {
            if (Intrinsics.EZpvd((java.lang.Object) contractGridReq.getDirection(), (java.lang.Object) "short")) {
                if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.copydefault(triggerPx, slTriggerPx)) {
                    z2 = true;
                }
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackStubCompat);
            } else {
                if (C33129mqd.AEQbTJ(slTriggerPx, 0) && C33129mqd.valueOf(triggerPx, slTriggerPx)) {
                    z2 = true;
                }
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallbackStubApi21);
            }
            if (z2) {
                return strAYXKKw;
            }
        }
        return "";
    }
}
