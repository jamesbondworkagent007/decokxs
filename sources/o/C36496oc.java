package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36496oc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36496oc {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final AbstractC35715oB EZpvd;
    public final java.lang.Float KWHzl;
    public final C33954nM OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oc$Application) A[MD:(o.oc$Application):void (m)] call: o.oc.<init>(o.oc$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36496oc(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33954nM AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC35715oB copydefault() {
        return this.EZpvd;
    }

    public C36496oc(Application application) {
        this.KWHzl = application.KWHzl();
        this.OLrzqt = application.OLrzqt();
        this.EZpvd = application.EZpvd();
        this.AEQbTJ = application.AhwBna();
    }

    /* JADX INFO: renamed from: o.oc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LendingDetection(");
        sb.append("confidence=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("geometry=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("selectionStatus=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("text=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.KWHzl;
        int iHashCode = f != null ? f.hashCode() : 0;
        C33954nM c33954nM = this.OLrzqt;
        int iHashCode2 = c33954nM != null ? c33954nM.hashCode() : 0;
        AbstractC35715oB abstractC35715oB = this.EZpvd;
        int iHashCode3 = abstractC35715oB != null ? abstractC35715oB.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36496oc.class != obj.getClass()) {
            return false;
        }
        C36496oc c36496oc = (C36496oc) obj;
        return Intrinsics.copydefault(this.KWHzl, c36496oc.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c36496oc.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c36496oc.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c36496oc.AEQbTJ);
    }

    public static /* synthetic */ C36496oc copy$default(C36496oc c36496oc, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.LendingDetection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36496oc.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36496oc.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c36496oc);
        function1.invoke(application);
        return application.copydefault();
    }

    /* JADX INFO: renamed from: o.oc$Application */
    public static final class Application {
        public C33954nM EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Float OLrzqt;
        public AbstractC35715oB copydefault;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC35715oB EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33954nM OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C33954nM c33954nM) {
            this.EZpvd = c33954nM;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC35715oB abstractC35715oB) {
            this.copydefault = abstractC35715oB;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C36496oc c36496oc) {
            this();
            Intrinsics.checkNotNullParameter(c36496oc, "");
            this.OLrzqt = c36496oc.OLrzqt();
            this.EZpvd = c36496oc.AEQbTJ();
            this.copydefault = c36496oc.copydefault();
            this.KWHzl = c36496oc.KWHzl();
        }

        public final C36496oc copydefault() {
            return new C36496oc(this, null);
        }
    }
}
