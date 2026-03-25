package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PopupWindow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PopupWindow {
    public static final Application EZpvd = new Application(null);
    public final OnDateChangedListener AEQbTJ;
    public final OverScroller KWHzl;
    public final RadialTimePickerView OLrzqt;
    public final java.util.List<SectionIndexer> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PopupWindow$ActionBar) A[MD:(o.PopupWindow$ActionBar):void (m)] call: o.PopupWindow.<init>(o.PopupWindow$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PopupWindow(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnDateChangedListener AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RadialTimePickerView EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OverScroller KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SectionIndexer> copydefault() {
        return this.copydefault;
    }

    public PopupWindow(ActionBar actionBar) {
        this.KWHzl = actionBar.OLrzqt();
        this.copydefault = actionBar.EZpvd();
        this.AEQbTJ = actionBar.copydefault();
        this.OLrzqt = actionBar.AhwBna();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PopupWindow.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectLabelsImageProperties(");
        sb.append("background=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("dominantColors=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("foreground=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("quality=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        OverScroller overScroller = this.KWHzl;
        int iHashCode = overScroller != null ? overScroller.hashCode() : 0;
        java.util.List<SectionIndexer> list = this.copydefault;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        OnDateChangedListener onDateChangedListener = this.AEQbTJ;
        int iHashCode3 = onDateChangedListener != null ? onDateChangedListener.hashCode() : 0;
        RadialTimePickerView radialTimePickerView = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (radialTimePickerView != null ? radialTimePickerView.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PopupWindow.class != obj.getClass()) {
            return false;
        }
        PopupWindow popupWindow = (PopupWindow) obj;
        return Intrinsics.EZpvd(this.KWHzl, popupWindow.KWHzl) && Intrinsics.EZpvd(this.copydefault, popupWindow.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, popupWindow.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, popupWindow.OLrzqt);
    }

    public static /* synthetic */ PopupWindow copy$default(PopupWindow popupWindow, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectLabelsImageProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PopupWindow.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PopupWindow.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(popupWindow);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public java.util.List<SectionIndexer> AEQbTJ;
        public OverScroller EZpvd;
        public OnDateChangedListener KWHzl;
        public RadialTimePickerView OLrzqt;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RadialTimePickerView AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SectionIndexer> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(RadialTimePickerView radialTimePickerView) {
            this.OLrzqt = radialTimePickerView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<SectionIndexer> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OverScroller OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(OnDateChangedListener onDateChangedListener) {
            this.KWHzl = onDateChangedListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnDateChangedListener copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(OverScroller overScroller) {
            this.EZpvd = overScroller;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull PopupWindow popupWindow) {
            this();
            Intrinsics.checkNotNullParameter(popupWindow, "");
            this.EZpvd = popupWindow.KWHzl();
            this.AEQbTJ = popupWindow.copydefault();
            this.KWHzl = popupWindow.AEQbTJ();
            this.OLrzqt = popupWindow.EZpvd();
        }

        public final PopupWindow KWHzl() {
            return new PopupWindow(this, null);
        }
    }
}
