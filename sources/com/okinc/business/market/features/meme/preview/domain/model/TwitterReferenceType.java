package com.okinc.business.market.features.meme.preview.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class TwitterReferenceType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TwitterReferenceType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<TwitterReferenceType> CREATOR;
    public static final Companion Companion;

    @SerialName("quoted")
    public static final TwitterReferenceType QUOTED = new TwitterReferenceType("QUOTED", 0);

    @SerialName("replied_to")
    public static final TwitterReferenceType REPLIED_TO = new TwitterReferenceType("REPLIED_TO", 1);
    public static final TwitterReferenceType UNKNOWN = new TwitterReferenceType("UNKNOWN", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TwitterReferenceType[] $values() {
        return new TwitterReferenceType[]{QUOTED, REPLIED_TO, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TwitterReferenceType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) TwitterReferenceType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TwitterReferenceType> serializer() {
            return KWHzl();
        }
    }

    private TwitterReferenceType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType", values(), new String[]{"quoted", "replied_to", null}, new Annotation[][]{null, null, null}, null);
    }

    static {
        TwitterReferenceType[] twitterReferenceTypeArr$values = $values();
        $VALUES = twitterReferenceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(twitterReferenceTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<TwitterReferenceType>() { // from class: com.okinc.business.market.features.meme.preview.domain.model.TwitterReferenceType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TwitterReferenceType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TwitterReferenceType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TwitterReferenceType[] newArray(int i) {
                return new TwitterReferenceType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.kha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TwitterReferenceType._init_$_anonymous_();
            }
        });
    }

    public static TwitterReferenceType valueOf(String str) {
        return (TwitterReferenceType) Enum.valueOf(TwitterReferenceType.class, str);
    }

    public static TwitterReferenceType[] values() {
        return (TwitterReferenceType[]) $VALUES.clone();
    }
}
