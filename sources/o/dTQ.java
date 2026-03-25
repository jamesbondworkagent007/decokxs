package o;

import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface dTQ extends InterfaceC43217rlC {
    dTM AEQbTJ(java.lang.String str, java.lang.Long l, boolean z);

    boolean AEQbTJ(@NotNull java.lang.String str);

    java.util.Map<java.lang.Long, dTM> EZpvd(java.lang.String str, @NotNull java.util.List<java.lang.Long> list, boolean z);

    java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull ActivateTeeGuideModel activateTeeGuideModel, @NotNull Continuation<? super Unit> continuation);

    boolean OLrzqt(java.lang.String str);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.Boolean bool, @NotNull java.lang.String str2);

    void copydefault(@NotNull android.content.Context context, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Boolean bool, @NotNull java.lang.String str);

    boolean copydefault();

    boolean copydefault(@NotNull java.lang.String str);

    public static final class TaskDescription {
        public static /* synthetic */ boolean walletSupportTEE2Account$default(dTQ dtq, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: walletSupportTEE2Account");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return dtq.OLrzqt(str);
        }

        public static /* synthetic */ void walletRenewOrReenableTEEAccount$default(dTQ dtq, android.content.Context context, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: walletRenewOrReenableTEEAccount");
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            dtq.copydefault(context, str, bool, str2);
        }

        public static /* synthetic */ dTM queryTEEAccountAndChainStatus$default(dTQ dtq, java.lang.String str, java.lang.Long l, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryTEEAccountAndChainStatus");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return dtq.AEQbTJ(str, l, z);
        }

        public static /* synthetic */ java.util.Map queryTEEAccountAndChainStatus$default(dTQ dtq, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryTEEAccountAndChainStatus");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return dtq.EZpvd(str, list, z);
        }

        public static /* synthetic */ void enterTeeReNewPageAndCheck$default(dTQ dtq, android.content.Context context, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Boolean bool, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterTeeReNewPageAndCheck");
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            dtq.copydefault(context, interfaceC9738bbJ, bool, str);
        }
    }
}
