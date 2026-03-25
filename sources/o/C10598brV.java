package o;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaEntity;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.wallet.bean.CustomNetwork;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10598brV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.brV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10598brV implements InterfaceC9732bbD {
    public static AbstractC58185ywX<java.lang.Boolean> AYXKKw;
    public static volatile boolean djBIcL;
    public static final C10598brV AEQbTJ = new C10598brV();
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bss
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10598brV.djBIcL();
        }
    });
    public static final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.bst
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10598brV.valueOf();
        }
    });
    public static volatile java.util.ArrayList<CustomChainMeta> EZpvd = new java.util.ArrayList<>();
    public static volatile java.util.ArrayList<CustomChainCoinMeta> copydefault = new java.util.ArrayList<>();
    public static volatile java.util.ArrayList<CustomChainCoinMeta> OLrzqt = new java.util.ArrayList<>();
    public static volatile java.util.ArrayList<CustomChainMeta> gEmmrt = new java.util.ArrayList<>();
    public static volatile java.util.HashMap<java.lang.Long, java.util.ArrayList<CustomChainCoinMeta>> AhwBna = new java.util.HashMap<>();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List AEQbTJ(java.util.List list, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return "0";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void copydefault() {
        djBIcL = true;
        AYXKKw = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<CustomChainCoinMeta> AhwBna() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<CustomChainMeta> DbNXlk() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<CustomChainMeta> fetchVPNInfo() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<CustomChainCoinMeta> gEmmrt() {
        return OLrzqt;
    }

    private C10598brV() {
    }

    public static final cPO djBIcL() {
        return new cPO(C9678baC.Companion.AEQbTJ());
    }

    public final cPO fARcdN() {
        return (cPO) valueOf.getValue();
    }

    public static final C13934dbu valueOf() {
        return new C13934dbu();
    }

    public final C13934dbu fIwbmz() {
        return (C13934dbu) values.getValue();
    }

    public final java.util.ArrayList<CustomChainMeta> AkhnZx() {
        java.util.ArrayList<CustomChainMeta> arrayList = new java.util.ArrayList<>(EZpvd.size());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (CustomChainMeta customChainMeta : EZpvd) {
            if (!hashSet.contains(java.lang.String.valueOf(customChainMeta.EZpvd()))) {
                arrayList.add(customChainMeta);
                hashSet.add(java.lang.String.valueOf(customChainMeta.EZpvd()));
            }
        }
        return arrayList;
    }

    public final CustomChainCoinMeta OLrzqt(long j) {
        java.util.ArrayList<CustomChainCoinMeta> arrayList = AhwBna.get(java.lang.Long.valueOf(j));
        if (arrayList != null) {
            return (CustomChainCoinMeta) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        }
        return null;
    }

    public final CustomChainCoinMeta copydefault(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<CustomChainCoinMeta> arrayList = AhwBna.get(java.lang.Long.valueOf(j));
        java.lang.Object obj = null;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1 || str.length() == 0) {
            return (CustomChainCoinMeta) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            CustomChainMeta customChainMetaOLrzqt = ((CustomChainCoinMeta) next).OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) (customChainMetaOLrzqt != null ? customChainMetaOLrzqt.isConnected() : null), (java.lang.Object) str)) {
                obj = next;
                break;
            }
        }
        return (CustomChainCoinMeta) obj;
    }

    public C10854bwM djBIcL(long j) {
        CustomChainCoinMeta customChainCoinMetaEZpvd;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = OLrzqt(j);
        if (customChainCoinMetaOLrzqt == null || (customChainCoinMetaEZpvd = customChainCoinMetaOLrzqt.EZpvd()) == null) {
            return null;
        }
        return customChainCoinMetaEZpvd.AEQbTJ();
    }

    public C10854bwM copydefault(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next;
            if (C59449zhJ.gEmmrt(customChainCoinMeta.values(), str, true) || C59449zhJ.gEmmrt(customChainCoinMeta.AhwBna(), str, true)) {
                break;
            }
        }
        CustomChainCoinMeta customChainCoinMeta2 = (CustomChainCoinMeta) next;
        if (customChainCoinMeta2 != null) {
            return customChainCoinMeta2.AEQbTJ();
        }
        return null;
    }

    public final CustomChainCoinMeta KWHzl(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CustomChainCoinMeta) next).copydefault() == j) {
                break;
            }
        }
        return (CustomChainCoinMeta) next;
    }

    public final CustomChainCoinMeta EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object obj = null;
        if (str.length() == 0) {
            java.util.Iterator<T> it = OLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((CustomChainCoinMeta) next).copydefault() == j) {
                    obj = next;
                    break;
                }
            }
            return (CustomChainCoinMeta) obj;
        }
        java.util.Iterator<T> it2 = OLrzqt.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next2;
            if (customChainCoinMeta.copydefault() == j) {
                CustomChainMeta customChainMetaOLrzqt = customChainCoinMeta.OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) (customChainMetaOLrzqt != null ? customChainMetaOLrzqt.isConnected() : null), (java.lang.Object) str)) {
                    obj = next2;
                    break;
                }
            }
        }
        return (CustomChainCoinMeta) obj;
    }

    public final CustomChainCoinMeta AhwBna(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CustomChainCoinMeta) next).DbNXlk() == j) {
                break;
            }
        }
        return (CustomChainCoinMeta) next;
    }

    public C10854bwM OLrzqt(java.lang.Long l) {
        CustomChainCoinMeta customChainCoinMeta;
        java.util.ArrayList<CustomChainCoinMeta> arrayList = AhwBna.get(l);
        if (arrayList == null || (customChainCoinMeta = (CustomChainCoinMeta) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) {
            return null;
        }
        return customChainCoinMeta.AEQbTJ();
    }

    public C10854bwM AEQbTJ(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CustomChainCoinMeta) next).copydefault() == j) {
                break;
            }
        }
        CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next;
        if (customChainCoinMeta != null) {
            return customChainCoinMeta.AEQbTJ();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.brV$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((CustomChainCoinMeta) t2).gEmmrt()), java.lang.Long.valueOf(((CustomChainCoinMeta) t).gEmmrt()));
        }
    }

    public final C10854bwM KWHzl(long j, @NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return AEQbTJ(j);
        }
        java.util.Iterator<T> it = OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next;
            if (customChainCoinMeta.copydefault() == j) {
                CustomChainMeta customChainMetaOLrzqt = customChainCoinMeta.OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) (customChainMetaOLrzqt != null ? customChainMetaOLrzqt.isConnected() : null), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        CustomChainCoinMeta customChainCoinMeta2 = (CustomChainCoinMeta) next;
        if (customChainCoinMeta2 != null) {
            return customChainCoinMeta2.AEQbTJ();
        }
        return null;
    }

    public C10854bwM copydefault(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CustomChainCoinMeta) next).DbNXlk() == j) {
                break;
            }
        }
        CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next;
        if (customChainCoinMeta != null) {
            return customChainCoinMeta.AEQbTJ();
        }
        return null;
    }

    public C10854bwM EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) CollectionsKt___CollectionsKt.firstOrNull(AEQbTJ(str));
        if (customChainCoinMeta != null) {
            return customChainCoinMeta.AEQbTJ();
        }
        return null;
    }

    public final CustomChainCoinMeta copydefault(@NotNull java.lang.String str, long j) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = copydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next;
            if (C59449zhJ.gEmmrt(customChainCoinMeta.djBIcL(), str, true) && customChainCoinMeta.copydefault() == j) {
                break;
            }
        }
        return (CustomChainCoinMeta) next;
    }

    public final CustomChainCoinMeta KWHzl(@NotNull java.lang.String str, long j) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = copydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next;
            if (C59449zhJ.gEmmrt(customChainCoinMeta.djBIcL(), str, true) && customChainCoinMeta.DbNXlk() == j) {
                break;
            }
        }
        return (CustomChainCoinMeta) next;
    }

    public C10854bwM EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        CustomChainCoinMeta customChainCoinMetaKWHzl = KWHzl(str, j);
        if (customChainCoinMetaKWHzl != null) {
            return customChainCoinMetaKWHzl.AEQbTJ();
        }
        return null;
    }

    public java.util.List<InterfaceC9731bbC> isConnected() {
        return values();
    }

    @Override // o.InterfaceC9732bbD
    public java.util.ArrayList<InterfaceC9731bbC> KWHzl() {
        java.util.List<InterfaceC9731bbC> listValues = values();
        Intrinsics.copydefault(listValues, "");
        return (java.util.ArrayList) listValues;
    }

    public final boolean valueOf(long j) {
        return AhwBna.get(java.lang.Long.valueOf(j)) != null;
    }

    public final AbstractC58260yxt<ContractAddressResp> AEQbTJ(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C10734btz c10734btz = C10734btz.KWHzl;
        AbstractC58260yxt<java.lang.String> abstractC58260yxtGEmmrt = c10734btz.gEmmrt(str, str2);
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = c10734btz.OLrzqt(str, str2).AhwBna(new InterfaceC58229yxO() { // from class: o.bsw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10598brV.OLrzqt((java.lang.Throwable) obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.bsy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10598brV.AEQbTJ(str2, (java.lang.String) obj, (java.lang.String) obj2);
            }
        };
        AbstractC58260yxt<ContractAddressResp> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtGEmmrt, abstractC58260yxtAhwBna, new InterfaceC58223yxI() { // from class: o.bsv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C10598brV.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final ContractAddressResp EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ContractAddressResp) function2.invoke(obj, obj2);
    }

    public static final ContractAddressResp AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ContractAddressResp((java.lang.String) null, str, str2, C33129mqd.AhwBna(str3), C9700baY.OLrzqt(C33129mqd.gEmmrt(C59454zhO.wlaJM(str2))), (java.lang.Boolean) null, 0, (java.lang.String) null, 225, (DefaultConstructorMarker) null);
    }

    public final AbstractC58185ywX<java.lang.Boolean> OLrzqt(boolean z) {
        if (djBIcL) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return KWHzl(z);
    }

    @Override // o.InterfaceC9732bbD
    public AbstractC58185ywX<java.lang.Boolean> EZpvd(boolean z) {
        djBIcL = false;
        return OLrzqt(z);
    }

    public final AbstractC58185ywX<java.lang.Boolean> KWHzl(boolean z) {
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXEjfBZ;
        synchronized (this) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywX = AYXKKw;
            if (abstractC58185ywX != null) {
                Intrinsics.copydefault(abstractC58185ywX);
                return abstractC58185ywX;
            }
            final java.util.HashMap map = new java.util.HashMap();
            if (z) {
                AbstractC58185ywX<ResponseData<java.util.List<CustomNetwork>>> abstractC58185ywXIsConnected = fIwbmz().isConnected();
                final Function1 function1 = new Function1() { // from class: o.brY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10598brV.KWHzl((java.lang.Throwable) obj);
                    }
                };
                AbstractC58185ywX<ResponseData<java.util.List<CustomNetwork>>> abstractC58185ywXDjBIcL = abstractC58185ywXIsConnected.djBIcL(new InterfaceC58229yxO() { // from class: o.brW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10598brV.fetchVPNInfo(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.bsc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10598brV.AEQbTJ(map, (ResponseData) obj);
                    }
                };
                abstractC58185ywXEjfBZ = abstractC58185ywXDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.bsf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10598brV.isConnected(function12, obj);
                    }
                });
            } else {
                abstractC58185ywXEjfBZ = ejfBZ();
            }
            final ActionBar actionBar = new ActionBar(map);
            AbstractC58185ywX<R> abstractC58185ywXCopydefault = abstractC58185ywXEjfBZ.copydefault(new InterfaceC58229yxO() { // from class: o.bsd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10598brV.fARcdN(actionBar, obj);
                }
            });
            final Function1 function13 = new Function1() { // from class: o.bse
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10598brV.AEQbTJ((java.lang.Long) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.copydefault((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bsb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10598brV.ejfBZ(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = C33527myD.KWHzl(abstractC58185ywXCopydefault2).OLrzqt(new InterfaceC58222yxH() { // from class: o.bsh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58222yxH
                public final void run() {
                    C10598brV.copydefault();
                }
            }).EZpvd();
            AYXKKw = abstractC58185ywXEZpvd;
            Intrinsics.copydefault(abstractC58185ywXEZpvd);
            return abstractC58185ywXEZpvd;
        }
    }

    public static final ResponseData KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 63, null);
    }

    public static final ResponseData fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o.brV$ActionBar */
    public static final class ActionBar implements Function1<?, InterfaceC58261yxu<? extends java.lang.Long>> {
        public final /* synthetic */ java.util.HashMap<java.lang.Long, java.lang.Integer> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.util.HashMap<java.lang.Long, java.lang.Integer> map) {
            this.copydefault = map;
        }

        public static final InterfaceC58261yxu valueOf(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC58261yxu) function1.invoke(obj);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.cPO.booleanForKeyInCallThread$default(o.cPO, java.lang.String, boolean, int, java.lang.Object):o.yxt */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final InterfaceC58261yxu<? extends java.lang.Long> invoke(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            AbstractC58260yxt abstractC58260yxtBooleanForKeyInCallThread$default = cPO.booleanForKeyInCallThread$default(C10598brV.AEQbTJ.fARcdN(), "custom_chain_order_is_fixed", false, 2, null);
            final java.util.HashMap<java.lang.Long, java.lang.Integer> map = this.copydefault;
            final Function1 function1 = new Function1() { // from class: o.bsx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C10598brV.ActionBar.AEQbTJ(map, (java.lang.Boolean) obj2);
                }
            };
            return abstractC58260yxtBooleanForKeyInCallThread$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.bsB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return C10598brV.ActionBar.valueOf(function1, obj2);
                }
            });
        }

        public static final InterfaceC58261yxu AEQbTJ(final java.util.HashMap map, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(bool, "");
            if (bool.booleanValue() || map.isEmpty()) {
                return AbstractC58260yxt.copydefault(0L);
            }
            AbstractC58260yxt<java.util.List<CustomChainMetaEntity>> abstractC58260yxtEZpvd = C10639bsJ.EZpvd.AhwBna().EZpvd();
            final Function1 function1 = new Function1() { // from class: o.bsE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10598brV.ActionBar.EZpvd(map, (java.util.List) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.bsC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10598brV.ActionBar.KWHzl(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.bsD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10598brV.ActionBar.AEQbTJ((Unit) obj);
                }
            };
            return abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bsA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10598brV.ActionBar.AEQbTJ(function12, obj);
                }
            });
        }

        public static final InterfaceC58261yxu KWHzl(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC58261yxu) function1.invoke(obj);
        }

        public static final InterfaceC58261yxu AEQbTJ(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC58261yxu) function1.invoke(obj);
        }

        public static final InterfaceC58261yxu AEQbTJ(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return C10598brV.AEQbTJ.fARcdN().EZpvd("custom_chain_order_is_fixed", "true");
        }

        public static final InterfaceC58261yxu EZpvd(java.util.HashMap map, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList<CustomChainMetaEntity> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!C11600cUg.KWHzl(((CustomChainMetaEntity) obj).getFromCustom())) {
                    arrayList.add(obj);
                }
            }
            CustomChainMetaEntity customChainMetaEntity = (CustomChainMetaEntity) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            long createAt = customChainMetaEntity != null ? customChainMetaEntity.getCreateAt() : 0L;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (CustomChainMetaEntity customChainMetaEntity2 : arrayList) {
                java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Long.valueOf(customChainMetaEntity2.getChainId()));
                if (num != null) {
                    arrayList3.add(C56390yDp.OLrzqt(java.lang.Long.valueOf(customChainMetaEntity2.getChainId()), java.lang.Long.valueOf(((long) num.intValue()) + createAt)));
                } else {
                    arrayList2.add(java.lang.Long.valueOf(customChainMetaEntity2.getChainId()));
                }
            }
            int i = 0;
            for (java.lang.Object obj2 : arrayList2) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                arrayList3.add(C56390yDp.OLrzqt(java.lang.Long.valueOf(((java.lang.Number) obj2).longValue()), java.lang.Long.valueOf(((long) i) + createAt)));
                i++;
            }
            return C10639bsJ.EZpvd.isConnected(arrayList3);
        }
    }

    public static final InterfaceC58261yxu fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        AbstractC58260yxt<java.util.List<CustomChainMeta>> abstractC58260yxtAEQbTJ = C10639bsJ.EZpvd.AEQbTJ();
        final Function1 function1 = new Function1() { // from class: o.bsn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10598brV.AEQbTJ((java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.bso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10598brV.AuCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(abstractC58260yxtOLrzqt);
        final Function1 function12 = new Function1() { // from class: o.bsr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10598brV.djBIcL((java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bsu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10598brV.fJNWhG(function12, obj);
            }
        });
    }

    public static final InterfaceC58261yxu AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtAYXKKw = AEQbTJ.AYXKKw(list);
        final Function1 function1 = new Function1() { // from class: o.brX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10598brV.AEQbTJ(list, (java.lang.Long) obj);
            }
        };
        return abstractC58260yxtAYXKKw.copydefault(new InterfaceC58229yxO() { // from class: o.bsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10598brV.fIwbmz(function1, obj);
            }
        });
    }

    public static final java.util.List fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.lang.Boolean fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean djBIcL(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AEQbTJ.AhwBna((java.util.List<CustomChainMeta>) list);
        return java.lang.Boolean.TRUE;
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<java.lang.Long> ejfBZ() {
        AbstractC58260yxt abstractC58260yxtBooleanForKeyInCallThread$default = cPO.booleanForKeyInCallThread$default(fARcdN(), "custom_chain_icon_is_update", false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.bsj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10598brV.AEQbTJ((java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl = abstractC58260yxtBooleanForKeyInCallThread$default.KWHzl(new InterfaceC58229yxO() { // from class: o.bsg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10598brV.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (!bool.booleanValue()) {
            AbstractC58185ywX<ResponseData<java.util.List<CustomNetwork>>> abstractC58185ywXIsConnected = AEQbTJ.fIwbmz().isConnected();
            final Function1 function1 = new Function1() { // from class: o.brU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10598brV.gEmmrt((java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX<ResponseData<java.util.List<CustomNetwork>>> abstractC58185ywXDjBIcL = abstractC58185ywXIsConnected.djBIcL(new InterfaceC58229yxO() { // from class: o.brS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10598brV.getFieldNames(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.bsi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10598brV.copydefault((ResponseData) obj);
                }
            };
            return abstractC58185ywXDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.bsq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10598brV.iwGUEr(function12, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(0L);
    }

    public static final ResponseData gEmmrt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 63, null);
    }

    public static final ResponseData getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return AEQbTJ.fARcdN().EZpvd("custom_chain_icon_is_update", "true");
    }

    public final AbstractC58260yxt<java.lang.Long> AYXKKw(final java.util.List<CustomChainMeta> list) {
        AbstractC58260yxt abstractC58260yxtBooleanForKeyInCallThread$default = cPO.booleanForKeyInCallThread$default(fARcdN(), "custom_chain_is_migrated_status", false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.bsk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10598brV.EZpvd(list, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = abstractC58260yxtBooleanForKeyInCallThread$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.bsp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10598brV.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(java.util.List list, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return AbstractC58260yxt.copydefault(0L);
        }
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtDbNXlk = C10639bsJ.EZpvd.DbNXlk(list);
        final Function1 function1 = new Function1() { // from class: o.bsz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10598brV.valueOf((java.util.List) obj);
            }
        };
        return abstractC58260yxtDbNXlk.OLrzqt(new InterfaceC58229yxO() { // from class: o.brZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10598brV.uzCIH(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu valueOf(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return AEQbTJ.fARcdN().EZpvd("custom_chain_is_migrated_status", "true");
    }

    public final void AhwBna(@NotNull java.util.List<CustomChainMeta> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (CustomChainMeta customChainMeta : list) {
            CustomChainCoinMeta customChainCoinMetaDjBIcL = customChainMeta.djBIcL();
            if (customChainCoinMetaDjBIcL != null) {
                customChainCoinMetaDjBIcL.AEQbTJ(customChainMeta);
            }
            if (customChainCoinMetaDjBIcL != null) {
                customChainCoinMetaDjBIcL.OLrzqt(customChainCoinMetaDjBIcL);
            }
            if (customChainCoinMetaDjBIcL != null) {
                arrayList.add(customChainCoinMetaDjBIcL);
            }
            for (CustomChainCoinMeta customChainCoinMeta : customChainMeta.KWHzl()) {
                customChainCoinMeta.AEQbTJ(customChainMeta);
                customChainCoinMeta.OLrzqt(customChainMeta.djBIcL());
                arrayList.add(customChainCoinMeta);
            }
        }
        AYXKKw();
        java.util.ArrayList<CustomChainCoinMeta> arrayList2 = new java.util.ArrayList<>();
        java.util.HashMap<java.lang.Long, java.util.ArrayList<CustomChainCoinMeta>> map = new java.util.HashMap<>();
        java.util.ArrayList<CustomChainCoinMeta> arrayList3 = new java.util.ArrayList<>();
        for (CustomChainCoinMeta customChainCoinMeta2 : CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator())) {
            if (customChainCoinMeta2.fJNWhG()) {
                arrayList3.add(customChainCoinMeta2);
            }
            arrayList2.add(customChainCoinMeta2);
            java.util.ArrayList<CustomChainCoinMeta> arrayList4 = map.get(java.lang.Long.valueOf(customChainCoinMeta2.valueOf()));
            if (arrayList4 == null) {
                java.util.ArrayList<CustomChainCoinMeta> arrayList5 = new java.util.ArrayList<>();
                arrayList5.add(customChainCoinMeta2);
                map.put(java.lang.Long.valueOf(customChainCoinMeta2.valueOf()), arrayList5);
            } else {
                arrayList4.add(customChainCoinMeta2);
            }
        }
        EZpvd = new java.util.ArrayList<>(list);
        copydefault = arrayList2;
        OLrzqt = arrayList3;
        AhwBna = map;
    }

    public final void AYXKKw() {
        EZpvd = new java.util.ArrayList<>();
        copydefault = new java.util.ArrayList<>();
        OLrzqt = new java.util.ArrayList<>();
        gEmmrt = new java.util.ArrayList<>();
        AhwBna = new java.util.HashMap<>();
    }

    public final void fJNWhG() {
        djBIcL = false;
        AYXKKw();
    }

    public final CustomChainMeta EZpvd(long j) {
        java.lang.Object next;
        java.util.Iterator<T> it = EZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CustomChainMeta) next).EZpvd() == j) {
                break;
            }
        }
        return (CustomChainMeta) next;
    }

    public java.util.List<InterfaceC9731bbC> values() {
        java.util.ArrayList<CustomChainCoinMeta> arrayList = copydefault;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((CustomChainCoinMeta) obj).fJNWhG()) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((CustomChainCoinMeta) it.next()).AEQbTJ());
        }
        return arrayList3;
    }

    public final java.util.List<CustomChainCoinMeta> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<CustomChainCoinMeta> arrayList = copydefault;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (C59449zhJ.gEmmrt(((CustomChainCoinMeta) obj).djBIcL(), str, true)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final InterfaceC58261yxu AEQbTJ(java.util.HashMap map, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.Iterable iterable = (java.lang.Iterable) data;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
            int i = 0;
            for (java.lang.Object obj : iterable) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                CustomNetwork customNetwork = (CustomNetwork) obj;
                map.put(java.lang.Long.valueOf(-java.lang.Long.parseLong(customNetwork.getChainId())), java.lang.Integer.valueOf(i));
                arrayList.add(CustomChainMeta.Companion.AEQbTJ(customNetwork, ((long) i) + jCurrentTimeMillis));
                i++;
            }
            gEmmrt = new java.util.ArrayList<>(arrayList);
            return C10639bsJ.EZpvd.values(arrayList);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0L);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.Iterable<CustomNetwork> iterable = (java.lang.Iterable) data;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
            for (CustomNetwork customNetwork : iterable) {
                arrayList.add(C10639bsJ.EZpvd.AEQbTJ(-java.lang.Long.parseLong(customNetwork.getChainId()), customNetwork.getIcon()));
            }
            AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
            final Function1 function1 = new Function1() { // from class: o.bsl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10598brV.gEmmrt((java.util.List) obj);
                }
            };
            return abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.bsm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10598brV.hDKMBd(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(0L);
    }
}
