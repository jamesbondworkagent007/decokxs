package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5173Hn;
import o.OnEditorActionListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OnEditorActionListener {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.OnEditorActionListener$Activity) A[MD:(o.OnEditorActionListener$Activity):void (m)] call: o.OnEditorActionListener.<init>(o.OnEditorActionListener$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OnEditorActionListener(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public OnEditorActionListener(Activity activity) {
        java.lang.String strOLrzqt = activity.OLrzqt();
        if (strOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for accessKeyId".toString());
        }
        this.copydefault = strOLrzqt;
        C5173Hn c5173HnCopydefault = activity.copydefault();
        if (c5173HnCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for expiration".toString());
        }
        this.AEQbTJ = c5173HnCopydefault;
        java.lang.String strKWHzl = activity.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for secretAccessKey".toString());
        }
        this.KWHzl = strKWHzl;
        java.lang.String strAhwBna = activity.AhwBna();
        if (strAhwBna == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for sessionToken".toString());
        }
        this.EZpvd = strAhwBna;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OnEditorActionListener.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Credentials(");
        sb.append("accessKeyId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("expiration=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("secretAccessKey=*** Sensitive Data Redacted ***,");
        sb.append("sessionToken=" + this.EZpvd);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        return (((((iHashCode * 31) + iHashCode2) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OnEditorActionListener.class != obj.getClass()) {
            return false;
        }
        OnEditorActionListener onEditorActionListener = (OnEditorActionListener) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) onEditorActionListener.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, onEditorActionListener.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) onEditorActionListener.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) onEditorActionListener.EZpvd);
    }

    public static /* synthetic */ OnEditorActionListener copy$default(OnEditorActionListener onEditorActionListener, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.Credentials$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull OnEditorActionListener.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OnEditorActionListener.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(onEditorActionListener);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull OnEditorActionListener onEditorActionListener) {
            this();
            Intrinsics.checkNotNullParameter(onEditorActionListener, "");
            this.KWHzl = onEditorActionListener.KWHzl();
            this.copydefault = onEditorActionListener.EZpvd();
            this.EZpvd = onEditorActionListener.OLrzqt();
            this.OLrzqt = onEditorActionListener.copydefault();
        }

        public final OnEditorActionListener AEQbTJ() {
            return new OnEditorActionListener(this, null);
        }

        public final Activity EZpvd() {
            if (this.KWHzl == null) {
                this.KWHzl = "";
            }
            if (this.copydefault == null) {
                this.copydefault = C5173Hn.ActionBar.fromEpochSeconds$default(C5173Hn.AEQbTJ, 0L, 0, 2, null);
            }
            if (this.EZpvd == null) {
                this.EZpvd = "";
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            return this;
        }
    }
}
