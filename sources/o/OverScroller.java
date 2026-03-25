package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.OverScroller;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class OverScroller {
    public static final Activity AEQbTJ = new Activity(null);
    public final RadialTimePickerView EZpvd;
    public final java.util.List<SectionIndexer> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.OverScroller$Application) A[MD:(o.OverScroller$Application):void (m)] call: o.OverScroller.<init>(o.OverScroller$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OverScroller(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RadialTimePickerView KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SectionIndexer> copydefault() {
        return this.copydefault;
    }

    public OverScroller(Application application) {
        this.copydefault = application.copydefault();
        this.EZpvd = application.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OverScroller.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectLabelsImageBackground(");
        sb.append("dominantColors=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("quality=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<SectionIndexer> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        RadialTimePickerView radialTimePickerView = this.EZpvd;
        return (iHashCode * 31) + (radialTimePickerView != null ? radialTimePickerView.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OverScroller.class != obj.getClass()) {
            return false;
        }
        OverScroller overScroller = (OverScroller) obj;
        return Intrinsics.EZpvd(this.copydefault, overScroller.copydefault) && Intrinsics.EZpvd(this.EZpvd, overScroller.EZpvd);
    }

    public static /* synthetic */ OverScroller copy$default(OverScroller overScroller, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectLabelsImageBackground$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull OverScroller.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OverScroller.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(overScroller);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public java.util.List<SectionIndexer> AEQbTJ;
        public RadialTimePickerView OLrzqt;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(RadialTimePickerView radialTimePickerView) {
            this.OLrzqt = radialTimePickerView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RadialTimePickerView KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<SectionIndexer> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SectionIndexer> copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull OverScroller overScroller) {
            this();
            Intrinsics.checkNotNullParameter(overScroller, "");
            this.AEQbTJ = overScroller.copydefault();
            this.OLrzqt = overScroller.KWHzl();
        }

        public final OverScroller EZpvd() {
            return new OverScroller(this, null);
        }
    }
}
