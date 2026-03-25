package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.analytics.PaymentsBannerTrackerAttrType;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.ui.base.BaseBscFragmentViewModel$runBannerCheck$2;
import com.okinc.buysell.ui.base.BaseBscFragmentViewModel$startPolling$1;
import com.okinc.buysell.util.PaymentFeatureFlag;
import com.okinc.okx.paymentapi.service.DisplayPage;
import com.okinc.okx.paymentapi.service.SupportBanner;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lzT extends AbstractC33073mpa {
    public final MutableLiveData<C32989mnw<java.lang.Boolean>> AEQbTJ;
    public java.util.List<SupportBanner> KWHzl;
    public lTY OLrzqt;
    public lyM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.Boolean>> AYXKKw() {
        return this.AEQbTJ;
    }

    public abstract java.lang.String KWHzl();

    public abstract BannerFlowType copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SupportBanner> djBIcL() {
        return this.KWHzl;
    }

    public lzT(@NotNull lyM lym) {
        Intrinsics.checkNotNullParameter(lym, "");
        this.copydefault = lym;
        this.OLrzqt = new lTY(Dispatchers.getIO());
        this.AEQbTJ = new MutableLiveData<>();
    }

    public final void OLrzqt(int i) {
        if (AhwBna()) {
            this.OLrzqt.KWHzl(i, new BaseBscFragmentViewModel$startPolling$1(this, null));
        }
    }

    public final void DbNXlk() {
        this.OLrzqt.EZpvd();
    }

    public final boolean AhwBna() {
        return C30327lUg.OLrzqt(PaymentFeatureFlag.IS_BANNER_POLLING_ENABLED);
    }

    public final void OLrzqt() {
        java.util.ArrayList arrayList;
        java.util.ArrayList<SupportBanner> arrayListOLrzqt = lTU.OLrzqt.OLrzqt();
        if (arrayListOLrzqt != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListOLrzqt) {
                java.util.List<DisplayPage> displayPages = ((SupportBanner) obj).getDisplayPages();
                if (displayPages != null && !displayPages.isEmpty()) {
                    java.util.Iterator<T> it = displayPages.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DisplayPage displayPage = (DisplayPage) it.next();
                        java.util.List<java.lang.String> pageNames = displayPage.getPageNames();
                        if (pageNames != null && pageNames.contains(KWHzl()) && Intrinsics.EZpvd((java.lang.Object) displayPage.getFlowType(), (java.lang.Object) copydefault().getFlowName())) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        } else {
            arrayList = null;
        }
        this.KWHzl = arrayList;
        gEmmrt();
        java.util.List<SupportBanner> list = this.KWHzl;
        java.util.List<SupportBanner> listHDKMBd = list != null ? C56405yEd.hDKMBd(list) : null;
        this.KWHzl = listHDKMBd;
        mHA.OLrzqt.OLrzqt(this.AEQbTJ, java.lang.Boolean.valueOf(C33129mqd.KWHzl((java.util.Collection) listHDKMBd)));
    }

    public final void EZpvd() {
        this.KWHzl = null;
        lTU.OLrzqt.OLrzqt(null);
        mHA.OLrzqt.OLrzqt(this.AEQbTJ, java.lang.Boolean.FALSE);
    }

    public static /* synthetic */ void runBannerCheck$default(lzT lzt, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runBannerCheck");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        lzt.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        copydefault(z);
        if (z2) {
            lTU ltu = lTU.OLrzqt;
            if (ltu.OLrzqt() != null) {
                if (ltu.OLrzqt() != null) {
                    OLrzqt();
                    return;
                }
                return;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseBscFragmentViewModel$runBannerCheck$2(this, z2, null), 3, null);
    }

    public static /* synthetic */ void trackBannerV2Event$default(lzT lzt, PaymentsBannerTrackerAttrType paymentsBannerTrackerAttrType, java.lang.Integer num, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackBannerV2Event");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        lzt.OLrzqt(paymentsBannerTrackerAttrType, num);
    }

    public final void OLrzqt(@NotNull PaymentsBannerTrackerAttrType paymentsBannerTrackerAttrType, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(paymentsBannerTrackerAttrType, "");
        C31354lsT.KWHzl.KWHzl(paymentsBannerTrackerAttrType, copydefault().getFlowName(), KWHzl(), num);
    }

    public final void EZpvd(@NotNull java.util.List<SupportBanner> list) {
        java.util.ArrayList<java.lang.Integer> arrayList;
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            java.util.ArrayList<java.lang.Integer> arrayList2 = new java.util.ArrayList<>();
            lTU ltu = lTU.OLrzqt;
            if (C33129mqd.KWHzl((java.util.Collection) ltu.EZpvd().get(copydefault())) && (arrayList = ltu.EZpvd().get(copydefault())) != null) {
                arrayList2 = arrayList;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((SupportBanner) it.next()).getBannerId());
            }
            arrayList2.addAll(arrayList3);
            lTU.OLrzqt.EZpvd().put(copydefault(), arrayList2);
        }
    }

    public final java.util.List<SupportBanner> AEQbTJ() {
        java.util.ArrayList arrayList;
        if (!lTU.OLrzqt.EZpvd().containsKey(copydefault())) {
            return this.KWHzl;
        }
        java.util.List<SupportBanner> list = this.KWHzl;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) C56424yEw.EZpvd((java.util.Map<BannerFlowType, ? extends V>) ((java.util.Map<java.lang.Object, ? extends V>) r0), copydefault())), ((SupportBanner) obj).getBannerId())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            trackBannerV2Event$default(this, PaymentsBannerTrackerAttrType.BANNER_V2_AUTOMATIC_POPUP, null, 2, null);
        }
        return arrayList;
    }

    public void copydefault(boolean z) {
        if (z) {
            if (copydefault() == BannerFlowType.MERGE) {
                lTU ltu = lTU.OLrzqt;
                ltu.EZpvd().remove(BannerFlowType.BUY);
                ltu.EZpvd().remove(BannerFlowType.SELL);
                return;
            }
            lTU.OLrzqt.EZpvd().remove(copydefault());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.Map<com.okinc.buysell.data.BannerFlowType, java.util.ArrayList<java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        java.util.ArrayList arrayList;
        java.util.ArrayList<java.lang.Integer> arrayList2 = lTU.OLrzqt.EZpvd().get(copydefault());
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            java.util.List<SupportBanner> list = this.KWHzl;
            if (list != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SupportBanner) it.next()).getBannerId());
                }
            } else {
                arrayList = null;
            }
            Intrinsics.copydefault(arrayList, "");
            java.util.Map<BannerFlowType, java.util.ArrayList<java.lang.Integer>> mapEZpvd = lTU.OLrzqt.EZpvd();
            BannerFlowType bannerFlowTypeCopydefault = copydefault();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                Intrinsics.copydefault(arrayList2, "");
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList2), (java.lang.Integer) obj)) {
                    arrayList3.add(obj);
                }
            }
            mapEZpvd.put(bannerFlowTypeCopydefault, arrayList3);
        }
    }

    public final int valueOf() {
        java.lang.Integer pollingTimeFrameInSeconds;
        java.util.List<SupportBanner> list = this.KWHzl;
        SupportBanner supportBanner = null;
        java.lang.Object next = null;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    java.lang.Integer pollingTimeFrameInSeconds2 = ((SupportBanner) next).getPollingTimeFrameInSeconds();
                    int iIntValue = pollingTimeFrameInSeconds2 != null ? pollingTimeFrameInSeconds2.intValue() : 60;
                    do {
                        java.lang.Object next2 = it.next();
                        java.lang.Integer pollingTimeFrameInSeconds3 = ((SupportBanner) next2).getPollingTimeFrameInSeconds();
                        int iIntValue2 = pollingTimeFrameInSeconds3 != null ? pollingTimeFrameInSeconds3.intValue() : 60;
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            supportBanner = (SupportBanner) next;
        }
        if (supportBanner == null || (pollingTimeFrameInSeconds = supportBanner.getPollingTimeFrameInSeconds()) == null) {
            return 60;
        }
        return pollingTimeFrameInSeconds.intValue();
    }
}
