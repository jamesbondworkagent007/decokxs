package o;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Theme implements SupportSQLiteQuery, TypedArray {
    public final java.lang.String AEQbTJ;
    public final int EZpvd;
    public final java.util.List<Function1<SupportSQLiteProgram, Unit>> KWHzl;
    public final SupportSQLiteDatabase OLrzqt;
    public final java.lang.Long copydefault;

    @Override // o.TypedArray
    public void OLrzqt() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public java.lang.String getSql() {
        return this.AEQbTJ;
    }

    public Theme(@NotNull java.lang.String str, @NotNull SupportSQLiteDatabase supportSQLiteDatabase, int i, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        this.AEQbTJ = str;
        this.OLrzqt = supportSQLiteDatabase;
        this.EZpvd = i;
        this.copydefault = l;
        int argCount = getArgCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(argCount);
        for (int i2 = 0; i2 < argCount; i2++) {
            arrayList.add(null);
        }
        this.KWHzl = arrayList;
    }

    @Override // o.TypedArray
    public /* synthetic */ long KWHzl() {
        return ((java.lang.Number) AEQbTJ()).longValue();
    }

    @Override // o.Configuration
    public void OLrzqt(final int i, final java.lang.Long l) {
        this.KWHzl.set(i, new Function1<SupportSQLiteProgram, Unit>() { // from class: app.cash.sqldelight.driver.android.AndroidQuery$bindLong$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SupportSQLiteProgram supportSQLiteProgram) {
                invoke2(supportSQLiteProgram);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SupportSQLiteProgram supportSQLiteProgram) {
                Intrinsics.checkNotNullParameter(supportSQLiteProgram, "");
                Long l2 = l;
                if (l2 == null) {
                    supportSQLiteProgram.bindNull(i + 1);
                } else {
                    supportSQLiteProgram.bindLong(i + 1, l2.longValue());
                }
            }
        });
    }

    @Override // o.Configuration
    public void copydefault(final int i, final java.lang.String str) {
        this.KWHzl.set(i, new Function1<SupportSQLiteProgram, Unit>() { // from class: app.cash.sqldelight.driver.android.AndroidQuery$bindString$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SupportSQLiteProgram supportSQLiteProgram) {
                invoke2(supportSQLiteProgram);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SupportSQLiteProgram supportSQLiteProgram) {
                Intrinsics.checkNotNullParameter(supportSQLiteProgram, "");
                String str2 = str;
                if (str2 == null) {
                    supportSQLiteProgram.bindNull(i + 1);
                } else {
                    supportSQLiteProgram.bindString(i + 1, str2);
                }
            }
        });
    }

    @Override // o.Configuration
    public void OLrzqt(final int i, final java.lang.Boolean bool) {
        this.KWHzl.set(i, new Function1<SupportSQLiteProgram, Unit>() { // from class: app.cash.sqldelight.driver.android.AndroidQuery$bindBoolean$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SupportSQLiteProgram supportSQLiteProgram) {
                invoke2(supportSQLiteProgram);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SupportSQLiteProgram supportSQLiteProgram) {
                Intrinsics.checkNotNullParameter(supportSQLiteProgram, "");
                Boolean bool2 = bool;
                if (bool2 == null) {
                    supportSQLiteProgram.bindNull(i + 1);
                } else {
                    supportSQLiteProgram.bindLong(i + 1, bool2.booleanValue() ? 1L : 0L);
                }
            }
        });
    }

    public java.lang.Void AEQbTJ() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // o.TypedArray
    public <R> R AEQbTJ(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        android.database.Cursor cursorQuery = this.OLrzqt.query(this);
        try {
            R rCopydefault = function1.invoke(new PackageItemInfo(cursorQuery, this.copydefault)).copydefault();
            yFA.copydefault(cursorQuery, null);
            return rCopydefault;
        } finally {
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@NotNull SupportSQLiteProgram supportSQLiteProgram) {
        Intrinsics.checkNotNullParameter(supportSQLiteProgram, "");
        for (Function1<SupportSQLiteProgram, Unit> function1 : this.KWHzl) {
            Intrinsics.copydefault(function1);
            function1.invoke(supportSQLiteProgram);
        }
    }

    public java.lang.String toString() {
        return getSql();
    }
}
