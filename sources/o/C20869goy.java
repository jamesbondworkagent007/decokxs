package o;

import androidx.lifecycle.MutableLiveData;
import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.OkTransactionPreparationResult;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46550tYm;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20869goy extends AbstractC20792gna {
    public java.lang.String isConnected = "0";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20792gna
    public java.lang.String djBIcL() {
        return this.isConnected;
    }

    @Override // o.AbstractC20792gna
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, TransactionInfo transactionInfo, @NotNull java.lang.String str6, @NotNull TransactionType transactionType, java.lang.String str7, java.lang.String str8, int i, @NotNull java.lang.String str9, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.String str10, java.lang.String str11, java.lang.String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str9, "");
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = AEQbTJ();
        if (interfaceC58217yxCAEQbTJ != null) {
            interfaceC58217yxCAEQbTJ.dispose();
        }
        copydefault(str);
        EZpvd(str2);
        AEQbTJ(transactionInfo);
        AEQbTJ(true ^ (transactionInfo != null && transactionInfo.hasCurrency()));
        AbstractC58185ywX<OkTransactionPreparationResult> abstractC58185ywXAEQbTJ = AEQbTJ(str2, transactionInfo != null ? transactionInfo.getCurrency() : null);
        final Function1 function1 = new Function1() { // from class: o.goB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20869goy.AEQbTJ(this.copydefault, (OkTransactionPreparationResult) obj);
            }
        };
        InterfaceC58227yxM<? super OkTransactionPreparationResult> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.goA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20869goy.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.goG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20869goy.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        OLrzqt(abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.goD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20869goy.AhwBna(function12, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C20869goy c20869goy, OkTransactionPreparationResult okTransactionPreparationResult) {
        c20869goy.valueOf().setValue(okTransactionPreparationResult);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C20869goy c20869goy, java.lang.Throwable th) {
        MutableLiveData<OkTransactionPreparationResult> mutableLiveDataValueOf = c20869goy.valueOf();
        OkTransactionPreparationResult okTransactionPreparationResult = new OkTransactionPreparationResult();
        okTransactionPreparationResult.setMTransaction(null);
        okTransactionPreparationResult.setMsg(th.getMessage());
        okTransactionPreparationResult.setCanRetry(true);
        mutableLiveDataValueOf.setValue(okTransactionPreparationResult);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20792gna
    public void AEQbTJ(java.lang.String str) {
        if (str == null) {
            str = "0";
        }
        this.isConnected = str;
        KWHzl(3, false, -1);
    }

    public static final C10854bwM AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10854bwM) function1.invoke(obj);
    }

    public final AbstractC58185ywX<OkTransactionPreparationResult> AEQbTJ(final java.lang.String str, final java.lang.String str2) {
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.goC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20869goy.AEQbTJ(str, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEnsureInitialized$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.goE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20869goy.AkhnZx(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.goF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20869goy.copydefault(this.KWHzl, str2, (C10854bwM) obj);
            }
        };
        AbstractC58185ywX<OkTransactionPreparationResult> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.goL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20869goy.valueOf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final C10854bwM AEQbTJ(java.lang.String str, java.lang.Boolean bool) {
        C10854bwM c10854bwMAEQbTJ;
        Intrinsics.checkNotNullParameter(bool, "");
        long jValueOf = C33129mqd.valueOf(str);
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(jValueOf);
        return (customChainCoinMetaOLrzqt == null || (c10854bwMAEQbTJ = customChainCoinMetaOLrzqt.AEQbTJ()) == null) ? C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(jValueOf)) : c10854bwMAEQbTJ;
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C20869goy c20869goy, java.lang.String str, C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, ResponseData<C12623cqV>>> abstractC58185ywXAEQbTJ = c20869goy.AEQbTJ(c10854bwM);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXOLrzqt = c20869goy.OLrzqt(str);
        final Function2 function2 = new Function2() { // from class: o.goz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20869goy.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        return AbstractC58185ywX.EZpvd(abstractC58185ywXAEQbTJ, abstractC58185ywXOLrzqt, new InterfaceC58223yxI() { // from class: o.gox
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C20869goy.AEQbTJ(function2, obj, obj2);
            }
        });
    }

    public static final OkTransactionPreparationResult AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (OkTransactionPreparationResult) function2.invoke(obj, obj2);
    }

    public static final OkTransactionPreparationResult EZpvd(kotlin.Pair pair, kotlin.Pair pair2) {
        C12623cqV calculator;
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        OkTransactionPreparationResult okTransactionPreparationResult = new OkTransactionPreparationResult();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            okTransactionPreparationResult.setCalculator((C12623cqV) ((ResponseData) pair.getSecond()).getData());
            if (pair2.getSecond() != null && (calculator = okTransactionPreparationResult.getCalculator()) != null) {
                java.lang.Object second = pair2.getSecond();
                Intrinsics.copydefault(second);
                calculator.copydefault((WalletCurrencyBean) second);
            }
        } else if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            okTransactionPreparationResult.setCanRetry(true);
            okTransactionPreparationResult.setMsg(((ResponseData) pair.getSecond()).getMsg());
        } else if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            okTransactionPreparationResult.setCanRetry(true);
            okTransactionPreparationResult.setMsg("Currency bean is null");
        } else {
            okTransactionPreparationResult.setCanRetry(true);
            okTransactionPreparationResult.setMsg(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        }
        return okTransactionPreparationResult;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, ResponseData<C12623cqV>>> AEQbTJ(C10854bwM c10854bwM) {
        final C12623cqV c12623cqV = new C12623cqV();
        AbstractC58185ywX abstractC58185ywXLoadWithCoinMeta$default = C12623cqV.loadWithCoinMeta$default(c12623cqV, c10854bwM, c10854bwM.KWHzl(), null, 4, null);
        final Function1 function1 = new Function1() { // from class: o.goI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20869goy.KWHzl(c12623cqV, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, ResponseData<C12623cqV>>> abstractC58185ywXAEQbTJ = abstractC58185ywXLoadWithCoinMeta$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.goK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20869goy.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C12623cqV c12623cqV, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(pair.getFirst(), new ResponseData(0, (java.lang.String) pair.getSecond(), null, null, c12623cqV, null, 45, null));
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> OLrzqt(final java.lang.String str) {
        if (str == null || str.length() == 0) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(InterfaceC46550tYm.ActionBar.getCurrencyList$default((InterfaceC46550tYm) C43251rlk.copydefault(InterfaceC46550tYm.class), false, 1, null), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.goJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20869goy.KWHzl(str, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXKWHzl2 = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.goH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20869goy.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(java.lang.String str, java.util.ArrayList arrayList) {
        java.lang.Object next;
        java.lang.String symbol;
        java.lang.String isoCode;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.String isoCode2 = ((ValuationCurrencyBean) next).getIsoCode();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = isoCode2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) lowerCase2)) {
                break;
            }
        }
        ValuationCurrencyBean valuationCurrencyBean = (ValuationCurrencyBean) next;
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.valueOf(valuationCurrencyBean != null), new WalletCurrencyBean((valuationCurrencyBean == null || (isoCode = valuationCurrencyBean.getIsoCode()) == null) ? str : isoCode, (valuationCurrencyBean == null || (symbol = valuationCurrencyBean.getSymbol()) == null) ? "" : symbol, valuationCurrencyBean != null ? valuationCurrencyBean.getUsdToThisRate() : 1.0d, valuationCurrencyBean != null ? valuationCurrencyBean.getPrecision() : 2, 12)));
    }
}
