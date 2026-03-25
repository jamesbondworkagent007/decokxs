package o;

import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public interface tLR {
    java.lang.String KWHzl();

    java.lang.String copydefault();

    /* JADX INFO: loaded from: classes19.dex */
    public interface ActionBar extends tLR {

        public static final class Activity implements ActionBar {
            public final java.lang.String AEQbTJ;
            public java.lang.String EZpvd;
            public final java.lang.String KWHzl;
            public final java.lang.String OLrzqt;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] call: o.tLR.ActionBar.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: copy-D6QaD5c$default, reason: not valid java name */
            public static /* synthetic */ Activity m8732copyD6QaD5c$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = activity.KWHzl;
                }
                java.lang.String str6 = str2;
                if ((i & 4) != 0) {
                    str3 = activity.copydefault;
                }
                java.lang.String str7 = str3;
                if ((i & 8) != 0) {
                    str4 = activity.OLrzqt;
                }
                java.lang.String str8 = str4;
                if ((i & 16) != 0) {
                    str5 = activity.EZpvd;
                }
                return activity.EZpvd(str, str6, str7, str8, str5);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new Activity(str, str2, str3, str4, str5, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.tLR
            public java.lang.String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.tLR
            public java.lang.String copydefault() {
                return this.AEQbTJ;
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
                return PlanetUniqueName.KWHzl(this.AEQbTJ, activity.AEQbTJ) && PlanetAuthorId.OLrzqt(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iOLrzqt = PlanetUniqueName.OLrzqt(this.AEQbTJ);
                int iAEQbTJ = PlanetAuthorId.AEQbTJ(this.KWHzl);
                int iHashCode = this.copydefault.hashCode();
                int iHashCode2 = this.OLrzqt.hashCode();
                java.lang.String str = this.EZpvd;
                return (((((((iOLrzqt * 31) + iAEQbTJ) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FeedProfile(uniqueName=" + PlanetUniqueName.copydefault(this.AEQbTJ) + ", authorId=" + PlanetAuthorId.EZpvd(this.KWHzl) + ", targetId=" + this.copydefault + ", url=" + this.OLrzqt + ", content=" + this.EZpvd + ")";
            }

            public Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.AEQbTJ = str;
                this.KWHzl = str2;
                this.copydefault = str3;
                this.OLrzqt = str4;
                this.EZpvd = str5;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:18) call: o.tLR.ActionBar.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
            public /* synthetic */ Activity(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, null);
            }
        }

        public static final class StateListAnimator implements ActionBar {
            public final java.lang.String AEQbTJ;
            public final java.lang.String EZpvd;
            public final java.lang.String KWHzl;
            public final PlanetTradeTypes OLrzqt;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 com.okinc.planet.biz_userprofile.data.PlanetTradeTypes)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTradeTypes):void (m)] call: o.tLR.ActionBar.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTradeTypes):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, PlanetTradeTypes planetTradeTypes, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, planetTradeTypes);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: copy-D6QaD5c$default, reason: not valid java name */
            public static /* synthetic */ StateListAnimator m8733copyD6QaD5c$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, PlanetTradeTypes planetTradeTypes, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.KWHzl;
                }
                if ((i & 2) != 0) {
                    str2 = stateListAnimator.EZpvd;
                }
                java.lang.String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = stateListAnimator.copydefault;
                }
                java.lang.String str6 = str3;
                if ((i & 8) != 0) {
                    str4 = stateListAnimator.AEQbTJ;
                }
                java.lang.String str7 = str4;
                if ((i & 16) != 0) {
                    planetTradeTypes = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.EZpvd(str, str5, str6, str7, planetTradeTypes);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull PlanetTradeTypes planetTradeTypes) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(planetTradeTypes, "");
                return new StateListAnimator(str, str2, str3, str4, planetTradeTypes, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.tLR
            public java.lang.String KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.tLR
            public java.lang.String copydefault() {
                return this.KWHzl;
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
                return PlanetUniqueName.KWHzl(this.KWHzl, stateListAnimator.KWHzl) && PlanetAuthorId.OLrzqt(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && this.OLrzqt == stateListAnimator.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((((PlanetUniqueName.OLrzqt(this.KWHzl) * 31) + PlanetAuthorId.AEQbTJ(this.EZpvd)) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "CopierProfile(uniqueName=" + PlanetUniqueName.copydefault(this.KWHzl) + ", authorId=" + PlanetAuthorId.EZpvd(this.EZpvd) + ", targetId=" + this.copydefault + ", url=" + this.AEQbTJ + ", tradeTypes=" + this.OLrzqt + ")";
            }

            public StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, PlanetTradeTypes planetTradeTypes) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(planetTradeTypes, "");
                this.KWHzl = str;
                this.EZpvd = str2;
                this.copydefault = str3;
                this.AEQbTJ = str4;
                this.OLrzqt = planetTradeTypes;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (r12v0 com.okinc.planet.biz_userprofile.data.PlanetTradeTypes)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTradeTypes, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:26) call: o.tLR.ActionBar.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.biz_userprofile.data.PlanetTradeTypes, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
            public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, PlanetTradeTypes planetTradeTypes, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, (i & 8) != 0 ? "" : str4, planetTradeTypes, null);
            }
        }
    }
}
