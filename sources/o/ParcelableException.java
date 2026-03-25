package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ParcelableException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ParcelableException {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.lang.Integer AEQbTJ;
    public final java.util.List<ParcelFormatException> EZpvd;
    public final ParcelFileDescriptor KWHzl;
    public final java.lang.Integer OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ParcelableException$Activity) A[MD:(o.ParcelableException$Activity):void (m)] call: o.ParcelableException.<init>(o.ParcelableException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ParcelableException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ParcelFormatException> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParcelFileDescriptor copydefault() {
        return this.KWHzl;
    }

    public ParcelableException(Activity activity) {
        this.EZpvd = activity.AEQbTJ();
        this.KWHzl = activity.KWHzl();
        this.OLrzqt = activity.OLrzqt();
        this.AEQbTJ = activity.gEmmrt();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ParcelableException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "EntityRecognizerMetadata(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        java.util.List<ParcelFormatException> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        ParcelFileDescriptor parcelFileDescriptor = this.KWHzl;
        int iHashCode2 = parcelFileDescriptor != null ? parcelFileDescriptor.hashCode() : 0;
        java.lang.Integer num = this.OLrzqt;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + (num2 != null ? num2.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParcelableException.class != obj.getClass()) {
            return false;
        }
        ParcelableException parcelableException = (ParcelableException) obj;
        return Intrinsics.EZpvd(this.EZpvd, parcelableException.EZpvd) && Intrinsics.EZpvd(this.KWHzl, parcelableException.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, parcelableException.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, parcelableException.AEQbTJ);
    }

    public static /* synthetic */ ParcelableException copy$default(ParcelableException parcelableException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntityRecognizerMetadata$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ParcelableException.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ParcelableException.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(parcelableException);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public java.util.List<ParcelFormatException> AEQbTJ;
        public java.lang.Integer EZpvd;
        public ParcelFileDescriptor KWHzl;
        public java.lang.Integer OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ParcelFormatException> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ParcelFileDescriptor KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<ParcelFormatException> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(ParcelFileDescriptor parcelFileDescriptor) {
            this.KWHzl = parcelFileDescriptor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer gEmmrt() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ParcelableException parcelableException) {
            this();
            Intrinsics.checkNotNullParameter(parcelableException, "");
            this.AEQbTJ = parcelableException.OLrzqt();
            this.KWHzl = parcelableException.copydefault();
            this.OLrzqt = parcelableException.EZpvd();
            this.EZpvd = parcelableException.KWHzl();
        }

        public final ParcelableException copydefault() {
            return new ParcelableException(this, null);
        }
    }
}
