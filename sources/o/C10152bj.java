package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C10152bj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C10152bj {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final C7662ao OLrzqt;
    public final Spinner copydefault;
    public final C11108cC djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bj$Application) A[MD:(o.bj$Application):void (m)] call: o.bj.<init>(o.bj$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10152bj(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Spinner KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7662ao OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public C10152bj(Application application) {
        this.KWHzl = application.KWHzl();
        this.copydefault = application.AEQbTJ();
        this.EZpvd = application.OLrzqt();
        this.OLrzqt = application.copydefault();
        this.djBIcL = application.gEmmrt();
    }

    /* JADX INFO: renamed from: o.bj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartFaceDetectionRequest(");
        sb.append("clientRequestToken=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("faceAttributes=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("video=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        Spinner spinner = this.copydefault;
        int iHashCode2 = spinner != null ? spinner.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        C7662ao c7662ao = this.OLrzqt;
        int iHashCode4 = c7662ao != null ? c7662ao.hashCode() : 0;
        C11108cC c11108cC = this.djBIcL;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c11108cC != null ? c11108cC.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10152bj.class != obj.getClass()) {
            return false;
        }
        C10152bj c10152bj = (C10152bj) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c10152bj.KWHzl) && Intrinsics.EZpvd(this.copydefault, c10152bj.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c10152bj.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c10152bj.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, c10152bj.djBIcL);
    }

    public static /* synthetic */ C10152bj copy$default(C10152bj c10152bj, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartFaceDetectionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C10152bj.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C10152bj.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c10152bj);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: renamed from: o.bj$Application */
    public static final class Application {
        public C11108cC AEQbTJ;
        public C7662ao EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public Spinner copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Spinner AEQbTJ() {
            return this.copydefault;
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
        public final C7662ao copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC gEmmrt() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C10152bj c10152bj) {
            this();
            Intrinsics.checkNotNullParameter(c10152bj, "");
            this.OLrzqt = c10152bj.AEQbTJ();
            this.copydefault = c10152bj.KWHzl();
            this.KWHzl = c10152bj.copydefault();
            this.EZpvd = c10152bj.OLrzqt();
            this.AEQbTJ = c10152bj.EZpvd();
        }

        public final C10152bj EZpvd() {
            return new C10152bj(this, null);
        }
    }
}
