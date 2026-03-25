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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestBaseFilter extends InvestBaseFilterItem implements Parcelable {
    private Long chainId;
    private String filterId;
    private String logo;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestBaseFilter> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestBaseFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestBaseFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new InvestBaseFilter();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestBaseFilter[] newArray(int i) {
            return new InvestBaseFilter[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilterId() {
        return this.filterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem
    public String getIcon() {
        String str = this.logo;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.invest_biz.ui.widget.filter.InvestBaseFilterItem
    public String getName() {
        String str = this.title;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterId(String str) {
        this.filterId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(String str) {
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestBaseFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestBaseFilter> serializer() {
            return InvestBaseFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestBaseFilter(int i, boolean z, String str, String str2, String str3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, z, serializationConstructorMarker);
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.filterId = null;
        } else {
            this.filterId = str2;
        }
        if ((i & 8) == 0) {
            this.logo = null;
        } else {
            this.logo = str3;
        }
        if ((i & 16) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestBaseFilter investBaseFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        InvestBaseFilterItem.write$Self(investBaseFilter, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investBaseFilter.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investBaseFilter.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investBaseFilter.filterId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investBaseFilter.filterId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investBaseFilter.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investBaseFilter.logo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && investBaseFilter.chainId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, investBaseFilter.chainId);
    }

    public InvestBaseFilter() {
        super(false, 1, (DefaultConstructorMarker) null);
    }
}
