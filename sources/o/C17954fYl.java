package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C10619brq;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC13987dcu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fYl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17954fYl extends AbstractC33073mpa {
    public CustomNetworkInfo AEQbTJ;
    public final LiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> AYXKKw;
    public final MutableLiveData<java.lang.String> AhwBna;
    public java.lang.Long AkhnZx;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public final MutableLiveData<java.lang.String> KWHzl;
    public final LiveData<java.lang.String> OLrzqt;
    public int copydefault;
    public final LiveData<java.lang.String> djBIcL;
    public boolean fetchVPNInfo;
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> gEmmrt;
    public AbstractC12782ctV valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(Unit unit, java.lang.String str) {
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    public C17954fYl() {
        MutableLiveData<java.lang.String> mutableLiveData = new MutableLiveData<>();
        this.AhwBna = mutableLiveData;
        this.djBIcL = mutableLiveData;
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> mutableLiveData2 = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData2;
        this.AYXKKw = mutableLiveData2;
        MutableLiveData<java.lang.String> mutableLiveData3 = new MutableLiveData<>();
        this.KWHzl = mutableLiveData3;
        this.OLrzqt = mutableLiveData3;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, int i, @NotNull CustomNetworkInfo customNetworkInfo, java.lang.String str3, java.lang.Long l) {
        final java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(customNetworkInfo, "");
        this.values = str;
        this.EZpvd = str2;
        this.copydefault = i;
        this.AEQbTJ = customNetworkInfo;
        this.DbNXlk = str3;
        this.AkhnZx = l;
        java.util.List<java.lang.String> rpcUrls = customNetworkInfo.getRpcUrls();
        java.util.List listFJNWhG = rpcUrls != null ? CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) rpcUrls) : null;
        if (listFJNWhG == null || (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listFJNWhG, 4)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt((java.lang.String) it.next()).EZpvd().OLrzqt(AbstractC58185ywX.KWHzl(-111L)));
        }
        AbstractC58185ywX<Unit> abstractC58185ywXOLrzqt = OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.fYz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.KWHzl(listAhwBna, (java.lang.Object[]) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(arrayList, new InterfaceC58229yxO() { // from class: o.fYE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17954fYl.DbNXlk(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.fYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C17954fYl.EZpvd((Unit) obj, (java.lang.String) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXOLrzqt, abstractC58185ywXAEQbTJ, new InterfaceC58223yxI() { // from class: o.fYG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C17954fYl.copydefault(function2, obj, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fYI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17954fYl.AuCTel(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.copydefault(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fYM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17954fYl.fJNWhG(function13, obj);
            }
        }));
    }

    public static final java.lang.String DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.String) function2.invoke(obj, obj2);
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C17954fYl c17954fYl, java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            c17954fYl.AhwBna.setValue(str);
        } else {
            c17954fYl.AhwBna.setValue(null);
        }
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C17954fYl c17954fYl, java.lang.Throwable th) {
        c17954fYl.AhwBna.setValue(null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    public final AbstractC58185ywX<Unit> OLrzqt() {
        C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        java.lang.String str = this.values;
        if (str == null) {
            str = "";
        }
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = instance$default.OLrzqt(str, true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fYB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.KWHzl(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fYA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17954fYl.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit KWHzl(C17954fYl c17954fYl, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c17954fYl.valueOf = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.lang.Long> OLrzqt(java.lang.String str) {
        return C10734btz.KWHzl.uzCIH(str);
    }

    public final void djBIcL() {
        if (C33129mqd.AEQbTJ(this.EZpvd, Long.MAX_VALUE)) {
            this.gEmmrt.setValue(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DzkRMH)));
            return;
        }
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtEZpvd = EZpvd();
        java.lang.String value = this.djBIcL.getValue();
        if (value == null) {
            value = "";
        }
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = OLrzqt(value);
        final Function1 function1 = new Function1() { // from class: o.fYO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.copydefault(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.fYr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17954fYl.uzCIH(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.fYt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C17954fYl.EZpvd((java.lang.Boolean) obj, (java.lang.Boolean) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = AbstractC58260yxt.OLrzqt(abstractC58260yxtEZpvd, interfaceC58261yxuCopydefault, new InterfaceC58223yxI() { // from class: o.fYp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C17954fYl.KWHzl(function2, obj, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fYx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.fYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17954fYl.hDKMBd(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.fYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.fYw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17954fYl.getNewProxyInstance(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.fYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.valueOf(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fYD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17954fYl.getFieldNames(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.fYW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtOLrzqt4.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fYq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C17954fYl.AuCTelauCTel(function15, obj);
            }
        }));
    }

    public static final java.lang.Boolean uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean copydefault(C17954fYl c17954fYl, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        java.lang.String str = c17954fYl.EZpvd;
        return java.lang.Boolean.valueOf(Intrinsics.EZpvd(l, str != null ? java.lang.Long.valueOf(C33129mqd.valueOf(str)) : null));
    }

    public static final kotlin.Pair KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(java.lang.Boolean bool, java.lang.Boolean bool2) {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(bool2, "");
        return !bool.booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DLGVGj)) : !bool2.booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.QFTsTN)) : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(final C17954fYl c17954fYl, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtGEmmrt = c17954fYl.gEmmrt();
            final Function1 function1 = new Function1() { // from class: o.fYK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17954fYl.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
                }
            };
            return abstractC58260yxtGEmmrt.copydefault(new InterfaceC58229yxO() { // from class: o.fYL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C17954fYl.iwGUEr(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(pair);
    }

    public static final kotlin.Pair iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(C17954fYl c17954fYl, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            java.lang.String str = c17954fYl.EZpvd;
            if (str != null) {
                java.lang.String strCopydefault = InterfaceC13987dcu.Companion.copydefault(InterfaceC13987dcu.Fragment.Companion.OLrzqt(), InterfaceC13987dcu.LoaderManager.OLrzqt(str));
                AbstractC12782ctV abstractC12782ctV = c17954fYl.valueOf;
                if (abstractC12782ctV == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV = null;
                }
                C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
                java.lang.String strEZpvd = abstractC12782ctV.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L);
                c17954fYl.KWHzl.setValue(strCopydefault + ":" + strEZpvd);
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DlmWDR));
    }

    public static final InterfaceC58261yxu getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C17954fYl c17954fYl, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && c17954fYl.copydefault == 5) {
            return c17954fYl.valueOf();
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(pair);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(C17954fYl c17954fYl, kotlin.Pair pair) {
        c17954fYl.gEmmrt.setValue(pair);
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C17954fYl c17954fYl, java.lang.Throwable th) {
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> mutableLiveData = c17954fYl.gEmmrt;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        Intrinsics.copydefault(th);
        mutableLiveData.setValue(C56390yDp.OLrzqt(bool, C10857bwP.KWHzl("TransactionAddCustomNetworkViewModel", th)));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Boolean> */
    public final AbstractC58260yxt<java.lang.Boolean> EZpvd() {
        C10639bsJ c10639bsJ = C10639bsJ.EZpvd;
        java.lang.String str = this.EZpvd;
        AbstractC58260yxt<java.util.List<CustomChainMeta>> abstractC58260yxtKWHzl = c10639bsJ.KWHzl(java.lang.Long.valueOf(-(str != null ? C33129mqd.valueOf(str) : -1L)), this.djBIcL.getValue());
        final Function1 function1 = new Function1() { // from class: o.fYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.KWHzl((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.fYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17954fYl.fIwbmz(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Boolean fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Boolean.valueOf(list.isEmpty());
    }

    /* JADX DEBUG: Type inference failed for r1v15. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Boolean> */
    public final AbstractC58260yxt<java.lang.Boolean> gEmmrt() {
        java.lang.Character chWlaJM;
        java.lang.String string;
        java.lang.String strOLrzqt;
        java.lang.String str = this.EZpvd;
        long j = -(str != null ? C33129mqd.valueOf(str) : -1L);
        java.lang.String str2 = this.EZpvd;
        long jValueOf = str2 != null ? C33129mqd.valueOf(str2) : -1L;
        CustomNetworkInfo customNetworkInfo = this.AEQbTJ;
        CustomNetworkInfo customNetworkInfo2 = null;
        if (customNetworkInfo == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo = null;
        }
        java.lang.String chainName = customNetworkInfo.getChainName();
        java.lang.String str3 = chainName == null ? "" : chainName;
        CustomNetworkInfo customNetworkInfo3 = this.AEQbTJ;
        if (customNetworkInfo3 == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo3 = null;
        }
        java.lang.String chainName2 = customNetworkInfo3.getChainName();
        java.lang.String str4 = (chainName2 == null || (chWlaJM = C59454zhO.wlaJM(chainName2)) == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) ? "" : strOLrzqt;
        java.lang.String value = this.djBIcL.getValue();
        java.lang.String str5 = value == null ? "" : value;
        CustomNetworkInfo customNetworkInfo4 = this.AEQbTJ;
        if (customNetworkInfo4 == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo4 = null;
        }
        java.lang.String explorerUrl = customNetworkInfo4.getExplorerUrl();
        final CustomChainMeta customChainMeta = new CustomChainMeta(j, jValueOf, str3, str4, true, 0, str5, "", explorerUrl == null ? "" : explorerUrl, java.lang.System.currentTimeMillis(), 0L, null, null, 7168, null);
        CustomNetworkInfo customNetworkInfo5 = this.AEQbTJ;
        if (customNetworkInfo5 == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo5 = null;
        }
        java.lang.String symbol = customNetworkInfo5.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        CustomNetworkInfo customNetworkInfo6 = this.AEQbTJ;
        if (customNetworkInfo6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            customNetworkInfo2 = customNetworkInfo6;
        }
        java.lang.String chainName3 = customNetworkInfo2.getChainName();
        if (chainName3 == null) {
            chainName3 = "";
        }
        customChainMeta.AEQbTJ(customChainMeta.AEQbTJ(symbol, chainName3));
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtValueOf = C10639bsJ.EZpvd.EZpvd(customChainMeta).valueOf();
        final Function1 function1 = new Function1() { // from class: o.fYJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.EZpvd(this.AEQbTJ, customChainMeta, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.fYS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17954fYl.fARcdN(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C17954fYl c17954fYl, CustomChainMeta customChainMeta, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        C10619brq instance$default = C10619brq.TaskDescription.getInstance$default(C10619brq.Companion, null, 1, null);
        java.lang.String str = c17954fYl.values;
        java.lang.String str2 = str != null ? str : "";
        CustomChainCoinMeta customChainCoinMetaDjBIcL = customChainMeta.djBIcL();
        AbstractC58260yxt<java.util.List<C10594brR>> abstractC58260yxtAEQbTJ = instance$default.AEQbTJ(str2, C56402yEa.EZpvd(java.lang.Long.valueOf(customChainCoinMetaDjBIcL != null ? customChainCoinMetaDjBIcL.valueOf() : -1L)));
        final Function1 function1 = new Function1() { // from class: o.fYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17954fYl.EZpvd(bool, (java.util.List) obj);
            }
        };
        return abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.fYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17954fYl.ejfBZ(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(java.lang.Boolean bool, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return AbstractC58260yxt.copydefault(bool);
    }

    public final AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> valueOf() {
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.fYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C17954fYl.AEQbTJ(this.EZpvd, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void AEQbTJ(C17954fYl c17954fYl, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        AbstractC12782ctV abstractC12782ctV = c17954fYl.valueOf;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        java.lang.String strEZpvd = abstractC12782ctV.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L);
        WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
        java.lang.String str = c17954fYl.DbNXlk;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = c17954fYl.EZpvd;
        instance$default.copydefault(str, str2 != null ? str2 : "", strEZpvd, new Function2() { // from class: o.fYC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C17954fYl.OLrzqt(interfaceC58257yxq, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit OLrzqt(InterfaceC58257yxq interfaceC58257yxq, boolean z, java.lang.String str) {
        if (z) {
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, str));
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DlmWDR);
            }
            interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(bool, str));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        AYXKKw();
    }

    public final void AYXKKw() {
        if (this.copydefault != 5 || this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        java.lang.Long l = this.AkhnZx;
        if (l != null) {
            long jLongValue = l.longValue();
            WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
            java.lang.String str = this.DbNXlk;
            if (str == null) {
                str = "";
            }
            WalletConnectUtils.rejectRequest$default(instance$default, str, jLongValue, null, 0, 12, null);
        }
    }

    public static final java.lang.String KWHzl(java.util.List list, java.lang.Object[] objArr) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(objArr, "");
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = objArr[i];
            if (!Intrinsics.EZpvd(obj, (java.lang.Object) (-111))) {
                break;
            }
            i++;
        }
        if (obj == null) {
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(list);
            return str == null ? "" : str;
        }
        return (java.lang.String) list.get(yDV.gEmmrt(objArr, obj));
    }
}
