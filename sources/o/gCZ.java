package o;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxRecord;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gCZ {
    public static final gCZ EZpvd = new gCZ();

    private gCZ() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSpeedUpTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        gcz.OLrzqt(fragmentManager, str, coinAndAddressHistoryDetail, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("coinDetail", coinAndAddressHistoryDetail);
        Unit unit = Unit.INSTANCE;
        EZpvd(fragmentManager, false, false, bundle, coinAndAddressHistoryDetail.getMainCoinId(), function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startCancelTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        gcz.copydefault(fragmentManager, str, coinAndAddressHistoryDetail, function1);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("coinDetail", coinAndAddressHistoryDetail);
        Unit unit = Unit.INSTANCE;
        EZpvd(fragmentManager, true, false, bundle, coinAndAddressHistoryDetail.getMainCoinId(), function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSpeedUpCancelTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        gcz.EZpvd(fragmentManager, str, coinAndAddressHistoryDetail, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("coinDetail", coinAndAddressHistoryDetail);
        Unit unit = Unit.INSTANCE;
        EZpvd(fragmentManager, false, true, bundle, coinAndAddressHistoryDetail.getMainCoinId(), function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSpeedUpTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, yHO yho, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            yho = null;
        }
        gcz.AEQbTJ(fragmentManager, str, txIdOrHashHistoryDetail, (yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("tradeDetail", txIdOrHashHistoryDetail);
        Unit unit = Unit.INSTANCE;
        KWHzl(fragmentManager, false, false, bundle, txIdOrHashHistoryDetail.getMainCoinId(), yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startCancelTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, yHO yho, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            yho = null;
        }
        gcz.OLrzqt(fragmentManager, str, txIdOrHashHistoryDetail, (yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("tradeDetail", txIdOrHashHistoryDetail);
        Unit unit = Unit.INSTANCE;
        KWHzl(fragmentManager, true, false, bundle, txIdOrHashHistoryDetail.getMainCoinId(), yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSpeedUpCancelTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, yHO yho, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            yho = null;
        }
        gcz.EZpvd(fragmentManager, str, txIdOrHashHistoryDetail, (yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("tradeDetail", txIdOrHashHistoryDetail);
        Unit unit = Unit.INSTANCE;
        KWHzl(fragmentManager, false, true, bundle, txIdOrHashHistoryDetail.getMainCoinId(), yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSpeedUpTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, TxRecord txRecord, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        gcz.EZpvd(fragmentManager, str, txRecord, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull TxRecord txRecord, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txRecord, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("txHistory", txRecord);
        Unit unit = Unit.INSTANCE;
        EZpvd(fragmentManager, false, false, bundle, txRecord.getMainCoinId(), function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startCancelTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, TxRecord txRecord, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        gcz.AEQbTJ(fragmentManager, str, txRecord, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull TxRecord txRecord, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txRecord, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("txHistory", txRecord);
        Unit unit = Unit.INSTANCE;
        EZpvd(fragmentManager, true, false, bundle, txRecord.getMainCoinId(), function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSpeedUpCancelTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, TxRecord txRecord, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        gcz.KWHzl(fragmentManager, str, txRecord, function1);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull TxRecord txRecord, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txRecord, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", str);
        bundle.putParcelable("txHistory", txRecord);
        Unit unit = Unit.INSTANCE;
        EZpvd(fragmentManager, false, true, bundle, txRecord.getMainCoinId(), function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSpeedUpTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, yHO yho, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yho = null;
        }
        gcz.copydefault(fragmentManager, walletTxDetailBean, yho);
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", walletTxDetailBean.getWalletId());
        bundle.putParcelable("walletTxDetailBean", walletTxDetailBean);
        Unit unit = Unit.INSTANCE;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(walletTxDetailBean.getCoinId());
        KWHzl(fragmentManager, false, false, bundle, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : -1L, yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startCancelTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, yHO yho, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yho = null;
        }
        gcz.KWHzl(fragmentManager, walletTxDetailBean, yho);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", walletTxDetailBean.getWalletId());
        bundle.putParcelable("walletTxDetailBean", walletTxDetailBean);
        Unit unit = Unit.INSTANCE;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(walletTxDetailBean.getCoinId());
        KWHzl(fragmentManager, true, false, bundle, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : -1L, yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startSpeedUpCancelTx$default(gCZ gcz, androidx.fragment.app.FragmentManager fragmentManager, WalletTxDetailBean walletTxDetailBean, yHO yho, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yho = null;
        }
        gcz.AEQbTJ(fragmentManager, walletTxDetailBean, yho);
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("walletId", walletTxDetailBean.getWalletId());
        bundle.putParcelable("walletTxDetailBean", walletTxDetailBean);
        Unit unit = Unit.INSTANCE;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(walletTxDetailBean.getCoinId());
        KWHzl(fragmentManager, false, true, bundle, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : -1L, yho);
    }

    public final void EZpvd(androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2, android.os.Bundle bundle, long j, Function1<? super java.lang.Boolean, Unit> function1) {
        C10854bwM c10854bwMKWHzl;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(j);
        if (customChainCoinMetaOLrzqt == null || (c10854bwMKWHzl = customChainCoinMetaOLrzqt.AEQbTJ()) == null) {
            c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
        }
        if (c10854bwMKWHzl == null) {
            C33134mqi.copydefault(C13754dXa.FragmentManager.invokespecialaVhqwO);
            return;
        }
        if (c10854bwMKWHzl.DarRvM()) {
            if (z) {
                gCY.Companion.copydefault(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
                return;
            } else if (z2) {
                C19462gDg.Companion.KWHzl(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
                return;
            } else {
                C19460gDe.Companion.EZpvd(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
                return;
            }
        }
        if (c10854bwMKWHzl.QkdxfA()) {
            if (z) {
                C19458gDc.Companion.AEQbTJ(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
                return;
            } else if (z2) {
                C19457gDb.Companion.AEQbTJ(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
                return;
            } else {
                C19456gDa.Companion.copydefault(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
                return;
            }
        }
        if (!c10854bwMKWHzl.iRxXKY()) {
            C33134mqi.copydefault(C13754dXa.FragmentManager.invokespecialaVhqwO);
            return;
        }
        if (z) {
            C19463gDh.Companion.OLrzqt(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
        } else if (z2) {
            C19459gDd.Companion.OLrzqt(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
        } else {
            C19461gDf.Companion.copydefault(bundle).EZpvd(fragmentManager, "speedUpTxBaseFragment", function1);
        }
    }

    public final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2, android.os.Bundle bundle, long j, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        C10854bwM c10854bwMKWHzl;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(j);
        if (customChainCoinMetaOLrzqt == null || (c10854bwMKWHzl = customChainCoinMetaOLrzqt.AEQbTJ()) == null) {
            c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
        }
        if (c10854bwMKWHzl == null) {
            C33134mqi.copydefault(C13754dXa.FragmentManager.invokespecialaVhqwO);
            if (yho != null) {
                yho.invoke(java.lang.Boolean.FALSE, null, null);
                return;
            }
            return;
        }
        if (c10854bwMKWHzl.DarRvM()) {
            if (z) {
                gCY.Companion.copydefault(bundle).copydefault(fragmentManager, "speedUpTxBaseFragment", yho);
                return;
            } else if (z2) {
                C19462gDg.Companion.KWHzl(bundle).copydefault(fragmentManager, "speedUpTxBaseFragment", yho);
                return;
            } else {
                C19460gDe.Companion.EZpvd(bundle).copydefault(fragmentManager, "speedUpTxBaseFragment", yho);
                return;
            }
        }
        if (c10854bwMKWHzl.QkdxfA()) {
            if (z) {
                C19458gDc.Companion.AEQbTJ(bundle).copydefault(fragmentManager, "speedUpTxBaseFragment", yho);
                return;
            } else if (z2) {
                C19457gDb.Companion.AEQbTJ(bundle).copydefault(fragmentManager, "speedUpTxBaseFragment", yho);
                return;
            } else {
                C19456gDa.Companion.copydefault(bundle).copydefault(fragmentManager, "speedUpTxBaseFragment", yho);
                return;
            }
        }
        if (!c10854bwMKWHzl.iRxXKY()) {
            C33134mqi.copydefault(C13754dXa.FragmentManager.invokespecialaVhqwO);
            if (yho != null) {
                yho.invoke(java.lang.Boolean.FALSE, null, null);
                return;
            }
            return;
        }
        if (z) {
            C19463gDh.Companion.OLrzqt(bundle).copydefault(fragmentManager, "speedUpTxBaseFragment", yho);
        } else if (z2) {
            C19459gDd.Companion.OLrzqt(bundle).copydefault(fragmentManager, "speedUpTxBaseFragment", yho);
        } else {
            C20126gax.Companion.EZpvd(bundle).AEQbTJ(fragmentManager, "speedUpTxBaseFragment", yho);
        }
    }
}
