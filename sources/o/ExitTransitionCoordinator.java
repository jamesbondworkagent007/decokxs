package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ExitTransitionCoordinator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ExitTransitionCoordinator {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<OnActivityPausedListener> EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ExitTransitionCoordinator$Application) A[MD:(o.ExitTransitionCoordinator$Application):void (m)] call: o.ExitTransitionCoordinator.<init>(o.ExitTransitionCoordinator$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ExitTransitionCoordinator(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<OnActivityPausedListener> OLrzqt() {
        return this.EZpvd;
    }

    public ExitTransitionCoordinator(Application application) {
        this.AEQbTJ = application.AEQbTJ();
        java.util.List<OnActivityPausedListener> listOLrzqt = application.OLrzqt();
        if (listOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for providers".toString());
        }
        this.EZpvd = listOLrzqt;
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ExitTransitionCoordinator.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListIdentityProvidersResponse(");
        sb.append("nextToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("providers=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        return ((str != null ? str.hashCode() : 0) * 31) + this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExitTransitionCoordinator.class != obj.getClass()) {
            return false;
        }
        ExitTransitionCoordinator exitTransitionCoordinator = (ExitTransitionCoordinator) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) exitTransitionCoordinator.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, exitTransitionCoordinator.EZpvd);
    }

    public static /* synthetic */ ExitTransitionCoordinator copy$default(ExitTransitionCoordinator exitTransitionCoordinator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ListIdentityProvidersResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ExitTransitionCoordinator.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ExitTransitionCoordinator.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(exitTransitionCoordinator);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application {
        public java.util.List<OnActivityPausedListener> EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<OnActivityPausedListener> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<OnActivityPausedListener> list) {
            this.EZpvd = list;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ExitTransitionCoordinator exitTransitionCoordinator) {
            this();
            Intrinsics.checkNotNullParameter(exitTransitionCoordinator, "");
            this.OLrzqt = exitTransitionCoordinator.KWHzl();
            this.EZpvd = exitTransitionCoordinator.OLrzqt();
        }

        public final ExitTransitionCoordinator EZpvd() {
            return new ExitTransitionCoordinator(this, null);
        }

        public final Application copydefault() {
            if (this.EZpvd == null) {
                this.EZpvd = yDY.AhwBna();
            }
            return this;
        }
    }
}
