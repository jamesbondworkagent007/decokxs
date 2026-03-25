package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28138kQh implements InterfaceC28136kQf {
    @yCM
    public C28138kQh() {
    }

    @Override // o.InterfaceC28136kQf
    public void copydefault(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C31148loZ.KWHzl(context, str, str2, str3, str4, str5, str6, function2);
    }
}
