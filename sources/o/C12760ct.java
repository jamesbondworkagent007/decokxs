package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C12760ct {
    public static final Activity AEQbTJ = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ct$ActionBar) A[MD:(o.ct$ActionBar):void (m)] call: o.ct.<init>(o.ct$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C12760ct(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    public C12760ct(ActionBar actionBar) {
    }

    /* JADX INFO: renamed from: o.ct$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ct.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "UntagResourceResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(C12760ct.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12760ct.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o.ct$ActionBar */
    public static final class ActionBar {
        public final ActionBar copydefault() {
            return this;
        }

        public final C12760ct AEQbTJ() {
            return new C12760ct(this, null);
        }
    }
}
