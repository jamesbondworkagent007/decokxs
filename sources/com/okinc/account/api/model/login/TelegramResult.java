package com.okinc.account.api.model.login;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import o.C43284rmQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class TelegramResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final /* synthetic */ void write$Self$OKAccount_account_api(TelegramResult telegramResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.TelegramResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TelegramResult> serializer() {
            return TelegramResult$$serializer.INSTANCE;
        }
    }

    public TelegramResult() {
    }

    public /* synthetic */ TelegramResult(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public final TelegramData parseObject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json jsonKWHzl = C43284rmQ.KWHzl();
            jsonKWHzl.getSerializersModule();
            return (TelegramData) jsonKWHzl.decodeFromString(BuiltinSerializersKt.getNullable(TelegramData.Companion.serializer()), str);
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return null;
        }
    }
}
