package o;

import com.okinc.debugbox.track.model.EventData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mNX implements InterfaceC32938mmy {
    public final mNU<EventData> AEQbTJ;

    public mNX(@NotNull mNU<EventData> mnu) {
        Intrinsics.checkNotNullParameter(mnu, "");
        this.AEQbTJ = mnu;
    }

    @Override // o.InterfaceC32938mmy
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ.KWHzl(new EventData(str, str2, 2, str3, map));
    }

    @Override // o.InterfaceC32938mmy
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ.KWHzl(new EventData(str, str2, 0, str3, map));
    }

    @Override // o.InterfaceC32938mmy
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ.KWHzl(new EventData(str, str2, 1, str3, map));
    }
}
