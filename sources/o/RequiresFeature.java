package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RequiresFeature;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class RequiresFeature {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.util.List<ChooseAccountActivity> AEQbTJ;
    public final java.lang.String EZpvd;
    public final C5173Hn KWHzl;
    public final C5173Hn OLrzqt;
    public final C5173Hn valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RequiresFeature$Activity) A[MD:(o.RequiresFeature$Activity):void (m)] call: o.RequiresFeature.<init>(o.RequiresFeature$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RequiresFeature(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> copydefault() {
        return this.AEQbTJ;
    }

    public RequiresFeature(Activity activity) {
        this.AEQbTJ = activity.copydefault();
        this.OLrzqt = activity.KWHzl();
        this.EZpvd = activity.OLrzqt();
        this.KWHzl = activity.AYXKKw();
        this.valueOf = activity.djBIcL();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RequiresFeature.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeviceType(");
        sb.append("deviceAttributes=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("deviceCreateDate=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("deviceKey=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("deviceLastAuthenticatedDate=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("deviceLastModifiedDate=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<ChooseAccountActivity> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        C5173Hn c5173Hn = this.OLrzqt;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn2 = this.KWHzl;
        int iHashCode4 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        C5173Hn c5173Hn3 = this.valueOf;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c5173Hn3 != null ? c5173Hn3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequiresFeature.class != obj.getClass()) {
            return false;
        }
        RequiresFeature requiresFeature = (RequiresFeature) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, requiresFeature.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, requiresFeature.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) requiresFeature.EZpvd) && Intrinsics.EZpvd(this.KWHzl, requiresFeature.KWHzl) && Intrinsics.EZpvd(this.valueOf, requiresFeature.valueOf);
    }

    public static /* synthetic */ RequiresFeature copy$default(RequiresFeature requiresFeature, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.DeviceType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RequiresFeature.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RequiresFeature.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(requiresFeature);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public C5173Hn AEQbTJ;
        public C5173Hn EZpvd;
        public java.util.List<ChooseAccountActivity> KWHzl;
        public C5173Hn OLrzqt;
        public java.lang.String copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<ChooseAccountActivity> list) {
            this.KWHzl = list;
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
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn djBIcL() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull RequiresFeature requiresFeature) {
            this();
            Intrinsics.checkNotNullParameter(requiresFeature, "");
            this.KWHzl = requiresFeature.copydefault();
            this.AEQbTJ = requiresFeature.EZpvd();
            this.copydefault = requiresFeature.KWHzl();
            this.EZpvd = requiresFeature.OLrzqt();
            this.OLrzqt = requiresFeature.AEQbTJ();
        }

        public final RequiresFeature EZpvd() {
            return new RequiresFeature(this, null);
        }
    }
}
