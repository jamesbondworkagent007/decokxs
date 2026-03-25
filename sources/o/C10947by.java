package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C10947by;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.by, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C10947by {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final C8827bK AEQbTJ;
    public final C8721bI EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.by$ActionBar) A[MD:(o.by$ActionBar):void (m)] call: o.by.<init>(o.by$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10947by(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8721bI EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8827bK KWHzl() {
        return this.AEQbTJ;
    }

    public C10947by(ActionBar actionBar) {
        this.KWHzl = actionBar.EZpvd();
        this.AEQbTJ = actionBar.OLrzqt();
        this.EZpvd = actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.by$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.by.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartStreamProcessorRequest(");
        sb.append("name=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("startSelector=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("stopSelector=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        C8827bK c8827bK = this.AEQbTJ;
        int iHashCode2 = c8827bK != null ? c8827bK.hashCode() : 0;
        C8721bI c8721bI = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c8721bI != null ? c8721bI.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10947by.class != obj.getClass()) {
            return false;
        }
        C10947by c10947by = (C10947by) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c10947by.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c10947by.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c10947by.EZpvd);
    }

    public static /* synthetic */ C10947by copy$default(C10947by c10947by, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartStreamProcessorRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C10947by.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C10947by.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c10947by);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.by$ActionBar */
    public static final class ActionBar {
        public C8827bK AEQbTJ;
        public java.lang.String EZpvd;
        public C8721bI KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8721bI KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8827bK OLrzqt() {
            return this.AEQbTJ;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C10947by c10947by) {
            this();
            Intrinsics.checkNotNullParameter(c10947by, "");
            this.EZpvd = c10947by.AEQbTJ();
            this.AEQbTJ = c10947by.KWHzl();
            this.KWHzl = c10947by.EZpvd();
        }

        public final C10947by AEQbTJ() {
            return new C10947by(this, null);
        }
    }
}
