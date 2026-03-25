package app.cash.sqldelight.driver.android;

import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidQuery$bindDouble$1 extends Lambda implements Function1<SupportSQLiteProgram, Unit> {
    final /* synthetic */ Double $double;
    final /* synthetic */ int $index;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidQuery$bindDouble$1(Double d, int i) {
        super(1);
        this.$double = d;
        this.$index = i;
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
        Double d = this.$double;
        if (d == null) {
            supportSQLiteProgram.bindNull(this.$index + 1);
        } else {
            supportSQLiteProgram.bindDouble(this.$index + 1, d.doubleValue());
        }
    }
}
