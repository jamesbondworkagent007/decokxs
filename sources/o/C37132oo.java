package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C37132oo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C37132oo {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.Integer KWHzl;
    public final C5173Hn OLrzqt;
    public final C5173Hn copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oo$StateListAnimator) A[MD:(o.oo$StateListAnimator):void (m)] call: o.oo.<init>(o.oo$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C37132oo(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.OLrzqt;
    }

    public C37132oo(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.KWHzl();
        this.copydefault = stateListAnimator.AEQbTJ();
        this.OLrzqt = stateListAnimator.OLrzqt();
        this.KWHzl = stateListAnimator.copydefault();
        this.AhwBna = stateListAnimator.AYXKKw();
    }

    /* JADX INFO: renamed from: o.oo$ActionBar */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C37132oo OLrzqt(@NotNull Function1<? super StateListAnimator, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            StateListAnimator stateListAnimator = new StateListAnimator();
            function1.invoke(stateListAnimator);
            return stateListAnimator.EZpvd();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListAdapterVersionsRequest(");
        sb.append("adapterId=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("afterCreationTime=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("beforeCreationTime=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.OLrzqt;
        int iHashCode3 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iIntValue) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37132oo.class != obj.getClass()) {
            return false;
        }
        C37132oo c37132oo = (C37132oo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c37132oo.EZpvd) && Intrinsics.EZpvd(this.copydefault, c37132oo.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c37132oo.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c37132oo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c37132oo.AhwBna);
    }

    public static /* synthetic */ C37132oo copy$default(C37132oo c37132oo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.ListAdapterVersionsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C37132oo.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C37132oo.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c37132oo);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.oo$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public C5173Hn AEQbTJ;
        public java.lang.Integer EZpvd;
        public C5173Hn KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C37132oo c37132oo) {
            this();
            Intrinsics.checkNotNullParameter(c37132oo, "");
            this.copydefault = c37132oo.EZpvd();
            this.AEQbTJ = c37132oo.KWHzl();
            this.KWHzl = c37132oo.copydefault();
            this.EZpvd = c37132oo.AEQbTJ();
            this.OLrzqt = c37132oo.OLrzqt();
        }

        public final C37132oo EZpvd() {
            return new C37132oo(this, null);
        }
    }
}
