package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7715ap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ap, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C7715ap {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final long AEQbTJ;
    public final java.util.List<SuggestionsAdapter> EZpvd;
    public final C7874as copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ap$ActionBar) A[MD:(o.ap$ActionBar):void (m)] call: o.ap.<init>(o.ap$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C7715ap(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7874as EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SuggestionsAdapter> copydefault() {
        return this.EZpvd;
    }

    public C7715ap(ActionBar actionBar) {
        this.EZpvd = actionBar.KWHzl();
        this.copydefault = actionBar.copydefault();
        this.AEQbTJ = actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.ap$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ap.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PersonMatch(");
        sb.append("faceMatches=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("person=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("timestamp=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<SuggestionsAdapter> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        C7874as c7874as = this.copydefault;
        return (((iHashCode * 31) + (c7874as != null ? c7874as.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7715ap.class != obj.getClass()) {
            return false;
        }
        C7715ap c7715ap = (C7715ap) obj;
        return Intrinsics.EZpvd(this.EZpvd, c7715ap.EZpvd) && Intrinsics.EZpvd(this.copydefault, c7715ap.copydefault) && this.AEQbTJ == c7715ap.AEQbTJ;
    }

    public static /* synthetic */ C7715ap copy$default(C7715ap c7715ap, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.PersonMatch$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C7715ap.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C7715ap.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c7715ap);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.ap$ActionBar */
    public static final class ActionBar {
        public C7874as AEQbTJ;
        public long EZpvd;
        public java.util.List<SuggestionsAdapter> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<SuggestionsAdapter> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SuggestionsAdapter> KWHzl() {
            return this.OLrzqt;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7874as copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(long j) {
            this.EZpvd = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C7874as c7874as) {
            this.AEQbTJ = c7874as;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C7715ap c7715ap) {
            this();
            Intrinsics.checkNotNullParameter(c7715ap, "");
            this.OLrzqt = c7715ap.copydefault();
            this.AEQbTJ = c7715ap.EZpvd();
            this.EZpvd = c7715ap.AEQbTJ();
        }

        public final C7715ap AEQbTJ() {
            return new C7715ap(this, null);
        }
    }
}
