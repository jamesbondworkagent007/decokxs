package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.constant.XRCTokenType;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.wallet.api.bean.WalletAddressBookChildBean;
import com.okinc.wallet.api.bean.WalletAddressBookGroupBean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC9738bbJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cXJ extends AbstractC43215rlA implements InterfaceC54832xWz {
    @Override // o.InterfaceC54832xWz
    public AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> copydefault(@NotNull final java.lang.String str, final long j) {
        java.lang.String strDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList(12);
        final java.util.HashMap map = new java.util.HashMap();
        final C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        if (c10854bwMCopydefault == null || (strDjBIcL = c10854bwMCopydefault.djBIcL()) == null) {
            strDjBIcL = "0";
        }
        final java.lang.String str2 = strDjBIcL;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final boolean z = c10854bwMCopydefault != null && c10854bwMCopydefault.DarRvM();
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.cXQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cXJ.AEQbTJ(str2, objectRef, arrayList, this, c10854bwMCopydefault, z, j, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = allRootWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.cXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cXJ.gEmmrt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cXV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cXJ.AEQbTJ(arrayList, map, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cXW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cXJ.valueOf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.util.ArrayList valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList AEQbTJ(java.util.ArrayList arrayList, java.util.HashMap map, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                AddressBookEntity addressBookEntity = (AddressBookEntity) it.next();
                arrayList2.add(new WalletAddressBookChildBean(addressBookEntity.getName(), addressBookEntity.getAddress(), true));
                map.put(addressBookEntity.getAddress(), addressBookEntity.getName());
            }
            arrayList.add(new WalletAddressBookGroupBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fDu), arrayList2));
        }
        return arrayList;
    }

    @Override // o.InterfaceC54832xWz
    public AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> AEQbTJ(@NotNull final java.lang.String str, final long j) {
        java.lang.String strDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList(12);
        final java.util.HashMap map = new java.util.HashMap();
        final C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        if (c10854bwMCopydefault == null || (strDjBIcL = c10854bwMCopydefault.djBIcL()) == null) {
            strDjBIcL = "0";
        }
        final java.lang.String str2 = strDjBIcL;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        boolean z = c10854bwMCopydefault != null && c10854bwMCopydefault.DarRvM();
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final boolean z2 = z;
        final Function1 function1 = new Function1() { // from class: o.cXK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cXJ.AEQbTJ(str2, objectRef, c10854bwMCopydefault, z2, j, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = allRootWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.cXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cXJ.AhwBna(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cXM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cXJ.OLrzqt(arrayList, map, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cXJ.AYXKKw(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.util.ArrayList AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList OLrzqt(java.util.ArrayList arrayList, java.util.HashMap map, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                AddressBookEntity addressBookEntity = (AddressBookEntity) it.next();
                arrayList2.add(new WalletAddressBookChildBean(addressBookEntity.getName(), addressBookEntity.getAddress(), true));
                map.put(addressBookEntity.getAddress(), addressBookEntity.getName());
            }
            arrayList.add(new WalletAddressBookGroupBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fDu), arrayList2));
        }
        return arrayList;
    }

    public static final java.util.ArrayList djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    @Override // o.InterfaceC54832xWz
    public AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> EZpvd(@NotNull final java.lang.String str, final long j, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.cXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cXJ.copydefault(j, this, str2, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> abstractC58260yxtCopydefault = allRootWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cXO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cXJ.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.ArrayList copydefault(long j, cXJ cxj, java.lang.String str, java.lang.String str2, java.util.List list) {
        java.lang.String address;
        java.util.ArrayList arrayList;
        C10854bwM c10854bwMKWHzl;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<WalletAddressBookGroupBean> arrayList2 = new java.util.ArrayList<>();
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        boolean z = c10854bwMCopydefault != null && c10854bwMCopydefault.DarRvM();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
            if (abstractC12784ctX.AEQbTJ() || abstractC12784ctX.fJNWhG() == WalletType.MPCWallet) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
                java.util.ArrayList<AbstractC12782ctV> arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
                    if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                        if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                            if (!abstractC12782ctV.Dmq() || (c10854bwMCopydefault != null && C10854bwM.isXRCToken$default(c10854bwMCopydefault, null, 1, null))) {
                            }
                        }
                    }
                    if (!z || !abstractC12782ctV.getFieldNames()) {
                        arrayList4.add(obj);
                    }
                }
                for (AbstractC12782ctV abstractC12782ctV2 : arrayList4) {
                    java.util.ArrayList arrayList5 = arrayList3;
                    ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV2, j, null, 2, null);
                    if (chainAddress == null || (address = chainAddress.getAddress()) == null) {
                        address = "";
                    }
                    if ((str != null && str.length() != 0) || !Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV2.DbNXlk(), (java.lang.Object) str2)) {
                        if (address.length() != 0) {
                            if (c10854bwMCopydefault != null && c10854bwMCopydefault.dxcTrN()) {
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                for (ChainAddress chainAddress2 : abstractC12782ctV2.EZpvd()) {
                                    if (c10854bwMCopydefault.fetchVPNInfo() == chainAddress2.getChainId() && (c10854bwMKWHzl = c10854bwMCopydefault.KWHzl()) != null && c10854bwMKWHzl.AhwBna() == chainAddress2.getCoinId() && !Intrinsics.EZpvd((java.lang.Object) chainAddress2.getAddress(), (java.lang.Object) str)) {
                                        arrayList6.add(new WalletAddressBookChildBean(abstractC12782ctV2.AkhnZx(), chainAddress2.getAddress(), false, 4, null));
                                    }
                                }
                                arrayList = arrayList5;
                                arrayList.addAll(arrayList6);
                            } else {
                                arrayList = arrayList5;
                                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) address)) {
                                    arrayList.add(new WalletAddressBookChildBean(abstractC12782ctV2.AkhnZx(), address, false, 4, null));
                                }
                            }
                            arrayList3 = arrayList;
                        }
                    }
                    arrayList3 = arrayList5;
                }
                java.util.ArrayList arrayList7 = arrayList3;
                if (!arrayList7.isEmpty()) {
                    arrayList2.add(new WalletAddressBookGroupBean(abstractC12784ctX.AuCTel(), arrayList7));
                    cxj.EZpvd(arrayList2);
                }
            }
        }
        return arrayList2;
    }

    public final void EZpvd(java.util.ArrayList<WalletAddressBookGroupBean> arrayList) {
        if (!arrayList.isEmpty() && ((WalletAddressBookGroupBean) CollectionsKt___CollectionsKt.AubY(arrayList)).getDataList().isEmpty()) {
            arrayList.remove(yDY.AuCTel(arrayList));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static final InterfaceC58261yxu AEQbTJ(java.lang.String str, Ref.ObjectRef objectRef, java.util.ArrayList arrayList, cXJ cxj, C10854bwM c10854bwM, boolean z, long j, java.lang.String str2, java.util.List list) {
        java.lang.String address;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
            if (abstractC12784ctX.AEQbTJ() || abstractC12784ctX.fJNWhG() == WalletType.MPCWallet) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
                java.util.ArrayList<AbstractC12782ctV> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
                    if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                        if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                            if (!abstractC12782ctV.Dmq() || (c10854bwM != null && C10854bwM.isXRCToken$default(c10854bwM, null, 1, null))) {
                            }
                        }
                    }
                    if (!z || !abstractC12782ctV.getFieldNames()) {
                        arrayList3.add(obj);
                    }
                }
                for (AbstractC12782ctV abstractC12782ctV2 : arrayList3) {
                    ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV2, j, null, 2, null);
                    ?? r12 = (chainAddress == null || (address = chainAddress.getAddress()) == null) ? "" : address;
                    if (Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV2.DbNXlk(), (java.lang.Object) str2)) {
                        objectRef.element = r12;
                    } else if (r12.length() != 0) {
                        arrayList2.add(new WalletAddressBookChildBean(abstractC12782ctV2.AkhnZx(), r12, false, 4, null));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new WalletAddressBookGroupBean(abstractC12784ctX.AuCTel(), arrayList2));
                    cxj.EZpvd(arrayList);
                }
            }
        }
        return cGN.EZpvd.OLrzqt(str, (java.lang.String) objectRef.element);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC58261yxu AEQbTJ(java.lang.String str, Ref.ObjectRef objectRef, C10854bwM c10854bwM, boolean z, long j, java.lang.String str2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
            if (abstractC12784ctX.AEQbTJ() || abstractC12784ctX.fJNWhG() == WalletType.MPCWallet) {
                java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
                java.util.ArrayList<AbstractC12782ctV> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
                    if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                        if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                            if (!abstractC12782ctV.Dmq() || (c10854bwM != null && c10854bwM.copydefault(XRCTokenType.Brc20sToken, XRCTokenType.Arc20Token, XRCTokenType.SRC20Token, XRCTokenType.RunesToken, XRCTokenType.RunesMainToken))) {
                            }
                        }
                    }
                    if (!z || !abstractC12782ctV.getFieldNames()) {
                        arrayList.add(obj);
                    }
                }
                for (AbstractC12782ctV abstractC12782ctV2 : arrayList) {
                    ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV2, j, null, 2, null);
                    if (chainAddress != null) {
                        java.lang.String address = chainAddress.getAddress();
                        T t = address;
                        if (address == null) {
                            t = "";
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV2.DbNXlk(), (java.lang.Object) str2)) {
                            objectRef.element = t;
                            break;
                        }
                    }
                }
            }
        }
        return cGN.EZpvd.OLrzqt(str, (java.lang.String) objectRef.element);
    }
}
