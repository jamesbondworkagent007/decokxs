package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.BackupDataInput;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BackupDataInput {
    public static final Application KWHzl = new Application(null);
    public final java.util.List<java.lang.String> AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
    public final java.lang.String OLrzqt;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BackupDataInput$TaskDescription) A[MD:(o.BackupDataInput$TaskDescription):void (m)] call: o.BackupDataInput.<init>(o.BackupDataInput$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BackupDataInput(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.copydefault;
    }

    public BackupDataInput(TaskDescription taskDescription) {
        this.copydefault = taskDescription.EZpvd();
        this.AEQbTJ = taskDescription.copydefault();
        this.EZpvd = taskDescription.KWHzl();
        this.OLrzqt = taskDescription.AEQbTJ();
        this.gEmmrt = taskDescription.gEmmrt();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BackupDataInput.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateIdentityProviderRequest(");
        sb.append("attributeMapping=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("idpIdentifiers=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("providerDetails=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("providerName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.copydefault;
        int iHashCode = map != null ? map.hashCode() : 0;
        java.util.List<java.lang.String> list = this.AEQbTJ;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.EZpvd;
        int iHashCode3 = map2 != null ? map2.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.gEmmrt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BackupDataInput.class != obj.getClass()) {
            return false;
        }
        BackupDataInput backupDataInput = (BackupDataInput) obj;
        return Intrinsics.EZpvd(this.copydefault, backupDataInput.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, backupDataInput.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, backupDataInput.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) backupDataInput.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) backupDataInput.gEmmrt);
    }

    public static /* synthetic */ BackupDataInput copy$default(BackupDataInput backupDataInput, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UpdateIdentityProviderRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BackupDataInput.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BackupDataInput.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(backupDataInput);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.util.List<java.lang.String> EZpvd;
        public java.util.Map<java.lang.String, java.lang.String> KWHzl;
        public java.lang.String OLrzqt;
        public java.util.Map<java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull BackupDataInput backupDataInput) {
            this();
            Intrinsics.checkNotNullParameter(backupDataInput, "");
            this.KWHzl = backupDataInput.copydefault();
            this.EZpvd = backupDataInput.OLrzqt();
            this.copydefault = backupDataInput.AEQbTJ();
            this.AEQbTJ = backupDataInput.KWHzl();
            this.OLrzqt = backupDataInput.EZpvd();
        }

        public final BackupDataInput OLrzqt() {
            return new BackupDataInput(this, null);
        }
    }
}
