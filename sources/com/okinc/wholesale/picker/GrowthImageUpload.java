package com.okinc.wholesale.picker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import androidx.annotation.NonNull;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDMap;
import com.immomo.mls.fun.ud.okhttp.UDApiException;
import com.immomo.mls.fun.ud.okhttp.UDSystemException;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.wholesale.bean.EncryptResult;
import com.okinc.wholesale.picker.GrowthImageUpload;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import o.AbstractC58185ywX;
import o.AbstractC7398ajA;
import o.C57532ykG;
import o.C57622ylr;
import o.C58216yxB;
import o.C58266yxz;
import o.C7322ahe;
import o.C7449ajz;
import o.C7840arS;
import o.C7869arv;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC7433ajj;
import o.InterfaceC7835arN;
import o.pUU;
import o.yBP;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public class GrowthImageUpload {
    public Globals AEQbTJ;
    public final C58216yxB copydefault = new C58216yxB();
    public final HashMap<String, InterfaceC58217yxC> EZpvd = new HashMap<>();
    public final Map<String, String> OLrzqt = new HashMap();
    public boolean djBIcL = false;
    public int gEmmrt = MediaHttpUploader.DEFAULT_CHUNK_SIZE;
    public float KWHzl = 0.1f;
    public float AYXKKw = 0.1f;
    public final C57532ykG valueOf = new C57532ykG();

    /* JADX INFO: loaded from: classes17.dex */
    public enum UploadStatus {
        SUCCESS(1),
        IN_PROGRESS(2),
        FAILED(3);

        private final int code;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getCode() {
            return this.code;
        }

        UploadStatus(int i) {
            this.code = i;
        }
    }

    public GrowthImageUpload(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.AEQbTJ = globals;
    }

    @LuaBridge
    public void setImageUploadConfig(LuaValue[] luaValueArr) {
        boolean z = false;
        if (luaValueArr.length > 0 && luaValueArr[0].isBoolean() && luaValueArr[0].toBoolean()) {
            z = true;
        }
        this.djBIcL = z;
        this.gEmmrt = (luaValueArr.length <= 1 || !luaValueArr[1].isNumber()) ? MediaHttpUploader.DEFAULT_CHUNK_SIZE : luaValueArr[1].toInt();
        float f = 0.1f;
        this.KWHzl = (luaValueArr.length <= 2 || !luaValueArr[2].isNumber()) ? 0.1f : luaValueArr[2].toFloat();
        if (luaValueArr.length > 3 && luaValueArr[3].isNumber()) {
            f = luaValueArr[3].toFloat();
        }
        this.AYXKKw = f;
    }

    @LuaBridge
    public void cancel() {
        this.copydefault.dispose();
        this.EZpvd.clear();
    }

    @LuaBridge
    public void cancelUploadFile(String str) {
        if (this.EZpvd.get(str) == null || this.EZpvd.get(str).isDisposed()) {
            return;
        }
        this.EZpvd.get(str).dispose();
    }

    @LuaBridge
    public void uploadImage(String str, String[] strArr, InterfaceC7835arN interfaceC7835arN) {
        for (String str2 : strArr) {
            copydefault(str, str2, interfaceC7835arN);
        }
    }

    public final void copydefault(final String str, final String str2, final InterfaceC7835arN interfaceC7835arN) {
        this.copydefault.AEQbTJ(AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.ykR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.OLrzqt.copydefault(str2);
            }
        }).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt()).AEQbTJ(new InterfaceC58227yxM() { // from class: o.ykQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Exception {
                this.copydefault.EZpvd(interfaceC7835arN, str2, str, (java.util.Map) obj);
            }
        }, new InterfaceC58227yxM() { // from class: o.ykZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                GrowthImageUpload.copydefault(str2, interfaceC7835arN);
            }
        }));
    }

    public final /* synthetic */ Map copydefault(String str) throws Exception {
        Context contextAEQbTJ = AEQbTJ(this.AEQbTJ);
        if (contextAEQbTJ == null) {
            return null;
        }
        byte[] bArrEZpvd = EZpvd(str, contextAEQbTJ);
        if (bArrEZpvd != null && bArrEZpvd.length > this.gEmmrt) {
            bArrEZpvd = AEQbTJ(bArrEZpvd);
        }
        String seed = "";
        if (this.djBIcL) {
            EncryptResult encryptResultKWHzl = KWHzl(bArrEZpvd);
            if (encryptResultKWHzl != null) {
                byte[] encryptedData = encryptResultKWHzl.getEncryptedData();
                seed = encryptResultKWHzl.getSeed();
                bArrEZpvd = encryptedData;
            } else {
                bArrEZpvd = null;
            }
        }
        if (bArrEZpvd == null || seed.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("data", bArrEZpvd);
        map.put("seed", seed);
        return map;
    }

    public final /* synthetic */ void EZpvd(final InterfaceC7835arN interfaceC7835arN, final String str, String str2, Map map) throws Exception {
        if (map == null) {
            return;
        }
        byte[] bArr = (byte[]) map.get("data");
        String str3 = (String) map.get("seed");
        if (bArr == null) {
            return;
        }
        C7449ajz c7449ajz = new C7449ajz(RequestBody.create(MediaType.parse("image/jpeg"), bArr), new AnonymousClass1(interfaceC7835arN, str));
        InterfaceC58217yxC interfaceC58217yxCOLrzqt = this.valueOf.OLrzqt(str2, new MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("file", EZpvd(), c7449ajz).build().parts(), str3, new InterfaceC7433ajj() { // from class: o.ykW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC7433ajj
            public final void OLrzqt(boolean z, java.lang.Object obj, java.lang.Exception exc) {
                this.copydefault.copydefault(str, interfaceC7835arN, z, (JsonObject) obj, exc);
            }
        });
        this.EZpvd.put(str, interfaceC58217yxCOLrzqt);
        this.copydefault.AEQbTJ(interfaceC58217yxCOLrzqt);
    }

    /* JADX INFO: renamed from: com.okinc.wholesale.picker.GrowthImageUpload$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractC7398ajA<String> {
        public final /* synthetic */ InterfaceC7835arN KWHzl;
        public final /* synthetic */ String OLrzqt;

        @Override // o.AbstractC7398ajA
        public void AEQbTJ(Call<String> call, Response<String> response) {
        }

        @Override // retrofit2.Callback
        public void onFailure(@NonNull Call<String> call, @NonNull Throwable th) {
        }

        public AnonymousClass1(InterfaceC7835arN interfaceC7835arN, String str) {
            this.KWHzl = interfaceC7835arN;
            this.OLrzqt = str;
        }

        @Override // o.AbstractC7398ajA
        public void copydefault(long j, long j2) {
            final InterfaceC7835arN interfaceC7835arN = this.KWHzl;
            if (interfaceC7835arN != null) {
                final String str = this.OLrzqt;
                C7840arS.copydefault(new Runnable() { // from class: o.ykV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        GrowthImageUpload.AnonymousClass1.KWHzl(interfaceC7835arN, str);
                    }
                });
            }
        }

        public static /* synthetic */ void KWHzl(InterfaceC7835arN interfaceC7835arN, String str) {
            interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.IN_PROGRESS.code), LuaValue.Nil());
        }
    }

    public final /* synthetic */ void copydefault(String str, InterfaceC7835arN interfaceC7835arN, boolean z, JsonObject jsonObject, Exception exc) {
        EZpvd(str, z);
        if (jsonObject == null && (exc instanceof UDSystemException)) {
            copydefault(str, interfaceC7835arN);
        } else if (jsonObject == null && (exc instanceof UDApiException)) {
            copydefault(str, interfaceC7835arN);
        } else {
            OLrzqt(str, z, this.AEQbTJ, jsonObject, interfaceC7835arN);
        }
    }

    public final void EZpvd(String str, boolean z) {
        String strRemove;
        if (!z || (strRemove = this.OLrzqt.remove(str)) == null) {
            return;
        }
        try {
            File file = new File(strRemove);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            pUU.KWHzl("deleteLocalFile", "delete local image file error: " + e.getMessage());
        }
    }

    public final String EZpvd() {
        return "IMG_" + System.currentTimeMillis() + "_" + (((int) (Math.random() * 9000.0d)) + 1000) + ".jpeg";
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    public final byte[] EZpvd(String str, Context context) {
        InputStream inputStreamOpenInputStream;
        String str2 = this.OLrzqt.get(str);
        if (str2 != null) {
            return KWHzl(str2);
        }
        try {
            if (str.startsWith("content://") || str.startsWith("file://")) {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(str));
            } else {
                inputStreamOpenInputStream = new FileInputStream(str);
            }
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new IOException("input stream is null");
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i != -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        File fileAEQbTJ = AEQbTJ(context);
                        FileOutputStream fileOutputStream = new FileOutputStream(fileAEQbTJ);
                        try {
                            fileOutputStream.write(byteArray);
                            fileOutputStream.close();
                            this.OLrzqt.put(str, fileAEQbTJ.getAbsolutePath());
                            inputStreamOpenInputStream.close();
                            return byteArray;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        } catch (Exception e) {
            pUU.KWHzl("readAllBytes", "read image bytes error: " + e.getMessage());
            return null;
        }
        pUU.KWHzl("readAllBytes", "read image bytes error: " + e.getMessage());
        return null;
    }

    public final File AEQbTJ(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            cacheDir = context.getExternalCacheDir();
        }
        if (cacheDir == null) {
            cacheDir = Environment.getExternalStorageDirectory();
        }
        return new File(cacheDir, EZpvd());
    }

    public final byte[] KWHzl(String str) {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                bArr = new byte[8192];
            } finally {
            }
        } catch (Exception e) {
            pUU.KWHzl("readFileBytes", "read image bytes error: " + e.getMessage());
            return null;
        }
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                fileInputStream.close();
                return byteArray;
            }
            pUU.KWHzl("readFileBytes", "read image bytes error: " + e.getMessage());
            return null;
        }
    }

    public final byte[] AEQbTJ(byte[] bArr) {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = (int) (this.KWHzl * 100.0f);
        int i2 = (int) (this.AYXKKw * 100.0f);
        for (int i3 = 100 - i; i3 > i2; i3 -= i) {
            byteArrayOutputStream.reset();
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
            if (byteArrayOutputStream.size() <= this.gEmmrt) {
                break;
            }
        }
        bitmapDecodeByteArray.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    public final EncryptResult KWHzl(byte[] bArr) {
        try {
            C57622ylr c57622ylr = C57622ylr.EZpvd;
            String strKWHzl = c57622ylr.KWHzl(32);
            C57622ylr.Activity activityCopydefault = c57622ylr.copydefault(strKWHzl);
            return new EncryptResult(c57622ylr.copydefault(bArr, activityCopydefault.AEQbTJ(), activityCopydefault.OLrzqt()), strKWHzl);
        } catch (Exception e) {
            pUU.KWHzl("GrowthImageUpload", "encrypt error: " + e.getMessage());
            return null;
        }
    }

    public final void OLrzqt(final String str, final boolean z, final Globals globals, final JsonObject jsonObject, final InterfaceC7835arN interfaceC7835arN) {
        if (interfaceC7835arN == null || globals == null || globals.isDestroyed()) {
            return;
        }
        C7840arS.copydefault(new Runnable() { // from class: o.ykX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.AEQbTJ.copydefault(globals, jsonObject, interfaceC7835arN, str, z);
            }
        });
    }

    public final /* synthetic */ void copydefault(Globals globals, JsonObject jsonObject, InterfaceC7835arN interfaceC7835arN, String str, boolean z) {
        if (globals.isDestroyed()) {
            return;
        }
        if (jsonObject == null) {
            interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.FAILED.code), new UDMap(globals, new HashMap()));
            return;
        }
        if (z) {
            try {
                JsonElement jsonElement = jsonObject.get("data");
                if (jsonElement instanceof JsonObject) {
                    interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.SUCCESS.code), C7869arv.copydefault(globals, (JsonObject) jsonElement));
                } else if (jsonElement instanceof JsonArray) {
                    interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.SUCCESS.code), C7869arv.EZpvd(globals, (JsonArray) jsonElement));
                } else if (jsonElement != null) {
                    interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.SUCCESS.code), jsonElement);
                } else {
                    interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.SUCCESS.code), C7869arv.copydefault(globals, jsonObject));
                }
                return;
            } catch (Exception unused) {
                interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.FAILED.code), new UDMap(globals, new HashMap()));
                return;
            }
        }
        interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.FAILED.code), new UDMap(globals, KWHzl(jsonObject)));
    }

    public static void copydefault(String str, InterfaceC7835arN interfaceC7835arN) {
        if (interfaceC7835arN != null) {
            interfaceC7835arN.EZpvd(LuaString.copydefault(str), LuaNumber.valueOf(UploadStatus.FAILED.code), LuaValue.Nil());
        }
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

    public final Context AEQbTJ(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public void KWHzl() {
        cancel();
        Globals globals = this.AEQbTJ;
        if (globals != null && !globals.isDestroyed()) {
            this.AEQbTJ.destroy();
        }
        this.AEQbTJ = null;
    }
}
