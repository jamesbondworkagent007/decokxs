package com.okinc.web3.security.features.importing.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface WalletImportInput extends Parcelable {

    public static final class PrivateKey implements WalletImportInput {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PrivateKey> CREATOR = new Creator();
        private final int selection;
        private final String text;
        private final long version;

        public static final class Creator implements Parcelable.Creator<PrivateKey> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivateKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PrivateKey(parcel.readString(), parcel.readInt(), parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrivateKey[] newArray(int i) {
                return new PrivateKey[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PrivateKey copy$default(PrivateKey privateKey, String str, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = privateKey.text;
            }
            if ((i2 & 2) != 0) {
                i = privateKey.selection;
            }
            if ((i2 & 4) != 0) {
                j = privateKey.version;
            }
            return privateKey.copy(str, i, j);
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
        public final PrivateKey copy(@NotNull String str, int i, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return new PrivateKey(str, i, j);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrivateKey)) {
                return false;
            }
            PrivateKey privateKey = (PrivateKey) obj;
            return Intrinsics.EZpvd((Object) this.text, (Object) privateKey.text) && this.selection == privateKey.selection && this.version == privateKey.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSelection() {
            return this.selection;
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
            return (((this.text.hashCode() * 31) + Integer.hashCode(this.selection)) * 31) + Long.hashCode(this.version);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PrivateKey(text=" + this.text + ", selection=" + this.selection + ", version=" + this.version + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.text);
            parcel.writeInt(this.selection);
            parcel.writeLong(this.version);
        }

        public PrivateKey(@NotNull String str, int i, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
            this.selection = i;
            this.version = j;
        }
    }

    public static final class SeedPhrase implements WalletImportInput {
        public static final int MAX_COUNT = 24;
        public static final int MIN_COUNT = 12;
        private final boolean isSeedPhraseValid;
        private final int selectedIndex;
        private final long version;
        private final List<Word> words;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SeedPhrase> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SeedPhrase> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SeedPhrase createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Word.CREATOR.createFromParcel(parcel));
                }
                return new SeedPhrase(arrayList, parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SeedPhrase[] newArray(int i) {
                return new SeedPhrase[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.web3.security.features.importing.model.WalletImportInput$SeedPhrase */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SeedPhrase copy$default(SeedPhrase seedPhrase, List list, int i, boolean z, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = seedPhrase.words;
            }
            if ((i2 & 2) != 0) {
                i = seedPhrase.selectedIndex;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = seedPhrase.isSeedPhraseValid;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                j = seedPhrase.version;
            }
            return seedPhrase.copy(list, i3, z2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Word> component1() {
            return this.words;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.selectedIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.isSeedPhraseValid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component4() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SeedPhrase copy(@NotNull List<Word> list, int i, boolean z, long j) {
            Intrinsics.checkNotNullParameter(list, "");
            return new SeedPhrase(list, i, z, j);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SeedPhrase)) {
                return false;
            }
            SeedPhrase seedPhrase = (SeedPhrase) obj;
            return Intrinsics.EZpvd(this.words, seedPhrase.words) && this.selectedIndex == seedPhrase.selectedIndex && this.isSeedPhraseValid == seedPhrase.isSeedPhraseValid && this.version == seedPhrase.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSelectedIndex() {
            return this.selectedIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getVersion() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Word> getWords() {
            return this.words;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.words.hashCode() * 31) + Integer.hashCode(this.selectedIndex)) * 31) + Boolean.hashCode(this.isSeedPhraseValid)) * 31) + Long.hashCode(this.version);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isSeedPhraseValid() {
            return this.isSeedPhraseValid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SeedPhrase(words=" + this.words + ", selectedIndex=" + this.selectedIndex + ", isSeedPhraseValid=" + this.isSeedPhraseValid + ", version=" + this.version + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<Word> list = this.words;
            parcel.writeInt(list.size());
            Iterator<Word> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeInt(this.selectedIndex);
            parcel.writeInt(this.isSeedPhraseValid ? 1 : 0);
            parcel.writeLong(this.version);
        }

        public SeedPhrase(@NotNull List<Word> list, int i, boolean z, long j) {
            Intrinsics.checkNotNullParameter(list, "");
            this.words = list;
            this.selectedIndex = i;
            this.isSeedPhraseValid = z;
            this.version = j;
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.model.WalletImportInput.SeedPhrase.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    public static final class Word implements Parcelable {
        public static final int $stable = 0;
        public static final int MAX_LENGTH = 10;
        private final int id;
        private final String lastSuggestedWord;
        private final int selection;
        private final String text;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Word> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Word> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Word createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Word(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Word[] newArray(int i) {
                return new Word[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Word copy$default(Word word, int i, String str, int i2, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = word.id;
            }
            if ((i3 & 2) != 0) {
                str = word.text;
            }
            if ((i3 & 4) != 0) {
                i2 = word.selection;
            }
            if ((i3 & 8) != 0) {
                str2 = word.lastSuggestedWord;
            }
            return word.copy(i, str, i2, str2);
        }

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
        public final Word copy(int i, @NotNull String str, int i2, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Word(i, str, i2, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Word)) {
                return false;
            }
            Word word = (Word) obj;
            return this.id == word.id && Intrinsics.EZpvd((Object) this.text, (Object) word.text) && this.selection == word.selection && Intrinsics.EZpvd((Object) this.lastSuggestedWord, (Object) word.lastSuggestedWord);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLastSuggestedWord() {
            return this.lastSuggestedWord;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getSelection() {
            return this.selection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.id);
            int iHashCode2 = this.text.hashCode();
            int iHashCode3 = Integer.hashCode(this.selection);
            String str = this.lastSuggestedWord;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Word(id=" + this.id + ", text=" + this.text + ", selection=" + this.selection + ", lastSuggestedWord=" + this.lastSuggestedWord + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.id);
            parcel.writeString(this.text);
            parcel.writeInt(this.selection);
            parcel.writeString(this.lastSuggestedWord);
        }

        public Word(int i, @NotNull String str, int i2, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.id = i;
            this.text = str;
            this.selection = i2;
            this.lastSuggestedWord = str2;
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.model.WalletImportInput.Word.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
