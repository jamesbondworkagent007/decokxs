package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NfcBarcode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NfcBarcode {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NfcBarcode$Application) A[MD:(o.NfcBarcode$Application):void (m)] call: o.NfcBarcode.<init>(o.NfcBarcode$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NfcBarcode(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    public NfcBarcode(Application application) {
        this.OLrzqt = application.KWHzl();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NfcBarcode.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeResourcePolicyRequest(");
        sb.append("resourceArn=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NfcBarcode.class == obj.getClass() && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((NfcBarcode) obj).OLrzqt);
    }

    public static /* synthetic */ NfcBarcode copy$default(NfcBarcode nfcBarcode, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DescribeResourcePolicyRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NfcBarcode.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NfcBarcode.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(nfcBarcode);
        function1.invoke(application);
        return application.OLrzqt();
    }

    public static final class Application {
        public java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull NfcBarcode nfcBarcode) {
            this();
            Intrinsics.checkNotNullParameter(nfcBarcode, "");
            this.EZpvd = nfcBarcode.EZpvd();
        }

        public final NfcBarcode OLrzqt() {
            return new NfcBarcode(this, null);
        }
    }
}
