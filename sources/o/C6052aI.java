package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6052aI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C6052aI {
    public static final Application OLrzqt = new Application(null);
    public final java.util.List<AbstractC5999aH> AEQbTJ;
    public final float KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aI$Activity) A[MD:(o.aI$Activity):void (m)] call: o.aI.<init>(o.aI$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6052aI(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC5999aH> copydefault() {
        return this.AEQbTJ;
    }

    public C6052aI(Activity activity) {
        java.lang.Float fOLrzqt = activity.OLrzqt();
        if (fOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for minConfidence".toString());
        }
        this.KWHzl = fOLrzqt.floatValue();
        java.util.List<AbstractC5999aH> listAEQbTJ = activity.AEQbTJ();
        if (listAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for requiredEquipmentTypes".toString());
        }
        this.AEQbTJ = listAEQbTJ;
    }

    /* JADX INFO: renamed from: o.aI$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProtectiveEquipmentSummarizationAttributes(");
        sb.append("minConfidence=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("requiredEquipmentTypes=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6052aI.class == obj.getClass()) {
            C6052aI c6052aI = (C6052aI) obj;
            return this.KWHzl == c6052aI.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c6052aI.AEQbTJ);
        }
        return false;
    }

    public static /* synthetic */ C6052aI copy$default(C6052aI c6052aI, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ProtectiveEquipmentSummarizationAttributes$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6052aI.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6052aI.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c6052aI);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.aI$Activity */
    public static final class Activity {
        public java.util.List<? extends AbstractC5999aH> KWHzl;
        public java.lang.Float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.aH>, java.util.List<o.aH> */
        public final java.util.List<AbstractC5999aH> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C6052aI c6052aI) {
            this();
            Intrinsics.checkNotNullParameter(c6052aI, "");
            this.OLrzqt = java.lang.Float.valueOf(c6052aI.EZpvd());
            this.KWHzl = c6052aI.copydefault();
        }

        public final C6052aI KWHzl() {
            return new C6052aI(this, null);
        }
    }
}
