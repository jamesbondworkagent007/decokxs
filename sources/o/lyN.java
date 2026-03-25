package o;

import com.okinc.crcore.shared.net.responsebean.bsc.CampaignBean;
import com.okinc.crcore.shared.net.responsebean.bsc.MissionBean;
import com.okinc.crcore.shared.net.responsebean.bsc.MissionConstrainsBean;
import com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean;
import com.okinc.crcore.shared.net.responsebean.bsc.MissionStreakBean;
import com.okinc.crcore.shared.net.responsebean.bsc.RewardBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyN {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC31764mDa OLrzqt;

    @yCM
    public lyN(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.OLrzqt = interfaceC31764mDa;
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<CampaignBean, OKServerException>> continuation) {
        return this.OLrzqt.AEQbTJ("US_BUY_CRYPTO_CASHBACK", continuation);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lyN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX INFO: loaded from: classes15.dex */
        public static class Application {

            public static final class ActionBar extends Application {
                public static final ActionBar copydefault = new ActionBar();

                private ActionBar() {
                }
            }

            public static final class StateListAnimator extends Application {
                public static final int EZpvd = RewardBean.$stable | MissionBean.$stable;
                public final RewardBean AEQbTJ;
                public final MissionBean KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, MissionBean missionBean, RewardBean rewardBean, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        missionBean = stateListAnimator.KWHzl;
                    }
                    if ((i & 2) != 0) {
                        rewardBean = stateListAnimator.AEQbTJ;
                    }
                    return stateListAnimator.KWHzl(missionBean, rewardBean);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final StateListAnimator KWHzl(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    return new StateListAnimator(missionBean, rewardBean);
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
                    return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.KWHzl.hashCode();
                    RewardBean rewardBean = this.AEQbTJ;
                    return (iHashCode * 31) + (rewardBean == null ? 0 : rewardBean.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "MissionActive(mission=" + this.KWHzl + ", reward=" + this.AEQbTJ + ")";
                }

                public StateListAnimator(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    this.KWHzl = missionBean;
                    this.AEQbTJ = rewardBean;
                }
            }

            /* JADX INFO: renamed from: o.lyN$TaskDescription$Application$TaskDescription, reason: collision with other inner class name */
            public static final class C0875TaskDescription extends Application {
                public static final int copydefault = RewardBean.$stable | MissionBean.$stable;
                public final MissionBean AEQbTJ;
                public final RewardBean KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ C0875TaskDescription copy$default(C0875TaskDescription c0875TaskDescription, MissionBean missionBean, RewardBean rewardBean, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        missionBean = c0875TaskDescription.AEQbTJ;
                    }
                    if ((i & 2) != 0) {
                        rewardBean = c0875TaskDescription.KWHzl;
                    }
                    return c0875TaskDescription.OLrzqt(missionBean, rewardBean);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final C0875TaskDescription OLrzqt(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    return new C0875TaskDescription(missionBean, rewardBean);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0875TaskDescription)) {
                        return false;
                    }
                    C0875TaskDescription c0875TaskDescription = (C0875TaskDescription) obj;
                    return Intrinsics.EZpvd(this.AEQbTJ, c0875TaskDescription.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c0875TaskDescription.KWHzl);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.AEQbTJ.hashCode();
                    RewardBean rewardBean = this.KWHzl;
                    return (iHashCode * 31) + (rewardBean == null ? 0 : rewardBean.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "MissionActiveTodayNotDone(mission=" + this.AEQbTJ + ", reward=" + this.KWHzl + ")";
                }

                public C0875TaskDescription(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    this.AEQbTJ = missionBean;
                    this.KWHzl = rewardBean;
                }
            }

            public static final class Activity extends Application {
                public static final int AEQbTJ = RewardBean.$stable | MissionBean.$stable;
                public final RewardBean EZpvd;
                public final MissionBean copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Activity copy$default(Activity activity, MissionBean missionBean, RewardBean rewardBean, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        missionBean = activity.copydefault;
                    }
                    if ((i & 2) != 0) {
                        rewardBean = activity.EZpvd;
                    }
                    return activity.OLrzqt(missionBean, rewardBean);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Activity OLrzqt(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    return new Activity(missionBean, rewardBean);
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
                    return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.copydefault.hashCode();
                    RewardBean rewardBean = this.EZpvd;
                    return (iHashCode * 31) + (rewardBean == null ? 0 : rewardBean.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "MissionActiveTodayDone(mission=" + this.copydefault + ", reward=" + this.EZpvd + ")";
                }

                public Activity(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    this.copydefault = missionBean;
                    this.EZpvd = rewardBean;
                }
            }

            /* JADX INFO: renamed from: o.lyN$TaskDescription$Application$Application, reason: collision with other inner class name */
            public static final class C0874Application extends Application {
                public static final int OLrzqt = RewardBean.$stable | MissionBean.$stable;
                public final MissionBean AEQbTJ;
                public final RewardBean EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ C0874Application copy$default(C0874Application c0874Application, MissionBean missionBean, RewardBean rewardBean, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        missionBean = c0874Application.AEQbTJ;
                    }
                    if ((i & 2) != 0) {
                        rewardBean = c0874Application.EZpvd;
                    }
                    return c0874Application.AEQbTJ(missionBean, rewardBean);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final C0874Application AEQbTJ(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    return new C0874Application(missionBean, rewardBean);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0874Application)) {
                        return false;
                    }
                    C0874Application c0874Application = (C0874Application) obj;
                    return Intrinsics.EZpvd(this.AEQbTJ, c0874Application.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c0874Application.EZpvd);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.AEQbTJ.hashCode();
                    RewardBean rewardBean = this.EZpvd;
                    return (iHashCode * 31) + (rewardBean == null ? 0 : rewardBean.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "MissionCompleted(mission=" + this.AEQbTJ + ", reward=" + this.EZpvd + ")";
                }

                public C0874Application(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    this.AEQbTJ = missionBean;
                    this.EZpvd = rewardBean;
                }
            }

            public static final class PendingIntent extends Application {
                public static final int AEQbTJ = RewardBean.$stable | MissionBean.$stable;
                public final RewardBean EZpvd;
                public final MissionBean KWHzl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, MissionBean missionBean, RewardBean rewardBean, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        missionBean = pendingIntent.KWHzl;
                    }
                    if ((i & 2) != 0) {
                        rewardBean = pendingIntent.EZpvd;
                    }
                    return pendingIntent.AEQbTJ(missionBean, rewardBean);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final PendingIntent AEQbTJ(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    return new PendingIntent(missionBean, rewardBean);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PendingIntent)) {
                        return false;
                    }
                    PendingIntent pendingIntent = (PendingIntent) obj;
                    return Intrinsics.EZpvd(this.KWHzl, pendingIntent.KWHzl) && Intrinsics.EZpvd(this.EZpvd, pendingIntent.EZpvd);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.KWHzl.hashCode();
                    RewardBean rewardBean = this.EZpvd;
                    return (iHashCode * 31) + (rewardBean == null ? 0 : rewardBean.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "RewardsEligible(mission=" + this.KWHzl + ", reward=" + this.EZpvd + ")";
                }

                public PendingIntent(@NotNull MissionBean missionBean, RewardBean rewardBean) {
                    Intrinsics.checkNotNullParameter(missionBean, "");
                    this.KWHzl = missionBean;
                    this.EZpvd = rewardBean;
                }
            }
        }

        public final Application copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, CampaignBean campaignBean) {
            java.lang.String minAmount;
            java.lang.Object next;
            java.lang.Object next2;
            MissionStreakBean streak;
            MissionStreakBean streak2;
            MissionConstrainsBean constraints;
            MissionConstrainsBean constraints2;
            MissionConstrainsBean constraints3;
            java.util.List<java.lang.String> excludedCurrencies;
            MissionConstrainsBean constraints4;
            MissionConstrainsBean constraints5;
            MissionConstrainsBean constraints6;
            java.util.List<java.lang.String> excludedCurrencies2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            if (campaignBean == null) {
                return Application.ActionBar.copydefault;
            }
            java.util.List<MissionBean> missions = campaignBean.getMissions();
            java.util.Iterator<T> it = missions.iterator();
            while (true) {
                minAmount = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                MissionBean missionBean = (MissionBean) next;
                if (Intrinsics.EZpvd((java.lang.Object) missionBean.getMissionCode(), (java.lang.Object) "SIMPLE_BUY_BASE_MISSION") && C59449zhJ.gEmmrt(missionBean.getStatus(), "ACTIVE", true)) {
                    break;
                }
            }
            MissionBean missionBean2 = (MissionBean) next;
            if (missionBean2 != null) {
                MissionMetadataBean metadata = missionBean2.getMetadata();
                if (metadata != null && (constraints6 = metadata.getConstraints()) != null && (excludedCurrencies2 = constraints6.getExcludedCurrencies()) != null && !excludedCurrencies2.isEmpty()) {
                    java.util.Iterator<T> it2 = excludedCurrencies2.iterator();
                    while (it2.hasNext()) {
                        if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) it2.next(), (java.lang.CharSequence) str, true)) {
                            return Application.ActionBar.copydefault;
                        }
                    }
                }
                MissionMetadataBean metadata2 = missionBean2.getMetadata();
                if (!C59449zhJ.gEmmrt((metadata2 == null || (constraints5 = metadata2.getConstraints()) == null) ? null : constraints5.getLimitAmountUnit(), str2, true)) {
                    return Application.ActionBar.copydefault;
                }
                MissionMetadataBean metadata3 = missionBean2.getMetadata();
                if (metadata3 != null && (constraints4 = metadata3.getConstraints()) != null) {
                    minAmount = constraints4.getMinAmount();
                }
                if (C33129mqd.AEQbTJ(minAmount, str3)) {
                    return new Application.StateListAnimator(missionBean2, copydefault(campaignBean));
                }
                return new Application.PendingIntent(missionBean2, copydefault(campaignBean));
            }
            java.util.Iterator<T> it3 = missions.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((MissionBean) next2).getMissionCode(), (java.lang.Object) "SIMPLE_BUY_MILESTONE_5_DAYS")) {
                    break;
                }
            }
            MissionBean missionBean3 = (MissionBean) next2;
            if (missionBean3 != null) {
                if (C59449zhJ.gEmmrt(missionBean3.getStatus(), "ACTIVE", true)) {
                    MissionMetadataBean metadata4 = missionBean3.getMetadata();
                    if (metadata4 != null && (constraints3 = metadata4.getConstraints()) != null && (excludedCurrencies = constraints3.getExcludedCurrencies()) != null && !excludedCurrencies.isEmpty()) {
                        java.util.Iterator<T> it4 = excludedCurrencies.iterator();
                        while (it4.hasNext()) {
                            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) it4.next(), (java.lang.CharSequence) str, true)) {
                                return Application.ActionBar.copydefault;
                            }
                        }
                    }
                    MissionMetadataBean metadata5 = missionBean3.getMetadata();
                    if (!C59449zhJ.gEmmrt((metadata5 == null || (constraints2 = metadata5.getConstraints()) == null) ? null : constraints2.getLimitAmountUnit(), str2, true)) {
                        return Application.ActionBar.copydefault;
                    }
                    MissionMetadataBean metadata6 = missionBean3.getMetadata();
                    if (metadata6 != null && (streak2 = metadata6.getStreak()) != null && streak2.getTimesCompletedToday() == 0) {
                        MissionMetadataBean metadata7 = missionBean3.getMetadata();
                        if (metadata7 != null && (constraints = metadata7.getConstraints()) != null) {
                            minAmount = constraints.getMinAmount();
                        }
                        if (C33129mqd.AEQbTJ(minAmount, str3)) {
                            return new Application.C0875TaskDescription(missionBean3, copydefault(campaignBean));
                        }
                        return new Application.PendingIntent(missionBean3, copydefault(campaignBean));
                    }
                    MissionMetadataBean metadata8 = missionBean3.getMetadata();
                    if (metadata8 == null || (streak = metadata8.getStreak()) == null || streak.getTimesCompletedToday() != 0) {
                        return new Application.Activity(missionBean3, copydefault(campaignBean));
                    }
                    return Application.ActionBar.copydefault;
                }
                if (C59449zhJ.gEmmrt(missionBean3.getStatus(), "COMPLETED", true)) {
                    return new Application.C0874Application(missionBean3, copydefault(campaignBean));
                }
                return Application.ActionBar.copydefault;
            }
            return Application.ActionBar.copydefault;
        }

        public final RewardBean copydefault(CampaignBean campaignBean) {
            java.lang.Object next;
            java.util.Iterator<T> it = campaignBean.getRewards().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                RewardBean rewardBean = (RewardBean) next;
                if (Intrinsics.EZpvd((java.lang.Object) rewardBean.getCampaignCode(), (java.lang.Object) "US_BUY_CRYPTO_CASHBACK") && (Intrinsics.EZpvd((java.lang.Object) rewardBean.getRewardCode(), (java.lang.Object) "ONETIME_BUY_BASE_REWARD") || Intrinsics.EZpvd((java.lang.Object) rewardBean.getRewardCode(), (java.lang.Object) "ONETIME_BUY_MILESTONE_5X"))) {
                    break;
                }
            }
            return (RewardBean) next;
        }
    }
}
