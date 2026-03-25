package o;

import com.okinc.business.defi.api.bean.CloudBackupWalletType;
import com.okinc.business.defi.common.track.CloudBackupEventCode;
import com.okinc.business.defi.common.track.CloudBackupEventType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14493dmW {
    public static final void KWHzl(@NotNull final CloudBackupWalletType cloudBackupWalletType, @NotNull final CloudBackupEventType cloudBackupEventType, @NotNull final java.lang.String str, @NotNull java.lang.String str2, final boolean z, @NotNull final CloudBackupEventCode cloudBackupEventCode, final int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(cloudBackupWalletType, "");
        Intrinsics.checkNotNullParameter(cloudBackupEventType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(cloudBackupEventCode, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str3.length() != 0) {
            str2 = "[message]" + str2 + "-[originMessage]" + str3;
        }
        final java.lang.String str4 = str2;
        C32866mlf.onEvent$default("Web3Wallet_Cloud_BackupUpdate_View", (TrackChannel[]) null, new Function1() { // from class: o.dmS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14493dmW.EZpvd(cloudBackupWalletType, cloudBackupEventType, str, z, cloudBackupEventCode, i, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(CloudBackupWalletType cloudBackupWalletType, CloudBackupEventType cloudBackupEventType, java.lang.String str, boolean z, CloudBackupEventCode cloudBackupEventCode, int i, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("wallet_type", cloudBackupWalletType.getAttrName(), true);
        EventParamsList.put$default(eventParamsList, "backup_type", cloudBackupEventType.getAttrName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "address_info", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "account_id", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "memory_space", "", false, 4, null);
        eventParamsList.put("result", z ? "success" : EopTrackEvent.KEY_RESULT_FAILED, true);
        EventParamsList.put$default(eventParamsList, "wallet_count", java.lang.String.valueOf(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt().size()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "code", java.lang.String.valueOf(cloudBackupEventCode.getCode()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "cloud_type", java.lang.String.valueOf(i), false, 4, null);
        EventParamsList.put$default(eventParamsList, "message", str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
