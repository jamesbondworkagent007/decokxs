package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagStaticDataParams;
import com.okinc.business.market.widget.tag.TagEventSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TokenDetailTabData implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TokenDetailTabData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TokenDetailTabType EZpvd();

    private TokenDetailTabData() {
    }

    public static final class TokenTab extends TokenDetailTabData {
        public static final Parcelable.Creator<TokenTab> CREATOR = new Creator();
        public final TokenDetailTabType AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final boolean copydefault;

        public static final class Creator implements Parcelable.Creator<TokenTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TokenTab(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TokenTab[] newArray(int i) {
                return new TokenTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TokenTab() {
            this(null, null, false, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TokenTab copy$default(TokenTab tokenTab, String str, String str2, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokenTab.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = tokenTab.EZpvd;
            }
            if ((i & 4) != 0) {
                z = tokenTab.copydefault;
            }
            if ((i & 8) != 0) {
                str3 = tokenTab.OLrzqt;
            }
            return tokenTab.OLrzqt(str, str2, z, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData
        public TokenDetailTabType EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenTab OLrzqt(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new TokenTab(str, str2, z, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
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
            if (!(obj instanceof TokenTab)) {
                return false;
            }
            TokenTab tokenTab = (TokenTab) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) tokenTab.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tokenTab.EZpvd) && this.copydefault == tokenTab.copydefault && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tokenTab.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenTab(tokenLargeLogoUrl=" + this.KWHzl + ", creatorAddress=" + this.EZpvd + ", showAiSummary=" + this.copydefault + ", tokenCreateTime=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
            parcel.writeInt(this.copydefault ? 1 : 0);
            parcel.writeString(this.OLrzqt);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:34) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData.TokenTab.<init>(java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ TokenTab(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenTab(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.copydefault = z;
            this.OLrzqt = str3;
            this.AEQbTJ = TokenDetailTabType.TOKEN;
        }
    }

    public static final class SocialTab extends TokenDetailTabData {
        public static final Parcelable.Creator<SocialTab> CREATOR = new Creator();
        public final CompactTagData AEQbTJ;
        public final boolean EZpvd;
        public final List<CompactTagData> KWHzl;
        public final List<MemeSocialMediaData> OLrzqt;
        public final TokenDetailTabType copydefault;
        public final String gEmmrt;

        public static final class Creator implements Parcelable.Creator<SocialTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SocialTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MemeSocialMediaData.CREATOR.createFromParcel(parcel));
                }
                String string = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(CompactTagData.CREATOR.createFromParcel(parcel));
                }
                return new SocialTab(z, arrayList, string, arrayList2, parcel.readInt() == 0 ? null : CompactTagData.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SocialTab[] newArray(int i) {
                return new SocialTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SocialTab() {
            this(false, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData$SocialTab */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SocialTab copy$default(SocialTab socialTab, boolean z, List list, String str, List list2, CompactTagData compactTagData, int i, Object obj) {
            if ((i & 1) != 0) {
                z = socialTab.EZpvd;
            }
            if ((i & 2) != 0) {
                list = socialTab.OLrzqt;
            }
            List list3 = list;
            if ((i & 4) != 0) {
                str = socialTab.gEmmrt;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                list2 = socialTab.KWHzl;
            }
            List list4 = list2;
            if ((i & 16) != 0) {
                compactTagData = socialTab.AEQbTJ;
            }
            return socialTab.OLrzqt(z, list3, str2, list4, compactTagData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<MemeSocialMediaData> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData
        public TokenDetailTabType EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CompactTagData KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SocialTab OLrzqt(boolean z, @NotNull List<MemeSocialMediaData> list, @NotNull String str, @NotNull List<CompactTagData> list2, CompactTagData compactTagData) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new SocialTab(z, list, str, list2, compactTagData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<CompactTagData> copydefault() {
            return this.KWHzl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialTab)) {
                return false;
            }
            SocialTab socialTab = (SocialTab) obj;
            return this.EZpvd == socialTab.EZpvd && Intrinsics.EZpvd(this.OLrzqt, socialTab.OLrzqt) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) socialTab.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, socialTab.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, socialTab.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.EZpvd);
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.gEmmrt.hashCode();
            int iHashCode4 = this.KWHzl.hashCode();
            CompactTagData compactTagData = this.AEQbTJ;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (compactTagData == null ? 0 : compactTagData.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SocialTab(showAiSummary=" + this.EZpvd + ", socials=" + this.OLrzqt + ", tokenCreateTime=" + this.gEmmrt + ", dexScreenerTags=" + this.KWHzl + ", liveTag=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.EZpvd ? 1 : 0);
            List<MemeSocialMediaData> list = this.OLrzqt;
            parcel.writeInt(list.size());
            Iterator<MemeSocialMediaData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeString(this.gEmmrt);
            List<CompactTagData> list2 = this.KWHzl;
            parcel.writeInt(list2.size());
            Iterator<CompactTagData> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
            CompactTagData compactTagData = this.AEQbTJ;
            if (compactTagData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                compactTagData.writeToParcel(parcel, i);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:java.util.List:0x000d: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:48)) : (r5v0 java.util.List))
  (wrap:java.lang.String:0x0014: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.util.List:0x001d: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0019: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:50)) : (r7v0 java.util.List))
  (wrap:com.okinc.business.market.data.model.CompactTagData:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.CompactTagData) : (r8v0 com.okinc.business.market.data.model.CompactTagData))
 A[MD:(boolean, java.util.List<com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData>, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, com.okinc.business.market.data.model.CompactTagData):void (m)] (LINE:46) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData.SocialTab.<init>(boolean, java.util.List, java.lang.String, java.util.List, com.okinc.business.market.data.model.CompactTagData):void type: THIS */
        public /* synthetic */ SocialTab(boolean z, List list, String str, List list2, CompactTagData compactTagData, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? yDY.AhwBna() : list2, (i & 16) != 0 ? null : compactTagData);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SocialTab(boolean z, @NotNull List<MemeSocialMediaData> list, @NotNull String str, @NotNull List<CompactTagData> list2, CompactTagData compactTagData) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.EZpvd = z;
            this.OLrzqt = list;
            this.gEmmrt = str;
            this.KWHzl = list2;
            this.AEQbTJ = compactTagData;
            this.copydefault = TokenDetailTabType.SOCIAL;
        }
    }

    public static final class DataTab extends TokenDetailTabData {
        public static final Parcelable.Creator<DataTab> CREATOR = new Creator();
        public final boolean AEQbTJ;
        public final String AYXKKw;
        public final TokenDetailTabType AhwBna;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final String djBIcL;
        public final String gEmmrt;

        public static final class Creator implements Parcelable.Creator<DataTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DataTab(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataTab[] newArray(int i) {
                return new DataTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DataTab() {
            this(null, null, null, null, false, null, null, null, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData
        public TokenDetailTabType EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DataTab OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new DataTab(str, str2, str3, str4, z, str5, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataTab)) {
                return false;
            }
            DataTab dataTab = (DataTab) obj;
            return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) dataTab.AYXKKw) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) dataTab.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) dataTab.gEmmrt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) dataTab.copydefault) && this.AEQbTJ == dataTab.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) dataTab.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) dataTab.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) dataTab.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.AYXKKw.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DataTab(top10HoldAmountPercentage=" + this.AYXKKw + ", sniperHoldingRatio=" + this.djBIcL + ", suspiciousHoldingRatio=" + this.gEmmrt + ", devHoldingRatio=" + this.copydefault + ", isDevSellAll=" + this.AEQbTJ + ", creatorAddress=" + this.OLrzqt + ", freshHoldRatio=" + this.KWHzl + ", phishHoldRatio=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AYXKKw);
            parcel.writeString(this.djBIcL);
            parcel.writeString(this.gEmmrt);
            parcel.writeString(this.copydefault);
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:59) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData.DataTab.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ DataTab(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataTab(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.AYXKKw = str;
            this.djBIcL = str2;
            this.gEmmrt = str3;
            this.copydefault = str4;
            this.AEQbTJ = z;
            this.OLrzqt = str5;
            this.KWHzl = str6;
            this.EZpvd = str7;
            this.AhwBna = TokenDetailTabType.DATA;
        }
    }

    public static final class TagExplanationTab extends TokenDetailTabData {
        public static final Parcelable.Creator<TagExplanationTab> CREATOR = new Creator();
        public final TokenDetailTabType AEQbTJ;
        public final boolean EZpvd;
        public final TagEventSource OLrzqt;
        public final TagStaticDataParams copydefault;

        public static final class Creator implements Parcelable.Creator<TagExplanationTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TagExplanationTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TagExplanationTab(parcel.readInt() != 0, parcel.readInt() == 0 ? null : TagStaticDataParams.CREATOR.createFromParcel(parcel), TagEventSource.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TagExplanationTab[] newArray(int i) {
                return new TagExplanationTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TagExplanationTab() {
            this(false, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TagExplanationTab copy$default(TagExplanationTab tagExplanationTab, boolean z, TagStaticDataParams tagStaticDataParams, TagEventSource tagEventSource, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tagExplanationTab.EZpvd;
            }
            if ((i & 2) != 0) {
                tagStaticDataParams = tagExplanationTab.copydefault;
            }
            if ((i & 4) != 0) {
                tagEventSource = tagExplanationTab.OLrzqt;
            }
            return tagExplanationTab.OLrzqt(z, tagStaticDataParams, tagEventSource);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData
        public TokenDetailTabType EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TagExplanationTab OLrzqt(boolean z, TagStaticDataParams tagStaticDataParams, @NotNull TagEventSource tagEventSource) {
            Intrinsics.checkNotNullParameter(tagEventSource, "");
            return new TagExplanationTab(z, tagStaticDataParams, tagEventSource);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TagEventSource OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TagStaticDataParams copydefault() {
            return this.copydefault;
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
            if (!(obj instanceof TagExplanationTab)) {
                return false;
            }
            TagExplanationTab tagExplanationTab = (TagExplanationTab) obj;
            return this.EZpvd == tagExplanationTab.EZpvd && Intrinsics.EZpvd(this.copydefault, tagExplanationTab.copydefault) && this.OLrzqt == tagExplanationTab.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.EZpvd);
            TagStaticDataParams tagStaticDataParams = this.copydefault;
            return (((iHashCode * 31) + (tagStaticDataParams == null ? 0 : tagStaticDataParams.hashCode())) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TagExplanationTab(fromTokenDetail=" + this.EZpvd + ", tagStaticData=" + this.copydefault + ", eventSource=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.EZpvd ? 1 : 0);
            TagStaticDataParams tagStaticDataParams = this.copydefault;
            if (tagStaticDataParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tagStaticDataParams.writeToParcel(parcel, i);
            }
            parcel.writeString(this.OLrzqt.name());
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:com.okinc.business.market.features.tag.ui.TagStaticDataParams:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.tag.ui.TagStaticDataParams) : (r2v0 com.okinc.business.market.features.tag.ui.TagStaticDataParams))
  (wrap:com.okinc.business.market.widget.tag.TagEventSource:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.widget.tag.TagEventSource:0x000e: SGET  A[WRAPPED] (LINE:78) com.okinc.business.market.widget.tag.TagEventSource.HOMEPAGE com.okinc.business.market.widget.tag.TagEventSource) : (r3v0 com.okinc.business.market.widget.tag.TagEventSource))
 A[MD:(boolean, com.okinc.business.market.features.tag.ui.TagStaticDataParams, com.okinc.business.market.widget.tag.TagEventSource):void (m)] (LINE:75) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData.TagExplanationTab.<init>(boolean, com.okinc.business.market.features.tag.ui.TagStaticDataParams, com.okinc.business.market.widget.tag.TagEventSource):void type: THIS */
        public /* synthetic */ TagExplanationTab(boolean z, TagStaticDataParams tagStaticDataParams, TagEventSource tagEventSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : tagStaticDataParams, (i & 4) != 0 ? TagEventSource.HOMEPAGE : tagEventSource);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TagExplanationTab(boolean z, TagStaticDataParams tagStaticDataParams, @NotNull TagEventSource tagEventSource) {
            super(null);
            Intrinsics.checkNotNullParameter(tagEventSource, "");
            this.EZpvd = z;
            this.copydefault = tagStaticDataParams;
            this.OLrzqt = tagEventSource;
            this.AEQbTJ = TokenDetailTabType.TAG_EXPLANATION;
        }
    }

    public static final class DevTokenTab extends TokenDetailTabData {
        public static final Parcelable.Creator<DevTokenTab> CREATOR = new Creator();
        public final String AEQbTJ;
        public final boolean EZpvd;
        public final String KWHzl;
        public final TagWrapper OLrzqt;
        public final TokenDetailTabType copydefault;

        public static final class Creator implements Parcelable.Creator<DevTokenTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DevTokenTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DevTokenTab(parcel.readInt() == 0 ? null : TagWrapper.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DevTokenTab[] newArray(int i) {
                return new DevTokenTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DevTokenTab() {
            this(null, null, false, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DevTokenTab copy$default(DevTokenTab devTokenTab, TagWrapper tagWrapper, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                tagWrapper = devTokenTab.OLrzqt;
            }
            if ((i & 2) != 0) {
                str = devTokenTab.AEQbTJ;
            }
            if ((i & 4) != 0) {
                z = devTokenTab.EZpvd;
            }
            if ((i & 8) != 0) {
                str2 = devTokenTab.KWHzl;
            }
            return devTokenTab.copydefault(tagWrapper, str, z, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData
        public TokenDetailTabType EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TagWrapper OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DevTokenTab copydefault(TagWrapper tagWrapper, @NotNull String str, boolean z, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new DevTokenTab(tagWrapper, str, z, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
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
            if (!(obj instanceof DevTokenTab)) {
                return false;
            }
            DevTokenTab devTokenTab = (DevTokenTab) obj;
            return Intrinsics.EZpvd(this.OLrzqt, devTokenTab.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) devTokenTab.AEQbTJ) && this.EZpvd == devTokenTab.EZpvd && Intrinsics.EZpvd((Object) this.KWHzl, (Object) devTokenTab.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            TagWrapper tagWrapper = this.OLrzqt;
            return ((((((tagWrapper == null ? 0 : tagWrapper.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DevTokenTab(devTag=" + this.OLrzqt + ", devHoldingRatio=" + this.AEQbTJ + ", isDevSellAll=" + this.EZpvd + ", creatorAddress=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TagWrapper tagWrapper = this.OLrzqt;
            if (tagWrapper == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tagWrapper.writeToParcel(parcel, i);
            }
            parcel.writeString(this.AEQbTJ);
            parcel.writeInt(this.EZpvd ? 1 : 0);
            parcel.writeString(this.KWHzl);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.tag.domain.TagWrapper:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.tag.domain.TagWrapper) : (r2v0 com.okinc.business.market.features.tag.domain.TagWrapper))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(com.okinc.business.market.features.tag.domain.TagWrapper, java.lang.String, boolean, java.lang.String):void (m)] (LINE:86) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData.DevTokenTab.<init>(com.okinc.business.market.features.tag.domain.TagWrapper, java.lang.String, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ DevTokenTab(TagWrapper tagWrapper, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tagWrapper, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DevTokenTab(TagWrapper tagWrapper, @NotNull String str, boolean z, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = tagWrapper;
            this.AEQbTJ = str;
            this.EZpvd = z;
            this.KWHzl = str2;
            this.copydefault = TokenDetailTabType.DEV_TOKEN;
        }
    }
}
