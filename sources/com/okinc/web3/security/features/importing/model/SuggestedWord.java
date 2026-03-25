package com.okinc.web3.security.features.importing.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SuggestedWord {
    public static final int $stable = 8;
    private final SuggestedWordInput input;
    private final String word;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SuggestedWord copy$default(SuggestedWord suggestedWord, SuggestedWordInput suggestedWordInput, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            suggestedWordInput = suggestedWord.input;
        }
        if ((i & 2) != 0) {
            str = suggestedWord.word;
        }
        return suggestedWord.copy(suggestedWordInput, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuggestedWordInput component1() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.word;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuggestedWord copy(@NotNull SuggestedWordInput suggestedWordInput, @NotNull String str) {
        Intrinsics.checkNotNullParameter(suggestedWordInput, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SuggestedWord(suggestedWordInput, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedWord)) {
            return false;
        }
        SuggestedWord suggestedWord = (SuggestedWord) obj;
        return Intrinsics.EZpvd(this.input, suggestedWord.input) && Intrinsics.EZpvd((Object) this.word, (Object) suggestedWord.word);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuggestedWordInput getInput() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWord() {
        return this.word;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.input.hashCode() * 31) + this.word.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuggestedWord(input=" + this.input + ", word=" + this.word + ")";
    }

    public SuggestedWord(@NotNull SuggestedWordInput suggestedWordInput, @NotNull String str) {
        Intrinsics.checkNotNullParameter(suggestedWordInput, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.input = suggestedWordInput;
        this.word = str;
    }
}
