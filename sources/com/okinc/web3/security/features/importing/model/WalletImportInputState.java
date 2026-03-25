package com.okinc.web3.security.features.importing.model;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface WalletImportInputState {

    public static final class PrivateKeyState implements WalletImportInputState {
        public static final int $stable = 8;
        private final int selection;
        private final List<String> suggestedWords;
        private final String text;
        private final long version;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.web3.security.features.importing.model.WalletImportInputState$PrivateKeyState */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PrivateKeyState copy$default(PrivateKeyState privateKeyState, String str, int i, long j, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = privateKeyState.text;
            }
            if ((i2 & 2) != 0) {
                i = privateKeyState.selection;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                j = privateKeyState.version;
            }
            long j2 = j;
            if ((i2 & 8) != 0) {
                list = privateKeyState.suggestedWords;
            }
            return privateKeyState.copy(str, i3, j2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.selection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component3() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component4() {
            return this.suggestedWords;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PrivateKeyState copy(@NotNull String str, int i, long j, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new PrivateKeyState(str, i, j, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrivateKeyState)) {
                return false;
            }
            PrivateKeyState privateKeyState = (PrivateKeyState) obj;
            return Intrinsics.EZpvd((Object) this.text, (Object) privateKeyState.text) && this.selection == privateKeyState.selection && this.version == privateKeyState.version && Intrinsics.EZpvd(this.suggestedWords, privateKeyState.suggestedWords);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSelection() {
            return this.selection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getSuggestedWords() {
            return this.suggestedWords;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getVersion() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.text.hashCode() * 31) + Integer.hashCode(this.selection)) * 31) + Long.hashCode(this.version)) * 31) + this.suggestedWords.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PrivateKeyState(text=" + this.text + ", selection=" + this.selection + ", version=" + this.version + ", suggestedWords=" + this.suggestedWords + ")";
        }

        public PrivateKeyState(@NotNull String str, int i, long j, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.text = str;
            this.selection = i;
            this.version = j;
            this.suggestedWords = list;
        }
    }

    public static final class SeedPhraseState implements WalletImportInputState {
        public static final int $stable = 8;
        private final long version;
        private final List<WordState> words;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3.security.features.importing.model.WalletImportInputState$SeedPhraseState */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SeedPhraseState copy$default(SeedPhraseState seedPhraseState, List list, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                list = seedPhraseState.words;
            }
            if ((i & 2) != 0) {
                j = seedPhraseState.version;
            }
            return seedPhraseState.copy(list, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<WordState> component1() {
            return this.words;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SeedPhraseState copy(@NotNull List<WordState> list, long j) {
            Intrinsics.checkNotNullParameter(list, "");
            return new SeedPhraseState(list, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SeedPhraseState)) {
                return false;
            }
            SeedPhraseState seedPhraseState = (SeedPhraseState) obj;
            return Intrinsics.EZpvd(this.words, seedPhraseState.words) && this.version == seedPhraseState.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getVersion() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<WordState> getWords() {
            return this.words;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.words.hashCode() * 31) + Long.hashCode(this.version);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SeedPhraseState(words=" + this.words + ", version=" + this.version + ")";
        }

        public SeedPhraseState(@NotNull List<WordState> list, long j) {
            Intrinsics.checkNotNullParameter(list, "");
            this.words = list;
            this.version = j;
        }

        public static final class WordState {
            public static final int $stable = 8;
            private final int background;
            private final int id;
            private final int index;
            private final String lastSuggestedWord;
            private final int selectedIndex;
            private final int selection;
            private final List<String> suggestedWords;
            private final String text;
            private final int textColor;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component3() {
                return this.selection;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.lastSuggestedWord;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component5() {
                return this.index;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component6() {
                return this.selectedIndex;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component7() {
                return this.suggestedWords;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component8() {
                return this.textColor;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component9() {
                return this.background;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WordState copy(int i, @NotNull String str, int i2, String str2, int i3, int i4, @NotNull List<String> list, @ColorRes int i5, @DrawableRes int i6) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new WordState(i, str, i2, str2, i3, i4, list, i5, i6);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WordState)) {
                    return false;
                }
                WordState wordState = (WordState) obj;
                return this.id == wordState.id && Intrinsics.EZpvd((Object) this.text, (Object) wordState.text) && this.selection == wordState.selection && Intrinsics.EZpvd((Object) this.lastSuggestedWord, (Object) wordState.lastSuggestedWord) && this.index == wordState.index && this.selectedIndex == wordState.selectedIndex && Intrinsics.EZpvd(this.suggestedWords, wordState.suggestedWords) && this.textColor == wordState.textColor && this.background == wordState.background;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getBackground() {
                return this.background;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getIndex() {
                return this.index;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getLastSuggestedWord() {
                return this.lastSuggestedWord;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getSelectedIndex() {
                return this.selectedIndex;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getSelection() {
                return this.selection;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getSuggestedWords() {
                return this.suggestedWords;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getText() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getTextColor() {
                return this.textColor;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = Integer.hashCode(this.id);
                int iHashCode2 = this.text.hashCode();
                int iHashCode3 = Integer.hashCode(this.selection);
                String str = this.lastSuggestedWord;
                return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.selectedIndex)) * 31) + this.suggestedWords.hashCode()) * 31) + Integer.hashCode(this.textColor)) * 31) + Integer.hashCode(this.background);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WordState(id=" + this.id + ", text=" + this.text + ", selection=" + this.selection + ", lastSuggestedWord=" + this.lastSuggestedWord + ", index=" + this.index + ", selectedIndex=" + this.selectedIndex + ", suggestedWords=" + this.suggestedWords + ", textColor=" + this.textColor + ", background=" + this.background + ")";
            }

            public WordState(int i, @NotNull String str, int i2, String str2, int i3, int i4, @NotNull List<String> list, @ColorRes int i5, @DrawableRes int i6) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.id = i;
                this.text = str;
                this.selection = i2;
                this.lastSuggestedWord = str2;
                this.index = i3;
                this.selectedIndex = i4;
                this.suggestedWords = list;
                this.textColor = i5;
                this.background = i6;
            }
        }
    }
}
