package com.okinc.mln_ui.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class GlobalEventManager {
    public final Map<String, List<Object>> copydefault = new HashMap();

    private GlobalEventManager() {
    }

    public static class Event implements Parcelable {
        public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: com.okinc.mln_ui.ui.GlobalEventManager.Event.3
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Event createFromParcel(Parcel parcel) {
                return new Event(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Event[] newArray(int i) {
                return new Event[i];
            }
        };
        public String AEQbTJ;
        public Map<String, Object> EZpvd;
        public String OLrzqt;
        public String[] copydefault;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            try {
                return copydefault().toString();
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public final JSONObject copydefault() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MTAnalysisConstants.EVENT_NAME, this.OLrzqt);
            jSONObject.put("dst_l_evn", KWHzl());
            jSONObject.put("l_evn", this.AEQbTJ);
            jSONObject.put("event_msg", this.EZpvd);
            return jSONObject;
        }

        public Event(Parcel parcel) {
            this.OLrzqt = parcel.readString();
            parcel.readStringArray(this.copydefault);
            this.AEQbTJ = parcel.readString();
            parcel.readMap(this.EZpvd, Map.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.OLrzqt);
            parcel.writeStringArray(this.copydefault);
            parcel.writeString(this.AEQbTJ);
            parcel.writeMap(this.EZpvd);
        }

        public final String KWHzl() {
            String[] strArr = this.copydefault;
            if (strArr == null) {
                return "";
            }
            int length = strArr.length;
            if (length <= 1) {
                return length > 0 ? strArr[0] : "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append('|');
                }
                sb.append(this.copydefault[i]);
            }
            return sb.toString();
        }
    }
}
