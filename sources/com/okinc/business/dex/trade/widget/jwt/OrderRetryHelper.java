package com.okinc.business.dex.trade.widget.jwt;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22274hcK;
import o.C25389ivm;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderRetryHelper {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public volatile boolean AEQbTJ;
    public final String KWHzl;
    public volatile boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderRetryHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.AEQbTJ = false;
        this.copydefault = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.copydefault = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ || this.copydefault;
    }

    public OrderRetryHelper(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("OrderRetryHelper") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:36) call: com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ OrderRetryHelper(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "OrderRetryHelper" : str);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class RetryReason {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RetryReason[] $VALUES;
        public static final RetryReason JWT_ERROR = new RetryReason("JWT_ERROR", 0);
        public static final RetryReason QUOTA_EXCEEDED = new RetryReason("QUOTA_EXCEEDED", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RetryReason[] $values() {
            return new RetryReason[]{JWT_ERROR, QUOTA_EXCEEDED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RetryReason> getEntries() {
            return $ENTRIES;
        }

        private RetryReason(String str, int i) {
        }

        static {
            RetryReason[] retryReasonArr$values = $values();
            $VALUES = retryReasonArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(retryReasonArr$values);
        }

        public static RetryReason valueOf(String str) {
            return (RetryReason) Enum.valueOf(RetryReason.class, str);
        }

        public static RetryReason[] values() {
            return (RetryReason[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ void handleErrorWithRetry$default(OrderRetryHelper orderRetryHelper, Throwable th, Function1 function1, Function1 function12, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "RETRY -> JWT error, starting authentication";
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = "RETRY -> Quota exceeded, retrying with manual sign";
        }
        orderRetryHelper.AEQbTJ(th, function1, function12, str3, str2);
    }

    public final void AEQbTJ(@NotNull Throwable th, @NotNull final Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean z = true;
        if (!this.AEQbTJ && C25389ivm.OLrzqt(th)) {
            pUU.KWHzl(this.KWHzl, "Retrying, Code - " + C25389ivm.KWHzl(th) + ", Message - " + str);
            this.AEQbTJ = true;
            function1.invoke(Boolean.TRUE);
            return;
        }
        if (!this.AEQbTJ && ((th instanceof WalletJwtException) || (((th instanceof OKServerException) && (((OKServerException) th).getOrigin() instanceof WalletJwtException)) || C25389ivm.copydefault(th)))) {
            pUU.KWHzl(this.KWHzl, "Retrying, Code - " + C25389ivm.KWHzl(th) + ", Message - " + str);
            this.AEQbTJ = true;
            C22274hcK.OLrzqt.OLrzqt(new Function0() { // from class: o.hcP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OrderRetryHelper.copydefault(function1);
                }
            }, new Function0() { // from class: o.hcM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OrderRetryHelper.AEQbTJ(this.AEQbTJ);
                }
            });
            return;
        }
        if (!this.copydefault && (th instanceof OKServerException) && ((OKServerException) th).getCode() == 60030) {
            pUU.KWHzl(this.KWHzl, "Retrying, Quota Exceeds error: " + str2);
            this.copydefault = true;
            function1.invoke(Boolean.TRUE);
            return;
        }
        EZpvd();
        boolean z2 = th instanceof OKServerException;
        OKServerException oKServerException = z2 ? (OKServerException) th : null;
        String strValueOf = oKServerException != null ? Integer.valueOf(oKServerException.getCode()) : "N/A";
        String str3 = this.KWHzl;
        if (!(th instanceof WalletJwtException) && ((!z2 || !(((OKServerException) th).getOrigin() instanceof WalletJwtException)) && !C25389ivm.copydefault(th))) {
            z = false;
        }
        pUU.KWHzl(str3, "Non - Retrying Flow, isJWTError - " + z + ", Code - " + C25389ivm.KWHzl(th) + ", OKServerExceptionCode - " + strValueOf + ", msg - " + th.getMessage());
        function12.invoke(th);
    }

    public static final Unit copydefault(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(OrderRetryHelper orderRetryHelper) {
        orderRetryHelper.AEQbTJ = false;
        return Unit.INSTANCE;
    }
}
