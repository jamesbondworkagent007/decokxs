package com.okinc.unify_find.data;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RankTag {
    private String coinName;
    private String hotRank;
    private ArrayList<RankTagPlate> plate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(RankTagPlate$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHotRank() {
        return this.hotRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<RankTagPlate> getPlate() {
        return this.plate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHotRank(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hotRank = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlate(ArrayList<RankTagPlate> arrayList) {
        this.plate = arrayList;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.RankTag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RankTag> serializer() {
            return RankTag$$serializer.INSTANCE;
        }
    }

    public RankTag() {
        this.coinName = "";
        this.hotRank = "";
    }

    public /* synthetic */ RankTag(int i, String str, String str2, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinName = "";
        } else {
            this.coinName = str;
        }
        if ((i & 2) == 0) {
            this.hotRank = "";
        } else {
            this.hotRank = str2;
        }
        if ((i & 4) == 0) {
            this.plate = null;
        } else {
            this.plate = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(RankTag rankTag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rankTag.coinName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rankTag.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rankTag.hotRank, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rankTag.hotRank);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && rankTag.plate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], rankTag.plate);
    }
}
