package o;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.okinc.p2p.api.OtcExtraKeys;

/* JADX INFO: renamed from: o.avp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C8073avp {
    public static SplitInstallSessionState AEQbTJ(InterfaceC8076avs interfaceC8076avs) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(OtcExtraKeys.PARAMS_SESSION_ID, interfaceC8076avs.AhwBna());
        bundle.putInt("status", interfaceC8076avs.AYXKKw());
        bundle.putInt("error_code", interfaceC8076avs.copydefault());
        bundle.putLong("bytes_downloaded", interfaceC8076avs.OLrzqt());
        bundle.putLong("total_bytes_to_download", interfaceC8076avs.gEmmrt());
        bundle.putStringArrayList("module_names", (java.util.ArrayList) interfaceC8076avs.AEQbTJ());
        bundle.putStringArrayList("languages", (java.util.ArrayList) interfaceC8076avs.KWHzl());
        bundle.putParcelable("user_confirmation_intent", interfaceC8076avs.EZpvd());
        return SplitInstallSessionState.zzd(bundle);
    }

    public static InterfaceC8076avs copydefault(SplitInstallSessionState splitInstallSessionState) {
        return C8078avu.EZpvd(splitInstallSessionState.sessionId(), splitInstallSessionState.status(), splitInstallSessionState.errorCode(), splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages(), splitInstallSessionState.resolutionIntent());
    }
}
