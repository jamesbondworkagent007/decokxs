package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ContentUriWithoutPermissionViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ContentUriWithoutPermissionViolation {
    public static final Activity OLrzqt = new Activity(null);
    public final java.lang.Float AEQbTJ;
    public final NetworkViolation EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ContentUriWithoutPermissionViolation$ActionBar) A[MD:(o.ContentUriWithoutPermissionViolation$ActionBar):void (m)] call: o.ContentUriWithoutPermissionViolation.<init>(o.ContentUriWithoutPermissionViolation$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ContentUriWithoutPermissionViolation(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkViolation KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.AEQbTJ;
    }

    public ContentUriWithoutPermissionViolation(ActionBar actionBar) {
        this.copydefault = actionBar.EZpvd();
        this.KWHzl = actionBar.KWHzl();
        this.AEQbTJ = actionBar.AEQbTJ();
        this.EZpvd = actionBar.AhwBna();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ContentUriWithoutPermissionViolation.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PiiEntity(");
        sb.append("beginOffset=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("endOffset=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("score=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.KWHzl;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Float f = this.AEQbTJ;
        int iHashCode = f != null ? f.hashCode() : 0;
        NetworkViolation networkViolation = this.EZpvd;
        return (((((iIntValue * 31) + iIntValue2) * 31) + iHashCode) * 31) + (networkViolation != null ? networkViolation.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContentUriWithoutPermissionViolation.class != obj.getClass()) {
            return false;
        }
        ContentUriWithoutPermissionViolation contentUriWithoutPermissionViolation = (ContentUriWithoutPermissionViolation) obj;
        return Intrinsics.EZpvd(this.copydefault, contentUriWithoutPermissionViolation.copydefault) && Intrinsics.EZpvd(this.KWHzl, contentUriWithoutPermissionViolation.KWHzl) && Intrinsics.copydefault(this.AEQbTJ, contentUriWithoutPermissionViolation.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, contentUriWithoutPermissionViolation.EZpvd);
    }

    public static /* synthetic */ ContentUriWithoutPermissionViolation copy$default(ContentUriWithoutPermissionViolation contentUriWithoutPermissionViolation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.PiiEntity$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContentUriWithoutPermissionViolation.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentUriWithoutPermissionViolation.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(contentUriWithoutPermissionViolation);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public java.lang.Integer AEQbTJ;
        public java.lang.Float EZpvd;
        public NetworkViolation KWHzl;
        public java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkViolation AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.copydefault = num;
        }

        public final ActionBar copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(NetworkViolation networkViolation) {
            this.KWHzl = networkViolation;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ContentUriWithoutPermissionViolation contentUriWithoutPermissionViolation) {
            this();
            Intrinsics.checkNotNullParameter(contentUriWithoutPermissionViolation, "");
            this.AEQbTJ = contentUriWithoutPermissionViolation.OLrzqt();
            this.copydefault = contentUriWithoutPermissionViolation.EZpvd();
            this.EZpvd = contentUriWithoutPermissionViolation.copydefault();
            this.KWHzl = contentUriWithoutPermissionViolation.KWHzl();
        }

        public final ContentUriWithoutPermissionViolation OLrzqt() {
            return new ContentUriWithoutPermissionViolation(this, null);
        }
    }
}
