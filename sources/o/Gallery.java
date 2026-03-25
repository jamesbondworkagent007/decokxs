package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class Gallery {
    public static final Activity copydefault = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Gallery$TaskDescription) A[MD:(o.Gallery$TaskDescription):void (m)] call: o.Gallery.<init>(o.Gallery$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Gallery(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    public Gallery(TaskDescription taskDescription) {
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Gallery.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DeleteStreamProcessorResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(Gallery.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Gallery.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class TaskDescription {
        public final TaskDescription AEQbTJ() {
            return this;
        }

        public final Gallery copydefault() {
            return new Gallery(this, null);
        }
    }
}
