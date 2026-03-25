package o;

import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
import com.okinc.business.defi.biz.database.wallet.entity.DAppHistoryType;
import com.okinc.business.defi.biz.database.wallet.entity.DAppSearchHistoryEntity;
import com.okinc.dapp.bean.DappSearchResultBean;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cPD {
    public cJS KWHzl;

    public cPD(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.KWHzl = WalletDatabase.Companion.OLrzqt(application).dNCPSb();
    }

    public final AbstractC58260yxt<java.util.List<DappSearchResultBean>> AEQbTJ() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.isConnected(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List isConnected(cPD cpd) {
        return cpd.EZpvd(cpd.KWHzl.AEQbTJ());
    }

    public final AbstractC58260yxt<java.lang.Long> copydefault(@NotNull final DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.copydefault(this.KWHzl, dappSearchResultBean);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long copydefault(cPD cpd, DappSearchResultBean dappSearchResultBean) {
        return java.lang.Long.valueOf(cpd.KWHzl.copydefault(toEntity$default(cpd, dappSearchResultBean, null, 1, null)));
    }

    public final AbstractC58260yxt<DappSearchResultBean> EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<DappSearchResultBean> abstractC58260yxtOLrzqt = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.OLrzqt(this.copydefault, str);
            }
        }).KWHzl(cUD.KWHzl.OLrzqt()).OLrzqt(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final DappSearchResultBean OLrzqt(cPD cpd, java.lang.String str) {
        DAppSearchHistoryEntity dAppSearchHistoryEntityEZpvd = cpd.KWHzl.EZpvd(str);
        if (dAppSearchHistoryEntityEZpvd != null) {
            return cpd.EZpvd(dAppSearchHistoryEntityEZpvd);
        }
        return null;
    }

    public final AbstractC58260yxt<java.lang.Integer> EZpvd() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.valueOf(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer valueOf(cPD cpd) {
        return java.lang.Integer.valueOf(cpd.KWHzl.KWHzl());
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull final DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.djBIcL(this.EZpvd, dappSearchResultBean);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer djBIcL(cPD cpd, DappSearchResultBean dappSearchResultBean) {
        return java.lang.Integer.valueOf(cpd.KWHzl.AEQbTJ(toEntity$default(cpd, dappSearchResultBean, null, 1, null)));
    }

    public final AbstractC58260yxt<java.lang.Integer> copydefault() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.AYXKKw(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer AYXKKw(cPD cpd) {
        return java.lang.Integer.valueOf(cpd.KWHzl.copydefault());
    }

    public final AbstractC58260yxt<java.lang.Integer> djBIcL() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.fetchVPNInfo(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer fetchVPNInfo(cPD cpd) {
        return java.lang.Integer.valueOf(cpd.KWHzl.gEmmrt());
    }

    public final AbstractC58260yxt<java.lang.Boolean> OLrzqt(@NotNull final java.util.List<DappSearchResultBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.KWHzl(list, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public final AbstractC58260yxt<java.util.List<DappSearchResultBean>> KWHzl() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.AkhnZx(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List AkhnZx(cPD cpd) {
        return cpd.EZpvd(cpd.KWHzl.OLrzqt());
    }

    public final AbstractC58260yxt<java.lang.Long> AEQbTJ(@NotNull final DappSearchResultBean dappSearchResultBean) {
        Intrinsics.checkNotNullParameter(dappSearchResultBean, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.OLrzqt(this.KWHzl, dappSearchResultBean);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long OLrzqt(cPD cpd, DappSearchResultBean dappSearchResultBean) {
        DAppSearchHistoryEntity dAppSearchHistoryEntityAEQbTJ = cpd.AEQbTJ(dappSearchResultBean, DAppHistoryType.RECENT_BROWSE);
        dAppSearchHistoryEntityAEQbTJ.setTimestamp(java.lang.System.currentTimeMillis());
        return java.lang.Long.valueOf(cpd.KWHzl.OLrzqt(dAppSearchHistoryEntityAEQbTJ));
    }

    public final AbstractC58260yxt<java.lang.Integer> gEmmrt() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.values(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer values(cPD cpd) {
        return java.lang.Integer.valueOf(cpd.KWHzl.valueOf());
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.djBIcL(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer djBIcL(cPD cpd) {
        return java.lang.Integer.valueOf(cpd.KWHzl.EZpvd());
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cPD.copydefault(this.copydefault, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer copydefault(cPD cpd, java.lang.String str) {
        return java.lang.Integer.valueOf(cpd.KWHzl.AEQbTJ(str));
    }

    public static /* synthetic */ DAppSearchHistoryEntity toEntity$default(cPD cpd, DappSearchResultBean dappSearchResultBean, DAppHistoryType dAppHistoryType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dAppHistoryType = DAppHistoryType.SEARCH_HISTORY;
        }
        return cpd.AEQbTJ(dappSearchResultBean, dAppHistoryType);
    }

    public final DAppSearchHistoryEntity AEQbTJ(DappSearchResultBean dappSearchResultBean, DAppHistoryType dAppHistoryType) {
        return new DAppSearchHistoryEntity(dappSearchResultBean.getBalance(), dappSearchResultBean.getCategory(), dappSearchResultBean.getDeepLink(), dappSearchResultBean.getId(), dappSearchResultBean.getLogo(), dappSearchResultBean.getUser(), dappSearchResultBean.getVolume(), dappSearchResultBean.getName(), dappSearchResultBean.getShortDescribe(), dappSearchResultBean.getTimestamp(), dAppHistoryType.getValue());
    }

    public final DappSearchResultBean EZpvd(DAppSearchHistoryEntity dAppSearchHistoryEntity) {
        return new DappSearchResultBean(dAppSearchHistoryEntity.getBalance(), dAppSearchHistoryEntity.getCategory(), dAppSearchHistoryEntity.getDeepLink(), dAppSearchHistoryEntity.getId(), dAppSearchHistoryEntity.getLogo(), dAppSearchHistoryEntity.getUser(), dAppSearchHistoryEntity.getVolume(), dAppSearchHistoryEntity.getName(), dAppSearchHistoryEntity.getShortDescribe(), false, new java.util.ArrayList(), dAppSearchHistoryEntity.getTimestamp());
    }

    public final java.util.List<DappSearchResultBean> EZpvd(java.util.List<DAppSearchHistoryEntity> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((DAppSearchHistoryEntity) it.next()));
        }
        return arrayList;
    }

    public static final java.lang.Boolean KWHzl(java.util.List list, cPD cpd) {
        boolean z;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        try {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            it = list.iterator();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DAppRepository", "Error replacing search history", e);
            z = false;
        }
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(toEntity$default(cpd, (DappSearchResultBean) it.next(), null, 1, null));
            return java.lang.Boolean.valueOf(z);
        }
        cpd.KWHzl.OLrzqt(arrayList);
        return java.lang.Boolean.valueOf(z);
    }
}
