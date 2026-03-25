package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ErrorCodes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ErrorCodes {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final CommonTimeUtils copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ErrorCodes$Activity) A[MD:(o.ErrorCodes$Activity):void (m)] call: o.ErrorCodes.<init>(o.ErrorCodes$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ErrorCodes(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonTimeUtils AEQbTJ() {
        return this.copydefault;
    }

    public ErrorCodes(Activity activity) {
        this.copydefault = activity.AEQbTJ();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ErrorCodes.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeDocumentClassificationJobResponse(");
        sb.append("documentClassificationJobProperties=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        CommonTimeUtils commonTimeUtils = this.copydefault;
        if (commonTimeUtils != null) {
            return commonTimeUtils.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ErrorCodes.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((ErrorCodes) obj).copydefault);
    }

    public static /* synthetic */ ErrorCodes copy$default(ErrorCodes errorCodes, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DescribeDocumentClassificationJobResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ErrorCodes.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ErrorCodes.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(errorCodes);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public CommonTimeUtils copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CommonTimeUtils AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(CommonTimeUtils commonTimeUtils) {
            this.copydefault = commonTimeUtils;
        }

        public final Activity OLrzqt() {
            return this;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ErrorCodes errorCodes) {
            this();
            Intrinsics.checkNotNullParameter(errorCodes, "");
            this.copydefault = errorCodes.AEQbTJ();
        }

        public final ErrorCodes KWHzl() {
            return new ErrorCodes(this, null);
        }
    }
}
