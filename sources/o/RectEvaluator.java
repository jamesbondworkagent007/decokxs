package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RectEvaluator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class RectEvaluator {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.util.List<java.lang.String> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.List<java.lang.String> AhwBna;
    public final java.lang.Boolean AkhnZx;
    public final java.util.List<java.lang.String> AuCTel;
    public final java.util.List<TransitionRes> DbNXlk;
    public final java.util.List<NotificationManager> KWHzl;
    public final java.lang.Boolean OLrzqt;
    public final java.lang.Integer copydefault;
    public final java.lang.String djBIcL;
    public final java.util.List<java.lang.String> ejfBZ;
    public final java.lang.Integer fARcdN;
    public final java.util.List<java.lang.String> fIwbmz;
    public final PictureInPictureArgs fJNWhG;
    public final java.lang.Integer fetchVPNInfo;
    public final java.lang.Integer gEmmrt;
    public final java.util.List<java.lang.String> getFieldNames;
    public final DevicePolicyManagerInternal hDKMBd;
    public final java.lang.Boolean isConnected;
    public final java.lang.String uzCIH;
    public final AccountsException valueOf;
    public final java.lang.Boolean values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RectEvaluator$StateListAnimator) A[MD:(o.RectEvaluator$StateListAnimator):void (m)] call: o.RectEvaluator.<init>(o.RectEvaluator$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RectEvaluator(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountsException KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NotificationManager> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer ejfBZ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevicePolicyManagerInternal fARcdN() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> fIwbmz() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PictureInPictureArgs fJNWhG() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> fetchVPNInfo() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> getNewProxyInstance() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TransitionRes> values() {
        return this.DbNXlk;
    }

    public RectEvaluator(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.EZpvd();
        this.KWHzl = stateListAnimator.KWHzl();
        this.OLrzqt = stateListAnimator.AEQbTJ();
        this.AEQbTJ = stateListAnimator.OLrzqt();
        this.valueOf = stateListAnimator.AYXKKw();
        this.gEmmrt = stateListAnimator.djBIcL();
        this.AhwBna = stateListAnimator.valueOf();
        this.AYXKKw = stateListAnimator.gEmmrt();
        this.djBIcL = stateListAnimator.AhwBna();
        this.AkhnZx = stateListAnimator.DbNXlk();
        this.values = stateListAnimator.fetchVPNInfo();
        this.DbNXlk = stateListAnimator.AkhnZx();
        this.isConnected = stateListAnimator.isConnected();
        this.fetchVPNInfo = stateListAnimator.values();
        this.fIwbmz = stateListAnimator.fIwbmz();
        this.fJNWhG = stateListAnimator.fJNWhG();
        this.AuCTel = stateListAnimator.ejfBZ();
        this.fARcdN = stateListAnimator.fARcdN();
        this.ejfBZ = stateListAnimator.AuCTel();
        this.hDKMBd = stateListAnimator.uzCIH();
        this.uzCIH = stateListAnimator.iwGUEr();
        this.getFieldNames = stateListAnimator.getFieldNames();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RectEvaluator.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateUserPoolClientRequest(");
        sb.append("accessTokenValidity=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("allowedOAuthFlows=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("allowedOAuthFlowsUserPoolClient=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("allowedOAuthScopes=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("analyticsConfiguration=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("authSessionValidity=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("callbackUrls=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("clientName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("defaultRedirectUri=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("enablePropagateAdditionalUserContextData=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("enableTokenRevocation=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("explicitAuthFlows=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("generateSecret=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("idTokenValidity=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("logoutUrls=" + this.fIwbmz + AbstractJsonLexerKt.COMMA);
        sb.append("preventUserExistenceErrors=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        sb.append("readAttributes=" + this.AuCTel + AbstractJsonLexerKt.COMMA);
        sb.append("refreshTokenValidity=" + this.fARcdN + AbstractJsonLexerKt.COMMA);
        sb.append("supportedIdentityProviders=" + this.ejfBZ + AbstractJsonLexerKt.COMMA);
        sb.append("tokenValidityUnits=" + this.hDKMBd + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.uzCIH + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("writeAttributes=");
        sb2.append(this.getFieldNames);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        java.util.List<NotificationManager> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Boolean bool = this.OLrzqt;
        int iHashCode2 = bool != null ? bool.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.AEQbTJ;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        AccountsException accountsException = this.valueOf;
        int iHashCode4 = accountsException != null ? accountsException.hashCode() : 0;
        java.lang.Integer num2 = this.gEmmrt;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.util.List<java.lang.String> list3 = this.AhwBna;
        int iHashCode5 = list3 != null ? list3.hashCode() : 0;
        java.lang.String str = this.AYXKKw;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        java.lang.Boolean bool2 = this.AkhnZx;
        int iHashCode8 = bool2 != null ? bool2.hashCode() : 0;
        java.lang.Boolean bool3 = this.values;
        int iHashCode9 = bool3 != null ? bool3.hashCode() : 0;
        java.util.List<TransitionRes> list4 = this.DbNXlk;
        int iHashCode10 = list4 != null ? list4.hashCode() : 0;
        java.lang.Boolean bool4 = this.isConnected;
        int iHashCode11 = bool4 != null ? bool4.hashCode() : 0;
        java.lang.Integer num3 = this.fetchVPNInfo;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        java.util.List<java.lang.String> list5 = this.fIwbmz;
        int iHashCode12 = list5 != null ? list5.hashCode() : 0;
        PictureInPictureArgs pictureInPictureArgs = this.fJNWhG;
        int iHashCode13 = pictureInPictureArgs != null ? pictureInPictureArgs.hashCode() : 0;
        java.util.List<java.lang.String> list6 = this.AuCTel;
        int iHashCode14 = list6 != null ? list6.hashCode() : 0;
        java.lang.Integer num4 = this.fARcdN;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        java.util.List<java.lang.String> list7 = this.ejfBZ;
        int iHashCode15 = list7 != null ? list7.hashCode() : 0;
        DevicePolicyManagerInternal devicePolicyManagerInternal = this.hDKMBd;
        int iHashCode16 = devicePolicyManagerInternal != null ? devicePolicyManagerInternal.hashCode() : 0;
        java.lang.String str3 = this.uzCIH;
        int iHashCode17 = str3 != null ? str3.hashCode() : 0;
        java.util.List<java.lang.String> list8 = this.getFieldNames;
        return (((((((((((((((((((((((((((((((((((((((((iIntValue * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iIntValue2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iIntValue3) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iIntValue4) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (list8 != null ? list8.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RectEvaluator.class != obj.getClass()) {
            return false;
        }
        RectEvaluator rectEvaluator = (RectEvaluator) obj;
        return Intrinsics.EZpvd(this.copydefault, rectEvaluator.copydefault) && Intrinsics.EZpvd(this.KWHzl, rectEvaluator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, rectEvaluator.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, rectEvaluator.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, rectEvaluator.valueOf) && Intrinsics.EZpvd(this.gEmmrt, rectEvaluator.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, rectEvaluator.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) rectEvaluator.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) rectEvaluator.djBIcL) && Intrinsics.EZpvd(this.AkhnZx, rectEvaluator.AkhnZx) && Intrinsics.EZpvd(this.values, rectEvaluator.values) && Intrinsics.EZpvd(this.DbNXlk, rectEvaluator.DbNXlk) && Intrinsics.EZpvd(this.isConnected, rectEvaluator.isConnected) && Intrinsics.EZpvd(this.fetchVPNInfo, rectEvaluator.fetchVPNInfo) && Intrinsics.EZpvd(this.fIwbmz, rectEvaluator.fIwbmz) && Intrinsics.EZpvd(this.fJNWhG, rectEvaluator.fJNWhG) && Intrinsics.EZpvd(this.AuCTel, rectEvaluator.AuCTel) && Intrinsics.EZpvd(this.fARcdN, rectEvaluator.fARcdN) && Intrinsics.EZpvd(this.ejfBZ, rectEvaluator.ejfBZ) && Intrinsics.EZpvd(this.hDKMBd, rectEvaluator.hDKMBd) && Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) rectEvaluator.uzCIH) && Intrinsics.EZpvd(this.getFieldNames, rectEvaluator.getFieldNames);
    }

    public static /* synthetic */ RectEvaluator copy$default(RectEvaluator rectEvaluator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CreateUserPoolClientRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RectEvaluator.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RectEvaluator.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(rectEvaluator);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public AccountsException AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.Boolean AhwBna;
        public java.lang.Boolean AkhnZx;
        public DevicePolicyManagerInternal AuCTel;
        public java.lang.Integer DbNXlk;
        public java.util.List<java.lang.String> EZpvd;
        public java.lang.Boolean KWHzl;
        public java.lang.Integer OLrzqt;
        public java.util.List<? extends NotificationManager> copydefault;
        public java.lang.Integer djBIcL;
        public java.lang.Integer ejfBZ;
        public java.util.List<java.lang.String> fARcdN;
        public java.util.List<java.lang.String> fIwbmz;
        public PictureInPictureArgs fJNWhG;
        public java.util.List<java.lang.String> fetchVPNInfo;
        public java.util.List<java.lang.String> gEmmrt;
        public java.util.List<java.lang.String> hDKMBd;
        public java.util.List<? extends TransitionRes> isConnected;
        public java.lang.String iwGUEr;
        public java.lang.String valueOf;
        public java.lang.Boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountsException AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.TransitionRes>, java.util.List<o.TransitionRes> */
        public final java.util.List<TransitionRes> AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AuCTel() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean DbNXlk() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.NotificationManager>, java.util.List<o.NotificationManager> */
        public final java.util.List<NotificationManager> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> ejfBZ() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer fARcdN() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> fIwbmz() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureArgs fJNWhG() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> getFieldNames() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean isConnected() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String iwGUEr() {
            return this.iwGUEr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DevicePolicyManagerInternal uzCIH() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer values() {
            return this.DbNXlk;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RectEvaluator rectEvaluator) {
            this();
            Intrinsics.checkNotNullParameter(rectEvaluator, "");
            this.OLrzqt = rectEvaluator.EZpvd();
            this.copydefault = rectEvaluator.copydefault();
            this.KWHzl = rectEvaluator.OLrzqt();
            this.EZpvd = rectEvaluator.AEQbTJ();
            this.AEQbTJ = rectEvaluator.KWHzl();
            this.djBIcL = rectEvaluator.djBIcL();
            this.gEmmrt = rectEvaluator.valueOf();
            this.valueOf = rectEvaluator.AYXKKw();
            this.AYXKKw = rectEvaluator.gEmmrt();
            this.AhwBna = rectEvaluator.AhwBna();
            this.AkhnZx = rectEvaluator.DbNXlk();
            this.isConnected = rectEvaluator.values();
            this.values = rectEvaluator.isConnected();
            this.DbNXlk = rectEvaluator.AkhnZx();
            this.fetchVPNInfo = rectEvaluator.fetchVPNInfo();
            this.fJNWhG = rectEvaluator.fJNWhG();
            this.fIwbmz = rectEvaluator.AuCTel();
            this.ejfBZ = rectEvaluator.ejfBZ();
            this.fARcdN = rectEvaluator.fIwbmz();
            this.AuCTel = rectEvaluator.fARcdN();
            this.iwGUEr = rectEvaluator.iwGUEr();
            this.hDKMBd = rectEvaluator.getNewProxyInstance();
        }

        public final RectEvaluator copydefault() {
            return new RectEvaluator(this, null);
        }
    }
}
