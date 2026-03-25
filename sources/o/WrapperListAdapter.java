package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WrapperListAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class WrapperListAdapter {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<C7715ap> AYXKKw;
    public final C11135cD AhwBna;
    public final AbstractC11162cE EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final C11108cC djBIcL;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WrapperListAdapter$Application) A[MD:(o.WrapperListAdapter$Application):void (m)] call: o.WrapperListAdapter.<init>(o.WrapperListAdapter$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WrapperListAdapter(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC11162cE EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C7715ap> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11135cD valueOf() {
        return this.AhwBna;
    }

    public WrapperListAdapter(Application application) {
        this.KWHzl = application.AEQbTJ();
        this.EZpvd = application.OLrzqt();
        this.AEQbTJ = application.KWHzl();
        this.copydefault = application.AYXKKw();
        this.AYXKKw = application.gEmmrt();
        this.valueOf = application.valueOf();
        this.djBIcL = application.AhwBna();
        this.AhwBna = application.djBIcL();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WrapperListAdapter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetFaceSearchResponse(");
        sb.append("jobId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("persons=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("video=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("videoMetadata=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        AbstractC11162cE abstractC11162cE = this.EZpvd;
        int iHashCode2 = abstractC11162cE != null ? abstractC11162cE.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.util.List<C7715ap> list = this.AYXKKw;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        C11108cC c11108cC = this.djBIcL;
        int iHashCode7 = c11108cC != null ? c11108cC.hashCode() : 0;
        C11135cD c11135cD = this.AhwBna;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (c11135cD != null ? c11135cD.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapperListAdapter.class != obj.getClass()) {
            return false;
        }
        WrapperListAdapter wrapperListAdapter = (WrapperListAdapter) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) wrapperListAdapter.KWHzl) && Intrinsics.EZpvd(this.EZpvd, wrapperListAdapter.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) wrapperListAdapter.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) wrapperListAdapter.copydefault) && Intrinsics.EZpvd(this.AYXKKw, wrapperListAdapter.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) wrapperListAdapter.valueOf) && Intrinsics.EZpvd(this.djBIcL, wrapperListAdapter.djBIcL) && Intrinsics.EZpvd(this.AhwBna, wrapperListAdapter.AhwBna);
    }

    public static /* synthetic */ WrapperListAdapter copy$default(WrapperListAdapter wrapperListAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetFaceSearchResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WrapperListAdapter.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WrapperListAdapter.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(wrapperListAdapter);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public AbstractC11162cE AEQbTJ;
        public java.lang.String AYXKKw;
        public C11135cD AhwBna;
        public java.util.List<C7715ap> EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public C11108cC valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C11108cC c11108cC) {
            this.valueOf = c11108cC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC11162cE abstractC11162cE) {
            this.AEQbTJ = abstractC11162cE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C11135cD c11135cD) {
            this.AhwBna = c11135cD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC11162cE OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        public final Application copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C7715ap> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11135cD djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C7715ap> gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AYXKKw;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull WrapperListAdapter wrapperListAdapter) {
            this();
            Intrinsics.checkNotNullParameter(wrapperListAdapter, "");
            this.OLrzqt = wrapperListAdapter.AEQbTJ();
            this.AEQbTJ = wrapperListAdapter.EZpvd();
            this.copydefault = wrapperListAdapter.OLrzqt();
            this.KWHzl = wrapperListAdapter.KWHzl();
            this.EZpvd = wrapperListAdapter.copydefault();
            this.AYXKKw = wrapperListAdapter.gEmmrt();
            this.valueOf = wrapperListAdapter.djBIcL();
            this.AhwBna = wrapperListAdapter.valueOf();
        }

        public final WrapperListAdapter EZpvd() {
            return new WrapperListAdapter(this, null);
        }
    }
}
