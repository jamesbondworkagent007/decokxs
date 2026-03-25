package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NoSuchFieldError;
import o.Number;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class NoSuchFieldError {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final Number AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NoSuchFieldError$Activity) A[MD:(o.NoSuchFieldError$Activity):void (m)] call: o.NoSuchFieldError.<init>(o.NoSuchFieldError$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NoSuchFieldError(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Number copydefault() {
        return this.AEQbTJ;
    }

    public NoSuchFieldError(Activity activity) {
        java.lang.String strEZpvd = activity.EZpvd();
        if (strEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for claim".toString());
        }
        this.copydefault = strEZpvd;
        Number numberCopydefault = activity.copydefault();
        if (numberCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for matchType".toString());
        }
        this.AEQbTJ = numberCopydefault;
        java.lang.String strKWHzl = activity.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for roleArn".toString());
        }
        this.OLrzqt = strKWHzl;
        java.lang.String strAhwBna = activity.AhwBna();
        if (strAhwBna == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for value".toString());
        }
        this.KWHzl = strAhwBna;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NoSuchFieldError.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MappingRule(");
        sb.append("claim=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("matchType=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("roleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("value=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        return (((((iHashCode * 31) + iHashCode2) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NoSuchFieldError.class != obj.getClass()) {
            return false;
        }
        NoSuchFieldError noSuchFieldError = (NoSuchFieldError) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) noSuchFieldError.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, noSuchFieldError.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) noSuchFieldError.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) noSuchFieldError.KWHzl);
    }

    public static /* synthetic */ NoSuchFieldError copy$default(NoSuchFieldError noSuchFieldError, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.MappingRule$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NoSuchFieldError.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NoSuchFieldError.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(noSuchFieldError);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public Number EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(Number number) {
            this.EZpvd = number;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Number copydefault() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull NoSuchFieldError noSuchFieldError) {
            this();
            Intrinsics.checkNotNullParameter(noSuchFieldError, "");
            this.OLrzqt = noSuchFieldError.KWHzl();
            this.EZpvd = noSuchFieldError.copydefault();
            this.KWHzl = noSuchFieldError.AEQbTJ();
            this.AEQbTJ = noSuchFieldError.EZpvd();
        }

        public final NoSuchFieldError AEQbTJ() {
            return new NoSuchFieldError(this, null);
        }

        public final Activity OLrzqt() {
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            if (this.EZpvd == null) {
                this.EZpvd = new Number.StateListAnimator("no value provided");
            }
            if (this.KWHzl == null) {
                this.KWHzl = "";
            }
            if (this.AEQbTJ == null) {
                this.AEQbTJ = "";
            }
            return this;
        }
    }
}
