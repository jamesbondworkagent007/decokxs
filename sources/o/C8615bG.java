package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C8615bG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C8615bG {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final C7662ao AEQbTJ;
    public final C11108cC AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final C8509bE copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bG$ActionBar) A[MD:(o.bG$ActionBar):void (m)] call: o.bG.<init>(o.bG$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8615bG(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8509bE KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7662ao copydefault() {
        return this.AEQbTJ;
    }

    public C8615bG(ActionBar actionBar) {
        this.EZpvd = actionBar.copydefault();
        this.copydefault = actionBar.OLrzqt();
        this.OLrzqt = actionBar.KWHzl();
        this.AEQbTJ = actionBar.EZpvd();
        this.AYXKKw = actionBar.AYXKKw();
    }

    /* JADX INFO: renamed from: o.bG$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartTextDetectionRequest(");
        sb.append("clientRequestToken=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("filters=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("video=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        C8509bE c8509bE = this.copydefault;
        int iHashCode2 = c8509bE != null ? c8509bE.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        C7662ao c7662ao = this.AEQbTJ;
        int iHashCode4 = c7662ao != null ? c7662ao.hashCode() : 0;
        C11108cC c11108cC = this.AYXKKw;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c11108cC != null ? c11108cC.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8615bG.class != obj.getClass()) {
            return false;
        }
        C8615bG c8615bG = (C8615bG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c8615bG.EZpvd) && Intrinsics.EZpvd(this.copydefault, c8615bG.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c8615bG.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c8615bG.AEQbTJ) && Intrinsics.EZpvd(this.AYXKKw, c8615bG.AYXKKw);
    }

    public static /* synthetic */ C8615bG copy$default(C8615bG c8615bG, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartTextDetectionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C8615bG.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C8615bG.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c8615bG);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.bG$ActionBar */
    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public C8509bE EZpvd;
        public C11108cC KWHzl;
        public C7662ao OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7662ao EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8509bE OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C8615bG c8615bG) {
            this();
            Intrinsics.checkNotNullParameter(c8615bG, "");
            this.copydefault = c8615bG.AEQbTJ();
            this.EZpvd = c8615bG.KWHzl();
            this.AEQbTJ = c8615bG.EZpvd();
            this.OLrzqt = c8615bG.copydefault();
            this.KWHzl = c8615bG.OLrzqt();
        }

        public final C8615bG AEQbTJ() {
            return new C8615bG(this, null);
        }
    }
}
