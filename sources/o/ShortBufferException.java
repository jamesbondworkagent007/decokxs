package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ShortBufferException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ShortBufferException {
    public static final Activity AEQbTJ = new Activity(null);
    public final PackageInstallObserver EZpvd;
    public final PackageInstallObserver KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ShortBufferException$TaskDescription) A[MD:(o.ShortBufferException$TaskDescription):void (m)] call: o.ShortBufferException.<init>(o.ShortBufferException$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ShortBufferException(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PackageInstallObserver OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PackageInstallObserver copydefault() {
        return this.KWHzl;
    }

    public ShortBufferException(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.AEQbTJ();
        this.KWHzl = taskDescription.EZpvd();
        this.copydefault = taskDescription.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ShortBufferException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminLinkProviderForUserRequest(");
        sb.append("destinationUser=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("sourceUser=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        PackageInstallObserver packageInstallObserver = this.EZpvd;
        int iHashCode = packageInstallObserver != null ? packageInstallObserver.hashCode() : 0;
        PackageInstallObserver packageInstallObserver2 = this.KWHzl;
        int iHashCode2 = packageInstallObserver2 != null ? packageInstallObserver2.hashCode() : 0;
        java.lang.String str = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ShortBufferException.class != obj.getClass()) {
            return false;
        }
        ShortBufferException shortBufferException = (ShortBufferException) obj;
        return Intrinsics.EZpvd(this.EZpvd, shortBufferException.EZpvd) && Intrinsics.EZpvd(this.KWHzl, shortBufferException.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) shortBufferException.copydefault);
    }

    public static /* synthetic */ ShortBufferException copy$default(ShortBufferException shortBufferException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminLinkProviderForUserRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ShortBufferException.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ShortBufferException.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(shortBufferException);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public java.lang.String KWHzl;
        public PackageInstallObserver OLrzqt;
        public PackageInstallObserver copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PackageInstallObserver AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PackageInstallObserver EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ShortBufferException shortBufferException) {
            this();
            Intrinsics.checkNotNullParameter(shortBufferException, "");
            this.copydefault = shortBufferException.OLrzqt();
            this.OLrzqt = shortBufferException.copydefault();
            this.KWHzl = shortBufferException.EZpvd();
        }

        public final ShortBufferException OLrzqt() {
            return new ShortBufferException(this, null);
        }
    }
}
