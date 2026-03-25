package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58148yvn implements InterfaceC58147yvm {
    public final java.lang.String AEQbTJ;

    public C58148yvn(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    @Override // o.InterfaceC58147yvm
    public Request KWHzl() {
        return new Request.Builder().url(this.AEQbTJ).build();
    }
}
