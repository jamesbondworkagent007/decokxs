package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.data.OrbitSettingUpgradeCardType;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tIy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46130tIy extends InterfaceC46125tIt {
    public static final Application Companion = Application.AEQbTJ;

    boolean KWHzl();

    java.lang.String OLrzqt();

    @Override // o.InterfaceC46125tIt
    int copydefault();

    /* JADX INFO: renamed from: o.tIy$Dialog */
    public static final class Dialog implements InterfaceC46130tIy {
        public static final java.lang.Integer EZpvd = null;
        public static final java.lang.String KWHzl = null;
        public static final boolean OLrzqt = false;
        public static final int djBIcL = 0;
        public static final Dialog copydefault = new Dialog();
        public static final java.lang.String AEQbTJ = "pr_orbit_profile_label_profile";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return djBIcL;
        }

        private Dialog() {
        }
    }

    /* JADX INFO: renamed from: o.tIy$TaskDescription */
    public static final class TaskDescription implements InterfaceC46130tIy {
        public static final int KWHzl = AffiliatePartnerBeanForPlanet.$stable;
        public final boolean AYXKKw;
        public final java.lang.Integer EZpvd;
        public final java.lang.String OLrzqt;
        public final AffiliatePartnerBeanForPlanet copydefault;
        public final int AhwBna = C47501trL.Fragment.fXHmeK;
        public final java.lang.String AEQbTJ = "pr_orbit_profile_cell_label_affiliate_partners";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                affiliatePartnerBeanForPlanet = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(affiliatePartnerBeanForPlanet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet) {
            return new TaskDescription(affiliatePartnerBeanForPlanet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AffiliatePartnerBeanForPlanet gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet = this.copydefault;
            if (affiliatePartnerBeanForPlanet == null) {
                return 0;
            }
            return affiliatePartnerBeanForPlanet.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AffiliatePartnerBind(affiliatePartnerBean=" + this.copydefault + ")";
        }

        public TaskDescription(AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanet) {
            this.copydefault = affiliatePartnerBeanForPlanet;
        }
    }

    /* JADX INFO: renamed from: o.tIy$LoaderManager */
    public static final class LoaderManager implements InterfaceC46130tIy {
        public final CurveResetInfo AEQbTJ;
        public final int AYXKKw = C47501trL.Fragment.gqOnQv;
        public final java.lang.String EZpvd = "pr_trade_orbit_cell_title_performance_data_start";
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, CurveResetInfo curveResetInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                curveResetInfo = loaderManager.AEQbTJ;
            }
            return loaderManager.copydefault(curveResetInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurveResetInfo AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager copydefault(CurveResetInfo curveResetInfo) {
            return new LoaderManager(curveResetInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoaderManager) && Intrinsics.EZpvd(this.AEQbTJ, ((LoaderManager) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            CurveResetInfo curveResetInfo = this.AEQbTJ;
            if (curveResetInfo == null) {
                return 0;
            }
            return curveResetInfo.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TradingInfoReset(curveResetInfo=" + this.AEQbTJ + ")";
        }

        public LoaderManager(CurveResetInfo curveResetInfo) {
            this.AEQbTJ = curveResetInfo;
        }
    }

    /* JADX INFO: renamed from: o.tIy$Fragment */
    public static final class Fragment implements InterfaceC46130tIy {
        public final java.lang.String AEQbTJ;
        public final int EZpvd;
        public final java.lang.String KWHzl;
        public final boolean OLrzqt;
        public final java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fragment.KWHzl;
            }
            return fragment.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fragment(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fragment) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Fragment) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ProfileMode(mode=" + this.KWHzl + ")";
        }

        public Fragment(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.EZpvd = C47501trL.Fragment.UfveVb;
            this.AEQbTJ = "pr_trade_orbit_cell_title_performance_data";
        }
    }

    /* JADX INFO: renamed from: o.tIy$Activity */
    public static final class Activity implements InterfaceC46130tIy {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final boolean EZpvd;
        public final PlanetAvatarInfo KWHzl;
        public final java.lang.Integer OLrzqt;
        public final java.lang.String copydefault;
        public final int valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, PlanetAvatarInfo planetAvatarInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planetAvatarInfo = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str = activity.AYXKKw;
            }
            return activity.KWHzl(planetAvatarInfo, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull PlanetAvatarInfo planetAvatarInfo, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(planetAvatarInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(planetAvatarInfo, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
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
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.AYXKKw.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CombinedProfileSection(avatarInfo=" + this.KWHzl + ", nickname=" + this.AYXKKw + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PlanetAvatarInfo valueOf() {
            return this.KWHzl;
        }

        public Activity(@NotNull PlanetAvatarInfo planetAvatarInfo, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(planetAvatarInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = planetAvatarInfo;
            this.AYXKKw = str;
            this.copydefault = "pr_orbit_profile_section_combined";
        }
    }

    /* JADX INFO: renamed from: o.tIy$FragmentManager */
    public static final class FragmentManager implements InterfaceC46130tIy {
        public final java.lang.Integer AEQbTJ;
        public final boolean EZpvd;
        public final boolean OLrzqt;
        public final java.lang.String copydefault;
        public final int AhwBna = C47501trL.Fragment.fLIjIY;
        public final java.lang.String KWHzl = "pr_orbit_profile_cell_label_x_account";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = fragmentManager.EZpvd;
            }
            if ((i & 2) != 0) {
                str = fragmentManager.copydefault;
            }
            return fragmentManager.OLrzqt(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager OLrzqt(boolean z, java.lang.String str) {
            return new FragmentManager(z, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return this.EZpvd == fragmentManager.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fragmentManager.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.EZpvd);
            java.lang.String str = this.copydefault;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "XAccount(isLinked=" + this.EZpvd + ", linkedAccountText=" + this.copydefault + ")";
        }

        public FragmentManager(boolean z, java.lang.String str) {
            this.EZpvd = z;
            this.copydefault = str;
        }

        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            if (!this.EZpvd) {
                return C33070mpX.AYXKKw(C47501trL.Fragment.UscePu);
            }
            java.lang.String str = this.copydefault;
            return str == null ? "" : str;
        }
    }

    /* JADX INFO: renamed from: o.tIy$PendingIntent */
    public static final class PendingIntent implements InterfaceC46130tIy {
        public final java.lang.String AEQbTJ;
        public final OrbitSettingUpgradeCardType EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.Integer copydefault;
        public final int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, OrbitSettingUpgradeCardType orbitSettingUpgradeCardType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                orbitSettingUpgradeCardType = pendingIntent.EZpvd;
            }
            return pendingIntent.OLrzqt(orbitSettingUpgradeCardType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent OLrzqt(@NotNull OrbitSettingUpgradeCardType orbitSettingUpgradeCardType) {
            Intrinsics.checkNotNullParameter(orbitSettingUpgradeCardType, "");
            return new PendingIntent(orbitSettingUpgradeCardType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && this.EZpvd == ((PendingIntent) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OrbitSettingUpgradeCardType gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UpgradeCard(cardType=" + this.EZpvd + ")";
        }

        public PendingIntent(@NotNull OrbitSettingUpgradeCardType orbitSettingUpgradeCardType) {
            Intrinsics.checkNotNullParameter(orbitSettingUpgradeCardType, "");
            this.EZpvd = orbitSettingUpgradeCardType;
            this.AEQbTJ = "UpgradeCardProfileSetting";
        }
    }

    /* JADX INFO: renamed from: o.tIy$ActionBar */
    public static final class ActionBar implements InterfaceC46130tIy {
        public static final java.lang.Integer EZpvd = null;
        public static final java.lang.String KWHzl = null;
        public static final boolean copydefault = false;
        public static final int djBIcL = 0;
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String AEQbTJ = "IMChatSectionProfileSetting";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return djBIcL;
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.tIy$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC46130tIy {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.lang.String EZpvd = "DividerProfileSetting";
        public static final java.lang.Integer KWHzl = null;
        public static final java.lang.String OLrzqt = null;
        public static final boolean copydefault = false;
        public static final int djBIcL = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.String AEQbTJ() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46125tIt
        public java.lang.Integer EZpvd() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public boolean KWHzl() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy
        public java.lang.String OLrzqt() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46130tIy, o.InterfaceC46125tIt
        public int copydefault() {
            return djBIcL;
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.tIy$Application */
    public static final class Application {
        public static final /* synthetic */ Application AEQbTJ = new Application();
        public static final DiffUtil.ItemCallback<InterfaceC46130tIy> OLrzqt = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DiffUtil.ItemCallback<InterfaceC46130tIy> copydefault() {
            return OLrzqt;
        }

        private Application() {
        }

        /* JADX INFO: renamed from: o.tIy$Application$Activity */
        public static final class Activity extends DiffUtil.ItemCallback<InterfaceC46130tIy> {
            /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(InterfaceC46130tIy interfaceC46130tIy, InterfaceC46130tIy interfaceC46130tIy2) {
                Intrinsics.checkNotNullParameter(interfaceC46130tIy, "");
                Intrinsics.checkNotNullParameter(interfaceC46130tIy2, "");
                return Intrinsics.EZpvd(interfaceC46130tIy, interfaceC46130tIy2);
            }

            /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(InterfaceC46130tIy interfaceC46130tIy, InterfaceC46130tIy interfaceC46130tIy2) {
                Intrinsics.checkNotNullParameter(interfaceC46130tIy, "");
                Intrinsics.checkNotNullParameter(interfaceC46130tIy2, "");
                return Intrinsics.EZpvd(interfaceC46130tIy, interfaceC46130tIy2);
            }
        }
    }
}
