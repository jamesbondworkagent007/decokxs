package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IHwBinder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IHwBinder {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String EZpvd;
    public final C5173Hn KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final IHwInterface fetchVPNInfo;
    public final C5173Hn gEmmrt;
    public final java.lang.Integer valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IHwBinder$Activity) A[MD:(o.IHwBinder$Activity):void (m)] call: o.IHwBinder.<init>(o.IHwBinder$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IHwBinder(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.AEQbTJ;
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
    public final java.lang.Integer copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IHwInterface values() {
        return this.fetchVPNInfo;
    }

    public IHwBinder(Activity activity) {
        this.KWHzl = activity.OLrzqt();
        this.AEQbTJ = activity.AEQbTJ();
        this.copydefault = activity.copydefault();
        this.EZpvd = activity.gEmmrt();
        this.valueOf = activity.AYXKKw();
        this.AhwBna = activity.djBIcL();
        this.AYXKKw = activity.valueOf();
        this.djBIcL = activity.AhwBna();
        this.gEmmrt = activity.isConnected();
        this.values = activity.fetchVPNInfo();
        this.AkhnZx = activity.values();
        this.fetchVPNInfo = activity.DbNXlk();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IHwBinder.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EndpointProperties(");
        sb.append("creationTime=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("currentInferenceUnits=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("desiredDataAccessRoleArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("desiredInferenceUnits=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("desiredModelArn=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("endpointArn=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("lastModifiedTime=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("modelArn=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.fetchVPNInfo);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.Integer num2 = this.valueOf;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.String str3 = this.AhwBna;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.djBIcL;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        C5173Hn c5173Hn2 = this.gEmmrt;
        int iHashCode7 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str6 = this.values;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        java.lang.String str7 = this.AkhnZx;
        int iHashCode9 = str7 != null ? str7.hashCode() : 0;
        IHwInterface iHwInterface = this.fetchVPNInfo;
        return (((((((((((((((((((((iHashCode * 31) + iIntValue) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iIntValue2) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (iHwInterface != null ? iHwInterface.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IHwBinder.class != obj.getClass()) {
            return false;
        }
        IHwBinder iHwBinder = (IHwBinder) obj;
        return Intrinsics.EZpvd(this.KWHzl, iHwBinder.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, iHwBinder.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) iHwBinder.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) iHwBinder.EZpvd) && Intrinsics.EZpvd(this.valueOf, iHwBinder.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) iHwBinder.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) iHwBinder.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) iHwBinder.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, iHwBinder.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) iHwBinder.values) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) iHwBinder.AkhnZx) && Intrinsics.EZpvd(this.fetchVPNInfo, iHwBinder.fetchVPNInfo);
    }

    public static /* synthetic */ IHwBinder copy$default(IHwBinder iHwBinder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EndpointProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IHwBinder.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IHwBinder.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(iHwBinder);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public C5173Hn AhwBna;
        public java.lang.Integer EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Integer OLrzqt;
        public C5173Hn copydefault;
        public java.lang.String djBIcL;
        public java.lang.String gEmmrt;
        public IHwInterface isConnected;
        public java.lang.String valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(IHwInterface iHwInterface) {
            this.isConnected = iHwInterface;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IHwInterface DbNXlk() {
            return this.isConnected;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.AhwBna = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn isConnected() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.values;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull IHwBinder iHwBinder) {
            this();
            Intrinsics.checkNotNullParameter(iHwBinder, "");
            this.copydefault = iHwBinder.OLrzqt();
            this.EZpvd = iHwBinder.EZpvd();
            this.KWHzl = iHwBinder.AEQbTJ();
            this.AEQbTJ = iHwBinder.KWHzl();
            this.OLrzqt = iHwBinder.copydefault();
            this.djBIcL = iHwBinder.AhwBna();
            this.gEmmrt = iHwBinder.valueOf();
            this.valueOf = iHwBinder.AYXKKw();
            this.AhwBna = iHwBinder.djBIcL();
            this.AYXKKw = iHwBinder.gEmmrt();
            this.values = iHwBinder.AkhnZx();
            this.isConnected = iHwBinder.values();
        }

        public final IHwBinder KWHzl() {
            return new IHwBinder(this, null);
        }
    }
}
