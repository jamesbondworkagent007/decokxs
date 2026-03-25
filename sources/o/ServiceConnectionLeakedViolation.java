package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ServiceConnectionLeakedViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ServiceConnectionLeakedViolation {
    public static final Application OLrzqt = new Application(null);
    public final CustomViolation AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.util.List<NetworkViolation> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ServiceConnectionLeakedViolation$Activity) A[MD:(o.ServiceConnectionLeakedViolation$Activity):void (m)] call: o.ServiceConnectionLeakedViolation.<init>(o.ServiceConnectionLeakedViolation$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ServiceConnectionLeakedViolation(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomViolation AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NetworkViolation> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public ServiceConnectionLeakedViolation(Activity activity) {
        this.KWHzl = activity.OLrzqt();
        this.AEQbTJ = activity.KWHzl();
        this.copydefault = activity.copydefault();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ServiceConnectionLeakedViolation.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RedactionConfig(");
        sb.append("maskCharacter=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("maskMode=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("piiEntityTypes=");
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
        CustomViolation customViolation = this.AEQbTJ;
        int iHashCode2 = customViolation != null ? customViolation.hashCode() : 0;
        java.util.List<NetworkViolation> list = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ServiceConnectionLeakedViolation.class != obj.getClass()) {
            return false;
        }
        ServiceConnectionLeakedViolation serviceConnectionLeakedViolation = (ServiceConnectionLeakedViolation) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) serviceConnectionLeakedViolation.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, serviceConnectionLeakedViolation.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, serviceConnectionLeakedViolation.copydefault);
    }

    public static /* synthetic */ ServiceConnectionLeakedViolation copy$default(ServiceConnectionLeakedViolation serviceConnectionLeakedViolation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.RedactionConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ServiceConnectionLeakedViolation.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ServiceConnectionLeakedViolation.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(serviceConnectionLeakedViolation);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.util.List<? extends NetworkViolation> EZpvd;
        public CustomViolation copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomViolation KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<? extends NetworkViolation> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(CustomViolation customViolation) {
            this.copydefault = customViolation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.NetworkViolation>, java.util.List<o.NetworkViolation> */
        public final java.util.List<NetworkViolation> copydefault() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ServiceConnectionLeakedViolation serviceConnectionLeakedViolation) {
            this();
            Intrinsics.checkNotNullParameter(serviceConnectionLeakedViolation, "");
            this.AEQbTJ = serviceConnectionLeakedViolation.OLrzqt();
            this.copydefault = serviceConnectionLeakedViolation.AEQbTJ();
            this.EZpvd = serviceConnectionLeakedViolation.KWHzl();
        }

        public final ServiceConnectionLeakedViolation EZpvd() {
            return new ServiceConnectionLeakedViolation(this, null);
        }
    }
}
