package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class EvmChainData implements Parcelable {
    private final List<ChainData> chainList;
    private final int iconResId;
    private final CharSequence name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EvmChainData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), null, new ArrayListSerializer(ChainData$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<EvmChainData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmChainData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(ChainData.CREATOR.createFromParcel(parcel));
            }
            return new EvmChainData(charSequence, i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EvmChainData[] newArray(int i) {
            return new EvmChainData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.EvmChainData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvmChainData copy$default(EvmChainData evmChainData, CharSequence charSequence, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = evmChainData.name;
        }
        if ((i2 & 2) != 0) {
            i = evmChainData.iconResId;
        }
        if ((i2 & 4) != 0) {
            list = evmChainData.chainList;
        }
        return evmChainData.copy(charSequence, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.iconResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainData> component3() {
        return this.chainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvmChainData copy(@NotNull CharSequence charSequence, int i, @NotNull List<ChainData> list) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EvmChainData(charSequence, i, list);
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
        if (!(obj instanceof EvmChainData)) {
            return false;
        }
        EvmChainData evmChainData = (EvmChainData) obj;
        return Intrinsics.EZpvd(this.name, evmChainData.name) && this.iconResId == evmChainData.iconResId && Intrinsics.EZpvd(this.chainList, evmChainData.chainList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainData> getChainList() {
        return this.chainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.iconResId)) * 31) + this.chainList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        CharSequence charSequence = this.name;
        return "EvmChainData(name=" + ((Object) charSequence) + ", iconResId=" + this.iconResId + ", chainList=" + this.chainList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        TextUtils.writeToParcel(this.name, parcel, i);
        parcel.writeInt(this.iconResId);
        List<ChainData> list = this.chainList;
        parcel.writeInt(list.size());
        Iterator<ChainData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.EvmChainData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EvmChainData> serializer() {
            return EvmChainData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvmChainData(int i, CharSequence charSequence, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EvmChainData$$serializer.INSTANCE.getDescriptor());
        }
        this.name = charSequence;
        this.iconResId = i2;
        this.chainList = list;
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(EvmChainData evmChainData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], evmChainData.name);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, evmChainData.iconResId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], evmChainData.chainList);
    }

    public EvmChainData(@NotNull CharSequence charSequence, int i, @NotNull List<ChainData> list) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.name = charSequence;
        this.iconResId = i;
        this.chainList = list;
    }
}
