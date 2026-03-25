package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C42591rYn extends C5378Pk {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42591rYn(@NotNull java.lang.String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.C5378Pk
    public final java.lang.String EZpvd() {
        java.lang.String strAhwBna = AhwBna();
        Intrinsics.checkNotNullExpressionValue(strAhwBna, "");
        return copydefault(strAhwBna);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String path = android.net.Uri.parse(str).getPath();
        return path == null ? str : path;
    }
}
