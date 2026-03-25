package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6476aQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6476aQ {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.Float AEQbTJ;
    public final java.util.List<SuggestionsAdapter> KWHzl;
    public final java.lang.String OLrzqt;
    public final WebViewZygote copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aQ$TaskDescription) A[MD:(o.aQ$TaskDescription):void (m)] call: o.aQ.<init>(o.aQ$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6476aQ(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SuggestionsAdapter> copydefault() {
        return this.KWHzl;
    }

    public C6476aQ(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.EZpvd();
        this.OLrzqt = taskDescription.KWHzl();
        this.copydefault = taskDescription.AEQbTJ();
        this.AEQbTJ = taskDescription.AhwBna();
    }

    /* JADX INFO: renamed from: o.aQ$Activity */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchFacesByImageResponse(");
        sb.append("faceMatches=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("faceModelVersion=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("searchedFaceBoundingBox=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("searchedFaceConfidence=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<SuggestionsAdapter> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        WebViewZygote webViewZygote = this.copydefault;
        int iHashCode3 = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f != null ? f.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6476aQ.class != obj.getClass()) {
            return false;
        }
        C6476aQ c6476aQ = (C6476aQ) obj;
        return Intrinsics.EZpvd(this.KWHzl, c6476aQ.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c6476aQ.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c6476aQ.copydefault) && Intrinsics.copydefault(this.AEQbTJ, c6476aQ.AEQbTJ);
    }

    public static /* synthetic */ C6476aQ copy$default(C6476aQ c6476aQ, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.SearchFacesByImageResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6476aQ.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6476aQ.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c6476aQ);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.aQ$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public WebViewZygote EZpvd;
        public java.util.List<SuggestionsAdapter> OLrzqt;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SuggestionsAdapter> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public final TaskDescription OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<SuggestionsAdapter> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(WebViewZygote webViewZygote) {
            this.EZpvd = webViewZygote;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C6476aQ c6476aQ) {
            this();
            Intrinsics.checkNotNullParameter(c6476aQ, "");
            this.OLrzqt = c6476aQ.copydefault();
            this.AEQbTJ = c6476aQ.AEQbTJ();
            this.EZpvd = c6476aQ.KWHzl();
            this.copydefault = c6476aQ.EZpvd();
        }

        public final C6476aQ copydefault() {
            return new C6476aQ(this, null);
        }
    }
}
