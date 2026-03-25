package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RestoreSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class RestoreSet {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final ContextImpl AEQbTJ;
    public final java.lang.String AhwBna;
    public final C5173Hn KWHzl;
    public final java.lang.String OLrzqt;
    public final C5173Hn copydefault;
    public final DeviceAdminReceiver gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RestoreSet$Activity) A[MD:(o.RestoreSet$Activity):void (m)] call: o.RestoreSet.<init>(o.RestoreSet$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RestoreSet(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextImpl EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceAdminReceiver djBIcL() {
        return this.gEmmrt;
    }

    public RestoreSet(Activity activity) {
        this.KWHzl = activity.copydefault();
        this.OLrzqt = activity.OLrzqt();
        this.AEQbTJ = activity.KWHzl();
        this.copydefault = activity.gEmmrt();
        this.AhwBna = activity.djBIcL();
        this.gEmmrt = activity.AYXKKw();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RestoreSet.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UserPoolDescriptionType(");
        sb.append("creationDate=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("id=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("lambdaConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("lastModifiedDate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        ContextImpl contextImpl = this.AEQbTJ;
        int iHashCode3 = contextImpl != null ? contextImpl.hashCode() : 0;
        C5173Hn c5173Hn2 = this.copydefault;
        int iHashCode4 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        DeviceAdminReceiver deviceAdminReceiver = this.gEmmrt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (deviceAdminReceiver != null ? deviceAdminReceiver.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RestoreSet.class != obj.getClass()) {
            return false;
        }
        RestoreSet restoreSet = (RestoreSet) obj;
        return Intrinsics.EZpvd(this.KWHzl, restoreSet.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) restoreSet.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, restoreSet.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, restoreSet.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) restoreSet.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, restoreSet.gEmmrt);
    }

    public static /* synthetic */ RestoreSet copy$default(RestoreSet restoreSet, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolDescriptionType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RestoreSet.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RestoreSet.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(restoreSet);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public ContextImpl AEQbTJ;
        public DeviceAdminReceiver AhwBna;
        public C5173Hn EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public C5173Hn copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceAdminReceiver AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContextImpl KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(ContextImpl contextImpl) {
            this.AEQbTJ = contextImpl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(DeviceAdminReceiver deviceAdminReceiver) {
            this.AhwBna = deviceAdminReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn gEmmrt() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull RestoreSet restoreSet) {
            this();
            Intrinsics.checkNotNullParameter(restoreSet, "");
            this.copydefault = restoreSet.copydefault();
            this.OLrzqt = restoreSet.OLrzqt();
            this.AEQbTJ = restoreSet.EZpvd();
            this.EZpvd = restoreSet.KWHzl();
            this.KWHzl = restoreSet.AEQbTJ();
            this.AhwBna = restoreSet.djBIcL();
        }

        public final RestoreSet EZpvd() {
            return new RestoreSet(this, null);
        }
    }
}
