package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C46803te;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46803te {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final byte[] AEQbTJ;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.te$StateListAnimator) A[MD:(o.te$StateListAnimator):void (m)] call: o.te.<init>(o.te$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46803te(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    public C46803te(StateListAnimator stateListAnimator) {
        byte[] bArrOLrzqt = stateListAnimator.OLrzqt();
        if (bArrOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for content".toString());
        }
        this.AEQbTJ = bArrOLrzqt;
        java.lang.String strEZpvd = stateListAnimator.EZpvd();
        if (strEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for contentType".toString());
        }
        this.copydefault = strEZpvd;
    }

    /* JADX INFO: renamed from: o.te$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.te.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Document(");
        sb.append("content=*** Sensitive Data Redacted ***,");
        sb.append("contentType=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46803te.class != obj.getClass()) {
            return false;
        }
        C46803te c46803te = (C46803te) obj;
        byte[] bArr = this.AEQbTJ;
        if (bArr != null) {
            byte[] bArr2 = c46803te.AEQbTJ;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (c46803te.AEQbTJ != null) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46803te.copydefault);
    }

    public static /* synthetic */ C46803te copy$default(C46803te c46803te, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.Document$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46803te.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46803te.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c46803te);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.te$StateListAnimator */
    public static final class StateListAnimator {
        public byte[] KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] OLrzqt() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C46803te c46803te) {
            this();
            Intrinsics.checkNotNullParameter(c46803te, "");
            this.KWHzl = c46803te.AEQbTJ();
            this.copydefault = c46803te.KWHzl();
        }

        public final C46803te copydefault() {
            return new C46803te(this, null);
        }
    }
}
