package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.metricsmonitor.AddOrRemoveType;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import com.okinc.business.defi.wallet.metricsmonitor.EncryptionMethod;
import com.okinc.business.defi.wallet.metricsmonitor.WalletOrAccountType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fiY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18445fiY {
    public static final StateListAnimator Companion = StateListAnimator.copydefault;

    void AEQbTJ(@NotNull java.lang.String str, WalletType walletType, java.lang.String str2, boolean z, @NotNull WalletOrAccountType walletOrAccountType);

    void EZpvd(@NotNull java.lang.String str, long j);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, WalletType walletType, java.lang.String str4);

    void KWHzl(@NotNull java.lang.String str);

    void KWHzl(@NotNull java.lang.String str, @NotNull OKWBaseTransaction.TransactionType transactionType, @NotNull java.lang.String str2, long j, @NotNull AbstractC12782ctV abstractC12782ctV);

    void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Long l, @NotNull AddOrRemoveType addOrRemoveType, WalletType walletType);

    void KWHzl(@NotNull java.lang.String str, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull CreateOrImportType createOrImportType, @NotNull java.lang.String str2);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, WalletType walletType, java.lang.String str4);

    void copydefault(@NotNull java.lang.String str, WalletType walletType, java.lang.String str2, @NotNull EncryptionMethod encryptionMethod, boolean z);

    void copydefault(@NotNull java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, java.lang.String str3, @NotNull CreateOrImportType createOrImportType, @NotNull WalletType walletType, WalletType walletType2, @NotNull java.lang.String str4);

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, WalletType walletType, java.lang.String str4);

    void copydefault(@NotNull java.lang.String str, boolean z);

    /* JADX INFO: renamed from: o.fiY$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }

        public static /* synthetic */ InterfaceC18445fiY getInstance$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.copydefault(context);
        }

        public final InterfaceC18445fiY copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).ORxRYg();
        }
    }
}
