package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TypeConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class TypeConverter {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final AnimRes AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TypeConverter$TaskDescription) A[MD:(o.TypeConverter$TaskDescription):void (m)] call: o.TypeConverter.<init>(o.TypeConverter$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TypeConverter(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnimRes OLrzqt() {
        return this.AEQbTJ;
    }

    public TypeConverter(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.AEQbTJ();
        this.KWHzl = taskDescription.OLrzqt();
        this.EZpvd = taskDescription.copydefault();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TypeConverter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateUserPoolDomainRequest(");
        sb.append("customDomainConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("domain=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AnimRes animRes = this.AEQbTJ;
        int iHashCode = animRes != null ? animRes.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TypeConverter.class != obj.getClass()) {
            return false;
        }
        TypeConverter typeConverter = (TypeConverter) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, typeConverter.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) typeConverter.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) typeConverter.EZpvd);
    }

    public static /* synthetic */ TypeConverter copy$default(TypeConverter typeConverter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CreateUserPoolDomainRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TypeConverter.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TypeConverter.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(typeConverter);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public AnimRes AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnimRes AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull TypeConverter typeConverter) {
            this();
            Intrinsics.checkNotNullParameter(typeConverter, "");
            this.AEQbTJ = typeConverter.OLrzqt();
            this.EZpvd = typeConverter.AEQbTJ();
            this.OLrzqt = typeConverter.KWHzl();
        }

        public final TypeConverter EZpvd() {
            return new TypeConverter(this, null);
        }
    }
}
