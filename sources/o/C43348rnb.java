package o;

import com.just.agentweb.DefaultWebClient;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.cor.CORDomain;
import com.okinc.network.okg.cor.CombinedExecutors;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43348rnb {
    public final ConcurrentHashMap<java.lang.String, CombinedExecutors> copydefault = new ConcurrentHashMap<>();
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CombinedExecutors combinedExecutors = this.copydefault.get(str);
        if (combinedExecutors == null) {
            return;
        }
        pUU.KWHzl("CORExecutors", "removeExecutors, site:" + str);
        combinedExecutors.getHttpExecutor().copydefault().setActive(false);
        combinedExecutors.getV5Executor().copydefault().setActive(false);
        combinedExecutors.getDexExecutor().copydefault().setActive(false);
        combinedExecutors.getHttpExecutor().gEmmrt();
        combinedExecutors.getV5Executor().gEmmrt();
        combinedExecutors.getDexExecutor().gEmmrt();
        this.copydefault.remove(str);
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.containsKey(str);
    }

    public final void copydefault() {
        java.util.Enumeration<java.lang.String> enumerationKeys = this.copydefault.keys();
        Intrinsics.checkNotNullExpressionValue(enumerationKeys, "");
        java.util.Iterator itAEQbTJ = yDX.AEQbTJ(enumerationKeys);
        while (itAEQbTJ.hasNext()) {
            java.lang.String str = (java.lang.String) itAEQbTJ.next();
            Intrinsics.copydefault((java.lang.Object) str);
            AEQbTJ(str);
        }
    }

    public final CombinedExecutors copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.get(str);
    }

    public final CombinedExecutors KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        pUU.KWHzl("CORExecutors", "createExecutors, for site:" + str);
        CombinedExecutors combinedExecutorsCopydefault = copydefault(str);
        if (combinedExecutorsCopydefault != null) {
            if (OLrzqt(combinedExecutorsCopydefault, str2, str3, str4)) {
                pUU.KWHzl("CORExecutors", "createExecutors, return exist one for site:" + str);
                return combinedExecutorsCopydefault;
            }
            AEQbTJ(str);
        }
        CombinedExecutors combinedExecutors = new CombinedExecutors(str, KWHzl(new com.okinc.network.request.Uri(DefaultWebClient.HTTPS_SCHEME + str2), str), KWHzl(new com.okinc.network.request.Uri("wss://" + str3), str), KWHzl(new com.okinc.network.request.Uri("wss://" + str4), str));
        this.copydefault.put(str, combinedExecutors);
        return combinedExecutors;
    }

    public final boolean OLrzqt(CombinedExecutors combinedExecutors, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return Intrinsics.EZpvd((java.lang.Object) combinedExecutors.getHttpExecutor().copydefault().getQueryHost(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) combinedExecutors.getV5Executor().copydefault().getQueryHost(), (java.lang.Object) str2) && Intrinsics.EZpvd((java.lang.Object) combinedExecutors.getDexExecutor().copydefault().getQueryHost(), (java.lang.Object) str3);
    }

    public final C43326rnF KWHzl(com.okinc.network.request.Uri uri, java.lang.String str) {
        ReentrantLock reentrantLock = new ReentrantLock();
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        OKDohConfig oKDohConfig = new OKDohConfig(uri, str);
        Intrinsics.copydefault(conditionNewCondition);
        return new C43326rnF(oKDohConfig, reentrantLock, conditionNewCondition, null, 8, null);
    }

    public final void AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Map.Entry<java.lang.String, CombinedExecutors> entry : this.copydefault.entrySet()) {
            java.lang.String key = entry.getKey();
            CombinedExecutors value = entry.getValue();
            arrayList.add(C56424yEw.gEmmrt(C56390yDp.OLrzqt("cor_user_site", key), C56390yDp.OLrzqt("cor_http_host", value.getHttpExecutor().copydefault().getQueryHost()), C56390yDp.OLrzqt("cor_v5_host", value.getV5Executor().copydefault().getQueryHost()), C56390yDp.OLrzqt("cor_dex_site", value.getDexExecutor().copydefault().getQueryHost())));
        }
        pUU.KWHzl("CORExecutors", "saveToCache, result:" + SPUtils.commit("cor_info", arrayList) + ", list:" + arrayList);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CORDomain cORDomainOLrzqt = OLrzqt(str);
        pUU.KWHzl("CORExecutors", "restoreFromCache, start. domains:" + cORDomainOLrzqt);
        if (cORDomainOLrzqt == null) {
            return;
        }
        KWHzl(cORDomainOLrzqt.getUserSite(), cORDomainOLrzqt.getHttpDomain(), cORDomainOLrzqt.getV5Domain(), cORDomainOLrzqt.getDexDomain());
    }

    public final CORDomain OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = SPUtils.getArrayList("cor_info", java.util.Map.class);
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map map = (java.util.Map) it.next();
                Intrinsics.copydefault(map);
                java.lang.String str2 = (java.lang.String) map.get("cor_user_site");
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str)) {
                    java.lang.Object obj = map.get("cor_http_host");
                    if (obj == null || !(obj instanceof java.lang.String) || !C33129mqd.OLrzqt((java.lang.CharSequence) obj)) {
                        obj = null;
                    }
                    java.lang.String str3 = (java.lang.String) obj;
                    java.lang.Object obj2 = map.get("cor_v5_host");
                    if (obj2 == null || !(obj2 instanceof java.lang.String) || !C33129mqd.OLrzqt((java.lang.CharSequence) obj2)) {
                        obj2 = null;
                    }
                    java.lang.String str4 = (java.lang.String) obj2;
                    java.lang.Object obj3 = map.get("cor_dex_site");
                    if (obj3 == null || !(obj3 instanceof java.lang.String) || !C33129mqd.OLrzqt((java.lang.CharSequence) obj3)) {
                        obj3 = null;
                    }
                    java.lang.String str5 = (java.lang.String) obj3;
                    pUU.KWHzl("CORExecutors", "getCacheFromFile, userSite:" + str2 + ", httpDomain:" + str3 + ", v5Domain:" + str4 + ", dexDomain:" + str5);
                    if (str3 == null || str4 == null || str5 == null) {
                        pUU.valueOf("CORExecutors", "getCacheFromFile, not allowed null domain for cor.");
                    } else {
                        return new CORDomain(str, str3, str4, str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void startTimer$default(C43348rnb c43348rnb, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        c43348rnb.KWHzl(j);
    }

    public final java.util.Collection<java.lang.String> EZpvd() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<Map.Entry<java.lang.String, CombinedExecutors>> it = this.copydefault.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().getHttpExecutor().copydefault().getQueryHost());
        }
        return arrayList;
    }

    public final java.util.Collection<java.lang.String> OLrzqt() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<Map.Entry<java.lang.String, CombinedExecutors>> it = this.copydefault.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.String cORUserSite = it.next().getValue().getHttpExecutor().copydefault().getCORUserSite();
            if (cORUserSite != null) {
                arrayList.add(cORUserSite);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.rnb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rnb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void KWHzl(long j) {
        java.util.Iterator<Map.Entry<java.lang.String, CombinedExecutors>> it = this.copydefault.entrySet().iterator();
        while (it.hasNext()) {
            CombinedExecutors value = it.next().getValue();
            value.getHttpExecutor().KWHzl(j);
            value.getV5Executor().KWHzl(j);
            value.getDexExecutor().KWHzl(j);
        }
    }

    public final void KWHzl() {
        java.util.Iterator<Map.Entry<java.lang.String, CombinedExecutors>> it = this.copydefault.entrySet().iterator();
        while (it.hasNext()) {
            CombinedExecutors value = it.next().getValue();
            value.getHttpExecutor().gEmmrt();
            value.getV5Executor().gEmmrt();
            value.getDexExecutor().gEmmrt();
        }
    }
}
