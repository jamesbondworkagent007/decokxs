package o;

import com.okinc.wallet.api.WalletReferralSource;
import com.okinc.wallet.api.bean.ReferralInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface xWP extends InterfaceC43217rlC {
    ReferralInfo AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, @NotNull WalletReferralSource walletReferralSource, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super Unit> continuation);

    void AEQbTJ();

    void AEQbTJ(@NotNull ReferralInfo referralInfo, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    void AEQbTJ(@NotNull java.lang.String str);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> continuation);

    java.lang.String EZpvd(@NotNull java.lang.String str);

    void EZpvd();

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull ReferralInfo referralInfo, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    boolean KWHzl(@NotNull java.lang.String str);

    ReferralInfo OLrzqt(java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, @NotNull WalletReferralSource walletReferralSource, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void OLrzqt(@NotNull android.content.Context context);

    void OLrzqt(@NotNull ReferralInfo referralInfo, @NotNull java.lang.String str);

    void OLrzqt(@NotNull ReferralInfo referralInfo, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation);

    void copydefault(@NotNull android.content.Context context);

    boolean copydefault();

    public static final class TaskDescription {
        public static /* synthetic */ ReferralInfo getReferralInfo$default(xWP xwp, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReferralInfo");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return xwp.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.xWP */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object bindReferralCode$default(xWP xwp, android.content.Context context, java.lang.String str, boolean z, WalletReferralSource walletReferralSource, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindReferralCode");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                map = C56424yEw.KWHzl();
            }
            return xwp.AEQbTJ(context, str, z2, walletReferralSource, map, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.xWP */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object bindShortReferralCode$default(xWP xwp, android.content.Context context, java.lang.String str, boolean z, WalletReferralSource walletReferralSource, java.util.Map map, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindShortReferralCode");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                map = C56424yEw.KWHzl();
            }
            return xwp.OLrzqt(context, str, z2, walletReferralSource, map, continuation);
        }
    }
}
