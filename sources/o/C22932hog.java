package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.AddressType;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.wallet.api.bean.WalletAddressBookChildBean;
import com.okinc.wallet.api.bean.WalletAddressBookGroupBean;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hog, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22932hog extends AbstractC33073mpa {
    public DefiChainInfo AYXKKw;
    public java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<C22947hov>>> KWHzl;
    public java.lang.String OLrzqt;
    public DexMultiTokenInfoBean fetchVPNInfo;
    public java.lang.String valueOf;
    public java.lang.String AhwBna = "";
    public final MutableLiveData<java.util.List<kotlin.Pair<java.lang.String, java.util.List<C22947hov>>>> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<C22947hov> copydefault = new MutableLiveData<>();
    public final MutableLiveData<kotlin.Pair<AddressType, java.lang.String>> EZpvd = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> djBIcL = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> gEmmrt = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C22947hov> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<kotlin.Pair<java.lang.String, java.util.List<C22947hov>>>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<AddressType, java.lang.String>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo copydefault() {
        return this.AYXKKw;
    }

    public static /* synthetic */ void init$default(C22932hog c22932hog, java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        c22932hog.copydefault(str, dexMultiTokenInfoBean, str2, str3);
    }

    public final void copydefault(@NotNull java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.fetchVPNInfo = dexMultiTokenInfoBean;
        this.OLrzqt = str2;
        this.valueOf = str3;
        InterfaceC22387heR interfaceC22387heRAkhnZx = C22380heK.OLrzqt.copydefault(str).AkhnZx();
        java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        this.AYXKKw = interfaceC22387heRAkhnZx.KWHzl(chainId != null ? chainId : "");
    }

    public final void valueOf() {
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fetchVPNInfo;
        final java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.hoh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C22932hog.EZpvd(chainId, interfaceC58257yxq);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.hoi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22932hog.OLrzqt(this.OLrzqt, chainId, (java.util.Map) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.hor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22932hog.AkhnZx(function1, obj);
            }
        }).KWHzl(yBP.AEQbTJ()).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.hos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22932hog.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22932hog.values(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hoo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22932hog.KWHzl((java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hoq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22932hog.isConnected(function13, obj);
            }
        }));
    }

    public static final void EZpvd(java.lang.String str, InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        java.util.List<java.lang.String> listCopydefault = C23317hvu.copydefault(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.String str2 : listCopydefault) {
            linkedHashMap.put(C23311hvo.EZpvd(str2, str), new C22947hov(str2, str, null, null, null, false, 60, null));
        }
        interfaceC58257yxq.onSuccess(linkedHashMap);
    }

    public static final InterfaceC58261yxu AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(final C22932hog c22932hog, final java.lang.String str, final java.util.Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        AbstractC58260yxt<java.util.ArrayList<WalletAddressBookGroupBean>> abstractC58260yxtCopydefault = C22380heK.OLrzqt.copydefault(c22932hog.AhwBna).fARcdN().copydefault("", str);
        final Function1 function1 = new Function1() { // from class: o.hot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22932hog.KWHzl(map, str, c22932hog, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.how
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22932hog.DbNXlk(function1, obj);
            }
        });
        return interfaceC58261yxuCopydefault != null ? interfaceC58261yxuCopydefault : AbstractC58260yxt.copydefault(yDY.AhwBna());
    }

    public static final java.util.ArrayList DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList KWHzl(java.util.Map map, java.lang.String str, C22932hog c22932hog, java.util.ArrayList arrayList) {
        java.lang.String address;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            WalletAddressBookGroupBean walletAddressBookGroupBean = (WalletAddressBookGroupBean) next;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<WalletAddressBookChildBean> it2 = walletAddressBookGroupBean.getDataList().iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "");
            while (it2.hasNext()) {
                WalletAddressBookChildBean next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "");
                WalletAddressBookChildBean walletAddressBookChildBean = next2;
                C22947hov c22947hov = (C22947hov) map.get(C23311hvo.EZpvd(walletAddressBookChildBean.getAddress(), str));
                if (c22947hov != null) {
                    c22947hov.AEQbTJ(walletAddressBookChildBean.getName());
                    c22947hov.OLrzqt(walletAddressBookGroupBean.getTitle());
                    c22947hov.copydefault(true);
                }
                if (!Intrinsics.EZpvd((java.lang.Object) walletAddressBookChildBean.getAddress(), (java.lang.Object) c22932hog.valueOf) || (address = c22932hog.OLrzqt) == null) {
                    address = walletAddressBookChildBean.getAddress();
                }
                arrayList3.add(new C22947hov(address == null ? "" : address, str, walletAddressBookGroupBean.getTitle(), walletAddressBookChildBean.getName(), null, walletAddressBookChildBean.isAddressBook(), 16, null));
            }
            arrayList2.add(C56390yDp.OLrzqt(walletAddressBookGroupBean.getTitle(), arrayList3));
        }
        Intrinsics.copydefault(map);
        if (!map.isEmpty()) {
            arrayList2.add(0, C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.awiJhF), new java.util.ArrayList(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(map.values()))));
        }
        return arrayList2;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C22932hog c22932hog, java.util.List list) {
        c22932hog.KWHzl = list;
        c22932hog.AEQbTJ.postValue(list);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull C22947hov c22947hov) {
        Intrinsics.checkNotNullParameter(c22947hov, "");
        if (!c22947hov.djBIcL()) {
            this.EZpvd.postValue(C56390yDp.OLrzqt(AddressType.Normal, c22947hov.copydefault()));
            this.copydefault.postValue(c22947hov);
        } else {
            KWHzl(c22947hov.copydefault());
        }
    }

    public final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fetchVPNInfo;
        java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        final java.lang.String str2 = chainId != null ? chainId : "";
        final C22374heE c22374heECopydefault = C22380heK.OLrzqt.copydefault(this.AhwBna);
        if (!c22374heECopydefault.fARcdN().OLrzqt(str, C33129mqd.valueOf(str2))) {
            this.EZpvd.postValue(C56390yDp.OLrzqt(AddressType.Invalid, str));
            return;
        }
        this.gEmmrt.postValue(java.lang.Boolean.TRUE);
        AbstractC58185ywX<AddressType> abstractC58185ywXCopydefault = c22374heECopydefault.copydefault().copydefault(str2, str);
        final Function1 function1 = new Function1() { // from class: o.hox
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22932hog.OLrzqt(this.KWHzl, str, c22374heECopydefault, str2, (AddressType) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.hom
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22932hog.AYXKKw(function1, obj);
            }
        });
        if (abstractC58185ywXKWHzl != 0) {
            final Function1 function12 = new Function1() { // from class: o.hoj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22932hog.AEQbTJ(this.KWHzl, str, str2, (java.util.ArrayList) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hok
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C22932hog.AhwBna(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.hon
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22932hog.KWHzl(this.OLrzqt, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hol
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C22932hog.valueOf(function13, obj);
                }
            });
            if (interfaceC58217yxCAEQbTJ != null) {
                call().AEQbTJ(interfaceC58217yxCAEQbTJ);
            }
        }
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C22932hog c22932hog, java.lang.String str, C22374heE c22374heE, java.lang.String str2, AddressType addressType) {
        Intrinsics.checkNotNullParameter(addressType, "");
        if (addressType == AddressType.IsContractAddress || addressType == AddressType.IsExchangeAddress) {
            c22932hog.EZpvd.postValue(C56390yDp.OLrzqt(addressType, str));
            c22932hog.gEmmrt.postValue(java.lang.Boolean.FALSE);
            return AbstractC58185ywX.copydefault();
        }
        return c22374heE.fARcdN().copydefault("", str2).EZpvd();
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C22932hog c22932hog, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList) {
        java.lang.Object next;
        c22932hog.gEmmrt.postValue(java.lang.Boolean.FALSE);
        Intrinsics.copydefault(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WalletAddressBookGroupBean walletAddressBookGroupBean = (WalletAddressBookGroupBean) it.next();
            java.util.Iterator<T> it2 = walletAddressBookGroupBean.getDataList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (C23311hvo.copydefault(str2, ((WalletAddressBookChildBean) next).getAddress(), str)) {
                    break;
                }
            }
            WalletAddressBookChildBean walletAddressBookChildBean = (WalletAddressBookChildBean) next;
            if (walletAddressBookChildBean != null) {
                c22932hog.copydefault.postValue(new C22947hov(str, str2, walletAddressBookGroupBean.getTitle(), walletAddressBookChildBean.getName(), null, false, 48, null));
                return Unit.INSTANCE;
            }
        }
        c22932hog.djBIcL.setValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C22932hog c22932hog, java.lang.Throwable th) {
        c22932hog.gEmmrt.postValue(java.lang.Boolean.FALSE);
        C57604ylZ.show$default(C57604ylZ.OLrzqt, th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        if (str != null) {
            this.EZpvd.postValue(C56390yDp.OLrzqt(AddressType.Normal, str));
            MutableLiveData<C22947hov> mutableLiveData = this.copydefault;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.fetchVPNInfo;
            java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            mutableLiveData.postValue(new C22947hov(str, chainId, null, null, null, false, 60, null));
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            this.AEQbTJ.postValue((java.util.List<kotlin.Pair<java.lang.String, java.util.List<C22947hov>>>) this.KWHzl);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<C22947hov>>> list = this.KWHzl;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.Pair pair = (kotlin.Pair) it.next();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (C22947hov c22947hov : (java.lang.Iterable) pair.getSecond()) {
                    if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) C23311hvo.EZpvd(c22947hov.copydefault(), c22947hov.AEQbTJ()), (java.lang.CharSequence) C23311hvo.EZpvd(str, c22947hov.AEQbTJ()), false, 2, (java.lang.Object) null)) {
                        arrayList2.add(c22947hov);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(C56390yDp.OLrzqt(pair.getFirst(), arrayList2));
                }
            }
        }
        this.AEQbTJ.postValue(arrayList);
    }
}
