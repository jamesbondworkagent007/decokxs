package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.VintfRuntimeInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class VintfRuntimeInfo {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String EZpvd;
    public final RegistrantList KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.VintfRuntimeInfo$Application) A[MD:(o.VintfRuntimeInfo$Application):void (m)] call: o.VintfRuntimeInfo.<init>(o.VintfRuntimeInfo$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ VintfRuntimeInfo(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegistrantList EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.AEQbTJ;
    }

    public VintfRuntimeInfo(Application application) {
        this.KWHzl = application.KWHzl();
        this.AEQbTJ = application.EZpvd();
        this.EZpvd = application.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.VintfRuntimeInfo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final VintfRuntimeInfo EZpvd(@NotNull Function1<? super Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = new Application();
            function1.invoke(application);
            return application.AEQbTJ();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListFlywheelsRequest(");
        sb.append("filter=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RegistrantList registrantList = this.KWHzl;
        int iHashCode = registrantList != null ? registrantList.hashCode() : 0;
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.EZpvd;
        return (((iHashCode * 31) + iIntValue) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VintfRuntimeInfo.class != obj.getClass()) {
            return false;
        }
        VintfRuntimeInfo vintfRuntimeInfo = (VintfRuntimeInfo) obj;
        return Intrinsics.EZpvd(this.KWHzl, vintfRuntimeInfo.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, vintfRuntimeInfo.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) vintfRuntimeInfo.EZpvd);
    }

    public static /* synthetic */ VintfRuntimeInfo copy$default(VintfRuntimeInfo vintfRuntimeInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ListFlywheelsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull VintfRuntimeInfo.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(VintfRuntimeInfo.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(vintfRuntimeInfo);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.Integer KWHzl;
        public RegistrantList copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RegistrantList KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull VintfRuntimeInfo vintfRuntimeInfo) {
            this();
            Intrinsics.checkNotNullParameter(vintfRuntimeInfo, "");
            this.copydefault = vintfRuntimeInfo.EZpvd();
            this.KWHzl = vintfRuntimeInfo.KWHzl();
            this.AEQbTJ = vintfRuntimeInfo.AEQbTJ();
        }

        public final VintfRuntimeInfo AEQbTJ() {
            return new VintfRuntimeInfo(this, null);
        }
    }
}
