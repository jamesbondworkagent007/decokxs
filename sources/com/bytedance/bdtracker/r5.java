package com.bytedance.bdtracker;

import com.bytedance.applog.log.IAppLogLogger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f252a = Collections.singletonList("Validator");
    public static final Pattern b = Pattern.compile("^[a-z0-9A-Z_ .-]{1,255}$");
    public static final List<String> c = Arrays.asList("$inactive", "$inline", "$target_uuid_list", "$source_uuid", "$is_spider", "$source_id", "$is_first_time");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(IAppLogLogger iAppLogLogger, String str, JSONObject jSONObject) {
        if (r.c(str)) {
            iAppLogLogger.warn(f252a, "Event name must not be empty!", new Object[0]);
        } else {
            if (!b.matcher(str).matches()) {
                iAppLogLogger.warn(f252a, "Event [" + str + "] name is invalid!", new Object[0]);
            }
            if (str.startsWith("__")) {
                iAppLogLogger.warn(f252a, "Event [" + str + "] name should not start with __!", new Object[0]);
            }
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        String strA = r.a((Object) str);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (r.c(next)) {
                iAppLogLogger.warn(f252a, "Event [" + strA + "] param key must not be empty!", new Object[0]);
            }
            if (!c.contains(next)) {
                if (!b.matcher(next).matches()) {
                    iAppLogLogger.warn(f252a, "Event [" + strA + "] param key [" + next + "] is invalid!", new Object[0]);
                }
                if (next.startsWith("__")) {
                    iAppLogLogger.warn(f252a, "Event [" + strA + "] param key [" + next + "] should not start with __!", new Object[0]);
                }
            }
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof String) && ((String) objOpt).length() > 1024) {
                iAppLogLogger.warn(f252a, "Event [" + strA + "] param key [" + next + "] value is limited to a maximum of 1024 characters!", new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(IAppLogLogger iAppLogLogger, Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (r.c(str)) {
                iAppLogLogger.warn(f252a, "Header name must not be empty!", new Object[0]);
            }
            if (!c.contains(str)) {
                if (!b.matcher(str).matches()) {
                    iAppLogLogger.warn(f252a, "Header [" + str + "] name is invalid!", new Object[0]);
                }
                if (str.startsWith("__")) {
                    iAppLogLogger.warn(f252a, "Header [" + str + "] name should not start with __!", new Object[0]);
                }
            }
            Object obj = map.get(str);
            if ((obj instanceof String) && ((String) obj).length() > 1024) {
                iAppLogLogger.warn(f252a, "Header [" + str + "] value is limited to a maximum of 1024 characters!", new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(IAppLogLogger iAppLogLogger, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (r.c(next)) {
                iAppLogLogger.warn(f252a, "Profile key must not be empty!", new Object[0]);
            }
            if (!b.matcher(next).matches()) {
                iAppLogLogger.warn(f252a, "Profile param [" + next + "] name is invalid!", new Object[0]);
            }
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof String) && ((String) objOpt).length() > 1024) {
                iAppLogLogger.warn(f252a, "Profile param [" + next + "] value is limited to a maximum of 1024 characters!", new Object[0]);
            }
        }
    }
}
