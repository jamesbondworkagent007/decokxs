package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C44524sT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44524sT {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<C46240tN> AhwBna;
    public final C46697tc EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final C45943tC valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.sT$StateListAnimator) A[MD:(o.sT$StateListAnimator):void (m)] call: o.sT.<init>(o.sT$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C44524sT(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45943tC AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46697tc KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C46240tN> valueOf() {
        return this.AhwBna;
    }

    public C44524sT(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.OLrzqt();
        this.copydefault = stateListAnimator.EZpvd();
        this.EZpvd = stateListAnimator.KWHzl();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.valueOf = stateListAnimator.valueOf();
        this.AhwBna = stateListAnimator.AYXKKw();
    }

    /* JADX INFO: renamed from: o.sT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateParallelDataRequest(");
        sb.append("clientToken=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("encryptionKey=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("parallelDataConfig=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C46697tc c46697tc = this.EZpvd;
        int iHashCode3 = c46697tc != null ? c46697tc.hashCode() : 0;
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        C45943tC c45943tC = this.valueOf;
        int iHashCode5 = c45943tC != null ? c45943tC.hashCode() : 0;
        java.util.List<C46240tN> list = this.AhwBna;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C44524sT.class != obj.getClass()) {
            return false;
        }
        C44524sT c44524sT = (C44524sT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c44524sT.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c44524sT.copydefault) && Intrinsics.EZpvd(this.EZpvd, c44524sT.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c44524sT.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, c44524sT.valueOf) && Intrinsics.EZpvd(this.AhwBna, c44524sT.AhwBna);
    }

    public static /* synthetic */ C44524sT copy$default(C44524sT c44524sT, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.CreateParallelDataRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C44524sT.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C44524sT.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c44524sT);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.sT$StateListAnimator */
    public static final class StateListAnimator {
        public C45943tC AEQbTJ;
        public java.lang.String EZpvd;
        public C46697tc KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<C46240tN> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C46240tN> AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46697tc KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C45943tC valueOf() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C44524sT c44524sT) {
            this();
            Intrinsics.checkNotNullParameter(c44524sT, "");
            this.OLrzqt = c44524sT.OLrzqt();
            this.copydefault = c44524sT.copydefault();
            this.KWHzl = c44524sT.KWHzl();
            this.EZpvd = c44524sT.EZpvd();
            this.AEQbTJ = c44524sT.AEQbTJ();
            this.valueOf = c44524sT.valueOf();
        }

        public final C44524sT copydefault() {
            return new C44524sT(this, null);
        }
    }
}
