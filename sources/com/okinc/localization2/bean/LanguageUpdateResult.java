package com.okinc.localization2.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LanguageUpdateResult {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.LanguageUpdateResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LanguageUpdateResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LanguageUpdateResult() {
    }

    public static final class TaskDescription extends LanguageUpdateResult {
        public static final TaskDescription OLrzqt = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LanguageUpdateResult.Latest";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Application extends LanguageUpdateResult {
        public static final Application KWHzl = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LanguageUpdateResult.Success";
        }

        private Application() {
            super(null);
        }
    }

    public static final class ActionBar extends LanguageUpdateResult {
        public final String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(message=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}
