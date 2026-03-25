package com.okinc.assets.api.model.satoshitest;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SatoshiTestPageArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SatoshiTestPageArgs> CREATOR = new Creator();
    private Map<String, String> ctaValue;
    private String id;
    private String playbook;
    private HashMap<String, String> playbookParams;
    private String target;
    private final long travelRuleId;

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Creator implements Parcelable.Creator<SatoshiTestPageArgs> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SatoshiTestPageArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            int i = parcel.readInt();
            HashMap map = new HashMap(i);
            int i2 = 0;
            for (int i3 = 0; i3 != i; i3++) {
                map.put(parcel.readString(), parcel.readString());
            }
            String string2 = parcel.readString();
            int i4 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
            while (true) {
                String string3 = parcel.readString();
                if (i2 == i4) {
                    return new SatoshiTestPageArgs(j, string, map, string2, linkedHashMap, string3);
                }
                linkedHashMap.put(string3, parcel.readString());
                i2++;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SatoshiTestPageArgs[] newArray(int i) {
            return new SatoshiTestPageArgs[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component3() {
        return this.playbookParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component5() {
        return this.ctaValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SatoshiTestPageArgs copy(long j, @NotNull String str, @NotNull HashMap<String, String> map, @NotNull String str2, @NotNull Map<String, String> map2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SatoshiTestPageArgs(j, str, map, str2, map2, str3);
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
        if (!(obj instanceof SatoshiTestPageArgs)) {
            return false;
        }
        SatoshiTestPageArgs satoshiTestPageArgs = (SatoshiTestPageArgs) obj;
        return this.travelRuleId == satoshiTestPageArgs.travelRuleId && Intrinsics.EZpvd((Object) this.playbook, (Object) satoshiTestPageArgs.playbook) && Intrinsics.EZpvd(this.playbookParams, satoshiTestPageArgs.playbookParams) && Intrinsics.EZpvd((Object) this.target, (Object) satoshiTestPageArgs.target) && Intrinsics.EZpvd(this.ctaValue, satoshiTestPageArgs.ctaValue) && Intrinsics.EZpvd((Object) this.id, (Object) satoshiTestPageArgs.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getCtaValue() {
        return this.ctaValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getPlaybookParams() {
        return this.playbookParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.travelRuleId) * 31) + this.playbook.hashCode()) * 31) + this.playbookParams.hashCode()) * 31) + this.target.hashCode()) * 31) + this.ctaValue.hashCode()) * 31) + this.id.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCtaValue(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.ctaValue = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybook(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.playbook = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybookParams(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.playbookParams = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTarget(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.target = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SatoshiTestPageArgs(travelRuleId=" + this.travelRuleId + ", playbook=" + this.playbook + ", playbookParams=" + this.playbookParams + ", target=" + this.target + ", ctaValue=" + this.ctaValue + ", id=" + this.id + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.travelRuleId);
        parcel.writeString(this.playbook);
        HashMap<String, String> map = this.playbookParams;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.target);
        Map<String, String> map2 = this.ctaValue;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
        parcel.writeString(this.id);
    }

    public SatoshiTestPageArgs(long j, @NotNull String str, @NotNull HashMap<String, String> map, @NotNull String str2, @NotNull Map<String, String> map2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.travelRuleId = j;
        this.playbook = str;
        this.playbookParams = map;
        this.target = str2;
        this.ctaValue = map2;
        this.id = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r10v0 long)
  (r12v0 java.lang.String)
  (r13v0 java.util.HashMap)
  (r14v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0009: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:15) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r15v0 java.util.Map))
  (r16v0 java.lang.String)
 A[MD:(long, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.String, java.util.Map<java.lang.String, java.lang.String>, java.lang.String):void (m)] (LINE:10) call: com.okinc.assets.api.model.satoshitest.SatoshiTestPageArgs.<init>(long, java.lang.String, java.util.HashMap, java.lang.String, java.util.Map, java.lang.String):void type: THIS */
    public /* synthetic */ SatoshiTestPageArgs(long j, String str, HashMap map, String str2, Map map2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, map, str2, (i & 16) != 0 ? new LinkedHashMap() : map2, str3);
    }
}
