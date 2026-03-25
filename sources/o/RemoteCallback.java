package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RemoteCallback;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RemoteCallback {
    public static final ActionBar copydefault = new ActionBar(null);
    public final C5173Hn EZpvd;
    public final C5173Hn OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RemoteCallback$StateListAnimator) A[MD:(o.RemoteCallback$StateListAnimator):void (m)] call: o.RemoteCallback.<init>(o.RemoteCallback$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RemoteCallback(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.OLrzqt;
    }

    public RemoteCallback(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.KWHzl();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteCallback.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FlywheelIterationFilter(");
        sb.append("creationTimeAfter=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("creationTimeBefore=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.OLrzqt;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.EZpvd;
        return (iHashCode * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RemoteCallback.class != obj.getClass()) {
            return false;
        }
        RemoteCallback remoteCallback = (RemoteCallback) obj;
        return Intrinsics.EZpvd(this.OLrzqt, remoteCallback.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, remoteCallback.EZpvd);
    }

    public static /* synthetic */ RemoteCallback copy$default(RemoteCallback remoteCallback, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.FlywheelIterationFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RemoteCallback.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RemoteCallback.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(remoteCallback);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    public static final class StateListAnimator {
        public C5173Hn EZpvd;
        public C5173Hn KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RemoteCallback remoteCallback) {
            this();
            Intrinsics.checkNotNullParameter(remoteCallback, "");
            this.EZpvd = remoteCallback.copydefault();
            this.KWHzl = remoteCallback.OLrzqt();
        }

        public final RemoteCallback OLrzqt() {
            return new RemoteCallback(this, null);
        }
    }
}
