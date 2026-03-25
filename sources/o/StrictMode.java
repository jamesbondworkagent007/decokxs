package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.StrictMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class StrictMode {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.lang.Integer EZpvd;
    public final java.lang.Float KWHzl;
    public final java.lang.Integer OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.StrictMode$Application) A[MD:(o.StrictMode$Application):void (m)] call: o.StrictMode.<init>(o.StrictMode$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ StrictMode(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.EZpvd;
    }

    public StrictMode(Application application) {
        this.OLrzqt = application.EZpvd();
        this.EZpvd = application.AEQbTJ();
        this.KWHzl = application.KWHzl();
        this.copydefault = application.AhwBna();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StrictMode.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KeyPhrase(");
        sb.append("beginOffset=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("endOffset=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("score=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("text=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.OLrzqt;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.EZpvd;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Float f = this.KWHzl;
        int iHashCode = f != null ? f.hashCode() : 0;
        java.lang.String str = this.copydefault;
        return (((((iIntValue * 31) + iIntValue2) * 31) + iHashCode) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StrictMode.class != obj.getClass()) {
            return false;
        }
        StrictMode strictMode = (StrictMode) obj;
        return Intrinsics.EZpvd(this.OLrzqt, strictMode.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, strictMode.EZpvd) && Intrinsics.copydefault(this.KWHzl, strictMode.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) strictMode.copydefault);
    }

    public static /* synthetic */ StrictMode copy$default(StrictMode strictMode, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.KeyPhrase$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull StrictMode.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StrictMode.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(strictMode);
        function1.invoke(application);
        return application.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.Integer EZpvd;
        public java.lang.Float KWHzl;
        public java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.copydefault = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.KWHzl;
        }

        public final Application OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.EZpvd = num;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull StrictMode strictMode) {
            this();
            Intrinsics.checkNotNullParameter(strictMode, "");
            this.copydefault = strictMode.OLrzqt();
            this.EZpvd = strictMode.copydefault();
            this.KWHzl = strictMode.EZpvd();
            this.AEQbTJ = strictMode.KWHzl();
        }

        public final StrictMode copydefault() {
            return new StrictMode(this, null);
        }
    }
}
