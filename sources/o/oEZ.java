package o;

import com.okinc.im.usecase.messagelistmodel.ApplyScrollToEndUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEZ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final oEW KWHzl;

    @yCM
    public oEZ(@NotNull oEW oew) {
        Intrinsics.checkNotNullParameter(oew, "");
        this.KWHzl = oew;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        ApplyScrollToEndUseCase$execute$1 applyScrollToEndUseCase$execute$1;
        if (continuation instanceof ApplyScrollToEndUseCase$execute$1) {
            applyScrollToEndUseCase$execute$1 = (ApplyScrollToEndUseCase$execute$1) continuation;
            int i = applyScrollToEndUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyScrollToEndUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                applyScrollToEndUseCase$execute$1 = new ApplyScrollToEndUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = applyScrollToEndUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyScrollToEndUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (!c36558odI.KWHzl()) {
                pUU.KWHzl("CheckScrollToEndUseCase", "No newer message, just scroll to bottom");
                return new Activity(false, c36558odI);
            }
            oEW oew = this.KWHzl;
            applyScrollToEndUseCase$execute$1.label = 1;
            objEZpvd = oew.EZpvd(c36558odI, applyScrollToEndUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return new Activity(true, (C36558odI) objEZpvd);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public final C36558odI KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, boolean z, C36558odI c36558odI, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                c36558odI = activity.KWHzl;
            }
            return activity.EZpvd(z, c36558odI);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(boolean z, @NotNull C36558odI c36558odI) {
            Intrinsics.checkNotNullParameter(c36558odI, "");
            return new Activity(z, c36558odI);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36558odI OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ApplyScrollToEndResult(isMessageListModelUpdated=" + this.OLrzqt + ", model=" + this.KWHzl + ")";
        }

        public Activity(boolean z, @NotNull C36558odI c36558odI) {
            Intrinsics.checkNotNullParameter(c36558odI, "");
            this.OLrzqt = z;
            this.KWHzl = c36558odI;
        }
    }
}
