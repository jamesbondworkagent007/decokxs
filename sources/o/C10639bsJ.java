package o;

import com.okinc.business.defi.biz.constant.CustomChainStatus;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaStatusEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.core.util.SPUtils;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10639bsJ {
    public static final C10639bsJ EZpvd = new C10639bsJ();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.bsS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10639bsJ.EZpvd();
        }
    });
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean EZpvd(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return java.lang.Boolean.TRUE;
    }

    private C10639bsJ() {
    }

    public static final cOR EZpvd() {
        return new cOR();
    }

    public final cOR AhwBna() {
        return (cOR) OLrzqt.getValue();
    }

    public final AbstractC58260yxt<Unit> values(@NotNull final java.util.List<CustomChainMeta> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.util.List<CustomChainMetaStatusEntity>> abstractC58260yxtKWHzl = KWHzl().KWHzl(yBP.AEQbTJ());
        AbstractC58260yxt<java.util.List<CustomChainMetaEntity>> abstractC58260yxtKWHzl2 = AhwBna().EZpvd().KWHzl(yBP.AEQbTJ());
        AbstractC58260yxt<java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>>> abstractC58260yxtKWHzl3 = djBIcL().KWHzl(yBP.AEQbTJ());
        final yHO yho = new yHO() { // from class: o.bsN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C10639bsJ.copydefault(list, (java.util.List) obj, (java.util.List) obj2, (java.util.List) obj3);
            }
        };
        AbstractC58260yxt abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(abstractC58260yxtKWHzl, abstractC58260yxtKWHzl2, abstractC58260yxtKWHzl3, new InterfaceC58228yxN() { // from class: o.bsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C10639bsJ.EZpvd(yho, obj, obj2, obj3);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bsO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.OLrzqt((java.util.Map) obj);
            }
        };
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.bsK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.sSMYrx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.util.Map EZpvd(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (java.util.Map) yho.invoke(obj, obj2, obj3);
    }

    public static final java.util.Map copydefault(final java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = CollectionsKt___CollectionsKt.QVAiDq(list).iterator();
        while (true) {
            java.lang.Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            CustomChainMeta customChainMeta = (CustomChainMeta) it.next();
            java.util.Iterator it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                CustomChainMetaEntity customChainMetaEntity = (CustomChainMetaEntity) next2;
                if (customChainMetaEntity.getChainId() == customChainMeta.EZpvd() && customChainMetaEntity.getFromCustom() == 0) {
                    break;
                }
            }
            CustomChainMetaEntity customChainMetaEntity2 = (CustomChainMetaEntity) next2;
            customChainMeta.OLrzqt(customChainMetaEntity2 != null ? customChainMetaEntity2.getCreateAt() : jCurrentTimeMillis);
            customChainMeta.EZpvd(jCurrentTimeMillis);
            arrayList3.add(customChainMeta.copydefault());
            java.util.Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                java.lang.Object next3 = it3.next();
                if (customChainMeta.EZpvd() == ((CustomChainMetaStatusEntity) next3).getChainId()) {
                    obj = next3;
                    break;
                }
            }
            CustomChainMetaStatusEntity customChainMetaStatusEntity = (CustomChainMetaStatusEntity) obj;
            if (customChainMetaStatusEntity == null || customChainMetaStatusEntity.getUsed() == CustomChainStatus.NotEdit.getValue() || customChainMeta.gEmmrt() == 1 || (customChainMeta.gEmmrt() == 2 && customChainMetaStatusEntity.getUsed() != CustomChainStatus.Delete.getValue())) {
                arrayList2.add(customChainMeta.copydefault());
                arrayList.add(new CustomChainMetaStatusEntity(customChainMeta.EZpvd(), CustomChainStatus.NotEdit.getValue()));
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it4 = C59467zhb.DbNXlk(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list2), new Function1() { // from class: o.btx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C10639bsJ.KWHzl((CustomChainMetaStatusEntity) obj2));
            }
        }), new Function1() { // from class: o.btC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C10639bsJ.copydefault(list, (CustomChainMetaStatusEntity) obj2));
            }
        }).iterator();
        while (it4.hasNext()) {
            arrayList4.add(java.lang.Long.valueOf(((CustomChainMetaStatusEntity) it4.next()).getChainId()));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it5 = list3.iterator();
        while (it5.hasNext()) {
            CustomChainMetaEntity customChainMetaEntity3 = (CustomChainMetaEntity) it5.next();
            if (!hashSet.contains(java.lang.Long.valueOf(customChainMetaEntity3.getChainId())) && customChainMetaEntity3.getFromCustom() == 0) {
                hashSet.add(java.lang.Long.valueOf(customChainMetaEntity3.getChainId()));
            }
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            hashSet.remove(java.lang.Long.valueOf(((CustomChainMeta) it6.next()).EZpvd()));
        }
        pUU.KWHzl("CustomChainMetaManager", "needHandleChainIdList = " + hashSet.size() + " -- " + hashSet);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list3) {
            CustomChainMetaEntity customChainMetaEntity4 = (CustomChainMetaEntity) obj2;
            if (customChainMetaEntity4.getFromCustom() == 0) {
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it7.next();
                    CustomChainMeta customChainMeta2 = (CustomChainMeta) next;
                    if (customChainMeta2.EZpvd() == customChainMetaEntity4.getChainId() && Intrinsics.EZpvd((java.lang.Object) customChainMeta2.isConnected(), (java.lang.Object) customChainMetaEntity4.getRpcUrl())) {
                        break;
                    }
                }
                if (next == null) {
                    arrayList5.add(obj2);
                }
            }
        }
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("defaultChainCoins", arrayList3), C56390yDp.OLrzqt("needAddAndUpdateChains", arrayList2), C56390yDp.OLrzqt("needAddAndUpdateStatus", arrayList), C56390yDp.OLrzqt("needDeleteChainIds", arrayList4), C56390yDp.OLrzqt("walletAddresses", list4), C56390yDp.OLrzqt("needHandleChainIdList", hashSet), C56390yDp.OLrzqt("needRemoveServerErrorList", arrayList5));
    }

    public static final boolean KWHzl(CustomChainMetaStatusEntity customChainMetaStatusEntity) {
        Intrinsics.checkNotNullParameter(customChainMetaStatusEntity, "");
        return customChainMetaStatusEntity.getUsed() == CustomChainStatus.NotEdit.getValue();
    }

    public static final boolean copydefault(java.util.List list, CustomChainMetaStatusEntity customChainMetaStatusEntity) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(customChainMetaStatusEntity, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CustomChainMeta) next).EZpvd() == customChainMetaStatusEntity.getChainId()) {
                break;
            }
        }
        return next == null;
    }

    public static final InterfaceC58261yxu sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(final java.util.Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("needHandleChainIdList");
        Intrinsics.copydefault(obj, "");
        final java.util.HashSet hashSet = (java.util.HashSet) obj;
        java.lang.Object obj2 = map.get("needRemoveServerErrorList");
        Intrinsics.copydefault(obj2, "");
        final java.util.List list = (java.util.List) obj2;
        cOR corAhwBna = EZpvd.AhwBna();
        java.lang.Object obj3 = map.get("needAddAndUpdateChains");
        Intrinsics.copydefault(obj3, "");
        java.lang.Object obj4 = map.get("needAddAndUpdateStatus");
        Intrinsics.copydefault(obj4, "");
        java.lang.Object obj5 = map.get("needDeleteChainIds");
        Intrinsics.copydefault(obj5, "");
        java.lang.Object obj6 = map.get("walletAddresses");
        Intrinsics.copydefault(obj6, "");
        AbstractC58260yxt<Unit> abstractC58260yxtEZpvd = corAhwBna.EZpvd((java.util.ArrayList) obj3, (java.util.ArrayList) obj4, (java.util.ArrayList) obj5, (java.util.List) obj6);
        final Function1 function1 = new Function1() { // from class: o.bta
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj7) {
                return C10639bsJ.AEQbTJ(hashSet, (Unit) obj7);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.bte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj7) {
                return C10639bsJ.zsXlph(function1, obj7);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.btg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj7) {
                return C10639bsJ.EZpvd(list, (Unit) obj7);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj7) {
                return C10639bsJ.zuBGHE(function12, obj7);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.btf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj7) {
                return C10639bsJ.KWHzl(map, (Unit) obj7);
            }
        };
        return abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.bth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj7) {
                return C10639bsJ.AxsJAY(function13, obj7);
            }
        });
    }

    public static final InterfaceC58261yxu zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(java.util.HashSet hashSet, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        if ((!hashSet.isEmpty()) && !SPUtils.getBoolean("fix_custom_status_from_user_issue", false)) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = EZpvd.AhwBna().OLrzqt((java.util.HashSet<java.lang.Long>) hashSet);
            final Function1 function1 = new Function1() { // from class: o.btA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10639bsJ.EZpvd((java.lang.Integer) obj);
                }
            };
            return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bsG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10639bsJ.AubY(function1, obj);
                }
            }).AhwBna(new InterfaceC58229yxO() { // from class: o.bsH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10639bsJ.copydefault((java.lang.Throwable) obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(Unit.INSTANCE);
    }

    public static final Unit AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        SPUtils.put("fix_custom_status_from_user_issue", java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("CustomChainMetaManager", "error message : " + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(java.util.List list, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            return EZpvd.AhwBna().EZpvd((java.util.List<CustomChainMetaEntity>) list);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(Unit.INSTANCE);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(java.util.Map map, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        cOR corAhwBna = EZpvd.AhwBna();
        java.lang.Object obj = map.get("defaultChainCoins");
        Intrinsics.copydefault(obj, "");
        java.lang.Object obj2 = map.get("walletAddresses");
        Intrinsics.copydefault(obj2, "");
        return corAhwBna.AEQbTJ((java.util.ArrayList) obj, (java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>>) obj2).AhwBna(new InterfaceC58229yxO() { // from class: o.btp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj3) {
                return C10639bsJ.EZpvd((java.lang.Throwable) obj3);
            }
        });
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("CustomChainMetaManager", "insertCustomWalletDefaultCoinsInCallThread error message : " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> DbNXlk(@NotNull java.util.List<CustomChainMeta> list) {
        int value;
        Intrinsics.checkNotNullParameter(list, "");
        cOR corAhwBna = AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CustomChainMeta customChainMeta : list) {
            long jEZpvd = customChainMeta.EZpvd();
            if (customChainMeta.AhwBna()) {
                value = CustomChainStatus.Edit.getValue();
            } else {
                value = CustomChainStatus.NotEdit.getValue();
            }
            arrayList.add(new CustomChainMetaStatusEntity(jEZpvd, value));
        }
        return corAhwBna.OLrzqt(arrayList);
    }

    public final AbstractC58260yxt<java.util.List<CustomChainMetaStatusEntity>> KWHzl() {
        return AhwBna().copydefault();
    }

    public final AbstractC58260yxt<Unit> AEQbTJ(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AhwBna().KWHzl(j, str);
    }

    public final AbstractC58185ywX<java.lang.Boolean> EZpvd(@NotNull CustomChainMeta customChainMeta) {
        Intrinsics.checkNotNullParameter(customChainMeta, "");
        customChainMeta.OLrzqt(java.lang.System.currentTimeMillis());
        final CustomChainMetaEntity customChainMetaEntityCopydefault = customChainMeta.copydefault();
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(djBIcL());
        final Function1 function1 = new Function1() { // from class: o.bsY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.OLrzqt(customChainMetaEntityCopydefault, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.btb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.AuCTelauCTel(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.btd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.OLrzqt((Unit) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.bsZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.wlaJM(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC58261yxu AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(CustomChainMetaEntity customChainMetaEntity, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return EZpvd.AhwBna().AEQbTJ(customChainMetaEntity, (java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>>) list);
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C10598brV.AEQbTJ.EZpvd(false);
    }

    public static final java.util.List getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>>> djBIcL() {
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtFetchVPNInfo = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().fetchVPNInfo();
        final Function1 function1 = new Function1() { // from class: o.btl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.AhwBna((java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtFetchVPNInfo.copydefault(new InterfaceC58229yxO() { // from class: o.btj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.getNewProxyInstance(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.btq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.djBIcL((java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>>> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.btr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.getFieldNames(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final java.util.List getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List djBIcL(java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<Triple> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            java.util.Iterator<T> it2 = abstractC12782ctV.giSNqX().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((ChainAddress) next).getCoinId() == 3) {
                    break;
                }
            }
            ChainAddress chainAddress = (ChainAddress) next;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (chainAddress != null ? chainAddress.getAddress() : null))) {
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                boolean zZuWLRA = abstractC12782ctV.zuWLRA();
                Intrinsics.copydefault(chainAddress);
                arrayList.add(new Triple(strDbNXlk, java.lang.Boolean.valueOf(zZuWLRA), chainAddress));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (Triple triple : arrayList) {
            arrayList2.add(new Triple(triple.getFirst(), triple.getSecond(), new ChainAddressEntity((java.lang.String) triple.getFirst(), ((ChainAddress) triple.getThird()).getCoinId(), ((ChainAddress) triple.getThird()).getAddress(), ((ChainAddress) triple.getThird()).getAddressType(), ((ChainAddress) triple.getThird()).getPublicKey(), ((ChainAddress) triple.getThird()).getDerivePath(), null, null, 192, null)));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    public final AbstractC58185ywX<java.lang.Boolean> OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC58260yxt<Unit> abstractC58260yxtKWHzl = AhwBna().KWHzl(j, str, str2, str3, str4, java.lang.System.currentTimeMillis());
        final Function1 function1 = new Function1() { // from class: o.bsF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.valueOf((Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bsI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.AwvSrB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd valueOf(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C10598brV.AEQbTJ.EZpvd(false);
    }

    public final AbstractC58260yxt<Unit> isConnected(@NotNull java.util.List<kotlin.Pair<java.lang.Long, java.lang.Long>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return AhwBna().AEQbTJ(list);
    }

    public static final java.lang.Boolean hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public final AbstractC58185ywX<java.lang.Boolean> EZpvd(long j, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = AhwBna().OLrzqt(j, str);
        final Function1 function1 = new Function1() { // from class: o.bsV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.EZpvd((Unit) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bsW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.hDKMBd(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final java.util.List iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta>> */
    public final AbstractC58260yxt<java.util.List<CustomChainMeta>> AEQbTJ() {
        AbstractC58260yxt<java.util.List<cSW>> abstractC58260yxtValueOf = AhwBna().valueOf();
        final Function1 function1 = new Function1() { // from class: o.btc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.valueOf((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.btm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.iwGUEr(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta>> */
    public final AbstractC58260yxt<java.util.List<CustomChainMeta>> OLrzqt() {
        AbstractC58260yxt<java.util.List<cSW>> abstractC58260yxtOLrzqt = AhwBna().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.bsU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.AYXKKw((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bsX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.uzCIH(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta>> */
    public final AbstractC58260yxt<java.util.List<CustomChainMeta>> KWHzl(java.lang.Long l, java.lang.String str) {
        AbstractC58260yxt<java.util.List<cSW>> abstractC58260yxtAEQbTJ = AhwBna().AEQbTJ(l, str);
        final Function1 function1 = new Function1() { // from class: o.btn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.gEmmrt((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.btk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CustomChainMeta AEQbTJ(cSW csw) {
        CustomChainMeta customChainMeta;
        CustomChainMeta customChainMeta2 = customChainMeta;
        CustomChainMeta customChainMeta3 = new CustomChainMeta(csw.EZpvd(), csw.values(), csw.KWHzl(), csw.fetchVPNInfo(), C11600cUg.KWHzl(csw.DbNXlk()), 0, csw.AuCTel(), csw.AkhnZx(), csw.AhwBna(), csw.djBIcL(), csw.fJNWhG(), null, null, 6144, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listKWHzl = C11600cUg.KWHzl(csw.copydefault(), ",", new Function1() { // from class: o.bsL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C10639bsJ.gEmmrt((java.lang.String) obj));
            }
        });
        arrayList.add(listKWHzl);
        java.util.List<java.lang.String> listCopydefault = C11600cUg.copydefault(csw.fIwbmz(), ",");
        arrayList.add(listCopydefault);
        java.util.List<java.lang.String> listCopydefault2 = C11600cUg.copydefault(csw.isConnected(), ",");
        arrayList.add(listCopydefault2);
        java.util.List<java.lang.String> listCopydefault3 = C11600cUg.copydefault(csw.gEmmrt(), ",");
        arrayList.add(listCopydefault3);
        java.util.List listKWHzl2 = C11600cUg.KWHzl(csw.OLrzqt(), ",", new Function1() { // from class: o.bsQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C10639bsJ.AhwBna((java.lang.String) obj));
            }
        });
        arrayList.add(listKWHzl2);
        java.util.List listKWHzl3 = C11600cUg.KWHzl(csw.AEQbTJ(), ",", new Function1() { // from class: o.bsR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C10639bsJ.djBIcL((java.lang.String) obj));
            }
        });
        arrayList.add(listKWHzl3);
        java.util.List listKWHzl4 = C11600cUg.KWHzl(csw.AYXKKw(), ",", new Function1() { // from class: o.bsT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C10639bsJ.valueOf((java.lang.String) obj));
            }
        });
        arrayList.add(listKWHzl4);
        java.util.List listKWHzl5 = C11600cUg.KWHzl(csw.valueOf(), ",", new Function1() { // from class: o.bsP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C10639bsJ.AYXKKw((java.lang.String) obj));
            }
        });
        arrayList.add(listKWHzl5);
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((java.util.List) it.next()).size() != listKWHzl.size()) {
                    break;
                }
            }
            int i = 0;
            while (r0.hasNext()) {
            }
        } else {
            int i2 = 0;
            for (java.lang.Object obj : listKWHzl) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                CustomChainCoinMeta customChainCoinMeta = new CustomChainCoinMeta(customChainMeta2.EZpvd(), customChainMeta2.fetchVPNInfo(), ((java.lang.Number) obj).longValue(), listCopydefault.get(i2), customChainMeta2.OLrzqt(), customChainMeta2.OLrzqt(), listCopydefault2.get(i2), listCopydefault3.get(i2), ((java.lang.Number) listKWHzl2.get(i2)).longValue(), ((java.lang.Number) listKWHzl3.get(i2)).intValue(), ((java.lang.Number) listKWHzl4.get(i2)).intValue(), ((java.lang.Number) listKWHzl5.get(i2)).longValue(), null, null, 12288, null);
                if ((customChainCoinMeta.AYXKKw() & 1) != 0) {
                    customChainMeta = customChainMeta2;
                    customChainMeta.AEQbTJ(customChainCoinMeta);
                } else {
                    customChainMeta = customChainMeta2;
                    customChainMeta.KWHzl().add(customChainCoinMeta);
                }
                i2++;
                customChainMeta2 = customChainMeta;
            }
        }
        return customChainMeta2;
    }

    public static final long gEmmrt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Long.parseLong(str);
    }

    public static final long AhwBna(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Long.parseLong(str);
    }

    public static final int djBIcL(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Integer.parseInt(str);
    }

    public static final int valueOf(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Integer.parseInt(str);
    }

    public static final long AYXKKw(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Long.parseLong(str);
    }

    public final AbstractC58185ywX<java.lang.Boolean> KWHzl(@NotNull CustomChainMeta customChainMeta, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i) {
        Intrinsics.checkNotNullParameter(customChainMeta, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final long jEZpvd = xYW.AEQbTJ.EZpvd(customChainMeta.fetchVPNInfo(), str3);
        long jEZpvd2 = customChainMeta.EZpvd();
        long jFetchVPNInfo = customChainMeta.fetchVPNInfo();
        java.lang.String strOLrzqt = C9700baY.OLrzqt(C33129mqd.gEmmrt(C59454zhO.wlaJM(str)));
        CustomChainCoinMeta customChainCoinMetaDjBIcL = customChainMeta.djBIcL();
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(AhwBna().KWHzl(new CustomChainCoinMetaEntity(jEZpvd2, jFetchVPNInfo, jEZpvd, str, str2, strOLrzqt, str3, customChainCoinMetaDjBIcL != null ? customChainCoinMetaDjBIcL.valueOf() : 0L, 0, i, java.lang.System.currentTimeMillis())));
        final Function1 function1 = new Function1() { // from class: o.bto
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.AEQbTJ(jEZpvd, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.bts
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.ejfBZ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.btu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.KWHzl((java.lang.Long) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.btw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.fJNWhG(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC58261yxu ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(final long j, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.btt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10639bsJ.KWHzl(j, (AbstractC12782ctV) obj);
            }
        };
        return abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.btv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10639bsJ.AuCTel(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(long j, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return abstractC12782ctV.getNewProxyInstance(j);
    }

    public static final InterfaceC60096zvd fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return C10598brV.AEQbTJ.EZpvd(false);
    }

    public static final java.util.List AhwBna(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            if (abstractC12782ctV.AubY() || abstractC12782ctV.ORxRYg() || abstractC12782ctV.AwvSrB()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List valueOf(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd.AEQbTJ((cSW) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List AYXKKw(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd.AEQbTJ((cSW) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List gEmmrt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd.AEQbTJ((cSW) it.next()));
        }
        return arrayList;
    }
}
