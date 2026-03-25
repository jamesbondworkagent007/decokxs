package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.UEventObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UEventObserver {
    public static final ActionBar copydefault = new ActionBar(null);
    public final HwParcel AEQbTJ;
    public final java.lang.Integer KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.UEventObserver$Application) A[MD:(o.UEventObserver$Application):void (m)] call: o.UEventObserver.<init>(o.UEventObserver$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UEventObserver(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HwParcel copydefault() {
        return this.AEQbTJ;
    }

    public UEventObserver(Application application) {
        this.AEQbTJ = application.KWHzl();
        this.KWHzl = application.EZpvd();
        this.OLrzqt = application.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UEventObserver.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final UEventObserver KWHzl(@NotNull Function1<? super Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = new Application();
            function1.invoke(application);
            return application.OLrzqt();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListEndpointsRequest(");
        sb.append("filter=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        HwParcel hwParcel = this.AEQbTJ;
        int iHashCode = hwParcel != null ? hwParcel.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.OLrzqt;
        return (((iHashCode * 31) + iIntValue) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UEventObserver.class != obj.getClass()) {
            return false;
        }
        UEventObserver uEventObserver = (UEventObserver) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, uEventObserver.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, uEventObserver.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) uEventObserver.OLrzqt);
    }

    public static /* synthetic */ UEventObserver copy$default(UEventObserver uEventObserver, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ListEndpointsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UEventObserver.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UEventObserver.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(uEventObserver);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.lang.String KWHzl;
        public HwParcel OLrzqt;
        public java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HwParcel KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull UEventObserver uEventObserver) {
            this();
            Intrinsics.checkNotNullParameter(uEventObserver, "");
            this.OLrzqt = uEventObserver.copydefault();
            this.copydefault = uEventObserver.KWHzl();
            this.KWHzl = uEventObserver.EZpvd();
        }

        public final UEventObserver OLrzqt() {
            return new UEventObserver(this, null);
        }
    }
}
