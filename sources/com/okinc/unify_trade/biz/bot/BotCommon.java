package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BotCommon implements Parcelable {
    private final AutoEarnStakingParam autoEarn;
    private final AutoEarnStakingParam autoStaking;
    private final boolean isPinned;
    private final String stgyName;
    private final Boolean syncParamFailed;
    private String syncParamLeader;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotCommon> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotCommon> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCommon createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = null;
            AutoEarnStakingParam autoEarnStakingParamCreateFromParcel = parcel.readInt() == 0 ? null : AutoEarnStakingParam.CREATOR.createFromParcel(parcel);
            AutoEarnStakingParam autoEarnStakingParamCreateFromParcel2 = parcel.readInt() == 0 ? null : AutoEarnStakingParam.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BotCommon(autoEarnStakingParamCreateFromParcel, autoEarnStakingParamCreateFromParcel2, boolValueOf, parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCommon[] newArray(int i) {
            return new BotCommon[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotCommon() {
        this((AutoEarnStakingParam) null, (AutoEarnStakingParam) null, (Boolean) null, (String) null, false, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotCommon copy$default(BotCommon botCommon, AutoEarnStakingParam autoEarnStakingParam, AutoEarnStakingParam autoEarnStakingParam2, Boolean bool, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            autoEarnStakingParam = botCommon.autoEarn;
        }
        if ((i & 2) != 0) {
            autoEarnStakingParam2 = botCommon.autoStaking;
        }
        AutoEarnStakingParam autoEarnStakingParam3 = autoEarnStakingParam2;
        if ((i & 4) != 0) {
            bool = botCommon.syncParamFailed;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str = botCommon.syncParamLeader;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            z = botCommon.isPinned;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str2 = botCommon.stgyName;
        }
        return botCommon.copy(autoEarnStakingParam, autoEarnStakingParam3, bool2, str3, z2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnStakingParam component1() {
        return this.autoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnStakingParam component2() {
        return this.autoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.syncParamFailed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.syncParamLeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isPinned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotCommon copy(AutoEarnStakingParam autoEarnStakingParam, AutoEarnStakingParam autoEarnStakingParam2, Boolean bool, String str, boolean z, String str2) {
        return new BotCommon(autoEarnStakingParam, autoEarnStakingParam2, bool, str, z, str2);
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
        if (!(obj instanceof BotCommon)) {
            return false;
        }
        BotCommon botCommon = (BotCommon) obj;
        return Intrinsics.EZpvd(this.autoEarn, botCommon.autoEarn) && Intrinsics.EZpvd(this.autoStaking, botCommon.autoStaking) && Intrinsics.EZpvd(this.syncParamFailed, botCommon.syncParamFailed) && Intrinsics.EZpvd((Object) this.syncParamLeader, (Object) botCommon.syncParamLeader) && this.isPinned == botCommon.isPinned && Intrinsics.EZpvd((Object) this.stgyName, (Object) botCommon.stgyName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnStakingParam getAutoEarn() {
        return this.autoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnStakingParam getAutoStaking() {
        return this.autoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSyncParamFailed() {
        return this.syncParamFailed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSyncParamLeader() {
        return this.syncParamLeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AutoEarnStakingParam autoEarnStakingParam = this.autoEarn;
        int iHashCode = autoEarnStakingParam == null ? 0 : autoEarnStakingParam.hashCode();
        AutoEarnStakingParam autoEarnStakingParam2 = this.autoStaking;
        int iHashCode2 = autoEarnStakingParam2 == null ? 0 : autoEarnStakingParam2.hashCode();
        Boolean bool = this.syncParamFailed;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str = this.syncParamLeader;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isPinned);
        String str2 = this.stgyName;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPinned() {
        return this.isPinned;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSyncParamLeader(String str) {
        this.syncParamLeader = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotCommon(autoEarn=" + this.autoEarn + ", autoStaking=" + this.autoStaking + ", syncParamFailed=" + this.syncParamFailed + ", syncParamLeader=" + this.syncParamLeader + ", isPinned=" + this.isPinned + ", stgyName=" + this.stgyName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AutoEarnStakingParam autoEarnStakingParam = this.autoEarn;
        if (autoEarnStakingParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoEarnStakingParam.writeToParcel(parcel, i);
        }
        AutoEarnStakingParam autoEarnStakingParam2 = this.autoStaking;
        if (autoEarnStakingParam2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoEarnStakingParam2.writeToParcel(parcel, i);
        }
        Boolean bool = this.syncParamFailed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.syncParamLeader);
        parcel.writeInt(this.isPinned ? 1 : 0);
        parcel.writeString(this.stgyName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.BotCommon.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotCommon> serializer() {
            return BotCommon$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotCommon(int i, AutoEarnStakingParam autoEarnStakingParam, AutoEarnStakingParam autoEarnStakingParam2, Boolean bool, String str, boolean z, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.autoEarn = null;
        } else {
            this.autoEarn = autoEarnStakingParam;
        }
        if ((i & 2) == 0) {
            this.autoStaking = null;
        } else {
            this.autoStaking = autoEarnStakingParam2;
        }
        if ((i & 4) == 0) {
            this.syncParamFailed = Boolean.FALSE;
        } else {
            this.syncParamFailed = bool;
        }
        if ((i & 8) == 0) {
            this.syncParamLeader = "";
        } else {
            this.syncParamLeader = str;
        }
        if ((i & 16) == 0) {
            this.isPinned = false;
        } else {
            this.isPinned = z;
        }
        if ((i & 32) == 0) {
            this.stgyName = null;
        } else {
            this.stgyName = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotCommon botCommon, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botCommon.autoEarn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AutoEarnStakingParam$$serializer.INSTANCE, botCommon.autoEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botCommon.autoStaking != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, AutoEarnStakingParam$$serializer.INSTANCE, botCommon.autoStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(botCommon.syncParamFailed, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, botCommon.syncParamFailed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) botCommon.syncParamLeader, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botCommon.syncParamLeader);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || botCommon.isPinned) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, botCommon.isPinned);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && botCommon.stgyName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, botCommon.stgyName);
    }

    public BotCommon(AutoEarnStakingParam autoEarnStakingParam, AutoEarnStakingParam autoEarnStakingParam2, Boolean bool, String str, boolean z, String str2) {
        this.autoEarn = autoEarnStakingParam;
        this.autoStaking = autoEarnStakingParam2;
        this.syncParamFailed = bool;
        this.syncParamLeader = str;
        this.isPinned = z;
        this.stgyName = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.bot.AutoEarnStakingParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.AutoEarnStakingParam) : (r6v0 com.okinc.unify_trade.biz.bot.AutoEarnStakingParam))
  (wrap:com.okinc.unify_trade.biz.bot.AutoEarnStakingParam:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.AutoEarnStakingParam) : (r7v0 com.okinc.unify_trade.biz.bot.AutoEarnStakingParam))
  (wrap:java.lang.Boolean:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0013: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:boolean:0x0022: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(com.okinc.unify_trade.biz.bot.AutoEarnStakingParam, com.okinc.unify_trade.biz.bot.AutoEarnStakingParam, java.lang.Boolean, java.lang.String, boolean, java.lang.String):void (m)] (LINE:105) call: com.okinc.unify_trade.biz.bot.BotCommon.<init>(com.okinc.unify_trade.biz.bot.AutoEarnStakingParam, com.okinc.unify_trade.biz.bot.AutoEarnStakingParam, java.lang.Boolean, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ BotCommon(AutoEarnStakingParam autoEarnStakingParam, AutoEarnStakingParam autoEarnStakingParam2, Boolean bool, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : autoEarnStakingParam, (i & 2) != 0 ? null : autoEarnStakingParam2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str2);
    }
}
