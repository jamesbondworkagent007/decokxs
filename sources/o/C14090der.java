package o;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.InternalChainAddressNew;
import com.okinc.business.defi.biz.net.bean.SyncRespBatch;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqNew;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqs;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.WalletAddressList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10604brb;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13058cyg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.der, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14090der {
    public static final C14090der OLrzqt = new C14090der();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.deG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14090der.KWHzl();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.deF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C14090der.copydefault();
        }
    });
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer AEQbTJ(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.ArrayList OLrzqt(java.util.ArrayList arrayList, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.ArrayList OLrzqt(java.util.ArrayList arrayList, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean copydefault(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return java.lang.Boolean.TRUE;
    }

    private C14090der() {
    }

    public static final cPO KWHzl() {
        return new cPO(C9678baC.Companion.AEQbTJ());
    }

    public final cPO AYXKKw() {
        return (cPO) EZpvd.getValue();
    }

    public static final android.os.Handler copydefault() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final android.os.Handler OLrzqt() {
        return (android.os.Handler) KWHzl.getValue();
    }

    public final AbstractC58185ywX<java.lang.Boolean> EZpvd(@NotNull final java.util.List<? extends Triple<? extends AbstractC12782ctV, C12821cuH, ChainAddressEntity>> list, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return KWHzl(new Function0() { // from class: o.deE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14090der.OLrzqt(str, str2, list);
            }
        }, list.size());
    }

    public static final AbstractC58260yxt OLrzqt(java.lang.String str, java.lang.String str2, java.util.List list) {
        return OLrzqt.EZpvd(str, str2, (java.util.List<? extends Triple<? extends AbstractC12782ctV, C12821cuH, ChainAddressEntity>>) list);
    }

    public final AbstractC58260yxt<java.util.List<WalletRepairEntity>> EZpvd(final java.lang.String str, final java.lang.String str2, final java.util.List<? extends Triple<? extends AbstractC12782ctV, C12821cuH, ChainAddressEntity>> list) {
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str);
        final Function2 function2 = new Function2() { // from class: o.deU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14090der.copydefault(str, (java.util.List) obj, (java.lang.String) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtFetchAllWallets$default, abstractC58260yxtAhwBna, new InterfaceC58223yxI() { // from class: o.dfb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14090der.copydefault(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.deq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.KWHzl(list, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dev
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.getFieldNames(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.OLrzqt(str2, (java.util.ArrayList) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.deu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.AuCTelauCTel(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.EZpvd((java.util.ArrayList) obj);
            }
        };
        AbstractC58260yxt<java.util.List<WalletRepairEntity>> abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.dew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.zLjUOn(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt4, "");
        return abstractC58260yxtOLrzqt4;
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final InterfaceC58261yxu getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(java.util.List list, java.lang.String str, kotlin.Pair pair) {
        C10854bwM c10854bwM;
        java.lang.Object next;
        java.util.Iterator it;
        java.util.Iterator it2;
        CoinAddressBean coinAddressBean;
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List list2 = (java.util.List) pair.getFirst();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.lang.String str2 = (java.lang.String) second;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList<WalletRepairEntity> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<C12821cuH> arrayList3 = new java.util.ArrayList<>();
        java.util.HashMap<java.lang.String, java.util.List<ChainAddressEntity>> map = new java.util.HashMap<>();
        java.util.ArrayList<ChainAddressEntity> arrayList4 = new java.util.ArrayList<>();
        C10854bwM fieldNames = C10954byG.EZpvd.valueOf().getFieldNames();
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Triple triple = (Triple) it3.next();
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) triple.getFirst();
            C12821cuH c12821cuH = (C12821cuH) triple.getSecond();
            ChainAddressEntity chainAddressEntity = (ChainAddressEntity) triple.getThird();
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, fieldNames != null ? fieldNames.AhwBna() : -1L, null, 2, null);
            if (chainAddressAddressFromChainId$default == null) {
                c10854bwM = fieldNames;
            } else {
                java.lang.String strAEQbTJ = xXW.OLrzqt.AEQbTJ(str, str2, abstractC12782ctV.RlQdEF(), true);
                c10854bwM = fieldNames;
                java.util.Iterator it4 = C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null).copydefault(abstractC12782ctV, strAEQbTJ, yEE.djBIcL(chainAddressAddressFromChainId$default)).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    WalletAddressList walletAddressList = (WalletAddressList) next;
                    if (chainAddressAddressFromChainId$default.getChainId() != walletAddressList.getChainId() || (coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressList.getAddressList())) == null) {
                        it2 = it4;
                    } else {
                        it2 = it4;
                        if (chainAddressAddressFromChainId$default.getAddressType() == coinAddressBean.getType()) {
                            break;
                        }
                    }
                    it4 = it2;
                }
                WalletAddressList walletAddressList2 = (WalletAddressList) next;
                if (walletAddressList2 != null) {
                    it = it3;
                    C12762ctB c12762ctBGenerateBaseChainSign$default = C13058cyg.generateBaseChainSign$default(C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null), abstractC12782ctV, strAEQbTJ, chainAddressAddressFromChainId$default.getPublicKey(), null, 8, null);
                    arrayList.add(abstractC12782ctV.DbNXlk());
                    java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                    int value = IdentifierType.IDENTIFIER_TYPE_NOSTR_FIX.getValue();
                    int value2 = IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSUNFIX.getValue();
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.String json = new Gson().toJson(new C11283cIm(AddressType.Legacy.getValue(), C11600cUg.copydefault(java.lang.Long.valueOf(chainAddressAddressFromChainId$default.getChainId())), walletAddressList2.getSignature(), c12762ctBGenerateBaseChainSign$default.KWHzl(), c12762ctBGenerateBaseChainSign$default.copydefault()));
                    Intrinsics.checkNotNullExpressionValue(json, "");
                    arrayList2.add(new WalletRepairEntity(strDbNXlk, value, value2, null, json, jCurrentTimeMillis, 8, null));
                    java.lang.String strAkhnZx = c12821cuH.AkhnZx();
                    pUU.EZpvd("zqh", java.lang.String.valueOf(C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx) && C59449zhJ.AEQbTJ((java.lang.CharSequence) strAkhnZx, (java.lang.CharSequence) xXW.OLrzqt.AEQbTJ(str, str2, c12821cuH.copydefault(), true))));
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx) && !CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) list2), strAkhnZx)) {
                        arrayList2.add(new WalletRepairEntity(c12821cuH.AhwBna(), IdentifierType.IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE.getValue(), IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT.getValue(), null, null, java.lang.System.currentTimeMillis(), 24, null));
                        arrayList3.add(c12821cuH);
                        map.put(c12821cuH.AhwBna(), c12821cuH.AYXKKw());
                    }
                    arrayList4.add(chainAddressEntity);
                }
                fieldNames = c10854bwM;
                it3 = it;
            }
            it = it3;
            fieldNames = c10854bwM;
            it3 = it;
        }
        arrayList2.size();
        arrayList4.size();
        arrayList3.size();
        map.size();
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = new C13115czk(null, 1, 0 == true ? 1 : 0).copydefault(arrayList2, arrayList4, arrayList3, map);
        final Function1 function1 = new Function1() { // from class: o.deD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.OLrzqt(arrayList2, (Unit) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.deB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.uzCIH(function1, obj);
            }
        });
    }

    public static final java.util.ArrayList uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(final java.lang.String str, final java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(WalletType.KeyWallet);
        final Function1 function1 = new Function1() { // from class: o.des
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.copydefault(arrayList, str, (java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.det
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.getNewProxyInstance(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(final java.util.ArrayList arrayList, java.lang.String str, java.util.List list) {
        final AbstractC12782ctV abstractC12782ctV;
        java.util.List<AbstractC12782ctV> listKWHzl;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (abstractC12784ctX == null || (listKWHzl = abstractC12784ctX.KWHzl()) == null) {
            abstractC12782ctV = null;
        } else {
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) next;
                C10854bwM fieldNames = C10954byG.EZpvd.valueOf().getFieldNames();
                ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, fieldNames != null ? fieldNames.AEQbTJ() : -1L, null, 2, null);
                java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
                if (C59449zhJ.AEQbTJ((java.lang.CharSequence) address, (java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) address)) {
                    break;
                }
            }
            abstractC12782ctV = (AbstractC12782ctV) next;
        }
        boolean z = abstractC12782ctV != null;
        if (z) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(abstractC12782ctV.DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.deL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14090der.KWHzl(abstractC12782ctV, arrayList, (java.lang.Integer) obj);
                }
            };
            return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.deK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C14090der.hDKMBd(function1, obj);
                }
            });
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC58260yxt.copydefault(arrayList);
    }

    public static final java.util.ArrayList hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList KWHzl(AbstractC12782ctV abstractC12782ctV, java.util.ArrayList arrayList, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        pUU.EZpvd("zqh", "set " + abstractC12782ctV.AkhnZx() + " mainWallet");
        return arrayList;
    }

    public static final InterfaceC58261yxu zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(final java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.deA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.OLrzqt(arrayList, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.deR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.wlaJM(function1, obj);
            }
        });
    }

    public static final java.util.ArrayList wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public final boolean AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C10854bwM fieldNames = C10954byG.EZpvd.valueOf().getFieldNames();
        return fieldNames != null && abstractC12782ctV.AwvSrB() && abstractC12782ctV.AhwBna(java.lang.Long.valueOf(fieldNames.AhwBna()));
    }

    public static final InterfaceC60096zvd fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<java.lang.Boolean> KWHzl(Function0<? extends AbstractC58260yxt<java.util.List<WalletRepairEntity>>> function0, final int i) {
        AbstractC58185ywX<java.util.List<WalletRepairEntity>> abstractC58185ywXEZpvd = function0.invoke().EZpvd();
        final Function1 function1 = new Function1() { // from class: o.deM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.EZpvd((java.util.List) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.deN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.fIwbmz(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.deJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.copydefault(i, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.deQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.iwGUEr(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.EZpvd("zqh", "before use batch sync interface needFixHDWalletIdList " + list.size() + " ");
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = OLrzqt.OLrzqt((java.util.List<WalletRepairEntity>) list);
        final Function1 function1 = new Function1() { // from class: o.deT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.EZpvd((java.lang.Integer) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.deV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.ejfBZ(function1, obj);
            }
        });
    }

    public static final java.lang.Integer ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer EZpvd(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        pUU.EZpvd("zqh", "after use batch sync interface syncSuccessCount " + num + " ");
        return num;
    }

    public static final InterfaceC60096zvd iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(int i, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        pUU.EZpvd("zqh", "use batch sync interface final fixSize " + num + " -- needFixWalletSize =" + i);
        if (num.intValue() == i) {
            AbstractC58185ywX<java.lang.Long> abstractC58185ywXEZpvd = OLrzqt.AYXKKw().KWHzl("okw_all_wallet_nostr_fixed_status", "true").EZpvd();
            final Function1 function1 = new Function1() { // from class: o.deX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14090der.copydefault((java.lang.Long) obj);
                }
            };
            return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.deW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C14090der.fJNWhG(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
    }

    public static final java.lang.Boolean fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<java.lang.Integer> OLrzqt(@NotNull final java.util.List<WalletRepairEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.EZpvd(list, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.deC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.fARcdN(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final java.lang.Integer values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final void copydefault(ResponseData responseData) {
        C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public static final kotlin.Pair copydefault(java.lang.String str, java.util.List list, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (OLrzqt.AEQbTJ((AbstractC12782ctV) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(xXW.OLrzqt.AEQbTJ(str, str2, ((AbstractC12782ctV) it.next()).RlQdEF(), true));
        }
        return C56390yDp.OLrzqt(arrayList2, str2);
    }

    public static final InterfaceC60096zvd KWHzl(java.util.List list, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0) {
            if (responseData.getCode() == 900003) {
                C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null).KWHzl().AEQbTJ(null, responseData.getMsg());
            } else if (responseData.getCode() == 10007) {
                OLrzqt.OLrzqt().post(new java.lang.Runnable() { // from class: o.deS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14090der.copydefault(responseData);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(-1);
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC12782ctV) it.next()).copydefault(IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSFIXED);
        }
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).gHZMYf(list).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.deP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14090der.AEQbTJ((java.lang.Integer) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.deO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14090der.values(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd EZpvd(java.util.List list, java.util.List list2) {
        C11283cIm c11283cIm;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WalletRepairEntity) it.next()).getWalletId());
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            if (abstractC12782ctV.AubY() && arrayList.contains(abstractC12782ctV.DbNXlk())) {
                arrayList2.add(obj);
            }
        }
        C10854bwM fieldNames = C10954byG.EZpvd.valueOf().getFieldNames();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) it2.next();
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, fieldNames != null ? fieldNames.AhwBna() : -1L, null, 2, null);
            try {
                c11283cIm = (C11283cIm) new Gson().fromJson(abstractC12782ctV2.OqFWZa(), C11283cIm.class);
            } catch (java.lang.Exception unused) {
                c11283cIm = null;
            }
            if (c11283cIm != null && chainAddressAddressFromChainId$default != null) {
                java.lang.String strDbNXlk = abstractC12782ctV2.DbNXlk();
                java.lang.String address = chainAddressAddressFromChainId$default.getAddress();
                int value = AddressType.Legacy.getValue();
                java.lang.String publicKey = chainAddressAddressFromChainId$default.getPublicKey();
                java.lang.String strOLrzqt = c11283cIm.OLrzqt();
                java.lang.String strAEQbTJ = c11283cIm.AEQbTJ();
                java.lang.Long lEZpvd = c11283cIm.EZpvd();
                java.lang.Long[] lArr = new java.lang.Long[1];
                lArr[0] = java.lang.Long.valueOf(C11600cUg.copydefault(fieldNames != null ? java.lang.Long.valueOf(fieldNames.fetchVPNInfo()) : null));
                arrayList3.add(new SyncWalletReqNew(strDbNXlk, C56402yEa.EZpvd(new InternalChainAddressNew(address, (java.lang.String) null, (java.lang.String) null, value, 1, lEZpvd, strAEQbTJ, publicKey, strOLrzqt, yDY.copydefault(lArr), 6, (DefaultConstructorMarker) null)), yDY.AhwBna()));
            }
        }
        if (arrayList3.isEmpty()) {
            return AbstractC58185ywX.KWHzl(-1);
        }
        SyncWalletReqs syncWalletReqs = new SyncWalletReqs(WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna(), false, (java.util.List) arrayList3, 2, (DefaultConstructorMarker) null);
        AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AEQbTJ(arrayList2, kotlin.random.Random.Default);
        AbstractC58185ywX<ResponseData<SyncRespBatch>> abstractC58185ywXAEQbTJ = new C13934dbu().AEQbTJ(abstractC12782ctV3.USBtdM(), abstractC12782ctV3.DbNXlk(), syncWalletReqs, abstractC12782ctV3.aUsmxb());
        final Function1 function1 = new Function1() { // from class: o.deI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C14090der.KWHzl(arrayList2, (ResponseData) obj2);
            }
        };
        return abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.deH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C14090der.AuCTel(function1, obj2);
            }
        });
    }
}
