package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C10417bo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C10417bo {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final C7185af AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final X copydefault;
    public final C7291ah valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bo$Application) A[MD:(o.bo$Application):void (m)] call: o.bo.<init>(o.bo$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10417bo(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7291ah EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final X copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7185af valueOf() {
        return this.AYXKKw;
    }

    public C10417bo(Application application) {
        this.OLrzqt = application.EZpvd();
        this.copydefault = application.AEQbTJ();
        this.EZpvd = application.OLrzqt();
        this.KWHzl = application.copydefault();
        this.valueOf = application.valueOf();
        this.AYXKKw = application.AYXKKw();
    }

    /* JADX INFO: renamed from: o.bo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartMediaAnalysisJobRequest(");
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("input=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("operationsConfig=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("outputConfig=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        X x = this.copydefault;
        int iHashCode2 = x != null ? x.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.KWHzl;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        C7291ah c7291ah = this.valueOf;
        int iHashCode5 = c7291ah != null ? c7291ah.hashCode() : 0;
        C7185af c7185af = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c7185af != null ? c7185af.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10417bo.class != obj.getClass()) {
            return false;
        }
        C10417bo c10417bo = (C10417bo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c10417bo.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c10417bo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c10417bo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c10417bo.KWHzl) && Intrinsics.EZpvd(this.valueOf, c10417bo.valueOf) && Intrinsics.EZpvd(this.AYXKKw, c10417bo.AYXKKw);
    }

    public static /* synthetic */ C10417bo copy$default(C10417bo c10417bo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartMediaAnalysisJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C10417bo.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C10417bo.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c10417bo);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.bo$Application */
    public static final class Application {
        public X AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public C7291ah copydefault;
        public C7185af gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final X AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7185af AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7291ah valueOf() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C10417bo c10417bo) {
            this();
            Intrinsics.checkNotNullParameter(c10417bo, "");
            this.OLrzqt = c10417bo.KWHzl();
            this.AEQbTJ = c10417bo.copydefault();
            this.KWHzl = c10417bo.AEQbTJ();
            this.EZpvd = c10417bo.OLrzqt();
            this.copydefault = c10417bo.EZpvd();
            this.gEmmrt = c10417bo.valueOf();
        }

        public final C10417bo KWHzl() {
            return new C10417bo(this, null);
        }
    }
}
