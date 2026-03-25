package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class BlockedNumberContract {
    public static final ActionBar copydefault = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BlockedNumberContract$Application) A[MD:(o.BlockedNumberContract$Application):void (m)] call: o.BlockedNumberContract.<init>(o.BlockedNumberContract$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BlockedNumberContract(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public BlockedNumberContract(Application application) {
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BlockedNumberContract.ActionBar.<init>():void type: THIS */
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
        return C56524yIo.AEQbTJ(BlockedNumberContract.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BlockedNumberContract.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Application {
        public final Application OLrzqt() {
            return this;
        }

        public final BlockedNumberContract copydefault() {
            return new BlockedNumberContract(this, null);
        }
    }
}
