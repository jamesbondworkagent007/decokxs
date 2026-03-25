package o;

import com.okinc.okimcore.feature.config.TypingIndicatorConfig;
import com.okinc.okimcore.model.remote.TypingIndicatorConfigDto;

/* JADX INFO: renamed from: o.oep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36644oep {
    public static final TypingIndicatorConfig EZpvd(TypingIndicatorConfigDto typingIndicatorConfigDto) {
        java.lang.Boolean individualChatEnabled;
        java.lang.Long throttleIntervalMs = typingIndicatorConfigDto.getThrottleIntervalMs();
        if (throttleIntervalMs != null) {
            long jLongValue = throttleIntervalMs.longValue();
            java.lang.Long expiryMs = typingIndicatorConfigDto.getExpiryMs();
            if (expiryMs != null) {
                long jLongValue2 = expiryMs.longValue();
                java.lang.Integer largeGroupThreshold = typingIndicatorConfigDto.getLargeGroupThreshold();
                if (largeGroupThreshold != null) {
                    int iIntValue = largeGroupThreshold.intValue();
                    java.util.List<java.lang.Integer> allowedRolesInLargeGroup = typingIndicatorConfigDto.getAllowedRolesInLargeGroup();
                    if (allowedRolesInLargeGroup != null && (individualChatEnabled = typingIndicatorConfigDto.getIndividualChatEnabled()) != null) {
                        boolean zBooleanValue = individualChatEnabled.booleanValue();
                        java.lang.Boolean groupChatEnabled = typingIndicatorConfigDto.getGroupChatEnabled();
                        if (groupChatEnabled != null) {
                            boolean zBooleanValue2 = groupChatEnabled.booleanValue();
                            java.lang.Boolean chatroomEnabled = typingIndicatorConfigDto.getChatroomEnabled();
                            if (chatroomEnabled != null) {
                                return new TypingIndicatorConfig(jLongValue, jLongValue2, iIntValue, allowedRolesInLargeGroup, zBooleanValue, zBooleanValue2, chatroomEnabled.booleanValue());
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
