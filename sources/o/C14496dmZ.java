package o;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.components.track.bean.EventParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C14496dmZ {
    public static final C14496dmZ OLrzqt = new C14496dmZ();

    private C14496dmZ() {
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.OLrzqt("app_metax_deeplink_Antifraudpopups_show", C56402yEa.EZpvd(new EventParam(RequestParameters.SUBRESOURCE_WEBSITE, str, false)));
    }
}
