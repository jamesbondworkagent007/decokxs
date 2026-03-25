package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ChooseAccountTypeActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ChooseAccountTypeActivity {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ChooseAccountTypeActivity$Activity) A[MD:(o.ChooseAccountTypeActivity$Activity):void (m)] call: o.ChooseAccountTypeActivity.<init>(o.ChooseAccountTypeActivity$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ChooseAccountTypeActivity(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public ChooseAccountTypeActivity(Activity activity) {
        this.copydefault = activity.copydefault();
        this.KWHzl = activity.EZpvd();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ChooseAccountTypeActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final ChooseAccountTypeActivity OLrzqt(@NotNull Function1<? super Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Activity activity = new Activity();
            function1.invoke(activity);
            return activity.OLrzqt();
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "AssociateSoftwareTokenRequest(accessToken=*** Sensitive Data Redacted ***,session=*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChooseAccountTypeActivity.class != obj.getClass()) {
            return false;
        }
        ChooseAccountTypeActivity chooseAccountTypeActivity = (ChooseAccountTypeActivity) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) chooseAccountTypeActivity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) chooseAccountTypeActivity.KWHzl);
    }

    public static /* synthetic */ ChooseAccountTypeActivity copy$default(ChooseAccountTypeActivity chooseAccountTypeActivity, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AssociateSoftwareTokenRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ChooseAccountTypeActivity.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ChooseAccountTypeActivity.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(chooseAccountTypeActivity);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ChooseAccountTypeActivity chooseAccountTypeActivity) {
            this();
            Intrinsics.checkNotNullParameter(chooseAccountTypeActivity, "");
            this.EZpvd = chooseAccountTypeActivity.EZpvd();
            this.AEQbTJ = chooseAccountTypeActivity.OLrzqt();
        }

        public final ChooseAccountTypeActivity OLrzqt() {
            return new ChooseAccountTypeActivity(this, null);
        }
    }
}
