package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class FrozenAssetsAmountsResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FrozenAssetsAmountsResp> CREATOR = new Creator();
    private final List<Notice> noticeList;
    private final String totalLockedAmount;

    public static final class Creator implements Parcelable.Creator<FrozenAssetsAmountsResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FrozenAssetsAmountsResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Notice.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FrozenAssetsAmountsResp(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FrozenAssetsAmountsResp[] newArray(int i) {
            return new FrozenAssetsAmountsResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FrozenAssetsAmountsResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.FrozenAssetsAmountsResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FrozenAssetsAmountsResp copy$default(FrozenAssetsAmountsResp frozenAssetsAmountsResp, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frozenAssetsAmountsResp.totalLockedAmount;
        }
        if ((i & 2) != 0) {
            list = frozenAssetsAmountsResp.noticeList;
        }
        return frozenAssetsAmountsResp.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalLockedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Notice> component2() {
        return this.noticeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrozenAssetsAmountsResp copy(String str, List<Notice> list) {
        return new FrozenAssetsAmountsResp(str, list);
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
        if (!(obj instanceof FrozenAssetsAmountsResp)) {
            return false;
        }
        FrozenAssetsAmountsResp frozenAssetsAmountsResp = (FrozenAssetsAmountsResp) obj;
        return Intrinsics.EZpvd((Object) this.totalLockedAmount, (Object) frozenAssetsAmountsResp.totalLockedAmount) && Intrinsics.EZpvd(this.noticeList, frozenAssetsAmountsResp.noticeList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Notice> getNoticeList() {
        return this.noticeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalLockedAmount() {
        return this.totalLockedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalLockedAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<Notice> list = this.noticeList;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FrozenAssetsAmountsResp(totalLockedAmount=" + this.totalLockedAmount + ", noticeList=" + this.noticeList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalLockedAmount);
        List<Notice> list = this.noticeList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Notice> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public FrozenAssetsAmountsResp(String str, List<Notice> list) {
        this.totalLockedAmount = str;
        this.noticeList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.assets.backend.api.model.FrozenAssetsAmountsResp$Notice>):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.FrozenAssetsAmountsResp.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ FrozenAssetsAmountsResp(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public static final class Notice implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Notice> CREATOR = new Creator();
        private final String body;
        private final String buttonText;
        private final String chainIndex;
        private final Integer currencyId;
        private final String dialogueContent;
        private final String header;
        private final LinkPayload linkPayload;
        private final String navigateInstruction;
        private final Integer subCurrencyId;
        private final String tokenAddress;
        private final Integer type;

        public static final class Creator implements Parcelable.Creator<Notice> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Notice createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Notice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LinkPayload.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Notice[] newArray(int i) {
                return new Notice[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.buttonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.header;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.navigateInstruction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LinkPayload component5() {
            return this.linkPayload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component6() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.dialogueContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component8() {
            return this.subCurrencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component9() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Notice copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, LinkPayload linkPayload, Integer num, String str5, Integer num2, Integer num3, String str6, String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Notice(str, str2, str3, str4, linkPayload, num, str5, num2, num3, str6, str7);
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
            if (!(obj instanceof Notice)) {
                return false;
            }
            Notice notice = (Notice) obj;
            return Intrinsics.EZpvd((Object) this.body, (Object) notice.body) && Intrinsics.EZpvd((Object) this.buttonText, (Object) notice.buttonText) && Intrinsics.EZpvd((Object) this.header, (Object) notice.header) && Intrinsics.EZpvd((Object) this.navigateInstruction, (Object) notice.navigateInstruction) && Intrinsics.EZpvd(this.linkPayload, notice.linkPayload) && Intrinsics.EZpvd(this.type, notice.type) && Intrinsics.EZpvd((Object) this.dialogueContent, (Object) notice.dialogueContent) && Intrinsics.EZpvd(this.subCurrencyId, notice.subCurrencyId) && Intrinsics.EZpvd(this.currencyId, notice.currencyId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) notice.tokenAddress) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) notice.chainIndex);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBody() {
            return this.body;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainIndex() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getCurrencyId() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDialogueContent() {
            return this.dialogueContent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHeader() {
            return this.header;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LinkPayload getLinkPayload() {
            return this.linkPayload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNavigateInstruction() {
            return this.navigateInstruction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSubCurrencyId() {
            return this.subCurrencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenAddress() {
            return this.tokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.body.hashCode();
            int iHashCode2 = this.buttonText.hashCode();
            int iHashCode3 = this.header.hashCode();
            int iHashCode4 = this.navigateInstruction.hashCode();
            LinkPayload linkPayload = this.linkPayload;
            int iHashCode5 = linkPayload == null ? 0 : linkPayload.hashCode();
            Integer num = this.type;
            int iHashCode6 = num == null ? 0 : num.hashCode();
            String str = this.dialogueContent;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            Integer num2 = this.subCurrencyId;
            int iHashCode8 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.currencyId;
            int iHashCode9 = num3 == null ? 0 : num3.hashCode();
            String str2 = this.tokenAddress;
            int iHashCode10 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.chainIndex;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Notice(body=" + this.body + ", buttonText=" + this.buttonText + ", header=" + this.header + ", navigateInstruction=" + this.navigateInstruction + ", linkPayload=" + this.linkPayload + ", type=" + this.type + ", dialogueContent=" + this.dialogueContent + ", subCurrencyId=" + this.subCurrencyId + ", currencyId=" + this.currencyId + ", tokenAddress=" + this.tokenAddress + ", chainIndex=" + this.chainIndex + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.body);
            parcel.writeString(this.buttonText);
            parcel.writeString(this.header);
            parcel.writeString(this.navigateInstruction);
            LinkPayload linkPayload = this.linkPayload;
            if (linkPayload == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                linkPayload.writeToParcel(parcel, i);
            }
            Integer num = this.type;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.dialogueContent);
            Integer num2 = this.subCurrencyId;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            Integer num3 = this.currencyId;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            parcel.writeString(this.tokenAddress);
            parcel.writeString(this.chainIndex);
        }

        public Notice(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, LinkPayload linkPayload, Integer num, String str5, Integer num2, Integer num3, String str6, String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.body = str;
            this.buttonText = str2;
            this.header = str3;
            this.navigateInstruction = str4;
            this.linkPayload = linkPayload;
            this.type = num;
            this.dialogueContent = str5;
            this.subCurrencyId = num2;
            this.currencyId = num3;
            this.tokenAddress = str6;
            this.chainIndex = str7;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (r20v0 com.okinc.assets.backend.api.model.FrozenAssetsAmountsResp$Notice$LinkPayload)
  (r21v0 java.lang.Integer)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0035: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.FrozenAssetsAmountsResp$Notice$LinkPayload, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.assets.backend.api.model.FrozenAssetsAmountsResp.Notice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.assets.backend.api.model.FrozenAssetsAmountsResp$Notice$LinkPayload, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Notice(String str, String str2, String str3, String str4, LinkPayload linkPayload, Integer num, String str5, Integer num2, Integer num3, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, linkPayload, num, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7);
        }

        public final NoticeType getTypeEnum() {
            return NoticeType.Companion.OLrzqt(this.type);
        }

        public static final class LinkPayload implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<LinkPayload> CREATOR = new Creator();
            private final Integer addressType;
            private final Long depositId;
            private final Long travelRuleId;
            private final Integer travelRuleStatus;

            public static final class Creator implements Parcelable.Creator<LinkPayload> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LinkPayload createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new LinkPayload(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LinkPayload[] newArray(int i) {
                    return new LinkPayload[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LinkPayload copy$default(LinkPayload linkPayload, Long l, Integer num, Long l2, Integer num2, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = linkPayload.travelRuleId;
                }
                if ((i & 2) != 0) {
                    num = linkPayload.travelRuleStatus;
                }
                if ((i & 4) != 0) {
                    l2 = linkPayload.depositId;
                }
                if ((i & 8) != 0) {
                    num2 = linkPayload.addressType;
                }
                return linkPayload.copy(l, num, l2, num2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long component1() {
                return this.travelRuleId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer component2() {
                return this.travelRuleStatus;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long component3() {
                return this.depositId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer component4() {
                return this.addressType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LinkPayload copy(Long l, Integer num, Long l2, Integer num2) {
                return new LinkPayload(l, num, l2, num2);
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
                if (!(obj instanceof LinkPayload)) {
                    return false;
                }
                LinkPayload linkPayload = (LinkPayload) obj;
                return Intrinsics.EZpvd(this.travelRuleId, linkPayload.travelRuleId) && Intrinsics.EZpvd(this.travelRuleStatus, linkPayload.travelRuleStatus) && Intrinsics.EZpvd(this.depositId, linkPayload.depositId) && Intrinsics.EZpvd(this.addressType, linkPayload.addressType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer getAddressType() {
                return this.addressType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long getDepositId() {
                return this.depositId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long getTravelRuleId() {
                return this.travelRuleId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Integer getTravelRuleStatus() {
                return this.travelRuleStatus;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Long l = this.travelRuleId;
                int iHashCode = l == null ? 0 : l.hashCode();
                Integer num = this.travelRuleStatus;
                int iHashCode2 = num == null ? 0 : num.hashCode();
                Long l2 = this.depositId;
                int iHashCode3 = l2 == null ? 0 : l2.hashCode();
                Integer num2 = this.addressType;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "LinkPayload(travelRuleId=" + this.travelRuleId + ", travelRuleStatus=" + this.travelRuleStatus + ", depositId=" + this.depositId + ", addressType=" + this.addressType + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                Long l = this.travelRuleId;
                if (l == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeLong(l.longValue());
                }
                Integer num = this.travelRuleStatus;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num.intValue());
                }
                Long l2 = this.depositId;
                if (l2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeLong(l2.longValue());
                }
                Integer num2 = this.addressType;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num2.intValue());
                }
            }

            public LinkPayload(Long l, Integer num, Long l2, Integer num2) {
                this.travelRuleId = l;
                this.travelRuleStatus = num;
                this.depositId = l2;
                this.addressType = num2;
            }

            public final TravelRuleStatus getTravelRuleStatusEnum() {
                return TravelRuleStatus.Companion.EZpvd(this.travelRuleStatus);
            }

            public final FrozenAssetAddressType getFrozenAssetAddressType() {
                return FrozenAssetAddressType.Companion.KWHzl(this.addressType);
            }
        }
    }
}
