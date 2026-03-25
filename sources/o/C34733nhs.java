package o;

import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DialogInterfaceOnCancelListenerC34724nhj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34733nhs {
    public static Application EZpvd;
    public static StateListAnimator OLrzqt;
    public final android.content.Context AEQbTJ;
    public final boolean AYXKKw;
    public final long AhwBna;
    public final java.lang.String djBIcL;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static TaskDescription copydefault = new Activity();

    /* JADX INFO: renamed from: o.nhs$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public interface Application {
        boolean copydefault(@NotNull java.lang.Exception exc);
    }

    /* JADX INFO: renamed from: o.nhs$TaskDescription */
    public interface TaskDescription {
        java.lang.String EZpvd(@NotNull java.lang.Exception exc);
    }

    public C34733nhs(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = context;
        this.djBIcL = str;
        this.AYXKKw = z;
        this.AhwBna = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 android.content.Context)
  (r8v0 java.lang.String)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 long))
 A[MD:(android.content.Context, java.lang.String, boolean, long):void (m)] (LINE:8) call: o.nhs.<init>(android.content.Context, java.lang.String, boolean, long):void type: THIS */
    public /* synthetic */ C34733nhs(android.content.Context context, java.lang.String str, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0L : j);
    }

    public final void AEQbTJ(@NotNull AbstractC34718nhd abstractC34718nhd) {
        Intrinsics.checkNotNullParameter(abstractC34718nhd, "");
        C34729nho.EZpvd(this.djBIcL, abstractC34718nhd, new Function1() { // from class: o.nhr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34733nhs.AEQbTJ(this.KWHzl, (AbstractC34734nhv) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C34733nhs c34733nhs, AbstractC34734nhv abstractC34734nhv) {
        Intrinsics.checkNotNullParameter(abstractC34734nhv, "");
        DialogInterfaceOnCancelListenerC34724nhj.Activity activity = DialogInterfaceOnCancelListenerC34724nhj.Companion;
        activity.EZpvd(abstractC34734nhv);
        activity.OLrzqt(c34733nhs.AEQbTJ, c34733nhs.djBIcL, c34733nhs.AYXKKw, java.lang.Long.valueOf(c34733nhs.AhwBna));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nhs$StateListAnimator */
    public static abstract class StateListAnimator {
        public java.util.List<java.lang.String> KWHzl;

        public final void KWHzl() {
            this.KWHzl = new java.util.ArrayList();
        }

        public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.util.List<java.lang.String> list = this.KWHzl;
            if (list != null) {
                list.add(str2);
            }
        }

        public static /* synthetic */ void w$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            if ((i & 4) != 0) {
                th = null;
            }
            stateListAnimator.AEQbTJ(str, str2, th);
        }

        public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.util.List<java.lang.String> list = this.KWHzl;
            if (list != null) {
                list.add(str2);
            }
        }

        public static /* synthetic */ void e$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i & 4) != 0) {
                th = null;
            }
            stateListAnimator.EZpvd(str, str2, th);
        }

        public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.util.List<java.lang.String> list = this.KWHzl;
            if (list != null) {
                list.add(str2);
            }
        }

        public final java.lang.String copydefault() {
            java.util.List<java.lang.String> list = this.KWHzl;
            if (list != null) {
                return CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o.nhs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nhs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final TaskDescription EZpvd() {
            return C34733nhs.copydefault;
        }

        public final void KWHzl(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            C34733nhs.copydefault = taskDescription;
        }

        public final void AEQbTJ(StateListAnimator stateListAnimator) {
            C34733nhs.OLrzqt = stateListAnimator;
        }

        public final StateListAnimator KWHzl() {
            return C34733nhs.OLrzqt;
        }

        public final Application OLrzqt() {
            return C34733nhs.EZpvd;
        }

        public final void OLrzqt(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            KWHzl(taskDescription);
        }

        public final void EZpvd(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            AEQbTJ(stateListAnimator);
        }

        public final boolean EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C34729nho.copydefault().contains(str);
        }

        public final boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            java.util.Set<java.lang.String> setKWHzl;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC8075avr interfaceC8075avrEZpvd = C8079avv.EZpvd(context);
            if (interfaceC8075avrEZpvd == null || (setKWHzl = interfaceC8075avrEZpvd.KWHzl()) == null) {
                return false;
            }
            return setKWHzl.contains(str);
        }
    }

    /* JADX INFO: renamed from: o.nhs$Activity */
    public static final class Activity implements TaskDescription {
        @Override // o.C34733nhs.TaskDescription
        public java.lang.String EZpvd(java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            java.lang.String message = exc.getMessage();
            return message == null ? "" : message;
        }
    }
}
