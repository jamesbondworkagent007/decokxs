package o;

import android.provider.MediaStore;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import org.luaj.vm2.LuaFunction;

/* JADX INFO: renamed from: o.rrS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C43551rrS {
    public static void copydefault(java.lang.String str, final android.content.Context context, final LuaFunction luaFunction) {
        Glide.AEQbTJ(context).EZpvd().copydefault(str).copydefault(new RY<android.graphics.Bitmap>() { // from class: o.rrS.1
            @Override // o.RY
            public boolean OLrzqt(@androidx.annotation.Nullable GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
                LuaFunction luaFunction2 = luaFunction;
                if (luaFunction2 == null) {
                    return false;
                }
                luaFunction2.EZpvd(1.0d);
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                try {
                    context.sendBroadcast(new android.content.Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", android.net.Uri.fromFile(new java.io.File(C33610mzh.OLrzqt.EZpvd(context, android.net.Uri.parse(MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, C34703nhO.OLrzqt(context) + "_" + java.lang.System.currentTimeMillis(), (java.lang.String) null)))))));
                    LuaFunction luaFunction2 = luaFunction;
                    if (luaFunction2 == null) {
                        return false;
                    }
                    luaFunction2.EZpvd(2.0d);
                    return false;
                } catch (java.lang.Exception unused) {
                    LuaFunction luaFunction3 = luaFunction;
                    if (luaFunction3 == null) {
                        return false;
                    }
                    luaFunction3.EZpvd(1.0d);
                    return false;
                }
            }
        }).EZpvd();
    }
}
