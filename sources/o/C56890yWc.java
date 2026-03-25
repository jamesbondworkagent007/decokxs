package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import o.AbstractC56919yXe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56890yWc {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.yWc.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C56890yWc(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C56890yWc) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C56890yWc) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MemberSignature(signature=" + this.EZpvd + ')';
    }

    /* JADX INFO: renamed from: o.yWc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yWc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C56890yWc KWHzl(@NotNull yWS yws, @NotNull JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            Intrinsics.checkNotNullParameter(yws, "");
            Intrinsics.checkNotNullParameter(jvmMethodSignature, "");
            return AEQbTJ(yws.KWHzl(jvmMethodSignature.getName()), yws.KWHzl(jvmMethodSignature.getDesc()));
        }

        public final C56890yWc AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new C56890yWc(str + str2, null);
        }

        public final C56890yWc OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new C56890yWc(str + '#' + str2, null);
        }

        public final C56890yWc AEQbTJ(@NotNull AbstractC56919yXe abstractC56919yXe) {
            Intrinsics.checkNotNullParameter(abstractC56919yXe, "");
            if (abstractC56919yXe instanceof AbstractC56919yXe.TaskDescription) {
                AbstractC56919yXe.TaskDescription taskDescription = (AbstractC56919yXe.TaskDescription) abstractC56919yXe;
                return AEQbTJ(taskDescription.KWHzl(), taskDescription.AEQbTJ());
            }
            if (!(abstractC56919yXe instanceof AbstractC56919yXe.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC56919yXe.Activity activity = (AbstractC56919yXe.Activity) abstractC56919yXe;
            return OLrzqt(activity.AEQbTJ(), activity.OLrzqt());
        }

        public final C56890yWc copydefault(@NotNull C56890yWc c56890yWc, int i) {
            Intrinsics.checkNotNullParameter(c56890yWc, "");
            return new C56890yWc(c56890yWc.EZpvd() + '@' + i, null);
        }
    }

    public C56890yWc(java.lang.String str) {
        this.EZpvd = str;
    }
}
