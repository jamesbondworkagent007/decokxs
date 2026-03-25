package com.bytedance.bdtracker;

import android.content.Context;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class c2 extends q1 {
    public final Context e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public c2(Context context) {
        super(true, true);
        this.e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Locale";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        x1.a(jSONObject, "language", this.e.getResources().getConfiguration().locale.getLanguage());
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            rawOffset = 12;
        }
        jSONObject.put("timezone", rawOffset);
        x1.a(jSONObject, "region", Locale.getDefault().getCountry());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        x1.a(jSONObject, "tz_name", timeZone.getID());
        jSONObject.put("tz_offset", timeZone.getOffset(System.currentTimeMillis()) / 1000);
        return true;
    }
}
