package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36228oU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36228oU {
    public static final Application EZpvd = new Application(null);
    public final java.lang.String KWHzl;
    public final java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oU$Activity) A[MD:(o.oU$Activity):void (m)] call: o.oU.<init>(o.oU$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36228oU(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public C36228oU(Activity activity) {
        this.KWHzl = activity.OLrzqt();
        this.copydefault = activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.oU$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UntagResourceRequest(");
        sb.append("resourceArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tagKeys=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List<java.lang.String> list = this.copydefault;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36228oU.class != obj.getClass()) {
            return false;
        }
        C36228oU c36228oU = (C36228oU) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c36228oU.KWHzl) && Intrinsics.EZpvd(this.copydefault, c36228oU.copydefault);
    }

    public static /* synthetic */ C36228oU copy$default(C36228oU c36228oU, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.UntagResourceRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36228oU.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36228oU.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c36228oU);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.oU$Activity */
    public static final class Activity {
        public java.util.List<java.lang.String> KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C36228oU c36228oU) {
            this();
            Intrinsics.checkNotNullParameter(c36228oU, "");
            this.copydefault = c36228oU.copydefault();
            this.KWHzl = c36228oU.KWHzl();
        }

        public final C36228oU KWHzl() {
            return new C36228oU(this, null);
        }
    }
}
