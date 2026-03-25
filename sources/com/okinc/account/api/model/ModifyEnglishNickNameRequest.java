package com.okinc.account.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class ModifyEnglishNickNameRequest {
    public static final int $stable = 0;
    private final String enPetname;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModifyEnglishNickNameRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ModifyEnglishNickNameRequest copy$default(ModifyEnglishNickNameRequest modifyEnglishNickNameRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modifyEnglishNickNameRequest.enPetname;
        }
        return modifyEnglishNickNameRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModifyEnglishNickNameRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ModifyEnglishNickNameRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModifyEnglishNickNameRequest) && Intrinsics.EZpvd((Object) this.enPetname, (Object) ((ModifyEnglishNickNameRequest) obj).enPetname);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnPetname() {
        return this.enPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.enPetname.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModifyEnglishNickNameRequest(enPetname=" + this.enPetname + ")";
    }

    public ModifyEnglishNickNameRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.enPetname = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:13) call: com.okinc.account.api.model.ModifyEnglishNickNameRequest.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ ModifyEnglishNickNameRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
