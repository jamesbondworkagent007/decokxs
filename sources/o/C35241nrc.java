package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.bean.InputPanelStyle;
import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35241nrc {
    public static final int OLrzqt = OKMessage.$stable;
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final boolean AkhnZx;
    public final java.lang.String AuCTel;
    public final boolean DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean KWHzl;
    public final ChatOrigin copydefault;
    public final InputPanelStyle djBIcL;
    public final java.lang.String ejfBZ;
    public final OKMessage fARcdN;
    public final java.lang.String fIwbmz;
    public final java.lang.String fJNWhG;
    public final boolean fetchVPNInfo;
    public final boolean gEmmrt;
    public final IMPageType isConnected;
    public final java.lang.Integer valueOf;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMPageType AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatOrigin KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35241nrc copydefault(java.lang.String str, java.lang.String str2, @NotNull ChatOrigin chatOrigin, IMPageType iMPageType, java.lang.String str3, java.lang.Integer num, InputPanelStyle inputPanelStyle, java.lang.String str4, java.lang.Boolean bool, OKMessage oKMessage, java.lang.String str5, java.lang.String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str7, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(chatOrigin, "");
        return new C35241nrc(str, str2, chatOrigin, iMPageType, str3, num, inputPanelStyle, str4, bool, oKMessage, str5, str6, z, z2, z3, z4, z5, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35241nrc)) {
            return false;
        }
        C35241nrc c35241nrc = (C35241nrc) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c35241nrc.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) c35241nrc.ejfBZ) && this.copydefault == c35241nrc.copydefault && this.isConnected == c35241nrc.isConnected && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c35241nrc.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, c35241nrc.valueOf) && this.djBIcL == c35241nrc.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c35241nrc.AhwBna) && Intrinsics.EZpvd(this.KWHzl, c35241nrc.KWHzl) && Intrinsics.EZpvd(this.fARcdN, c35241nrc.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.fIwbmz, (java.lang.Object) c35241nrc.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c35241nrc.fJNWhG) && this.values == c35241nrc.values && this.fetchVPNInfo == c35241nrc.fetchVPNInfo && this.DbNXlk == c35241nrc.DbNXlk && this.AkhnZx == c35241nrc.AkhnZx && this.gEmmrt == c35241nrc.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c35241nrc.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c35241nrc.AuCTel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.ejfBZ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        IMPageType iMPageType = this.isConnected;
        int iHashCode4 = iMPageType == null ? 0 : iMPageType.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.Integer num = this.valueOf;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        InputPanelStyle inputPanelStyle = this.djBIcL;
        int iHashCode7 = inputPanelStyle == null ? 0 : inputPanelStyle.hashCode();
        java.lang.String str4 = this.AhwBna;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        java.lang.Boolean bool = this.KWHzl;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        OKMessage oKMessage = this.fARcdN;
        int iHashCode10 = oKMessage == null ? 0 : oKMessage.hashCode();
        java.lang.String str5 = this.fIwbmz;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.fJNWhG;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        int iHashCode13 = java.lang.Boolean.hashCode(this.values);
        int iHashCode14 = java.lang.Boolean.hashCode(this.fetchVPNInfo);
        int iHashCode15 = java.lang.Boolean.hashCode(this.DbNXlk);
        int iHashCode16 = java.lang.Boolean.hashCode(this.AkhnZx);
        int iHashCode17 = java.lang.Boolean.hashCode(this.gEmmrt);
        java.lang.String str7 = this.AYXKKw;
        int iHashCode18 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.AuCTel;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (str8 == null ? 0 : str8.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputPanelStyle valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.gEmmrt;
    }

    public C35241nrc(java.lang.String str, java.lang.String str2, @NotNull ChatOrigin chatOrigin, IMPageType iMPageType, java.lang.String str3, java.lang.Integer num, InputPanelStyle inputPanelStyle, java.lang.String str4, java.lang.Boolean bool, OKMessage oKMessage, java.lang.String str5, java.lang.String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str7, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(chatOrigin, "");
        this.EZpvd = str;
        this.ejfBZ = str2;
        this.copydefault = chatOrigin;
        this.isConnected = iMPageType;
        this.AEQbTJ = str3;
        this.valueOf = num;
        this.djBIcL = inputPanelStyle;
        this.AhwBna = str4;
        this.KWHzl = bool;
        this.fARcdN = oKMessage;
        this.fIwbmz = str5;
        this.fJNWhG = str6;
        this.values = z;
        this.fetchVPNInfo = z2;
        this.DbNXlk = z3;
        this.AkhnZx = z4;
        this.gEmmrt = z5;
        this.AYXKKw = str7;
        this.AuCTel = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r43v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (r26v0 com.okinc.im.bean.ChatOrigin)
  (wrap:com.okinc.im.config.page.IMPageType:?: TERNARY null = ((wrap:int:0x0013: ARITH (r43v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.config.page.IMPageType) : (r27v0 com.okinc.im.config.page.IMPageType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
  (wrap:com.okinc.im.bean.InputPanelStyle:?: TERNARY null = ((wrap:int:0x002b: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.bean.InputPanelStyle) : (r30v0 com.okinc.im.bean.InputPanelStyle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (wrap:com.okinc.okimcore.model.im.OKMessage:?: TERNARY null = ((wrap:int:0x0043: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKMessage) : (r33v0 com.okinc.okimcore.model.im.OKMessage))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? true : (r36v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? true : (r37v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006e: ARITH (r43v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? true : (r38v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007a: ARITH (32768 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? true : (r39v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0084: ARITH (65536 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? true : (r40v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (131072 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.im.bean.ChatOrigin, com.okinc.im.config.page.IMPageType, java.lang.String, java.lang.Integer, com.okinc.im.bean.InputPanelStyle, java.lang.String, java.lang.Boolean, com.okinc.okimcore.model.im.OKMessage, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String):void (m)] (LINE:6) call: o.nrc.<init>(java.lang.String, java.lang.String, com.okinc.im.bean.ChatOrigin, com.okinc.im.config.page.IMPageType, java.lang.String, java.lang.Integer, com.okinc.im.bean.InputPanelStyle, java.lang.String, java.lang.Boolean, com.okinc.okimcore.model.im.OKMessage, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C35241nrc(java.lang.String str, java.lang.String str2, ChatOrigin chatOrigin, IMPageType iMPageType, java.lang.String str3, java.lang.Integer num, InputPanelStyle inputPanelStyle, java.lang.String str4, java.lang.Boolean bool, OKMessage oKMessage, java.lang.String str5, java.lang.String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.String str7, java.lang.String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, chatOrigin, (i & 8) != 0 ? null : iMPageType, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : inputPanelStyle, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : oKMessage, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? true : z, (i & 8192) != 0 ? true : z2, (i & 16384) != 0 ? true : z3, (32768 & i) != 0 ? true : z4, (65536 & i) != 0 ? true : z5, (131072 & i) != 0 ? null : str7, (i & 262144) != 0 ? null : str8);
    }

    public java.lang.String toString() {
        kotlin.Pair[] pairArr = new kotlin.Pair[18];
        pairArr[0] = C56390yDp.OLrzqt(RemoteMessageConst.Notification.CHANNEL_ID, this.EZpvd);
        pairArr[1] = C56390yDp.OLrzqt("relationId", this.ejfBZ);
        pairArr[2] = C56390yDp.OLrzqt("chatOrigin", this.copydefault);
        pairArr[3] = C56390yDp.OLrzqt("fragmentResultListenerKey", this.AEQbTJ);
        pairArr[4] = C56390yDp.OLrzqt("initialMsgSequence", this.valueOf);
        pairArr[5] = C56390yDp.OLrzqt("inputPanelStyle", this.djBIcL);
        pairArr[6] = C56390yDp.OLrzqt("inputHintText", this.AhwBna);
        pairArr[7] = C56390yDp.OLrzqt("allowMessageClickActions", this.KWHzl);
        OKMessage oKMessage = this.fARcdN;
        pairArr[8] = C56390yDp.OLrzqt("targetMessage", oKMessage != null ? java.lang.Long.valueOf(oKMessage.getSeq()) : null);
        pairArr[9] = C56390yDp.OLrzqt("searchKey", this.fIwbmz);
        pairArr[10] = C56390yDp.OLrzqt("prefillMsg", this.fJNWhG);
        pairArr[11] = C56390yDp.OLrzqt("isDisplayUserInfo", java.lang.Boolean.valueOf(this.values));
        pairArr[12] = C56390yDp.OLrzqt("isEnableAddButton", java.lang.Boolean.valueOf(this.fetchVPNInfo));
        pairArr[13] = C56390yDp.OLrzqt("isEnableStickerButton", java.lang.Boolean.valueOf(this.DbNXlk));
        pairArr[14] = C56390yDp.OLrzqt("isEnableVoiceButton", java.lang.Boolean.valueOf(this.AkhnZx));
        pairArr[15] = C56390yDp.OLrzqt("isDisplayIntervalTimestamp", java.lang.Boolean.valueOf(this.gEmmrt));
        pairArr[16] = C56390yDp.OLrzqt("groupId", this.AYXKKw);
        pairArr[17] = C56390yDp.OLrzqt("trackerSource", this.AuCTel);
        return C56424yEw.gEmmrt(pairArr).toString();
    }
}
