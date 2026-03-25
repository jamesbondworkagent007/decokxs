package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.LayoutAnimationController;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LayoutAnimationController {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final AccessibilityCache AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final AutofillManager AkhnZx;
    public final RotateAnimation DbNXlk;
    public final C5173Hn EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final AccelerateInterpolator OLrzqt;
    public final int djBIcL;
    public final TranslateYAnimation fARcdN;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final DecelerateInterpolator valueOf;
    public final java.util.List<CycleInterpolator> values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LayoutAnimationController$TaskDescription) A[MD:(o.LayoutAnimationController$TaskDescription):void (m)] call: o.LayoutAnimationController.<init>(o.LayoutAnimationController$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LayoutAnimationController(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TranslateYAnimation AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutofillManager DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DecelerateInterpolator EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccessibilityCache OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccelerateInterpolator copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CycleInterpolator> valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RotateAnimation values() {
        return this.DbNXlk;
    }

    public LayoutAnimationController(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.OLrzqt();
        this.AEQbTJ = taskDescription.EZpvd();
        this.OLrzqt = taskDescription.copydefault();
        this.KWHzl = taskDescription.AhwBna();
        this.valueOf = taskDescription.djBIcL();
        this.gEmmrt = taskDescription.valueOf();
        this.djBIcL = taskDescription.gEmmrt();
        this.AhwBna = taskDescription.AYXKKw();
        this.AYXKKw = taskDescription.values();
        this.values = taskDescription.DbNXlk();
        this.isConnected = taskDescription.fetchVPNInfo();
        this.DbNXlk = taskDescription.AkhnZx();
        this.fetchVPNInfo = taskDescription.isConnected();
        this.AkhnZx = taskDescription.fJNWhG();
        this.fARcdN = taskDescription.fIwbmz();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LayoutAnimationController.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SynthesisTask(");
        sb.append("creationTime=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("engine=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("lexiconNames=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("outputFormat=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("outputUri=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("requestCharacters=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("sampleRate=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("snsTopicArn=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("speechMarkTypes=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("taskId=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("taskStatus=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("taskStatusReason=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("textType=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("voiceId=");
        sb2.append(this.fARcdN);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        AccessibilityCache accessibilityCache = this.AEQbTJ;
        int iHashCode2 = accessibilityCache != null ? accessibilityCache.hashCode() : 0;
        AccelerateInterpolator accelerateInterpolator = this.OLrzqt;
        int iHashCode3 = accelerateInterpolator != null ? accelerateInterpolator.hashCode() : 0;
        java.util.List<java.lang.String> list = this.KWHzl;
        int iHashCode4 = list != null ? list.hashCode() : 0;
        DecelerateInterpolator decelerateInterpolator = this.valueOf;
        int iHashCode5 = decelerateInterpolator != null ? decelerateInterpolator.hashCode() : 0;
        java.lang.String str = this.gEmmrt;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        int i = this.djBIcL;
        java.lang.String str2 = this.AhwBna;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AYXKKw;
        int iHashCode8 = str3 != null ? str3.hashCode() : 0;
        java.util.List<CycleInterpolator> list2 = this.values;
        int iHashCode9 = list2 != null ? list2.hashCode() : 0;
        java.lang.String str4 = this.isConnected;
        int iHashCode10 = str4 != null ? str4.hashCode() : 0;
        RotateAnimation rotateAnimation = this.DbNXlk;
        int iHashCode11 = rotateAnimation != null ? rotateAnimation.hashCode() : 0;
        java.lang.String str5 = this.fetchVPNInfo;
        int iHashCode12 = str5 != null ? str5.hashCode() : 0;
        AutofillManager autofillManager = this.AkhnZx;
        int iHashCode13 = autofillManager != null ? autofillManager.hashCode() : 0;
        TranslateYAnimation translateYAnimation = this.fARcdN;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + i) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (translateYAnimation != null ? translateYAnimation.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LayoutAnimationController.class != obj.getClass()) {
            return false;
        }
        LayoutAnimationController layoutAnimationController = (LayoutAnimationController) obj;
        return Intrinsics.EZpvd(this.EZpvd, layoutAnimationController.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, layoutAnimationController.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, layoutAnimationController.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, layoutAnimationController.KWHzl) && Intrinsics.EZpvd(this.valueOf, layoutAnimationController.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) layoutAnimationController.gEmmrt) && this.djBIcL == layoutAnimationController.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) layoutAnimationController.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) layoutAnimationController.AYXKKw) && Intrinsics.EZpvd(this.values, layoutAnimationController.values) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) layoutAnimationController.isConnected) && Intrinsics.EZpvd(this.DbNXlk, layoutAnimationController.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) layoutAnimationController.fetchVPNInfo) && Intrinsics.EZpvd(this.AkhnZx, layoutAnimationController.AkhnZx) && Intrinsics.EZpvd(this.fARcdN, layoutAnimationController.fARcdN);
    }

    public static /* synthetic */ LayoutAnimationController copy$default(LayoutAnimationController layoutAnimationController, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.SynthesisTask$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LayoutAnimationController.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LayoutAnimationController.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(layoutAnimationController);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    public static final class TaskDescription {
        public DecelerateInterpolator AEQbTJ;
        public java.util.List<? extends CycleInterpolator> AYXKKw;
        public java.lang.String AhwBna;
        public AutofillManager AkhnZx;
        public java.lang.String DbNXlk;
        public C5173Hn EZpvd;
        public AccessibilityCache KWHzl;
        public java.util.List<java.lang.String> OLrzqt;
        public AccelerateInterpolator copydefault;
        public int djBIcL;
        public TranslateYAnimation fetchVPNInfo;
        public java.lang.String gEmmrt;
        public java.lang.String isConnected;
        public java.lang.String valueOf;
        public RotateAnimation values;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(DecelerateInterpolator decelerateInterpolator) {
            this.AEQbTJ = decelerateInterpolator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(TranslateYAnimation translateYAnimation) {
            this.fetchVPNInfo = translateYAnimation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RotateAnimation AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.CycleInterpolator>, java.util.List<o.CycleInterpolator> */
        public final java.util.List<CycleInterpolator> DbNXlk() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccessibilityCache EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AccessibilityCache accessibilityCache) {
            this.KWHzl = accessibilityCache;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AutofillManager autofillManager) {
            this.AkhnZx = autofillManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.djBIcL = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<? extends CycleInterpolator> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AccelerateInterpolator accelerateInterpolator) {
            this.copydefault = accelerateInterpolator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(RotateAnimation rotateAnimation) {
            this.values = rotateAnimation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccelerateInterpolator copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DecelerateInterpolator djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TranslateYAnimation fIwbmz() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AutofillManager fJNWhG() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.valueOf;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull LayoutAnimationController layoutAnimationController) {
            this();
            Intrinsics.checkNotNullParameter(layoutAnimationController, "");
            this.EZpvd = layoutAnimationController.KWHzl();
            this.KWHzl = layoutAnimationController.OLrzqt();
            this.copydefault = layoutAnimationController.copydefault();
            this.OLrzqt = layoutAnimationController.AEQbTJ();
            this.AEQbTJ = layoutAnimationController.EZpvd();
            this.gEmmrt = layoutAnimationController.djBIcL();
            this.djBIcL = layoutAnimationController.AYXKKw();
            this.AhwBna = layoutAnimationController.AhwBna();
            this.valueOf = layoutAnimationController.gEmmrt();
            this.AYXKKw = layoutAnimationController.valueOf();
            this.isConnected = layoutAnimationController.isConnected();
            this.values = layoutAnimationController.values();
            this.DbNXlk = layoutAnimationController.fetchVPNInfo();
            this.AkhnZx = layoutAnimationController.DbNXlk();
            this.fetchVPNInfo = layoutAnimationController.AkhnZx();
        }

        public final LayoutAnimationController KWHzl() {
            return new LayoutAnimationController(this, null);
        }
    }
}
