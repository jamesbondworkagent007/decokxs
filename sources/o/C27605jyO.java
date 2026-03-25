package o;

import com.okinc.business.market.data.model.ChainIdFilterData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27605jyO implements KSerializer<ChainIdFilterData> {
    public static final C27605jyO OLrzqt = new C27605jyO();

    private C27605jyO() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return SerialDescriptorsKt.PrimitiveSerialDescriptor("ChainIdFilter", PrimitiveKind.STRING.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ChainIdFilterData deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) decoder.decodeString(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        for (java.lang.String str : listSplit$default) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-100")) {
                str = "all";
            }
            arrayList.add(str);
        }
        return new ChainIdFilterData(arrayList);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull ChainIdFilterData chainIdFilterData) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(chainIdFilterData, "");
        java.util.List<java.lang.String> listAEQbTJ = chainIdFilterData.AEQbTJ();
        if (!listAEQbTJ.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = listAEQbTJ.listIterator(listAEQbTJ.size());
            while (listIterator.hasPrevious()) {
                java.lang.String strPrevious = listIterator.previous();
                if (str.length() == 0) {
                    str = strPrevious;
                } else {
                    str = str + "," + strPrevious;
                }
            }
        }
        encoder.encodeString(str);
    }
}
