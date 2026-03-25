package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.MediaRouteActionProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class MediaRouteActionProvider {
    public static final Activity AEQbTJ = new Activity(null);
    public final java.lang.String EZpvd;
    public final Notification KWHzl;
    public final Notification OLrzqt;
    public final Notification copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.MediaRouteActionProvider$Application) A[MD:(o.MediaRouteActionProvider$Application):void (m)] call: o.MediaRouteActionProvider.<init>(o.MediaRouteActionProvider$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MediaRouteActionProvider(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Notification AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Notification EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Notification KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public MediaRouteActionProvider(Application application) {
        this.copydefault = application.AEQbTJ();
        this.EZpvd = application.OLrzqt();
        this.KWHzl = application.copydefault();
        this.OLrzqt = application.djBIcL();
        this.djBIcL = application.gEmmrt();
        java.lang.String strAhwBna = application.AhwBna();
        if (strAhwBna == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for sourceArn".toString());
        }
        this.valueOf = strAhwBna;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MediaRouteActionProvider.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NotifyConfigurationType(");
        sb.append("blockEmail=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("from=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("mfaEmail=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("noActionEmail=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("replyTo=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sourceArn=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        Notification notification = this.copydefault;
        int iHashCode = notification != null ? notification.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        Notification notification2 = this.KWHzl;
        int iHashCode3 = notification2 != null ? notification2.hashCode() : 0;
        Notification notification3 = this.OLrzqt;
        int iHashCode4 = notification3 != null ? notification3.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.valueOf.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaRouteActionProvider.class != obj.getClass()) {
            return false;
        }
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) obj;
        return Intrinsics.EZpvd(this.copydefault, mediaRouteActionProvider.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) mediaRouteActionProvider.EZpvd) && Intrinsics.EZpvd(this.KWHzl, mediaRouteActionProvider.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, mediaRouteActionProvider.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) mediaRouteActionProvider.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) mediaRouteActionProvider.valueOf);
    }

    public static /* synthetic */ MediaRouteActionProvider copy$default(MediaRouteActionProvider mediaRouteActionProvider, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.NotifyConfigurationType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MediaRouteActionProvider.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MediaRouteActionProvider.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(mediaRouteActionProvider);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public Notification EZpvd;
        public Notification KWHzl;
        public Notification OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Notification AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd() {
            if (this.gEmmrt == null) {
                this.gEmmrt = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Notification notification) {
            this.KWHzl = notification;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(Notification notification) {
            this.OLrzqt = notification;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Notification copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(Notification notification) {
            this.EZpvd = notification;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Notification djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull MediaRouteActionProvider mediaRouteActionProvider) {
            this();
            Intrinsics.checkNotNullParameter(mediaRouteActionProvider, "");
            this.KWHzl = mediaRouteActionProvider.AEQbTJ();
            this.AEQbTJ = mediaRouteActionProvider.copydefault();
            this.EZpvd = mediaRouteActionProvider.EZpvd();
            this.OLrzqt = mediaRouteActionProvider.KWHzl();
            this.copydefault = mediaRouteActionProvider.OLrzqt();
            this.gEmmrt = mediaRouteActionProvider.AhwBna();
        }

        public final MediaRouteActionProvider KWHzl() {
            return new MediaRouteActionProvider(this, null);
        }
    }
}
