package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC36555odF {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.odF.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC36555odF(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36555odF() {
    }

    /* JADX INFO: renamed from: o.odF$StateListAnimator */
    public static final class StateListAnimator extends AbstractC36555odF {
        public static final int KWHzl = OKConversation.$stable;
        public final OKConversation EZpvd;
        public final IMPageType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, IMPageType iMPageType, OKConversation oKConversation, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                iMPageType = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                oKConversation = stateListAnimator.EZpvd;
            }
            return stateListAnimator.OLrzqt(iMPageType, oKConversation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IMPageType KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull IMPageType iMPageType, @NotNull OKConversation oKConversation) {
            Intrinsics.checkNotNullParameter(iMPageType, "");
            Intrinsics.checkNotNullParameter(oKConversation, "");
            return new StateListAnimator(iMPageType, oKConversation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(pageType=" + this.OLrzqt + ", conversation=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull IMPageType iMPageType, @NotNull OKConversation oKConversation) {
            super(null);
            Intrinsics.checkNotNullParameter(iMPageType, "");
            Intrinsics.checkNotNullParameter(oKConversation, "");
            this.OLrzqt = iMPageType;
            this.EZpvd = oKConversation;
        }
    }

    /* JADX INFO: renamed from: o.odF$TaskDescription */
    public static final class TaskDescription extends AbstractC36555odF {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((TaskDescription) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Fail(errorMessage=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}
