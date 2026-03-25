package com.okinc.business.market.features.meme.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter$$serializer;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class MemeSavedTabFilter implements Parcelable {
    private final String chainId;
    private final MemeFilter local;
    private final List<String> protocols;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MemeSavedTabFilter> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<MemeSavedTabFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSavedTabFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeSavedTabFilter(parcel.readString(), parcel.createStringArrayList(), MemeFilter.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSavedTabFilter[] newArray(int i) {
            return new MemeSavedTabFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeSavedTabFilter() {
        this((String) null, (List) null, (MemeFilter) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.ui.MemeSavedTabFilter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemeSavedTabFilter copy$default(MemeSavedTabFilter memeSavedTabFilter, String str, List list, MemeFilter memeFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memeSavedTabFilter.chainId;
        }
        if ((i & 2) != 0) {
            list = memeSavedTabFilter.protocols;
        }
        if ((i & 4) != 0) {
            memeFilter = memeSavedTabFilter.local;
        }
        return memeSavedTabFilter.copy(str, list, memeFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.protocols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeFilter component3() {
        return this.local;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSavedTabFilter copy(@NotNull String str, @NotNull List<String> list, @NotNull MemeFilter memeFilter) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(memeFilter, "");
        return new MemeSavedTabFilter(str, list, memeFilter);
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
        if (!(obj instanceof MemeSavedTabFilter)) {
            return false;
        }
        MemeSavedTabFilter memeSavedTabFilter = (MemeSavedTabFilter) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) memeSavedTabFilter.chainId) && Intrinsics.EZpvd(this.protocols, memeSavedTabFilter.protocols) && Intrinsics.EZpvd(this.local, memeSavedTabFilter.local);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeFilter getLocal() {
        return this.local;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getProtocols() {
        return this.protocols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.chainId.hashCode() * 31) + this.protocols.hashCode()) * 31) + this.local.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeSavedTabFilter(chainId=" + this.chainId + ", protocols=" + this.protocols + ", local=" + this.local + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeStringList(this.protocols);
        this.local.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.ui.MemeSavedTabFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeSavedTabFilter> serializer() {
            return MemeSavedTabFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeSavedTabFilter(int i, String str, List list, MemeFilter memeFilter, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? "" : str;
        this.protocols = (i & 2) == 0 ? yDY.AhwBna() : list;
        this.local = (i & 4) == 0 ? new MemeFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, -1, 31, (DefaultConstructorMarker) null) : memeFilter;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeSavedTabFilter memeSavedTabFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) memeSavedTabFilter.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, memeSavedTabFilter.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(memeSavedTabFilter.protocols, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], memeSavedTabFilter.protocols);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(memeSavedTabFilter.local, new MemeFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, -1, 31, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, MemeFilter$$serializer.INSTANCE, memeSavedTabFilter.local);
    }

    public MemeSavedTabFilter(@NotNull String str, @NotNull List<String> list, @NotNull MemeFilter memeFilter) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(memeFilter, "");
        this.chainId = str;
        this.protocols = list;
        this.local = memeFilter;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MemeSavedTabFilter(java.lang.String r45, java.util.List r46, com.okinc.business.market.features.meme.filter.domain.MemeFilter r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r44 = this;
            r0 = r48 & 1
            if (r0 == 0) goto L7
            java.lang.String r0 = ""
            goto L9
        L7:
            r0 = r45
        L9:
            r1 = r48 & 2
            if (r1 == 0) goto L12
            java.util.List r1 = kotlin.collections.CollectionsKt.EZpvd()
            goto L14
        L12:
            r1 = r46
        L14:
            r2 = r48 & 4
            if (r2 == 0) goto L65
            com.okinc.business.market.features.meme.filter.domain.MemeFilter r2 = new com.okinc.business.market.features.meme.filter.domain.MemeFilter
            r3 = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = -1
            r42 = 31
            r43 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r3 = r44
            goto L69
        L65:
            r3 = r44
            r2 = r47
        L69:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.market.features.meme.ui.MemeSavedTabFilter.<init>(java.lang.String, java.util.List, com.okinc.business.market.features.meme.filter.domain.MemeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
