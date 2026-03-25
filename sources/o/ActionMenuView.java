package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ActionMenuView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ActionMenuView {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final WebViewZygote AEQbTJ;
    public final C27696k AYXKKw;
    public final java.lang.Float EZpvd;
    public final java.util.List<SeekBar> OLrzqt;
    public final java.util.List<C> copydefault;
    public final C8084aw djBIcL;
    public final C9940bf valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ActionMenuView$TaskDescription) A[MD:(o.ActionMenuView$TaskDescription):void (m)] call: o.ActionMenuView.<init>(o.ActionMenuView$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ActionMenuView(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SeekBar> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8084aw copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27696k gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9940bf valueOf() {
        return this.valueOf;
    }

    public ActionMenuView(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.copydefault();
        this.EZpvd = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.EZpvd();
        this.copydefault = taskDescription.valueOf();
        this.djBIcL = taskDescription.AhwBna();
        this.AYXKKw = taskDescription.AYXKKw();
        this.valueOf = taskDescription.gEmmrt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ActionMenuView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComparedFace(");
        sb.append("boundingBox=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("emotions=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("landmarks=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("pose=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("quality=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("smile=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewZygote webViewZygote = this.AEQbTJ;
        int iHashCode = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.EZpvd;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        java.util.List<SeekBar> list = this.OLrzqt;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.util.List<C> list2 = this.copydefault;
        int iHashCode4 = list2 != null ? list2.hashCode() : 0;
        C8084aw c8084aw = this.djBIcL;
        int iHashCode5 = c8084aw != null ? c8084aw.hashCode() : 0;
        C27696k c27696k = this.AYXKKw;
        int iHashCode6 = c27696k != null ? c27696k.hashCode() : 0;
        C9940bf c9940bf = this.valueOf;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (c9940bf != null ? c9940bf.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActionMenuView.class != obj.getClass()) {
            return false;
        }
        ActionMenuView actionMenuView = (ActionMenuView) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, actionMenuView.AEQbTJ) && Intrinsics.copydefault(this.EZpvd, actionMenuView.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, actionMenuView.OLrzqt) && Intrinsics.EZpvd(this.copydefault, actionMenuView.copydefault) && Intrinsics.EZpvd(this.djBIcL, actionMenuView.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, actionMenuView.AYXKKw) && Intrinsics.EZpvd(this.valueOf, actionMenuView.valueOf);
    }

    public static /* synthetic */ ActionMenuView copy$default(ActionMenuView actionMenuView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ComparedFace$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ActionMenuView.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ActionMenuView.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(actionMenuView);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public java.util.List<SeekBar> AEQbTJ;
        public C9940bf AYXKKw;
        public C27696k AhwBna;
        public java.util.List<C> EZpvd;
        public C8084aw KWHzl;
        public java.lang.Float OLrzqt;
        public WebViewZygote copydefault;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(WebViewZygote webViewZygote) {
            this.copydefault = webViewZygote;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C9940bf c9940bf) {
            this.AYXKKw = c9940bf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C27696k AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8084aw AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SeekBar> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C27696k c27696k) {
            this.AhwBna = c27696k;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<SeekBar> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C8084aw c8084aw) {
            this.KWHzl = c8084aw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9940bf gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C> valueOf() {
            return this.EZpvd;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ActionMenuView actionMenuView) {
            this();
            Intrinsics.checkNotNullParameter(actionMenuView, "");
            this.copydefault = actionMenuView.EZpvd();
            this.OLrzqt = actionMenuView.OLrzqt();
            this.AEQbTJ = actionMenuView.AEQbTJ();
            this.EZpvd = actionMenuView.KWHzl();
            this.KWHzl = actionMenuView.copydefault();
            this.AhwBna = actionMenuView.gEmmrt();
            this.AYXKKw = actionMenuView.valueOf();
        }

        public final ActionMenuView KWHzl() {
            return new ActionMenuView(this, null);
        }
    }
}
