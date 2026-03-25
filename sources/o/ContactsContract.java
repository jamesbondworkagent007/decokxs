package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ContactsContract;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ContactsContract {
    public static final Application EZpvd = new Application(null);
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ContactsContract$Activity) A[MD:(o.ContactsContract$Activity):void (m)] call: o.ContactsContract.<init>(o.ContactsContract$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ContactsContract(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.KWHzl;
    }

    public ContactsContract(Activity activity) {
        java.util.List<java.lang.String> listCopydefault = activity.copydefault();
        if (listCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for securityGroupIds".toString());
        }
        this.copydefault = listCopydefault;
        java.util.List<java.lang.String> listOLrzqt = activity.OLrzqt();
        if (listOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for subnets".toString());
        }
        this.KWHzl = listOLrzqt;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ContactsContract.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VpcConfig(");
        sb.append("securityGroupIds=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("subnets=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContactsContract.class != obj.getClass()) {
            return false;
        }
        ContactsContract contactsContract = (ContactsContract) obj;
        return Intrinsics.EZpvd(this.copydefault, contactsContract.copydefault) && Intrinsics.EZpvd(this.KWHzl, contactsContract.KWHzl);
    }

    public static /* synthetic */ ContactsContract copy$default(ContactsContract contactsContract, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.VpcConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContactsContract.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContactsContract.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(contactsContract);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public java.util.List<java.lang.String> KWHzl;
        public java.util.List<java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<java.lang.String> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> copydefault() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ContactsContract contactsContract) {
            this();
            Intrinsics.checkNotNullParameter(contactsContract, "");
            this.OLrzqt = contactsContract.AEQbTJ();
            this.KWHzl = contactsContract.EZpvd();
        }

        public final ContactsContract EZpvd() {
            return new ContactsContract(this, null);
        }

        public final Activity KWHzl() {
            if (this.OLrzqt == null) {
                this.OLrzqt = yDY.AhwBna();
            }
            if (this.KWHzl == null) {
                this.KWHzl = yDY.AhwBna();
            }
            return this;
        }
    }
}
