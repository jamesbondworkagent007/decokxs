package o;

import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.EscapeCoinMetaBean;
import com.okinc.business.defi.biz.net.bean.FactionInfo;
import com.okinc.network.okg.response.ResponseData;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.byA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10948byA implements InterfaceC9733bbE {
    public final C13934dbu AEQbTJ;
    public volatile StateListAnimator OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10948byA() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator fJNWhG() {
        return this.OLrzqt;
    }

    public C10948byA(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.AEQbTJ = c13934dbu;
        this.copydefault = "CoinMetaManager";
        this.OLrzqt = new StateListAnimator(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:36) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r1v0 o.dbu))
 A[MD:(o.dbu):void (m)] (LINE:35) call: o.byA.<init>(o.dbu):void type: THIS */
    public /* synthetic */ C10948byA(C13934dbu c13934dbu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C13934dbu() : c13934dbu);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull StateListAnimator stateListAnimator, @NotNull WalletUpdateWorker walletUpdateWorker) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(walletUpdateWorker, "");
        boolean z = (this.OLrzqt.copydefault().size() == 0 || this.OLrzqt.copydefault().size() == stateListAnimator.copydefault().size()) ? false : true;
        this.OLrzqt = stateListAnimator;
        if (z) {
            walletUpdateWorker.gEmmrt();
        }
        C10856bwO.copydefault(this.copydefault, 0, "setupData: from:" + str + " " + stateListAnimator.AkhnZx().size() + "-" + stateListAnimator.gEmmrt().size() + "-" + stateListAnimator.values().size() + "-" + stateListAnimator.fetchVPNInfo().size());
    }

    public final void AuCTelauCTel() {
        this.OLrzqt = new StateListAnimator(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final java.util.ArrayList<C10854bwM> AYXKKw() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10854bwM c10854bwM : valueOf()) {
            if (c10854bwM.giSNqX()) {
                linkedHashSet.addAll(AEQbTJ(c10854bwM.fJNWhG()));
            } else {
                linkedHashSet.add(c10854bwM);
            }
        }
        return new java.util.ArrayList<>(linkedHashSet);
    }

    public final java.util.ArrayList<C10854bwM> fIwbmz() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.ArrayList<C10854bwM> arrayListAYXKKw = AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAYXKKw) {
            C10854bwM c10854bwMKWHzl = ((C10854bwM) obj).KWHzl();
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.hrNTAI()) {
                arrayList.add(obj);
            }
        }
        linkedHashSet.addAll(arrayList);
        return new java.util.ArrayList<>(linkedHashSet);
    }

    public final java.util.ArrayList<C10854bwM> fARcdN() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.ArrayList<C10854bwM> newProxyInstance = getNewProxyInstance();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : newProxyInstance) {
            C10854bwM c10854bwMKWHzl = ((C10854bwM) obj).KWHzl();
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.hrNTAI()) {
                arrayList.add(obj);
            }
        }
        linkedHashSet.addAll(arrayList);
        return new java.util.ArrayList<>(linkedHashSet);
    }

    public final java.util.ArrayList<C10854bwM> getNewProxyInstance() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        java.util.List<C10854bwM> listValueOf = valueOf();
        java.util.ArrayList<C10854bwM> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listValueOf) {
            C10854bwM c10854bwMKWHzl = ((C10854bwM) obj).KWHzl();
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.getFieldNames()) {
                arrayList.add(obj);
            }
        }
        for (C10854bwM c10854bwM : arrayList) {
            if (c10854bwM.giSNqX()) {
                java.util.List<C10854bwM> listAEQbTJ = AEQbTJ(c10854bwM.fJNWhG());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listAEQbTJ) {
                    C10854bwM c10854bwMKWHzl2 = ((C10854bwM) obj2).KWHzl();
                    if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.getFieldNames()) {
                        arrayList2.add(obj2);
                    }
                }
                linkedHashSet.addAll(arrayList2);
            } else {
                linkedHashSet.add(c10854bwM);
            }
        }
        return new java.util.ArrayList<>(linkedHashSet);
    }

    public final java.util.List<C10854bwM> AEQbTJ(@NotNull Function1<? super java.lang.Long, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList<C10854bwM> arrayListAYXKKw = AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAYXKKw) {
            if (function1.invoke(java.lang.Long.valueOf(((C10854bwM) obj).AEQbTJ())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
    }

    public final java.util.List<C10854bwM> EZpvd(@NotNull Function1<? super java.lang.Long, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList<C10854bwM> newProxyInstance = getNewProxyInstance();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : newProxyInstance) {
            if (function1.invoke(java.lang.Long.valueOf(((C10854bwM) obj).AEQbTJ())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
    }

    public final java.util.List<C10854bwM> valueOf(long j) {
        java.lang.Object next;
        C10854bwM c10854bwMKWHzl;
        java.util.ArrayList<C10854bwM> arrayListAYXKKw = AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAYXKKw) {
            C10854bwM c10854bwM = (C10854bwM) obj;
            C10854bwM c10854bwMKWHzl2 = KWHzl(j);
            C10854bwM c10854bwMKWHzl3 = KWHzl(c10854bwM.AEQbTJ());
            if ((c10854bwMKWHzl2 != null && c10854bwMKWHzl2.RdAHlO() && c10854bwMKWHzl3 != null && c10854bwMKWHzl3.RdAHlO() && c10854bwMKWHzl2.QOLQEE() == c10854bwMKWHzl3.QOLQEE()) || c10854bwM.AEQbTJ() == j) {
                arrayList.add(obj);
            }
        }
        java.util.List<C10854bwM> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        java.util.Iterator<T> it = listFJNWhG.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10854bwM) next).AhwBna() == j) {
                break;
            }
        }
        if (next == null && (c10854bwMKWHzl = KWHzl(java.lang.Long.valueOf(j))) != null) {
            listFJNWhG.add(c10854bwMKWHzl);
        }
        return listFJNWhG;
    }

    public final java.util.List<C10854bwM> AYXKKw(long j) {
        java.util.ArrayList<C10854bwM> newProxyInstance = getNewProxyInstance();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : newProxyInstance) {
            C10854bwM c10854bwM = (C10854bwM) obj;
            C10854bwM c10854bwMKWHzl = KWHzl(j);
            C10854bwM c10854bwMKWHzl2 = KWHzl(c10854bwM.AEQbTJ());
            if ((c10854bwMKWHzl != null && c10854bwMKWHzl.ejfBZ() && c10854bwMKWHzl2 != null && c10854bwMKWHzl2.ejfBZ()) || c10854bwM.AEQbTJ() == j) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
    }

    public final java.util.List<C10854bwM> OLrzqt(@NotNull java.util.List<EscapeCoinMetaBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            EscapeCoinMetaBean escapeCoinMetaBean = (EscapeCoinMetaBean) obj;
            java.lang.Long chainId = escapeCoinMetaBean.getChainId();
            long jLongValue = chainId != null ? chainId.longValue() : -1L;
            FactionInfo factionInfo = escapeCoinMetaBean.getFactionInfo();
            java.lang.String imageUrl = escapeCoinMetaBean.getImageUrl();
            java.lang.String str = imageUrl == null ? "" : imageUrl;
            java.lang.String chainName = escapeCoinMetaBean.getChainName();
            arrayList.add(new C10854bwM(new CoinMetaBean(0L, 0L, jLongValue, 0L, (java.lang.String) null, chainName == null ? "" : chainName, (java.lang.String) null, str, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, escapeCoinMetaBean.getCoinType(), (java.lang.String) null, false, false, java.lang.Integer.valueOf(escapeCoinMetaBean.getRank()), false, 0, 0, 0, false, false, (java.lang.String) null, factionInfo, (java.lang.Boolean) null, 0, 0, false, (java.lang.Boolean) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.Integer) null, 0, (java.lang.Integer) null, (java.lang.Integer) null, false, 6, false, (java.lang.String) null, -33693861, 575, (DefaultConstructorMarker) null)));
            i++;
        }
        return arrayList;
    }

    public final java.util.List<C10854bwM> values() {
        return this.OLrzqt.AhwBna();
    }

    public final java.util.List<C10854bwM> valueOf() {
        return this.OLrzqt.djBIcL();
    }

    public java.util.List<C10854bwM> djBIcL() {
        return this.OLrzqt.copydefault();
    }

    public java.util.List<C10854bwM> AkhnZx() {
        return this.OLrzqt.AYXKKw();
    }

    public java.util.List<C10854bwM> DbNXlk() {
        java.util.ArrayList<C10854bwM> arrayList = this.OLrzqt.valueOf().get(1);
        return arrayList != null ? arrayList : yDY.AhwBna();
    }

    public final java.util.Map<java.lang.String, java.util.List<C10854bwM>> KWHzl() {
        return this.OLrzqt.AEQbTJ();
    }

    public final java.util.List<C10854bwM> OLrzqt() {
        return this.OLrzqt.OLrzqt();
    }

    public final java.util.List<C10854bwM> fetchVPNInfo() {
        return this.OLrzqt.DbNXlk();
    }

    public C10854bwM KWHzl(java.lang.Long l) {
        if (l == null) {
            return null;
        }
        return this.OLrzqt.KWHzl().get(l);
    }

    public C10854bwM EZpvd(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.OLrzqt.copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C10854bwM c10854bwM = (C10854bwM) next;
            if (C59449zhJ.gEmmrt(c10854bwM.values(), str, true) || C59449zhJ.gEmmrt(c10854bwM.djBIcL(), str, true)) {
                break;
            }
        }
        return (C10854bwM) next;
    }

    public final C10854bwM KWHzl(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.OLrzqt.copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C10854bwM c10854bwM = (C10854bwM) next;
            if (C59449zhJ.gEmmrt(c10854bwM.values(), str, true) || C59449zhJ.gEmmrt(c10854bwM.AwvSrB(), str, true) || C59449zhJ.gEmmrt(c10854bwM.djBIcL(), str, true) || C59449zhJ.gEmmrt(c10854bwM.sSMYrx(), str, true)) {
                break;
            }
        }
        return (C10854bwM) next;
    }

    public C10854bwM KWHzl(long j) {
        return KWHzl(EZpvd(j));
    }

    public final java.util.List<C10854bwM> OLrzqt(int i) {
        java.util.ArrayList<C10854bwM> arrayList = this.OLrzqt.valueOf().get(java.lang.Integer.valueOf(i));
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final java.util.List<C10854bwM> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<C10854bwM> arrayListAhwBna = this.OLrzqt.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAhwBna) {
            C10854bwM c10854bwM = (C10854bwM) obj;
            if (!C59449zhJ.gEmmrt(c10854bwM.values(), str, true) && !C59449zhJ.gEmmrt(c10854bwM.AwvSrB(), str, true) && !C59449zhJ.gEmmrt(c10854bwM.djBIcL(), str, true) && !C59449zhJ.gEmmrt(c10854bwM.sSMYrx(), str, true)) {
                C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
                if (!C59449zhJ.gEmmrt(c10854bwMKWHzl != null ? c10854bwMKWHzl.values() : null, str, true)) {
                    C10854bwM c10854bwMKWHzl2 = c10854bwM.KWHzl();
                    if (!C59449zhJ.gEmmrt(c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.AwvSrB() : null, str, true)) {
                        C10854bwM c10854bwMKWHzl3 = c10854bwM.KWHzl();
                        if (C59449zhJ.gEmmrt(c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.fJNWhG() : null, str, true)) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((C10854bwM) obj2).AuCTel()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final java.util.List<C10854bwM> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<C10854bwM> arrayListAhwBna = this.OLrzqt.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAhwBna) {
            if (C59449zhJ.gEmmrt(((C10854bwM) obj).OLrzqt(), str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final C10854bwM AhwBna() {
        return copydefault(194L);
    }

    public C10854bwM isConnected() {
        return copydefault(1L);
    }

    public C10854bwM uzCIH() {
        return copydefault(66L);
    }

    public C10854bwM iwGUEr() {
        return copydefault(195L);
    }

    public C10854bwM hDKMBd() {
        return copydefault(501L);
    }

    public C10854bwM EZpvd() {
        return copydefault(56L);
    }

    public C10854bwM copydefault() {
        return copydefault(0L);
    }

    public final C10854bwM ejfBZ() {
        return copydefault(2L);
    }

    public C10854bwM AEQbTJ() {
        return copydefault(637L);
    }

    public final C10854bwM AuCTel() {
        return copydefault(397L);
    }

    public final C10854bwM getFieldNames() {
        return copydefault(1237L);
    }

    public final C10854bwM gEmmrt() {
        return copydefault(145L);
    }

    public final boolean AhwBna(long j) {
        return this.OLrzqt.KWHzl().get(java.lang.Long.valueOf(j)) != null;
    }

    public final java.util.List<C10854bwM> djBIcL(long j) {
        java.util.ArrayList<C10854bwM> arrayListAhwBna = this.OLrzqt.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAhwBna) {
            if (((C10854bwM) obj).EZpvd() == j) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.List<C10854bwM> copydefault(java.util.List<java.lang.Long> list) {
        java.util.ArrayList<C10854bwM> arrayListAhwBna = this.OLrzqt.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAhwBna) {
            C10854bwM c10854bwM = (C10854bwM) obj;
            if (list != null && C33129mqd.KWHzl((java.util.Collection) list) && (list.contains(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo())) || list.contains(java.lang.Long.valueOf(c10854bwM.QKVWgx())))) {
                if (!c10854bwM.DarRvM()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public C10854bwM AYXKKw(@NotNull java.lang.String str) {
        java.lang.Object next;
        boolean zGEmmrt;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.OLrzqt.AhwBna().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C10854bwM c10854bwM = (C10854bwM) next;
            C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.fIwbmz()) {
                zGEmmrt = C59449zhJ.gEmmrt(c10854bwM.OLrzqt(), str, false);
            } else {
                zGEmmrt = C59449zhJ.gEmmrt(c10854bwM.OLrzqt(), str, true);
            }
            if (zGEmmrt) {
                break;
            }
        }
        return (C10854bwM) next;
    }

    public C10854bwM EZpvd(@NotNull java.lang.String str, long j) {
        java.lang.Object next;
        boolean zGEmmrt;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.OLrzqt.AhwBna().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C10854bwM c10854bwM = (C10854bwM) next;
            C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.fIwbmz()) {
                zGEmmrt = C59449zhJ.gEmmrt(c10854bwM.OLrzqt(), str, false);
            } else {
                zGEmmrt = C59449zhJ.gEmmrt(c10854bwM.OLrzqt(), str, true);
            }
            if (zGEmmrt && c10854bwM.fetchVPNInfo() == j) {
                break;
            }
        }
        return (C10854bwM) next;
    }

    public final java.lang.Long EZpvd(long j) {
        C10854bwM c10854bwMKWHzl = KWHzl(java.lang.Long.valueOf(j));
        if (c10854bwMKWHzl != null) {
            return java.lang.Long.valueOf(c10854bwMKWHzl.AEQbTJ());
        }
        return null;
    }

    public final java.util.List<C10854bwM> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<C10854bwM> arrayList = this.OLrzqt.AEQbTJ().get(str);
        return arrayList != null ? arrayList : yDY.AhwBna();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(J)Lo/bbC; */
    @Override // o.InterfaceC9733bbE
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C10854bwM copydefault(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.OLrzqt.copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10854bwM) next).fetchVPNInfo() == j) {
                break;
            }
        }
        return (C10854bwM) next;
    }

    public C10854bwM AEQbTJ(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.OLrzqt.AYXKKw().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10854bwM) next).isConnected() == j) {
                break;
            }
        }
        return (C10854bwM) next;
    }

    public final C10854bwM KWHzl(int i) {
        return this.OLrzqt.EZpvd().get(java.lang.Integer.valueOf(i));
    }

    public InterfaceC9731bbC KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<C10854bwM> arrayListAhwBna = this.OLrzqt.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAhwBna) {
            if (((C10854bwM) obj).fetchVPNInfo() == 0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C10854bwM c10854bwM = (C10854bwM) next;
            if (c10854bwM.DAIeex()) {
                if (C59449zhJ.gEmmrt(C14079deg.EZpvd.AEQbTJ(c10854bwM), str2, true) && C33129mqd.OLrzqt((java.lang.CharSequence) str2) && C59449zhJ.gEmmrt(c10854bwM.fJNWhG(), str, true)) {
                    break;
                }
            } else if (C59449zhJ.gEmmrt(c10854bwM.fJNWhG(), str, true)) {
                break;
            }
        }
        return (InterfaceC9731bbC) next;
    }

    public final AbstractC58185ywX<ResponseData<CoinInfoBean>> gEmmrt(long j) {
        return this.AEQbTJ.OLrzqt(j);
    }

    /* JADX INFO: renamed from: o.byA$StateListAnimator */
    public static final class StateListAnimator {
        public final java.util.ArrayList<C10854bwM> AEQbTJ;
        public final java.util.ArrayList<C10854bwM> AYXKKw;
        public final java.util.HashMap<java.lang.Integer, java.util.ArrayList<C10854bwM>> AhwBna;
        public final java.util.ArrayList<C10854bwM> AkhnZx;
        public final java.util.ArrayList<C10854bwM> DbNXlk;
        public final java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> EZpvd;
        public final java.util.ArrayList<C10854bwM> KWHzl;
        public final java.util.HashMap<java.lang.Long, C10854bwM> OLrzqt;
        public final java.util.HashMap<java.lang.Integer, C10854bwM> copydefault;
        public final java.util.ArrayList<C10854bwM> djBIcL;
        public final java.util.ArrayList<C10854bwM> gEmmrt;
        public final java.util.ArrayList<C10854bwM> isConnected;
        public final java.util.ArrayList<C10854bwM> valueOf;
        public final java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.HashMap<java.lang.Integer, C10854bwM> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.HashMap<java.lang.Long, C10854bwM> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.util.HashMap<java.lang.Long, C10854bwM> map, @NotNull java.util.ArrayList<C10854bwM> arrayList, @NotNull java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> map2, @NotNull java.util.ArrayList<C10854bwM> arrayList2, @NotNull java.util.ArrayList<C10854bwM> arrayList3, @NotNull java.util.ArrayList<C10854bwM> arrayList4, @NotNull java.util.ArrayList<C10854bwM> arrayList5, @NotNull java.util.ArrayList<C10854bwM> arrayList6, @NotNull java.util.ArrayList<C10854bwM> arrayList7, @NotNull java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> map3, @NotNull java.util.HashMap<java.lang.Integer, C10854bwM> map4, @NotNull java.util.ArrayList<C10854bwM> arrayList8, @NotNull java.util.ArrayList<C10854bwM> arrayList9, @NotNull java.util.HashMap<java.lang.Integer, java.util.ArrayList<C10854bwM>> map5) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(arrayList3, "");
            Intrinsics.checkNotNullParameter(arrayList4, "");
            Intrinsics.checkNotNullParameter(arrayList5, "");
            Intrinsics.checkNotNullParameter(arrayList6, "");
            Intrinsics.checkNotNullParameter(arrayList7, "");
            Intrinsics.checkNotNullParameter(map3, "");
            Intrinsics.checkNotNullParameter(map4, "");
            Intrinsics.checkNotNullParameter(arrayList8, "");
            Intrinsics.checkNotNullParameter(arrayList9, "");
            Intrinsics.checkNotNullParameter(map5, "");
            return new StateListAnimator(map, arrayList, map2, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, map3, map4, arrayList8, arrayList9, map5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.DbNXlk, stateListAnimator.DbNXlk) && Intrinsics.EZpvd(this.values, stateListAnimator.values) && Intrinsics.EZpvd(this.AYXKKw, stateListAnimator.AYXKKw) && Intrinsics.EZpvd(this.AkhnZx, stateListAnimator.AkhnZx) && Intrinsics.EZpvd(this.djBIcL, stateListAnimator.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, stateListAnimator.gEmmrt) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, stateListAnimator.valueOf) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.isConnected, stateListAnimator.isConnected) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.AhwBna, stateListAnimator.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<C10854bwM> gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((this.OLrzqt.hashCode() * 31) + this.DbNXlk.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CoinMetaGroup(coinsById=" + this.OLrzqt + ", platformCoins=" + this.DbNXlk + ", fullAssetCoins=" + this.values + ", customCoins=" + this.AYXKKw + ", temporaryCoins=" + this.AkhnZx + ", enabledCoins=" + this.djBIcL + ", defaultCoins=" + this.gEmmrt + ", chainCoins=" + this.AEQbTJ + ", evmCompatibleChainCoins=" + this.valueOf + ", aggregationCoins=" + this.EZpvd + ", coinsByCurrencyId=" + this.copydefault + ", hardwareLedgerChainCoins=" + this.isConnected + ", aaWalletChainCoins=" + this.KWHzl + ", factionChainCoins=" + this.AhwBna + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.HashMap<java.lang.Integer, java.util.ArrayList<C10854bwM>> valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> values() {
            return this.values;
        }

        public StateListAnimator(@NotNull java.util.HashMap<java.lang.Long, C10854bwM> map, @NotNull java.util.ArrayList<C10854bwM> arrayList, @NotNull java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> map2, @NotNull java.util.ArrayList<C10854bwM> arrayList2, @NotNull java.util.ArrayList<C10854bwM> arrayList3, @NotNull java.util.ArrayList<C10854bwM> arrayList4, @NotNull java.util.ArrayList<C10854bwM> arrayList5, @NotNull java.util.ArrayList<C10854bwM> arrayList6, @NotNull java.util.ArrayList<C10854bwM> arrayList7, @NotNull java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> map3, @NotNull java.util.HashMap<java.lang.Integer, C10854bwM> map4, @NotNull java.util.ArrayList<C10854bwM> arrayList8, @NotNull java.util.ArrayList<C10854bwM> arrayList9, @NotNull java.util.HashMap<java.lang.Integer, java.util.ArrayList<C10854bwM>> map5) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(arrayList3, "");
            Intrinsics.checkNotNullParameter(arrayList4, "");
            Intrinsics.checkNotNullParameter(arrayList5, "");
            Intrinsics.checkNotNullParameter(arrayList6, "");
            Intrinsics.checkNotNullParameter(arrayList7, "");
            Intrinsics.checkNotNullParameter(map3, "");
            Intrinsics.checkNotNullParameter(map4, "");
            Intrinsics.checkNotNullParameter(arrayList8, "");
            Intrinsics.checkNotNullParameter(arrayList9, "");
            Intrinsics.checkNotNullParameter(map5, "");
            this.OLrzqt = map;
            this.DbNXlk = arrayList;
            this.values = map2;
            this.AYXKKw = arrayList2;
            this.AkhnZx = arrayList3;
            this.djBIcL = arrayList4;
            this.gEmmrt = arrayList5;
            this.AEQbTJ = arrayList6;
            this.valueOf = arrayList7;
            this.EZpvd = map3;
            this.copydefault = map4;
            this.isConnected = arrayList8;
            this.KWHzl = arrayList9;
            this.AhwBna = map5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c6: CONSTRUCTOR 
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:452) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r15v0 java.util.HashMap))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000d: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:453) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r16v0 java.util.ArrayList))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0019: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:454) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r17v0 java.util.HashMap))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:455) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r18v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0031: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:456) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r19v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x003d: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:457) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r20v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0049: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:458) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r21v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0055: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:459) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r22v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0061: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0067: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:460) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r23v0 java.util.ArrayList))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x006d: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0073: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:461) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r24v0 java.util.HashMap))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0079: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:462) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r25v0 java.util.HashMap))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0085: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008b: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:463) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r26v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0091: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0097: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:464) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r27v0 java.util.ArrayList))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x009d: ARITH (r29v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a3: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:465) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r28v0 java.util.HashMap))
 A[MD:(java.util.HashMap<java.lang.Long, o.bwM>, java.util.ArrayList<o.bwM>, java.util.HashMap<java.lang.String, java.util.ArrayList<o.bwM>>, java.util.ArrayList<o.bwM>, java.util.ArrayList<o.bwM>, java.util.ArrayList<o.bwM>, java.util.ArrayList<o.bwM>, java.util.ArrayList<o.bwM>, java.util.ArrayList<o.bwM>, java.util.HashMap<java.lang.String, java.util.ArrayList<o.bwM>>, java.util.HashMap<java.lang.Integer, o.bwM>, java.util.ArrayList<o.bwM>, java.util.ArrayList<o.bwM>, java.util.HashMap<java.lang.Integer, java.util.ArrayList<o.bwM>>):void (m)] (LINE:451) call: o.byA.StateListAnimator.<init>(java.util.HashMap, java.util.ArrayList, java.util.HashMap, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.util.HashMap, java.util.HashMap, java.util.ArrayList, java.util.ArrayList, java.util.HashMap):void type: THIS */
        public /* synthetic */ StateListAnimator(java.util.HashMap map, java.util.ArrayList arrayList, java.util.HashMap map2, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.util.ArrayList arrayList5, java.util.ArrayList arrayList6, java.util.ArrayList arrayList7, java.util.HashMap map3, java.util.HashMap map4, java.util.ArrayList arrayList8, java.util.ArrayList arrayList9, java.util.HashMap map5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new java.util.HashMap() : map, (i & 2) != 0 ? new java.util.ArrayList() : arrayList, (i & 4) != 0 ? new java.util.HashMap() : map2, (i & 8) != 0 ? new java.util.ArrayList() : arrayList2, (i & 16) != 0 ? new java.util.ArrayList() : arrayList3, (i & 32) != 0 ? new java.util.ArrayList() : arrayList4, (i & 64) != 0 ? new java.util.ArrayList() : arrayList5, (i & 128) != 0 ? new java.util.ArrayList() : arrayList6, (i & 256) != 0 ? new java.util.ArrayList() : arrayList7, (i & 512) != 0 ? new java.util.HashMap() : map3, (i & 1024) != 0 ? new java.util.HashMap() : map4, (i & 2048) != 0 ? new java.util.ArrayList() : arrayList8, (i & 4096) != 0 ? new java.util.ArrayList() : arrayList9, (i & 8192) != 0 ? new java.util.HashMap() : map5);
        }
    }
}
