package o;

import com.okinc.business.defi.biz.core.wallet.create.WalletSignManager$insertOrUpdateSyncData$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSignManager$suppleCreateDataIfNeed$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSignManager$suppleCreateSignDataIfNeed$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSignManager$suppleSyncDataIfNeed$1;
import com.okinc.business.defi.biz.core.wallet.create.WalletSignManager$suppleSyncSignDataIfNeed$1;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.InternalChainAddressNew;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.HDWalletCoin;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.wallet.core.sign.SignParams;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cyg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13058cyg {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final C10948byA EZpvd;
    public final cSM OLrzqt;
    public final cQM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List AEQbTJ(java.util.List list, java.util.List list2, Unit unit) {
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(unit, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List AEQbTJ(java.util.List list, Unit unit, Unit unit2) {
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(unit2, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List EZpvd(java.util.List list, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return list;
    }

    public C13058cyg(@NotNull cSM csm, @NotNull cQM cqm, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(csm, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.OLrzqt = csm;
        this.copydefault = cqm;
        this.EZpvd = c10948byA;
    }

    /* JADX INFO: renamed from: o.cyg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cyg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C13058cyg getInstance$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.copydefault(context);
        }

        public final C13058cyg copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).RJOkX();
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<C11291cIu> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return this.OLrzqt.KWHzl(list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<C11283cIm> list, @NotNull java.util.List<C11283cIm> list2, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) throws java.lang.Throwable {
        WalletSignManager$insertOrUpdateSyncData$1 walletSignManager$insertOrUpdateSyncData$1;
        C13058cyg c13058cyg;
        if (continuation instanceof WalletSignManager$insertOrUpdateSyncData$1) {
            walletSignManager$insertOrUpdateSyncData$1 = (WalletSignManager$insertOrUpdateSyncData$1) continuation;
            int i = walletSignManager$insertOrUpdateSyncData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSignManager$insertOrUpdateSyncData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSignManager$insertOrUpdateSyncData$1 = new WalletSignManager$insertOrUpdateSyncData$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = walletSignManager$insertOrUpdateSyncData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSignManager$insertOrUpdateSyncData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            cSM csm = this.OLrzqt;
            java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(str);
            walletSignManager$insertOrUpdateSyncData$1.L$0 = this;
            walletSignManager$insertOrUpdateSyncData$1.L$1 = str;
            walletSignManager$insertOrUpdateSyncData$1.L$2 = list;
            walletSignManager$insertOrUpdateSyncData$1.L$3 = list2;
            walletSignManager$insertOrUpdateSyncData$1.label = 1;
            objOLrzqt = csm.OLrzqt(listEZpvd, walletSignManager$insertOrUpdateSyncData$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c13058cyg = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objOLrzqt);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (java.util.List) walletSignManager$insertOrUpdateSyncData$1.L$3;
            list = (java.util.List) walletSignManager$insertOrUpdateSyncData$1.L$2;
            str = (java.lang.String) walletSignManager$insertOrUpdateSyncData$1.L$1;
            c13058cyg = (C13058cyg) walletSignManager$insertOrUpdateSyncData$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        C11288cIr c11288cIr = (C11288cIr) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objOLrzqt);
        cSM csm2 = c13058cyg.OLrzqt;
        java.util.List<C11283cIm> listEZpvd2 = c11288cIr != null ? c11288cIr.EZpvd() : null;
        if (listEZpvd2 == null) {
            listEZpvd2 = yDY.AhwBna();
        }
        java.util.List<C11283cIm> listKWHzl = c13058cyg.KWHzl(listEZpvd2, list);
        java.util.List<C11283cIm> listKWHzl2 = c11288cIr != null ? c11288cIr.KWHzl() : null;
        if (listKWHzl2 == null) {
            listKWHzl2 = yDY.AhwBna();
        }
        java.util.List<C11288cIr> listEZpvd3 = C56402yEa.EZpvd(new C11288cIr(str, listKWHzl, c13058cyg.KWHzl(listKWHzl2, list2)));
        walletSignManager$insertOrUpdateSyncData$1.L$0 = null;
        walletSignManager$insertOrUpdateSyncData$1.L$1 = null;
        walletSignManager$insertOrUpdateSyncData$1.L$2 = null;
        walletSignManager$insertOrUpdateSyncData$1.L$3 = null;
        walletSignManager$insertOrUpdateSyncData$1.label = 2;
        objOLrzqt = csm2.EZpvd(listEZpvd3, walletSignManager$insertOrUpdateSyncData$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    public final java.util.List<C11283cIm> KWHzl(java.util.List<C11283cIm> list, java.util.List<C11283cIm> list2) {
        java.util.HashMap map = new java.util.HashMap();
        for (C11283cIm c11283cIm : list) {
            map.put(c11283cIm.copydefault() + "-" + c11283cIm.KWHzl(), c11283cIm);
        }
        for (C11283cIm c11283cIm2 : list2) {
            java.lang.String str = c11283cIm2.copydefault() + "-" + c11283cIm2.KWHzl();
            C11283cIm c11283cIm3 = (C11283cIm) map.get(str);
            if (c11283cIm3 == null) {
                map.put(str, c11283cIm2);
            } else {
                if (c11283cIm3.OLrzqt().length() == 0) {
                    c11283cIm3.EZpvd(c11283cIm2.OLrzqt());
                }
                java.lang.String strAEQbTJ = c11283cIm3.AEQbTJ();
                if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                    c11283cIm3.OLrzqt(c11283cIm2.AEQbTJ());
                    c11283cIm3.copydefault(c11283cIm2.EZpvd());
                }
            }
        }
        java.util.Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
    }

    public static /* synthetic */ java.util.List suppleAndGroupSignData$default(C13058cyg c13058cyg, java.lang.String str, java.util.List list, java.util.List list2, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c13058cyg.EZpvd(str, (java.util.List<ChainAddress>) list, (java.util.List<C11283cIm>) list2, z);
    }

    public final java.util.List<InternalChainAddressNew> EZpvd(@NotNull java.lang.String str, java.util.List<ChainAddress> list, java.util.List<C11283cIm> list2, boolean z) {
        java.lang.Object next;
        java.lang.String str2;
        java.lang.String publicKey;
        java.lang.String str3;
        java.lang.String pubKey;
        Intrinsics.checkNotNullParameter(str, "");
        if (list2 == null || list2.isEmpty() || list == null || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        for (C11283cIm c11283cIm : list2) {
            C10854bwM c10854bwMCopydefault = this.EZpvd.copydefault(c11283cIm.KWHzl());
            if (c10854bwMCopydefault != null) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ChainAddress chainAddress = (ChainAddress) next;
                    if (chainAddress.getChainId() == c11283cIm.KWHzl() && chainAddress.getAddressType() == c11283cIm.copydefault()) {
                        break;
                    }
                }
                ChainAddress chainAddress2 = (ChainAddress) next;
                if (chainAddress2 != null && (!z || chainAddress2.getAddress().length() != 0)) {
                    if (c10854bwMCopydefault.RdAHlO()) {
                        str2 = c10854bwMCopydefault.QKVWgx() + "-" + chainAddress2.getAddress();
                    } else {
                        str2 = c10854bwMCopydefault.fetchVPNInfo() + "-" + chainAddress2.getAddress();
                    }
                    if (map.containsKey(str2)) {
                        java.lang.Object obj = map.get(str2);
                        Intrinsics.copydefault(obj);
                        InternalChainAddressNew internalChainAddressNew = (InternalChainAddressNew) obj;
                        internalChainAddressNew.getChainIndexList().add(java.lang.Long.valueOf(c11283cIm.KWHzl()));
                        if (internalChainAddressNew.getChainPubKey().length() == 0) {
                            if (c10854bwMCopydefault.OuxcSI()) {
                                EOSInfoEntity eOSInfoEntity = (EOSInfoEntity) CollectionsKt___CollectionsKt.firstOrNull(this.copydefault.gEmmrt(str));
                                pubKey = eOSInfoEntity != null ? eOSInfoEntity.getPubKey() : null;
                                if (pubKey == null) {
                                    pubKey = "";
                                }
                            } else {
                                pubKey = chainAddress2.getPublicKey();
                            }
                            internalChainAddressNew.setChainPubKey(pubKey);
                        }
                        if (internalChainAddressNew.getChainSign().length() == 0) {
                            internalChainAddressNew.setChainSign(c11283cIm.OLrzqt());
                        }
                        java.lang.String baseChainSign = internalChainAddressNew.getBaseChainSign();
                        if (baseChainSign == null || baseChainSign.length() == 0) {
                            internalChainAddressNew.setBaseChainSign(c11283cIm.AEQbTJ());
                            internalChainAddressNew.setBaseSignChainIndex(c11283cIm.EZpvd());
                        }
                    } else {
                        java.lang.String address = chainAddress2.getAddress();
                        java.lang.String eoaAddress = chainAddress2.getEoaAddress();
                        java.lang.String proxyAddres = chainAddress2.getProxyAddres();
                        int iCopydefault = c11283cIm.copydefault();
                        int iOLrzqt = C11600cUg.OLrzqt(chainAddress2.isDefault());
                        if (c10854bwMCopydefault.OuxcSI()) {
                            EOSInfoEntity eOSInfoEntity2 = (EOSInfoEntity) CollectionsKt___CollectionsKt.firstOrNull(this.copydefault.gEmmrt(str));
                            pubKey = eOSInfoEntity2 != null ? eOSInfoEntity2.getPubKey() : null;
                            if (pubKey == null) {
                                publicKey = "";
                            } else {
                                str3 = pubKey;
                                InternalChainAddressNew internalChainAddressNew2 = new InternalChainAddressNew(address, eoaAddress, proxyAddres, iCopydefault, iOLrzqt, c11283cIm.EZpvd(), c11283cIm.AEQbTJ(), str3, c11283cIm.OLrzqt(), yDY.copydefault(java.lang.Long.valueOf(c11283cIm.KWHzl())));
                                map.put(str2, internalChainAddressNew2);
                                arrayList.add(internalChainAddressNew2);
                            }
                        } else {
                            publicKey = chainAddress2.getPublicKey();
                        }
                        str3 = publicKey;
                        InternalChainAddressNew internalChainAddressNew22 = new InternalChainAddressNew(address, eoaAddress, proxyAddres, iCopydefault, iOLrzqt, c11283cIm.EZpvd(), c11283cIm.AEQbTJ(), str3, c11283cIm.OLrzqt(), yDY.copydefault(java.lang.Long.valueOf(c11283cIm.KWHzl())));
                        map.put(str2, internalChainAddressNew22);
                        arrayList.add(internalChainAddressNew22);
                    }
                }
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }

    public final AbstractC58260yxt<java.util.List<kotlin.Pair<java.lang.String, AbstractC12782ctV>>> copydefault(@NotNull final java.util.List<? extends kotlin.Pair<java.lang.String, ? extends AbstractC12782ctV>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.util.List<kotlin.Pair<java.lang.String, AbstractC12782ctV>>> abstractC58260yxtAEQbTJ = AEQbTJ(list);
        AbstractC58260yxt<Unit> abstractC58260yxtAhwBna = AhwBna(list);
        final Function2 function2 = new Function2() { // from class: o.cyi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13058cyg.AEQbTJ(list, (java.util.List) obj, (Unit) obj2);
            }
        };
        AbstractC58260yxt<java.util.List<kotlin.Pair<java.lang.String, AbstractC12782ctV>>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtAEQbTJ, abstractC58260yxtAhwBna, new InterfaceC58223yxI() { // from class: o.cyj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C13058cyg.KWHzl(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.util.List KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.util.List) function2.invoke(obj, obj2);
    }

    public final AbstractC58260yxt<java.util.List<kotlin.Pair<java.lang.String, AbstractC12782ctV>>> AEQbTJ(final java.util.List<? extends kotlin.Pair<java.lang.String, ? extends AbstractC12782ctV>> list) {
        AbstractC58260yxt abstractC58260yxtRxSingle$default = RxSingleKt.rxSingle$default(null, new WalletSignManager$suppleCreateSignDataIfNeed$1(list, this, null), 1, null);
        final Function1 function1 = new Function1() { // from class: o.cyc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13058cyg.EZpvd(list, (Unit) obj);
            }
        };
        AbstractC58260yxt<java.util.List<kotlin.Pair<java.lang.String, AbstractC12782ctV>>> abstractC58260yxtCopydefault = abstractC58260yxtRxSingle$default.copydefault(new InterfaceC58229yxO() { // from class: o.cyf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13058cyg.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58260yxt<Unit> AhwBna(java.util.List<? extends kotlin.Pair<java.lang.String, ? extends AbstractC12782ctV>> list) {
        return RxSingleKt.rxSingle$default(null, new WalletSignManager$suppleSyncSignDataIfNeed$1(list, this, null), 1, null);
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> EZpvd(@NotNull final java.util.List<? extends AbstractC12782ctV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = OLrzqt(list);
        AbstractC58260yxt<Unit> abstractC58260yxtKWHzl = KWHzl(list);
        final Function2 function2 = new Function2() { // from class: o.cyd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13058cyg.AEQbTJ(list, (Unit) obj, (Unit) obj2);
            }
        };
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtOLrzqt2 = AbstractC58260yxt.OLrzqt(abstractC58260yxtOLrzqt, abstractC58260yxtKWHzl, new InterfaceC58223yxI() { // from class: o.cye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C13058cyg.copydefault(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final java.util.List copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.util.List) function2.invoke(obj, obj2);
    }

    public final AbstractC58260yxt<Unit> OLrzqt(java.util.List<? extends AbstractC12782ctV> list) {
        return RxSingleKt.rxSingle$default(null, new WalletSignManager$suppleCreateDataIfNeed$1(list, this, null), 1, null);
    }

    public final AbstractC58260yxt<Unit> KWHzl(java.util.List<? extends AbstractC12782ctV> list) {
        return RxSingleKt.rxSingle$default(null, new WalletSignManager$suppleSyncDataIfNeed$1(list, this, null), 1, null);
    }

    public final int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        java.util.Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(C33129mqd.AhwBna((java.lang.String) it.next())));
        }
        java.util.List listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default2, 10));
        java.util.Iterator it2 = listSplit$default2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(C33129mqd.AhwBna((java.lang.String) it2.next())));
        }
        int iMax = java.lang.Math.max(arrayList.size(), arrayList2.size());
        int size = iMax - arrayList.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList3.add(0);
        }
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) arrayList3);
        int size2 = iMax - arrayList2.size();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList4.add(0);
        }
        java.util.List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList2, (java.lang.Iterable) arrayList4);
        for (int i3 = 0; i3 < iMax; i3++) {
            if (((java.lang.Number) listDjBIcL.get(i3)).intValue() > ((java.lang.Number) listDjBIcL2.get(i3)).intValue()) {
                return 1;
            }
            if (((java.lang.Number) listDjBIcL.get(i3)).intValue() < ((java.lang.Number) listDjBIcL2.get(i3)).intValue()) {
                return -1;
            }
        }
        return 0;
    }

    public final boolean KWHzl(AbstractC12782ctV abstractC12782ctV) {
        return abstractC12782ctV.AubY() || abstractC12782ctV.AwvSrB() || abstractC12782ctV.QVAiDq();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, com.okinc.business.defi.biz.model.ChainAddress] */
    public final java.util.List<C11283cIm> EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull java.util.HashSet<ChainAddress> hashSet) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hashSet, "");
        if (str.length() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            for (WalletAddressList walletAddressList : copydefault(abstractC12782ctV, str, hashSet)) {
                int i = 0;
                for (java.lang.Object obj : walletAddressList.getAddressList()) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    CoinAddressBean coinAddressBean = (CoinAddressBean) obj;
                    java.util.Iterator<T> it = hashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        ChainAddress chainAddress = (ChainAddress) next;
                        if (chainAddress.getChainId() == walletAddressList.getChainId() && chainAddress.getAddressType() == coinAddressBean.getType()) {
                            break;
                        }
                    }
                    ?? r4 = (ChainAddress) next;
                    if (r4 != 0) {
                        objectRef.element = r4;
                        C12762ctB c12762ctBGenerateBaseChainSign$default = generateBaseChainSign$default(this, abstractC12782ctV, str, r4.getPublicKey(), null, 8, null);
                        arrayList.add(new C11283cIm(((ChainAddress) objectRef.element).getAddressType(), ((ChainAddress) objectRef.element).getChainId(), walletAddressList.getSignature(), c12762ctBGenerateBaseChainSign$default.KWHzl(), c12762ctBGenerateBaseChainSign$default.copydefault()));
                    }
                    i++;
                }
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(hashSet, 10));
        for (ChainAddress chainAddress2 : hashSet) {
            arrayList2.add(new C11283cIm(chainAddress2.getAddressType(), chainAddress2.getChainId(), "", null, null, 24, null));
        }
        return arrayList2;
    }

    public static /* synthetic */ C12762ctB generateBaseChainSign$default(C13058cyg c13058cyg, AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2, ChainAddress chainAddress, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            chainAddress = null;
        }
        return c13058cyg.EZpvd(abstractC12782ctV, str, str2, chainAddress);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C12762ctB EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull java.lang.String str2, ChainAddress chainAddress) {
        long jCopydefault;
        long j;
        long jCopydefault2;
        boolean z;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0) {
            return new C12762ctB(null, null, null, 7, null);
        }
        if (chainAddress != null) {
            jCopydefault = chainAddress.getChainId();
            C10854bwM c10854bwMCopydefault = this.EZpvd.copydefault(jCopydefault);
            jCopydefault2 = C11600cUg.copydefault(c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.QKVWgx()) : null);
        } else if (abstractC12782ctV.AubY()) {
            C10854bwM c10854bwMIsConnected = this.EZpvd.isConnected();
            jCopydefault = C11600cUg.copydefault(c10854bwMIsConnected != null ? java.lang.Long.valueOf(c10854bwMIsConnected.fetchVPNInfo()) : null);
            C10854bwM c10854bwMIsConnected2 = this.EZpvd.isConnected();
            jCopydefault2 = C11600cUg.copydefault(c10854bwMIsConnected2 != null ? java.lang.Long.valueOf(c10854bwMIsConnected2.QKVWgx()) : null);
        } else {
            C10854bwM c10854bwM = (C10854bwM) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.OFhtUX());
            long jCopydefault3 = C11600cUg.copydefault(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null);
            long jCopydefault4 = C11600cUg.copydefault(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.QKVWgx()) : null);
            jCopydefault = jCopydefault3;
            j = jCopydefault4;
            z = true;
            int iKWHzl = C8322bAY.KWHzl.KWHzl(jCopydefault, true);
            if (!abstractC12782ctV.AubY() && !abstractC12782ctV.QVAiDq()) {
                z = false;
            }
            return new C12762ctB(java.lang.Long.valueOf(jCopydefault), java.lang.Integer.valueOf(iKWHzl), xYU.copydefault.AEQbTJ(new SignParams(j, jCopydefault, null, !z ? null : str, !z ? str : null, java.lang.Integer.valueOf(abstractC12782ctV.finit()), iKWHzl, null, false, abstractC12782ctV.QVAiDq(), null, 1412, null), str2));
        }
        j = jCopydefault2;
        z = true;
        int iKWHzl2 = C8322bAY.KWHzl.KWHzl(jCopydefault, true);
        if (!abstractC12782ctV.AubY()) {
            z = false;
        }
        if (!z) {
        }
        if (!z) {
        }
        return new C12762ctB(java.lang.Long.valueOf(jCopydefault), java.lang.Integer.valueOf(iKWHzl2), xYU.copydefault.AEQbTJ(new SignParams(j, jCopydefault, null, !z ? null : str, !z ? str : null, java.lang.Integer.valueOf(abstractC12782ctV.finit()), iKWHzl2, null, false, abstractC12782ctV.QVAiDq(), null, 1412, null), str2));
    }

    public final java.util.List<WalletAddressList> copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull java.util.HashSet<ChainAddress> hashSet) {
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hashSet, "");
        if (str.length() == 0) {
            return new java.util.ArrayList();
        }
        if (!abstractC12782ctV.AubY() && !abstractC12782ctV.AwvSrB() && !abstractC12782ctV.QVAiDq()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList<HDWalletCoin> arrayList = new java.util.ArrayList();
        for (ChainAddress chainAddress : hashSet) {
            C10854bwM c10854bwMCopydefault = this.EZpvd.copydefault(chainAddress.getChainId());
            if (c10854bwMCopydefault != null) {
                arrayList.add(new HDWalletCoin(c10854bwMCopydefault.QKVWgx(), c10854bwMCopydefault.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), chainAddress.getAddressType(), abstractC12782ctV.finit(), c10854bwMCopydefault.iwGUEr()));
                if (c10854bwMCopydefault.gwTjWJ()) {
                    C10856bwO.copydefault("WalletSignManager", 0, "generateWalletAddress walletId=" + abstractC12782ctV.DbNXlk() + " coinId=" + c10854bwMCopydefault.AhwBna() + " chainId=" + c10854bwMCopydefault.QKVWgx() + " realChainId=" + c10854bwMCopydefault.fetchVPNInfo());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new java.util.ArrayList();
        }
        if (abstractC12782ctV.AubY()) {
            return C54908xZu.AEQbTJ.EZpvd(str, abstractC12782ctV.DCUTEI(), arrayList, abstractC12782ctV.DbNXlk());
        }
        if (abstractC12782ctV.QVAiDq()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (HDWalletCoin hDWalletCoin : arrayList) {
                C54908xZu c54908xZu = C54908xZu.AEQbTJ;
                java.lang.String strDCUTEI = abstractC12782ctV.DCUTEI();
                long chainId = hDWalletCoin.getChainId();
                long realChainId = hDWalletCoin.getRealChainId();
                int iFinit = abstractC12782ctV.finit();
                int value = AddressType.Legacy.getValue();
                java.lang.String addressHrp = hDWalletCoin.getAddressHrp();
                java.util.ArrayList arrayList3 = arrayList2;
                java.lang.String str3 = str2;
                WalletAddressList walletAddressListKWHzl = c54908xZu.KWHzl(str, strDCUTEI, chainId, realChainId, iFinit, value, addressHrp == null ? str2 : addressHrp, (MLKEMEngine.KyberPolyBytes & 128) != 0, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? false : true, abstractC12782ctV.DbNXlk());
                if (walletAddressListKWHzl != null) {
                    arrayList3.add(walletAddressListKWHzl);
                }
                arrayList2 = arrayList3;
                str2 = str3;
            }
            return arrayList2;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (HDWalletCoin hDWalletCoin2 : arrayList) {
            WalletAddressList walletAddressListOLrzqt = new C13847daM(hDWalletCoin2.getRealChainId()).OLrzqt(str, hDWalletCoin2.getAddressType(), abstractC12782ctV.DbNXlk());
            if (walletAddressListOLrzqt != null) {
                arrayList4.add(walletAddressListOLrzqt);
            }
        }
        return arrayList4;
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<C11291cIu>> continuation) {
        return this.OLrzqt.AEQbTJ(list, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<C11288cIr>> continuation) {
        return this.OLrzqt.OLrzqt(list, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.OLrzqt.copydefault(list, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, int i, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.OLrzqt.EZpvd(str, list, i, continuation);
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.copydefault(str, j);
    }
}
