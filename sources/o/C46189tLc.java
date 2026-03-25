package o;

import com.okinc.planet.biz_notifications.model.FollowStatusV2Enum;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetBioContent;
import com.okinc.planet.biz_userprofile.data.PlanetOfficialStatus;
import com.okinc.planet.biz_userprofile.data.PlanetProfileGroupInfo;
import com.okinc.planet.biz_userprofile.data.PlanetRoleType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46189tLc implements tKZ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final C46189tLc OLrzqt = new C46189tLc(null, false, null, 7, null);
    public final java.lang.String AEQbTJ;
    public final /* synthetic */ C46193tLg KWHzl;
    public final boolean copydefault;
    public final PlanetBasicUserInfoResp valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46189tLc() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46189tLc copy$default(C46189tLc c46189tLc, PlanetBasicUserInfoResp planetBasicUserInfoResp, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planetBasicUserInfoResp = c46189tLc.valueOf;
        }
        if ((i & 2) != 0) {
            z = c46189tLc.copydefault;
        }
        if ((i & 4) != 0) {
            str = c46189tLc.AEQbTJ;
        }
        return c46189tLc.EZpvd(planetBasicUserInfoResp, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.tKZ
    public boolean AEQbTJ() {
        return this.KWHzl.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.KWHzl.AhwBna();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AhwBna() {
        return this.KWHzl.djBIcL();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AkhnZx() {
        return this.KWHzl.valueOf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AuCTel() {
        return this.KWHzl.fARcdN();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String DbNXlk() {
        return this.KWHzl.fetchVPNInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetBasicUserInfoResp EZpvd() {
        return this.KWHzl.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46189tLc EZpvd(@NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        return new C46189tLc(planetBasicUserInfoResp, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.KWHzl.KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetAvatarInfo OLrzqt() {
        return this.KWHzl.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetBioContent djBIcL() {
        return this.KWHzl.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRoleType ejfBZ() {
        return this.KWHzl.fIwbmz();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46189tLc)) {
            return false;
        }
        C46189tLc c46189tLc = (C46189tLc) obj;
        return Intrinsics.EZpvd(this.valueOf, c46189tLc.valueOf) && this.copydefault == c46189tLc.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46189tLc.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRoleType fARcdN() {
        return this.KWHzl.AkhnZx();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetOfficialStatus fIwbmz() {
        return this.KWHzl.isConnected();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRoleType fJNWhG() {
        return this.KWHzl.AuCTel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fetchVPNInfo() {
        return this.KWHzl.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String gEmmrt() {
        return this.KWHzl.gEmmrt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlanetRoleType hDKMBd() {
        return this.KWHzl.ejfBZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PlanetProfileData(basicUserInfo=" + this.valueOf + ", _isSelf=" + this.copydefault + ", alias=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowStatusV2Enum valueOf() {
        return this.KWHzl.AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<PlanetProfileGroupInfo> values() {
        return this.KWHzl.DbNXlk();
    }

    public C46189tLc(@NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
        this.KWHzl = C46190tLd.EZpvd(planetBasicUserInfoResp, z);
        this.valueOf = planetBasicUserInfoResp;
        this.copydefault = z;
        this.AEQbTJ = str;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C46189tLc(com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp r47, boolean r48, java.lang.String r49, int r50, kotlin.jvm.internal.DefaultConstructorMarker r51) {
        /*
            r46 = this;
            r0 = r50 & 1
            if (r0 == 0) goto L55
            com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp r0 = new com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = -1
            r44 = 511(0x1ff, float:7.16E-43)
            r45 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            goto L57
        L55:
            r0 = r47
        L57:
            r1 = r50 & 2
            if (r1 == 0) goto L5d
            r1 = 0
            goto L5f
        L5d:
            r1 = r48
        L5f:
            r2 = r50 & 4
            if (r2 == 0) goto L67
            r2 = 0
            r3 = r46
            goto L6b
        L67:
            r3 = r46
            r2 = r49
        L6b:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C46189tLc.<init>(com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getNewProxyInstance() {
        PlanetRoleType planetRoleTypeFARcdN = fARcdN();
        PlanetRoleType planetRoleType = PlanetRoleType.LeadTrader;
        return planetRoleTypeFARcdN == planetRoleType || ejfBZ() == planetRoleType;
    }

    public final boolean isConnected() {
        return this.valueOf.QfsBiF();
    }

    public final boolean iwGUEr() {
        return this.valueOf.QUSxYX();
    }

    public final boolean getFieldNames() {
        return this.valueOf.QVAiDq();
    }

    /* JADX INFO: renamed from: o.tLc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tLc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C46189tLc map$default(TaskDescription taskDescription, PlanetBasicUserInfoResp planetBasicUserInfoResp, boolean z, C46189tLc c46189tLc, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                c46189tLc = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            return taskDescription.copydefault(planetBasicUserInfoResp, z, c46189tLc, str);
        }

        public final C46189tLc copydefault(@NotNull PlanetBasicUserInfoResp planetBasicUserInfoResp, boolean z, C46189tLc c46189tLc, java.lang.String str) {
            C46189tLc c46189tLcEZpvd;
            Intrinsics.checkNotNullParameter(planetBasicUserInfoResp, "");
            return (c46189tLc == null || (c46189tLcEZpvd = c46189tLc.EZpvd(planetBasicUserInfoResp, z, str)) == null) ? new C46189tLc(planetBasicUserInfoResp, z, str) : c46189tLcEZpvd;
        }
    }
}
