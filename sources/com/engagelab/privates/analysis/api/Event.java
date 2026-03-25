package com.engagelab.privates.analysis.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.d;
import com.engagelab.privates.common.l;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new a();
    private static final String TAG = "Event";
    public HashMap extraAttrMap;
    private String name;

    public static final class a implements Parcelable.Creator<Event> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Event[] newArray(int i) {
            return new Event[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Event(String str) {
        this.extraAttrMap = new HashMap();
        this.name = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Object> getExtraAttrMap() {
        return this.extraAttrMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.engagelab.privates.analysis.api.Event */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends Event> T putExtraAttr(String str, Object obj) {
        try {
            if (!l.a(str, obj)) {
                return this;
            }
            HashMap map = this.extraAttrMap;
            if (map == null) {
                MTCommonLog.d(TAG, "can't put [" + str + "], event extraAttrMap is null");
                return this;
            }
            if (map.size() >= 50) {
                MTCommonLog.d(TAG, "can't put [" + str + "], event extraAttrMap size can't be no more than 50");
            }
            if (!str.equals("stacktrace")) {
                obj = l.a(obj);
            }
            if (!l.b(obj)) {
                return this;
            }
            if (d.c().a().containsKey(str)) {
                MTCommonLog.w(TAG, "the key [" + str + "] is in commonProperty, please check it");
                return this;
            }
            if (d.c().b().containsKey(str)) {
                MTCommonLog.w(TAG, "the key [" + str + "] is in dynamicProperty, please check it");
                return this;
            }
            this.extraAttrMap.put(str, obj);
            MTCommonLog.d(TAG, this.name + " put key:" + str + ",value:" + obj);
            return this;
        } catch (Exception e) {
            MTCommonLog.w(TAG, "putExtraAttr e:" + e.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "\n{\n  name='" + this.name + ",\n  extraAttrMap=" + this.extraAttrMap + "\n}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeMap(this.extraAttrMap);
    }

    public Event(Parcel parcel) {
        this.extraAttrMap = new HashMap();
        this.name = parcel.readString();
        this.extraAttrMap = parcel.readHashMap(HashMap.class.getClassLoader());
    }
}
