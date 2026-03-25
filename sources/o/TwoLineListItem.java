package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TwoLineListItem;
import o.W;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TwoLineListItem {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final java.util.List<WebViewFragment> AEQbTJ;
    public final java.lang.Float EZpvd;
    public final WebViewFragment OLrzqt;
    public final java.lang.String copydefault;
    public final W djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TwoLineListItem$TaskDescription) A[MD:(o.TwoLineListItem$TaskDescription):void (m)] call: o.TwoLineListItem.<init>(o.TwoLineListItem$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TwoLineListItem(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WebViewFragment> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final W EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewFragment OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public TwoLineListItem(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.copydefault();
        this.EZpvd = taskDescription.KWHzl();
        this.OLrzqt = taskDescription.EZpvd();
        java.lang.String strValueOf = taskDescription.valueOf();
        if (strValueOf == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for sessionId".toString());
        }
        this.copydefault = strValueOf;
        W wDjBIcL = taskDescription.djBIcL();
        if (wDjBIcL == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for status".toString());
        }
        this.djBIcL = wDjBIcL;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TwoLineListItem.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetFaceLivenessSessionResultsResponse(");
        sb.append("auditImages=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("referenceImage=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("sessionId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<WebViewFragment> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Float f = this.EZpvd;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        WebViewFragment webViewFragment = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (webViewFragment != null ? webViewFragment.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TwoLineListItem.class != obj.getClass()) {
            return false;
        }
        TwoLineListItem twoLineListItem = (TwoLineListItem) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, twoLineListItem.AEQbTJ) && Intrinsics.copydefault(this.EZpvd, twoLineListItem.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, twoLineListItem.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) twoLineListItem.copydefault) && Intrinsics.EZpvd(this.djBIcL, twoLineListItem.djBIcL);
    }

    public static /* synthetic */ TwoLineListItem copy$default(TwoLineListItem twoLineListItem, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetFaceLivenessSessionResultsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TwoLineListItem.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TwoLineListItem.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(twoLineListItem);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public static final class TaskDescription {
        public java.lang.Float AEQbTJ;
        public W EZpvd;
        public java.util.List<WebViewFragment> KWHzl;
        public java.lang.String OLrzqt;
        public WebViewFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewFragment EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.AEQbTJ = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(WebViewFragment webViewFragment) {
            this.copydefault = webViewFragment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WebViewFragment> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<WebViewFragment> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(W w) {
            this.EZpvd = w;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final W djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull TwoLineListItem twoLineListItem) {
            this();
            Intrinsics.checkNotNullParameter(twoLineListItem, "");
            this.KWHzl = twoLineListItem.AEQbTJ();
            this.AEQbTJ = twoLineListItem.KWHzl();
            this.copydefault = twoLineListItem.OLrzqt();
            this.OLrzqt = twoLineListItem.copydefault();
            this.EZpvd = twoLineListItem.EZpvd();
        }

        public final TwoLineListItem AEQbTJ() {
            return new TwoLineListItem(this, null);
        }

        public final TaskDescription OLrzqt() {
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            if (this.EZpvd == null) {
                this.EZpvd = new W.Fragment("no value provided");
            }
            return this;
        }
    }
}
