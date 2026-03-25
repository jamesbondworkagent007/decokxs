package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.StaticIpConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class StaticIpConfiguration {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.StaticIpConfiguration$Application) A[MD:(o.StaticIpConfiguration$Application):void (m)] call: o.StaticIpConfiguration.<init>(o.StaticIpConfiguration$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ StaticIpConfiguration(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    public StaticIpConfiguration(Application application) {
        this.AEQbTJ = application.EZpvd();
        this.EZpvd = application.KWHzl();
        this.copydefault = application.copydefault();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StaticIpConfiguration.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChildBlock(");
        sb.append("beginOffset=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("childBlockId=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("endOffset=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Integer num2 = this.copydefault;
        return (((iIntValue * 31) + iHashCode) * 31) + (num2 != null ? num2.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StaticIpConfiguration.class != obj.getClass()) {
            return false;
        }
        StaticIpConfiguration staticIpConfiguration = (StaticIpConfiguration) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, staticIpConfiguration.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) staticIpConfiguration.EZpvd) && Intrinsics.EZpvd(this.copydefault, staticIpConfiguration.copydefault);
    }

    public static /* synthetic */ StaticIpConfiguration copy$default(StaticIpConfiguration staticIpConfiguration, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ChildBlock$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull StaticIpConfiguration.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StaticIpConfiguration.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(staticIpConfiguration);
        function1.invoke(application);
        return application.OLrzqt();
    }

    public static final class Application {
        public java.lang.Integer AEQbTJ;
        public java.lang.String OLrzqt;
        public java.lang.Integer copydefault;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.copydefault = num;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull StaticIpConfiguration staticIpConfiguration) {
            this();
            Intrinsics.checkNotNullParameter(staticIpConfiguration, "");
            this.AEQbTJ = staticIpConfiguration.AEQbTJ();
            this.OLrzqt = staticIpConfiguration.KWHzl();
            this.copydefault = staticIpConfiguration.EZpvd();
        }

        public final StaticIpConfiguration OLrzqt() {
            return new StaticIpConfiguration(this, null);
        }
    }
}
