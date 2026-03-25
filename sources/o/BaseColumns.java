package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.BaseColumns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class BaseColumns {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.lang.Float EZpvd;
    public final AlarmClock copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BaseColumns$Application) A[MD:(o.BaseColumns$Application):void (m)] call: o.BaseColumns.<init>(o.BaseColumns$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BaseColumns(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlarmClock KWHzl() {
        return this.copydefault;
    }

    public BaseColumns(Application application) {
        this.copydefault = application.AEQbTJ();
        this.EZpvd = application.copydefault();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BaseColumns.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ToxicContent(");
        sb.append("name=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("score=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AlarmClock alarmClock = this.copydefault;
        int iHashCode = alarmClock != null ? alarmClock.hashCode() : 0;
        java.lang.Float f = this.EZpvd;
        return (iHashCode * 31) + (f != null ? f.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BaseColumns.class != obj.getClass()) {
            return false;
        }
        BaseColumns baseColumns = (BaseColumns) obj;
        return Intrinsics.EZpvd(this.copydefault, baseColumns.copydefault) && Intrinsics.copydefault(this.EZpvd, baseColumns.EZpvd);
    }

    public static /* synthetic */ BaseColumns copy$default(BaseColumns baseColumns, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ToxicContent$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BaseColumns.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BaseColumns.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(baseColumns);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public AlarmClock AEQbTJ;
        public java.lang.Float KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AlarmClock AEQbTJ() {
            return this.AEQbTJ;
        }

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AlarmClock alarmClock) {
            this.AEQbTJ = alarmClock;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull BaseColumns baseColumns) {
            this();
            Intrinsics.checkNotNullParameter(baseColumns, "");
            this.AEQbTJ = baseColumns.KWHzl();
            this.KWHzl = baseColumns.EZpvd();
        }

        public final BaseColumns KWHzl() {
            return new BaseColumns(this, null);
        }
    }
}
