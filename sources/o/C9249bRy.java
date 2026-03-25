package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.biz.net.bean.AAGasLimit;
import com.okinc.business.defi.biz.net.bean.AAGasLimitPaymaster;
import com.okinc.business.defi.biz.net.bean.AAGasLimitReq;
import com.okinc.business.defi.biz.net.bean.PayMasterSignatureReq;
import com.okinc.business.defi.biz.net.bean.Paymaster;
import com.okinc.business.defi.biz.net.bean.PaymasterToken;
import com.okinc.business.defi.biz.net.bean.UOPSignedHashReq;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.aa.AAGenOriPaymasterTokenV7;
import com.okinc.wallet.core.aa.AAParseInitCode;
import com.okinc.wallet.core.aa.AAParsePaymasterDataV7;
import com.okinc.wallet.core.aa.AAPaymasterAndToken;
import com.okinc.wallet.core.aa.AAPaymasterAndTokenParamsV7;
import com.okinc.wallet.core.aa.AAPaymasterDataAndSignatureV7;
import com.okinc.wallet.core.sign.evm.AAAddressAndExecuteParamsTripleList;
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

/* JADX INFO: renamed from: o.bRy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9249bRy extends AbstractC9226bRb {
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;

    /* JADX INFO: renamed from: o.bRy$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9249bRy(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC9041bOB interfaceC9041bOB) {
        super(abstractC8564bFB, interfaceC9041bOB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC9041bOB, "");
        this.KWHzl = EIP1271Verifier.hexPrefix;
        this.OLrzqt = EIP1271Verifier.hexPrefix;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd() {
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXEZpvd = OLrzqt().ixgjPv().EZpvd(OLrzqt().dHguZz().fetchVPNInfo(), OLrzqt().fERRXa().getEoaAddress());
        final Function1 function1 = new Function1() { // from class: o.bRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9249bRy.KWHzl(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9249bRy.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull java.util.List<AAPaymasterAndToken> list, @NotNull java.util.List<java.lang.String> list2, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : C54861xYa.AEQbTJ.KWHzl(new AAPaymasterAndTokenParamsV7(0, AEQbTJ(), list, 1, (DefaultConstructorMarker) null))) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            AAPaymasterDataAndSignatureV7 aAPaymasterDataAndSignatureV7 = (AAPaymasterDataAndSignatureV7) obj;
            arrayList.add(new AAGasLimitPaymaster((java.lang.String) null, (java.lang.String) null, list.get(i2).getPaymaster(), aAPaymasterDataAndSignatureV7.getPaymasterData(), aAPaymasterDataAndSignatureV7.getSignature(), 3, (DefaultConstructorMarker) null));
            i2++;
        }
        for (java.lang.Object obj2 : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((AAGasLimitPaymaster) obj2).setInputData(list2.get(i));
            i++;
        }
        AbstractC58185ywX<ResponseData<java.util.List<AAGasLimit>>> abstractC58185ywXCopydefault = OLrzqt().ixgjPv().copydefault(new AAGasLimitReq(OLrzqt().fERRXa().getAddress(), copydefault().fetchVPNInfo(), str, java.lang.Long.valueOf(OLrzqt().dHguZz().fetchVPNInfo()), str2, null, this.KWHzl, this.OLrzqt, C33491mxU.copydefault("0"), C33491mxU.copydefault("0"), arrayList, 32, null));
        final Function1 function1 = new Function1() { // from class: o.bRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C9249bRy.EZpvd(this.copydefault, (ResponseData) obj3);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj3) {
                return C9249bRy.AkhnZx(function1, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull final ExecuteParamsTriple executeParamsTriple, @NotNull final UserOperation userOperation) {
        Intrinsics.checkNotNullParameter(executeParamsTriple, "");
        Intrinsics.checkNotNullParameter(userOperation, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bRK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9249bRy.EZpvd(this.OLrzqt, executeParamsTriple, userOperation, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(C9249bRy c9249bRy, ExecuteParamsTriple executeParamsTriple, final UserOperation userOperation, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        xYZ.KWHzl.EZpvd(c9249bRy.copydefault().AkhnZx(), c9249bRy.OLrzqt().fERRXa().getAddress(), executeParamsTriple, new android.webkit.ValueCallback() { // from class: o.bRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9249bRy.AEQbTJ(userOperation, interfaceC58184ywW, (java.lang.String) obj);
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
        AbstractC58185ywX<kotlin.Pair<java.util.List<java.lang.String>, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9249bRy.EZpvd(this.EZpvd, list, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void EZpvd(C9249bRy c9249bRy, java.util.List list, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        xYZ.KWHzl.copydefault(c9249bRy.copydefault().AkhnZx(), new AAAddressAndExecuteParamsTripleList(c9249bRy.OLrzqt().fERRXa().getAddress(), list), new android.webkit.ValueCallback() { // from class: o.bRM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9249bRy.AEQbTJ(interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final void AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.copydefault((java.lang.Object) str);
        if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            try {
                Result.Application application = Result.Companion;
                interfaceC58184ywW.onNext(C56390yDp.OLrzqt((java.util.List) new Gson().fromJson(str, new TaskDescription().getType()), null));
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
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String address;
        C9170bQY c9170bQYHDKMBd = copydefault().fJNWhG().hDKMBd();
        java.lang.String address2 = OLrzqt().fERRXa().getAddress();
        java.lang.String strCopydefault3 = C33491mxU.copydefault(copydefault().fetchVPNInfo());
        java.lang.String str = this.KWHzl;
        java.lang.String str2 = this.OLrzqt;
        java.lang.String strAEQbTJ = c9170bQYHDKMBd.AEQbTJ();
        java.lang.String strCopydefault4 = strAEQbTJ != null ? C33491mxU.copydefault(strAEQbTJ) : null;
        java.lang.String strIsConnected = c9170bQYHDKMBd.isConnected();
        java.lang.String strCopydefault5 = strIsConnected != null ? C33491mxU.copydefault(strIsConnected) : null;
        java.lang.String strAhwBna = c9170bQYHDKMBd.AhwBna();
        java.lang.String strCopydefault6 = strAhwBna != null ? C33491mxU.copydefault(strAhwBna) : null;
        java.lang.String strCopydefault7 = C33491mxU.copydefault(C9225bRa.getGasPrice$default(copydefault().fJNWhG(), 0, 1, null));
        java.lang.String strIwGUEr = copydefault().fJNWhG().iwGUEr();
        java.lang.String strCopydefault8 = strIwGUEr != null ? C33491mxU.copydefault(strIwGUEr) : null;
        Paymaster paymasterValueOf = c9170bQYHDKMBd.valueOf();
        java.lang.String str3 = (paymasterValueOf == null || (address = paymasterValueOf.getAddress()) == null) ? EIP1271Verifier.hexPrefix : address;
        if (c9170bQYHDKMBd.valueOf() == null) {
            strCopydefault = EIP1271Verifier.hexPrefix;
        } else {
            java.lang.String strGEmmrt = c9170bQYHDKMBd.gEmmrt();
            strCopydefault = strGEmmrt != null ? C33491mxU.copydefault(strGEmmrt) : null;
        }
        if (c9170bQYHDKMBd.valueOf() == null) {
            strCopydefault2 = EIP1271Verifier.hexPrefix;
        } else {
            java.lang.String strAYXKKw = c9170bQYHDKMBd.AYXKKw();
            strCopydefault2 = strAYXKKw != null ? C33491mxU.copydefault(strAYXKKw) : null;
        }
        return new UserOperation(address2, strCopydefault3, (java.lang.String) null, str, str2, (java.lang.String) null, strCopydefault4, strCopydefault5, strCopydefault6, strCopydefault7, strCopydefault8, (java.lang.String) null, str3, strCopydefault, strCopydefault2, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, 493604, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Type inference failed for r8v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull final UserOperation userOperation) {
        Intrinsics.checkNotNullParameter(userOperation, "");
        C9170bQY c9170bQYHDKMBd = copydefault().fJNWhG().hDKMBd();
        Paymaster paymasterValueOf = c9170bQYHDKMBd.valueOf();
        if (paymasterValueOf == null) {
            userOperation.setPaymasterData(EIP1271Verifier.hexPrefix);
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        userOperation.setPaymasterType(paymasterValueOf.getType());
        C54861xYa c54861xYa = C54861xYa.AEQbTJ;
        java.lang.String strDjBIcL = c9170bQYHDKMBd.djBIcL();
        java.lang.String str = strDjBIcL != null ? strDjBIcL : "";
        java.lang.Integer type = paymasterValueOf.getType();
        AAGenOriPaymasterTokenV7 aAGenOriPaymasterTokenV7AEQbTJ = c54861xYa.AEQbTJ(str, type != null ? type.intValue() : 1, "0");
        userOperation.setPaymasterData(aAGenOriPaymasterTokenV7AEQbTJ != null ? aAGenOriPaymasterTokenV7AEQbTJ.getPaymasterData() : null);
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = OLrzqt().ixgjPv().AEQbTJ(new PayMasterSignatureReq(java.lang.Long.valueOf(OLrzqt().dHguZz().fetchVPNInfo()), paymasterValueOf.getAddress(), c9170bQYHDKMBd.djBIcL(), userOperation));
        final Function1 function1 = new Function1() { // from class: o.bRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9249bRy.AEQbTJ(userOperation, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9249bRy.djBIcL(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> EZpvd(@NotNull final UserOperation userOperation, final int i) {
        Intrinsics.checkNotNullParameter(userOperation, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9249bRy.copydefault(this.OLrzqt, i, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        final Function1 function1 = new Function1() { // from class: o.bRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9249bRy.copydefault(userOperation, this, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C9249bRy.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final void copydefault(C9249bRy c9249bRy, int i, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        xYZ.KWHzl.OLrzqt(c9249bRy.copydefault().AkhnZx(), i, c9249bRy.AEQbTJ(), new android.webkit.ValueCallback() { // from class: o.bRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9249bRy.EZpvd(interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final void EZpvd(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(str, null));
            return;
        }
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("OKWAATXV7Helper", "aaGenerateUnSignSignatureV7 " + str)));
    }

    public static final InterfaceC60096zvd DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(UserOperation userOperation, C9249bRy c9249bRy, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (pair.getFirst() != null) {
            userOperation.setSignature((java.lang.String) pair.getFirst());
            C13934dbu c13934dbuIxgjPv = c9249bRy.OLrzqt().ixgjPv();
            long jFetchVPNInfo = c9249bRy.OLrzqt().dHguZz().fetchVPNInfo();
            AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = c13934dbuIxgjPv.copydefault(new UOPSignedHashReq(java.lang.Long.valueOf(jFetchVPNInfo), c9249bRy.OLrzqt().fERRXa().getAddress(), java.lang.Integer.valueOf(c9249bRy.AEQbTJ()), userOperation));
            final Function1 function1 = new Function1() { // from class: o.bRv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C9249bRy.copydefault((ResponseData) obj);
                }
            };
            return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bRz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C9249bRy.valueOf(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(pair);
    }

    public static final kotlin.Pair valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.AbstractC9226bRb
    public AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> EZpvd(@NotNull final UserOperation userOperation) {
        Intrinsics.checkNotNullParameter(userOperation, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bRD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C9249bRy.copydefault(this.AEQbTJ, userOperation, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void copydefault(C9249bRy c9249bRy, UserOperation userOperation, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        long jFetchVPNInfo = c9249bRy.OLrzqt().dHguZz().fetchVPNInfo();
        java.lang.String address = c9249bRy.OLrzqt().fERRXa().getAddress();
        java.lang.String nonce = userOperation.getNonce();
        java.lang.String strOLrzqt = nonce != null ? C33491mxU.OLrzqt(nonce) : null;
        java.lang.String factory = userOperation.getFactory();
        java.lang.String factoryData = userOperation.getFactoryData();
        java.lang.String callData = userOperation.getCallData();
        java.lang.String callGasLimit = userOperation.getCallGasLimit();
        java.lang.String strOLrzqt2 = callGasLimit != null ? C33491mxU.OLrzqt(callGasLimit) : null;
        java.lang.String verificationGasLimit = userOperation.getVerificationGasLimit();
        java.lang.String strOLrzqt3 = verificationGasLimit != null ? C33491mxU.OLrzqt(verificationGasLimit) : null;
        java.lang.String paymasterVerificationGasLimit = userOperation.getPaymasterVerificationGasLimit();
        java.lang.String strOLrzqt4 = paymasterVerificationGasLimit != null ? C33491mxU.OLrzqt(paymasterVerificationGasLimit) : null;
        java.lang.String paymasterPostOpGasLimit = userOperation.getPaymasterPostOpGasLimit();
        java.lang.String strOLrzqt5 = paymasterPostOpGasLimit != null ? C33491mxU.OLrzqt(paymasterPostOpGasLimit) : null;
        java.lang.String preVerificationGas = userOperation.getPreVerificationGas();
        java.lang.String strOLrzqt6 = preVerificationGas != null ? C33491mxU.OLrzqt(preVerificationGas) : null;
        java.lang.String maxFeePerGas = userOperation.getMaxFeePerGas();
        java.lang.String strOLrzqt7 = maxFeePerGas != null ? C33491mxU.OLrzqt(maxFeePerGas) : null;
        java.lang.String maxPriorityFeePerGas = userOperation.getMaxPriorityFeePerGas();
        xYZ.KWHzl.copydefault(c9249bRy.copydefault().AkhnZx(), new AAGetUserOpHash(java.lang.Long.valueOf(jFetchVPNInfo), address, strOLrzqt, (java.lang.String) null, factory, factoryData, callData, strOLrzqt2, strOLrzqt3, strOLrzqt4, strOLrzqt5, strOLrzqt6, strOLrzqt7, maxPriorityFeePerGas != null ? C33491mxU.OLrzqt(maxPriorityFeePerGas) : null, (java.lang.String) null, userOperation.getPaymaster(), userOperation.getPaymasterData(), c9249bRy.copydefault().AYXKKw().getEntryPoint(), 16392, (DefaultConstructorMarker) null), new android.webkit.ValueCallback() { // from class: o.bRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                C9249bRy.djBIcL(interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final void djBIcL(InterfaceC58184ywW interfaceC58184ywW, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        if (str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(str, null));
            return;
        }
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(null, C10857bwP.AEQbTJ("OKWAATXV07Helper", "aaGetUserOpHash " + str)));
    }

    public static final kotlin.Pair KWHzl(C9249bRy c9249bRy, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            AAParseInitCode aAParseInitCodeCopydefault = C54861xYa.AEQbTJ.copydefault((java.lang.String) data);
            if (aAParseInitCodeCopydefault != null) {
                c9249bRy.KWHzl = aAParseInitCodeCopydefault.getFactory();
                c9249bRy.OLrzqt = aAParseInitCodeCopydefault.getFactoryData();
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair EZpvd(C9249bRy c9249bRy, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.util.List list = (java.util.List) data;
            java.util.ArrayList arrayList = new java.util.ArrayList(c9249bRy.copydefault().AuCTel().size());
            int i = 0;
            for (PaymasterToken paymasterToken : c9249bRy.copydefault().AuCTel()) {
                java.util.ArrayList<Paymaster> payMaster = paymasterToken.getPayMaster();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(payMaster != null ? payMaster.size() : 0);
                java.util.ArrayList<Paymaster> payMaster2 = paymasterToken.getPayMaster();
                if (payMaster2 != null) {
                    for (Paymaster paymaster : payMaster2) {
                        AAGasLimit aAGasLimit = (AAGasLimit) list.get(i);
                        arrayList2.add(new C9170bQY(paymasterToken.getContractAddress(), paymaster, aAGasLimit.getInitGas(), aAGasLimit.getPreVerificationGas(), aAGasLimit.getVerificationGasLimit(), null, aAGasLimit.getPaymasterVerificationGasLimit(), aAGasLimit.getPaymasterPostOpGasLimit(), aAGasLimit.getCallGasLimit(), aAGasLimit.getMaxCallGasLimit(), aAGasLimit.getL1GasLimit(), aAGasLimit.getL1GasPrice(), 32, null));
                        i++;
                    }
                }
                C10854bwM coinMeta = paymasterToken.getCoinMeta();
                boolean zEZpvd = Intrinsics.EZpvd(c9249bRy.copydefault().AYXKKw().isDeploye(), java.lang.Boolean.TRUE);
                boolean z = paymasterToken.getCoinMeta().AuCTel() && C33129mqd.copydefault(c9249bRy.copydefault().AYXKKw().getVersion(), "2");
                java.lang.String depositAmount = c9249bRy.copydefault().AYXKKw().getDepositAmount();
                if (depositAmount == null) {
                    depositAmount = "0";
                }
                arrayList.add(new C9168bQW(coinMeta, arrayList2, !zEZpvd, z, depositAmount));
            }
            c9249bRy.copydefault().KWHzl(arrayList);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair AEQbTJ(UserOperation userOperation, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C54861xYa c54861xYa = C54861xYa.AEQbTJ;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            AAParsePaymasterDataV7 aAParsePaymasterDataV7AEQbTJ = c54861xYa.AEQbTJ((java.lang.String) data);
            userOperation.setPaymasterData(aAParsePaymasterDataV7AEQbTJ != null ? aAParsePaymasterDataV7AEQbTJ.getPaymasterData() : null);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return C56390yDp.OLrzqt(responseData.getData(), null);
        }
        return C56390yDp.OLrzqt(null, responseData.getMsg());
    }
}
