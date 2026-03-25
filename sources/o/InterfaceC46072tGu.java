package o;

import com.okinc.planet.biz_positions.data.Ccy;
import com.okinc.planet.biz_positions.data.CurrentPosType;
import com.okinc.planet.biz_positions.data.YieldDetails;
import com.okinc.planet.format.InstId;
import com.okinc.planet.serializer.PlanetNumericString;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.tRU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46072tGu {
    java.lang.String AhwBna();

    /* JADX INFO: renamed from: o.tGu$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar implements InterfaceC46072tGu {
        public static final ActionBar copydefault = new ActionBar();
        public static final java.lang.String AEQbTJ = "Footer";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46072tGu
        public java.lang.String AhwBna() {
            return AEQbTJ;
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.tGu$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application implements InterfaceC46072tGu {
        public static final Application AEQbTJ = new Application();
        public static final java.lang.String OLrzqt = "Space";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46072tGu
        public java.lang.String AhwBna() {
            return OLrzqt;
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.tGu$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC46072tGu {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final StateListAnimator EZpvd = new StateListAnimator("", "", null, 4, null);
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.copydefault(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46072tGu
        public java.lang.String AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new StateListAnimator(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CurrentPositionHeader(longLever=" + this.copydefault + ", shortLever=" + this.AEQbTJ + ", tag=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("CurrentPositionHeader") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:21) call: o.tGu.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "CurrentPositionHeader" : str3);
        }

        /* JADX INFO: renamed from: o.tGu$StateListAnimator$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tGu.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final StateListAnimator AEQbTJ() {
                return StateListAnimator.EZpvd;
            }
        }

        public final boolean EZpvd() {
            return C33129mqd.AhwBna(this.copydefault, 0) || C33129mqd.AhwBna(this.AEQbTJ, 0);
        }
    }

    /* JADX INFO: renamed from: o.tGu$Activity */
    public static final class Activity implements InterfaceC46072tGu, InterfaceC46069tGr {
        public static final ActionBar Companion = new ActionBar(null);
        public static final int KWHzl = 8;
        public static final Activity OLrzqt;
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final java.lang.String AuCTel;
        public final java.lang.String DbNXlk;
        public final java.lang.String EZpvd;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String ejfBZ;
        public final java.lang.String fARcdN;
        public final java.lang.String fIwbmz;
        public final BigDecimal fJNWhG;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final java.lang.String getFieldNames;
        public final YieldDetails.Activity getNewProxyInstance;
        public final java.lang.String hDKMBd;
        public final BigDecimal isConnected;
        public final tRU iwGUEr;
        public final java.lang.String uzCIH;
        public final java.lang.String valueOf;
        public final java.lang.String values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 o.tRU)
  (r6v0 java.lang.String)
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.math.BigDecimal)
  (r11v0 com.okinc.planet.biz_positions.data.YieldDetails$Activity)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.math.BigDecimal)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.tRU, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, com.okinc.planet.biz_positions.data.YieldDetails$Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] call: o.tGu.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.tRU, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, com.okinc.planet.biz_positions.data.YieldDetails$Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, tRU tru, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, BigDecimal bigDecimal, YieldDetails.Activity activity, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, BigDecimal bigDecimal2, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, tru, str5, str6, str7, str8, bigDecimal, activity, str9, str10, str11, str12, str13, str14, bigDecimal2, str15, str16, str17, str18, str19);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46069tGr
        public java.lang.String AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46072tGu
        public java.lang.String AhwBna() {
            return this.uzCIH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTel() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46069tGr
        public java.lang.String EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46069tGr
        public java.lang.String KWHzl() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull tRU tru, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull BigDecimal bigDecimal, @NotNull YieldDetails.Activity activity, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14, @NotNull BigDecimal bigDecimal2, @NotNull java.lang.String str15, @NotNull java.lang.String str16, @NotNull java.lang.String str17, @NotNull java.lang.String str18, @NotNull java.lang.String str19) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(tru, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            Intrinsics.checkNotNullParameter(str13, "");
            Intrinsics.checkNotNullParameter(str14, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(str15, "");
            Intrinsics.checkNotNullParameter(str16, "");
            Intrinsics.checkNotNullParameter(str17, "");
            Intrinsics.checkNotNullParameter(str18, "");
            Intrinsics.checkNotNullParameter(str19, "");
            return new Activity(str, str2, str3, str4, tru, str5, str6, str7, str8, bigDecimal, activity, str9, str10, str11, str12, str13, str14, bigDecimal2, str15, str16, str17, str18, str19, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46069tGr
        public java.lang.String OLrzqt() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46069tGr
        public java.lang.String copydefault() {
            return this.getFieldNames;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String ejfBZ() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) activity.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && InstId.copydefault(this.djBIcL, activity.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna) && Intrinsics.EZpvd(this.iwGUEr, activity.iwGUEr) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) activity.values) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) activity.hDKMBd) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) activity.fetchVPNInfo) && Intrinsics.EZpvd(this.fJNWhG, activity.fJNWhG) && Intrinsics.EZpvd(this.getNewProxyInstance, activity.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) activity.AuCTel) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) activity.ejfBZ) && PlanetNumericString.EZpvd(this.getFieldNames, activity.getFieldNames) && PlanetNumericString.EZpvd(this.valueOf, activity.valueOf) && PlanetNumericString.EZpvd(this.fIwbmz, activity.fIwbmz) && PlanetNumericString.EZpvd(this.DbNXlk, activity.DbNXlk) && Intrinsics.EZpvd(this.isConnected, activity.isConnected) && PlanetNumericString.EZpvd(this.AEQbTJ, activity.AEQbTJ) && PlanetNumericString.EZpvd(this.copydefault, activity.copydefault) && PlanetNumericString.EZpvd(this.AkhnZx, activity.AkhnZx) && PlanetNumericString.EZpvd(this.gEmmrt, activity.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.uzCIH, (java.lang.Object) activity.uzCIH);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigDecimal fARcdN() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fIwbmz() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigDecimal fJNWhG() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((this.fARcdN.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + InstId.OLrzqt(this.djBIcL)) * 31) + this.AhwBna.hashCode()) * 31) + this.iwGUEr.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.hDKMBd.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + this.getNewProxyInstance.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + PlanetNumericString.EZpvd(this.getFieldNames)) * 31) + PlanetNumericString.EZpvd(this.valueOf)) * 31) + PlanetNumericString.EZpvd(this.fIwbmz)) * 31) + PlanetNumericString.EZpvd(this.DbNXlk)) * 31) + this.isConnected.hashCode()) * 31) + PlanetNumericString.EZpvd(this.AEQbTJ)) * 31) + PlanetNumericString.EZpvd(this.copydefault)) * 31) + PlanetNumericString.EZpvd(this.AkhnZx)) * 31) + PlanetNumericString.EZpvd(this.gEmmrt)) * 31) + this.uzCIH.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final tRU iwGUEr() {
            return this.iwGUEr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CurrentPositionItem(posId=" + this.fARcdN + ", cTime=" + this.EZpvd + ", instId=" + InstId.AEQbTJ(this.djBIcL) + ", instType=" + this.AhwBna + ", tradeSide=" + this.iwGUEr + ", mgnMode=" + this.values + ", lever=" + this.AYXKKw + ", quoteCcy=" + this.hDKMBd + ", marginCcy=" + this.fetchVPNInfo + ", pnl=" + this.fJNWhG + ", yieldDetails=" + this.getNewProxyInstance + ", pnlRatio=" + this.AuCTel + ", posCcy=" + this.ejfBZ + ", subPos=" + PlanetNumericString.copydefault(this.getFieldNames) + ", last=" + PlanetNumericString.copydefault(this.valueOf) + ", notionalUsd=" + PlanetNumericString.copydefault(this.fIwbmz) + ", margin=" + PlanetNumericString.copydefault(this.DbNXlk) + ", mgnRatio=" + this.isConnected + ", avgPx=" + PlanetNumericString.copydefault(this.AEQbTJ) + ", bePx=" + PlanetNumericString.copydefault(this.copydefault) + ", markPx=" + PlanetNumericString.copydefault(this.AkhnZx) + ", liqPx=" + PlanetNumericString.copydefault(this.gEmmrt) + ", tag=" + this.uzCIH + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final YieldDetails.Activity uzCIH() {
            return this.getNewProxyInstance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.DbNXlk;
        }

        public Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, tRU tru, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, BigDecimal bigDecimal, YieldDetails.Activity activity, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, BigDecimal bigDecimal2, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(tru, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            Intrinsics.checkNotNullParameter(str13, "");
            Intrinsics.checkNotNullParameter(str14, "");
            Intrinsics.checkNotNullParameter(bigDecimal2, "");
            Intrinsics.checkNotNullParameter(str15, "");
            Intrinsics.checkNotNullParameter(str16, "");
            Intrinsics.checkNotNullParameter(str17, "");
            Intrinsics.checkNotNullParameter(str18, "");
            Intrinsics.checkNotNullParameter(str19, "");
            this.fARcdN = str;
            this.EZpvd = str2;
            this.djBIcL = str3;
            this.AhwBna = str4;
            this.iwGUEr = tru;
            this.values = str5;
            this.AYXKKw = str6;
            this.hDKMBd = str7;
            this.fetchVPNInfo = str8;
            this.fJNWhG = bigDecimal;
            this.getNewProxyInstance = activity;
            this.AuCTel = str9;
            this.ejfBZ = str10;
            this.getFieldNames = str11;
            this.valueOf = str12;
            this.fIwbmz = str13;
            this.DbNXlk = str14;
            this.isConnected = bigDecimal2;
            this.AEQbTJ = str15;
            this.copydefault = str16;
            this.AkhnZx = str17;
            this.gEmmrt = str18;
            this.uzCIH = str19;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 o.tRU)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.math.BigDecimal)
  (r37v0 com.okinc.planet.biz_positions.data.YieldDetails$Activity)
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (r42v0 java.lang.String)
  (r43v0 java.lang.String)
  (r44v0 java.math.BigDecimal)
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 java.lang.String)
  (r48v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("CurrentPositionItem") : (r49v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.tRU, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, com.okinc.planet.biz_positions.data.YieldDetails$Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:36) call: o.tGu.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.tRU, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, com.okinc.planet.biz_positions.data.YieldDetails$Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
        public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, tRU tru, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, BigDecimal bigDecimal, YieldDetails.Activity activity, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, BigDecimal bigDecimal2, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, tru, str5, str6, str7, str8, bigDecimal, activity, str9, str10, str11, str12, str13, str14, bigDecimal2, str15, str16, str17, str18, (i & 4194304) != 0 ? "CurrentPositionItem" : str19, null);
        }

        /* JADX INFO: renamed from: o.tGu$Activity$ActionBar */
        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tGu.Activity.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }

        static {
            java.lang.String strEZpvd = InstId.EZpvd("");
            tRU.TaskDescription taskDescription = new tRU.TaskDescription("", "");
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            java.lang.String strKWHzl = Ccy.Companion.KWHzl();
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            YieldDetails.ContractCurrentYieldDetails contractCurrentYieldDetails = new YieldDetails.ContractCurrentYieldDetails(bigDecimal, bigDecimal, bigDecimal, bigDecimal, strKWHzl, "", bigDecimal, CurrentPosType.InvalidPosType, bigDecimal, null);
            PlanetNumericString.Companion companion = PlanetNumericString.Companion;
            java.lang.String strEZpvd2 = companion.EZpvd();
            java.lang.String strEZpvd3 = companion.EZpvd();
            java.lang.String strEZpvd4 = companion.EZpvd();
            java.lang.String strEZpvd5 = companion.EZpvd();
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            OLrzqt = new Activity("", "", strEZpvd, "", taskDescription, "", "", "", "", bigDecimal, contractCurrentYieldDetails, "", "", strEZpvd2, strEZpvd3, strEZpvd4, strEZpvd5, bigDecimal, companion.EZpvd(), companion.EZpvd(), companion.EZpvd(), companion.EZpvd(), null, 4194304, null);
        }
    }
}
