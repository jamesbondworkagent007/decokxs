package com.okinc.planet.domain.remote.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SaveDraftResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String draftId;
    public final String modifyTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SaveDraftResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SaveDraftResponse copy$default(SaveDraftResponse saveDraftResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveDraftResponse.draftId;
        }
        if ((i & 2) != 0) {
            str2 = saveDraftResponse.modifyTime;
        }
        return saveDraftResponse.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SaveDraftResponse KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SaveDraftResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveDraftResponse)) {
            return false;
        }
        SaveDraftResponse saveDraftResponse = (SaveDraftResponse) obj;
        return Intrinsics.EZpvd((Object) this.draftId, (Object) saveDraftResponse.draftId) && Intrinsics.EZpvd((Object) this.modifyTime, (Object) saveDraftResponse.modifyTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.draftId.hashCode() * 31) + this.modifyTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SaveDraftResponse(draftId=" + this.draftId + ", modifyTime=" + this.modifyTime + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.SaveDraftResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SaveDraftResponse> serializer() {
            return SaveDraftResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SaveDraftResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.draftId = "";
        } else {
            this.draftId = str;
        }
        if ((i & 2) == 0) {
            this.modifyTime = "";
        } else {
            this.modifyTime = str2;
        }
    }

    public static final /* synthetic */ void KWHzl(SaveDraftResponse saveDraftResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) saveDraftResponse.draftId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, saveDraftResponse.draftId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) saveDraftResponse.modifyTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, saveDraftResponse.modifyTime);
    }

    public SaveDraftResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.draftId = str;
        this.modifyTime = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.planet.domain.remote.dto.SaveDraftResponse.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SaveDraftResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
