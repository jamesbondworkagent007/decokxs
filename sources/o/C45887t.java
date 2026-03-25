package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C45887t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C45887t {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.util.List<C37768p> AEQbTJ;
    public final java.util.List<C7927at> AYXKKw;
    public final java.lang.Float KWHzl;
    public final java.util.List<C50048v> OLrzqt;
    public final java.util.List<C47965u> copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.t$StateListAnimator) A[MD:(o.t$StateListAnimator):void (m)] call: o.t.<init>(o.t$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C45887t(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C7927at> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C37768p> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C47965u> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C50048v> copydefault() {
        return this.OLrzqt;
    }

    public C45887t(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.EZpvd();
        this.KWHzl = stateListAnimator.AEQbTJ();
        this.AEQbTJ = stateListAnimator.valueOf();
        this.valueOf = stateListAnimator.AYXKKw();
        this.AYXKKw = stateListAnimator.gEmmrt();
    }

    /* JADX INFO: renamed from: o.t$ActionBar */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.t.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Label(");
        sb.append("aliases=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("categories=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("instances=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("parents=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C47965u> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.util.List<C50048v> list2 = this.OLrzqt;
        int iHashCode2 = list2 != null ? list2.hashCode() : 0;
        java.lang.Float f = this.KWHzl;
        int iHashCode3 = f != null ? f.hashCode() : 0;
        java.util.List<C37768p> list3 = this.AEQbTJ;
        int iHashCode4 = list3 != null ? list3.hashCode() : 0;
        java.lang.String str = this.valueOf;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        java.util.List<C7927at> list4 = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C45887t.class != obj.getClass()) {
            return false;
        }
        C45887t c45887t = (C45887t) obj;
        return Intrinsics.EZpvd(this.copydefault, c45887t.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c45887t.OLrzqt) && Intrinsics.copydefault(this.KWHzl, c45887t.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c45887t.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c45887t.valueOf) && Intrinsics.EZpvd(this.AYXKKw, c45887t.AYXKKw);
    }

    public static /* synthetic */ C45887t copy$default(C45887t c45887t, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.Label$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C45887t.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C45887t.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c45887t);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    /* JADX INFO: renamed from: o.t$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.util.List<C7927at> AYXKKw;
        public java.util.List<C47965u> EZpvd;
        public java.util.List<C37768p> KWHzl;
        public java.lang.Float OLrzqt;
        public java.util.List<C50048v> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C50048v> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C7927at> list) {
            this.AYXKKw = list;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C50048v> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C47965u> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C47965u> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C37768p> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C7927at> gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C37768p> valueOf() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C45887t c45887t) {
            this();
            Intrinsics.checkNotNullParameter(c45887t, "");
            this.EZpvd = c45887t.OLrzqt();
            this.copydefault = c45887t.copydefault();
            this.OLrzqt = c45887t.EZpvd();
            this.KWHzl = c45887t.KWHzl();
            this.AEQbTJ = c45887t.AEQbTJ();
            this.AYXKKw = c45887t.AYXKKw();
        }

        public final C45887t OLrzqt() {
            return new C45887t(this, null);
        }
    }
}
