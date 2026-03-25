package com.okinc.business.defi.wallet.mine.search.data.model;

import com.google.errorprone.annotations.Keep;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Serializable
public final class SearchHistoryContainer {
    public final List<WalletSearchHistory> histories;
    public final int version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(WalletSearchHistory$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchHistoryContainer() {
        this(0, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryContainer */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchHistoryContainer copy$default(SearchHistoryContainer searchHistoryContainer, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = searchHistoryContainer.version;
        }
        if ((i2 & 2) != 0) {
            list = searchHistoryContainer.histories;
        }
        return searchHistoryContainer.KWHzl(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WalletSearchHistory> AEQbTJ() {
        return this.histories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchHistoryContainer KWHzl(int i, @NotNull List<WalletSearchHistory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SearchHistoryContainer(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHistoryContainer)) {
            return false;
        }
        SearchHistoryContainer searchHistoryContainer = (SearchHistoryContainer) obj;
        return this.version == searchHistoryContainer.version && Intrinsics.EZpvd(this.histories, searchHistoryContainer.histories);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + this.histories.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchHistoryContainer(version=" + this.version + ", histories=" + this.histories + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryContainer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchHistoryContainer> serializer() {
            return SearchHistoryContainer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchHistoryContainer(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.histories = yDY.AhwBna();
        } else {
            this.histories = list;
        }
    }

    public static final /* synthetic */ void AEQbTJ(SearchHistoryContainer searchHistoryContainer, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchHistoryContainer.version != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, searchHistoryContainer.version);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(searchHistoryContainer.histories, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], searchHistoryContainer.histories);
    }

    public SearchHistoryContainer(int i, @NotNull List<WalletSearchHistory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.version = i;
        this.histories = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r2v0 java.util.List))
 A[MD:(int, java.util.List<com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchHistory>):void (m)] (LINE:23) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryContainer.<init>(int, java.util.List):void type: THIS */
    public /* synthetic */ SearchHistoryContainer(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? yDY.AhwBna() : list);
    }
}
