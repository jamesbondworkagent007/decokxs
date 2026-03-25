package com.bytedance.bdtracker;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.applog.IDataObserver;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.UriConfig;
import com.bytedance.applog.alink.IALinkListener;
import com.bytedance.applog.alink.util.LinkUtils;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.bdtracker.p;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.yDY;
import o.yJA;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Handler.Callback, IDataObserver {
    public static final /* synthetic */ yJA[] k = {C56524yIo.copydefault(new PropertyReference1Impl(C56524yIo.AEQbTJ(j.class), "mHandler", "getMHandler()Landroid/os/Handler;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f194a;
    public final InterfaceC56387yDm b;
    public f0 c;
    public h d;
    public int e;
    public q f;
    public int g;
    public String h;
    public final List<String> i;
    public final List<String> j;

    public static final class a extends Lambda implements Function0<Handler> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public Handler invoke() {
            HandlerThread handlerThread = new HandlerThread("bd_tracker_alink");
            handlerThread.start();
            return new Handler(handlerThread.getLooper(), j.this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(@NotNull f0 f0Var) {
        Intrinsics.EZpvd((Object) f0Var, "");
        this.b = C56392yDr.copydefault(new a());
        this.c = f0Var;
        this.g = 10;
        this.i = yDY.gEmmrt("utm_campaign", "utm_source", "utm_term", "utm_medium", "utm_content");
        this.j = yDY.gEmmrt("tr_shareuser", "tr_admaster", "tr_param1", "tr_param2", "tr_param3", "tr_param4", "reengagement_window", "reengagement_time", "is_retargeting");
        String strA = b.a(f0Var.d, "ALINK_CACHE_SP");
        v1 v1Var = f0Var.e;
        Intrinsics.AEQbTJ(v1Var, "");
        InitConfig initConfig = v1Var.c;
        Intrinsics.AEQbTJ(initConfig, "");
        Context contextB = f0Var.b();
        Intrinsics.AEQbTJ(contextB, "");
        Intrinsics.AEQbTJ(strA, "");
        this.d = new h(initConfig, contextB, strA);
        d dVar = f0Var.d;
        Intrinsics.AEQbTJ(dVar, "");
        this.f = new q(dVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Handler a() {
        InterfaceC56387yDm interfaceC56387yDm = this.b;
        yJA yja = k[0];
        return (Handler) interfaceC56387yDm.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IAppLogLogger b() {
        d dVar = this.c.d;
        Intrinsics.AEQbTJ(dVar, "");
        return dVar.D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        k kVar = (k) this.d.a("deep_link", k.class);
        JSONObject jSONObjectA = kVar != null ? kVar.a() : null;
        if (jSONObjectA != null) {
            for (String str : this.i) {
                jSONObject2.put(str, jSONObjectA.optString(str, null));
            }
            for (String str2 : this.j) {
                if (Intrinsics.EZpvd((Object) str2, (Object) "is_retargeting")) {
                    jSONObject.put(str2, jSONObjectA.optBoolean(str2) ? 1 : 0);
                } else {
                    jSONObject.put(str2, jSONObjectA.optString(str2, null));
                }
            }
            x1 x1Var = this.c.i;
            if (x1Var != null) {
                x1Var.a("tracer_data", jSONObject);
            }
            x1 x1Var2 = this.c.i;
            if (x1Var2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    x1Var2.a(next, (Object) jSONObject2.optString(next));
                }
            }
        }
        String strA = this.d.a("tr_web_ssid");
        if (strA == null || strA.length() == 0) {
            return;
        }
        this.c.d.setHeaderInfo("$tr_web_ssid", strA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws JSONException {
        String str;
        m<n> mVarA;
        String str2;
        String str3;
        k kVar;
        Integer numValueOf = message != null ? Integer.valueOf(message.what) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            x1 x1Var = this.c.i;
            if (x1Var != null && x1Var.i() == 0) {
                int i = this.e;
                if (i >= this.g) {
                    b().warn(3, "Retried max times to do deep link until AppLog ready", new Object[0]);
                    return true;
                }
                this.e = i + 1;
                b().debug(3, "Retry do deep link delay for the {} times...", Integer.valueOf(this.e));
                Handler handlerA = a();
                handlerA.sendMessageDelayed(handlerA.obtainMessage(message.what, message.obj), 500L);
                return true;
            }
            Object obj = message.obj;
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.applog.alink.model.ALinkQueryParam");
            }
            l lVar = (l) obj;
            String strC = lVar.c();
            if (strC == null || strC.length() == 0) {
                b().warn(3, "DeepLink terminate, queryParam not find token...", new Object[0]);
            } else {
                lVar.l = "android";
                d dVar = this.c.d;
                Intrinsics.AEQbTJ(dVar, "");
                lVar.a(dVar.m);
                d dVar2 = this.c.d;
                Intrinsics.AEQbTJ(dVar2, "");
                lVar.b(dVar2.getDid());
                d dVar3 = this.c.d;
                Intrinsics.AEQbTJ(dVar3, "");
                lVar.c(dVar3.getSsid());
                d dVar4 = this.c.d;
                Intrinsics.AEQbTJ(dVar4, "");
                lVar.d(dVar4.getUserUniqueID());
                x1 x1Var2 = this.c.i;
                lVar.h = x1Var2 != null ? x1Var2.h() : null;
                x1 x1Var3 = this.c.i;
                lVar.i = x1Var3 != null ? x1Var3.k() : null;
                x1 x1Var4 = this.c.i;
                if (x1Var4 != null) {
                    str2 = null;
                    str3 = (String) x1Var4.a("device_model", (Object) null, (Class<Object>) String.class);
                } else {
                    str2 = null;
                    str3 = null;
                }
                lVar.n = str3;
                x1 x1Var5 = this.c.i;
                lVar.m = x1Var5 != null ? (String) x1Var5.a("os_version", str2, (Class<String>) String.class) : str2;
                x1 x1Var6 = this.c.i;
                JSONObject jSONObject = x1Var6 != null ? (JSONObject) x1Var6.a("oaid", str2, (Class<String>) JSONObject.class) : null;
                lVar.j = jSONObject != null ? jSONObject.optString("id") : null;
                x1 x1Var7 = this.c.i;
                lVar.k = x1Var7 != null ? (String) x1Var7.a("google_aid", (Object) null, (Class<Object>) String.class) : null;
                UriConfig uriConfigE = this.c.e();
                Intrinsics.AEQbTJ(uriConfigE, "");
                String alinkQueryUri = uriConfigE.getAlinkQueryUri();
                m<k> mVarA2 = alinkQueryUri != null ? this.f.a(alinkQueryUri, lVar) : null;
                if (mVarA2 != null && (kVar = (k) mVarA2.a()) != null) {
                    kVar.t = strC;
                    this.d.a("deep_link", kVar, 2592000000L);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("$link_type", DevicePublicKeyStringDef.DIRECT);
                    jSONObject2.put("$deeplink_url", this.h);
                    this.c.d.receive(new m4("$invoke", jSONObject2));
                    c();
                    d dVar5 = this.c.d;
                    Intrinsics.AEQbTJ(dVar5, "");
                    IALinkListener iALinkListener = dVar5.z;
                    if (iALinkListener != null) {
                        iALinkListener.onALinkData(kVar.a(), null);
                    }
                }
            }
            return true;
        }
        if (numValueOf == null || numValueOf.intValue() != 0) {
            return true;
        }
        JSONObject paramFromClipboard = this.f194a ? LinkUtils.INSTANCE.getParamFromClipboard(this.c.b()) : new JSONObject();
        b().debug(3, "Start to do defer deeplink with data:{}...", paramFromClipboard);
        p.a aVar = p.f239a;
        if (paramFromClipboard == null) {
            paramFromClipboard = new JSONObject();
        }
        l lVar2 = (l) aVar.a(paramFromClipboard, l.class);
        if (lVar2 == null) {
            return true;
        }
        Object obj2 = message.obj;
        if (obj2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        d dVar6 = this.c.d;
        Intrinsics.AEQbTJ(dVar6, "");
        lVar2.a(dVar6.m);
        d dVar7 = this.c.d;
        Intrinsics.AEQbTJ(dVar7, "");
        lVar2.b(dVar7.getDid());
        d dVar8 = this.c.d;
        Intrinsics.AEQbTJ(dVar8, "");
        lVar2.c(dVar8.getSsid());
        d dVar9 = this.c.d;
        Intrinsics.AEQbTJ(dVar9, "");
        lVar2.d(dVar9.getUserUniqueID());
        String strB = lVar2.b();
        if (strB != null && strB.length() != 0) {
            d dVar10 = this.c.d;
            String strB2 = lVar2.b();
            if (strB2 == null) {
                strB2 = "";
            }
            dVar10.setExternalAbVersion(strB2);
        }
        String strD = lVar2.d();
        if (strD == null || strD.length() == 0) {
            str = "$invoke";
        } else {
            str = "$invoke";
            this.d.a("tr_web_ssid", lVar2.d(), 31536000000L);
        }
        UriConfig uriConfigE2 = this.c.e();
        Intrinsics.AEQbTJ(uriConfigE2, "");
        String alinkAttributionUri = uriConfigE2.getAlinkAttributionUri();
        if (alinkAttributionUri != null) {
            q qVar = this.f;
            o oVar = new o();
            x1 x1Var8 = this.c.i;
            if (x1Var8 != null) {
                oVar.b = x1Var8.c();
                oVar.f = "android";
                oVar.e = x1Var8.g();
                oVar.l = x1Var8.h();
                oVar.m = x1Var8.k();
                JSONObject jSONObject3 = (JSONObject) x1Var8.a("oaid", (Object) null, (Class<Object>) JSONObject.class);
                oVar.d = x1Var8.d();
                oVar.n = jSONObject3 != null ? jSONObject3.optString("id") : null;
                oVar.f234o = (String) x1Var8.a("google_aid", (Object) null, (Class<Object>) String.class);
                oVar.q = (String) x1Var8.a("user_agent", (Object) null, (Class<Object>) String.class);
                oVar.r = (String) x1Var8.a("device_model", (Object) null, (Class<Object>) String.class);
                oVar.s = (String) x1Var8.a("os_version", (Object) null, (Class<Object>) String.class);
                oVar.h = x1Var8.q();
                oVar.i = zBooleanValue;
                oVar.j = x1Var8.o();
                oVar.k = (String) x1Var8.a(AppsFlyerProperties.CHANNEL, (Object) null, (Class<Object>) String.class);
                oVar.t = (String) x1Var8.a("package", (Object) null, (Class<Object>) String.class);
            }
            mVarA = qVar.a(alinkAttributionUri, oVar, lVar2);
        } else {
            mVarA = null;
        }
        n nVar = mVarA != null ? (n) mVarA.a() : null;
        if (nVar == null) {
            i iVar = i.f189a;
            d dVar11 = this.c.d;
            Intrinsics.AEQbTJ(dVar11, "");
            IALinkListener iALinkListener2 = dVar11.z;
            if (iALinkListener2 == null) {
                return true;
            }
            iALinkListener2.onAttributionFailedCallback(new IllegalStateException(iVar.invoke(mVarA != null ? mVarA.f220a : null)));
            return true;
        }
        if (!nVar.G) {
            d dVar12 = this.c.d;
            Intrinsics.AEQbTJ(dVar12, "");
            IALinkListener iALinkListener3 = dVar12.z;
            if (iALinkListener3 == null) {
                return true;
            }
            iALinkListener3.onAttributionFailedCallback(new IllegalStateException("DDL has data but not firstLaunch"));
            return true;
        }
        nVar.G = false;
        this.d.a("deferred_deep_link", nVar, -1L);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("$link_type", "deferred");
        this.c.d.receive(new m4(str, jSONObject4));
        d dVar13 = this.c.d;
        Intrinsics.AEQbTJ(dVar13, "");
        IALinkListener iALinkListener4 = dVar13.z;
        if (iALinkListener4 == null) {
            return true;
        }
        iALinkListener4.onAttributionData(nVar.a(), null);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onAbVidsChange(@NotNull String str, @NotNull String str2) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) str2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onIdLoaded(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.EZpvd((Object) str, "");
        Intrinsics.EZpvd((Object) str2, "");
        Intrinsics.EZpvd((Object) str3, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteAbConfigGet(boolean z, @NotNull JSONObject jSONObject) {
        Intrinsics.EZpvd((Object) jSONObject, "");
    }

    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteConfigGet(boolean z, JSONObject jSONObject) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.applog.IDataObserver
    public void onRemoteIdGet(boolean z, String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.EZpvd((Object) str2, "");
        Intrinsics.EZpvd((Object) str3, "");
        Intrinsics.EZpvd((Object) str4, "");
        Intrinsics.EZpvd((Object) str5, "");
        Intrinsics.EZpvd((Object) str6, "");
        x1 x1Var = this.c.i;
        if (x1Var != null && !x1Var.p()) {
            b().warn(3, "Register not ready, ddl wait next time...", new Object[0]);
            return;
        }
        c();
        String strA = this.d.a("app_cache");
        boolean z2 = !(strA == null || strA.length() == 0);
        if (!z2) {
            this.d.a("app_cache", "app_cache", -1L);
        }
        if (!z2) {
            Handler handlerA = a();
            handlerA.sendMessage(handlerA.obtainMessage(0, Boolean.valueOf(z2)));
        }
        i1 i1Var = this.c.d.y;
        if (i1Var != null) {
            i1Var.b(this);
        }
    }
}
