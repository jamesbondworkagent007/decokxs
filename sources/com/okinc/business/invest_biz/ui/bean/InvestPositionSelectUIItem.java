package com.okinc.business.invest_biz.ui.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface InvestPositionSelectUIItem extends Parcelable {
    String getPositionTokenId();

    @Serializable
    public static final class InvestV3PositionSelectUIItem implements InvestPositionSelectUIItem, Parcelable {
        private String amount;
        private boolean cannotInvest;
        private final boolean isActive;
        private String name;
        private String range;
        private String reverseRange;
        private String tokenId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<InvestV3PositionSelectUIItem> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<InvestV3PositionSelectUIItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestV3PositionSelectUIItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new InvestV3PositionSelectUIItem(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestV3PositionSelectUIItem[] newArray(int i) {
                return new InvestV3PositionSelectUIItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvestV3PositionSelectUIItem() {
            this((String) null, false, (String) null, (String) null, (String) null, false, (String) null, 127, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InvestV3PositionSelectUIItem copy$default(InvestV3PositionSelectUIItem investV3PositionSelectUIItem, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = investV3PositionSelectUIItem.name;
            }
            if ((i & 2) != 0) {
                z = investV3PositionSelectUIItem.isActive;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                str2 = investV3PositionSelectUIItem.range;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = investV3PositionSelectUIItem.amount;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = investV3PositionSelectUIItem.tokenId;
            }
            String str8 = str4;
            if ((i & 32) != 0) {
                z2 = investV3PositionSelectUIItem.cannotInvest;
            }
            boolean z4 = z2;
            if ((i & 64) != 0) {
                str5 = investV3PositionSelectUIItem.reverseRange;
            }
            return investV3PositionSelectUIItem.copy(str, z3, str6, str7, str8, z4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.isActive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.range;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component6() {
            return this.cannotInvest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.reverseRange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestV3PositionSelectUIItem copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z2, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new InvestV3PositionSelectUIItem(str, z, str2, str3, str4, z2, str5);
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
            if (!(obj instanceof InvestV3PositionSelectUIItem)) {
                return false;
            }
            InvestV3PositionSelectUIItem investV3PositionSelectUIItem = (InvestV3PositionSelectUIItem) obj;
            return Intrinsics.EZpvd((Object) this.name, (Object) investV3PositionSelectUIItem.name) && this.isActive == investV3PositionSelectUIItem.isActive && Intrinsics.EZpvd((Object) this.range, (Object) investV3PositionSelectUIItem.range) && Intrinsics.EZpvd((Object) this.amount, (Object) investV3PositionSelectUIItem.amount) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investV3PositionSelectUIItem.tokenId) && this.cannotInvest == investV3PositionSelectUIItem.cannotInvest && Intrinsics.EZpvd((Object) this.reverseRange, (Object) investV3PositionSelectUIItem.reverseRange);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getCannotInvest() {
            return this.cannotInvest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem
        public String getPositionTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRange() {
            return this.range;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReverseRange() {
            return this.reverseRange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.name.hashCode();
            int iHashCode2 = Boolean.hashCode(this.isActive);
            int iHashCode3 = this.range.hashCode();
            int iHashCode4 = this.amount.hashCode();
            int iHashCode5 = this.tokenId.hashCode();
            int iHashCode6 = Boolean.hashCode(this.cannotInvest);
            String str = this.reverseRange;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isActive() {
            return this.isActive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCannotInvest(boolean z) {
            this.cannotInvest = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRange(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.range = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setReverseRange(String str) {
            this.reverseRange = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTokenId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tokenId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvestV3PositionSelectUIItem(name=" + this.name + ", isActive=" + this.isActive + ", range=" + this.range + ", amount=" + this.amount + ", tokenId=" + this.tokenId + ", cannotInvest=" + this.cannotInvest + ", reverseRange=" + this.reverseRange + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
            parcel.writeInt(this.isActive ? 1 : 0);
            parcel.writeString(this.range);
            parcel.writeString(this.amount);
            parcel.writeString(this.tokenId);
            parcel.writeInt(this.cannotInvest ? 1 : 0);
            parcel.writeString(this.reverseRange);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem.InvestV3PositionSelectUIItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InvestV3PositionSelectUIItem> serializer() {
                return InvestPositionSelectUIItem$InvestV3PositionSelectUIItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InvestV3PositionSelectUIItem(int i, String str, boolean z, String str2, String str3, String str4, boolean z2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.name = "";
            } else {
                this.name = str;
            }
            if ((i & 2) == 0) {
                this.isActive = false;
            } else {
                this.isActive = z;
            }
            if ((i & 4) == 0) {
                this.range = "";
            } else {
                this.range = str2;
            }
            if ((i & 8) == 0) {
                this.amount = "";
            } else {
                this.amount = str3;
            }
            if ((i & 16) == 0) {
                this.tokenId = "";
            } else {
                this.tokenId = str4;
            }
            if ((i & 32) == 0) {
                this.cannotInvest = false;
            } else {
                this.cannotInvest = z2;
            }
            if ((i & 64) == 0) {
                this.reverseRange = "";
            } else {
                this.reverseRange = str5;
            }
        }

        public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestV3PositionSelectUIItem investV3PositionSelectUIItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investV3PositionSelectUIItem.name, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, investV3PositionSelectUIItem.name);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investV3PositionSelectUIItem.isActive) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 1, investV3PositionSelectUIItem.isActive);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investV3PositionSelectUIItem.range, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, investV3PositionSelectUIItem.range);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investV3PositionSelectUIItem.amount, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, investV3PositionSelectUIItem.amount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investV3PositionSelectUIItem.tokenId, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 4, investV3PositionSelectUIItem.tokenId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investV3PositionSelectUIItem.cannotInvest) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 5, investV3PositionSelectUIItem.cannotInvest);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) investV3PositionSelectUIItem.reverseRange, (Object) "")) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investV3PositionSelectUIItem.reverseRange);
        }

        public InvestV3PositionSelectUIItem(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z2, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.name = str;
            this.isActive = z;
            this.range = str2;
            this.amount = str3;
            this.tokenId = str4;
            this.cannotInvest = z2;
            this.reverseRange = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:137) call: com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem.InvestV3PositionSelectUIItem.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ InvestV3PositionSelectUIItem(String str, boolean z, String str2, String str3, String str4, boolean z2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? "" : str5);
        }
    }

    @Serializable
    public static final class InvestExpiryPositionSelectUIItem implements InvestPositionSelectUIItem, Parcelable {
        private String amount;
        private final boolean isActive;
        private final String settlementTime;
        private String tokenId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<InvestExpiryPositionSelectUIItem> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<InvestExpiryPositionSelectUIItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestExpiryPositionSelectUIItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new InvestExpiryPositionSelectUIItem(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestExpiryPositionSelectUIItem[] newArray(int i) {
                return new InvestExpiryPositionSelectUIItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvestExpiryPositionSelectUIItem() {
            this(false, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InvestExpiryPositionSelectUIItem copy$default(InvestExpiryPositionSelectUIItem investExpiryPositionSelectUIItem, boolean z, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = investExpiryPositionSelectUIItem.isActive;
            }
            if ((i & 2) != 0) {
                str = investExpiryPositionSelectUIItem.amount;
            }
            if ((i & 4) != 0) {
                str2 = investExpiryPositionSelectUIItem.tokenId;
            }
            if ((i & 8) != 0) {
                str3 = investExpiryPositionSelectUIItem.settlementTime;
            }
            return investExpiryPositionSelectUIItem.copy(z, str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.isActive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.settlementTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestExpiryPositionSelectUIItem copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new InvestExpiryPositionSelectUIItem(z, str, str2, str3);
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
            if (!(obj instanceof InvestExpiryPositionSelectUIItem)) {
                return false;
            }
            InvestExpiryPositionSelectUIItem investExpiryPositionSelectUIItem = (InvestExpiryPositionSelectUIItem) obj;
            return this.isActive == investExpiryPositionSelectUIItem.isActive && Intrinsics.EZpvd((Object) this.amount, (Object) investExpiryPositionSelectUIItem.amount) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investExpiryPositionSelectUIItem.tokenId) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) investExpiryPositionSelectUIItem.settlementTime);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem
        public String getPositionTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSettlementTime() {
            return this.settlementTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenId() {
            return this.tokenId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Boolean.hashCode(this.isActive) * 31) + this.amount.hashCode()) * 31) + this.tokenId.hashCode()) * 31) + this.settlementTime.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isActive() {
            return this.isActive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTokenId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tokenId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvestExpiryPositionSelectUIItem(isActive=" + this.isActive + ", amount=" + this.amount + ", tokenId=" + this.tokenId + ", settlementTime=" + this.settlementTime + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.isActive ? 1 : 0);
            parcel.writeString(this.amount);
            parcel.writeString(this.tokenId);
            parcel.writeString(this.settlementTime);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem.InvestExpiryPositionSelectUIItem.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InvestExpiryPositionSelectUIItem> serializer() {
                return InvestPositionSelectUIItem$InvestExpiryPositionSelectUIItem$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InvestExpiryPositionSelectUIItem(int i, boolean z, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.isActive = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.amount = "";
            } else {
                this.amount = str;
            }
            if ((i & 4) == 0) {
                this.tokenId = "";
            } else {
                this.tokenId = str2;
            }
            if ((i & 8) == 0) {
                this.settlementTime = "";
            } else {
                this.settlementTime = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestExpiryPositionSelectUIItem investExpiryPositionSelectUIItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investExpiryPositionSelectUIItem.isActive) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, investExpiryPositionSelectUIItem.isActive);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investExpiryPositionSelectUIItem.amount, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, investExpiryPositionSelectUIItem.amount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investExpiryPositionSelectUIItem.tokenId, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 2, investExpiryPositionSelectUIItem.tokenId);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) investExpiryPositionSelectUIItem.settlementTime, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investExpiryPositionSelectUIItem.settlementTime);
        }

        public InvestExpiryPositionSelectUIItem(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.isActive = z;
            this.amount = str;
            this.tokenId = str2;
            this.settlementTime = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:154) call: com.okinc.business.invest_biz.ui.bean.InvestPositionSelectUIItem.InvestExpiryPositionSelectUIItem.<init>(boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ InvestExpiryPositionSelectUIItem(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }
    }
}
