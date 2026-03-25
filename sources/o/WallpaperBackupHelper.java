package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WallpaperBackupHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class WallpaperBackupHelper {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final AnyThread copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WallpaperBackupHelper$Activity) A[MD:(o.WallpaperBackupHelper$Activity):void (m)] call: o.WallpaperBackupHelper.<init>(o.WallpaperBackupHelper$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WallpaperBackupHelper(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnyThread KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    public WallpaperBackupHelper(Activity activity) {
        this.copydefault = activity.KWHzl();
        this.AEQbTJ = activity.AEQbTJ();
        this.OLrzqt = activity.EZpvd();
        this.KWHzl = activity.gEmmrt();
        this.AhwBna = activity.djBIcL();
        this.valueOf = activity.AYXKKw();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WallpaperBackupHelper.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VerificationMessageTemplateType(");
        sb.append("defaultEmailOption=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("emailMessage=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("emailMessageByLink=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("emailSubject=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("emailSubjectByLink=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("smsMessage=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AnyThread anyThread = this.copydefault;
        int iHashCode = anyThread != null ? anyThread.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.KWHzl;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WallpaperBackupHelper.class != obj.getClass()) {
            return false;
        }
        WallpaperBackupHelper wallpaperBackupHelper = (WallpaperBackupHelper) obj;
        return Intrinsics.EZpvd(this.copydefault, wallpaperBackupHelper.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) wallpaperBackupHelper.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) wallpaperBackupHelper.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) wallpaperBackupHelper.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) wallpaperBackupHelper.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) wallpaperBackupHelper.valueOf);
    }

    public static /* synthetic */ WallpaperBackupHelper copy$default(WallpaperBackupHelper wallpaperBackupHelper, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.VerificationMessageTemplateType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WallpaperBackupHelper.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WallpaperBackupHelper.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(wallpaperBackupHelper);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public AnyThread OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AnyThread anyThread) {
            this.OLrzqt = anyThread;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnyThread KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public final Activity OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull WallpaperBackupHelper wallpaperBackupHelper) {
            this();
            Intrinsics.checkNotNullParameter(wallpaperBackupHelper, "");
            this.OLrzqt = wallpaperBackupHelper.KWHzl();
            this.AEQbTJ = wallpaperBackupHelper.AEQbTJ();
            this.copydefault = wallpaperBackupHelper.copydefault();
            this.EZpvd = wallpaperBackupHelper.EZpvd();
            this.KWHzl = wallpaperBackupHelper.OLrzqt();
            this.AhwBna = wallpaperBackupHelper.djBIcL();
        }

        public final WallpaperBackupHelper copydefault() {
            return new WallpaperBackupHelper(this, null);
        }
    }
}
