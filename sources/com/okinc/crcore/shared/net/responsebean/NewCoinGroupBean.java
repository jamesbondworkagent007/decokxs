package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.NewCoinGroupResponseBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class NewCoinGroupBean implements Parcelable {
    private final String displayName;
    private final String id;
    private final String key;
    private final String name;
    private final ArrayList<String> types;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NewCoinGroupBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NewCoinGroupBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewCoinGroupBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NewCoinGroupBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NewCoinGroupBean[] newArray(int i) {
            return new NewCoinGroupBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCoinGroupBean() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.crcore.shared.net.responsebean.NewCoinGroupBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewCoinGroupBean copy$default(NewCoinGroupBean newCoinGroupBean, String str, String str2, String str3, String str4, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newCoinGroupBean.id;
        }
        if ((i & 2) != 0) {
            str2 = newCoinGroupBean.key;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = newCoinGroupBean.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = newCoinGroupBean.displayName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            arrayList = newCoinGroupBean.types;
        }
        return newCoinGroupBean.copy(str, str5, str6, str7, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component5() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinGroupBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new NewCoinGroupBean(str, str2, str3, str4, arrayList);
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
        if (!(obj instanceof NewCoinGroupBean)) {
            return false;
        }
        NewCoinGroupBean newCoinGroupBean = (NewCoinGroupBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) newCoinGroupBean.id) && Intrinsics.EZpvd((Object) this.key, (Object) newCoinGroupBean.key) && Intrinsics.EZpvd((Object) this.name, (Object) newCoinGroupBean.name) && Intrinsics.EZpvd((Object) this.displayName, (Object) newCoinGroupBean.displayName) && Intrinsics.EZpvd(this.types, newCoinGroupBean.types);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getTypes() {
        return this.types;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.key.hashCode()) * 31) + this.name.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.types.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCoinGroupBean(id=" + this.id + ", key=" + this.key + ", name=" + this.name + ", displayName=" + this.displayName + ", types=" + this.types + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.key);
        parcel.writeString(this.name);
        parcel.writeString(this.displayName);
        parcel.writeStringList(this.types);
    }

    public NewCoinGroupBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.id = str;
        this.key = str2;
        this.name = str3;
        this.displayName = str4;
        this.types = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0023: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:100) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<java.lang.String>):void (m)] (LINE:95) call: com.okinc.crcore.shared.net.responsebean.NewCoinGroupBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ NewCoinGroupBean(String str, String str2, String str3, String str4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? new ArrayList() : arrayList);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.NewCoinGroupBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final List<NewCoinGroupBean> OLrzqt(@NotNull List<NewCoinGroupResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (NewCoinGroupResponseBean newCoinGroupResponseBean : list) {
                arrayList.add(new NewCoinGroupBean(newCoinGroupResponseBean.getId(), newCoinGroupResponseBean.getKey(), newCoinGroupResponseBean.getName(), newCoinGroupResponseBean.getDisplayName(), newCoinGroupResponseBean.getTypes()));
            }
            return arrayList;
        }
    }
}
