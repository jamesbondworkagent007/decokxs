package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7344ai;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C7344ai {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final C7238ag KWHzl;
    public final C6582aS OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ai$ActionBar) A[MD:(o.ai$ActionBar):void (m)] call: o.ai.<init>(o.ai$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C7344ai(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7238ag EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6582aS OLrzqt() {
        return this.OLrzqt;
    }

    public C7344ai(ActionBar actionBar) {
        this.KWHzl = actionBar.copydefault();
        this.OLrzqt = actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.ai$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ai.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MediaAnalysisResults(");
        sb.append("modelVersions=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("s3Object=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C7238ag c7238ag = this.KWHzl;
        int iHashCode = c7238ag != null ? c7238ag.hashCode() : 0;
        C6582aS c6582aS = this.OLrzqt;
        return (iHashCode * 31) + (c6582aS != null ? c6582aS.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7344ai.class != obj.getClass()) {
            return false;
        }
        C7344ai c7344ai = (C7344ai) obj;
        return Intrinsics.EZpvd(this.KWHzl, c7344ai.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c7344ai.OLrzqt);
    }

    public static /* synthetic */ C7344ai copy$default(C7344ai c7344ai, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.MediaAnalysisResults$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C7344ai.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C7344ai.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c7344ai);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.ai$ActionBar */
    public static final class ActionBar {
        public C7238ag EZpvd;
        public C6582aS OLrzqt;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C6582aS EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C6582aS c6582aS) {
            this.OLrzqt = c6582aS;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C7238ag c7238ag) {
            this.EZpvd = c7238ag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7238ag copydefault() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C7344ai c7344ai) {
            this();
            Intrinsics.checkNotNullParameter(c7344ai, "");
            this.EZpvd = c7344ai.EZpvd();
            this.OLrzqt = c7344ai.OLrzqt();
        }

        public final C7344ai OLrzqt() {
            return new C7344ai(this, null);
        }
    }
}
