package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CompletionInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class CompletionInfo {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Boolean valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CompletionInfo$ActionBar) A[MD:(o.CompletionInfo$ActionBar):void (m)] call: o.CompletionInfo.<init>(o.CompletionInfo$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CompletionInfo(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public CompletionInfo(ActionBar actionBar) {
        this.EZpvd = actionBar.OLrzqt();
        this.OLrzqt = actionBar.copydefault();
        java.lang.Boolean boolAEQbTJ = actionBar.AEQbTJ();
        if (boolAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.AEQbTJ = boolAEQbTJ;
        java.lang.Boolean boolKWHzl = actionBar.KWHzl();
        if (boolKWHzl == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.KWHzl = boolKWHzl;
        java.lang.Boolean boolDjBIcL = actionBar.djBIcL();
        if (boolDjBIcL == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useGlobalEndpoint is required".toString());
        }
        this.valueOf = boolDjBIcL;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CompletionInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletionInfo)) {
            return false;
        }
        CompletionInfo completionInfo = (CompletionInfo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) completionInfo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) completionInfo.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, completionInfo.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, completionInfo.KWHzl) && Intrinsics.EZpvd(this.valueOf, completionInfo.valueOf);
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.Boolean bool = this.AEQbTJ;
        int iHashCode3 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.KWHzl;
        int iHashCode4 = bool2 != null ? bool2.hashCode() : 0;
        java.lang.Boolean bool3 = this.valueOf;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StsEndpointParameters(");
        sb.append("endpoint=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("region=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("useDualStack=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("useFips=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("useGlobalEndpoint=" + this.valueOf + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.CompletionInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletionInfo copy$default(CompletionInfo completionInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.endpoints.StsEndpointParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CompletionInfo.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CompletionInfo.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        return completionInfo.AEQbTJ(function1);
    }

    public final CompletionInfo AEQbTJ(@NotNull Function1<? super ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar();
        actionBar.KWHzl(this.EZpvd);
        actionBar.EZpvd(this.OLrzqt);
        actionBar.copydefault(this.AEQbTJ);
        actionBar.KWHzl(this.KWHzl);
        actionBar.AEQbTJ(this.valueOf);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.Boolean EZpvd;
        public java.lang.Boolean KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.Boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Boolean bool) {
            this.copydefault = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Boolean bool) {
            this.KWHzl = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Boolean bool) {
            this.EZpvd = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean djBIcL() {
            return this.copydefault;
        }

        public ActionBar() {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.EZpvd = bool;
            this.KWHzl = bool;
            this.copydefault = bool;
        }

        public final CompletionInfo EZpvd() {
            return new CompletionInfo(this, null);
        }
    }
}
