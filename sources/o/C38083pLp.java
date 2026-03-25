package o;

import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38083pLp implements InterfaceC38084pLq {
    public final InterfaceC38081pLn OLrzqt;
    public final InterfaceC38065pKy copydefault;

    @yCM
    public C38083pLp(@NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38065pKy interfaceC38065pKy) {
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38065pKy, "");
        this.OLrzqt = interfaceC38081pLn;
        this.copydefault = interfaceC38065pKy;
    }

    @Override // o.InterfaceC38084pLq
    public void KWHzl() {
        this.copydefault.OLrzqt("LinkManager_Lifecycle_AppOpen_Success", this.OLrzqt.KWHzl());
    }

    @Override // o.InterfaceC38084pLq
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC38065pKy interfaceC38065pKy = this.copydefault;
        EventParamsList eventParamsListKWHzl = this.OLrzqt.KWHzl();
        EventParamsList.put$default(eventParamsListKWHzl, "deeplink", str, false, 4, null);
        EventParamsList.put$default(eventParamsListKWHzl, "status", str2, false, 4, null);
        Unit unit = Unit.INSTANCE;
        interfaceC38065pKy.OLrzqt("LinkManager_Lifecycle_ShortCode_Status", eventParamsListKWHzl);
    }

    @Override // o.InterfaceC38084pLq
    public void EZpvd() {
        this.copydefault.OLrzqt("LinkManager_Lifecycle_AllLink_Status", this.OLrzqt.KWHzl());
    }

    @Override // o.InterfaceC38084pLq
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC38065pKy interfaceC38065pKy = this.copydefault;
        EventParamsList eventParamsListKWHzl = this.OLrzqt.KWHzl();
        EventParamsList.put$default(eventParamsListKWHzl, "link", str, false, 4, null);
        EventParamsList.put$default(eventParamsListKWHzl, "deeplink", str2, false, 4, null);
        Unit unit = Unit.INSTANCE;
        interfaceC38065pKy.OLrzqt("LinkManager_Lifecycle_LegacyDeeplink_View", eventParamsListKWHzl);
    }

    @Override // o.InterfaceC38084pLq
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC38065pKy interfaceC38065pKy = this.copydefault;
        EventParamsList eventParamsListKWHzl = this.OLrzqt.KWHzl();
        EventParamsList.put$default(eventParamsListKWHzl, "short_code", str, false, 4, null);
        Unit unit = Unit.INSTANCE;
        interfaceC38065pKy.OLrzqt("LinkManager_Lifecycle_RedirectShortCodeLink_View", eventParamsListKWHzl);
    }

    @Override // o.InterfaceC38084pLq
    public void copydefault() {
        this.copydefault.OLrzqt("LinkManager_Lifecycle_OpenInApp_Click", this.OLrzqt.KWHzl());
    }
}
