package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DevicePolicyManagerInternal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class DevicePolicyManagerInternal {
    public static final ActionBar copydefault = new ActionBar(null);
    public final NetworkEvent EZpvd;
    public final NetworkEvent KWHzl;
    public final NetworkEvent OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DevicePolicyManagerInternal$Application) A[MD:(o.DevicePolicyManagerInternal$Application):void (m)] call: o.DevicePolicyManagerInternal.<init>(o.DevicePolicyManagerInternal$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DevicePolicyManagerInternal(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkEvent AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkEvent EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkEvent OLrzqt() {
        return this.OLrzqt;
    }

    public DevicePolicyManagerInternal(Application application) {
        this.EZpvd = application.KWHzl();
        this.OLrzqt = application.copydefault();
        this.KWHzl = application.OLrzqt();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DevicePolicyManagerInternal.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TokenValidityUnitsType(");
        sb.append("accessToken=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("idToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("refreshToken=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        NetworkEvent networkEvent = this.EZpvd;
        int iHashCode = networkEvent != null ? networkEvent.hashCode() : 0;
        NetworkEvent networkEvent2 = this.OLrzqt;
        int iHashCode2 = networkEvent2 != null ? networkEvent2.hashCode() : 0;
        NetworkEvent networkEvent3 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (networkEvent3 != null ? networkEvent3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DevicePolicyManagerInternal.class != obj.getClass()) {
            return false;
        }
        DevicePolicyManagerInternal devicePolicyManagerInternal = (DevicePolicyManagerInternal) obj;
        return Intrinsics.EZpvd(this.EZpvd, devicePolicyManagerInternal.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, devicePolicyManagerInternal.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, devicePolicyManagerInternal.KWHzl);
    }

    public static /* synthetic */ DevicePolicyManagerInternal copy$default(DevicePolicyManagerInternal devicePolicyManagerInternal, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.TokenValidityUnitsType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DevicePolicyManagerInternal.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DevicePolicyManagerInternal.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(devicePolicyManagerInternal);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public NetworkEvent AEQbTJ;
        public NetworkEvent KWHzl;
        public NetworkEvent OLrzqt;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(NetworkEvent networkEvent) {
            this.AEQbTJ = networkEvent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkEvent KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(NetworkEvent networkEvent) {
            this.OLrzqt = networkEvent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkEvent OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(NetworkEvent networkEvent) {
            this.KWHzl = networkEvent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkEvent copydefault() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DevicePolicyManagerInternal devicePolicyManagerInternal) {
            this();
            Intrinsics.checkNotNullParameter(devicePolicyManagerInternal, "");
            this.AEQbTJ = devicePolicyManagerInternal.EZpvd();
            this.OLrzqt = devicePolicyManagerInternal.OLrzqt();
            this.KWHzl = devicePolicyManagerInternal.AEQbTJ();
        }

        public final DevicePolicyManagerInternal EZpvd() {
            return new DevicePolicyManagerInternal(this, null);
        }
    }
}
