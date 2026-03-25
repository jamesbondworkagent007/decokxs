package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48829ud;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48829ud {
    public static final Activity copydefault = new Activity(null);
    public final byte[] OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ud$StateListAnimator) A[MD:(o.ud$StateListAnimator):void (m)] call: o.ud.<init>(o.ud$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48829ud(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] KWHzl() {
        return this.OLrzqt;
    }

    public C48829ud(StateListAnimator stateListAnimator) {
        byte[] bArrAEQbTJ = stateListAnimator.AEQbTJ();
        if (bArrAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for content".toString());
        }
        this.OLrzqt = bArrAEQbTJ;
    }

    /* JADX INFO: renamed from: o.ud$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ud.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "TranslatedDocument(content=*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.OLrzqt);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C48829ud.class != obj.getClass()) {
            return false;
        }
        C48829ud c48829ud = (C48829ud) obj;
        byte[] bArr = this.OLrzqt;
        if (bArr != null) {
            byte[] bArr2 = c48829ud.OLrzqt;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (c48829ud.OLrzqt != null) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ C48829ud copy$default(C48829ud c48829ud, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TranslatedDocument$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C48829ud.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C48829ud.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c48829ud);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    /* JADX INFO: renamed from: o.ud$StateListAnimator */
    public static final class StateListAnimator {
        public byte[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(byte[] bArr) {
            this.KWHzl = bArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault() {
            if (this.KWHzl == null) {
                this.KWHzl = new byte[0];
            }
            return this;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C48829ud c48829ud) {
            this();
            Intrinsics.checkNotNullParameter(c48829ud, "");
            this.KWHzl = c48829ud.KWHzl();
        }

        public final C48829ud KWHzl() {
            return new C48829ud(this, null);
        }
    }
}
