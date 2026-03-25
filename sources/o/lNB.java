package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lNB {
    public static final void OLrzqt(@NotNull AbstractC30156lNz abstractC30156lNz, @NotNull android.widget.ImageView imageView, @NotNull android.widget.Space space) {
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(space, "");
        if (abstractC30156lNz.values()) {
            imageView.setVisibility(0);
            space.setVisibility(0);
            boolean zOLrzqt = C33492mxV.OLrzqt();
            kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = abstractC30156lNz.OLrzqt();
            java.lang.String second = zOLrzqt ? pairOLrzqt.getSecond() : pairOLrzqt.getFirst();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) second)) {
                imageView.setVisibility(0);
                space.setVisibility(0);
                C33054mpH.loadUrl$default(imageView, second, null, 0, 0, 14, null);
                return;
            } else {
                space.setVisibility(8);
                imageView.setVisibility(8);
                return;
            }
        }
        space.setVisibility(8);
        imageView.setVisibility(8);
    }

    public static final void copydefault(@NotNull AbstractC30156lNz abstractC30156lNz, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (abstractC30156lNz.fetchVPNInfo() && C33129mqd.OLrzqt((java.lang.CharSequence) abstractC30156lNz.getFieldNames())) {
            textView.setVisibility(0);
            textView.setText(abstractC30156lNz.getFieldNames());
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void OLrzqt(@NotNull AbstractC30156lNz abstractC30156lNz, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) abstractC30156lNz.getNewProxyInstance())) {
            textView.setVisibility(0);
            textView.setText(abstractC30156lNz.getNewProxyInstance());
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void AEQbTJ(@NotNull AbstractC30156lNz abstractC30156lNz, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (abstractC30156lNz.fIwbmz()) {
            textView.setVisibility(0);
            textView.setText(abstractC30156lNz.fARcdN());
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void OLrzqt(@NotNull AbstractC30156lNz abstractC30156lNz, @NotNull android.widget.TextView textView, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (abstractC30156lNz.djBIcL() && z) {
            textView.setVisibility(0);
            textView.setText(abstractC30156lNz.AEQbTJ());
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void EZpvd(@NotNull AbstractC30156lNz abstractC30156lNz, @NotNull android.widget.TextView textView, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (abstractC30156lNz.AhwBna() && z) {
            textView.setVisibility(0);
            textView.setText(abstractC30156lNz.AEQbTJ());
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void EZpvd(@NotNull AbstractC30156lNz abstractC30156lNz, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (abstractC30156lNz.AYXKKw()) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
        } else {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        }
    }

    public static final void KWHzl(@NotNull AbstractC30156lNz abstractC30156lNz, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (abstractC30156lNz.gEmmrt()) {
            textView.setText(abstractC30156lNz.copydefault());
            textView.setVisibility(0);
        } else {
            textView.setTextAppearance(C52761wXj.LoaderManager.htlTjW);
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        }
    }

    public static final java.lang.String KWHzl(@NotNull PaymentMethod paymentMethod) {
        java.lang.String strSubstring;
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        if (paymentMethod.getAccount() == null) {
            return "";
        }
        com.okinc.okpaymentapi.data.remote.model.management.Account account = paymentMethod.getAccount();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (account != null ? account.getLast4() : null))) {
            com.okinc.okpaymentapi.data.remote.model.management.Account account2 = paymentMethod.getAccount();
            if (account2 == null || (strSubstring = account2.getLast4()) == null) {
                return "";
            }
        } else {
            com.okinc.okpaymentapi.data.remote.model.management.Account account3 = paymentMethod.getAccount();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) (account3 != null ? account3.getAccountNumber() : null))) {
                return "";
            }
            com.okinc.okpaymentapi.data.remote.model.management.Account account4 = paymentMethod.getAccount();
            java.lang.String accountNumber = account4 != null ? account4.getAccountNumber() : null;
            Intrinsics.copydefault((java.lang.Object) accountNumber);
            if (accountNumber.length() <= 4) {
                com.okinc.okpaymentapi.data.remote.model.management.Account account5 = paymentMethod.getAccount();
                Intrinsics.copydefault(account5);
                return account5.getAccountNumber();
            }
            com.okinc.okpaymentapi.data.remote.model.management.Account account6 = paymentMethod.getAccount();
            Intrinsics.copydefault(account6);
            java.lang.String accountNumber2 = account6.getAccountNumber();
            com.okinc.okpaymentapi.data.remote.model.management.Account account7 = paymentMethod.getAccount();
            Intrinsics.copydefault(account7);
            strSubstring = accountNumber2.substring(account7.getAccountNumber().length() - 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        }
        return strSubstring;
    }

    public static final java.lang.String OLrzqt(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        com.okinc.okpaymentapi.data.remote.model.management.Account account = paymentMethod.getAccount();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (account != null ? account.getBankName() : null))) {
            com.okinc.okpaymentapi.data.remote.model.management.Account account2 = paymentMethod.getAccount();
            if (account2 != null) {
                return account2.getBankName();
            }
            return null;
        }
        return C33070mpX.AYXKKw(C31351lsQ.Activity.RZNAhV);
    }

    public static /* synthetic */ java.lang.String getFormattedNumber$default(java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str2 = " ";
        }
        return copydefault(str, i, str2);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return CollectionsKt___CollectionsKt.joinToString$default(C59454zhO.AYXKKw((java.lang.CharSequence) str, i), str2, null, null, 0, null, null, 62, null);
    }

    public static final java.lang.String copydefault(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        com.okinc.okpaymentapi.data.remote.model.management.Account account = paymentMethod.getAccount();
        if (account != null) {
            return account.getBankAccountType();
        }
        return null;
    }
}
