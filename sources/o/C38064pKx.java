package o;

import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pKx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C38064pKx {
    public final InterfaceC38065pKy OLrzqt;

    @yCM
    public C38064pKx(@NotNull InterfaceC38065pKy interfaceC38065pKy) {
        Intrinsics.checkNotNullParameter(interfaceC38065pKy, "");
        this.OLrzqt = interfaceC38065pKy;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC38065pKy interfaceC38065pKy = this.OLrzqt;
        EventParamsList eventParamsList = new EventParamsList();
        EventParamsList.put$default(eventParamsList, "deeplink", str, false, 4, null);
        Unit unit = Unit.INSTANCE;
        interfaceC38065pKy.OLrzqt("H5Web_Comefromh5_Appopen_Success", eventParamsList);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC38065pKy interfaceC38065pKy = this.OLrzqt;
        EventParamsList eventParamsList = new EventParamsList();
        EventParamsList.put$default(eventParamsList, "url", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "deeplink", str2, false, 4, null);
        Unit unit = Unit.INSTANCE;
        interfaceC38065pKy.OLrzqt("H5App_Webview_Interception_Success", eventParamsList);
    }
}
