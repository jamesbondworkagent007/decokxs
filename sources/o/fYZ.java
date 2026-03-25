package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.network.okg.response.ResponseData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C10407bnq;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fYZ extends AbstractC33073mpa {
    public CustomNetworkInfo AEQbTJ;
    public final LiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> AYXKKw;
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> AhwBna;
    public java.lang.Long AkhnZx;
    public java.lang.String DbNXlk;
    public CustomChainCoinMeta EZpvd;
    public java.lang.String KWHzl;
    public final LiveData<java.lang.Boolean> OLrzqt;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public AbstractC12782ctV djBIcL;
    public int gEmmrt;
    public boolean isConnected;
    public C10854bwM valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl() {
        return this.AYXKKw;
    }

    public fYZ() {
        MutableLiveData<java.lang.Boolean> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.OLrzqt = mutableLiveData;
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> mutableLiveData2 = new MutableLiveData<>();
        this.AhwBna = mutableLiveData2;
        this.AYXKKw = mutableLiveData2;
    }

    public final void AEQbTJ(java.lang.String str, final java.lang.String str2, int i, @NotNull CustomNetworkInfo customNetworkInfo, java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(customNetworkInfo, "");
        this.values = str;
        this.KWHzl = str2;
        this.gEmmrt = i;
        this.AEQbTJ = customNetworkInfo;
        this.DbNXlk = str3;
        this.AkhnZx = java.lang.Long.valueOf(j);
        AbstractC58185ywX<Unit> abstractC58185ywXFetchVPNInfo = fetchVPNInfo();
        final Function1 function1 = new Function1() { // from class: o.fZt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.copydefault(str2, this, (Unit) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXFetchVPNInfo.KWHzl(new InterfaceC58229yxO() { // from class: o.fZu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fYZ.hDKMBd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fZw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fZs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fYZ.getNewProxyInstance(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fZz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fYZ.AubY(function13, obj);
            }
        }));
    }

    public static final InterfaceC60096zvd hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(java.lang.String str, final fYZ fyz, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        final long jValueOf = C33129mqd.valueOf(str);
        CustomChainCoinMeta customChainCoinMetaKWHzl = C10598brV.AEQbTJ.KWHzl(jValueOf);
        fyz.EZpvd = customChainCoinMetaKWHzl;
        if (customChainCoinMetaKWHzl == null) {
            AbstractC12782ctV abstractC12782ctV = fyz.djBIcL;
            if (abstractC12782ctV == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV = null;
            }
            AbstractC58185ywX<java.util.List<C13924dbk>> abstractC58185ywXGkJEwt = abstractC12782ctV.gkJEwt();
            final Function1 function1 = new Function1() { // from class: o.fZy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fYZ.KWHzl(this.copydefault, jValueOf, (java.util.List) obj);
                }
            };
            return abstractC58185ywXGkJEwt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fZx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fYZ.iwGUEr(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
    }

    public static final java.lang.Boolean iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean KWHzl(fYZ fyz, long j, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C13924dbk) next).OLrzqt().fetchVPNInfo() == j) {
                break;
            }
        }
        C13924dbk c13924dbk = (C13924dbk) next;
        C10854bwM c10854bwMOLrzqt = c13924dbk != null ? c13924dbk.OLrzqt() : null;
        fyz.valueOf = c10854bwMOLrzqt;
        return java.lang.Boolean.valueOf(c10854bwMOLrzqt != null);
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(fYZ fyz, java.lang.Boolean bool) {
        fyz.copydefault.setValue(bool);
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(fYZ fyz, java.lang.Throwable th) {
        fyz.copydefault.setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    private final AbstractC58185ywX<Unit> fetchVPNInfo() {
        C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        java.lang.String str = this.values;
        if (str == null) {
            str = "";
        }
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = instance$default.OLrzqt(str, true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.EZpvd(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fYZ.uzCIH(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit EZpvd(fYZ fyz, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        fyz.djBIcL = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final void valueOf() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = AEQbTJ();
        final Function1 function1 = new Function1() { // from class: o.fZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.valueOf(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.fZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fYZ.gHZMYf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fZl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.AhwBna(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.fZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fYZ.zuBGHE(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.fZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.djBIcL(this.copydefault, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fYZ.AwvSrB(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.fZp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.KWHzl(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fZo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fYZ.OcIXYQ(function14, obj);
            }
        }));
    }

    public static final InterfaceC60096zvd valueOf(fYZ fyz, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return fyz.AhwBna();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AhwBna(fYZ fyz, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && fyz.gEmmrt == 5) {
            return fyz.gEmmrt();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final void AwvSrB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(fYZ fyz, kotlin.Pair pair) {
        fyz.AhwBna.setValue(pair);
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(fYZ fyz, java.lang.Throwable th) {
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> mutableLiveData = fyz.AhwBna;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        Intrinsics.copydefault(th);
        mutableLiveData.setValue(C56390yDp.OLrzqt(bool, C10857bwP.KWHzl("TransactionAddCustomTokenViewModel", th)));
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ() {
        if (this.EZpvd != null) {
            return OLrzqt();
        }
        return copydefault();
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt() {
        final java.lang.String strIsConnected;
        CustomChainCoinMeta customChainCoinMeta = this.EZpvd;
        Intrinsics.copydefault(customChainCoinMeta);
        CustomChainMeta customChainMetaOLrzqt = customChainCoinMeta.OLrzqt();
        if (customChainMetaOLrzqt == null || (strIsConnected = customChainMetaOLrzqt.isConnected()) == null) {
            strIsConnected = "";
        }
        CustomNetworkInfo customNetworkInfo = this.AEQbTJ;
        if (customNetworkInfo == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo = null;
        }
        final java.lang.String contractAddress = customNetworkInfo.getContractAddress();
        if (contractAddress == null) {
            contractAddress = "";
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXEZpvd = C10734btz.KWHzl.KWHzl(strIsConnected, contractAddress).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fZr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.copydefault(strIsConnected, contractAddress, this, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fZn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fYZ.fARcdN(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(java.lang.String str, java.lang.String str2, final fYZ fyz, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        }
        C10734btz c10734btz = C10734btz.KWHzl;
        AbstractC58260yxt<java.lang.String> abstractC58260yxtGEmmrt = c10734btz.gEmmrt(str, str2);
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = c10734btz.OLrzqt(str, str2);
        final Function2 function2 = new Function2() { // from class: o.fZD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return fYZ.KWHzl((java.lang.String) obj, (java.lang.String) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58260yxt.OLrzqt(abstractC58260yxtGEmmrt, abstractC58260yxtOLrzqt, new InterfaceC58223yxI() { // from class: o.fZE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return fYZ.KWHzl(function2, obj, obj2);
            }
        }).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fZF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.AEQbTJ(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fZC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fYZ.ejfBZ(function1, obj);
            }
        });
    }

    public static final kotlin.Pair KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair KWHzl(java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C56390yDp.OLrzqt(str, str2);
    }

    public static final kotlin.Pair ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(fYZ fyz, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        int iAhwBna = C33129mqd.AhwBna((java.lang.String) pair.getSecond());
        CustomNetworkInfo customNetworkInfo = fyz.AEQbTJ;
        if (customNetworkInfo == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo = null;
        }
        return !C33129mqd.OLrzqt(java.lang.Integer.valueOf(iAhwBna), java.lang.Integer.valueOf(customNetworkInfo.getDecimals())) ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fiXcQa)) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.abAflu));
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault() {
        CustomNetworkInfo customNetworkInfo = this.AEQbTJ;
        if (customNetworkInfo == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo = null;
        }
        java.lang.String contractAddress = customNetworkInfo.getContractAddress();
        if (contractAddress == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.abAflu)));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
        C10854bwM c10854bwM = this.valueOf;
        Intrinsics.copydefault(c10854bwM);
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(instance$default.copydefault(c10854bwM.AEQbTJ(), contractAddress, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.fZI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.KWHzl(this.OLrzqt, (ContractAddressResp) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fZJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fYZ.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(fYZ fyz, ContractAddressResp contractAddressResp) {
        Intrinsics.checkNotNullParameter(contractAddressResp, "");
        int precision = contractAddressResp.getPrecision();
        CustomNetworkInfo customNetworkInfo = fyz.AEQbTJ;
        CustomNetworkInfo customNetworkInfo2 = null;
        if (customNetworkInfo == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo = null;
        }
        if (!C33129mqd.OLrzqt(java.lang.Integer.valueOf(precision), java.lang.Integer.valueOf(customNetworkInfo.getDecimals()))) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fiXcQa));
        }
        java.lang.String contractAddress = contractAddressResp.getContractAddress();
        CustomNetworkInfo customNetworkInfo3 = fyz.AEQbTJ;
        if (customNetworkInfo3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            customNetworkInfo2 = customNetworkInfo3;
        }
        return !C59449zhJ.AEQbTJ((java.lang.CharSequence) contractAddress, (java.lang.CharSequence) customNetworkInfo2.getContractAddress()) ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.abAflu)) : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AhwBna() {
        if (this.EZpvd != null) {
            return AYXKKw();
        }
        return djBIcL();
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AYXKKw() {
        java.lang.String strIsConnected;
        final CustomChainCoinMeta customChainCoinMeta = this.EZpvd;
        Intrinsics.copydefault(customChainCoinMeta);
        CustomNetworkInfo customNetworkInfo = this.AEQbTJ;
        if (customNetworkInfo == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo = null;
        }
        final java.lang.String contractAddress = customNetworkInfo.getContractAddress();
        if (contractAddress == null) {
            contractAddress = "";
        }
        CustomChainMeta customChainMetaOLrzqt = customChainCoinMeta.OLrzqt();
        if (customChainMetaOLrzqt == null || (strIsConnected = customChainMetaOLrzqt.isConnected()) == null) {
            strIsConnected = "";
        }
        final CustomChainCoinMeta customChainCoinMetaCopydefault = C10598brV.AEQbTJ.copydefault(contractAddress, C33129mqd.valueOf(this.KWHzl));
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C10734btz.KWHzl.AYXKKw(strIsConnected, contractAddress).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fZB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYZ.copydefault(customChainCoinMetaCopydefault, this, customChainCoinMeta, contractAddress, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fZG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fYZ.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(CustomChainCoinMeta customChainCoinMeta, fYZ fyz, CustomChainCoinMeta customChainCoinMeta2, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        CustomNetworkInfo customNetworkInfo = null;
        AbstractC12782ctV abstractC12782ctV = null;
        if (customChainCoinMeta != null) {
            AbstractC12782ctV abstractC12782ctV2 = fyz.djBIcL;
            if (abstractC12782ctV2 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV2 = null;
            }
            if (abstractC12782ctV2.AkhnZx(customChainCoinMeta.AkhnZx())) {
                return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.jNexW)));
            }
            AbstractC12782ctV abstractC12782ctV3 = fyz.djBIcL;
            if (abstractC12782ctV3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC12782ctV = abstractC12782ctV3;
            }
            AbstractC58260yxt<java.lang.Long> newProxyInstance = abstractC12782ctV.getNewProxyInstance(customChainCoinMeta.valueOf());
            final Function1 function1 = new Function1() { // from class: o.fZA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fYZ.OLrzqt((java.lang.Long) obj);
                }
            };
            return newProxyInstance.copydefault(new InterfaceC58229yxO() { // from class: o.fZL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fYZ.AuCTelauCTel(function1, obj);
                }
            }).EZpvd();
        }
        if (customChainCoinMeta2.OLrzqt() != null) {
            C10639bsJ c10639bsJ = C10639bsJ.EZpvd;
            CustomChainMeta customChainMetaOLrzqt = customChainCoinMeta2.OLrzqt();
            Intrinsics.copydefault(customChainMetaOLrzqt);
            CustomNetworkInfo customNetworkInfo2 = fyz.AEQbTJ;
            if (customNetworkInfo2 == null) {
                Intrinsics.gEmmrt("");
                customNetworkInfo2 = null;
            }
            java.lang.String symbol = customNetworkInfo2.getSymbol();
            java.lang.String str3 = symbol == null ? "" : symbol;
            CustomNetworkInfo customNetworkInfo3 = fyz.AEQbTJ;
            if (customNetworkInfo3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                customNetworkInfo = customNetworkInfo3;
            }
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = c10639bsJ.KWHzl(customChainMetaOLrzqt, str3, str2, str, customNetworkInfo.getDecimals());
            final Function1 function12 = new Function1() { // from class: o.fZK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fYZ.AEQbTJ((java.lang.Boolean) obj);
                }
            };
            return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fZH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fYZ.zLjUOn(function12, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.abAflu)));
    }

    public static final kotlin.Pair AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.jNexW));
    }

    public static final kotlin.Pair zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return C56390yDp.OLrzqt(bool, C33070mpX.AYXKKw(bool.booleanValue() ? C13754dXa.FragmentManager.iUnTnt : C13754dXa.FragmentManager.DxnCrt));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djBIcL() {
        AbstractC12782ctV abstractC12782ctV;
        AbstractC58260yxt abstractC58260yxtCopydefault;
        java.lang.Object next;
        java.util.List listEZpvd;
        AbstractC12782ctV abstractC12782ctV2;
        CustomNetworkInfo customNetworkInfo = this.AEQbTJ;
        AbstractC12782ctV abstractC12782ctV3 = null;
        if (customNetworkInfo == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo = null;
        }
        java.lang.String contractAddress = customNetworkInfo.getContractAddress();
        if (contractAddress == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.abAflu)));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        CustomNetworkInfo customNetworkInfo2 = this.AEQbTJ;
        if (customNetworkInfo2 == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo2 = null;
        }
        java.lang.String symbol = customNetworkInfo2.getSymbol();
        if (symbol == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.abAflu)));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        CustomNetworkInfo customNetworkInfo3 = this.AEQbTJ;
        if (customNetworkInfo3 == null) {
            Intrinsics.gEmmrt("");
            customNetworkInfo3 = null;
        }
        int decimals = customNetworkInfo3.getDecimals();
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMAEQbTJ = c10954byG.valueOf().AEQbTJ(C33129mqd.valueOf(this.KWHzl));
        if (c10854bwMAEQbTJ == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.abAflu)));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        C10854bwM c10854bwMEZpvd = c10954byG.valueOf().EZpvd(contractAddress, c10854bwMAEQbTJ.fetchVPNInfo());
        if (c10854bwMEZpvd != null) {
            AbstractC12782ctV abstractC12782ctV4 = this.djBIcL;
            if (abstractC12782ctV4 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV4 = null;
            }
            if (!abstractC12782ctV4.fetchVPNInfo(c10854bwMEZpvd.OcIXYQ())) {
                AbstractC12782ctV abstractC12782ctV5 = this.djBIcL;
                if (abstractC12782ctV5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV5 = null;
                }
                if (abstractC12782ctV5.isConnected(c10854bwMEZpvd.OcIXYQ())) {
                    java.util.List<C10854bwM> listAEQbTJ = c10954byG.valueOf().AEQbTJ(c10854bwMEZpvd.fJNWhG());
                    java.util.Iterator<T> it = listAEQbTJ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((C10854bwM) next).AhwBna() == c10854bwMEZpvd.AhwBna()) {
                            break;
                        }
                    }
                    if (next != null) {
                        java.util.ArrayList<C10854bwM> arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : listAEQbTJ) {
                            C10854bwM c10854bwM = (C10854bwM) obj;
                            AbstractC12782ctV abstractC12782ctV6 = this.djBIcL;
                            if (abstractC12782ctV6 == null) {
                                Intrinsics.gEmmrt("");
                                abstractC12782ctV6 = null;
                            }
                            if (abstractC12782ctV6.KWHzl(c10854bwM.OcIXYQ())) {
                                AbstractC12782ctV abstractC12782ctV7 = this.djBIcL;
                                if (abstractC12782ctV7 == null) {
                                    Intrinsics.gEmmrt("");
                                    abstractC12782ctV2 = null;
                                } else {
                                    abstractC12782ctV2 = abstractC12782ctV7;
                                }
                                ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c10854bwMEZpvd.AEQbTJ(), null, 2, null);
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) (chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null))) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        listEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                        for (C10854bwM c10854bwM2 : arrayList) {
                            AbstractC12782ctV abstractC12782ctV8 = this.djBIcL;
                            if (abstractC12782ctV8 == null) {
                                Intrinsics.gEmmrt("");
                                abstractC12782ctV8 = null;
                            }
                            listEZpvd.add(abstractC12782ctV8.OLrzqt(c10854bwM2.OcIXYQ(), true));
                        }
                    } else {
                        AbstractC12782ctV abstractC12782ctV9 = this.djBIcL;
                        if (abstractC12782ctV9 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC12782ctV3 = abstractC12782ctV9;
                        }
                        listEZpvd = C56402yEa.EZpvd(abstractC12782ctV3.OLrzqt(c10854bwMEZpvd.OcIXYQ(), true));
                    }
                    AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(listEZpvd);
                    final Function1 function1 = new Function1() { // from class: o.fZP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return fYZ.OLrzqt((java.util.List) obj2);
                        }
                    };
                    abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.fZN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj2) {
                            return fYZ.zsXlph(function1, obj2);
                        }
                    });
                }
            } else {
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
            }
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            final Function1 function12 = new Function1() { // from class: o.fZO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return fYZ.KWHzl((java.lang.Integer) obj2);
                }
            };
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.fZh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return fYZ.sSMYrx(function12, obj2);
                }
            }).EZpvd();
            Intrinsics.copydefault(abstractC58185ywXEZpvd);
            return abstractC58185ywXEZpvd;
        }
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
        C10854bwM c10854bwM3 = this.valueOf;
        Intrinsics.copydefault(c10854bwM3);
        long jAEQbTJ = c10854bwM3.AEQbTJ();
        AbstractC12782ctV abstractC12782ctV10 = this.djBIcL;
        if (abstractC12782ctV10 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        } else {
            abstractC12782ctV = abstractC12782ctV10;
        }
        AbstractC58185ywX abstractC58185ywXOLrzqt = instance$default.OLrzqt(jAEQbTJ, contractAddress, symbol, decimals, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : abstractC12782ctV, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
        final Function1 function13 = new Function1() { // from class: o.fZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return fYZ.AEQbTJ((ResponseData) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fZf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return fYZ.AxsJAY(function13, obj2);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Integer OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final kotlin.Pair sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.jNexW));
    }

    public static final kotlin.Pair AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> gEmmrt() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.fZq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                fYZ.copydefault(this.AEQbTJ, interfaceC58257yxq);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final void copydefault(fYZ fyz, InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
        java.lang.String str = fyz.DbNXlk;
        java.lang.String str2 = str != null ? str : "";
        java.lang.Long l = fyz.AkhnZx;
        instance$default.AEQbTJ(str2, l != null ? l.longValue() : 0L, EIP1271Verifier.hexPrefix);
        interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        isConnected();
    }

    private final void isConnected() {
        if (this.gEmmrt != 5 || this.isConnected) {
            return;
        }
        this.isConnected = true;
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

    public static final kotlin.Pair AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.iUnTnt));
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getErrorMsg());
    }
}
