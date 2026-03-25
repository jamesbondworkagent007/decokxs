package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class FaqSwapBean implements Parcelable {
    private final String mainTitle;
    private final List<SimpleFaqArticle> simpleFaqArticles;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FaqSwapBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SimpleFaqArticle$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<FaqSwapBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaqSwapBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(SimpleFaqArticle.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FaqSwapBean(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FaqSwapBean[] newArray(int i) {
            return new FaqSwapBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FaqSwapBean() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.FaqSwapBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaqSwapBean copy$default(FaqSwapBean faqSwapBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faqSwapBean.mainTitle;
        }
        if ((i & 2) != 0) {
            list = faqSwapBean.simpleFaqArticles;
        }
        return faqSwapBean.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mainTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimpleFaqArticle> component2() {
        return this.simpleFaqArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaqSwapBean copy(@NotNull String str, List<SimpleFaqArticle> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FaqSwapBean(str, list);
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
        if (!(obj instanceof FaqSwapBean)) {
            return false;
        }
        FaqSwapBean faqSwapBean = (FaqSwapBean) obj;
        return Intrinsics.EZpvd((Object) this.mainTitle, (Object) faqSwapBean.mainTitle) && Intrinsics.EZpvd(this.simpleFaqArticles, faqSwapBean.simpleFaqArticles);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainTitle() {
        return this.mainTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SimpleFaqArticle> getSimpleFaqArticles() {
        return this.simpleFaqArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.mainTitle.hashCode();
        List<SimpleFaqArticle> list = this.simpleFaqArticles;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaqSwapBean(mainTitle=" + this.mainTitle + ", simpleFaqArticles=" + this.simpleFaqArticles + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mainTitle);
        List<SimpleFaqArticle> list = this.simpleFaqArticles;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<SimpleFaqArticle> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.FaqSwapBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FaqSwapBean> serializer() {
            return FaqSwapBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FaqSwapBean(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.mainTitle = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.simpleFaqArticles = null;
        } else {
            this.simpleFaqArticles = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(FaqSwapBean faqSwapBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) faqSwapBean.mainTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, faqSwapBean.mainTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && faqSwapBean.simpleFaqArticles == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], faqSwapBean.simpleFaqArticles);
    }

    public FaqSwapBean(@NotNull String str, List<SimpleFaqArticle> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainTitle = str;
        this.simpleFaqArticles = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.SimpleFaqArticle>):void (m)] (LINE:17) call: com.okinc.business.dexlogic.bean.FaqSwapBean.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ FaqSwapBean(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
