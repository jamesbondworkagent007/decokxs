package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WindowConfiguration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class WindowConfiguration {
    public static final Application EZpvd = new Application(null);
    public final boolean KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WindowConfiguration$StateListAnimator) A[MD:(o.WindowConfiguration$StateListAnimator):void (m)] call: o.WindowConfiguration.<init>(o.WindowConfiguration$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WindowConfiguration(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    public WindowConfiguration(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.OLrzqt();
        this.KWHzl = stateListAnimator.AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WindowConfiguration.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final WindowConfiguration EZpvd(@NotNull Function1<? super StateListAnimator, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            StateListAnimator stateListAnimator = new StateListAnimator();
            function1.invoke(stateListAnimator);
            return stateListAnimator.copydefault();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SoftwareTokenMfaSettingsType(");
        sb.append("enabled=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("preferredMfa=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WindowConfiguration.class != obj.getClass()) {
            return false;
        }
        WindowConfiguration windowConfiguration = (WindowConfiguration) obj;
        return this.copydefault == windowConfiguration.copydefault && this.KWHzl == windowConfiguration.KWHzl;
    }

    public static /* synthetic */ WindowConfiguration copy$default(WindowConfiguration windowConfiguration, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SoftwareTokenMfaSettingsType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WindowConfiguration.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WindowConfiguration.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(windowConfiguration);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public boolean AEQbTJ;
        public boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull WindowConfiguration windowConfiguration) {
            this();
            Intrinsics.checkNotNullParameter(windowConfiguration, "");
            this.KWHzl = windowConfiguration.KWHzl();
            this.AEQbTJ = windowConfiguration.AEQbTJ();
        }

        public final WindowConfiguration copydefault() {
            return new WindowConfiguration(this, null);
        }
    }
}
