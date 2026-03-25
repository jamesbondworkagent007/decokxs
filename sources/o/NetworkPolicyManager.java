package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NetworkPolicyManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkPolicyManager {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.util.List<java.lang.String> KWHzl;
    public final SynchronousResultReceiver copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkPolicyManager$Application) A[MD:(o.NetworkPolicyManager$Application):void (m)] call: o.NetworkPolicyManager.<init>(o.NetworkPolicyManager$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkPolicyManager(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.KWHzl;
    }

    public NetworkPolicyManager(Application application) {
        this.copydefault = application.EZpvd();
        this.KWHzl = application.KWHzl();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkPolicyManager.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BatchDetectEntitiesRequest(");
        sb.append("languageCode=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("textList=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SynchronousResultReceiver synchronousResultReceiver = this.copydefault;
        int iHashCode = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.util.List<java.lang.String> list = this.KWHzl;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkPolicyManager.class != obj.getClass()) {
            return false;
        }
        NetworkPolicyManager networkPolicyManager = (NetworkPolicyManager) obj;
        return Intrinsics.EZpvd(this.copydefault, networkPolicyManager.copydefault) && Intrinsics.EZpvd(this.KWHzl, networkPolicyManager.KWHzl);
    }

    public static /* synthetic */ NetworkPolicyManager copy$default(NetworkPolicyManager networkPolicyManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectEntitiesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkPolicyManager.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkPolicyManager.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(networkPolicyManager);
        function1.invoke(application);
        return application.copydefault();
    }

    public static final class Application {
        public java.util.List<java.lang.String> KWHzl;
        public SynchronousResultReceiver copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull NetworkPolicyManager networkPolicyManager) {
            this();
            Intrinsics.checkNotNullParameter(networkPolicyManager, "");
            this.copydefault = networkPolicyManager.AEQbTJ();
            this.KWHzl = networkPolicyManager.OLrzqt();
        }

        public final NetworkPolicyManager copydefault() {
            return new NetworkPolicyManager(this, null);
        }
    }
}
