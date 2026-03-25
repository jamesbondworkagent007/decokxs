package com.okinc.business.dexlogic.main.limmitorder;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.limmitorder.LimitQuoteHandle;
import com.okinc.business.dexlogic.main.limmitorder.bean.ChangeType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitErrorViewHandle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C22380heK;
import o.C22495hgT;
import o.C23313hvq;
import o.C56390yDp;
import o.InterfaceC22433hfK;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitQuoteHandle {
    public static final int $stable = 8;
    private InterfaceC58217yxC disposable;
    private final C22495hgT limitOrderContentViewModel;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChangeType.values().length];
            try {
                iArr[ChangeType.FromChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChangeType.ToChange.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChangeType.RateChange.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChangeType.FromToChange.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC getDisposable() {
        return this.disposable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisposable(InterfaceC58217yxC interfaceC58217yxC) {
        this.disposable = interfaceC58217yxC;
    }

    public LimitQuoteHandle(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.limitOrderContentViewModel = c22495hgT;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void checkCount() {
        String str;
        String strDTwDnp;
        String strWlaJM;
        String strWlaJM2;
        String str2;
        String str3;
        InterfaceC58217yxC interfaceC58217yxC;
        final C22495hgT c22495hgT = this.limitOrderContentViewModel;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = c22495hgT.OcIXYQ();
        String chainId = dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getChainId() : null;
        str = "";
        String str4 = chainId == null ? "" : chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ2 = c22495hgT.OcIXYQ();
        String originContractAddress = dexMultiTokenInfoBeanOcIXYQ2 != null ? dexMultiTokenInfoBeanOcIXYQ2.getOriginContractAddress() : null;
        String str5 = originContractAddress == null ? "" : originContractAddress;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = c22495hgT.QKudOq();
        String originContractAddress2 = dexMultiTokenInfoBeanQKudOq != null ? dexMultiTokenInfoBeanQKudOq.getOriginContractAddress() : null;
        String str6 = originContractAddress2 == null ? "" : originContractAddress2;
        String strGkJEwt = c22495hgT.gkJEwt();
        pUU.KWHzl("LimitQuoteHandle", "checkCount currentChangeType=" + c22495hgT.AubY());
        int i = StateListAnimator.EZpvd[c22495hgT.AubY().ordinal()];
        if (i == 1) {
            strDTwDnp = c22495hgT.DTwDnp();
            if (strDTwDnp == null) {
                strDTwDnp = "";
            }
            strWlaJM = c22495hgT.wlaJM();
        } else if (i == 2) {
            String strAccept = c22495hgT.accept();
            if (strAccept == null) {
                strAccept = "";
            }
            if (Intrinsics.EZpvd(c22495hgT.giSNqX().getValue(), Boolean.TRUE)) {
                strWlaJM = c22495hgT.wlaJM();
                str = strAccept;
                strDTwDnp = "";
            } else {
                String strDTwDnp2 = c22495hgT.DTwDnp();
                if (strDTwDnp2 == null) {
                    strDTwDnp2 = "";
                }
                str2 = strAccept;
                strWlaJM2 = strDTwDnp2.length() == 0 ? c22495hgT.wlaJM() : "";
                str3 = strDTwDnp2;
                interfaceC58217yxC = this.disposable;
                if (interfaceC58217yxC != null && !interfaceC58217yxC.isDisposed()) {
                    interfaceC58217yxC.dispose();
                }
                pUU.KWHzl("LimitQuoteHandle", "checkCount fromAmount=" + str3 + "  toAmount=" + str2 + "  exchangeRate =" + strWlaJM2);
                if (isUnSatisfyCalculateCondition(str3, str2, strWlaJM2)) {
                    c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.QUOTE_LIMIT, true, SwapState.FETCHING_COUNT, true, false));
                    AbstractC58185ywX<LimitCalResult> abstractC58185ywXKWHzl = C22380heK.OLrzqt.copydefault(c22495hgT.AxsJAYaxsJAY()).AhwBna().KWHzl(str3, str2, strWlaJM2, str4, str5, str6, strGkJEwt);
                    final Function1 function1 = new Function1() { // from class: o.hgn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return LimitQuoteHandle.checkCount$lambda$6$lambda$1(c22495hgT, (LimitCalResult) obj);
                        }
                    };
                    InterfaceC58227yxM<? super LimitCalResult> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hgl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            function1.invoke(obj);
                        }
                    };
                    final Function1 function12 = new Function1() { // from class: o.hgo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return LimitQuoteHandle.checkCount$lambda$6$lambda$3(c22495hgT, (java.lang.Throwable) obj);
                        }
                    };
                    this.disposable = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hgp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            function12.invoke(obj);
                        }
                    });
                    return;
                }
                return;
            }
        } else if (i == 3) {
            strDTwDnp = c22495hgT.DTwDnp();
            if (strDTwDnp == null) {
                strDTwDnp = "";
            }
            strWlaJM = c22495hgT.wlaJM();
        } else {
            if (i != 4) {
                return;
            }
            strDTwDnp = c22495hgT.DTwDnp();
            if (strDTwDnp == null) {
                strDTwDnp = "";
            }
            strWlaJM = c22495hgT.wlaJM();
        }
        str3 = strDTwDnp;
        str2 = str;
        strWlaJM2 = strWlaJM;
        interfaceC58217yxC = this.disposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        pUU.KWHzl("LimitQuoteHandle", "checkCount fromAmount=" + str3 + "  toAmount=" + str2 + "  exchangeRate =" + strWlaJM2);
        if (isUnSatisfyCalculateCondition(str3, str2, strWlaJM2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCount$lambda$6$lambda$1(C22495hgT c22495hgT, LimitCalResult limitCalResult) {
        InterfaceC22433hfK interfaceC22433hfKUeEOUB;
        pUU.KWHzl("LimitQuoteHandle", "getCalResult fromAmount=" + limitCalResult.getFromAmount() + "  toAmount=" + limitCalResult.getToAmount() + "  exchangeRate =" + limitCalResult.getExchangeRate());
        c22495hgT.uzCIH().setValue(C56390yDp.OLrzqt(Boolean.TRUE, limitCalResult));
        if (c22495hgT.RdAHlO().isCurrentWalletStateError() || c22495hgT.OxVOHk()) {
            c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.QUOTE_LIMIT, true, SwapState.QUOTE_COIN_ERROR, true, false));
        } else {
            boolean zGEmmrt = c22495hgT.finit().gEmmrt();
            if (zGEmmrt && (interfaceC22433hfKUeEOUB = c22495hgT.UeEOUB()) != null) {
                interfaceC22433hfKUeEOUB.EZpvd(LimitErrorViewHandle.ErrorType.MinAmount);
            }
            TradeLimitStatePool tradeLimitStatePoolZuWLRA = c22495hgT.zuWLRA();
            CheckStep checkStep = CheckStep.QUOTE_LIMIT;
            tradeLimitStatePoolZuWLRA.refreshStatePool(new TradeStep(checkStep, true, SwapState.SWAP_AMOUNT_LOW, true, false));
            if (!zGEmmrt) {
                c22495hgT.zuWLRA().refreshStatePool(new TradeStep(checkStep, true, SwapState.QUOTE_AMOUNT_LOW_SUCCESS, false, true));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkCount$lambda$6$lambda$3(C22495hgT c22495hgT, Throwable th) {
        c22495hgT.zuWLRA().refreshStatePool(new TradeStep(CheckStep.QUOTE_LIMIT, true, SwapState.COUNT_ERROR, true, false));
        return Unit.INSTANCE;
    }

    public final boolean isUnSatisfyCalculateCondition(String str, String str2, String str3) {
        return isInValidAmount(str3, str2) || isInValidAmount(str, str3) || isInValidAmount(str, str2);
    }

    private final boolean isInValidAmount(String... strArr) {
        boolean z = true;
        for (String str : strArr) {
            if (C23313hvq.OLrzqt(str, 0)) {
                z = false;
            }
        }
        return z;
    }
}
