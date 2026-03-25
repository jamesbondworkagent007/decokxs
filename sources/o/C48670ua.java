package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C48670ua;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48670ua {
    public static final ActionBar copydefault = new ActionBar(null);
    public final C48882ue AEQbTJ;
    public final C48829ud AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<C44548sU> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ua$Activity) A[MD:(o.ua$Activity):void (m)] call: o.ua.<init>(o.ua$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48670ua(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48882ue EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C44548sU> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48829ud OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public C48670ua(Activity activity) {
        this.AEQbTJ = activity.OLrzqt();
        this.OLrzqt = activity.copydefault();
        java.lang.String strAEQbTJ = activity.AEQbTJ();
        if (strAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for sourceLanguageCode".toString());
        }
        this.KWHzl = strAEQbTJ;
        java.lang.String strGEmmrt = activity.gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for targetLanguageCode".toString());
        }
        this.EZpvd = strGEmmrt;
        this.AhwBna = activity.valueOf();
    }

    /* JADX INFO: renamed from: o.ua$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ua.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TranslateDocumentResponse(");
        sb.append("appliedSettings=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("appliedTerminologies=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("targetLanguageCode=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("translatedDocument=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C48882ue c48882ue = this.AEQbTJ;
        int iHashCode = c48882ue != null ? c48882ue.hashCode() : 0;
        java.util.List<C44548sU> list = this.OLrzqt;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        int iHashCode3 = this.KWHzl.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        C48829ud c48829ud = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c48829ud != null ? c48829ud.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C48670ua.class != obj.getClass()) {
            return false;
        }
        C48670ua c48670ua = (C48670ua) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c48670ua.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c48670ua.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48670ua.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c48670ua.EZpvd) && Intrinsics.EZpvd(this.AhwBna, c48670ua.AhwBna);
    }

    public static /* synthetic */ C48670ua copy$default(C48670ua c48670ua, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TranslateDocumentResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C48670ua.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C48670ua.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c48670ua);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.ua$Activity */
    public static final class Activity {
        public C48882ue AEQbTJ;
        public java.lang.String EZpvd;
        public C48829ud KWHzl;
        public java.lang.String OLrzqt;
        public java.util.List<C44548sU> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<C44548sU> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C48829ud c48829ud) {
            this.KWHzl = c48829ud;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd() {
            if (this.EZpvd == null) {
                this.EZpvd = "";
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C48882ue c48882ue) {
            this.AEQbTJ = c48882ue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48882ue OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C44548sU> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48829ud valueOf() {
            return this.KWHzl;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C48670ua c48670ua) {
            this();
            Intrinsics.checkNotNullParameter(c48670ua, "");
            this.AEQbTJ = c48670ua.EZpvd();
            this.copydefault = c48670ua.KWHzl();
            this.EZpvd = c48670ua.AEQbTJ();
            this.OLrzqt = c48670ua.copydefault();
            this.KWHzl = c48670ua.OLrzqt();
        }

        public final C48670ua KWHzl() {
            return new C48670ua(this, null);
        }
    }
}
