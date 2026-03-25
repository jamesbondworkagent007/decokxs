package com.okinc.okimcore.feature.config;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TypingIndicatorConfig {
    public static final int $stable = 8;
    private final List<Integer> allowedRolesInLargeGroup;
    private final boolean chatroomEnabled;
    private final long expiryMs;
    private final boolean groupChatEnabled;
    private final boolean individualChatEnabled;
    private final int largeGroupThreshold;
    private final long throttleIntervalMs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.throttleIntervalMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.expiryMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.largeGroupThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component4() {
        return this.allowedRolesInLargeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.individualChatEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.groupChatEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.chatroomEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TypingIndicatorConfig copy(long j, long j2, int i, @NotNull List<Integer> list, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TypingIndicatorConfig(j, j2, i, list, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypingIndicatorConfig)) {
            return false;
        }
        TypingIndicatorConfig typingIndicatorConfig = (TypingIndicatorConfig) obj;
        return this.throttleIntervalMs == typingIndicatorConfig.throttleIntervalMs && this.expiryMs == typingIndicatorConfig.expiryMs && this.largeGroupThreshold == typingIndicatorConfig.largeGroupThreshold && Intrinsics.EZpvd(this.allowedRolesInLargeGroup, typingIndicatorConfig.allowedRolesInLargeGroup) && this.individualChatEnabled == typingIndicatorConfig.individualChatEnabled && this.groupChatEnabled == typingIndicatorConfig.groupChatEnabled && this.chatroomEnabled == typingIndicatorConfig.chatroomEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getAllowedRolesInLargeGroup() {
        return this.allowedRolesInLargeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChatroomEnabled() {
        return this.chatroomEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiryMs() {
        return this.expiryMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getGroupChatEnabled() {
        return this.groupChatEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIndividualChatEnabled() {
        return this.individualChatEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLargeGroupThreshold() {
        return this.largeGroupThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getThrottleIntervalMs() {
        return this.throttleIntervalMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Long.hashCode(this.throttleIntervalMs) * 31) + Long.hashCode(this.expiryMs)) * 31) + Integer.hashCode(this.largeGroupThreshold)) * 31) + this.allowedRolesInLargeGroup.hashCode()) * 31) + Boolean.hashCode(this.individualChatEnabled)) * 31) + Boolean.hashCode(this.groupChatEnabled)) * 31) + Boolean.hashCode(this.chatroomEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TypingIndicatorConfig(throttleIntervalMs=" + this.throttleIntervalMs + ", expiryMs=" + this.expiryMs + ", largeGroupThreshold=" + this.largeGroupThreshold + ", allowedRolesInLargeGroup=" + this.allowedRolesInLargeGroup + ", individualChatEnabled=" + this.individualChatEnabled + ", groupChatEnabled=" + this.groupChatEnabled + ", chatroomEnabled=" + this.chatroomEnabled + ")";
    }

    public TypingIndicatorConfig(long j, long j2, int i, @NotNull List<Integer> list, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.throttleIntervalMs = j;
        this.expiryMs = j2;
        this.largeGroupThreshold = i;
        this.allowedRolesInLargeGroup = list;
        this.individualChatEnabled = z;
        this.groupChatEnabled = z2;
        this.chatroomEnabled = z3;
    }
}
