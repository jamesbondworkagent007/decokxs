package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.C11010bzJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10828bvn {
    public DappSignArgs AEQbTJ;
    public C10854bwM EZpvd;
    public Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> KWHzl;
    public AbstractC12782ctV valueOf;
    public final java.lang.String copydefault = getClass().getSimpleName();
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.bvw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC10828bvn.valueOf();
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.bvx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC10828bvn.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.bvy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC10828bvn.copydefault();
        }
    });

    public abstract AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull DappSignArgs dappSignArgs) {
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        this.AEQbTJ = dappSignArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        this.KWHzl = function1;
    }

    public abstract AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.lang.String str);

    public abstract AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(java.lang.String str);

    public abstract java.lang.String fIwbmz();

    public abstract java.lang.String fetchVPNInfo();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM values() {
        return this.EZpvd;
    }

    public final DappSignArgs DbNXlk() {
        DappSignArgs dappSignArgs = this.AEQbTJ;
        if (dappSignArgs != null) {
            return dappSignArgs;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C13934dbu AuCTel() {
        return (C13934dbu) this.gEmmrt.getValue();
    }

    public static final C13934dbu valueOf() {
        return new C13934dbu();
    }

    public final C8497bDo AkhnZx() {
        return (C8497bDo) this.AhwBna.getValue();
    }

    public static final C8497bDo AEQbTJ() {
        return new C8497bDo();
    }

    public final C10798bvJ djBIcL() {
        return (C10798bvJ) this.OLrzqt.getValue();
    }

    public static final C10798bvJ copydefault() {
        return new C10798bvJ(Json.Default);
    }

    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull DappSignArgs dappSignArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        this.valueOf = abstractC12782ctV;
        EZpvd(dappSignArgs);
        this.EZpvd = AEQbTJ(C33129mqd.valueOf(dappSignArgs.getChainId()));
        AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXOLrzqt = OLrzqt(AYXKKw());
        final Function1 function1 = new Function1() { // from class: o.bvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC10828bvn.copydefault(this.KWHzl, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtValueOf = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bvu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC10828bvn.valueOf(function1, obj);
            }
        }).valueOf();
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtValueOf, "");
        return abstractC58260yxtValueOf;
    }

    public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(AbstractC10828bvn abstractC10828bvn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
        }
        abstractC10828bvn.copydefault((java.util.List<TxToastCheckRes>) list);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public TxToastCheckReq AYXKKw() {
        TxToastCheckReq txToastCheckReq = new TxToastCheckReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, 4194303, null);
        txToastCheckReq.setCheckTypes(C56402yEa.EZpvd(9));
        txToastCheckReq.setFrom(AhwBna());
        txToastCheckReq.setBizLine(null);
        txToastCheckReq.setPayload(null);
        C10854bwM c10854bwMGEmmrt = gEmmrt();
        txToastCheckReq.setChainId(c10854bwMGEmmrt != null ? c10854bwMGEmmrt.fetchVPNInfo() : 0L);
        C10854bwM c10854bwMGEmmrt2 = gEmmrt();
        txToastCheckReq.setCoinId(c10854bwMGEmmrt2 != null ? java.lang.Long.valueOf(c10854bwMGEmmrt2.AhwBna()) : null);
        txToastCheckReq.setDomain("");
        return txToastCheckReq;
    }

    public AbstractC58185ywX<java.util.List<TxToastCheckRes>> OLrzqt(@NotNull TxToastCheckReq txToastCheckReq) {
        Intrinsics.checkNotNullParameter(txToastCheckReq, "");
        return C43423rox.unwrapResponseData$default(AuCTel().copydefault(txToastCheckReq), (Function1) null, 1, (java.lang.Object) null);
    }

    public C10854bwM AEQbTJ(long j) {
        return C10954byG.EZpvd.valueOf().copydefault(j);
    }

    public final AbstractC12782ctV fJNWhG() {
        AbstractC12782ctV abstractC12782ctV = this.valueOf;
        if (abstractC12782ctV != null) {
            return abstractC12782ctV;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public java.lang.String AhwBna() {
        java.lang.String address;
        ChainAddress chainAddressIsConnected = isConnected();
        return (chainAddressIsConnected == null || (address = chainAddressIsConnected.getAddress()) == null) ? "" : address;
    }

    public ChainAddress isConnected() {
        AbstractC12782ctV abstractC12782ctVFJNWhG = fJNWhG();
        C10854bwM c10854bwM = this.EZpvd;
        return AbstractC12782ctV.addressFromChainId$default(abstractC12782ctVFJNWhG, C33129mqd.valueOf(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AEQbTJ()) : null), null, 2, null);
    }

    public static /* synthetic */ AbstractC58185ywX onSignForHardware$default(AbstractC10828bvn abstractC10828bvn, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignForHardware");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return abstractC10828bvn.copydefault(str);
    }

    public static /* synthetic */ AbstractC58185ywX sign$default(AbstractC10828bvn abstractC10828bvn, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sign");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return abstractC10828bvn.copydefault(str, str2);
    }

    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@NotNull final java.lang.String str, java.lang.String str2) {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC12782ctV abstractC12782ctV = this.valueOf;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        if (abstractC12782ctV.gHZMYf()) {
            abstractC58185ywXCopydefault = copydefault(str2);
        } else {
            AbstractC12782ctV abstractC12782ctV2 = this.valueOf;
            if (abstractC12782ctV2 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV2 = null;
            }
            if (!abstractC12782ctV2.iwGUEr()) {
                AbstractC12782ctV abstractC12782ctV3 = this.valueOf;
                if (abstractC12782ctV3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV3 = null;
                }
                if (abstractC12782ctV3.ORxRYg()) {
                    abstractC58185ywXCopydefault = OLrzqt(str);
                } else {
                    AbstractC12782ctV abstractC12782ctV4 = this.valueOf;
                    if (abstractC12782ctV4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC12782ctV4 = null;
                    }
                    if (!abstractC12782ctV4.AEQbTJ(WalletType.MPCWallet)) {
                        AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(str);
                        final Function1 function1 = new Function1() { // from class: o.bvD
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return AbstractC10828bvn.EZpvd((PasswordCheckResult) obj);
                            }
                        };
                        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bvC
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return AbstractC10828bvn.fJNWhG(function1, obj);
                            }
                        });
                        final Function1 function12 = new Function1() { // from class: o.bvE
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return AbstractC10828bvn.copydefault(this.copydefault, str, (java.lang.Integer) obj);
                            }
                        };
                        AbstractC58185ywX abstractC58185ywXEZpvd = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bvH
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return AbstractC10828bvn.DbNXlk(function12, obj);
                            }
                        }).EZpvd();
                        final Function1 function13 = new Function1() { // from class: o.bvk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return AbstractC10828bvn.OLrzqt(this.EZpvd, (kotlin.Pair) obj);
                            }
                        };
                        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bvo
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return AbstractC10828bvn.isConnected(function13, obj);
                            }
                        });
                        final Function1 function14 = new Function1() { // from class: o.bvp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return AbstractC10828bvn.copydefault(this.copydefault, (C10807bvS) obj);
                            }
                        };
                        abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bvq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return AbstractC10828bvn.AkhnZx(function14, obj);
                            }
                        });
                    }
                }
            }
        }
        final Function1 function15 = new Function1() { // from class: o.bvt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC10828bvn.copydefault(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC10828bvn.AuCTel(function15, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final java.lang.Integer fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer EZpvd(PasswordCheckResult passwordCheckResult) {
        int i;
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (passwordCheckResult.isPassed()) {
            i = -5001;
        } else {
            i = passwordCheckResult.isLocked() ? -5003 : -5002;
        }
        return java.lang.Integer.valueOf(i);
    }

    public static final InterfaceC58261yxu DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(AbstractC10828bvn abstractC10828bvn, java.lang.String str, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        if (num.intValue() == -5001) {
            AbstractC12782ctV abstractC12782ctV = abstractC10828bvn.valueOf;
            AbstractC12782ctV abstractC12782ctV2 = null;
            if (abstractC12782ctV == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV = null;
            }
            if (!abstractC12782ctV.AubY()) {
                AbstractC12782ctV abstractC12782ctV3 = abstractC10828bvn.valueOf;
                if (abstractC12782ctV3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV3 = null;
                }
                if (!abstractC12782ctV3.AEQbTJ(WalletType.HDWallet)) {
                    AbstractC12782ctV abstractC12782ctV4 = abstractC10828bvn.valueOf;
                    if (abstractC12782ctV4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC12782ctV2 = abstractC12782ctV4;
                    }
                    AbstractC58260yxt<java.lang.String> abstractC58260yxtEjfBZ = abstractC12782ctV2.ejfBZ(str);
                    final Function1 function1 = new Function1() { // from class: o.bvv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC10828bvn.KWHzl(num, (java.lang.String) obj);
                        }
                    };
                    return abstractC58260yxtEjfBZ.copydefault(new InterfaceC58229yxO() { // from class: o.bvA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return AbstractC10828bvn.values(function1, obj);
                        }
                    });
                }
            }
            AbstractC58260yxt<java.lang.String> abstractC58260yxtKWHzl = abstractC10828bvn.KWHzl(str);
            final Function1 function12 = new Function1() { // from class: o.bvm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC10828bvn.copydefault(num, (java.lang.String) obj);
                }
            };
            return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bvl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC10828bvn.fetchVPNInfo(function12, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(num, ""));
    }

    public static final kotlin.Pair fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, str);
    }

    public static final kotlin.Pair values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(java.lang.Integer num, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(num, str);
    }

    public static final InterfaceC60096zvd isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC10828bvn abstractC10828bvn, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() != -5001) {
            return AbstractC58185ywX.KWHzl(new C10807bvS(((java.lang.Number) pair.getFirst()).intValue(), (java.lang.String) pair.getSecond()));
        }
        AbstractC12782ctV abstractC12782ctV = abstractC10828bvn.valueOf;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        java.lang.String strEZpvd = abstractC12782ctV.EZpvd(0L);
        AbstractC12782ctV abstractC12782ctV2 = abstractC10828bvn.valueOf;
        if (abstractC12782ctV2 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV2 = null;
        }
        C10525bqB c10525bqBAEQbTJ = abstractC12782ctV2.AEQbTJ(0L);
        return abstractC10828bvn.djBIcL().EZpvd(new C10804bvP(abstractC10828bvn.DbNXlk().getData(), abstractC10828bvn.DbNXlk().getMethod(), strEZpvd, c10525bqBAEQbTJ != null ? java.lang.Long.valueOf(c10525bqBAEQbTJ.OLrzqt()) : null), ((java.lang.Number) pair.getFirst()).intValue(), (java.lang.String) pair.getSecond());
    }

    public static final InterfaceC60096zvd AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(AbstractC10828bvn abstractC10828bvn, C10807bvS c10807bvS) {
        Intrinsics.checkNotNullParameter(c10807bvS, "");
        int iKWHzl = c10807bvS.KWHzl();
        java.lang.String strEZpvd = c10807bvS.EZpvd();
        if (iKWHzl == -5001) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
                return abstractC10828bvn.EZpvd(strEZpvd);
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5004, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(iKWHzl, null, null, null, null, null, 62, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(AbstractC10828bvn abstractC10828bvn, final ResponseData responseData) {
        Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && abstractC10828bvn.DbNXlk().getUseNewCallback() && (function1 = abstractC10828bvn.KWHzl) != null) {
            Intrinsics.copydefault(function1);
            C13934dbu c13934dbuAuCTel = abstractC10828bvn.AuCTel();
            AbstractC12782ctV abstractC12782ctV = abstractC10828bvn.valueOf;
            AbstractC12782ctV abstractC12782ctV2 = null;
            if (abstractC12782ctV == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV = null;
            }
            java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
            AbstractC12782ctV abstractC12782ctV3 = abstractC10828bvn.valueOf;
            if (abstractC12782ctV3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC12782ctV2 = abstractC12782ctV3;
            }
            java.lang.String strDbNXlk = abstractC12782ctV2.DbNXlk();
            java.lang.String strAEQbTJ = C12764ctD.OLrzqt.AEQbTJ(responseData.getData());
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            java.util.HashMap<java.lang.String, java.lang.String> mapCopydefault = c13934dbuAuCTel.copydefault(strUSBtdM, strDbNXlk, "", strAEQbTJ);
            java.lang.String str = (java.lang.String) responseData.getData();
            AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) function1.invoke(new NewSignCallbackBean(mapCopydefault, str != null ? str : "")));
            final Function1 function12 = new Function1() { // from class: o.bvB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC10828bvn.KWHzl(responseData, (ResponseData) obj);
                }
            };
            return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bvz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC10828bvn.ejfBZ(function12, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public static final ResponseData KWHzl(ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData2, "");
        return ResponseData.copy$default(responseData2, 0, null, null, null, responseData.getData(), null, 47, null);
    }

    public static final ResponseData ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public AbstractC58260yxt<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC12782ctV abstractC12782ctV = this.valueOf;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        AbstractC12782ctV abstractC12782ctV2 = abstractC12782ctV;
        C10854bwM c10854bwM = this.EZpvd;
        return AbstractC12782ctV.privateKeyForChainId$default(abstractC12782ctV2, str, c10854bwM != null ? c10854bwM.AEQbTJ() : -1L, 0, 4, null);
    }

    public void copydefault(@NotNull java.util.List<TxToastCheckRes> list) {
        java.util.List<java.lang.String> causeRiskItem;
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = true;
        for (TxToastCheckRes txToastCheckRes : list) {
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType != null && checkType.intValue() == 9 && (causeRiskItem = txToastCheckRes.getCauseRiskItem()) != null && causeRiskItem.contains(TxToastCheckRes.FROM_RISK_REJECT)) {
                z = false;
            }
        }
        AkhnZx().AEQbTJ(new C9788bcG(z, true));
    }
}
