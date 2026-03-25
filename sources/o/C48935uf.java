package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C48935uf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48935uf {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<java.lang.String> KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.uf$StateListAnimator) A[MD:(o.uf$StateListAnimator):void (m)] call: o.uf.<init>(o.uf$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48935uf(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.KWHzl;
    }

    public C48935uf(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.KWHzl();
        this.KWHzl = stateListAnimator.OLrzqt();
    }

    /* JADX INFO: renamed from: o.uf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UntagResourceRequest(");
        sb.append("resourceArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tagKeys=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List<java.lang.String> list = this.KWHzl;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C48935uf.class != obj.getClass()) {
            return false;
        }
        C48935uf c48935uf = (C48935uf) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c48935uf.copydefault) && Intrinsics.EZpvd(this.KWHzl, c48935uf.KWHzl);
    }

    public static /* synthetic */ C48935uf copy$default(C48935uf c48935uf, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.UntagResourceRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C48935uf.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C48935uf.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c48935uf);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.uf$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String KWHzl;
        public java.util.List<java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.OLrzqt;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C48935uf c48935uf) {
            this();
            Intrinsics.checkNotNullParameter(c48935uf, "");
            this.KWHzl = c48935uf.EZpvd();
            this.OLrzqt = c48935uf.copydefault();
        }

        public final C48935uf copydefault() {
            return new C48935uf(this, null);
        }
    }
}
