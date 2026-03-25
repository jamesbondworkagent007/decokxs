package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TaskStackBuilder<RowType> extends PictureInPictureParams<RowType> {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final PackageManager KWHzl;
    public final int OLrzqt;
    public final java.lang.String copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskStackBuilder(int i, @NotNull PackageManager packageManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super AssetManager, ? extends RowType> function1) {
        super(function1);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = i;
        this.KWHzl = packageManager;
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
    }

    @Override // o.PictureInPictureParams
    public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return this.KWHzl.OLrzqt(java.lang.Integer.valueOf(this.OLrzqt), this.AEQbTJ, function1, 0, null);
    }

    public java.lang.String toString() {
        return this.copydefault + AbstractJsonLexerKt.COLON + this.EZpvd;
    }
}
