package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pSH {
    java.lang.CharSequence getText(@NotNull java.lang.String str, java.lang.CharSequence charSequence);

    public static final class ActionBar {
        public static java.lang.CharSequence KWHzl(@NotNull pSH psh, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return psh.getText(str, null);
        }
    }
}
