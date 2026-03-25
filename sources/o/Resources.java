package o;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Resources implements TypedArray {
    public final SupportSQLiteStatement EZpvd;

    public Resources(@NotNull SupportSQLiteStatement supportSQLiteStatement) {
        Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
        this.EZpvd = supportSQLiteStatement;
    }

    @Override // o.Configuration
    public void OLrzqt(int i, java.lang.Long l) {
        if (l == null) {
            this.EZpvd.bindNull(i + 1);
        } else {
            this.EZpvd.bindLong(i + 1, l.longValue());
        }
    }

    @Override // o.Configuration
    public void copydefault(int i, java.lang.String str) {
        if (str == null) {
            this.EZpvd.bindNull(i + 1);
        } else {
            this.EZpvd.bindString(i + 1, str);
        }
    }

    @Override // o.Configuration
    public void OLrzqt(int i, java.lang.Boolean bool) {
        if (bool == null) {
            this.EZpvd.bindNull(i + 1);
        } else {
            this.EZpvd.bindLong(i + 1, bool.booleanValue() ? 1L : 0L);
        }
    }

    @Override // o.TypedArray
    public <R> R AEQbTJ(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o.TypedArray
    public long KWHzl() {
        return this.EZpvd.executeUpdateDelete();
    }

    @Override // o.TypedArray
    public void OLrzqt() throws java.io.IOException {
        this.EZpvd.close();
    }
}
