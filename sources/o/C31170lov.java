package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dexlogic.bean.MemeModeQuoteErrorBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31170lov {
    public final InterfaceC28107kPd AEQbTJ;
    public final TransactionType AYXKKw;
    public final AbstractC28352kYf AhwBna;
    public final C25265itU DbNXlk;
    public final Function2<java.lang.Boolean, SwapState, Unit> EZpvd;
    public final Function0<Unit> KWHzl;
    public final Function0<gOP> OLrzqt;
    public final C30567ldb copydefault;
    public final C31164lop djBIcL;
    public final C25324iua gEmmrt;
    public final TokenBase valueOf;

    /* JADX INFO: renamed from: o.lov$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.PRE_CHECK_FAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.ZERO_FORM_AMOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.okinc.business.trade.features.home.ui.meme.statepool.SwapState, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C31170lov(@NotNull AbstractC28352kYf abstractC28352kYf, @NotNull InterfaceC28107kPd interfaceC28107kPd, @NotNull TokenBase tokenBase, @NotNull TransactionType transactionType, C25265itU c25265itU, C30567ldb c30567ldb, C25324iua c25324iua, @NotNull C31164lop c31164lop, @NotNull Function2<? super java.lang.Boolean, ? super SwapState, Unit> function2, @NotNull Function0<Unit> function0, @NotNull Function0<gOP> function02) {
        Intrinsics.checkNotNullParameter(abstractC28352kYf, "");
        Intrinsics.checkNotNullParameter(interfaceC28107kPd, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(c31164lop, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.AhwBna = abstractC28352kYf;
        this.AEQbTJ = interfaceC28107kPd;
        this.valueOf = tokenBase;
        this.AYXKKw = transactionType;
        this.DbNXlk = c25265itU;
        this.copydefault = c30567ldb;
        this.gEmmrt = c25324iua;
        this.djBIcL = c31164lop;
        this.EZpvd = function2;
        this.KWHzl = function0;
        this.OLrzqt = function02;
    }

    public final void KWHzl(@NotNull SwapState swapState, boolean z) {
        Intrinsics.checkNotNullParameter(swapState, "");
        int i = ActionBar.KWHzl[swapState.ordinal()];
        if (i == 1) {
            OLrzqt();
        } else if (i == 2) {
            AEQbTJ(z);
        } else {
            OLrzqt(swapState);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(boolean z, SwapState swapState) {
        C25324iua c25324iua;
        if (swapState == SwapState.APPROVED_AND_NEED_CANCEL_APPROVE) {
            C25324iua c25324iua2 = this.gEmmrt;
            if (c25324iua2 != null) {
                c25324iua2.setVisibility(0);
            }
        } else {
            if (swapState == SwapState.NO_LIQUIDITY_AT_THE_MOMENT) {
                V6QuoteResponseData value = this.AhwBna.USBtdM().getValue();
                if (C33129mqd.KWHzl((java.util.Collection) (value != null ? value.getDefiPlatformInfoList() : null))) {
                }
            }
            if ((z || swapState == SwapState.NO_QUOTE_FETCHED) && (c25324iua = this.gEmmrt) != null) {
                c25324iua.setInvalidState();
            }
        }
        C25265itU c25265itU = this.DbNXlk;
        if (c25265itU != null) {
            c25265itU.setEnabled((z && this.AhwBna.AhwBna(this.valueOf.getChainId())) ? false : true);
        }
        if (swapState == null || !swapState.isDAppRedirectState()) {
            return;
        }
        this.KWHzl.invoke();
    }

    public final void AEQbTJ(boolean z) {
        C25265itU c25265itU = this.DbNXlk;
        if (c25265itU != null) {
            c25265itU.setVisibility(0);
        }
        C25265itU c25265itU2 = this.DbNXlk;
        if (c25265itU2 != null) {
            c25265itU2.setErrorNoticeViewVisible(z || this.AhwBna.OLrzqt(this.AEQbTJ.OLrzqt(), this.valueOf.getChainId()));
        }
        this.EZpvd.invoke(java.lang.Boolean.TRUE, null);
    }

    public final void OLrzqt() {
        C25265itU c25265itU = this.DbNXlk;
        if (c25265itU != null) {
            c25265itU.setVisibility(0);
        }
        C25265itU c25265itU2 = this.DbNXlk;
        if (c25265itU2 != null) {
            c25265itU2.setErrorNoticeViewVisible(this.AEQbTJ.OLrzqt() || !this.AhwBna.AhwBna(this.valueOf.getChainId()));
        }
        this.EZpvd.invoke(java.lang.Boolean.TRUE, null);
    }

    public final void OLrzqt(SwapState swapState) {
        OKServerException oKServerException;
        C25265itU c25265itU = this.DbNXlk;
        if (c25265itU != null) {
            c25265itU.setVisibility(0);
        }
        this.EZpvd.invoke(java.lang.Boolean.FALSE, swapState);
        C25265itU c25265itU2 = this.DbNXlk;
        if (c25265itU2 == null || c25265itU2.OLrzqt() == null) {
            return;
        }
        V6QuoteResponseData value = this.AhwBna.USBtdM().getValue();
        MemeModeQuoteErrorBean value2 = this.AhwBna.OBJEWx().getValue();
        boolean z = (Intrinsics.EZpvd(value2, MemeModeQuoteErrorBean.Companion.copydefault()) || value2 == null) ? false : true;
        if (z) {
            oKServerException = new OKServerException(C33129mqd.AhwBna(value2 != null ? value2.getCode() : null), value2 != null ? value2.getMsg() : null, null, null, 12, null);
        } else {
            oKServerException = null;
        }
        C31164lop c31164lop = this.djBIcL;
        if (z) {
            value = null;
        }
        gOP gopInvoke = this.OLrzqt.invoke();
        C30567ldb c30567ldb = this.copydefault;
        c31164lop.OLrzqt(value, oKServerException, gopInvoke, c30567ldb != null ? c30567ldb.copydefault() : false);
        if (swapState == SwapState.SWITCH_WALLET) {
            this.EZpvd.invoke(java.lang.Boolean.valueOf(this.AYXKKw == TransactionType.Sell), swapState);
        }
    }
}
