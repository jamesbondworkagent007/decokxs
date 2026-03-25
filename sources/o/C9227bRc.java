package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.biz.net.bean.AAGasLimit;
import com.okinc.business.defi.biz.net.bean.AAGasLimitPaymaster;
import com.okinc.business.defi.biz.net.bean.AAGasLimitReq;
import com.okinc.business.defi.biz.net.bean.PayMasterSignatureReq;
import com.okinc.business.defi.biz.net.bean.Paymaster;
import com.okinc.business.defi.biz.net.bean.PaymasterToken;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.aa.AAPaymasterAndToken;
import com.okinc.wallet.core.aa.AAPaymasterAndTokenParams;
import com.okinc.wallet.core.aa.AAPaymasterDataAndSignature;
import com.okinc.wallet.core.sign.evm.AAGenerateSignatureHash;
import com.okinc.wallet.core.sign.evm.AAGetUserOpHash;
import com.okinc.wallet.core.sign.evm.ExecuteParamsTriple;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureStrategy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bRc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9227bRc extends AbstractC9226bRb {
    public java.lang.String KWHzl;

    /* JADX INFO: renamed from: o.bRc$ActionBar */
    public static final class ActionBar extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9227bRc(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC9041bOB interfaceC9041bOB) {
        super(abstractC8564bFB, interfaceC9041bOB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC9041bOB, "");
        this.KWHzl = EIP1271Verifier.hexPrefix;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd() {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXEZpvd = OLrzqt().ixgjPv().EZpvd(OLrzqt().dHguZz().fetchVPNInfo(), OLrzqt().fERRXa().getEoaAddress());
        final Function1 function1 = new Function1() { // from class: o.bRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9227bRc.AEQbTJ(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9227bRc.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull java.util.List<AAPaymasterAndToken> list, @NotNull java.util.List<java.lang.String> list2, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AAPaymasterDataAndSignature aAPaymasterDataAndSignature : C54861xYa.AEQbTJ.OLrzqt(new AAPaymasterAndTokenParams(0, AEQbTJ(), list, 1, (DefaultConstructorMarker) null))) {
            arrayList.add(new AAGasLimitPaymaster((java.lang.String) null, aAPaymasterDataAndSignature.getPaymasterAndData(), (java.lang.String) null, (java.lang.String) null, aAPaymasterDataAndSignature.getSignature(), 13, (DefaultConstructorMarker) null));
        }
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((AAGasLimitPaymaster) obj).setInputData(list2.get(i));
            i++;
        }
        C13934dbu c13934dbuIxgjPv = OLrzqt().ixgjPv();
        java.lang.String address = OLrzqt().fERRXa().getAddress();
        java.lang.String strFetchVPNInfo = copydefault().fetchVPNInfo();
        long jFetchVPNInfo = OLrzqt().dHguZz().fetchVPNInfo();
        AbstractC58185ywX<ResponseData<java.util.List<AAGasLimit>>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(new AAGasLimitReq(address, strFetchVPNInfo, str, java.lang.Long.valueOf(jFetchVPNInfo), str2, this.KWHzl, null, null, C33491mxU.copydefault("0"), C33491mxU.copydefault("0"), arrayList, 192, null));
        final Function1 function1 = new Function1() { // from class: o.bRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C9227bRc.EZpvd(this.EZpvd, (ResponseData) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C9227bRc.values(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull final ExecuteParamsTriple executeParamsTriple, @NotNull final UserOperation userOperation) {
        Intrinsics.checkNotNullParameter(executeParamsTriple, "");
        Intrinsics.checkNotNullParameter(userOperation, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9227bRc.KWHzl(this.AEQbTJ, executeParamsTriple, userOperation, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void KWHzl(C9227bRc c9227bRc, ExecuteParamsTriple executeParamsTriple, final UserOperation userOperation, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        xYZ.KWHzl.EZpvd(c9227bRc.copydefault().AkhnZx(), executeParamsTriple, new android.webkit.ValueCallback() { // from class: o.bRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9227bRc.AEQbTJ(userOperation, interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final void AEQbTJ(UserOperation userOperation, InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            userOperation.setCallData(str);
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        } else {
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, str));
        }
        interfaceC58184ywW.onComplete();
    }

    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.util.List<java.lang.String>, java.lang.String>> copydefault(@NotNull final java.util.List<ExecuteParamsTriple> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<kotlin.Pair<java.util.List<java.lang.String>, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9227bRc.EZpvd(this.copydefault, list, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(C9227bRc c9227bRc, java.util.List list, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        xYZ.KWHzl.EZpvd(c9227bRc.copydefault().AkhnZx(), (java.util.List<ExecuteParamsTriple>) list, new android.webkit.ValueCallback() { // from class: o.bRd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9227bRc.EZpvd(interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final void EZpvd(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.copydefault((java.lang.Object) str);
        if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            try {
                Result.Application application = Result.Companion;
                interfaceC58184ywW.onNext(C56390yDp.OLrzqt((java.util.List) new Gson().fromJson(str, new ActionBar().getType()), null));
                interfaceC58184ywW.onComplete();
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object objM7386unboximpl = Result.m7376boximpl(objM7377constructorimpl).m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                Intrinsics.copydefault(thM7380exceptionOrNullimpl);
                interfaceC58184ywW.onNext(C56390yDp.OLrzqt(null, C10857bwP.KWHzl("OKWAaBaseSignTransaction", thM7380exceptionOrNullimpl)));
                return;
            }
            return;
        }
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("OKWAaBaseSignTransaction", "updateGasLimitParam " + str)));
        interfaceC58184ywW.onComplete();
    }

    @Override // o.AbstractC9226bRb
    public UserOperation valueOf() {
        C9170bQY c9170bQYHDKMBd = copydefault().fJNWhG().hDKMBd();
        java.lang.String address = OLrzqt().fERRXa().getAddress();
        java.lang.String strCopydefault = C33491mxU.copydefault(copydefault().fetchVPNInfo());
        java.lang.String str = this.KWHzl;
        java.lang.String strAEQbTJ = c9170bQYHDKMBd.AEQbTJ();
        java.lang.String strCopydefault2 = strAEQbTJ != null ? C33491mxU.copydefault(strAEQbTJ) : null;
        java.lang.String strIsConnected = c9170bQYHDKMBd.isConnected();
        java.lang.String strCopydefault3 = strIsConnected != null ? C33491mxU.copydefault(strIsConnected) : null;
        java.lang.String strAhwBna = c9170bQYHDKMBd.AhwBna();
        java.lang.String strCopydefault4 = strAhwBna != null ? C33491mxU.copydefault(strAhwBna) : null;
        java.lang.String strCopydefault5 = C33491mxU.copydefault(C9225bRa.getGasPrice$default(copydefault().fJNWhG(), 0, 1, null));
        java.lang.String strIwGUEr = copydefault().fJNWhG().iwGUEr();
        return new UserOperation(address, strCopydefault, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strCopydefault2, strCopydefault3, strCopydefault4, strCopydefault5, strIwGUEr != null ? C33491mxU.copydefault(strIwGUEr) : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, 522296, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Type inference failed for r7v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull final UserOperation userOperation) {
        Intrinsics.checkNotNullParameter(userOperation, "");
        C9170bQY c9170bQYHDKMBd = copydefault().fJNWhG().hDKMBd();
        Paymaster paymasterValueOf = c9170bQYHDKMBd.valueOf();
        if (paymasterValueOf == null) {
            userOperation.setPaymasterAndData(EIP1271Verifier.hexPrefix);
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        userOperation.setPaymasterType(paymasterValueOf.getType());
        C13934dbu c13934dbuIxgjPv = OLrzqt().ixgjPv();
        long jFetchVPNInfo = OLrzqt().dHguZz().fetchVPNInfo();
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = c13934dbuIxgjPv.AEQbTJ(new PayMasterSignatureReq(java.lang.Long.valueOf(jFetchVPNInfo), paymasterValueOf.getAddress(), c9170bQYHDKMBd.djBIcL(), userOperation));
        final Function1 function1 = new Function1() { // from class: o.bRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9227bRc.copydefault(userOperation, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9227bRc.AYXKKw(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> EZpvd(@NotNull final UserOperation userOperation, final int i) {
        Intrinsics.checkNotNullParameter(userOperation, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9227bRc.AEQbTJ(userOperation, this, i, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        final Function1 function1 = new Function1() { // from class: o.bRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9227bRc.EZpvd(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9227bRc.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final void AEQbTJ(UserOperation userOperation, C9227bRc c9227bRc, int i, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.lang.String sender = userOperation.getSender();
        java.lang.String nonce = userOperation.getNonce();
        java.lang.String strOLrzqt = nonce != null ? C33491mxU.OLrzqt(nonce) : null;
        java.lang.String initCode = userOperation.getInitCode();
        java.lang.String callData = userOperation.getCallData();
        java.lang.String callGasLimit = userOperation.getCallGasLimit();
        java.lang.String strOLrzqt2 = callGasLimit != null ? C33491mxU.OLrzqt(callGasLimit) : null;
        java.lang.String verificationGasLimit = userOperation.getVerificationGasLimit();
        java.lang.String strOLrzqt3 = verificationGasLimit != null ? C33491mxU.OLrzqt(verificationGasLimit) : null;
        java.lang.String preVerificationGas = userOperation.getPreVerificationGas();
        java.lang.String strOLrzqt4 = preVerificationGas != null ? C33491mxU.OLrzqt(preVerificationGas) : null;
        java.lang.String maxFeePerGas = userOperation.getMaxFeePerGas();
        java.lang.String strOLrzqt5 = maxFeePerGas != null ? C33491mxU.OLrzqt(maxFeePerGas) : null;
        java.lang.String maxPriorityFeePerGas = userOperation.getMaxPriorityFeePerGas();
        xYZ.KWHzl.KWHzl(c9227bRc.copydefault().AkhnZx(), new AAGenerateSignatureHash(sender, strOLrzqt, initCode, callData, strOLrzqt2, strOLrzqt3, strOLrzqt4, strOLrzqt5, maxPriorityFeePerGas != null ? C33491mxU.OLrzqt(maxPriorityFeePerGas) : null, userOperation.getPaymasterAndData(), c9227bRc.copydefault().AYXKKw().getEntryPoint(), i, c9227bRc.AEQbTJ()), new android.webkit.ValueCallback() { // from class: o.bRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9227bRc.OLrzqt(interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final void OLrzqt(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(str, null));
            return;
        }
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("OKWAATXV06Helper", "aaGenerateSignatureHash " + str)));
    }

    public static final InterfaceC60096zvd DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C9227bRc c9227bRc, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.getFirst();
        if (str != null) {
            C13934dbu c13934dbuIxgjPv = c9227bRc.OLrzqt().ixgjPv();
            long jFetchVPNInfo = c9227bRc.OLrzqt().dHguZz().fetchVPNInfo();
            java.lang.String safeSingleton = c9227bRc.copydefault().AYXKKw().getSafeSingleton();
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = c13934dbuIxgjPv.AEQbTJ(jFetchVPNInfo, safeSingleton != null ? safeSingleton : "", str);
            final Function1 function1 = new Function1() { // from class: o.bRg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9227bRc.EZpvd((ResponseData) obj);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9227bRc.gEmmrt(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC60096zvdAEQbTJ);
            return interfaceC60096zvdAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(null, pair.getSecond()));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> EZpvd(@NotNull final UserOperation userOperation) {
        Intrinsics.checkNotNullParameter(userOperation, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bRq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9227bRc.EZpvd(this.EZpvd, userOperation, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(C9227bRc c9227bRc, UserOperation userOperation, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        long jFetchVPNInfo = c9227bRc.OLrzqt().dHguZz().fetchVPNInfo();
        java.lang.String address = c9227bRc.OLrzqt().fERRXa().getAddress();
        java.lang.String nonce = userOperation.getNonce();
        java.lang.String strOLrzqt = nonce != null ? C33491mxU.OLrzqt(nonce) : null;
        java.lang.String initCode = userOperation.getInitCode();
        java.lang.String callData = userOperation.getCallData();
        java.lang.String callGasLimit = userOperation.getCallGasLimit();
        java.lang.String strOLrzqt2 = callGasLimit != null ? C33491mxU.OLrzqt(callGasLimit) : null;
        java.lang.String verificationGasLimit = userOperation.getVerificationGasLimit();
        java.lang.String strOLrzqt3 = verificationGasLimit != null ? C33491mxU.OLrzqt(verificationGasLimit) : null;
        java.lang.String preVerificationGas = userOperation.getPreVerificationGas();
        java.lang.String strOLrzqt4 = preVerificationGas != null ? C33491mxU.OLrzqt(preVerificationGas) : null;
        java.lang.String maxFeePerGas = userOperation.getMaxFeePerGas();
        java.lang.String strOLrzqt5 = maxFeePerGas != null ? C33491mxU.OLrzqt(maxFeePerGas) : null;
        java.lang.String maxPriorityFeePerGas = userOperation.getMaxPriorityFeePerGas();
        xYZ.KWHzl.EZpvd(c9227bRc.copydefault().AkhnZx(), new AAGetUserOpHash(java.lang.Long.valueOf(jFetchVPNInfo), address, strOLrzqt, initCode, (java.lang.String) null, (java.lang.String) null, callData, strOLrzqt2, strOLrzqt3, (java.lang.String) null, (java.lang.String) null, strOLrzqt4, strOLrzqt5, maxPriorityFeePerGas != null ? C33491mxU.OLrzqt(maxPriorityFeePerGas) : null, userOperation.getPaymasterAndData(), (java.lang.String) null, (java.lang.String) null, c9227bRc.copydefault().AYXKKw().getEntryPoint(), 99888, (DefaultConstructorMarker) null), new android.webkit.ValueCallback() { // from class: o.bRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9227bRc.AYXKKw(interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final void AYXKKw(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(str, null));
            return;
        }
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("OKWAATXV06Helper", "aaGetUserOpHash " + str)));
    }

    public static final kotlin.Pair AEQbTJ(C9227bRc c9227bRc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c9227bRc.KWHzl = (java.lang.String) data;
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair EZpvd(C9227bRc c9227bRc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.util.List list = (java.util.List) data;
            java.util.ArrayList arrayList = new java.util.ArrayList(c9227bRc.copydefault().AuCTel().size());
            int i = 0;
            for (PaymasterToken paymasterToken : c9227bRc.copydefault().AuCTel()) {
                java.util.ArrayList<Paymaster> payMaster = paymasterToken.getPayMaster();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(payMaster != null ? payMaster.size() : 0);
                java.util.ArrayList<Paymaster> payMaster2 = paymasterToken.getPayMaster();
                if (payMaster2 != null) {
                    for (Paymaster paymaster : payMaster2) {
                        AAGasLimit aAGasLimit = (AAGasLimit) list.get(i);
                        arrayList2.add(new C9170bQY(paymasterToken.getContractAddress(), paymaster, aAGasLimit.getInitGas(), aAGasLimit.getPreVerificationGas(), aAGasLimit.getVerificationGasLimit(), aAGasLimit.getPmVerificationGasLimit(), null, null, aAGasLimit.getCallGasLimit(), aAGasLimit.getMaxCallGasLimit(), aAGasLimit.getL1GasLimit(), aAGasLimit.getL1GasPrice(), 192, null));
                        i++;
                    }
                }
                C10854bwM coinMeta = paymasterToken.getCoinMeta();
                boolean zEZpvd = Intrinsics.EZpvd(c9227bRc.copydefault().AYXKKw().isDeploye(), java.lang.Boolean.TRUE);
                boolean z = paymasterToken.getCoinMeta().AuCTel() && C33129mqd.copydefault(c9227bRc.copydefault().AYXKKw().getVersion(), "2");
                java.lang.String depositAmount = c9227bRc.copydefault().AYXKKw().getDepositAmount();
                if (depositAmount == null) {
                    depositAmount = "0";
                }
                arrayList.add(new C9168bQW(coinMeta, arrayList2, !zEZpvd, z, depositAmount));
            }
            c9227bRc.copydefault().KWHzl(arrayList);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair copydefault(UserOperation userOperation, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            userOperation.setPaymasterAndData((java.lang.String) responseData.getData());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair EZpvd(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return C56390yDp.OLrzqt(responseData.getData(), null);
        }
        return C56390yDp.OLrzqt(null, responseData.getMsg());
    }
}
