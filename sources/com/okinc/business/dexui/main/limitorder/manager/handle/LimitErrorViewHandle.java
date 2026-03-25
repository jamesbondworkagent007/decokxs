package com.okinc.business.dexui.main.limitorder.manager.handle;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitErrorViewHandle;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C22495hgT;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.gLQ;
import o.gOP;
import o.gOY;
import o.gPQ;
import o.hKZ;
import o.hLE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitErrorViewHandle {
    public final hKZ AEQbTJ;
    public final C22495hgT AhwBna;
    public final hLE EZpvd;
    public ErrorType KWHzl;
    public final gOP OLrzqt;
    public final FragmentActivity copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final hLE KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorType copydefault() {
        return this.KWHzl;
    }

    public LimitErrorViewHandle(@NotNull C22495hgT c22495hgT, @NotNull FragmentActivity fragmentActivity, @NotNull gOP gop) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(gop, "");
        this.AhwBna = c22495hgT;
        this.copydefault = fragmentActivity;
        this.OLrzqt = gop;
        hKZ hkz = new hKZ();
        this.AEQbTJ = hkz;
        this.EZpvd = new hLE(c22495hgT, hkz);
    }

    public final boolean AEQbTJ() {
        ErrorType errorType = this.KWHzl;
        return errorType == ErrorType.HoneyPot || errorType == ErrorType.SafeMoon;
    }

    public final void OLrzqt(@NotNull ErrorType errorType, @NotNull ErrorNoticeView errorNoticeView) {
        Intrinsics.checkNotNullParameter(errorType, "");
        Intrinsics.checkNotNullParameter(errorNoticeView, "");
        this.KWHzl = errorType;
        if (this.AhwBna.fARcdN().length() == 0) {
            return;
        }
        final ReminderListConfig value = this.AhwBna.aKErDB().getValue();
        if (value != null) {
            new gOY().copydefault(value, errorNoticeView, this.OLrzqt, (!value.getHasMoreReminders() || value.getHasBlockingTier()) ? null : new Function0() { // from class: o.hLh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitErrorViewHandle.copydefault(this.OLrzqt, value);
                }
            });
        } else {
            errorNoticeView.setVisibility(8);
        }
    }

    public static final Unit copydefault(LimitErrorViewHandle limitErrorViewHandle, ReminderListConfig reminderListConfig) {
        gPQ.show$default(gPQ.OLrzqt, limitErrorViewHandle.copydefault, reminderListConfig.getAllReminderConfigs(), limitErrorViewHandle.OLrzqt, null, 8, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        gLQ glqCopydefault = this.EZpvd.copydefault();
        Function2<Context, CoroutineScope, Unit> function2EZpvd = glqCopydefault != null ? glqCopydefault.EZpvd() : null;
        if (function2EZpvd != null) {
            function2EZpvd.invoke(fragmentActivity, ViewModelKt.getViewModelScope(this.AhwBna));
        }
    }

    public final void copydefault(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        gLQ glqCopydefault = this.EZpvd.copydefault();
        Function2<Context, CoroutineScope, Unit> function2EZpvd = glqCopydefault != null ? glqCopydefault.EZpvd() : null;
        if (function2EZpvd != null) {
            function2EZpvd.invoke(fragmentActivity, ViewModelKt.getViewModelScope(this.AhwBna));
        }
    }

    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        gLQ glqCopydefault = this.EZpvd.copydefault();
        Function2<Context, CoroutineScope, Unit> function2EZpvd = glqCopydefault != null ? glqCopydefault.EZpvd() : null;
        if (function2EZpvd != null) {
            function2EZpvd.invoke(fragmentActivity, ViewModelKt.getViewModelScope(this.AhwBna));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType SafeMoon = new ErrorType("SafeMoon", 0);
        public static final ErrorType HoneyPot = new ErrorType("HoneyPot", 1);
        public static final ErrorType Leverage = new ErrorType("Leverage", 2);
        public static final ErrorType NormalCoin = new ErrorType("NormalCoin", 3);
        public static final ErrorType WalletLegal = new ErrorType("WalletLegal", 4);
        public static final ErrorType MinAmount = new ErrorType("MinAmount", 5);
        public static final ErrorType MpcWallet = new ErrorType("MpcWallet", 6);
        public static final ErrorType QuoteFailed = new ErrorType("QuoteFailed", 7);
        public static final ErrorType NoLiquidity = new ErrorType("NoLiquidity", 8);
        public static final ErrorType CANCEL_APPROVE = new ErrorType("CANCEL_APPROVE", 9);
        public static final ErrorType RATE_WARNING = new ErrorType("RATE_WARNING", 10);
        public static final ErrorType BlackAddress = new ErrorType("BlackAddress", 11);
        public static final ErrorType HoneyPotWarning = new ErrorType("HoneyPotWarning", 12);
        public static final ErrorType TeeNumLimitWarning = new ErrorType("TeeNumLimitWarning", 13);
        public static final ErrorType NoLiquidityAtTheMoment = new ErrorType("NoLiquidityAtTheMoment", 14);
        public static final ErrorType FunctionUpgrade = new ErrorType("FunctionUpgrade", 15);
        public static final ErrorType SmartAccountStatusError = new ErrorType("SmartAccountStatusError", 16);
        public static final ErrorType SlippageWarning = new ErrorType("SlippageWarning", 17);
        public static final ErrorType SwapConfigFetchFailed = new ErrorType("SwapConfigFetchFailed", 18);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{SafeMoon, HoneyPot, Leverage, NormalCoin, WalletLegal, MinAmount, MpcWallet, QuoteFailed, NoLiquidity, CANCEL_APPROVE, RATE_WARNING, BlackAddress, HoneyPotWarning, TeeNumLimitWarning, NoLiquidityAtTheMoment, FunctionUpgrade, SmartAccountStatusError, SlippageWarning, SwapConfigFetchFailed};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ErrorType> getEntries() {
            return $ENTRIES;
        }

        private ErrorType(String str, int i) {
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(errorTypeArr$values);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }
}
