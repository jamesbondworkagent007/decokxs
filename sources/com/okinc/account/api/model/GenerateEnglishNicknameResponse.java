package com.okinc.account.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class GenerateEnglishNicknameResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String englishNickname;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GenerateEnglishNicknameResponse copy$default(GenerateEnglishNicknameResponse generateEnglishNicknameResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateEnglishNicknameResponse.englishNickname;
        }
        return generateEnglishNicknameResponse.copy(str);
    }

    @SerialName("newEnPetname")
    public static /* synthetic */ void getEnglishNickname$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.englishNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GenerateEnglishNicknameResponse copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GenerateEnglishNicknameResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenerateEnglishNicknameResponse) && Intrinsics.EZpvd((Object) this.englishNickname, (Object) ((GenerateEnglishNicknameResponse) obj).englishNickname);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnglishNickname() {
        return this.englishNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.englishNickname.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GenerateEnglishNicknameResponse(englishNickname=" + this.englishNickname + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.GenerateEnglishNicknameResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GenerateEnglishNicknameResponse> serializer() {
            return GenerateEnglishNicknameResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GenerateEnglishNicknameResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GenerateEnglishNicknameResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.englishNickname = str;
    }

    public GenerateEnglishNicknameResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.englishNickname = str;
    }
}
