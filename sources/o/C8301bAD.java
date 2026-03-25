package o;

import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.WalletAddressItem;
import com.okinc.wallet.api.bean.AddressType;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10525bqB;
import o.C11010bzJ;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bAD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8301bAD {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public AbstractC12782ctV djBIcL;
    public long EZpvd = -1;
    public long KWHzl = -1;
    public java.lang.String copydefault = "";
    public java.lang.String gEmmrt = "";
    public int AEQbTJ = AddressType.Legacy.getValue();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.AEQbTJ = i;
    }

    /* JADX INFO: renamed from: o.bAD$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bAD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ctV> */
    public final AbstractC58260yxt<AbstractC12782ctV> KWHzl(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = j;
        this.copydefault = str2;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
        this.KWHzl = c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : -1L;
        this.gEmmrt = str;
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.bAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8301bAD.KWHzl(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8301bAD.uzCIH(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final AbstractC12782ctV uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public static final AbstractC12782ctV KWHzl(C8301bAD c8301bAD, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c8301bAD.djBIcL = abstractC12782ctV;
        return abstractC12782ctV;
    }

    public static /* synthetic */ void setAddressType$default(C8301bAD c8301bAD, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = AddressType.Legacy.getValue();
        }
        c8301bAD.KWHzl(i);
    }

    public static final java.lang.Integer ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.bAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8301bAD.OLrzqt((PasswordCheckResult) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8301bAD.ejfBZ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bAI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8301bAD.OLrzqt(this.copydefault, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8301bAD.DbNXlk(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8301bAD.EZpvd(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.bAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8301bAD.isConnected(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.bAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8301bAD.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.bAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8301bAD.fARcdN(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt4, "");
        return abstractC58260yxtOLrzqt4;
    }

    public static final java.lang.Integer OLrzqt(PasswordCheckResult passwordCheckResult) {
        int i;
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (passwordCheckResult.isPassed()) {
            i = MfaResponse.CREATE_SESSION_FAILURE;
        } else {
            i = passwordCheckResult.isLocked() ? MfaResponse.SESSION_EXPIRED : MfaResponse.SESSION_INVALID;
        }
        return java.lang.Integer.valueOf(i);
    }

    public static final InterfaceC58261yxu DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C8301bAD c8301bAD, java.lang.String str, final java.lang.Integer num) {
        InterfaceC58261yxu interfaceC58261yxuCopydefault;
        Intrinsics.checkNotNullParameter(num, "");
        if (num.intValue() == 5001) {
            AbstractC12782ctV abstractC12782ctV = c8301bAD.djBIcL;
            if (abstractC12782ctV != null) {
                if (abstractC12782ctV.AubY()) {
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtValues = abstractC12782ctV.values(str);
                    final Function1 function1 = new Function1() { // from class: o.bAW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C8301bAD.KWHzl(num, (java.lang.String) obj);
                        }
                    };
                    interfaceC58261yxuCopydefault = abstractC58260yxtValues.copydefault(new InterfaceC58229yxO() { // from class: o.bAU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C8301bAD.AuCTel(function1, obj);
                        }
                    });
                } else {
                    AbstractC58260yxt abstractC58260yxtPrivateKeyForChainId$default = AbstractC12782ctV.privateKeyForChainId$default(abstractC12782ctV, str, c8301bAD.EZpvd, 0, 4, null);
                    final Function1 function12 = new Function1() { // from class: o.bAV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C8301bAD.OLrzqt(num, (java.lang.String) obj);
                        }
                    };
                    interfaceC58261yxuCopydefault = abstractC58260yxtPrivateKeyForChainId$default.copydefault(new InterfaceC58229yxO() { // from class: o.bBb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C8301bAD.fIwbmz(function12, obj);
                        }
                    });
                }
                if (interfaceC58261yxuCopydefault != null) {
                    return interfaceC58261yxuCopydefault;
                }
            }
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(num, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(num, ""));
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, str);
    }

    public static final kotlin.Pair fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, str);
    }

    public static final InterfaceC58261yxu isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C8301bAD c8301bAD, kotlin.Pair pair) {
        WalletAddressItem walletAddressItemKWHzl;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() == 5001) {
            C13847daM c13847daM = new C13847daM(c8301bAD.KWHzl);
            AbstractC12782ctV abstractC12782ctV = c8301bAD.djBIcL;
            if (abstractC12782ctV != null && abstractC12782ctV.AubY()) {
                java.lang.String str = (java.lang.String) pair.getSecond();
                AbstractC12782ctV abstractC12782ctV2 = c8301bAD.djBIcL;
                walletAddressItemKWHzl = c13847daM.EZpvd(str, abstractC12782ctV2 != null ? abstractC12782ctV2.finit() : 0, c8301bAD.AEQbTJ);
            } else {
                walletAddressItemKWHzl = c13847daM.KWHzl((java.lang.String) pair.getSecond(), c8301bAD.AEQbTJ, "");
            }
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Integer.valueOf(MfaResponse.CREATE_SESSION_FAILURE), walletAddressItemKWHzl));
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(-1, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final InterfaceC58261yxu fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(final C8301bAD c8301bAD, kotlin.Pair pair) {
        AbstractC12782ctV abstractC12782ctV;
        java.util.ArrayList<ChainAddress> arrayListGGvvIC;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() == 5001 && pair.getSecond() != null) {
            java.lang.Object second = pair.getSecond();
            Intrinsics.copydefault(second);
            java.lang.String address = ((WalletAddressItem) second).getAddress();
            c8301bAD.copydefault = address;
            if (!c8301bAD.AEQbTJ(address) && (abstractC12782ctV = c8301bAD.djBIcL) != null && (arrayListGGvvIC = abstractC12782ctV.gGvvIC()) != null) {
                long j = c8301bAD.EZpvd;
                java.lang.String str = c8301bAD.copydefault;
                int i = c8301bAD.AEQbTJ;
                java.lang.Object second2 = pair.getSecond();
                Intrinsics.copydefault(second2);
                arrayListGGvvIC.add(new ChainAddress(j, str, i, null, null, false, ((WalletAddressItem) second2).getPubKey(), "", 24, null));
            }
            AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtOLrzqt = c8301bAD.OLrzqt();
            final Function1 function1 = new Function1() { // from class: o.bAR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8301bAD.EZpvd(this.copydefault, (java.util.List) obj);
                }
            };
            return abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bAP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8301bAD.AkhnZx(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault("");
    }

    public static final InterfaceC58261yxu AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C8301bAD c8301bAD, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return AbstractC58260yxt.copydefault(c8301bAD.copydefault);
    }

    public final AbstractC58260yxt<java.util.List<AddressData>> EZpvd() {
        AbstractC58260yxt<java.util.List<ChainAddressSegWitEntity>> abstractC58260yxtAEQbTJ = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna().AEQbTJ(this.gEmmrt, this.EZpvd);
        final Function1 function1 = new Function1() { // from class: o.bAJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8301bAD.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.bAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8301bAD.getFieldNames(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8301bAD.AYXKKw(this.AEQbTJ, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<AddressData>> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.bAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8301bAD.getNewProxyInstance(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.util.ArrayList hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList KWHzl(java.util.List list, C8301bAD c8301bAD, int i, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.add(new ChainAddressSegWitEntity(c8301bAD.gEmmrt, c8301bAD.EZpvd, i, c8301bAD.copydefault, null, null, 48, null));
        return arrayList;
    }

    public static final java.util.List getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List AYXKKw(C8301bAD c8301bAD, java.util.List list) {
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2;
        AbstractC12782ctV abstractC12782ctV3;
        java.lang.Object next;
        java.lang.Integer numOLrzqt;
        java.lang.Object next2;
        java.lang.String address;
        Intrinsics.checkNotNullParameter(list, "");
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(c8301bAD.EZpvd);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C8322bAY c8322bAY = C8322bAY.KWHzl;
        long jFetchVPNInfo = c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : -1L;
        AbstractC12782ctV abstractC12782ctV4 = c8301bAD.djBIcL;
        java.util.Iterator<T> it = c8322bAY.AEQbTJ(jFetchVPNInfo, (abstractC12782ctV4 == null || !abstractC12782ctV4.ORxRYg()) && ((abstractC12782ctV = c8301bAD.djBIcL) == null || !abstractC12782ctV.AxsJAY()) && ((abstractC12782ctV2 = c8301bAD.djBIcL) == null || !abstractC12782ctV2.zuBGHE())).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            java.util.Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((ChainAddressSegWitEntity) next2).getAddressType() == iIntValue) {
                    break;
                }
            }
            ChainAddressSegWitEntity chainAddressSegWitEntity = (ChainAddressSegWitEntity) next2;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c8301bAD.copydefault, (java.lang.Object) (chainAddressSegWitEntity != null ? chainAddressSegWitEntity.getAddress() : null));
            if (chainAddressSegWitEntity == null || (address = chainAddressSegWitEntity.getAddress()) == null) {
                address = "";
            }
            linkedHashMap.put(java.lang.Integer.valueOf(iIntValue), new AddressData(iIntValue, zEZpvd, true, address));
        }
        if ((c10854bwMKWHzl != null && c10854bwMKWHzl.AxsJAYaxsJAY()) || (c10854bwMKWHzl != null && c10854bwMKWHzl.DLWbHP())) {
            AddressType addressType = AddressType.P2SHType;
            AddressData addressData = (AddressData) linkedHashMap.get(java.lang.Integer.valueOf(addressType.getValue()));
            AddressType addressType2 = AddressType.P2SHCommonType;
            AddressData addressData2 = (AddressData) linkedHashMap.get(java.lang.Integer.valueOf(addressType2.getValue()));
            java.lang.String address2 = addressData != null ? addressData.getAddress() : null;
            if (address2 == null || address2.length() == 0) {
                java.lang.String address3 = addressData2 != null ? addressData2.getAddress() : null;
                if (address3 == null || address3.length() == 0) {
                    numOLrzqt = C8322bAY.KWHzl.OLrzqt(c10854bwMKWHzl.fetchVPNInfo());
                    int value = addressType.getValue();
                    if (numOLrzqt == null && numOLrzqt.intValue() == value) {
                        linkedHashMap.remove(java.lang.Integer.valueOf(addressType2.getValue()));
                    } else {
                        int value2 = addressType2.getValue();
                        if (numOLrzqt != null && numOLrzqt.intValue() == value2) {
                            linkedHashMap.remove(java.lang.Integer.valueOf(addressType.getValue()));
                        }
                    }
                } else {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (addressData != null ? addressData.getAddress() : null))) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) (addressData2 != null ? addressData2.getAddress() : null))) {
                        }
                        int value3 = addressType.getValue();
                        if (numOLrzqt == null) {
                            linkedHashMap.remove(java.lang.Integer.valueOf(addressType2.getValue()));
                        }
                    }
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (addressData != null ? addressData.getAddress() : null))) {
                        numOLrzqt = java.lang.Integer.valueOf(addressType.getValue());
                    } else {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) (addressData2 != null ? addressData2.getAddress() : null))) {
                            numOLrzqt = java.lang.Integer.valueOf(addressType2.getValue());
                        } else {
                            numOLrzqt = C8322bAY.KWHzl.OLrzqt(c10854bwMKWHzl.fetchVPNInfo());
                        }
                    }
                    int value32 = addressType.getValue();
                    if (numOLrzqt == null) {
                    }
                }
            }
        }
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.AxsJAYaxsJAY() && (abstractC12782ctV3 = c8301bAD.djBIcL) != null && abstractC12782ctV3.ORxRYg()) {
            java.util.Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (((ChainAddressSegWitEntity) next).getAddressType() == AddressType.P2TRType.getValue()) {
                    break;
                }
            }
            ChainAddressSegWitEntity chainAddressSegWitEntity2 = (ChainAddressSegWitEntity) next;
            java.lang.String address4 = chainAddressSegWitEntity2 != null ? chainAddressSegWitEntity2.getAddress() : null;
            AddressType addressType3 = AddressType.P2TRType;
            int value4 = addressType3.getValue();
            int value5 = addressType3.getValue();
            if (address4 == null) {
                address4 = "";
            }
            linkedHashMap.put(java.lang.Integer.valueOf(value4), new AddressData(value5, false, false, address4));
        }
        java.util.Collection collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
    }

    /* JADX DEBUG: Type inference failed for r10v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.ArrayList<o.bqB>> */
    public final AbstractC58260yxt<java.util.ArrayList<C10525bqB>> AEQbTJ(final long j) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.HashMap map = new java.util.HashMap();
        AbstractC58260yxt<java.util.List<AddressData>> abstractC58260yxtEZpvd = EZpvd();
        final Function1 function1 = new Function1() { // from class: o.bAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8301bAD.OLrzqt(this.copydefault, j, arrayList, map, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.bAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8301bAD.fJNWhG(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.ArrayList fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList OLrzqt(C8301bAD c8301bAD, long j, java.util.ArrayList arrayList, java.util.HashMap map, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC12782ctV abstractC12782ctV = c8301bAD.djBIcL;
        Intrinsics.copydefault(abstractC12782ctV);
        java.util.List<C10525bqB> listFARcdN = abstractC12782ctV.fARcdN(j);
        if (listFARcdN != null) {
            for (C10525bqB c10525bqB : listFARcdN) {
                map.put(c10525bqB.zuBGHE(), c10525bqB);
            }
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AddressData addressData = (AddressData) it.next();
            if (addressData.isSupported()) {
                C10525bqB c10525bqB2 = (C10525bqB) map.get(addressData.getAddress());
                if (c10525bqB2 != null) {
                    java.lang.String addressFormat = addressData.getAddressFormat();
                    if (addressFormat.length() == 0 && (c10854bwMKWHzl == null || (addressFormat = c10854bwMKWHzl.values()) == null)) {
                        addressFormat = "";
                    }
                    c10525bqB2.AYXKKw(addressFormat);
                    arrayList.add(c10525bqB2);
                } else if (c10854bwMKWHzl != null) {
                    C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
                    AbstractC12782ctV abstractC12782ctV2 = c8301bAD.djBIcL;
                    Intrinsics.copydefault(abstractC12782ctV2);
                    C10525bqB c10525bqBAEQbTJ = stateListAnimator.AEQbTJ(c10854bwMKWHzl, abstractC12782ctV2, addressData.getAddress());
                    c10525bqBAEQbTJ.KWHzl(addressData.getAddress().length() == 0);
                    java.lang.String addressFormat2 = addressData.getAddressFormat();
                    if (addressFormat2.length() == 0) {
                        addressFormat2 = c10854bwMKWHzl.values();
                    }
                    c10525bqBAEQbTJ.AYXKKw(addressFormat2);
                    arrayList.add(c10525bqBAEQbTJ);
                }
            }
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, C10534bqK.copydefault);
        arrayList.clear();
        arrayList.addAll(listEZpvd);
        return arrayList;
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> OLrzqt() {
        cQM cqmAhwBna = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AhwBna();
        AbstractC12782ctV abstractC12782ctV = this.djBIcL;
        Intrinsics.copydefault(abstractC12782ctV);
        return cqmAhwBna.EZpvd(abstractC12782ctV);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        java.util.ArrayList<ChainAddress> arrayListGGvvIC;
        if (str.length() == 0) {
            return true;
        }
        AbstractC12782ctV abstractC12782ctV = this.djBIcL;
        java.lang.Object obj = null;
        if (abstractC12782ctV != null && (arrayListGGvvIC = abstractC12782ctV.gGvvIC()) != null) {
            java.util.Iterator<T> it = arrayListGGvvIC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                ChainAddress chainAddress = (ChainAddress) next;
                if (C59449zhJ.gEmmrt(chainAddress.getAddress(), str, true) && chainAddress.getCoinId() == this.EZpvd) {
                    obj = next;
                    break;
                }
            }
            obj = (ChainAddress) obj;
        }
        return obj != null;
    }

    public static final InterfaceC58261yxu AEQbTJ(final C8301bAD c8301bAD, final java.util.List list) {
        java.lang.Object next;
        AbstractC12782ctV abstractC12782ctV;
        java.util.ArrayList<ChainAddress> arrayListGGvvIC;
        AbstractC12782ctV abstractC12782ctV2;
        ChainAddress chainAddressAddressFromChainId$default;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(((ChainAddressSegWitEntity) next).getAddress(), c8301bAD.copydefault, true)) {
                break;
            }
        }
        if (((ChainAddressSegWitEntity) next) == null) {
            AbstractC12782ctV abstractC12782ctV3 = c8301bAD.djBIcL;
            final int value = (abstractC12782ctV3 == null || !abstractC12782ctV3.DbNXlk(c8301bAD.copydefault) || (abstractC12782ctV2 = c8301bAD.djBIcL) == null || (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c8301bAD.EZpvd, null, 2, null)) == null) ? AddressType.Legacy.getValue() : chainAddressAddressFromChainId$default.getAddressType();
            if (!c8301bAD.AEQbTJ(c8301bAD.copydefault) && (abstractC12782ctV = c8301bAD.djBIcL) != null && (arrayListGGvvIC = abstractC12782ctV.gGvvIC()) != null) {
                arrayListGGvvIC.add(new ChainAddress(c8301bAD.EZpvd, c8301bAD.copydefault, value, null, null, false, "", "", 24, null));
            }
            AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtOLrzqt = c8301bAD.OLrzqt();
            final Function1 function1 = new Function1() { // from class: o.bAS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C8301bAD.KWHzl(list, c8301bAD, value, (java.util.List) obj);
                }
            };
            InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bAQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C8301bAD.hDKMBd(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC58261yxuCopydefault);
            return interfaceC58261yxuCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(list);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }
}
