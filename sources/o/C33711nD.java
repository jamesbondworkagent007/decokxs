package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C33711nD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33711nD {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.util.List<C33819nH> AEQbTJ;
    public final java.util.List<C37238oq> EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.util.List<C34735ni> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nD$Activity) A[MD:(o.nD$Activity):void (m)] call: o.nD.<init>(o.nD$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C33711nD(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C37238oq> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C34735ni> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C33819nH> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.KWHzl;
    }

    public C33711nD(Activity activity) {
        this.OLrzqt = activity.OLrzqt();
        this.KWHzl = activity.KWHzl();
        this.EZpvd = activity.EZpvd();
        this.AEQbTJ = activity.djBIcL();
    }

    /* JADX INFO: renamed from: o.nD$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExpenseDocument(");
        sb.append("blocks=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("expenseIndex=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("lineItemGroups=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("summaryFields=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C34735ni> list = this.OLrzqt;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.util.List<C37238oq> list2 = this.EZpvd;
        int iHashCode2 = list2 != null ? list2.hashCode() : 0;
        java.util.List<C33819nH> list3 = this.AEQbTJ;
        return (((((iHashCode * 31) + iIntValue) * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33711nD.class != obj.getClass()) {
            return false;
        }
        C33711nD c33711nD = (C33711nD) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c33711nD.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c33711nD.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c33711nD.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c33711nD.AEQbTJ);
    }

    public static /* synthetic */ C33711nD copy$default(C33711nD c33711nD, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.ExpenseDocument$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C33711nD.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C33711nD.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c33711nD);
        function1.invoke(activity);
        return activity.copydefault();
    }

    /* JADX INFO: renamed from: o.nD$Activity */
    public static final class Activity {
        public java.util.List<C33819nH> AEQbTJ;
        public java.lang.Integer EZpvd;
        public java.util.List<C37238oq> KWHzl;
        public java.util.List<C34735ni> copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C37238oq> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C34735ni> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C37238oq> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C34735ni> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C33819nH> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C33819nH> djBIcL() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C33711nD c33711nD) {
            this();
            Intrinsics.checkNotNullParameter(c33711nD, "");
            this.copydefault = c33711nD.KWHzl();
            this.EZpvd = c33711nD.copydefault();
            this.KWHzl = c33711nD.AEQbTJ();
            this.AEQbTJ = c33711nD.OLrzqt();
        }

        public final C33711nD copydefault() {
            return new C33711nD(this, null);
        }
    }
}
