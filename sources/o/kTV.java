package o;

import com.okinc.business.dexlogic.bean.QuotaInfoBean;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmUseCaseImpl$getQuotaInfo$2;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmUseCaseImpl$getStrategyQuotaInfo$2;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmUseCaseImpl$toggleDexEOAAutoConfirmFlag$2;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC28239kUa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class kTV implements kTW {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final android.content.SharedPreferences AEQbTJ;
    public final C19700gMb EZpvd;
    public final CoroutineContext OLrzqt;
    public final InterfaceC23234huQ copydefault;

    public kTV(@NotNull android.content.SharedPreferences sharedPreferences, @NotNull C19700gMb c19700gMb, @NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.AEQbTJ = sharedPreferences;
        this.EZpvd = c19700gMb;
        this.copydefault = interfaceC23234huQ;
        this.OLrzqt = coroutineContext;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kTV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final boolean EZpvd() {
            return SPUtils.getBoolean("key_dex_eoa_auto_confirm_auto_entry_on_tx_success", true, "dex_trading_local_config");
        }

        public final void KWHzl() {
            SPUtils.put("key_dex_eoa_auto_confirm_auto_entry_on_tx_success", java.lang.Boolean.FALSE, "dex_trading_local_config");
        }

        public final boolean AhwBna() {
            return SPUtils.getBoolean("key_dex_eoa_auto_confirm_first_time_dot", true, "dex_trading_local_config");
        }

        public final void copydefault() {
            SPUtils.put("key_dex_eoa_auto_confirm_first_time_dot", java.lang.Boolean.FALSE, "dex_trading_local_config");
        }

        public final boolean AEQbTJ() {
            return SPUtils.getBoolean("key_dex_eoa_auto_confirm_intro_coach_mark", true, "dex_trading_local_config");
        }

        public final void OLrzqt() {
            SPUtils.put("key_dex_eoa_auto_confirm_intro_coach_mark", java.lang.Boolean.FALSE, "dex_trading_local_config");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yCM
    public kTV(@NotNull android.content.Context context, @NotNull C19700gMb c19700gMb, @NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("dex_trading_local_config", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this(sharedPreferences, c19700gMb, interfaceC23234huQ, coroutineDispatcher);
    }

    @Override // o.kTW
    public InterfaceC28239kUa OLrzqt() {
        if (!C22416heu.fIwbmz()) {
            return InterfaceC28239kUa.StateListAnimator.AEQbTJ;
        }
        if (this.AEQbTJ.getBoolean("key_dex_eoa_auto_confirm_flag", false)) {
            return InterfaceC28239kUa.TaskDescription.AEQbTJ;
        }
        return InterfaceC28239kUa.Activity.OLrzqt;
    }

    @Override // o.kTW
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new AutoConfirmUseCaseImpl$toggleDexEOAAutoConfirmFlag$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final boolean EZpvd() {
        if (this.EZpvd.djBIcL()) {
            return true;
        }
        return this.AEQbTJ.getBoolean("key_dex_eoa_auto_confirm_flag", false);
    }

    @Override // o.kTW
    public boolean copydefault() {
        if (this.EZpvd.djBIcL()) {
            return C22416heu.getFieldNames();
        }
        return C22416heu.fARcdN() && Intrinsics.EZpvd(OLrzqt(), InterfaceC28239kUa.TaskDescription.AEQbTJ);
    }

    @Override // o.kTW
    public java.lang.Object EZpvd(@NotNull Continuation<? super QuotaInfoBean> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new AutoConfirmUseCaseImpl$getQuotaInfo$2(this, null), continuation);
    }

    @Override // o.kTW
    public java.lang.Object copydefault(@NotNull Continuation<? super QuotaInfoBean> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new AutoConfirmUseCaseImpl$getStrategyQuotaInfo$2(this, null), continuation);
    }

    @Override // o.kTW
    public boolean KWHzl(boolean z, boolean z2, boolean z3) {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl;
        boolean fieldNames;
        boolean z4 = false;
        if (this.EZpvd.KWHzl() == null || ((interfaceC9738bbJKWHzl = this.EZpvd.KWHzl()) != null && !interfaceC9738bbJKWHzl.dNCPSb())) {
            pUU.KWHzl("AutoConfirmUseCaseImpl", "Skipping auto sign for Non-supported wallet type");
            return false;
        }
        boolean zDjBIcL = this.EZpvd.djBIcL();
        if (zDjBIcL) {
            fieldNames = C22416heu.getFieldNames();
        } else {
            fieldNames = EZpvd() && C22416heu.fARcdN();
        }
        if (!z && z2 && z3 && fieldNames) {
            z4 = true;
        }
        pUU.KWHzl("AutoConfirmUseCaseImpl", "shouldSilentSign: result=" + z4 + ", isTeeActive=" + zDjBIcL + ", isWalletSilentSignEnabled=" + fieldNames + ", forceManualSign=" + z + ", isOKXPlatform=" + z2 + ", isAutoConfirmQuotaRemaining=" + z3);
        return z4;
    }
}
