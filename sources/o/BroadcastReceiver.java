package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AssistContent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BroadcastReceiver<RowType> extends AssistContent<RowType> {
    public final java.lang.String AEQbTJ;
    public final java.lang.String[] AhwBna;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final PackageManager copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiver(int i, @NotNull java.lang.String[] strArr, @NotNull PackageManager packageManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super AssetManager, ? extends RowType> function1) {
        super(function1);
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = i;
        this.AhwBna = strArr;
        this.copydefault = packageManager;
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
    }

    @Override // o.PictureInPictureParams
    public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return this.copydefault.OLrzqt(java.lang.Integer.valueOf(this.EZpvd), this.AEQbTJ, function1, 0, null);
    }

    public java.lang.String toString() {
        return this.KWHzl + AbstractJsonLexerKt.COLON + this.OLrzqt;
    }

    @Override // o.AssistContent
    public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        PackageManager packageManager = this.copydefault;
        java.lang.String[] strArr = this.AhwBna;
        packageManager.AEQbTJ((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), taskDescription);
    }

    @Override // o.AssistContent
    public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        PackageManager packageManager = this.copydefault;
        java.lang.String[] strArr = this.AhwBna;
        packageManager.OLrzqt((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length), taskDescription);
    }
}
