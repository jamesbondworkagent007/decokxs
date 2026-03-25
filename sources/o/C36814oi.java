package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36814oi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36814oi {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.String EZpvd;
    public final C36496oc OLrzqt;
    public final java.util.List<C36496oc> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oi$Application) A[MD:(o.oi$Application):void (m)] call: o.oi.<init>(o.oi$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36814oi(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36496oc OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36496oc> copydefault() {
        return this.copydefault;
    }

    public C36814oi(Application application) {
        this.OLrzqt = application.OLrzqt();
        this.EZpvd = application.EZpvd();
        this.copydefault = application.copydefault();
    }

    /* JADX INFO: renamed from: o.oi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LendingField(");
        sb.append("keyDetection=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("type=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("valueDetections=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C36496oc c36496oc = this.OLrzqt;
        int iHashCode = c36496oc != null ? c36496oc.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.util.List<C36496oc> list = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36814oi.class != obj.getClass()) {
            return false;
        }
        C36814oi c36814oi = (C36814oi) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c36814oi.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c36814oi.EZpvd) && Intrinsics.EZpvd(this.copydefault, c36814oi.copydefault);
    }

    public static /* synthetic */ C36814oi copy$default(C36814oi c36814oi, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.LendingField$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36814oi.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36814oi.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c36814oi);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.oi$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.util.List<C36496oc> KWHzl;
        public C36496oc OLrzqt;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C36496oc> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C36496oc c36496oc) {
            this.OLrzqt = c36496oc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36496oc OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36496oc> copydefault() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C36814oi c36814oi) {
            this();
            Intrinsics.checkNotNullParameter(c36814oi, "");
            this.OLrzqt = c36814oi.OLrzqt();
            this.AEQbTJ = c36814oi.EZpvd();
            this.KWHzl = c36814oi.copydefault();
        }

        public final C36814oi KWHzl() {
            return new C36814oi(this, null);
        }
    }
}
