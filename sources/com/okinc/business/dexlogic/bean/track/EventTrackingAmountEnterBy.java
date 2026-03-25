package com.okinc.business.dexlogic.bean.track;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class EventTrackingAmountEnterBy {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    private static EventTrackingAmountEnterBy currentAmountBy = Application.KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EventTrackingAmountEnterBy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getName();

    private EventTrackingAmountEnterBy() {
    }

    public static final class Application extends EventTrackingAmountEnterBy {
        public static final Application KWHzl = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy
        public String getName() {
            return "Manual";
        }

        private Application() {
            super(null);
        }
    }

    public static final class TaskDescription extends EventTrackingAmountEnterBy {
        public final String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            return taskDescription.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((TaskDescription) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy
        public String getName() {
            return "Quick_button";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "QuickButton(value=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    public static final class StateListAnimator extends EventTrackingAmountEnterBy {
        public static final StateListAnimator copydefault = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy
        public String getName() {
            return "Slider";
        }

        private StateListAnimator() {
            super(null);
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull EventTrackingAmountEnterBy eventTrackingAmountEnterBy) {
            Intrinsics.checkNotNullParameter(eventTrackingAmountEnterBy, "");
            EventTrackingAmountEnterBy.currentAmountBy = eventTrackingAmountEnterBy;
        }

        public final EventTrackingAmountEnterBy copydefault() {
            return EventTrackingAmountEnterBy.currentAmountBy;
        }

        public final String OLrzqt() {
            EventTrackingAmountEnterBy eventTrackingAmountEnterBy = EventTrackingAmountEnterBy.currentAmountBy;
            if (eventTrackingAmountEnterBy instanceof Application) {
                return "";
            }
            if (eventTrackingAmountEnterBy instanceof TaskDescription) {
                EventTrackingAmountEnterBy eventTrackingAmountEnterBy2 = EventTrackingAmountEnterBy.currentAmountBy;
                Intrinsics.copydefault(eventTrackingAmountEnterBy2, "");
                return ((TaskDescription) eventTrackingAmountEnterBy2).AEQbTJ();
            }
            if (eventTrackingAmountEnterBy instanceof StateListAnimator) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
