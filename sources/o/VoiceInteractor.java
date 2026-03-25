package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceInteractor {
    public static final <RowType> AssistContent<RowType> OLrzqt(int i, @NotNull java.lang.String[] strArr, @NotNull PackageManager packageManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super AssetManager, ? extends RowType> function1) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new BroadcastReceiver(i, strArr, packageManager, str, str2, str3, function1);
    }

    public static final <RowType> PictureInPictureParams<RowType> AEQbTJ(int i, @NotNull PackageManager packageManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super AssetManager, ? extends RowType> function1) {
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new TaskStackBuilder(i, packageManager, str, str2, str3, function1);
    }
}
