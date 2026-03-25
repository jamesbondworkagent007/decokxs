package o;

import com.okinc.im.utils.UiText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC37253oqO {
    public final UiText OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.im.utils.UiText) A[MD:(com.okinc.im.utils.UiText):void (m)] call: o.oqO.<init>(com.okinc.im.utils.UiText):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC37253oqO(UiText uiText, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiText KWHzl() {
        return this.OLrzqt;
    }

    public AbstractC37253oqO(UiText uiText) {
        this.OLrzqt = uiText;
    }

    /* JADX INFO: renamed from: o.oqO$TaskDescription */
    public static final class TaskDescription extends AbstractC37253oqO {
        public final UiText copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, UiText uiText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiText = taskDescription.copydefault;
            }
            return taskDescription.EZpvd(uiText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull UiText uiText) {
            Intrinsics.checkNotNullParameter(uiText, "");
            return new TaskDescription(uiText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Friend(_uiText=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:com.okinc.im.utils.UiText:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.im.utils.UiText:0x000a: CONSTRUCTOR 
  (wrap:int:0x0006: SGET  A[WRAPPED] o.nuc.LoaderManager.sCB int)
  (null java.util.Map)
  (2 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(int, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:8) call: com.okinc.im.utils.UiText.StringResource.<init>(int, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 com.okinc.im.utils.UiText))
 A[MD:(com.okinc.im.utils.UiText):void (m)] (LINE:7) call: o.oqO.TaskDescription.<init>(com.okinc.im.utils.UiText):void type: THIS */
        public /* synthetic */ TaskDescription(UiText uiText, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new UiText.StringResource(C35399nuc.LoaderManager.sCB, null, 2, null) : uiText);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull UiText uiText) {
            super(uiText, null);
            Intrinsics.checkNotNullParameter(uiText, "");
            this.copydefault = uiText;
        }
    }

    /* JADX INFO: renamed from: o.oqO$StateListAnimator */
    public static final class StateListAnimator extends AbstractC37253oqO {
        public final UiText KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, UiText uiText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiText = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(uiText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull UiText uiText) {
            Intrinsics.checkNotNullParameter(uiText, "");
            return new StateListAnimator(uiText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PhoneContact(_uiText=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:com.okinc.im.utils.UiText:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.im.utils.UiText:0x000a: CONSTRUCTOR 
  (wrap:int:0x0006: SGET  A[WRAPPED] o.nuc.LoaderManager.fcfzuX int)
  (null java.util.Map)
  (2 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(int, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:12) call: com.okinc.im.utils.UiText.StringResource.<init>(int, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 com.okinc.im.utils.UiText))
 A[MD:(com.okinc.im.utils.UiText):void (m)] (LINE:11) call: o.oqO.StateListAnimator.<init>(com.okinc.im.utils.UiText):void type: THIS */
        public /* synthetic */ StateListAnimator(UiText uiText, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new UiText.StringResource(C35399nuc.LoaderManager.fcfzuX, null, 2, null) : uiText);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull UiText uiText) {
            super(uiText, null);
            Intrinsics.checkNotNullParameter(uiText, "");
            this.KWHzl = uiText;
        }
    }

    /* JADX INFO: renamed from: o.oqO$Application */
    public static final class Application extends AbstractC37253oqO {
        public final UiText KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, UiText uiText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiText = application.KWHzl;
            }
            return application.copydefault(uiText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull UiText uiText) {
            Intrinsics.checkNotNullParameter(uiText, "");
            return new Application(uiText);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.KWHzl, ((Application) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "VipManager(_uiText=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull UiText uiText) {
            super(uiText, null);
            Intrinsics.checkNotNullParameter(uiText, "");
            this.KWHzl = uiText;
        }
    }
}
