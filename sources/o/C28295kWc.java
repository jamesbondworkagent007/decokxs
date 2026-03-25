package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28295kWc {
    public final InterfaceC28284kVs KWHzl;

    @yCM
    public C28295kWc(@NotNull InterfaceC28284kVs interfaceC28284kVs) {
        Intrinsics.checkNotNullParameter(interfaceC28284kVs, "");
        this.KWHzl = interfaceC28284kVs;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl.EZpvd(str, str2, str3);
    }

    public final Flow<java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.KWHzl.EZpvd(str, str2);
    }
}
