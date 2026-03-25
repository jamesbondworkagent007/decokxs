package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignatureType;
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignedBodyHeader;
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSigningAlgorithm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55709xp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55338xi {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final Function1<java.lang.String, java.lang.Boolean> AkhnZx;
    public final AwsSignedBodyHeader DbNXlk;
    public final C59462zhW EZpvd;
    public final AbstractC55709xp KWHzl;
    public final InterfaceC52697wV OLrzqt;
    public final AwsSigningAlgorithm copydefault;
    public final boolean djBIcL;
    public final AwsSignatureType fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final C5173Hn isConnected;
    public final boolean valueOf;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59462zhW AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsSignatureType DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsSigningAlgorithm EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC52697wV OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC55709xp copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, java.lang.Boolean> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsSignedBodyHeader values() {
        return this.DbNXlk;
    }

    /* JADX INFO: renamed from: o.xi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public C55338xi(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String strDjBIcL = activity.djBIcL();
        if (strDjBIcL == null) {
            throw new java.lang.IllegalArgumentException("Signing config must specify a region".toString());
        }
        this.gEmmrt = strDjBIcL;
        java.lang.String strGEmmrt = activity.gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("Signing config must specify a service".toString());
        }
        this.AYXKKw = strGEmmrt;
        C5173Hn c5173HnFetchVPNInfo = activity.fetchVPNInfo();
        this.isConnected = c5173HnFetchVPNInfo == null ? C5173Hn.AEQbTJ.KWHzl() : c5173HnFetchVPNInfo;
        this.AkhnZx = activity.isConnected();
        this.copydefault = activity.AEQbTJ();
        this.fetchVPNInfo = activity.AkhnZx();
        this.values = activity.values();
        this.AhwBna = activity.valueOf();
        this.djBIcL = activity.AYXKKw();
        AbstractC55709xp abstractC55709xpCopydefault = activity.copydefault();
        this.KWHzl = abstractC55709xpCopydefault == null ? AbstractC55709xp.StateListAnimator.OLrzqt : abstractC55709xpCopydefault;
        this.DbNXlk = activity.DbNXlk();
        InterfaceC52697wV interfaceC52697wVKWHzl = activity.KWHzl();
        if (interfaceC52697wVKWHzl == null) {
            throw new java.lang.IllegalArgumentException("Signing config must specify credentials".toString());
        }
        this.OLrzqt = interfaceC52697wVKWHzl;
        this.EZpvd = activity.OLrzqt();
        this.valueOf = activity.AhwBna();
    }

    public final Activity AkhnZx() {
        Activity activity = new Activity();
        activity.AEQbTJ(this.gEmmrt);
        activity.EZpvd(this.AYXKKw);
        activity.copydefault(this.isConnected);
        activity.copydefault(this.AkhnZx);
        activity.AEQbTJ(this.copydefault);
        activity.copydefault(this.fetchVPNInfo);
        activity.OLrzqt(this.values);
        activity.copydefault(this.AhwBna);
        activity.KWHzl(this.djBIcL);
        activity.OLrzqt(this.KWHzl);
        activity.AEQbTJ(this.DbNXlk);
        activity.AEQbTJ(this.OLrzqt);
        activity.OLrzqt(this.EZpvd);
        activity.EZpvd(this.valueOf);
        return activity;
    }

    /* JADX INFO: renamed from: o.xi$Activity */
    public static final class Activity {
        public boolean AEQbTJ;
        public boolean AhwBna;
        public C59462zhW EZpvd;
        public InterfaceC52697wV KWHzl;
        public AbstractC55709xp OLrzqt;
        public java.lang.String gEmmrt;
        public java.lang.String valueOf;
        public C5173Hn values;
        public Function1<? super java.lang.String, java.lang.Boolean> AYXKKw = new Function1<java.lang.String, java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.AwsSigningConfig$Builder$shouldSignHeader$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return Boolean.TRUE;
            }
        };
        public AwsSigningAlgorithm copydefault = AwsSigningAlgorithm.SIGV4;
        public AwsSignatureType DbNXlk = AwsSignatureType.HTTP_REQUEST_VIA_HEADERS;
        public boolean isConnected = true;
        public boolean djBIcL = true;
        public AwsSignedBodyHeader fetchVPNInfo = AwsSignedBodyHeader.NONE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AwsSigningAlgorithm AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull AwsSignedBodyHeader awsSignedBodyHeader) {
            Intrinsics.checkNotNullParameter(awsSignedBodyHeader, "");
            this.fetchVPNInfo = awsSignedBodyHeader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull AwsSigningAlgorithm awsSigningAlgorithm) {
            Intrinsics.checkNotNullParameter(awsSigningAlgorithm, "");
            this.copydefault = awsSigningAlgorithm;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(InterfaceC52697wV interfaceC52697wV) {
            this.KWHzl = interfaceC52697wV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AwsSignatureType AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AwsSignedBodyHeader DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC52697wV KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.AhwBna = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C59462zhW OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AbstractC55709xp abstractC55709xp) {
            this.OLrzqt = abstractC55709xp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C59462zhW c59462zhW) {
            this.EZpvd = c59462zhW;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.isConnected = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC55709xp copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull AwsSignatureType awsSignatureType) {
            Intrinsics.checkNotNullParameter(awsSignatureType, "");
            this.DbNXlk = awsSignatureType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull Function1<? super java.lang.String, java.lang.Boolean> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AYXKKw = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.values = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.djBIcL = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean>, kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> */
        public final Function1<java.lang.String, java.lang.Boolean> isConnected() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.isConnected;
        }

        public final C55338xi EZpvd() {
            return new C55338xi(this);
        }
    }
}
