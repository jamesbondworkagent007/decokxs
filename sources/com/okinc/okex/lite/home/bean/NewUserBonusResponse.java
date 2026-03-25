package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NewUserBonusResponse {

    @SerializedName("rewardAvailable")
    private final boolean rewardAvailable;

    @SerializedName("rulesHref")
    private final String rulesHref;

    @SerializedName("tasks")
    private final List<Task> tasks;

    @SerializedName("totalReward")
    private final int totalReward;

    @SerializedName("totalRewardCurrencyName")
    private final String totalRewardCurrencyName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(Task$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.okex.lite.home.bean.NewUserBonusResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewUserBonusResponse copy$default(NewUserBonusResponse newUserBonusResponse, boolean z, int i, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = newUserBonusResponse.rewardAvailable;
        }
        if ((i2 & 2) != 0) {
            i = newUserBonusResponse.totalReward;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = newUserBonusResponse.totalRewardCurrencyName;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = newUserBonusResponse.rulesHref;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            list = newUserBonusResponse.tasks;
        }
        return newUserBonusResponse.copydefault(z, i3, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewUserBonusResponse copydefault(boolean z, int i, @NotNull String str, @NotNull String str2, @NotNull List<Task> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new NewUserBonusResponse(z, i, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUserBonusResponse)) {
            return false;
        }
        NewUserBonusResponse newUserBonusResponse = (NewUserBonusResponse) obj;
        return this.rewardAvailable == newUserBonusResponse.rewardAvailable && this.totalReward == newUserBonusResponse.totalReward && Intrinsics.EZpvd((Object) this.totalRewardCurrencyName, (Object) newUserBonusResponse.totalRewardCurrencyName) && Intrinsics.EZpvd((Object) this.rulesHref, (Object) newUserBonusResponse.rulesHref) && Intrinsics.EZpvd(this.tasks, newUserBonusResponse.tasks);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Boolean.hashCode(this.rewardAvailable) * 31) + Integer.hashCode(this.totalReward)) * 31) + this.totalRewardCurrencyName.hashCode()) * 31) + this.rulesHref.hashCode()) * 31) + this.tasks.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewUserBonusResponse(rewardAvailable=" + this.rewardAvailable + ", totalReward=" + this.totalReward + ", totalRewardCurrencyName=" + this.totalRewardCurrencyName + ", rulesHref=" + this.rulesHref + ", tasks=" + this.tasks + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NewUserBonusResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewUserBonusResponse> serializer() {
            return NewUserBonusResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewUserBonusResponse(int i, boolean z, int i2, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, NewUserBonusResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.rewardAvailable = z;
        this.totalReward = i2;
        this.totalRewardCurrencyName = str;
        this.rulesHref = str2;
        this.tasks = list;
    }

    public static final /* synthetic */ void EZpvd(NewUserBonusResponse newUserBonusResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, newUserBonusResponse.rewardAvailable);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, newUserBonusResponse.totalReward);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, newUserBonusResponse.totalRewardCurrencyName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, newUserBonusResponse.rulesHref);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], newUserBonusResponse.tasks);
    }

    public NewUserBonusResponse(boolean z, int i, @NotNull String str, @NotNull String str2, @NotNull List<Task> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.rewardAvailable = z;
        this.totalReward = i;
        this.totalRewardCurrencyName = str;
        this.rulesHref = str2;
        this.tasks = list;
    }
}
