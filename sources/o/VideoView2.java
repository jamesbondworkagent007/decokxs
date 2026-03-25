package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.VideoView2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class VideoView2 {
    public static final Activity AEQbTJ = new Activity(null);
    public final java.lang.String AYXKKw;
    public final java.util.List<Advanceable> AhwBna;
    public final C11135cD AkhnZx;
    public final java.lang.String EZpvd;
    public final TimePicker KWHzl;
    public final java.lang.String OLrzqt;
    public final AbstractC11162cE copydefault;
    public final C11108cC djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.VideoView2$ActionBar) A[MD:(o.VideoView2$ActionBar):void (m)] call: o.VideoView2.<init>(o.VideoView2$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ VideoView2(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Advanceable> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11135cD AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimePicker EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC11162cE copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public VideoView2(ActionBar actionBar) {
        this.KWHzl = actionBar.EZpvd();
        this.OLrzqt = actionBar.KWHzl();
        this.copydefault = actionBar.AEQbTJ();
        this.EZpvd = actionBar.AhwBna();
        this.AhwBna = actionBar.valueOf();
        this.valueOf = actionBar.djBIcL();
        this.AYXKKw = actionBar.gEmmrt();
        this.gEmmrt = actionBar.AYXKKw();
        this.djBIcL = actionBar.fetchVPNInfo();
        this.AkhnZx = actionBar.AkhnZx();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.VideoView2.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetContentModerationResponse(");
        sb.append("getRequestMetadata=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("moderationLabels=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("moderationModelVersion=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("video=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("videoMetadata=");
        sb2.append(this.AkhnZx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        TimePicker timePicker = this.KWHzl;
        int iHashCode = timePicker != null ? timePicker.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        AbstractC11162cE abstractC11162cE = this.copydefault;
        int iHashCode3 = abstractC11162cE != null ? abstractC11162cE.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.util.List<Advanceable> list = this.AhwBna;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode7 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.gEmmrt;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        C11108cC c11108cC = this.djBIcL;
        int iHashCode9 = c11108cC != null ? c11108cC.hashCode() : 0;
        C11135cD c11135cD = this.AkhnZx;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (c11135cD != null ? c11135cD.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VideoView2.class != obj.getClass()) {
            return false;
        }
        VideoView2 videoView2 = (VideoView2) obj;
        return Intrinsics.EZpvd(this.KWHzl, videoView2.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) videoView2.OLrzqt) && Intrinsics.EZpvd(this.copydefault, videoView2.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) videoView2.EZpvd) && Intrinsics.EZpvd(this.AhwBna, videoView2.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) videoView2.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) videoView2.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) videoView2.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, videoView2.djBIcL) && Intrinsics.EZpvd(this.AkhnZx, videoView2.AkhnZx);
    }

    public static /* synthetic */ VideoView2 copy$default(VideoView2 videoView2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetContentModerationResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull VideoView2.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(VideoView2.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(videoView2);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public java.util.List<Advanceable> AEQbTJ;
        public C11135cD AYXKKw;
        public java.lang.String AhwBna;
        public TimePicker EZpvd;
        public AbstractC11162cE KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public C11108cC gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC11162cE AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(TimePicker timePicker) {
            this.EZpvd = timePicker;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11135cD AkhnZx() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TimePicker EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<Advanceable> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C11108cC c11108cC) {
            this.gEmmrt = c11108cC;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C11135cD c11135cD) {
            this.AYXKKw = c11135cD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC11162cE abstractC11162cE) {
            this.KWHzl = abstractC11162cE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC fetchVPNInfo() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<Advanceable> valueOf() {
            return this.AEQbTJ;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull VideoView2 videoView2) {
            this();
            Intrinsics.checkNotNullParameter(videoView2, "");
            this.EZpvd = videoView2.EZpvd();
            this.OLrzqt = videoView2.OLrzqt();
            this.KWHzl = videoView2.copydefault();
            this.copydefault = videoView2.KWHzl();
            this.AEQbTJ = videoView2.AEQbTJ();
            this.djBIcL = videoView2.gEmmrt();
            this.AhwBna = videoView2.AhwBna();
            this.valueOf = videoView2.valueOf();
            this.gEmmrt = videoView2.djBIcL();
            this.AYXKKw = videoView2.AYXKKw();
        }

        public final VideoView2 copydefault() {
            return new VideoView2(this, null);
        }
    }
}
