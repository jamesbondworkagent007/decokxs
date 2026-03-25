package o;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: renamed from: o.yDc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56377yDc {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.graphics.Bitmap AEQbTJ(android.content.Context context, android.graphics.Bitmap bitmap, int i) throws java.lang.Throwable {
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        RenderScript renderScriptCreate;
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            } catch (java.lang.Throwable th) {
                th = th;
                allocationCreateFromBitmap = null;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            scriptIntrinsicBlur = null;
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
        }
        try {
            allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            try {
                scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.setRadius(i);
                scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                allocationCreateTyped.copyTo(bitmap);
                renderScriptCreate.destroy();
                allocationCreateFromBitmap.destroy();
                allocationCreateTyped.destroy();
                scriptIntrinsicBlurCreate.destroy();
                return bitmap;
            } catch (java.lang.Throwable th3) {
                th = th3;
                ScriptIntrinsicBlur scriptIntrinsicBlur2 = scriptIntrinsicBlurCreate;
                renderScript = renderScriptCreate;
                scriptIntrinsicBlur = scriptIntrinsicBlur2;
                if (renderScript != null) {
                }
                if (allocationCreateFromBitmap != null) {
                }
                if (allocationCreateTyped != null) {
                }
                if (scriptIntrinsicBlur != null) {
                }
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            allocationCreateTyped = null;
            renderScript = renderScriptCreate;
            scriptIntrinsicBlur = null;
            if (renderScript != null) {
                renderScript.destroy();
            }
            if (allocationCreateFromBitmap != null) {
                allocationCreateFromBitmap.destroy();
            }
            if (allocationCreateTyped != null) {
                allocationCreateTyped.destroy();
            }
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
            throw th;
        }
    }
}
