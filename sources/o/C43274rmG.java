package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.network.engine.bean.EngineBean;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43274rmG {
    public static final C43274rmG EZpvd = new C43274rmG();

    /* JADX INFO: renamed from: o.rmG$StateListAnimator */
    public static final class StateListAnimator extends TypeToken<java.util.Map<java.lang.String, ? extends java.lang.Object>> {
    }

    private C43274rmG() {
    }

    /* JADX INFO: renamed from: o.rmG$TaskDescription */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final RequestBody KWHzl;
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public final java.util.Map<java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.rmG$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.util.Map map, java.util.Map map2, RequestBody requestBody, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.AEQbTJ;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                map = taskDescription.copydefault;
            }
            java.util.Map map3 = map;
            if ((i & 8) != 0) {
                map2 = taskDescription.OLrzqt;
            }
            java.util.Map map4 = map2;
            if ((i & 16) != 0) {
                requestBody = taskDescription.KWHzl;
            }
            return taskDescription.OLrzqt(str, str3, map3, map4, requestBody);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RequestBody KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            return new TaskDescription(str, str2, map, map2, requestBody);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            int iHashCode4 = this.OLrzqt.hashCode();
            RequestBody requestBody = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (requestBody == null ? 0 : requestBody.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HttpRequest(method=" + this.EZpvd + ", path=" + this.AEQbTJ + ", headers=" + this.copydefault + ", query=" + this.OLrzqt + ", body=" + this.KWHzl + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.copydefault = map;
            this.OLrzqt = map2;
            this.KWHzl = requestBody;
        }
    }

    /* JADX INFO: renamed from: o.rmG$Activity */
    public static final class Activity {
        public final java.util.Map<java.lang.String, ActionBar> AEQbTJ;
        public final ActionBar EZpvd;
        public final java.util.Map<java.lang.String, ActionBar> KWHzl;
        public final java.util.Map<java.lang.String, ActionBar> OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.rmG$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, ActionBar actionBar, java.util.Map map, java.util.Map map2, java.util.Map map3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            if ((i & 2) != 0) {
                actionBar = activity.EZpvd;
            }
            ActionBar actionBar2 = actionBar;
            if ((i & 4) != 0) {
                map = activity.KWHzl;
            }
            java.util.Map map4 = map;
            if ((i & 8) != 0) {
                map2 = activity.AEQbTJ;
            }
            java.util.Map map5 = map2;
            if ((i & 16) != 0) {
                map3 = activity.OLrzqt;
            }
            return activity.EZpvd(str, actionBar2, map4, map5, map3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, ActionBar> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, ActionBar> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(java.lang.String str, ActionBar actionBar, java.util.Map<java.lang.String, ActionBar> map, java.util.Map<java.lang.String, ActionBar> map2, java.util.Map<java.lang.String, ActionBar> map3) {
            return new Activity(str, actionBar, map, map2, map3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, ActionBar> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            ActionBar actionBar = this.EZpvd;
            int iHashCode2 = actionBar == null ? 0 : actionBar.hashCode();
            java.util.Map<java.lang.String, ActionBar> map = this.KWHzl;
            int iHashCode3 = map == null ? 0 : map.hashCode();
            java.util.Map<java.lang.String, ActionBar> map2 = this.AEQbTJ;
            int iHashCode4 = map2 == null ? 0 : map2.hashCode();
            java.util.Map<java.lang.String, ActionBar> map3 = this.OLrzqt;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map3 != null ? map3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MatchRule(method=" + this.copydefault + ", path=" + this.EZpvd + ", headers=" + this.KWHzl + ", query=" + this.AEQbTJ + ", body=" + this.OLrzqt + ")";
        }

        public Activity(java.lang.String str, ActionBar actionBar, java.util.Map<java.lang.String, ActionBar> map, java.util.Map<java.lang.String, ActionBar> map2, java.util.Map<java.lang.String, ActionBar> map3) {
            this.copydefault = str;
            this.EZpvd = actionBar;
            this.KWHzl = map;
            this.AEQbTJ = map2;
            this.OLrzqt = map3;
        }
    }

    /* JADX INFO: renamed from: o.rmG$ActionBar */
    public static final class ActionBar {
        public final java.lang.String EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.EZpvd;
            }
            return actionBar.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MatchPattern(pattern=" + this.copydefault + ", type=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.EZpvd = str2;
        }
    }

    public final boolean EZpvd(@NotNull TaskDescription taskDescription, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity.OLrzqt() != null && !Intrinsics.EZpvd((java.lang.Object) activity.OLrzqt(), (java.lang.Object) taskDescription.copydefault())) {
            return false;
        }
        if (activity.copydefault() != null && !KWHzl(taskDescription.AEQbTJ(), activity.copydefault())) {
            return false;
        }
        if (activity.KWHzl() != null && !AEQbTJ(taskDescription.EZpvd(), activity.KWHzl())) {
            return false;
        }
        if (activity.EZpvd() != null && !AEQbTJ(taskDescription.OLrzqt(), activity.EZpvd())) {
            return false;
        }
        if (activity.AEQbTJ() != null) {
            return taskDescription.KWHzl() != null && AEQbTJ(EZpvd(taskDescription.KWHzl()), activity.AEQbTJ());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[ADDED_TO_REGION, REMOVE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(java.lang.String str, ActionBar actionBar) {
        boolean zMatches;
        java.lang.String strAEQbTJ = actionBar.AEQbTJ();
        int iHashCode = strAEQbTJ.hashCode();
        if (iHashCode != -1173015078) {
            if (iHashCode != -567445985) {
                if (iHashCode != 96946943 || strAEQbTJ.equals("exact")) {
                    zMatches = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.copydefault());
                } else {
                    zMatches = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.copydefault());
                }
            } else if (strAEQbTJ.equals("contains")) {
                zMatches = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) actionBar.copydefault(), false, 2, (java.lang.Object) null);
            }
        } else if (strAEQbTJ.equals("wildcard")) {
            zMatches = new Regex(actionBar.copydefault()).matches(str);
        }
        pUU.EZpvd("MatchRequest", "value:" + str + ",pattern:" + actionBar + ",matchResult:" + zMatches);
        return zMatches;
    }

    public final boolean AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, ActionBar> map2) {
        for (Map.Entry<java.lang.String, ActionBar> entry : map2.entrySet()) {
            java.lang.String key = entry.getKey();
            ActionBar value = entry.getValue();
            java.lang.String str = map.get(key);
            if (str == null || !KWHzl(str, value)) {
                return false;
            }
        }
        return true;
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd(RequestBody requestBody) {
        java.util.Map<java.lang.String, java.lang.Object> mapOLrzqt;
        java.util.HashMap map = new java.util.HashMap();
        if (requestBody != null && (mapOLrzqt = OLrzqt(requestBody)) != null) {
            for (Map.Entry<java.lang.String, java.lang.Object> entry : mapOLrzqt.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof java.lang.String) {
                    map.put(key, value);
                }
            }
        }
        return map;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> OLrzqt(@NotNull RequestBody requestBody) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(requestBody, "");
        okio.Buffer buffer = new okio.Buffer();
        requestBody.writeTo(buffer);
        java.lang.String utf8 = buffer.readUtf8();
        try {
            return (java.util.Map) new Gson().fromJson(utf8, new StateListAnimator().getType());
        } catch (java.lang.Exception unused) {
            pUU.EZpvd("MatchRequest", "body: " + utf8);
            return null;
        }
    }

    public final TaskDescription copydefault(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        java.lang.String strMethod = request.method();
        HttpUrl httpUrlUrl = request.url();
        java.lang.String strEncodedPath = httpUrlUrl.encodedPath();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (java.lang.String str : httpUrlUrl.queryParameterNames()) {
            linkedHashMap.put(str, httpUrlUrl.queryParameter(str));
        }
        for (java.lang.String str2 : request.headers().names()) {
            java.lang.String strHeader = request.header(str2);
            if (strHeader == null) {
                strHeader = "";
            }
            linkedHashMap2.put(str2, strHeader);
        }
        return new TaskDescription(strMethod, strEncodedPath, linkedHashMap2, linkedHashMap, request.body());
    }

    public final EngineBean.Rule EZpvd(@NotNull Request request) {
        java.util.List<EngineBean.Rule> rules;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        java.lang.String pattern;
        java.lang.String pattern2;
        LinkedHashMap linkedHashMap4;
        java.lang.String pattern3;
        LinkedHashMap linkedHashMap5;
        java.lang.String pattern4;
        LinkedHashMap linkedHashMap6;
        Intrinsics.checkNotNullParameter(request, "");
        TaskDescription taskDescriptionCopydefault = copydefault(request);
        pUU.EZpvd("MatchRequest", request.url() + " matchRule begin");
        EngineBean engineBeanKWHzl = C43270rmC.OLrzqt.KWHzl();
        if (engineBeanKWHzl != null && (rules = engineBeanKWHzl.getRules()) != null) {
            for (EngineBean.Rule rule : rules) {
                EngineBean.Rule.Match.QueryMatch queryMatch = rule.getMatch().getQueryMatch();
                if (queryMatch == null || (pattern4 = queryMatch.getPattern()) == null) {
                    linkedHashMap = null;
                } else {
                    java.util.Map<java.lang.String, java.lang.String> query = rule.getMatch().getQueryMatch().getQuery();
                    if (query != null) {
                        linkedHashMap6 = null;
                        for (Map.Entry<java.lang.String, java.lang.String> entry : query.entrySet()) {
                            java.lang.String key = entry.getKey();
                            java.lang.String value = entry.getValue();
                            if (linkedHashMap6 == null) {
                                linkedHashMap6 = new LinkedHashMap();
                            }
                        }
                    } else {
                        linkedHashMap6 = null;
                    }
                    linkedHashMap = linkedHashMap6;
                }
                EngineBean.Rule.Match.BodyMatch bodyMatch = rule.getMatch().getBodyMatch();
                if (bodyMatch == null || (pattern3 = bodyMatch.getPattern()) == null) {
                    linkedHashMap2 = null;
                } else {
                    java.util.Map<java.lang.String, java.lang.String> body = rule.getMatch().getBodyMatch().getBody();
                    if (body != null) {
                        linkedHashMap5 = null;
                        for (Map.Entry<java.lang.String, java.lang.String> entry2 : body.entrySet()) {
                            java.lang.String key2 = entry2.getKey();
                            java.lang.String value2 = entry2.getValue();
                            if (linkedHashMap5 == null) {
                                linkedHashMap5 = new LinkedHashMap();
                            }
                        }
                    } else {
                        linkedHashMap5 = null;
                    }
                    linkedHashMap2 = linkedHashMap5;
                }
                EngineBean.Rule.Match.HeadersMatch headersMatch = rule.getMatch().getHeadersMatch();
                if (headersMatch == null || (pattern2 = headersMatch.getPattern()) == null) {
                    linkedHashMap3 = null;
                } else {
                    java.util.Map<java.lang.String, java.lang.String> headers = rule.getMatch().getHeadersMatch().getHeaders();
                    if (headers != null) {
                        linkedHashMap4 = null;
                        for (Map.Entry<java.lang.String, java.lang.String> entry3 : headers.entrySet()) {
                            java.lang.String key3 = entry3.getKey();
                            java.lang.String value3 = entry3.getValue();
                            if (linkedHashMap4 == null) {
                                linkedHashMap4 = new LinkedHashMap();
                            }
                        }
                    } else {
                        linkedHashMap4 = null;
                    }
                    linkedHashMap3 = linkedHashMap4;
                }
                EngineBean.Rule.Match.PathMatch pathMatch = rule.getMatch().getPathMatch();
                if (EZpvd.EZpvd(taskDescriptionCopydefault, new Activity(rule.getMatch().getMethod(), (pathMatch == null || (pattern = pathMatch.getPattern()) == null) ? null : new ActionBar(rule.getMatch().getPathMatch().getPath(), pattern), linkedHashMap3, linkedHashMap, linkedHashMap2))) {
                    pUU.EZpvd("MatchRequest", request.url() + " matchRule hit " + rule.getName() + " end");
                    return rule;
                }
            }
        }
        pUU.EZpvd("MatchRequest", request.url() + " matchRule miss end");
        return null;
    }
}
