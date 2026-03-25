package o;

import android.icu.text.MessageFormat;
import com.okinc.localization2.bean.LanguagePackType;
import com.okinc.localization2.bean.LanguageUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pTE {
    public static final TaskDescription Companion = TaskDescription.EZpvd;

    long AEQbTJ(@NotNull LanguageUnit languageUnit);

    long KWHzl(@NotNull LanguageUnit languageUnit);

    java.lang.Object KWHzl(@NotNull java.io.File file, @NotNull LanguageUnit languageUnit, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull pSI psi, @NotNull LanguageUnit languageUnit, @NotNull LanguagePackType languagePackType, @NotNull Continuation<? super java.lang.Boolean> continuation);

    boolean copydefault(@NotNull LanguageUnit languageUnit, boolean z);

    public static final class Activity {
        public static boolean AEQbTJ(@NotNull pTE pte, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            try {
                java.util.Set<java.lang.String> argumentNames = new MessageFormat(str2).getArgumentNames();
                if (argumentNames != null) {
                    if (argumentNames.size() > 0) {
                        return true;
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.KWHzl("LPResolver", "isValidMessageFormat failed.key:" + str + ", input:" + str2 + ". e:" + e);
            }
            return false;
        }
    }

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }
}
