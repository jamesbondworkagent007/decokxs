package com.okinc.business.defi.biz.core.transaction.helper;

import com.okinc.business.defi.biz.core.transaction.helper.TXCoinAssetManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.net.bean.AssetAll;
import com.okinc.business.defi.biz.net.bean.MainChainBalanceResp;
import com.okinc.business.defi.biz.net.bean.TokenAsset;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoReq;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import io.reactivex.BackpressureStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58247yxg;
import o.AbstractC58260yxt;
import o.C10407bnq;
import o.C10619brq;
import o.C10854bwM;
import o.C10954byG;
import o.C11205cFp;
import o.C11600cUg;
import o.C11607cUn;
import o.C11627cVg;
import o.C12827cuN;
import o.C13856daV;
import o.C13934dbu;
import o.C32962mnV;
import o.C33129mqd;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C58266yxz;
import o.C59449zhJ;
import o.InterfaceC56387yDm;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58217yxC;
import o.InterfaceC58222yxH;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58230yxP;
import o.InterfaceC60096zvd;
import o.yBI;
import o.yDY;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TXCoinAssetManager {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.bDN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TXCoinAssetManager.EZpvd();
        }
    });
    public InterfaceC58217yxC KWHzl;
    public InterfaceC58217yxC copydefault;

    public static final C13934dbu EZpvd() {
        return new C13934dbu();
    }

    public final C13934dbu OLrzqt() {
        return (C13934dbu) this.AEQbTJ.getValue();
    }

    public final AbstractC58185ywX<CoinAssetRes> OLrzqt(@NotNull final String str, @NotNull final List<C13856daV> list, @NotNull final List<Long> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                TXCoinAssetManager.EZpvd(list2, objectRef, this, list, str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX<CoinAssetRes> abstractC58185ywXCopydefault = C11607cUn.AEQbTJ(abstractC58185ywXKWHzl).copydefault(new InterfaceC58222yxH() { // from class: o.bDz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                TXCoinAssetManager.OLrzqt(objectRef, str, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, o.yxC] */
    public static final void EZpvd(final List list, Ref.ObjectRef objectRef, final TXCoinAssetManager tXCoinAssetManager, final List list2, final String str, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        Map<String, Long> map = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(Long.valueOf(jLongValue), true);
            if (c10854bwMCopydefault == null || !c10854bwMCopydefault.hUfVAv()) {
                if (c10854bwMCopydefault != null && c10854bwMCopydefault.DarRvM()) {
                    arrayList2.add(Long.valueOf(jLongValue));
                } else if (c10854bwMCopydefault == null || !c10854bwMCopydefault.fIwbmz()) {
                    arrayList.add(Long.valueOf(jLongValue));
                } else {
                    hashSet.add(Long.valueOf(jLongValue));
                }
            } else {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    map.put(((C13856daV) it2.next()).AEQbTJ(), Long.valueOf(jLongValue));
                }
            }
        }
        AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXAEQbTJ = tXCoinAssetManager.AEQbTJ(map);
        AbstractC58185ywX abstractC58185ywXLoadCoinAssets$default = loadCoinAssets$default(tXCoinAssetManager, list2, arrayList, false, 4, null);
        AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXKWHzl = tXCoinAssetManager.KWHzl((List<C13856daV>) list2, arrayList2);
        AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXEZpvd = tXCoinAssetManager.EZpvd((List<C13856daV>) list2, hashSet);
        final yHT yht = new yHT() { // from class: o.bDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHT
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return TXCoinAssetManager.OLrzqt((java.util.List) obj, (java.util.List) obj2, (java.util.List) obj3, (java.util.List) obj4);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault(abstractC58185ywXAEQbTJ, abstractC58185ywXLoadCoinAssets$default, abstractC58185ywXKWHzl, abstractC58185ywXEZpvd, new InterfaceC58230yxP() { // from class: o.bDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58230yxP
            public final java.lang.Object EZpvd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return TXCoinAssetManager.copydefault(yht, obj, obj2, obj3, obj4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        objectRef.element = yBI.KWHzl(abstractC58185ywXCopydefault, new Function1() { // from class: o.bDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.EZpvd(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        }, new Function0() { // from class: o.bDK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TXCoinAssetManager.KWHzl(this.AEQbTJ, str, list2, list, interfaceC58184ywW);
            }
        }, new Function1() { // from class: o.bDL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.OLrzqt(this.OLrzqt, interfaceC58184ywW, (java.util.List) obj);
            }
        });
    }

    public static final List copydefault(yHT yht, Object obj, Object obj2, Object obj3, Object obj4) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Intrinsics.checkNotNullParameter(obj4, "");
        return (List) yht.invoke(obj, obj2, obj3, obj4);
    }

    public static final List OLrzqt(List list, List list2, List list3, List list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.djBIcL((Collection) list, (Iterable) list2), (Iterable) list3), (Iterable) list4);
    }

    public static final Unit OLrzqt(TXCoinAssetManager tXCoinAssetManager, InterfaceC58184ywW interfaceC58184ywW, List list) {
        Intrinsics.copydefault(list);
        Intrinsics.copydefault(interfaceC58184ywW);
        tXCoinAssetManager.OLrzqt(1, (List<CoinAsset>) list, (InterfaceC58184ywW<CoinAssetRes>) interfaceC58184ywW);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final TXCoinAssetManager tXCoinAssetManager, String str, List list, List list2, final InterfaceC58184ywW interfaceC58184ywW) {
        tXCoinAssetManager.KWHzl(str, (List<C13856daV>) list, (List<Long>) list2, new Function1() { // from class: o.bDH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.copydefault(this.EZpvd, interfaceC58184ywW, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(TXCoinAssetManager tXCoinAssetManager, InterfaceC58184ywW interfaceC58184ywW, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.copydefault(interfaceC58184ywW);
        tXCoinAssetManager.OLrzqt(2, (List<CoinAsset>) list, (InterfaceC58184ywW<CoinAssetRes>) interfaceC58184ywW);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Ref.ObjectRef objectRef, String str, TXCoinAssetManager tXCoinAssetManager) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        C11205cFp.EZpvd.zLjUOn().OLrzqt(str);
        InterfaceC58217yxC interfaceC58217yxC2 = tXCoinAssetManager.copydefault;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = tXCoinAssetManager.KWHzl;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
    }

    public final void OLrzqt(int i, List<CoinAsset> list, InterfaceC58184ywW<CoinAssetRes> interfaceC58184ywW) {
        interfaceC58184ywW.onNext(new CoinAssetRes(i, list));
    }

    public final AbstractC58185ywX<CoinAssetRes> EZpvd(@NotNull final String str, @NotNull final List<C13856daV> list, @NotNull final List<Long> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                TXCoinAssetManager.copydefault(this.OLrzqt, str, list, list2, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX<CoinAssetRes> abstractC58185ywXCopydefault = C11607cUn.AEQbTJ(abstractC58185ywXKWHzl).copydefault(new InterfaceC58222yxH() { // from class: o.bDv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                TXCoinAssetManager.KWHzl(str, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void copydefault(final TXCoinAssetManager tXCoinAssetManager, String str, List list, List list2, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        tXCoinAssetManager.KWHzl(str, (List<C13856daV>) list, (List<Long>) list2, new Function1() { // from class: o.bDx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.AhwBna(this.AEQbTJ, interfaceC58184ywW, (java.util.List) obj);
            }
        });
    }

    public static final Unit AhwBna(TXCoinAssetManager tXCoinAssetManager, InterfaceC58184ywW interfaceC58184ywW, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.copydefault(interfaceC58184ywW);
        tXCoinAssetManager.OLrzqt(2, (List<CoinAsset>) list, (InterfaceC58184ywW<CoinAssetRes>) interfaceC58184ywW);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(String str, TXCoinAssetManager tXCoinAssetManager) {
        C11205cFp.EZpvd.zLjUOn().OLrzqt(str);
        InterfaceC58217yxC interfaceC58217yxC = tXCoinAssetManager.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = tXCoinAssetManager.KWHzl;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public static /* synthetic */ AbstractC58185ywX loadCoinAssets$default(TXCoinAssetManager tXCoinAssetManager, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return tXCoinAssetManager.OLrzqt((List<C13856daV>) list, (List<Long>) list2, z);
    }

    public final AbstractC58185ywX<List<CoinAsset>> OLrzqt(@NotNull final List<C13856daV> list, @NotNull final List<Long> list2, final boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (list.isEmpty() || list2.isEmpty()) {
            AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(((C13856daV) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).EZpvd(), false);
        final Function1 function1 = new Function1() { // from class: o.bDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.KWHzl(list, list2, z, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.bDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return TXCoinAssetManager.isConnected(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.AEQbTJ(list, z, list2, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.bDO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return TXCoinAssetManager.DbNXlk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final InterfaceC60096zvd isConnected(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(List list, List list2, boolean z, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
        String strUSBtdM = abstractC12782ctV.USBtdM();
        String strDbNXlk = abstractC12782ctV.DbNXlk();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C13856daV) it.next()).EZpvd());
        }
        return instance$default.KWHzl(arrayList, (List<Long>) list2, strUSBtdM, strDbNXlk, z);
    }

    public static final List DbNXlk(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List AEQbTJ(List list, boolean z, List list2, List list3) {
        String coinAmount;
        Object next;
        AssetAll assetAll;
        Intrinsics.checkNotNullParameter(list3, "");
        if (C33129mqd.KWHzl((Collection) list3)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list3) {
                String accountId = ((AssetAll) obj).getAccountId();
                Object arrayList = linkedHashMap.get(accountId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(accountId, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C13856daV c13856daV = (C13856daV) it.next();
                List list4 = (List) linkedHashMap.get(c13856daV.EZpvd());
                List<TokenAsset> tokens = (list4 == null || (assetAll = (AssetAll) CollectionsKt___CollectionsKt.firstOrNull(list4)) == null) ? null : assetAll.getTokens();
                if (tokens == null) {
                    tokens = yDY.AhwBna();
                }
                C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).copydefault(c13856daV.EZpvd(), tokens, false, false, z).bO_();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : tokens) {
                    Long lValueOf = Long.valueOf(((TokenAsset) obj2).getCoinId());
                    Object arrayList3 = linkedHashMap2.get(lValueOf);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap2.put(lValueOf, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    long jLongValue = ((Number) it2.next()).longValue();
                    List list5 = (List) linkedHashMap2.get(Long.valueOf(jLongValue));
                    if (list5 != null) {
                        Iterator it3 = list5.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (Intrinsics.EZpvd((Object) c13856daV.AEQbTJ(), (Object) ((TokenAsset) next).getAddress())) {
                                break;
                            }
                        }
                        TokenAsset tokenAsset = (TokenAsset) next;
                        coinAmount = tokenAsset != null ? tokenAsset.getCoinAmount() : null;
                    }
                    arrayList4.add(new CoinAsset(jLongValue, c13856daV.AEQbTJ(), C33129mqd.AYXKKw(coinAmount)));
                }
                arrayList2.add(arrayList4);
            }
            return C56403yEb.QOLQEE(arrayList2);
        }
        ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            C13856daV c13856daV2 = (C13856daV) it4.next();
            ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList6.add(new CoinAsset(((Number) it5.next()).longValue(), c13856daV2.AEQbTJ(), "0"));
            }
            arrayList5.add(arrayList6);
        }
        return C56403yEb.QOLQEE(arrayList5);
    }

    public final AbstractC58185ywX<List<CoinAsset>> AEQbTJ(Map<String, Long> map) {
        if (map.isEmpty()) {
            AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            final String key = entry.getKey();
            final long jLongValue = entry.getValue().longValue();
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(OLrzqt().KWHzl(new XRC20BalanceDetailInfoReq(key, Long.valueOf(jLongValue))), (Function1) null, 1, (Object) null);
            final Function1 function1 = new Function1() { // from class: o.bDD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TXCoinAssetManager.OLrzqt(jLongValue, key, (XRC20BalanceDetailInfoResp) obj);
                }
            };
            arrayList.add(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bDJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return TXCoinAssetManager.valueOf(function1, obj);
                }
            }));
        }
        return C11607cUn.copydefault((List) arrayList);
    }

    public static final CoinAsset valueOf(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CoinAsset) function1.invoke(obj);
    }

    public static final CoinAsset OLrzqt(long j, String str, XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp) {
        Intrinsics.checkNotNullParameter(xRC20BalanceDetailInfoResp, "");
        return new CoinAsset(j, str, C33129mqd.AYXKKw(xRC20BalanceDetailInfoResp.getAvailableWithoutSpending()));
    }

    public final AbstractC58185ywX<List<CoinAsset>> KWHzl(final List<C13856daV> list, final List<Long> list2) {
        if (list2.isEmpty()) {
            AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C13856daV c13856daV : list) {
            arrayList.add(C10619brq.TaskDescription.getInstance$default(C10619brq.Companion, null, 1, null).copydefault(c13856daV.EZpvd(), c13856daV.AEQbTJ(), list2));
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.bDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.AEQbTJ(list, list2, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXEZpvd = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return TXCoinAssetManager.values(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final List values(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public final AbstractC58185ywX<List<CoinAsset>> EZpvd(List<C13856daV> list, Set<Long> set) {
        if (list.isEmpty() || set.isEmpty()) {
            AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C13856daV c13856daV : list) {
            String strOLrzqt = c13856daV.OLrzqt();
            final String strKWHzl = c13856daV.KWHzl();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                final long jLongValue = ((Number) it.next()).longValue();
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(jLongValue);
                AbstractC58185ywX abstractC58185ywXAEQbTJ = null;
                if (c10854bwMKWHzl != null) {
                    AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(OLrzqt().AEQbTJ(strOLrzqt, c10854bwMKWHzl.fetchVPNInfo()), (Function1) null, 1, (Object) null);
                    final Function1 function1 = new Function1() { // from class: o.bDp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return TXCoinAssetManager.OLrzqt(jLongValue, strKWHzl, (MainChainBalanceResp) obj);
                        }
                    };
                    abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bDs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return TXCoinAssetManager.gEmmrt(function1, obj);
                        }
                    });
                }
                if (abstractC58185ywXAEQbTJ != null) {
                    arrayList2.add(abstractC58185ywXAEQbTJ);
                }
            }
            arrayList.add(arrayList2);
        }
        return C11607cUn.copydefault(C56403yEb.QOLQEE(arrayList));
    }

    public static final CoinAsset gEmmrt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (CoinAsset) function1.invoke(obj);
    }

    public static final CoinAsset OLrzqt(long j, String str, MainChainBalanceResp mainChainBalanceResp) {
        Intrinsics.checkNotNullParameter(mainChainBalanceResp, "");
        return new CoinAsset(j, str, C33129mqd.AYXKKw(mainChainBalanceResp.getCoinAmountOrigin()));
    }

    public final void KWHzl(String str, final List<C13856daV> list, List<Long> list2, final Function1<? super List<CoinAsset>, Unit> function1) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(Long.valueOf(jLongValue), true);
            if (c10854bwMCopydefault != null && c10854bwMCopydefault.DarRvM()) {
                arrayList2.add(Long.valueOf(jLongValue));
            } else {
                arrayList.add(Long.valueOf(jLongValue));
            }
        }
        if (!arrayList.isEmpty()) {
            C11205cFp.EZpvd.zLjUOn().AEQbTJ(new Application(str, arrayList, function1, this, list));
        }
        if (!arrayList2.isEmpty()) {
            InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58247yxg<Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(7L, 7L, TimeUnit.SECONDS, C58266yxz.OLrzqt());
            final Function1 function12 = new Function1() { // from class: o.bDI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TXCoinAssetManager.copydefault(this.OLrzqt, list, arrayList2, function1, (java.lang.Long) obj);
                }
            };
            this.copydefault = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.bDM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TXCoinAssetManager.fIwbmz(function12, obj);
                }
            });
        }
    }

    public static final class Application extends WalletCoinAssetSubManager.TaskDescription {
        public final /* synthetic */ List<C13856daV> AEQbTJ;
        public final /* synthetic */ TXCoinAssetManager EZpvd;
        public final /* synthetic */ Function1<List<CoinAsset>, Unit> OLrzqt;
        public final /* synthetic */ ArrayList<Long> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<com.okinc.business.defi.biz.core.transaction.helper.TXCoinAssetManager$CoinAsset>, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(String str, ArrayList<Long> arrayList, Function1<? super List<CoinAsset>, Unit> function1, TXCoinAssetManager tXCoinAssetManager, List<C13856daV> list) {
            super(str, null, arrayList, false, 10, null);
            this.copydefault = arrayList;
            this.OLrzqt = function1;
            this.EZpvd = tXCoinAssetManager;
            this.AEQbTJ = list;
        }

        public static final CoinAsset copydefault(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (CoinAsset) function1.invoke(obj);
        }

        public static final CoinAsset OLrzqt(C10854bwM c10854bwM, String str, MainChainBalanceResp mainChainBalanceResp) {
            Intrinsics.checkNotNullParameter(mainChainBalanceResp, "");
            return new CoinAsset(c10854bwM.AhwBna(), str, C33129mqd.AYXKKw(mainChainBalanceResp.getCoinAmountOrigin()));
        }

        public static final Unit EZpvd(Function1 function1, TXCoinAssetManager tXCoinAssetManager, List list, CoinAsset coinAsset) {
            Intrinsics.checkNotNullParameter(coinAsset, "");
            List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(coinAsset);
            listOLrzqt.addAll(tXCoinAssetManager.copydefault(list));
            function1.invoke(C56402yEa.fARcdN(listOLrzqt));
            return Unit.INSTANCE;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(List<WalletCoinAssetSubManager.SubResponse> list) {
            Object next;
            Object next2;
            String strEZpvd;
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.EZpvd(((WalletCoinAssetSubManager.SubResponse) obj).isAptosMainCoinAssetChanged(), Boolean.TRUE)) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list2 = (List) pair.component1();
            final List list3 = (List) pair.component2();
            WalletCoinAssetSubManager.SubResponse subResponse = (WalletCoinAssetSubManager.SubResponse) CollectionsKt___CollectionsKt.firstOrNull(list2);
            AbstractC58185ywX abstractC58185ywXAEQbTJ = null;
            if ((subResponse != null ? subResponse.getAddress() : null) == null) {
                this.OLrzqt.invoke(this.EZpvd.copydefault(list));
                return;
            }
            ArrayList<Long> arrayList3 = this.copydefault;
            List<C13856daV> list4 = this.AEQbTJ;
            TXCoinAssetManager tXCoinAssetManager = this.EZpvd;
            final String address = subResponse.getAddress();
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it = arrayList3.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(((Number) it.next()).longValue()));
                if (c10854bwMKWHzl != null) {
                    arrayList4.add(c10854bwMKWHzl);
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C10854bwM) next).fIwbmz()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            final C10854bwM c10854bwM = (C10854bwM) next;
            if (c10854bwM != null) {
                Iterator<T> it3 = list4.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (C59449zhJ.gEmmrt(((C13856daV) next2).AEQbTJ(), address, true)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C13856daV c13856daV = (C13856daV) next2;
                if (c13856daV != null && (strEZpvd = c13856daV.EZpvd()) != null) {
                    AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(tXCoinAssetManager.OLrzqt().AEQbTJ(strEZpvd, c10854bwM.fetchVPNInfo()), (Function1) null, 1, (Object) null);
                    final Function1 function1 = new Function1() { // from class: o.bDT
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return TXCoinAssetManager.Application.OLrzqt(c10854bwM, address, (MainChainBalanceResp) obj2);
                        }
                    };
                    abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bDV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj2) {
                            return TXCoinAssetManager.Application.copydefault(function1, obj2);
                        }
                    });
                }
            }
            AbstractC58185ywX abstractC58185ywX = abstractC58185ywXAEQbTJ;
            if (abstractC58185ywX == null) {
                this.OLrzqt.invoke(this.EZpvd.copydefault(list));
                return;
            }
            final Function1<List<CoinAsset>, Unit> function12 = this.OLrzqt;
            final TXCoinAssetManager tXCoinAssetManager2 = this.EZpvd;
            yBI.subscribeBy$default(abstractC58185ywX, (Function1) null, (Function0) null, new Function1() { // from class: o.bDW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return TXCoinAssetManager.Application.EZpvd(function12, tXCoinAssetManager2, list3, (TXCoinAssetManager.CoinAsset) obj2);
                }
            }, 3, (Object) null);
        }
    }

    public static final void fIwbmz(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(TXCoinAssetManager tXCoinAssetManager, List list, ArrayList arrayList, final Function1 function1, Long l) {
        InterfaceC58217yxC interfaceC58217yxC = tXCoinAssetManager.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<List<CoinAsset>> abstractC58185ywXKWHzl = tXCoinAssetManager.KWHzl((List<C13856daV>) list, arrayList);
        final Function1 function12 = new Function1() { // from class: o.bDy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.copydefault(function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super List<CoinAsset>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TXCoinAssetManager.fetchVPNInfo(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.bDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TXCoinAssetManager.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        tXCoinAssetManager.KWHzl = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TXCoinAssetManager.AkhnZx(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, List list) {
        Intrinsics.copydefault(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final class CoinAsset {
        public static final int $stable = 0;
        private final String address;
        private final String asset;
        private final long coinId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CoinAsset copy$default(CoinAsset coinAsset, long j, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = coinAsset.coinId;
            }
            if ((i & 2) != 0) {
                str = coinAsset.address;
            }
            if ((i & 4) != 0) {
                str2 = coinAsset.asset;
            }
            return coinAsset.copy(j, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.asset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoinAsset copy(long j, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new CoinAsset(j, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoinAsset)) {
                return false;
            }
            CoinAsset coinAsset = (CoinAsset) obj;
            return this.coinId == coinAsset.coinId && Intrinsics.EZpvd((Object) this.address, (Object) coinAsset.address) && Intrinsics.EZpvd((Object) this.asset, (Object) coinAsset.asset);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAsset() {
            return this.asset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Long.hashCode(this.coinId) * 31) + this.address.hashCode()) * 31) + this.asset.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CoinAsset(coinId=" + this.coinId + ", address=" + this.address + ", asset=" + this.asset + ")";
        }

        public CoinAsset(long j, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.coinId = j;
            this.address = str;
            this.asset = str2;
        }
    }

    public static final class CoinAssetRes {
        public static final int TYPE_INTERFACE = 1;
        public static final int TYPE_WS = 2;
        private final List<CoinAsset> coinAssetList;
        private final int type;
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.transaction.helper.TXCoinAssetManager$CoinAssetRes */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CoinAssetRes copy$default(CoinAssetRes coinAssetRes, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = coinAssetRes.type;
            }
            if ((i2 & 2) != 0) {
                list = coinAssetRes.coinAssetList;
            }
            return coinAssetRes.copy(i, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CoinAsset> component2() {
            return this.coinAssetList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CoinAssetRes copy(int i, @NotNull List<CoinAsset> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new CoinAssetRes(i, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CoinAssetRes)) {
                return false;
            }
            CoinAssetRes coinAssetRes = (CoinAssetRes) obj;
            return this.type == coinAssetRes.type && Intrinsics.EZpvd(this.coinAssetList, coinAssetRes.coinAssetList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CoinAsset> getCoinAssetList() {
            return this.coinAssetList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.type) * 31) + this.coinAssetList.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CoinAssetRes(type=" + this.type + ", coinAssetList=" + this.coinAssetList + ")";
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.helper.TXCoinAssetManager.CoinAssetRes.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }

        public CoinAssetRes(int i, @NotNull List<CoinAsset> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.type = i;
            this.coinAssetList = list;
        }
    }

    public final List<CoinAsset> copydefault(List<WalletCoinAssetSubManager.SubResponse> list) {
        String strAYXKKw;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (WalletCoinAssetSubManager.SubResponse subResponse : list) {
            long jCopydefault = C11600cUg.copydefault(subResponse.getCoinId());
            String address = subResponse.getAddress();
            if (address == null) {
                address = "";
            }
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(subResponse.getCoinId());
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.hUfVAv()) {
                strAYXKKw = C33129mqd.AYXKKw(subResponse.getAvailableBalance());
            } else {
                strAYXKKw = C33129mqd.AYXKKw(subResponse.getCoinAmount());
            }
            arrayList.add(new CoinAsset(jCopydefault, address, strAYXKKw));
        }
        return arrayList;
    }

    public static final List AEQbTJ(List list, List list2, List list3) {
        String str;
        Object next;
        Intrinsics.checkNotNullParameter(list3, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C13856daV c13856daV = (C13856daV) obj;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                Iterator it2 = ((List) list3.get(i)).iterator();
                while (true) {
                    str = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((Number) ((Pair) next).getFirst()).longValue() == jLongValue) {
                        break;
                    }
                }
                Pair pair = (Pair) next;
                if (pair != null) {
                    str = (String) pair.getSecond();
                }
                arrayList2.add(new CoinAsset(jLongValue, c13856daV.AEQbTJ(), C33129mqd.AYXKKw(str)));
            }
            arrayList.add(arrayList2);
            i++;
        }
        return C56403yEb.QOLQEE(arrayList);
    }
}
