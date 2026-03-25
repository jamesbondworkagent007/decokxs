package o;

import android.graphics.drawable.BitmapDrawable;
import androidx.core.graphics.drawable.DrawableKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo;
import com.okinc.tradingbot.impl.dto.TradeListResp;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.config.SpotDcaDealRecordStateData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC53802wsP;
import o.C48033uCm;
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53869wtd {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final java.util.Set<java.lang.String> KWHzl = yEE.AhwBna("orderRetry", "orderFail");
    public static final java.util.List<java.lang.String> copydefault = yDY.gEmmrt("manual_add_order", "market_manual_order", "limit_manual_order");
    public int AEQbTJ = 1;
    public int OLrzqt = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault(boolean z, boolean z2) {
        return (z && z2) ? C48033uCm.Fragment.ixgjPv : (!z || z2) ? z2 ? C48033uCm.Fragment.run : C48033uCm.Fragment.DGOPHZ : C48033uCm.Fragment.DCUTEIdCUTEI;
    }

    /* JADX INFO: renamed from: o.wtd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wtd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.wtd$Activity */
    public static final class Activity {
        public final int AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                str = activity.EZpvd;
            }
            if ((i4 & 2) != 0) {
                str2 = activity.KWHzl;
            }
            java.lang.String str3 = str2;
            if ((i4 & 4) != 0) {
                i = activity.OLrzqt;
            }
            int i5 = i;
            if ((i4 & 8) != 0) {
                i2 = activity.copydefault;
            }
            int i6 = i2;
            if ((i4 & 16) != 0) {
                i3 = activity.AEQbTJ;
            }
            return activity.OLrzqt(str, str3, i5, i6, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.StringRes int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorRes int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2, i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && this.OLrzqt == activity.OLrzqt && this.copydefault == activity.copydefault && this.AEQbTJ == activity.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PriceInfo(px=" + this.EZpvd + ", formattedPx=" + this.KWHzl + ", titleRes=" + this.OLrzqt + ", bgColor=" + this.copydefault + ", textColor=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.StringRes int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorRes int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.KWHzl = str2;
            this.OLrzqt = i;
            this.copydefault = i2;
            this.AEQbTJ = i3;
        }
    }

    public final java.util.List<AbstractC53802wsP> AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.List<TradeListResp> list, StrategyDetailsResponse strategyDetailsResponse, @NotNull java.util.Set<java.lang.String> set) {
        java.lang.String str;
        boolean z;
        java.util.List list2;
        java.lang.String str2;
        java.util.List listEZpvd;
        java.lang.String str3;
        AbstractC53802wsP abstractC53802wsPEZpvd;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        java.lang.String instId = strategyDetailsResponse != null ? strategyDetailsResponse.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        java.lang.String instType = strategyDetailsResponse != null ? strategyDetailsResponse.getInstType() : null;
        java.lang.String str4 = instType == null ? "" : instType;
        java.lang.String lastPrice = strategyDetailsResponse != null ? strategyDetailsResponse.getLastPrice() : null;
        java.lang.String str5 = lastPrice == null ? "" : lastPrice;
        boolean z2 = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5);
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((TradeListResp) obj).AuCTel(), (java.lang.Object) SpotDcaDealRecordStateData.CANCELED.getState())) {
                arrayList.add(obj);
            }
        }
        listOLrzqt.addAll(arrayList);
        if (z2) {
            java.lang.String str6 = str5;
            str = str5;
            z = true;
            listOLrzqt.add(new Activity(str6, copydefault(str4, instId, str5), C48033uCm.Fragment.QVMIlx, C55366xib.KWHzl(C52761wXj.ActionBar.DarRvM, context), C52761wXj.Activity.htlTjW));
        } else {
            str = str5;
            z = true;
        }
        java.lang.String avgPx = strategyDetailsResponse != null ? strategyDetailsResponse.getAvgPx() : null;
        java.lang.String str7 = avgPx == null ? "" : avgPx;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str7) ^ z) {
            listOLrzqt.add(new Activity(str7, copydefault(str4, instId, str7), C55688xof.Application.getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAXannotations, C33070mpX.copydefault(C52761wXj.Activity.invokespecialODCBUN), C52761wXj.Activity.fdOvFl));
        }
        java.lang.String liqPx = strategyDetailsResponse != null ? strategyDetailsResponse.getLiqPx() : null;
        java.lang.String str8 = liqPx == null ? "" : liqPx;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str8) ^ z) {
            list2 = listOLrzqt;
            str2 = str;
            list2.add(new TradeListResp((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ContractDcaExtendInfo) null, (java.lang.String) null, (java.lang.String) null, "liquidation_order", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, instId, str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str8, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, -25198593, 2097135, (DefaultConstructorMarker) null));
        } else {
            list2 = listOLrzqt;
            str2 = str;
        }
        java.util.List listFARcdN = C56402yEa.fARcdN(list2);
        if (listFARcdN.size() == 1 && z2) {
            return yDY.AhwBna();
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (strategyDetailsResponse != null ? strategyDetailsResponse.getDirection() : null), (java.lang.Object) "short");
        Function1 function1 = new Function1() { // from class: o.wte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C53869wtd.EZpvd(this.KWHzl, obj2);
            }
        };
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (zEZpvd) {
            listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listFARcdN, new StateListAnimator(function1));
        } else {
            listEZpvd = CollectionsKt___CollectionsKt.EZpvd(listFARcdN, new TaskDescription(function1));
        }
        for (java.lang.Object obj2 : listEZpvd) {
            if (obj2 instanceof TradeListResp) {
                str3 = str2;
                abstractC53802wsPEZpvd = AEQbTJ(context, (TradeListResp) obj2, str3, set);
            } else {
                str3 = str2;
                abstractC53802wsPEZpvd = obj2 instanceof Activity ? EZpvd((Activity) obj2, (AbstractC53802wsP) CollectionsKt___CollectionsKt.wlaJM(arrayList2)) : null;
            }
            if (abstractC53802wsPEZpvd != null) {
                arrayList2.add(abstractC53802wsPEZpvd);
            }
            str2 = str3;
        }
        return arrayList2;
    }

    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return C56033xvF.getBotPrice$default(str, str2, str3, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    /* JADX INFO: renamed from: o.wtd$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            this.AEQbTJ = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.AEQbTJ;
            return yET.KWHzl((java.lang.Comparable) function1.invoke(t), (java.lang.Comparable) function1.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: o.wtd$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            this.copydefault = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.copydefault;
            return yET.KWHzl((java.lang.Comparable) function1.invoke(t2), (java.lang.Comparable) function1.invoke(t));
        }
    }

    public static final BigDecimal EZpvd(C53869wtd c53869wtd, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof TradeListResp) {
            return C33129mqd.EZpvd(c53869wtd.AEQbTJ((TradeListResp) obj));
        }
        if (obj instanceof Activity) {
            return C33129mqd.EZpvd(((Activity) obj).AEQbTJ());
        }
        return null;
    }

    public final AbstractC53802wsP.Activity EZpvd(Activity activity, AbstractC53802wsP abstractC53802wsP) {
        kotlin.Pair pairOLrzqt;
        if (abstractC53802wsP instanceof AbstractC53802wsP.Application) {
            AbstractC53802wsP.Application application = (AbstractC53802wsP.Application) abstractC53802wsP;
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(application.djBIcL()), java.lang.Boolean.valueOf(application.values()));
        } else if (abstractC53802wsP instanceof AbstractC53802wsP.Activity) {
            AbstractC53802wsP.Activity activity2 = (AbstractC53802wsP.Activity) abstractC53802wsP;
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(activity2.KWHzl()), java.lang.Boolean.valueOf(activity2.gEmmrt()));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), java.lang.Boolean.FALSE);
        }
        return new AbstractC53802wsP.Activity("price_" + activity.EZpvd(), C33070mpX.AYXKKw(activity.EZpvd()), activity.copydefault(), activity.KWHzl(), C33070mpX.copydefault(activity.OLrzqt()), ((java.lang.Number) pairOLrzqt.component1()).intValue(), ((java.lang.Boolean) pairOLrzqt.component2()).booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC53802wsP.Application AEQbTJ(android.content.Context context, TradeListResp tradeListResp, java.lang.String str, java.util.Set<java.lang.String> set) {
        java.lang.String strCopydefault;
        int iCopydefault;
        int i;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        android.graphics.drawable.Drawable drawableCopydefault;
        ContractDcaExtendInfo contractDcaExtendInfoEZpvd;
        java.util.Set<java.lang.String> set2;
        ContractDcaExtendInfo contractDcaExtendInfoEZpvd2;
        java.lang.String strEZpvd = EZpvd(tradeListResp.djBIcL(), tradeListResp.fetchVPNInfo());
        boolean zContains = copydefault.contains(tradeListResp.djBIcL());
        java.lang.String strKWHzl = KWHzl(tradeListResp);
        java.lang.String strAEQbTJ = AEQbTJ(tradeListResp);
        java.lang.String botPrice$default = C56033xvF.getBotPrice$default(tradeListResp.AhwBna(), tradeListResp.gEmmrt(), strAEQbTJ, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        java.lang.String strOLrzqt = OLrzqt(strAEQbTJ, str);
        boolean z = false;
        if (Intrinsics.EZpvd((java.lang.Object) tradeListResp.djBIcL(), (java.lang.Object) "liquidation_order")) {
            strCopydefault = botPrice$default + " (" + strOLrzqt + ")";
        } else {
            strCopydefault = C33069mpW.copydefault(copydefault(Intrinsics.EZpvd((java.lang.Object) tradeListResp.DbNXlk(), (java.lang.Object) "market") && Intrinsics.EZpvd((java.lang.Object) tradeListResp.isConnected(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL), C56033xvF.AYXKKw(tradeListResp.AhwBna(), tradeListResp.AkhnZx(), tradeListResp.values()).getSecond().booleanValue()), C56424yEw.gEmmrt(C56390yDp.OLrzqt("buyAmount", strKWHzl), C56390yDp.OLrzqt("buyBaseCcy", botPrice$default), C56390yDp.OLrzqt("sellAmount", strKWHzl), C56390yDp.OLrzqt("sellBaseCcy", botPrice$default), C56390yDp.OLrzqt("pnlPct", strOLrzqt)));
        }
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) tradeListResp.AuCTel(), (java.lang.Object) SpotDcaDealRecordStateData.FILLED.getState());
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        if (KWHzl.contains(tradeListResp.fetchVPNInfo()) || Intrinsics.EZpvd((java.lang.Object) tradeListResp.djBIcL(), (java.lang.Object) "liquidation_order")) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.gdmIOq);
        } else if (Intrinsics.EZpvd((java.lang.Object) tradeListResp.djBIcL(), (java.lang.Object) "tp_order")) {
            iCopydefault = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) tradeListResp.djBIcL(), (java.lang.Object) "sl_order")) {
            iCopydefault = C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        } else if (!zEZpvd) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            i = iCopydefault2;
            numValueOf = java.lang.Integer.valueOf(i);
            if (numValueOf.intValue() == iCopydefault2) {
                numValueOf = null;
            }
            int iIntValue = numValueOf == null ? numValueOf.intValue() : C33070mpX.copydefault(C52761wXj.Activity.iUnTnt);
            numValueOf2 = java.lang.Integer.valueOf(i);
            if (numValueOf2.intValue() == iCopydefault2) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 == null ? numValueOf2.intValue() : C33070mpX.copydefault(C52761wXj.Activity.idLUrz);
            if (!Intrinsics.EZpvd((java.lang.Object) tradeListResp.djBIcL(), (java.lang.Object) "tp_order")) {
                drawableCopydefault = C33070mpX.KWHzl(C48033uCm.ActionBar.getFieldNames);
            } else if (Intrinsics.EZpvd((java.lang.Object) tradeListResp.djBIcL(), (java.lang.Object) "sl_order")) {
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C48033uCm.ActionBar.getFieldNames);
                drawableCopydefault = drawableKWHzl != null ? copydefault(drawableKWHzl, context) : null;
            } else if (zEZpvd) {
                drawableCopydefault = C33070mpX.KWHzl(C48033uCm.ActionBar.fetchVPNInfo);
            } else {
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C49511upt.TaskDescription.EZpvd);
                if (drawableKWHzl2 != null) {
                    drawableCopydefault = C33057mpK.copydefault(drawableKWHzl2, C33070mpX.copydefault(C52761wXj.Activity.htlTjW));
                }
            }
            java.lang.String str2 = "order_" + tradeListResp.OLrzqt() + "_" + tradeListResp.djBIcL() + "_" + tradeListResp.AYXKKw();
            java.lang.String strValueOf = tradeListResp.valueOf();
            java.lang.String strEZpvd2 = SpotDcaDealRecordStateData.Companion.EZpvd(tradeListResp.AuCTel());
            if (!zContains) {
                strEZpvd2 = null;
            }
            if (zContains && Intrinsics.EZpvd((java.lang.Object) tradeListResp.AuCTel(), (java.lang.Object) SpotDcaDealRecordStateData.LIVE.getState())) {
                z = true;
            }
            java.lang.String strFetchVPNInfo = tradeListResp.fetchVPNInfo();
            contractDcaExtendInfoEZpvd = tradeListResp.EZpvd();
            if (contractDcaExtendInfoEZpvd == null) {
                contractDcaExtendInfoEZpvd2 = EZpvd(contractDcaExtendInfoEZpvd, tradeListResp.AhwBna(), tradeListResp.gEmmrt());
                set2 = set;
            } else {
                set2 = set;
                contractDcaExtendInfoEZpvd2 = null;
            }
            return new AbstractC53802wsP.Application(str2, strValueOf, strEZpvd, strEZpvd2, z, strCopydefault, i, strFetchVPNInfo, iIntValue, !zEZpvd, iIntValue2, drawableCopydefault, contractDcaExtendInfoEZpvd2, set2.contains(strEZpvd));
        }
        i = iCopydefault;
        numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() == iCopydefault2) {
        }
        int iIntValue3 = numValueOf == null ? numValueOf.intValue() : C33070mpX.copydefault(C52761wXj.Activity.iUnTnt);
        numValueOf2 = java.lang.Integer.valueOf(i);
        if (numValueOf2.intValue() == iCopydefault2) {
        }
        int iIntValue22 = numValueOf2 == null ? numValueOf2.intValue() : C33070mpX.copydefault(C52761wXj.Activity.idLUrz);
        if (!Intrinsics.EZpvd((java.lang.Object) tradeListResp.djBIcL(), (java.lang.Object) "tp_order")) {
        }
        java.lang.String str22 = "order_" + tradeListResp.OLrzqt() + "_" + tradeListResp.djBIcL() + "_" + tradeListResp.AYXKKw();
        java.lang.String strValueOf2 = tradeListResp.valueOf();
        java.lang.String strEZpvd22 = SpotDcaDealRecordStateData.Companion.EZpvd(tradeListResp.AuCTel());
        if (!zContains) {
        }
        if (zContains) {
            z = true;
        }
        java.lang.String strFetchVPNInfo2 = tradeListResp.fetchVPNInfo();
        contractDcaExtendInfoEZpvd = tradeListResp.EZpvd();
        if (contractDcaExtendInfoEZpvd == null) {
        }
        return new AbstractC53802wsP.Application(str22, strValueOf2, strEZpvd, strEZpvd22, z, strCopydefault, i, strFetchVPNInfo2, iIntValue3, !zEZpvd, iIntValue22, drawableCopydefault, contractDcaExtendInfoEZpvd2, set2.contains(strEZpvd));
    }

    public static final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return C33129mqd.OLrzqt((java.lang.Object) str3, (java.lang.Object) 0) ? "--" : C56033xvF.getBotPrice$default(str, str2, str3, false, false, null, null, 120, null);
    }

    public final ContractDcaExtendInfo EZpvd(ContractDcaExtendInfo contractDcaExtendInfo, java.lang.String str, java.lang.String str2) {
        return new ContractDcaExtendInfo(OLrzqt(str, str2, contractDcaExtendInfo.copydefault()), C53418wlC.KWHzl(C56033xvF.getBotLever$default(contractDcaExtendInfo.AEQbTJ(), false, 2, null)), OLrzqt(str, str2, contractDcaExtendInfo.OLrzqt()), OLrzqt(str, str2, contractDcaExtendInfo.EZpvd()));
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : xMR.formatPercentWithSymbol$default(xMR.copydefault, C33129mqd.divS$default(C33129mqd.subS$default(str, str2, null, null, null, 14, null), str2, null, null, null, 14, null), 0, 0, RoundingMode.DOWN, 6, null);
    }

    public final java.lang.String KWHzl(TradeListResp tradeListResp) {
        java.lang.String strKWHzl = Intrinsics.EZpvd((java.lang.Object) tradeListResp.AuCTel(), (java.lang.Object) SpotDcaDealRecordStateData.FILLED.getState()) ? tradeListResp.KWHzl() : tradeListResp.fARcdN();
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl) ? "--" : C56033xvF.getBotAmount$default(tradeListResp.AhwBna(), tradeListResp.gEmmrt(), strKWHzl, tradeListResp.AEQbTJ(), true, null, 32, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [314=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String strAYXKKw;
        switch (str.hashCode()) {
            case -2039370855:
                if (!str.equals("limit_manual_order")) {
                    strAYXKKw = "";
                } else {
                    strAYXKKw = C33069mpW.copydefault(C55688xof.Application.DcMfJKsgNvtZ, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, pTB.formatLocalized$default(java.lang.String.valueOf(this.OLrzqt), null, 1, null))));
                    this.OLrzqt++;
                }
                break;
            case -1665529609:
                if (!str.equals("manual_add_order")) {
                }
                break;
            case -1613409592:
                if (str.equals("liquidation_order")) {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.fLIjIY);
                    break;
                }
                break;
            case -1548348952:
                if (str.equals("sl_order")) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OuxcSI);
                    break;
                }
                break;
            case -550491189:
                if (str.equals("tp_order")) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.zuWLRA);
                    break;
                }
                break;
            case 597902175:
                if (str.equals("init_order")) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getPostValueLengthLimit);
                    break;
                }
                break;
            case 1361050808:
                if (!str.equals("market_manual_order")) {
                }
                break;
            case 1862280097:
                if (str.equals("safety_order")) {
                    strAYXKKw = C33069mpW.copydefault(C55688xof.Application.ffGIBT, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, pTB.formatLocalized$default(java.lang.String.valueOf(this.AEQbTJ), null, 1, null))));
                    this.AEQbTJ++;
                    break;
                }
                break;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "orderFail")) {
            return strAYXKKw + " " + C33070mpX.AYXKKw(C55688xof.Application.QkdxfA);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "orderRetry")) {
            return strAYXKKw;
        }
        return strAYXKKw + " " + C33070mpX.AYXKKw(C55688xof.Application.RdAHlO);
    }

    public final java.lang.String AEQbTJ(TradeListResp tradeListResp) {
        return Intrinsics.EZpvd((java.lang.Object) tradeListResp.AuCTel(), (java.lang.Object) SpotDcaDealRecordStateData.FILLED.getState()) ? tradeListResp.copydefault() : tradeListResp.isConnected();
    }

    public final android.graphics.drawable.Drawable copydefault(@NotNull android.graphics.drawable.Drawable drawable, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(drawable, "");
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Bitmap bitmap$default = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(1.0f, -1.0f, bitmap$default.getWidth() / 2.0f, bitmap$default.getHeight() / 2.0f);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmap$default, 0, 0, bitmap$default.getWidth(), bitmap$default.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }
}
