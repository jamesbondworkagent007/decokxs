package com.bytedance.bdtracker;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.bytedance.applog.InitConfig;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.huawei.hms.adapter.internal.CommonCode;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class a2 extends q1 {
    public final Context e;
    public final d f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public a2(d dVar, Context context) {
        super(true, false);
        this.f = dVar;
        this.e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Display";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) throws JSONException {
        String str;
        Throwable th;
        int i;
        int iIntValue;
        InitConfig initConfig = this.f.getInitConfig();
        if (initConfig == null || initConfig.isDisplayDensityAndDpiEnabled()) {
            int i2 = this.e.getResources().getDisplayMetrics().densityDpi;
            switch (i2) {
                case 120:
                    str = "ldpi";
                    break;
                case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                    str = "hdpi";
                    break;
                case 260:
                case 280:
                case 300:
                case 320:
                    str = "xhdpi";
                    break;
                case 340:
                case 360:
                case 400:
                case TypedValues.CycleType.TYPE_EASING /* 420 */:
                case 440:
                case LivenessCoordinator.TARGET_WIDTH /* 480 */:
                    str = "xxhdpi";
                    break;
                case 560:
                case LivenessCoordinator.TARGET_HEIGHT /* 640 */:
                    str = "xxxhdpi";
                    break;
                default:
                    str = "mdpi";
                    break;
            }
            jSONObject.put("density_dpi", i2);
            jSONObject.put("display_density", str);
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        try {
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
        if (defaultDisplay != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
            try {
                iIntValue = displayMetrics.heightPixels;
            } catch (Throwable th3) {
                th = th3;
                this.f.D.error("Get screen pixels failed", th, new Object[0]);
                iIntValue = 0;
            }
            int[] iArr = {i, iIntValue};
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, iArr[1] + "x" + iArr[0]);
            return true;
        }
        Method method = Display.class.getMethod("getRawHeight", new Class[0]);
        Method method2 = Display.class.getMethod("getRawWidth", new Class[0]);
        int iIntValue2 = method2 != null ? ((Integer) method2.invoke(defaultDisplay, new Object[0])).intValue() : 0;
        if (method != null) {
            try {
                iIntValue = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i = iIntValue2;
            } catch (Throwable th4) {
                th = th4;
                i = iIntValue2;
                this.f.D.error("Get screen pixels failed", th, new Object[0]);
                iIntValue = 0;
            }
            int[] iArr2 = {i, iIntValue};
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, iArr2[1] + "x" + iArr2[0]);
            return true;
        }
        i = iIntValue2;
        iIntValue = 0;
        int[] iArr22 = {i, iIntValue};
        jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, iArr22[1] + "x" + iArr22[0]);
        return true;
    }
}
