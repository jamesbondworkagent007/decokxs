package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Advanceable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Advanceable {
    public static final Activity AEQbTJ = new Activity(null);
    public final long AYXKKw;
    public final java.lang.Long EZpvd;
    public final C7397aj KWHzl;
    public final java.lang.Long OLrzqt;
    public final java.lang.Long copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Advanceable$Application) A[MD:(o.Advanceable$Application):void (m)] call: o.Advanceable.<init>(o.Advanceable$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Advanceable(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7397aj AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.AYXKKw;
    }

    public Advanceable(Application application) {
        this.OLrzqt = application.KWHzl();
        this.EZpvd = application.copydefault();
        this.KWHzl = application.OLrzqt();
        this.copydefault = application.gEmmrt();
        this.AYXKKw = application.valueOf();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Advanceable.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ContentModerationDetection(");
        sb.append("durationMillis=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("endTimestampMillis=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("moderationLabel=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("startTimestampMillis=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("timestamp=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Long l = this.OLrzqt;
        int iHashCode = l != null ? l.hashCode() : 0;
        java.lang.Long l2 = this.EZpvd;
        int iHashCode2 = l2 != null ? l2.hashCode() : 0;
        C7397aj c7397aj = this.KWHzl;
        int iHashCode3 = c7397aj != null ? c7397aj.hashCode() : 0;
        java.lang.Long l3 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l3 != null ? l3.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.AYXKKw);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Advanceable.class != obj.getClass()) {
            return false;
        }
        Advanceable advanceable = (Advanceable) obj;
        return Intrinsics.EZpvd(this.OLrzqt, advanceable.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, advanceable.EZpvd) && Intrinsics.EZpvd(this.KWHzl, advanceable.KWHzl) && Intrinsics.EZpvd(this.copydefault, advanceable.copydefault) && this.AYXKKw == advanceable.AYXKKw;
    }

    public static /* synthetic */ Advanceable copy$default(Advanceable advanceable, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ContentModerationDetection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Advanceable.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Advanceable.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(advanceable);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    public static final class Application {
        public long AEQbTJ;
        public C7397aj EZpvd;
        public java.lang.Long KWHzl;
        public java.lang.Long OLrzqt;
        public java.lang.Long copydefault;

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(long j) {
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Long l) {
            this.copydefault = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C7397aj c7397aj) {
            this.EZpvd = c7397aj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7397aj OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Long l) {
            this.OLrzqt = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Long l) {
            this.KWHzl = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long valueOf() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull Advanceable advanceable) {
            this();
            Intrinsics.checkNotNullParameter(advanceable, "");
            this.copydefault = advanceable.OLrzqt();
            this.OLrzqt = advanceable.EZpvd();
            this.EZpvd = advanceable.AEQbTJ();
            this.KWHzl = advanceable.KWHzl();
            this.AEQbTJ = advanceable.copydefault();
        }

        public final Advanceable AEQbTJ() {
            return new Advanceable(this, null);
        }
    }
}
