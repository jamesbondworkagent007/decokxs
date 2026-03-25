package o;

import com.okinc.business.defi.common.HomeTabType;
import com.okinc.business.defi.common.HomeTabTypeBean;
import kotlin.NoWhenBranchMatchedException;
import o.C13754dXa;

/* JADX INFO: renamed from: o.dep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14088dep {
    public static final int KWHzl;
    public static final java.util.Map<HomeTabType, HomeTabTypeBean> OLrzqt;
    public static final C14088dep copydefault = new C14088dep();

    /* JADX INFO: renamed from: o.dep$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HomeTabType.values().length];
            try {
                iArr[HomeTabType.TYPE_WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HomeTabType.TYPE_APPROVE_MANAGER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeTabType.TYPE_DAPP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeTabType.TYPE_DEX_STRATEGY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeTabType.TYPE_DEX_ORDERS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeTabType.TYPE_DEFI.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeTabType.TYPE_NFT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            OLrzqt = iArr;
        }
    }

    private C14088dep() {
    }

    static {
        HomeTabType homeTabType = HomeTabType.TYPE_WALLET;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(homeTabType, new HomeTabTypeBean(1L, homeTabType, C13754dXa.FragmentManager.GiPPlLRPuVlr));
        HomeTabType homeTabType2 = HomeTabType.TYPE_APPROVE_MANAGER;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(homeTabType2, new HomeTabTypeBean(2L, homeTabType2, C13754dXa.FragmentManager.GiPPlLQAswws));
        HomeTabType homeTabType3 = HomeTabType.TYPE_DEX_STRATEGY;
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(homeTabType3, new HomeTabTypeBean(3L, homeTabType3, C13754dXa.FragmentManager.ComponentActivityReportFullyDrawnExecutorApi16Impl));
        HomeTabType homeTabType4 = HomeTabType.TYPE_DEX_ORDERS;
        kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt(homeTabType4, new HomeTabTypeBean(4L, homeTabType4, C13754dXa.FragmentManager.execute));
        HomeTabType homeTabType5 = HomeTabType.TYPE_DEFI;
        kotlin.Pair pairOLrzqt5 = C56390yDp.OLrzqt(homeTabType5, new HomeTabTypeBean(5L, homeTabType5, C13754dXa.FragmentManager.zvzmfz));
        HomeTabType homeTabType6 = HomeTabType.TYPE_NFT;
        kotlin.Pair pairOLrzqt6 = C56390yDp.OLrzqt(homeTabType6, new HomeTabTypeBean(6L, homeTabType6, C13754dXa.FragmentManager.onReceive));
        HomeTabType homeTabType7 = HomeTabType.TYPE_DAPP;
        OLrzqt = C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, pairOLrzqt4, pairOLrzqt5, pairOLrzqt6, C56390yDp.OLrzqt(homeTabType7, new HomeTabTypeBean(7L, homeTabType7, C13754dXa.FragmentManager.AppCompatCallback)));
        KWHzl = 8;
    }

    public static /* synthetic */ java.util.List getTabTypeBeanWithFilter$default(C14088dep c14088dep, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = ((gKO) C43248rlh.KWHzl.AEQbTJ(gKO.class)).fARcdN();
        }
        return c14088dep.AEQbTJ(z, z2, z3, z4);
    }

    public final java.util.List<HomeTabTypeBean> AEQbTJ(boolean z, boolean z2, boolean z3, boolean z4) {
        java.util.ArrayList<HomeTabTypeBean> arrayList = new java.util.ArrayList<>();
        if (z) {
            AEQbTJ(HomeTabType.TYPE_WALLET, arrayList);
        } else if (z2) {
            AEQbTJ(HomeTabType.TYPE_WALLET, arrayList);
            if (z4) {
                AEQbTJ(HomeTabType.TYPE_DEX_STRATEGY, arrayList);
            }
            AEQbTJ(HomeTabType.TYPE_DEX_ORDERS, arrayList);
            AEQbTJ(HomeTabType.TYPE_DEFI, arrayList);
            if (z3) {
                AEQbTJ(HomeTabType.TYPE_APPROVE_MANAGER, arrayList);
            }
        } else {
            AEQbTJ(HomeTabType.TYPE_WALLET, arrayList);
            AEQbTJ(HomeTabType.TYPE_DEFI, arrayList);
            AEQbTJ(HomeTabType.TYPE_DAPP, arrayList);
            AEQbTJ(HomeTabType.TYPE_NFT, arrayList);
            AEQbTJ(HomeTabType.TYPE_APPROVE_MANAGER, arrayList);
        }
        return arrayList;
    }

    public final void AEQbTJ(HomeTabType homeTabType, java.util.ArrayList<HomeTabTypeBean> arrayList) {
        HomeTabTypeBean homeTabTypeBean = OLrzqt.get(homeTabType);
        if (homeTabTypeBean == null) {
            return;
        }
        switch (Activity.OLrzqt[homeTabType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                arrayList.add(homeTabTypeBean);
                return;
            case 4:
            case 5:
                if (C14687dqE.OLrzqt.djBIcL()) {
                    return;
                }
                arrayList.add(homeTabTypeBean);
                return;
            case 6:
                if (C14687dqE.OLrzqt.isConnected()) {
                    return;
                }
                arrayList.add(homeTabTypeBean);
                return;
            case 7:
                if (C14687dqE.OLrzqt.AkhnZx()) {
                    return;
                }
                arrayList.add(homeTabTypeBean);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
