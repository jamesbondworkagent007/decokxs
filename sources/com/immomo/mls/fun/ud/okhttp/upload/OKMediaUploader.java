package com.immomo.mls.fun.ud.okhttp.upload;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.constants.FileInfo;
import com.immomo.mls.fun.ud.KotlinUtils;
import com.immomo.mls.fun.ud.UDMap;
import com.immomo.mls.fun.ud.okhttp.UDApiException;
import com.immomo.mls.fun.ud.okhttp.UDSystemException;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import o.AbstractC7398ajA;
import o.C58216yxB;
import o.C7322ahe;
import o.C7441ajr;
import o.C7449ajz;
import o.C7840arS;
import o.C7869arv;
import o.InterfaceC58217yxC;
import o.InterfaceC7433ajj;
import o.InterfaceC7835arN;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okio.BufferedSink;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass(gcByLua = false)
public class OKMediaUploader {
    public static final String LUA_CLASS_NAME = "OKMediaUploader";
    public Globals globals;
    public C58216yxB disposables = new C58216yxB();
    public HashMap<String, InterfaceC58217yxC> disposableHashMap = new HashMap<>();
    public boolean mIgnoreAuth = false;
    public SubdomainStrategy mSubdomainStrategy = null;
    public C7441ajr requestModule = new C7441ajr();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void configIgnoreAuthorization() {
        this.mIgnoreAuth = true;
    }

