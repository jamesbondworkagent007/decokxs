package o;

import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.OkTransactionPreparationResult;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.core.tx.wallet.OkTransactionWallet;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.InterfaceC46550tYm;
import o.InterfaceC9738bbJ;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cmC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12394cmC {

    /* JADX INFO: renamed from: o.cmC$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.TypeInscribe.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.TypeTransfer.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.TypeRegister.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    public final AbstractC58185ywX<OkTransactionPreparationResult> EZpvd(@NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final TransactionInfo transactionInfo, final java.lang.String str4, final java.lang.String str5, @NotNull final TransactionType transactionType, final java.lang.String str6, final java.lang.String str7, final int i, final TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.cmL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12394cmC.EZpvd(this.KWHzl, str, str2, str3, transactionInfo, transactionType, str4, str6, i, txToastCheckBizAndPayloadInfo, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEnsureInitialized$default.KWHzl(new InterfaceC58229yxO() { // from class: o.cmI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12394cmC.djBIcL(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cmM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12394cmC.OLrzqt(this.copydefault, str4, str7, objectRef, transactionType, str5, (AbstractC12609cqH) obj);
            }
        };
        AbstractC58185ywX<OkTransactionPreparationResult> abstractC58185ywXEZpvd = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12394cmC.AhwBna(function12, obj);
            }
        }).EZpvd(new InterfaceC58222yxH() { // from class: o.cmJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C12394cmC.AEQbTJ(objectRef, i, str7);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final AbstractC12609cqH AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12609cqH) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(final C12394cmC c12394cmC, java.lang.String str, java.lang.String str2, java.lang.String str3, TransactionInfo transactionInfo, final TransactionType transactionType, final java.lang.String str4, final java.lang.String str5, final int i, final TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        AbstractC58185ywX<OkTransactionWallet> abstractC58185ywXEZpvd = c12394cmC.EZpvd(str, str2, str3, transactionInfo).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12394cmC.KWHzl(this.EZpvd, transactionType, str4, str5, i, txToastCheckBizAndPayloadInfo, (OkTransactionWallet) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12394cmC.AYXKKw(function1, obj);
            }
        });
    }

    public static final AbstractC12609cqH KWHzl(C12394cmC c12394cmC, TransactionType transactionType, java.lang.String str, java.lang.String str2, int i, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, OkTransactionWallet okTransactionWallet) {
        Intrinsics.checkNotNullParameter(okTransactionWallet, "");
        return c12394cmC.KWHzl(transactionType, okTransactionWallet, str, str2, i, txToastCheckBizAndPayloadInfo);
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.cqH */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd OLrzqt(C12394cmC c12394cmC, java.lang.String str, java.lang.String str2, Ref.ObjectRef objectRef, TransactionType transactionType, java.lang.String str3, final AbstractC12609cqH abstractC12609cqH) {
        Intrinsics.checkNotNullParameter(abstractC12609cqH, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Intrinsics.copydefault((java.lang.Object) str);
            abstractC12609cqH.EZpvd(str, false);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            Intrinsics.copydefault((java.lang.Object) str2);
            AbstractC12609cqH.setTransferAmount$default(abstractC12609cqH, str2, false, false, 6, null);
            objectRef.element = abstractC12609cqH;
        }
        if (transactionType == TransactionType.TypeRegister && (abstractC12609cqH instanceof InterfaceC12613cqL)) {
            ((InterfaceC12613cqL) abstractC12609cqH).KWHzl();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAuCTelauCTel = abstractC12609cqH.AuCTelauCTel();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXKWHzl = c12394cmC.KWHzl(str3);
        final Function2 function2 = new Function2() { // from class: o.cmQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12394cmC.EZpvd(abstractC12609cqH, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        return AbstractC58185ywX.EZpvd(abstractC58185ywXAuCTelauCTel, abstractC58185ywXKWHzl, new InterfaceC58223yxI() { // from class: o.cmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12394cmC.AEQbTJ(function2, obj, obj2);
            }
        });
    }

    public static final OkTransactionPreparationResult AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (OkTransactionPreparationResult) function2.invoke(obj, obj2);
    }

    public static final OkTransactionPreparationResult EZpvd(AbstractC12609cqH abstractC12609cqH, kotlin.Pair pair, kotlin.Pair pair2) {
        C12623cqV calculator;
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        OkTransactionPreparationResult okTransactionPreparationResult = new OkTransactionPreparationResult();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            okTransactionPreparationResult.setMTransaction(abstractC12609cqH);
            okTransactionPreparationResult.setCalculator(abstractC12609cqH.ejfBZ());
            if (pair2.getSecond() != null && (calculator = okTransactionPreparationResult.getCalculator()) != null) {
                java.lang.Object second = pair2.getSecond();
                Intrinsics.copydefault(second);
                calculator.copydefault((WalletCurrencyBean) second);
            }
        } else if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            okTransactionPreparationResult.setCanRetry(true);
            okTransactionPreparationResult.setMsg((java.lang.String) pair.getSecond());
        } else if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            okTransactionPreparationResult.setCanRetry(true);
            okTransactionPreparationResult.setMsg(C10857bwP.AEQbTJ("OKWTransactionFactoryNew", "Currency bean is null"));
        } else {
            okTransactionPreparationResult.setCanRetry(true);
            okTransactionPreparationResult.setMsg(C10857bwP.AEQbTJ("OKWTransactionFactoryNew", Constants.IPC_BUNDLE_KEY_SEND_ERROR));
        }
        return okTransactionPreparationResult;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(Ref.ObjectRef objectRef, int i, java.lang.String str) {
        AbstractC12609cqH abstractC12609cqH = (AbstractC12609cqH) objectRef.element;
        if (abstractC12609cqH != null && i == 3 && C33129mqd.OLrzqt((java.lang.CharSequence) str) && (abstractC12609cqH instanceof OkUTXOTransaction)) {
            abstractC12609cqH.QKVWgx();
            ((OkUTXOTransaction) abstractC12609cqH).zsXlph();
        }
    }

    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.business.defi.biz.core.tx.wallet.OkTransactionWallet> */
    public final AbstractC58260yxt<OkTransactionWallet> EZpvd(@NotNull java.lang.String str, final java.lang.String str2, final java.lang.String str3, TransactionInfo transactionInfo) {
        java.lang.String tokenId;
        Intrinsics.checkNotNullParameter(str, "");
        if (transactionInfo != null && (tokenId = transactionInfo.getTokenId()) != null) {
            str3 = tokenId;
        }
        if (str3 == null || str3.length() == 0) {
            AbstractC58260yxt<OkTransactionWallet> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(new java.lang.Throwable("No such asset"));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
            return abstractC58260yxtAEQbTJ;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true);
        final Function1 function1 = new Function1() { // from class: o.cmF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12394cmC.OLrzqt(str3, str2, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12394cmC.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final OkTransactionWallet valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OkTransactionWallet) function1.invoke(obj);
    }

    public static final OkTransactionWallet OLrzqt(java.lang.String str, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) throws java.lang.Exception {
        ChainAddress chainAddressCopydefault;
        ChainAddress chainAddressOLrzqt;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        long jValueOf = C33129mqd.valueOf(str);
        if (C10598brV.AEQbTJ.OLrzqt(jValueOf) == null) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(jValueOf));
            if (c10854bwMKWHzl == null) {
                throw new java.lang.Exception("No such coin");
            }
            if (str2 == null || str2.length() == 0) {
                chainAddressOLrzqt = abstractC12782ctV.OLrzqt(c10854bwMKWHzl.AEQbTJ(), (java.lang.Integer) null);
            } else {
                chainAddressOLrzqt = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctV, str2, null, 2, null);
            }
            ChainAddress chainAddress = chainAddressOLrzqt;
            if (chainAddress == null) {
                throw new java.lang.Exception("no such address");
            }
            InterfaceC9742bbN canSupportedCoinAssets$default = InterfaceC9738bbJ.StateListAnimator.getCanSupportedCoinAssets$default(abstractC12782ctV, c10854bwMKWHzl.AhwBna(), java.lang.Integer.valueOf(chainAddress.getAddressType()), false, 4, null);
            if (canSupportedCoinAssets$default == null) {
                throw new java.lang.Exception("no such asset");
            }
            C10854bwM c10854bwMKWHzl2 = c10854bwMKWHzl.KWHzl();
            if (c10854bwMKWHzl2 != null) {
                InterfaceC9742bbN canSupportedCoinAssets$default2 = InterfaceC9738bbJ.StateListAnimator.getCanSupportedCoinAssets$default(abstractC12782ctV, c10854bwMKWHzl2.AhwBna(), java.lang.Integer.valueOf(chainAddress.getAddressType()), false, 4, null);
                if (canSupportedCoinAssets$default2 == null) {
                    throw new java.lang.Exception("no such chain asset");
                }
                return new OkTransactionWallet(abstractC12782ctV, c10854bwMKWHzl, chainAddress, canSupportedCoinAssets$default.copydefault(), canSupportedCoinAssets$default.copydefault(), canSupportedCoinAssets$default.AhwBna(), canSupportedCoinAssets$default2.copydefault(), canSupportedCoinAssets$default2.copydefault(), canSupportedCoinAssets$default2.AhwBna());
            }
            throw new java.lang.Exception("no such chain asset");
        }
        C10594brR c10594brRFJNWhG = abstractC12782ctV.fJNWhG(jValueOf);
        if (c10594brRFJNWhG == null) {
            throw new java.lang.Throwable("No such asset");
        }
        CustomChainCoinMeta customChainCoinMetaEZpvd = c10594brRFJNWhG.fetchVPNInfo().EZpvd();
        C10594brR c10594brRFJNWhG2 = abstractC12782ctV.fJNWhG(customChainCoinMetaEZpvd != null ? customChainCoinMetaEZpvd.valueOf() : -1L);
        if (c10594brRFJNWhG2 == null) {
            throw new java.lang.Exception("no such chain asset");
        }
        if (str2 == null || str2.length() == 0) {
            chainAddressCopydefault = abstractC12782ctV.copydefault(java.lang.Long.valueOf(c10594brRFJNWhG2.AEQbTJ()));
        } else {
            chainAddressCopydefault = abstractC12782ctV.copydefault(str2);
        }
        ChainAddress chainAddress2 = chainAddressCopydefault;
        if (chainAddress2 == null) {
            throw new java.lang.Exception("no such address");
        }
        return new OkTransactionWallet(c10594brRFJNWhG.DbNXlk(), c10594brRFJNWhG.fetchVPNInfo().AEQbTJ(), chainAddress2, c10594brRFJNWhG.values(), c10594brRFJNWhG.values(), c10594brRFJNWhG.AhwBna(), c10594brRFJNWhG2.values(), c10594brRFJNWhG2.values(), c10594brRFJNWhG2.AhwBna());
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> KWHzl(final java.lang.String str) {
        if (str == null || str.length() == 0) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(C13933dbt.okServerExceptionFilter$default(InterfaceC46550tYm.ActionBar.getCurrencyList$default((InterfaceC46550tYm) C43251rlk.copydefault(InterfaceC46550tYm.class), false, 1, null), null, 1, null), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12394cmC.EZpvd(str, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, WalletCurrencyBean>> abstractC58185ywXKWHzl2 = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.cmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12394cmC.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static /* synthetic */ AbstractC12609cqH buildTransaction$default(C12394cmC c12394cmC, TransactionType transactionType, OkTransactionWallet okTransactionWallet, java.lang.String str, java.lang.String str2, int i, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return c12394cmC.KWHzl(transactionType, okTransactionWallet, str, str2, i, txToastCheckBizAndPayloadInfo);
    }

    public final AbstractC12609cqH KWHzl(@NotNull TransactionType transactionType, @NotNull OkTransactionWallet okTransactionWallet, java.lang.String str, java.lang.String str2, int i, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo) throws java.lang.Throwable {
        AbstractC12609cqH okUTXOTransaction;
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(okTransactionWallet, "");
        C10854bwM chainMeta = okTransactionWallet.getChainMeta();
        if (chainMeta == null) {
            throw new java.lang.Throwable("No support chain");
        }
        if (chainMeta.call()) {
            int i2 = ActionBar.KWHzl[transactionType.ordinal()];
            if (i2 == 1) {
                okUTXOTransaction = new C12657crC();
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                okUTXOTransaction = new OkUTXOTransaction();
            } else if (okTransactionWallet.getCoinMeta().dvKsVJ() || okTransactionWallet.getCoinMeta().fjfviF() || okTransactionWallet.getCoinMeta().htlTjW() || okTransactionWallet.getCoinMeta().igXuih()) {
                okUTXOTransaction = new C12627cqZ();
            } else {
                okUTXOTransaction = new OkUTXOTransaction();
            }
        } else {
            okUTXOTransaction = new OkUTXOTransaction();
        }
        okUTXOTransaction.copydefault(transactionType, okTransactionWallet, str, str2, i, txToastCheckBizAndPayloadInfo);
        return okUTXOTransaction;
    }

    public static final InterfaceC60096zvd EZpvd(java.lang.String str, java.util.ArrayList arrayList) {
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
