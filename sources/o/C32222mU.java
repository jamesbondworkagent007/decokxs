package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C32222mU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C32222mU {
    public static final Activity AEQbTJ = new Activity(null);
    public final C33684nC EZpvd;
    public final AbstractC33846nI OLrzqt;
    public final C33684nC copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.mU$ActionBar) A[MD:(o.mU$ActionBar):void (m)] call: o.mU.<init>(o.mU$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C32222mU(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33684nC AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC33846nI KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33684nC OLrzqt() {
        return this.EZpvd;
    }

    public C32222mU(ActionBar actionBar) {
        this.copydefault = actionBar.copydefault();
        this.EZpvd = actionBar.KWHzl();
        this.OLrzqt = actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.mU$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdapterVersionEvaluationMetric(");
        sb.append("adapterVersion=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("baseline=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("featureType=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C33684nC c33684nC = this.copydefault;
        int iHashCode = c33684nC != null ? c33684nC.hashCode() : 0;
        C33684nC c33684nC2 = this.EZpvd;
        int iHashCode2 = c33684nC2 != null ? c33684nC2.hashCode() : 0;
        AbstractC33846nI abstractC33846nI = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (abstractC33846nI != null ? abstractC33846nI.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C32222mU.class != obj.getClass()) {
            return false;
        }
        C32222mU c32222mU = (C32222mU) obj;
        return Intrinsics.EZpvd(this.copydefault, c32222mU.copydefault) && Intrinsics.EZpvd(this.EZpvd, c32222mU.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c32222mU.OLrzqt);
    }

    public static /* synthetic */ C32222mU copy$default(C32222mU c32222mU, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AdapterVersionEvaluationMetric$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C32222mU.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C32222mU.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c32222mU);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.mU$ActionBar */
    public static final class ActionBar {
        public C33684nC AEQbTJ;
        public C33684nC EZpvd;
        public AbstractC33846nI copydefault;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C33684nC c33684nC) {
            this.AEQbTJ = c33684nC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC33846nI abstractC33846nI) {
            this.copydefault = abstractC33846nI;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC33846nI EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33684nC KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C33684nC c33684nC) {
            this.EZpvd = c33684nC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33684nC copydefault() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C32222mU c32222mU) {
            this();
            Intrinsics.checkNotNullParameter(c32222mU, "");
            this.EZpvd = c32222mU.AEQbTJ();
            this.AEQbTJ = c32222mU.OLrzqt();
            this.copydefault = c32222mU.KWHzl();
        }

        public final C32222mU OLrzqt() {
            return new C32222mU(this, null);
        }
    }
}
