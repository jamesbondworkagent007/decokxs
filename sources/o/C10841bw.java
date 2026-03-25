package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C10841bw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C10841bw {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final C8456bD OLrzqt;
    public final C8297bA copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bw$Application) A[MD:(o.bw$Application):void (m)] call: o.bw.<init>(o.bw$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10841bw(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8297bA KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8456bD OLrzqt() {
        return this.OLrzqt;
    }

    public C10841bw(Application application) {
        this.copydefault = application.OLrzqt();
        this.OLrzqt = application.copydefault();
    }

    /* JADX INFO: renamed from: o.bw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartSegmentDetectionFilters(");
        sb.append("shotFilter=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("technicalCueFilter=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C8297bA c8297bA = this.copydefault;
        int iHashCode = c8297bA != null ? c8297bA.hashCode() : 0;
        C8456bD c8456bD = this.OLrzqt;
        return (iHashCode * 31) + (c8456bD != null ? c8456bD.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10841bw.class != obj.getClass()) {
            return false;
        }
        C10841bw c10841bw = (C10841bw) obj;
        return Intrinsics.EZpvd(this.copydefault, c10841bw.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c10841bw.OLrzqt);
    }

    public static /* synthetic */ C10841bw copy$default(C10841bw c10841bw, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartSegmentDetectionFilters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C10841bw.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C10841bw.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c10841bw);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.bw$Application */
    public static final class Application {
        public C8456bD EZpvd;
        public C8297bA OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8297bA OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8456bD copydefault() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C10841bw c10841bw) {
            this();
            Intrinsics.checkNotNullParameter(c10841bw, "");
            this.OLrzqt = c10841bw.KWHzl();
            this.EZpvd = c10841bw.OLrzqt();
        }

        public final C10841bw KWHzl() {
            return new C10841bw(this, null);
        }
    }
}
