package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.CategoryTopGainersResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CategoryTopGainersBean implements Parcelable {
    private final String code;
    private final String name;
    private final List<TopInstIdsBean> topInstIds;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CategoryTopGainersBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CategoryTopGainersBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryTopGainersBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TopInstIdsBean.CREATOR.createFromParcel(parcel));
            }
            return new CategoryTopGainersBean(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryTopGainersBean[] newArray(int i) {
            return new CategoryTopGainersBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CategoryTopGainersBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.CategoryTopGainersBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryTopGainersBean copy$default(CategoryTopGainersBean categoryTopGainersBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryTopGainersBean.code;
        }
        if ((i & 2) != 0) {
            str2 = categoryTopGainersBean.name;
        }
        if ((i & 4) != 0) {
            list = categoryTopGainersBean.topInstIds;
        }
        return categoryTopGainersBean.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopInstIdsBean> component3() {
        return this.topInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryTopGainersBean copy(@NotNull String str, @NotNull String str2, @NotNull List<TopInstIdsBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new CategoryTopGainersBean(str, str2, list);
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
        if (!(obj instanceof CategoryTopGainersBean)) {
            return false;
        }
        CategoryTopGainersBean categoryTopGainersBean = (CategoryTopGainersBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) categoryTopGainersBean.code) && Intrinsics.EZpvd((Object) this.name, (Object) categoryTopGainersBean.name) && Intrinsics.EZpvd(this.topInstIds, categoryTopGainersBean.topInstIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopInstIdsBean> getTopInstIds() {
        return this.topInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.topInstIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CategoryTopGainersBean(code=" + this.code + ", name=" + this.name + ", topInstIds=" + this.topInstIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.name);
        List<TopInstIdsBean> list = this.topInstIds;
        parcel.writeInt(list.size());
        Iterator<TopInstIdsBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public CategoryTopGainersBean(@NotNull String str, @NotNull String str2, @NotNull List<TopInstIdsBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.code = str;
        this.name = str2;
        this.topInstIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.TopInstIdsBean>):void (m)] (LINE:10) call: com.okinc.crcore.shared.net.responsebean.CategoryTopGainersBean.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CategoryTopGainersBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.CategoryTopGainersBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final CategoryTopGainersBean AEQbTJ(@NotNull CategoryTopGainersResponseBean categoryTopGainersResponseBean) {
            Intrinsics.checkNotNullParameter(categoryTopGainersResponseBean, "");
            return new CategoryTopGainersBean(categoryTopGainersResponseBean.getCode(), categoryTopGainersResponseBean.getName(), TopInstIdsBean.Companion.copydefault(categoryTopGainersResponseBean.getTopInstIds()));
        }
    }
}
