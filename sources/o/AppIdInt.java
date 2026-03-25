package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AppIdInt;
import o.ArrayRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class AppIdInt {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final ArrayRes EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AppIdInt$Activity) A[MD:(o.AppIdInt$Activity):void (m)] call: o.AppIdInt.<init>(o.AppIdInt$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AppIdInt(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayRes AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    public AppIdInt(Activity activity) {
        java.lang.String strAEQbTJ = activity.AEQbTJ();
        if (strAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for lambdaArn".toString());
        }
        this.KWHzl = strAEQbTJ;
        ArrayRes arrayResOLrzqt = activity.OLrzqt();
        if (arrayResOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for lambdaVersion".toString());
        }
        this.EZpvd = arrayResOLrzqt;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AppIdInt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CustomEmailLambdaVersionConfigType(");
        sb.append("lambdaArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("lambdaVersion=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AppIdInt.class != obj.getClass()) {
            return false;
        }
        AppIdInt appIdInt = (AppIdInt) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) appIdInt.KWHzl) && Intrinsics.EZpvd(this.EZpvd, appIdInt.EZpvd);
    }

    public static /* synthetic */ AppIdInt copy$default(AppIdInt appIdInt, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CustomEmailLambdaVersionConfigType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AppIdInt.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AppIdInt.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(appIdInt);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public ArrayRes AEQbTJ;
        public java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayRes OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(ArrayRes arrayRes) {
            this.AEQbTJ = arrayRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AppIdInt appIdInt) {
            this();
            Intrinsics.checkNotNullParameter(appIdInt, "");
            this.EZpvd = appIdInt.EZpvd();
            this.AEQbTJ = appIdInt.AEQbTJ();
        }

        public final AppIdInt EZpvd() {
            return new AppIdInt(this, null);
        }

        public final Activity KWHzl() {
            if (this.EZpvd == null) {
                this.EZpvd = "";
            }
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new ArrayRes.TaskDescription("no value provided");
            }
            return this;
        }
    }
}
