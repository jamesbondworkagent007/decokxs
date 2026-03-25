package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36655of;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36655of {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final C34648ng AEQbTJ;
    public final C34648ng KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.of$Activity) A[MD:(o.of$Activity):void (m)] call: o.of.<init>(o.of$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36655of(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34648ng EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34648ng OLrzqt() {
        return this.KWHzl;
    }

    public C36655of(Activity activity) {
        this.KWHzl = activity.copydefault();
        this.AEQbTJ = activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.of$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.of.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IdentityDocumentField(");
        sb.append("type=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("valueDetection=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C34648ng c34648ng = this.KWHzl;
        int iHashCode = c34648ng != null ? c34648ng.hashCode() : 0;
        C34648ng c34648ng2 = this.AEQbTJ;
        return (iHashCode * 31) + (c34648ng2 != null ? c34648ng2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36655of.class != obj.getClass()) {
            return false;
        }
        C36655of c36655of = (C36655of) obj;
        return Intrinsics.EZpvd(this.KWHzl, c36655of.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c36655of.AEQbTJ);
    }

    public static /* synthetic */ C36655of copy$default(C36655of c36655of, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.IdentityDocumentField$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36655of.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36655of.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c36655of);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.of$Activity */
    public static final class Activity {
        public C34648ng AEQbTJ;
        public C34648ng OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C34648ng c34648ng) {
            this.AEQbTJ = c34648ng;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C34648ng c34648ng) {
            this.OLrzqt = c34648ng;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C34648ng OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C34648ng copydefault() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C36655of c36655of) {
            this();
            Intrinsics.checkNotNullParameter(c36655of, "");
            this.OLrzqt = c36655of.OLrzqt();
            this.AEQbTJ = c36655of.EZpvd();
        }

        public final C36655of AEQbTJ() {
            return new C36655of(this, null);
        }
    }
}
