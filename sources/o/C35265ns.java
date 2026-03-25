package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C35265ns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35265ns {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public final java.lang.String KWHzl;
    public final C32249mV OLrzqt;
    public final java.lang.String copydefault;
    public final C37344os djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ns$TaskDescription) A[MD:(o.ns$TaskDescription):void (m)] call: o.ns.<init>(o.ns$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35265ns(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32249mV AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37344os OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
        return this.AYXKKw;
    }

    public C35265ns(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.KWHzl();
        this.AEQbTJ = taskDescription.EZpvd();
        this.OLrzqt = taskDescription.OLrzqt();
        this.copydefault = taskDescription.AEQbTJ();
        this.djBIcL = taskDescription.djBIcL();
        this.AYXKKw = taskDescription.valueOf();
    }

    /* JADX INFO: renamed from: o.ns$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ns.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateAdapterVersionRequest(");
        sb.append("adapterId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("clientRequestToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("datasetConfig=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("outputConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C32249mV c32249mV = this.OLrzqt;
        int iHashCode3 = c32249mV != null ? c32249mV.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        C37344os c37344os = this.djBIcL;
        int iHashCode5 = c37344os != null ? c37344os.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35265ns.class != obj.getClass()) {
            return false;
        }
        C35265ns c35265ns = (C35265ns) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c35265ns.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c35265ns.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c35265ns.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35265ns.copydefault) && Intrinsics.EZpvd(this.djBIcL, c35265ns.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, c35265ns.AYXKKw);
    }

    public static /* synthetic */ C35265ns copy$default(C35265ns c35265ns, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.CreateAdapterVersionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35265ns.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35265ns.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c35265ns);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.ns$TaskDescription */
    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public C37344os KWHzl;
        public C32249mV OLrzqt;
        public java.lang.String copydefault;
        public java.util.Map<java.lang.String, java.lang.String> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C32249mV OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37344os djBIcL() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
            return this.gEmmrt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C35265ns c35265ns) {
            this();
            Intrinsics.checkNotNullParameter(c35265ns, "");
            this.copydefault = c35265ns.copydefault();
            this.AEQbTJ = c35265ns.KWHzl();
            this.OLrzqt = c35265ns.AEQbTJ();
            this.EZpvd = c35265ns.EZpvd();
            this.KWHzl = c35265ns.OLrzqt();
            this.gEmmrt = c35265ns.valueOf();
        }

        public final C35265ns copydefault() {
            return new C35265ns(this, null);
        }
    }
}
