package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.dapp.base.FragmentNavigator;
import com.okinc.business.defi.dapp.impl.OKWalletDiscoverExtensionImpl$isFeatureAvailable$1;
import com.okinc.business.defi.dapp.impl.OKWalletDiscoverExtensionImpl$isFeatureAvailable$2;
import com.okinc.business.defi.dapp.impl.OKWalletDiscoverExtensionImpl$isFeatureAvailable$3;
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.dapp.bean.FeedsParamBean;
import com.okinc.dapp.bean.KOLProfileParamsBean;
import com.okinc.dapp.bean.VibeFeedsParamsBean;
import com.okinc.mln.miniapp.AppJson;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import o.C14834dst;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15099dxt extends AbstractC43215rlA implements xWA {
    @Override // o.xWA
    public boolean KWHzl() {
        return true;
    }

    @Override // o.xWA
    public androidx.fragment.app.Fragment copydefault(@NotNull FeedsParamBean feedsParamBean) {
        Intrinsics.checkNotNullParameter(feedsParamBean, "");
        return C15026dwZ.Companion.KWHzl(feedsParamBean);
    }

    @Override // o.xWA
    public boolean EZpvd() {
        boolean zAEQbTJ = AEQbTJ();
        boolean zCopydefault = copydefault();
        pUU.EZpvd("OKWalletDiscover", "showDexTab showFeeds=" + zAEQbTJ + " supportedVersion=" + zCopydefault);
        return zAEQbTJ && zCopydefault;
    }

    @Override // o.xWA
    public void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull VibeFeedsParamsBean vibeFeedsParamsBean) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(vibeFeedsParamsBean, "");
        C14860dtS c14860dtSAEQbTJ = C14860dtS.Companion.AEQbTJ(vibeFeedsParamsBean);
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c14860dtSAEQbTJ.show(supportFragmentManager);
    }

    @Override // o.xWA
    public androidx.fragment.app.Fragment EZpvd(@NotNull KOLProfileParamsBean kOLProfileParamsBean) {
        Intrinsics.checkNotNullParameter(kOLProfileParamsBean, "");
        return C14856dtO.Companion.OLrzqt(kOLProfileParamsBean);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dyp.storeFragmentData$default(o.dyp, java.lang.String, androidx.fragment.app.FragmentManager, java.lang.Integer, androidx.fragment.app.Fragment, java.lang.String, int, java.lang.Object):void */
    @Override // o.xWA
    public AbstractC32996moC AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        java.lang.String strValueOf;
        boolean z;
        if (fragmentManager == null || num == null) {
            strValueOf = "";
            z = false;
        } else {
            strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            C15148dyp c15148dyp = C15148dyp.copydefault;
            if (!c15148dyp.AEQbTJ()) {
                C15148dyp.storeFragmentData$default(c15148dyp, strValueOf, fragmentManager, num, null, null, 24, null);
            }
            z = true;
        }
        return C14859dtR.Companion.AEQbTJ(strValueOf, z);
    }

    /* JADX INFO: renamed from: o.dxt$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((DappSearchResultBean) t2).getTimestamp()), java.lang.Long.valueOf(((DappSearchResultBean) t).getTimestamp()));
        }
    }

    @Override // o.xWA
    public androidx.fragment.app.Fragment EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        C15086dxg c15086dxgEZpvd = C15086dxg.Companion.EZpvd(strValueOf, true);
        C15148dyp c15148dyp = C15148dyp.copydefault;
        if (!c15148dyp.AEQbTJ()) {
            C15148dyp.storeFragmentData$default(c15148dyp, strValueOf, fragmentManager, java.lang.Integer.valueOf(i), null, null, 24, null);
        }
        return c15086dxgEZpvd;
    }

    @Override // o.xWA
    public void OLrzqt(@NotNull android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        openDappPageWithCategory$default(this, context, fragmentManager, num, -1, null, 16, null);
    }

    public static /* synthetic */ void openDappPageWithCategory$default(C15099dxt c15099dxt, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str = null;
        }
        c15099dxt.AEQbTJ(context, fragmentManager, num, i3, str);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, final androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        if (fragmentManager != null && num != null) {
            C15148dyp c15148dyp = C15148dyp.copydefault;
            if (!c15148dyp.AEQbTJ()) {
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                C15083dxd c15083dxdAEQbTJ = C15083dxd.Companion.AEQbTJ(strValueOf, i, str);
                C14834dst.Application application = C14834dst.Companion;
                C14834dst c14834dstOLrzqt = application.OLrzqt(c15083dxdAEQbTJ, new Function1() { // from class: o.dxA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15099dxt.copydefault(fragmentManager, (androidx.fragment.app.Fragment) obj);
                    }
                });
                FragmentNavigator.push$default(FragmentNavigator.Companion.EZpvd(fragmentManager, num), c14834dstOLrzqt, null, null, 6, null);
                C15148dyp.storeFragmentData$default(c15148dyp, strValueOf, null, java.lang.Integer.valueOf(application.AEQbTJ()), c14834dstOLrzqt, null, 16, null);
                return;
            }
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("appearance", "alternativeweb3");
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/dappHomeList", map);
    }

    public static final Unit copydefault(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentNavigator.StateListAnimator.from$default(FragmentNavigator.Companion, fragmentManager, null, 2, null).OLrzqt(fragment, new FragmentNavigator.Application(0, 0, 0, 0, false, true, null, null, false, false, 976, null));
        return Unit.INSTANCE;
    }

    @Override // o.xWA
    public void EZpvd(@NotNull android.content.Context context) {
        InterfaceC9773bbs interfaceC9773bbs;
        Intrinsics.checkNotNullParameter(context, "");
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
        if (listKWHzl == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null) {
            return;
        }
        interfaceC9773bbs.KWHzl(context, new android.os.Bundle());
    }

    @Override // o.xWA
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(dLX.Dialog.QwvEab)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [189=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.xWA
    public boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1309148525:
                return str.equals("explore");
            case 108988:
                if (str.equals("nft")) {
                    return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new OKWalletDiscoverExtensionImpl$isFeatureAvailable$3(null), 1, null)).booleanValue();
                }
                return false;
            case 3075901:
                if (str.equals("dapp")) {
                    return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new OKWalletDiscoverExtensionImpl$isFeatureAvailable$2(null), 1, null)).booleanValue();
                }
                return false;
            case 810663073:
                if (str.equals("dapp_home")) {
                    return ((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new OKWalletDiscoverExtensionImpl$isFeatureAvailable$1(null), 1, null)).booleanValue();
                }
                return false;
            default:
                return false;
        }
    }

    @Override // o.xWA
    public void OLrzqt(@NotNull java.lang.String str, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        java.util.HashMap map = new java.util.HashMap();
        map.put("appearance", "alternative");
        map.put("id", str);
        map.put("pageanim", "push");
        map.put("minversion", C48787ucK.AEQbTJ.copydefault("mlnConfig.boostActivityMinVersion", "6.148.0"));
        C43056riA.AEQbTJ.copydefault(context, "okluanftactivity", "/cedefiLaunchpoolDetail", map);
    }

    @Override // o.xWA
    public void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.HashMap map = new java.util.HashMap();
        map.put("appearance", "alternative");
        map.put("minversion", C48787ucK.AEQbTJ.copydefault("mlnConfig.boostDiscoverMinVersion", "6.148.0"));
        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/cedefiboost", map);
    }

    public final boolean AEQbTJ() {
        return C48787ucK.AEQbTJ.copydefault("dappFeedsConfig.showFeeds", false);
    }

    public final boolean copydefault() {
        AppJson appJsonKWHzl = C43047rhs.AEQbTJ.KWHzl("okluadiscover");
        return appJsonKWHzl != null && C33573myx.copydefault(appJsonKWHzl.getVersion(), C48787ucK.AEQbTJ.copydefault("dappFeedsConfig.dappversion", "6.106.0")) > 0;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.util.List list, final Function1 function1, java.util.List list2) {
        try {
            Intrinsics.copydefault(list2);
            java.util.List<DappSearchResultBean> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list2);
            int size = listFJNWhG.size() - 1;
            if (size >= 0) {
                long j = 1;
                while (true) {
                    int i = size - 1;
                    if (((DappSearchResultBean) listFJNWhG.get(size)).getTimestamp() == 0) {
                        DappSearchResultBean dappSearchResultBean = (DappSearchResultBean) listFJNWhG.get(size);
                        listFJNWhG.set(size, dappSearchResultBean.copy((2047 & 1) != 0 ? dappSearchResultBean.balance : null, (2047 & 2) != 0 ? dappSearchResultBean.category : 0, (2047 & 4) != 0 ? dappSearchResultBean.deepLink : null, (2047 & 8) != 0 ? dappSearchResultBean.id : null, (2047 & 16) != 0 ? dappSearchResultBean.logo : null, (2047 & 32) != 0 ? dappSearchResultBean.user : null, (2047 & 64) != 0 ? dappSearchResultBean.volume : null, (2047 & 128) != 0 ? dappSearchResultBean.name : null, (2047 & 256) != 0 ? dappSearchResultBean.shortDescribe : null, (2047 & 512) != 0 ? dappSearchResultBean.isFav : false, (2047 & 1024) != 0 ? dappSearchResultBean.chains : null, (2047 & 2048) != 0 ? dappSearchResultBean.timestamp : j));
                        j++;
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (DappSearchResultBean dappSearchResultBean2 : listFJNWhG) {
                linkedHashMap.put(dappSearchResultBean2.getDeepLink(), dappSearchResultBean2);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                DappSearchResultBean dappSearchResultBean3 = (DappSearchResultBean) it.next();
                linkedHashMap.put(dappSearchResultBean3.getDeepLink(), dappSearchResultBean3);
            }
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = ((xWH) C43251rlk.copydefault(xWH.class)).copydefault(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) CollectionsKt___CollectionsKt.EZpvd(linkedHashMap.values(), new TaskDescription()), 50));
            final Function1 function12 = new Function1() { // from class: o.dxr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15099dxt.AEQbTJ(function1, (java.lang.Boolean) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dxv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15099dxt.AhwBna(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.dxu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15099dxt.OLrzqt(function1, (java.lang.Throwable) obj);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dxw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C15099dxt.OLrzqt(function13, obj);
                }
            }));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKWalletDiscoverExtensionImpl", "Error processing search history", e);
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        pUU.AEQbTJ("OKWalletDiscoverExtensionImpl", "Error replacing search history", th);
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        pUU.AEQbTJ("OKWalletDiscoverExtensionImpl", "Error getting search history", th);
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    @Override // o.xWA
    public int OLrzqt() {
        return C15112dyF.AEQbTJ.djBIcL().size();
    }

    @Override // o.xWA
    public void KWHzl(@NotNull android.content.Context context, final androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        if (fragmentManager != null && num != null) {
            C15148dyp c15148dyp = C15148dyp.copydefault;
            if (!c15148dyp.AEQbTJ()) {
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                dBW dbwAEQbTJ = dBW.Companion.AEQbTJ(strValueOf, java.lang.Boolean.TRUE, "explore_tab");
                C14834dst.Application application = C14834dst.Companion;
                C14834dst c14834dstOLrzqt = application.OLrzqt(dbwAEQbTJ, new Function1() { // from class: o.dxz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15099dxt.OLrzqt(fragmentManager, (androidx.fragment.app.Fragment) obj);
                    }
                });
                FragmentNavigator.push$default(FragmentNavigator.Companion.EZpvd(fragmentManager, num), c14834dstOLrzqt, null, null, 6, null);
                C15148dyp.storeFragmentData$default(c15148dyp, strValueOf, null, java.lang.Integer.valueOf(application.AEQbTJ()), c14834dstOLrzqt, null, 16, null);
                return;
            }
        }
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt != null) {
            dBQ.Companion.KWHzl(activityOLrzqt, "explore_tab");
        }
    }

    public static final Unit OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentNavigator.StateListAnimator.from$default(FragmentNavigator.Companion, fragmentManager, null, 2, null).OLrzqt(fragment, new FragmentNavigator.Application(0, 0, 0, 0, false, true, null, null, false, false, 976, null));
        return Unit.INSTANCE;
    }

    @Override // o.xWA
    public void AEQbTJ(@NotNull java.util.List<DappSearchResultBean> list, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj2 : list) {
                java.lang.String deepLink = ((DappSearchResultBean) obj2).getDeepLink();
                java.lang.Object arrayList = linkedHashMap.get(deepLink);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(deepLink, arrayList);
                }
                ((java.util.List) arrayList).add(obj2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
            for (java.lang.Object obj3 : linkedHashMap.entrySet()) {
                java.lang.Object key = ((Map.Entry) obj3).getKey();
                java.util.Iterator it = ((java.lang.Iterable) ((Map.Entry) obj3).getValue()).iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        long timestamp = ((DappSearchResultBean) next).getTimestamp();
                        do {
                            java.lang.Object next2 = it.next();
                            long timestamp2 = ((DappSearchResultBean) next2).getTimestamp();
                            if (timestamp < timestamp2) {
                                next = next2;
                                timestamp = timestamp2;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                linkedHashMap2.put(key, (DappSearchResultBean) obj);
            }
            final java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(linkedHashMap2.values());
            AbstractC58260yxt<java.util.List<DappSearchResultBean>> abstractC58260yxtGHZMYf = C14923duc.EZpvd.gHZMYf();
            final Function1 function12 = new Function1() { // from class: o.dxy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj4) {
                    return C15099dxt.AEQbTJ(listQfsBiF, function1, (java.util.List) obj4);
                }
            };
            InterfaceC58227yxM<? super java.util.List<DappSearchResultBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dxx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj4) {
                    C15099dxt.valueOf(function12, obj4);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.dxD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj4) {
                    return C15099dxt.AEQbTJ(function1, (java.lang.Throwable) obj4);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtGHZMYf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dxB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj4) {
                    C15099dxt.AYXKKw(function13, obj4);
                }
            }));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKWalletDiscoverExtensionImpl", "Error in updateDAppSearchHistoryTimestamp", e);
            function1.invoke(java.lang.Boolean.FALSE);
        }
    }
}
