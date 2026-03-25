package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C46402tT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46402tT {
    public static final Application copydefault = new Application(null);
    public final byte[] AEQbTJ;
    public final AbstractC46375tS EZpvd;
    public final AbstractC46750td KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tT$Activity) A[MD:(o.tT$Activity):void (m)] call: o.tT.<init>(o.tT$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46402tT(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46750td OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46375tS copydefault() {
        return this.EZpvd;
    }

    public C46402tT(Activity activity) {
        this.KWHzl = activity.KWHzl();
        byte[] bArrEZpvd = activity.EZpvd();
        if (bArrEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for file".toString());
        }
        this.AEQbTJ = bArrEZpvd;
        AbstractC46375tS abstractC46375tSOLrzqt = activity.OLrzqt();
        if (abstractC46375tSOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for format".toString());
        }
        this.EZpvd = abstractC46375tSOLrzqt;
    }

    /* JADX INFO: renamed from: o.tT$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tT.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TerminologyData(");
        sb.append("directionality=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("file=*** Sensitive Data Redacted ***,");
        sb.append("format=" + this.EZpvd);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC46750td abstractC46750td = this.KWHzl;
        return ((((abstractC46750td != null ? abstractC46750td.hashCode() : 0) * 31) + java.util.Arrays.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46402tT.class != obj.getClass()) {
            return false;
        }
        C46402tT c46402tT = (C46402tT) obj;
        if (!Intrinsics.EZpvd(this.KWHzl, c46402tT.KWHzl)) {
            return false;
        }
        byte[] bArr = this.AEQbTJ;
        if (bArr != null) {
            byte[] bArr2 = c46402tT.AEQbTJ;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (c46402tT.AEQbTJ != null) {
            return false;
        }
        return Intrinsics.EZpvd(this.EZpvd, c46402tT.EZpvd);
    }

    public static /* synthetic */ C46402tT copy$default(C46402tT c46402tT, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TerminologyData$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46402tT.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46402tT.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c46402tT);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tT$Activity */
    public static final class Activity {
        public byte[] AEQbTJ;
        public AbstractC46375tS EZpvd;
        public AbstractC46750td copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46750td KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46375tS OLrzqt() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C46402tT c46402tT) {
            this();
            Intrinsics.checkNotNullParameter(c46402tT, "");
            this.copydefault = c46402tT.OLrzqt();
            this.AEQbTJ = c46402tT.KWHzl();
            this.EZpvd = c46402tT.copydefault();
        }

        public final C46402tT AEQbTJ() {
            return new C46402tT(this, null);
        }
    }
}
