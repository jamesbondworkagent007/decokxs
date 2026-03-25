package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C33954nM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33954nM {
    public static final Activity OLrzqt = new Activity(null);
    public final java.util.List<C37556ow> EZpvd;
    public final C35000nn copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nM$ActionBar) A[MD:(o.nM$ActionBar):void (m)] call: o.nM.<init>(o.nM$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C33954nM(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C37556ow> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35000nn EZpvd() {
        return this.copydefault;
    }

    public C33954nM(ActionBar actionBar) {
        this.copydefault = actionBar.EZpvd();
        this.EZpvd = actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.nM$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Geometry(");
        sb.append("boundingBox=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("polygon=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C35000nn c35000nn = this.copydefault;
        int iHashCode = c35000nn != null ? c35000nn.hashCode() : 0;
        java.util.List<C37556ow> list = this.EZpvd;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33954nM.class != obj.getClass()) {
            return false;
        }
        C33954nM c33954nM = (C33954nM) obj;
        return Intrinsics.EZpvd(this.copydefault, c33954nM.copydefault) && Intrinsics.EZpvd(this.EZpvd, c33954nM.EZpvd);
    }

    public static /* synthetic */ C33954nM copy$default(C33954nM c33954nM, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.Geometry$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C33954nM.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C33954nM.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c33954nM);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.nM$ActionBar */
    public static final class ActionBar {
        public C35000nn OLrzqt;
        public java.util.List<C37556ow> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35000nn EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C35000nn c35000nn) {
            this.OLrzqt = c35000nn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C37556ow> OLrzqt() {
            return this.copydefault;
        }

        public final ActionBar copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C37556ow> list) {
            this.copydefault = list;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C33954nM c33954nM) {
            this();
            Intrinsics.checkNotNullParameter(c33954nM, "");
            this.OLrzqt = c33954nM.EZpvd();
            this.copydefault = c33954nM.AEQbTJ();
        }

        public final C33954nM KWHzl() {
            return new C33954nM(this, null);
        }
    }
}
