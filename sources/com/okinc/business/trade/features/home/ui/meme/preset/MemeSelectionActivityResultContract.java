package com.okinc.business.trade.features.home.ui.meme.preset;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.IntentCompat;
import com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC31001lll;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeSelectionActivityResultContract extends ActivityResultContract<Input, Output> {

    public static final class Input implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Input> CREATOR = new Creator();
        private final int fromTransactionType;
        private final MemeQuoteAdapter memeQuoteAdapter;
        private final String memeTransactionSceneType;
        private final String presetType;

        public static final class Creator implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Input(MemeQuoteAdapter.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i) {
                return new Input[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Input copy$default(Input input, MemeQuoteAdapter memeQuoteAdapter, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                memeQuoteAdapter = input.memeQuoteAdapter;
            }
            if ((i2 & 2) != 0) {
                str = input.memeTransactionSceneType;
            }
            if ((i2 & 4) != 0) {
                str2 = input.presetType;
            }
            if ((i2 & 8) != 0) {
                i = input.fromTransactionType;
            }
            return input.copy(memeQuoteAdapter, str, str2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemeQuoteAdapter component1() {
            return this.memeQuoteAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.memeTransactionSceneType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.presetType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.fromTransactionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Input copy(@NotNull MemeQuoteAdapter memeQuoteAdapter, @NotNull String str, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(memeQuoteAdapter, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Input(memeQuoteAdapter, str, str2, i);
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
            if (!(obj instanceof Input)) {
                return false;
            }
            Input input = (Input) obj;
            return Intrinsics.EZpvd(this.memeQuoteAdapter, input.memeQuoteAdapter) && Intrinsics.EZpvd((Object) this.memeTransactionSceneType, (Object) input.memeTransactionSceneType) && Intrinsics.EZpvd((Object) this.presetType, (Object) input.presetType) && this.fromTransactionType == input.fromTransactionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getFromTransactionType() {
            return this.fromTransactionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemeQuoteAdapter getMemeQuoteAdapter() {
            return this.memeQuoteAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMemeTransactionSceneType() {
            return this.memeTransactionSceneType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPresetType() {
            return this.presetType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.memeQuoteAdapter.hashCode() * 31) + this.memeTransactionSceneType.hashCode()) * 31) + this.presetType.hashCode()) * 31) + Integer.hashCode(this.fromTransactionType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Input(memeQuoteAdapter=" + this.memeQuoteAdapter + ", memeTransactionSceneType=" + this.memeTransactionSceneType + ", presetType=" + this.presetType + ", fromTransactionType=" + this.fromTransactionType + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.memeQuoteAdapter.writeToParcel(parcel, i);
            parcel.writeString(this.memeTransactionSceneType);
            parcel.writeString(this.presetType);
            parcel.writeInt(this.fromTransactionType);
        }

        public Input(@NotNull MemeQuoteAdapter memeQuoteAdapter, @NotNull String str, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(memeQuoteAdapter, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.memeQuoteAdapter = memeQuoteAdapter;
            this.memeTransactionSceneType = str;
            this.presetType = str2;
            this.fromTransactionType = i;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 int)
 A[MD:(com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter, java.lang.String, java.lang.String, int):void (m)] (LINE:25) call: com.okinc.business.trade.features.home.ui.meme.preset.MemeSelectionActivityResultContract.Input.<init>(com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter, java.lang.String, java.lang.String, int):void type: THIS */
        public /* synthetic */ Input(MemeQuoteAdapter memeQuoteAdapter, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(memeQuoteAdapter, str, (i2 & 4) != 0 ? "" : str2, i);
        }
    }

    public static final class Output implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Output> CREATOR = new Creator();
        private final String presetType;

        public static final class Creator implements Parcelable.Creator<Output> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Output createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Output(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Output[] newArray(int i) {
                return new Output[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPresetType() {
            return this.presetType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.presetType);
        }

        public Output(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.presetType = str;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(@NotNull Context context, @NotNull Input input) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(input, "");
        Intent intent = new Intent(context, (Class<?>) ActivityC31001lll.class);
        intent.putExtra("data", input);
        return intent;
    }

    /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
    @Override // androidx.activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Output parseResult(int i, Intent intent) {
        if (i != -1 || intent == null) {
            return null;
        }
        return (Output) ((Parcelable) IntentCompat.getParcelableExtra(intent, "result", Output.class));
    }
}
