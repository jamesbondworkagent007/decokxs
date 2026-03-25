package com.okinc.web3.security.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ValidSeedPhraseResult {
    public static final int $stable = 0;
    private final boolean ignoreCheckExists;
    private final boolean ignoreCheckImportAvailable;
    private final boolean isTon;
    private final String seedPhrase;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValidSeedPhraseResult copy$default(ValidSeedPhraseResult validSeedPhraseResult, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validSeedPhraseResult.seedPhrase;
        }
        if ((i & 2) != 0) {
            z = validSeedPhraseResult.isTon;
        }
        if ((i & 4) != 0) {
            z2 = validSeedPhraseResult.ignoreCheckImportAvailable;
        }
        if ((i & 8) != 0) {
            z3 = validSeedPhraseResult.ignoreCheckExists;
        }
        return validSeedPhraseResult.copy(str, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.seedPhrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isTon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.ignoreCheckImportAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.ignoreCheckExists;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidSeedPhraseResult copy(@NotNull String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ValidSeedPhraseResult(str, z, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidSeedPhraseResult)) {
            return false;
        }
        ValidSeedPhraseResult validSeedPhraseResult = (ValidSeedPhraseResult) obj;
        return Intrinsics.EZpvd((Object) this.seedPhrase, (Object) validSeedPhraseResult.seedPhrase) && this.isTon == validSeedPhraseResult.isTon && this.ignoreCheckImportAvailable == validSeedPhraseResult.ignoreCheckImportAvailable && this.ignoreCheckExists == validSeedPhraseResult.ignoreCheckExists;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIgnoreCheckExists() {
        return this.ignoreCheckExists;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIgnoreCheckImportAvailable() {
        return this.ignoreCheckImportAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeedPhrase() {
        return this.seedPhrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.seedPhrase.hashCode() * 31) + Boolean.hashCode(this.isTon)) * 31) + Boolean.hashCode(this.ignoreCheckImportAvailable)) * 31) + Boolean.hashCode(this.ignoreCheckExists);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTon() {
        return this.isTon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValidSeedPhraseResult(seedPhrase=" + this.seedPhrase + ", isTon=" + this.isTon + ", ignoreCheckImportAvailable=" + this.ignoreCheckImportAvailable + ", ignoreCheckExists=" + this.ignoreCheckExists + ")";
    }

    public ValidSeedPhraseResult(@NotNull String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.seedPhrase = str;
        this.isTon = z;
        this.ignoreCheckImportAvailable = z2;
        this.ignoreCheckExists = z3;
    }
}
