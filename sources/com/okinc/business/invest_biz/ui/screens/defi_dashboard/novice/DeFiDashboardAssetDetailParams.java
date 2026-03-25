package com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DeFiDashboardAssetDetailParams implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.DeFiDashboardAssetDetailParams.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DeFiDashboardAssetDetailParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DeFiDashboardAssetDetailParams() {
    }

    public static final class DeFiTokenModelAssetDetailParams extends DeFiDashboardAssetDetailParams {
        public static final Parcelable.Creator<DeFiTokenModelAssetDetailParams> CREATOR = new Creator();
        public final String AEQbTJ;
        public final long EZpvd;
        public final String KWHzl;
        public final long OLrzqt;
        public final String copydefault;
        public final List<DashboardInvestmentInfo> djBIcL;

        public static final class Creator implements Parcelable.Creator<DeFiTokenModelAssetDetailParams> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeFiTokenModelAssetDetailParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DashboardInvestmentInfo.CREATOR.createFromParcel(parcel));
                }
                return new DeFiTokenModelAssetDetailParams(string, j, j2, string2, string3, arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeFiTokenModelAssetDetailParams[] newArray(int i) {
                return new DeFiTokenModelAssetDetailParams[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<DashboardInvestmentInfo> AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeFiTokenModelAssetDetailParams OLrzqt(@NotNull String str, long j, long j2, @NotNull String str2, @NotNull String str3, @NotNull List<DashboardInvestmentInfo> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new DeFiTokenModelAssetDetailParams(str, j, j2, str2, str3, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
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
            if (!(obj instanceof DeFiTokenModelAssetDetailParams)) {
                return false;
            }
            DeFiTokenModelAssetDetailParams deFiTokenModelAssetDetailParams = (DeFiTokenModelAssetDetailParams) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) deFiTokenModelAssetDetailParams.AEQbTJ) && this.EZpvd == deFiTokenModelAssetDetailParams.EZpvd && this.OLrzqt == deFiTokenModelAssetDetailParams.OLrzqt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) deFiTokenModelAssetDetailParams.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) deFiTokenModelAssetDetailParams.copydefault) && Intrinsics.EZpvd(this.djBIcL, deFiTokenModelAssetDetailParams.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((this.AEQbTJ.hashCode() * 31) + Long.hashCode(this.EZpvd)) * 31) + Long.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DeFiTokenModelAssetDetailParams(accountId=" + this.AEQbTJ + ", analysisPlatformId=" + this.EZpvd + ", chainId=" + this.OLrzqt + ", containAvailableReward=" + this.KWHzl + ", containMarketReward=" + this.copydefault + ", investmentInfos=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeLong(this.EZpvd);
            parcel.writeLong(this.OLrzqt);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.copydefault);
            List<DashboardInvestmentInfo> list = this.djBIcL;
            parcel.writeInt(list.size());
            Iterator<DashboardInvestmentInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeFiTokenModelAssetDetailParams(@NotNull String str, long j, long j2, @NotNull String str2, @NotNull String str3, @NotNull List<DashboardInvestmentInfo> list) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = str;
            this.EZpvd = j;
            this.OLrzqt = j2;
            this.KWHzl = str2;
            this.copydefault = str3;
            this.djBIcL = list;
        }
    }

    public static final class DeFiProtocolModelAssetDetailParams extends DeFiDashboardAssetDetailParams {
        public static final Parcelable.Creator<DeFiProtocolModelAssetDetailParams> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String KWHzl;
        public final InvestedToken OLrzqt;
        public final long copydefault;

        public static final class Creator implements Parcelable.Creator<DeFiProtocolModelAssetDetailParams> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeFiProtocolModelAssetDetailParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DeFiProtocolModelAssetDetailParams(InvestedToken.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeFiProtocolModelAssetDetailParams[] newArray(int i) {
                return new DeFiProtocolModelAssetDetailParams[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DeFiProtocolModelAssetDetailParams copy$default(DeFiProtocolModelAssetDetailParams deFiProtocolModelAssetDetailParams, InvestedToken investedToken, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                investedToken = deFiProtocolModelAssetDetailParams.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = deFiProtocolModelAssetDetailParams.KWHzl;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = deFiProtocolModelAssetDetailParams.AEQbTJ;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                j = deFiProtocolModelAssetDetailParams.copydefault;
            }
            return deFiProtocolModelAssetDetailParams.EZpvd(investedToken, str3, str4, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeFiProtocolModelAssetDetailParams EZpvd(@NotNull InvestedToken investedToken, @NotNull String str, @NotNull String str2, long j) {
            Intrinsics.checkNotNullParameter(investedToken, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new DeFiProtocolModelAssetDetailParams(investedToken, str, str2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestedToken KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
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
            if (!(obj instanceof DeFiProtocolModelAssetDetailParams)) {
                return false;
            }
            DeFiProtocolModelAssetDetailParams deFiProtocolModelAssetDetailParams = (DeFiProtocolModelAssetDetailParams) obj;
            return Intrinsics.EZpvd(this.OLrzqt, deFiProtocolModelAssetDetailParams.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) deFiProtocolModelAssetDetailParams.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) deFiProtocolModelAssetDetailParams.AEQbTJ) && this.copydefault == deFiProtocolModelAssetDetailParams.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Long.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DeFiProtocolModelAssetDetailParams(investedToken=" + this.OLrzqt + ", protocolName=" + this.KWHzl + ", protocolUrl=" + this.AEQbTJ + ", chainId=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.OLrzqt.writeToParcel(parcel, i);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.AEQbTJ);
            parcel.writeLong(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeFiProtocolModelAssetDetailParams(@NotNull InvestedToken investedToken, @NotNull String str, @NotNull String str2, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(investedToken, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = investedToken;
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.copydefault = j;
        }
    }
}
