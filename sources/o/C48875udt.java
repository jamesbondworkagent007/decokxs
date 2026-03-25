package o;

import java.util.zip.ZipFile;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.udt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48875udt implements InterfaceC48873udr {
    @Override // o.InterfaceC48873udr
    public ZipFile EZpvd(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return new ZipFile(file);
    }
}
