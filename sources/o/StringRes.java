package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.StringRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class StringRes {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final SearchDialog EZpvd;
    public final SearchableInfo KWHzl;
    public final java.lang.Boolean OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.StringRes$StateListAnimator) A[MD:(o.StringRes$StateListAnimator):void (m)] call: o.StringRes.<init>(o.StringRes$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ StringRes(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchableInfo AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchDialog EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.OLrzqt;
    }

    public StringRes(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.OLrzqt();
        this.KWHzl = stateListAnimator.EZpvd();
        this.EZpvd = stateListAnimator.AEQbTJ();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StringRes.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EventRiskType(");
        sb.append("compromisedCredentialsDetected=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("riskDecision=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("riskLevel=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.OLrzqt;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        SearchableInfo searchableInfo = this.KWHzl;
        int iHashCode2 = searchableInfo != null ? searchableInfo.hashCode() : 0;
        SearchDialog searchDialog = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (searchDialog != null ? searchDialog.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StringRes.class != obj.getClass()) {
            return false;
        }
        StringRes stringRes = (StringRes) obj;
        return Intrinsics.EZpvd(this.OLrzqt, stringRes.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, stringRes.KWHzl) && Intrinsics.EZpvd(this.EZpvd, stringRes.EZpvd);
    }

    public static /* synthetic */ StringRes copy$default(StringRes stringRes, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.EventRiskType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull StringRes.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StringRes.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(stringRes);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public java.lang.Boolean KWHzl;
        public SearchableInfo OLrzqt;
        public SearchDialog copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchDialog AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(SearchDialog searchDialog) {
            this.copydefault = searchDialog;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(SearchableInfo searchableInfo) {
            this.OLrzqt = searchableInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SearchableInfo EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Boolean bool) {
            this.KWHzl = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.KWHzl;
        }

        public final StateListAnimator copydefault() {
            return this;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull StringRes stringRes) {
            this();
            Intrinsics.checkNotNullParameter(stringRes, "");
            this.KWHzl = stringRes.OLrzqt();
            this.OLrzqt = stringRes.AEQbTJ();
            this.copydefault = stringRes.EZpvd();
        }

        public final StringRes KWHzl() {
            return new StringRes(this, null);
        }
    }
}
