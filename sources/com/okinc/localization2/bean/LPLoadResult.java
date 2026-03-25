package com.okinc.localization2.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LPLoadResult {
    public static final int $stable = 0;
    private final LanguageUnit unit;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.localization2.bean.LanguageUnit) A[MD:(com.okinc.localization2.bean.LanguageUnit):void (m)] call: com.okinc.localization2.bean.LPLoadResult.<init>(com.okinc.localization2.bean.LanguageUnit):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LPLoadResult(LanguageUnit languageUnit, DefaultConstructorMarker defaultConstructorMarker) {
        this(languageUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LanguageUnit getUnit() {
        return this.unit;
    }

    public static final class Activity extends LPLoadResult {
        public final FallBackType AEQbTJ;
        public final LanguageUnit KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, LanguageUnit languageUnit, FallBackType fallBackType, int i, Object obj) {
            if ((i & 1) != 0) {
                languageUnit = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                fallBackType = activity.AEQbTJ;
            }
            return activity.copydefault(languageUnit, fallBackType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull LanguageUnit languageUnit, @NotNull FallBackType fallBackType) {
            Intrinsics.checkNotNullParameter(languageUnit, "");
            Intrinsics.checkNotNullParameter(fallBackType, "");
            return new Activity(languageUnit, fallBackType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.AEQbTJ == activity.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.localization2.bean.LPLoadResult
        public LanguageUnit getUnit() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Latest(unit=" + this.KWHzl + ", type=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull LanguageUnit languageUnit, @NotNull FallBackType fallBackType) {
            super(languageUnit, null);
            Intrinsics.checkNotNullParameter(languageUnit, "");
            Intrinsics.checkNotNullParameter(fallBackType, "");
            this.KWHzl = languageUnit;
            this.AEQbTJ = fallBackType;
        }
    }

    private LPLoadResult(LanguageUnit languageUnit) {
        this.unit = languageUnit;
    }

    public static final class TaskDescription extends LPLoadResult {
        public final FallBackType EZpvd;
        public final LanguageUnit copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, LanguageUnit languageUnit, FallBackType fallBackType, int i, Object obj) {
            if ((i & 1) != 0) {
                languageUnit = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                fallBackType = taskDescription.EZpvd;
            }
            return taskDescription.EZpvd(languageUnit, fallBackType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull LanguageUnit languageUnit, @NotNull FallBackType fallBackType) {
            Intrinsics.checkNotNullParameter(languageUnit, "");
            Intrinsics.checkNotNullParameter(fallBackType, "");
            return new TaskDescription(languageUnit, fallBackType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.localization2.bean.LPLoadResult
        public LanguageUnit getUnit() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Success(unit=" + this.copydefault + ", type=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull LanguageUnit languageUnit, @NotNull FallBackType fallBackType) {
            super(languageUnit, null);
            Intrinsics.checkNotNullParameter(languageUnit, "");
            Intrinsics.checkNotNullParameter(fallBackType, "");
            this.copydefault = languageUnit;
            this.EZpvd = fallBackType;
        }
    }

    public static final class Application extends LPLoadResult {
        public final LanguageUnit KWHzl;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, LanguageUnit languageUnit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                languageUnit = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str = application.copydefault;
            }
            return application.OLrzqt(languageUnit, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull LanguageUnit languageUnit, @NotNull String str) {
            Intrinsics.checkNotNullParameter(languageUnit, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(languageUnit, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.localization2.bean.LPLoadResult
        public LanguageUnit getUnit() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Error(unit=" + this.KWHzl + ", message=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull LanguageUnit languageUnit, @NotNull String str) {
            super(languageUnit, null);
            Intrinsics.checkNotNullParameter(languageUnit, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = languageUnit;
            this.copydefault = str;
        }
    }
}
