package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35371nu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35371nu {
    public static final Application copydefault = new Application(null);
    public final C35318nt AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nu$Activity) A[MD:(o.nu$Activity):void (m)] call: o.nu.<init>(o.nu$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35371nu(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35318nt copydefault() {
        return this.AEQbTJ;
    }

    public C35371nu(Activity activity) {
        this.AEQbTJ = activity.copydefault();
    }

    /* JADX INFO: renamed from: o.nu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectDocumentTextRequest(");
        sb.append("document=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C35318nt c35318nt = this.AEQbTJ;
        if (c35318nt != null) {
            return c35318nt.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C35371nu.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((C35371nu) obj).AEQbTJ);
    }

    public static /* synthetic */ C35371nu copy$default(C35371nu c35371nu, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.DetectDocumentTextRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35371nu.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35371nu.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c35371nu);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.nu$Activity */
    public static final class Activity {
        public C35318nt AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35318nt copydefault() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C35371nu c35371nu) {
            this();
            Intrinsics.checkNotNullParameter(c35371nu, "");
            this.AEQbTJ = c35371nu.copydefault();
        }

        public final C35371nu AEQbTJ() {
            return new C35371nu(this, null);
        }
    }
}
