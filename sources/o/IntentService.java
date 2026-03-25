package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IntentService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class IntentService {
    public static final Application copydefault = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.List<java.lang.String> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IntentService$ActionBar) A[MD:(o.IntentService$ActionBar):void (m)] call: o.IntentService.<init>(o.IntentService$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IntentService(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.OLrzqt;
    }

    public IntentService(ActionBar actionBar) {
        this.EZpvd = actionBar.AEQbTJ();
        this.KWHzl = actionBar.copydefault();
        this.OLrzqt = actionBar.OLrzqt();
        this.AEQbTJ = actionBar.KWHzl();
        this.AYXKKw = actionBar.valueOf();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IntentService.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListUsersRequest(");
        sb.append("attributesToGet=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("filter=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("limit=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("paginationToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.OLrzqt;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AYXKKw;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IntentService.class != obj.getClass()) {
            return false;
        }
        IntentService intentService = (IntentService) obj;
        return Intrinsics.EZpvd(this.EZpvd, intentService.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) intentService.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, intentService.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) intentService.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) intentService.AYXKKw);
    }

    public static /* synthetic */ IntentService copy$default(IntentService intentService, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ListUsersRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IntentService.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntentService.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(intentService);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        public java.lang.Integer AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.util.List<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull IntentService intentService) {
            this();
            Intrinsics.checkNotNullParameter(intentService, "");
            this.copydefault = intentService.KWHzl();
            this.OLrzqt = intentService.AEQbTJ();
            this.AEQbTJ = intentService.copydefault();
            this.EZpvd = intentService.OLrzqt();
            this.KWHzl = intentService.EZpvd();
        }

        public final IntentService EZpvd() {
            return new IntentService(this, null);
        }
    }
}
