package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47386tp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C47386tp {
    public static final Activity OLrzqt = new Activity(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.Integer KWHzl;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tp$ActionBar) A[MD:(o.tp$ActionBar):void (m)] call: o.tp.<init>(o.tp$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47386tp(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.KWHzl;
    }

    public C47386tp(ActionBar actionBar) {
        this.KWHzl = actionBar.copydefault();
        this.copydefault = actionBar.KWHzl();
        this.AEQbTJ = actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JobDetails(");
        sb.append("documentsWithErrorsCount=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("inputDocumentsCount=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("translatedDocumentsCount=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.copydefault;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Integer num3 = this.AEQbTJ;
        return (((iIntValue * 31) + iIntValue2) * 31) + (num3 != null ? num3.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47386tp.class != obj.getClass()) {
            return false;
        }
        C47386tp c47386tp = (C47386tp) obj;
        return Intrinsics.EZpvd(this.KWHzl, c47386tp.KWHzl) && Intrinsics.EZpvd(this.copydefault, c47386tp.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c47386tp.AEQbTJ);
    }

    public static /* synthetic */ C47386tp copy$default(C47386tp c47386tp, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.JobDetails$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47386tp.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47386tp.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c47386tp);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.tp$ActionBar */
    public static final class ActionBar {
        public java.lang.Integer EZpvd;
        public java.lang.Integer KWHzl;
        public java.lang.Integer OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.KWHzl = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.EZpvd = num;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C47386tp c47386tp) {
            this();
            Intrinsics.checkNotNullParameter(c47386tp, "");
            this.OLrzqt = c47386tp.copydefault();
            this.EZpvd = c47386tp.OLrzqt();
            this.KWHzl = c47386tp.KWHzl();
        }

        public final C47386tp EZpvd() {
            return new C47386tp(this, null);
        }
    }
}
