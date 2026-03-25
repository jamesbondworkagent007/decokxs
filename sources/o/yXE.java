package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes13.dex */
public class yXE {
    public static final yXE EZpvd = new yXE(true);
    public final java.util.Map<ActionBar, GeneratedMessageLite.Activity<?, ?>> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static yXE KWHzl() {
        return EZpvd;
    }

    public static yXE OLrzqt() {
        return new yXE();
    }

    public <ContainingType extends yXQ> GeneratedMessageLite.Activity<ContainingType, ?> KWHzl(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.Activity) this.KWHzl.get(new ActionBar(containingtype, i));
    }

    public final void KWHzl(GeneratedMessageLite.Activity<?, ?> activity) {
        this.KWHzl.put(new ActionBar(activity.AEQbTJ(), activity.copydefault()), activity);
    }

    public yXE() {
        this.KWHzl = new java.util.HashMap();
    }

    public yXE(boolean z) {
        this.KWHzl = Collections.emptyMap();
    }

    public static final class ActionBar {
        public final int EZpvd;
        public final java.lang.Object KWHzl;

        public ActionBar(java.lang.Object obj, int i) {
            this.KWHzl = obj;
            this.EZpvd = i;
        }

        public int hashCode() {
            return (java.lang.System.identityHashCode(this.KWHzl) * 65535) + this.EZpvd;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.KWHzl == actionBar.KWHzl && this.EZpvd == actionBar.EZpvd;
        }
    }
}
