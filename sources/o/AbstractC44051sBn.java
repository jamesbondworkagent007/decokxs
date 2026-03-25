package o;

import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC44051sBn {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sBn.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC44051sBn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC44051sBn() {
    }

    /* JADX INFO: renamed from: o.sBn$TaskDescription */
    public static final class TaskDescription extends AbstractC44051sBn {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final double KWHzl;
        public final java.lang.String OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, boolean z, int i, double d, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i2 & 2) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            java.lang.String str3 = str2;
            if ((i2 & 4) != 0) {
                z = taskDescription.AEQbTJ;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                i = taskDescription.copydefault;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                d = taskDescription.KWHzl;
            }
            return taskDescription.KWHzl(str, str3, z2, i3, d);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i, double d) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2, z, i, d);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && this.AEQbTJ == taskDescription.AEQbTJ && this.copydefault == taskDescription.copydefault && java.lang.Double.compare(this.KWHzl, taskDescription.KWHzl) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Double.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SearchIntent(id=" + this.EZpvd + ", suggestedQuery=" + this.OLrzqt + ", confident=" + this.AEQbTJ + ", position=" + this.copydefault + ", score=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i, double d) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.AEQbTJ = z;
            this.copydefault = i;
            this.KWHzl = d;
        }
    }

    /* JADX INFO: renamed from: o.sBn$Activity */
    public static final class Activity extends AbstractC44051sBn {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.EZpvd;
            }
            return activity.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Activity) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SectionHeader(header=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    /* JADX INFO: renamed from: o.sBn$Application */
    public static final class Application extends AbstractC44051sBn {
        public final SearchArticleDisplayModel OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, SearchArticleDisplayModel searchArticleDisplayModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                searchArticleDisplayModel = application.OLrzqt;
            }
            return application.OLrzqt(searchArticleDisplayModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchArticleDisplayModel KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
            Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
            return new Application(searchArticleDisplayModel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.OLrzqt, ((Application) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RecentlyUpdatedArticle(article=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
            super(null);
            Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
            this.OLrzqt = searchArticleDisplayModel;
        }
    }
}
