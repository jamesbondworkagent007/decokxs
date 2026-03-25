package o;

import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.RecurringBuyPlanDetailErrorCase;

/* JADX INFO: renamed from: o.lQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30232lQt implements InterfaceC3849Ath {
    public final C30325lUe OLrzqt;

    /* JADX INFO: renamed from: o.lQt$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyPlanDetailErrorCase.values().length];
            try {
                iArr[RecurringBuyPlanDetailErrorCase.LOW_BALANCE_WARNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyPlanDetailErrorCase.LOW_BALANCE_FAIL_WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringBuyPlanDetailErrorCase.LOW_BALANCE_AUTO_PAUSED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringBuyPlanDetailErrorCase.PAYMENT_METHOD_ISSUE_FAIL_WARNING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[RecurringBuyPlanDetailErrorCase.PAYMENT_METHOD_ISSUE_AUTO_PAUSED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[RecurringBuyPlanDetailErrorCase.NO_OTC_QUOTE_FAIL_WARNING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[RecurringBuyPlanDetailErrorCase.NO_OTC_QUOTE_AUTO_PAUSED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr;
        }
    }

    @yCM
    public C30232lQt(@NotNull C30325lUe c30325lUe) {
        Intrinsics.checkNotNullParameter(c30325lUe, "");
        this.OLrzqt = c30325lUe;
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String upperCase2 = "daily".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase2)) {
            return this.OLrzqt.EZpvd(C31351lsQ.Activity.atDTRm);
        }
        java.lang.String upperCase3 = "weekly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase3)) {
            return this.OLrzqt.EZpvd(C31351lsQ.Activity.gBtXYZ);
        }
        java.lang.String upperCase4 = "bi-weekly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase4)) {
            return this.OLrzqt.EZpvd(C31351lsQ.Activity.Rtjmuc);
        }
        java.lang.String upperCase5 = "monthly".toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) upperCase5)) {
            return this.OLrzqt.EZpvd(C31351lsQ.Activity.dPnHjp);
        }
        if (str.length() <= 0) {
            return str;
        }
        char upperCase6 = java.lang.Character.toUpperCase(str.charAt(0));
        java.lang.String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return upperCase6 + strSubstring;
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String copydefault(long j) {
        return pTA.formatStandardDate$default(new Date(j), null, 1, null);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String KWHzl(long j) {
        return pTA.formatStandardDate$default(new Date(j), null, 1, null);
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String AEQbTJ(@NotNull RecurringBuyPlanDetailErrorCase recurringBuyPlanDetailErrorCase) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailErrorCase, "");
        switch (Activity.AEQbTJ[recurringBuyPlanDetailErrorCase.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.deregisterUser);
            case 4:
            case 5:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.hlXVux);
            case 6:
            case 7:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.processStrongAuthMessage);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String copydefault(@NotNull RecurringBuyPlanDetailErrorCase recurringBuyPlanDetailErrorCase) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailErrorCase, "");
        switch (Activity.AEQbTJ[recurringBuyPlanDetailErrorCase.ordinal()]) {
            case 1:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.invokespecialaKhcqp);
            case 2:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.invokespecialaGOrKO);
            case 3:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.invokespecialaVhqwO);
            case 4:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.invokespecialatDTRm);
            case 5:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.invokespecialgBtXYZ);
            case 6:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.invokespecialdPnHjp);
            case 7:
                return this.OLrzqt.EZpvd(C31351lsQ.Activity.invokespecialhlXVux);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return this.OLrzqt.EZpvd(C31351lsQ.Activity.dbwnZN, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str)));
        }
        return this.OLrzqt.EZpvd(C31351lsQ.Activity.DPHOMC, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str)));
    }

    @Override // o.InterfaceC3849Ath
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.OLrzqt.EZpvd(C31351lsQ.Activity.aGOrKO, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str2)));
    }
}
