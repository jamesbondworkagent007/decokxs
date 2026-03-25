package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams;
import com.okinc.business.defi.dapp.net.WalletSelectParams;
import com.okinc.dapp.bean.SelectWalletNet;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.DappSupportCheck;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dzM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15172dzM extends AbstractC33073mpa {
    public final MutableLiveData<java.util.List<InterfaceC9735bbG>> EZpvd = new MutableLiveData<>();
    public WalletSelectParams OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull WalletSelectParams walletSelectParams) {
        Intrinsics.checkNotNullParameter(walletSelectParams, "");
        this.OLrzqt = walletSelectParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<InterfaceC9735bbG>> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.copydefault = z;
    }

    public final WalletSelectParams EZpvd() {
        WalletSelectParams walletSelectParams = this.OLrzqt;
        if (walletSelectParams != null) {
            return walletSelectParams;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void AEQbTJ() {
        AbstractC58260yxt<java.util.List<InterfaceC9735bbG>> abstractC58260yxtEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15172dzM.EZpvd(this.copydefault, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.dAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15172dzM.djBIcL(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15172dzM.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15172dzM.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dzS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15172dzM.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dzV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15172dzM.gEmmrt(function13, obj);
            }
        });
    }

    public static final java.util.List djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final boolean KWHzl(C15172dzM c15172dzM, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        C14923duc c14923duc = C14923duc.EZpvd;
        java.lang.Long selectedChain = c15172dzM.EZpvd().getSelectedChain();
        Intrinsics.copydefault(selectedChain);
        return c14923duc.EZpvd(interfaceC9738bbJ, selectedChain);
    }

    public static final boolean OLrzqt(C15172dzM c15172dzM, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        java.util.ArrayList<SelectWalletNet> supportChainList = c15172dzM.EZpvd().getSupportChainList();
        Intrinsics.copydefault(supportChainList);
        java.util.Iterator<T> it = supportChainList.iterator();
        while (it.hasNext()) {
            if (C14923duc.EZpvd.EZpvd(interfaceC9738bbJ, java.lang.Long.valueOf(((SelectWalletNet) it.next()).getChainId()))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean KWHzl(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.djSkpj();
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C15172dzM c15172dzM, java.util.List list) {
        c15172dzM.EZpvd.postValue(list);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        final java.lang.String dappUrl;
        AbstractC58185ywX<Unit> abstractC58185ywXValueOf = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).valueOf();
        WalletSelectDappCustomParams dappCustomParams = EZpvd().getDappCustomParams();
        if (dappCustomParams != null && (dappUrl = dappCustomParams.getDappUrl()) != null) {
            C15196dzk c15196dzk = C15196dzk.KWHzl;
            if (c15196dzk.AEQbTJ()) {
                WalletSelectDappCustomParams dappCustomParams2 = EZpvd().getDappCustomParams();
                Intrinsics.copydefault(dappCustomParams2);
                if (dappCustomParams2.getDappSupportCheck() == null) {
                    DappSupportCheck dappSupportCheckEZpvd = c15196dzk.EZpvd(dappUrl);
                    if (dappSupportCheckEZpvd == null) {
                        AbstractC58185ywX<DappSupportCheck> abstractC58185ywXJ_ = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).j_(dappUrl);
                        final Function2 function2 = new Function2() { // from class: o.dzP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C15172dzM.AEQbTJ(this.AEQbTJ, dappUrl, (Unit) obj, (DappSupportCheck) obj2);
                            }
                        };
                        abstractC58185ywXValueOf = AbstractC58185ywX.EZpvd(abstractC58185ywXValueOf, abstractC58185ywXJ_, new InterfaceC58223yxI() { // from class: o.dzQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58223yxI
                            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                                return C15172dzM.copydefault(function2, obj, obj2);
                            }
                        });
                    } else {
                        WalletSelectDappCustomParams dappCustomParams3 = EZpvd().getDappCustomParams();
                        Intrinsics.copydefault(dappCustomParams3);
                        dappCustomParams3.setDappSupportCheck(dappSupportCheckEZpvd);
                    }
                }
            }
        }
        AbstractC58185ywX<Unit> abstractC58185ywXOLrzqt = abstractC58185ywXValueOf.OLrzqt(new InterfaceC58222yxH() { // from class: o.dzX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C15172dzM.KWHzl(this.KWHzl);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.dzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15172dzM.EZpvd((Unit) obj);
            }
        };
        InterfaceC58227yxM<? super Unit> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15172dzM.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15172dzM.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15172dzM.valueOf(function12, obj);
            }
        });
    }

    public static final Unit copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Unit) function2.invoke(obj, obj2);
    }

    public static final Unit AEQbTJ(C15172dzM c15172dzM, java.lang.String str, Unit unit, DappSupportCheck dappSupportCheck) {
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(dappSupportCheck, "");
        WalletSelectDappCustomParams dappCustomParams = c15172dzM.EZpvd().getDappCustomParams();
        Intrinsics.copydefault(dappCustomParams);
        dappCustomParams.setDappSupportCheck(dappSupportCheck);
        C15157dyy.EZpvd.OLrzqt().put(C14923duc.EZpvd.KWHzl(str), dappSupportCheck);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C15172dzM c15172dzM) {
        c15172dzM.AEQbTJ();
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Unit unit) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.ArrayList, java.util.Collection] */
    public static final java.util.List EZpvd(final C15172dzM c15172dzM, java.util.List list) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            InterfaceC9735bbG interfaceC9735bbG = (InterfaceC9735bbG) obj;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            java.util.List<InterfaceC9738bbJ> listKWHzl = interfaceC9735bbG.KWHzl();
            ?? arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = listKWHzl.iterator();
            while (true) {
                function1 = null;
                java.lang.Object obj2 = null;
                java.lang.Integer num = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) next;
                java.util.List<java.lang.Integer> hiddenWalletTypeList = c15172dzM.EZpvd().getHiddenWalletTypeList();
                if (hiddenWalletTypeList != null) {
                    java.util.Iterator<T> it2 = hiddenWalletTypeList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it2.next();
                        if (((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(interfaceC9738bbJ, ((java.lang.Number) next2).intValue())) {
                            obj2 = next2;
                            break;
                        }
                    }
                    num = (java.lang.Integer) obj2;
                }
                if (num == null) {
                    arrayList2.add(next);
                }
            }
            objectRef.element = arrayList2;
            if (c15172dzM.EZpvd().getDappCustomParams() == null) {
                if (c15172dzM.EZpvd().getSelectedChain() != null) {
                    function1 = new Function1() { // from class: o.dzR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return java.lang.Boolean.valueOf(C15172dzM.KWHzl(this.EZpvd, (InterfaceC9738bbJ) obj3));
                        }
                    };
                } else if (C33129mqd.KWHzl((java.util.Collection) c15172dzM.EZpvd().getSupportChainList())) {
                    function1 = new Function1() { // from class: o.dzU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return java.lang.Boolean.valueOf(C15172dzM.OLrzqt(this.copydefault, (InterfaceC9738bbJ) obj3));
                        }
                    };
                } else {
                    function1 = new Function1() { // from class: o.dAa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return java.lang.Boolean.valueOf(C15172dzM.KWHzl((InterfaceC9738bbJ) obj3));
                        }
                    };
                }
            }
            java.lang.Iterable iterable = (java.lang.Iterable) objectRef.element;
            ?? arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : iterable) {
                InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj3;
                if (function1 == null || ((java.lang.Boolean) function1.invoke(interfaceC9738bbJ2)).booleanValue()) {
                    arrayList3.add(obj3);
                }
            }
            objectRef.element = arrayList3;
            java.util.List<InterfaceC9738bbJ> listKWHzl2 = interfaceC9735bbG.KWHzl();
            Intrinsics.copydefault(listKWHzl2, "");
            java.util.ArrayList arrayList4 = (java.util.ArrayList) listKWHzl2;
            arrayList4.clear();
            arrayList4.addAll((java.util.Collection) objectRef.element);
            if (C33129mqd.KWHzl((java.util.Collection) interfaceC9735bbG.KWHzl())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
