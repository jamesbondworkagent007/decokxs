package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DexLoadReporter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DexLoadReporter {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.util.List<RequiresFeature> AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DexLoadReporter$Activity) A[MD:(o.DexLoadReporter$Activity):void (m)] call: o.DexLoadReporter.<init>(o.DexLoadReporter$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DexLoadReporter(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<RequiresFeature> KWHzl() {
        return this.AEQbTJ;
    }

    public DexLoadReporter(Activity activity) {
        this.AEQbTJ = activity.KWHzl();
        this.OLrzqt = activity.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DexLoadReporter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListDevicesResponse(");
        sb.append("devices=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("paginationToken=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<RequiresFeature> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DexLoadReporter.class != obj.getClass()) {
            return false;
        }
        DexLoadReporter dexLoadReporter = (DexLoadReporter) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, dexLoadReporter.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dexLoadReporter.OLrzqt);
    }

    public static /* synthetic */ DexLoadReporter copy$default(DexLoadReporter dexLoadReporter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ListDevicesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DexLoadReporter.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DexLoadReporter.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(dexLoadReporter);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Activity {
        public java.util.List<RequiresFeature> AEQbTJ;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<RequiresFeature> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<RequiresFeature> KWHzl() {
            return this.AEQbTJ;
        }

        public final Activity copydefault() {
            return this;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull DexLoadReporter dexLoadReporter) {
            this();
            Intrinsics.checkNotNullParameter(dexLoadReporter, "");
            this.AEQbTJ = dexLoadReporter.KWHzl();
            this.OLrzqt = dexLoadReporter.AEQbTJ();
        }

        public final DexLoadReporter EZpvd() {
            return new DexLoadReporter(this, null);
        }
    }
}
