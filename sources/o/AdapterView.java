package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AdapterView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AdapterView {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.Float KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AdapterView$Activity) A[MD:(o.AdapterView$Activity):void (m)] call: o.AdapterView.<init>(o.AdapterView$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AdapterView(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.KWHzl;
    }

    public AdapterView(Activity activity) {
        java.util.List<java.lang.String> listOLrzqt = activity.OLrzqt();
        if (listOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for labels".toString());
        }
        this.OLrzqt = listOLrzqt;
        this.KWHzl = activity.AEQbTJ();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AdapterView.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConnectedHomeSettings(");
        sb.append("labels=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("minConfidence=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.Float f = this.KWHzl;
        return (iHashCode * 31) + (f != null ? f.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdapterView.class != obj.getClass()) {
            return false;
        }
        AdapterView adapterView = (AdapterView) obj;
        return Intrinsics.EZpvd(this.OLrzqt, adapterView.OLrzqt) && Intrinsics.copydefault(this.KWHzl, adapterView.KWHzl);
    }

    public static /* synthetic */ AdapterView copy$default(AdapterView adapterView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ConnectedHomeSettings$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AdapterView.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AdapterView.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(adapterView);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public java.lang.Float EZpvd;
        public java.util.List<java.lang.String> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.KWHzl;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AdapterView adapterView) {
            this();
            Intrinsics.checkNotNullParameter(adapterView, "");
            this.KWHzl = adapterView.AEQbTJ();
            this.EZpvd = adapterView.KWHzl();
        }

        public final AdapterView copydefault() {
            return new AdapterView(this, null);
        }

        public final Activity KWHzl() {
            if (this.KWHzl == null) {
                this.KWHzl = yDY.AhwBna();
            }
            return this;
        }
    }
}
