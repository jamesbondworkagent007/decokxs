package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5893aF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5893aF {
    public static final Application EZpvd = new Application(null);
    public final java.util.List<java.lang.Integer> AEQbTJ;
    public final java.util.List<java.lang.Integer> KWHzl;
    public final java.util.List<java.lang.Integer> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aF$Activity) A[MD:(o.aF$Activity):void (m)] call: o.aF.<init>(o.aF$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C5893aF(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> copydefault() {
        return this.KWHzl;
    }

    public C5893aF(Activity activity) {
        this.copydefault = activity.EZpvd();
        this.AEQbTJ = activity.OLrzqt();
        this.KWHzl = activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.aF$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProtectiveEquipmentSummary(");
        sb.append("personsIndeterminate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("personsWithRequiredEquipment=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("personsWithoutRequiredEquipment=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<java.lang.Integer> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.util.List<java.lang.Integer> list2 = this.AEQbTJ;
        int iHashCode2 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.Integer> list3 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5893aF.class != obj.getClass()) {
            return false;
        }
        C5893aF c5893aF = (C5893aF) obj;
        return Intrinsics.EZpvd(this.copydefault, c5893aF.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c5893aF.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c5893aF.KWHzl);
    }

    public static /* synthetic */ C5893aF copy$default(C5893aF c5893aF, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ProtectiveEquipmentSummary$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C5893aF.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C5893aF.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c5893aF);
        function1.invoke(activity);
        return activity.copydefault();
    }

    /* JADX INFO: renamed from: o.aF$Activity */
    public static final class Activity {
        public java.util.List<java.lang.Integer> EZpvd;
        public java.util.List<java.lang.Integer> OLrzqt;
        public java.util.List<java.lang.Integer> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.Integer> list) {
            this.EZpvd = list;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<java.lang.Integer> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<java.lang.Integer> list) {
            this.OLrzqt = list;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C5893aF c5893aF) {
            this();
            Intrinsics.checkNotNullParameter(c5893aF, "");
            this.OLrzqt = c5893aF.EZpvd();
            this.EZpvd = c5893aF.OLrzqt();
            this.copydefault = c5893aF.copydefault();
        }

        public final C5893aF copydefault() {
            return new C5893aF(this, null);
        }
    }
}
