package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.BannerInfoNew;
import com.okinc.business.defi.biz.net.bean.InfoListNew;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.dTK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fal, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18034fal {
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<BannerInfoNew> OLrzqt(@NotNull InfoListNew infoListNew, AbstractC12782ctV abstractC12782ctV) {
        java.lang.Integer maxClickNum;
        dTQ dtq;
        Intrinsics.checkNotNullParameter(infoListNew, "");
        if (abstractC12782ctV == null) {
            return infoListNew.getAllBannerList();
        }
        java.util.List<BannerInfoNew> allBannerList = infoListNew.getAllBannerList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allBannerList) {
            BannerInfoNew bannerInfoNew = (BannerInfoNew) obj;
            if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) bannerInfoNew.getUrl(), (java.lang.CharSequence) "wallet/teeAccount/statusPage", false, 2, (java.lang.Object) null) || ((dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class)) != null && dtq.copydefault())) {
                if (bannerInfoNew.getWalletType().contains(java.lang.Integer.valueOf(abstractC12782ctV.getNewProxyInstance())) && ((maxClickNum = bannerInfoNew.getMaxClickNum()) == null || !C33129mqd.AEQbTJ(maxClickNum, 0) || !C33129mqd.copydefault(java.lang.Integer.valueOf(C13919dbf.copydefault(bannerInfoNew)), bannerInfoNew.getMaxClickNum()))) {
                    java.lang.Integer supportMode = bannerInfoNew.getSupportMode();
                    if (supportMode != null && supportMode.intValue() == 1) {
                        if (C17922fXg.EZpvd(abstractC12782ctV) instanceof dTK.TaskDescription) {
                            if (abstractC12782ctV.getNewProxyInstance() != WalletType.HDWallet.ordinal() || abstractC12782ctV.getNewProxyInstance() == WalletType.TonWallet.ordinal() || abstractC12782ctV.getNewProxyInstance() == WalletType.MPCWallet.ordinal() || abstractC12782ctV.getNewProxyInstance() == WalletType.AAWallet.ordinal()) {
                                if (bannerInfoNew.isBackup() != 1) {
                                    if (abstractC12782ctV.zLjUOn()) {
                                    }
                                } else if (bannerInfoNew.isBackup() == 0) {
                                }
                            }
                            arrayList.add(obj);
                        }
                    } else {
                        java.lang.Integer supportMode2 = bannerInfoNew.getSupportMode();
                        if (supportMode2 == null || supportMode2.intValue() != 0 || (C17922fXg.EZpvd(abstractC12782ctV) instanceof dTK.Fragment)) {
                            if (abstractC12782ctV.getNewProxyInstance() != WalletType.HDWallet.ordinal()) {
                                if (bannerInfoNew.isBackup() != 1) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, infoListNew.getMaxShowBannerNum());
    }
}
