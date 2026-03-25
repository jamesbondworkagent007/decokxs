package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NotificationChannelGroup;
import o.PackageDeleteObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class PackageDeleteObserver {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final NotificationChannelGroup EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PackageDeleteObserver$StateListAnimator) A[MD:(o.PackageDeleteObserver$StateListAnimator):void (m)] call: o.PackageDeleteObserver.<init>(o.PackageDeleteObserver$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PackageDeleteObserver(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationChannelGroup AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    public PackageDeleteObserver(StateListAnimator stateListAnimator) {
        java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
        if (strAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for lambdaArn".toString());
        }
        this.KWHzl = strAEQbTJ;
        NotificationChannelGroup notificationChannelGroupCopydefault = stateListAnimator.copydefault();
        if (notificationChannelGroupCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for lambdaVersion".toString());
        }
        this.EZpvd = notificationChannelGroupCopydefault;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PackageDeleteObserver.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PreTokenGenerationVersionConfigType(");
        sb.append("lambdaArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("lambdaVersion=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PackageDeleteObserver.class != obj.getClass()) {
            return false;
        }
        PackageDeleteObserver packageDeleteObserver = (PackageDeleteObserver) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) packageDeleteObserver.KWHzl) && Intrinsics.EZpvd(this.EZpvd, packageDeleteObserver.EZpvd);
    }

    public static /* synthetic */ PackageDeleteObserver copy$default(PackageDeleteObserver packageDeleteObserver, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.PreTokenGenerationVersionConfigType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PackageDeleteObserver.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PackageDeleteObserver.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(packageDeleteObserver);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public NotificationChannelGroup EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(NotificationChannelGroup notificationChannelGroup) {
            this.EZpvd = notificationChannelGroup;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NotificationChannelGroup copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull PackageDeleteObserver packageDeleteObserver) {
            this();
            Intrinsics.checkNotNullParameter(packageDeleteObserver, "");
            this.OLrzqt = packageDeleteObserver.KWHzl();
            this.EZpvd = packageDeleteObserver.AEQbTJ();
        }

        public final PackageDeleteObserver EZpvd() {
            return new PackageDeleteObserver(this, null);
        }

        public final StateListAnimator OLrzqt() {
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            if (this.EZpvd == null) {
                this.EZpvd = new NotificationChannelGroup.ActionBar("no value provided");
            }
            return this;
        }
    }
}
