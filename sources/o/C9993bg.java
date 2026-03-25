package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C9993bg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9993bg {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final C11108cC KWHzl;
    public final C7662ao copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bg$ActionBar) A[MD:(o.bg$ActionBar):void (m)] call: o.bg.<init>(o.bg$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9993bg(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7662ao EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public C9993bg(ActionBar actionBar) {
        this.AEQbTJ = actionBar.copydefault();
        this.EZpvd = actionBar.EZpvd();
        this.copydefault = actionBar.OLrzqt();
        this.KWHzl = actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.bg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartCelebrityRecognitionRequest(");
        sb.append("clientRequestToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("video=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C7662ao c7662ao = this.copydefault;
        int iHashCode3 = c7662ao != null ? c7662ao.hashCode() : 0;
        C11108cC c11108cC = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c11108cC != null ? c11108cC.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9993bg.class != obj.getClass()) {
            return false;
        }
        C9993bg c9993bg = (C9993bg) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c9993bg.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c9993bg.EZpvd) && Intrinsics.EZpvd(this.copydefault, c9993bg.copydefault) && Intrinsics.EZpvd(this.KWHzl, c9993bg.KWHzl);
    }

    public static /* synthetic */ C9993bg copy$default(C9993bg c9993bg, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartCelebrityRecognitionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9993bg.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9993bg.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c9993bg);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.bg$ActionBar */
    public static final class ActionBar {
        public C7662ao AEQbTJ;
        public C11108cC EZpvd;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7662ao OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C9993bg c9993bg) {
            this();
            Intrinsics.checkNotNullParameter(c9993bg, "");
            this.OLrzqt = c9993bg.copydefault();
            this.copydefault = c9993bg.OLrzqt();
            this.AEQbTJ = c9993bg.EZpvd();
            this.EZpvd = c9993bg.KWHzl();
        }

        public final C9993bg KWHzl() {
            return new C9993bg(this, null);
        }
    }
}
