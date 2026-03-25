package com.reown.android.internal.common.crypto.codec;

import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.Participants;
import com.reown.foundation.common.model.Topic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface Codec {
    String decrypt(@NotNull Topic topic, @NotNull byte[] bArr);

    byte[] encrypt(@NotNull Topic topic, @NotNull String str, @NotNull EnvelopeType envelopeType, Participants participants);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ byte[] encrypt$default(Codec codec, Topic topic, String str, EnvelopeType envelopeType, Participants participants, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encrypt");
            }
            if ((i & 8) != 0) {
                participants = null;
            }
            return codec.encrypt(topic, str, envelopeType, participants);
        }
    }
}
