package o;

import com.okinc.stub.CheckedSharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49328umV extends android.content.ContextWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49328umV(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.SharedPreferences getSharedPreferences(java.lang.String str, int i) {
        android.content.SharedPreferences sharedPreferences = super.getSharedPreferences(str, i);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return new CheckedSharedPreferences(str, sharedPreferences);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
