package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexui.main.swap.trade.status.widget.MemeErrorNoticeView;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lop, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31164lop {
    public final Function0<C31050lmh> AEQbTJ;
    public final AbstractC28352kYf AYXKKw;
    public final C31052lmj AhwBna;
    public final InterfaceC28107kPd EZpvd;
    public final MemeErrorNoticeView KWHzl;
    public final MemeModeTransactionViewModel OLrzqt;
    public final android.content.Context copydefault;
    public final TransactionType djBIcL;
    public final TokenBase gEmmrt;

    public C31164lop(@NotNull android.content.Context context, MemeErrorNoticeView memeErrorNoticeView, @NotNull AbstractC28352kYf abstractC28352kYf, @NotNull MemeModeTransactionViewModel memeModeTransactionViewModel, @NotNull InterfaceC28107kPd interfaceC28107kPd, @NotNull TokenBase tokenBase, @NotNull TransactionType transactionType, @NotNull C31052lmj c31052lmj, @NotNull Function0<C31050lmh> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC28352kYf, "");
        Intrinsics.checkNotNullParameter(memeModeTransactionViewModel, "");
        Intrinsics.checkNotNullParameter(interfaceC28107kPd, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(c31052lmj, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = context;
        this.KWHzl = memeErrorNoticeView;
        this.AYXKKw = abstractC28352kYf;
        this.OLrzqt = memeModeTransactionViewModel;
        this.EZpvd = interfaceC28107kPd;
        this.gEmmrt = tokenBase;
        this.djBIcL = transactionType;
        this.AhwBna = c31052lmj;
        this.AEQbTJ = function0;
    }

    public static /* synthetic */ void updateReminderView$default(C31164lop c31164lop, V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.Throwable th, gOP gop, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            v6BaseQuoteResponse = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            gop = null;
        }
        c31164lop.OLrzqt(v6BaseQuoteResponse, th, gop, z);
    }

    public final void OLrzqt(V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.Throwable th, gOP gop, boolean z) {
        PreCheckBean preCheckBeanCopydefault = this.OLrzqt.copydefault(this.gEmmrt.getChainId());
        if (preCheckBeanCopydefault == null) {
            preCheckBeanCopydefault = new PreCheckBean(null, 0, 0, 7, null);
        }
        PreCheckBean preCheckBean = preCheckBeanCopydefault;
        DefiChainInfo defiChainInfoOLrzqt = this.AYXKKw.OLrzqt(this.gEmmrt.getChainId());
        if (defiChainInfoOLrzqt == null) {
            return;
        }
        int iCopydefault = C24695iig.copydefault(this.EZpvd.KWHzl());
        int iAEQbTJ = C24695iig.AEQbTJ(this.EZpvd.KWHzl(), true).AEQbTJ();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.AYXKKw.copydefault(this.gEmmrt.getChainId(), this.gEmmrt.getTokenContractAddress());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = DexMultiTokenInfoBean.Companion.OLrzqt(this.gEmmrt);
        TransactionType transactionType = this.djBIcL;
        TransactionType transactionType2 = TransactionType.Buy;
        DexMultiTokenInfoBean dexMultiTokenInfoBean = transactionType == transactionType2 ? dexMultiTokenInfoBeanCopydefault : dexMultiTokenInfoBeanOLrzqt;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = transactionType == transactionType2 ? dexMultiTokenInfoBeanOLrzqt : dexMultiTokenInfoBeanCopydefault;
        boolean zEZpvd = this.AYXKKw.spnCvw() ? Intrinsics.EZpvd(this.AYXKKw.OqFWZa().getValue(), java.lang.Boolean.TRUE) : false;
        android.content.Context context = this.copydefault;
        MemeErrorNoticeView memeErrorNoticeView = this.KWHzl;
        TransactionType transactionType3 = this.djBIcL;
        java.lang.Integer numAwvSrB = this.AYXKKw.AwvSrB();
        SlippageMode slippageMode = SlippageMode.Dynamic;
        C31046lmd.OLrzqt(context, memeErrorNoticeView, transactionType3, preCheckBean, defiChainInfoOLrzqt, v6BaseQuoteResponse, th, (numAwvSrB != null && numAwvSrB.intValue() == slippageMode.getType()) ? slippageMode : SlippageMode.Fixed, this.AYXKKw.QSLkRj(), this.AYXKKw.AYXKKw(), this.AYXKKw.getPostValueLengthLimit(), dexMultiTokenInfoBean, dexMultiTokenInfoBean2, iCopydefault, iAEQbTJ, 1, zEZpvd, true, this.EZpvd.OLrzqt(), this.AhwBna, this.AEQbTJ.invoke(), gop, z);
    }
}
