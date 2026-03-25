package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DatabaseErrorHandler {
    public static final DatabaseErrorHandler copydefault = new DatabaseErrorHandler();

    private DatabaseErrorHandler() {
    }

    public static final void EZpvd(@NotNull android.database.AbstractWindowedCursor abstractWindowedCursor, long j) {
        Intrinsics.checkNotNullParameter(abstractWindowedCursor, "");
        abstractWindowedCursor.setWindow(SQLiteClosable.AEQbTJ(null, j));
    }
}
