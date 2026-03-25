package com.bytedance.bdtracker;

import com.bytedance.bdtracker.u2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class w2 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f288a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public w2(int i) {
        this.f288a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.t2
    public List<String> a() {
        return r.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public String b() {
        return "data_storage_count";
    }

    @Override // com.bytedance.bdtracker.t2
    public int c() {
        return 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.u2
    public JSONObject d() {
        return u2.a.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.u2
    public String e() {
        return "data_statistics";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.t2
    public List<Number> f() {
        return r.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.u2
    public Object g() {
        return Integer.valueOf(this.f288a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bytedance.bdtracker.u2
    public void a(@NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
        Intrinsics.EZpvd((Object) jSONObject, "");
        u2.a.a(jSONObject);
    }
}
