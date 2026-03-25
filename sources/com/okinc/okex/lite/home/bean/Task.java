package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class Task {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("requirement")
    private final Requirement requirement;

    @SerializedName("rewardDescription")
    private final RewardDescription rewardDescription;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Task copy$default(Task task, RewardDescription rewardDescription, Requirement requirement, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardDescription = task.rewardDescription;
        }
        if ((i & 2) != 0) {
            requirement = task.requirement;
        }
        return task.KWHzl(rewardDescription, requirement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Task KWHzl(@NotNull RewardDescription rewardDescription, @NotNull Requirement requirement) {
        Intrinsics.checkNotNullParameter(rewardDescription, "");
        Intrinsics.checkNotNullParameter(requirement, "");
        return new Task(rewardDescription, requirement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Task)) {
            return false;
        }
        Task task = (Task) obj;
        return Intrinsics.EZpvd(this.rewardDescription, task.rewardDescription) && Intrinsics.EZpvd(this.requirement, task.requirement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.rewardDescription.hashCode() * 31) + this.requirement.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Task(rewardDescription=" + this.rewardDescription + ", requirement=" + this.requirement + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.Task.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Task> serializer() {
            return Task$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Task(int i, RewardDescription rewardDescription, Requirement requirement, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Task$$serializer.INSTANCE.getDescriptor());
        }
        this.rewardDescription = rewardDescription;
        this.requirement = requirement;
    }

    public static final /* synthetic */ void EZpvd(Task task, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, RewardDescription$$serializer.INSTANCE, task.rewardDescription);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, Requirement$$serializer.INSTANCE, task.requirement);
    }

    public Task(@NotNull RewardDescription rewardDescription, @NotNull Requirement requirement) {
        Intrinsics.checkNotNullParameter(rewardDescription, "");
        Intrinsics.checkNotNullParameter(requirement, "");
        this.rewardDescription = rewardDescription;
        this.requirement = requirement;
    }
}
