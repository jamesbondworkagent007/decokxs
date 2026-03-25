package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34331na;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34331na {
    public static final Application copydefault = new Application(null);
    public final java.util.List<C32168mS> AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.na$Activity) A[MD:(o.na$Activity):void (m)] call: o.na.<init>(o.na$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34331na(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C32168mS> copydefault() {
        return this.AEQbTJ;
    }

    public C34331na(Activity activity) {
        java.util.List<C32168mS> listCopydefault = activity.copydefault();
        if (listCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for adapters".toString());
        }
        this.AEQbTJ = listCopydefault;
    }

    /* JADX INFO: renamed from: o.na$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.na.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdaptersConfig(");
        sb.append("adapters=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C34331na.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((C34331na) obj).AEQbTJ);
    }

    public static /* synthetic */ C34331na copy$default(C34331na c34331na, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AdaptersConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34331na.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34331na.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c34331na);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.na$Activity */
    public static final class Activity {
        public java.util.List<C32168mS> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C32168mS> copydefault() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C34331na c34331na) {
            this();
            Intrinsics.checkNotNullParameter(c34331na, "");
            this.EZpvd = c34331na.copydefault();
        }

        public final C34331na AEQbTJ() {
            return new C34331na(this, null);
        }
    }
}
