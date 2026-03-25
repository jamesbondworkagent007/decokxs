package com.okinc.web3.security.features.importing.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SuggestedWordsState {

    public static final class SeedPhrasePrompt implements SuggestedWordsState {
        public static final int $stable = 0;
        public static final SeedPhrasePrompt INSTANCE = new SeedPhrasePrompt();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SeedPhrasePrompt";
        }

        private SeedPhrasePrompt() {
        }
    }

    public static final class SuggestedWords implements SuggestedWordsState {
        public static final int $stable = 8;
        private final List<SuggestedWord> words;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3.security.features.importing.model.SuggestedWordsState$SuggestedWords */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SuggestedWords copy$default(SuggestedWords suggestedWords, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = suggestedWords.words;
            }
            return suggestedWords.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SuggestedWord> component1() {
            return this.words;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuggestedWords copy(@NotNull List<SuggestedWord> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new SuggestedWords(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestedWords) && Intrinsics.EZpvd(this.words, ((SuggestedWords) obj).words);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SuggestedWord> getWords() {
            return this.words;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.words.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SuggestedWords(words=" + this.words + ")";
        }

        public SuggestedWords(@NotNull List<SuggestedWord> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.words = list;
        }
    }
}
