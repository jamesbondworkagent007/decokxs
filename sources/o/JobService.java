package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.JobService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class JobService {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.util.List<ListFragment> AEQbTJ;
    public final C5173Hn AhwBna;
    public final boolean EZpvd;
    public final java.util.List<ChooseAccountActivity> KWHzl;
    public final C5173Hn copydefault;
    public final java.lang.String djBIcL;
    public final JobParameters gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.JobService$Activity) A[MD:(o.JobService$Activity):void (m)] call: o.JobService.<init>(o.JobService$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ JobService(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ListFragment> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JobParameters djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public JobService(Activity activity) {
        this.KWHzl = activity.KWHzl();
        this.EZpvd = activity.EZpvd();
        this.AEQbTJ = activity.copydefault();
        this.copydefault = activity.gEmmrt();
        this.AhwBna = activity.djBIcL();
        this.gEmmrt = activity.AhwBna();
        this.djBIcL = activity.AYXKKw();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JobService.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UserType(");
        sb.append("attributes=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("enabled=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("mfaOptions=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("userCreateDate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("userLastModifiedDate=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("userStatus=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<ChooseAccountActivity> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
        java.util.List<ListFragment> list2 = this.AEQbTJ;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode4 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AhwBna;
        int iHashCode5 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        JobParameters jobParameters = this.gEmmrt;
        int iHashCode6 = jobParameters != null ? jobParameters.hashCode() : 0;
        java.lang.String str = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JobService.class != obj.getClass()) {
            return false;
        }
        JobService jobService = (JobService) obj;
        return Intrinsics.EZpvd(this.KWHzl, jobService.KWHzl) && this.EZpvd == jobService.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, jobService.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, jobService.copydefault) && Intrinsics.EZpvd(this.AhwBna, jobService.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, jobService.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) jobService.djBIcL);
    }

    public static /* synthetic */ JobService copy$default(JobService jobService, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull JobService.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(JobService.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(jobService);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public C5173Hn AEQbTJ;
        public java.lang.String AYXKKw;
        public C5173Hn EZpvd;
        public java.util.List<ChooseAccountActivity> KWHzl;
        public java.util.List<ListFragment> OLrzqt;
        public boolean copydefault;
        public JobParameters valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JobParameters AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<ChooseAccountActivity> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.copydefault = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        public final Activity OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ListFragment> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<ListFragment> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(JobParameters jobParameters) {
            this.valueOf = jobParameters;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn gEmmrt() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull JobService jobService) {
            this();
            Intrinsics.checkNotNullParameter(jobService, "");
            this.KWHzl = jobService.EZpvd();
            this.copydefault = jobService.KWHzl();
            this.OLrzqt = jobService.AEQbTJ();
            this.AEQbTJ = jobService.OLrzqt();
            this.EZpvd = jobService.copydefault();
            this.valueOf = jobService.djBIcL();
            this.AYXKKw = jobService.valueOf();
        }

        public final JobService AEQbTJ() {
            return new JobService(this, null);
        }
    }
}
