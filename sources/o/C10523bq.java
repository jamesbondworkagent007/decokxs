package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C10523bq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C10523bq {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final C7662ao AYXKKw;
    public final C52129w AhwBna;
    public final java.util.List<AbstractC54210x> EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Float copydefault;
    public final C11108cC djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bq$ActionBar) A[MD:(o.bq$ActionBar):void (m)] call: o.bq.<init>(o.bq$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10523bq(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7662ao AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC54210x> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52129w valueOf() {
        return this.AhwBna;
    }

    public C10523bq(ActionBar actionBar) {
        this.AEQbTJ = actionBar.copydefault();
        this.EZpvd = actionBar.AEQbTJ();
        this.KWHzl = actionBar.EZpvd();
        this.copydefault = actionBar.KWHzl();
        this.AYXKKw = actionBar.AYXKKw();
        this.AhwBna = actionBar.djBIcL();
        this.djBIcL = actionBar.AhwBna();
    }

    /* JADX INFO: renamed from: o.bq$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bq.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartLabelDetectionRequest(");
        sb.append("clientRequestToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("features=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("minConfidence=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("settings=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("video=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List<AbstractC54210x> list = this.EZpvd;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.Float f = this.copydefault;
        int iHashCode4 = f != null ? f.hashCode() : 0;
        C7662ao c7662ao = this.AYXKKw;
        int iHashCode5 = c7662ao != null ? c7662ao.hashCode() : 0;
        C52129w c52129w = this.AhwBna;
        int iHashCode6 = c52129w != null ? c52129w.hashCode() : 0;
        C11108cC c11108cC = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (c11108cC != null ? c11108cC.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10523bq.class != obj.getClass()) {
            return false;
        }
        C10523bq c10523bq = (C10523bq) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c10523bq.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c10523bq.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c10523bq.KWHzl) && Intrinsics.copydefault(this.copydefault, c10523bq.copydefault) && Intrinsics.EZpvd(this.AYXKKw, c10523bq.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c10523bq.AhwBna) && Intrinsics.EZpvd(this.djBIcL, c10523bq.djBIcL);
    }

    public static /* synthetic */ C10523bq copy$default(C10523bq c10523bq, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartLabelDetectionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C10523bq.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C10523bq.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c10523bq);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.bq$ActionBar */
    public static final class ActionBar {
        public C7662ao AEQbTJ;
        public C11108cC AYXKKw;
        public java.util.List<? extends AbstractC54210x> EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Float OLrzqt;
        public java.lang.String copydefault;
        public C52129w valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.x>, java.util.List<o.x> */
        public final java.util.List<AbstractC54210x> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7662ao AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52129w djBIcL() {
            return this.valueOf;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C10523bq c10523bq) {
            this();
            Intrinsics.checkNotNullParameter(c10523bq, "");
            this.KWHzl = c10523bq.OLrzqt();
            this.EZpvd = c10523bq.copydefault();
            this.copydefault = c10523bq.KWHzl();
            this.OLrzqt = c10523bq.EZpvd();
            this.AEQbTJ = c10523bq.AEQbTJ();
            this.valueOf = c10523bq.valueOf();
            this.AYXKKw = c10523bq.AhwBna();
        }

        public final C10523bq OLrzqt() {
            return new C10523bq(this, null);
        }
    }
}
