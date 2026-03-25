package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DHPrivateKeySpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DHPrivateKeySpec {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DHPrivateKeySpec$Activity) A[MD:(o.DHPrivateKeySpec$Activity):void (m)] call: o.DHPrivateKeySpec.<init>(o.DHPrivateKeySpec$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DHPrivateKeySpec(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
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
    public final java.lang.Integer OLrzqt() {
        return this.AEQbTJ;
    }

    public DHPrivateKeySpec(Activity activity) {
        this.AEQbTJ = activity.AEQbTJ();
        this.EZpvd = activity.copydefault();
        this.copydefault = activity.EZpvd();
        this.KWHzl = activity.OLrzqt();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DHPrivateKeySpec.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminListUserAuthEventsRequest(");
        sb.append("maxResults=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
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
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.KWHzl;
        return (((((iIntValue * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DHPrivateKeySpec.class != obj.getClass()) {
            return false;
        }
        DHPrivateKeySpec dHPrivateKeySpec = (DHPrivateKeySpec) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, dHPrivateKeySpec.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dHPrivateKeySpec.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) dHPrivateKeySpec.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dHPrivateKeySpec.KWHzl);
    }

    public static /* synthetic */ DHPrivateKeySpec copy$default(DHPrivateKeySpec dHPrivateKeySpec, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminListUserAuthEventsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DHPrivateKeySpec.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DHPrivateKeySpec.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(dHPrivateKeySpec);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Activity {
        public java.lang.Integer AEQbTJ;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull DHPrivateKeySpec dHPrivateKeySpec) {
            this();
            Intrinsics.checkNotNullParameter(dHPrivateKeySpec, "");
            this.AEQbTJ = dHPrivateKeySpec.OLrzqt();
            this.copydefault = dHPrivateKeySpec.AEQbTJ();
            this.OLrzqt = dHPrivateKeySpec.KWHzl();
            this.KWHzl = dHPrivateKeySpec.EZpvd();
        }

        public final DHPrivateKeySpec KWHzl() {
            return new DHPrivateKeySpec(this, null);
        }
    }
}
