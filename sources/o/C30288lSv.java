package o;

import com.okinc.buysell.api.BSCEntranceParameters;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.data.BSCResultButtonActionType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lSv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C30288lSv {
    public static final C30288lSv AEQbTJ = new C30288lSv();

    private C30288lSv() {
    }

    public final void copydefault(BSCResultButtonActionType bSCResultButtonActionType, @NotNull java.lang.String str, boolean z, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.EZpvd(bSCResultButtonActionType, BSCResultButtonActionType.Dismiss.copydefault) || Intrinsics.EZpvd(bSCResultButtonActionType, BSCResultButtonActionType.ConvertSuccessDismissButtonBuySell.copydefault) || Intrinsics.EZpvd(bSCResultButtonActionType, BSCResultButtonActionType.TryAgain.EZpvd)) {
            if (z) {
                ((InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class)).EZpvd(context, new BSCEntranceParameters(BSCTargetTab.CONVERT, null, null, null, null, null, str, null, null, null, false, null, null, null, null, false, 65470, null), true);
                return;
            } else {
                ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AEQbTJ(context, BSCTargetTab.CONVERT);
                return;
            }
        }
        if (Intrinsics.EZpvd(bSCResultButtonActionType, BSCResultButtonActionType.GoToAsset.copydefault)) {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("path", "main/account");
                ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(activityAEQbTJ, bundle);
                return;
            }
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("path", "main/home");
        ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(context, bundle2);
    }
}
