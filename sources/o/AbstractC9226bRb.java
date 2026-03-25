package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.Paymaster;
import com.okinc.business.defi.biz.net.bean.PaymasterToken;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.wallet.core.aa.AAPaymasterAndToken;
import com.okinc.wallet.core.sign.evm.ExecuteParams;
import com.okinc.wallet.core.sign.evm.ExecuteParamsTriple;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9226bRb {
    public final InterfaceC9041bOB AEQbTJ;
    public final AbstractC8564bFB<?, ?> EZpvd;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull ExecuteParamsTriple executeParamsTriple, @NotNull UserOperation userOperation);

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(@NotNull java.util.List<AAPaymasterAndToken> list, @NotNull java.util.List<java.lang.String> list2, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd();

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> EZpvd(@NotNull UserOperation userOperation);

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> EZpvd(@NotNull UserOperation userOperation, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8564bFB<?, ?> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9041bOB copydefault() {
        return this.AEQbTJ;
    }

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull UserOperation userOperation);

    public abstract AbstractC58185ywX<kotlin.Pair<java.util.List<java.lang.String>, java.lang.String>> copydefault(@NotNull java.util.List<ExecuteParamsTriple> list);

    public abstract UserOperation valueOf();

    public AbstractC9226bRb(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC9041bOB interfaceC9041bOB) {
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC9041bOB, "");
        this.EZpvd = abstractC8564bFB;
        this.AEQbTJ = interfaceC9041bOB;
        this.copydefault = abstractC8564bFB.dUDNAs().AEQbTJ(WalletType.HardwareWallet) ? 1 : 0;
    }

    /* JADX DEBUG: Type inference failed for r1v9. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> gEmmrt() {
        final java.lang.String strZuBGHE;
        java.util.List<ExecuteParams> listDvKsVJ;
        final java.lang.String strZLjUOn;
        java.util.ArrayList arrayList;
        AbstractC8564bFB<?, ?> abstractC8564bFB = this.EZpvd;
        java.lang.String str = null;
        if (abstractC8564bFB instanceof C9191bQt) {
            strZuBGHE = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default((AbstractC8704bHj) abstractC8564bFB, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
            listDvKsVJ = ((C9191bQt) this.EZpvd).EZpvd(strZuBGHE);
            if (((C9191bQt) this.EZpvd).fHqPtx().AuCTel()) {
                strZLjUOn = ((C9191bQt) this.EZpvd).zLjUOn();
            } else {
                strZLjUOn = ((C9191bQt) this.EZpvd).fHqPtx().OLrzqt();
            }
        } else if (abstractC8564bFB instanceof C9100bPH) {
            strZuBGHE = ((C9100bPH) abstractC8564bFB).zuBGHE();
            if (strZuBGHE.length() == 0) {
                strZuBGHE = "0";
            }
            listDvKsVJ = ((C9100bPH) this.EZpvd).dvKsVJ();
            strZLjUOn = ((C9100bPH) this.EZpvd).zLjUOn();
        } else {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, C10857bwP.AEQbTJ("OKWAaBaseSignTransaction", "loadGasLimit")));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (PaymasterToken paymasterToken : this.AEQbTJ.AuCTel()) {
            java.util.ArrayList<Paymaster> payMaster = paymasterToken.getPayMaster();
            if (payMaster != null) {
                for (Paymaster paymaster : payMaster) {
                    java.lang.String realPaymasterAddress = paymaster != null ? paymaster.getRealPaymasterAddress() : str;
                    java.lang.String contractAddress = paymasterToken.getContractAddress();
                    if (realPaymasterAddress == null || contractAddress == null) {
                        arrayList = null;
                    } else {
                        java.util.List<java.lang.String> list = this.AEQbTJ.fJNWhG().get(C56390yDp.OLrzqt(realPaymasterAddress, contractAddress));
                        if (C33129mqd.KWHzl((java.util.Collection) list)) {
                            Intrinsics.copydefault(list);
                            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            java.util.Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                java.lang.String str2 = contractAddress;
                                arrayList.add(new ExecuteParams(java.lang.Boolean.FALSE, str2, "0", (java.lang.String) it.next(), (java.util.List) null, 16, (DefaultConstructorMarker) null));
                                contractAddress = str2;
                            }
                        }
                    }
                    arrayList3.add(new ExecuteParamsTriple(arrayList, KWHzl(), listDvKsVJ));
                    if (paymaster == null) {
                        arrayList2.add(new AAPaymasterAndToken(EIP1271Verifier.hexPrefix, 0, "0", EIP1271Verifier.hexPrefix, 2, (DefaultConstructorMarker) null));
                    } else {
                        java.lang.String address = paymaster.getAddress();
                        java.lang.Integer type = paymaster.getType();
                        int iIntValue = type != null ? type.intValue() : 1;
                        java.lang.String contractAddress2 = paymasterToken.getContractAddress();
                        if (contractAddress2 == null) {
                            contractAddress2 = EIP1271Verifier.hexPrefix;
                        }
                        arrayList2.add(new AAPaymasterAndToken(address, iIntValue, "0", contractAddress2));
                    }
                    str = null;
                }
            }
            str = null;
        }
        AbstractC58185ywX<kotlin.Pair<java.util.List<java.lang.String>, java.lang.String>> abstractC58185ywXCopydefault = copydefault(arrayList3);
        final Function1 function1 = new Function1() { // from class: o.bRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC9226bRb.EZpvd(this.OLrzqt, arrayList2, strZLjUOn, strZuBGHE, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC9226bRb.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(AbstractC9226bRb abstractC9226bRb, java.util.List list, java.lang.String str, java.lang.String str2, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List<java.lang.String> list2 = (java.util.List) pair.getFirst();
        return list2 == null ? AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond())) : abstractC9226bRb.AEQbTJ(list, list2, str, str2);
    }

    public final java.util.List<ExecuteParams> KWHzl() {
        ExecuteParams[] executeParams;
        if (Intrinsics.EZpvd(this.AEQbTJ.AYXKKw().getNeedUpdate(), java.lang.Boolean.TRUE) && (executeParams = this.AEQbTJ.AYXKKw().getExecuteParams()) != null) {
            if (!(executeParams.length == 0)) {
                ExecuteParams[] executeParams2 = this.AEQbTJ.AYXKKw().getExecuteParams();
                Intrinsics.copydefault(executeParams2);
                java.util.ArrayList arrayList = new java.util.ArrayList(executeParams2.length);
                for (ExecuteParams executeParams3 : executeParams2) {
                    arrayList.add(new ExecuteParams(executeParams3.getAllowFailed(), executeParams3.getTo(), executeParams3.getValue(), executeParams3.getData(), executeParams3.getNestedCalls()));
                }
                return arrayList;
            }
        }
        return null;
    }
}
