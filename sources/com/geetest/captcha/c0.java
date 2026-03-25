package com.geetest.captcha;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<d0> f362a = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(d0 d0Var) {
        synchronized (this.f362a) {
            if (!(!this.f362a.contains(d0Var))) {
                throw new IllegalStateException(("Observer " + d0Var + " is already registered.").toString());
            }
            this.f362a.add(d0Var);
        }
    }

    public final void a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<d0> it = this.f362a.iterator();
        while (it.hasNext()) {
            it.next().a(str, str2, jSONObject);
        }
    }
}
