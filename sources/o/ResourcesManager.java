package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ResourcesManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ResourcesManager {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final LongStream AEQbTJ;
    public final ServiceStartArgs AYXKKw;
    public final java.lang.String EZpvd;
    public final FloatArrayEvaluator OLrzqt;
    public final C5173Hn copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ResourcesManager$TaskDescription) A[MD:(o.ResourcesManager$TaskDescription):void (m)] call: o.ResourcesManager.<init>(o.ResourcesManager$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ResourcesManager(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceStartArgs AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatArrayEvaluator EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LongStream copydefault() {
        return this.AEQbTJ;
    }

    public ResourcesManager(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.OLrzqt();
        this.EZpvd = taskDescription.AEQbTJ();
        this.OLrzqt = taskDescription.KWHzl();
        this.copydefault = taskDescription.AhwBna();
        this.AYXKKw = taskDescription.djBIcL();
        this.djBIcL = taskDescription.valueOf();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ResourcesManager.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RiskConfigurationType(");
        sb.append("accountTakeoverRiskConfiguration=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("compromisedCredentialsRiskConfiguration=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("lastModifiedDate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("riskExceptionConfiguration=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        LongStream longStream = this.AEQbTJ;
        int iHashCode = longStream != null ? longStream.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        FloatArrayEvaluator floatArrayEvaluator = this.OLrzqt;
        int iHashCode3 = floatArrayEvaluator != null ? floatArrayEvaluator.hashCode() : 0;
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode4 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        ServiceStartArgs serviceStartArgs = this.AYXKKw;
        int iHashCode5 = serviceStartArgs != null ? serviceStartArgs.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourcesManager.class != obj.getClass()) {
            return false;
        }
        ResourcesManager resourcesManager = (ResourcesManager) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, resourcesManager.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) resourcesManager.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, resourcesManager.OLrzqt) && Intrinsics.EZpvd(this.copydefault, resourcesManager.copydefault) && Intrinsics.EZpvd(this.AYXKKw, resourcesManager.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) resourcesManager.djBIcL);
    }

    public static /* synthetic */ ResourcesManager copy$default(ResourcesManager resourcesManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.RiskConfigurationType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ResourcesManager.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ResourcesManager.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(resourcesManager);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class TaskDescription {
        public FloatArrayEvaluator AEQbTJ;
        public java.lang.String AhwBna;
        public ServiceStartArgs EZpvd;
        public C5173Hn KWHzl;
        public LongStream OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AhwBna() {
            return this.KWHzl;
        }

        public final TaskDescription EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ServiceStartArgs serviceStartArgs) {
            this.EZpvd = serviceStartArgs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FloatArrayEvaluator KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LongStream OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(FloatArrayEvaluator floatArrayEvaluator) {
            this.AEQbTJ = floatArrayEvaluator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(LongStream longStream) {
            this.OLrzqt = longStream;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceStartArgs djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ResourcesManager resourcesManager) {
            this();
            Intrinsics.checkNotNullParameter(resourcesManager, "");
            this.OLrzqt = resourcesManager.copydefault();
            this.copydefault = resourcesManager.OLrzqt();
            this.AEQbTJ = resourcesManager.EZpvd();
            this.KWHzl = resourcesManager.KWHzl();
            this.EZpvd = resourcesManager.AEQbTJ();
            this.AhwBna = resourcesManager.AhwBna();
        }

        public final ResourcesManager copydefault() {
            return new ResourcesManager(this, null);
        }
    }
}
