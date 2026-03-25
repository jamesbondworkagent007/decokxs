package com.okinc.okex.lite.onboarding.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class QuestionnaireResponses implements Parcelable {
    private List<String> chosenAnswers;
    private String question;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuestionnaireResponses> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<QuestionnaireResponses> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireResponses createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QuestionnaireResponses(parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireResponses[] newArray(int i) {
            return new QuestionnaireResponses[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.onboarding.bean.QuestionnaireResponses */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionnaireResponses copy$default(QuestionnaireResponses questionnaireResponses, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = questionnaireResponses.chosenAnswers;
        }
        if ((i & 2) != 0) {
            str = questionnaireResponses.question;
        }
        return questionnaireResponses.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.chosenAnswers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.question;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuestionnaireResponses copy(@NotNull List<String> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new QuestionnaireResponses(list, str);
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
        if (!(obj instanceof QuestionnaireResponses)) {
            return false;
        }
        QuestionnaireResponses questionnaireResponses = (QuestionnaireResponses) obj;
        return Intrinsics.EZpvd(this.chosenAnswers, questionnaireResponses.chosenAnswers) && Intrinsics.EZpvd((Object) this.question, (Object) questionnaireResponses.question);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getChosenAnswers() {
        return this.chosenAnswers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chosenAnswers.hashCode() * 31) + this.question.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChosenAnswers(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chosenAnswers = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuestion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.question = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuestionnaireResponses(chosenAnswers=" + this.chosenAnswers + ", question=" + this.question + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.chosenAnswers);
        parcel.writeString(this.question);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.onboarding.bean.QuestionnaireResponses.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuestionnaireResponses> serializer() {
            return QuestionnaireResponses$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuestionnaireResponses(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, QuestionnaireResponses$$serializer.INSTANCE.getDescriptor());
        }
        this.chosenAnswers = list;
        this.question = str;
    }

    public static final /* synthetic */ void write$Self$OKOnboarding_onboarding_impl(QuestionnaireResponses questionnaireResponses, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], questionnaireResponses.chosenAnswers);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, questionnaireResponses.question);
    }

    public QuestionnaireResponses(@NotNull List<String> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.chosenAnswers = list;
        this.question = str;
    }
}
