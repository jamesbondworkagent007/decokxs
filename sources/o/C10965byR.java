package o;

import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.HandshakeResponse;
import com.okinc.business.defi.biz.net.bean.MpcSendTxResponse;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.mpc.CurveInfo;
import com.okinc.wallet.core.sign.ECDSA;
import com.okinc.wallet.core.sign.ED25519;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.utxo.RSV;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C11010bzJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.byR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10965byR {
    public static final C10965byR OLrzqt = new C10965byR();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AYXKKw(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    public static final java.lang.Object KWHzl(java.lang.Object obj) {
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String djBIcL(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String valueOf(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str;
    }

    private C10965byR() {
    }

    public final <T, R, S> AbstractC58185ywX<ResponseData<S>> AEQbTJ(@NotNull final java.lang.String str, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final C10854bwM c10854bwM, @NotNull Function0<? extends T> function0, @NotNull Function1<? super T, java.lang.Boolean> function1, @NotNull final Function1<? super T, java.lang.String> function12, @NotNull final Function1<? super T, java.lang.String> function13, @NotNull final Function2<? super java.lang.String, ? super java.util.List<RSV>, ? extends R> function2, @NotNull final Function1<? super R, java.lang.Boolean> function14, @NotNull final Function1<? super R, ? extends S> function15) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function14, "");
        Intrinsics.checkNotNullParameter(function15, "");
        final T tInvoke = function0.invoke();
        if (tInvoke == null || !function1.invoke(tInvoke).booleanValue()) {
            AbstractC58185ywX<ResponseData<S>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5005, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str).EZpvd();
        final Function1 function16 = new Function1() { // from class: o.bzA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.OLrzqt(str, abstractC12782ctV, function12, tInvoke, c10854bwM, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bzx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.DbNXlk(function16, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(abstractC58185ywXKWHzl2, (Function1) null, 1, (java.lang.Object) null);
        final Function1 function17 = new Function1() { // from class: o.bzD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.AEQbTJ(function2, function13, tInvoke, function14, function15, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ((InterfaceC58229yxO) new InterfaceC58229yxO() { // from class: o.byW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.isConnected(function17, obj);
            }
        });
        final Function1 function18 = new Function1() { // from class: o.byS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.byV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.AkhnZx(function18, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        return abstractC58185ywXDjBIcL;
    }

    public static final InterfaceC60096zvd DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(java.lang.String str, AbstractC12782ctV abstractC12782ctV, Function1 function1, java.lang.Object obj, C10854bwM c10854bwM, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        return OLrzqt.copydefault((java.lang.String) function1.invoke(obj), c10854bwM, C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP), abstractC12782ctV.finit());
    }

    public static final ResponseData isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(Function2 function2, Function1 function1, java.lang.Object obj, Function1 function12, Function1 function13, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List list = (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(RSV.Companion.serializer()), str);
        if (list.isEmpty()) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        java.lang.Object objInvoke = function2.invoke(function1.invoke(obj), list);
        if (!((java.lang.Boolean) function12.invoke(objInvoke)).booleanValue()) {
            return new ResponseData(-5005, null, null, null, null, null, 62, null);
        }
        return new ResponseData(-5001, null, null, null, function13.invoke(objInvoke), null, 46, null);
    }

    public static final ResponseData AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AEQbTJ(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(-5005, null, null, null, null, null, 62, null);
    }

    public final <R> AbstractC58185ywX<ResponseData<R>> OLrzqt(@NotNull java.lang.String str, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull final Function0<TxMessage> function0, @NotNull final Function2<? super java.lang.String, ? super RSV, ? extends R> function2, @NotNull final Function1<? super R, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AEQbTJ(str, abstractC12782ctV, c10854bwM, new Function0() { // from class: o.bzn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10965byR.AEQbTJ(function0);
            }
        }, new Function1() { // from class: o.bzo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10965byR.KWHzl((TxMessage) obj));
            }
        }, new Function1() { // from class: o.bzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.copydefault((TxMessage) obj);
            }
        }, new Function1() { // from class: o.bzv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.AhwBna((TxMessage) obj);
            }
        }, new Function2() { // from class: o.bzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10965byR.AEQbTJ(function2, (java.lang.String) obj, (java.util.List) obj2);
            }
        }, new Function1() { // from class: o.bzu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10965byR.fIwbmz(function1, obj));
            }
        }, new Function1() { // from class: o.bzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.KWHzl(obj);
            }
        });
    }

    public static final TxMessage AEQbTJ(Function0 function0) {
        return (TxMessage) function0.invoke();
    }

    public static final boolean KWHzl(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.isValid();
    }

    public static final java.lang.String copydefault(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.getMessage();
    }

    public static final java.lang.String AhwBna(TxMessage txMessage) {
        Intrinsics.checkNotNullParameter(txMessage, "");
        return txMessage.getTx();
    }

    public static final java.lang.Object AEQbTJ(Function2 function2, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return function2.invoke(str, CollectionsKt___CollectionsKt.AuCTelauCTel(list));
    }

    public static final boolean fIwbmz(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.byR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX signMessage$default(C10965byR c10965byR, java.lang.String str, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, Function0 function0, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            function12 = new Function1() { // from class: o.bzr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C10965byR.AYXKKw((java.lang.String) obj2);
                }
            };
        }
        return c10965byR.KWHzl(str, abstractC12782ctV, c10854bwM, (Function0<java.lang.String>) function0, (Function1<? super RSV, java.lang.String>) function1, (Function1<? super java.lang.String, java.lang.String>) function12);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@NotNull java.lang.String str, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull final Function0<java.lang.String> function0, @NotNull final Function1<? super RSV, java.lang.String> function1, @NotNull final Function1<? super java.lang.String, java.lang.String> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return AEQbTJ(str, abstractC12782ctV, c10854bwM, new Function0() { // from class: o.byN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10965byR.EZpvd(function0);
            }
        }, new Function1() { // from class: o.byT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10965byR.gEmmrt((java.lang.String) obj));
            }
        }, new Function1() { // from class: o.bzg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.valueOf((java.lang.String) obj);
            }
        }, new Function1() { // from class: o.bzm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.djBIcL((java.lang.String) obj);
            }
        }, new Function2() { // from class: o.bzy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10965byR.OLrzqt(function1, (java.lang.String) obj, (java.util.List) obj2);
            }
        }, new Function1() { // from class: o.bzz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10965byR.AhwBna((java.lang.String) obj));
            }
        }, new Function1() { // from class: o.bzw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.AEQbTJ(function12, (java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String EZpvd(Function0 function0) {
        return (java.lang.String) function0.invoke();
    }

    public static final boolean gEmmrt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() > 0;
    }

    public static final java.lang.String OLrzqt(Function1 function1, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return (java.lang.String) function1.invoke(CollectionsKt___CollectionsKt.AuCTelauCTel(list));
    }

    public static final boolean AhwBna(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() > 0;
    }

    public static final java.lang.String AEQbTJ(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.lang.String) function1.invoke(str);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@NotNull final java.lang.String str, @NotNull C10854bwM c10854bwM, @NotNull MpcWalletDecodeInfo mpcWalletDecodeInfo, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        final C13934dbu c13934dbu = new C13934dbu();
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        long jQKVWgx = c10854bwMKWHzl != null ? c10854bwMKWHzl.QKVWgx() : -1L;
        xXX xxx = xXX.EZpvd;
        final java.lang.String strKWHzl = xxx.KWHzl();
        final java.lang.String strKWHzl2 = xxx.KWHzl(strKWHzl);
        if (strKWHzl2.length() == 0) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKWException("Encrypt aes key failed", null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        xYQ xyq = xYQ.KWHzl;
        CurveInfo curveInfoCopydefault = xyq.copydefault(jQKVWgx);
        java.lang.Integer numValueOf = curveInfoCopydefault != null ? java.lang.Integer.valueOf(curveInfoCopydefault.getType()) : null;
        if ((numValueOf == null || numValueOf.intValue() != 1) && (numValueOf == null || numValueOf.intValue() != 2)) {
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ2 = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKWException("Curve not supported", null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
            return abstractC58185ywXAEQbTJ2;
        }
        final java.lang.String strKWHzl3 = xyq.KWHzl(jQKVWgx, i);
        final java.lang.String mpcId = mpcWalletDecodeInfo.getMpcId();
        final java.lang.String ecdsaShare2 = mpcWalletDecodeInfo.getEcdsaShare2();
        final java.lang.String ecdsaP2 = mpcWalletDecodeInfo.getEcdsaP2();
        final java.lang.String ed25519Share2 = mpcWalletDecodeInfo.getEd25519Share2();
        final java.lang.Integer num = numValueOf;
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(C13934dbu.handshake$default(c13934dbu, 0, strKWHzl2, "", "", mpcId, null, 32, null), new Function1() { // from class: o.bzc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10965byR.OLrzqt((ResponseData) obj));
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKWException("Handshake failed", null)));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C11607cUn.OLrzqt(abstractC58185ywXOLrzqt);
        final Function1 function1 = new Function1() { // from class: o.bzj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.KWHzl(str, num, mpcId, ecdsaShare2, ecdsaP2, ed25519Share2, strKWHzl, strKWHzl3, c13934dbu, strKWHzl2, (HandshakeResponse) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt2.KWHzl(new InterfaceC58229yxO() { // from class: o.bzi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXAEQbTJ3 = C11607cUn.AEQbTJ(abstractC58185ywXKWHzl);
        final Function1 function12 = new Function1() { // from class: o.bzl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.KWHzl(c13934dbu, mpcId, strKWHzl2, num, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXAEQbTJ3.KWHzl(new InterfaceC58229yxO() { // from class: o.bzk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.AuCTel(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.copydefault(c13934dbu, mpcId, strKWHzl2, num, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.bzp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.fARcdN(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return C33527myD.KWHzl(abstractC58185ywXKWHzl3);
    }

    public static final InterfaceC60096zvd fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.String str, final java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, C13934dbu c13934dbu, java.lang.String str8, HandshakeResponse handshakeResponse) throws OKWException {
        Intrinsics.checkNotNullParameter(handshakeResponse, "");
        C10965byR c10965byR = OLrzqt;
        java.lang.String strSign$default = sign$default(c10965byR, num.intValue(), 0, str2, null, c10965byR.fetchVPNInfo(str), str3, str4, str5, str6, str7, 8, null);
        if (strSign$default.length() == 0) {
            throw new OKWException("Sign step1 failed", null);
        }
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(c13934dbu.OLrzqt(3, str2, strSign$default, str8, 1, num.intValue()), new Function1() { // from class: o.byU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10965byR.AhwBna((ResponseData) obj));
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKWException("Execute step1 failed", null)));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C11607cUn.OLrzqt(abstractC58185ywXOLrzqt);
        final Function1 function1 = new Function1() { // from class: o.byX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.EZpvd(num, (MpcSendTxResponse) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bzb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C11607cUn.AEQbTJ(abstractC58185ywXAEQbTJ);
    }

    public static final java.lang.String values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String EZpvd(java.lang.Integer num, MpcSendTxResponse mpcSendTxResponse) throws OKWException {
        Intrinsics.checkNotNullParameter(mpcSendTxResponse, "");
        java.lang.String strSign$default = sign$default(OLrzqt, num.intValue(), 1, null, mpcSendTxResponse.getData(), null, null, null, null, null, null, 1012, null);
        if (strSign$default.length() != 0) {
            return strSign$default;
        }
        throw new OKWException("Execute step1 failed", null);
    }

    public static final InterfaceC60096zvd AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C13934dbu c13934dbu, java.lang.String str, java.lang.String str2, final java.lang.Integer num, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(c13934dbu.OLrzqt(3, str, str3, str2, 2, num.intValue()), new Function1() { // from class: o.bza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10965byR.AYXKKw((ResponseData) obj));
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKWException("Execute step2 failed", null)));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C11607cUn.OLrzqt(abstractC58185ywXOLrzqt);
        final Function1 function1 = new Function1() { // from class: o.byZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.AEQbTJ(num, (MpcSendTxResponse) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.byY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.fJNWhG(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C11607cUn.AEQbTJ(abstractC58185ywXAEQbTJ);
    }

    public static final java.lang.String fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String AEQbTJ(java.lang.Integer num, MpcSendTxResponse mpcSendTxResponse) throws OKWException {
        Intrinsics.checkNotNullParameter(mpcSendTxResponse, "");
        java.lang.String strSign$default = sign$default(OLrzqt, num.intValue(), 2, null, mpcSendTxResponse.getData(), null, null, null, null, null, null, 1012, null);
        if (strSign$default.length() != 0) {
            return strSign$default;
        }
        throw new OKWException("Execute step2 failed", null);
    }

    public static final InterfaceC60096zvd fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C13934dbu c13934dbu, java.lang.String str, java.lang.String str2, final java.lang.Integer num, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C43423rox.OLrzqt(c13934dbu.OLrzqt(3, str, str3, str2, 3, num.intValue()), new Function1() { // from class: o.bzd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10965byR.djBIcL((ResponseData) obj));
            }
        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKWException("Execute step3 failed", null)));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt2 = C11607cUn.OLrzqt(abstractC58185ywXOLrzqt);
        final Function1 function1 = new Function1() { // from class: o.bze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10965byR.gEmmrt(num, (MpcSendTxResponse) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bzf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10965byR.ejfBZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C11607cUn.AEQbTJ(abstractC58185ywXAEQbTJ);
    }

    public static final ResponseData ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData gEmmrt(java.lang.Integer num, MpcSendTxResponse mpcSendTxResponse) throws OKWException {
        Intrinsics.checkNotNullParameter(mpcSendTxResponse, "");
        java.lang.String strSign$default = sign$default(OLrzqt, num.intValue(), 3, null, mpcSendTxResponse.getData(), null, null, null, null, null, null, 1012, null);
        if (strSign$default.length() == 0) {
            throw new OKWException("Execute step3 failed", null);
        }
        return new ResponseData(0, null, null, null, strSign$default, null, 46, null);
    }

    public final java.lang.String fetchVPNInfo(java.lang.String str) {
        java.util.List listAhwBna;
        try {
            listAhwBna = (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl)), str);
        } catch (java.lang.Exception unused) {
            listAhwBna = yDY.AhwBna();
        }
        return C33129mqd.KWHzl((java.util.Collection) listAhwBna) ? str : C54907xZt.encodeToString$default(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56529yIt.KWHzl)), C56402yEa.EZpvd(str), false, 2, null);
    }

    public static /* synthetic */ java.lang.String sign$default(C10965byR c10965byR, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i3, java.lang.Object obj) {
        return c10965byR.EZpvd(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8);
    }

    public final java.lang.String EZpvd(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        if (i == 1) {
            return xYU.copydefault.KWHzl(new ECDSA(i2, str, str2, str3, str4, str5, str7, str8));
        }
        return xYU.copydefault.OLrzqt(new ED25519(i2, str, str2, str3, str6, null, str7, str8));
    }

    public static final boolean OLrzqt(ResponseData responseData) {
        HandshakeResponse handshakeResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null && (handshakeResponse = (HandshakeResponse) responseData.getData()) != null && handshakeResponse.getPass();
    }

    public static final boolean AhwBna(ResponseData responseData) {
        MpcSendTxResponse mpcSendTxResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (mpcSendTxResponse = (MpcSendTxResponse) responseData.getData()) != null && mpcSendTxResponse.getPass()) {
            MpcSendTxResponse mpcSendTxResponse2 = (MpcSendTxResponse) responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (mpcSendTxResponse2 != null ? mpcSendTxResponse2.getData() : null))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean AYXKKw(ResponseData responseData) {
        MpcSendTxResponse mpcSendTxResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (mpcSendTxResponse = (MpcSendTxResponse) responseData.getData()) != null && mpcSendTxResponse.getPass()) {
            MpcSendTxResponse mpcSendTxResponse2 = (MpcSendTxResponse) responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (mpcSendTxResponse2 != null ? mpcSendTxResponse2.getData() : null))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean djBIcL(ResponseData responseData) {
        MpcSendTxResponse mpcSendTxResponse;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (mpcSendTxResponse = (MpcSendTxResponse) responseData.getData()) != null && mpcSendTxResponse.getPass()) {
            MpcSendTxResponse mpcSendTxResponse2 = (MpcSendTxResponse) responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (mpcSendTxResponse2 != null ? mpcSendTxResponse2.getData() : null))) {
                return true;
            }
        }
        return false;
    }
}
