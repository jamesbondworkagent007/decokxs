package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestOrderTypeFilter extends InvestBaseFilterItem implements Parcelable {
    public static final int $stable = 0;
    private final String filterId;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestOrderTypeFilter> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestOrderTypeFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestOrderTypeFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestOrderTypeFilter(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestOrderTypeFilter[] newArray(int i) {
            return new InvestOrderTypeFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestOrderTypeFilter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestOrderTypeFilter copy$default(InvestOrderTypeFilter investOrderTypeFilter, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investOrderTypeFilter.filterId;
        }
        if ((i & 2) != 0) {
            str2 = investOrderTypeFilter.title;
        }
        return investOrderTypeFilter.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.filterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestOrderTypeFilter copy(String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new InvestOrderTypeFilter(str, str2);
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
        if (!(obj instanceof InvestOrderTypeFilter)) {
            return false;
        }
        InvestOrderTypeFilter investOrderTypeFilter = (InvestOrderTypeFilter) obj;
        return Intrinsics.EZpvd((Object) this.filterId, (Object) investOrderTypeFilter.filterId) && Intrinsics.EZpvd((Object) this.title, (Object) investOrderTypeFilter.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilterId() {
        return this.filterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem
    public String getIcon() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem
    public String getName() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.filterId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestOrderTypeFilter(filterId=" + this.filterId + ", title=" + this.title + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.filterId);
        parcel.writeString(this.title);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrderTypeFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestOrderTypeFilter> serializer() {
            return InvestOrderTypeFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestOrderTypeFilter(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, z, serializationConstructorMarker);
        if ((i & 2) == 0) {
            this.filterId = null;
        } else {
            this.filterId = str;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestOrderTypeFilter investOrderTypeFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        InvestBaseFilterItem.write$Self(investOrderTypeFilter, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investOrderTypeFilter.filterId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investOrderTypeFilter.filterId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) investOrderTypeFilter.title, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, investOrderTypeFilter.title);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:55) call: com.okinc.business.invest_biz.data.bean.InvestOrderTypeFilter.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestOrderTypeFilter(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestOrderTypeFilter(String str, @NotNull String str2) {
        super(false, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str2, "");
        this.filterId = str;
        this.title = str2;
    }
}
