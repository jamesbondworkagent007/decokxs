package o;

import com.okinc.business.defi.api.bean.DexTransferData;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.OkTransactionPreparationResult;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.net.bean.SupportedMevNodeBean;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.business.defi.wallet.transfer.manager.FreeGasManager;
import com.okinc.wallet.api.WalletDexService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cZy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11753cZy extends AbstractC43215rlA implements WalletDexService {
    public final C13934dbu EZpvd = new C13934dbu();

    @Override // com.okinc.wallet.api.WalletDexService
    public AbstractC58185ywX<WalletDexService.FeeInfo> copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull DexTransferData dexTransferData, java.lang.Integer num, java.lang.String str4) {
        long jAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(dexTransferData, "");
        long jValueOf = C33129mqd.valueOf(str3);
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMCopydefault = c10954byG.valueOf().copydefault(jValueOf);
        if (c10854bwMCopydefault != null) {
            if (c10854bwMCopydefault.AxsJAYaxsJAY()) {
                if (dexTransferData.isNativeToken()) {
                    jAhwBna = c10854bwMCopydefault.AhwBna();
                } else {
                    C10854bwM c10854bwMEZpvd = c10954byG.valueOf().EZpvd(dexTransferData.getTokenContractAddress(), jValueOf);
                    if (c10854bwMEZpvd != null) {
                        jAhwBna = c10854bwMEZpvd.AhwBna();
                    } else {
                        AbstractC58185ywX<WalletDexService.FeeInfo> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.IllegalArgumentException(C10857bwP.AEQbTJ("WalletDexServiceImpl", "tokenContractAddress not support")));
                        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                        return abstractC58185ywXAEQbTJ;
                    }
                }
                AbstractC58185ywX abstractC58185ywXEZpvd = new C12394cmC().EZpvd(str, str2, C33129mqd.gEmmrt(java.lang.Long.valueOf(jAhwBna)), (TransactionInfo) null, dexTransferData.getTransferToAddress(), (java.lang.String) null, TransactionType.TypeTransfer, (128 & 128) != 0 ? null : null, dexTransferData.getAmount(), (128 & 512) != 0 ? 1 : 3, new TxToastCheckBizAndPayloadInfo(java.lang.Integer.valueOf(num != null ? num.intValue() : 1), str4));
                final Function1 function1 = new Function1() { // from class: o.cZD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C11753cZy.EZpvd((OkTransactionPreparationResult) obj);
                    }
                };
                AbstractC58185ywX<WalletDexService.FeeInfo> abstractC58185ywXOLrzqt = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cZC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C11753cZy.copydefault(function1, obj);
                    }
                }).OLrzqt(new InterfaceC58229yxO() { // from class: o.cZz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C11753cZy.copydefault((java.lang.Throwable) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
                return abstractC58185ywXOLrzqt;
            }
        }
        AbstractC58185ywX<WalletDexService.FeeInfo> abstractC58185ywXAEQbTJ2 = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.IllegalArgumentException(C10857bwP.AEQbTJ("WalletDexServiceImpl", "chainId not support")));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final InterfaceC60096zvd copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(OkTransactionPreparationResult okTransactionPreparationResult) {
        Intrinsics.checkNotNullParameter(okTransactionPreparationResult, "");
        AbstractC12609cqH mTransaction = okTransactionPreparationResult.getMTransaction();
        C12623cqV calculator = okTransactionPreparationResult.getCalculator();
        C10854bwM c10854bwMAhwBna = mTransaction != null ? mTransaction.AhwBna() : null;
        if (mTransaction == null || calculator == null || c10854bwMAhwBna == null) {
            return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.IllegalArgumentException(okTransactionPreparationResult.getMsg()));
        }
        java.lang.String recommendFee = mTransaction.AYXKKw().getRecommendFee();
        java.lang.String str = recommendFee == null ? "" : recommendFee;
        java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(str, c10854bwMAhwBna.valueOf());
        java.lang.String strFeeCurrencyAmount$default = C12623cqV.feeCurrencyAmount$default(calculator, str, false, false, false, 12, null);
        mTransaction.QKVWgx();
        mTransaction.zsXlph();
        return AbstractC58185ywX.KWHzl(new WalletDexService.FeeInfo(strAEQbTJ, c10854bwMAhwBna.fJNWhG(), strFeeCurrencyAmount$default));
    }

    public static final AbstractC58185ywX copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKWException(C10857bwP.KWHzl("WalletDexServiceImpl", th), null));
    }

    /* JADX DEBUG: Type inference failed for r14v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.wallet.api.WalletDexService$AAFreeGasInfo> */
    @Override // com.okinc.wallet.api.WalletDexService
    public AbstractC58185ywX<WalletDexService.AAFreeGasInfo> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        long jValueOf = C33129mqd.valueOf(str);
        AbstractC58185ywX<FreeGasManager.UserFreeGasInfo> abstractC58185ywXOLrzqt = new FreeGasManager().AEQbTJ("freeGasAA", jValueOf, str2, 3).OLrzqt(AbstractC58185ywX.KWHzl(new FreeGasManager.UserFreeGasInfo(jValueOf, null, 0, 0, -1, null, 46, null)));
        final Function1 function1 = new Function1() { // from class: o.cZB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11753cZy.AEQbTJ((FreeGasManager.UserFreeGasInfo) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cZA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11753cZy.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final WalletDexService.AAFreeGasInfo AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletDexService.AAFreeGasInfo) function1.invoke(obj);
    }

    public static final WalletDexService.AAFreeGasInfo AEQbTJ(FreeGasManager.UserFreeGasInfo userFreeGasInfo) {
        Intrinsics.checkNotNullParameter(userFreeGasInfo, "");
        return new WalletDexService.AAFreeGasInfo(userFreeGasInfo.getLimitGasValuation(), userFreeGasInfo.getTotalTimes(), userFreeGasInfo.getAvailableTimes(), userFreeGasInfo.getErrorCode());
    }

    public static final java.util.ArrayList OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    @Override // com.okinc.wallet.api.WalletDexService
    public AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> OLrzqt() {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(this.EZpvd.AkhnZx(), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cZw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11753cZy.EZpvd((java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11753cZy.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.ArrayList EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            SupportedMevNodeBean supportedMevNodeBean = (SupportedMevNodeBean) it.next();
            arrayList.add(new WalletDexService.SupportedMevNodeBean(supportedMevNodeBean.getName(), supportedMevNodeBean.getGas(), supportedMevNodeBean.getSupplier(), supportedMevNodeBean.getChainIds(), supportedMevNodeBean.getPriorityRate(), supportedMevNodeBean.getVendorIcon()));
        }
        return arrayList;
    }

    @Override // com.okinc.wallet.api.WalletDexService
    public androidx.fragment.app.Fragment EZpvd(@NotNull java.lang.String str, @NotNull java.util.ArrayList<java.lang.Long> arrayList, long j, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return eVR.Companion.EZpvd(str, arrayList, j, str2);
    }
}
