package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.OnDateChangedListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class OnDateChangedListener {
    public static final Activity OLrzqt = new Activity(null);
    public final java.util.List<SectionIndexer> AEQbTJ;
    public final RadialTimePickerView KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.OnDateChangedListener$Application) A[MD:(o.OnDateChangedListener$Application):void (m)] call: o.OnDateChangedListener.<init>(o.OnDateChangedListener$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OnDateChangedListener(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SectionIndexer> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RadialTimePickerView OLrzqt() {
        return this.KWHzl;
    }

    public OnDateChangedListener(Application application) {
        this.AEQbTJ = application.OLrzqt();
        this.KWHzl = application.copydefault();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OnDateChangedListener.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectLabelsImageForeground(");
        sb.append("dominantColors=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("quality=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<SectionIndexer> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        RadialTimePickerView radialTimePickerView = this.KWHzl;
        return (iHashCode * 31) + (radialTimePickerView != null ? radialTimePickerView.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OnDateChangedListener.class != obj.getClass()) {
            return false;
        }
        OnDateChangedListener onDateChangedListener = (OnDateChangedListener) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, onDateChangedListener.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, onDateChangedListener.KWHzl);
    }

    public static /* synthetic */ OnDateChangedListener copy$default(OnDateChangedListener onDateChangedListener, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectLabelsImageForeground$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull OnDateChangedListener.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OnDateChangedListener.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(onDateChangedListener);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public RadialTimePickerView KWHzl;
        public java.util.List<SectionIndexer> OLrzqt;

        public final Application KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SectionIndexer> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(RadialTimePickerView radialTimePickerView) {
            this.KWHzl = radialTimePickerView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RadialTimePickerView copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<SectionIndexer> list) {
            this.OLrzqt = list;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull OnDateChangedListener onDateChangedListener) {
            this();
            Intrinsics.checkNotNullParameter(onDateChangedListener, "");
            this.OLrzqt = onDateChangedListener.EZpvd();
            this.KWHzl = onDateChangedListener.OLrzqt();
        }

        public final OnDateChangedListener EZpvd() {
            return new OnDateChangedListener(this, null);
        }
    }
}
