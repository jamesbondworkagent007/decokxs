package com.okinc.business.invest_biz.ui.widget.product_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.bean.SecurityDetailsInfo;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27436jvE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface ProductDetailsClickAction {

    public static final class PendingIntent implements ProductDetailsClickAction {
        public final InvestTipInfoVo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, InvestTipInfoVo investTipInfoVo, int i, Object obj) {
            if ((i & 1) != 0) {
                investTipInfoVo = pendingIntent.OLrzqt;
            }
            return pendingIntent.OLrzqt(investTipInfoVo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent OLrzqt(@NotNull InvestTipInfoVo investTipInfoVo) {
            Intrinsics.checkNotNullParameter(investTipInfoVo, "");
            return new PendingIntent(investTipInfoVo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTipInfoVo copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.OLrzqt, ((PendingIntent) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ShowTip(tip=" + this.OLrzqt + ")";
        }

        public PendingIntent(@NotNull InvestTipInfoVo investTipInfoVo) {
            Intrinsics.checkNotNullParameter(investTipInfoVo, "");
            this.OLrzqt = investTipInfoVo;
        }
    }

    public static final class SharedElementCallback implements ProductDetailsClickAction {
        public final long AEQbTJ;
        public final String AYXKKw;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedElementCallback AEQbTJ(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new SharedElementCallback(j, str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SharedElementCallback)) {
                return false;
            }
            SharedElementCallback sharedElementCallback = (SharedElementCallback) obj;
            return this.AEQbTJ == sharedElementCallback.AEQbTJ && Intrinsics.EZpvd((Object) this.copydefault, (Object) sharedElementCallback.copydefault) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) sharedElementCallback.AYXKKw) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) sharedElementCallback.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) sharedElementCallback.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) sharedElementCallback.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((Long.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ViewTokenInDex(chainId=" + this.AEQbTJ + ", tokenAddress=" + this.copydefault + ", tokenSymbol=" + this.AYXKKw + ", tokenName=" + this.EZpvd + ", tokenLogo=" + this.KWHzl + ", network=" + this.OLrzqt + ")";
        }

        public SharedElementCallback(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.AEQbTJ = j;
            this.copydefault = str;
            this.AYXKKw = str2;
            this.EZpvd = str3;
            this.KWHzl = str4;
            this.OLrzqt = str5;
        }
    }

    public static final class TaskStackBuilder implements ProductDetailsClickAction {
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskStackBuilder copy$default(TaskStackBuilder taskStackBuilder, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskStackBuilder.copydefault;
            }
            return taskStackBuilder.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskStackBuilder EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskStackBuilder(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskStackBuilder) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((TaskStackBuilder) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ViewDapp(url=" + this.copydefault + ")";
        }

        public TaskStackBuilder(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    public static final class ActionBar implements ProductDetailsClickAction {
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            return actionBar.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((ActionBar) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Copy(content=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    public static final class Activity implements ProductDetailsClickAction {
        public final InvestAction AEQbTJ;
        public final InvestUserRewardInfoByInvestment EZpvd;
        public final InvestUserRewardsAction KWHzl;
        public final List<InvestUserRewardElementInfo> OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, InvestAction investAction, InvestUserRewardsAction investUserRewardsAction, InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                investAction = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                investUserRewardsAction = activity.KWHzl;
            }
            InvestUserRewardsAction investUserRewardsAction2 = investUserRewardsAction;
            if ((i & 4) != 0) {
                investUserRewardInfoByInvestment = activity.EZpvd;
            }
            InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment2 = investUserRewardInfoByInvestment;
            if ((i & 8) != 0) {
                list = activity.OLrzqt;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                z = activity.copydefault;
            }
            return activity.OLrzqt(investAction, investUserRewardsAction2, investUserRewardInfoByInvestment2, list2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestUserRewardsAction EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestUserRewardElementInfo> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestUserRewardInfoByInvestment OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull InvestAction investAction, @NotNull InvestUserRewardsAction investUserRewardsAction, @NotNull InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment, @NotNull List<InvestUserRewardElementInfo> list, boolean z) {
            Intrinsics.checkNotNullParameter(investAction, "");
            Intrinsics.checkNotNullParameter(investUserRewardsAction, "");
            Intrinsics.checkNotNullParameter(investUserRewardInfoByInvestment, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(investAction, investUserRewardsAction, investUserRewardInfoByInvestment, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestAction copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.AEQbTJ == activity.AEQbTJ && this.KWHzl == activity.KWHzl && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ClaimFeesAndRewards(action=" + this.AEQbTJ + ", mode=" + this.KWHzl + ", reward=" + this.EZpvd + ", claimingTokens=" + this.OLrzqt + ", isCollectFees=" + this.copydefault + ")";
        }

        public Activity(@NotNull InvestAction investAction, @NotNull InvestUserRewardsAction investUserRewardsAction, @NotNull InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment, @NotNull List<InvestUserRewardElementInfo> list, boolean z) {
            Intrinsics.checkNotNullParameter(investAction, "");
            Intrinsics.checkNotNullParameter(investUserRewardsAction, "");
            Intrinsics.checkNotNullParameter(investUserRewardInfoByInvestment, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = investAction;
            this.KWHzl = investUserRewardsAction;
            this.EZpvd = investUserRewardInfoByInvestment;
            this.OLrzqt = list;
            this.copydefault = z;
        }
    }

    public static final class AssistContent implements ProductDetailsClickAction {
        public final SecurityDetailsInfo KWHzl;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AssistContent copy$default(AssistContent assistContent, SecurityDetailsInfo securityDetailsInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                securityDetailsInfo = assistContent.KWHzl;
            }
            if ((i & 2) != 0) {
                str = assistContent.copydefault;
            }
            return assistContent.EZpvd(securityDetailsInfo, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AssistContent EZpvd(@NotNull SecurityDetailsInfo securityDetailsInfo, @NotNull String str) {
            Intrinsics.checkNotNullParameter(securityDetailsInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new AssistContent(securityDetailsInfo, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SecurityDetailsInfo KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssistContent)) {
                return false;
            }
            AssistContent assistContent = (AssistContent) obj;
            return Intrinsics.EZpvd(this.KWHzl, assistContent.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) assistContent.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ViewSecurityScore(score=" + this.KWHzl + ", scoreColor=" + this.copydefault + ")";
        }

        public AssistContent(@NotNull SecurityDetailsInfo securityDetailsInfo, @NotNull String str) {
            Intrinsics.checkNotNullParameter(securityDetailsInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = securityDetailsInfo;
            this.copydefault = str;
        }
    }

    public static final class ClipData implements ProductDetailsClickAction {
        public final String AEQbTJ;
        public final String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ClipData copy$default(ClipData clipData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clipData.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = clipData.AEQbTJ;
            }
            return clipData.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClipData EZpvd(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ClipData(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClipData)) {
                return false;
            }
            ClipData clipData = (ClipData) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) clipData.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) clipData.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ViewTransactionDetails(txnHash=" + this.KWHzl + ", uopHash=" + this.AEQbTJ + ")";
        }

        public ClipData(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }

    public static final class UiProductDetailsExtInfo implements Parcelable {
        public final String AEQbTJ;
        public final String KWHzl;
        public final String OLrzqt;
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final Parcelable.Creator<UiProductDetailsExtInfo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<UiProductDetailsExtInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiProductDetailsExtInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UiProductDetailsExtInfo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiProductDetailsExtInfo[] newArray(int i) {
                return new UiProductDetailsExtInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UiProductDetailsExtInfo() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UiProductDetailsExtInfo copy$default(UiProductDetailsExtInfo uiProductDetailsExtInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiProductDetailsExtInfo.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = uiProductDetailsExtInfo.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = uiProductDetailsExtInfo.KWHzl;
            }
            return uiProductDetailsExtInfo.EZpvd(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UiProductDetailsExtInfo EZpvd(String str, String str2, String str3) {
            return new UiProductDetailsExtInfo(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiProductDetailsExtInfo)) {
                return false;
            }
            UiProductDetailsExtInfo uiProductDetailsExtInfo = (UiProductDetailsExtInfo) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) uiProductDetailsExtInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) uiProductDetailsExtInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) uiProductDetailsExtInfo.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.AEQbTJ;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiProductDetailsExtInfo(key=" + this.OLrzqt + ", value=" + this.AEQbTJ + ", typeEnum=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.KWHzl);
        }

        public UiProductDetailsExtInfo(String str, String str2, String str3) {
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:56) call: com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction.UiProductDetailsExtInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ UiProductDetailsExtInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction.UiProductDetailsExtInfo.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }
        }
    }

    public static final class LoaderManager implements InterfaceC27436jvE {
        public final List<UiProductDetailsExtInfo> AEQbTJ;
        public final List<InvestUserRewardInfoByInvestment> AhwBna;
        public final boolean EZpvd;
        public final List<InvestBaseDefiTokenInfo> KWHzl;
        public final String OLrzqt;
        public final ProductDetailsClickAction copydefault;
        public final String djBIcL;
        public final String gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestUserRewardInfoByInvestment> AEQbTJ() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull List<UiProductDetailsExtInfo> list, @NotNull String str4, @NotNull List<InvestBaseDefiTokenInfo> list2, @NotNull List<InvestUserRewardInfoByInvestment> list3, ProductDetailsClickAction productDetailsClickAction) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            return new LoaderManager(str, str2, str3, z, list, str4, list2, list3, productDetailsClickAction);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestBaseDefiTokenInfo> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UiProductDetailsExtInfo> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoaderManager)) {
                return false;
            }
            LoaderManager loaderManager = (LoaderManager) obj;
            return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) loaderManager.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) loaderManager.djBIcL) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) loaderManager.OLrzqt) && this.EZpvd == loaderManager.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, loaderManager.AEQbTJ) && Intrinsics.EZpvd((Object) this.valueOf, (Object) loaderManager.valueOf) && Intrinsics.EZpvd(this.KWHzl, loaderManager.KWHzl) && Intrinsics.EZpvd(this.AhwBna, loaderManager.AhwBna) && Intrinsics.EZpvd(this.copydefault, loaderManager.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.gEmmrt.hashCode();
            int iHashCode2 = this.djBIcL.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            int iHashCode4 = Boolean.hashCode(this.EZpvd);
            int iHashCode5 = this.AEQbTJ.hashCode();
            int iHashCode6 = this.valueOf.hashCode();
            int iHashCode7 = this.KWHzl.hashCode();
            int iHashCode8 = this.AhwBna.hashCode();
            ProductDetailsClickAction productDetailsClickAction = this.copydefault;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (productDetailsClickAction == null ? 0 : productDetailsClickAction.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiProductDetailsPortfolioExpiry(label=" + this.gEmmrt + ", range=" + this.djBIcL + ", amount=" + this.OLrzqt + ", isActive=" + this.EZpvd + ", extInfoList=" + this.AEQbTJ + ", settlementTime=" + this.valueOf + ", assetTokenList=" + this.KWHzl + ", rewardTokenList=" + this.AhwBna + ", clickAction=" + this.copydefault + ")";
        }

        public LoaderManager(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull List<UiProductDetailsExtInfo> list, @NotNull String str4, @NotNull List<InvestBaseDefiTokenInfo> list2, @NotNull List<InvestUserRewardInfoByInvestment> list3, ProductDetailsClickAction productDetailsClickAction) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.gEmmrt = str;
            this.djBIcL = str2;
            this.OLrzqt = str3;
            this.EZpvd = z;
            this.AEQbTJ = list;
            this.valueOf = str4;
            this.KWHzl = list2;
            this.AhwBna = list3;
            this.copydefault = productDetailsClickAction;
        }

        @Override // o.InterfaceC27436jvE
        public boolean EZpvd(@NotNull InterfaceC27436jvE interfaceC27436jvE) {
            Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
            LoaderManager loaderManager = interfaceC27436jvE instanceof LoaderManager ? (LoaderManager) interfaceC27436jvE : null;
            if (loaderManager == null) {
                return false;
            }
            return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) loaderManager.gEmmrt);
        }
    }

    public static final class VoiceInteractor implements ProductDetailsClickAction {
        public final LoaderManager OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VoiceInteractor copy$default(VoiceInteractor voiceInteractor, LoaderManager loaderManager, int i, Object obj) {
            if ((i & 1) != 0) {
                loaderManager = voiceInteractor.OLrzqt;
            }
            return voiceInteractor.OLrzqt(loaderManager);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoiceInteractor OLrzqt(@NotNull LoaderManager loaderManager) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            return new VoiceInteractor(loaderManager);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VoiceInteractor) && Intrinsics.EZpvd(this.OLrzqt, ((VoiceInteractor) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ViewExpiryPositionDetail(data=" + this.OLrzqt + ")";
        }

        public VoiceInteractor(@NotNull LoaderManager loaderManager) {
            Intrinsics.checkNotNullParameter(loaderManager, "");
            this.OLrzqt = loaderManager;
        }
    }

    public static final class PictureInPictureParams implements ProductDetailsClickAction {
        public final long AEQbTJ;
        public final RewardType EZpvd;
        public final long KWHzl;
        public final String OLrzqt;
        public final List<InvestUserRewardInfoByInvestment> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureParams KWHzl(long j, long j2, @NotNull String str, @NotNull RewardType rewardType, @NotNull List<InvestUserRewardInfoByInvestment> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rewardType, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new PictureInPictureParams(j, j2, str, rewardType, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestUserRewardInfoByInvestment> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RewardType OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PictureInPictureParams)) {
                return false;
            }
            PictureInPictureParams pictureInPictureParams = (PictureInPictureParams) obj;
            return this.KWHzl == pictureInPictureParams.KWHzl && this.AEQbTJ == pictureInPictureParams.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) pictureInPictureParams.OLrzqt) && this.EZpvd == pictureInPictureParams.EZpvd && Intrinsics.EZpvd(this.copydefault, pictureInPictureParams.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((Long.hashCode(this.KWHzl) * 31) + Long.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ViewRewardsDetails(investmentId=" + this.KWHzl + ", chainId=" + this.AEQbTJ + ", network=" + this.OLrzqt + ", rewardType=" + this.EZpvd + ", rewards=" + this.copydefault + ")";
        }

        public PictureInPictureParams(long j, long j2, @NotNull String str, @NotNull RewardType rewardType, @NotNull List<InvestUserRewardInfoByInvestment> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(rewardType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = j;
            this.AEQbTJ = j2;
            this.OLrzqt = str;
            this.EZpvd = rewardType;
            this.copydefault = list;
        }
    }

    public static final class FragmentManager implements ProductDetailsClickAction {
        public final String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fragmentManager.EZpvd;
            }
            return fragmentManager.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new FragmentManager(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((FragmentManager) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RedirectURL(url=" + this.EZpvd + ")";
        }

        public FragmentManager(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    public static final class Dialog implements ProductDetailsClickAction {
        public final String AEQbTJ;
        public final long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dialog.KWHzl;
            }
            if ((i & 2) != 0) {
                str = dialog.AEQbTJ;
            }
            return dialog.copydefault(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog copydefault(long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Dialog(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) obj;
            return this.KWHzl == dialog.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dialog.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Long.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SuggestInvestingMoreNoNeedDetail(suggestInvestmentId=" + this.KWHzl + ", tokenId=" + this.AEQbTJ + ")";
        }

        public Dialog(long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = j;
            this.AEQbTJ = str;
        }
    }

    public static final class TaskDescription implements ProductDetailsClickAction {
        public final int AEQbTJ;
        public final int EZpvd;
        public final long KWHzl;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, long j, long j2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = taskDescription.copydefault;
            }
            long j3 = j;
            if ((i3 & 2) != 0) {
                j2 = taskDescription.KWHzl;
            }
            long j4 = j2;
            if ((i3 & 4) != 0) {
                i = taskDescription.EZpvd;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = taskDescription.AEQbTJ;
            }
            return taskDescription.EZpvd(j3, j4, i4, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(long j, long j2, int i, int i2) {
            return new TaskDescription(j, j2, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.copydefault == taskDescription.copydefault && this.KWHzl == taskDescription.KWHzl && this.EZpvd == taskDescription.EZpvd && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Long.hashCode(this.copydefault) * 31) + Long.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LuaHistoryActivity(investmentId=" + this.copydefault + ", chainId=" + this.KWHzl + ", investType=" + this.EZpvd + ", poolVersion=" + this.AEQbTJ + ")";
        }

        public TaskDescription(long j, long j2, int i, int i2) {
            this.copydefault = j;
            this.KWHzl = j2;
            this.EZpvd = i;
            this.AEQbTJ = i2;
        }
    }

    public static final class Application implements ProductDetailsClickAction {
        public final InvestUserAssetDetailByPosition AEQbTJ;
        public final ChainInfo EZpvd;
        public final long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, InvestUserAssetDetailByPosition investUserAssetDetailByPosition, long j, ChainInfo chainInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                investUserAssetDetailByPosition = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                j = application.OLrzqt;
            }
            if ((i & 4) != 0) {
                chainInfo = application.EZpvd;
            }
            return application.copydefault(investUserAssetDetailByPosition, j, chainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainInfo EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestUserAssetDetailByPosition KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull InvestUserAssetDetailByPosition investUserAssetDetailByPosition, long j, @NotNull ChainInfo chainInfo) {
            Intrinsics.checkNotNullParameter(investUserAssetDetailByPosition, "");
            Intrinsics.checkNotNullParameter(chainInfo, "");
            return new Application(investUserAssetDetailByPosition, j, chainInfo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + Long.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LuaViewPositionAssetsDetails(position=" + this.AEQbTJ + ", investmentId=" + this.OLrzqt + ", chainInfo=" + this.EZpvd + ")";
        }

        public Application(@NotNull InvestUserAssetDetailByPosition investUserAssetDetailByPosition, long j, @NotNull ChainInfo chainInfo) {
            Intrinsics.checkNotNullParameter(investUserAssetDetailByPosition, "");
            Intrinsics.checkNotNullParameter(chainInfo, "");
            this.AEQbTJ = investUserAssetDetailByPosition;
            this.OLrzqt = j;
            this.EZpvd = chainInfo;
        }
    }

    public static final class StateListAnimator implements ProductDetailsClickAction {
        public final String AEQbTJ;
        public final long KWHzl;
        public final long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, long j, String str, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = stateListAnimator.KWHzl;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                j2 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.KWHzl(j3, str2, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(long j, @NotNull String str, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(j, str, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ) && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Long.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode()) * 31) + Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LuaAddLiquidity(investmentId=" + this.KWHzl + ", tokenId=" + this.AEQbTJ + ", chainId=" + this.OLrzqt + ")";
        }

        public StateListAnimator(long j, @NotNull String str, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = j;
            this.AEQbTJ = str;
            this.OLrzqt = j2;
        }
    }

    public static final class Fragment implements ProductDetailsClickAction {
        public final long OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Fragment copy$default(Fragment fragment, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fragment.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = fragment.copydefault;
            }
            return fragment.EZpvd(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment EZpvd(long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Fragment(j, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fragment)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return this.OLrzqt == fragment.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) fragment.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Long.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LuaViewTvlChart(investmentId=" + this.OLrzqt + ", tvl=" + this.copydefault + ")";
        }

        public Fragment(long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = j;
            this.copydefault = str;
        }
    }
}
