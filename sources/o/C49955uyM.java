package o;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49955uyM {
    public static final AppCompatActivity copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "");
        return copydefault(baseContext);
    }
}
