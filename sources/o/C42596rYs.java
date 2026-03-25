package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C42596rYs {
    public final android.content.SharedPreferences EZpvd;

    public C42596rYs(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.EZpvd = sharedPreferences;
    }

    public final long OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.getLong(str, j);
    }

    public final void copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences.Editor editorEdit = this.EZpvd.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }
}
