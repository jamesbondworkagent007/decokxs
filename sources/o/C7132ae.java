package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7132ae;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C7132ae {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final AbstractC7026ac AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ae$Application) A[MD:(o.ae$Application):void (m)] call: o.ae.<init>(o.ae$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C7132ae(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7026ac OLrzqt() {
        return this.AEQbTJ;
    }

    public C7132ae(Application application) {
        this.AEQbTJ = application.AEQbTJ();
        this.EZpvd = application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.ae$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ae.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MediaAnalysisJobFailureDetails(");
        sb.append("code=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("message=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC7026ac abstractC7026ac = this.AEQbTJ;
        int iHashCode = abstractC7026ac != null ? abstractC7026ac.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7132ae.class != obj.getClass()) {
            return false;
        }
        C7132ae c7132ae = (C7132ae) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c7132ae.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c7132ae.EZpvd);
    }

    public static /* synthetic */ C7132ae copy$default(C7132ae c7132ae, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.MediaAnalysisJobFailureDetails$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C7132ae.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C7132ae.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c7132ae);
        function1.invoke(application);
        return application.copydefault();
    }

    /* JADX INFO: renamed from: o.ae$Application */
    public static final class Application {
        public AbstractC7026ac KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7026ac AEQbTJ() {
            return this.KWHzl;
        }

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC7026ac abstractC7026ac) {
            this.KWHzl = abstractC7026ac;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C7132ae c7132ae) {
            this();
            Intrinsics.checkNotNullParameter(c7132ae, "");
            this.KWHzl = c7132ae.OLrzqt();
            this.copydefault = c7132ae.KWHzl();
        }

        public final C7132ae copydefault() {
            return new C7132ae(this, null);
        }
    }
}
