package o;

import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43728ruk<T, E> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ruk.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC43728ruk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC43728ruk() {
    }

    /* JADX INFO: renamed from: o.ruk$ActionBar */
    public static final class ActionBar<T> extends AbstractC43728ruk {
        public final T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruk$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = actionBar.copydefault;
            }
            return actionBar.OLrzqt(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar<T> OLrzqt(T t) {
            return new ActionBar<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.copydefault, ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            T t = this.copydefault;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Ok(value=" + this.copydefault + ")";
        }

        public ActionBar(T t) {
            super(null);
            this.copydefault = t;
        }
    }

    /* JADX INFO: renamed from: o.ruk$TaskDescription */
    public static final class TaskDescription<E> extends AbstractC43728ruk {
        public final E copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruk$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = taskDescription.copydefault;
            }
            return taskDescription.OLrzqt(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final E OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription<E> OLrzqt(E e) {
            return new TaskDescription<>(e);
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
            E e = this.copydefault;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(reason=" + this.copydefault + ")";
        }

        public TaskDescription(E e) {
            super(null);
            this.copydefault = e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T copydefault() throws java.lang.Throwable {
        if (this instanceof ActionBar) {
            return (T) ((ActionBar) this).KWHzl();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this instanceof TaskDescription) {
            TaskDescription taskDescription = (TaskDescription) this;
            if (taskDescription.OLrzqt() instanceof ResponseFailedException) {
                if (((ResponseFailedException) taskDescription.OLrzqt()).getCode() != -1) {
                    arrayList.add("code: " + ((ResponseFailedException) taskDescription.OLrzqt()).getCode());
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((java.lang.Throwable) taskDescription.OLrzqt()).getMessage())) {
                    arrayList.add("msg: " + ((java.lang.Throwable) taskDescription.OLrzqt()).getMessage());
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((ResponseFailedException) taskDescription.OLrzqt()).getDetailMsg()) && !Intrinsics.EZpvd((java.lang.Object) ((ResponseFailedException) taskDescription.OLrzqt()).getDetailMsg(), (java.lang.Object) AbstractJsonLexerKt.NULL)) {
                    arrayList.add("detail:" + ((ResponseFailedException) taskDescription.OLrzqt()).getDetailMsg());
                }
            } else {
                arrayList.add("Could not perform network request");
            }
        }
        throw new java.lang.Throwable(CollectionsKt___CollectionsKt.joinToString$default(arrayList, " | ", null, null, 0, null, null, 62, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T AEQbTJ() throws java.lang.Throwable {
        if (this instanceof ActionBar) {
            return (T) ((ActionBar) this).KWHzl();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this instanceof TaskDescription) {
            TaskDescription taskDescription = (TaskDescription) this;
            if ((taskDescription.OLrzqt() instanceof ResponseFailedException) && C33129mqd.OLrzqt((java.lang.CharSequence) ((java.lang.Throwable) taskDescription.OLrzqt()).getMessage())) {
                sb.append(((java.lang.Throwable) taskDescription.OLrzqt()).getMessage());
            } else {
                sb.append("");
            }
        }
        throw new java.lang.Throwable(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T KWHzl(@NotNull java.lang.String str) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        if (this instanceof ActionBar) {
            return (T) ((ActionBar) this).KWHzl();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this instanceof TaskDescription) {
            TaskDescription taskDescription = (TaskDescription) this;
            if ((taskDescription.OLrzqt() instanceof ResponseFailedException) && C33129mqd.OLrzqt((java.lang.CharSequence) ((java.lang.Throwable) taskDescription.OLrzqt()).getMessage())) {
                pUU.KWHzl("FileUpload", "getOrThrowWithErrorMsg = ResponseFailedException");
                if (((ResponseFailedException) taskDescription.OLrzqt()).getCode() < 0) {
                    sb.append(str);
                } else {
                    sb.append(((java.lang.Throwable) taskDescription.OLrzqt()).getMessage());
                }
            } else {
                pUU.KWHzl("FileUpload", "getOrThrowWithErrorMsg = other");
                sb.append(str);
            }
        }
        throw new java.lang.Throwable(sb.toString());
    }
}
