package com.okinc.im.utils;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class UiText implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.utils.UiText.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UiText(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiText() {
    }

    public static final class DynamicString extends UiText implements Parcelable {
        public static final Parcelable.Creator<DynamicString> CREATOR = new Creator();
        public final String OLrzqt;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<DynamicString> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DynamicString createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DynamicString(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DynamicString[] newArray(int i) {
                return new DynamicString[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DynamicString() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DynamicString copy$default(DynamicString dynamicString, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dynamicString.OLrzqt;
            }
            return dynamicString.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DynamicString AEQbTJ(String str) {
            return new DynamicString(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
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
            return (obj instanceof DynamicString) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((DynamicString) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.OLrzqt;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DynamicString(value=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:11) call: com.okinc.im.utils.UiText.DynamicString.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ DynamicString(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public DynamicString(String str) {
            super(null);
            this.OLrzqt = str;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StringResource extends UiText implements Parcelable {
        public static final Parcelable.Creator<StringResource> CREATOR = new Creator();
        public final Map<String, String> AEQbTJ;
        public final int KWHzl;

        public static final class Creator implements Parcelable.Creator<StringResource> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringResource createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i2 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new StringResource(i, linkedHashMap);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringResource[] newArray(int i) {
                return new StringResource[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.utils.UiText$StringResource */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringResource copy$default(StringResource stringResource, int i, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stringResource.KWHzl;
            }
            if ((i2 & 2) != 0) {
                map = stringResource.AEQbTJ;
            }
            return stringResource.EZpvd(i, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StringResource EZpvd(@StringRes int i, Map<String, String> map) {
            return new StringResource(i, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
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
            if (!(obj instanceof StringResource)) {
                return false;
            }
            StringResource stringResource = (StringResource) obj;
            return this.KWHzl == stringResource.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, stringResource.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.KWHzl);
            Map<String, String> map = this.AEQbTJ;
            return (iHashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StringResource(resId=" + this.KWHzl + ", args=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.KWHzl);
            Map<String, String> map = this.AEQbTJ;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r2v0 java.util.Map))
 A[MD:(int, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:16) call: com.okinc.im.utils.UiText.StringResource.<init>(int, java.util.Map):void type: THIS */
        public /* synthetic */ StringResource(int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : map);
        }

        public StringResource(@StringRes int i, Map<String, String> map) {
            super(null);
            this.KWHzl = i;
            this.AEQbTJ = map;
        }
    }

    public final String EZpvd() {
        if (this instanceof DynamicString) {
            String strOLrzqt = ((DynamicString) this).OLrzqt();
            if (strOLrzqt != null) {
                return strOLrzqt;
            }
        } else {
            if (!(this instanceof StringResource)) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource stringResource = (StringResource) this;
            if (stringResource.OLrzqt() != 0) {
                Map<String, String> mapKWHzl = stringResource.KWHzl();
                if (mapKWHzl == null || mapKWHzl.isEmpty()) {
                    return C33070mpX.AYXKKw(stringResource.OLrzqt());
                }
                return C33069mpW.copydefault(stringResource.OLrzqt(), stringResource.KWHzl());
            }
        }
        return "";
    }
}
