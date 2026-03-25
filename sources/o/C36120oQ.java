package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36120oQ {
    public static final ActionBar OLrzqt = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oQ$Application) A[MD:(o.oQ$Application):void (m)] call: o.oQ.<init>(o.oQ$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36120oQ(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public C36120oQ(Application application) {
    }

    /* JADX INFO: renamed from: o.oQ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "UntagResourceResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(C36120oQ.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36120oQ.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o.oQ$Application */
    public static final class Application {
        public final Application AEQbTJ() {
            return this;
        }

        public final C36120oQ copydefault() {
            return new C36120oQ(this, null);
        }
    }
}
