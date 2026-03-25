package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5628aA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5628aA {
    public static final Application copydefault = new Application(null);
    public final java.util.List<SimpleExpandableListAdapter> EZpvd;
    public final AbsListView KWHzl;
    public final java.lang.Float OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aA$ActionBar) A[MD:(o.aA$ActionBar):void (m)] call: o.aA.<init>(o.aA$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C5628aA(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbsListView EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SimpleExpandableListAdapter> KWHzl() {
        return this.EZpvd;
    }

    public C5628aA(ActionBar actionBar) {
        this.OLrzqt = actionBar.KWHzl();
        this.EZpvd = actionBar.OLrzqt();
        this.KWHzl = actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.aA$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProtectiveEquipmentBodyPart(");
        sb.append("confidence=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("equipmentDetections=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("name=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.OLrzqt;
        int iHashCode = f != null ? f.hashCode() : 0;
        java.util.List<SimpleExpandableListAdapter> list = this.EZpvd;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        AbsListView absListView = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (absListView != null ? absListView.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5628aA.class != obj.getClass()) {
            return false;
        }
        C5628aA c5628aA = (C5628aA) obj;
        return Intrinsics.copydefault(this.OLrzqt, c5628aA.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c5628aA.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c5628aA.KWHzl);
    }

    public static /* synthetic */ C5628aA copy$default(C5628aA c5628aA, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ProtectiveEquipmentBodyPart$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C5628aA.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C5628aA.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c5628aA);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.aA$ActionBar */
    public static final class ActionBar {
        public java.util.List<SimpleExpandableListAdapter> AEQbTJ;
        public java.lang.Float EZpvd;
        public AbsListView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbsListView AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbsListView absListView) {
            this.copydefault = absListView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SimpleExpandableListAdapter> OLrzqt() {
            return this.AEQbTJ;
        }

        public final ActionBar copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<SimpleExpandableListAdapter> list) {
            this.AEQbTJ = list;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C5628aA c5628aA) {
            this();
            Intrinsics.checkNotNullParameter(c5628aA, "");
            this.EZpvd = c5628aA.AEQbTJ();
            this.AEQbTJ = c5628aA.KWHzl();
            this.copydefault = c5628aA.EZpvd();
        }

        public final C5628aA EZpvd() {
            return new C5628aA(this, null);
        }
    }
}
