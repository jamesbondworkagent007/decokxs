package o;

import com.okinc.business.defi.biz.net.bean.DappBTCUTXOAllInfo;
import com.okinc.business.defi.biz.net.bean.DappBTCXRCAssetChange;
import com.okinc.business.defi.wallet.transaction.ui.common.OKWBTCAssetTipFragment;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C57512yjn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fXL {
    public static final fXL copydefault = new fXL();

    private fXL() {
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, @NotNull C12152chZ c12152chZ, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(c12152chZ, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Activity activityOLrzqt = OLrzqt(c12152chZ);
        if (activityOLrzqt == null) {
            return;
        }
        copydefault(context, fragmentManager, i, c12152chZ, activityOLrzqt.EZpvd(), function0);
    }

    public static final class Activity {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.EZpvd;
            }
            return activity.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Activity) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RiskInfo(subTitle=" + this.EZpvd + ")";
        }

        public Activity(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    public final Activity OLrzqt(C12152chZ c12152chZ) {
        if (c12152chZ.djBIcL()) {
            return new Activity(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setButton));
        }
        if (c12152chZ.AhwBna()) {
            return new Activity(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStarRating));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: o.fXL */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(android.content.Context context, final androidx.fragment.app.FragmentManager fragmentManager, int i, C12152chZ c12152chZ, java.lang.String str, Function0<Unit> function0) {
        java.util.List listAhwBna;
        OKWBTCAssetTipFragment oKWBTCAssetTipFragmentKWHzl;
        java.util.List<DappBTCXRCAssetChange> assetChange;
        Function0<Unit> function02 = new Function0() { // from class: o.fXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fXL.copydefault(fragmentManager);
            }
        };
        if (c12152chZ.DCUTEIddSDPG()) {
            oKWBTCAssetTipFragmentKWHzl = OKWBTCAssetTipFragment.Companion.KWHzl(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController4), str, EZpvd(c12152chZ, context), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSetRating), function02, function0);
        } else {
            OKWBTCAssetTipFragment.TaskDescription taskDescription = OKWBTCAssetTipFragment.Companion;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController4);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompat);
            DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt = c12152chZ.OLrzqt();
            if (dappBTCUTXOAllInfoOLrzqt == null || (assetChange = dappBTCUTXOAllInfoOLrzqt.getAssetChange()) == null) {
                listAhwBna = null;
            } else {
                listAhwBna = new java.util.ArrayList();
                for (java.lang.Object obj : assetChange) {
                    java.lang.Integer direction = ((DappBTCXRCAssetChange) obj).getDirection();
                    if (direction != null && direction.intValue() == 2) {
                        listAhwBna.add(obj);
                    }
                }
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            oKWBTCAssetTipFragmentKWHzl = taskDescription.KWHzl(strAYXKKw, str, new TransactionHeaderInfoBean(strAYXKKw2, AEQbTJ(context, "-", listAhwBna), false, null, null, null, null, 124, null), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSetRating), function02, function0);
        }
        fragmentManager.beginTransaction().add(i, oKWBTCAssetTipFragmentKWHzl, "OKWBTCMultipleAssetTipFragment").commitAllowingStateLoss();
    }

    public static final Unit copydefault(androidx.fragment.app.FragmentManager fragmentManager) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("OKWBTCMultipleAssetTipFragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public final java.util.List<C57512yjn.ActionBar> EZpvd(C12152chZ c12152chZ, android.content.Context context) {
        java.util.List<DappBTCXRCAssetChange> assetChange;
        java.lang.String strOLrzqt;
        DappBTCUTXOAllInfo dappBTCUTXOAllInfoOLrzqt = c12152chZ.OLrzqt();
        java.util.ArrayList arrayList = null;
        if (dappBTCUTXOAllInfoOLrzqt != null && (assetChange = dappBTCUTXOAllInfoOLrzqt.getAssetChange()) != null) {
            java.util.ArrayList<DappBTCXRCAssetChange> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : assetChange) {
                java.lang.Integer direction = ((DappBTCXRCAssetChange) obj).getDirection();
                if (direction != null && direction.intValue() == 2) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (DappBTCXRCAssetChange dappBTCXRCAssetChange : arrayList2) {
                C57512yjn.TaskDescription taskDescription = new C57512yjn.TaskDescription(dappBTCXRCAssetChange.getLogo(), C14726dqr.OLrzqt.OLrzqt(context), 0, 0, 12, null);
                java.lang.String amount = dappBTCXRCAssetChange.getAmount();
                if (amount != null) {
                    java.lang.Integer vdecimal = dappBTCXRCAssetChange.getVdecimal();
                    strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, vdecimal != null ? vdecimal.intValue() : 8, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                } else {
                    strOLrzqt = null;
                }
                java.lang.String str = "-" + strOLrzqt;
                java.lang.String symbol = dappBTCXRCAssetChange.getSymbol();
                C57512yjn.StateListAnimator stateListAnimator = new C57512yjn.StateListAnimator(str, (symbol == null || symbol.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol, null, null, null, null, 60, null);
                java.lang.String usdAmount = dappBTCXRCAssetChange.getUsdAmount();
                java.lang.String valuationFromAsset$default = usdAmount != null ? C54880xYt.formatValuationFromAsset$default(usdAmount, null, false, 0, false, 15, null) : null;
                if (valuationFromAsset$default == null || valuationFromAsset$default.length() == 0) {
                    valuationFromAsset$default = "--";
                }
                arrayList3.add(new C57512yjn.ActionBar(null, taskDescription, stateListAnimator, valuationFromAsset$default));
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final java.util.List<TransactionHeaderInfoBean.HeaderSimpleDataBean> AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.List<DappBTCXRCAssetChange> list) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DappBTCXRCAssetChange dappBTCXRCAssetChange : list) {
            java.lang.String amount = dappBTCXRCAssetChange.getAmount();
            if (amount != null) {
                java.lang.Integer vdecimal = dappBTCXRCAssetChange.getVdecimal();
                strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, vdecimal != null ? vdecimal.intValue() : 8, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            } else {
                strOLrzqt = null;
            }
            java.lang.String str2 = str + strOLrzqt;
            java.lang.String logo = dappBTCXRCAssetChange.getLogo();
            android.graphics.drawable.Drawable drawableOLrzqt = C14726dqr.OLrzqt.OLrzqt(context);
            java.lang.String symbol = dappBTCXRCAssetChange.getSymbol();
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
            if (symbol == null || symbol.length() == 0) {
                symbol = strAYXKKw;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(symbol);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder.length(), 17);
            Unit unit = Unit.INSTANCE;
            java.lang.String usdAmount = dappBTCXRCAssetChange.getUsdAmount();
            java.lang.String valuationFromAsset$default = usdAmount != null ? C54880xYt.formatValuationFromAsset$default(usdAmount, null, false, 0, false, 15, null) : null;
            arrayList.add(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, logo, null, drawableOLrzqt, null, str2, spannableStringBuilder, false, (valuationFromAsset$default == null || valuationFromAsset$default.length() == 0) ? "--" : valuationFromAsset$default, null, null, 0, null, null, null, null, null, 1044655, null));
        }
        return arrayList;
    }
}
