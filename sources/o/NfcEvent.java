package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NfcEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NfcEvent {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final FileBridge copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NfcEvent$Application) A[MD:(o.NfcEvent$Application):void (m)] call: o.NfcEvent.<init>(o.NfcEvent$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NfcEvent(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileBridge EZpvd() {
        return this.copydefault;
    }

    public NfcEvent(Application application) {
        this.copydefault = application.EZpvd();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NfcEvent.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeDocumentClassifierResponse(");
        sb.append("documentClassifierProperties=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        FileBridge fileBridge = this.copydefault;
        if (fileBridge != null) {
            return fileBridge.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NfcEvent.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((NfcEvent) obj).copydefault);
    }

    public static /* synthetic */ NfcEvent copy$default(NfcEvent nfcEvent, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DescribeDocumentClassifierResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NfcEvent.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NfcEvent.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(nfcEvent);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    public static final class Application {
        public FileBridge copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(FileBridge fileBridge) {
            this.copydefault = fileBridge;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FileBridge EZpvd() {
            return this.copydefault;
        }

        public final Application copydefault() {
            return this;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull NfcEvent nfcEvent) {
            this();
            Intrinsics.checkNotNullParameter(nfcEvent, "");
            this.copydefault = nfcEvent.EZpvd();
        }

        public final NfcEvent AEQbTJ() {
            return new NfcEvent(this, null);
        }
    }
}
