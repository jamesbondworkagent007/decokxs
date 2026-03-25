package com.okinc.okimcore.model.utility;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class GroupAssetCheckResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isCanJoinGroup;
    private final double myAssetBalance;
    private final String myAssetBalanceSymbol;
    private final double myPayBalance;
    private final String myPayBalanceSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupAssetCheckResult() {
        this(AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component1() {
        return this.myAssetBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.myAssetBalanceSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component3() {
        return this.myPayBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.myPayBalanceSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isCanJoinGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupAssetCheckResult copy(double d, @NotNull String str, double d2, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GroupAssetCheckResult(d, str, d2, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupAssetCheckResult)) {
            return false;
        }
        GroupAssetCheckResult groupAssetCheckResult = (GroupAssetCheckResult) obj;
        return Double.compare(this.myAssetBalance, groupAssetCheckResult.myAssetBalance) == 0 && Intrinsics.EZpvd((Object) this.myAssetBalanceSymbol, (Object) groupAssetCheckResult.myAssetBalanceSymbol) && Double.compare(this.myPayBalance, groupAssetCheckResult.myPayBalance) == 0 && Intrinsics.EZpvd((Object) this.myPayBalanceSymbol, (Object) groupAssetCheckResult.myPayBalanceSymbol) && this.isCanJoinGroup == groupAssetCheckResult.isCanJoinGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getMyAssetBalance() {
        return this.myAssetBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMyAssetBalanceSymbol() {
        return this.myAssetBalanceSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getMyPayBalance() {
        return this.myPayBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMyPayBalanceSymbol() {
        return this.myPayBalanceSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Double.hashCode(this.myAssetBalance) * 31) + this.myAssetBalanceSymbol.hashCode()) * 31) + Double.hashCode(this.myPayBalance)) * 31) + this.myPayBalanceSymbol.hashCode()) * 31) + Boolean.hashCode(this.isCanJoinGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCanJoinGroup() {
        return this.isCanJoinGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupAssetCheckResult(myAssetBalance=" + this.myAssetBalance + ", myAssetBalanceSymbol=" + this.myAssetBalanceSymbol + ", myPayBalance=" + this.myPayBalance + ", myPayBalanceSymbol=" + this.myPayBalanceSymbol + ", isCanJoinGroup=" + this.isCanJoinGroup + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.utility.GroupAssetCheckResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupAssetCheckResult> serializer() {
            return GroupAssetCheckResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupAssetCheckResult(int i, double d, String str, double d2, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.myAssetBalance = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.myAssetBalance = d;
        }
        if ((i & 2) == 0) {
            this.myAssetBalanceSymbol = "";
        } else {
            this.myAssetBalanceSymbol = str;
        }
        if ((i & 4) == 0) {
            this.myPayBalance = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.myPayBalance = d2;
        }
        if ((i & 8) == 0) {
            this.myPayBalanceSymbol = "";
        } else {
            this.myPayBalanceSymbol = str2;
        }
        if ((i & 16) == 0) {
            this.isCanJoinGroup = false;
        } else {
            this.isCanJoinGroup = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupAssetCheckResult groupAssetCheckResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || Double.compare(groupAssetCheckResult.myAssetBalance, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 0, groupAssetCheckResult.myAssetBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) groupAssetCheckResult.myAssetBalanceSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, groupAssetCheckResult.myAssetBalanceSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || Double.compare(groupAssetCheckResult.myPayBalance, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 2, groupAssetCheckResult.myPayBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) groupAssetCheckResult.myPayBalanceSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, groupAssetCheckResult.myPayBalanceSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupAssetCheckResult.isCanJoinGroup) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, groupAssetCheckResult.isCanJoinGroup);
        }
    }

    public GroupAssetCheckResult(double d, @NotNull String str, double d2, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.myAssetBalance = d;
        this.myAssetBalanceSymbol = str;
        this.myPayBalance = d2;
        this.myPayBalanceSymbol = str2;
        this.isCanJoinGroup = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r6v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r9v0 double) : (wrap:double:0x0002: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(double, java.lang.String, double, java.lang.String, boolean):void (m)] (LINE:14) call: com.okinc.okimcore.model.utility.GroupAssetCheckResult.<init>(double, java.lang.String, double, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ GroupAssetCheckResult(double d, String str, double d2, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? d2 : AudioStats.AUDIO_AMPLITUDE_NONE, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z);
    }
}
