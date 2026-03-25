package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class QuestionnaireResponse implements Serializable, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuestionnaireResponse> CREATOR = new Creator();
    private final Map<String, String> params;
    private final String playbook;

    public static final class Creator implements Parcelable.Creator<QuestionnaireResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new QuestionnaireResponse(linkedHashMap, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireResponse[] newArray(int i) {
            return new QuestionnaireResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuestionnaireResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.QuestionnaireResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionnaireResponse copy$default(QuestionnaireResponse questionnaireResponse, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = questionnaireResponse.params;
        }
        if ((i & 2) != 0) {
            str = questionnaireResponse.playbook;
        }
        return questionnaireResponse.copy(map, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuestionnaireResponse copy(@NotNull Map<String, String> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        return new QuestionnaireResponse(map, str);
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
        if (!(obj instanceof QuestionnaireResponse)) {
            return false;
        }
        QuestionnaireResponse questionnaireResponse = (QuestionnaireResponse) obj;
        return Intrinsics.EZpvd(this.params, questionnaireResponse.params) && Intrinsics.EZpvd((Object) this.playbook, (Object) questionnaireResponse.playbook);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.params.hashCode();
        String str = this.playbook;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuestionnaireResponse(params=" + this.params + ", playbook=" + this.playbook + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Map<String, String> map = this.params;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.playbook);
    }

    public QuestionnaireResponse(@NotNull Map<String, String> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        this.params = map;
        this.playbook = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:155)) : (r1v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, java.lang.String):void (m)] (LINE:154) call: com.okinc.assets.backend.api.model.QuestionnaireResponse.<init>(java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ QuestionnaireResponse(Map map, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map, (i & 2) != 0 ? null : str);
    }
}
