package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C37026om;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C37026om {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.String KWHzl;
    public final java.util.List<C32303mX> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.om$Activity) A[MD:(o.om$Activity):void (m)] call: o.om.<init>(o.om$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C37026om(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C32303mX> copydefault() {
        return this.OLrzqt;
    }

    public C37026om(Activity activity) {
        this.OLrzqt = activity.AEQbTJ();
        this.KWHzl = activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.om$ActionBar */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.om.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListAdapterVersionsResponse(");
        sb.append("adapterVersions=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C32303mX> list = this.OLrzqt;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37026om.class != obj.getClass()) {
            return false;
        }
        C37026om c37026om = (C37026om) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c37026om.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c37026om.KWHzl);
    }

    public static /* synthetic */ C37026om copy$default(C37026om c37026om, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.ListAdapterVersionsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C37026om.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C37026om.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c37026om);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.om$Activity */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        public java.util.List<C32303mX> EZpvd;
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C32303mX> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        public final Activity copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C32303mX> list) {
            this.EZpvd = list;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C37026om c37026om) {
            this();
            Intrinsics.checkNotNullParameter(c37026om, "");
            this.EZpvd = c37026om.copydefault();
            this.KWHzl = c37026om.AEQbTJ();
        }

        public final C37026om KWHzl() {
            return new C37026om(this, null);
        }
    }
}
