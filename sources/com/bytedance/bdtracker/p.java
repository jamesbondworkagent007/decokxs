package com.bytedance.bdtracker;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f239a = new a(null);

    public static final class a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final <T extends p> T a(JSONObject jSONObject, @NotNull Class<T> cls) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.EZpvd((Object) cls, "");
            if (jSONObject == null) {
                return null;
            }
            T tNewInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.AEQbTJ(tNewInstance, "");
            T t = tNewInstance;
            t.a(jSONObject);
            return t;
        }
    }

    public abstract JSONObject a();

    public abstract void a(JSONObject jSONObject);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String string = a().toString();
        Intrinsics.AEQbTJ(string, "");
        return string;
    }
}
