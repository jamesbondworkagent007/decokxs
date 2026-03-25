package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import com.okinc.okimcore.model.other.QRCodeResultInfo;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sNF {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super ActionBar> continuation);

    Flow<java.lang.Integer> AEQbTJ();

    void AEQbTJ(@NotNull java.lang.String str, InterfaceC44197sGx interfaceC44197sGx);

    java.lang.Object AYXKKw(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object AhwBna(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, DraftMessageModel draftMessageModel, @NotNull Continuation<? super Dialog> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super QRCodeResultInfo> continuation);

    java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.lang.Integer> continuation);

    Flow<java.lang.Integer> EZpvd(boolean z, @NotNull java.util.List<? extends InHouseIMChannelType> list);

    boolean EZpvd(@NotNull AnnouncementBanner announcementBanner);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super StateListAnimator> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    Flow<java.lang.Integer> KWHzl();

    long OLrzqt();

    java.lang.Object OLrzqt(@NotNull OKConversation oKConversation, boolean z, @NotNull Continuation<? super Application> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super AnnouncementBanner> continuation);

    Flow<java.lang.Integer> OLrzqt(@NotNull java.lang.String str);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super QRCodeResultInfo> continuation);

    Flow<java.lang.Integer> copydefault();

    Flow<java.lang.Integer> copydefault(boolean z);

    void copydefault(@NotNull AnnouncementBanner announcementBanner);

    void copydefault(@NotNull java.lang.String str, sGC sgc);

    java.lang.Object gEmmrt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.sNF$Application$Application, reason: collision with other inner class name */
        public static final class C0941Application extends Application {
            public static final C0941Application AEQbTJ = new C0941Application();

            private C0941Application() {
                super(null);
            }
        }

        private Application() {
        }

        public static final class StateListAnimator extends Application {
            public final java.lang.Throwable AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.KWHzl(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new StateListAnimator(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.AEQbTJ, ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(throwable=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = th;
            }
        }
    }

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends StateListAnimator {
            public static final Activity KWHzl = new Activity();

            private Activity() {
                super(null);
            }
        }

        private StateListAnimator() {
        }

        public static final class Application extends StateListAnimator {
            public final java.lang.Throwable EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = application.EZpvd;
                }
                return application.AEQbTJ(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Application(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(throwable=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.EZpvd = th;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Activity extends ActionBar {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.sNF$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0939ActionBar extends ActionBar {
            public final java.lang.Throwable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0939ActionBar copy$default(C0939ActionBar c0939ActionBar, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = c0939ActionBar.copydefault;
                }
                return c0939ActionBar.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0939ActionBar copydefault(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new C0939ActionBar(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0939ActionBar) && Intrinsics.EZpvd(this.copydefault, ((C0939ActionBar) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(throwable=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0939ActionBar(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.copydefault = th;
            }
        }
    }

    public static abstract class Dialog {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNF.Dialog.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Dialog(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class TaskDescription extends Dialog {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        private Dialog() {
        }

        public static final class Application extends Dialog {
            public final java.lang.Throwable OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = application.OLrzqt;
                }
                return application.KWHzl(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Application(th);
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
                return "Failure(throwable=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.OLrzqt = th;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.sNF$Activity$Activity, reason: collision with other inner class name */
        public static final class C0940Activity extends Activity {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0940Activity copy$default(C0940Activity c0940Activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0940Activity.AEQbTJ;
                }
                return c0940Activity.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0940Activity OLrzqt(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0940Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0940Activity) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((C0940Activity) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(draftText=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0940Activity(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        private Activity() {
        }

        public static final class StateListAnimator extends Activity {
            public final java.lang.Throwable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.copydefault;
                }
                return stateListAnimator.OLrzqt(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new StateListAnimator(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(throwable=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.copydefault = th;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ActionBar extends TaskDescription {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.EZpvd;
                }
                return actionBar.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((ActionBar) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(draftReferenceSequence=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        private TaskDescription() {
        }

        public static final class Application extends TaskDescription {
            public final java.lang.Throwable EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = application.EZpvd;
                }
                return application.AEQbTJ(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Application(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(throwable=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.EZpvd = th;
            }
        }
    }
}
