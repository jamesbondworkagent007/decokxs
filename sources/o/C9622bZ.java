package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C9622bZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9622bZ {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.lang.Float AEQbTJ;
    public final AbstractC9463bW KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bZ$ActionBar) A[MD:(o.bZ$ActionBar):void (m)] call: o.bZ.<init>(o.bZ$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9622bZ(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC9463bW EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.AEQbTJ;
    }

    public C9622bZ(ActionBar actionBar) {
        this.AEQbTJ = actionBar.OLrzqt();
        this.KWHzl = actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.bZ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TechnicalCueSegment(");
        sb.append("confidence=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.AEQbTJ;
        int iHashCode = f != null ? f.hashCode() : 0;
        AbstractC9463bW abstractC9463bW = this.KWHzl;
        return (iHashCode * 31) + (abstractC9463bW != null ? abstractC9463bW.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9622bZ.class != obj.getClass()) {
            return false;
        }
        C9622bZ c9622bZ = (C9622bZ) obj;
        return Intrinsics.copydefault(this.AEQbTJ, c9622bZ.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c9622bZ.KWHzl);
    }

    public static /* synthetic */ C9622bZ copy$default(C9622bZ c9622bZ, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.TechnicalCueSegment$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9622bZ.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9622bZ.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c9622bZ);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    /* JADX INFO: renamed from: o.bZ$ActionBar */
    public static final class ActionBar {
        public java.lang.Float EZpvd;
        public AbstractC9463bW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC9463bW AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Float f) {
            this.EZpvd = f;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC9463bW abstractC9463bW) {
            this.copydefault = abstractC9463bW;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C9622bZ c9622bZ) {
            this();
            Intrinsics.checkNotNullParameter(c9622bZ, "");
            this.EZpvd = c9622bZ.KWHzl();
            this.copydefault = c9622bZ.EZpvd();
        }

        public final C9622bZ copydefault() {
            return new C9622bZ(this, null);
        }
    }
}
