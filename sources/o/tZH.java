package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C46526tXp;
import org.jetbrains.annotations.NotNull;
import uniffi.settings.PreferenceCdKey;

/* JADX INFO: loaded from: classes19.dex */
public final class tZH {

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PreferenceCdKey.values().length];
            try {
                iArr[PreferenceCdKey.PR_ACCOUNT_COMMON_TOAST_LANG_UPDATE_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    public static final int EZpvd(@NotNull PreferenceCdKey preferenceCdKey) {
        Intrinsics.checkNotNullParameter(preferenceCdKey, "");
        if (Activity.copydefault[preferenceCdKey.ordinal()] == 1) {
            return C46526tXp.TaskDescription.AEQbTJ;
        }
        throw new NoWhenBranchMatchedException();
    }
}
