package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6739aV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C6739aV {
    public static final Application KWHzl = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.Float AhwBna;
    public final java.lang.Integer EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aV$StateListAnimator) A[MD:(o.aV$StateListAnimator):void (m)] call: o.aV.<init>(o.aV$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6739aV(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.AhwBna;
    }

    public C6739aV(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.EZpvd();
        this.copydefault = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.OLrzqt();
        this.AhwBna = stateListAnimator.valueOf();
    }

    /* JADX INFO: renamed from: o.aV$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchUsersRequest(");
        sb.append("collectionId=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("faceId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("maxUsers=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("userId=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userMatchThreshold=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str3 = this.OLrzqt;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.Float f = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + iHashCode3) * 31) + (f != null ? f.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6739aV.class != obj.getClass()) {
            return false;
        }
        C6739aV c6739aV = (C6739aV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c6739aV.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c6739aV.copydefault) && Intrinsics.EZpvd(this.EZpvd, c6739aV.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c6739aV.OLrzqt) && Intrinsics.copydefault(this.AhwBna, c6739aV.AhwBna);
    }

    public static /* synthetic */ C6739aV copy$default(C6739aV c6739aV, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.SearchUsersRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6739aV.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6739aV.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c6739aV);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.aV$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.Integer KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float valueOf() {
            return this.copydefault;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C6739aV c6739aV) {
            this();
            Intrinsics.checkNotNullParameter(c6739aV, "");
            this.EZpvd = c6739aV.EZpvd();
            this.OLrzqt = c6739aV.KWHzl();
            this.KWHzl = c6739aV.OLrzqt();
            this.AEQbTJ = c6739aV.AEQbTJ();
            this.copydefault = c6739aV.copydefault();
        }

        public final C6739aV AEQbTJ() {
            return new C6739aV(this, null);
        }
    }
}
