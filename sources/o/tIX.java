package o;

import androidx.camera.video.AudioStats;
import com.okinc.base.utils.OkUtils;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.planet.biz_social_feeds.domain.ArbitrageInfoData;
import com.okinc.planet.biz_social_feeds.domain.FollowInnerData;
import com.okinc.planet.format.InstId;
import com.okinc.unify_trade.biz.BizInstrument;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C47501trL;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tIX {
    public static final java.util.HashMap<java.lang.String, java.lang.Integer> AEQbTJ;
    public static final android.util.ArrayMap<java.lang.String, java.lang.Integer> EZpvd;
    public static final tIX KWHzl = new tIX();
    public static final android.util.ArrayMap<java.lang.String, java.lang.Integer> OLrzqt;
    public static final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.util.ArrayMap<java.lang.String, java.lang.Integer> KWHzl() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.util.ArrayMap<java.lang.String, java.lang.Integer> copydefault() {
        return EZpvd;
    }

    private tIX() {
    }

    static {
        android.util.ArrayMap<java.lang.String, java.lang.Integer> arrayMap = new android.util.ArrayMap<>();
        arrayMap.put("SPOT", java.lang.Integer.valueOf(C55688xof.Application.zpGcln));
        arrayMap.put("MARGIN", java.lang.Integer.valueOf(C55688xof.Application.ActivityResultLauncher));
        arrayMap.put("SWAP", java.lang.Integer.valueOf(C55688xof.Application.finit));
        arrayMap.put("FUTURES", java.lang.Integer.valueOf(C55688xof.Application.component2));
        arrayMap.put("OPTION", java.lang.Integer.valueOf(C55688xof.Application.launchUnitdefault));
        arrayMap.put("ANY", java.lang.Integer.valueOf(C47501trL.Fragment.FhERFw));
        EZpvd = arrayMap;
        android.util.ArrayMap<java.lang.String, java.lang.Integer> arrayMap2 = new android.util.ArrayMap<>();
        arrayMap2.put("SPOT", java.lang.Integer.valueOf(C55688xof.Application.getVolumeAttributes));
        arrayMap2.put("MARGIN", java.lang.Integer.valueOf(C55688xof.Application.getTag));
        arrayMap2.put("SWAP", java.lang.Integer.valueOf(C55688xof.Application.getRepeatMode));
        arrayMap2.put("FUTURES", java.lang.Integer.valueOf(C55688xof.Application.getShuffleMode));
        arrayMap2.put("OPTION", java.lang.Integer.valueOf(C55688xof.Application.getUriFromString));
        arrayMap2.put("ANY", java.lang.Integer.valueOf(C55688xof.Application.profile));
        OLrzqt = arrayMap2;
        java.util.HashMap<java.lang.String, java.lang.Integer> map = new java.util.HashMap<>();
        map.put("marketPrice", java.lang.Integer.valueOf(C55688xof.Application.createFullyDrawnExecutor));
        map.put("counterpartyPrice", java.lang.Integer.valueOf(C55688xof.Application.getUserContextRegisteredStatus));
        map.put("overpriced", java.lang.Integer.valueOf(C55688xof.Application.addOnConfigurationChangedListener));
        map.put("queuingPrice", java.lang.Integer.valueOf(C55688xof.Application.lambdanew1));
        map.put("", 0);
        AEQbTJ = map;
        copydefault = 8;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(str, 0) ? C33069mpW.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.reset), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, pTB.formatDownToMax$default(pTB.OLrzqt((java.lang.Object) str), 2, null, 2, null)))) : "";
    }

    public static /* synthetic */ java.lang.String getCoinTitle$default(tIX tix, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return tix.OLrzqt(str, str2, z);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return tRQ.KWHzl(InstId.EZpvd(str2), str, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String safeString$default;
        C54536xML c54536xMLAYXKKw;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (str3.length() == 0 || C33129mqd.OLrzqt((java.lang.Object) str3, (java.lang.Object) 0)) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrEZpvd != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrEZpvd, str, str2, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instFamily)) {
            instFamily = xUW.KWHzl.AEQbTJ(str2);
        }
        xMS xmsGEmmrt = (interfaceC54581xNrEZpvd == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrEZpvd.OLrzqt(str)) == null) ? null : abstractC54531xLwOLrzqt.gEmmrt(instFamily);
        C54536xML c54536xMLCopydefault = tTN.Companion.copydefault(str4, (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str3)) == null) ? null : c54536xMLAYXKKw.djBIcL());
        return (c54536xMLCopydefault == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "--" : safeString$default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [194=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.ArrayList<C46139tJg> AEQbTJ(@NotNull java.util.List<FollowInnerData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<C46139tJg> arrayList = new java.util.ArrayList<>();
        android.app.Application applicationAEQbTJ = OkUtils.AEQbTJ();
        for (FollowInnerData followInnerData : list) {
            java.lang.String strFJNWhG = followInnerData.fJNWhG();
            java.lang.String strAkhnZx = followInnerData.AkhnZx();
            java.lang.String strFARcdN = followInnerData.fARcdN();
            tIX tix = KWHzl;
            java.lang.String strKWHzl = tix.KWHzl(followInnerData.AuCTelauCTel(), followInnerData.fJNWhG());
            java.lang.String strValues = followInnerData.values();
            java.lang.String strZsXlph = followInnerData.zsXlph();
            java.lang.String strKWHzl2 = C46392tSq.EZpvd.KWHzl(tRQ.copydefault(followInnerData.AhwBna()));
            C46139tJg c46139tJg = new C46139tJg(strAkhnZx, strFJNWhG, strValues, strFARcdN, strKWHzl, null, null, null, false, false, strKWHzl2 == null ? "" : strKWHzl2, 0, strZsXlph, null, null, null, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, followInnerData.zLjUOn(), 0.0f, 2147478496, 1, null);
            java.lang.String strAuCTel = followInnerData.AuCTel();
            kotlin.Pair ratio$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAuCTel) ^ true ? C46367tRs.formatRatio$default(C33129mqd.EZpvd(strAuCTel), false, 1, null) : C56390yDp.OLrzqt("--", null);
            java.lang.String str = (java.lang.String) ratio$default.component1();
            java.lang.Integer num = (java.lang.Integer) ratio$default.component2();
            c46139tJg.valueOf(str);
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) followInnerData.AuCTel())) {
                c46139tJg.EZpvd(C32113mPz.Dialog.DTwDnp);
                c46139tJg.EZpvd(num);
            }
            java.lang.String strAubY = followInnerData.AubY();
            if (Intrinsics.EZpvd((java.lang.Object) strAubY, (java.lang.Object) "2")) {
                Intrinsics.copydefault(applicationAEQbTJ);
                tix.AEQbTJ(followInnerData, c46139tJg, applicationAEQbTJ);
                java.lang.String strAkhnZx2 = followInnerData.AkhnZx();
                switch (strAkhnZx2.hashCode()) {
                    case -1216369070:
                        if (strAkhnZx2.equals("smart_portfolio")) {
                            tix.KWHzl(followInnerData, c46139tJg);
                            continue;
                        }
                        break;
                    case -512749997:
                        if (!strAkhnZx2.equals("contract_grid")) {
                        }
                        break;
                    case 3181382:
                        if (!strAkhnZx2.equals("grid")) {
                        }
                        break;
                    case 1165749981:
                        if (strAkhnZx2.equals("recurring")) {
                            tix.OLrzqt(followInnerData, c46139tJg);
                            continue;
                        }
                        break;
                    case 1780188297:
                        if (strAkhnZx2.equals("arbitrage")) {
                            tix.EZpvd(followInnerData, c46139tJg, applicationAEQbTJ);
                            continue;
                        }
                        break;
                }
                tix.copydefault(followInnerData, c46139tJg);
            } else if (Intrinsics.EZpvd((java.lang.Object) strAubY, (java.lang.Object) "1")) {
                c46139tJg.EZpvd(getCoinTitle$default(tix, followInnerData.gEmmrt(), followInnerData.AhwBna(), false, 4, null));
                if (Intrinsics.EZpvd((java.lang.Object) followInnerData.gEmmrt(), (java.lang.Object) "SPOT")) {
                    Intrinsics.copydefault(applicationAEQbTJ);
                    tix.KWHzl(followInnerData, c46139tJg, applicationAEQbTJ);
                } else {
                    Intrinsics.copydefault(applicationAEQbTJ);
                    tix.copydefault(followInnerData, c46139tJg, applicationAEQbTJ);
                }
            }
            arrayList.add(c46139tJg);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [224=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.app.Application applicationAEQbTJ = OkUtils.AEQbTJ();
        switch (str.hashCode()) {
            case -1216369070:
                if (!str.equals("smart_portfolio")) {
                    return "";
                }
                java.lang.String string = applicationAEQbTJ.getString(C55688xof.Application.FractionRes);
                Intrinsics.copydefault((java.lang.Object) string);
                return string;
            case -512749997:
                if (!str.equals("contract_grid")) {
                    return "";
                }
                java.lang.String string2 = applicationAEQbTJ.getString(C55688xof.Application.onContextAvailable);
                Intrinsics.copydefault((java.lang.Object) string2);
                return string2;
            case 3181382:
                if (!str.equals("grid")) {
                    return "";
                }
                java.lang.String string3 = applicationAEQbTJ.getString(C55688xof.Application.ComponentActivity22);
                Intrinsics.copydefault((java.lang.Object) string3);
                return string3;
            case 3573234:
                if (!str.equals("twap")) {
                    return "";
                }
                java.lang.String string4 = applicationAEQbTJ.getString(C55688xof.Application.ComponentActivityNonConfigurationInstances);
                Intrinsics.copydefault((java.lang.Object) string4);
                return string4;
            case 1165749981:
                if (!str.equals("recurring")) {
                    return "";
                }
                java.lang.String string5 = applicationAEQbTJ.getString(C47501trL.Fragment.fbC);
                Intrinsics.copydefault((java.lang.Object) string5);
                return string5;
            case 1629187779:
                if (!str.equals("iceberg")) {
                    return "";
                }
                java.lang.String string6 = applicationAEQbTJ.getString(C55688xof.Application.ComponentActivity1);
                Intrinsics.copydefault((java.lang.Object) string6);
                return string6;
            case 1780188297:
                if (!str.equals("arbitrage")) {
                    return "";
                }
                java.lang.String string7 = applicationAEQbTJ.getString(C55688xof.Application.ComponentActivityExternalSyntheticLambda0);
                Intrinsics.copydefault((java.lang.Object) string7);
                return string7;
            default:
                return "";
        }
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.app.Application applicationAEQbTJ = OkUtils.AEQbTJ();
        long jValueOf = C33129mqd.valueOf(C33129mqd.subS$default(str, str2, null, null, null, 14, null));
        if (!AEQbTJ(str2, str)) {
            return pTA.formatDate$default(new Date(C33129mqd.valueOf(str2)), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
        }
        if (C33129mqd.copydefault(java.lang.Long.valueOf(jValueOf), "86400000")) {
            return pTA.format$default(new Date(C33129mqd.valueOf(str2)), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
        }
        if (C33129mqd.copydefault(java.lang.Long.valueOf(jValueOf), "3600000")) {
            java.lang.String strDivS$default = C33129mqd.divS$default(java.lang.Long.valueOf(jValueOf), "3600000", null, null, null, 14, null);
            Intrinsics.copydefault(applicationAEQbTJ);
            return C33069mpW.KWHzl(applicationAEQbTJ, C47501trL.Fragment.DcMfJKDDUqPf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatDownToFixed$default(new BigDecimal(strDivS$default), 0, null, 2, null))));
        }
        if (C33129mqd.copydefault(java.lang.Long.valueOf(jValueOf), "60000")) {
            java.lang.String strDivS$default2 = C33129mqd.divS$default(java.lang.Long.valueOf(jValueOf), "60000", null, null, null, 14, null);
            Intrinsics.copydefault(applicationAEQbTJ);
            return C33069mpW.KWHzl(applicationAEQbTJ, C47501trL.Fragment.DcMfJKDGTeJD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatDownToFixed$default(new BigDecimal(strDivS$default2), 0, null, 2, null))));
        }
        java.lang.String strDivS$default3 = C33129mqd.divS$default(java.lang.Long.valueOf(jValueOf), "1000", null, null, null, 14, null);
        Intrinsics.copydefault(applicationAEQbTJ);
        return C33069mpW.KWHzl(applicationAEQbTJ, C47501trL.Fragment.cancel, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatDownToFixed$default(new BigDecimal(strDivS$default3), 0, null, 2, null))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int AEQbTJ(java.lang.String str) {
        switch (str.hashCode()) {
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    return C47501trL.ActionBar.AkhnZx;
                }
                return 0;
            case -512749997:
                if (str.equals("contract_grid")) {
                    return C47501trL.ActionBar.DbNXlk;
                }
                return 0;
            case 3181382:
                if (str.equals("grid")) {
                    return C47501trL.ActionBar.values;
                }
                return 0;
            case 1165749981:
                if (str.equals("recurring")) {
                    return C47501trL.ActionBar.fetchVPNInfo;
                }
                return 0;
            case 1780188297:
                if (str.equals("arbitrage")) {
                    return C47501trL.ActionBar.isConnected;
                }
                return 0;
            default:
                return 0;
        }
    }

    public final java.lang.String EZpvd(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            return C33070mpX.AYXKKw(C47501trL.Fragment.sendBehavioSecData);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "net")) {
            return C33069mpW.KWHzl(context, C47501trL.Fragment.stopBehavioSecDataCollection, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("numPriceCcy", KWHzl(str3, str4, str5, str6)), C56390yDp.OLrzqt(OtcExtraKeys.SIDE, EZpvd(context, str3, str6, str2).getFirst())));
        }
        return C33069mpW.KWHzl(context, C47501trL.Fragment.sCB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("numPriceCcy", KWHzl(str3, str4, str5, str6)), C56390yDp.OLrzqt("sideDirect", EZpvd(context, str3, str6, str2).getFirst())));
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        Date date = new Date(C33129mqd.valueOf(str));
        OKDateEnum oKDateEnum = OKDateEnum.DATE_FORMAT_Y;
        return Intrinsics.EZpvd((java.lang.Object) pTA.formatDate$default(date, oKDateEnum, null, null, 6, null), (java.lang.Object) pTA.formatDate$default(new Date(C33129mqd.valueOf(str2)), oKDateEnum, null, null, 6, null));
    }

    public final void KWHzl(FollowInnerData followInnerData, C46139tJg c46139tJg) {
        c46139tJg.EZpvd(followInnerData.wlaJM());
        c46139tJg.copydefault((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.zLjUOn));
        c46139tJg.EZpvd((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.f1070api));
        java.lang.String localized$default = pTB.formatLocalized$default(followInnerData.KWHzl(), null, 1, null);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) localized$default)) {
            localized$default = "--";
        }
        c46139tJg.isConnected(localized$default);
    }

    public final void AEQbTJ(FollowInnerData followInnerData, C46139tJg c46139tJg, android.content.Context context) {
        java.lang.String strKWHzl;
        c46139tJg.AEQbTJ(AEQbTJ(followInnerData.AkhnZx()));
        java.lang.String strHDKMBd = followInnerData.hDKMBd();
        if (Intrinsics.EZpvd((java.lang.Object) strHDKMBd, (java.lang.Object) "1")) {
            strKWHzl = C33069mpW.KWHzl(context, C47501trL.Fragment.DcMfJKDSqxTE, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("strtgName", KWHzl(followInnerData.AkhnZx()))));
        } else {
            strKWHzl = Intrinsics.EZpvd((java.lang.Object) strHDKMBd, (java.lang.Object) "2") ? C33069mpW.KWHzl(context, C47501trL.Fragment.DcMfJKOmnske, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("strtgName", KWHzl(followInnerData.AkhnZx())))) : "";
        }
        c46139tJg.AEQbTJ(strKWHzl);
    }

    public final void copydefault(FollowInnerData followInnerData, C46139tJg c46139tJg) {
        c46139tJg.EZpvd(OLrzqt(followInnerData.gEmmrt(), followInnerData.AhwBna(), true));
        c46139tJg.copydefault((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.zLjUOn));
        java.lang.String strKWHzl = tRQ.KWHzl(InstId.EZpvd(followInnerData.AhwBna()), followInnerData.gEmmrt());
        if (followInnerData.gHZMYf()) {
            return;
        }
        c46139tJg.EZpvd((java.lang.CharSequence) (C33070mpX.AYXKKw(C55688xof.Application.getCallerContract) + "(" + strKWHzl + ")"));
        c46139tJg.isConnected(AEQbTJ(followInnerData.gEmmrt(), followInnerData.AhwBna(), followInnerData.isConnected(), followInnerData.iwGUEr()) + "-" + AEQbTJ(followInnerData.gEmmrt(), followInnerData.AhwBna(), followInnerData.djBIcL(), followInnerData.iwGUEr()));
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) c46139tJg.zLjUOn(), (java.lang.CharSequence) "--", false, 2, (java.lang.Object) null)) {
            c46139tJg.isConnected("--");
        }
        c46139tJg.values(C33070mpX.AYXKKw(C55688xof.Application.getCallerInput));
        java.lang.String localized$default = pTB.formatLocalized$default(followInnerData.AYXKKw(), null, 1, null);
        c46139tJg.AkhnZx(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) localized$default) ? "--" : localized$default);
    }

    public final void OLrzqt(FollowInnerData followInnerData, C46139tJg c46139tJg) {
        c46139tJg.EZpvd(followInnerData.wlaJM());
        c46139tJg.copydefault((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.zLjUOn));
        c46139tJg.EZpvd((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.r8lambda7lLdjm1L5OSJIz1pWP4kzityPws));
        java.lang.String localized$default = pTB.formatLocalized$default(followInnerData.AEQbTJ(), null, 1, null);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) localized$default)) {
            localized$default = "--";
        }
        c46139tJg.isConnected(localized$default);
    }

    public final void KWHzl(FollowInnerData followInnerData, C46139tJg c46139tJg, android.content.Context context) {
        c46139tJg.AEQbTJ(C33069mpW.KWHzl(context, C47501trL.Fragment.getSessionID, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("numPriceCcy", KWHzl(followInnerData.gEmmrt(), followInnerData.AhwBna(), followInnerData.getNewProxyInstance(), followInnerData.iwGUEr())), C56390yDp.OLrzqt(OtcExtraKeys.SIDE, EZpvd(context, followInnerData.gEmmrt(), followInnerData.iwGUEr(), followInnerData.uzCIH()).getFirst()), C56390yDp.OLrzqt("baseCcy", followInnerData.copydefault()))));
        c46139tJg.EZpvd(false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull FollowInnerData followInnerData, @NotNull C46139tJg c46139tJg, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(followInnerData, "");
        Intrinsics.checkNotNullParameter(c46139tJg, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String strGEmmrt = followInnerData.gEmmrt();
        switch (strGEmmrt.hashCode()) {
            case -2027980370:
                if (strGEmmrt.equals("MARGIN")) {
                    c46139tJg.AEQbTJ(C33069mpW.KWHzl(context, C47501trL.Fragment.stopBehavioSecDataCollection, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("numPriceCcy", KWHzl(followInnerData.gEmmrt(), followInnerData.AhwBna(), followInnerData.getNewProxyInstance(), followInnerData.iwGUEr())), C56390yDp.OLrzqt(OtcExtraKeys.SIDE, EZpvd(context, followInnerData.gEmmrt(), followInnerData.iwGUEr(), followInnerData.uzCIH()).getFirst()))));
                }
                break;
            case -1956807563:
                if (strGEmmrt.equals("OPTION")) {
                }
                break;
            case 2558355:
                if (strGEmmrt.equals("SWAP")) {
                    c46139tJg.AEQbTJ(EZpvd(context, followInnerData.getFieldNames(), followInnerData.uzCIH(), followInnerData.gEmmrt(), followInnerData.AhwBna(), followInnerData.getNewProxyInstance(), followInnerData.iwGUEr()));
                }
                break;
            case 214415088:
                if (strGEmmrt.equals("FUTURES")) {
                }
                break;
        }
        c46139tJg.djBIcL(tTN.Companion.copydefault(followInnerData.fetchVPNInfo()));
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairAEQbTJ = AEQbTJ(context, followInnerData.gEmmrt(), followInnerData.uzCIH(), followInnerData.valueOf(), followInnerData.fIwbmz(), followInnerData.ejfBZ(), followInnerData.AhwBna());
        c46139tJg.AYXKKw(pairAEQbTJ.getFirst());
        c46139tJg.AEQbTJ(pairAEQbTJ.getSecond().booleanValue());
        c46139tJg.copydefault((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.zLjUOn));
        c46139tJg.EZpvd((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.sSMYrx));
        c46139tJg.isConnected(copydefault(followInnerData.gEmmrt(), followInnerData.AhwBna(), followInnerData.DbNXlk(), followInnerData.iwGUEr()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        java.lang.String strEZpvd = tTN.Companion.EZpvd(str, str6, str2, str4, str5);
        switch (str.hashCode()) {
            case -2027980370:
                if (str.equals("MARGIN")) {
                    if (C59449zhJ.gEmmrt(strEZpvd, "buy", true)) {
                        pairOLrzqt = C56390yDp.OLrzqt(context.getString(C55688xof.Application.getMaxVolume), java.lang.Boolean.TRUE);
                    } else {
                        pairOLrzqt = C56390yDp.OLrzqt(context.getString(C55688xof.Application.getVolumeControl), java.lang.Boolean.FALSE);
                    }
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt("", java.lang.Boolean.FALSE);
                }
                break;
            case -1956807563:
                if (str.equals("OPTION")) {
                }
                break;
            case 2552066:
                if (!str.equals("SPOT")) {
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    if (C59449zhJ.gEmmrt(str2, "net", true)) {
                        if (C59449zhJ.gEmmrt(strEZpvd, "buy", true)) {
                            pairOLrzqt = C56390yDp.OLrzqt(context.getString(C55688xof.Application.getMaxVolume), java.lang.Boolean.TRUE);
                        } else {
                            pairOLrzqt = C56390yDp.OLrzqt(context.getString(C55688xof.Application.getVolumeControl), java.lang.Boolean.FALSE);
                        }
                    } else if (C59449zhJ.gEmmrt(str2, "long", true)) {
                        pairOLrzqt = C56390yDp.OLrzqt(context.getString(C55688xof.Application.UeEOUB), java.lang.Boolean.TRUE);
                    } else {
                        pairOLrzqt = C56390yDp.OLrzqt(context.getString(C55688xof.Application.fFgQHt), java.lang.Boolean.FALSE);
                    }
                    break;
                }
                break;
            case 214415088:
                if (!str.equals("FUTURES")) {
                }
                break;
        }
        java.lang.String str7 = " " + C46367tRs.formatLeverage$default(str3, false, 2, null);
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pairOLrzqt.getFirst())) || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str7))) {
            return pairOLrzqt;
        }
        return C56390yDp.OLrzqt(((java.lang.Object) pairOLrzqt.getFirst()) + str7, pairOLrzqt.getSecond());
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xMS xmsGEmmrt;
        if (C33129mqd.OLrzqt((java.lang.Object) str3, (java.lang.Object) 0) || (interfaceC54581xNrOLrzqt = C46392tSq.EZpvd.AhwBna().OLrzqt()) == null) {
            return "--";
        }
        BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null);
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instFamily)) {
            instFamily = xUW.KWHzl.AEQbTJ(str2);
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str);
        if (abstractC54531xLwOLrzqt == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily)) == null) {
            return "--";
        }
        C54536xML c54536xMLCopydefault = tTN.Companion.copydefault(str4, xmsGEmmrt.AYXKKw(str3).isConnected().djBIcL());
        return c54536xMLCopydefault == null ? "--" : C54536xML.toSafeString$default(c54536xMLCopydefault.AkhnZx(), false, 1, null);
    }

    public final void EZpvd(FollowInnerData followInnerData, C46139tJg c46139tJg, android.content.Context context) {
        ArbitrageInfoData arbitrageInfoData;
        ArbitrageInfoData arbitrageInfoData2;
        c46139tJg.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda0));
        int size = followInnerData.EZpvd().size();
        if (size == 0) {
            OLrzqt(c46139tJg, context);
            AEQbTJ(c46139tJg, context);
            return;
        }
        if (size == 1) {
            EZpvd(followInnerData.EZpvd().get(0), c46139tJg, context);
            AEQbTJ(c46139tJg, context);
        } else {
            if (size != 2) {
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) followInnerData.EZpvd().get(0).copydefault(), (java.lang.Object) "1")) {
                arbitrageInfoData = followInnerData.EZpvd().get(0);
            } else {
                arbitrageInfoData = followInnerData.EZpvd().get(1);
            }
            if (Intrinsics.EZpvd((java.lang.Object) followInnerData.EZpvd().get(0).copydefault(), (java.lang.Object) "1")) {
                arbitrageInfoData2 = followInnerData.EZpvd().get(1);
            } else {
                arbitrageInfoData2 = followInnerData.EZpvd().get(0);
            }
            EZpvd(arbitrageInfoData, c46139tJg, context);
            OLrzqt(arbitrageInfoData2, c46139tJg, context);
        }
    }

    public final void OLrzqt(ArbitrageInfoData arbitrageInfoData, C46139tJg c46139tJg, final android.content.Context context) {
        java.lang.String strOLrzqt = OLrzqt(arbitrageInfoData.OLrzqt(), arbitrageInfoData.KWHzl(), true);
        c46139tJg.EZpvd(C33061mpO.setupSpanStyles$default(strOLrzqt, new java.lang.String[]{strOLrzqt}, 0, null, false, new Function1() { // from class: o.tJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tIX.djBIcL(context, (java.util.List) obj);
            }
        }, 14, null));
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairCopydefault = copydefault(arbitrageInfoData.gEmmrt(), arbitrageInfoData.AYXKKw());
        c46139tJg.isConnected(pairCopydefault.getFirst());
        c46139tJg.OLrzqt(C32113mPz.Dialog.values);
        c46139tJg.KWHzl(pairCopydefault.getSecond());
        c46139tJg.AhwBna(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap));
        c46139tJg.OLrzqt(EZpvd(arbitrageInfoData.KWHzl(), arbitrageInfoData.OLrzqt(), arbitrageInfoData.valueOf(), arbitrageInfoData.AEQbTJ()));
        c46139tJg.fetchVPNInfo(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext));
        c46139tJg.gEmmrt(OLrzqt(arbitrageInfoData.KWHzl(), arbitrageInfoData.OLrzqt(), arbitrageInfoData.valueOf(), arbitrageInfoData.EZpvd()));
    }

    public static final Unit djBIcL(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.QOLQEE));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)));
        return Unit.INSTANCE;
    }

    public final void EZpvd(ArbitrageInfoData arbitrageInfoData, C46139tJg c46139tJg, final android.content.Context context) {
        java.lang.String strOLrzqt = OLrzqt(arbitrageInfoData.OLrzqt(), arbitrageInfoData.KWHzl(), true);
        c46139tJg.copydefault(C33061mpO.setupSpanStyles$default(strOLrzqt, new java.lang.String[]{strOLrzqt}, 0, null, false, new Function1() { // from class: o.tJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tIX.AEQbTJ(context, (java.util.List) obj);
            }
        }, 14, null));
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairCopydefault = copydefault(arbitrageInfoData.gEmmrt(), arbitrageInfoData.AYXKKw());
        c46139tJg.EZpvd(java.lang.Integer.valueOf(C46369tRu.EZpvd(pairCopydefault.getSecond().booleanValue())));
        c46139tJg.valueOf(pairCopydefault.getFirst());
        c46139tJg.EZpvd(C32113mPz.Dialog.values);
        c46139tJg.values(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap));
        c46139tJg.AkhnZx(EZpvd(arbitrageInfoData.KWHzl(), arbitrageInfoData.OLrzqt(), arbitrageInfoData.valueOf(), arbitrageInfoData.AEQbTJ()));
        c46139tJg.copydefault(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext));
        c46139tJg.KWHzl(OLrzqt(arbitrageInfoData.KWHzl(), arbitrageInfoData.OLrzqt(), arbitrageInfoData.valueOf(), arbitrageInfoData.EZpvd()));
        c46139tJg.AEQbTJ(2.0f);
    }

    public static final Unit AEQbTJ(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.QOLQEE));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C46139tJg c46139tJg, final android.content.Context context) {
        c46139tJg.copydefault(C33061mpO.setupSpanStyles$default("--", new java.lang.String[]{"--"}, 0, null, false, new Function1() { // from class: o.tJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tIX.valueOf(context, (java.util.List) obj);
            }
        }, 14, null));
        c46139tJg.values(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap));
        c46139tJg.copydefault(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext));
        c46139tJg.AkhnZx("--");
        c46139tJg.KWHzl("--");
    }

    public static final Unit valueOf(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.QOLQEE));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C46139tJg c46139tJg, final android.content.Context context) {
        c46139tJg.EZpvd(C33061mpO.setupSpanStyles$default("--", new java.lang.String[]{"--"}, 0, null, false, new Function1() { // from class: o.tIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tIX.gEmmrt(context, (java.util.List) obj);
            }
        }, 14, null));
        c46139tJg.AhwBna(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap));
        c46139tJg.fetchVPNInfo(C33070mpX.AYXKKw(C55688xof.Application.getThemedContext));
        c46139tJg.OLrzqt("--");
        c46139tJg.gEmmrt("--");
    }

    public static final Unit gEmmrt(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.QOLQEE));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn)));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [764=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str + str2;
        switch (str3.hashCode()) {
            case -1501136790:
                if (str3.equals("sellshort")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.addOnMultiWindowModeChangedListener), java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")));
                }
                break;
            case -1377544873:
                if (str3.equals("buynet")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setPipParamsSourceRectHint), java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")));
                }
                break;
            case -965989962:
                if (str3.equals("buyshort")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.addOnMultiWindowModeChangedListener), java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")));
                }
                break;
            case 245731842:
                if (str3.equals("buylong")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.lambdanew0), java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")));
                }
                break;
            case 1198300366:
                if (str3.equals("selllong")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1), java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")));
                }
                break;
            case 1978319115:
                if (str3.equals("sellnet")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.addMenuProvider), java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy")));
                }
                break;
        }
        return C56390yDp.OLrzqt("", java.lang.Boolean.FALSE);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.AEQbTJ(str4) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return "--";
        }
        C54536xML c54536xMLKWHzl = KWHzl(C33129mqd.EZpvd(str4), str, str2);
        if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "enter")) {
            c54536xMLKWHzl = c54536xMLKWHzl != null ? c54536xMLKWHzl.fetchVPNInfo() : null;
        }
        return java.lang.String.valueOf(c54536xMLKWHzl != null ? c54536xMLKWHzl.EZpvd(false) : null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "enter")) {
            C54536xML c54536xMLKWHzl = KWHzl(C33129mqd.EZpvd(str4), str, str2);
            strAYXKKw = c54536xMLKWHzl != null ? c54536xMLKWHzl.EZpvd(false) : null;
            if (strAYXKKw == null) {
                return "";
            }
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                return "--";
            }
            java.lang.Integer num = AEQbTJ.get(str3);
            strAYXKKw = num != null ? C33070mpX.AYXKKw(num.intValue()) : null;
            if (strAYXKKw == null) {
                return "";
            }
        }
        return strAYXKKw;
    }

    public final C54536xML KWHzl(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLIsConnected;
        xMS xmsAEQbTJ = C46392tSq.EZpvd.AEQbTJ(str, str2);
        if (xmsAEQbTJ == null || (c54536xMLAYXKKw = xmsAEQbTJ.AYXKKw(C33129mqd.gEmmrt(number))) == null || (c54536xMLIsConnected = c54536xMLAYXKKw.isConnected()) == null) {
            return null;
        }
        return c54536xMLIsConnected.djBIcL();
    }

    public static /* synthetic */ kotlin.Pair getAllUserTradeSide$default(tIX tix, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C32979mnm.EZpvd.OLrzqt();
        }
        return tix.EZpvd(context, str, str2, str3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (o.C59449zhJ.gEmmrt(r8, "net", true) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (o.C59449zhJ.gEmmrt(r7, "buy", true) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r5 = r5.getString(o.C47501trL.Fragment.getFieldNames);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r5 = r5.getString(o.C47501trL.Fragment.AubY);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (o.C59449zhJ.gEmmrt(r8, "long", true) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (o.C59449zhJ.gEmmrt(r7, "buy", true) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        r5 = r5.getString(o.C47501trL.Fragment.uzCIH);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        r5 = r5.getString(o.C47501trL.Fragment.hDKMBd);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (o.C59449zhJ.gEmmrt(r7, "buy", true) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r5 = r5.getString(o.C47501trL.Fragment.iwGUEr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        r5 = r5.getString(o.C47501trL.Fragment.AuCTelauCTel);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r6.equals("SPOT") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        if (r6.equals("OPTION") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if (r6.equals("MARGIN") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        if (o.C59449zhJ.gEmmrt(r7, "buy", true) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        r5 = r5.getString(o.C47501trL.Fragment.getFieldNames);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
    
        r5 = r5.getString(o.C47501trL.Fragment.AubY);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return o.C56390yDp.OLrzqt(r5, java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return o.C56390yDp.OLrzqt(r5, java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return o.C56390yDp.OLrzqt(r5, java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return o.C56390yDp.OLrzqt(r5, java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return o.C56390yDp.OLrzqt(r5, java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return o.C56390yDp.OLrzqt(r5, java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return o.C56390yDp.OLrzqt(r5, java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return o.C56390yDp.OLrzqt(r5, java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r6.equals("FUTURES") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r6.equals("SWAP") == false) goto L40;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        switch (str.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                break;
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                return C56390yDp.OLrzqt("", java.lang.Boolean.FALSE);
        }
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        xMS xmsGEmmrt;
        java.lang.String safeString$default;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (!C33129mqd.OLrzqt((java.lang.Object) str3, (java.lang.Object) 0)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C46392tSq.EZpvd.AhwBna().OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
            java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null) {
                xmsGEmmrt = null;
            } else {
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily != null ? instFamily : "");
            }
            if (yDY.gEmmrt("SPOT", "MARGIN").contains(str)) {
                C54536xML c54536xMLCopydefault = tTN.Companion.copydefault(str4, (xmsGEmmrt == null || (c54536xMLAYXKKw2 = xmsGEmmrt.AYXKKw(str3)) == null || (c54536xMLIsConnected = c54536xMLAYXKKw2.isConnected()) == null || (c54536xMLDjBIcL2 = c54536xMLIsConnected.djBIcL()) == null) ? null : c54536xMLDjBIcL2.fetchVPNInfo());
                if (c54536xMLCopydefault != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) != null) {
                    return safeString$default2;
                }
            } else {
                C54536xML c54536xMLCopydefault2 = tTN.Companion.copydefault(str4, (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str3)) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null) ? null : c54536xMLDjBIcL.fetchVPNInfo());
                if (c54536xMLCopydefault2 != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault2, false, 1, null)) != null) {
                    return safeString$default;
                }
            }
        }
        return "--";
    }
}
