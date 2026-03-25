package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5681aB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5681aB {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.util.List<C5628aA> EZpvd;
    public final java.lang.Float KWHzl;
    public final java.lang.Integer OLrzqt;
    public final WebViewZygote copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aB$StateListAnimator) A[MD:(o.aB$StateListAnimator):void (m)] call: o.aB.<init>(o.aB$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C5681aB(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C5628aA> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.KWHzl;
    }

    public C5681aB(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.KWHzl();
        this.copydefault = stateListAnimator.AEQbTJ();
        this.KWHzl = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.AYXKKw();
    }

    /* JADX INFO: renamed from: o.aB$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProtectiveEquipmentPerson(");
        sb.append("bodyParts=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("boundingBox=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("id=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C5628aA> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        WebViewZygote webViewZygote = this.copydefault;
        int iHashCode2 = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.KWHzl;
        int iHashCode3 = f != null ? f.hashCode() : 0;
        java.lang.Integer num = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5681aB.class != obj.getClass()) {
            return false;
        }
        C5681aB c5681aB = (C5681aB) obj;
        return Intrinsics.EZpvd(this.EZpvd, c5681aB.EZpvd) && Intrinsics.EZpvd(this.copydefault, c5681aB.copydefault) && Intrinsics.copydefault(this.KWHzl, c5681aB.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c5681aB.OLrzqt);
    }

    public static /* synthetic */ C5681aB copy$default(C5681aB c5681aB, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ProtectiveEquipmentPerson$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C5681aB.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C5681aB.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c5681aB);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.aB$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.Integer AEQbTJ;
        public WebViewZygote EZpvd;
        public java.lang.Float KWHzl;
        public java.util.List<C5628aA> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<C5628aA> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C5628aA> KWHzl() {
            return this.OLrzqt;
        }

        public final StateListAnimator OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(WebViewZygote webViewZygote) {
            this.EZpvd = webViewZygote;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C5681aB c5681aB) {
            this();
            Intrinsics.checkNotNullParameter(c5681aB, "");
            this.OLrzqt = c5681aB.OLrzqt();
            this.EZpvd = c5681aB.EZpvd();
            this.KWHzl = c5681aB.copydefault();
            this.AEQbTJ = c5681aB.AEQbTJ();
        }

        public final C5681aB EZpvd() {
            return new C5681aB(this, null);
        }
    }
}
