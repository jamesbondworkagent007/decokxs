package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.FileUriExposedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FileUriExposedException {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.Integer AEQbTJ;
    public final java.util.List<PowerSaveState> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.FileUriExposedException$Activity) A[MD:(o.FileUriExposedException$Activity):void (m)] call: o.FileUriExposedException.<init>(o.FileUriExposedException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FileUriExposedException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PowerSaveState> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.AEQbTJ;
    }

    public FileUriExposedException(Activity activity) {
        this.OLrzqt = activity.EZpvd();
        this.AEQbTJ = activity.KWHzl();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FileUriExposedException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentMetadata(");
        sb.append("extractedCharacters=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("pages=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<PowerSaveState> list = this.OLrzqt;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Integer num = this.AEQbTJ;
        return (iHashCode * 31) + (num != null ? num.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FileUriExposedException.class != obj.getClass()) {
            return false;
        }
        FileUriExposedException fileUriExposedException = (FileUriExposedException) obj;
        return Intrinsics.EZpvd(this.OLrzqt, fileUriExposedException.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, fileUriExposedException.AEQbTJ);
    }

    public static /* synthetic */ FileUriExposedException copy$default(FileUriExposedException fileUriExposedException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DocumentMetadata$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FileUriExposedException.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FileUriExposedException.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(fileUriExposedException);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public java.lang.Integer AEQbTJ;
        public java.util.List<PowerSaveState> copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PowerSaveState> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<PowerSaveState> list) {
            this.copydefault = list;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull FileUriExposedException fileUriExposedException) {
            this();
            Intrinsics.checkNotNullParameter(fileUriExposedException, "");
            this.copydefault = fileUriExposedException.AEQbTJ();
            this.AEQbTJ = fileUriExposedException.OLrzqt();
        }

        public final FileUriExposedException copydefault() {
            return new FileUriExposedException(this, null);
        }
    }
}
