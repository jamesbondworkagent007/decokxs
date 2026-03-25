package com.okinc.unify_trade.bot.constant;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsUiConst {
    public static final TacticsUiConst copydefault = new TacticsUiConst();

    private TacticsUiConst() {
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        public static final ActionBar EZpvd = new ActionBar();
        public static final String copydefault = "ADVANCE";
        public static final String KWHzl = "BASIC";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return copydefault;
        }

        private ActionBar() {
        }
    }

    public static final class TaskDescription {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final List<String> EZpvd = yDY.gEmmrt("strategy_button_starting", "strategy_button_stopping", "strategy_button_risking");
        public static final int KWHzl = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> OLrzqt() {
            return EZpvd;
        }

        private TaskDescription() {
        }
    }

    public interface BotListSubItemType extends Parcelable {

        public static final class BotSubNormal implements BotListSubItemType {
            public static final BotSubNormal KWHzl = new BotSubNormal();
            public static final Parcelable.Creator<BotSubNormal> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<BotSubNormal> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BotSubNormal createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return BotSubNormal.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BotSubNormal[] newArray(int i) {
                    return new BotSubNormal[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private BotSubNormal() {
            }
        }

        public static final class BotSubPosition implements BotListSubItemType {
            public static final BotSubPosition KWHzl = new BotSubPosition();
            public static final Parcelable.Creator<BotSubPosition> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<BotSubPosition> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BotSubPosition createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return BotSubPosition.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BotSubPosition[] newArray(int i) {
                    return new BotSubPosition[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private BotSubPosition() {
            }
        }

        public interface BotSubTip extends Parcelable, BotListSubItemType {

            public static final class Default implements BotSubTip {
                public static final Default KWHzl = new Default();
                public static final Parcelable.Creator<Default> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Default> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Default createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        parcel.readInt();
                        return Default.KWHzl;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Default[] newArray(int i) {
                        return new Default[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeInt(1);
                }

                private Default() {
                }
            }

            public static final class SmartArbProfitsDetails implements BotSubTip {
                public static final SmartArbProfitsDetails EZpvd = new SmartArbProfitsDetails();
                public static final Parcelable.Creator<SmartArbProfitsDetails> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<SmartArbProfitsDetails> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SmartArbProfitsDetails createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        parcel.readInt();
                        return SmartArbProfitsDetails.EZpvd;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SmartArbProfitsDetails[] newArray(int i) {
                        return new SmartArbProfitsDetails[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeInt(1);
                }

                private SmartArbProfitsDetails() {
                }
            }

            public static final class SmartArbStakingProfitsDetails implements BotSubTip {
                public static final SmartArbStakingProfitsDetails copydefault = new SmartArbStakingProfitsDetails();
                public static final Parcelable.Creator<SmartArbStakingProfitsDetails> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<SmartArbStakingProfitsDetails> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SmartArbStakingProfitsDetails createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        parcel.readInt();
                        return SmartArbStakingProfitsDetails.copydefault;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SmartArbStakingProfitsDetails[] newArray(int i) {
                        return new SmartArbStakingProfitsDetails[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeInt(1);
                }

                private SmartArbStakingProfitsDetails() {
                }
            }

            public static final class SmartArbAutoEarn implements BotSubTip {
                public static final SmartArbAutoEarn EZpvd = new SmartArbAutoEarn();
                public static final Parcelable.Creator<SmartArbAutoEarn> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<SmartArbAutoEarn> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SmartArbAutoEarn createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        parcel.readInt();
                        return SmartArbAutoEarn.EZpvd;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SmartArbAutoEarn[] newArray(int i) {
                        return new SmartArbAutoEarn[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeInt(1);
                }

                private SmartArbAutoEarn() {
                }
            }

            public static final class DoubtDialog implements BotSubTip {
                public static final Parcelable.Creator<DoubtDialog> CREATOR = new Creator();
                public final String KWHzl;
                public final String OLrzqt;

                public static final class Creator implements Parcelable.Creator<DoubtDialog> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DoubtDialog createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        return new DoubtDialog(parcel.readString(), parcel.readString());
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DoubtDialog[] newArray(int i) {
                        return new DoubtDialog[i];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ DoubtDialog copy$default(DoubtDialog doubtDialog, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = doubtDialog.KWHzl;
                    }
                    if ((i & 2) != 0) {
                        str2 = doubtDialog.OLrzqt;
                    }
                    return doubtDialog.EZpvd(str, str2);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String AEQbTJ() {
                    return this.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final DoubtDialog EZpvd(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return new DoubtDialog(str, str2);
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
                    if (!(obj instanceof DoubtDialog)) {
                        return false;
                    }
                    DoubtDialog doubtDialog = (DoubtDialog) obj;
                    return Intrinsics.EZpvd((Object) this.KWHzl, (Object) doubtDialog.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) doubtDialog.OLrzqt);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "DoubtDialog(title=" + this.KWHzl + ", message=" + this.OLrzqt + ")";
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeString(this.KWHzl);
                    parcel.writeString(this.OLrzqt);
                }

                public DoubtDialog(@NotNull String str, @NotNull String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.KWHzl = str;
                    this.OLrzqt = str2;
                }
            }

            public static final class ContractGridProfitDetails implements BotSubTip {
                public static final Parcelable.Creator<ContractGridProfitDetails> CREATOR = new Creator();
                public final String AEQbTJ;
                public final String EZpvd;
                public final String KWHzl;
                public final BalanceDetailInfoDto OLrzqt;

                public static final class Creator implements Parcelable.Creator<ContractGridProfitDetails> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ContractGridProfitDetails createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        return new ContractGridProfitDetails(parcel.readString(), parcel.readString(), parcel.readString(), BalanceDetailInfoDto.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final ContractGridProfitDetails[] newArray(int i) {
                        return new ContractGridProfitDetails[i];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ ContractGridProfitDetails copy$default(ContractGridProfitDetails contractGridProfitDetails, String str, String str2, String str3, BalanceDetailInfoDto balanceDetailInfoDto, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = contractGridProfitDetails.EZpvd;
                    }
                    if ((i & 2) != 0) {
                        str2 = contractGridProfitDetails.AEQbTJ;
                    }
                    if ((i & 4) != 0) {
                        str3 = contractGridProfitDetails.KWHzl;
                    }
                    if ((i & 8) != 0) {
                        balanceDetailInfoDto = contractGridProfitDetails.OLrzqt;
                    }
                    return contractGridProfitDetails.KWHzl(str, str2, str3, balanceDetailInfoDto);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String AEQbTJ() {
                    return this.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String EZpvd() {
                    return this.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final ContractGridProfitDetails KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull BalanceDetailInfoDto balanceDetailInfoDto) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(balanceDetailInfoDto, "");
                    return new ContractGridProfitDetails(str, str2, str3, balanceDetailInfoDto);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String KWHzl() {
                    return this.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final BalanceDetailInfoDto copydefault() {
                    return this.OLrzqt;
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
                    if (!(obj instanceof ContractGridProfitDetails)) {
                        return false;
                    }
                    ContractGridProfitDetails contractGridProfitDetails = (ContractGridProfitDetails) obj;
                    return Intrinsics.EZpvd((Object) this.EZpvd, (Object) contractGridProfitDetails.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) contractGridProfitDetails.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) contractGridProfitDetails.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, contractGridProfitDetails.OLrzqt);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "ContractGridProfitDetails(algoId=" + this.EZpvd + ", instId=" + this.AEQbTJ + ", instType=" + this.KWHzl + ", balanceDetailInfo=" + this.OLrzqt + ")";
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeString(this.EZpvd);
                    parcel.writeString(this.AEQbTJ);
                    parcel.writeString(this.KWHzl);
                    this.OLrzqt.writeToParcel(parcel, i);
                }

                public ContractGridProfitDetails(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull BalanceDetailInfoDto balanceDetailInfoDto) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(balanceDetailInfoDto, "");
                    this.EZpvd = str;
                    this.AEQbTJ = str2;
                    this.KWHzl = str3;
                    this.OLrzqt = balanceDetailInfoDto;
                }
            }

            public static final class WithdrawContractGridProfits implements BotSubTip {
                public static final Parcelable.Creator<WithdrawContractGridProfits> CREATOR = new Creator();
                public final String EZpvd;
                public final TacticsData KWHzl;
                public final String OLrzqt;
                public final String copydefault;

                public static final class Creator implements Parcelable.Creator<WithdrawContractGridProfits> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final WithdrawContractGridProfits createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "");
                        return new WithdrawContractGridProfits(parcel.readString(), parcel.readString(), parcel.readString(), TacticsData.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final WithdrawContractGridProfits[] newArray(int i) {
                        return new WithdrawContractGridProfits[i];
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ WithdrawContractGridProfits copy$default(WithdrawContractGridProfits withdrawContractGridProfits, String str, String str2, String str3, TacticsData tacticsData, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = withdrawContractGridProfits.copydefault;
                    }
                    if ((i & 2) != 0) {
                        str2 = withdrawContractGridProfits.OLrzqt;
                    }
                    if ((i & 4) != 0) {
                        str3 = withdrawContractGridProfits.EZpvd;
                    }
                    if ((i & 8) != 0) {
                        tacticsData = withdrawContractGridProfits.KWHzl;
                    }
                    return withdrawContractGridProfits.copydefault(str, str2, str3, tacticsData);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final WithdrawContractGridProfits copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TacticsData tacticsData) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(tacticsData, "");
                    return new WithdrawContractGridProfits(str, str2, str3, tacticsData);
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
                    if (!(obj instanceof WithdrawContractGridProfits)) {
                        return false;
                    }
                    WithdrawContractGridProfits withdrawContractGridProfits = (WithdrawContractGridProfits) obj;
                    return Intrinsics.EZpvd((Object) this.copydefault, (Object) withdrawContractGridProfits.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) withdrawContractGridProfits.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) withdrawContractGridProfits.EZpvd) && Intrinsics.EZpvd(this.KWHzl, withdrawContractGridProfits.KWHzl);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return (((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "WithdrawContractGridProfits(algoId=" + this.copydefault + ", instId=" + this.OLrzqt + ", instType=" + this.EZpvd + ", tacticsData=" + this.KWHzl + ")";
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.writeString(this.copydefault);
                    parcel.writeString(this.OLrzqt);
                    parcel.writeString(this.EZpvd);
                    this.KWHzl.writeToParcel(parcel, i);
                }

                public WithdrawContractGridProfits(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TacticsData tacticsData) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(tacticsData, "");
                    this.copydefault = str;
                    this.OLrzqt = str2;
                    this.EZpvd = str3;
                    this.KWHzl = tacticsData;
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application {
        public static final Application copydefault = new Application();
        public static final List<String> OLrzqt = yDY.gEmmrt("insufficientMargin", "riskRetry", "retryFailed");
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> KWHzl() {
            return OLrzqt;
        }

        private Application() {
        }
    }

    public static final class Activity {
        public static final Activity copydefault = new Activity();
        public static final List<Integer> KWHzl = yDY.gEmmrt(1, 2);
        public static final int OLrzqt = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Integer> EZpvd() {
            return KWHzl;
        }

        private Activity() {
        }
    }
}
