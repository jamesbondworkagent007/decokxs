package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32357mZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C32357mZ {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final C35318nt copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.mZ$Application) A[MD:(o.mZ$Application):void (m)] call: o.mZ.<init>(o.mZ$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C32357mZ(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35318nt copydefault() {
        return this.copydefault;
    }

    public C32357mZ(Application application) {
        this.copydefault = application.KWHzl();
    }

    /* JADX INFO: renamed from: o.mZ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeExpenseRequest(");
        sb.append("document=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C35318nt c35318nt = this.copydefault;
        if (c35318nt != null) {
            return c35318nt.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C32357mZ.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((C32357mZ) obj).copydefault);
    }

    public static /* synthetic */ C32357mZ copy$default(C32357mZ c32357mZ, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AnalyzeExpenseRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C32357mZ.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C32357mZ.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c32357mZ);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.mZ$Application */
    public static final class Application {
        public C35318nt AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35318nt KWHzl() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C32357mZ c32357mZ) {
            this();
            Intrinsics.checkNotNullParameter(c32357mZ, "");
            this.AEQbTJ = c32357mZ.copydefault();
        }

        public final C32357mZ OLrzqt() {
            return new C32357mZ(this, null);
        }
    }
}
