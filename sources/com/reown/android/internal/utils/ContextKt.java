package com.reown.android.internal.utils;

import com.reown.android.internal.common.model.AccountId;
import com.reown.foundation.common.model.Topic;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ContextKt {
    public static final String SELF_IDENTITY_PUBLIC_KEY_CONTEXT = "self_identityKey/";
    public static final String SELF_INVITE_PUBLIC_KEY_CONTEXT = "self_inviteKey/";
    public static final String SELF_PARTICIPANT_CONTEXT = "self_participant/";
    public static final String SELF_PEER_PUBLIC_KEY_CONTEXT = "self_peerKey/";

    /* JADX INFO: renamed from: getInviteTag-PaLCHi0, reason: not valid java name */
    public static final String m7269getInviteTagPaLCHi0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SELF_INVITE_PUBLIC_KEY_CONTEXT + str;
    }

    public static final String getParticipantTag(@NotNull Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        return SELF_PARTICIPANT_CONTEXT + topic.getValue();
    }

    /* JADX INFO: renamed from: getIdentityTag-PaLCHi0, reason: not valid java name */
    public static final String m7268getIdentityTagPaLCHi0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SELF_IDENTITY_PUBLIC_KEY_CONTEXT + str;
    }

    public static final String getPeerTag(@NotNull Pair<AccountId, Topic> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return SELF_PEER_PUBLIC_KEY_CONTEXT + pair.getFirst().m7217unboximpl() + "/" + pair.getSecond().getValue();
    }
}
