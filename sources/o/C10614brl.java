package o;

import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.brl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10614brl {
    public static final TaskDescription Companion = new TaskDescription(null);

    public final boolean AEQbTJ(long j) {
        return j < 0 && j != Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: o.brl$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.brl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C10614brl getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.AEQbTJ(context);
        }

        public final C10614brl AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).QVAiDq();
        }
    }

    public final WalletSelectedChainBean KWHzl(@NotNull java.lang.String str) {
        java.lang.String walletId;
        java.lang.String generalChainId;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = SPUtils.getString(EZpvd(str), "", "selected_chain_config_file");
        Intrinsics.copydefault((java.lang.Object) string);
        if (string.length() == 0) {
            return new WalletSelectedChainBean(str, "-9223372036854775808", "-9223372036854775808", null, null, null, 56, null);
        }
        try {
            WalletSelectedChainBean walletSelectedChainBean = (WalletSelectedChainBean) C33488mxR.KWHzl().fromJson(string, WalletSelectedChainBean.class);
            java.lang.String chainId = walletSelectedChainBean.getChainId();
            if (chainId != null && chainId.length() != 0 && (walletId = walletSelectedChainBean.getWalletId()) != null && walletId.length() != 0 && (generalChainId = walletSelectedChainBean.getGeneralChainId()) != null && generalChainId.length() != 0) {
                Intrinsics.copydefault(walletSelectedChainBean);
                return walletSelectedChainBean;
            }
            return new WalletSelectedChainBean(str, "-9223372036854775808", "-9223372036854775808", null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            return new WalletSelectedChainBean(str, "-9223372036854775808", "-9223372036854775808", null, null, null, 56, null);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        SPUtils.put(EZpvd(str), C33488mxR.KWHzl().toJson(new WalletSelectedChainBean(str, str2, str3, str4, str5, str6)), "selected_chain_config_file");
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.remove(EZpvd(str), "selected_chain_config_file");
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return str + "_selected_chain_suffix";
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0) {
            return "";
        }
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = KWHzl(str);
        return (!walletSelectedChainBeanKWHzl.isAllNetwork() && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) walletSelectedChainBeanKWHzl.getChainId())) ? walletSelectedChainBeanKWHzl.getRpcUrl() : "";
    }
}