    public OKMediaUploader(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public void cancelUploadFile(String str) {
        if (this.disposableHashMap.get(str) == null || this.disposableHashMap.get(str).isDisposed()) {
            return;
        }
        this.disposableHashMap.get(str).dispose();
    }

    @LuaBridge
    public void uploadFileToTargetUrl(String str, final String str2, String str3, Map<String, String> map, final InterfaceC7835arN interfaceC7835arN, final InterfaceC7835arN interfaceC7835arN2) {
        AbstractC7398ajA<String> abstractC7398ajA = new AbstractC7398ajA<String>() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.3
            @Override // o.AbstractC7398ajA
            public void AEQbTJ(Call<String> call, Response<String> response) {
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<String> call, Throwable th) {
            }

            @Override // o.AbstractC7398ajA
            public void copydefault(final long j, final long j2) {
                C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        InterfaceC7835arN interfaceC7835arN3 = interfaceC7835arN;
                        if (interfaceC7835arN3 != null) {
                            interfaceC7835arN3.EZpvd(LuaString.copydefault(str2), LuaNumber.copydefault(j), LuaNumber.copydefault(j2), LuaNumber.copydefault(j));
                        }
                    }
                });
            }
        };
        MultipartBody.Builder builder = new MultipartBody.Builder();
        if (!TextUtils.isEmpty(str2)) {
            builder.addFormDataPart(str3, KWHzl(str2), new C7449ajz(RequestBody.create(MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART), new File(str2)), abstractC7398ajA));
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.addFormDataPart(entry.getKey(), entry.getValue());
            }
        }
        builder.setType(MultipartBody.FORM);
        MultipartBody multipartBodyBuild = builder.build();
        HashMap map2 = new HashMap();
        SubdomainStrategy subdomainStrategy = this.mSubdomainStrategy;
        if (subdomainStrategy != null) {
            map2.put("Subdomain-Strategy", subdomainStrategy.toString());
        }
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = this.requestModule.AEQbTJ(str, KotlinUtils.copydefault.EZpvd(this.mIgnoreAuth), map2, multipartBodyBuild.parts(), new InterfaceC7433ajj<JsonObject>() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.2
            /* JADX DEBUG: Method merged with bridge method: OLrzqt(ZLjava/lang/Object;Ljava/lang/Exception;)V */
            @Override // o.InterfaceC7433ajj
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void OLrzqt(boolean z, JsonObject jsonObject, Exception exc) {
                if (jsonObject == null && (exc instanceof UDSystemException)) {
                    OKMediaUploader oKMediaUploader = OKMediaUploader.this;
                    oKMediaUploader.copydefault(oKMediaUploader.globals, ((UDSystemException) exc).getMsg(), interfaceC7835arN2);
                } else if (jsonObject == null && (exc instanceof UDApiException)) {
                    OKMediaUploader oKMediaUploader2 = OKMediaUploader.this;
                    oKMediaUploader2.copydefault(oKMediaUploader2.globals, ((UDApiException) exc).getMsg(), interfaceC7835arN2);
                } else if (jsonObject != null) {
                    OKMediaUploader oKMediaUploader3 = OKMediaUploader.this;
                    oKMediaUploader3.EZpvd(z, oKMediaUploader3.globals, jsonObject, interfaceC7835arN2);
                }
            }
        });
        this.disposableHashMap.put(str2, interfaceC58217yxCAEQbTJ);
        this.disposables.AEQbTJ(interfaceC58217yxCAEQbTJ);
    }

    public final void EZpvd(final boolean z, final Globals globals, final JsonObject jsonObject, final InterfaceC7835arN interfaceC7835arN) {
        if (interfaceC7835arN == null || globals == null || globals.isDestroyed()) {
            return;
        }
        C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.5
            @Override // java.lang.Runnable
            public void run() {
                if (globals.isDestroyed()) {
                    return;
                }
                JsonObject jsonObject2 = jsonObject;
                if (jsonObject2 == null) {
                    interfaceC7835arN.EZpvd(LuaValue.rFalse(), new UDMap(globals, new HashMap()));
                    return;
                }
                if (z) {
                    try {
                        JsonElement jsonElement = jsonObject2.get("data");
                        if (jsonElement instanceof JsonObject) {
                            interfaceC7835arN.EZpvd(LuaValue.True(), C7869arv.copydefault(globals, (JsonObject) jsonElement));
                        } else if (jsonElement instanceof JsonArray) {
                            interfaceC7835arN.EZpvd(LuaValue.True(), C7869arv.EZpvd(globals, (JsonArray) jsonElement));
                        } else if (jsonElement != null) {
                            interfaceC7835arN.EZpvd(LuaValue.True(), jsonElement);
                        } else {
                            interfaceC7835arN.EZpvd(LuaValue.True(), C7869arv.copydefault(globals, jsonObject));
                        }
                        return;
                    } catch (Exception unused) {
                        interfaceC7835arN.EZpvd(LuaValue.False(), new UDMap(globals, new HashMap()));
                        return;
                    }
                }
                interfaceC7835arN.EZpvd(LuaValue.False(), LuaValue.Nil(), new UDMap(globals, OKMediaUploader.this.KWHzl(jsonObject)));
            }
        });
    }

    public final void copydefault(final Globals globals, final String str, final InterfaceC7835arN interfaceC7835arN) {
        if (interfaceC7835arN == null || globals == null || globals.isDestroyed()) {
            return;
        }
        C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.4
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap();
                map.put("code", MultiTransferSignData.DEFAULT_INTERVAL);
                map.put("msg", str);
                interfaceC7835arN.EZpvd(LuaValue.False(), LuaValue.Nil(), new UDMap(globals, map));
            }
        });
    }

    public final Map<String, Object> KWHzl(JsonObject jsonObject) {
        String string;
        if (jsonObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("code", jsonObject.get("code") + "");
        map.put("msg", jsonObject.get("msg") + "");
        JsonElement jsonElement = jsonObject.get("data");
        if (jsonElement == null) {
            string = jsonObject.toString();
        } else {
            string = jsonElement.toString();
        }
        map.put("data", string);
        map.put("detailMsg", jsonObject.get("detailMsg") + "");
        map.put(EopTrackEvent.KEY_ERROR_MESSAGE, jsonObject.get(EopTrackEvent.KEY_ERROR_MESSAGE) + "");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[PHI: r0 r1 r3
  0x007a: PHI (r0v3 java.lang.String) = (r0v1 java.lang.String), (r0v9 java.lang.String) binds: [B:28:0x0078, B:24:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r1v5 long) = (r1v4 long), (r1v11 long) binds: [B:28:0x0078, B:24:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r3v2 android.database.Cursor) = (r3v1 android.database.Cursor), (r3v3 android.database.Cursor) binds: [B:28:0x0078, B:24:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uploadFile(final String str, int i, final InterfaceC7835arN interfaceC7835arN, final InterfaceC7835arN interfaceC7835arN2) {
        Cursor cursorQuery;
        RequestBody requestBodyCreate;
        String strKWHzl;
        final AbstractC7398ajA<String> abstractC7398ajA = new AbstractC7398ajA<String>() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.1
            @Override // o.AbstractC7398ajA
            public void AEQbTJ(Call<String> call, Response<String> response) {
            }

            @Override // retrofit2.Callback
            public void onFailure(@NonNull Call<String> call, @NonNull Throwable th) {
            }

            @Override // o.AbstractC7398ajA
            public void copydefault(final long j, final long j2) {
                C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        InterfaceC7835arN interfaceC7835arN3 = interfaceC7835arN;
                        if (interfaceC7835arN3 != null) {
                            interfaceC7835arN3.EZpvd(LuaString.copydefault(str), LuaNumber.copydefault(j), LuaNumber.copydefault(j2), LuaNumber.copydefault(j));
                        }
                    }
                });
            }
        };
        String str2 = "";
        if (str.startsWith("content://") || str.startsWith("file://")) {
            final Uri uri = Uri.parse(str);
            Context contextKWHzl = KWHzl(this.globals);
            if (contextKWHzl == null) {
                return;
            }
            ContentResolver contentResolver = contextKWHzl.getContentResolver();
            try {
                cursorQuery = contentResolver.query(uri, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("_display_name");
                            int columnIndex2 = cursorQuery.getColumnIndex(FileInfo.FileSize);
                            String string = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : "";
                            j = columnIndex2 >= 0 ? cursorQuery.getLong(columnIndex2) : -1L;
                            str2 = string;
                        }
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                        }
                    }
                }
            } catch (Throwable unused2) {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            String str3 = str2;
            final long j = j;
            requestBodyCreate = new RequestBody() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.9
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART);
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@NonNull BufferedSink bufferedSink) throws IOException {
                    OKMediaUploader oKMediaUploader = OKMediaUploader.this;
                    InputStream inputStreamOpenInputStream = oKMediaUploader.KWHzl(oKMediaUploader.globals).getContentResolver().openInputStream(uri);
                    try {
                        if (inputStreamOpenInputStream == null) {
                            throw new IOException("Cannot open URI: " + uri);
                        }
                        byte[] bArr = new byte[65536];
                        long jContentLength = contentLength();
                        long j2 = 0;
                        while (true) {
                            int i2 = inputStreamOpenInputStream.read(bArr);
                            if (i2 != -1) {
                                bufferedSink.write(bArr, 0, i2);
                                j2 += (long) i2;
                                if (jContentLength > 0) {
                                    abstractC7398ajA.copydefault(jContentLength, j2);
                                }
                            } else {
                                inputStreamOpenInputStream.close();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            };
            strKWHzl = str3;
        } else {
            requestBodyCreate = RequestBody.create(MediaType.parse(ShareTarget.ENCODING_TYPE_MULTIPART), new File(str));
            strKWHzl = KWHzl(str);
        }
        MultipartBody multipartBodyBuild = new MultipartBody.Builder().addFormDataPart("resource", strKWHzl, new C7449ajz(requestBodyCreate, abstractC7398ajA)).addFormDataPart("resourceType", String.valueOf(i + 1)).setType(MultipartBody.FORM).build();
        HashMap map = new HashMap();
        SubdomainStrategy subdomainStrategy = this.mSubdomainStrategy;
        if (subdomainStrategy != null) {
            map.put("Subdomain-Strategy", subdomainStrategy.toString());
        }
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = this.requestModule.AEQbTJ("/priapi/v1/nft/uploadReource", KotlinUtils.copydefault.EZpvd(this.mIgnoreAuth), map, multipartBodyBuild.parts(), new InterfaceC7433ajj<JsonObject>() { // from class: com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader.8
            /* JADX DEBUG: Method merged with bridge method: OLrzqt(ZLjava/lang/Object;Ljava/lang/Exception;)V */
            @Override // o.InterfaceC7433ajj
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public void OLrzqt(boolean z, JsonObject jsonObject, Exception exc) {
                String strOptString;
                String strOptString2;
                String message;
                String str4;
                JSONObject jSONObjectOptJSONObject;
                String str5;
                int iOptInt = -1;
                String strOptString3 = "";
                if (jsonObject != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(jsonObject.toString());
                        iOptInt = jSONObject.optInt("code");
                        message = jSONObject.optString(EopTrackEvent.KEY_ERROR_MESSAGE, "");
                        jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    } catch (JSONException e) {
                        e = e;
                        strOptString = "";
                        strOptString2 = strOptString;
                    }
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("resourceUrl", "");
                        try {
                            strOptString2 = jSONObjectOptJSONObject.optString("resourceCompressUrl", "");
                        } catch (JSONException e2) {
                            e = e2;
                            strOptString2 = "";
                        }
                        try {
                            strOptString3 = jSONObjectOptJSONObject.optString("originalFilename", "");
                        } catch (JSONException e3) {
                            e = e3;
                            e.printStackTrace();
                            message = e.getMessage();
                        }
                        str4 = strOptString3;
                        strOptString3 = strOptString;
                        String str6 = strOptString3;
                        strOptString3 = message;
                        str5 = str6;
                        interfaceC7835arN2.EZpvd(LuaNumber.valueOf(iOptInt), LuaString.copydefault(strOptString3), LuaString.copydefault(str5), LuaString.copydefault(strOptString2), LuaString.copydefault(str4));
                    }
                } else if (exc != null) {
                    message = exc.getMessage();
                } else {
                    str5 = "";
                    str4 = str5;
                    strOptString2 = str4;
                    interfaceC7835arN2.EZpvd(LuaNumber.valueOf(iOptInt), LuaString.copydefault(strOptString3), LuaString.copydefault(str5), LuaString.copydefault(strOptString2), LuaString.copydefault(str4));
                }
                str4 = "";
                strOptString2 = str4;
                String str62 = strOptString3;
                strOptString3 = message;
                str5 = str62;
                interfaceC7835arN2.EZpvd(LuaNumber.valueOf(iOptInt), LuaString.copydefault(strOptString3), LuaString.copydefault(str5), LuaString.copydefault(strOptString2), LuaString.copydefault(str4));
            }
        });
        this.disposableHashMap.put(str, interfaceC58217yxCAEQbTJ);
        this.disposables.AEQbTJ(interfaceC58217yxCAEQbTJ);
    }

    public void KWHzl() {
        cancel();
        Globals globals = this.globals;
        if (globals != null && !globals.isDestroyed()) {
            this.globals.destroy();
        }
        this.globals = null;
    }

    @LuaBridge
    public LuaValue[] cancel() {
        this.disposables.dispose();
        this.disposableHashMap.clear();
        return null;
    }

    public Context KWHzl(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public LuaValue[] setSubdomainStrategy(String str) {
        if (str == null || str.isEmpty()) {
            this.mSubdomainStrategy = null;
        } else if ("Global".equals(str)) {
            this.mSubdomainStrategy = SubdomainStrategy.Global.INSTANCE;
        } else {
            this.mSubdomainStrategy = new SubdomainStrategy.Subdomain(str);
        }
        return null;
    }

    public String KWHzl(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        int length = str.length();
        if (iLastIndexOf == -1 || length == -1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1, length);
    }
}
