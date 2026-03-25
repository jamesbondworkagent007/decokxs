package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C8190ay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C8190ay {
    public static final Application KWHzl = new Application(null);
    public final DatePickerSpinnerDelegate AEQbTJ;
    public final C5173Hn EZpvd;
    public final AbstractC8031av OLrzqt;
    public final java.util.List<DayPickerPagerAdapter> copydefault;
    public final AbstractC8243az djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ay$Activity) A[MD:(o.ay$Activity):void (m)] call: o.ay.<init>(o.ay$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8190ay(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DatePickerSpinnerDelegate AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8243az AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DayPickerPagerAdapter> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8031av OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.EZpvd;
    }

    public C8190ay(Activity activity) {
        this.OLrzqt = activity.EZpvd();
        this.EZpvd = activity.OLrzqt();
        this.copydefault = activity.copydefault();
        this.AEQbTJ = activity.AYXKKw();
        this.gEmmrt = activity.AhwBna();
        this.djBIcL = activity.djBIcL();
    }

    /* JADX INFO: renamed from: o.ay$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ay.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProjectDescription(");
        sb.append("autoUpdate=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("creationTimestamp=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("datasets=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("feature=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("projectArn=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC8031av abstractC8031av = this.OLrzqt;
        int iHashCode = abstractC8031av != null ? abstractC8031av.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.util.List<DayPickerPagerAdapter> list = this.copydefault;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        DatePickerSpinnerDelegate datePickerSpinnerDelegate = this.AEQbTJ;
        int iHashCode4 = datePickerSpinnerDelegate != null ? datePickerSpinnerDelegate.hashCode() : 0;
        java.lang.String str = this.gEmmrt;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        AbstractC8243az abstractC8243az = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (abstractC8243az != null ? abstractC8243az.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8190ay.class != obj.getClass()) {
            return false;
        }
        C8190ay c8190ay = (C8190ay) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c8190ay.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c8190ay.EZpvd) && Intrinsics.EZpvd(this.copydefault, c8190ay.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c8190ay.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c8190ay.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, c8190ay.djBIcL);
    }

    public static /* synthetic */ C8190ay copy$default(C8190ay c8190ay, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ProjectDescription$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C8190ay.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C8190ay.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c8190ay);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.ay$Activity */
    public static final class Activity {
        public java.util.List<DayPickerPagerAdapter> AEQbTJ;
        public AbstractC8243az AYXKKw;
        public java.lang.String EZpvd;
        public DatePickerSpinnerDelegate KWHzl;
        public AbstractC8031av OLrzqt;
        public C5173Hn copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC8031av abstractC8031av) {
            this.OLrzqt = abstractC8031av;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DatePickerSpinnerDelegate AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC8031av EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<DayPickerPagerAdapter> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DayPickerPagerAdapter> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(DatePickerSpinnerDelegate datePickerSpinnerDelegate) {
            this.KWHzl = datePickerSpinnerDelegate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC8243az abstractC8243az) {
            this.AYXKKw = abstractC8243az;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC8243az djBIcL() {
            return this.AYXKKw;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C8190ay c8190ay) {
            this();
            Intrinsics.checkNotNullParameter(c8190ay, "");
            this.OLrzqt = c8190ay.OLrzqt();
            this.copydefault = c8190ay.copydefault();
            this.AEQbTJ = c8190ay.KWHzl();
            this.KWHzl = c8190ay.AEQbTJ();
            this.EZpvd = c8190ay.EZpvd();
            this.AYXKKw = c8190ay.AYXKKw();
        }

        public final C8190ay KWHzl() {
            return new C8190ay(this, null);
        }
    }
}
