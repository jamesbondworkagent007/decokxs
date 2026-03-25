package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JR implements MR {
    public final android.content.SharedPreferences AEQbTJ;

    public JR(@NotNull android.content.SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.AEQbTJ = sharedPreferences;
    }

    @Override // o.MR
    public long AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.getLong(str, j);
    }

    @Override // o.MR
    public boolean KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.edit().putLong(str, j).commit();
    }

    @Override // o.MR
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.edit().remove(str).commit();
    }
}
