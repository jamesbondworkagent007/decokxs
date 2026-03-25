package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AppSecurityPermissions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AppSecurityPermissions {
    public static final Activity AEQbTJ = new Activity(null);
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final C7609an OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.util.Map<java.lang.String, java.lang.String> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AppSecurityPermissions$ActionBar) A[MD:(o.AppSecurityPermissions$ActionBar):void (m)] call: o.AppSecurityPermissions.<init>(o.AppSecurityPermissions$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AppSecurityPermissions(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7609an KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
        return this.valueOf;
    }

    public AppSecurityPermissions(ActionBar actionBar) {
        this.EZpvd = actionBar.EZpvd();
        this.KWHzl = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.OLrzqt();
        this.copydefault = actionBar.KWHzl();
        this.AhwBna = actionBar.gEmmrt();
        this.valueOf = actionBar.djBIcL();
        this.djBIcL = actionBar.AYXKKw();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AppSecurityPermissions.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CopyProjectVersionRequest(");
        sb.append("destinationProjectArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("outputConfig=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("sourceProjectArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("sourceProjectVersionArn=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("versionName=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C7609an c7609an = this.OLrzqt;
        int iHashCode3 = c7609an != null ? c7609an.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.valueOf;
        int iHashCode6 = map != null ? map.hashCode() : 0;
        java.lang.String str5 = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AppSecurityPermissions.class != obj.getClass()) {
            return false;
        }
        AppSecurityPermissions appSecurityPermissions = (AppSecurityPermissions) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) appSecurityPermissions.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) appSecurityPermissions.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, appSecurityPermissions.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) appSecurityPermissions.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) appSecurityPermissions.AhwBna) && Intrinsics.EZpvd(this.valueOf, appSecurityPermissions.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) appSecurityPermissions.djBIcL);
    }

    public static /* synthetic */ AppSecurityPermissions copy$default(AppSecurityPermissions appSecurityPermissions, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CopyProjectVersionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AppSecurityPermissions.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AppSecurityPermissions.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(appSecurityPermissions);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public C7609an copydefault;
        public java.lang.String djBIcL;
        public java.util.Map<java.lang.String, java.lang.String> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7609an OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AppSecurityPermissions appSecurityPermissions) {
            this();
            Intrinsics.checkNotNullParameter(appSecurityPermissions, "");
            this.EZpvd = appSecurityPermissions.AEQbTJ();
            this.AEQbTJ = appSecurityPermissions.EZpvd();
            this.copydefault = appSecurityPermissions.KWHzl();
            this.KWHzl = appSecurityPermissions.copydefault();
            this.OLrzqt = appSecurityPermissions.OLrzqt();
            this.gEmmrt = appSecurityPermissions.valueOf();
            this.djBIcL = appSecurityPermissions.djBIcL();
        }

        public final AppSecurityPermissions copydefault() {
            return new AppSecurityPermissions(this, null);
        }
    }
}
