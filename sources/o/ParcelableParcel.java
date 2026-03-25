package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ParcelableParcel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ParcelableParcel {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.lang.String AYXKKw;
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final OnObbStateChangeListener OLrzqt;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ParcelableParcel$Application) A[MD:(o.ParcelableParcel$Application):void (m)] call: o.ParcelableParcel.<init>(o.ParcelableParcel$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ParcelableParcel(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnObbStateChangeListener AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AYXKKw;
    }

    public ParcelableParcel(Application application) {
        this.EZpvd = application.AEQbTJ();
        this.KWHzl = application.copydefault();
        this.OLrzqt = application.OLrzqt();
        this.copydefault = application.valueOf();
        this.AYXKKw = application.AYXKKw();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ParcelableParcel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntityRecognizerSummary(");
        sb.append("latestVersionCreatedAt=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("latestVersionName=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("latestVersionStatus=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("numberOfVersions=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("recognizerName=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        OnObbStateChangeListener onObbStateChangeListener = this.OLrzqt;
        int iHashCode3 = onObbStateChangeListener != null ? onObbStateChangeListener.hashCode() : 0;
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.AYXKKw;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iIntValue) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParcelableParcel.class != obj.getClass()) {
            return false;
        }
        ParcelableParcel parcelableParcel = (ParcelableParcel) obj;
        return Intrinsics.EZpvd(this.EZpvd, parcelableParcel.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) parcelableParcel.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, parcelableParcel.OLrzqt) && Intrinsics.EZpvd(this.copydefault, parcelableParcel.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) parcelableParcel.AYXKKw);
    }

    public static /* synthetic */ ParcelableParcel copy$default(ParcelableParcel parcelableParcel, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntityRecognizerSummary$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ParcelableParcel.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ParcelableParcel.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(parcelableParcel);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public OnObbStateChangeListener KWHzl;
        public java.lang.Integer OLrzqt;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AEQbTJ;
        }

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnObbStateChangeListener OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(OnObbStateChangeListener onObbStateChangeListener) {
            this.KWHzl = onObbStateChangeListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer valueOf() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ParcelableParcel parcelableParcel) {
            this();
            Intrinsics.checkNotNullParameter(parcelableParcel, "");
            this.copydefault = parcelableParcel.OLrzqt();
            this.EZpvd = parcelableParcel.KWHzl();
            this.KWHzl = parcelableParcel.AEQbTJ();
            this.OLrzqt = parcelableParcel.EZpvd();
            this.AEQbTJ = parcelableParcel.copydefault();
        }

        public final ParcelableParcel KWHzl() {
            return new ParcelableParcel(this, null);
        }
    }
}
