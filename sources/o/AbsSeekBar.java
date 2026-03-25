package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbsSeekBar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AbsSeekBar {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final AbstractC7503al AEQbTJ;
    public final AbstractC7503al EZpvd;
    public final AdapterViewAnimator KWHzl;
    public final java.util.List<ActionMenuPresenter> copydefault;
    public final java.util.List<ActionMenuView> gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AbsSeekBar$Application) A[MD:(o.AbsSeekBar$Application):void (m)] call: o.AbsSeekBar.<init>(o.AbsSeekBar$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbsSeekBar(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ActionMenuPresenter> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7503al EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdapterViewAnimator KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7503al OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ActionMenuView> copydefault() {
        return this.gEmmrt;
    }

    public AbsSeekBar(Application application) {
        this.copydefault = application.KWHzl();
        this.KWHzl = application.copydefault();
        this.AEQbTJ = application.OLrzqt();
        this.EZpvd = application.djBIcL();
        this.gEmmrt = application.AYXKKw();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AbsSeekBar.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CompareFacesResponse(");
        sb.append("faceMatches=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("sourceImageFace=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("sourceImageOrientationCorrection=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("targetImageOrientationCorrection=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("unmatchedFaces=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<ActionMenuPresenter> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        AdapterViewAnimator adapterViewAnimator = this.KWHzl;
        int iHashCode2 = adapterViewAnimator != null ? adapterViewAnimator.hashCode() : 0;
        AbstractC7503al abstractC7503al = this.AEQbTJ;
        int iHashCode3 = abstractC7503al != null ? abstractC7503al.hashCode() : 0;
        AbstractC7503al abstractC7503al2 = this.EZpvd;
        int iHashCode4 = abstractC7503al2 != null ? abstractC7503al2.hashCode() : 0;
        java.util.List<ActionMenuView> list2 = this.gEmmrt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AbsSeekBar.class != obj.getClass()) {
            return false;
        }
        AbsSeekBar absSeekBar = (AbsSeekBar) obj;
        return Intrinsics.EZpvd(this.copydefault, absSeekBar.copydefault) && Intrinsics.EZpvd(this.KWHzl, absSeekBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, absSeekBar.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, absSeekBar.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, absSeekBar.gEmmrt);
    }

    public static /* synthetic */ AbsSeekBar copy$default(AbsSeekBar absSeekBar, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CompareFacesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AbsSeekBar.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbsSeekBar.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(absSeekBar);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    public static final class Application {
        public java.util.List<ActionMenuPresenter> AEQbTJ;
        public AbstractC7503al EZpvd;
        public AbstractC7503al KWHzl;
        public AdapterViewAnimator OLrzqt;
        public java.util.List<ActionMenuView> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC7503al abstractC7503al) {
            this.EZpvd = abstractC7503al;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionMenuView> AYXKKw() {
            return this.copydefault;
        }

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<ActionMenuPresenter> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionMenuPresenter> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<ActionMenuView> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7503al OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AbstractC7503al abstractC7503al) {
            this.KWHzl = abstractC7503al;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AdapterViewAnimator copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AdapterViewAnimator adapterViewAnimator) {
            this.OLrzqt = adapterViewAnimator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7503al djBIcL() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbsSeekBar absSeekBar) {
            this();
            Intrinsics.checkNotNullParameter(absSeekBar, "");
            this.AEQbTJ = absSeekBar.AEQbTJ();
            this.OLrzqt = absSeekBar.KWHzl();
            this.KWHzl = absSeekBar.OLrzqt();
            this.EZpvd = absSeekBar.EZpvd();
            this.copydefault = absSeekBar.copydefault();
        }

        public final AbsSeekBar AEQbTJ() {
            return new AbsSeekBar(this, null);
        }
    }
}
