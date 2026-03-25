package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IndexOutOfBoundsException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class IndexOutOfBoundsException {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final java.util.Map<java.lang.String, NullPointerException> KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IndexOutOfBoundsException$StateListAnimator) A[MD:(o.IndexOutOfBoundsException$StateListAnimator):void (m)] call: o.IndexOutOfBoundsException.<init>(o.IndexOutOfBoundsException$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IndexOutOfBoundsException(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, NullPointerException> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    public IndexOutOfBoundsException(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.copydefault();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.EZpvd();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IndexOutOfBoundsException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetIdentityPoolRolesResponse(");
        sb.append("identityPoolId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("roleMappings=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("roles=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, NullPointerException> map = this.KWHzl;
        int iHashCode2 = map != null ? map.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IndexOutOfBoundsException.class != obj.getClass()) {
            return false;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = (IndexOutOfBoundsException) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) indexOutOfBoundsException.copydefault) && Intrinsics.EZpvd(this.KWHzl, indexOutOfBoundsException.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, indexOutOfBoundsException.AEQbTJ);
    }

    public static /* synthetic */ IndexOutOfBoundsException copy$default(IndexOutOfBoundsException indexOutOfBoundsException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.GetIdentityPoolRolesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IndexOutOfBoundsException.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IndexOutOfBoundsException.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(indexOutOfBoundsException);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    public static final class StateListAnimator {
        public java.lang.String EZpvd;
        public java.util.Map<java.lang.String, java.lang.String> KWHzl;
        public java.util.Map<java.lang.String, NullPointerException> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
            this.KWHzl = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.Map<java.lang.String, NullPointerException> map) {
            this.OLrzqt = map;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, NullPointerException> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull IndexOutOfBoundsException indexOutOfBoundsException) {
            this();
            Intrinsics.checkNotNullParameter(indexOutOfBoundsException, "");
            this.EZpvd = indexOutOfBoundsException.OLrzqt();
            this.OLrzqt = indexOutOfBoundsException.AEQbTJ();
            this.KWHzl = indexOutOfBoundsException.KWHzl();
        }

        public final IndexOutOfBoundsException AEQbTJ() {
            return new IndexOutOfBoundsException(this, null);
        }
    }
}
