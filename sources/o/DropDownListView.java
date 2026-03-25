package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DropDownListView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DropDownListView {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.Integer KWHzl;
    public final java.lang.Integer OLrzqt;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DropDownListView$Application) A[MD:(o.DropDownListView$Application):void (m)] call: o.DropDownListView.<init>(o.DropDownListView$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DropDownListView(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.OLrzqt;
    }

    public DropDownListView(Application application) {
        this.AEQbTJ = application.AEQbTJ();
        this.copydefault = application.EZpvd();
        this.OLrzqt = application.OLrzqt();
        this.KWHzl = application.gEmmrt();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DropDownListView.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetStats(");
        sb.append("errorEntries=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("labeledEntries=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("totalEntries=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("totalLabels=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.copydefault;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Integer num3 = this.OLrzqt;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        java.lang.Integer num4 = this.KWHzl;
        return (((((iIntValue * 31) + iIntValue2) * 31) + iIntValue3) * 31) + (num4 != null ? num4.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DropDownListView.class != obj.getClass()) {
            return false;
        }
        DropDownListView dropDownListView = (DropDownListView) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, dropDownListView.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, dropDownListView.copydefault) && Intrinsics.EZpvd(this.OLrzqt, dropDownListView.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, dropDownListView.KWHzl);
    }

    public static /* synthetic */ DropDownListView copy$default(DropDownListView dropDownListView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DatasetStats$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DropDownListView.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DropDownListView.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(dropDownListView);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.lang.Integer AEQbTJ;
        public java.lang.Integer EZpvd;
        public java.lang.Integer KWHzl;
        public java.lang.Integer OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.KWHzl = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.EZpvd = num;
        }

        public final Application copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer gEmmrt() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DropDownListView dropDownListView) {
            this();
            Intrinsics.checkNotNullParameter(dropDownListView, "");
            this.AEQbTJ = dropDownListView.EZpvd();
            this.OLrzqt = dropDownListView.AEQbTJ();
            this.EZpvd = dropDownListView.OLrzqt();
            this.KWHzl = dropDownListView.KWHzl();
        }

        public final DropDownListView KWHzl() {
            return new DropDownListView(this, null);
        }
    }
}
